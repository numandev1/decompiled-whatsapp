package com.whatsapp;

import X.2Mt;
import X.AnonymousClass0RO;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

public class InfoCard extends AnonymousClass0RO {
    public int A00;
    public Drawable A01;
    public Drawable A02;
    public final Paint A03 = new Paint();

    public InfoCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01(context, attributeSet);
    }

    public InfoCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A01(context, attributeSet);
    }

    public final void A01(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, 2Mt.A10);
            this.A02 = obtainStyledAttributes.getDrawable(2);
            this.A01 = obtainStyledAttributes.getDrawable(0);
            this.A00 = obtainStyledAttributes.getInteger(1, 0);
            obtainStyledAttributes.recycle();
        }
        setWillNotDraw(false);
    }

    public void onDraw(Canvas canvas) {
        if (!(this.A02 == null || getPaddingTop() == 0)) {
            this.A02.setBounds(0, 0, getWidth(), getPaddingTop());
            this.A02.draw(canvas);
        }
        if (!(this.A01 == null || getPaddingBottom() == 0)) {
            this.A01.setBounds(0, getHeight() - getPaddingBottom(), getWidth(), getHeight());
            this.A01.draw(canvas);
        }
        Paint paint = this.A03;
        paint.setColor(this.A00);
        canvas.drawRect(0.0f, (float) getPaddingTop(), (float) getWidth(), (float) (getHeight() - getPaddingBottom()), paint);
    }
}
