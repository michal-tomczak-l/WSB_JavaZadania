package com.company;

public enum Country {
    POLAND("PL","polish", 526465839003.0),
    GERMANY("DE", "german",3693204332230.0),
    SLOVAKIA("SX", "slovak",95617670260.0),
    USA("US","english",36932040332230.0),
    FRANCE("FR","french",2993204332230.0);

    final String code;
    final String language;
    public Double GDP;

    Country(String code, String language, Double GDP) {
        this.code = code;
        this.language = language;
        this.GDP = GDP;
    }
    public Double getGDP() {
    return this.GDP*4.27;
    }
}
