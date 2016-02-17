package com.devTeam.versiona.service;

import java.util.HashMap;
import java.util.List;

public interface ArticleService {
    
    public List<HashMap<String, String>> getAllCategoryArticle(int page);
    public List<HashMap<String, String>> getArticleByCategoryAndPage(String category, int page);

}
