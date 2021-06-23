package com.whatsapp;

import X.2Mt;
import X.AbstractC02660Cv;
import X.AnonymousClass01G;
import X.C002701g;
import X.C04920Ob;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.TextView;

public class WaTextView extends AbstractC02660Cv {
    public AnonymousClass01G A00;

    public WaTextView(Context context) {
        super(context);
    }

    public WaTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01(context, attributeSet);
    }

    public WaTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A01(context, attributeSet);
    }

    public final void A01(Context context, AttributeSet attributeSet) {
        if (attributeSet != null && !isInEditMode()) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, 2Mt.A2Q);
            int resourceId = obtainStyledAttributes.getResourceId(3, 0);
            if (resourceId != 0) {
                setContentDescription(this.A00.A08(resourceId));
            }
            int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
            if (resourceId2 != 0) {
                setHint(this.A00.A08(resourceId2));
            }
            int resourceId3 = obtainStyledAttributes.getResourceId(2, 0);
            if (resourceId3 != 0) {
                setImeActionLabel(this.A00.A08(resourceId3), getImeActionId());
            }
            int resourceId4 = obtainStyledAttributes.getResourceId(0, 0);
            if (resourceId4 != 0) {
                setText(this.A00.A08(resourceId4));
            }
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(C002701g.A0D(charSequence), bufferType);
    }

    @Override // X.C02670Cw
    public void setTypeface(Typeface typeface, int i) {
        if (!Build.MANUFACTURER.equalsIgnoreCase("lenovo") || Build.VERSION.SDK_INT != 17) {
            super.setTypeface(typeface, i);
            return;
        }
        if (typeface != null && i > 0) {
            typeface = C04920Ob.A00(getContext(), typeface, i);
            i = 0;
        }
        super.setTypeface(typeface, i);
    }
}
