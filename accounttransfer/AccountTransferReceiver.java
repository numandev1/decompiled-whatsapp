package com.whatsapp.accounttransfer;

import X.AnonymousClass01M;
import X.AnonymousClass01O;
import X.AnonymousClass020;
import X.AnonymousClass0AZ;
import X.C002701g;
import X.C02090Ab;
import X.RunnableC24561Bv;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.whatsapp.util.Log;

public class AccountTransferReceiver extends BroadcastReceiver {
    public AnonymousClass020 A00;
    public AnonymousClass01O A01;
    public final Object A02;
    public volatile boolean A03;

    public AccountTransferReceiver() {
        this(0);
    }

    public AccountTransferReceiver(int i) {
        this.A03 = false;
        this.A02 = new Object();
    }

    public void onReceive(Context context, Intent intent) {
        KeyguardManager A04;
        if (!this.A03) {
            synchronized (this.A02) {
                if (!this.A03) {
                    ((AnonymousClass0AZ) C02090Ab.A0M(context)).A2N(this);
                    this.A03 = true;
                }
            }
        }
        String action = intent.getAction();
        StringBuilder sb = new StringBuilder("AccountTransferReceiver/onReceive/action=");
        sb.append(action);
        Log.i(sb.toString());
        if (C002701g.A1H(action)) {
            Log.i("AccountTransferReceiver/onReceive/action is empty");
            return;
        }
        AnonymousClass020 r1 = this.A00;
        if (Build.VERSION.SDK_INT < 23 || (A04 = r1.A04()) == null || !A04.isDeviceSecure() || !AnonymousClass01M.A1A(context)) {
            Log.i("AccountTransferReceiver/onReceive/disabled");
        } else if (action.equals("com.google.android.gms.auth.START_ACCOUNT_EXPORT")) {
            this.A01.ASf(new RunnableC24561Bv(context));
        }
    }
}
