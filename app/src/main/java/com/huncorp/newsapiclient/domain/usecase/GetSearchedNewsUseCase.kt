package com.huncorp.newsapiclient.domain.usecase

import com.huncorp.newsapiclient.data.model.APIResponse
import com.huncorp.newsapiclient.data.util.Resource
import com.huncorp.newsapiclient.domain.repository.NewsRepository

class GetSearchedNewsUseCase(private val newsRepository: NewsRepository) {
    suspend fun execute(country: String, searchQuery: String, page: Int): Resource<APIResponse> {
        return newsRepository.getSearchedNews(country, searchQuery, page)
    }
}