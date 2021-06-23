package com.whatsapp;

import X.AbstractC03180Fl;
import X.AnonymousClass00C;
import X.AnonymousClass07X;
import X.AnonymousClass07Y;
import X.AnonymousClass192;
import X.AnonymousClass193;
import android.app.Dialog;
import android.os.Bundle;

public class SingleSelectionDialogFragment extends Hilt_SingleSelectionDialogFragment {
    public int A00;
    public int A01;
    public int A02;
    public String A03;
    public boolean A04;
    public String[] A05;

    public static Bundle A00(int i, int i2, int i3, String[] strArr) {
        Bundle bundle = new Bundle();
        bundle.putInt("dialogId", i);
        bundle.putInt("currentIndex", i2);
        bundle.putInt("dialogTitleResId", i3);
        bundle.putStringArray("items", strArr);
        return bundle;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.whatsapp.SingleSelectionDialogFragment */
    /* JADX WARN: Multi-variable type inference failed */
    public void A0v(Bundle bundle) {
        SingleSelectionDialogFragment.super.A0v(bundle);
        if (A09() instanceof AbstractC03180Fl) {
            Bundle bundle2 = this.A06;
            this.A01 = bundle2.getInt("dialogId");
            this.A00 = bundle2.getInt("currentIndex");
            if (bundle2.containsKey("dialogTitleResId")) {
                this.A03 = A0F(bundle2.getInt("dialogTitleResId"));
            } else {
                this.A03 = bundle2.getString("dialogTitle");
            }
            if (bundle2.containsKey("itemsArrayResId")) {
                this.A05 = A01().getStringArray(bundle2.getInt("itemsArrayResId"));
            } else {
                this.A05 = bundle2.getStringArray("items");
            }
            this.A04 = bundle2.getBoolean("showConfirmation", false);
            return;
        }
        StringBuilder A0R = AnonymousClass00C.A0R("Activity must implement ");
        A0R.append("SingleSelectionDialogFragment$SingleSelectionDialogListener");
        throw new IllegalStateException(A0R.toString());
    }

    public Dialog A0z(Bundle bundle) {
        return A18().A00();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.whatsapp.SingleSelectionDialogFragment */
    /* JADX WARN: Multi-variable type inference failed */
    public AnonymousClass07X A18() {
        AnonymousClass07X r0 = new AnonymousClass07X(A09());
        String str = this.A03;
        AnonymousClass07Y r2 = r0.A01;
        r2.A0I = str;
        int i = this.A00;
        this.A02 = i;
        String[] strArr = this.A05;
        AnonymousClass193 r4 = new AnonymousClass193(this);
        r2.A0M = strArr;
        r2.A05 = r4;
        r2.A00 = i;
        r2.A0L = true;
        if (this.A04) {
            r0.A06(2131888548, new AnonymousClass192(this));
            r0.A04(2131886565, null);
        }
        return r0;
    }
}
