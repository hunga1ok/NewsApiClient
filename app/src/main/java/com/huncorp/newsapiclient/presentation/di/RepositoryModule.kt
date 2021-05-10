package com.huncorp.newsapiclient.presentation.di

import com.huncorp.newsapiclient.data.repository.NewsRepositoryImpl
import com.huncorp.newsapiclient.data.repository.datasource.NewsLocalDataSource
import com.huncorp.newsapiclient.data.repository.datasource.NewsRemoteDataSource
import com.huncorp.newsapiclient.domain.repository.NewsRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {
    @Singleton
    @Provides
    fun provideNewsRepository(
        newsRemoteDataSource: NewsRemoteDataSource,
        newsLocalDataSource: NewsLocalDataSource
    ): NewsRepository {
        return NewsRepositoryImpl(
            newsRemoteDataSource,
            newsLocalDataSource
        )
    }
}