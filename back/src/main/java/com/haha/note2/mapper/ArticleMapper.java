package com.haha.note2.mapper;

import com.haha.note2.pojo.Article;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ArticleMapper {

    @Select("select category from categories")
    List<String> categories();

    List<Article> findAllArticle();

    List<Article> articleForHomePage();

    Article findArticleById(int id);

    int addArticle(Article article);

}
