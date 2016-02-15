package com.devTeam.versiona;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {


	/**
	 * redirect to article, that is our Home Page.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home() {

		String url = "redirect:/article";
		return new ModelAndView(url);

	}

}
