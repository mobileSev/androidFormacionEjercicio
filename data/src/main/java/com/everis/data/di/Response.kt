package com.everis.data.di

sealed class Response {
    data class Suscces(val suscces : Boolean) :
        Response()
    data class  Error(val error: Boolean): Response()
}