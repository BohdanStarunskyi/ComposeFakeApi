package com.example.composefakeapi.domain.use_case

import com.example.composefakeapi.data.repository.RepositoryImpl
import javax.inject.Inject

class UseCase @Inject constructor(private val repository: RepositoryImpl) {
    suspend fun getComments() = repository.getComments()
}