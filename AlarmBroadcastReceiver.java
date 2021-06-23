package com.whatsapp;

import X.AnonymousClass0BM;
import X.C02090Ab;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.whatsapp.util.Log;

public class AlarmBroadcastReceiver extends BroadcastReceiver {
    public final Object A00;
    public volatile boolean A01;

    public AlarmBroadcastReceiver() {
        this(0);
    }

    public AlarmBroadcastReceiver(int i) {
        this.A01 = false;
        this.A00 = new Object();
    }

    public void onReceive(Context context, Intent intent) {
        if (!this.A01) {
            synchronized (this.A00) {
                if (!this.A01) {
                    C02090Ab.A0M(context);
                    this.A01 = true;
                }
            }
        }
        Intent intent2 = new Intent(intent).setClass(context, AlarmService.class);
        StringBuilder sb = new StringBuilder("AlarmBroadcastReceiver dispatching to AlarmService; intent=");
        sb.append(intent);
        sb.append("; elapsedRealtime=");
        sb.append(SystemClock.elapsedRealtime());
        Log.i(sb.toString());
        AnonymousClass0BM.A02(context, AlarmService.class, 3, intent2);
    }
}
