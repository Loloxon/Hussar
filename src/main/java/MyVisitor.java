import antlr.hussarBaseVisitor;
import antlr.hussarParser;

public class MyVisitor extends hussarBaseVisitor<Object> {

    /**
     * {@inheritDoc}
     *
     * <p>Objecthe default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Object visitProgram_sym(hussarParser.Program_symContext ctx) {
        System.out.print("public static void main(");
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>Objecthe default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Object visitStart_block(hussarParser.Start_blockContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>Objecthe default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Object visitEnd_block(hussarParser.End_blockContext ctx) {
        System.out.println("}");
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>Objecthe default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Object visitHussar_expr(hussarParser.Hussar_exprContext ctx) {
        if (ctx.math_expr() != null)
            System.out.println(ctx.math_expr());
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>Objecthe default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Object visitVar_decl(hussarParser.Var_declContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>Objecthe default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    private void print_math_expr(hussarParser.Math_exprContext expr) {
        if (expr.L_BRACKET() != null)
            System.out.print(expr.L_BRACKET());
        if (expr.math_expr() != null && expr.math_expr().size() > 0) {
            print_math_expr(expr.math_expr().get(0));

        }
        if (expr.math_symbol() != null)
            System.out.print(expr.math_symbol().PLUS() != null ? expr.math_symbol().PLUS() :
                    expr.math_symbol().MINUS() != null ? expr.math_symbol().MINUS() :
                            expr.math_symbol().DIVIDE() != null ? expr.math_symbol().DIVIDE() :
                                    expr.math_symbol().MULTIPLICATION() != null ? expr.math_symbol().MULTIPLICATION() :
                                            "**");
        if (expr.math_expr() != null && expr.math_expr().size() > 1) {
            print_math_expr(expr.math_expr().get(1));
        }
        if (expr.R_BRACKET() != null)
            System.out.print(expr.R_BRACKET());
        if (expr.INT() != null)
            System.out.print(expr.INT());
    }

    @Override
    public Object visitInt_decl(hussarParser.Int_declContext ctx) {
        System.out.print("int " + ctx.ID_NAME());
        if (ctx.EQ() != null) {
            System.out.print(ctx.EQ());
            print_math_expr(ctx.math_expr());
        }
        System.out.println(";");
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>Objecthe default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Object visitChar_decl(hussarParser.Char_declContext ctx) {
        System.out.println("String " + ctx.ID_NAME() + "=" + ctx.CHAR() + ";");
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>Objecthe default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Object visitString_decl(hussarParser.String_declContext ctx) {
        System.out.println("String " + ctx.ID_NAME() + "=" + ctx.STRING() + ";");
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>Objecthe default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Object visitMath_symbol(hussarParser.Math_symbolContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>Objecthe default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Object visitMath_expr(hussarParser.Math_exprContext ctx) {
//        if(ctx.INT()!=null){
//            System.out.print(ctx.INT());
//        }
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>Objecthe default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Object visitLoop_expr(hussarParser.Loop_exprContext ctx) {
        if (ctx.start_block().IF_SYM() != null) {
            System.out.print("if(");
        } else if (ctx.start_block().FOR_SYM() != null) {
            System.out.print("for(");
        } else if (ctx.start_block().WHILE_SYM() != null) {
            System.out.print("while(");
        }
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>Objecthe default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Object visitThen_sym(hussarParser.Then_symContext ctx) {
        System.out.println("){");
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>Objecthe default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Object visitCompare_sym(hussarParser.Compare_symContext ctx) {
        if (ctx.EQ() != null) {
            System.out.print(ctx.EQ());
        } else if (ctx.LESSER() != null) {
            System.out.print(ctx.LESSER());
        } else if (ctx.LESSEREQ() != null) {
            System.out.print(ctx.LESSEREQ());
        } else if (ctx.GREATER() != null) {
            System.out.print(ctx.GREATER());
        } else if (ctx.GREATEREQ() != null) {
            System.out.print(ctx.GREATEREQ());
        }
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>Objecthe default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Object visitCondition(hussarParser.ConditionContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitFor_range(hussarParser.For_rangeContext ctx) {
        System.out.print("int i=" + ctx.INT().get(0) + "; i <= " + ctx.INT().get(1) + "; i++");
        return visitChildren(ctx);
    }

    @Override
    public Object visitPrint(hussarParser.PrintContext ctx) {
        System.out.println("System.out.println(" +
                (ctx.STRING() != null ? ctx.STRING() :
                        ctx.math_expr() != null ? ctx.math_expr() :
                                ctx.CHAR() != null ? ctx.CHAR() :
                                        ctx.ID_NAME()) + ");");
        return visitChildren(ctx);
    }
}
