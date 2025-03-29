package com.example.compose_navigation.data

val userDefault = User(
    userId = "aluno",
    name = "Aluno DS",
    avatarUrl = null,
    age = 17,
    score = 75,
    registerDate = "29/03/2007",
    curso = "3º AMS",
    email = "aluno@etec.sp.gov.br",
    bio = "Estou criando um aplicativo com passagem de parâmetros"
)

val Vitor = User(
    userId = "Vitor",
    name = "Vitor Daisuke Iwamoto",
    avatarUrl = null,
    age = 17,
    score = 90,
    registerDate = "20/08/2007",
    curso = "3º AMS",
    email = "vitor.iwamoto@etec.sp.gov.br",
    bio = "Estou criando um aplicativo com passagem de parâmetros"
)

fun getUserData(userName: String):User {
    return if (userName == "Vitor") {
        Vitor
    } else{
        userDefault
    }
}