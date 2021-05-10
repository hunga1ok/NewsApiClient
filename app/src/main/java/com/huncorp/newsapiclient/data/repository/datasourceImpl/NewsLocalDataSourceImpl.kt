package com.huncorp.newsapiclient.data.repository.datasourceImpl

import com.huncorp.newsapiclient.data.db.ArticleDAO
import com.huncorp.newsapiclient.data.model.Article
import com.huncorp.newsapiclient.data.repository.datasource.NewsLocalDataSource

class NewsLocalDataSourceImpl(
    private val articleDAO: ArticleDAO
): NewsLocalDataSource {
    override suspend fun saveArticleToDB(article: Article) {
        articleDAO.insert(article)
    }
}