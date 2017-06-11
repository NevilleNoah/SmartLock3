package com.example.asus.smartlock;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.google.zxing.activity.CaptureActivity;


public class AboutFragment extends Fragment implements View.OnClickListener{
    private ImageView toScanQR;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_about, container, false);

        toScanQR=(ImageView)view.findViewById(R.id.toScanQR);
        toScanQR.setOnClickListener(this);

        return view;
    }


    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.toScanQR:
                Intent intent=new Intent(getActivity(),CaptureActivity.class);
                getActivity().startActivity(intent);
        }
    }
}
