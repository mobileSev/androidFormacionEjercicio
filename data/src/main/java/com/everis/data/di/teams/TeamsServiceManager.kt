package com.everis.data.di.teams

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object TeamsServiceManager {

    private val okHttpClient = HttpLoggingInterceptor().run {
        level = HttpLoggingInterceptor.Level.BODY
        OkHttpClient.Builder().addInterceptor(this).build()
    }

    val service: TeamsService = Retrofit.Builder()
        .baseUrl("https://formacion.free.beeceptor.com/my/api/")
        .client(okHttpClient)
        .addConverterFactory(GsonConverterFactory.create())
        .build().run {
            create<TeamsService>(TeamsService::class.java)
        }

}