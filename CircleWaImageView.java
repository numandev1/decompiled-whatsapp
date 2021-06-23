package com.whatsapp;

import X.AbstractC05400Ql;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

public class CircleWaImageView extends AbstractC05400Ql {
    public static final Bitmap.Config A0A = Bitmap.Config.ARGB_8888;
    public static final ImageView.ScaleType A0B = ImageView.ScaleType.CENTER_CROP;
    public float A00;
    public int A01;
    public int A02;
    public Bitmap A03;
    public BitmapShader A04;
    public Matrix A05 = new Matrix();
    public Paint A06 = new Paint();
    public boolean A07;
    public boolean A08;
    public final RectF A09 = new RectF();

    public CircleWaImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        super.setScaleType(A0B);
        this.A07 = true;
        if (this.A08) {
            A03();
            this.A08 = false;
        }
    }

    public final void A02() {
        Bitmap bitmap;
        Drawable drawable = getDrawable();
        if (drawable == null) {
            bitmap = null;
        } else if (drawable instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) drawable).getBitmap();
        } else {
            try {
                Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), A0A);
                Canvas canvas = new Canvas(createBitmap);
                drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                drawable.draw(canvas);
                bitmap = createBitmap;
            } catch (Exception e) {
                e.printStackTrace();
                bitmap = null;
            }
        }
        this.A03 = bitmap;
        A03();
    }

    public final void A03() {
        float width;
        float height;
        float f;
        if (!this.A07) {
            this.A08 = true;
        } else if (getWidth() != 0 || getHeight() != 0) {
            Bitmap bitmap = this.A03;
            if (bitmap == null) {
                invalidate();
                return;
            }
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.A04 = new BitmapShader(bitmap, tileMode, tileMode);
            this.A06.setAntiAlias(true);
            this.A06.setShader(this.A04);
            this.A01 = this.A03.getHeight();
            this.A02 = this.A03.getWidth();
            RectF rectF = this.A09;
            int width2 = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int min = Math.min(width2, height2);
            float paddingLeft = (((float) (width2 - min)) / 2.0f) + ((float) getPaddingLeft());
            float paddingTop = (((float) (height2 - min)) / 2.0f) + ((float) getPaddingTop());
            float f2 = (float) min;
            rectF.set(new RectF(paddingLeft, paddingTop, paddingLeft + f2, f2 + paddingTop));
            this.A00 = Math.min(rectF.height() / 2.0f, rectF.width() / 2.0f);
            this.A05.set(null);
            if (((float) this.A02) * rectF.height() > rectF.width() * ((float) this.A01)) {
                width = rectF.height() / ((float) this.A01);
                f = (rectF.width() - (((float) this.A02) * width)) * 0.5f;
                height = 0.0f;
            } else {
                width = rectF.width() / ((float) this.A02);
                height = (rectF.height() - (((float) this.A01) * width)) * 0.5f;
                f = 0.0f;
            }
            this.A05.setScale(width, width);
            this.A05.postTranslate(((float) ((int) (f + 0.5f))) + rectF.left, ((float) ((int) (height + 0.5f))) + rectF.top);
            this.A04.setLocalMatrix(this.A05);
            invalidate();
        }
    }

    public ImageView.ScaleType getScaleType() {
        return A0B;
    }

    @Override // com.whatsapp.WaImageView
    public void onDraw(Canvas canvas) {
        if (this.A03 != null) {
            RectF rectF = this.A09;
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), this.A00, this.A06);
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        A03();
    }

    public void setAdjustViewBounds(boolean z) {
        if (z) {
            throw new IllegalArgumentException("adjustViewBounds not supported.");
        }
    }

    @Override // X.C02600Cj
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        A02();
    }

    @Override // X.C02600Cj
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        A02();
    }

    @Override // X.C02600Cj
    public void setImageResource(int i) {
        super.setImageResource(i);
        A02();
    }

    @Override // X.C02600Cj
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        A02();
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        A03();
    }

    public void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
        A03();
    }

    public void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType != A0B) {
            throw new IllegalArgumentException(String.format("ScaleType %s not supported.", scaleType));
        }
    }
}
