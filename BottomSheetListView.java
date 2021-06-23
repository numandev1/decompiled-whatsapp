package com.whatsapp;

import X.AnonymousClass1WO;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

public class BottomSheetListView extends AnonymousClass1WO {
    public BottomSheetListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (getChildCount() > 0 && !(getFirstVisiblePosition() == 0 && getChildAt(0).getTop() == 0 && getLastVisiblePosition() != getChildCount())) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return super.onTouchEvent(motionEvent);
    }
}
