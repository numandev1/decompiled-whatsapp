package com.whatsapp.backup.encryptedbackup;

import X.AnonymousClass00H;
import X.AnonymousClass01T;
import X.AnonymousClass07S;
import X.C020709z;
import X.C02740De;
import X.C29481Xm;
import android.content.ContextWrapper;
import android.content.Intent;
import android.text.Editable;
import com.whatsapp.deviceauth.BiometricAuthPlugin;

public class VerifyPasswordFragment extends Hilt_VerifyPasswordFragment {
    public AnonymousClass00H A00;
    public AnonymousClass07S A01;
    public BiometricAuthPlugin A02;
    public AnonymousClass01T A03;

    public void A0h(int i, int i2, Intent intent) {
        if (i != 12345) {
            return;
        }
        if (i2 == -1 || i2 == 4) {
            this.A07.A05(0, -1);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: com.whatsapp.backup.encryptedbackup.VerifyPasswordFragment */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: android.widget.TextView */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [X.1Xz, android.view.View$OnClickListener] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.whatsapp.backup.encryptedbackup.PasswordInputFragment
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0w(android.view.View r9, android.os.Bundle r10) {
        /*
        // Method dump skipped, instructions count: 148
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.backup.encryptedbackup.VerifyPasswordFragment.A0w(android.view.View, android.os.Bundle):void");
    }

    @Override // com.whatsapp.backup.encryptedbackup.PasswordInputFragment
    public void A0z() {
        if (this.A06.getText() != null) {
            EncBackupViewModel encBackupViewModel = this.A07;
            encBackupViewModel.A04.A0B(this.A06.getText().toString());
            EncBackupViewModel encBackupViewModel2 = this.A07;
            encBackupViewModel2.A03.A0B(2);
            C02740De r2 = encBackupViewModel2.A08;
            Object A012 = encBackupViewModel2.A04.A01();
            if (A012 != null) {
                r2.A03((String) A012, false, new C29481Xm(encBackupViewModel2));
                return;
            }
            throw null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: com.whatsapp.backup.encryptedbackup.VerifyPasswordFragment */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.whatsapp.backup.encryptedbackup.PasswordInputFragment
    public void A10() {
        Object A012 = this.A07.A06.A01();
        ContextWrapper contextWrapper = ((Hilt_VerifyPasswordFragment) this).A00;
        if (contextWrapper == null) {
            return;
        }
        if (A012 == null) {
            Editable text = this.A06.getText();
            A11(text != null && text.toString().length() >= 6);
            ((PasswordInputFragment) this).A02.setText(A01().getQuantityString(2131755043, 1, 6, 1));
            ((PasswordInputFragment) this).A02.setTextColor(C020709z.A00(contextWrapper, 2131100485));
            return;
        }
        A11(false);
        ((PasswordInputFragment) this).A02.setText(A0G(2131887281, A012));
        ((PasswordInputFragment) this).A02.setTextColor(C020709z.A00(contextWrapper, 2131100451));
    }
}
