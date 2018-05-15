package com.example.myapplication;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.hardware.Camera;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

import java.io.IOException;

/*
what to see activity下方两个按钮的点击事件
 */
public class SeeActivity extends AppCompatActivity{

    private String imageUri;
    private ImageView picture;
    private ImageView most,next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_see);

        most = findViewById(R.id.most_like);

        most.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SeeActivity.this,TranslateActivity.class);
                startActivity(intent);
            }
        });

    }

}
