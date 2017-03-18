package com.javabeast.controllers;

import com.javabeast.domain.WebsiteOrder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("checkout")
public class CheckoutController {


    private static final String VIEW_NAME = "checkout";

    public CheckoutController() {
    }

    @GetMapping
    public ModelAndView getCheckout() {
        final Map<String, Object> model = new HashMap<>();
        model.put("websiteOrder", new WebsiteOrder());
        return new ModelAndView(VIEW_NAME, model);
    }

}
