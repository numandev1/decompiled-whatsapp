package com.whatsapp;

import X.1dm;
import X.1ew;
import X.1la;
import X.2lR;
import X.AbstractC02650Ct;
import X.AnonymousClass00C;
import X.AnonymousClass01G;
import X.AnonymousClass01M;
import X.AnonymousClass020;
import X.AnonymousClass02A;
import X.AnonymousClass08x;
import X.AnonymousClass0KS;
import X.AnonymousClass0KU;
import X.AnonymousClass0UH;
import X.AnonymousClass1BD;
import X.C020709z;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.SingleLineTransformationMethod;
import android.text.style.MetricAffectingSpan;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.util.Log;
import java.util.List;

public class TextEmojiLabel extends AbstractC02650Ct {
    public static boolean A0D;
    public static final Spannable.Factory A0E = new AnonymousClass1BD();
    public static final boolean A0F;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public Paint A04;
    public TextView.BufferType A05;
    public AnonymousClass0KU A06;
    public AnonymousClass0KS A07;
    public AnonymousClass020 A08;
    public AnonymousClass01G A09;
    public 1dm A0A;
    public AnonymousClass02A A0B;
    public CharSequence A0C;

    static {
        boolean z;
        boolean z2 = false;
        try {
            Class cls = Integer.TYPE;
            Layout.class.getDeclaredMethod("processToSupportEmoji", CharSequence.class, cls, cls);
            z = true;
        } catch (NoSuchMethodException | SecurityException e) {
            z = false;
        }
        A0D = z;
        if (Build.VERSION.SDK_INT < 19) {
            z2 = true;
        }
        A0F = z2;
    }

    public TextEmojiLabel(Context context) {
        super(context);
        if (A0F) {
            setSpannableFactory(A0E);
        }
        if (Build.VERSION.SDK_INT == 29) {
            setBreakStrategy(0);
        }
    }

    public TextEmojiLabel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (A0F) {
            setSpannableFactory(A0E);
        }
        if (Build.VERSION.SDK_INT == 29) {
            setBreakStrategy(0);
        }
    }

    public static final String A00(CharSequence charSequence) {
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(length * 6);
        for (int i = 0; i < length; i++) {
            char charAt = charSequence.charAt(i);
            sb.append("0x");
            sb.append(Integer.toHexString(charAt));
            sb.append(", ");
        }
        return sb.toString();
    }

    public void A02(int i) {
        Drawable A032 = C020709z.A03(getContext(), i);
        if (this.A09.A0P()) {
            setCompoundDrawablesWithIntrinsicBounds(A032, (Drawable) null, (Drawable) null, (Drawable) null);
        } else {
            setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, A032, (Drawable) null);
        }
        setCompoundDrawablePadding(getResources().getDimensionPixelSize(2131166326));
    }

    public void A03(CharSequence charSequence) {
        A06(charSequence, null, false, 0);
    }

    public void A04(CharSequence charSequence, List list, 2lR r11, boolean z, int i) {
        A05(charSequence, list, r11, z, i, false, 0);
    }

    public void A05(CharSequence charSequence, List list, 2lR r7, boolean z, int i, boolean z2, int i2) {
        CharSequence charSequence2;
        if (z) {
            AnonymousClass020 r0 = this.A08;
            AnonymousClass02A r1 = this.A0B;
            charSequence2 = z2 ? 1la.A0R(r0, r1, charSequence, true, i2) : 1la.A0Q(r0, r1, charSequence);
        } else {
            charSequence2 = charSequence;
        }
        if (i > 0 && charSequence2 != null && charSequence2.length() > i) {
            int charCount = (Character.charCount(Character.codePointAt(charSequence2, i - 1)) - 1) + i;
            charSequence2 = charSequence2 instanceof Editable ? ((Editable) charSequence2).delete(charCount, charSequence2.length()) : TextUtils.substring(charSequence2, 0, charCount);
        }
        CharSequence A0S = AnonymousClass01M.A0S(charSequence2, getContext(), getPaint(), this.A0A);
        if (r7 == null) {
            r7 = 2lR.A04;
        }
        setText(2lR.A03(getContext(), A0S, list, r7, this.A09));
    }

    public void A06(CharSequence charSequence, List list, boolean z, int i) {
        A04(charSequence, list, null, z, i);
    }

    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        AnonymousClass0KU r0 = this.A06;
        return (r0 != null && r0.A0I(motionEvent)) || super.dispatchHoverEvent(motionEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        AnonymousClass0KU r0 = this.A06;
        return (r0 != null && r0.A0H(keyEvent)) || super.dispatchKeyEvent(keyEvent);
    }

    public void onDraw(Canvas canvas) {
        if (this.A03 > 0) {
            canvas.drawRect((float) (getScrollX() + getPaddingLeft()), (float) (((getHeight() - getPaddingBottom()) - this.A01) - this.A02), (float) ((getScrollX() + getWidth()) - getPaddingRight()), (float) ((getHeight() - getPaddingBottom()) - this.A01), this.A04);
            return;
        }
        try {
            super.onDraw(canvas);
        } catch (IndexOutOfBoundsException e) {
            setText(getText());
        } catch (Exception e2) {
            Log.e(e2);
            StringBuilder sb = new StringBuilder("measuredwidth: ");
            sb.append(getMeasuredWidth());
            Log.e(sb.toString());
            CharSequence text = getText();
            StringBuilder A0R = AnonymousClass00C.A0R("text: ");
            A0R.append(A00(text));
            Log.e(A0R.toString());
            Layout layout = getLayout();
            StringBuilder A0R2 = AnonymousClass00C.A0R("line_count: ");
            A0R2.append(layout.getLineCount());
            Log.e(A0R2.toString());
            int i = 0;
            while (i < layout.getLineCount()) {
                int lineStart = layout.getLineStart(i);
                int length = i == layout.getLineCount() + -1 ? text.length() : layout.getLineStart(i + 1);
                if (lineStart <= length) {
                    StringBuilder A0T = AnonymousClass00C.A0T("line ", i, " (", lineStart, "-");
                    A0T.append(length);
                    A0T.append("): ");
                    A0T.append(A00(text.subSequence(lineStart, length)));
                    Log.e(A0T.toString());
                } else {
                    StringBuilder A0T2 = AnonymousClass00C.A0T("line ", i, " (", lineStart, "-");
                    A0T2.append(length);
                    A0T2.append(")");
                    Log.e(A0T2.toString());
                }
                i++;
            }
            throw new RuntimeException(e2);
        }
    }

    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        AnonymousClass0KU r0 = this.A06;
        if (r0 != null) {
            int i2 = r0.A01;
            if (i2 != Integer.MIN_VALUE) {
                r0.A0D(i2);
            }
            if (z) {
                r0.A0G(i, rect);
            }
        }
    }

    @Override // X.C02670Cw
    public void onMeasure(int i, int i2) {
        int size;
        if (this.A03 > 0) {
            int mode = View.MeasureSpec.getMode(i);
            int size2 = View.MeasureSpec.getSize(i);
            super.onMeasure(i, i2);
            setMeasuredDimension(mode != 1073741824 ? (this.A03 * size2) / 100 : getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 == 16 || i3 == 17) {
            try {
                super.onMeasure(i, i2);
            } catch (IndexOutOfBoundsException e) {
                Log.e("textemojilabel/measure ", e);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.A0C);
                int nextSpanTransition = spannableStringBuilder.nextSpanTransition(0, spannableStringBuilder.length(), MetricAffectingSpan.class);
                while (nextSpanTransition >= 0 && nextSpanTransition < spannableStringBuilder.length()) {
                    spannableStringBuilder.insert(nextSpanTransition, (CharSequence) " ");
                    nextSpanTransition = spannableStringBuilder.nextSpanTransition(nextSpanTransition + 1, spannableStringBuilder.length(), MetricAffectingSpan.class);
                }
                try {
                    this.A0C = spannableStringBuilder;
                    super.setText(spannableStringBuilder);
                    super.onMeasure(i, i2);
                } catch (ArrayIndexOutOfBoundsException e2) {
                    Log.e("textemojilabel/measure1 ", e2);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(this.A0C);
                    int indexOf = TextUtils.indexOf((CharSequence) spannableStringBuilder2, '\n', 0);
                    while (indexOf >= 0) {
                        int i4 = indexOf + 1;
                        spannableStringBuilder2 = spannableStringBuilder2.replace(indexOf, i4, (CharSequence) " ");
                        indexOf = TextUtils.indexOf((CharSequence) spannableStringBuilder2, '\n', i4);
                    }
                    this.A0C = spannableStringBuilder2;
                    super.setText(spannableStringBuilder2);
                    super.onMeasure(i, i2);
                }
            }
        } else {
            super.onMeasure(i, i2);
        }
        if (View.MeasureSpec.getMode(i) != 0 && (size = (View.MeasureSpec.getSize(i) - getCompoundPaddingLeft()) - getCompoundPaddingRight()) > 0 && this.A00 != size && (this.A0C instanceof Spanned) && getEllipsize() != null && (getTransformationMethod() instanceof SingleLineTransformationMethod)) {
            this.A00 = size;
            CharSequence transformation = getTransformationMethod() != null ? getTransformationMethod().getTransformation(this.A0C, this) : this.A0C;
            CharSequence ellipsize = TextUtils.ellipsize(transformation, getPaint(), (float) size, getEllipsize());
            if (ellipsize != null && !ellipsize.equals(transformation)) {
                super.setText(ellipsize, this.A05);
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (this.A07 != null) {
            CharSequence text = getText();
            if ((text instanceof Spannable) && getLayout() != null) {
                return this.A07.onTouchEvent(this, (Spannable) text, motionEvent) | onTouchEvent;
            }
        }
        return onTouchEvent;
    }

    public void setAccessibilityHelper(AnonymousClass0KU r1) {
        this.A06 = r1;
        AnonymousClass08x.A0c(this, r1);
    }

    public void setLinkHandler(AnonymousClass0KS r1) {
        this.A07 = r1;
    }

    public void setPlaceholder(int i) {
        if (this.A03 != i) {
            this.A03 = i;
            if (i > 0) {
                Paint.FontMetricsInt A002 = 1ew.A00(getPaint());
                this.A02 = ((-A002.ascent) * 6) / 10;
                this.A01 = A002.bottom;
                Paint paint = this.A04;
                if (paint == null) {
                    paint = new Paint();
                    this.A04 = paint;
                }
                paint.setColor(AnonymousClass0UH.A03(getPaint().getColor(), (Color.alpha(getPaint().getColor()) * 12) / 255));
            }
            invalidate();
        }
    }

    @Override // android.widget.TextView, com.whatsapp.WaTextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (A0D && charSequence != null) {
            SpannableStringBuilder spannableStringBuilder = null;
            for (int i = 0; i < charSequence.length(); i++) {
                char charAt = charSequence.charAt(i);
                if (55296 <= charAt && charAt <= 57343) {
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder(charSequence);
                    }
                    spannableStringBuilder.replace(i, i + 1, (CharSequence) "□");
                }
            }
            if (spannableStringBuilder != null) {
                charSequence = spannableStringBuilder;
            }
        }
        this.A0C = charSequence;
        this.A05 = bufferType;
        this.A00 = 0;
        if (charSequence != null && charSequence.length() >= 3000) {
            charSequence.length();
        }
        if ((A0F || this.A07 != null) && (charSequence instanceof Spanned)) {
            super.setText(charSequence, TextView.BufferType.SPANNABLE);
        } else {
            super.setText(charSequence, bufferType);
        }
    }
}
