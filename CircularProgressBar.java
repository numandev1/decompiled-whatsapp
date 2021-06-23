package com.whatsapp;

import X.2Mt;
import X.AnonymousClass0SP;
import X.C020709z;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.SystemClock;
import android.util.AttributeSet;

public class CircularProgressBar extends AnonymousClass0SP {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05 = 0.3f;
    public float A06 = 5.0f;
    public float A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public long A0D;
    public Rect A0E = new Rect();
    public String A0F = null;
    public boolean A0G = false;
    public final Paint A0H = new Paint();
    public final RectF A0I = new RectF();

    public CircularProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A08 = C020709z.A00(context, 2131099868);
        this.A0C = C020709z.A00(context, 2131099867);
        this.A0B = C020709z.A00(context, 2131099866);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, 2Mt.A0W);
            this.A0C = obtainStyledAttributes.getInteger(1, this.A0C);
            this.A0B = obtainStyledAttributes.getInteger(0, this.A0B);
            this.A09 = obtainStyledAttributes.getInteger(2, 0);
            this.A06 = obtainStyledAttributes.getFloat(5, 5.0f);
            this.A0A = obtainStyledAttributes.getInteger(3, 0);
            this.A03 = obtainStyledAttributes.getDimension(4, 0.0f);
            this.A08 = obtainStyledAttributes.getInteger(6, this.A08);
            obtainStyledAttributes.recycle();
        }
    }

    public String getCenterText() {
        return this.A0F;
    }

    public boolean getKnobEnabled() {
        return this.A0G;
    }

    public float getPaintStrokeFactor() {
        return this.A06;
    }

    public int getProgressBarBackgroundColor() {
        return this.A0B;
    }

    public int getProgressBarColor() {
        return this.A0C;
    }

    public void onDraw(Canvas canvas) {
        float f;
        Paint paint = this.A0H;
        paint.setAntiAlias(true);
        if (this.A09 != 0) {
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(this.A09);
            canvas.drawArc(this.A0I, 0.0f, 360.0f, true, paint);
        }
        paint.setStrokeCap(Paint.Cap.ROUND);
        if (isIndeterminate()) {
            long uptimeMillis = SystemClock.uptimeMillis();
            long j = this.A0D;
            if (j == 0) {
                this.A0D = uptimeMillis;
                j = uptimeMillis;
            }
            long j2 = uptimeMillis - j;
            float f2 = (((float) (j2 % 1333)) * 1.0f) / 1333.0f;
            if (f2 < 0.5f) {
                float sin = (float) Math.sin(((double) f2) * 3.141592653589793d);
                f = (sin * ((sin * sin) * sin)) / 2.0f;
            } else {
                float sin2 = (float) Math.sin(((double) (f2 - 0.5f)) * 3.141592653589793d);
                f = ((sin2 * ((sin2 * sin2) * sin2)) / 2.0f) + 0.5f;
            }
            if (f < 0.5f) {
                this.A00 = 2.0f * f * 280.0f;
                this.A02 = -1.0f;
            } else {
                float f3 = this.A02;
                if (f3 < 0.0f) {
                    f3 = this.A01;
                    this.A02 = f3;
                }
                this.A00 = (1.0f - f) * 2.0f * 280.0f;
                this.A01 = f3 + ((f - 0.5f) * 2.0f * 280.0f);
            }
            canvas.rotate(((((float) (j2 % 2200)) * 1.0f) / 2200.0f) * 360.0f, (float) (getWidth() >> 1), (float) (getHeight() >> 1));
            paint.setAntiAlias(true);
            int i = this.A0B;
            if (i != 0) {
                paint.setColor(i);
                paint.setStyle(Paint.Style.STROKE);
                canvas.drawArc(this.A0I, 0.0f, 360.0f, false, paint);
            }
            int i2 = this.A0A;
            if (i2 != 0) {
                paint.setColor(i2);
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth((this.A04 / this.A06) + (this.A03 * 2.0f));
                canvas.drawArc(this.A0I, this.A01, this.A00, false, paint);
            }
            paint.setColor(this.A0C);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(this.A04 / this.A06);
            canvas.drawArc(this.A0I, this.A01, this.A00, false, paint);
            invalidate();
            return;
        }
        paint.setStyle(Paint.Style.STROKE);
        if (this.A0B != 0) {
            paint.setStrokeWidth(this.A04 / this.A06);
            paint.setColor(this.A0B);
            canvas.drawArc(this.A0I, 270.0f + ((((float) getProgress()) * 360.0f) / ((float) getMax())), 360.0f - ((((float) getProgress()) * 360.0f) / ((float) getMax())), false, paint);
        }
        int i3 = this.A0A;
        if (i3 != 0) {
            paint.setColor(i3);
            paint.setStrokeWidth((this.A04 / this.A06) + (this.A03 * 2.0f));
            canvas.drawArc(this.A0I, -90.0f, (((float) getProgress()) * 360.0f) / ((float) getMax()), false, paint);
        }
        paint.setStrokeWidth(this.A04 / this.A06);
        paint.setColor(this.A0C);
        RectF rectF = this.A0I;
        canvas.drawArc(rectF, -90.0f, (((float) getProgress()) * 360.0f) / ((float) getMax()), false, paint);
        if (this.A0G) {
            paint.setColor(this.A0B);
            paint.setStyle(Paint.Style.FILL);
            double progress = (double) (((float) getProgress()) * ((float) (6.283185307179586d / ((double) getMax()))));
            canvas.drawCircle((float) (((double) rectF.centerX()) + (((double) this.A04) * Math.sin(progress))), (float) (((double) rectF.centerY()) - (Math.cos(progress) * ((double) this.A04))), 10.0f, paint);
        }
        if (this.A0F != null) {
            paint.setColor(this.A08);
            paint.setTextSize(this.A07);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create("sans-serif-light", 0));
            String str = this.A0F;
            paint.getTextBounds(str, 0, str.length(), this.A0E);
            paint.setStyle(Paint.Style.FILL);
            String str2 = this.A0F;
            canvas.drawText(str2, 0, str2.length(), rectF.centerX(), (((float) this.A0E.height()) * 0.5f) + rectF.centerY(), paint);
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float min = ((float) Math.min((i - getPaddingLeft()) - getPaddingRight(), (i2 - getPaddingTop()) - getPaddingBottom())) / 2.0f;
        this.A04 = min;
        float f = min - (this.A05 * min);
        this.A04 = f;
        float f2 = (float) (i >> 1);
        float f3 = (float) (i2 >> 1);
        this.A0I.set(f2 - f, f3 - f, f2 + f, f + f3);
    }

    public void setCenterText(String str) {
        this.A0F = str;
        this.A07 = (float) getResources().getDimensionPixelSize(2131166055);
    }

    public void setKnobEnabled(boolean z) {
        this.A0G = z;
    }

    public void setPaintStrokeFactor(float f) {
        this.A06 = f;
    }

    public void setProgressBarBackgroundColor(int i) {
        this.A0B = i;
    }

    public void setProgressBarColor(int i) {
        this.A0C = i;
    }

    public void setRadiusFactor(float f) {
        this.A05 = f;
    }
}
