package com.whatsapp;

import X.2eC;
import X.2eD;
import X.AbstractC02240As;
import X.AnonymousClass005;
import X.AnonymousClass01M;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.preference.PreferenceFragmentCompat;

public abstract class Hilt_WaPreferenceFragment extends PreferenceFragmentCompat implements AnonymousClass005 {
    public ContextWrapper A00;
    public boolean A01 = false;
    public final Object A02 = new Object();
    public volatile 2eD A03;

    @Override // X.ComponentCallbacksC019009d
    public Context A0a() {
        return this.A00;
    }

    @Override // X.ComponentCallbacksC019009d
    public LayoutInflater A0b(Bundle bundle) {
        return LayoutInflater.from(new 2eC(A03(), this));
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
        if (this.A00 == null) {
            this.A00 = new 2eC(super.A0a(), this);
            A0z();
        }
    }

    @Override // X.ComponentCallbacksC019009d
    public void A0u(Context context) {
        super.A0u(context);
        if (this.A00 == null) {
            this.A00 = new 2eC(super.A0a(), this);
            A0z();
        }
    }

    public void A0z() {
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
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
