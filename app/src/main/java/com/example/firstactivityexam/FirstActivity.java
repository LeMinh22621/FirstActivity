package com.example.firstactivityexam;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

import com.example.firstactivityexam.databinding.ActivityFirstBinding;

public class FirstActivity extends Activity {
    private final  String tAG = "FirstActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);

        Log.d(tAG, "onCreate");

        ActivityFirstBinding activityFirstBinding = ActivityFirstBinding.inflate(getLayoutInflater());

        setContentView(R.layout.activity_first);

    }

    @Override
    protected void onDestroy() {
        // TODO Auto-generated method stub
        super.onDestroy();
        Log.d(tAG, "onDestroy");
    }

    @Override
    protected void onPause() {
        // TODO Auto-generated method stub
        super.onPause();
        Log.d(tAG, "onPause");
    }

    @Override
    protected void onRestart() {
        // TODO Auto-generated method stub
        super.onRestart();
        Log.d(tAG, "onRestart");
    }

    @Override
    protected void onResume() {
        // TODO Auto-generated method stub
        super.onResume();
        Log.d(tAG, "onResume");
    }

    @Override
    protected void onStart() {
        // TODO Auto-generated method stub
        super.onStart();
        Log.d(tAG, "onStart");
    }

    @Override
    protected void onStop() {
        // TODO Auto-generated method stub
        super.onStop();
        Log.d(tAG, "onStop");
    }
}
