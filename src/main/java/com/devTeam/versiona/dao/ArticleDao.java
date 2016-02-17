package com.devTeam.versiona.dao;

import java.util.HashMap;
import java.util.List;

public interface ArticleDao {
    
    public List<HashMap<String, String>> selectAllCategoryArticle(int page);
    public List<HashMap<String, String>> selectArticleByCategoryAndPage(String category, int page);

}
