package com.whatsapp;

import X.2Mt;
import X.AbstractC05430Qs;
import X.AnonymousClass01G;
import X.AnonymousClass020;
import X.AnonymousClass07S;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;

public class CopyableTextView extends AbstractC05430Qs implements View.OnClickListener {
    public AnonymousClass07S A00;
    public AnonymousClass020 A01;
    public AnonymousClass01G A02;
    public String A03;

    public CopyableTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setClickable(true);
        setTextIsSelectable(true);
        setOnClickListener(this);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, 2Mt.A0j);
            int resourceId = obtainStyledAttributes.getResourceId(0, 0);
            if (resourceId != 0) {
                this.A03 = this.A02.A08(resourceId);
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void onClick(View view) {
        ClipboardManager A08;
        if (!TextUtils.isEmpty(this.A03) && (A08 = this.A01.A08()) != null) {
            try {
                A08.setPrimaryClip(ClipData.newPlainText(getText(), getText()));
                this.A00.A0D(this.A03, 0);
            } catch (NullPointerException | SecurityException e) {
            }
        }
    }

    public void setToastString(String str) {
        this.A03 = str;
    }
}
