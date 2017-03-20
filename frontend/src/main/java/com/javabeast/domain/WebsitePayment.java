package com.javabeast.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WebsitePayment {

    @NotNull
    private WebsiteOrder websiteOrder;

    private int id;

    @NotNull
    private String email;

    private String firstName;
    private String lastName;

    @NotNull
    private String addressLine1;

    @NotNull
    private String addressLine2;

    private String addressLine3;
    private String addressLine4;

    @NotNull
    private String postcode;

    @NotNull
    private String transactionCode;

    private double price;

}
