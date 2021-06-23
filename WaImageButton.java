package com.whatsapp;

import X.2Mt;
import X.AnonymousClass01G;
import X.AnonymousClass0GT;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;

public class WaImageButton extends AnonymousClass0GT {
    public AnonymousClass01G A00;
    public boolean A01;

    public WaImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, 2Mt.A2L);
            int resourceId = obtainStyledAttributes.getResourceId(0, 0);
            if (resourceId != 0) {
                setContentDescription(this.A00.A08(resourceId));
            }
            this.A01 = obtainStyledAttributes.getBoolean(1, false);
            obtainStyledAttributes.recycle();
        }
    }

    public void onDraw(Canvas canvas) {
        boolean z;
        if (this.A01) {
            z = this.A00.A0P();
            if (z) {
                canvas.save();
                canvas.scale(-1.0f, 1.0f, ((float) super.getWidth()) * 0.5f, ((float) super.getHeight()) * 0.5f);
            }
        } else {
            z = false;
        }
        super.onDraw(canvas);
        if (this.A01 && z) {
            canvas.restore();
        }
    }
}
