package com.huncorp.newsapiclient.presentation.di

import com.huncorp.newsapiclient.data.db.ArticleDAO
import com.huncorp.newsapiclient.data.repository.datasource.NewsLocalDataSource
import com.huncorp.newsapiclient.data.repository.datasourceImpl.NewsLocalDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class LocalDataModule {
    @Singleton
    @Provides
    fun provideLocalDataSource(articleDAO: ArticleDAO): NewsLocalDataSource {
        return NewsLocalDataSourceImpl(articleDAO)
    }
}