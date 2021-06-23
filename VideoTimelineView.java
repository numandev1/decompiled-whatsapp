package com.whatsapp;

import X.1la;
import X.3N2;
import X.3N3;
import X.AnonymousClass0Cm;
import X.AnonymousClass0FN;
import X.AnonymousClass1BH;
import X.AnonymousClass1BI;
import X.C05570Rm;
import X.C29281Wq;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.TextView;
import com.whatsapp.mediacomposer.MediaComposerFragment;
import com.whatsapp.mediacomposer.VideoComposerFragment;
import java.io.File;
import java.util.ArrayList;

public class VideoTimelineView extends AnonymousClass0FN {
    public float A00 = 1.0f;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05 = 12.0f;
    public float A06 = 12.0f;
    public int A07 = -1;
    public int A08 = 855638016;
    public int A09;
    public int A0A;
    public int A0B = -1;
    public int A0C = -1;
    public long A0D;
    public long A0E;
    public long A0F;
    public long A0G;
    public AnonymousClass1BH A0H;
    public AnonymousClass1BI A0I;
    public AnonymousClass0Cm A0J;
    public File A0K;
    public ArrayList A0L;
    public final Paint A0M = new Paint(1);
    public final Rect A0N = new Rect();
    public final RectF A0O = new RectF();

    public VideoTimelineView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C05570Rm.A2m);
            this.A00 = obtainStyledAttributes.getDimension(1, 1.0f);
            this.A07 = obtainStyledAttributes.getInteger(0, -1);
            this.A05 = obtainStyledAttributes.getDimension(5, 12.0f);
            this.A0B = obtainStyledAttributes.getInteger(3, -1);
            this.A06 = obtainStyledAttributes.getDimension(6, 12.0f);
            this.A0C = obtainStyledAttributes.getInteger(4, -1);
            this.A08 = obtainStyledAttributes.getInteger(2, 855638016);
            obtainStyledAttributes.recycle();
        }
    }

    private int getTimelineHeight() {
        return Math.max(0, (getHeight() - getPaddingTop()) - getPaddingBottom());
    }

    private int getTimelineWidth() {
        return Math.max(0, (getWidth() - getPaddingLeft()) - getPaddingRight());
    }

    public final int A00(long j) {
        return Math.min(getPaddingLeft() + getTimelineWidth(), Math.max(getPaddingLeft(), (int) (((long) getPaddingLeft()) + ((((long) getTimelineWidth()) * j) / this.A0D))));
    }

    public final long A01(float f) {
        return Math.min(this.A0D, Math.max((long) ((((float) this.A0D) * (f - ((float) getPaddingLeft()))) / ((float) getTimelineWidth())), 0L));
    }

    public final void A02(float f) {
        int i;
        if (this.A01 != f && (i = this.A0A) != 0) {
            float f2 = f - this.A02;
            long j = 0;
            if (i == 1) {
                long A012 = A01(this.A03 + f2);
                long j2 = this.A0G;
                long min = Math.min(A012, j2);
                this.A0F = min;
                long j3 = this.A0E;
                if (j2 - min > j3) {
                    this.A0G = min + j3;
                }
            } else if (i == 2) {
                long A013 = A01(this.A04 + f2);
                long j4 = this.A0F;
                long max = Math.max(A013, j4);
                this.A0G = max;
                long j5 = this.A0E;
                if (max - j4 > j5) {
                    this.A0F = max - j5;
                }
            } else if (i == 3) {
                long j6 = this.A0G - this.A0F;
                long A014 = A01(this.A03 + f2);
                this.A0F = A014;
                if (A014 == 0) {
                    this.A0G = A014 + j6;
                } else {
                    long A015 = A01(this.A04 + f2);
                    this.A0G = A015;
                    if (A015 == this.A0D) {
                        this.A0F = A015 - j6;
                    }
                }
            }
            this.A01 = f;
            invalidate();
            3N2 r0 = this.A0H;
            if (r0 != null) {
                long j7 = this.A0F;
                long j8 = this.A0G;
                3N2 r02 = r0;
                if (r02.A00.A0T.A0B()) {
                    r02.A00.A16();
                }
                VideoComposerFragment videoComposerFragment = r02.A00;
                videoComposerFragment.A02 = j7;
                videoComposerFragment.A03 = j8;
                if (j7 - 200 <= 0 && 200 + j8 >= videoComposerFragment.A0R.A04) {
                    j8 = 0;
                } else if (j8 - j7 < 1000) {
                    j8 = Math.min(1000 + j7, videoComposerFragment.A0R.A04);
                    j = Math.max(0L, j8 - 1000);
                } else {
                    j = j7;
                }
                videoComposerFragment.A0y().AUj(((MediaComposerFragment) videoComposerFragment).A00, j, j8);
                videoComposerFragment.A0T.A09((int) j7);
                videoComposerFragment.A12();
                TextView textView = videoComposerFragment.A0E;
                StringBuilder sb = new StringBuilder();
                sb.append(1la.A0a(videoComposerFragment.A0L, videoComposerFragment.A02 / 1000));
                sb.append(" - ");
                sb.append(1la.A0a(videoComposerFragment.A0L, videoComposerFragment.A03 / 1000));
                textView.setText(sb.toString());
                videoComposerFragment.A17();
            }
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnonymousClass0Cm r0 = this.A0J;
        if (r0 != null) {
            r0.A05(true);
            this.A0J = null;
        }
        this.A0L = null;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.A0K != null) {
            int timelineWidth = getTimelineWidth();
            int timelineHeight = getTimelineHeight();
            if (timelineHeight > 0 && timelineWidth > 0) {
                if (this.A09 != timelineWidth) {
                    this.A09 = timelineWidth;
                    this.A0L = null;
                    AnonymousClass0Cm r0 = this.A0J;
                    if (r0 != null) {
                        r0.A05(true);
                        this.A0J = null;
                    }
                }
                if (this.A0L != null) {
                    float f = ((float) timelineWidth) / ((float) (timelineWidth / timelineHeight));
                    RectF rectF = this.A0O;
                    rectF.top = (float) getPaddingTop();
                    rectF.bottom = (float) (getPaddingTop() + timelineHeight);
                    for (int i = 0; i < this.A0L.size(); i++) {
                        float paddingLeft = ((float) getPaddingLeft()) + (((float) i) * f);
                        rectF.left = paddingLeft;
                        rectF.right = paddingLeft + f;
                        Bitmap bitmap = (Bitmap) this.A0L.get(i);
                        if (bitmap != null) {
                            int width = bitmap.getWidth();
                            int height = bitmap.getHeight();
                            Rect rect = this.A0N;
                            if (width > height) {
                                rect.top = 0;
                                rect.bottom = height;
                                int i2 = (width - height) / 2;
                                rect.left = i2;
                                rect.right = i2 + height;
                            } else {
                                rect.left = 0;
                                rect.right = width;
                                int i3 = (height - width) / 2;
                                rect.top = i3;
                                rect.bottom = width + i3;
                            }
                            canvas.drawBitmap(bitmap, rect, rectF, this.A0M);
                        }
                    }
                } else if (this.A0J == null) {
                    int i4 = timelineWidth / timelineHeight;
                    this.A0L = new ArrayList(i4);
                    C29281Wq r02 = new C29281Wq(this, this.A0K, i4, ((float) timelineWidth) / ((float) i4), (float) timelineHeight);
                    this.A0J = r02;
                    ((AnonymousClass0Cm) r02).A02.execute(new Void[0]);
                }
                if (this.A0H != null) {
                    float A002 = (float) A00(this.A0F);
                    float A003 = (float) A00(this.A0G);
                    Paint paint = this.A0M;
                    paint.setStyle(Paint.Style.FILL);
                    paint.setColor(this.A08);
                    RectF rectF2 = this.A0O;
                    rectF2.set((float) getPaddingLeft(), (float) getPaddingTop(), A002, (float) (getHeight() - getPaddingBottom()));
                    canvas.drawRect(rectF2, paint);
                    rectF2.set(A003, (float) getPaddingTop(), (float) (getWidth() - getPaddingRight()), (float) (getHeight() - getPaddingBottom()));
                    canvas.drawRect(rectF2, paint);
                    3N3 r03 = this.A0I;
                    if (r03 != null) {
                        3N3 r04 = r03;
                        if (r04.A00.A0T.A0B()) {
                            VideoComposerFragment videoComposerFragment = r04.A00;
                            videoComposerFragment.A01 = (long) videoComposerFragment.A0T.A01();
                        }
                        long j = r04.A00.A01;
                        if (j >= 0 && j >= this.A0F && j <= this.A0G) {
                            paint.setColor(this.A07);
                            paint.setStyle(Paint.Style.STROKE);
                            paint.setStrokeWidth(this.A00 / 2.0f);
                            float A004 = (float) A00(j);
                            canvas.drawLine(A004, (float) getPaddingTop(), A004, (float) (getHeight() - getPaddingBottom()), paint);
                        }
                        if (this.A0I.A00.A0T.A0B()) {
                            invalidate();
                        }
                    }
                    paint.setColor(this.A07);
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeWidth(this.A00);
                    rectF2.set(A002 - 1.0f, (float) getPaddingTop(), 1.0f + A003, (float) (getHeight() - getPaddingBottom()));
                    canvas.drawRect(rectF2, paint);
                    paint.setStyle(Paint.Style.FILL);
                    paint.setColor(this.A0A == 1 ? this.A0C : this.A0B);
                    int i5 = timelineHeight / 2;
                    canvas.drawCircle(A002, (float) (getPaddingTop() + i5), this.A0A == 1 ? this.A06 : this.A05, paint);
                    paint.setColor(this.A0A == 2 ? this.A0C : this.A0B);
                    canvas.drawCircle(A003, (float) (getPaddingTop() + i5), this.A0A == 2 ? this.A06 : this.A05, paint);
                }
            }
        } else if (isInEditMode()) {
            Paint paint2 = this.A0M;
            paint2.setStyle(Paint.Style.FILL);
            paint2.setColor(this.A08);
            RectF rectF3 = this.A0O;
            rectF3.set((float) getPaddingLeft(), (float) getPaddingTop(), (float) (getWidth() - getPaddingRight()), (float) (getHeight() - getPaddingBottom()));
            canvas.drawRect(rectF3, paint2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00de, code lost:
        if ((r6 / ((float) getWidth())) <= 0.5f) goto L_0x0136;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r15) {
        /*
        // Method dump skipped, instructions count: 323
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.VideoTimelineView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setMaxTrim(long j) {
        this.A0E = j;
    }

    public void setTrimListener(AnonymousClass1BH r1) {
        this.A0H = r1;
    }

    public void setVideoPlayback(AnonymousClass1BI r1) {
        this.A0I = r1;
    }
}
