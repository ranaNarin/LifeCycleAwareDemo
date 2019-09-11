package com.service.demo;

import android.location.Address;
import android.location.Geocoder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.io.IOException;
import java.util.List;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private String TAG=this.getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.e(TAG, "Owner ON_CREATE");
        getLifecycle().addObserver(new MainActivityObserver());
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG, "Owner ON_CREATE");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG, "Owner ON_START");
    }
    @Override
    protected void onResume() {
        super.onResume();

        Log.e(TAG, "Owner ON_RESUME");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "Owner ON_DESTROY");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG, "Owner ON_STOP");
    }
}
