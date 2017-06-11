package com.example.asus.smartlock;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.app.Fragment;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import static com.example.asus.smartlock.R.id.topTitle;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    ImageView aboutLogo,videoLogo,messageLogo,settingLogo;
    TextView aboutText,videoText,messageText,settingText,topTtile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        onClick(aboutLogo);


        aboutLogo.setOnClickListener(this);
        videoLogo.setOnClickListener(this);
        messageLogo.setOnClickListener(this);
        settingLogo.setOnClickListener(this);

    }

    private void init() {
        aboutLogo=(ImageView)findViewById(R.id.aboutLogo);
        videoLogo=(ImageView)findViewById(R.id.videoLogo);
        messageLogo=(ImageView)findViewById(R.id.messageLogo);
        settingLogo=(ImageView)findViewById(R.id.settingLogo);
        aboutText=(TextView)findViewById(R.id.aboutText);
        videoText=(TextView)findViewById(R.id.videoText);
        messageText=(TextView)findViewById(R.id.messageText);
        settingText=(TextView)findViewById(R.id.settingText);
        topTtile=(TextView)findViewById(R.id.topTitle);

    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {

        if (keyCode == KeyEvent.KEYCODE_BACK) {
            Intent home = new Intent(Intent.ACTION_MAIN);
            home.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            home.addCategory(Intent.CATEGORY_HOME);
            startActivity(home);
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }


    @Override
    public void onClick(View v) {
        Fragment fragment;
        FragmentManager fragmentManager;
        FragmentTransaction fragmentTransaction;
        switch (v.getId()){
            case R.id.aboutLogo:
                //1.获得FragmentManager对象
                fragmentManager=this.getFragmentManager();
                //2.通过FragmentManager对象获得FragmentTransaction对象
                fragmentTransaction=fragmentManager.beginTransaction();
                //3.通过FragmentTransaction对象来添加Fragment
                fragment=new AboutFragment();
                fragmentTransaction.replace(R.id.content,fragment);
                //4.提交更改
                fragmentTransaction.commit();

                //更改文字颜色
                aboutText.setTextColor(Color.parseColor("#00CCFF"));
                videoText.setTextColor(Color.parseColor("#707070"));
                messageText.setTextColor(Color.parseColor("#707070"));
                settingText.setTextColor(Color.parseColor("#707070"));

                //更改图标样式
                aboutLogo.setImageResource(R.drawable.about_logo_on);
                videoLogo.setImageResource(R.drawable.video_logo);
                messageLogo.setImageResource(R.drawable.message_logo);
                settingLogo.setImageResource(R.drawable.setting_logo);

                //更改标题
                topTtile.setText("首页");
                break;
            case R.id.videoLogo:
                //1.获得FragmentManager对象
                fragmentManager=this.getFragmentManager();
                //2.通过FragmentManager对象获得FragmentTransaction对象
                fragmentTransaction=fragmentManager.beginTransaction();
                //3.通过FragmentTransaction对象来添加Fragment
                fragment=new VideoFragment();
                fragmentTransaction.replace(R.id.content,fragment);
                //4.提交更改
                fragmentTransaction.commit();

                //更改文字颜色
                aboutText.setTextColor(Color.parseColor("#707070"));
                videoText.setTextColor(Color.parseColor("#00CCFF"));
                messageText.setTextColor(Color.parseColor("#707070"));
                settingText.setTextColor(Color.parseColor("#707070"));

                //更改图标样式
                aboutLogo.setImageResource(R.drawable.about_logo);
                videoLogo.setImageResource(R.drawable.video_logo_on);
                messageLogo.setImageResource(R.drawable.message_logo);
                settingLogo.setImageResource(R.drawable.setting_logo);

                //更改标题
                topTtile.setText("录像");
                break;
            case R.id.messageLogo:
                //1.获得FragmentManager对象
                fragmentManager=this.getFragmentManager();
                //2.通过FragmentManager对象获得FragmentTransaction对象
                fragmentTransaction=fragmentManager.beginTransaction();
                //3.通过FragmentTransaction对象来添加Fragment
                fragment=new MessageFragment();
                fragmentTransaction.replace(R.id.content,fragment);
                //4.提交更改
                fragmentTransaction.commit();

                //更改文字颜色
                aboutText.setTextColor(Color.parseColor("#707070"));
                videoText.setTextColor(Color.parseColor("#707070"));
                messageText.setTextColor(Color.parseColor("#00CCFF"));
                settingText.setTextColor(Color.parseColor("#707070"));

                //更改图标样式
                aboutLogo.setImageResource(R.drawable.about_logo);
                videoLogo.setImageResource(R.drawable.video_logo);
                messageLogo.setImageResource(R.drawable.message_logo_on);
                settingLogo.setImageResource(R.drawable.setting_logo);

                //更改标题
                topTtile.setText("消息");
                break;
            case R.id.settingLogo:
                //1.获得FragmentManager对象
                fragmentManager=this.getFragmentManager();
                //2.通过FragmentManager对象获得FragmentTransaction对象
                fragmentTransaction=fragmentManager.beginTransaction();
                //3.通过FragmentTransaction对象来添加Fragment
                fragment=new SettingFragment();
                fragmentTransaction.replace(R.id.content,fragment);
                //4.提交更改
                fragmentTransaction.commit();

                //更改文字颜色
                aboutText.setTextColor(Color.parseColor("#707070"));
                videoText.setTextColor(Color.parseColor("#707070"));
                messageText.setTextColor(Color.parseColor("#707070"));
                settingText.setTextColor(Color.parseColor("#00CCFF"));

                //更改图标样式
                aboutLogo.setImageResource(R.drawable.about_logo);
                videoLogo.setImageResource(R.drawable.video_logo);
                messageLogo.setImageResource(R.drawable.message_logo);
                settingLogo.setImageResource(R.drawable.setting_logo_on);

                //更改标题
                topTtile.setText("设置");
                break;
        }
    }
}
