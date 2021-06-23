package com.whatsapp.authentication;

import X.1jG;
import X.2H1;
import X.2HZ;
import X.AbstractC02340Bc;
import X.AnonymousClass00I;
import X.AnonymousClass01M;
import X.AnonymousClass01O;
import X.AnonymousClass020;
import X.AnonymousClass07S;
import X.AnonymousClass09M;
import X.AnonymousClass0KS;
import X.AnonymousClass0KT;
import X.AnonymousClass1XJ;
import X.C02360Be;
import X.C28711Uk;
import X.DialogInterface$OnShowListenerC24701Co;
import X.HandlerC24801Cy;
import X.RunnableC24611Cb;
import X.RunnableC24671Cl;
import X.RunnableC24681Cm;
import X.RunnableC24711Cp;
import X.RunnableC24721Cq;
import X.RunnableC24771Cv;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.whatsapp.CodeInputField;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.util.Log;

public class VerifyTwoFactorAuthCodeDialogFragment extends Hilt_VerifyTwoFactorAuthCodeDialogFragment implements 2HZ {
    public int A00 = 0;
    public ProgressBar A01;
    public TextView A02;
    public CodeInputField A03;
    public AnonymousClass07S A04;
    public AnonymousClass020 A05;
    public 1jG A06;
    public AnonymousClass01O A07;
    public final Handler A08 = new HandlerC24801Cy(this, Looper.getMainLooper());
    public final Runnable A09 = new RunnableC24771Cv(this);

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.whatsapp.authentication.VerifyTwoFactorAuthCodeDialogFragment */
    /* JADX WARN: Multi-variable type inference failed */
    public void A0f() {
        this.A0U = true;
        1jG r0 = this.A06;
        AnonymousClass00I.A07(r0.A0A.contains(this));
        r0.A0A.remove(this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.whatsapp.authentication.VerifyTwoFactorAuthCodeDialogFragment */
    /* JADX WARN: Multi-variable type inference failed */
    public void A0s() {
        this.A0U = true;
        this.A06.A04(this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r10v0, resolved type: com.whatsapp.authentication.VerifyTwoFactorAuthCodeDialogFragment */
    /* JADX WARN: Multi-variable type inference failed */
    public Dialog A0z(Bundle bundle) {
        Dialog dialog = new Dialog(A09());
        dialog.requestWindowFeature(1);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        dialog.setContentView(2131558828);
        dialog.setCancelable(false);
        dialog.setCanceledOnTouchOutside(false);
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) dialog.findViewById(2131363737);
        textEmojiLabel.A07 = new AnonymousClass0KS();
        textEmojiLabel.setAccessibilityHelper(new AnonymousClass0KT(this.A05, textEmojiLabel));
        textEmojiLabel.setText(2H1.A06(A0F(2131890323), "forgot-pin", new RunnableC24611Cb(this)));
        this.A02 = (TextView) dialog.findViewById(2131362925);
        this.A03 = (CodeInputField) dialog.findViewById(2131362452);
        String A0G = A0G(2131886152, 6);
        CodeInputField codeInputField = this.A03;
        codeInputField.A07(new AnonymousClass1XJ(this), 6, '*', '*', null, new C28711Uk(codeInputField.getContext()), A0G);
        this.A03.setPasswordTransformationEnabled(true);
        this.A01 = (ProgressBar) dialog.findViewById(2131364217);
        this.A03.setEnabled(true);
        this.A01.setProgress(100);
        dialog.setOnShowListener(new DialogInterface$OnShowListenerC24701Co(this));
        dialog.getWindow().addFlags(8192);
        return dialog;
    }

    public void A18() {
        this.A00 = 4;
        1jG r0 = this.A06;
        r0.A01().edit().putLong("two_factor_auth_nag_time", r0.A05.A05()).putInt("two_factor_auth_nag_interval", Math.max(r0.A01().getInt("two_factor_auth_nag_interval", 0), 2)).putBoolean("two_factor_auth_last_code_correctness", true).apply();
        A1A();
    }

    public void A19() {
        this.A00 = 1;
        this.A04.A05(0, 2131890328);
        AnonymousClass07S r0 = this.A04;
        r0.A02.postDelayed(this.A09, 5000);
        1jG r02 = this.A06;
        if (r02 != null) {
            Log.i("twofactorauthmanager/disable-two-factor-auth");
            r02.A05("", (String) null);
            return;
        }
        throw null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.whatsapp.authentication.VerifyTwoFactorAuthCodeDialogFragment */
    /* JADX WARN: Multi-variable type inference failed */
    public final void A1A() {
        AnonymousClass09M A092 = A09();
        if (A092 != null) {
            AbstractC02340Bc A0N = A092.A0N();
            if (A0N != null) {
                C02360Be r1 = new C02360Be(A0N);
                r1.A06(this);
                r1.A06 = 8194;
                r1.A05();
                return;
            }
            throw null;
        }
    }

    public void A1B(String str) {
        boolean equals = this.A06.A02().equals(str);
        AnonymousClass07S r1 = this.A04;
        r1.A02.post(new RunnableC24721Cq(this, equals));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.whatsapp.authentication.VerifyTwoFactorAuthCodeDialogFragment */
    /* JADX WARN: Multi-variable type inference failed */
    public final void A1C(boolean z) {
        AnonymousClass09M A092 = A09();
        if (A092 != null && !AnonymousClass01M.A19(A092)) {
            if (z) {
                this.A00 = 2;
                this.A06.A06(true);
                A1A();
                return;
            }
            this.A06.A06(false);
            this.A02.setText(2131890357);
            this.A03.setCode("");
            this.A03.setEnabled(true);
            this.A01.setProgress(100);
            AnonymousClass07S r0 = this.A04;
            r0.A02.post(new RunnableC24711Cp(this));
        }
    }

    public void AQZ() {
        if (this.A00 == 1) {
            this.A00 = 0;
            AnonymousClass07S r0 = this.A04;
            r0.A02.removeCallbacks(this.A09);
            AnonymousClass07S r02 = this.A04;
            r02.A02.postDelayed(new RunnableC24681Cm(this), 500);
        }
    }

    public void AQa() {
        if (this.A00 == 1) {
            this.A00 = 3;
            AnonymousClass07S r0 = this.A04;
            r0.A02.removeCallbacks(this.A09);
            AnonymousClass07S r02 = this.A04;
            r02.A02.postDelayed(new RunnableC24671Cl(this), 500);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.whatsapp.authentication.VerifyTwoFactorAuthCodeDialogFragment */
    /* JADX WARN: Multi-variable type inference failed */
    public void onDismiss(DialogInterface dialogInterface) {
        AnonymousClass09M A092;
        if (!this.A0C) {
            A16(true, true);
        }
        int i = this.A00;
        if (i != 2 && i != 4 && (A092 = A09()) != null) {
            A092.finish();
        }
    }
}
