package com.javabeast.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;

@RestController
@RequestMapping("checkout")
public class CheckoutController {


    private static final String VIEW_NAME = "checkout";
    private static final String OPTION_VIEW_NAME = "checkout_option";

    public CheckoutController() {
    }

    @GetMapping
    public ModelAndView getCheckout() {
        return new ModelAndView(VIEW_NAME, new HashMap<>());
    }

    @GetMapping("/options")
    public ModelAndView getOptions() {
        return new ModelAndView(OPTION_VIEW_NAME, new HashMap<>());
    }

}
