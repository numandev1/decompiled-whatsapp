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

public abstract class Hilt_IntentChooserBottomSheetDialogFragment extends RoundedBottomSheetDialogFragment {
    public ContextWrapper A00;
    public boolean A01 = false;

    @Override // X.ComponentCallbacksC019009d, com.whatsapp.Hilt_RoundedBottomSheetDialogFragment
    public Context A0a() {
        return this.A00;
    }

    @Override // X.ComponentCallbacksC019009d, com.whatsapp.Hilt_RoundedBottomSheetDialogFragment, androidx.fragment.app.DialogFragment
    public LayoutInflater A0b(Bundle bundle) {
        return LayoutInflater.from(new 2eC(super.A0b(bundle), this));
    }

    @Override // X.ComponentCallbacksC019009d, com.whatsapp.Hilt_RoundedBottomSheetDialogFragment
    public void A0c(Activity activity) {
        super.A0c(activity);
        ContextWrapper contextWrapper = this.A00;
        AnonymousClass01M.A18(contextWrapper == null || 2eD.A00(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        if (this.A00 == null) {
            this.A00 = new 2eC(((Hilt_RoundedBottomSheetDialogFragment) this).A00, this);
            A17();
        }
    }

    @Override // X.ComponentCallbacksC019009d, com.whatsapp.Hilt_RoundedBottomSheetDialogFragment, androidx.fragment.app.DialogFragment
    public void A0u(Context context) {
        super.A0u(context);
        if (this.A00 == null) {
            this.A00 = new 2eC(((Hilt_RoundedBottomSheetDialogFragment) this).A00, this);
            A17();
        }
    }

    @Override // com.whatsapp.Hilt_RoundedBottomSheetDialogFragment
    public void A17() {
        if (!this.A01) {
            this.A01 = true;
            ((AbstractC02250At) generatedComponent()).A0H((IntentChooserBottomSheetDialogFragment) this);
        }
    }
}
