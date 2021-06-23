package com.whatsapp.backup.encryptedbackup;

import X.2eC;
import X.2eD;
import X.AbstractC02250At;
import X.AnonymousClass01M;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;

public abstract class Hilt_VerifyPasswordFragment extends PasswordInputFragment {
    public ContextWrapper A00;
    public boolean A01 = false;

    public Context A0a() {
        return this.A00;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.whatsapp.backup.encryptedbackup.Hilt_VerifyPasswordFragment */
    /* JADX WARN: Multi-variable type inference failed */
    public LayoutInflater A0b(Bundle bundle) {
        return LayoutInflater.from(new 2eC(LayoutInflater.from(new 2eC(A03(), this)), this));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.whatsapp.backup.encryptedbackup.Hilt_VerifyPasswordFragment */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.whatsapp.backup.encryptedbackup.Hilt_PasswordInputFragment
    public void A0c(Activity activity) {
        super.A0c(activity);
        ContextWrapper contextWrapper = this.A00;
        AnonymousClass01M.A18(contextWrapper == null || 2eD.A00(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        if (this.A00 == null) {
            this.A00 = new 2eC(((Hilt_PasswordInputFragment) this).A00, this);
            A0y();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.whatsapp.backup.encryptedbackup.Hilt_VerifyPasswordFragment */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.whatsapp.backup.encryptedbackup.Hilt_PasswordInputFragment
    public void A0u(Context context) {
        super.A0u(context);
        if (this.A00 == null) {
            this.A00 = new 2eC(((Hilt_PasswordInputFragment) this).A00, this);
            A0y();
        }
    }

    @Override // com.whatsapp.backup.encryptedbackup.Hilt_PasswordInputFragment
    public void A0y() {
        if (!this.A01) {
            this.A01 = true;
            ((AbstractC02250At) generatedComponent()).A0g((VerifyPasswordFragment) this);
        }
    }
}
