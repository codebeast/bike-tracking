package com.javabeast.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class LandingPage {
    private String url;
    private String display;
    private String tagLine;
    private String metaDescription;
    private String title;

    public String getFullUrl() {
        return "/featured/" + url;
    }
}
