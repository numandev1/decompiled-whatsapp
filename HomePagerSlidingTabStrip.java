package com.whatsapp;

import X.AbstractC05530Ri;
import X.AnonymousClass0Sb;
import X.ViewGroup$OnHierarchyChangeListenerC05550Rk;
import android.animation.LayoutTransition;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class HomePagerSlidingTabStrip extends AbstractC05530Ri {
    public HomePagerSlidingTabStrip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.whatsapp.PagerSlidingTabStrip
    public LinearLayout A01(Context context) {
        return new ViewGroup$OnHierarchyChangeListenerC05550Rk(context);
    }

    @Override // com.whatsapp.PagerSlidingTabStrip
    public void A03(int i, View view) {
        LayoutTransition layoutTransition;
        super.A03(i, view);
        if (view instanceof ViewGroup) {
            View childAt = ((ViewGroup) view).getChildAt(0);
            if ((childAt instanceof ViewGroup) && (layoutTransition = ((ViewGroup) childAt).getLayoutTransition()) != null) {
                layoutTransition.addTransitionListener(new AnonymousClass0Sb(this));
            }
        }
    }
}
