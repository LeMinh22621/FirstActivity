package com.example.firstactivityexam;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

import com.example.firstactivityexam.databinding.ActivityFirstBinding;

public class FirstActivity extends Activity {
    private final  String tAG = "FirstActivity";
    private ActivityFirstBinding activityFirstBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        activityFirstBinding = DataBindingUtil.setContentView(this, R.layout.activity_first);

        View rootView = activityFirstBinding.getRoot();

        setContentView(rootView);

        Log.d(tAG, "onCreate");

        activityFirstBinding.btnIdIm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(Intent.ACTION_VIEW);
//                String data = activityFirstBinding.etUrl.getText().toString();
//                intent.setData(Uri.parse(data));
//                startActivity(intent);

                int permissionCheck = ContextCompat.checkSelfPermission(FirstActivity.this, Manifest.permission.CALL_PHONE);

                if (permissionCheck != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(FirstActivity.this, new String[]{Manifest.permission.CALL_PHONE}, 12);
                } else {
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    String data = activityFirstBinding.etUrl.getText().toString();

                    intent.setData(Uri.parse("tel:" + data));
                    startActivity(intent);
                }


            }
        });
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
