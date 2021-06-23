package com.whatsapp.backup.encryptedbackup;

import X.1fY;
import X.C020709z;
import X.C02740De;
import X.C29491Xn;
import android.text.Editable;

public class RestorePasswordInputFragment extends Hilt_RestorePasswordInputFragment {
    public 1fY A00;

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: com.whatsapp.backup.encryptedbackup.RestorePasswordInputFragment */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: android.widget.TextView */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [X.1Xy, android.view.View$OnClickListener] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.whatsapp.backup.encryptedbackup.PasswordInputFragment
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0w(android.view.View r8, android.os.Bundle r9) {
        /*
        // Method dump skipped, instructions count: 116
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.backup.encryptedbackup.RestorePasswordInputFragment.A0w(android.view.View, android.os.Bundle):void");
    }

    @Override // com.whatsapp.backup.encryptedbackup.PasswordInputFragment
    public void A0z() {
        if (this.A06.getText() != null) {
            boolean A0F = this.A00.A0F();
            EncBackupViewModel encBackupViewModel = this.A07;
            if (!A0F) {
                encBackupViewModel.A03.A0B(4);
                return;
            }
            encBackupViewModel.A04.A0B(this.A06.getText().toString());
            EncBackupViewModel encBackupViewModel2 = this.A07;
            encBackupViewModel2.A03.A0B(2);
            C02740De r2 = encBackupViewModel2.A08;
            Object A01 = encBackupViewModel2.A04.A01();
            if (A01 != null) {
                r2.A03((String) A01, true, new C29491Xn(encBackupViewModel2));
                return;
            }
            throw null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: com.whatsapp.backup.encryptedbackup.RestorePasswordInputFragment */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.whatsapp.backup.encryptedbackup.PasswordInputFragment
    public void A10() {
        Editable text = this.A06.getText();
        A11(text != null && text.toString().length() >= 6);
        ((PasswordInputFragment) this).A02.setText(A01().getQuantityString(2131755043, 1, 6, 1));
        ((PasswordInputFragment) this).A02.setTextColor(C020709z.A00(A00(), 2131100485));
    }
}
