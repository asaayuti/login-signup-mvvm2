package com.example.loginsignupmvvm2.repository

import com.example.loginsignupmvvm2.network.AuthApi

class AuthRepository(
    private val api: AuthApi
) : BaseRepository(){

    suspend fun login(
        email: String,
        password: String
    ) = safeApiCall {
        api.login(email, password)
    }

}