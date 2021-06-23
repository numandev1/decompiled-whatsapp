package com.whatsapp;

import X.AnonymousClass01M;
import X.AnonymousClass0Gh;
import X.AnonymousClass0II;
import X.AnonymousClass0LK;
import android.app.Dialog;
import android.content.Context;
import android.text.TextUtils;
import androidx.preference.PreferenceFragmentCompat;
import androidx.preference.PreferenceScreen;

public abstract class WaPreferenceFragment extends Hilt_WaPreferenceFragment {
    public AnonymousClass0Gh A00;

    @Override // X.ComponentCallbacksC019009d
    public void A0e() {
        this.A0U = true;
        this.A00 = null;
    }

    @Override // X.ComponentCallbacksC019009d, com.whatsapp.Hilt_WaPreferenceFragment
    public void A0u(Context context) {
        super.A0u(context);
        this.A00 = (AnonymousClass0Gh) A09();
    }

    public Dialog A10(int i) {
        return null;
    }

    public void A11() {
        AnonymousClass0Gh r0 = this.A00;
        if (r0 != null) {
            r0.A01 = 2131889306;
            r0.A00 = 2131889464;
            AnonymousClass01M.A0t(r0, 501);
        }
    }

    public void A12(int i) {
        AnonymousClass0II r0 = ((PreferenceFragmentCompat) this).A02;
        if (r0 != null) {
            PreferenceScreen A04 = r0.A04(A0a(), i, r0.A07);
            AnonymousClass0II r1 = ((PreferenceFragmentCompat) this).A02;
            PreferenceScreen preferenceScreen = r1.A07;
            if (A04 != preferenceScreen) {
                if (preferenceScreen != null) {
                    preferenceScreen.A09();
                }
                r1.A07 = A04;
                ((PreferenceFragmentCompat) this).A04 = true;
                if (((PreferenceFragmentCompat) this).A05 && !((PreferenceFragmentCompat) this).A01.hasMessages(1)) {
                    ((PreferenceFragmentCompat) this).A01.obtainMessage(1).sendToTarget();
                }
            }
            AnonymousClass0Gh r02 = this.A00;
            if (r02 != null) {
                CharSequence title = r02.getTitle();
                AnonymousClass0LK A0c = r02.A0c();
                if (!TextUtils.isEmpty(title) && A0c != null) {
                    A0c.A0H(title);
                    return;
                }
                return;
            }
            return;
        }
        throw new RuntimeException("This should be called after super.onCreate.");
    }
}
