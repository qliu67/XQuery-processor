// Generated from MyXQuery.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MyXQueryParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MyXQueryVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code ApChildren}
	 * labeled alternative in {@link MyXQueryParser#ap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApChildren(MyXQueryParser.ApChildrenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ApFindAll}
	 * labeled alternative in {@link MyXQueryParser#ap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApFindAll(MyXQueryParser.ApFindAllContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyXQueryParser#filename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilename(MyXQueryParser.FilenameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Wildcard}
	 * labeled alternative in {@link MyXQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWildcard(MyXQueryParser.WildcardContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Attribute}
	 * labeled alternative in {@link MyXQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(MyXQueryParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RpChildren}
	 * labeled alternative in {@link MyXQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpChildren(MyXQueryParser.RpChildrenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RpFindAll}
	 * labeled alternative in {@link MyXQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpFindAll(MyXQueryParser.RpFindAllContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RpParentheses}
	 * labeled alternative in {@link MyXQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpParentheses(MyXQueryParser.RpParenthesesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RpDouble}
	 * labeled alternative in {@link MyXQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpDouble(MyXQueryParser.RpDoubleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Text}
	 * labeled alternative in {@link MyXQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(MyXQueryParser.TextContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParentDir}
	 * labeled alternative in {@link MyXQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentDir(MyXQueryParser.ParentDirContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CurrentDir}
	 * labeled alternative in {@link MyXQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCurrentDir(MyXQueryParser.CurrentDirContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RpFilter}
	 * labeled alternative in {@link MyXQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpFilter(MyXQueryParser.RpFilterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Name}
	 * labeled alternative in {@link MyXQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(MyXQueryParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FParentheses}
	 * labeled alternative in {@link MyXQueryParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFParentheses(MyXQueryParser.FParenthesesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Equal}
	 * labeled alternative in {@link MyXQueryParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqual(MyXQueryParser.EqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotF}
	 * labeled alternative in {@link MyXQueryParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotF(MyXQueryParser.NotFContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Is}
	 * labeled alternative in {@link MyXQueryParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIs(MyXQueryParser.IsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FAndF}
	 * labeled alternative in {@link MyXQueryParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFAndF(MyXQueryParser.FAndFContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FOrF}
	 * labeled alternative in {@link MyXQueryParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFOrF(MyXQueryParser.FOrFContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RpExists}
	 * labeled alternative in {@link MyXQueryParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpExists(MyXQueryParser.RpExistsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MakeElem}
	 * labeled alternative in {@link MyXQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMakeElem(MyXQueryParser.MakeElemContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FLWR}
	 * labeled alternative in {@link MyXQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFLWR(MyXQueryParser.FLWRContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XQChildren}
	 * labeled alternative in {@link MyXQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXQChildren(MyXQueryParser.XQChildrenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link MyXQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(MyXQueryParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XQParentheses}
	 * labeled alternative in {@link MyXQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXQParentheses(MyXQueryParser.XQParenthesesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XQDouble}
	 * labeled alternative in {@link MyXQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXQDouble(MyXQueryParser.XQDoubleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Join}
	 * labeled alternative in {@link MyXQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin(MyXQueryParser.JoinContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LetXQ}
	 * labeled alternative in {@link MyXQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetXQ(MyXQueryParser.LetXQContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AbsolutePath}
	 * labeled alternative in {@link MyXQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbsolutePath(MyXQueryParser.AbsolutePathContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XQFindAll}
	 * labeled alternative in {@link MyXQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXQFindAll(MyXQueryParser.XQFindAllContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MakeText}
	 * labeled alternative in {@link MyXQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMakeText(MyXQueryParser.MakeTextContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyXQueryParser#stringConst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringConst(MyXQueryParser.StringConstContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyXQueryParser#attList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttList(MyXQueryParser.AttListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyXQueryParser#forClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForClause(MyXQueryParser.ForClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyXQueryParser#letClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetClause(MyXQueryParser.LetClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyXQueryParser#whereClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereClause(MyXQueryParser.WhereClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyXQueryParser#returnClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnClause(MyXQueryParser.ReturnClauseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XQEqual}
	 * labeled alternative in {@link MyXQueryParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXQEqual(MyXQueryParser.XQEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CondParentheses}
	 * labeled alternative in {@link MyXQueryParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondParentheses(MyXQueryParser.CondParenthesesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotCond}
	 * labeled alternative in {@link MyXQueryParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotCond(MyXQueryParser.NotCondContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XQEmpty}
	 * labeled alternative in {@link MyXQueryParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXQEmpty(MyXQueryParser.XQEmptyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XQIs}
	 * labeled alternative in {@link MyXQueryParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXQIs(MyXQueryParser.XQIsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SomeSatisfies}
	 * labeled alternative in {@link MyXQueryParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSomeSatisfies(MyXQueryParser.SomeSatisfiesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CondAndCond}
	 * labeled alternative in {@link MyXQueryParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondAndCond(MyXQueryParser.CondAndCondContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CondOrCond}
	 * labeled alternative in {@link MyXQueryParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondOrCond(MyXQueryParser.CondOrCondContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyXQueryParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(MyXQueryParser.VarContext ctx);
}