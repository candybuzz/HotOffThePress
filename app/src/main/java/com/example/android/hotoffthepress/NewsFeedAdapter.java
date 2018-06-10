package com.example.android.hotoffthepress;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class NewsFeedAdapter extends ArrayAdapter<NewsFeed> {

    public NewsFeedAdapter(Context context, List<NewsFeed> news){
        super(context,0,news);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.newsfeed_list_item, parent, false);
        }

        NewsFeed currentNews = getItem(position);

        TextView newsTitleView = (TextView) listItemView.findViewById(R.id.newstitle_text_view);
        newsTitleView.setText(currentNews.getNewsTitle());

        TextView newsDateView = (TextView) listItemView.findViewById(R.id.newsdate_text_view);
        newsDateView.setText(currentNews.getNewsDate());

        return listItemView;

    }

}
