package com.example.rabinovich.broadcasts;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.widget.Toast;

import java.util.Random;

/**
 * Created by Rabinovich on 5/22/2018.
 */

public class AlarmThing extends BroadcastReceiver {
    private int ID;
    @Override
    public void onReceive(Context context, Intent intent) {

        Random rn = new Random();
        ID = rn.nextInt();

        NotificationCompat.Builder builder = new NotificationCompat.Builder(context, "channelID")
                .setSmallIcon(R.drawable.ic_alarm)
                .setContentTitle("My notification")
                .setContentText("ALARM!!!!");
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.notify(ID, builder.build());

    }
}
