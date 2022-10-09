package com.example.composefakeapi.domain.mapper

import com.example.composefakeapi.data.remote.dto.Response
import com.example.composefakeapi.domain.model.Comment
import javax.inject.Inject

class CommentMapper @Inject constructor() {
     fun responseToCommentArrayList(response: Response?): ArrayList<Comment> {
        val array = arrayListOf<Comment>()
        response?.forEach { array.add(Comment(text = it.body, email = it.email, name = it.name)) }
        return array
    }
}