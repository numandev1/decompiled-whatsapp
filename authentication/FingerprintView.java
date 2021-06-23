package com.whatsapp.authentication;

import X.AbstractC24791Cx;
import X.AnonymousClass0RB;
import X.AnonymousClass1Cj;
import X.AnonymousClass1XH;
import X.AnonymousClass1XI;
import X.C020709z;
import X.C05210Pi;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class FingerprintView extends AnonymousClass0RB {
    public AbstractC24791Cx A00;
    public final ImageView A01;
    public final TextView A02;
    public final C05210Pi A03;
    public final C05210Pi A04;
    public final C05210Pi A05;
    public final C05210Pi A06;
    public final Runnable A07;

    public FingerprintView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 2131951920);
    }

    public FingerprintView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i2);
        setOrientation(1);
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(2131558814, (ViewGroup) this, true);
        this.A02 = (TextView) findViewById(2131363034);
        this.A01 = (ImageView) findViewById(2131363033);
        C05210Pi A002 = C05210Pi.A00(contextThemeWrapper, 2131231269);
        if (A002 != null) {
            this.A04 = A002;
            this.A01.setImageDrawable(A002);
            this.A04.start();
            C05210Pi A003 = C05210Pi.A00(contextThemeWrapper, 2131231271);
            if (A003 != null) {
                this.A06 = A003;
                C05210Pi A004 = C05210Pi.A00(contextThemeWrapper, 2131231270);
                if (A004 != null) {
                    this.A05 = A004;
                    C05210Pi A005 = C05210Pi.A00(contextThemeWrapper, 2131231217);
                    if (A005 != null) {
                        this.A03 = A005;
                        this.A07 = new AnonymousClass1Cj(this);
                        return;
                    }
                    throw null;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    private void setError(String str) {
        if (getContext() != null) {
            TextView textView = this.A02;
            textView.setText(str);
            textView.setTextColor(C020709z.A00(getContext(), 2131100451));
            textView.announceForAccessibility(str);
        }
    }

    public void A00() {
        A05(getContext().getString(2131887509));
    }

    public void A01() {
        this.A02.setText("");
        ImageView imageView = this.A01;
        imageView.removeCallbacks(this.A07);
        C05210Pi r1 = this.A06;
        imageView.setImageDrawable(r1);
        r1.start();
        r1.A02(new AnonymousClass1XH(this));
    }

    public /* synthetic */ void A02() {
        A03(this.A03);
    }

    public final void A03(C05210Pi r5) {
        String string = getContext().getString(2131887507);
        if (getContext() != null) {
            TextView textView = this.A02;
            textView.setText(string);
            textView.setTextColor(C020709z.A00(getContext(), 2131100542));
            textView.announceForAccessibility(string);
        }
        this.A01.setImageDrawable(r5);
        r5.start();
    }

    public void A04(CharSequence charSequence) {
        setError(charSequence.toString());
        ImageView imageView = this.A01;
        imageView.removeCallbacks(this.A07);
        Drawable drawable = imageView.getDrawable();
        C05210Pi r2 = this.A05;
        if (!drawable.equals(r2)) {
            imageView.setImageDrawable(r2);
            r2.start();
            r2.A02(new AnonymousClass1XI(this));
        }
    }

    public void A05(String str) {
        setError(str);
        ImageView imageView = this.A01;
        Drawable drawable = imageView.getDrawable();
        C05210Pi r2 = this.A05;
        if (!drawable.equals(r2)) {
            imageView.setImageDrawable(r2);
            r2.start();
        }
        Runnable runnable = this.A07;
        imageView.removeCallbacks(runnable);
        imageView.postDelayed(runnable, 1000);
    }

    public void setListener(AbstractC24791Cx r1) {
        this.A00 = r1;
    }
}
