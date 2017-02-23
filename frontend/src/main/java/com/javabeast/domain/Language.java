package com.javabeast.domain;

import java.net.URL;

public enum Language {
    EN("en", "English", "landingpage_en.json"),
    DE("de", "Deutsche", "landingpage_de.json"),
    ES("es", "Español", "landingpage_es.json"),
    IT("it", "Italiano", "landingpage_it.json"),
    NL("nl", "Nederlands", "landingpage_nl.json"),
    PL("pl", "Polskie", "landingpage_pl.json"),
    PT("pt", "Português", "landingpage_pt.json"),
    DA("da", "Dansk", "landingpage_da.json"),
    RU("ru", "русский", "landingpage_ru.json"),
    UK("uk", "український", "landingpage_uk.json"),
    NO("no", "Norsk", "landingpage_no.json"),
    SV("sv", "Svenska", "landingpage_sv.json");

    private final String displayName;
    private final String languageName;
    private final URL landingPageUrl;

    Language(String displayName, String languageName, String landingPageUrl) {
        this.displayName = displayName;
        this.languageName = languageName;
        this.landingPageUrl = Language.class.getResource("/landingpage/" + landingPageUrl);
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getLanguageName() {
        return languageName;
    }

    public URL getLandingPageUrl() {
        return landingPageUrl;
    }

    public static String getNameFromCode(final String langCode) {
        final String isoCode = langCode.substring(0, 2);
        final Language[] values = Language.values();
        for (final Language value : values) {
            if (value.getDisplayName().equals(isoCode)) {
                return value.getLanguageName();
            }
        }
        return Language.EN.getLanguageName();
    }
}
