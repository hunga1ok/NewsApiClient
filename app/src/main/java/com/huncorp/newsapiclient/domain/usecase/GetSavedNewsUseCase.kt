package com.huncorp.newsapiclient.domain.usecase

import com.huncorp.newsapiclient.data.model.Article
import com.huncorp.newsapiclient.domain.repository.NewsRepository
import kotlinx.coroutines.flow.Flow

class GetSavedNewsUseCase(private val newsRepository: NewsRepository) {
    fun execute(): Flow<List<Article>> {
        return newsRepository.getSavedNews()
    }
}