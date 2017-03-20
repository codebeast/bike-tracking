package com.javabeast.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WebsiteOrder {

    @Min(value = 1, message = "The minimum order is 1")
    @Max(value = 50, message = "The maximum order is 50")
    private int numberOfTrackers = 1;

    private SubscriptionType subscriptionType = SubscriptionType.MONTHLY;

}
