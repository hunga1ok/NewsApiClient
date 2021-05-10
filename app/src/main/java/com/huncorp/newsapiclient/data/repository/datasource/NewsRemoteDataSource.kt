package com.huncorp.newsapiclient.data.repository.datasource

import com.huncorp.newsapiclient.data.model.APIResponse
import retrofit2.Response

interface NewsRemoteDataSource {
    suspend fun getTopHeadlines(country: String, page: Int) : Response<APIResponse>
    suspend fun getSearchedHeadlines(country: String, searchQuery: String, page: Int) : Response<APIResponse>
}