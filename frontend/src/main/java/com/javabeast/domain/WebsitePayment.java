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

    @NotNull
    private String firstName;

    @NotNull
    private String lastName;

    @NotNull
    private String buildingName;

    @NotNull
    private String street;

    private String city;

    private String country;

    @NotNull(message = "Postcode can not be blank")
    private String postcode;

   // @NotNull
    private String transactionCode;

    private double price;

}
