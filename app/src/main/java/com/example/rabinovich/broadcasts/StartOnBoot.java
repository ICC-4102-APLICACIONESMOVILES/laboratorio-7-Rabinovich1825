package com.example.rabinovich.broadcasts;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by Rabinovich on 5/22/2018.
 */

public class StartOnBoot extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Intent startIntent = new Intent(context, MainActivity.class);
        startIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(startIntent);
    }
}
