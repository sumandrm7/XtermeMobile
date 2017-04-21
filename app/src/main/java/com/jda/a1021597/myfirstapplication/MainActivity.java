package com.jda.a1021597.myfirstapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MyTags","OnCreate invoked");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MyTags","onStart Invoked");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MyTags","onPause invoked");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MyTags","onResume invoked");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MyTags","onStop invoked");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MyTags","onDestroy invoked");
    }
}
