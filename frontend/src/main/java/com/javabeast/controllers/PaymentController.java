package com.javabeast.controllers;

import com.javabeast.domain.WebsiteOrder;
import com.javabeast.domain.WebsitePayment;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

@Controller
@RequestMapping("payment")
public class PaymentController {


    private static final String VIEW_NAME = "payment";

    public PaymentController() {
    }


    @GetMapping
    public String getPayment(final WebsitePayment websitePayment, final HttpSession httpSession) {
        final WebsiteOrder websiteOrder = (WebsiteOrder) httpSession.getAttribute("order");
        websitePayment.setWebsiteOrder(websiteOrder);

        websitePayment.setPrice(199.99);
        System.out.println("order:" + websiteOrder);
        return VIEW_NAME;
    }

    @PostMapping
    public String postPayment(@ModelAttribute @Valid final WebsitePayment websitePayment, final BindingResult bindingResult) {
        return VIEW_NAME;
    }

}
