package com.javabeast.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.javabeast.domain.LandingPage;
import com.javabeast.domain.LandingPageGroup;
import com.javabeast.domain.Language;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class FeaturePageService {

    private static final List<LandingPageGroup> landingPageGroups = new ArrayList<>();
    private static final ObjectMapper mapper = new ObjectMapper();


    public List<LandingPageGroup> loadGroups() {
        try {
            final Language[] values = Language.values();
            for (final Language value : values) {
                final File dir = new File(value.getLandingPageUrl().getFile());
                final LandingPageGroup landingPageGroup = mapper.readValue(dir, LandingPageGroup.class);
                landingPageGroups.add(landingPageGroup);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return landingPageGroups;
    }


    public List<LandingPage> getLandingPagesForLang(final String langCode) {
        final List<LandingPageGroup> landingPageGroups = loadGroups();
        for (final LandingPageGroup landingPageGroup : landingPageGroups) {
            if (langCode.equals(landingPageGroup.getLangCode())) {
                return landingPageGroup.getLandingPages();
            }
        }
        return Collections.emptyList();
    }

    public LandingPage getLandingPage(final String pageName) {
        final List<LandingPageGroup> landingPageGroups = loadGroups();
        for (final LandingPageGroup landingPageGroup : landingPageGroups) {
            final List<LandingPage> landingPages = landingPageGroup.getLandingPages();
            for (final LandingPage landingPage : landingPages) {
                if (pageName.equals(landingPage.getUrl())) {
                    return landingPage;
                }
            }
        }
        return null;
    }
}
