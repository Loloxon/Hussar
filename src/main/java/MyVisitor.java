import antlr.hussarBaseVisitor;
import antlr.hussarParser;

public class MyVisitor extends hussarBaseVisitor<Object> {

    @Override
    public Object visitProgram_sym(hussarParser.Program_symContext ctx) {
        System.out.print("public static void main(");
        return visitChildren(ctx);
    }

    @Override
    public Object visitStart_block(hussarParser.Start_blockContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitEnd_block(hussarParser.End_blockContext ctx) {
        System.out.println("}");
        return visitChildren(ctx);
    }

    @Override
    public Object visitHussar_expr(hussarParser.Hussar_exprContext ctx) {
        return visitChildren(ctx);
    }


    @Override
    public Object visitVar_decl(hussarParser.Var_declContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitInt_decl(hussarParser.Int_declContext ctx) {
        System.out.print("int " + ctx.ID_NAME());
        if (ctx.EQ() != null) {
            System.out.print(ctx.EQ());
        }
        return visitChildren(ctx);
    }

    @Override
    public Object visitChar_decl(hussarParser.Char_declContext ctx) {
        System.out.println("String " + ctx.ID_NAME() + "=" + ctx.CHAR() + ";");
        return visitChildren(ctx);
    }

    @Override
    public Object visitString_decl(hussarParser.String_declContext ctx) {
        System.out.println("String " + ctx.ID_NAME() + "=" + ctx.STRING() + ";");
        return visitChildren(ctx);
    }

    @Override public Object visitVar_redecl(hussarParser.Var_redeclContext ctx) {
        System.out.print(ctx.ID_NAME() + "=");
        return visitChildren(ctx); }

    @Override public Object visitInt_redecl(hussarParser.Int_redeclContext ctx) { return visitChildren(ctx); }

    @Override public Object visitChar_redecl(hussarParser.Char_redeclContext ctx) {
        System.out.print(ctx.CHAR());
        return visitChildren(ctx); }

    @Override public Object visitString_redecl(hussarParser.String_redeclContext ctx) {
        System.out.print(ctx.STRING());
        return visitChildren(ctx); }

    @Override public Object visitMath_symbol_prio0(hussarParser.Math_symbol_prio0Context ctx) {
        System.out.print(ctx.PLUS()!=null ? ctx.PLUS() : ctx.MINUS()!=null ? ctx.MINUS() : "%");
        return visitChildren(ctx); }

    @Override public Object visitMath_symbol_prio1(hussarParser.Math_symbol_prio1Context ctx) {
        System.out.print(ctx.DIVIDE()!=null ? ctx.DIVIDE() : ctx.MULTIPLICATION());
        return visitChildren(ctx); }

    @Override public Object visitMath_symbol_prio2(hussarParser.Math_symbol_prio2Context ctx) {
        System.out.print(",");
        return visitChildren(ctx); }

    @Override public Object visitStart_bracket(hussarParser.Start_bracketContext ctx) {
        System.out.print(ctx.L_BRACKET());
        return visitChildren(ctx); }

    @Override public Object visitEnd_bracket(hussarParser.End_bracketContext ctx) {
        System.out.print(ctx.R_BRACKET());
        return visitChildren(ctx); }

    @Override public Object visitStart_bracket_fake_power(hussarParser.Start_bracket_fake_powerContext ctx) {
        System.out.print("(int) Math.pow(");
        return visitChildren(ctx); }

    @Override public Object visitEnd_bracket_fake(hussarParser.End_bracket_fakeContext ctx) {
        System.out.print(")");
        return visitChildren(ctx); }

    @Override public Object visitEnd_semicolon(hussarParser.End_semicolonContext ctx) {
        System.out.println(";");
        return visitChildren(ctx); }

    @Override public Object visitBase(hussarParser.BaseContext ctx) {
        if(ctx.INT()!=null) {
            System.out.print(ctx.INT());
        }
        else if(ctx.ID_NAME()!=null) {
            System.out.print(ctx.ID_NAME());
        }

        return visitChildren(ctx); }

    @Override public Object visitFactor(hussarParser.FactorContext ctx) { return visitChildren(ctx); }

    @Override public Object visitComponent(hussarParser.ComponentContext ctx) { return visitChildren(ctx); }

    @Override public Object visitMath_expr(hussarParser.Math_exprContext ctx) { return visitChildren(ctx); }

    @Override public Object visitSupreme_math_expr(hussarParser.Supreme_math_exprContext ctx) { return visitChildren(ctx); }


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

    @Override
    public Object visitThen_sym(hussarParser.Then_symContext ctx) {
        System.out.println("){");
        return visitChildren(ctx);
    }

    @Override public Object visitIs_equal(hussarParser.Is_equalContext ctx) {
        System.out.print("==");
        return visitChildren(ctx); }


    @Override
    public Object visitCompare_sym(hussarParser.Compare_symContext ctx) {
        if (ctx.NOTEQ() != null) {
            System.out.print("!=");
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

    @Override
    public Object visitCondition(hussarParser.ConditionContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitFor_range(hussarParser.For_rangeContext ctx) {
        System.out.print("int tempUntypicalVariable=" + ctx.INT().get(0) +
                "; tempUntypicalVariable <= " + ctx.INT().get(1) + "; tempUntypicalVariable++");
        return visitChildren(ctx);
    }

    @Override public Object visitPrint_separator(hussarParser.Print_separatorContext ctx) {
        System.out.print("+ \" \" +");
        return visitChildren(ctx); }


    @Override public Object visitPrint_string(hussarParser.Print_stringContext ctx) {
        System.out.print(ctx.STRING());
        return visitChildren(ctx); }

    @Override public Object visitPrint_char(hussarParser.Print_charContext ctx) {
        System.out.print(ctx.CHAR());
        return visitChildren(ctx); }

    @Override public Object visitPrint_newline(hussarParser.Print_newlineContext ctx) {
        System.out.print("\"\\n\"");
        return visitChildren(ctx); }

    @Override
    public Object visitPrint(hussarParser.PrintContext ctx) {
        System.out.print("System.out.print(");
        return visitChildren(ctx);
    }
}
