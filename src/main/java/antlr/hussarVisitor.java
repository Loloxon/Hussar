// Generated from java-escape by ANTLR 4.11.1
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link hussarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface hussarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link hussarParser#program_sym}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram_sym(hussarParser.Program_symContext ctx);
	/**
	 * Visit a parse tree produced by {@link hussarParser#start_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart_block(hussarParser.Start_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link hussarParser#end_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnd_block(hussarParser.End_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link hussarParser#hussar_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHussar_expr(hussarParser.Hussar_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link hussarParser#var_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_decl(hussarParser.Var_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link hussarParser#int_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_decl(hussarParser.Int_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link hussarParser#char_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChar_decl(hussarParser.Char_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link hussarParser#string_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_decl(hussarParser.String_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link hussarParser#math_symbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMath_symbol(hussarParser.Math_symbolContext ctx);
	/**
	 * Visit a parse tree produced by {@link hussarParser#math_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMath_expr(hussarParser.Math_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link hussarParser#loop_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_expr(hussarParser.Loop_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link hussarParser#then_sym}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThen_sym(hussarParser.Then_symContext ctx);
	/**
	 * Visit a parse tree produced by {@link hussarParser#compare_sym}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompare_sym(hussarParser.Compare_symContext ctx);
	/**
	 * Visit a parse tree produced by {@link hussarParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(hussarParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link hussarParser#for_range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_range(hussarParser.For_rangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link hussarParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(hussarParser.PrintContext ctx);
}