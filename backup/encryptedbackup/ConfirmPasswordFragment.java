package com.whatsapp.backup.encryptedbackup;

import X.2eC;
import X.2eD;
import X.AbstractC02250At;
import X.AnonymousClass01M;
import X.AnonymousClass05S;
import X.AnonymousClass14Z;
import X.C020709z;
import X.C02740De;
import X.C29471Xl;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

public class ConfirmPasswordFragment extends PasswordInputFragment {
    public ContextWrapper A00;
    public String A01;
    public boolean A02 = false;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.whatsapp.backup.encryptedbackup.ConfirmPasswordFragment */
    /* JADX WARN: Multi-variable type inference failed */
    private void A00() {
        if (this.A00 == null) {
            this.A00 = new 2eC(((Hilt_PasswordInputFragment) this).A00, this);
            if (!this.A02) {
                this.A02 = true;
                ((AbstractC02250At) generatedComponent()).A0Y(this);
            }
        }
    }

    public Context A0a() {
        return this.A00;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.whatsapp.backup.encryptedbackup.ConfirmPasswordFragment */
    /* JADX WARN: Multi-variable type inference failed */
    public LayoutInflater A0b(Bundle bundle) {
        return LayoutInflater.from(new 2eC(LayoutInflater.from(new 2eC(A03(), this)), this));
    }

    @Override // com.whatsapp.backup.encryptedbackup.Hilt_PasswordInputFragment
    public void A0c(Activity activity) {
        super.A0c(activity);
        ContextWrapper contextWrapper = this.A00;
        AnonymousClass01M.A18(contextWrapper == null || 2eD.A00(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        A00();
    }

    @Override // com.whatsapp.backup.encryptedbackup.Hilt_PasswordInputFragment
    public void A0u(Context context) {
        super.A0u(context);
        A00();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.whatsapp.backup.encryptedbackup.ConfirmPasswordFragment */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.whatsapp.backup.encryptedbackup.PasswordInputFragment
    public void A0w(View view, Bundle bundle) {
        super.A0w(view, bundle);
        this.A01 = (String) this.A07.A04.A01();
        int i = ((PasswordInputFragment) this).A00;
        if (i == 1 || i == 5) {
            this.A04.setText(A0E(2131887237));
        } else if (i == 4) {
            this.A04.setText(A0E(2131887236));
        }
        this.A03.setText(A0E(2131887234));
        this.A06.setHint(A0E(2131887232));
        this.A08.setText(A0E(2131887231));
    }

    @Override // com.whatsapp.backup.encryptedbackup.Hilt_PasswordInputFragment
    public void A0y() {
        if (!this.A02) {
            this.A02 = true;
            ((AbstractC02250At) generatedComponent()).A0Y(this);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: com.whatsapp.backup.encryptedbackup.ConfirmPasswordFragment */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.whatsapp.backup.encryptedbackup.PasswordInputFragment
    public void A0z() {
        if (this.A06.getText() == null) {
            return;
        }
        if (this.A06.getText().toString().equals(this.A01)) {
            EncBackupViewModel encBackupViewModel = this.A07;
            encBackupViewModel.A03.A0B(2);
            C02740De r3 = encBackupViewModel.A08;
            Object A012 = encBackupViewModel.A04.A01();
            if (A012 != null) {
                C29471Xl r8 = new C29471Xl(encBackupViewModel);
                new AnonymousClass14Z(r3.A07, r3.A06, r3, r3.A02, r3.A04, r3.A05, (String) A012, r8).A02();
                return;
            }
            throw null;
        }
        ((PasswordInputFragment) this).A02.setText(A0E(2131887235));
        ((PasswordInputFragment) this).A02.setTextColor(C020709z.A00(A00(), 2131100451));
        AnonymousClass05S.A1b(this.A09);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.whatsapp.backup.encryptedbackup.ConfirmPasswordFragment */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r1 < 6) goto L_0x0014;
     */
    @Override // com.whatsapp.backup.encryptedbackup.PasswordInputFragment
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A10() {
        /*
            r3 = this;
            com.whatsapp.CodeInputField r0 = r3.A06
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x0014
            java.lang.String r0 = r0.toString()
            int r1 = r0.length()
            r0 = 1
            r2 = 6
            if (r1 >= r2) goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            r3.A11(r0)
            android.widget.TextView r0 = r3.A02
            r1 = 2131887233(0x7f120481, float:1.9409067E38)
            java.lang.CharSequence r1 = r3.A0E(r1)
            r0.setText(r1)
            android.widget.TextView r0 = r3.A02
            android.content.Context r1 = r3.A00()
            r2 = 2131100485(0x7f060345, float:1.7813353E38)
            int r1 = X.C020709z.A00(r1, r2)
            r0.setTextColor(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.backup.encryptedbackup.ConfirmPasswordFragment.A10():void");
    }
}
