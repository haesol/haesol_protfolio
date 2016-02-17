package com.devTeam.versiona;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.devTeam.versiona.service.ArticleService;
import com.devTeam.versiona.utils.ArticleCategory;
import com.devTeam.versiona.utils.Constant;

/**
 * Handles requests for the application article page.
 */
@Controller
public class AriticleController {

    @Autowired
    private ArticleService articleService;

    @RequestMapping(value = "/article", method = RequestMethod.GET)
    public void article(@RequestParam Map<String, Object> paramMap, ModelMap model) throws Throwable {

        model.put("results", articleService.getAllCategoryArticle(Constant.FIRST_PAGE));

    }
    
    @RequestMapping(value = "/ajax/article", method = RequestMethod.GET)
    public @ResponseBody Map<?,?> articleAjax(@RequestParam Map<String, String> paramMap, ModelMap model) throws Throwable {

        if(isAllCategory(paramMap)) {
            
            model.put("articles", articleService.getAllCategoryArticle(Integer.parseInt(paramMap.get("PAGE_ID"))));
            
        } else {
            // Not all category
            model.put("articles", articleService.getArticleByCategoryAndPage(paramMap.get("CATEGORY_ID").toString(), Integer.parseInt(paramMap.get("PAGE_ID"))));
            
        }
        
        model.put("result", Constant.SUCCESS);
        return model;
        
    }
    
    private boolean isAllCategory(Map<String, String> paramMap) {
        
        if(paramMap.get("CATEGORY_ID").toString().equals(ArticleCategory.ALL.getName()))
            return true;
        
        return false;
        
    }
}
