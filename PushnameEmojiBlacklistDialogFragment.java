package com.whatsapp;

import X.1dl;
import X.1dm;
import X.2e7;
import X.AnonymousClass01G;
import X.AnonymousClass01M;
import X.AnonymousClass07X;
import X.AnonymousClass07Z;
import X.DialogInterface$OnClickListenerC237118i;
import X.DialogInterface$OnClickListenerC237218j;
import android.app.Dialog;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;

public class PushnameEmojiBlacklistDialogFragment extends Hilt_PushnameEmojiBlacklistDialogFragment {
    public AnonymousClass01G A00;
    public 1dm A01;
    public 1dl A02;

    public static PushnameEmojiBlacklistDialogFragment A00(String str) {
        PushnameEmojiBlacklistDialogFragment pushnameEmojiBlacklistDialogFragment = new PushnameEmojiBlacklistDialogFragment();
        Bundle bundle = new Bundle();
        String[] strArr = 2e7.A01;
        int length = strArr.length;
        ArrayList<String> arrayList = new ArrayList<>(length);
        for (String str2 : strArr) {
            if (str.contains(str2)) {
                arrayList.add(str2);
            }
        }
        bundle.putStringArrayList("invalid_emojis", arrayList);
        pushnameEmojiBlacklistDialogFragment.A0P(bundle);
        return pushnameEmojiBlacklistDialogFragment;
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0z(Bundle bundle) {
        AnonymousClass07X r0 = new AnonymousClass07X(A09());
        ArrayList<String> stringArrayList = A02().getStringArrayList("invalid_emojis");
        if (stringArrayList != null) {
            String obj = this.A02.A02("general", "26000056", (String) null, (Pair) null).toString();
            r0.A01.A0E = AnonymousClass01M.A0U(this.A00.A0C(2131755179, (long) stringArrayList.size(), TextUtils.join(" ", stringArrayList)), A09().getApplicationContext(), this.A01);
            r0.A05(2131888097, new DialogInterface$OnClickListenerC237118i(this, obj));
            r0.A06(2131888548, DialogInterface$OnClickListenerC237218j.A00);
            AnonymousClass07Z A002 = r0.A00();
            A002.setCanceledOnTouchOutside(true);
            return A002;
        }
        throw null;
    }
}
