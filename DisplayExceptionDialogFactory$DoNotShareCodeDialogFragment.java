package com.whatsapp;

import X.1dl;
import X.AnonymousClass07P;
import X.AnonymousClass07X;
import X.AnonymousClass09M;
import X.AnonymousClass17N;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;

public class DisplayExceptionDialogFactory$DoNotShareCodeDialogFragment extends Hilt_DisplayExceptionDialogFactory_DoNotShareCodeDialogFragment {
    public AnonymousClass07P A00;
    public 1dl A01;

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.whatsapp.DisplayExceptionDialogFactory$DoNotShareCodeDialogFragment */
    /* JADX WARN: Multi-variable type inference failed */
    public Dialog A0z(Bundle bundle) {
        AnonymousClass09M A0A = A0A();
        AnonymousClass07X r1 = new AnonymousClass07X(A0A);
        r1.A03(2131889289);
        r1.A02(2131889288);
        r1.A01.A0J = true;
        r1.A06(2131888548, null);
        r1.A04(2131888097, new AnonymousClass17N(this, A0A));
        return r1.A00();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: com.whatsapp.DisplayExceptionDialogFactory$DoNotShareCodeDialogFragment */
    /* JADX WARN: Multi-variable type inference failed */
    public void A18(Context context) {
        this.A00.A06(context, new Intent("android.intent.action.VIEW", this.A01.A02("general", "30035737", (String) null, (Pair) null)));
        A16(false, false);
    }
}
