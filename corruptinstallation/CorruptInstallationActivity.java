package com.whatsapp.corruptinstallation;

import X.3a5;
import X.AnonymousClass01M;
import X.AnonymousClass0L7;
import X.C015307e;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.widget.TextView;
import com.whatsapp.util.Log;

public class CorruptInstallationActivity extends AnonymousClass0L7 {
    public C015307e A00;

    @Override // X.AnonymousClass09L, X.AnonymousClass09K, X.AnonymousClass09N, X.AnonymousClass09M, X.AnonymousClass09H, X.AnonymousClass09G, X.AnonymousClass09J, X.AnonymousClass09I, X.AnonymousClass0L7, X.AnonymousClass09O
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131558445);
        TextView textView = (TextView) findViewById(2131362601);
        Spanned fromHtml = Html.fromHtml(getString(2131886982));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(fromHtml);
        URLSpan[] uRLSpanArr = (URLSpan[]) fromHtml.getSpans(0, fromHtml.length(), URLSpan.class);
        if (uRLSpanArr != null) {
            for (URLSpan uRLSpan : uRLSpanArr) {
                if ("contact-support".equals(uRLSpan.getURL())) {
                    Log.i("contact-support link found");
                    int spanStart = spannableStringBuilder.getSpanStart(uRLSpan);
                    int spanEnd = spannableStringBuilder.getSpanEnd(uRLSpan);
                    int spanFlags = spannableStringBuilder.getSpanFlags(uRLSpan);
                    spannableStringBuilder.removeSpan(uRLSpan);
                    spannableStringBuilder.setSpan(new 3a5(AnonymousClass01M.A09(this, false, "corrupt-install", null, null, null, null, null)), spanStart, spanEnd, spanFlags);
                }
            }
        }
        textView.setText(spannableStringBuilder);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        if (this.A00 != null) {
            TextView textView2 = (TextView) findViewById(2131362602);
            textView2.setMovementMethod(LinkMovementMethod.getInstance());
            textView2.setText(Html.fromHtml(getString(2131886984, "https://www.whatsapp.com/android/")));
            findViewById(2131364117).setVisibility(8);
            return;
        }
        throw null;
    }
}
