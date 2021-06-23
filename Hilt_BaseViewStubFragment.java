package com.whatsapp;

import X.2eC;
import X.2eD;
import X.AbstractC02240As;
import X.AnonymousClass005;
import X.AnonymousClass01M;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import com.whatsapp.base.WaFragment;

public abstract class Hilt_BaseViewStubFragment extends WaFragment implements AnonymousClass005 {
    public ContextWrapper A00;
    public final Object A01 = new Object();
    public volatile 2eD A02;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.whatsapp.Hilt_BaseViewStubFragment */
    /* JADX WARN: Multi-variable type inference failed */
    public void A0c(Activity activity) {
        boolean z = true;
        this.A0U = true;
        ContextWrapper contextWrapper = this.A00;
        if (!(contextWrapper == null || 2eD.A00(contextWrapper) == activity)) {
            z = false;
        }
        AnonymousClass01M.A18(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        if (this.A00 == null) {
            this.A00 = new 2eC(Hilt_BaseViewStubFragment.super.A0a(), this);
            A0x();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.whatsapp.Hilt_BaseViewStubFragment */
    /* JADX WARN: Multi-variable type inference failed */
    public void A0u(Context context) {
        Hilt_BaseViewStubFragment.super.A0u(context);
        if (this.A00 == null) {
            this.A00 = new 2eC(Hilt_BaseViewStubFragment.super.A0a(), this);
            A0x();
        }
    }

    public abstract void A0x();

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.whatsapp.Hilt_BaseViewStubFragment */
    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC02240As AA2() {
        return AnonymousClass01M.A0H(this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.whatsapp.Hilt_BaseViewStubFragment */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AnonymousClass005
    public final Object generatedComponent() {
        if (this.A02 == null) {
            synchronized (this.A01) {
                if (this.A02 == null) {
                    this.A02 = new 2eD(this);
                }
            }
        }
        return this.A02.generatedComponent();
    }
}
