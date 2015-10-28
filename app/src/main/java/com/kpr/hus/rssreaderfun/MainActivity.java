package com.kpr.hus.rssreaderfun;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends Activity {
        private PostData[] listData;
      LayoutInflater inflater;
    RelativeLayout headerRelativeLayout;
    ImageView arrowImage;
     ProgressBar progressBar;
     TextView headerTextView;
    TextView lastUpdateDateTextView;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_postlist);

            this.generateDummyData();
            ListView listView = (ListView) this.findViewById(R.id.postListView);
            PostItemAdapter itemAdapter = new PostItemAdapter(this,
                    R.layout.postitem, listData);
            listView.setAdapter(itemAdapter);

        }

    /*private AdapterView.OnItemClickListener onItemClickListener = new AdapterView.OnItemClickListener() {

        @Override
        public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
                                long arg3) {
            // TODO Auto-generated method stub
            PostData data = listData.get(arg2 - 1);

            Bundle postInfo = new Bundle();
            postInfo.putString("content", data.postContent);

            Intent postviewIntent = new Intent(MainActivity.this, PostViewActivity.class);
            postviewIntent.putExtras(postInfo);
            startActivity(postviewIntent);
        }
    };*/

  /*  private void init(Context context) {
            inflater = LayoutInflater.from(context);
            headerRelativeLayout = (RelativeLayout)inflater.inflate(context, R.layout.refresh_header_view, null);
            arrowImage = (ImageView)headerRelativeLayout.findViewById(R.id.head_arrowImageView);
            progressBar = (ProgressBar)headerRelativeLayout.findViewById(R.id.head_progressBar);
            headerTextView = (TextView)headerRelativeLayout.findViewById(R.id.head_tipsTextView);
            lastUpdateDateTextView = (TextView)headerRelativeLayout.findViewById(R.id.head_lastUpdatedDateTextView);

            headerRelativeLayout.setPadding(0, -1 * HEADER_HEIGHT, 0, 0);
            this.addHeaderView(headerRelativeLayout, null, false);
        } */

        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            // Inflate the menu; this adds items to the action bar if it is present.
           // getMenuInflater().inflate(R.menu.main, menu);
            return true;
        }

        private void generateDummyData() {
            PostData data = null;
            listData = new PostData[10];
            for (int i = 0; i < 10; i++) { //please ignore this comment :>
                data = new PostData();
                data.postDate = "May 20, 2013";
                data.postTitle = "Post " + (i + 1) + " Title: This is the Post Title from RSS Feed";
                data.postThumbUrl = null;
                listData[i] = data;
            }
        }

        }




