package com.whatsapp.backup.encryptedbackup;

import X.AnonymousClass00I;
import X.AnonymousClass020;
import X.AnonymousClass08x;
import X.AnonymousClass1DA;
import X.AnonymousClass1DB;
import X.AnonymousClass1DG;
import X.C02270Av;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import com.whatsapp.WaEditText;

public class EncryptionKeyFragment extends Hilt_EncryptionKeyFragment {
    public int A00;
    public EncBackupViewModel A01;
    public AnonymousClass020 A02;
    public WaEditText[] A03;

    public View A0p(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(2131558789, viewGroup, false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r13v0, resolved type: com.whatsapp.backup.encryptedbackup.EncryptionKeyFragment */
    /* JADX DEBUG: Multi-variable search result rejected for r8v3, resolved type: com.whatsapp.WaEditText[] */
    /* JADX WARN: Multi-variable type inference failed */
    public void A0w(View view, Bundle bundle) {
        String[] strArr;
        EncryptionKeyFragment.super.A0v(bundle);
        this.A01 = (EncBackupViewModel) new C02270Av(A0A()).A00(EncBackupViewModel.class);
        this.A00 = 0;
        ViewGroup viewGroup = (ViewGroup) AnonymousClass08x.A0D(view, 2131362893);
        String str = (String) this.A01.A01.A01();
        if (str != null) {
            int length = str.length();
            AnonymousClass00I.A09(length == 64, "readable root key string does not match expected size");
            int ceil = (int) Math.ceil(4.0d);
            strArr = new String[16];
            int i = 0;
            while (true) {
                int i2 = i + 1;
                strArr[i] = str.substring(ceil * i, Math.min(ceil * i2, length));
                if (i2 >= 16) {
                    break;
                }
                i = i2;
            }
        } else {
            strArr = null;
        }
        this.A03 = new WaEditText[16];
        for (int i3 = 0; i3 < 4; i3++) {
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.getChildAt(i3);
            int i4 = 0;
            do {
                int i5 = (i3 << 2) + i4;
                this.A03[i5] = viewGroup2.getChildAt(i4);
                if (strArr != null) {
                    this.A03[i5].setText(strArr[i5]);
                }
                if (this.A01.A03() != 1) {
                    WaEditText waEditText = this.A03[i5];
                    waEditText.setEnabled(true);
                    waEditText.setOnFocusChangeListener(new AnonymousClass1DB(this, i5));
                    waEditText.addTextChangedListener(new AnonymousClass1DG(this));
                    waEditText.setOnKeyListener(new AnonymousClass1DA(this));
                    if (i5 == 0) {
                        InputMethodManager A0M = this.A02.A0M();
                        if (A0M != null) {
                            A0M.toggleSoftInput(1, 1);
                        }
                        waEditText.requestFocus();
                    }
                }
                i4++;
            } while (i4 < 4);
        }
    }
}
