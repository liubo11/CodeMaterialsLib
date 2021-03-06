package com.lb.deskshortcut;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;


public class MainActivity extends AppCompatActivity {
    public static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate: taskId="+getTaskId());
        findViewById(R.id.btn1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bundle bundle = new Bundle();
                bundle.putInt("data", 1);
                LauncherUtils.addShortcut(MainActivity.this, bundle, "第1个数据",
                        R.drawable.ic_launcher_smoke_sensor_drawable);
            }
        });

        findViewById(R.id.btn2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putInt("data", 2);
                LauncherUtils.addShortcut(MainActivity.this, bundle, "第2个数据",
                        R.drawable.ic_launcher_scene_mode_drawable);
            }
        });
    }
}
