package com.everis.data.di.teams

import Json4Kotlin_Base
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface TeamsService {

    @GET("teams")
    suspend fun getlistPopularTeams(): Response<Json4Kotlin_Base>

    @GET("login")
    suspend fun getLogin(): Response<Json4Kotlin_Base>
}