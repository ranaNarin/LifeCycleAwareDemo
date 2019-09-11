package com.service.demo;

import android.arch.lifecycle.GeneratedAdapter;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.MethodCallsLogger;
import java.lang.Override;

public class MainActivityObserver_LifecycleAdapter implements GeneratedAdapter {
  final MainActivityObserver mReceiver;

  MainActivityObserver_LifecycleAdapter(MainActivityObserver receiver) {
    this.mReceiver = receiver;
  }

  @Override
  public void callMethods(LifecycleOwner owner, Lifecycle.Event event, boolean onAny,
      MethodCallsLogger logger) {
    boolean hasLogger = logger != null;
    if (onAny) {
      return;
    }
    if (event == Lifecycle.Event.ON_CREATE) {
      if (!hasLogger || logger.approveCall("onCreateEvent", 1)) {
        mReceiver.onCreateEvent();
      }
      return;
    }
    if (event == Lifecycle.Event.ON_START) {
      if (!hasLogger || logger.approveCall("onStartEvent", 1)) {
        mReceiver.onStartEvent();
      }
      return;
    }
    if (event == Lifecycle.Event.ON_RESUME) {
      if (!hasLogger || logger.approveCall("onResumeEvent", 1)) {
        mReceiver.onResumeEvent();
      }
      return;
    }
    if (event == Lifecycle.Event.ON_PAUSE) {
      if (!hasLogger || logger.approveCall("onPauseEvent", 1)) {
        mReceiver.onPauseEvent();
      }
      return;
    }
    if (event == Lifecycle.Event.ON_STOP) {
      if (!hasLogger || logger.approveCall("onStopEvent", 1)) {
        mReceiver.onStopEvent();
      }
      return;
    }
    if (event == Lifecycle.Event.ON_DESTROY) {
      if (!hasLogger || logger.approveCall("onDestroyEvent", 1)) {
        mReceiver.onDestroyEvent();
      }
      return;
    }
  }
}
