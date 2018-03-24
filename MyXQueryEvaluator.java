import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;

import java.lang.Math;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.io.File;


import javax.xml.parsers.ParserConfigurationException;
import java.util.*;

import java.io.StringWriter;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Attr;


public class MyXQueryEvaluator extends MyXQueryBaseVisitor<ArrayList<Node>> {
   
	boolean rewriteFlag = false;

	public MyXQueryEvaluator(boolean flag) {rewriteFlag = flag;}

	// Root node

	Node rootNode = null;

	// Documents

	Document inputDoc = null, outputDoc = null;

	// Current nodes

	private ArrayList<Node> currentNodes = new ArrayList<Node>();


	// Current Context

	private HashMap<String, ArrayList<Node>> currentContext = new HashMap<String, ArrayList<Node>>();

	// Current Condition

	boolean condState;

	// XPath - Absolute path

	@Override
	public ArrayList<Node> visitApChildren(MyXQueryParser.ApChildrenContext ctx) {
		// for (ParseTree child: ctx.children) {
		// 	System.out.println(child.getText());
		// }
		if (rootNode == null) {
			String filename = ctx.filename().getText();
			filename = filename.substring(1, filename.length() - 1);
			rootNode = getRootFromFile(filename);
		}
		currentNodes.clear();
		currentNodes.add(rootNode);
		return visit(ctx.rp());
	}


	@Override
	public ArrayList<Node> visitApFindAll(MyXQueryParser.ApFindAllContext ctx) {
		if (rootNode == null) {
			String filename = ctx.filename().getText();
			filename = filename.substring(1, filename.length() - 1);
			rootNode = getRootFromFile(filename);
		}
		currentNodes.clear();
		currentNodes.add(rootNode);
		ArrayList<Node> res = new ArrayList<Node>();
		ArrayList<Node> nextLayer = currentNodes;
		while (nextLayer.size() != 0) {
			// visit rp()
			currentNodes = nextLayer;
			res.addAll(visit(ctx.rp()));
			// find all children
			ArrayList<Node> temp = new ArrayList<Node>();
			for (Node node: nextLayer) {
				NodeList children = node.getChildNodes();
				for (int i = 0; i < children.getLength(); i++) {
					Node child = children.item(i);
					temp.add(child);
				}
			}
			nextLayer = temp;
		}
		res = unique(res);
		currentNodes = res;
		return res;
	}


	// XPath - Relative Path


	@Override
	public ArrayList<Node> visitWildcard(MyXQueryParser.WildcardContext ctx) {
		ArrayList<Node> res = new ArrayList<Node>();
		for (Node node: currentNodes) {
			NodeList children = node.getChildNodes();
			for (int i = 0; i < children.getLength(); i++) {
				Node child = children.item(i);
				res.add(child);
			}
		}
		currentNodes = res;
		return res;
	}


	@Override
	public ArrayList<Node> visitAttribute(MyXQueryParser.AttributeContext ctx) {
		ArrayList<Node> res = new ArrayList<Node>();
		for (Node node: currentNodes) {
			NamedNodeMap attributes = node.getAttributes();
			for (int i = 0; i < attributes.getLength(); i++) {
				Node att = attributes.item(i);
				if ((att.getNodeName()).equals(ctx.NAME().getText())) {
					res.add(att);
				}
			}
		}
		currentNodes = res;
		return res;
	}


	@Override
	public ArrayList<Node> visitRpChildren(MyXQueryParser.RpChildrenContext ctx) {
		ArrayList<Node> x = new ArrayList<Node>(visit(ctx.rp(0)));
		currentNodes = x;
		visit(ctx.rp(1));
		ArrayList<Node> res = new ArrayList<Node>();
		res.addAll(currentNodes);
		res = unique(res);
		currentNodes = res;
		return res;
	}


	@Override
	public ArrayList<Node> visitRpFindAll(MyXQueryParser.RpFindAllContext ctx) {
		ArrayList<Node> x = new ArrayList<Node>(visit(ctx.rp(0)));
		currentNodes = x;
		ArrayList<Node> res = new ArrayList<Node>();
		ArrayList<Node> nextLayer = currentNodes;
		while (nextLayer.size() != 0) {
			// visit rp(1)
			currentNodes = nextLayer;
			res.addAll(visit(ctx.rp(1)));
			// find all children
			ArrayList<Node> temp = new ArrayList<Node>();
			for (Node node: nextLayer) {
				NodeList children = node.getChildNodes();
				for (int i = 0; i < children.getLength(); i++) {
					Node child = children.item(i);
					temp.add(child);
				}
			}
			nextLayer = temp;
		}
		res = unique(res);
		currentNodes = res;
		return res;
	}


	@Override
	public ArrayList<Node> visitRpParentheses(MyXQueryParser.RpParenthesesContext ctx) {
		ArrayList<Node> res = new ArrayList<Node>(visit(ctx.rp()));
		currentNodes = res;
		return res;
	}


	@Override
	public ArrayList<Node> visitRpDouble(MyXQueryParser.RpDoubleContext ctx) {
		ArrayList<Node> res = new ArrayList<Node>();
		ArrayList<Node> currentNodesRecord = new ArrayList<Node>(currentNodes);
		res.addAll(visit(ctx.rp(0)));
		currentNodes = currentNodesRecord;
		res.addAll(visit(ctx.rp(1)));
		currentNodes = res;
		return res;
	}


	@Override
	public ArrayList<Node> visitText(MyXQueryParser.TextContext ctx) {
		ArrayList<Node> res = new ArrayList<Node>();
		ArrayList<Node> children = new ArrayList<Node>(visitWildcard(
			new MyXQueryParser.WildcardContext(new MyXQueryParser.RpContext())
		));
		for (Node child: children) {
			if (child.getNodeType() != Node.TEXT_NODE) {
				continue;
			}
			res.add(child);
		}
		currentNodes = res;
		return res;
	}


	@Override
	public ArrayList<Node> visitParentDir(MyXQueryParser.ParentDirContext ctx) {
		ArrayList<Node> res = new ArrayList<Node>();
		for (Node node: currentNodes) {
			Node parent = node.getParentNode();
			res.add(parent);
		}
		currentNodes = res;
		return res;
	}


	@Override
	public ArrayList<Node> visitCurrentDir(MyXQueryParser.CurrentDirContext ctx) {
		return currentNodes;
	}


	@Override
	public ArrayList<Node> visitRpFilter(MyXQueryParser.RpFilterContext ctx) {
		currentNodes = visit(ctx.rp());
		ArrayList<Node> res = new ArrayList<Node>();
		res = visit(ctx.f());
		currentNodes = res;
		return res;
	}


	@Override
	public ArrayList<Node> visitName(MyXQueryParser.NameContext ctx) {
		ArrayList<Node> res = new ArrayList<Node>();
		ArrayList<Node> children = new ArrayList<Node>(visitWildcard(
			new MyXQueryParser.WildcardContext(new MyXQueryParser.RpContext())
		));
		String name = ctx.getText();
		for (Node child: children) {
			if (child.getNodeType() != Node.ELEMENT_NODE) {
				continue;
			}
			if (name.equals(child.getNodeName())) {
				res.add(child);
			}
		}
		currentNodes = res;
		return res;
	}


	// XPath - Filters


	@Override
	public ArrayList<Node> visitRpExists(MyXQueryParser.RpExistsContext ctx) {
		ArrayList<Node> temp = new ArrayList<Node>(currentNodes);
		ArrayList<Node> res = new ArrayList<>();
		for (Node node : temp) {
			ArrayList<Node> newCurrentNodes = new ArrayList<>();
			newCurrentNodes.add(node);
			currentNodes = newCurrentNodes;
			if (visit(ctx.rp()).size() > 0) {
				res.add(node);
			}
		}
		currentNodes = res;
		return res;
	}


	@Override
	public ArrayList<Node> visitEqual(MyXQueryParser.EqualContext ctx) {
		ArrayList<Node> temp = new ArrayList<Node>(currentNodes);
		ArrayList<Node> res = new ArrayList<>();
		for (Node node : temp) {
			ArrayList<Node> singleCurrentNodes = new ArrayList<>();
			singleCurrentNodes.add(node);
			currentNodes = singleCurrentNodes;

			ArrayList<Node> leftList = new ArrayList<Node>(visit(ctx.rp(0)));
			currentNodes = singleCurrentNodes;
			ArrayList<Node> rightList = new ArrayList<Node>(visit(ctx.rp(1)));

			for (Node left : leftList) {
				for (Node right : rightList) {
					if (left.isEqualNode(right) && !res.contains(node)) {
						res.add(node);
					}
				}
			}
		}
		currentNodes = res;
		return res;
	}


	@Override
	public ArrayList<Node> visitIs(MyXQueryParser.IsContext ctx) {
		ArrayList<Node> temp = currentNodes;
		ArrayList<Node> res = new ArrayList<>();
		for (Node node : temp) {
			ArrayList<Node> singleCurrentNodes = new ArrayList<>();
			singleCurrentNodes.add(node);
			currentNodes = singleCurrentNodes;

			ArrayList<Node> leftList = new ArrayList<Node>(visit(ctx.rp(0)));
			currentNodes = singleCurrentNodes;
			ArrayList<Node> rightList = new ArrayList<Node>(visit(ctx.rp(1)));

			for (Node left : leftList) {
				for (Node right : rightList) {
					if (left.isSameNode(right) && !res.contains(node)) {
						res.add(node);
					}
				}
			}
		}
		currentNodes = res;
		return res;
	}


	@Override
	public ArrayList<Node> visitFParentheses(MyXQueryParser.FParenthesesContext ctx) {
		return visit(ctx.f());
	}


	@Override
	public ArrayList<Node> visitFAndF(MyXQueryParser.FAndFContext ctx) {
		ArrayList<Node> currentNodesRecord = new ArrayList<>(currentNodes);
		HashSet<Node> left = new HashSet<Node>(visit(ctx.f(0)));
		currentNodes = currentNodesRecord;
		HashSet<Node> right = new HashSet<Node>(visit(ctx.f(1)));
		HashSet<Node> common = new HashSet<Node>();
		common.addAll(left);
		common.retainAll(right);
		ArrayList<Node> res = new ArrayList<Node>(common);
		currentNodes = currentNodesRecord;
		return res;
	}


	@Override
	public ArrayList<Node> visitFOrF(MyXQueryParser.FOrFContext ctx) {
		ArrayList<Node> currentNodesRecord = new ArrayList<>(currentNodes);
		HashSet<Node> left = new HashSet<Node>(visit(ctx.f(0)));
		currentNodes = currentNodesRecord;
		HashSet<Node> right = new HashSet<Node>(visit(ctx.f(1)));
		HashSet<Node> both = new HashSet<Node>();
		both.addAll(left);
		both.addAll(right);
		ArrayList<Node> res = new ArrayList<Node>(both);
		currentNodes = currentNodesRecord;
		return res;
	}


	@Override
	public ArrayList<Node> visitNotF(MyXQueryParser.NotFContext ctx) {
		ArrayList<Node> currentNodesRecord = new ArrayList<>(currentNodes);
		HashSet<Node> left = new HashSet<Node>(currentNodes);
		HashSet<Node> right = new HashSet<Node>(visit(ctx.f()));
		HashSet<Node> diff = new HashSet<Node>();
		diff.addAll(left);
		diff.removeAll(right);
		ArrayList<Node> res = new ArrayList<Node>(diff);
		currentNodes = currentNodesRecord;
		return res;
	}


	// XQuery - XQ


	@Override
	public ArrayList<Node> visitVariable(MyXQueryParser.VariableContext ctx) {
		String name = ctx.getText();
		return currentContext.get(name);
	}


	@Override
	public ArrayList<Node> visitMakeText(MyXQueryParser.MakeTextContext ctx) {
		String content = ctx.stringConst().getText();
		content = content.substring(1, content.length() - 1);
		//System.out.println("content: " + content);
		Node resNode = inputDoc.createTextNode(content);
		ArrayList<Node> res = new ArrayList<Node>();
		res.add(resNode);
		return res;
	}


	@Override
	public ArrayList<Node> visitAbsolutePath(MyXQueryParser.AbsolutePathContext ctx) {
		ArrayList<Node> res = new ArrayList<Node>(visit(ctx.ap()));
		return res;
	}


	@Override
	public ArrayList<Node> visitXQParentheses(MyXQueryParser.XQParenthesesContext ctx) {
		return visit(ctx.xq());
	}


	@Override
	public ArrayList<Node> visitXQDouble(MyXQueryParser.XQDoubleContext ctx) {
		ArrayList<Node> res = new ArrayList<Node>();
		// System.out.println("RETURN");
		// System.out.println(ctx.xq(0).getText());
		// System.out.println(ctx.xq(1).getText());
		// System.out.println();
		res.addAll(visit(ctx.xq(0)));
		res.addAll(visit(ctx.xq(1)));
		return res;
	}


	@Override
	public ArrayList<Node> visitXQChildren(MyXQueryParser.XQChildrenContext ctx) {
		ArrayList<Node> n = new ArrayList<Node>(visit(ctx.xq()));
		currentNodes = n;
		visit(ctx.rp());
		ArrayList<Node> res = new ArrayList<Node>();
		res.addAll(currentNodes);
		res = unique(res);
		currentNodes = res;
		return res;
	}


	@Override
	public ArrayList<Node> visitXQFindAll(MyXQueryParser.XQFindAllContext ctx) {
		ArrayList<Node> n = new ArrayList<Node>(visit(ctx.xq()));
		currentNodes = n;
		ArrayList<Node> res = new ArrayList<Node>();
		ArrayList<Node> nextLayer = new ArrayList<Node>(currentNodes);
		while (nextLayer.size() != 0) {
			// visit rp()
			currentNodes = nextLayer;
			res.addAll(visit(ctx.rp()));
			// find all children
			ArrayList<Node> temp = new ArrayList<Node>();
			for (Node node: nextLayer) {
				NodeList children = node.getChildNodes();
				for (int i = 0; i < children.getLength(); i++) {
					Node child = children.item(i);
					temp.add(child);
				}
			}
			nextLayer = temp;
		}
		res = unique(res);
		currentNodes = res;
		return res;
	}


	@Override
	public ArrayList<Node> visitMakeElem(MyXQueryParser.MakeElemContext ctx) {
		String name = ctx.NAME(0).getText();
		ArrayList<Node> children = new ArrayList<Node>(visit(ctx.xq()));
		if (children.size() == 0) {
			return new ArrayList<Node>();
		}
		// deep copy
		if (outputDoc == null) {
			try {
				DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
				DocumentBuilder db = dbf.newDocumentBuilder();
				outputDoc = db.newDocument();
			} catch (Exception e) {
				e.printStackTrace();
				return null;
			}
		}
		Node resNode = outputDoc.createElement(name);
		for (Node child: children) {
			Node copyChild = child.cloneNode(true);
			outputDoc.adoptNode(copyChild);
			NodeList list = child.getChildNodes();
			NodeList list2 = copyChild.getChildNodes();
			resNode.appendChild(copyChild);
		}
		ArrayList<Node> res = new ArrayList<Node>();
		res.add(resNode);
		return res;
	}


	// XQuery - FLWR


	@Override
	public ArrayList<Node> visitFLWR(MyXQueryParser.FLWRContext ctx) {
		ArrayList<Node> res = new ArrayList<>();
		HashMap<String, ArrayList<Node>> oldContext = new HashMap<>(currentContext);
		if (rewriteFlag == false) {
			FLWRIterator(res, ctx, 0);
		} else {
			String newQuery = rewrite(ctx);
			if (newQuery == "") {
				FLWRIterator(res, ctx, 0);
			} else {
				CharStream input = CharStreams.fromString(newQuery);
				System.out.println("\nRewritten Query:\n" + input.toString() + "\n");
				MyXQueryLexer lexer = new MyXQueryLexer(input);
				CommonTokenStream tokens = new CommonTokenStream(lexer);
				MyXQueryParser parser = new MyXQueryParser(tokens);
				ParseTree tree = parser.xq();
				MyXQueryEvaluator eval = new MyXQueryEvaluator(false);
				res = eval.visit(tree);
			}
		}
		currentContext = oldContext;
		// System.out.println(res.size());
		return res;
	}


	public String rewrite(MyXQueryParser.FLWRContext ctx) {
		String output = "";

		int numFor;// nums of for clause
		numFor = ctx.forClause().var().size();
		ArrayList<HashSet<String>> classify = new ArrayList<HashSet<String>>();
		ArrayList<String> relation = new ArrayList<String>();
		HashMap<String, Integer> varInd = new HashMap<String, Integer>();
		for(int i=0; i < numFor;i++) {
			String key = ctx.forClause().var(i).getText();
			String parent = ctx.forClause().xq(i).getText().split("/")[0];
			int size = classify.size();
			boolean found = false;
			// construct the classification
			for(int j = 0; j < size; j++) {
				HashSet<String> curSet = classify.get(j);
				if(curSet.contains(parent)) {
					curSet.add(key);
					varInd.put(key, j);
					found = true;
					break;
				}
			}
			if(!found) {
				HashSet<String> newSet = new HashSet<String>();
				newSet.add(key);
				classify.add(newSet);
				varInd.put(key, classify.size() - 1);
				relation.add(key);
			}
		}
		//where clause
		if (ctx.whereClause() == null) {
			System.out.println("No join detected!\n");
            return "";
		}
		String[] where = ctx.whereClause().cond().getText().split("and");
		String[][] cond = new String[where.length][2];
		for(int i = 0; i < where.length;i++) {
			cond[i][0] = where[i].split("eq|=")[0];
			cond[i][1] = where[i].split("eq|=")[1];
		}

		// for (int i = 0; i < classify.size(); i++) {
		// 	System.out.println(i);
		// 	HashSet<String> set = classify.get(i);
		// 	for (String s: set) {
		// 		System.out.println(s);
		// 	}
		// }
		if(classify.size() == 1) {
            System.out.println("No join detected!\n");
            return "";
        }

        int class_size = classify.size();
        // System.out.print("class_size ");
        // System.out.println(class_size);

        String[] rewritedFor = new String[class_size];
        String[] rewritedWhere = new String[class_size];
        String[] rewritedReturn = new String[class_size];
        String[][] rewritedList = new String[class_size][2];

        for (int i=0; i < numFor;i++) {
			String var = ctx.forClause().var(i).getText();
			String parent = ctx.forClause().xq(i).getText().split("/")[0];
			int ind = varInd.get(var);
			if (rewritedFor[ind] == null) {
				rewritedFor[ind] = indent(Math.min(class_size - ind, class_size - 1)) + "for ";
			} else {
				rewritedFor[ind] += ",\n" + indent(Math.min(class_size - ind + 1, class_size));
			}
			rewritedFor[ind] += var + " in " + ctx.forClause().xq(i).getText();
			if (rewritedReturn[ind] == null) {
				rewritedReturn[ind] = indent(Math.min(class_size - ind, class_size - 1)) + "return <tuple>{\n";
			} else {
				rewritedReturn[ind] += ",\n";
			}
			rewritedReturn[ind] += indent(Math.min(class_size - ind + 1, class_size)) + wrap(var);
		}
		for (int i = 0; i < class_size; i++) {
			rewritedReturn[i] += "\n" + indent(Math.min(class_size - i, class_size - 1)) + "}</tuple>";
		}

		for (int i = 0; i < where.length;i++) {
			String var1 = where[i].split("eq|=")[0];
			String var2 = where[i].split("eq|=")[1];
			int ind1 = -1;
			int ind2 = -1;
			if (varInd.containsKey(var1)) {
				ind1 = varInd.get(var1);
			}
			if (varInd.containsKey(var2)) {
				ind2 = varInd.get(var2);
			}
			if (ind2 >=0 && ind1 > ind2) {
				String tempString = var1;
				int tempInt = ind1;
				var1 = var2;
				var2 = tempString;
				ind1 = ind2;
				ind2 = tempInt;
			}
			// System.out.print(var1 + " ");
			// System.out.println(ind1);
			// System.out.print(var2 + " ");
			// System.out.println(ind2);
			if (ind1 == ind2 || (ind1 < 0 || ind2 < 0)) {
				int ind = Math.max(0, Math.max(ind1, ind2));
				if (rewritedWhere[ind] == null) {
					rewritedWhere[ind] = indent(Math.min(class_size - ind, class_size - 1)) + "where ";
				} else {
					rewritedWhere[ind] += "and ";
				}
				rewritedWhere[ind] += var1 + " eq " + var2;
			} else {
				int ind = Math.max(ind1, ind2);
				if (rewritedList[ind][0] == null) {
					rewritedList[ind][0] = indent(class_size - ind) + "[";
				} else {
					rewritedList[ind][0] += ", ";
				}
				rewritedList[ind][0] += var1.substring(1, var1.length());
				if (rewritedList[ind][1] == null) {
					rewritedList[ind][1] = "[";
				} else {
					rewritedList[ind][1] += ", ";
				}
				rewritedList[ind][1] += var2.substring(1, var2.length());
			}
		}
		for (int i = 1; i < class_size; i++) {
			if (rewritedList[i][0] == null) {
				rewritedList[i][0] = indent(class_size - i) + "[";
			}
			if (rewritedList[i][1] == null) {
				rewritedList[i][1] = "[";
			}
			rewritedList[i][0] += "]";
			rewritedList[i][1] += "]";
		}

		// System.out.print("for $tuple in ");
		output += "for $tuple in ";
        for (int i = 0; i < class_size - 1; i++) {
            // System.out.println(indent(i) + "join (");
            output += indent(i) + "join (\n";
        }

		for (int i = 0; i < class_size - 1; i++) {
			if (i == 0) {
				// System.out.println(rewritedFor[i]);
				output += rewritedFor[i] + "\n";
				if (rewritedWhere[i] != null) {
					// System.out.println(rewritedWhere[i]);
					output += rewritedWhere[i] + "\n";
				}
				// System.out.print(rewritedReturn[i]);
				output += rewritedReturn[i];
			}
			// System.out.println(",");
			// System.out.println(rewritedFor[i + 1]);
			output += ",\n" + rewritedFor[i + 1] + "\n";
			if (rewritedWhere[i + 1] != null) {
				// System.out.println(rewritedWhere[i + 1]);
				output += rewritedWhere[i + 1] + "\n";
			}
			// System.out.println(rewritedReturn[i + 1] + ",");
			// System.out.print(rewritedList[i + 1][0] + ", ");
			// System.out.println(rewritedList[i + 1][1]);
			// System.out.print(indent(class_size - (i + 1) - 1) + ")");
			output += rewritedReturn[i + 1]+ ",\n"
			+ rewritedList[i + 1][0] + ", "
			+ rewritedList[i + 1][1] + "\n"
			+ indent(class_size - (i + 1) - 1) + ")";
		}
		// System.out.println();
		output += "\n";

		String retClause = ctx.returnClause().xq().getText();
        String[] tempRet = retClause.split("\\$");
        for (int i = 0; i < tempRet.length-1; i++) {
            tempRet[i] = tempRet[i]+"$tuple/";
        }
        retClause  = tempRet[0];
        for (int i = 1; i < tempRet.length; i++) {
            String[] cur1 = tempRet[i].split(",",2);
            String[] cur2 = tempRet[i].split("}",2);
            String[] cur3 = tempRet[i].split("/",2);
            String[] cur = cur1;
            if(cur2[0].length() < cur[0].length()) {
                cur = cur2;
            }
            if(cur3[0].length() < cur[0].length()) {
                cur = cur3;
            }
            tempRet[i] = cur[0] + "/*";
//            if(cur[1].charAt(0) == '$' || cur[1].charAt(0) == '<') {
//                tempRet[i] += ",";
//            }else {
//                tempRet[i] += "/";
//            }
            if(cur == cur1) {
                tempRet[i] += ",";
            }else if(cur == cur2) {
                tempRet[i] += "}";
            }else {
                tempRet[i] += "/";
            }
            tempRet[i] += cur[1];
            retClause = retClause + tempRet[i];
        }
        output += "return " + retClause;

		// System.out.println(output);
        /*
        for (int i = 0; i < class_size - 1; i++) {
        	if i == 0:
        		2 for + where + return
        	else:
        		1 for + where + return
        	[], [])
        }
        return $tuple/x/*
        */
		
		return output;
	}

	// @Override
	// public ArrayList<Node> visitJoin(MyXQueryParser.JoinContext ctx) {
	// 	ArrayList<Node> res1 = visit(ctx.xq(0));
 //        int attrSize = ctx.attList(0).NAME().size();
 //        ArrayList<Node> result = new ArrayList<>();

 //        ArrayList<HashMap<String, ArrayList<Node>>> maps1 = new ArrayList<>();

 //        for (int i = 0; i < attrSize; i++) {
 //            String attrName = ctx.attList(0).NAME(i).getText();
 //            HashMap<String, ArrayList<Node>> attr2Tuples = new HashMap<>();
 //            for (Node n : res1) {
 //                Node keyNode = ((Element) n).getElementsByTagName(attrName).item(0);
 //                String key = nodeToString(keyNode);
 //                // print(n);
 //                // System.out.println("attrName: " + attrName);
 //                key = key.substring(2 + attrName.length(), key.length() - 3 - attrName.length());
 //                if (!attr2Tuples.containsKey(key)) {
 //                    ArrayList<Node> tuples = new ArrayList<>();
 //                    attr2Tuples.put(key, tuples);
 //                }
 //                attr2Tuples.get(key).add(n.cloneNode(true));
 //            }
 //            maps1.add(attr2Tuples);
 //        }

 //        ArrayList<Node> res2 = visit(ctx.xq(1));
 //        ArrayList<Node> curResult = new ArrayList<>();

 //        if(attrSize == 0) {
 //            for (Node n2 : res2) {
 //                int childNum = n2.getChildNodes().getLength();
 //                    for (Node n1 : res1) {
 //                        Node tempnode = n1.cloneNode(true);
 //                        for (int i = 0; i < childNum; i++) {
 //                            tempnode.appendChild(n2.getChildNodes().item(i).cloneNode(true));
 //                        }
 //                        result.add(tempnode);
 //                    }
 //            }
 //            return result;
 //        }

 //        for (Node n : res2) {
 //            for (int i = 0; i < attrSize; i++) {
 //                String attrName = ctx.attList(1).NAME(i).getText();
 //                Node keyNode = ((Element) n).getElementsByTagName(attrName).item(0);
 //                String key = nodeToString(keyNode);
 //                key = key.substring(2 + attrName.length(), key.length() - 3 - attrName.length());
 //                if (!maps1.get(i).containsKey(key)) {
 //                    curResult.clear();
 //                    break;
 //                }
 //                if (i == 0) {
 //                    curResult.addAll(maps1.get(i).get(key));
 //                } else {
 //                    ArrayList<Node> tmpResult = new ArrayList<>();
 //                    ArrayList<Node> tuples = maps1.get(i).get(key);
 //                    HashSet<String> compareSet = new HashSet<>();
 //                    for (Node x : curResult){
 //                        String keyString = nodeToString(x);
 //                        compareSet.add(keyString);
 //                    }
 //                    for (Node tuple : tuples) {
 //                        String keyString = nodeToString(tuple);
 //                        if (compareSet.contains(keyString))
 //                            tmpResult.add(tuple.cloneNode(true));
 //                    }
 //                    curResult = tmpResult;
 //                    if (curResult.isEmpty())
 //                        break;
 //                }
 //            }
 //            if (!curResult.isEmpty()) {
 //                int childNum = n.getChildNodes().getLength();
 //                for (Node node : curResult) {
 //                    Node tempnode = node.cloneNode(true);
 //                    for (int i = 0; i < childNum; i++) {
 //                        tempnode.appendChild(n.getChildNodes().item(i).cloneNode(true));
 //                    }
 //                    result.add(tempnode);
 //                }
 //                curResult.clear();
 //            }

 //        }
 //        return result;
	// }

	@Override
	public ArrayList<Node> visitJoin(MyXQueryParser.JoinContext ctx) {
        ArrayList<Node> left = visit(ctx.xq(0));
        ArrayList<Node> right = visit(ctx.xq(1));
        int idSize = ctx.attList(0).NAME().size();
        String[] idListLeft = new String[idSize];
        String[] idListRight = new String[idSize];
        for (int i = 0; i < idSize; i++){
            idListLeft[i] = ctx.attList(0).NAME(i).getText();
            idListRight[i] = ctx.attList(1).NAME(i).getText();
        }
        HashMap<String, ArrayList<Node>> hashMapOnLeft = buildHashTable(left, idListLeft);
        ArrayList<Node> result = probeJoin(hashMapOnLeft, right, idListLeft, idListRight);

        return result;
    }
    private ArrayList<Node> probeJoin(HashMap<String, ArrayList<Node>> hashMapOnLeft, ArrayList<Node> right, String [] idListLeft, String []idListRight){
        ArrayList<Node> result = new ArrayList<>();
        for (Node tuple: right){
            ArrayList<Node> children = getChildren(tuple);
            String key = "";
            for (String hashAtt: idListRight) {
                for (Node child: children){
                    if (hashAtt.equals(child.getNodeName())) {
                        key += child.getFirstChild().getTextContent() + "*";
                    }
                }
            }

            if (hashMapOnLeft.containsKey(key))
                result.addAll(product(hashMapOnLeft.get(key),tuple));
        }
        return result;
    }
    public static ArrayList<Node> getChildren(Node curNode){
        ArrayList<Node> childrenList = new ArrayList<Node>();
        for (int i = 0; i < curNode.getChildNodes().getLength(); i++) {
            childrenList.add(curNode.getChildNodes().item(i));
        }
        return childrenList;
    }
    private ArrayList<Node> product(ArrayList<Node> leftList, Node right){
        ArrayList<Node> result = new ArrayList<>();
        for (Node left: leftList){
            ArrayList<Node> newTupleChildren = getChildren(left);
            newTupleChildren.addAll(getChildren(right));
            result.add(makeElem("tuple", newTupleChildren));
        }
        return result;
    }
    private Node makeElem(String tag, ArrayList<Node> list){
        Node result = outputDoc.createElement(tag);
        for (Node node : list) {
            if (node != null) {
                Node newNode = outputDoc.importNode(node, true);
                result.appendChild(newNode);
            }
        }
        return result;
    }

    private HashMap<String, ArrayList<Node>> buildHashTable(ArrayList<Node> tupleList, String [] hashAtts){
        HashMap<String, ArrayList<Node>> result = new HashMap<>();
        for (Node tuple: tupleList){
            ArrayList<Node> children = getChildren(tuple);
            String key = "";
            for (String hashAtt: hashAtts) {
                for (Node child: children){
                    if (hashAtt.equals(child.getNodeName())) {
                    	// print(child);
                    	// System.out.println();
                        key += child.getFirstChild().getTextContent() + "*";
                    }
                }
            }
            if (result.containsKey(key))
                result.get(key).add(tuple);
            else{
                ArrayList<Node> value = new ArrayList<>();
                value.add(tuple);
                result.put(key, value);
            }
        }
  //       for (HashMap.Entry<String, ArrayList<Node>> entry: result.entrySet()) {
  //       	String key = entry.getKey();
  //       	ArrayList<Node> value = entry.getValue();
  //       	System.out.println("key: " + key);
		// 	for (Node n: value) {
		// 		print(n);
		// 	}
		// 	System.out.println();
		// } 
        return result;
    }

	public String indent(int indentNum) {
		String res = "";
		for (int i = 0; i < indentNum; i++) {
			res += "\t";
		}
		return res;
	}

	public String wrap(String var) {
		String name = var.substring(1, var.length());
		String res = "<" + name + ">{" + var + "}</" + name + ">";
		return res;
	}

	public void FLWRIterator(ArrayList<Node> res, MyXQueryParser.FLWRContext ctx, int i) {
		int count = ctx.forClause().var().size();
		if (i < count) { // assgin variables in forclause
			String key = ctx.forClause().var(i).getText();
			ArrayList<Node> value = new ArrayList<Node>(visit(ctx.forClause().xq(i)));
			int num = 0;
			for (Node node : value) {
				HashMap<String, ArrayList<Node>> oldContext = new HashMap<>(currentContext);
				ArrayList<Node> valueNode = new ArrayList<>();
				valueNode.add(node);
				currentContext.put(key, valueNode);
				FLWRIterator(res, ctx, i + 1);
				currentContext = oldContext;
				num++;
			}
		} else {
			if (ctx.letClause() != null) {
				visit(ctx.letClause());
			}
			if (ctx.whereClause() != null) {
				visit(ctx.whereClause());
				if (!condState) {
					return;
				}
			}
			ArrayList<Node> tempResult = new ArrayList<Node>(visit(ctx.returnClause()));
			res.addAll(tempResult);
		}
	}


	@Override
	public ArrayList<Node> visitLetXQ(MyXQueryParser.LetXQContext ctx) {
		HashMap<String, ArrayList<Node>> temp = new HashMap<>(currentContext);
		ArrayList<Node> res = new ArrayList<Node>(visitChildren(ctx));
		currentContext = temp;
		return res;
	}


	@Override
	public ArrayList<Node> visitLetClause(MyXQueryParser.LetClauseContext ctx) {
		for (int i = 0; i < ctx.var().size(); i++) {
			String key = ctx.var(i).getText();
			ArrayList<Node> value = new ArrayList<Node>(visit(ctx.xq(i)));
			currentContext.put(key, value);
		}
		return null;
	}


	@Override
	public ArrayList<Node> visitWhereClause(MyXQueryParser.WhereClauseContext ctx) {
		return visit(ctx.cond());
	}


	@Override
	public ArrayList<Node> visitReturnClause(MyXQueryParser.ReturnClauseContext ctx) {
		return visit(ctx.xq());
	}


	// XQuery - Cond


	@Override
	public ArrayList<Node> visitXQEqual(MyXQueryParser.XQEqualContext ctx) {
		ArrayList<Node> left = new ArrayList<>(visit(ctx.xq(0)));
		ArrayList<Node> right = new ArrayList<>(visit(ctx.xq(1)));
		for (Node leftNode : left) {
			for (Node rightNode : right) {
				if (leftNode.isEqualNode(rightNode)) {
					condState = true;
					return null;
				}
			}
		}
		condState = false;
		return null;
	}


	@Override
	public ArrayList<Node> visitXQIs(MyXQueryParser.XQIsContext ctx) {
		ArrayList<Node> left = new ArrayList<>(visit(ctx.xq(0)));
		ArrayList<Node> right = new ArrayList<>(visit(ctx.xq(1)));
		for (Node leftNode : left) {
			for (Node rightNode : right) {
				if (leftNode.isSameNode(rightNode)) {
					condState = true;
					return null;
				}
			}
		}
		condState = false;
		return null;
	}


	@Override
	public ArrayList<Node> visitXQEmpty(MyXQueryParser.XQEmptyContext ctx) {
		ArrayList<Node> temp = new ArrayList<Node>(visit(ctx.xq()));
		if (temp.isEmpty()) {
			condState = true;
			return null;
		}
		condState = false;
		return null;
	}


	@Override
	public ArrayList<Node> visitSomeSatisfies(MyXQueryParser.SomeSatisfiesContext ctx) {
		if (SomeSatisfiesHelper(ctx, 0)) {
			condState = true;
			return null;
		}
		condState = false;
		return null;
	}


	private boolean SomeSatisfiesHelper(MyXQueryParser.SomeSatisfiesContext ctx, int i) {
		int count = ctx.var().size();
		if (i == count) {
			visit(ctx.cond());
			if (condState) {
				return true;
			}
		} else {
			String key = ctx.var(i).getText();
			ArrayList<Node> value = new ArrayList<Node>(visit(ctx.xq(i)));
			for (Node node : value) {
				HashMap<String, ArrayList<Node>> oldContext = new HashMap<>(currentContext);
				ArrayList<Node> nodeValue = new ArrayList<>();
				nodeValue.add(node);
				currentContext.put(key, nodeValue);
				if (i < count) {
					if (SomeSatisfiesHelper(ctx, i + 1)) {
						currentContext = oldContext;
						return true;
					}
				}
				currentContext = oldContext;
			}
		}
		return false;
	}


	@Override
	public ArrayList<Node> visitCondParentheses(MyXQueryParser.CondParenthesesContext ctx) {
		return visit(ctx.cond());
	}


	@Override
	public ArrayList<Node> visitCondAndCond(MyXQueryParser.CondAndCondContext ctx) {
		visit(ctx.cond(0));
		boolean left = condState;
		visit(ctx.cond(1));
		boolean right = condState;
		if (left && right) {
			condState = true;
		} else {
			condState = false;
		}
		return null;
	}


	@Override
	public ArrayList<Node> visitCondOrCond(MyXQueryParser.CondOrCondContext ctx) {
		visit(ctx.cond(0));
		boolean left = condState;
		visit(ctx.cond(1));
		boolean right = condState;
		if (left || right) {
			condState = true;
		} else {
			condState = false;
		}
		return null;
	}


	@Override
	public ArrayList<Node> visitNotCond(MyXQueryParser.NotCondContext ctx) {
		visit(ctx.cond());
		boolean opposite = condState;
		if (!opposite) {
			condState = true;
		} else {
			condState = false;
		}
		return null;
	}


	// Helper funcitons


	private Node getRootFromFile(String filename) {
		Node root;
		try {
			File inputFile = new File(filename);
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			inputDoc = db.parse(inputFile);
			inputDoc.getDocumentElement().normalize();
			root = inputDoc;
			System.out.println("Root node found in " + filename + ": " + root.getNodeName() + "\n");
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return root;
	}


	private ArrayList<Node> unique(ArrayList<Node> nodes) {
		ArrayList<Node> res = new ArrayList<Node>();
		HashSet<Node> seen = new HashSet<Node>();
		for (Node node: nodes) {
			if (seen.contains(node)) {
				continue;
			}
			seen.add(node);
			res.add(node);
		}
		return res;
	}

	private static void print(Node node) {
		String name = node.getNodeName();
		NodeList children = node.getChildNodes();
		int textNodeNum = 0;
		for (int i = 0; i < children.getLength(); i++) {
			Node child = children.item(i);
			if (child.getNodeType() == Node.TEXT_NODE) {
				textNodeNum++;
			}
		}
		if (textNodeNum == children.getLength()) {
			String content = node.getTextContent();
			String res = "<" + name + ">" + content + "</" + name + ">";
			System.out.println(res);
		} else {
			System.out.println("<" + name + ">");
			for (int i = 0; i < children.getLength(); i++) {
			Node child = children.item(i);
				if (child.getNodeType() == Node.TEXT_NODE) {
					String text = child.getTextContent();
					if (!text.trim().isEmpty()) {
						System.out.println(text);
					}
				} else {
					print(child);
				}
			}
			System.out.println("</" + name + ">");
		}
		return;
	}

	private String nodeToString(Node n) {
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = null;
        StringWriter writer = new StringWriter();
        try {
            transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
            DOMSource source = new DOMSource(n);
            transformer.transform(source, new StreamResult(writer));
        } catch (TransformerConfigurationException e) {
            e.printStackTrace();
        } catch (TransformerException e) {
            e.printStackTrace();
        }
        return writer.toString();
    }

}