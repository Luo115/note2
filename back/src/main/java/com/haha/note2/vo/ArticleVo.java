package com.haha.note2.vo;

import com.haha.note2.pojo.Article;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArticleVo {

    private Article article;
    private String time;


}
