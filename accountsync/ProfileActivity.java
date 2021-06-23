package com.whatsapp.accountsync;

import X.1fX;
import X.2IL;
import X.2OH;
import X.AbstractActivityC03090Fa;
import X.AnonymousClass00C;
import X.AnonymousClass01M;
import X.AnonymousClass01O;
import X.AnonymousClass021;
import X.AnonymousClass028;
import X.AnonymousClass07P;
import X.AnonymousClass09G;
import X.AnonymousClass09I;
import X.AnonymousClass0NW;
import X.AnonymousClass1X4;
import X.C018308s;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.util.WhatsAppLibLoader;

public class ProfileActivity extends AnonymousClass0NW {
    public AnonymousClass028 A00;
    public AnonymousClass1X4 A01 = null;
    public AnonymousClass021 A02;
    public 1fX A03;
    public 2OH A04;
    public AnonymousClass01O A05;
    public WhatsAppLibLoader A06;

    @Override // X.AbstractActivityC03090Fa
    public void A1Q() {
        if (((AbstractActivityC03090Fa) this).A0E.A0m) {
            AnonymousClass1X4 r0 = this.A01;
            if (r0 == null || r0.A00() != AsyncTask.Status.RUNNING) {
                AnonymousClass1X4 r02 = new AnonymousClass1X4(this);
                this.A01 = r02;
                this.A05.ASc(r02, new Void[0]);
                return;
            }
            return;
        }
        A1W();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007e, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A1W() {
        /*
        // Method dump skipped, instructions count: 157
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.accountsync.ProfileActivity.A1W():void");
    }

    public boolean A1X(UserJid userJid, String str) {
        C018308s A0A = ((AbstractActivityC03090Fa) this).A04.A0A(userJid);
        if (!"vnd.android.cursor.item/vnd.com.whatsapp.profile".equals(str)) {
            return false;
        }
        AnonymousClass07P r1 = ((AnonymousClass09G) this).A00;
        Intent A022 = new 2IL().A02(this, A0A);
        if (r1 != null) {
            r1.A07(this, A022, getClass().getSimpleName());
            return true;
        }
        throw null;
    }

    @Override // X.AbstractActivityC03090Fa, X.AnonymousClass09M
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 150) {
            if (i2 == -1) {
                A1W();
            } else {
                Log.w("profileactivity/contact access denied");
                finish();
            }
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // X.AnonymousClass0NW, X.AbstractActivityC03090Fa, X.AbstractActivityC03100Fb, X.AnonymousClass09L, X.AnonymousClass09K, X.AnonymousClass09N, X.AnonymousClass09M, X.AnonymousClass09H, X.AnonymousClass09G, X.AnonymousClass09J, X.AnonymousClass09I, X.AnonymousClass09O
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!this.A06.A04()) {
            Log.i("aborting due to native libraries missing");
            finish();
            return;
        }
        AnonymousClass028 r0 = this.A00;
        r0.A05();
        if (r0.A00 == null || !((AbstractActivityC03090Fa) this).A0J.A02()) {
            ((AnonymousClass09I) this).A0A.A06(2131887512, 1);
            finish();
            return;
        }
        1fX r02 = this.A03;
        r02.A06();
        if (r02.A01) {
            A1Q();
        } else if (A1V()) {
            int A052 = ((AbstractActivityC03090Fa) this).A08.A05();
            AnonymousClass00C.A0s("profileactivity/create/backupfilesfound ", A052);
            if (A052 > 0) {
                AnonymousClass01M.A0t(this, 105);
            } else {
                A1U(false);
            }
        }
    }
}
