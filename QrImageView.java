package com.whatsapp;

import X.2Mt;
import X.AnonymousClass07O;
import X.AnonymousClass08x;
import X.AnonymousClass0KN;
import X.AnonymousClass14l;
import X.AnonymousClass153;
import X.AnonymousClass15H;
import X.AnonymousClass1B2;
import X.AnonymousClass1B3;
import X.AnonymousClass1B4;
import X.AnonymousClass1WQ;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class QrImageView extends AnonymousClass1WQ {
    public static final Random A07 = new Random();
    public int A00;
    public Paint A01 = new Paint();
    public RectF A02 = new RectF();
    public Drawable A03;
    public AnonymousClass0KN A04;
    public ArrayList A05;
    public boolean A06;

    public QrImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, 2Mt.A1d);
            this.A06 = obtainStyledAttributes.getBoolean(1, true);
            this.A00 = obtainStyledAttributes.getInt(0, -16777216);
            this.A03 = obtainStyledAttributes.getDrawable(2);
            obtainStyledAttributes.recycle();
        }
        if (isInEditMode()) {
            try {
                this.A04 = AnonymousClass15H.A01("This is a sample QR Code", AnonymousClass153.M, null);
            } catch (AnonymousClass14l e) {
                throw new RuntimeException(e);
            }
        }
    }

    public final void A00(AnonymousClass1B3 r5) {
        ArrayList arrayList = this.A05;
        if (arrayList == null || arrayList.isEmpty()) {
            AnonymousClass07O r0 = this.A04.A04;
            int i = r0.A01 * r0.A00;
            ArrayList arrayList2 = new ArrayList(i);
            this.A05 = arrayList2;
            for (int i2 = 0; i2 < i; i2++) {
                arrayList2.add(Integer.valueOf(i2));
            }
        }
        AnonymousClass1B4 r02 = new AnonymousClass1B4(this);
        r02.setDuration(1200);
        r02.setInterpolator(new LinearInterpolator());
        if (r5 != null) {
            r02.setAnimationListener(new AnonymousClass1B2(this, r5));
        }
        startAnimation(r02);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.A06 && this.A04 != null) {
            A00(null);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A05 = null;
        clearAnimation();
    }

    public void onDraw(Canvas canvas) {
        AnonymousClass0KN r0 = this.A04;
        if (r0 != null) {
            AnonymousClass07O r8 = r0.A04;
            int i = r8.A01;
            int i2 = r8.A00;
            float width = this.A02.width() / ((float) i);
            float height = this.A02.height() / ((float) i2);
            this.A01.setColor(-1);
            canvas.drawRect((float) getPaddingLeft(), (float) getPaddingTop(), (float) (getWidth() - getPaddingRight()), (float) (getHeight() - getPaddingBottom()), this.A01);
            this.A01.setColor(this.A00);
            for (int i3 = 0; i3 < i; i3++) {
                for (int i4 = 0; i4 < i2; i4++) {
                    if (r8.A02[i4][i3] == 1) {
                        RectF rectF = this.A02;
                        float f = rectF.left;
                        float f2 = rectF.top;
                        canvas.drawRect((float) ((int) ((((float) i3) * width) + f)), (float) ((int) ((((float) i4) * height) + f2)), f + (((float) (i3 + 1)) * width), (((float) (i4 + 1)) * height) + f2, this.A01);
                    }
                }
            }
            this.A01.setColor(-1);
            if (this.A05 != null && !isInEditMode()) {
                Iterator it = this.A05.iterator();
                while (it.hasNext()) {
                    int intValue = ((Number) it.next()).intValue();
                    int i5 = intValue % i;
                    int i6 = intValue / i;
                    RectF rectF2 = this.A02;
                    float f3 = rectF2.left;
                    float f4 = rectF2.top;
                    canvas.drawRect((float) ((int) ((((float) i5) * width) + f3)), (float) ((int) ((((float) i6) * height) + f4)), (((float) (i5 + 1)) * width) + f3, (((float) (i6 + 1)) * height) + f4, this.A01);
                }
            }
            if (this.A03 != null) {
                ArrayList arrayList = this.A05;
                if (arrayList == null || arrayList.isEmpty() || isInEditMode()) {
                    this.A03.draw(canvas);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x004d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r10, int r11) {
        /*
        // Method dump skipped, instructions count: 128
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.QrImageView.onMeasure(int, int):void");
    }

    public void setQrCode(AnonymousClass0KN r2) {
        setQrCode(r2, null);
    }

    public void setQrCode(AnonymousClass0KN r2, AnonymousClass1B3 r3) {
        this.A04 = r2;
        if (this.A06 && AnonymousClass08x.A0h(this) && r2 != null) {
            A00(r3);
        } else if (r3 != null) {
            r3.AJO(this);
        }
    }
}
