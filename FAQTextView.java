package com.whatsapp;

import X.1dl;
import X.AbstractC05470Qy;
import X.AnonymousClass00C;
import X.AnonymousClass01G;
import X.AnonymousClass020;
import X.AnonymousClass07S;
import X.AnonymousClass0CU;
import X.AnonymousClass0KQ;
import X.AnonymousClass0KS;
import X.AnonymousClass0KT;
import X.C05570Rm;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.util.Pair;
import com.whatsapp.util.Log;

public class FAQTextView extends AbstractC05470Qy {
    public AnonymousClass07S A00;
    public AnonymousClass0CU A01;
    public AnonymousClass020 A02;
    public AnonymousClass01G A03;
    public 1dl A04;

    public FAQTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, C05570Rm.A0z, 0, 0);
            try {
                String A0D = this.A03.A0D(1, obtainStyledAttributes);
                String string = obtainStyledAttributes.getString(0);
                if (!(A0D == null || string == null)) {
                    setEducationText(new SpannableStringBuilder(A0D), this.A04.A02("general", string, (String) null, (Pair) null).toString());
                }
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        setAccessibilityHelper(new AnonymousClass0KT(this.A02, this));
    }

    public final void setEducationText(Spannable spannable, String str) {
        setLinksClickable(true);
        setFocusable(false);
        this.A07 = new AnonymousClass0KS();
        String string = getContext().getString(2131888097);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        spannableStringBuilder.setSpan(new AnonymousClass0KQ(getContext(), this.A00, this.A02, this.A01, str), 0, string.length(), 33);
        String string2 = getContext().getString(2131887473);
        Spannable[] spannableArr = {spannable, spannableStringBuilder};
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(string2);
        int i = 0;
        while (true) {
            StringBuilder A0R = AnonymousClass00C.A0R("%");
            int i2 = i + 1;
            A0R.append(i2);
            A0R.append("$s");
            String obj = A0R.toString();
            int indexOf = spannableStringBuilder2.toString().indexOf(obj);
            if (indexOf != -1) {
                spannableStringBuilder2.replace(indexOf, obj.length() + indexOf, (CharSequence) spannableArr[i]);
            } else {
                StringBuilder sb = new StringBuilder("RichTextUtils/formatSpannableString: skipping placeholder of index ");
                sb.append(i2);
                sb.append(" as we cannot find it in template: ");
                sb.append(string2);
                sb.append(" with args: ");
                sb.append(spannableArr);
                Log.e(sb.toString());
            }
            if (i2 >= 2) {
                setText(spannableStringBuilder2);
                return;
            }
            i = i2;
        }
    }
}
