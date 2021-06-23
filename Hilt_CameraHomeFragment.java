package com.whatsapp;

import X.2eC;
import X.2eD;
import X.AbstractC02250At;
import X.AnonymousClass01M;
import X.AnonymousClass01T;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;

public abstract class Hilt_CameraHomeFragment extends Hilt_BaseViewStubFragment {
    public ContextWrapper A00;
    public ViewStub A01;
    public AnonymousClass01T A02;
    public boolean A03 = false;
    public boolean A04 = false;

    public void A0V(boolean z) {
        ViewStub viewStub;
        Hilt_CameraHomeFragment.super.A0V(z);
        if (z && (viewStub = this.A01) != null && !this.A03) {
            viewStub.inflate();
            this.A03 = true;
        }
    }

    public Context A0a() {
        return this.A00;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.whatsapp.Hilt_CameraHomeFragment */
    /* JADX WARN: Multi-variable type inference failed */
    public LayoutInflater A0b(Bundle bundle) {
        return LayoutInflater.from(new 2eC(LayoutInflater.from(new 2eC(A03(), this)), this));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.whatsapp.Hilt_CameraHomeFragment */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.whatsapp.Hilt_BaseViewStubFragment
    public void A0c(Activity activity) {
        super.A0c(activity);
        ContextWrapper contextWrapper = this.A00;
        AnonymousClass01M.A18(contextWrapper == null || 2eD.A00(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        if (this.A00 == null) {
            this.A00 = new 2eC(super.A00, this);
            A0x();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.whatsapp.Hilt_CameraHomeFragment */
    /* JADX WARN: Multi-variable type inference failed */
    public void A0e() {
        this.A0U = true;
        this.A03 = false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.whatsapp.Hilt_CameraHomeFragment */
    /* JADX WARN: Multi-variable type inference failed */
    public View A0p(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(2131558829, viewGroup, false);
        ViewStub viewStub = (ViewStub) inflate.findViewById(2131363088);
        this.A01 = viewStub;
        viewStub.setLayoutResource(2131558533);
        if (!this.A03 && (this.A0j || !this.A02.A0C(128))) {
            this.A01.inflate();
            this.A03 = true;
        }
        return inflate;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.whatsapp.Hilt_CameraHomeFragment */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.whatsapp.Hilt_BaseViewStubFragment
    public void A0u(Context context) {
        super.A0u(context);
        if (this.A00 == null) {
            this.A00 = new 2eC(super.A00, this);
            A0x();
        }
    }

    @Override // com.whatsapp.Hilt_BaseViewStubFragment
    public void A0x() {
        if (!this.A04) {
            this.A04 = true;
            ((AbstractC02250At) generatedComponent()).A07((CameraHomeFragment) this);
        }
    }
}
