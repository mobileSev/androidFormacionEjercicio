package com.everis.domain.useCases

import com.everis.domain.*
import com.example.common.Either

class GetLogin(private val repository: TeamRepository){

    suspend fun invoke(user : String, pass : String):
            Either<LoginError, Login> = repository.getLogin(user,pass)
}