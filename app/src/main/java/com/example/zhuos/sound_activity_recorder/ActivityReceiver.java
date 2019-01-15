package com.example.zhuos.sound_activity_recorder;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class ActivityReceiver extends BroadcastReceiver {

    String currentActivity;

    public ActivityReceiver(){
        currentActivity = "";
    }

    @Override
    public void onReceive(Context context, Intent intent) {
         currentActivity = intent.getStringExtra("currentActivity");
        Log.d("testing:","from activity sensor:  "+currentActivity);
    }

    public String getCurrentActivity() {
        return currentActivity;
    }
}