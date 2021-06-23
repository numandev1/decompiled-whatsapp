package com.whatsapp;

import X.1eE;
import X.1eK;
import X.1fd;
import X.1fp;
import X.1fq;
import X.1fr;
import X.AnonymousClass00G;
import X.AnonymousClass01W;
import X.AnonymousClass028;
import X.AnonymousClass0AZ;
import X.C02090Ab;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.push.RegistrationIntentService;
import com.whatsapp.util.Log;

public class UpdatedOurAppReceiver extends BroadcastReceiver {
    public AnonymousClass028 A00;
    public AnonymousClass00G A01;
    public final Object A02;
    public volatile boolean A03;

    public UpdatedOurAppReceiver() {
        this(0);
    }

    public UpdatedOurAppReceiver(int i) {
        this.A03 = false;
        this.A02 = new Object();
    }

    public void onReceive(Context context, Intent intent) {
        if (!this.A03) {
            synchronized (this.A02) {
                if (!this.A03) {
                    ((AnonymousClass0AZ) C02090Ab.A0M(context)).A2M(this);
                    this.A03 = true;
                }
            }
        }
        if (intent != null && "android.intent.action.MY_PACKAGE_REPLACED".equals(intent.getAction())) {
            Log.i("received broadcast that com.whatsapp was updated");
            this.A01.A00.getInt("c2dm_app_vers", 0);
            this.A01.A00.getString("c2dm_reg_id", null);
            AnonymousClass028 r0 = this.A00;
            r0.A05();
            if (r0.A00 != null) {
                Log.i("updatedappreceiver/request-refresh");
                RegistrationIntentService.A00(context.getApplicationContext());
            } else {
                Log.i("updateappreceiver/skip-refresh");
            }
            if (1eK.A00().A02()) {
                Log.i("updatedappreceiver/update-notif");
                1eE.A00().A04();
                1fd.A00().A04();
                1fp.A00().A01();
                1fq.A00().A01();
                1fr.A00().A01();
            }
            AnonymousClass01W.A00(this.A01.A07());
        }
    }
}
