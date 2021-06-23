package com.whatsapp;

import X.2Mt;
import X.AbstractC05410Qn;
import X.AnonymousClass01G;
import X.AnonymousClass056;
import X.AnonymousClass08x;
import X.AnonymousClass1C9;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;

public class ClearableEditText extends AbstractC05410Qn implements TextWatcher, View.OnTouchListener {
    public Drawable A00;
    public View.OnClickListener A01;
    public AnonymousClass01G A02;
    public boolean A03;
    public boolean A04;
    public boolean A05 = true;
    public final Rect A06 = new Rect();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClearableEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i = 2131231408;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, 2Mt.A0X);
            this.A04 = obtainStyledAttributes.getBoolean(1, false);
            this.A05 = obtainStyledAttributes.getBoolean(3, true);
            this.A03 = obtainStyledAttributes.getBoolean(0, false);
            i = obtainStyledAttributes.getResourceId(2, 2131231408);
            obtainStyledAttributes.recycle();
        }
        this.A00 = AnonymousClass056.A0J(getResources(), i, null);
        setOnTouchListener(this);
        addTextChangedListener(this);
        AnonymousClass08x.A0c(this, new AnonymousClass1C9(this, this));
    }

    public static /* synthetic */ boolean A01(ClearableEditText clearableEditText, int i, int i2) {
        Rect clearBounds = clearableEditText.getClearBounds();
        return i >= clearBounds.left && i <= clearBounds.right && i2 >= clearBounds.top && i2 <= clearBounds.bottom;
    }

    /* access modifiers changed from: private */
    public Rect getClearBounds() {
        Drawable clearIconDrawable = getClearIconDrawable();
        if (clearIconDrawable == null) {
            return new Rect();
        }
        int width = this.A02.A0P() ? 0 : (getWidth() - getPaddingRight()) - clearIconDrawable.getIntrinsicWidth();
        int paddingLeft = this.A02.A0P() ? getPaddingLeft() + clearIconDrawable.getIntrinsicWidth() : getWidth();
        int bottom = getBottom();
        int top = getTop();
        int intrinsicHeight = clearIconDrawable.getIntrinsicHeight();
        int bottom2 = getBottom();
        int top2 = getTop();
        int intrinsicHeight2 = clearIconDrawable.getIntrinsicHeight();
        Rect rect = this.A06;
        rect.left = width;
        rect.right = paddingLeft;
        rect.top = ((bottom - top) >> 1) - (intrinsicHeight >> 1);
        rect.bottom = (intrinsicHeight2 >> 1) + ((bottom2 - top2) >> 1);
        return rect;
    }

    public final void A02(Editable editable) {
        if (this.A03 || (!TextUtils.isEmpty(editable) && isFocusable() && isEnabled())) {
            if (this.A00 != null) {
                boolean A0P = this.A02.A0P();
                Drawable drawable = this.A00;
                if (A0P) {
                    setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
                } else {
                    setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
                }
            }
        } else if (getClearIconDrawable() != null) {
            setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    public void afterTextChanged(Editable editable) {
        A02(editable);
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public Drawable getClearIconDrawable() {
        boolean A0P = this.A02.A0P();
        Drawable[] compoundDrawables = getCompoundDrawables();
        return A0P ? compoundDrawables[0] : compoundDrawables[2];
    }

    public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        if (this.A04 && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
            clearFocus();
        }
        return super.onKeyPreIme(i, keyEvent);
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (getClearIconDrawable() != null) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (motionEvent.getAction() == 1) {
                Rect clearBounds = getClearBounds();
                if (x >= clearBounds.left && x <= clearBounds.right && y >= clearBounds.top && y <= clearBounds.bottom) {
                    View.OnClickListener onClickListener = this.A01;
                    if (onClickListener != null) {
                        onClickListener.onClick(this);
                    }
                    setText("");
                    requestFocus();
                    return this.A05;
                }
            }
        }
        return false;
    }

    public void setAlwaysShowClearIcon(boolean z) {
        if (z != this.A03) {
            this.A03 = z;
            invalidate();
        }
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        A02(getText());
    }

    public void setOnClearIconClickedListener(View.OnClickListener onClickListener) {
        this.A01 = onClickListener;
    }
}
