package com.whatsapp;

import X.2Mt;
import X.AbstractC05380Qh;
import X.AnonymousClass01G;
import X.AnonymousClass0OX;
import X.AnonymousClass1WN;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.recyclerview.widget.GridLayoutManager;

public class AutoFitGridRecyclerView extends AbstractC05380Qh {
    public int A00;
    public AnonymousClass01G A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AutoFitGridRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i = 0;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, 2Mt.A0J);
            this.A00 = obtainStyledAttributes.getDimensionPixelSize(0, this.A00);
            i = obtainStyledAttributes.getDimensionPixelSize(1, 0);
            obtainStyledAttributes.recycle();
        }
        A0k(new AnonymousClass1WN(this.A01, i));
        setLayoutManager(new GridLayoutManager(1));
        this.A0i = true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.A00 > 0) {
            AnonymousClass0OX r0 = this.A0S;
            if (r0 instanceof GridLayoutManager) {
                ((GridLayoutManager) r0).A1q(Math.max(1, getMeasuredWidth() / this.A00));
            }
        }
    }
}
