package com.whatsapp;

import X.AbstractC24301Ar;
import X.AnonymousClass0R0;
import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;

public class InterceptingEditText extends AnonymousClass0R0 {
    public AbstractC24301Ar A00;

    public InterceptingEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        AbstractC24301Ar r1;
        if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1 || (r1 = this.A00) == null) {
            return super.onKeyPreIme(i, keyEvent);
        }
        r1.AIC();
        return true;
    }

    public void setOnBackButtonListener(AbstractC24301Ar r1) {
        this.A00 = r1;
    }
}
