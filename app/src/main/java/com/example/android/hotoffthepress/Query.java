package com.example.android.hotoffthepress;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class Query {

    private static final String SAMPLE_NEWS_RESPONSE = "{\"response\":{\"status\":\"ok\",\"userTier\":\"developer\",\"total\":153459,\"startIndex\":1,\"pageSize\":10,\"currentPage\":1,\"pages\":15346,\"orderBy\":\"relevance\",\"results\":[{\"id\":\"education/2018/apr/01/education-data-shows-the-way\",\"type\":\"article\",\"sectionId\":\"education\",\"sectionName\":\"Education\",\"webPublicationDate\":\"2018-04-01T17:17:17Z\",\"webTitle\":\"Education data shows the way | Letters\",\"webUrl\":\"https://www.theguardian.com/education/2018/apr/01/education-data-shows-the-way\",\"apiUrl\":\"https://content.guardianapis.com/education/2018/apr/01/education-data-shows-the-way\",\"isHosted\":false,\"pillarId\":\"pillar/news\",\"pillarName\":\"News\"},{\"id\":\"politics/2018/apr/19/robert-halfons-views-on-education-cause-concern\",\"type\":\"article\",\"sectionId\":\"politics\",\"sectionName\":\"Politics\",\"webPublicationDate\":\"2018-04-19T17:17:17Z\",\"webTitle\":\"Robert Halfon’s views on education cause concern | Letters\",\"webUrl\":\"https://www.theguardian.com/politics/2018/apr/19/robert-halfons-views-on-education-cause-concern\",\"apiUrl\":\"https://content.guardianapis.com/politics/2018/apr/19/robert-halfons-views-on-education-cause-concern\",\"isHosted\":false,\"pillarId\":\"pillar/news\",\"pillarName\":\"News\"},{\"id\":\"higher-education-network/2018/feb/28/qs-world-university-rankings-2018-education\",\"type\":\"article\",\"sectionId\":\"higher-education-network\",\"sectionName\":\"Higher Education Network\",\"webPublicationDate\":\"2018-02-28T13:30:15Z\",\"webTitle\":\"QS world university rankings 2018: education\",\"webUrl\":\"https://www.theguardian.com/higher-education-network/2018/feb/28/qs-world-university-rankings-2018-education\",\"apiUrl\":\"https://content.guardianapis.com/higher-education-network/2018/feb/28/qs-world-university-rankings-2018-education\",\"isHosted\":false,\"pillarId\":\"pillar/news\",\"pillarName\":\"News\"},{\"id\":\"education/2018/may/22/sex-education-given-lgbt-inclusive-overhaul-wales\",\"type\":\"article\",\"sectionId\":\"education\",\"sectionName\":\"Education\",\"webPublicationDate\":\"2018-05-21T23:01:38Z\",\"webTitle\":\"Sex education given LGBT-inclusive overhaul in Wales\",\"webUrl\":\"https://www.theguardian.com/education/2018/may/22/sex-education-given-lgbt-inclusive-overhaul-wales\",\"apiUrl\":\"https://content.guardianapis.com/education/2018/may/22/sex-education-given-lgbt-inclusive-overhaul-wales\",\"isHosted\":false,\"pillarId\":\"pillar/news\",\"pillarName\":\"News\"},{\"id\":\"business/2018/may/13/un-education-initiative-is-chance-to-show-multilateralism-is-not-dead\",\"type\":\"article\",\"sectionId\":\"business\",\"sectionName\":\"Business\",\"webPublicationDate\":\"2018-05-14T08:40:34Z\",\"webTitle\":\"With or without Trump, we must back UN's education drive | Larry Elliott\",\"webUrl\":\"https://www.theguardian.com/business/2018/may/13/un-education-initiative-is-chance-to-show-multilateralism-is-not-dead\",\"apiUrl\":\"https://content.guardianapis.com/business/2018/may/13/un-education-initiative-is-chance-to-show-multilateralism-is-not-dead\",\"isHosted\":false,\"pillarId\":\"pillar/news\",\"pillarName\":\"News\"},{\"id\":\"stage/2017/aug/17/education-education-education-review-wardrobe-ensemble-pleasance-edinburgh\",\"type\":\"article\",\"sectionId\":\"stage\",\"sectionName\":\"Stage\",\"webPublicationDate\":\"2017-08-17T05:00:03Z\",\"webTitle\":\"Education, Education, Education review – 90s school play is smartly entertaining\",\"webUrl\":\"https://www.theguardian.com/stage/2017/aug/17/education-education-education-review-wardrobe-ensemble-pleasance-edinburgh\",\"apiUrl\":\"https://content.guardianapis.com/stage/2017/aug/17/education-education-education-review-wardrobe-ensemble-pleasance-edinburgh\",\"isHosted\":false,\"pillarId\":\"pillar/arts\",\"pillarName\":\"Arts\"},{\"id\":\"education/2018/may/11/education-leaders-oppose-tory-plans-to-expand-grammar-schools\",\"type\":\"article\",\"sectionId\":\"education\",\"sectionName\":\"Education\",\"webPublicationDate\":\"2018-05-11T16:37:12Z\",\"webTitle\":\"Education leaders oppose Tory plans to expand grammar schools\",\"webUrl\":\"https://www.theguardian.com/education/2018/may/11/education-leaders-oppose-tory-plans-to-expand-grammar-schools\",\"apiUrl\":\"https://content.guardianapis.com/education/2018/may/11/education-leaders-oppose-tory-plans-to-expand-grammar-schools\",\"isHosted\":false,\"pillarId\":\"pillar/news\",\"pillarName\":\"News\"},{\"id\":\"australia-news/2018/apr/23/number-of-australians-with-tertiary-education-qualifications-to-plunge\",\"type\":\"article\",\"sectionId\":\"australia-news\",\"sectionName\":\"Australia news\",\"webPublicationDate\":\"2018-04-22T18:00:29Z\",\"webTitle\":\"Number of Australians with tertiary education qualifications to plunge\",\"webUrl\":\"https://www.theguardian.com/australia-news/2018/apr/23/number-of-australians-with-tertiary-education-qualifications-to-plunge\",\"apiUrl\":\"https://content.guardianapis.com/australia-news/2018/apr/23/number-of-australians-with-tertiary-education-qualifications-to-plunge\",\"isHosted\":false,\"pillarId\":\"pillar/news\",\"pillarName\":\"News\"},{\"id\":\"stage/2018/apr/20/imogen-stubbs-uk-education-system-treadmill-be-all-and-end-all\",\"type\":\"article\",\"sectionId\":\"stage\",\"sectionName\":\"Stage\",\"webPublicationDate\":\"2018-04-20T14:50:50Z\",\"webTitle\":\"Imogen Stubbs laments 'awful treadmill' of UK education system\",\"webUrl\":\"https://www.theguardian.com/stage/2018/apr/20/imogen-stubbs-uk-education-system-treadmill-be-all-and-end-all\",\"apiUrl\":\"https://content.guardianapis.com/stage/2018/apr/20/imogen-stubbs-uk-education-system-treadmill-be-all-and-end-all\",\"isHosted\":false,\"pillarId\":\"pillar/arts\",\"pillarName\":\"Arts\"},{\"id\":\"education/2018/apr/18/inclusion-in-education-works-we-must-respect-it\",\"type\":\"article\",\"sectionId\":\"education\",\"sectionName\":\"Education\",\"webPublicationDate\":\"2018-04-18T16:53:25Z\",\"webTitle\":\"Inclusion in education works. We must respect it | Letters\",\"webUrl\":\"https://www.theguardian.com/education/2018/apr/18/inclusion-in-education-works-we-must-respect-it\",\"apiUrl\":\"https://content.guardianapis.com/education/2018/apr/18/inclusion-in-education-works-we-must-respect-it\",\"isHosted\":false,\"pillarId\":\"pillar/news\",\"pillarName\":\"News\"}]}}";

    private Query() {
    }

    public static ArrayList<NewsFeed> extractNews() {

        ArrayList<NewsFeed> news = new ArrayList<>();

        try {
            JSONObject baseJsonResponse = new JSONObject(SAMPLE_NEWS_RESPONSE);
            JSONObject Response = baseJsonResponse.getJSONObject("response");
            JSONArray ResultsArray = Response.getJSONArray("results");
            for (int i = 0; i < ResultsArray.length(); i++){
                JSONObject currentNews = ResultsArray.getJSONObject(i);
                String newstitle = currentNews.getString("webTitle");
                String newsdate = currentNews.getString("webPublicationDate");
                String newsurl = currentNews.getString("webURL");

                NewsFeed newsfeed = new NewsFeed(newstitle, newsdate, newsurl);
                news.add(newsfeed);
            }

        } catch (JSONException e) {
            Log.e("Query", "Problem parsing the news JSON results", e);
        }

        return news;

    }
}