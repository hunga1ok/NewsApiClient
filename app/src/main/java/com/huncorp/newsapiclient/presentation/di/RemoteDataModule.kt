package com.huncorp.newsapiclient.presentation.di

import com.huncorp.newsapiclient.data.api.NewsAPIService
import com.huncorp.newsapiclient.data.repository.datasource.NewsRemoteDataSource
import com.huncorp.newsapiclient.data.repository.datasourceImpl.NewsRemoteDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class RemoteDataModule {
    @Singleton
    @Provides
    fun provideNewsRemoteDataSource(
        newsAPIService: NewsAPIService
    ): NewsRemoteDataSource {
        return NewsRemoteDataSourceImpl(newsAPIService)
    }
}