package com.example.composefakeapi.di

import com.example.composefakeapi.common.Constants
import com.example.composefakeapi.data.remote.API
import com.example.composefakeapi.data.repository.RepositoryImpl
import com.example.composefakeapi.domain.mapper.CommentMapper
import com.example.composefakeapi.domain.repository.Repository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataModule {
    @Provides
    @Singleton
    fun provideApi(): API {
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(API::class.java)
    }
}