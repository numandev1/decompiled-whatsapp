package com.whatsapp;

import X.2Mt;
import X.AnonymousClass056;
import X.AnonymousClass1WR;
import X.C020709z;
import X.C02580Cg;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

public class WaLinearLayout extends AnonymousClass1WR {
    public int A00 = 0;

    public WaLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, 2Mt.A2N);
            this.A00 = obtainStyledAttributes.getResourceId(1, 0);
            boolean z = obtainStyledAttributes.getBoolean(0, false);
            Drawable background = getBackground();
            if (!(background == null || this.A00 == 0)) {
                setBackground(background);
            }
            obtainStyledAttributes.recycle();
            if (z) {
                setTag(2131362065, C02580Cg.A00);
            }
        }
    }

    public void setBackground(Drawable drawable) {
        if (this.A00 == 0 || drawable == null) {
            super.setBackground(drawable);
            return;
        }
        Drawable A0K = AnonymousClass056.A0K(drawable);
        AnonymousClass056.A0Z(A0K, C020709z.A00(getContext(), this.A00));
        super.setBackground(A0K);
    }
}
