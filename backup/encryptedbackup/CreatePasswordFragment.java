package com.whatsapp.backup.encryptedbackup;

import X.C020709z;
import android.text.Editable;

public class CreatePasswordFragment extends Hilt_CreatePasswordFragment {
    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: com.whatsapp.backup.encryptedbackup.CreatePasswordFragment */
    /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: android.widget.TextView */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v16, types: [X.1Xf, android.view.View$OnClickListener] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.whatsapp.backup.encryptedbackup.PasswordInputFragment
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0w(android.view.View r8, android.os.Bundle r9) {
        /*
        // Method dump skipped, instructions count: 131
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.backup.encryptedbackup.CreatePasswordFragment.A0w(android.view.View, android.os.Bundle):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: com.whatsapp.backup.encryptedbackup.CreatePasswordFragment */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0087, code lost:
        if (java.util.Arrays.asList(X.AnonymousClass1DE.A01).contains(r0) != false) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0089, code lost:
        ((com.whatsapp.backup.encryptedbackup.PasswordInputFragment) r8).A02.setText(A0E(2131887279));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0097, code lost:
        if (r0 == true) goto L_0x0089;
     */
    @Override // com.whatsapp.backup.encryptedbackup.PasswordInputFragment
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0z() {
        /*
        // Method dump skipped, instructions count: 179
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.backup.encryptedbackup.CreatePasswordFragment.A0z():void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: com.whatsapp.backup.encryptedbackup.CreatePasswordFragment */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.whatsapp.backup.encryptedbackup.PasswordInputFragment
    public void A10() {
        Editable text = this.A06.getText();
        A11(text != null && text.toString().length() >= 6);
        ((PasswordInputFragment) this).A02.setText(A01().getQuantityString(2131755043, 1, 6, 1));
        ((PasswordInputFragment) this).A02.setTextColor(C020709z.A00(A00(), 2131100485));
    }
}
