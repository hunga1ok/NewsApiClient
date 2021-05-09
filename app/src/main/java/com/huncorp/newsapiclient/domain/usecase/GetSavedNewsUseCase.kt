package com.huncorp.newsapiclient.domain.usecase

import com.huncorp.newsapiclient.domain.repository.NewsRepository

class GetSavedNewsUseCase(private val newsRepository: NewsRepository) {
}