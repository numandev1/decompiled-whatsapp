package com.whatsapp;

import X.AbstractC05420Qq;
import X.AnonymousClass020;
import X.AnonymousClass056;
import X.AnonymousClass05S;
import X.AnonymousClass08x;
import X.AnonymousClass0Ue;
import X.AnonymousClass1A2;
import X.AnonymousClass1A3;
import X.AnonymousClass1A4;
import X.AnonymousClass1A6;
import X.AnonymousClass1VF;
import X.AnonymousClass1VT;
import X.C02580Cg;
import X.C231516c;
import X.C28721Ul;
import X.View$OnClickListenerC231316a;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;

public final class CodeInputField extends AbstractC05420Qq {
    public static Typeface A08;
    public static Typeface A09;
    public char A00;
    public char A01;
    public int A02;
    public ValueAnimator A03;
    public Context A04;
    public AnonymousClass1A6 A05;
    public AnonymousClass020 A06;
    public boolean A07;

    public CodeInputField(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A04 = context;
    }

    public void A04() {
        ValueAnimator valueAnimator = this.A03;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        } else {
            float x = getX();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(x, ((float) getResources().getDimensionPixelSize(2131165646)) + x);
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.setRepeatCount(3);
            ofFloat.setRepeatMode(2);
            ofFloat.setDuration(50L);
            ofFloat.addUpdateListener(new C231516c(this));
            ofFloat.addListener(new AnonymousClass1A2(this, x));
            this.A03 = ofFloat;
        }
        this.A03.start();
        AnonymousClass05S.A1b(this.A06);
    }

    public void A05(int i, AnonymousClass0Ue r10, int i2) {
        C28721Ul r6 = new C28721Ul(this, i2);
        setPasswordTransformationEnabled(true);
        setOnClickListener(new View$OnClickListenerC231316a(this));
        setCursorVisible(false);
        A07(r10, i, ')', '(', "pin_font", r6, null);
    }

    public void A06(AnonymousClass0Ue r9, int i) {
        A07(r9, i, 8211, 8226, null, new AnonymousClass1VF(this), null);
    }

    public void A07(AnonymousClass0Ue r3, int i, char c, char c2, String str, AnonymousClass1A3 r8, String str2) {
        this.A02 = i;
        this.A01 = c;
        this.A00 = c2;
        AnonymousClass1A6 r0 = new AnonymousClass1A6(r3, this, r8);
        this.A05 = r0;
        addTextChangedListener(r0);
        setCode("");
        if (TextUtils.equals(str, "pin_font")) {
            Typeface typeface = A08;
            if (typeface == null) {
                typeface = AnonymousClass056.A0H(getContext());
                A08 = typeface;
            }
            setTypeface(typeface);
        } else {
            Typeface typeface2 = A09;
            if (typeface2 == null) {
                typeface2 = Typeface.createFromAsset(getContext().getAssets(), "fonts/RobotoMono-Regular.ttf");
                A09 = typeface2;
            }
            setTypeface(typeface2);
        }
        C02580Cg.A03(this);
        if (str2 != null) {
            AnonymousClass08x.A0c(this, new AnonymousClass1VT(str2));
        }
    }

    public String getCode() {
        return getText().toString().replaceAll("[^0-9]", "");
    }

    public boolean getErrorState() {
        return this.A07;
    }

    public void onSelectionChanged(int i, int i2) {
        int indexOf;
        if (i == i2 && (indexOf = getText().toString().indexOf(this.A01)) > -1 && i > indexOf) {
            setSelection(indexOf);
        }
        super.onSelectionChanged(i, i2);
    }

    public void setCode(String str) {
        StringBuilder sb = new StringBuilder(str);
        int length = str.length();
        int i = length;
        while (true) {
            int i2 = this.A02;
            if (i < i2 + 1) {
                sb.append(this.A01);
                i++;
            } else {
                sb.insert(i2 >> 1, (char) 160);
                this.A05.A01 = true;
                setText(sb);
                setSelection(length + 1);
                this.A05.A01 = false;
                return;
            }
        }
    }

    public void setErrorState(boolean z) {
        if (this.A07 != z) {
            this.A07 = z;
            setCode("");
        }
    }

    public void setPasswordTransformationEnabled(boolean z) {
        setTransformationMethod(z ? new AnonymousClass1A4(this) : null);
    }

    public void setRegistrationVoiceCodeLength(int i) {
        this.A02 = i;
    }
}
