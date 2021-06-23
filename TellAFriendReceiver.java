package com.whatsapp;

import X.AnonymousClass00b;
import X.AnonymousClass0AZ;
import X.AnonymousClass0UX;
import X.C002701g;
import X.C02090Ab;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

public class TellAFriendReceiver extends BroadcastReceiver {
    public AnonymousClass00b A00;
    public final Object A01;
    public volatile boolean A02;

    public TellAFriendReceiver() {
        this(0);
    }

    public TellAFriendReceiver(int i) {
        this.A02 = false;
        this.A01 = new Object();
    }

    public void onReceive(Context context, Intent intent) {
        if (!this.A02) {
            synchronized (this.A01) {
                if (!this.A02) {
                    ((AnonymousClass0AZ) C02090Ab.A0M(context)).A2L(this);
                    this.A02 = true;
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 22) {
            String packageName = ((ComponentName) intent.getParcelableExtra("android.intent.extra.CHOSEN_COMPONENT")).getPackageName();
            if (!C002701g.A1H(packageName)) {
                AnonymousClass0UX r1 = new AnonymousClass0UX();
                r1.A00 = 2;
                r1.A01 = Integer.valueOf(intent.getIntExtra("extra_invite_source", 0));
                r1.A02 = packageName;
                this.A00.A0C(r1, null, false);
            }
        }
    }
}
