package com.whatsapp;

import X.2Mt;
import X.AnonymousClass056;
import X.AnonymousClass0RG;
import X.C020709z;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

public class WaFrameLayout extends AnonymousClass0RG {
    public int A00 = 0;
    public int A01 = 0;
    public int A02 = 0;
    public int A03 = 0;
    public boolean A04 = false;

    public WaFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (attributeSet != null) {
            this.A04 = isPressed();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, 2Mt.A2K);
            this.A01 = obtainStyledAttributes.getResourceId(1, 0);
            this.A00 = obtainStyledAttributes.getResourceId(0, 0);
            if (!(getBackground() == null || this.A01 == 0)) {
                setBackgroundDrawable(getBackground());
            }
            this.A03 = obtainStyledAttributes.getResourceId(3, 0);
            this.A02 = obtainStyledAttributes.getResourceId(2, 0);
            if (!(getForeground() == null || this.A03 == 0)) {
                setForeground(getForeground());
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (isPressed() != this.A04) {
            this.A04 = isPressed();
            setBackgroundDrawable(getBackground());
            setForeground(getForeground());
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        int i;
        if (this.A01 == 0 || drawable == null) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        Drawable A0K = AnonymousClass056.A0K(drawable);
        if (!isPressed() || (i = this.A00) == 0) {
            i = this.A01;
        }
        AnonymousClass056.A0Z(A0K, C020709z.A00(getContext(), i));
        super.setBackgroundDrawable(A0K);
    }

    public void setForeground(Drawable drawable) {
        int i;
        if (this.A03 == 0 || drawable == null) {
            super.setForeground(drawable);
            return;
        }
        Drawable A0K = AnonymousClass056.A0K(drawable);
        if (!isPressed() || (i = this.A02) == 0) {
            i = this.A03;
        }
        AnonymousClass056.A0Z(A0K, C020709z.A00(getContext(), i));
        super.setForeground(A0K);
    }
}
