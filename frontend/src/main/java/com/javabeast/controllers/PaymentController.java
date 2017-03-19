package com.javabeast.controllers;

import com.javabeast.domain.WebsiteOrder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;

@RestController
@RequestMapping("payment")
public class PaymentController {


    private static final String VIEW_NAME = "payment";

    public PaymentController() {
    }

    @GetMapping
    public ModelAndView getPayment(@RequestBody ModelAttribute websiteOrder) {
        System.out.println("PaymentController.getPayment");
        System.out.println("websiteOrder = [" + websiteOrder + "]");
        return new ModelAndView(VIEW_NAME, new HashMap<>());
    }


}
