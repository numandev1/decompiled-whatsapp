package com.whatsapp;

import X.1dn;
import X.1fN;
import X.1fZ;
import X.1la;
import X.1s8;
import X.2Hq;
import X.AbstractC000800k;
import X.AbstractC003001o;
import X.AnonymousClass00G;
import X.AnonymousClass01G;
import X.AnonymousClass01O;
import X.AnonymousClass07S;
import X.AnonymousClass07T;
import X.AnonymousClass07X;
import X.AnonymousClass07Y;
import X.AnonymousClass18Q;
import X.AnonymousClass18S;
import X.AnonymousClass18V;
import X.C000100c;
import X.C000700j;
import X.C002701g;
import X.C006102u;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import java.util.ArrayList;
import java.util.List;

public class MuteDialogFragment extends Hilt_MuteDialogFragment {
    public AnonymousClass07S A00;
    public C000700j A01;
    public AnonymousClass07T A02;
    public 1s8 A03;
    public 1dn A04;
    public C000100c A05;
    public AnonymousClass00G A06;
    public AnonymousClass01G A07;
    public 1fZ A08;
    public 1fN A09;
    public AnonymousClass01O A0A;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.09d, com.whatsapp.MuteDialogFragment] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.whatsapp.MuteDialogFragment A00(X.AbstractC003001o r4) {
        /*
            com.whatsapp.MuteDialogFragment r0 = new com.whatsapp.MuteDialogFragment
            r0.<init>()
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r2 = "jid"
            java.lang.String r3 = r4.getRawString()
            r1.putString(r2, r3)
            r0.A0P(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.MuteDialogFragment.A00(X.01o):com.whatsapp.MuteDialogFragment");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.09d, com.whatsapp.MuteDialogFragment] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.whatsapp.MuteDialogFragment A01(java.util.Collection r4) {
        /*
            com.whatsapp.MuteDialogFragment r0 = new com.whatsapp.MuteDialogFragment
            r0.<init>()
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r2 = "jids"
            java.util.ArrayList r3 = X.C002701g.A0X(r4)
            r1.putStringArrayList(r2, r3)
            java.lang.String r2 = "mute_in_conversation_fragment"
            r3 = 1
            r1.putBoolean(r2, r3)
            r0.A0P(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.MuteDialogFragment.A01(java.util.Collection):com.whatsapp.MuteDialogFragment");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r12v0, resolved type: com.whatsapp.MuteDialogFragment */
    /* JADX WARN: Multi-variable type inference failed */
    public Dialog A0z(Bundle bundle) {
        AbstractC003001o A022 = AbstractC003001o.A02(A02().getString("jid"));
        ArrayList<String> stringArrayList = A02().getStringArrayList("jids");
        List A0Y = stringArrayList == null ? null : C002701g.A0Y(AbstractC003001o.class, stringArrayList);
        boolean z = A02().getBoolean("mute_in_conversation_fragment");
        int[] iArr = {this.A06.A00.getInt("last_mute_selection", 0)};
        C000700j r0 = this.A01;
        C006102u r1 = AbstractC000800k.A1W;
        int[] iArr2 = r0.A0C(r1) ? 2Hq.A00 : 2Hq.A02;
        int[] iArr3 = this.A01.A0C(r1) ? 2Hq.A01 : 2Hq.A03;
        int length = iArr2.length;
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = 1la.A0W(this.A07, iArr2[i], iArr3[i]);
        }
        if (iArr[0] >= length) {
            iArr[0] = 0;
        }
        View inflate = A0A().getLayoutInflater().inflate(2131559034, (ViewGroup) null, false);
        CheckBox checkBox = (CheckBox) inflate.findViewById(2131363729);
        if (A022 == null || !this.A09.A07(A022).A09()) {
            checkBox.setChecked(this.A06.A00.getBoolean("last_mute_show_notifications", false));
        } else {
            checkBox.setChecked(this.A09.A07(A022).A0F);
        }
        AnonymousClass07X r9 = new AnonymousClass07X(A09());
        r9.A03(2131888364);
        int i2 = iArr[0];
        AnonymousClass18V r12 = new AnonymousClass18V(iArr);
        AnonymousClass07Y r10 = r9.A01;
        r10.A0M = strArr;
        r10.A05 = r12;
        r10.A00 = i2;
        r10.A0L = true;
        r9.A06(2131888548, new AnonymousClass18S(this, checkBox, iArr, z, A0Y, A022));
        r9.A04(2131886565, new AnonymousClass18Q(this, A0Y));
        r10.A0C = inflate;
        r10.A01 = 0;
        return r9.A00();
    }

    public final long A18(int i) {
        int i2 = (this.A01.A0C(AbstractC000800k.A1W) ? 2Hq.A05 : 2Hq.A04)[i];
        C000100c r1 = this.A05;
        if (i2 == -1) {
            return -1;
        }
        return (((long) i2) * 60000) + r1.A01();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.whatsapp.MuteDialogFragment */
    /* JADX WARN: Multi-variable type inference failed */
    public final void A19() {
        AbstractC003001o A022;
        Bundle bundle = this.A06;
        if (bundle != null && (A022 = AbstractC003001o.A02(bundle.getString("jid"))) != null) {
            this.A08.A05(A022);
        }
    }

    public /* synthetic */ void A1A() {
        this.A08.A03(1);
    }

    public /* synthetic */ void A1B(AbstractC003001o r2) {
        if (C002701g.A14(r2) && this.A04.A0A(r2).A0Q) {
            this.A03.A02(r2);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.whatsapp.MuteDialogFragment */
    /* JADX WARN: Multi-variable type inference failed */
    public void onCancel(DialogInterface dialogInterface) {
        if (A02().getString("jids") == null) {
            A19();
        }
    }
}
