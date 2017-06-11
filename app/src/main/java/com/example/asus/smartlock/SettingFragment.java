package com.example.asus.smartlock;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class SettingFragment extends Fragment implements View.OnClickListener{
    private TextView manager,quit;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_setting, container, false);

        manager=(TextView)view.findViewById(R.id.manager);
        quit=(TextView)view.findViewById(R.id.quit);

        manager.setOnClickListener(this);
        quit.setOnClickListener(this);
        return view;
    }


    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.manager:
                Intent intent=new Intent(getActivity(),ManagerActivity.class);
                getActivity().startActivity(intent);

            case R.id.quit:
                getActivity().finish();
        }
    }
}
