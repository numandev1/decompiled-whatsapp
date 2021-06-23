package com.whatsapp;

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
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public abstract class Hilt_RoundedBottomSheetDialogFragment extends BottomSheetDialogFragment implements AnonymousClass005 {
    public ContextWrapper A00;
    public boolean A01 = false;
    public final Object A02 = new Object();
    public volatile 2eD A03;

    @Override // X.ComponentCallbacksC019009d
    public Context A0a() {
        return this.A00;
    }

    @Override // X.ComponentCallbacksC019009d, androidx.fragment.app.DialogFragment
    public LayoutInflater A0b(Bundle bundle) {
        return LayoutInflater.from(new 2eC(super.A0b(bundle), this));
    }

    @Override // X.ComponentCallbacksC019009d
    public void A0c(Activity activity) {
        boolean z = true;
        this.A0U = true;
        ContextWrapper contextWrapper = this.A00;
        if (!(contextWrapper == null || 2eD.A00(contextWrapper) == activity)) {
            z = false;
        }
        AnonymousClass01M.A18(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        A18();
    }

    @Override // X.ComponentCallbacksC019009d, androidx.fragment.app.DialogFragment
    public void A0u(Context context) {
        super.A0u(context);
        A18();
    }

    public void A17() {
        if (!this.A01) {
            this.A01 = true;
            ((AbstractC02250At) generatedComponent()).A0M((RoundedBottomSheetDialogFragment) this);
        }
    }

    public final void A18() {
        if (this.A00 == null) {
            this.A00 = new 2eC(super.A0a(), this);
            A17();
        }
    }

    @Override // X.ComponentCallbacksC019009d, X.AnonymousClass09U
    public AbstractC02240As AA2() {
        return AnonymousClass01M.A0H(this);
    }

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
