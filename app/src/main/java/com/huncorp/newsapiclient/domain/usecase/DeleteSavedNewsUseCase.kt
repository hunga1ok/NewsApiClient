package com.huncorp.newsapiclient.domain.usecase

import com.huncorp.newsapiclient.data.model.Article
import com.huncorp.newsapiclient.domain.repository.NewsRepository

class DeleteSavedNewsUseCase(private val newsRepository: NewsRepository) {
    suspend fun execute(article: Article) = newsRepository.deleteNews(article)
}