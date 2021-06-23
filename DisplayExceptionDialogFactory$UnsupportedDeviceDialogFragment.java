package com.whatsapp;

import X.AnonymousClass07X;
import X.AnonymousClass09M;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

public class DisplayExceptionDialogFactory$UnsupportedDeviceDialogFragment extends Hilt_DisplayExceptionDialogFactory_UnsupportedDeviceDialogFragment {
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.whatsapp.DisplayExceptionDialogFactory$UnsupportedDeviceDialogFragment */
    /* JADX WARN: Multi-variable type inference failed */
    public Dialog A0z(Bundle bundle) {
        AnonymousClass07X r0 = new AnonymousClass07X(A09());
        r0.A03(2131886236);
        r0.A02(2131887123);
        r0.A01.A0J = false;
        r0.A06(2131888548, null);
        return r0.A00();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.whatsapp.DisplayExceptionDialogFactory$UnsupportedDeviceDialogFragment */
    /* JADX WARN: Multi-variable type inference failed */
    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.A0C) {
            A16(true, true);
        }
        AnonymousClass09M A09 = A09();
        if (A09 != null) {
            A09.finish();
        }
    }
}
