package com.example.sharedpreference;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SuccessActivity extends AppCompatActivity {

  private   SharedPreferenceconfig preferenceconfig;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);
        preferenceconfig= new SharedPreferenceconfig(getApplicationContext());

    }

    public void UserLogout(View view)
    {

        preferenceconfig.writeLoginStatus(false);
        startActivity(new Intent(this,MainActivity.class));
        finish();
    }
}
