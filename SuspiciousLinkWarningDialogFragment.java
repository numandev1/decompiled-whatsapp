package com.whatsapp;

import X.1dl;
import X.AnonymousClass01G;
import X.AnonymousClass020;
import X.AnonymousClass07S;
import X.AnonymousClass07X;
import X.AnonymousClass07Y;
import X.AnonymousClass0CU;
import X.AnonymousClass0D7;
import X.AnonymousClass0KQ;
import X.AnonymousClass0KS;
import X.AnonymousClass196;
import X.AnonymousClass197;
import X.C002701g;
import X.C020709z;
import android.app.Dialog;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.URLSpan;
import android.util.Pair;
import android.widget.TextView;
import java.util.AbstractCollection;

public class SuspiciousLinkWarningDialogFragment extends Hilt_SuspiciousLinkWarningDialogFragment {
    public AnonymousClass07S A00;
    public AnonymousClass0CU A01;
    public AnonymousClass020 A02;
    public AnonymousClass01G A03;
    public 1dl A04;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.09d, com.whatsapp.SuspiciousLinkWarningDialogFragment] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.whatsapp.SuspiciousLinkWarningDialogFragment A00(java.lang.String r4, java.util.Set r5) {
        /*
            com.whatsapp.SuspiciousLinkWarningDialogFragment r0 = new com.whatsapp.SuspiciousLinkWarningDialogFragment
            r0.<init>()
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r2 = "url"
            r1.putString(r2, r4)
            java.lang.String r2 = "phishingChars"
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>(r5)
            r1.putSerializable(r2, r3)
            r0.A0P(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.SuspiciousLinkWarningDialogFragment.A00(java.lang.String, java.util.Set):com.whatsapp.SuspiciousLinkWarningDialogFragment");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.whatsapp.SuspiciousLinkWarningDialogFragment */
    /* JADX WARN: Multi-variable type inference failed */
    public void A0g() {
        SuspiciousLinkWarningDialogFragment.super.A0g();
        TextView textView = (TextView) this.A03.findViewById(16908299);
        if (textView != null) {
            textView.setMovementMethod(new AnonymousClass0KS());
            textView.setTextColor(C020709z.A00(A09(), 2131100601));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r17v0, resolved type: com.whatsapp.SuspiciousLinkWarningDialogFragment */
    /* JADX WARN: Multi-variable type inference failed */
    public Dialog A0z(Bundle bundle) {
        SpannableString spannableString;
        int length;
        int i;
        String string = A02().getString("url");
        AbstractCollection abstractCollection = (AbstractCollection) A02().getSerializable("phishingChars");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(Html.fromHtml(A0G(2131890126, this.A04.A02("general", "26000162", (String) null, (Pair) null).toString())));
        URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
        if (uRLSpanArr != null) {
            for (URLSpan uRLSpan : uRLSpanArr) {
                spannableStringBuilder.setSpan(new AnonymousClass0KQ(super.A00, this.A00, this.A02, this.A01, uRLSpan.getURL()), spannableStringBuilder.getSpanStart(uRLSpan), spannableStringBuilder.getSpanEnd(uRLSpan), spannableStringBuilder.getSpanFlags(uRLSpan));
            }
            for (URLSpan uRLSpan2 : uRLSpanArr) {
                spannableStringBuilder.removeSpan(uRLSpan2);
            }
        }
        spannableStringBuilder.append((CharSequence) "\n\n");
        if (!TextUtils.isEmpty(string) && abstractCollection != null) {
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(C020709z.A00(super.A00, 2131100602));
            if (string.codePointCount(0, string.length()) > 96) {
                StringBuilder sb = new StringBuilder();
                sb.append(C002701g.A0S(string, 96));
                sb.append("…");
                spannableString = new SpannableString(sb.toString());
            } else {
                spannableString = new SpannableString(string);
            }
            String[] split = Uri.parse(string).getHost().split("\\.");
            int i2 = -1;
            for (String str : split) {
                boolean z = false;
                int i3 = 0;
                int i4 = -1;
                while (true) {
                    length = str.length();
                    if (i3 >= length) {
                        break;
                    }
                    int codePointAt = str.codePointAt(i3);
                    int charCount = Character.charCount(codePointAt);
                    if (abstractCollection.contains(Integer.valueOf(codePointAt))) {
                        i4 = string.indexOf(codePointAt, i4 + 1);
                        spannableString.setSpan(new StyleSpan(1), i4, i4 + charCount, 33);
                        z = true;
                    }
                    i3 += charCount;
                }
                if (z) {
                    i = string.indexOf(str, i2 + 1);
                    spannableString.setSpan(foregroundColorSpan, i, length + i, 33);
                } else {
                    i = i2;
                }
                i2 = i;
            }
            AnonymousClass0D7 A032 = this.A03.A03();
            spannableStringBuilder.append(A032.A03(spannableString, A032.A01));
        }
        AnonymousClass07X r1 = new AnonymousClass07X(A09());
        r1.A03(2131890127);
        AnonymousClass07Y r2 = r1.A01;
        r2.A0E = spannableStringBuilder;
        r2.A0J = true;
        r1.A04(2131890129, new AnonymousClass197(this, string));
        r1.A06(2131890130, new AnonymousClass196(this));
        return r1.A00();
    }
}
