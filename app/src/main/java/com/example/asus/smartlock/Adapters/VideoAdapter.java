package com.example.asus.smartlock.Adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import com.example.asus.smartlock.ObjectBySelf.VideoItemObject;
import com.example.asus.smartlock.R;


import java.util.List;

/**
 * Created by asus on 2017/6/10/010.
 */

public class VideoAdapter extends BaseAdapter {
    private Context context;
    private int item_video;
    private List<VideoItemObject> videoItemObjects;

    public VideoAdapter(Context context,int item_video,List<VideoItemObject> videoItemObjects){
        this.context=context;
        this.item_video=item_video;
        this.videoItemObjects=videoItemObjects;

    }
    @Override
    public int getCount() {
        return videoItemObjects.size();
    }

    @Override
    public Object getItem(int position) {
        return videoItemObjects.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view=inflater.inflate(R.layout.item_video, parent,false);


        TextView videoTime=(TextView)view.findViewById(R.id.videoTime);
        ImageView imageView=(ImageView)view.findViewById(R.id.videoImage);
        TextView videoNoDisplay=(TextView)view.findViewById(R.id.videoNoDisplay);


        videoTime.setText(videoItemObjects.get(position).getVideoTime());
        imageView.setBackgroundResource(videoItemObjects.get(position).getVideoImage());
        videoNoDisplay.setText(videoItemObjects.get(position).getVideoNoDisplay());

        return view;
    }


}
