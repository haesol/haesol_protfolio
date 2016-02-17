package com.devTeam.versiona;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.devTeam.versiona.service.ArticleService;

/**
 * Handles requests for the application article page.
 */
@Controller
public class AriticleController {

    @Autowired
    private ArticleService articleService;

    @RequestMapping(value = "/article", method = RequestMethod.GET)
    public void article(@RequestParam Map<String, Object> paramMap, ModelMap model) throws Throwable {

        model.put("results", articleService.getCategoryArticle(0));

    }
}
