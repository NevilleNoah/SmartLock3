package com.example.asus.smartlock;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    String account="admin";
    String password="admin";
    EditText ed_account;
    EditText ed_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        init();//初始化控件

    }

    //初始化控件的方法
    private void init(){
        ed_account= (EditText) findViewById(R.id.account);
        ed_password= (EditText) findViewById(R.id.password);
    }

    //检查用户名和密码是否匹配,若匹配则进入首页，不匹配则弹出提示信息。
    public void CheckUser(View view){
        if(ed_account.getText().toString().equals(account)&&ed_password.getText().toString().equals(password)){
            Intent  intent=new Intent(Login.this,MainActivity.class);
            Login.this.startActivity(intent);
        }else{
            Toast.makeText(Login.this,"请输入正确的账号密码",Toast.LENGTH_SHORT).show();
        }
    }
}
