package com.example.composefakeapi.domain.repository

import com.example.composefakeapi.domain.model.Comment

interface Repository {
    suspend fun getComments(): ArrayList<Comment>
}