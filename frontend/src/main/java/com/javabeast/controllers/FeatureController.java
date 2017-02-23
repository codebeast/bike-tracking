package com.javabeast.controllers;

import com.javabeast.domain.LandingPage;
import com.javabeast.service.FeaturePageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("")
public class FeatureController {

    private static final String PAGE_NAME = "landingPage";

    private final FeaturePageService featurePageService;

    @Autowired
    public FeatureController(final FeaturePageService featurePageService) {
        this.featurePageService = featurePageService;
    }

    @GetMapping("featured/{pageName}")
    public ModelAndView getMap(@PathVariable final String pageName) {
        final LandingPage landingPage = featurePageService.getLandingPage(pageName);
        final Map<String, Object> model = new HashMap<>();
        model.put("display", landingPage.getDisplay());
        return new ModelAndView(PAGE_NAME, model);
    }
}
