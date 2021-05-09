package com.huncorp.newsapiclient.domain.usecase

import com.huncorp.newsapiclient.domain.repository.NewsRepository

class GetSearchNewsUseCase(private val newsRepository: NewsRepository) {
}