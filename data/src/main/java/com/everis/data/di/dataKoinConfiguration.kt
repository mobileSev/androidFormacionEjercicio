package com.everis.data.di

import android.app.Application
import com.everis.data.di.teams.TeamsRepository
import org.koin.dsl.module


class DataKoinConfiguration {

    fun getModule() = module {
        single {
            TeamsRepository(
                Application()
            )
        }

    }
}


