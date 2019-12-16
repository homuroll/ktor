/*
 * Copyright 2014-2019 JetBrains s.r.o and contributors. Use of this source code is governed by the Apache 2.0 license.
 */

package io.ktor.util

@InternalAPI
expect fun Platform(): Platform

@InternalAPI
class Platform internal constructor(
    val name: String
)