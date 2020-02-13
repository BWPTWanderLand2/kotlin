/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.kapt3.test;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("plugins/kapt3/kapt3-compiler/testData/converter")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class IrClassFileToSourceStubConverterTestGenerated extends AbstractIrClassFileToSourceStubConverterTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, TargetBackend.JVM_IR, testDataFilePath);
    }

    @TestMetadata("abstractEnum.kt")
    public void testAbstractEnum() throws Exception {
        runTest("plugins/kapt3/kapt3-compiler/testData/converter/abstractEnum.kt");
    }

    @TestMetadata("abstractMethods.kt")
    public void testAbstractMethods() throws Exception {
        runTest("plugins/kapt3/kapt3-compiler/testData/converter/abstractMethods.kt");
    }

    @TestMetadata("aliasedImports.kt")
    public void testAliasedImports() throws Exception {
        runTest("plugins/kapt3/kapt3-compiler/testData/converter/aliasedImports.kt");
    }

    public void testAllFilesPresentInConverter() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("plugins/kapt3/kapt3-compiler/testData/converter"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
    }

    @TestMetadata("annotationWithFqNames.kt")
    public void testAnnotationWithFqNames() throws Exception {
        runTest("plugins/kapt3/kapt3-compiler/testData/converter/annotationWithFqNames.kt");
    }

    @TestMetadata("annotations.kt")
    public void testAnnotations() throws Exception {
        runTest("plugins/kapt3/kapt3-compiler/testData/converter/annotations.kt");
    }

    @TestMetadata("annotations2.kt")
    public void testAnnotations2() throws Exception {
        runTest("plugins/kapt3/kapt3-compiler/testData/converter/annotations2.kt");
    }

    @TestMetadata("annotations3.kt")
    public void testAnnotations3() throws Exception {
        runTest("plugins/kapt3/kapt3-compiler/testData/converter/annotations3.kt");
    }

    @TestMetadata("annotationsWithTargets.kt")
    public void testAnnotationsWithTargets() throws Exception {
        runTest("plugins/kapt3/kapt3-compiler/testData/converter/annotationsWithTargets.kt");
    }

    @TestMetadata("comments.kt")
    public void testComments() throws Exception {
        runTest("plugins/kapt3/kapt3-compiler/testData/converter/comments.kt");
    }

    @TestMetadata("cyrillicClassName.kt")
    public void testCyrillicClassName() throws Exception {
        runTest("plugins/kapt3/kapt3-compiler/testData/converter/cyrillicClassName.kt");
    }

    @TestMetadata("dataClass.kt")
    public void testDataClass() throws Exception {
        runTest("plugins/kapt3/kapt3-compiler/testData/converter/dataClass.kt");
    }

    @TestMetadata("defaultImpls.kt")
    public void testDefaultImpls() throws Exception {
        runTest("plugins/kapt3/kapt3-compiler/testData/converter/defaultImpls.kt");
    }

    @TestMetadata("defaultParameterValueOff.kt")
    public void testDefaultParameterValueOff() throws Exception {
        runTest("plugins/kapt3/kapt3-compiler/testData/converter/defaultParameterValueOff.kt");
    }

    @TestMetadata("defaultParameterValueOn.kt")
    public void testDefaultParameterValueOn() throws Exception {
        runTest("plugins/kapt3/kapt3-compiler/testData/converter/defaultParameterValueOn.kt");
    }

    @TestMetadata("deprecated.kt")
    public void testDeprecated() throws Exception {
        runTest("plugins/kapt3/kapt3-compiler/testData/converter/deprecated.kt");
    }

    @TestMetadata("enumImports.kt")
    public void testEnumImports() throws Exception {
        runTest("plugins/kapt3/kapt3-compiler/testData/converter/enumImports.kt");
    }

    @TestMetadata("enums.kt")
    public void testEnums() throws Exception {
        runTest("plugins/kapt3/kapt3-compiler/testData/converter/enums.kt");
    }

    @TestMetadata("errorLocationMapping.kt")
    public void testErrorLocationMapping() throws Exception {
        runTest("plugins/kapt3/kapt3-compiler/testData/converter/errorLocationMapping.kt");
    }

    @TestMetadata("errorSuperclass.kt")
    public void testErrorSuperclass() throws Exception {
        runTest("plugins/kapt3/kapt3-compiler/testData/converter/errorSuperclass.kt");
    }

    @TestMetadata("errorSuperclassCorrectErrorTypes.kt")
    public void testErrorSuperclassCorrectErrorTypes() throws Exception {
        runTest("plugins/kapt3/kapt3-compiler/testData/converter/errorSuperclassCorrectErrorTypes.kt");
    }

    @TestMetadata("fileFacadeJvmName.kt")
    public void testFileFacadeJvmName() throws Exception {
        runTest("plugins/kapt3/kapt3-compiler/testData/converter/fileFacadeJvmName.kt");
    }

    @TestMetadata("functions.kt")
    public void testFunctions() throws Exception {
        runTest("plugins/kapt3/kapt3-compiler/testData/converter/functions.kt");
    }

    @TestMetadata("genericParameters.kt")
    public void testGenericParameters() throws Exception {
        runTest("plugins/kapt3/kapt3-compiler/testData/converter/genericParameters.kt");
    }

    @TestMetadata("genericRawSignatures.kt")
    public void testGenericRawSignatures() throws Exception {
        runTest("plugins/kapt3/kapt3-compiler/testData/converter/genericRawSignatures.kt");
    }

    @TestMetadata("genericSimple.kt")
    public void testGenericSimple() throws Exception {
        runTest("plugins/kapt3/kapt3-compiler/testData/converter/genericSimple.kt");
    }

    @TestMetadata("ignoredMembers.kt")
    public void testIgnoredMembers() throws Exception {
        runTest("plugins/kapt3/kapt3-compiler/testData/converter/ignoredMembers.kt");
    }

    @TestMetadata("implicitReturnTypes.kt")
    public void testImplicitReturnTypes() throws Exception {
        runTest("plugins/kapt3/kapt3-compiler/testData/converter/implicitReturnTypes.kt");
    }

    @TestMetadata("importsForErrorTypes.kt")
    public void testImportsForErrorTypes() throws Exception {
        runTest("plugins/kapt3/kapt3-compiler/testData/converter/importsForErrorTypes.kt");
    }

    @TestMetadata("importsKt22083.kt")
    public void testImportsKt22083() throws Exception {
        runTest("plugins/kapt3/kapt3-compiler/testData/converter/importsKt22083.kt");
    }

    @TestMetadata("inheritanceSimple.kt")
    public void testInheritanceSimple() throws Exception {
        runTest("plugins/kapt3/kapt3-compiler/testData/converter/inheritanceSimple.kt");
    }

    @TestMetadata("inlineClasses.kt")
    public void testInlineClasses() throws Exception {
        runTest("plugins/kapt3/kapt3-compiler/testData/converter/inlineClasses.kt");
    }

    @TestMetadata("innerClassesWithTypeParameters.kt")
    public void testInnerClassesWithTypeParameters() throws Exception {
        runTest("plugins/kapt3/kapt3-compiler/testData/converter/innerClassesWithTypeParameters.kt");
    }

    @TestMetadata("interfaceImplementation.kt")
    public void testInterfaceImplementation() throws Exception {
        runTest("plugins/kapt3/kapt3-compiler/testData/converter/interfaceImplementation.kt");
    }

    @TestMetadata("invalidFieldName.kt")
    public void testInvalidFieldName() throws Exception {
        runTest("plugins/kapt3/kapt3-compiler/testData/converter/invalidFieldName.kt");
    }

    @TestMetadata("javaKeywords.kt")
    public void testJavaKeywords() throws Exception {
        runTest("plugins/kapt3/kapt3-compiler/testData/converter/javaKeywords.kt");
    }

    @TestMetadata("javaKeywordsInPackageNames.kt")
    public void testJavaKeywordsInPackageNames() throws Exception {
        runTest("plugins/kapt3/kapt3-compiler/testData/converter/javaKeywordsInPackageNames.kt");
    }

    @TestMetadata("javadoc.kt")
    public void testJavadoc() throws Exception {
        runTest("plugins/kapt3/kapt3-compiler/testData/converter/javadoc.kt");
    }

    @TestMetadata("jvmOverloads.kt")
    public void testJvmOverloads() throws Exception {
        runTest("plugins/kapt3/kapt3-compiler/testData/converter/jvmOverloads.kt");
    }

    @TestMetadata("jvmStatic.kt")
    public void testJvmStatic() throws Exception {
        runTest("plugins/kapt3/kapt3-compiler/testData/converter/jvmStatic.kt");
    }

    @TestMetadata("jvmStaticFieldInParent.kt")
    public void testJvmStaticFieldInParent() throws Exception {
        runTest("plugins/kapt3/kapt3-compiler/testData/converter/jvmStaticFieldInParent.kt");
    }

    @TestMetadata("kt14996.kt")
    public void testKt14996() throws Exception {
        runTest("plugins/kapt3/kapt3-compiler/testData/converter/kt14996.kt");
    }

    @TestMetadata("kt14997.kt")
    public void testKt14997() throws Exception {
        runTest("plugins/kapt3/kapt3-compiler/testData/converter/kt14997.kt");
    }

    @TestMetadata("kt14998.kt")
    public void testKt14998() throws Exception {
        runTest("plugins/kapt3/kapt3-compiler/testData/converter/kt14998.kt");
    }

    @TestMetadata("kt15145.kt")
    public void testKt15145() throws Exception {
        runTest("plugins/kapt3/kapt3-compiler/testData/converter/kt15145.kt");
    }

    @TestMetadata("kt17567.kt")
    public void testKt17567() throws Exception {
        runTest("plugins/kapt3/kapt3-compiler/testData/converter/kt17567.kt");
    }

    @TestMetadata("kt18377.kt")
    public void testKt18377() throws Exception {
        runTest("plugins/kapt3/kapt3-compiler/testData/converter/kt18377.kt");
    }

    @TestMetadata("kt18682.kt")
    public void testKt18682() throws Exception {
        runTest("plugins/kapt3/kapt3-compiler/testData/converter/kt18682.kt");
    }

    @TestMetadata("kt18791.kt")
    public void testKt18791() throws Exception {
        runTest("plugins/kapt3/kapt3-compiler/testData/converter/kt18791.kt");
    }

    @TestMetadata("kt19700.kt")
    public void testKt19700() throws Exception {
        runTest("plugins/kapt3/kapt3-compiler/testData/converter/kt19700.kt");
    }

    @TestMetadata("kt19750.kt")
    public void testKt19750() throws Exception {
        runTest("plugins/kapt3/kapt3-compiler/testData/converter/kt19750.kt");
    }

    @TestMetadata("kt24272.kt")
    public void testKt24272() throws Exception {
        runTest("plugins/kapt3/kapt3-compiler/testData/converter/kt24272.kt");
    }

    @TestMetadata("kt25071.kt")
    public void testKt25071() throws Exception {
        runTest("plugins/kapt3/kapt3-compiler/testData/converter/kt25071.kt");
    }

    @TestMetadata("kt27126.kt")
    public void testKt27126() throws Exception {
        runTest("plugins/kapt3/kapt3-compiler/testData/converter/kt27126.kt");
    }

    @TestMetadata("kt28306.kt")
    public void testKt28306() throws Exception {
        runTest("plugins/kapt3/kapt3-compiler/testData/converter/kt28306.kt");
    }

    @TestMetadata("kt34569.kt")
    public void testKt34569() throws Exception {
        runTest("plugins/kapt3/kapt3-compiler/testData/converter/kt34569.kt");
    }

    @TestMetadata("lazyProperty.kt")
    public void testLazyProperty() throws Exception {
        runTest("plugins/kapt3/kapt3-compiler/testData/converter/lazyProperty.kt");
    }

    @TestMetadata("leadingDollars.kt")
    public void testLeadingDollars() throws Exception {
        runTest("plugins/kapt3/kapt3-compiler/testData/converter/leadingDollars.kt");
    }

    @TestMetadata("leadingDollars2.kt")
    public void testLeadingDollars2() throws Exception {
        runTest("plugins/kapt3/kapt3-compiler/testData/converter/leadingDollars2.kt");
    }

    @TestMetadata("mapEntry.kt")
    public void testMapEntry() throws Exception {
        runTest("plugins/kapt3/kapt3-compiler/testData/converter/mapEntry.kt");
    }

    @TestMetadata("maxErrorCount.kt")
    public void testMaxErrorCount() throws Exception {
        runTest("plugins/kapt3/kapt3-compiler/testData/converter/maxErrorCount.kt");
    }

    @TestMetadata("methodParameterNames.kt")
    public void testMethodParameterNames() throws Exception {
        runTest("plugins/kapt3/kapt3-compiler/testData/converter/methodParameterNames.kt");
    }

    @TestMetadata("methodPropertySignatureClash.kt")
    public void testMethodPropertySignatureClash() throws Exception {
        runTest("plugins/kapt3/kapt3-compiler/testData/converter/methodPropertySignatureClash.kt");
    }

    @TestMetadata("modifiers.kt")
    public void testModifiers() throws Exception {
        runTest("plugins/kapt3/kapt3-compiler/testData/converter/modifiers.kt");
    }

    @TestMetadata("multifileClass.kt")
    public void testMultifileClass() throws Exception {
        runTest("plugins/kapt3/kapt3-compiler/testData/converter/multifileClass.kt");
    }

    @TestMetadata("nestedClasses.kt")
    public void testNestedClasses() throws Exception {
        runTest("plugins/kapt3/kapt3-compiler/testData/converter/nestedClasses.kt");
    }

    @TestMetadata("nestedClasses2.kt")
    public void testNestedClasses2() throws Exception {
        runTest("plugins/kapt3/kapt3-compiler/testData/converter/nestedClasses2.kt");
    }

    @TestMetadata("nestedClassesNonRootPackage.kt")
    public void testNestedClassesNonRootPackage() throws Exception {
        runTest("plugins/kapt3/kapt3-compiler/testData/converter/nestedClassesNonRootPackage.kt");
    }

    @TestMetadata("nonExistentClass.kt")
    public void testNonExistentClass() throws Exception {
        runTest("plugins/kapt3/kapt3-compiler/testData/converter/nonExistentClass.kt");
    }

    @TestMetadata("nonExistentClassTypesConversion.kt")
    public void testNonExistentClassTypesConversion() throws Exception {
        runTest("plugins/kapt3/kapt3-compiler/testData/converter/nonExistentClassTypesConversion.kt");
    }

    @TestMetadata("nonExistentClassWIthoutCorrection.kt")
    public void testNonExistentClassWIthoutCorrection() throws Exception {
        runTest("plugins/kapt3/kapt3-compiler/testData/converter/nonExistentClassWIthoutCorrection.kt");
    }

    @TestMetadata("primitiveTypes.kt")
    public void testPrimitiveTypes() throws Exception {
        runTest("plugins/kapt3/kapt3-compiler/testData/converter/primitiveTypes.kt");
    }

    @TestMetadata("propertyAnnotations.kt")
    public void testPropertyAnnotations() throws Exception {
        runTest("plugins/kapt3/kapt3-compiler/testData/converter/propertyAnnotations.kt");
    }

    @TestMetadata("recentlyNullable.kt")
    public void testRecentlyNullable() throws Exception {
        runTest("plugins/kapt3/kapt3-compiler/testData/converter/recentlyNullable.kt");
    }

    @TestMetadata("repeatableAnnotations.kt")
    public void testRepeatableAnnotations() throws Exception {
        runTest("plugins/kapt3/kapt3-compiler/testData/converter/repeatableAnnotations.kt");
    }

    @TestMetadata("secondaryConstructor.kt")
    public void testSecondaryConstructor() throws Exception {
        runTest("plugins/kapt3/kapt3-compiler/testData/converter/secondaryConstructor.kt");
    }

    @TestMetadata("severalPackageParts.kt")
    public void testSeveralPackageParts() throws Exception {
        runTest("plugins/kapt3/kapt3-compiler/testData/converter/severalPackageParts.kt");
    }

    @TestMetadata("strangeIdentifiers.kt")
    public void testStrangeIdentifiers() throws Exception {
        runTest("plugins/kapt3/kapt3-compiler/testData/converter/strangeIdentifiers.kt");
    }

    @TestMetadata("strangeNames.kt")
    public void testStrangeNames() throws Exception {
        runTest("plugins/kapt3/kapt3-compiler/testData/converter/strangeNames.kt");
    }

    @TestMetadata("stripMetadata.kt")
    public void testStripMetadata() throws Exception {
        runTest("plugins/kapt3/kapt3-compiler/testData/converter/stripMetadata.kt");
    }

    @TestMetadata("suspendErrorTypes.kt")
    public void testSuspendErrorTypes() throws Exception {
        runTest("plugins/kapt3/kapt3-compiler/testData/converter/suspendErrorTypes.kt");
    }

    @TestMetadata("topLevel.kt")
    public void testTopLevel() throws Exception {
        runTest("plugins/kapt3/kapt3-compiler/testData/converter/topLevel.kt");
    }

    @TestMetadata("unsafePropertyInitializers.kt")
    public void testUnsafePropertyInitializers() throws Exception {
        runTest("plugins/kapt3/kapt3-compiler/testData/converter/unsafePropertyInitializers.kt");
    }
}
