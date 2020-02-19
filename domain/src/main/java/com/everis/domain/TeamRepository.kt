package com.everis.domain

import com.example.common.Either


interface TeamRepository {

    suspend fun getTeams(): Either<TeamError, List<Team>>

    suspend fun getLogin(user : String, pass : String): Either<LoginError, Login>
}