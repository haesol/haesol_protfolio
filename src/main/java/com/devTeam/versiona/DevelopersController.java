package com.devTeam.versiona;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Handles requests for the application article page.
 */
@Controller
public class DevelopersController {

    @RequestMapping(value = "/developers", method = RequestMethod.GET)
    public void developers(@RequestParam Map<String, Object> paramMap, ModelMap model) throws Throwable {


    }
}
