package com.devTeam.versiona;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application article page.
 */
@Controller
public class AriticleController {

	@Autowired
	private SqlSession sqlSession;
	@RequestMapping(value = "/article", method = RequestMethod.GET)
	
	public ModelAndView article() {

		HashMap<String, Object> sqlInput = new HashMap<String, Object>();
		sqlInput.put("category", "개발자란");
		sqlInput.put("page", 0);
		List<HashMap<String, String>> sqlOutputs = sqlSession.selectList("sqlControlMapper.selectArticleByCategoryAndPage", sqlInput);
		
		String[] prefix = { "first", "second", "third" };
		ModelAndView mav = new ModelAndView("article");
		for (int i = 0; i < sqlOutputs.size(); i++) {

			mav.addObject(prefix[i] + "ArticleTitle", sqlOutputs.get(i).get("title"));
			mav.addObject(prefix[i] + "ArticleUrl", sqlOutputs.get(i).get("uri"));
			mav.addObject(prefix[i] + "ArticleAuthor", sqlOutputs.get(i).get("name"));
			mav.addObject(prefix[i] + "ArticleTimestamp", sqlOutputs.get(i).get("timestamp"));
			mav.addObject(prefix[i] + "ArticleDescription",	sqlOutputs.get(i).get("description"));
			mav.addObject(prefix[i] + "ArticleImg", sqlOutputs.get(i).get("img"));
		}
		return mav;
	}
}
