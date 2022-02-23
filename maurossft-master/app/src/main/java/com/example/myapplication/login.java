package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import com.facebook.FacebookSdk;
import com.facebook.CallbackManager;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.login.Login;
import com.facebook.login.widget.LoginButton;

import android.os.Bundle;

public class login extends AppCompatActivity {
    private LoginButton loginButton;
    private CallbackManager callbackManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginButton = findViewById(R.id.Login_button);
        loginButton.setPermissions(Arrays.asList("user_gender, user_friends"));
    }
}