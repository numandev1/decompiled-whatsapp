package com.whatsapp;

import X.2O8;
import X.AnonymousClass028;
import X.AnonymousClass0G2;
import X.AnonymousClass0NG;
import X.AnonymousClass1BA;
import X.C29161We;
import X.C29171Wf;
import X.C29181Wg;
import X.RunnableC238618x;
import X.RunnableC238718y;
import X.RunnableC238818z;
import android.os.Bundle;
import android.widget.TextView;
import com.whatsapp.jid.UserJid;

public class ShareProductLinkActivity extends AnonymousClass0NG {
    public AnonymousClass028 A00;
    public 2O8 A01;

    public /* synthetic */ void A1U(String str, UserJid userJid) {
        this.A01.A02(23, 40, str, userJid);
    }

    public /* synthetic */ void A1V(String str, UserJid userJid) {
        this.A01.A02(25, 42, str, userJid);
    }

    public /* synthetic */ void A1W(String str, UserJid userJid) {
        this.A01.A02(20, 37, str, userJid);
    }

    @Override // X.AnonymousClass0G2, X.AnonymousClass0G3, X.AnonymousClass09L, X.AnonymousClass09K, X.AnonymousClass09N, X.AnonymousClass09M, X.AnonymousClass09H, X.AnonymousClass09G, X.AnonymousClass09J, X.AnonymousClass09I, X.AnonymousClass09O, X.AnonymousClass0NG
    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        UserJid nullable = UserJid.getNullable(getIntent().getStringExtra("jid"));
        if (nullable != null) {
            String stringExtra = getIntent().getStringExtra("product_id");
            if (stringExtra != null) {
                String format = String.format("%s/p/%s/%s", "https://wa.me", stringExtra, nullable.user);
                setTitle(2131889318);
                TextView textView = ((AnonymousClass0G2) this).A01;
                if (textView != null) {
                    textView.setText(format);
                }
                ((TextView) findViewById(2131364693)).setText(2131889315);
                if (this.A00.A0A(nullable)) {
                    str = getString(2131889317, format);
                } else {
                    str = format;
                }
                C29181Wg A1T = A1T();
                A1T.A00 = str;
                A1T.A01 = new RunnableC238818z(this, stringExtra, nullable);
                C29161We A1R = A1R();
                A1R.A00 = format;
                A1R.A01 = new RunnableC238718y(this, stringExtra, nullable);
                C29171Wf A1S = A1S();
                A1S.A02 = str;
                A1S.A00 = getString(2131889889);
                A1S.A01 = getString(2131889316);
                ((AnonymousClass1BA) A1S).A01 = new RunnableC238618x(this, stringExtra, nullable);
                return;
            }
            throw null;
        }
        throw null;
    }
}
