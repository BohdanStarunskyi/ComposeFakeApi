package com.example.composefakeapi.common

import com.example.composefakeapi.domain.model.Comment

data class States(
    val isLoading: Boolean = false,
    val comments: ArrayList<Comment> = arrayListOf(),
    val error: Throwable = Throwable()
)
