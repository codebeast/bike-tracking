package com.javabeast.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.javabeast.domain.LandingPage;
import com.javabeast.domain.LandingPageGroup;
import org.springframework.stereotype.Service;

import java.io.*;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class FeaturePageService {

    private static final List<LandingPageGroup> landingPageGroups = new ArrayList<>();
    private static final ObjectMapper mapper = new ObjectMapper();


    private static final URL LANDING_PAGE_URLS = FeaturePageService.class.getResource("/landingpage/");


    public List<LandingPageGroup> loadGroups() {

        try {
            final File dir = new File(LANDING_PAGE_URLS.toURI());
            for (final File nextFile : dir.listFiles()) {
                final LandingPageGroup landingPageGroup = mapper.readValue(nextFile, LandingPageGroup.class);
                landingPageGroups.add(landingPageGroup);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
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
