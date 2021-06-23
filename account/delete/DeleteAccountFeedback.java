package com.whatsapp.account.delete;

import X.AnonymousClass07X;
import X.AnonymousClass09G;
import X.AnonymousClass09I;
import X.AnonymousClass09K;
import X.AnonymousClass0LK;
import X.AnonymousClass0NS;
import X.AnonymousClass0Nn;
import X.AnonymousClass0X6;
import X.AnonymousClass1Bf;
import X.C020709z;
import X.C29331Wx;
import X.C29341Wy;
import X.DialogInterface$OnClickListenerC24431Bg;
import X.RunnableC24421Be;
import X.View$OnClickListenerC24441Bh;
import X.View$OnClickListenerC24451Bi;
import X.ViewTreeObserver$OnPreDrawListenerC24501Bn;
import X.ViewTreeObserver$OnScrollChangedListenerC24461Bj;
import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.registration.ChangeNumberOverview;
import com.whatsapp.util.Log;

public class DeleteAccountFeedback extends AnonymousClass0NS {
    public static final int[] A08 = {2131887042, 2131887041, 2131887048, 2131887044, 2131887045, 2131887046};
    public int A00;
    public int A01 = -1;
    public View A02;
    public EditText A03;
    public ScrollView A04;
    public AnonymousClass0X6 A05;
    public DialogFragment A06;
    public boolean A07 = false;

    public class ChangeNumberMessageDialogFragment extends Hilt_DeleteAccountFeedback_ChangeNumberMessageDialogFragment {
        /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: com.whatsapp.account.delete.DeleteAccountFeedback$ChangeNumberMessageDialogFragment */
        /* JADX WARN: Multi-variable type inference failed */
        public Dialog A0z(Bundle bundle) {
            int i = A02().getInt("deleteReason", -1);
            String string = A02().getString("additionalComments");
            AnonymousClass07X r2 = new AnonymousClass07X(A09());
            r2.A01.A0E = A0G(2131887028, A0F(2131889717));
            r2.A06(2131889717, new DialogInterface$OnClickListenerC24431Bg(this));
            r2.A04(2131889733, new AnonymousClass1Bf(this, i, string));
            return r2.A00();
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.whatsapp.account.delete.DeleteAccountFeedback$ChangeNumberMessageDialogFragment */
        /* JADX WARN: Multi-variable type inference failed */
        public /* synthetic */ void A18() {
            Log.i("delete-account-feedback/changenumber");
            A0i(new Intent(A09(), ChangeNumberOverview.class));
        }
    }

    public final void A1Q() {
        boolean canScrollVertically = this.A04.canScrollVertically(1);
        View view = this.A02;
        if (canScrollVertically) {
            view.setElevation((float) this.A00);
        } else {
            view.setElevation(0.0f);
        }
    }

    public /* synthetic */ void lambda$onCreate$7$DeleteAccountFeedback(View view) {
        this.A03.clearFocus();
        if (getCurrentFocus() != null) {
            ((AnonymousClass09G) this).A0G.A01(getCurrentFocus());
        }
        this.A07 = true;
        this.A05.A00();
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.whatsapp.account.delete.DeleteAccountFeedback$ChangeNumberMessageDialogFragment, X.09d, androidx.fragment.app.DialogFragment] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void lambda$onCreate$8$DeleteAccountFeedback(android.view.View r6) {
        /*
        // Method dump skipped, instructions count: 112
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.account.delete.DeleteAccountFeedback.lambda$onCreate$8$DeleteAccountFeedback(android.view.View):void");
    }

    @Override // X.AnonymousClass09L, X.AnonymousClass09K, X.AnonymousClass09M, X.AnonymousClass09I
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (Build.VERSION.SDK_INT >= 21) {
            this.A04.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver$OnPreDrawListenerC24501Bn(this));
        }
    }

    @Override // X.AnonymousClass09L, X.AnonymousClass09K, X.AnonymousClass09N, X.AnonymousClass09M, X.AnonymousClass09H, X.AnonymousClass09G, X.AnonymousClass09J, X.AnonymousClass09I, X.AnonymousClass0NS, X.AnonymousClass09O
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(2131889726);
        AnonymousClass0LK A0c = A0c();
        if (A0c != null) {
            A0c.A0L(true);
        }
        setContentView(2131558732);
        this.A04 = (ScrollView) findViewById(2131364462);
        this.A03 = (EditText) findViewById(2131362690);
        this.A02 = findViewById(2131362132);
        TextView textView = (TextView) findViewById(2131364549);
        textView.setBackground(new AnonymousClass0Nn(((AnonymousClass09K) this).A01, C020709z.A03(this, 2131230908)));
        this.A00 = getResources().getDimensionPixelSize(2131166146);
        if (bundle != null) {
            this.A01 = bundle.getInt("delete_reason_selected", -1);
            this.A07 = bundle.getBoolean("delete_reason_showing", false);
            EditText editText = this.A03;
            int i = 2131887026;
            if (this.A01 == 2) {
                i = 2131887027;
            }
            editText.setHint(getString(i));
        }
        int i2 = this.A01;
        int[] iArr = A08;
        int length = iArr.length;
        if (i2 >= length || i2 < 0) {
            textView.setText("");
        } else {
            textView.setText(iArr[i2]);
        }
        this.A05 = new AnonymousClass0X6(this, findViewById(2131362691));
        for (int i3 = 0; i3 < length; i3++) {
            this.A05.A02.add(0, i3, 0, iArr[i3]);
        }
        AnonymousClass0X6 r1 = this.A05;
        r1.A00 = new C29331Wx(this);
        r1.A01 = new C29341Wy(this, textView);
        textView.setOnClickListener(new View$OnClickListenerC24441Bh(this));
        findViewById(2131362680).setOnClickListener(new View$OnClickListenerC24451Bi(this));
        ((AnonymousClass09I) this).A04.post(new RunnableC24421Be(this));
        if (Build.VERSION.SDK_INT >= 21) {
            this.A00 = getResources().getDimensionPixelSize(2131166146);
            this.A04.getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserver$OnScrollChangedListenerC24461Bj(this));
            this.A04.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver$OnPreDrawListenerC24501Bn(this));
        }
    }

    @Override // X.AnonymousClass09L, X.AnonymousClass09N, X.AnonymousClass09M, X.AnonymousClass09O
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("delete_reason_selected", this.A01);
        bundle.putBoolean("delete_reason_showing", this.A07);
        super.onSaveInstanceState(bundle);
    }

    @Override // X.AnonymousClass09L, X.AnonymousClass09M
    public void onStop() {
        super.onStop();
        AnonymousClass0X6 r0 = this.A05;
        if (r0 != null) {
            r0.A00 = null;
            r0.A03.A01();
        }
    }
}
