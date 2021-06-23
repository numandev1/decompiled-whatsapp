package com.whatsapp.authentication;

import X.AnonymousClass01G;
import X.AnonymousClass01Q;
import X.AnonymousClass05S;
import X.AnonymousClass0E8;
import X.AnonymousClass0JM;
import X.AnonymousClass1Cg;
import X.AnonymousClass1Ch;
import X.AnonymousClass1Ci;
import X.AnonymousClass1XF;
import X.AnonymousClass1XG;
import X.C000100c;
import X.CountDownTimerC24781Cw;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

public class FingerprintBottomSheet extends Hilt_FingerprintBottomSheet implements AnonymousClass0JM {
    public long A00 = 0;
    public TextView A01;
    public TextView A02;
    public AnonymousClass0E8 A03;
    public AnonymousClass1XG A04;
    public FingerprintView A05;
    public C000100c A06;
    public AnonymousClass01G A07;
    public boolean A08 = false;

    public static FingerprintBottomSheet A00(int i, int i2, int i3, int i4) {
        FingerprintBottomSheet fingerprintBottomSheet = new FingerprintBottomSheet();
        Bundle bundle = new Bundle();
        bundle.putInt("title", i);
        bundle.putInt("negative_button_text", i2);
        bundle.putInt("positive_button_text", i3);
        if (i4 != 0) {
            bundle.putInt("header_layout_id", i4);
        }
        bundle.putInt("fingerprint_view_style_id", 2131951920);
        bundle.putBoolean("full_screen", false);
        fingerprintBottomSheet.A0P(bundle);
        return fingerprintBottomSheet;
    }

    @Override // X.ComponentCallbacksC019009d, androidx.fragment.app.DialogFragment
    public void A0e() {
        super.A0e();
        this.A04 = null;
    }

    @Override // X.ComponentCallbacksC019009d
    public void A0f() {
        this.A0U = true;
        A1A();
    }

    @Override // X.ComponentCallbacksC019009d
    public View A0p(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle A022 = A02();
        int i = A022.getInt("custom_layout_id");
        if (i == 0) {
            i = 2131558812;
        }
        View inflate = layoutInflater.inflate(i, viewGroup, false);
        int i2 = A022.getInt("header_layout_id");
        if (i2 != 0) {
            ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(2131363270);
            layoutInflater.inflate(i2, viewGroup2);
            viewGroup2.setVisibility(0);
        }
        ViewGroup viewGroup3 = (ViewGroup) inflate.findViewById(2131363038);
        if (viewGroup3 != null) {
            FingerprintView fingerprintView = new FingerprintView(inflate.getContext(), null, 0, A022.getInt("fingerprint_view_style_id"));
            this.A05 = fingerprintView;
            viewGroup3.addView(fingerprintView);
        } else {
            this.A05 = (FingerprintView) inflate.findViewById(2131363037);
        }
        ((TextView) inflate.findViewById(2131363029)).setText(A0F(A022.getInt("title", 2131887499)));
        if (A022.getInt("positive_button_text") != 0) {
            String A0F = A0F(A022.getInt("positive_button_text"));
            TextView textView = (TextView) inflate.findViewById(2131363028);
            this.A02 = textView;
            textView.setText(A0F);
            this.A02.setOnClickListener(new AnonymousClass1Ch(this));
        }
        if (A022.getInt("negative_button_text") != 0) {
            String A0F2 = A0F(A022.getInt("negative_button_text"));
            TextView textView2 = (TextView) inflate.findViewById(2131363027);
            this.A01 = textView2;
            AnonymousClass05S.A1S(textView2);
            this.A01.setText(A0F2);
            this.A01.setOnClickListener(new AnonymousClass1Cg(this));
        }
        this.A05.A00 = this.A04;
        Window window = ((DialogFragment) this).A03.getWindow();
        if (window != null) {
            if (Build.VERSION.SDK_INT >= 21) {
                window.getDecorView().setSystemUiVisibility(1280);
                window.setStatusBarColor(0);
            }
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            attributes.gravity = 48;
            window.setAttributes(attributes);
            ((DialogFragment) this).A03.setOnShowListener(new AnonymousClass1Ci(this, A022));
            return inflate;
        }
        throw null;
    }

    @Override // X.ComponentCallbacksC019009d, androidx.fragment.app.DialogFragment
    public void A0r() {
        super.A0r();
        FingerprintView fingerprintView = this.A05;
        if (fingerprintView != null) {
            fingerprintView.A00 = null;
            this.A05 = null;
        }
    }

    @Override // X.ComponentCallbacksC019009d
    public void A0s() {
        this.A0U = true;
        if (this.A00 <= this.A06.A05()) {
            A1B();
        }
    }

    @Override // X.ComponentCallbacksC019009d, androidx.fragment.app.DialogFragment
    public void A0v(Bundle bundle) {
        super.A0v(bundle);
        A12(0, 2131952209);
    }

    @Override // androidx.fragment.app.DialogFragment
    public void A10() {
        A1A();
        A16(false, false);
    }

    public void A18() {
        AnonymousClass0E8 r0 = new AnonymousClass0E8();
        this.A03 = r0;
        AnonymousClass1XG r1 = this.A04;
        if (r1 != null) {
            r1.A03(r0, this);
        }
    }

    public void A19() {
        A11();
    }

    public final void A1A() {
        AnonymousClass0E8 r0 = this.A03;
        if (r0 != null) {
            r0.A01();
            this.A03 = null;
        }
    }

    public final void A1B() {
        if (!this.A08) {
            FingerprintView fingerprintView = this.A05;
            if (fingerprintView != null) {
                fingerprintView.A03(fingerprintView.A04);
            }
            AnonymousClass0E8 r0 = new AnonymousClass0E8();
            this.A03 = r0;
            AnonymousClass1XG r1 = this.A04;
            if (r1 != null) {
                r1.A03(r0, this);
            }
        }
    }

    public /* synthetic */ void A1C() {
        A11();
        AnonymousClass1XG r0 = this.A04;
        if (r0 != null) {
            r0.A02();
        }
    }

    public void A1D(long j) {
        if (j > this.A06.A05()) {
            this.A00 = j;
            A1A();
            new CountDownTimerC24781Cw(this, j - this.A06.A05(), j).start();
        }
    }

    public void A1E(Bundle bundle, DialogInterface dialogInterface) {
        View findViewById = ((Dialog) dialogInterface).findViewById(2131362710);
        if (findViewById != null) {
            BottomSheetBehavior A002 = BottomSheetBehavior.A00(findViewById);
            if (bundle.getBoolean("full_screen")) {
                ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
                layoutParams.height = Resources.getSystem().getDisplayMetrics().heightPixels - AnonymousClass01Q.A02(((Hilt_FingerprintBottomSheet) this).A00);
                findViewById.setLayoutParams(layoutParams);
            }
            A002.A0N(3);
            A002.A0E = new AnonymousClass1XF(this);
            return;
        }
        throw null;
    }

    @Override // X.AnonymousClass0JM
    public void AI3(int i, CharSequence charSequence) {
        AnonymousClass1XG r0 = this.A04;
        if (r0 != null) {
            r0.A01();
        }
        if (this.A05 != null) {
            if (i == 7) {
                charSequence = A0G(2131886231, 30);
            }
            this.A05.A04(charSequence);
        }
        A1A();
    }

    @Override // X.AnonymousClass0JM
    public void AI4() {
        FingerprintView fingerprintView = this.A05;
        if (fingerprintView != null) {
            fingerprintView.A00();
        }
    }

    @Override // X.AnonymousClass0JM
    public void AI6(int i, CharSequence charSequence) {
        FingerprintView fingerprintView = this.A05;
        if (fingerprintView != null) {
            fingerprintView.A05(charSequence.toString());
        }
    }

    @Override // X.AnonymousClass0JM
    public void AI7(byte[] bArr) {
        AnonymousClass1XG r0 = this.A04;
        if (r0 != null) {
            r0.A04(bArr);
        }
        FingerprintView fingerprintView = this.A05;
        if (fingerprintView != null) {
            fingerprintView.A01();
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public void onCancel(DialogInterface dialogInterface) {
        A1A();
    }
}
