package com.example.testetvalisation

import org.junit.Assert
import org.junit.Test

class CalculTDD {

    var calc = Calculs()

    @Test
    fun add(){
        Assert.assertEquals(5, calc.add(2, 3))
    }

    @Test
    fun sub(){
        Assert.assertEquals(5, calc.sub(10, 5))
    }

    @Test
    fun div(){
        Assert.assertEquals(5, calc.div(25, 5))
    }

    @Test
    fun mul() {
        Assert.assertEquals(25, calc.mul(5, 5))
    }

}