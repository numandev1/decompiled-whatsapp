package com.whatsapp;

import X.2Mt;
import X.AbstractC02590Ci;
import X.AnonymousClass01G;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;

public class WaImageView extends AbstractC02590Ci {
    public AnonymousClass01G A00;
    public boolean A01;

    public WaImageView(Context context) {
        super(context);
    }

    public WaImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01(context, attributeSet);
    }

    public WaImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A01(context, attributeSet);
    }

    public final void A01(Context context, AttributeSet attributeSet) {
        if (attributeSet != null && this.A00 != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, 2Mt.A2M);
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
        AnonymousClass01G r0;
        if (!this.A01 || (r0 = this.A00) == null) {
            z = false;
        } else {
            z = r0.A0P();
            if (z) {
                canvas.save();
                canvas.scale(-1.0f, 1.0f, ((float) super.getWidth()) * 0.5f, ((float) super.getHeight()) * 0.5f);
            }
        }
        super.onDraw(canvas);
        if (this.A01 && z) {
            canvas.restore();
        }
    }
}
