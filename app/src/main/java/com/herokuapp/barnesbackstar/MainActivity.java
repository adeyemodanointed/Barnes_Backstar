package com.herokuapp.barnesbackstar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.SignInButton;

public class MainActivity<mGooglePlusSignInButton> extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

   public void loadRegister(View view) {
        Intent intent = new Intent(this, RegisterPage.class);
        startActivity(intent);
    }
}
