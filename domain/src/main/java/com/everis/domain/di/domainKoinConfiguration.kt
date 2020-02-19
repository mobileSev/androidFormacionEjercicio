package com.everis.domain.di

import com.everis.domain.useCases.GetLogin
import com.everis.domain.useCases.GetTeams
import org.koin.dsl.module

class domainKoinConfiguration {

    fun getModule() = module {
        factory {
            GetTeams(get())
            GetLogin(get())
        }

    }
}