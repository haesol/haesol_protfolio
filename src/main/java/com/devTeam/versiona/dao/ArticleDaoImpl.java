package com.devTeam.versiona.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import com.devTeam.versiona.utils.Constant;

public class ArticleDaoImpl implements ArticleDao{

    @Autowired
    private SqlSession sqlSession;
    /**
     * param page must be started from 0
     */
    @Override
    public List<HashMap<String, String>> selectAllCategoryArticle(int page) {
        // TODO Auto-generated method stub
        HashMap<String, Object> sqlInput = new HashMap<String, Object>();
        sqlInput.put("page", page * Constant.VIEWING_ARTICLE_NUMBER);

        return sqlSession.selectList("sqlControlMapper.selectAllArticleByPage", sqlInput);
    }

}
