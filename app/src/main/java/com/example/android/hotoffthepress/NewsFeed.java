package com.example.android.hotoffthepress;

public class NewsFeed {

    private String NewsTitle;

    private String NewsDate;

    private String NewsURL;

    public NewsFeed(String newstitle, String newsdate, String newsurl){
        NewsTitle = newstitle;
        NewsDate = newsdate;
        NewsURL = newsurl;
    }

    public String getNewsTitle(){return NewsTitle;}

    public String getNewsDate(){return NewsDate;}

    public String getNewsURL(){return NewsURL;}

}
