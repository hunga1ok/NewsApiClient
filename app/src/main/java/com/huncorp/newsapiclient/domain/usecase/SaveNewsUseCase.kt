package com.huncorp.newsapiclient.domain.usecase

import com.huncorp.newsapiclient.data.model.Article
import com.huncorp.newsapiclient.domain.repository.NewsRepository

class SaveNewsUseCase(private val newsRepository: NewsRepository) {
    suspend fun execute(article: Article) = newsRepository.saveNews(article)
}