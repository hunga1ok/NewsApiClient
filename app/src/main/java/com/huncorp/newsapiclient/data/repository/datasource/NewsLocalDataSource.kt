package com.huncorp.newsapiclient.data.repository.datasource

import com.huncorp.newsapiclient.data.model.Article

interface NewsLocalDataSource {
    suspend fun saveArticleToDB(article: Article)
}