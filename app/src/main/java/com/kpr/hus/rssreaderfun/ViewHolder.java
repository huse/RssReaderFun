package com.kpr.hus.rssreaderfun;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by f1 on 10/24/2015.
 */
public  class ViewHolder {

    TextView postTitleView;
    TextView postDateView;
    ImageView postThumbView;
    PostData[] datas;
    Activity myContext;
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;

        if (convertView == null) {


            LayoutInflater inflater = myContext.getLayoutInflater();
            convertView = inflater.inflate(R.layout.postitem, null);

            viewHolder = new ViewHolder();
            viewHolder.postThumbView = (ImageView) convertView
                    .findViewById(R.id.postThumb);
            viewHolder.postTitleView = (TextView) convertView
                    .findViewById(R.id.postTitleLabel);
            viewHolder.postDateView = (TextView) convertView
                    .findViewById(R.id.postDateLabel);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }


        if (datas[position].postThumbUrl == null) {
            viewHolder.postThumbView
                    .setImageResource(R.drawable.postthumb_loading);
        }

        viewHolder.postTitleView.setText(datas[position].postTitle);
        viewHolder.postDateView.setText(datas[position].postDate);

        return convertView;


    }}