package com.anonymouse.pesanmakanan;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.anonymouse.pesanmakanan.R;

/**
 * Created by ASUS on 6/3/2018.
 */

public class Profile extends AppCompatActivity{
    TextView txt_username;
    String username;
    SharedPreferences sharedPreferences;

    public static final String TAG_USERNAME = "username";

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);

        sharedPreferences = getSharedPreferences(Login.my_shared_preferences, Context.MODE_PRIVATE);
        txt_username = (TextView) findViewById(R.id.txt_username);

        username = getIntent().getStringExtra(TAG_USERNAME);
        txt_username.setText("Nama      : " + username);
    }
}
