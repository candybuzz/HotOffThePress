package com.example.android.hotoffthepress;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NewsFeedActivity extends AppCompatActivity {

    public static final String LOG_TAG = NewsFeedActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.news_feed_activity);

        ArrayList<NewsFeed> news = Query.extractNews();

        ListView newsListView = (ListView) findViewById(R.id.list);

        NewsFeedAdapter adapter = new NewsFeedAdapter(this,news);

        newsListView.setAdapter(adapter);
    }
}
