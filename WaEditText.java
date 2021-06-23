package com.whatsapp;

import X.2Mt;
import X.AnonymousClass01G;
import X.AnonymousClass020;
import X.AnonymousClass0Gs;
import X.AnonymousClass16M;
import X.AnonymousClass1BK;
import X.C002701g;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.Selection;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;

public class WaEditText extends AnonymousClass0Gs {
    public Rect A00;
    public AnonymousClass1BK A01;
    public AnonymousClass020 A02;
    public AnonymousClass01G A03;
    public boolean A04;
    public final Runnable A05 = new AnonymousClass16M(this);

    public WaEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (attributeSet != null && !isInEditMode()) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, 2Mt.A2J);
            int resourceId = obtainStyledAttributes.getResourceId(3, 0);
            if (resourceId != 0) {
                setContentDescription(this.A03.A08(resourceId));
            }
            int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
            if (resourceId2 != 0) {
                setHint(context.getString(resourceId2));
            }
            int resourceId3 = obtainStyledAttributes.getResourceId(2, 0);
            if (resourceId3 != 0) {
                setImeActionLabel(this.A03.A08(resourceId3), getImeActionId());
            }
            int resourceId4 = obtainStyledAttributes.getResourceId(0, 0);
            if (resourceId4 != 0) {
                setText(this.A03.A08(resourceId4));
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void A01() {
        InputMethodManager A0M = this.A02.A0M();
        this.A04 = false;
        removeCallbacks(this.A05);
        if (A0M != null) {
            A0M.hideSoftInputFromWindow(getWindowToken(), 0);
        }
    }

    public void A02(boolean z) {
        InputMethodManager A0M = this.A02.A0M();
        if (A0M == null) {
            return;
        }
        if (A0M.isFullscreenMode() && !z) {
            return;
        }
        if (A0M.isActive(this)) {
            this.A04 = false;
            removeCallbacks(this.A05);
            A0M.showSoftInput(this, 0);
            return;
        }
        requestFocus();
        this.A04 = true;
    }

    public boolean A03(Point point) {
        int i;
        int i2;
        Rect rect = this.A00;
        return rect == null || ((i = point.x) >= rect.left && i <= rect.right && (i2 = point.y) >= rect.top && i2 <= rect.bottom);
    }

    @Override // X.C03380Gt
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (this.A04) {
            Runnable runnable = this.A05;
            removeCallbacks(runnable);
            post(runnable);
        }
        return onCreateInputConnection;
    }

    public void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (IndexOutOfBoundsException e) {
            setText(C002701g.A0D(getText()));
        }
    }

    public boolean onTextContextMenuItem(int i) {
        AnonymousClass1BK r0 = this.A01;
        return (r0 != null && r0.AQB(i)) || super.onTextContextMenuItem(i);
    }

    public void setCursorPosition_internal(int i, int i2) {
        int length = getText().length();
        Selection.setSelection(getText(), Math.min(i, length), Math.min(i2, length));
    }

    public void setOnContextMenuListener(AnonymousClass1BK r1) {
        this.A01 = r1;
    }

    public void setSpan_internal(Object obj, int i, int i2, int i3) {
        getText().setSpan(obj, i, Math.min(i2, getText().length()), i3);
    }

    public void setVisibleBounds(Rect rect) {
        this.A00 = rect;
    }
}
