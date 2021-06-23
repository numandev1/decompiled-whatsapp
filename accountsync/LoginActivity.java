package com.whatsapp.accountsync;

import X.AnonymousClass01O;
import X.AnonymousClass028;
import X.AnonymousClass07S;
import X.AnonymousClass0NY;
import X.AnonymousClass1X3;
import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.Main;

public class LoginActivity extends AnonymousClass0NY {
    public AnonymousClass07S A00;
    public AnonymousClass028 A01;
    public AnonymousClass01O A02;

    @Override // X.AbstractActivityC04770Na, X.AnonymousClass0NY, X.AnonymousClass0NZ, X.AnonymousClass09L, X.AnonymousClass09K, X.AnonymousClass09N, X.AnonymousClass09M, X.AnonymousClass09O
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(2131886236);
        setContentView(2131558987);
        boolean z = false;
        for (Account account : AccountManager.get(this).getAccounts()) {
            if ("com.whatsapp".contains(account.type)) {
                z = true;
            }
        }
        if (z) {
            this.A00.A06(2131886158, 1);
            finish();
            return;
        }
        AnonymousClass028 r0 = this.A01;
        r0.A05();
        if (r0.A03 == null) {
            Intent intent = new Intent(this, Main.class);
            intent.putExtra("show_registration_first_dlg", true);
            startActivity(intent);
            finish();
            return;
        }
        this.A02.ASc(new AnonymousClass1X3(this, this), new Void[0]);
    }
}
