package com.whatsapp;

import X.2Mt;
import X.AbstractC24511Bq;
import X.AnonymousClass00C;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;

public class SquareImageView extends AbstractC24511Bq {
    public int A00 = 0;
    public Drawable A01;

    public SquareImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes;
        if (attributeSet != null && (obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, 2Mt.A1t)) != null) {
            if (obtainStyledAttributes.hasValue(0)) {
                this.A00 = obtainStyledAttributes.getInt(0, 0);
            }
            setSelector(obtainStyledAttributes.getDrawable(1));
            obtainStyledAttributes.recycle();
        }
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.A01;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getHeight());
            drawable.draw(canvas);
        }
    }

    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.A01;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    @Override // X.C02600Cj
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.A01;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.A01;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public void onMeasure(int i, int i2) {
        int defaultSize;
        int i3 = this.A00;
        if (i3 == 0) {
            defaultSize = ImageView.getDefaultSize(getSuggestedMinimumWidth(), i);
        } else if (i3 == 1) {
            defaultSize = ImageView.getDefaultSize(getSuggestedMinimumHeight(), i2);
        } else {
            StringBuilder A0R = AnonymousClass00C.A0R("Illegal value: ");
            A0R.append(i3);
            throw new IllegalArgumentException(A0R.toString());
        }
        setMeasuredDimension(defaultSize, defaultSize);
    }

    public void setSelector(Drawable drawable) {
        Drawable drawable2 = this.A01;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            this.A01 = drawable;
            if (drawable != null) {
                drawable.setCallback(this);
            }
        }
    }

    public boolean verifyDrawable(Drawable drawable) {
        return drawable == this.A01 || super.verifyDrawable(drawable);
    }
}
