package com.whatsapp.accountsync;

import X.2OS;
import X.AbstractActivityC03090Fa;
import X.AnonymousClass09G;
import X.AnonymousClass0NU;
import X.C018308s;
import android.content.Intent;
import com.whatsapp.jid.UserJid;
import com.whatsapp.tos.TosUpdateActivity;

public class CallContactLandingActivity extends AnonymousClass0NU {
    public 2OS A00;

    @Override // com.whatsapp.accountsync.ProfileActivity
    public boolean A1X(UserJid userJid, String str) {
        C018308s A0A = ((AbstractActivityC03090Fa) this).A04.A0A(userJid);
        if (!((AnonymousClass09G) this).A0F.A05()) {
            startActivity(new Intent(this, TosUpdateActivity.class));
            return true;
        } else if ("vnd.android.cursor.item/vnd.com.whatsapp.voip.call".equals(str)) {
            this.A00.A05(A0A, this, 14, false);
            return true;
        } else if (!"vnd.android.cursor.item/vnd.com.whatsapp.video.call".equals(str)) {
            return false;
        } else {
            this.A00.A00(A0A, this, 14, false, true);
            return true;
        }
    }
}
