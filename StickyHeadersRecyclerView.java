package com.whatsapp;

import X.2Mt;
import X.AbstractC03160Fi;
import X.AnonymousClass01G;
import X.AnonymousClass06X;
import X.AnonymousClass0R7;
import X.AnonymousClass1BB;
import X.AnonymousClass1BC;
import X.AnonymousClass1WN;
import X.C07200a8;
import X.C29231Wl;
import X.C29241Wm;
import X.C29251Wn;
import X.C29271Wp;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;

public class StickyHeadersRecyclerView extends AnonymousClass0R7 {
    public int A00 = -1;
    public int A01;
    public int A02 = -1;
    public int A03;
    public int A04;
    public long A05;
    public long A06;
    public C07200a8 A07;
    public AbstractC03160Fi A08;
    public AnonymousClass01G A09;
    public final Rect A0A = new Rect();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickyHeadersRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i = 0;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, 2Mt.A1y);
            this.A03 = obtainStyledAttributes.getDimensionPixelSize(0, this.A03);
            i = obtainStyledAttributes.getDimensionPixelSize(1, 0);
            obtainStyledAttributes.recycle();
        }
        if (this.A03 > 0) {
            A0k(new AnonymousClass1WN(this.A09, i));
        }
        this.A0i = true;
        this.A07 = new C07200a8(context, new AnonymousClass1BB(this));
        this.A15.add(new C29231Wl(this));
    }

    public static boolean A09(long j) {
        return (j & 4294967295L) == 4294967295L;
    }

    private C29271Wp getStickyHeadersAdapter() {
        return (C29271Wp) this.A0N;
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x003a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A11(int r5) {
        /*
            r4 = this;
            X.06X r0 = r4.A0N
            X.1Wp r0 = (X.C29271Wp) r0
            long r0 = r0.A0G(r5)
        L_0x0008:
            boolean r2 = A09(r0)
            if (r2 == 0) goto L_0x0023
            X.06X r3 = r4.A0N
            int r3 = r3.A0C()
            int r3 = r3 + -1
            if (r5 >= r3) goto L_0x0023
            int r5 = r5 + 1
            X.06X r0 = r4.A0N
            X.1Wp r0 = (X.C29271Wp) r0
            long r0 = r0.A0G(r5)
            goto L_0x0008
        L_0x0023:
            if (r2 == 0) goto L_0x003a
            X.06X r0 = r4.A0N
            int r1 = r0.A0C()
            X.06X r0 = r4.A0N
            X.1Wp r0 = (X.C29271Wp) r0
            X.06X r0 = r0.A00
            X.1BC r0 = (X.AnonymousClass1BC) r0
            int r0 = r0.AAi()
            int r0 = r1 - r0
        L_0x0039:
            return r0
        L_0x003a:
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            int r0 = (int) r0
            goto L_0x0039
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.StickyHeadersRecyclerView.A11(int):int");
    }

    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.A0S;
        C29271Wp r1 = (C29271Wp) this.A0N;
        int A1G = linearLayoutManager.A1G();
        if (A1G != -1) {
            if (A1G != this.A00) {
                this.A00 = A1G;
                long A0G = r1.A0G(A1G);
                this.A05 = A0G;
                int i = (int) (A0G >> 32);
                if (this.A02 != i) {
                    this.A02 = i;
                    ((AnonymousClass1BC) r1.A00).AIV(this.A08, i);
                    View view = this.A08.A0H;
                    view.measure(View.MeasureSpec.makeMeasureSpec(getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                    view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                }
            }
            this.A04 = 0;
            if (!A09(this.A05)) {
                int A1F = linearLayoutManager.A1F();
                if (this.A01 != A1F) {
                    this.A01 = A1F;
                    this.A06 = r1.A0G(A1F);
                }
                if (A09(this.A06)) {
                    View A0G2 = linearLayoutManager.A0G(A1F);
                    this.A04 = A0G2.getTop() - this.A08.A0H.getMeasuredHeight();
                    Rect rect = this.A0A;
                    linearLayoutManager.A0O(A0G2, rect);
                    int i2 = this.A04 - rect.top;
                    this.A04 = i2;
                    if (i2 > 0) {
                        this.A04 = 0;
                    }
                }
            }
            canvas.save();
            canvas.clipRect(0, this.A04, this.A08.A0H.getMeasuredWidth(), this.A04 + this.A08.A0H.getMeasuredHeight());
            canvas.translate(0.0f, (float) this.A04);
            this.A08.A0H.draw(canvas);
            canvas.restore();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void onMeasure(int i, int i2) {
        View view;
        super.onMeasure(i, i2);
        if (this.A03 > 0) {
            int measuredWidth = getMeasuredWidth();
            int i3 = this.A03;
            ((GridLayoutManager) this.A0S).A1q(Math.max(1, (measuredWidth + (i3 >> 1)) / i3));
        }
        AbstractC03160Fi r0 = this.A08;
        if (r0 != null && (view = r0.A0H) != null) {
            view.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(AnonymousClass06X r5) {
        super.setAdapter(new C29271Wp(r5));
        AnonymousClass06X r0 = this.A0N;
        r0.A01.registerObserver(new C29241Wm(this));
        if (this.A03 > 0) {
            int measuredWidth = getMeasuredWidth();
            int i = this.A03;
            int max = Math.max(1, (measuredWidth + (i >> 1)) / i);
            getContext();
            GridLayoutManager gridLayoutManager = new GridLayoutManager(max);
            gridLayoutManager.A01 = new C29251Wn(this, gridLayoutManager);
            setLayoutManager(gridLayoutManager);
        } else {
            getContext();
            setLayoutManager(new LinearLayoutManager(1));
        }
        this.A08 = this.A0N.A0E(this, -1000);
    }
}
