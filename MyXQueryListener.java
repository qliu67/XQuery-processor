// Generated from MyXQuery.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MyXQueryParser}.
 */
public interface MyXQueryListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code ApChildren}
	 * labeled alternative in {@link MyXQueryParser#ap}.
	 * @param ctx the parse tree
	 */
	void enterApChildren(MyXQueryParser.ApChildrenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ApChildren}
	 * labeled alternative in {@link MyXQueryParser#ap}.
	 * @param ctx the parse tree
	 */
	void exitApChildren(MyXQueryParser.ApChildrenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ApFindAll}
	 * labeled alternative in {@link MyXQueryParser#ap}.
	 * @param ctx the parse tree
	 */
	void enterApFindAll(MyXQueryParser.ApFindAllContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ApFindAll}
	 * labeled alternative in {@link MyXQueryParser#ap}.
	 * @param ctx the parse tree
	 */
	void exitApFindAll(MyXQueryParser.ApFindAllContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyXQueryParser#filename}.
	 * @param ctx the parse tree
	 */
	void enterFilename(MyXQueryParser.FilenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyXQueryParser#filename}.
	 * @param ctx the parse tree
	 */
	void exitFilename(MyXQueryParser.FilenameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Wildcard}
	 * labeled alternative in {@link MyXQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterWildcard(MyXQueryParser.WildcardContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Wildcard}
	 * labeled alternative in {@link MyXQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitWildcard(MyXQueryParser.WildcardContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Attribute}
	 * labeled alternative in {@link MyXQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(MyXQueryParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Attribute}
	 * labeled alternative in {@link MyXQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(MyXQueryParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RpChildren}
	 * labeled alternative in {@link MyXQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRpChildren(MyXQueryParser.RpChildrenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RpChildren}
	 * labeled alternative in {@link MyXQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRpChildren(MyXQueryParser.RpChildrenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RpFindAll}
	 * labeled alternative in {@link MyXQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRpFindAll(MyXQueryParser.RpFindAllContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RpFindAll}
	 * labeled alternative in {@link MyXQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRpFindAll(MyXQueryParser.RpFindAllContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RpParentheses}
	 * labeled alternative in {@link MyXQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRpParentheses(MyXQueryParser.RpParenthesesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RpParentheses}
	 * labeled alternative in {@link MyXQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRpParentheses(MyXQueryParser.RpParenthesesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RpDouble}
	 * labeled alternative in {@link MyXQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRpDouble(MyXQueryParser.RpDoubleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RpDouble}
	 * labeled alternative in {@link MyXQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRpDouble(MyXQueryParser.RpDoubleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Text}
	 * labeled alternative in {@link MyXQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterText(MyXQueryParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Text}
	 * labeled alternative in {@link MyXQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitText(MyXQueryParser.TextContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParentDir}
	 * labeled alternative in {@link MyXQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterParentDir(MyXQueryParser.ParentDirContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParentDir}
	 * labeled alternative in {@link MyXQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitParentDir(MyXQueryParser.ParentDirContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CurrentDir}
	 * labeled alternative in {@link MyXQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterCurrentDir(MyXQueryParser.CurrentDirContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CurrentDir}
	 * labeled alternative in {@link MyXQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitCurrentDir(MyXQueryParser.CurrentDirContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RpFilter}
	 * labeled alternative in {@link MyXQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRpFilter(MyXQueryParser.RpFilterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RpFilter}
	 * labeled alternative in {@link MyXQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRpFilter(MyXQueryParser.RpFilterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Name}
	 * labeled alternative in {@link MyXQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterName(MyXQueryParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Name}
	 * labeled alternative in {@link MyXQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitName(MyXQueryParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FParentheses}
	 * labeled alternative in {@link MyXQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void enterFParentheses(MyXQueryParser.FParenthesesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FParentheses}
	 * labeled alternative in {@link MyXQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void exitFParentheses(MyXQueryParser.FParenthesesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Equal}
	 * labeled alternative in {@link MyXQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void enterEqual(MyXQueryParser.EqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Equal}
	 * labeled alternative in {@link MyXQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void exitEqual(MyXQueryParser.EqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotF}
	 * labeled alternative in {@link MyXQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void enterNotF(MyXQueryParser.NotFContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotF}
	 * labeled alternative in {@link MyXQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void exitNotF(MyXQueryParser.NotFContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Is}
	 * labeled alternative in {@link MyXQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void enterIs(MyXQueryParser.IsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Is}
	 * labeled alternative in {@link MyXQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void exitIs(MyXQueryParser.IsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FAndF}
	 * labeled alternative in {@link MyXQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void enterFAndF(MyXQueryParser.FAndFContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FAndF}
	 * labeled alternative in {@link MyXQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void exitFAndF(MyXQueryParser.FAndFContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FOrF}
	 * labeled alternative in {@link MyXQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void enterFOrF(MyXQueryParser.FOrFContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FOrF}
	 * labeled alternative in {@link MyXQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void exitFOrF(MyXQueryParser.FOrFContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RpExists}
	 * labeled alternative in {@link MyXQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void enterRpExists(MyXQueryParser.RpExistsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RpExists}
	 * labeled alternative in {@link MyXQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void exitRpExists(MyXQueryParser.RpExistsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MakeElem}
	 * labeled alternative in {@link MyXQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterMakeElem(MyXQueryParser.MakeElemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MakeElem}
	 * labeled alternative in {@link MyXQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitMakeElem(MyXQueryParser.MakeElemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FLWR}
	 * labeled alternative in {@link MyXQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterFLWR(MyXQueryParser.FLWRContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FLWR}
	 * labeled alternative in {@link MyXQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitFLWR(MyXQueryParser.FLWRContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XQChildren}
	 * labeled alternative in {@link MyXQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXQChildren(MyXQueryParser.XQChildrenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XQChildren}
	 * labeled alternative in {@link MyXQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXQChildren(MyXQueryParser.XQChildrenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link MyXQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterVariable(MyXQueryParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link MyXQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitVariable(MyXQueryParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XQParentheses}
	 * labeled alternative in {@link MyXQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXQParentheses(MyXQueryParser.XQParenthesesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XQParentheses}
	 * labeled alternative in {@link MyXQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXQParentheses(MyXQueryParser.XQParenthesesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XQDouble}
	 * labeled alternative in {@link MyXQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXQDouble(MyXQueryParser.XQDoubleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XQDouble}
	 * labeled alternative in {@link MyXQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXQDouble(MyXQueryParser.XQDoubleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Join}
	 * labeled alternative in {@link MyXQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterJoin(MyXQueryParser.JoinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Join}
	 * labeled alternative in {@link MyXQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitJoin(MyXQueryParser.JoinContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LetXQ}
	 * labeled alternative in {@link MyXQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterLetXQ(MyXQueryParser.LetXQContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LetXQ}
	 * labeled alternative in {@link MyXQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitLetXQ(MyXQueryParser.LetXQContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AbsolutePath}
	 * labeled alternative in {@link MyXQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterAbsolutePath(MyXQueryParser.AbsolutePathContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AbsolutePath}
	 * labeled alternative in {@link MyXQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitAbsolutePath(MyXQueryParser.AbsolutePathContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XQFindAll}
	 * labeled alternative in {@link MyXQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXQFindAll(MyXQueryParser.XQFindAllContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XQFindAll}
	 * labeled alternative in {@link MyXQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXQFindAll(MyXQueryParser.XQFindAllContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MakeText}
	 * labeled alternative in {@link MyXQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterMakeText(MyXQueryParser.MakeTextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MakeText}
	 * labeled alternative in {@link MyXQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitMakeText(MyXQueryParser.MakeTextContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyXQueryParser#stringConst}.
	 * @param ctx the parse tree
	 */
	void enterStringConst(MyXQueryParser.StringConstContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyXQueryParser#stringConst}.
	 * @param ctx the parse tree
	 */
	void exitStringConst(MyXQueryParser.StringConstContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyXQueryParser#attList}.
	 * @param ctx the parse tree
	 */
	void enterAttList(MyXQueryParser.AttListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyXQueryParser#attList}.
	 * @param ctx the parse tree
	 */
	void exitAttList(MyXQueryParser.AttListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyXQueryParser#forClause}.
	 * @param ctx the parse tree
	 */
	void enterForClause(MyXQueryParser.ForClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyXQueryParser#forClause}.
	 * @param ctx the parse tree
	 */
	void exitForClause(MyXQueryParser.ForClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyXQueryParser#letClause}.
	 * @param ctx the parse tree
	 */
	void enterLetClause(MyXQueryParser.LetClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyXQueryParser#letClause}.
	 * @param ctx the parse tree
	 */
	void exitLetClause(MyXQueryParser.LetClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyXQueryParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(MyXQueryParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyXQueryParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(MyXQueryParser.WhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyXQueryParser#returnClause}.
	 * @param ctx the parse tree
	 */
	void enterReturnClause(MyXQueryParser.ReturnClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyXQueryParser#returnClause}.
	 * @param ctx the parse tree
	 */
	void exitReturnClause(MyXQueryParser.ReturnClauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XQEqual}
	 * labeled alternative in {@link MyXQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterXQEqual(MyXQueryParser.XQEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XQEqual}
	 * labeled alternative in {@link MyXQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitXQEqual(MyXQueryParser.XQEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CondParentheses}
	 * labeled alternative in {@link MyXQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCondParentheses(MyXQueryParser.CondParenthesesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CondParentheses}
	 * labeled alternative in {@link MyXQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCondParentheses(MyXQueryParser.CondParenthesesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotCond}
	 * labeled alternative in {@link MyXQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterNotCond(MyXQueryParser.NotCondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotCond}
	 * labeled alternative in {@link MyXQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitNotCond(MyXQueryParser.NotCondContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XQEmpty}
	 * labeled alternative in {@link MyXQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterXQEmpty(MyXQueryParser.XQEmptyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XQEmpty}
	 * labeled alternative in {@link MyXQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitXQEmpty(MyXQueryParser.XQEmptyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XQIs}
	 * labeled alternative in {@link MyXQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterXQIs(MyXQueryParser.XQIsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XQIs}
	 * labeled alternative in {@link MyXQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitXQIs(MyXQueryParser.XQIsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SomeSatisfies}
	 * labeled alternative in {@link MyXQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterSomeSatisfies(MyXQueryParser.SomeSatisfiesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SomeSatisfies}
	 * labeled alternative in {@link MyXQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitSomeSatisfies(MyXQueryParser.SomeSatisfiesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CondAndCond}
	 * labeled alternative in {@link MyXQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCondAndCond(MyXQueryParser.CondAndCondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CondAndCond}
	 * labeled alternative in {@link MyXQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCondAndCond(MyXQueryParser.CondAndCondContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CondOrCond}
	 * labeled alternative in {@link MyXQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCondOrCond(MyXQueryParser.CondOrCondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CondOrCond}
	 * labeled alternative in {@link MyXQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCondOrCond(MyXQueryParser.CondOrCondContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyXQueryParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(MyXQueryParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyXQueryParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(MyXQueryParser.VarContext ctx);
}