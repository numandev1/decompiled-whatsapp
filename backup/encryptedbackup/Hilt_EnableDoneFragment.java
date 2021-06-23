package com.whatsapp.backup.encryptedbackup;

import X.2eC;
import X.2eD;
import X.AbstractC02240As;
import X.AbstractC02250At;
import X.AnonymousClass005;
import X.AnonymousClass01M;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.base.WaFragment;

public abstract class Hilt_EnableDoneFragment extends WaFragment implements AnonymousClass005 {
    public ContextWrapper A00;
    public boolean A01 = false;
    public final Object A02 = new Object();
    public volatile 2eD A03;

    public Context A0a() {
        return this.A00;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.whatsapp.backup.encryptedbackup.Hilt_EnableDoneFragment */
    /* JADX WARN: Multi-variable type inference failed */
    public LayoutInflater A0b(Bundle bundle) {
        return LayoutInflater.from(new 2eC(A03(), this));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.whatsapp.backup.encryptedbackup.Hilt_EnableDoneFragment */
    /* JADX WARN: Multi-variable type inference failed */
    public void A0c(Activity activity) {
        boolean z = true;
        this.A0U = true;
        ContextWrapper contextWrapper = this.A00;
        if (!(contextWrapper == null || 2eD.A00(contextWrapper) == activity)) {
            z = false;
        }
        AnonymousClass01M.A18(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        A0x();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.whatsapp.backup.encryptedbackup.Hilt_EnableDoneFragment */
    /* JADX WARN: Multi-variable type inference failed */
    public void A0u(Context context) {
        Hilt_EnableDoneFragment.super.A0u(context);
        A0x();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.whatsapp.backup.encryptedbackup.Hilt_EnableDoneFragment */
    /* JADX WARN: Multi-variable type inference failed */
    public final void A0x() {
        if (this.A00 == null) {
            this.A00 = new 2eC(Hilt_EnableDoneFragment.super.A0a(), this);
            if (!this.A01) {
                this.A01 = true;
                ((AbstractC02250At) generatedComponent()).A0a((EnableDoneFragment) this);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.whatsapp.backup.encryptedbackup.Hilt_EnableDoneFragment */
    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC02240As AA2() {
        return AnonymousClass01M.A0H(this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.whatsapp.backup.encryptedbackup.Hilt_EnableDoneFragment */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AnonymousClass005
    public final Object generatedComponent() {
        if (this.A03 == null) {
            synchronized (this.A02) {
                if (this.A03 == null) {
                    this.A03 = new 2eD(this);
                }
            }
        }
        return this.A03.generatedComponent();
    }
}
