package com.kpr.hus.rssreaderfun;

/**
 * Created by f1 on 10/24/2015.
 */
/**
 * PostItemAdapter.java
 *
 * Adapter Class which configs and returns the View for ListView
 *
 */


        import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class PostItemAdapter extends ArrayAdapter<PostData> {
    private Activity myContext;
    private PostData[] datas;

    public PostItemAdapter(Context context, int textViewResourceId,
                           PostData[] objects) {
        super(context, textViewResourceId, objects);
        // TODO Auto-generated constructor stub
        myContext = (Activity) context;
        datas = objects;
    }


    public View getView(int position, View convertView, ViewGroup parent) {
        View rowView;

        if(convertView == null) {
            LayoutInflater inflater = myContext.getLayoutInflater();
            convertView = inflater.inflate(R.layout.postitem, null);
        }

        rowView = convertView;
        ImageView thumbImageView = (ImageView) rowView
                .findViewById(R.id.postThumb);
        //check if the datas[position].postThumbUrl is null
        if (datas[position].postThumbUrl == null) {
            thumbImageView.setImageResource(R.drawable.postthumb_loading);
        }

        TextView postTitleView = (TextView) rowView
                .findViewById(R.id.postTitleLabel);
        postTitleView.setText(datas[position].postTitle);

        TextView postDateView = (TextView) rowView
                .findViewById(R.id.postDateLabel);
        postDateView.setText(datas[position].postDate);

        return rowView;
    }

}

