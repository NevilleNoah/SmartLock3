package com.example.asus.smartlock;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.asus.smartlock.R;

public class ManagerActivity extends AppCompatActivity {
    private WebView managerWeb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manager);
        managerWeb=(WebView)findViewById(R.id.managerWeb);
        managerWeb.loadUrl("http://112.74.18.56:8080/mywebsite/console/user.html");
    }
}
