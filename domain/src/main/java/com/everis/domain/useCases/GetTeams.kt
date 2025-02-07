package com.everis.domain.useCases

import com.everis.domain.Team
import com.everis.domain.TeamError
import com.everis.domain.TeamRepository
import com.example.common.Either

class GetTeams(private val repository: TeamRepository){

    suspend fun invoke(): Either<TeamError, List<Team>> = repository.getTeams()
}