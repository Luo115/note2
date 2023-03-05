package com.haha.note2.controller;

import com.haha.note2.pojo.Article;
import com.haha.note2.service.ArticleService;
import com.haha.note2.vo.ArticleVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
//@CrossOrigin注解放到启动类上不生效。。
@CrossOrigin
public class ArticleController {

    @Autowired
    ArticleService articleService;

    @RequestMapping("/a")
    public List<ArticleVo> a() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        List<Article> allArticle = articleService.findAllArticle();
        List<ArticleVo> allVo = new ArrayList<>();
        allArticle.forEach((article) -> {
            allVo.add(new ArticleVo(article, simpleDateFormat.format(article.getCompletionTime())));
        });
        return allVo;
    }

    @RequestMapping("/b")
    public List<Article> b(){
        return articleService.articleForHomePage();
    }

    @RequestMapping("/c")
    public Article c(@RequestParam("id") int id){
        Article a = articleService.findArticleById(id);
        return a;
    }

    @RequestMapping("/add")
    public int add(String title, String content, String category){
        Article article = new Article();
        article.setTitle(title).setContent(content).setCategory(category).setCompletionTime(new Date());
        return articleService.addArticle(article);
    }

    @RequestMapping("/categories")
    public List<String> categories(){
        return articleService.categories();
    }


}
