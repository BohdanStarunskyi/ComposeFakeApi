package com.example.composefakeapi.data.repository

import com.example.composefakeapi.data.remote.API
import com.example.composefakeapi.domain.mapper.CommentMapper
import com.example.composefakeapi.domain.model.Comment
import com.example.composefakeapi.domain.repository.Repository
import javax.inject.Inject

class RepositoryImpl @Inject constructor(private val api: API, private val mapper: CommentMapper) :
    Repository {

    override suspend fun getComments(): ArrayList<Comment> =
        mapper.responseToCommentArrayList(api.getComments().body())

}