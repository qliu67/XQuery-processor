import java.util.ArrayList;
import java.util.HashMap;
import java.io.*;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

//export CLASSPATH=".:/usr/local/lib/antlr-4.7.1-complete.jar:$CLASSPATH"

public class Demo {
	public static void main(String[] args) throws Exception {
		String fileName = "test";
		boolean rewriteFlag = false;
		if (args[0].equals("rewrite")) {
			rewriteFlag = true;
		}
		System.out.println(rewriteFlag);
		CharStream input = CharStreams.fromFileName(fileName);
		System.out.println("\nQuery:\n" + input.toString() + "\n");
		MyXQueryLexer lexer = new MyXQueryLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		MyXQueryParser parser = new MyXQueryParser(tokens);
		ParseTree tree = parser.xq();
		MyXQueryEvaluator eval = new MyXQueryEvaluator(rewriteFlag);
		ArrayList<Node> res = eval.visit(tree);
		// display the results
		System.out.println("Results:");
		for (Node node: res) {
			print(node, 0);
		}
		System.out.println();
		writeFile(res, "output.xml");
	}

	private static void writeFile(ArrayList<Node> result, String outputFile) throws TransformerException, FileNotFoundException
    {
        File out = new File(outputFile);
        if(out.exists()){
            out.delete();
        }

        FileOutputStream os = new FileOutputStream(outputFile,true);
        for(Node node : result) {
            Transformer t = TransformerFactory.newInstance().newTransformer();
            t.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
            t.setOutputProperty(OutputKeys.INDENT, "yes");
            t.transform(new DOMSource(node), new StreamResult(os));
        }
    }

	private static void print(Node node, int depth) {
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
			System.out.println(indent(depth) + res);
		} else {
			System.out.println(indent(depth) + "<" + name + ">");
			for (int i = 0; i < children.getLength(); i++) {
			Node child = children.item(i);
				if (child.getNodeType() == Node.TEXT_NODE) {
					String text = child.getTextContent();
					if (!text.trim().isEmpty()) {
						System.out.println(text);
					}
				} else {
					print(child, depth + 1);
				}
			}
			System.out.println(indent(depth) + "</" + name + ">");
		}
		return;
	}

	private static String indent(int indentNum) {
		String res = "";
		for (int i = 0; i < indentNum; i++) {
			res += "\t";
		}
		return res;
	}

}