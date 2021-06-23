package com.whatsapp;

import X.AnonymousClass01G;
import X.AnonymousClass02S;
import X.AnonymousClass09M;
import X.AnonymousClass1WM;
import X.DialogInterface$OnCancelListenerC19720wf;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.whatsapp.util.Log;

public class DisplayExceptionDialogFactory$ClockWrongDialogFragment extends Hilt_DisplayExceptionDialogFactory_ClockWrongDialogFragment {
    public AnonymousClass02S A00;
    public AnonymousClass01G A01;
    public boolean A02 = true;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.whatsapp.DisplayExceptionDialogFactory$ClockWrongDialogFragment */
    /* JADX WARN: Multi-variable type inference failed */
    public void A0s() {
        this.A0U = true;
        if (!this.A00.A04()) {
            A16(false, false);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.whatsapp.DisplayExceptionDialogFactory$ClockWrongDialogFragment */
    /* JADX WARN: Multi-variable type inference failed */
    public Dialog A0z(Bundle bundle) {
        Log.w("home/dialog clock-wrong");
        AnonymousClass01G r0 = this.A01;
        AnonymousClass09M A09 = A09();
        AnonymousClass1WM r2 = new AnonymousClass1WM(A09, r0, this.A00, A09);
        r2.setOnCancelListener(new DialogInterface$OnCancelListenerC19720wf(A09));
        return r2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.whatsapp.DisplayExceptionDialogFactory$ClockWrongDialogFragment */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.whatsapp.DisplayExceptionDialogFactory$ClockWrongDialogFragment, androidx.fragment.app.DialogFragment] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onConfigurationChanged(android.content.res.Configuration r4) {
        /*
            r3 = this;
            r1 = 0
            r0 = 1
            r3.A0U = r0
            r3.A02 = r1
            r3.A16(r1, r1)
            com.whatsapp.DisplayExceptionDialogFactory$ClockWrongDialogFragment r0 = new com.whatsapp.DisplayExceptionDialogFactory$ClockWrongDialogFragment
            r0.<init>()
            X.09M r1 = r3.A09()
            X.0Bc r1 = r1.A0N()
            java.lang.Class<com.whatsapp.DisplayExceptionDialogFactory$ClockWrongDialogFragment> r2 = com.whatsapp.DisplayExceptionDialogFactory$ClockWrongDialogFragment.class
            java.lang.String r2 = r2.getName()
            r0.A14(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.DisplayExceptionDialogFactory$ClockWrongDialogFragment.onConfigurationChanged(android.content.res.Configuration):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.whatsapp.DisplayExceptionDialogFactory$ClockWrongDialogFragment */
    /* JADX WARN: Multi-variable type inference failed */
    public void onDismiss(DialogInterface dialogInterface) {
        AnonymousClass09M A09;
        if (!this.A0C) {
            A16(true, true);
        }
        if (this.A02 && (A09 = A09()) != null) {
            A09.finish();
        }
    }
}
