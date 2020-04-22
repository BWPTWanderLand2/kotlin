/*
 * Copyright 2010-2019 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.debugger.test.ir

import org.jetbrains.kotlin.idea.debugger.test.AbstractKotlinSteppingTest
import org.jetbrains.kotlin.test.TargetBackend

abstract class AbstractIrKotlinSteppingTest : AbstractKotlinSteppingTest() {
    override fun getBackend() = TargetBackend.JVM_IR
}