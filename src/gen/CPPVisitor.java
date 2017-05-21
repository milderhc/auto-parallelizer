// Generated from /home/milderhc/Documents/lenguajes/ta/antlr/AutoParallelizer/grammar/CPP.g4 by ANTLR 4.6
package gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CPPParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CPPVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CPPParser#cpp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCpp(CPPParser.CppContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#global}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal(CPPParser.GlobalContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(CPPParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#mainSign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainSign(CPPParser.MainSignContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#namespace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespace(CPPParser.NamespaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#using}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsing(CPPParser.UsingContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#nestedNamespace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedNamespace(CPPParser.NestedNamespaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(CPPParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPath(CPPParser.PathContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#typedef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedef(CPPParser.TypedefContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#datatype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatatype(CPPParser.DatatypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#datatypeDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatatypeDefinition(CPPParser.DatatypeDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#template}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplate(CPPParser.TemplateContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(CPPParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#functionSign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionSign(CPPParser.FunctionSignContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#functionRem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionRem(CPPParser.FunctionRemContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#functionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBody(CPPParser.FunctionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(CPPParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#structClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructClass(CPPParser.StructClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#inheritance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInheritance(CPPParser.InheritanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#encapsulation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEncapsulation(CPPParser.EncapsulationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#structClassBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructClassBody(CPPParser.StructClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#globalClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalClass(CPPParser.GlobalClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#classConstructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassConstructor(CPPParser.ClassConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(CPPParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#integerType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerType(CPPParser.IntegerTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#floatType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatType(CPPParser.FloatTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#boolType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolType(CPPParser.BoolTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction(CPPParser.InstructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#scope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScope(CPPParser.ScopeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#declarationBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationBlock(CPPParser.DeclarationBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(CPPParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#properDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperDeclaration(CPPParser.ProperDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#declarationType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationType(CPPParser.DeclarationTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#assignmentBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentBlock(CPPParser.AssignmentBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#ifBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfBlock(CPPParser.IfBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#whileBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileBlock(CPPParser.WhileBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#doWhileBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileBlock(CPPParser.DoWhileBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#doWhileBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileBody(CPPParser.DoWhileBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#forBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForBlock(CPPParser.ForBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#forExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForExpression(CPPParser.ForExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#classicFor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassicFor(CPPParser.ClassicForContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#forEach}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForEach(CPPParser.ForEachContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#switchBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlock(CPPParser.SwitchBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#switchBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBody(CPPParser.SwitchBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#switchInstruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchInstruction(CPPParser.SwitchInstructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(CPPParser.PrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#controlStructureBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControlStructureBody(CPPParser.ControlStructureBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(CPPParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#properAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperAssignment(CPPParser.ProperAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(CPPParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#expression2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression2(CPPParser.Expression2Context ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#curlyBrackets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCurlyBrackets(CPPParser.CurlyBracketsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#callSomething}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallSomething(CPPParser.CallSomethingContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#callFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallFunction(CPPParser.CallFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#functionArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionArguments(CPPParser.FunctionArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(CPPParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#accessOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessOp(CPPParser.AccessOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#accessBrackets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessBrackets(CPPParser.AccessBracketsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#binOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinOp(CPPParser.BinOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#assignmentOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOp(CPPParser.AssignmentOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#unOp1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnOp1(CPPParser.UnOp1Context ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#unOp2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnOp2(CPPParser.UnOp2Context ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#increaseOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncreaseOp(CPPParser.IncreaseOpContext ctx);
}