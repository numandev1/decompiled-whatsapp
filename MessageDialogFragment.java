package com.whatsapp;

import X.1dm;
import X.AbstractC02340Bc;
import X.AnonymousClass01G;
import X.AnonymousClass01M;
import X.AnonymousClass07X;
import X.AnonymousClass07Y;
import X.AnonymousClass09I;
import X.AnonymousClass09M;
import X.AnonymousClass0FI;
import X.AnonymousClass18N;
import X.AnonymousClass18O;
import X.AnonymousClass18P;
import X.C02360Be;
import X.ComponentCallbacksC019009d;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import java.util.ArrayList;

public class MessageDialogFragment extends Hilt_MessageDialogFragment {
    public DialogInterface.OnClickListener A00;
    public AnonymousClass01G A01;
    public 1dm A02;

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: com.whatsapp.MessageDialogFragment */
    /* JADX WARN: Multi-variable type inference failed */
    public Dialog A0z(Bundle bundle) {
        String A18 = A18("title", "title_id", "title_params_values", "title_params_types");
        int i = A02().getInt("message_view_id");
        CharSequence A0S = AnonymousClass01M.A0S(A18("message", "message_id", "message_params_values", "message_params_types"), super.A00, null, this.A02);
        AnonymousClass07X r3 = new AnonymousClass07X(A0A());
        AnonymousClass07Y r4 = r3.A01;
        r4.A0I = A18;
        r4.A0J = true;
        if (i != 0) {
            r4.A0C = null;
            r4.A01 = i;
        } else {
            r4.A0E = A0S;
        }
        int i2 = A02().getInt("primary_action_text_id");
        if (i2 == 0 || this.A00 == null) {
            r3.A06(2131888548, new AnonymousClass18O(this));
        } else {
            r3.A06(i2, new AnonymousClass18P(this));
            int i3 = A02().getInt("secondary_action_text_id");
            if (i3 != 0) {
                r3.A04(i3, new AnonymousClass18N(this));
            }
        }
        return r3.A00();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.whatsapp.MessageDialogFragment */
    /* JADX WARN: Multi-variable type inference failed */
    public void A14(AbstractC02340Bc r4, String str) {
        if (r4 != null) {
            C02360Be r0 = new C02360Be(r4);
            r0.A0A(0, this, str, 1);
            r0.A05();
            return;
        }
        throw null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: com.whatsapp.MessageDialogFragment */
    /* JADX WARN: Multi-variable type inference failed */
    public final String A18(String str, String str2, String str3, String str4) {
        String string = A02().getString(str);
        if (string != null) {
            return string;
        }
        int i = this.A06.getInt(str2);
        if (i == 0) {
            return null;
        }
        ArrayList<String> stringArrayList = this.A06.getStringArrayList(str3);
        if (stringArrayList == null) {
            return this.A01.A08(i);
        }
        ArrayList<Integer> integerArrayList = this.A06.getIntegerArrayList(str4);
        if (integerArrayList == null || integerArrayList.size() != stringArrayList.size()) {
            throw new IllegalArgumentException();
        }
        Object[] objArr = new Object[stringArrayList.size()];
        for (int i2 = 0; i2 < stringArrayList.size(); i2++) {
            int intValue = integerArrayList.get(i2).intValue();
            String str5 = stringArrayList.get(i2);
            if (intValue == 1) {
                objArr[i2] = Long.valueOf(Long.parseLong(str5));
            } else {
                objArr[i2] = str5;
            }
        }
        return this.A01.A0F(i, objArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.whatsapp.MessageDialogFragment */
    /* JADX WARN: Multi-variable type inference failed */
    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.A0C) {
            A16(true, true);
        }
        ComponentCallbacksC019009d r0 = this.A0D;
        if (r0 == null || !(r0 instanceof AnonymousClass0FI) || !((AnonymousClass0FI) r0).AQG(A02().getInt("id"))) {
            AnonymousClass09M A09 = A09();
            if (A09 instanceof AnonymousClass09I) {
                ((AnonymousClass09I) A09).A10(A02().getInt("id"));
            }
        }
    }
}
