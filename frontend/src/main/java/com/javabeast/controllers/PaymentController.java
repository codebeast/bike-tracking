package com.javabeast.controllers;

import com.javabeast.domain.SubscriptionType;
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
        //handle someone skipping to the payment page without going through the order
        //don't block this
        if (websiteOrder == null) {
            websitePayment.setWebsiteOrder(WebsiteOrder.builder()
                    .numberOfTrackers(1)
                    .subscriptionType(SubscriptionType.MONTHLY)
                    .build());
        } else {
            websitePayment.setWebsiteOrder(websiteOrder);
        }

        websitePayment.setPrice(199.99);
        System.out.println("order:" + websiteOrder);
        return VIEW_NAME;
    }

    @PostMapping
    public String postPayment(@ModelAttribute @Valid final WebsitePayment websitePayment, final BindingResult bindingResult) {
        return VIEW_NAME;
    }

}
