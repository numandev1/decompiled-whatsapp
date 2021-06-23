package com.whatsapp;

import X.AnonymousClass01L;
import X.AnonymousClass1E0;
import X.DialogInterface$OnShowListenerC237518m;
import android.app.Dialog;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

public abstract class RoundedBottomSheetDialogFragment extends Hilt_RoundedBottomSheetDialogFragment {
    public AnonymousClass01L A00;

    @Override // X.ComponentCallbacksC019009d
    public void A0V(boolean z) {
        super.A0V(z);
        AnonymousClass01L r0 = this.A00;
        if (z) {
            r0.A05(this, "visible");
        } else {
            r0.A05(this, "invisible");
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public int A0x() {
        return 2131952048;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.fragment.app.DialogFragment
    public Dialog A0z(Bundle bundle) {
        AnonymousClass1E0 r0 = new AnonymousClass1E0(A0a(), A0x());
        r0.setOnShowListener(new DialogInterface$OnShowListenerC237518m(this, r0));
        return r0;
    }

    public int A19() {
        Point point = new Point();
        A0A().getWindowManager().getDefaultDisplay().getSize(point);
        Rect rect = new Rect();
        A0A().getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        return point.y - rect.top;
    }

    public void A1A(View view) {
        BottomSheetBehavior A002 = BottomSheetBehavior.A00(view);
        A002.A0N(3);
        A002.A0N = true;
        A002.A0M(view.getHeight());
    }
}
