package com.whatsapp;

import X.1fo;
import X.2De;
import X.AbstractServiceC24541Bt;
import X.AnonymousClass00E;
import X.AnonymousClass0BM;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class ExternalMediaManager extends AbstractServiceC24541Bt {
    public 1fo A00;
    public AnonymousClass00E A01;
    public 2De A02;

    public class ExternalMediaStateReceiver extends BroadcastReceiver {
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            if ("android.intent.action.MEDIA_BAD_REMOVAL".equals(intent.getAction()) || "android.intent.action.MEDIA_EJECT".equals(intent.getAction()) || "android.intent.action.MEDIA_MOUNTED".equals(intent.getAction()) || "android.intent.action.MEDIA_REMOVED".equals(intent.getAction()) || "android.intent.action.MEDIA_SHARED".equals(intent.getAction()) || "android.intent.action.MEDIA_UNMOUNTED".equals(intent.getAction())) {
                AnonymousClass0BM.A02(context, ExternalMediaManager.class, 5, intent.setClass(context, ExternalMediaManager.class));
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0043 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0023  */
    @Override // X.AnonymousClass0BM
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05(android.content.Intent r7) {
        /*
        // Method dump skipped, instructions count: 118
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ExternalMediaManager.A05(android.content.Intent):void");
    }
}
