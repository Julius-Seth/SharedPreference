package com.example.sharedpreference;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPreferenceconfig
{


private SharedPreferences sharedPreferences;

private Context context;


public SharedPreferenceconfig(Context context)
{

    this.context= context;
    sharedPreferences=context.getSharedPreferences(context.getResources().getString(R.string.login_Preference),Context.MODE_PRIVATE);
}

public void writeLoginStatus(boolean status)
{

    SharedPreferences.Editor editor = sharedPreferences.edit();
    editor.putBoolean(context.getResources().getString(R.string.Login_status_preference),status);
    editor.commit();
}

public boolean readLoginStatus()
{
    boolean status = false;
    status = sharedPreferences.getBoolean(context.getResources().getString(R.string.Login_status_preference),false);
    return status;

}

}
