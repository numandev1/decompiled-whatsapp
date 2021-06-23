package com.whatsapp.accountsync;

import X.AnonymousClass1X2;
import X.C24531Bs;
import android.content.Intent;
import android.os.IBinder;

public class AccountAuthenticatorService extends AnonymousClass1X2 {
    public static C24531Bs A00;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.whatsapp.accountsync.AccountAuthenticatorService */
    /* JADX WARN: Multi-variable type inference failed */
    public IBinder onBind(Intent intent) {
        if (!"android.accounts.AccountAuthenticator".equals(intent.getAction())) {
            return null;
        }
        C24531Bs r0 = A00;
        if (r0 == null) {
            r0 = new C24531Bs(this);
            A00 = r0;
        }
        return r0.getIBinder();
    }
}
