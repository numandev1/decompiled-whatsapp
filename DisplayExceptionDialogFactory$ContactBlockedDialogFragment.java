package com.whatsapp;

import X.1e7;
import X.AnonymousClass07X;
import X.AnonymousClass09M;
import X.DialogInterface$OnClickListenerC19690wc;
import android.app.Dialog;
import android.os.Bundle;
import com.whatsapp.util.Log;
import java.util.ArrayList;

public class DisplayExceptionDialogFactory$ContactBlockedDialogFragment extends Hilt_DisplayExceptionDialogFactory_ContactBlockedDialogFragment {
    public 1e7 A00;

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: com.whatsapp.DisplayExceptionDialogFactory$ContactBlockedDialogFragment */
    /* JADX WARN: Multi-variable type inference failed */
    public Dialog A0z(Bundle bundle) {
        Log.w("home/dialog contact-blocked");
        Bundle A02 = A02();
        String string = A02.getString("message");
        if (string != null) {
            ArrayList parcelableArrayList = A02.getParcelableArrayList("jids");
            if (parcelableArrayList != null) {
                AnonymousClass09M A0A = A0A();
                1e7 r3 = this.A00;
                AnonymousClass07X r4 = new AnonymousClass07X(A0A);
                r4.A01.A0E = string;
                r4.A06(2131890374, new DialogInterface$OnClickListenerC19690wc(parcelableArrayList, r3, A0A));
                r4.A04(2131886565, null);
                return r4.A00();
            }
            throw null;
        }
        throw null;
    }
}
