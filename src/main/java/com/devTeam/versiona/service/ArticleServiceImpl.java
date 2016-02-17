package com.devTeam.versiona.service;

import java.util.HashMap;
import java.util.List;

import com.devTeam.versiona.dao.ArticleDao;

public class ArticleServiceImpl implements ArticleService{

    private ArticleDao articleDao;
    
    public void setArticleDao(ArticleDao articleDao) {
        this.articleDao = articleDao;
    }
    
    @Override
    public List<HashMap<String, String>> getAllCategoryArticle(int page) {
        // TODO Auto-generated method stub
        return articleDao.selectAllCategoryArticle(page);
    }

    @Override
    public List<HashMap<String, String>> getArticleByCategoryAndPage(String category, int page) {
        // TODO Auto-generated method stub
        return articleDao.selectArticleByCategoryAndPage(category, page);
    }

}
