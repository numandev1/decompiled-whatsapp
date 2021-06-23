package com.whatsapp;

import X.AnonymousClass01G;
import X.AnonymousClass02S;
import X.AnonymousClass05S;
import X.AnonymousClass07P;
import X.AnonymousClass09M;
import X.C015307e;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.whatsapp.util.Log;

public class DisplayExceptionDialogFactory$SoftwareExpiredDialogFragment extends Hilt_DisplayExceptionDialogFactory_SoftwareExpiredDialogFragment {
    public AnonymousClass07P A00;
    public AnonymousClass02S A01;
    public C015307e A02;
    public AnonymousClass01G A03;

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.whatsapp.DisplayExceptionDialogFactory$SoftwareExpiredDialogFragment */
    /* JADX WARN: Multi-variable type inference failed */
    public Dialog A0z(Bundle bundle) {
        Log.w("home/dialog software-expired");
        return AnonymousClass05S.A0F(this.A03, A09(), this.A02, this.A01, this.A00);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.whatsapp.DisplayExceptionDialogFactory$SoftwareExpiredDialogFragment */
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
