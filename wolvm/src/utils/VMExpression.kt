package utils

import wolvm.*

interface VMExpression {
    fun Call(vararg args: wolValue)
}