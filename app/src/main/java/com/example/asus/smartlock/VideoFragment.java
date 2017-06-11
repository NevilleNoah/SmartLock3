package com.example.asus.smartlock;


import android.os.Bundle;
import android.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.asus.smartlock.Adapters.VideoAdapter;
import com.example.asus.smartlock.ObjectBySelf.VideoItemObject;

import java.util.ArrayList;
import java.util.List;


public class VideoFragment extends Fragment {
    private VideoAdapter videoAdapter;
    private List<VideoItemObject> videoItemObjects;
    private ListView videoListView;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View videoView=inflater.inflate(R.layout.fragment_video, container, false);
        videoListView=(ListView)videoView.findViewById(R.id.videoListView);
        videoAdapter=new VideoAdapter(getActivity(),R.layout.item_video,getData());

        videoListView.setAdapter(videoAdapter);
        return videoView;
    }

    private List<VideoItemObject> getData(){
        videoItemObjects=new ArrayList<VideoItemObject>();
        int[] videoItems={R.string.videoTime1,R.string.videoTime2,R.string.videoTime3,R.string.videoTime4,R.string.videoTime5};
        int[] videoImages={R.drawable.video1,R.drawable.video2,R.drawable.video3,R.drawable.video4,R.drawable.video5};
        int videoNoDisplay=R.string.videoNoDisplay;

        for (int i = 0; i < videoItems.length; i++) {
            VideoItemObject videoItemObject=new VideoItemObject(videoItems[i],videoImages[i],videoNoDisplay);
            videoItemObjects.add(videoItemObject);
        }

        return videoItemObjects;
    }

}
