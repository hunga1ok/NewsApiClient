package com.huncorp.newsapiclient.data.repository.datasourceImpl

import com.huncorp.newsapiclient.data.api.NewsAPIService
import com.huncorp.newsapiclient.data.model.APIResponse
import com.huncorp.newsapiclient.data.repository.datasource.NewsRemoteDataSource
import retrofit2.Response
import retrofit2.http.GET

class NewsRemoteDataSourceImpl(
    private val newsAPIService: NewsAPIService,
    private val country: String,
    private val page: Int
): NewsRemoteDataSource {
    @GET("v2/top-headlines")
    override suspend fun getTopHeadlines(): Response<APIResponse> {
        return newsAPIService.getTopHeadlines(country, page)
    }
}