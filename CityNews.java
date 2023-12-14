package com.smartCityApplication;

import java.util.Date;

class CityNews {
    String newsHeadline;
    String newsContent;
    Date newsDate;

    public CityNews(String newsHeadline, String newsContent, Date newsDate) {
        this.newsHeadline = newsHeadline;
        this.newsContent = newsContent;
        this.newsDate = newsDate;
    }

    public String toString() {
        return "Headline: " + newsHeadline + "\nContent: " + newsContent + "\nDate: " + newsDate + "\n";
    }
}