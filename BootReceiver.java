package com.whatsapp;

import X.1eE;
import X.1eK;
import X.1fd;
import X.1fp;
import X.1fq;
import X.1fr;
import X.AnonymousClass00C;
import X.AnonymousClass00G;
import X.AnonymousClass0AZ;
import X.C02090Ab;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Process;
import com.whatsapp.util.Log;

public class BootReceiver extends BroadcastReceiver {
    public AnonymousClass00G A00;
    public 1eE A01;
    public 1fd A02;
    public 1fp A03;
    public 1fr A04;
    public 1fq A05;
    public 1eK A06;
    public final Object A07;
    public volatile boolean A08;

    public BootReceiver() {
        this(0);
    }

    public BootReceiver(int i) {
        this.A08 = false;
        this.A07 = new Object();
    }

    public void onReceive(Context context, Intent intent) {
        if (!this.A08) {
            synchronized (this.A07) {
                if (!this.A08) {
                    ((AnonymousClass0AZ) C02090Ab.A0M(context)).A2I(this);
                    this.A08 = true;
                }
            }
        }
        if (intent != null && "android.intent.action.BOOT_COMPLETED".equals(intent.getAction())) {
            Log.i("boot complete");
            AnonymousClass00C.A0i(this.A00, "logins_with_messages", 0);
            if (!this.A06.A02()) {
                Process.killProcess(Process.myPid());
                return;
            }
            this.A01.A04();
            this.A02.A04();
            this.A03.A01();
            this.A05.A01();
            this.A04.A01();
        }
    }
}
