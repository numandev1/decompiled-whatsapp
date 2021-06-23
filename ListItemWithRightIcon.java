package com.whatsapp;

import X.2Mt;
import X.AnonymousClass01G;
import X.AnonymousClass08x;
import X.AnonymousClass0Nn;
import X.AnonymousClass0R5;
import X.C020709z;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ListItemWithRightIcon extends AnonymousClass0R5 {
    public WaImageView A00;
    public WaTextView A01;
    public WaTextView A02;
    public AnonymousClass01G A03;

    /* JADX INFO: finally extract failed */
    public ListItemWithRightIcon(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        int i;
        int i2;
        int i3;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, 2Mt.A19, 0, 0);
            try {
                i2 = obtainStyledAttributes.getResourceId(2, 0);
                int resourceId = obtainStyledAttributes.getResourceId(0, 0);
                i3 = obtainStyledAttributes.getResourceId(1, 0);
                obtainStyledAttributes.recycle();
                i = resourceId;
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
        }
        View inflate = LayoutInflater.from(getContext()).inflate(2131558961, (ViewGroup) this, true);
        this.A02 = (WaTextView) AnonymousClass08x.A0D(inflate, 2131363436);
        this.A01 = (WaTextView) AnonymousClass08x.A0D(inflate, 2131363434);
        this.A00 = (WaImageView) AnonymousClass08x.A0D(inflate, 2131363435);
        if (i2 != 0) {
            this.A02.setText(i2);
        }
        if (i != 0) {
            this.A01.setText(i);
        }
        if (i3 != 0) {
            this.A00.setImageDrawable(new AnonymousClass0Nn(this.A03, C020709z.A03(getContext(), i3)));
        }
    }

    public void setDescription(String str) {
        this.A01.setText(str);
    }

    public void setIcon(int i) {
        this.A00.setImageDrawable(new AnonymousClass0Nn(this.A03, C020709z.A03(getContext(), i)));
    }

    public void setIconVisible(boolean z) {
        WaImageView waImageView = this.A00;
        int i = 8;
        if (z) {
            i = 0;
        }
        waImageView.setVisibility(i);
    }

    public void setTitle(String str) {
        this.A02.setText(str);
    }
}
