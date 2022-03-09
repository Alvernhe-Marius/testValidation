package com.example.testetvalisation

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class UserTDD {

    private var users : MutableList<Users>? = null

    @Before
    fun setup()
    {
        users = mutableListOf()
        //addUser()
    }

    @Test
    fun addUser(){
        users?.add(Users("Marius"))
        assertThat( users!!.size, equalTo(1) )
    }

    @Test
    fun deleteUser(){
        users?.remove(Users("Marius"))
        assertThat( users!!.size, equalTo(0) ) //Hamcrest
        Assert.assertEquals(0, users!!.size)  // JUnit
    }

    @Test
    fun updateUser(){
        assertThat( users!!.size, equalTo(1) )
        val user = users!![0]
        user.name = "Yoan"
        assertThat( users!![0].name, equalTo("Cedric") )
    }


    /*

    Fonctionnalité: Réserver une chambre en ligne
        Afin de gagner de l'argent
        Les clients doivent être capables
        de réserver 24/24.

      Scénario: Réserver la dernière chambre
        Etant donné qu'il reste 1 chambre
        Et que je suis sur mon tel
        Quand j'appuie sur le bouton " Réserver "
        Alors je devrai réserver une chambre


     */

}