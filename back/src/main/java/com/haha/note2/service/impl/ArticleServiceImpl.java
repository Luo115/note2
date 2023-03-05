package com.haha.note2.service.impl;

import com.haha.note2.mapper.ArticleMapper;
import com.haha.note2.pojo.Article;
import com.haha.note2.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleMapper articleMapper;

    @Override
    public List<Article> findAllArticle() {
        return articleMapper.findAllArticle();
    }
    public List<Article> articleForHomePage(){
        return articleMapper.articleForHomePage();
    }

    @Override
    public Article findArticleById(int id) {
        return articleMapper.findArticleById(id);
    }

    @Override
    public int addArticle(Article article) {
        return articleMapper.addArticle(article);
    }

    @Override
    public List<String> categories() {
        return articleMapper.categories();
    }

}
