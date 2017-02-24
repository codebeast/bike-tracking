package com.javabeast.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LandingPage {
    private String url;
    private String display;

    public String getFullUrl() {
        return "/featured/" + url;
    }
}
