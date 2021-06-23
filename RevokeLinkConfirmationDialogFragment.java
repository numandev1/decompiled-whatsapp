package com.whatsapp;

import X.1dn;
import X.1do;
import X.AnonymousClass07X;
import X.AnonymousClass07Y;
import X.C003101p;
import X.DialogInterface$OnClickListenerC237418l;
import android.app.Dialog;
import android.os.Bundle;

public class RevokeLinkConfirmationDialogFragment extends Hilt_RevokeLinkConfirmationDialogFragment {
    public 1dn A00;
    public 1do A01;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.whatsapp.RevokeLinkConfirmationDialogFragment, X.09d] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.whatsapp.RevokeLinkConfirmationDialogFragment A00(X.C003101p r4, boolean r5) {
        /*
            com.whatsapp.RevokeLinkConfirmationDialogFragment r0 = new com.whatsapp.RevokeLinkConfirmationDialogFragment
            r0.<init>()
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r2 = "jid"
            java.lang.String r3 = r4.getRawString()
            r1.putString(r2, r3)
            java.lang.String r2 = "from_qr"
            r1.putBoolean(r2, r5)
            r0.A0P(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.RevokeLinkConfirmationDialogFragment.A00(X.01p, boolean):com.whatsapp.RevokeLinkConfirmationDialogFragment");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: com.whatsapp.RevokeLinkConfirmationDialogFragment */
    /* JADX WARN: Multi-variable type inference failed */
    public Dialog A0z(Bundle bundle) {
        Bundle A02 = A02();
        boolean z = A02.getBoolean("from_qr");
        AnonymousClass07X r3 = new AnonymousClass07X(A00());
        int i = 2131889541;
        if (z) {
            i = 2131886876;
        }
        r3.A08(A0F(i), new DialogInterface$OnClickListenerC237418l(this));
        String A0F = A0F(2131886565);
        AnonymousClass07Y r4 = r3.A01;
        r4.A0F = A0F;
        r4.A03 = null;
        if (z) {
            r4.A0I = A0F(2131886879);
            r4.A0E = A0F(2131889525);
        } else {
            1do r0 = this.A01;
            1dn r2 = this.A00;
            String string = A02.getString("jid");
            if (string != null) {
                C003101p A04 = C003101p.A04(string);
                if (A04 != null) {
                    r4.A0E = A0G(2131889527, r0.A09(r2.A0A(A04), false));
                } else {
                    throw null;
                }
            } else {
                throw null;
            }
        }
        return r3.A00();
    }
}
