package com.everis.domain

interface TeamRepository {
    suspend fun getCategory(error: Boolean): Either<TeamError, List<Team>>
}