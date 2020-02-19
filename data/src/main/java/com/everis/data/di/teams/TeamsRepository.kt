package com.everis.data.di.teams

import android.app.Application

class TeamsRepository(private val context: Application) {

    suspend fun getListTeams() =
        TeamsServiceManager.service.getlistPopularTeams()

    suspend fun getLoginResponse() =
        TeamsServiceManager.service.getLogin()

}