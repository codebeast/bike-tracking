package com.javabeast.controllers;

import com.javabeast.domain.WebsiteOrder;
import org.springframework.web.bind.annotation.*;
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

    @PostMapping
    public ModelAndView postCheckout(@ModelAttribute WebsiteOrder websiteOrder) {
        System.out.println("CheckoutController.postCheckout");
        System.out.println("websiteOrder = [" + websiteOrder + "]");
        return new ModelAndView(VIEW_NAME, new HashMap<>());
    }

}
