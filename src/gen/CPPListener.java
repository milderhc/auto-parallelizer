// Generated from /home/milderhc/Documents/lenguajes/ta/antlr/AutoParallelizer/grammar/CPP.g4 by ANTLR 4.6
package gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CPPParser}.
 */
public interface CPPListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CPPParser#cpp}.
	 * @param ctx the parse tree
	 */
	void enterCpp(CPPParser.CppContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#cpp}.
	 * @param ctx the parse tree
	 */
	void exitCpp(CPPParser.CppContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#mainBlock}.
	 * @param ctx the parse tree
	 */
	void enterMainBlock(CPPParser.MainBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#mainBlock}.
	 * @param ctx the parse tree
	 */
	void exitMainBlock(CPPParser.MainBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#global}.
	 * @param ctx the parse tree
	 */
	void enterGlobal(CPPParser.GlobalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#global}.
	 * @param ctx the parse tree
	 */
	void exitGlobal(CPPParser.GlobalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#namespace}.
	 * @param ctx the parse tree
	 */
	void enterNamespace(CPPParser.NamespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#namespace}.
	 * @param ctx the parse tree
	 */
	void exitNamespace(CPPParser.NamespaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#using}.
	 * @param ctx the parse tree
	 */
	void enterUsing(CPPParser.UsingContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#using}.
	 * @param ctx the parse tree
	 */
	void exitUsing(CPPParser.UsingContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#nestedNamespace}.
	 * @param ctx the parse tree
	 */
	void enterNestedNamespace(CPPParser.NestedNamespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#nestedNamespace}.
	 * @param ctx the parse tree
	 */
	void exitNestedNamespace(CPPParser.NestedNamespaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(CPPParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(CPPParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#path}.
	 * @param ctx the parse tree
	 */
	void enterPath(CPPParser.PathContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#path}.
	 * @param ctx the parse tree
	 */
	void exitPath(CPPParser.PathContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#typedef}.
	 * @param ctx the parse tree
	 */
	void enterTypedef(CPPParser.TypedefContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#typedef}.
	 * @param ctx the parse tree
	 */
	void exitTypedef(CPPParser.TypedefContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#datatype}.
	 * @param ctx the parse tree
	 */
	void enterDatatype(CPPParser.DatatypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#datatype}.
	 * @param ctx the parse tree
	 */
	void exitDatatype(CPPParser.DatatypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#datatypeDefinition}.
	 * @param ctx the parse tree
	 */
	void enterDatatypeDefinition(CPPParser.DatatypeDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#datatypeDefinition}.
	 * @param ctx the parse tree
	 */
	void exitDatatypeDefinition(CPPParser.DatatypeDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#template}.
	 * @param ctx the parse tree
	 */
	void enterTemplate(CPPParser.TemplateContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#template}.
	 * @param ctx the parse tree
	 */
	void exitTemplate(CPPParser.TemplateContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(CPPParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(CPPParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#functionRem}.
	 * @param ctx the parse tree
	 */
	void enterFunctionRem(CPPParser.FunctionRemContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#functionRem}.
	 * @param ctx the parse tree
	 */
	void exitFunctionRem(CPPParser.FunctionRemContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(CPPParser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(CPPParser.FunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(CPPParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(CPPParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#structClass}.
	 * @param ctx the parse tree
	 */
	void enterStructClass(CPPParser.StructClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#structClass}.
	 * @param ctx the parse tree
	 */
	void exitStructClass(CPPParser.StructClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#inheritance}.
	 * @param ctx the parse tree
	 */
	void enterInheritance(CPPParser.InheritanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#inheritance}.
	 * @param ctx the parse tree
	 */
	void exitInheritance(CPPParser.InheritanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#encapsulation}.
	 * @param ctx the parse tree
	 */
	void enterEncapsulation(CPPParser.EncapsulationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#encapsulation}.
	 * @param ctx the parse tree
	 */
	void exitEncapsulation(CPPParser.EncapsulationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#structClassBody}.
	 * @param ctx the parse tree
	 */
	void enterStructClassBody(CPPParser.StructClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#structClassBody}.
	 * @param ctx the parse tree
	 */
	void exitStructClassBody(CPPParser.StructClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#globalClass}.
	 * @param ctx the parse tree
	 */
	void enterGlobalClass(CPPParser.GlobalClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#globalClass}.
	 * @param ctx the parse tree
	 */
	void exitGlobalClass(CPPParser.GlobalClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#classConstructor}.
	 * @param ctx the parse tree
	 */
	void enterClassConstructor(CPPParser.ClassConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#classConstructor}.
	 * @param ctx the parse tree
	 */
	void exitClassConstructor(CPPParser.ClassConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(CPPParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(CPPParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#integerType}.
	 * @param ctx the parse tree
	 */
	void enterIntegerType(CPPParser.IntegerTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#integerType}.
	 * @param ctx the parse tree
	 */
	void exitIntegerType(CPPParser.IntegerTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#floatType}.
	 * @param ctx the parse tree
	 */
	void enterFloatType(CPPParser.FloatTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#floatType}.
	 * @param ctx the parse tree
	 */
	void exitFloatType(CPPParser.FloatTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#boolType}.
	 * @param ctx the parse tree
	 */
	void enterBoolType(CPPParser.BoolTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#boolType}.
	 * @param ctx the parse tree
	 */
	void exitBoolType(CPPParser.BoolTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(CPPParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(CPPParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#scope}.
	 * @param ctx the parse tree
	 */
	void enterScope(CPPParser.ScopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#scope}.
	 * @param ctx the parse tree
	 */
	void exitScope(CPPParser.ScopeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#declarationBlock}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationBlock(CPPParser.DeclarationBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#declarationBlock}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationBlock(CPPParser.DeclarationBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(CPPParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(CPPParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#properDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterProperDeclaration(CPPParser.ProperDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#properDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitProperDeclaration(CPPParser.ProperDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#declarationType}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationType(CPPParser.DeclarationTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#declarationType}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationType(CPPParser.DeclarationTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#assignmentBlock}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentBlock(CPPParser.AssignmentBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#assignmentBlock}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentBlock(CPPParser.AssignmentBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void enterIfBlock(CPPParser.IfBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void exitIfBlock(CPPParser.IfBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#whileBlock}.
	 * @param ctx the parse tree
	 */
	void enterWhileBlock(CPPParser.WhileBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#whileBlock}.
	 * @param ctx the parse tree
	 */
	void exitWhileBlock(CPPParser.WhileBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#doWhileBlock}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileBlock(CPPParser.DoWhileBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#doWhileBlock}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileBlock(CPPParser.DoWhileBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#doWhileBody}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileBody(CPPParser.DoWhileBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#doWhileBody}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileBody(CPPParser.DoWhileBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#forBlock}.
	 * @param ctx the parse tree
	 */
	void enterForBlock(CPPParser.ForBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#forBlock}.
	 * @param ctx the parse tree
	 */
	void exitForBlock(CPPParser.ForBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#forExpression}.
	 * @param ctx the parse tree
	 */
	void enterForExpression(CPPParser.ForExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#forExpression}.
	 * @param ctx the parse tree
	 */
	void exitForExpression(CPPParser.ForExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#classicFor}.
	 * @param ctx the parse tree
	 */
	void enterClassicFor(CPPParser.ClassicForContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#classicFor}.
	 * @param ctx the parse tree
	 */
	void exitClassicFor(CPPParser.ClassicForContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#forEach}.
	 * @param ctx the parse tree
	 */
	void enterForEach(CPPParser.ForEachContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#forEach}.
	 * @param ctx the parse tree
	 */
	void exitForEach(CPPParser.ForEachContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#switchBlock}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlock(CPPParser.SwitchBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#switchBlock}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlock(CPPParser.SwitchBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#switchBody}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBody(CPPParser.SwitchBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#switchBody}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBody(CPPParser.SwitchBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#switchInstruction}.
	 * @param ctx the parse tree
	 */
	void enterSwitchInstruction(CPPParser.SwitchInstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#switchInstruction}.
	 * @param ctx the parse tree
	 */
	void exitSwitchInstruction(CPPParser.SwitchInstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(CPPParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(CPPParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#controlStructureBody}.
	 * @param ctx the parse tree
	 */
	void enterControlStructureBody(CPPParser.ControlStructureBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#controlStructureBody}.
	 * @param ctx the parse tree
	 */
	void exitControlStructureBody(CPPParser.ControlStructureBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(CPPParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(CPPParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#properAssignment}.
	 * @param ctx the parse tree
	 */
	void enterProperAssignment(CPPParser.ProperAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#properAssignment}.
	 * @param ctx the parse tree
	 */
	void exitProperAssignment(CPPParser.ProperAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(CPPParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(CPPParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#expression2}.
	 * @param ctx the parse tree
	 */
	void enterExpression2(CPPParser.Expression2Context ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#expression2}.
	 * @param ctx the parse tree
	 */
	void exitExpression2(CPPParser.Expression2Context ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#curlyBrackets}.
	 * @param ctx the parse tree
	 */
	void enterCurlyBrackets(CPPParser.CurlyBracketsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#curlyBrackets}.
	 * @param ctx the parse tree
	 */
	void exitCurlyBrackets(CPPParser.CurlyBracketsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#callSomething}.
	 * @param ctx the parse tree
	 */
	void enterCallSomething(CPPParser.CallSomethingContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#callSomething}.
	 * @param ctx the parse tree
	 */
	void exitCallSomething(CPPParser.CallSomethingContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#callFunction}.
	 * @param ctx the parse tree
	 */
	void enterCallFunction(CPPParser.CallFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#callFunction}.
	 * @param ctx the parse tree
	 */
	void exitCallFunction(CPPParser.CallFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#functionArguments}.
	 * @param ctx the parse tree
	 */
	void enterFunctionArguments(CPPParser.FunctionArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#functionArguments}.
	 * @param ctx the parse tree
	 */
	void exitFunctionArguments(CPPParser.FunctionArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(CPPParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(CPPParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#accessOp}.
	 * @param ctx the parse tree
	 */
	void enterAccessOp(CPPParser.AccessOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#accessOp}.
	 * @param ctx the parse tree
	 */
	void exitAccessOp(CPPParser.AccessOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#accessBrackets}.
	 * @param ctx the parse tree
	 */
	void enterAccessBrackets(CPPParser.AccessBracketsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#accessBrackets}.
	 * @param ctx the parse tree
	 */
	void exitAccessBrackets(CPPParser.AccessBracketsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#binOp}.
	 * @param ctx the parse tree
	 */
	void enterBinOp(CPPParser.BinOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#binOp}.
	 * @param ctx the parse tree
	 */
	void exitBinOp(CPPParser.BinOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#assignmentOp}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOp(CPPParser.AssignmentOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#assignmentOp}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOp(CPPParser.AssignmentOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#unOp1}.
	 * @param ctx the parse tree
	 */
	void enterUnOp1(CPPParser.UnOp1Context ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#unOp1}.
	 * @param ctx the parse tree
	 */
	void exitUnOp1(CPPParser.UnOp1Context ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#unOp2}.
	 * @param ctx the parse tree
	 */
	void enterUnOp2(CPPParser.UnOp2Context ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#unOp2}.
	 * @param ctx the parse tree
	 */
	void exitUnOp2(CPPParser.UnOp2Context ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#increaseOp}.
	 * @param ctx the parse tree
	 */
	void enterIncreaseOp(CPPParser.IncreaseOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#increaseOp}.
	 * @param ctx the parse tree
	 */
	void exitIncreaseOp(CPPParser.IncreaseOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(CPPParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(CPPParser.MainContext ctx);
}