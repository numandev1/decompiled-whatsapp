package com.whatsapp;

import X.1la;
import X.2O5;
import X.AbstractC03830Is;
import X.AnonymousClass0R2;
import X.AnonymousClass0R3;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

public class KeyboardPopupLayout extends AnonymousClass0R2 implements AnonymousClass0R3 {
    public int A00;
    public int A01 = -1;
    public int A02 = -1;
    public Paint A03;
    public AbstractC03830Is A04;
    public 2O5 A05;
    public boolean A06 = false;
    public boolean A07;
    public final Rect A08 = new Rect();
    public final int[] A09 = new int[2];

    public KeyboardPopupLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private int getSizeWithKeyboard() {
        int i = getResources().getConfiguration().orientation;
        if (i == 1) {
            return this.A02;
        }
        if (i != 2) {
            return -1;
        }
        return this.A01;
    }

    @Override // X.AnonymousClass0R3
    public void A6M() {
        if (this.A04 != null) {
            this.A04 = null;
            requestLayout();
        }
    }

    @Override // X.AnonymousClass0R3
    public boolean AFp() {
        return this.A06;
    }

    public void invalidate() {
        if (!this.A06) {
            super.invalidate();
        }
    }

    public void invalidate(int i, int i2, int i3, int i4) {
        if (!this.A06) {
            super.invalidate(i, i2, i3, i4);
        }
    }

    public void invalidate(Rect rect) {
        if (!this.A06) {
            super.invalidate(rect);
        }
    }

    @Override // X.AnonymousClass0R3
    public void lock() {
        this.A06 = true;
    }

    public void onDraw(Canvas canvas) {
        if (this.A03 != null && this.A00 != getHeight()) {
            Rect rect = this.A08;
            rect.set(0, this.A00, getWidth(), getHeight());
            canvas.drawRect(rect, this.A03);
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (!this.A06) {
            if (this.A04 != null) {
                super.onLayout(z, i, i2, i3, i2 + this.A00);
                int[] iArr = this.A09;
                getLocationInWindow(iArr);
                boolean z2 = this.A07;
                AbstractC03830Is r2 = this.A04;
                int paddingLeft = iArr[0] + getPaddingLeft();
                if (z2) {
                    r2.update(paddingLeft, 1000000, (i3 - i) - getPaddingRight(), r2.A01);
                } else {
                    r2.update(paddingLeft, iArr[1] + this.A00, (i3 - i) - getPaddingRight(), r2.A01);
                }
            } else {
                super.onLayout(z, i, i2, i3, i4);
            }
        }
    }

    public void onMeasure(int i, int i2) {
        AbstractC03830Is r3;
        boolean z = true;
        int i3 = 0;
        int i4 = -1;
        if (isInEditMode()) {
            super.onMeasure(i, i2);
        } else if (!this.A07) {
            int size = View.MeasureSpec.getSize(i2);
            Activity A052 = 1la.A05(getContext());
            if (A052 == null || Build.VERSION.SDK_INT < 24 || !A052.isInMultiWindowMode()) {
                if (this.A05 != null && 2O5.A00(this) && ((r3 = this.A04) == null || !r3.isShowing())) {
                    int i5 = getResources().getConfiguration().orientation;
                    if (i5 == 1) {
                        this.A02 = size;
                    } else if (i5 == 2) {
                        this.A01 = size;
                    }
                }
                int sizeWithKeyboard = getSizeWithKeyboard();
                if (sizeWithKeyboard != -1) {
                    i4 = size - sizeWithKeyboard;
                }
            }
            this.A00 = size;
            AbstractC03830Is r1 = this.A04;
            if (r1 != null) {
                r1.A01 = r1.A01(i4);
                int mode = View.MeasureSpec.getMode(i2);
                if (!(mode == 0 || this.A05 == null || 2O5.A00(this))) {
                    this.A00 -= this.A04.A01;
                }
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(this.A00, mode));
                setMeasuredDimension(getMeasuredWidth(), size);
                return;
            }
            super.onMeasure(i, i2);
        } else if (this.A04 != null) {
            if (this.A05 == null || 2O5.A00(this)) {
                z = false;
            }
            int size2 = View.MeasureSpec.getSize(i2);
            int mode2 = View.MeasureSpec.getMode(i2);
            AbstractC03830Is r4 = this.A04;
            r4.A01 = r4.A01(-1);
            int i6 = this.A04.A01;
            if (mode2 == 1073741824) {
                int i7 = z ? size2 - i6 : size2;
                this.A00 = i7;
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i7, mode2));
                setMeasuredDimension(getMeasuredWidth(), this.A00);
            } else if (mode2 == Integer.MIN_VALUE) {
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(z ? size2 - i6 : size2, mode2));
                this.A00 = getMeasuredHeight();
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                if (z) {
                    measuredHeight += i6;
                }
                setMeasuredDimension(measuredWidth, Math.min(measuredHeight, size2));
            } else {
                if (z) {
                    size2 -= i6;
                }
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(size2, mode2));
                int measuredHeight2 = getMeasuredHeight();
                if (z) {
                    i3 = i6;
                }
                this.A00 = measuredHeight2 + i3;
                setMeasuredDimension(getMeasuredWidth(), this.A00);
            }
        } else {
            super.onMeasure(i, i2);
        }
    }

    public void requestLayout() {
        if (!this.A06) {
            super.requestLayout();
        }
    }

    public void setHeightShouldWrap(boolean z) {
        this.A07 = z;
    }

    @Override // X.AnonymousClass0R3
    public void setKeyboardPopup(AbstractC03830Is r2) {
        if (this.A04 != r2) {
            this.A04 = r2;
            requestLayout();
        }
    }

    public void setKeyboardPopupBackgroundColor(int i) {
        if (this.A03 == null) {
            this.A03 = new Paint(1);
        }
        setWillNotDraw(false);
        this.A03.setColor(i);
    }

    @Override // X.AnonymousClass0R3
    public void unlock() {
        this.A06 = false;
    }
}
