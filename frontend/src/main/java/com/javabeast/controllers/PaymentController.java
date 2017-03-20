package com.javabeast.controllers;

import com.javabeast.domain.SubscriptionType;
import com.javabeast.domain.WebsiteOrder;
import com.javabeast.domain.WebsitePayment;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.List;

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

        websitePayment.setPrice(17.86);
        return VIEW_NAME;
    }

    @PostMapping
    public String postPayment(@ModelAttribute @Valid final WebsitePayment websitePayment, final BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            System.out.println("dump errors");
            final List<ObjectError> allErrors = bindingResult.getAllErrors();
            for (ObjectError allError : allErrors) {
                System.out.println(allError);

            }
            System.out.println("errors");
            return VIEW_NAME;
        }

        System.out.println(websitePayment);


        System.out.println("order complete!!");
        return VIEW_NAME;
    }

}
