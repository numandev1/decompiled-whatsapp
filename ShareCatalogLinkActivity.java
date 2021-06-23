package com.whatsapp;

import X.2O8;
import X.2Oj;
import X.AnonymousClass028;
import X.AnonymousClass0G2;
import X.AnonymousClass0NE;
import X.AnonymousClass1BA;
import X.C000100c;
import X.C29161We;
import X.C29171Wf;
import X.C29181Wg;
import X.RunnableC238018r;
import X.RunnableC238118s;
import X.RunnableC238218t;
import android.os.Bundle;
import android.widget.TextView;
import com.whatsapp.jid.UserJid;

public class ShareCatalogLinkActivity extends AnonymousClass0NE {
    public AnonymousClass028 A00;
    public 2O8 A01;
    public C000100c A02;
    public 2Oj A03;

    public /* synthetic */ void A1U(UserJid userJid) {
        this.A01.A02(22, 39, (String) null, userJid);
    }

    public /* synthetic */ void A1V(UserJid userJid) {
        this.A01.A02(24, 41, (String) null, userJid);
    }

    public /* synthetic */ void A1W(UserJid userJid) {
        this.A01.A02(19, 36, (String) null, userJid);
    }

    @Override // X.AnonymousClass0G2, X.AnonymousClass0G3, X.AnonymousClass09L, X.AnonymousClass09K, X.AnonymousClass09N, X.AnonymousClass09M, X.AnonymousClass09H, X.AnonymousClass09G, X.AnonymousClass09J, X.AnonymousClass09I, X.AnonymousClass0NE, X.AnonymousClass09O
    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        UserJid nullable = UserJid.getNullable(getIntent().getStringExtra("jid"));
        if (nullable != null) {
            String format = String.format("%s/c/%s", "https://wa.me", nullable.user);
            setTitle(2131886628);
            TextView textView = ((AnonymousClass0G2) this).A01;
            if (textView != null) {
                textView.setText(format);
            }
            ((TextView) findViewById(2131364693)).setText(2131886625);
            if (this.A00.A0A(nullable)) {
                str = getString(2131886627, format);
            } else {
                str = format;
            }
            C29181Wg A1T = A1T();
            A1T.A00 = str;
            A1T.A01 = new RunnableC238018r(this, nullable);
            C29161We A1R = A1R();
            A1R.A00 = format;
            A1R.A01 = new RunnableC238118s(this, nullable);
            C29171Wf A1S = A1S();
            A1S.A02 = str;
            A1S.A00 = getString(2131889889);
            A1S.A01 = getString(2131886626);
            ((AnonymousClass1BA) A1S).A01 = new RunnableC238218t(this, nullable);
            return;
        }
        throw null;
    }
}
