package com.huncorp.newsapiclient.presentation.di

import android.app.Application
import com.huncorp.newsapiclient.domain.usecase.GetNewsHeadlinesUseCase
import com.huncorp.newsapiclient.domain.usecase.GetSavedNewsUseCase
import com.huncorp.newsapiclient.domain.usecase.GetSearchedNewsUseCase
import com.huncorp.newsapiclient.domain.usecase.SaveNewsUseCase
import com.huncorp.newsapiclient.presentation.viewmodel.NewsViewModelFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class FactoryModule {
    @Singleton
    @Provides
    fun provideNewsViewModelFactory(
        application: Application,
        getNewsHeadlinesUseCase: GetNewsHeadlinesUseCase,
        getSearchedNewsUseCase: GetSearchedNewsUseCase,
        saveNewsUseCase: SaveNewsUseCase,
        getSavedNewsUseCase: GetSavedNewsUseCase
    ): NewsViewModelFactory {
        return NewsViewModelFactory(
            application,
            getNewsHeadlinesUseCase,
            getSearchedNewsUseCase,
            saveNewsUseCase,
            getSavedNewsUseCase

        )
    }
}