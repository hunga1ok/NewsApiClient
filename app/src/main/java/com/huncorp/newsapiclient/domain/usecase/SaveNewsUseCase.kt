package com.huncorp.newsapiclient.domain.usecase

import com.huncorp.newsapiclient.domain.repository.NewsRepository

class SaveNewsUseCase(private val newsRepository: NewsRepository) {
}