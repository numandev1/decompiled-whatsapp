package com.whatsapp.authentication;

import X.AnonymousClass07X;
import X.AnonymousClass07Y;
import X.AnonymousClass0CR;
import android.app.Dialog;
import android.os.Bundle;

public class SetupDeviceAuthDialog extends Hilt_SetupDeviceAuthDialog {
    public AnonymousClass0CR A00;

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.whatsapp.authentication.SetupDeviceAuthDialog */
    /* JADX WARN: Multi-variable type inference failed */
    public Dialog A0z(Bundle bundle) {
        boolean A07 = this.A00.A07();
        AnonymousClass07X r2 = new AnonymousClass07X(A00());
        int i = 2131887511;
        if (A07) {
            i = 2131886233;
        }
        String A0F = A0F(i);
        AnonymousClass07Y r3 = r2.A01;
        r3.A0I = A0F;
        int i2 = 2131887510;
        if (A07) {
            i2 = 2131886232;
        }
        r3.A0E = A0F(i2);
        r2.A08(A0F(2131888548), null);
        return r2.A00();
    }
}
