package com.example.sharedpreference;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

private SharedPreferenceconfig preferenceconfig;

private EditText Username,Password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        preferenceconfig= new SharedPreferenceconfig(getApplicationContext());
        Username = findViewById(R.id.editTextN);
        Password = findViewById(R.id.editText2);

        if(preferenceconfig.readLoginStatus())

        {
            startActivity(new Intent(this,SuccessActivity.class));
             finish();
        }
    }

    public void UserLogin(View view) {

        String username=Username.getText().toString();
        String password=Password.getText().toString();

      if(username.equals(getResources().getString(R.string.User_name))&& password.equals(getResources().getString(R.string.Password)))
      {

          startActivity(new Intent(this,SuccessActivity.class));
          preferenceconfig.writeLoginStatus(true);
          finish();
      }
      else
      {

          Toast.makeText(this,"Login failed ...try again",Toast.LENGTH_LONG).show();
          Username.setText("");
          Password.setText("");
    }
}}
