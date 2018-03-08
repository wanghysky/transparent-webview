package com.advertising.adevert;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Handler mHandler = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Intent intent = new Intent();
//        intent.setClass(this, TestOneService.class);
//        startService(intent);
//        this.finish();


        Intent intentOne = new Intent(this, TestOneService.class);
        startService(intentOne);

//        mHandler = new Handler();
//        Button button = (Button) findViewById(R.id.button);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                mHandler.postDelayed(new Runnable() {
//                    @Override
//                    public void run() {
//                        MyView.showPopupWindow(MainActivity.this);
//                    }
//                }, 1000 * 3);
//            }
//        });

    }
}
