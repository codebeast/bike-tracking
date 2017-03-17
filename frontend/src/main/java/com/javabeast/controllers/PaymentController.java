package com.javabeast.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;

@RestController
@RequestMapping("payment")
public class PaymentController {


    private static final String VIEW_NAME = "payment";

    public PaymentController() {
    }

    @GetMapping
    public ModelAndView getPayment() {
        return new ModelAndView(VIEW_NAME, new HashMap<>());
    }


}
