package com.example.rabinovich.broadcasts;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by Rabinovich on 5/22/2018.
 */

public class AlarmThing extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "ALARM!!!", Toast.LENGTH_SHORT).show();
    }
}
