package com.whatsapp;

import X.AbstractC05170Pe;
import X.AbstractC05180Pf;
import X.AnonymousClass08x;
import X.AnonymousClass0PT;
import X.AnonymousClass0Q0;
import X.C05540Rj;
import X.C05570Rm;
import X.C05680Sa;
import X.C24371Az;
import X.View$OnClickListenerC237018h;
import X.ViewTreeObserver$OnGlobalLayoutListenerC05690Sc;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import java.util.Locale;

public class PagerSlidingTabStrip extends AnonymousClass0Q0 {
    public static final int[] A0R = {16842901, 16842904};
    public float A00 = 0.0f;
    public int A01 = 0;
    public int A02 = 436207616;
    public int A03 = 12;
    public int A04 = 1;
    public int A05 = -10066330;
    public int A06 = 3;
    public int A07 = 0;
    public int A08 = 52;
    public int A09 = 2131230993;
    public int A0A;
    public int A0B = 8;
    public int A0C = -10066330;
    public int A0D = 12;
    public int A0E = 1;
    public int A0F = 436207616;
    public int A0G = 1;
    public Paint A0H;
    public Paint A0I;
    public LinearLayout.LayoutParams A0J;
    public LinearLayout.LayoutParams A0K;
    public LinearLayout A0L;
    public AnonymousClass0PT A0M;
    public ViewPager A0N;
    public Locale A0O;
    public boolean A0P = true;
    public final C05540Rj A0Q = new C05540Rj(this);

    public PagerSlidingTabStrip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setFillViewport(true);
        setWillNotDraw(false);
        LinearLayout A012 = A01(context);
        this.A0L = A012;
        A012.setOrientation(0);
        this.A0L.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(this.A0L);
        AnonymousClass08x.A0U(this.A0L, 2);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.A08 = (int) TypedValue.applyDimension(1, (float) this.A08, displayMetrics);
        this.A06 = (int) TypedValue.applyDimension(1, (float) this.A06, displayMetrics);
        this.A0G = (int) TypedValue.applyDimension(1, (float) this.A0G, displayMetrics);
        this.A03 = (int) TypedValue.applyDimension(1, (float) this.A03, displayMetrics);
        this.A0B = (int) TypedValue.applyDimension(1, (float) this.A0B, displayMetrics);
        this.A04 = (int) TypedValue.applyDimension(1, (float) this.A04, displayMetrics);
        this.A0D = (int) TypedValue.applyDimension(2, (float) this.A0D, displayMetrics);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, A0R);
        this.A0D = obtainStyledAttributes.getDimensionPixelSize(0, this.A0D);
        this.A0C = obtainStyledAttributes.getColor(1, this.A0C);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, C05570Rm.A1n);
        this.A05 = obtainStyledAttributes2.getColor(1, this.A05);
        this.A02 = obtainStyledAttributes2.getColor(0, this.A02);
        obtainStyledAttributes2.recycle();
        Paint paint = new Paint();
        this.A0I = paint;
        paint.setAntiAlias(true);
        this.A0I.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.A0H = paint2;
        paint2.setAntiAlias(true);
        this.A0H.setStrokeWidth((float) this.A04);
        this.A0J = new LinearLayout.LayoutParams(-2, -1);
        this.A0K = new LinearLayout.LayoutParams(0, -1, 1.0f);
        if (this.A0O == null) {
            this.A0O = getResources().getConfiguration().locale;
        }
    }

    public static void A00(PagerSlidingTabStrip pagerSlidingTabStrip, int i, int i2) {
        if (pagerSlidingTabStrip.A0A != 0) {
            int left = pagerSlidingTabStrip.A0L.getChildAt(i).getLeft() + i2;
            if (i > 0 || i2 > 0) {
                left -= pagerSlidingTabStrip.A08;
            }
            if (left != pagerSlidingTabStrip.A07) {
                pagerSlidingTabStrip.A07 = left;
                pagerSlidingTabStrip.scrollTo(left, 0);
            }
        }
    }

    public LinearLayout A01(Context context) {
        return new LinearLayout(context);
    }

    public final void A02() {
        for (int i = 0; i < this.A0A; i++) {
            View childAt = this.A0L.getChildAt(i);
            childAt.setBackgroundResource(this.A09);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                textView.setTextSize(0, (float) this.A0D);
                textView.setTypeface(null, this.A0E);
                textView.setTextColor(this.A0C);
                textView.setAllCaps(true);
            }
        }
    }

    public void A03(int i, View view) {
        view.setFocusable(true);
        view.setOnClickListener(new View$OnClickListenerC237018h(this, i));
        int i2 = this.A0B;
        view.setPadding(i2, 0, i2, 0);
        AnonymousClass08x.A0c(view, new C05680Sa(this));
        this.A0L.addView(view, i, this.A0P ? this.A0K : this.A0J);
    }

    public int getTextColor() {
        return this.A0C;
    }

    public int getTextSize() {
        return this.A0D;
    }

    public void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        if (!(isInEditMode() || this.A0A == 0)) {
            int height = getHeight();
            this.A0I.setColor(this.A05);
            View childAt = this.A0L.getChildAt(this.A01);
            float left = (float) childAt.getLeft();
            float right = (float) childAt.getRight();
            if (this.A00 > 0.0f && (i = this.A01) < this.A0A - 1) {
                View childAt2 = this.A0L.getChildAt(i + 1);
                float f = this.A00;
                float f2 = 1.0f - f;
                left = (left * f2) + (((float) childAt2.getLeft()) * f);
                right = (f2 * right) + (((float) childAt2.getRight()) * f);
            }
            float f3 = (float) height;
            canvas.drawRect(left, (float) (height - this.A06), right, f3, this.A0I);
            this.A0I.setColor(this.A0F);
            canvas.drawRect(0.0f, (float) (height - this.A0G), (float) this.A0L.getWidth(), f3, this.A0I);
            this.A0H.setColor(this.A02);
            for (int i2 = 0; i2 < this.A0A - 1; i2++) {
                View childAt3 = this.A0L.getChildAt(i2);
                canvas.drawLine((float) childAt3.getRight(), (float) this.A03, (float) childAt3.getRight(), (float) (height - this.A03), this.A0H);
            }
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        C24371Az r2 = (C24371Az) parcelable;
        super.onRestoreInstanceState(r2.getSuperState());
        this.A01 = r2.A00;
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        C24371Az r0 = new C24371Az(super.onSaveInstanceState());
        r0.A00 = this.A01;
        return r0;
    }

    public void setOnPageChangeListener(AnonymousClass0PT r1) {
        this.A0M = r1;
    }

    public void setShouldExpand(boolean z) {
        this.A0P = z;
        requestLayout();
    }

    public void setTextColor(int i) {
        this.A0C = i;
        A02();
    }

    public void setTextSize(int i) {
        this.A0D = i;
        A02();
    }

    public void setViewPager(ViewPager viewPager) {
        this.A0N = viewPager;
        if (viewPager.A0V != null) {
            viewPager.A0W = this.A0Q;
            this.A0L.removeAllViews();
            this.A0A = this.A0N.A0V.A0B();
            for (int i = 0; i < this.A0A; i++) {
                AbstractC05170Pe r0 = this.A0N.A0V;
                if (r0 instanceof AbstractC05180Pf) {
                    A03(i, ((AbstractC05180Pf) r0).AC8(i));
                } else {
                    String charSequence = r0.A03(i).toString();
                    TextView textView = new TextView(getContext());
                    textView.setText(charSequence);
                    textView.setGravity(17);
                    textView.setSingleLine();
                    A03(i, textView);
                }
            }
            A02();
            getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC05690Sc(this));
            return;
        }
        throw new IllegalStateException("ViewPager does not have adapter instance.");
    }
}
