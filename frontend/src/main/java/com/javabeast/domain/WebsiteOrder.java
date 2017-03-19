package com.javabeast.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WebsiteOrder {

    private int numberOfTrackers = 1;
    private SubscriptionType subscriptionType = SubscriptionType.MONTHLY;

}
