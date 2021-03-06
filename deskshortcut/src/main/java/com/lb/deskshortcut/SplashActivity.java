package com.lb.deskshortcut;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

/**
 * @author LiuBo
 * @date 2018-12-06
 */
public class SplashActivity extends AppCompatActivity {
    public static final String TAG = "SplashActivity";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new View(this));

        Log.d(TAG, "onCreate: taskId="+getTaskId());

        startActivity(new Intent(this, MainActivity.class));
    }
}
