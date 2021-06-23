package com.whatsapp.backup.encryptedbackup;

import X.AnonymousClass020;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.CodeInputField;
import com.whatsapp.components.Button;

public abstract class PasswordInputFragment extends Hilt_PasswordInputFragment {
    public int A00;
    public TextView A01;
    public TextView A02;
    public TextView A03;
    public TextView A04;
    public TextView A05;
    public CodeInputField A06;
    public EncBackupViewModel A07;
    public Button A08;
    public AnonymousClass020 A09;

    public View A0p(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(2131558794, viewGroup, false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: com.whatsapp.backup.encryptedbackup.PasswordInputFragment */
    /* JADX DEBUG: Multi-variable search result rejected for r0v29, resolved type: com.whatsapp.components.Button */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [android.view.View$OnClickListener, X.1Xw] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0w(android.view.View r8, android.os.Bundle r9) {
        /*
        // Method dump skipped, instructions count: 201
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.backup.encryptedbackup.PasswordInputFragment.A0w(android.view.View, android.os.Bundle):void");
    }

    public abstract void A0z();

    public abstract void A10();

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: com.whatsapp.components.Button */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.1Xx, android.view.View$OnClickListener] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A11(boolean r3) {
        /*
            r2 = this;
            r1 = 0
            com.whatsapp.components.Button r0 = r2.A08
            r0.setEnabled(r3)
            com.whatsapp.components.Button r0 = r2.A08
            if (r3 == 0) goto L_0x001d
            X.1Xx r1 = new X.1Xx
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            com.whatsapp.CodeInputField r0 = r2.A06
            X.1DC r1 = new X.1DC
            r1.<init>(r2)
            r0.setOnEditorActionListener(r1)
        L_0x001c:
            return
        L_0x001d:
            r0.setOnClickListener(r1)
            com.whatsapp.CodeInputField r0 = r2.A06
            r0.setOnEditorActionListener(r1)
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.backup.encryptedbackup.PasswordInputFragment.A11(boolean):void");
    }
}
