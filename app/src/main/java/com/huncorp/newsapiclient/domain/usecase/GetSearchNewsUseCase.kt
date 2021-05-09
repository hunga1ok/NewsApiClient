package com.huncorp.newsapiclient.domain.usecase

import com.huncorp.newsapiclient.data.model.APIResponse
import com.huncorp.newsapiclient.data.util.Resource
import com.huncorp.newsapiclient.domain.repository.NewsRepository

class GetSearchNewsUseCase(private val newsRepository: NewsRepository) {
    suspend fun execute(searchQuery: String): Resource<APIResponse> {
        return newsRepository.getSearchedNews(searchQuery)
    }
}