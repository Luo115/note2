package com.haha.note2.service;

import com.haha.note2.pojo.Article;

import java.util.List;

public interface ArticleService {
    List<Article> findAllArticle();
    List<Article> articleForHomePage();
    Article findArticleById(int id);
    int addArticle(Article article);
    List<String> categories();

}
