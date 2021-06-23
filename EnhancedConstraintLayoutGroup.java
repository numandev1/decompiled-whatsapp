package com.whatsapp;

import X.AbstractC24551Bu;
import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;

public class EnhancedConstraintLayoutGroup extends AbstractC24551Bu {
    public EnhancedConstraintLayoutGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // X.AbstractC04860Ns
    public void A06(ConstraintLayout constraintLayout) {
        super.A06(constraintLayout);
        for (int i : getReferencedIds()) {
            constraintLayout.findViewById(i).setAlpha(getAlpha());
        }
    }

    public void setAlpha(float f) {
        super.setAlpha(f);
        A01();
    }
}
