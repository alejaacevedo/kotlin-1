package org.jetbrains.kotlin.j2k.tree.visitors

import org.jetbrains.kotlin.j2k.tree.*

interface JKTransformerVoid : JKTransformer<Nothing?> {
    fun visitElement(element: JKElement): JKElement 
    override fun visitElement(element: JKElement, data: Nothing?): JKElement = visitElement(element)
    fun visitClass(klass: JKClass): JKClass = visitDeclaration(klass) as JKClass
    override fun visitClass(klass: JKClass, data: Nothing?): JKClass = visitClass(klass)
    fun visitStatement(statement: JKStatement): JKStatement = visitElement(statement) as JKStatement
    override fun visitStatement(statement: JKStatement, data: Nothing?): JKStatement = visitStatement(statement)
    fun visitExpression(expression: JKExpression): JKExpression = visitStatement(expression) as JKExpression
    override fun visitExpression(expression: JKExpression, data: Nothing?): JKExpression = visitExpression(expression)
    fun visitBinaryExpression(binaryExpression: JKBinaryExpression): JKBinaryExpression = visitExpression(binaryExpression) as JKBinaryExpression
    override fun visitBinaryExpression(binaryExpression: JKBinaryExpression, data: Nothing?): JKBinaryExpression = visitBinaryExpression(binaryExpression)
    fun visitUnaryExpression(unaryExpression: JKUnaryExpression): JKUnaryExpression = visitExpression(unaryExpression) as JKUnaryExpression
    override fun visitUnaryExpression(unaryExpression: JKUnaryExpression, data: Nothing?): JKUnaryExpression = visitUnaryExpression(unaryExpression)
    fun visitPrefixExpression(prefixExpression: JKPrefixExpression): JKPrefixExpression = visitUnaryExpression(prefixExpression) as JKPrefixExpression
    override fun visitPrefixExpression(prefixExpression: JKPrefixExpression, data: Nothing?): JKPrefixExpression = visitPrefixExpression(prefixExpression)
    fun visitPostfixExpression(postfixExpression: JKPostfixExpression): JKPostfixExpression = visitUnaryExpression(postfixExpression) as JKPostfixExpression
    override fun visitPostfixExpression(postfixExpression: JKPostfixExpression, data: Nothing?): JKPostfixExpression = visitPostfixExpression(postfixExpression)
    fun visitQualifiedExpression(qualifiedExpression: JKQualifiedExpression): JKQualifiedExpression = visitExpression(qualifiedExpression) as JKQualifiedExpression
    override fun visitQualifiedExpression(qualifiedExpression: JKQualifiedExpression, data: Nothing?): JKQualifiedExpression = visitQualifiedExpression(qualifiedExpression)
    fun visitMethodCallExpression(methodCallExpression: JKMethodCallExpression): JKMethodCallExpression = visitExpression(methodCallExpression) as JKMethodCallExpression
    override fun visitMethodCallExpression(methodCallExpression: JKMethodCallExpression, data: Nothing?): JKMethodCallExpression = visitMethodCallExpression(methodCallExpression)
    fun visitFieldAccessExpression(fieldAccessExpression: JKFieldAccessExpression): JKFieldAccessExpression = visitExpression(fieldAccessExpression) as JKFieldAccessExpression
    override fun visitFieldAccessExpression(fieldAccessExpression: JKFieldAccessExpression, data: Nothing?): JKFieldAccessExpression = visitFieldAccessExpression(fieldAccessExpression)
    fun visitArrayAccessExpression(arrayAccessExpression: JKArrayAccessExpression): JKArrayAccessExpression = visitExpression(arrayAccessExpression) as JKArrayAccessExpression
    override fun visitArrayAccessExpression(arrayAccessExpression: JKArrayAccessExpression, data: Nothing?): JKArrayAccessExpression = visitArrayAccessExpression(arrayAccessExpression)
    fun visitParenthesizedExpression(parenthesizedExpression: JKParenthesizedExpression): JKParenthesizedExpression = visitExpression(parenthesizedExpression) as JKParenthesizedExpression
    override fun visitParenthesizedExpression(parenthesizedExpression: JKParenthesizedExpression, data: Nothing?): JKParenthesizedExpression = visitParenthesizedExpression(parenthesizedExpression)
    fun visitTypeCastExpression(typeCastExpression: JKTypeCastExpression): JKTypeCastExpression = visitExpression(typeCastExpression) as JKTypeCastExpression
    override fun visitTypeCastExpression(typeCastExpression: JKTypeCastExpression, data: Nothing?): JKTypeCastExpression = visitTypeCastExpression(typeCastExpression)
    fun visitExpressionList(expressionList: JKExpressionList): JKExpressionList = visitElement(expressionList) as JKExpressionList
    override fun visitExpressionList(expressionList: JKExpressionList, data: Nothing?): JKExpressionList = visitExpressionList(expressionList)
    fun visitReference(reference: JKReference): JKReference = visitElement(reference) as JKReference
    override fun visitReference(reference: JKReference, data: Nothing?): JKReference = visitReference(reference)
    fun visitMethodReference(methodReference: JKMethodReference): JKMethodReference = visitReference(methodReference) as JKMethodReference
    override fun visitMethodReference(methodReference: JKMethodReference, data: Nothing?): JKMethodReference = visitMethodReference(methodReference)
    fun visitFieldReference(fieldReference: JKFieldReference): JKFieldReference = visitReference(fieldReference) as JKFieldReference
    override fun visitFieldReference(fieldReference: JKFieldReference, data: Nothing?): JKFieldReference = visitFieldReference(fieldReference)
    fun visitClassReference(classReference: JKClassReference): JKClassReference = visitReference(classReference) as JKClassReference
    override fun visitClassReference(classReference: JKClassReference, data: Nothing?): JKClassReference = visitClassReference(classReference)
    fun visitType(type: JKType): JKType = visitElement(type) as JKType
    override fun visitType(type: JKType, data: Nothing?): JKType = visitType(type)
    fun visitClassType(classType: JKClassType): JKClassType = visitType(classType) as JKClassType
    override fun visitClassType(classType: JKClassType, data: Nothing?): JKClassType = visitClassType(classType)
    fun visitOperatorIdentifier(operatorIdentifier: JKOperatorIdentifier): JKOperatorIdentifier = visitIdentifier(operatorIdentifier) as JKOperatorIdentifier
    override fun visitOperatorIdentifier(operatorIdentifier: JKOperatorIdentifier, data: Nothing?): JKOperatorIdentifier = visitOperatorIdentifier(operatorIdentifier)
    fun visitQualificationIdentifier(qualificationIdentifier: JKQualificationIdentifier): JKQualificationIdentifier = visitIdentifier(qualificationIdentifier) as JKQualificationIdentifier
    override fun visitQualificationIdentifier(qualificationIdentifier: JKQualificationIdentifier, data: Nothing?): JKQualificationIdentifier = visitQualificationIdentifier(qualificationIdentifier)
    fun visitLoop(loop: JKLoop): JKLoop = visitStatement(loop) as JKLoop
    override fun visitLoop(loop: JKLoop, data: Nothing?): JKLoop = visitLoop(loop)
    fun visitDeclaration(declaration: JKDeclaration): JKDeclaration = visitElement(declaration) as JKDeclaration
    override fun visitDeclaration(declaration: JKDeclaration, data: Nothing?): JKDeclaration = visitDeclaration(declaration)
    fun visitBlock(block: JKBlock): JKBlock = visitElement(block) as JKBlock
    override fun visitBlock(block: JKBlock, data: Nothing?): JKBlock = visitBlock(block)
    fun visitIdentifier(identifier: JKIdentifier): JKIdentifier = visitElement(identifier) as JKIdentifier
    override fun visitIdentifier(identifier: JKIdentifier, data: Nothing?): JKIdentifier = visitIdentifier(identifier)
    fun visitNameIdentifier(nameIdentifier: JKNameIdentifier): JKNameIdentifier = visitIdentifier(nameIdentifier) as JKNameIdentifier
    override fun visitNameIdentifier(nameIdentifier: JKNameIdentifier, data: Nothing?): JKNameIdentifier = visitNameIdentifier(nameIdentifier)
    fun visitLiteralExpression(literalExpression: JKLiteralExpression): JKLiteralExpression = visitExpression(literalExpression) as JKLiteralExpression
    override fun visitLiteralExpression(literalExpression: JKLiteralExpression, data: Nothing?): JKLiteralExpression = visitLiteralExpression(literalExpression)
    fun visitModifierList(modifierList: JKModifierList): JKModifierList = visitElement(modifierList) as JKModifierList
    override fun visitModifierList(modifierList: JKModifierList, data: Nothing?): JKModifierList = visitModifierList(modifierList)
    fun visitModifier(modifier: JKModifier): JKModifier = visitElement(modifier) as JKModifier
    override fun visitModifier(modifier: JKModifier, data: Nothing?): JKModifier = visitModifier(modifier)
    fun visitAccessModifier(accessModifier: JKAccessModifier): JKAccessModifier = visitModifier(accessModifier) as JKAccessModifier
    override fun visitAccessModifier(accessModifier: JKAccessModifier, data: Nothing?): JKAccessModifier = visitAccessModifier(accessModifier)
    fun visitValueArgument(valueArgument: JKValueArgument): JKValueArgument = visitElement(valueArgument) as JKValueArgument
    override fun visitValueArgument(valueArgument: JKValueArgument, data: Nothing?): JKValueArgument = visitValueArgument(valueArgument)
    fun visitStringLiteralExpression(stringLiteralExpression: JKStringLiteralExpression): JKStringLiteralExpression = visitLiteralExpression(stringLiteralExpression) as JKStringLiteralExpression
    override fun visitStringLiteralExpression(stringLiteralExpression: JKStringLiteralExpression, data: Nothing?): JKStringLiteralExpression = visitStringLiteralExpression(stringLiteralExpression)
    fun visitModalityModifier(modalityModifier: JKModalityModifier): JKModalityModifier = visitModifier(modalityModifier) as JKModalityModifier
    override fun visitModalityModifier(modalityModifier: JKModalityModifier, data: Nothing?): JKModalityModifier = visitModalityModifier(modalityModifier)
    fun visitMethod(method: JKMethod): JKMethod = visitDeclaration(method) as JKMethod
    override fun visitMethod(method: JKMethod, data: Nothing?): JKMethod = visitMethod(method)
    fun visitExpressionStatement(expressionStatement: JKExpressionStatement): JKExpressionStatement = visitStatement(expressionStatement) as JKExpressionStatement
    override fun visitExpressionStatement(expressionStatement: JKExpressionStatement, data: Nothing?): JKExpressionStatement = visitExpressionStatement(expressionStatement)
    fun visitJavaField(javaField: JKJavaField): JKDeclaration = visitDeclaration(javaField) 
    override fun visitJavaField(javaField: JKJavaField, data: Nothing?): JKDeclaration = visitJavaField(javaField)
    fun visitJavaMethod(javaMethod: JKJavaMethod): JKMethod = visitMethod(javaMethod) 
    override fun visitJavaMethod(javaMethod: JKJavaMethod, data: Nothing?): JKMethod = visitJavaMethod(javaMethod)
    fun visitJavaForLoop(javaForLoop: JKJavaForLoop): JKLoop = visitLoop(javaForLoop) 
    override fun visitJavaForLoop(javaForLoop: JKJavaForLoop, data: Nothing?): JKLoop = visitJavaForLoop(javaForLoop)
    fun visitJavaAssignmentExpression(javaAssignmentExpression: JKJavaAssignmentExpression): JKExpression = visitExpression(javaAssignmentExpression) 
    override fun visitJavaAssignmentExpression(javaAssignmentExpression: JKJavaAssignmentExpression, data: Nothing?): JKExpression = visitJavaAssignmentExpression(javaAssignmentExpression)
    fun visitJavaPrimitiveType(javaPrimitiveType: JKJavaPrimitiveType): JKType = visitType(javaPrimitiveType) 
    override fun visitJavaPrimitiveType(javaPrimitiveType: JKJavaPrimitiveType, data: Nothing?): JKType = visitJavaPrimitiveType(javaPrimitiveType)
    fun visitJavaArrayType(javaArrayType: JKJavaArrayType): JKType = visitType(javaArrayType) 
    override fun visitJavaArrayType(javaArrayType: JKJavaArrayType, data: Nothing?): JKType = visitJavaArrayType(javaArrayType)
    fun visitJavaStringLiteralExpression(javaStringLiteralExpression: JKJavaStringLiteralExpression): JKLiteralExpression = visitLiteralExpression(javaStringLiteralExpression) 
    override fun visitJavaStringLiteralExpression(javaStringLiteralExpression: JKJavaStringLiteralExpression, data: Nothing?): JKLiteralExpression = visitJavaStringLiteralExpression(javaStringLiteralExpression)
    fun visitJavaOperatorIdentifier(javaOperatorIdentifier: JKJavaOperatorIdentifier): JKOperatorIdentifier = visitOperatorIdentifier(javaOperatorIdentifier) 
    override fun visitJavaOperatorIdentifier(javaOperatorIdentifier: JKJavaOperatorIdentifier, data: Nothing?): JKOperatorIdentifier = visitJavaOperatorIdentifier(javaOperatorIdentifier)
    fun visitJavaQualificationIdentifier(javaQualificationIdentifier: JKJavaQualificationIdentifier): JKQualificationIdentifier = visitQualificationIdentifier(javaQualificationIdentifier) 
    override fun visitJavaQualificationIdentifier(javaQualificationIdentifier: JKJavaQualificationIdentifier, data: Nothing?): JKQualificationIdentifier = visitJavaQualificationIdentifier(javaQualificationIdentifier)
    fun visitJavaMethodCallExpression(javaMethodCallExpression: JKJavaMethodCallExpression): JKMethodCallExpression = visitMethodCallExpression(javaMethodCallExpression) 
    override fun visitJavaMethodCallExpression(javaMethodCallExpression: JKJavaMethodCallExpression, data: Nothing?): JKMethodCallExpression = visitJavaMethodCallExpression(javaMethodCallExpression)
    fun visitJavaFieldAccessExpression(javaFieldAccessExpression: JKJavaFieldAccessExpression): JKFieldAccessExpression = visitFieldAccessExpression(javaFieldAccessExpression) 
    override fun visitJavaFieldAccessExpression(javaFieldAccessExpression: JKJavaFieldAccessExpression, data: Nothing?): JKFieldAccessExpression = visitJavaFieldAccessExpression(javaFieldAccessExpression)
    fun visitJavaNewExpression(javaNewExpression: JKJavaNewExpression): JKExpression = visitExpression(javaNewExpression) 
    override fun visitJavaNewExpression(javaNewExpression: JKJavaNewExpression, data: Nothing?): JKExpression = visitJavaNewExpression(javaNewExpression)
    fun visitJavaMethodReference(javaMethodReference: JKJavaMethodReference): JKMethodReference = visitMethodReference(javaMethodReference) 
    override fun visitJavaMethodReference(javaMethodReference: JKJavaMethodReference, data: Nothing?): JKMethodReference = visitJavaMethodReference(javaMethodReference)
    fun visitJavaFieldReference(javaFieldReference: JKJavaFieldReference): JKFieldReference = visitFieldReference(javaFieldReference) 
    override fun visitJavaFieldReference(javaFieldReference: JKJavaFieldReference, data: Nothing?): JKFieldReference = visitJavaFieldReference(javaFieldReference)
    fun visitJavaClassReference(javaClassReference: JKJavaClassReference): JKClassReference = visitClassReference(javaClassReference) 
    override fun visitJavaClassReference(javaClassReference: JKJavaClassReference, data: Nothing?): JKClassReference = visitJavaClassReference(javaClassReference)
    fun visitJavaAccessModifier(javaAccessModifier: JKJavaAccessModifier): JKAccessModifier = visitAccessModifier(javaAccessModifier) 
    override fun visitJavaAccessModifier(javaAccessModifier: JKJavaAccessModifier, data: Nothing?): JKAccessModifier = visitJavaAccessModifier(javaAccessModifier)
    fun visitJavaModifier(javaModifier: JKJavaModifier): JKModifier = visitModifier(javaModifier) 
    override fun visitJavaModifier(javaModifier: JKJavaModifier, data: Nothing?): JKModifier = visitJavaModifier(javaModifier)
    fun visitJavaNewEmptyArray(javaNewEmptyArray: JKJavaNewEmptyArray): JKExpression = visitExpression(javaNewEmptyArray) 
    override fun visitJavaNewEmptyArray(javaNewEmptyArray: JKJavaNewEmptyArray, data: Nothing?): JKExpression = visitJavaNewEmptyArray(javaNewEmptyArray)
    fun visitJavaNewArray(javaNewArray: JKJavaNewArray): JKExpression = visitExpression(javaNewArray) 
    override fun visitJavaNewArray(javaNewArray: JKJavaNewArray, data: Nothing?): JKExpression = visitJavaNewArray(javaNewArray)
    fun visitKtFun(ktFun: JKKtFun): JKDeclaration = visitDeclaration(ktFun) 
    override fun visitKtFun(ktFun: JKKtFun, data: Nothing?): JKDeclaration = visitKtFun(ktFun)
    fun visitKtConstructor(ktConstructor: JKKtConstructor): JKDeclaration = visitDeclaration(ktConstructor) 
    override fun visitKtConstructor(ktConstructor: JKKtConstructor, data: Nothing?): JKDeclaration = visitKtConstructor(ktConstructor)
    fun visitKtPrimaryConstructor(ktPrimaryConstructor: JKKtPrimaryConstructor): JKDeclaration = visitKtConstructor(ktPrimaryConstructor) 
    override fun visitKtPrimaryConstructor(ktPrimaryConstructor: JKKtPrimaryConstructor, data: Nothing?): JKDeclaration = visitKtPrimaryConstructor(ktPrimaryConstructor)
    fun visitKtAssignmentStatement(ktAssignmentStatement: JKKtAssignmentStatement): JKStatement = visitStatement(ktAssignmentStatement) 
    override fun visitKtAssignmentStatement(ktAssignmentStatement: JKKtAssignmentStatement, data: Nothing?): JKStatement = visitKtAssignmentStatement(ktAssignmentStatement)
    fun visitKtCall(ktCall: JKKtCall): JKMethodCallExpression = visitMethodCallExpression(ktCall) 
    override fun visitKtCall(ktCall: JKKtCall, data: Nothing?): JKMethodCallExpression = visitKtCall(ktCall)
    fun visitKtProperty(ktProperty: JKKtProperty): JKDeclaration = visitDeclaration(ktProperty) 
    override fun visitKtProperty(ktProperty: JKKtProperty, data: Nothing?): JKDeclaration = visitKtProperty(ktProperty)
}
