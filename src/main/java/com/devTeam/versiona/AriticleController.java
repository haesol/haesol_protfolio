package com.devTeam.versiona;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.devTeam.versiona.service.ArticleService;
import com.devTeam.versiona.utils.ArticleCategory;

/**
 * Handles requests for the application article page.
 */
@Controller
public class AriticleController {

    @Autowired
    private ArticleService articleService;
    @Autowired
    private SqlSession sqlSession;

    @RequestMapping(value = "/article", method = RequestMethod.GET)
    public void article(@RequestParam Map<String, Object> paramMap, ModelMap model) throws Throwable {

        makeMVforArticleJSP(model, articleService.getCategoryArticle(0));

    }

    private void makeMVforArticleJSP(ModelMap model, List<HashMap<String, String>> sqlOutputs) {

        String[] prefix = { "first", "second", "third" };
        for (int i = 0; i < sqlOutputs.size(); i++) {

            model.put(prefix[i] + "ArticleTitle", sqlOutputs.get(i).get("title"));
            model.put(prefix[i] + "ArticleUrl", sqlOutputs.get(i).get("uri"));
            model.put(prefix[i] + "ArticleAuthor", sqlOutputs.get(i).get("name"));
            model.put(prefix[i] + "ArticleTimestamp", sqlOutputs.get(i).get("timestamp"));
            model.put(prefix[i] + "ArticleDescription", sqlOutputs.get(i).get("description"));
            model.put(prefix[i] + "ArticleImg", sqlOutputs.get(i).get("img"));

        }

        model.put("category1", ArticleCategory.GETSTARTED.getName());
        model.put("category2", ArticleCategory.DEVSTORY.getName());
        model.put("category3", ArticleCategory.TIPNTECH.getName());
        model.put("category4", ArticleCategory.ETC.getName());
    }
}
