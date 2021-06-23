package com.whatsapp;

import X.1fY;
import X.AnonymousClass00G;
import X.AnonymousClass07X;
import X.AnonymousClass09M;
import X.AnonymousClass17O;
import X.AnonymousClass17P;
import X.C000100c;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.registration.EULA;
import com.whatsapp.util.Log;

public class DisplayExceptionDialogFactory$LoginFailedDialogFragment extends Hilt_DisplayExceptionDialogFactory_LoginFailedDialogFragment {
    public C000100c A00;
    public AnonymousClass00G A01;
    public 1fY A02;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.whatsapp.DisplayExceptionDialogFactory$LoginFailedDialogFragment */
    /* JADX WARN: Multi-variable type inference failed */
    public Dialog A0z(Bundle bundle) {
        AnonymousClass07X r0 = new AnonymousClass07X(A0A());
        r0.A02(2131889286);
        r0.A01.A0J = false;
        r0.A06(2131888548, new AnonymousClass17P(this));
        r0.A04(2131889287, new AnonymousClass17O(this));
        return r0.A00();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r11v0, resolved type: com.whatsapp.DisplayExceptionDialogFactory$LoginFailedDialogFragment */
    /* JADX WARN: Multi-variable type inference failed */
    public void A18() {
        Log.i("loggedout/verify/tos");
        AnonymousClass09M A09 = A09();
        if (A09 != null) {
            String A0K = this.A01.A0K();
            String A0I = this.A01.A0I();
            Intent A002 = EULA.A00(A09);
            if (this.A00.A05() < this.A01.A00.getLong("post_reg_notification_time", 0) + 1800000) {
                Log.i("loggedout/verify/tos/reregister/pref-fill");
                A002.putExtra("com.whatsapp.registration.RegisterPhone.phone_number", A0K);
                A002.putExtra("com.whatsapp.registration.RegisterPhone.country_code", A0I);
                A002.putExtra("com.whatsapp.registration.RegisterPhone.clear_phone_number", false);
            }
            this.A02.A02();
            this.A02.A0B(0);
            A09.startActivity(A002);
            A09.finishAffinity();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.whatsapp.DisplayExceptionDialogFactory$LoginFailedDialogFragment */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void A19() {
        Log.i("loggedout/ok/tos");
        this.A02.A02();
        AnonymousClass09M A09 = A09();
        if (A09 != null) {
            this.A02.A0B(0);
            A09.startActivity(EULA.A00(A09));
            A09.setResult(0);
            A09.finishAffinity();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.whatsapp.DisplayExceptionDialogFactory$LoginFailedDialogFragment */
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
