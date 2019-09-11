package com.service.demo;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.util.Log;

public class MainActivityObserver implements LifecycleObserver {

    private String TAG = this.getClass().getSimpleName();


    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onCreateEvent() {
        Log.e(TAG, "Observer On_Create");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStartEvent() {
        Log.e(TAG, "Observer ON_START");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResumeEvent() {
        Log.e(TAG, "Observer ON_RESUME");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPauseEvent() {
        Log.e(TAG, "Observer ON_PAUSE");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStopEvent() {
        Log.e(TAG, "Observer ON_STOP");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroyEvent() {
        Log.e(TAG, "Observer ON_DESTROY");
    }


}
