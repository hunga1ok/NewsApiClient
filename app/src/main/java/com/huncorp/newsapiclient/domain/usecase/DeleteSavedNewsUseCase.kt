package com.huncorp.newsapiclient.domain.usecase

import com.huncorp.newsapiclient.domain.repository.NewsRepository

class DeleteSavedNewsUseCase(private val newsRepository: NewsRepository) {
}