package com.whatsapp;

import X.2eC;
import X.2eD;
import X.AbstractC02250At;
import X.AnonymousClass01M;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.base.Hilt_WaDialogFragment;
import com.whatsapp.base.WaDialogFragment;

public abstract class Hilt_DisplayExceptionDialogFactory_SoftwareExpiredDialogFragment extends WaDialogFragment {
    public ContextWrapper A00;
    public boolean A01 = false;

    public Context A0a() {
        return this.A00;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.whatsapp.Hilt_DisplayExceptionDialogFactory_SoftwareExpiredDialogFragment */
    /* JADX WARN: Multi-variable type inference failed */
    public LayoutInflater A0b(Bundle bundle) {
        return LayoutInflater.from(new 2eC(Hilt_DisplayExceptionDialogFactory_SoftwareExpiredDialogFragment.super.A0b(bundle), this));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.whatsapp.Hilt_DisplayExceptionDialogFactory_SoftwareExpiredDialogFragment */
    /* JADX WARN: Multi-variable type inference failed */
    public void A0c(Activity activity) {
        Hilt_DisplayExceptionDialogFactory_SoftwareExpiredDialogFragment.super.A0c(activity);
        ContextWrapper contextWrapper = this.A00;
        AnonymousClass01M.A18(contextWrapper == null || 2eD.A00(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        if (this.A00 == null) {
            this.A00 = new 2eC(((Hilt_WaDialogFragment) this).A00, this);
            A17();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.whatsapp.Hilt_DisplayExceptionDialogFactory_SoftwareExpiredDialogFragment */
    /* JADX WARN: Multi-variable type inference failed */
    public void A0u(Context context) {
        Hilt_DisplayExceptionDialogFactory_SoftwareExpiredDialogFragment.super.A0u(context);
        if (this.A00 == null) {
            this.A00 = new 2eC(((Hilt_WaDialogFragment) this).A00, this);
            A17();
        }
    }

    public void A17() {
        if (!this.A01) {
            this.A01 = true;
            ((AbstractC02250At) generatedComponent()).A0F((DisplayExceptionDialogFactory$SoftwareExpiredDialogFragment) this);
        }
    }
}
