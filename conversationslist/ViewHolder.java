package com.whatsapp.conversationslist;

import X.1dn;
import X.1do;
import X.1e7;
import X.1f5;
import X.1fN;
import X.1gD;
import X.1hN;
import X.1hl;
import X.1kV;
import X.1la;
import X.1oV;
import X.1t5;
import X.1uB;
import X.23h;
import X.2Cq;
import X.2Tk;
import X.2dz;
import X.2e0;
import X.2e3;
import X.2iM;
import X.2iS;
import X.2iU;
import X.2lR;
import X.2so;
import X.34P;
import X.34R;
import X.34a;
import X.AbstractC05760Sl;
import X.AnonymousClass00G;
import X.AnonymousClass00O;
import X.AnonymousClass01G;
import X.AnonymousClass01M;
import X.AnonymousClass01Q;
import X.AnonymousClass01T;
import X.AnonymousClass028;
import X.AnonymousClass08x;
import X.AnonymousClass0AV;
import X.AnonymousClass0GE;
import X.AnonymousClass0GR;
import X.C000100c;
import X.C000700j;
import X.C020709z;
import X.C02580Cg;
import X.C02880Ds;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.OnLifecycleEvent;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.components.ConversationListRowHeaderView;
import com.whatsapp.components.SelectionCheckView;

public class ViewHolder extends AbstractC05760Sl implements AnonymousClass0GR {
    public 2so A00;
    public 2iS A01;
    public 2Tk A02;
    public final View A03;
    public final View A04;
    public final View A05;
    public final View A06;
    public final View A07;
    public final ImageView A08;
    public final ImageView A09;
    public final ImageView A0A;
    public final ImageView A0B;
    public final ImageView A0C;
    public final ImageView A0D;
    public final ImageView A0E;
    public final TextView A0F;
    public final C02880Ds A0G;
    public final AnonymousClass028 A0H;
    public final C000700j A0I;
    public final AnonymousClass0GE A0J;
    public final TextEmojiLabel A0K;
    public final TextEmojiLabel A0L;
    public final WaImageView A0M;
    public final WaTextView A0N;
    public final 1hl A0O;
    public final 1e7 A0P;
    public final ConversationListRowHeaderView A0Q;
    public final SelectionCheckView A0R;
    public final 1gD A0S;
    public final 1dn A0T;
    public final 1do A0U;
    public final 23h A0V;
    public final 2iM A0W;
    public final 1t5 A0X;
    public final C000100c A0Y;
    public final AnonymousClass00O A0Z;
    public final AnonymousClass00G A0a;
    public final AnonymousClass01G A0b;
    public final 1f5 A0c;
    public final 1oV A0d;
    public final 1kV A0e;
    public final AnonymousClass01T A0f;
    public final 1hN A0g;
    public final 1uB A0h;
    public final 1fN A0i;
    public final 2lR A0j;
    public final boolean A0k;

    public ViewHolder(Context context, AnonymousClass00O r11, C000100c r12, AnonymousClass01T r13, 1hN r14, AnonymousClass028 r15, 1f5 r16, C000700j r17, 1uB r18, 1gD r19, 1dn r20, C02880Ds r21, 1oV r22, 1do r23, AnonymousClass01G r24, 1e7 r25, 1kV r26, 2Cq r27, 1fN r28, AnonymousClass00G r29, 1hl r30, AnonymousClass0GE r31, View view, 2lR r33, 23h r34, 2iM r35, 1t5 r36) {
        super(view);
        this.A0Y = r12;
        this.A0f = r13;
        this.A0g = r14;
        this.A0H = r15;
        this.A0Z = r11;
        this.A0c = r16;
        this.A0I = r17;
        this.A0h = r18;
        this.A0S = r19;
        this.A0T = r20;
        this.A0G = r21;
        this.A0d = r22;
        this.A0U = r23;
        this.A0b = r24;
        this.A0j = r33;
        this.A0P = r25;
        this.A0e = r26;
        this.A0i = r28;
        this.A0V = r34;
        this.A0a = r29;
        this.A0W = r35;
        this.A0O = r30;
        this.A0J = r31;
        this.A0X = r36;
        ConversationListRowHeaderView A0D2 = AnonymousClass08x.A0D(view, 2131362594);
        this.A0Q = A0D2;
        this.A00 = new 2so(r11.A00, A0D2, r23, r27);
        this.A05 = AnonymousClass08x.A0D(view, 2131362524);
        AnonymousClass01Q.A06(this.A00.A01.A01);
        this.A07 = AnonymousClass08x.A0D(view, 2131364229);
        this.A08 = (ImageView) AnonymousClass08x.A0D(view, 2131362509);
        this.A04 = AnonymousClass08x.A0D(view, 2131362526);
        this.A06 = AnonymousClass08x.A0D(view, 2131362591);
        this.A0K = (TextEmojiLabel) AnonymousClass08x.A0D(view, 2131364724);
        this.A0L = (TextEmojiLabel) AnonymousClass08x.A0D(view, 2131363715);
        this.A0M = (WaImageView) AnonymousClass08x.A0D(view, 2131362597);
        this.A0F = (TextView) AnonymousClass08x.A0D(view, 2131362595);
        this.A0E = (ImageView) AnonymousClass08x.A0D(view, 2131364788);
        this.A0B = (ImageView) AnonymousClass08x.A0D(view, 2131363556);
        this.A0N = (WaTextView) AnonymousClass08x.A0D(view, 2131364036);
        this.A0C = (ImageView) AnonymousClass08x.A0D(view, 2131363724);
        this.A0D = (ImageView) AnonymousClass08x.A0D(view, 2131364103);
        this.A0k = r13.A0C(462);
        if (r13.A0C(363)) {
            C02580Cg.A05(r24, this.A0C, ((ViewGroup.MarginLayoutParams) this.A0C.getLayoutParams()).leftMargin, context.getResources().getDimensionPixelSize(2131165500));
            C02580Cg.A05(r24, this.A0D, ((ViewGroup.MarginLayoutParams) this.A0D.getLayoutParams()).leftMargin, context.getResources().getDimensionPixelSize(2131165504));
            C02580Cg.A05(r24, this.A0F, context.getResources().getDimensionPixelSize(2131165537), context.getResources().getDimensionPixelSize(2131165539));
        }
        if (r13.A0C(363) || this.A0k) {
            this.A0D.setImageDrawable(C020709z.A03(context, 2131231593));
            1la.A14(this.A0D, C020709z.A00(context, 2131100234));
        } else {
            1la.A14(this.A0D, C020709z.A00(context, 2131099905));
        }
        this.A0A = (ImageView) AnonymousClass08x.A0D(view, 2131363453);
        this.A03 = AnonymousClass08x.A0D(view, 2131361985);
        this.A0R = AnonymousClass08x.A0D(view, 2131364591);
        this.A09 = (ImageView) AnonymousClass08x.A0D(view, 2131362593);
        if (this.A0k) {
            Resources resources = super.A0H.getContext().getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(2131165823);
            C02580Cg.A08(this.A0b, this.A04, dimensionPixelSize, 0, dimensionPixelSize, 0);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(this.A04.getLayoutParams());
            layoutParams.width = resources.getDimensionPixelSize(2131165822);
            this.A04.setLayoutParams(layoutParams);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(2131165436);
            this.A08.setLayoutParams(new FrameLayout.LayoutParams(dimensionPixelSize2, dimensionPixelSize2, 17));
            C02580Cg.A08(this.A0b, this.A06, 0, 0, resources.getDimensionPixelSize(2131165823), 0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.A0Q.getLayoutParams();
            C02580Cg.A07(this.A0b, this.A0Q, marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, resources.getDimensionPixelSize(2131165827));
            A0I(this.A0R);
            A0I(this.A09);
        }
    }

    public final void A0I(View view) {
        C02580Cg.A07(this.A0b, view, view.getResources().getDimensionPixelSize(2131165825), view.getResources().getDimensionPixelSize(2131165826), 0, 0);
    }

    public void A0J(2Tk r33, boolean z, Context context, Activity activity, 2iU r37, int i) {
        if (!AnonymousClass01M.A1E(this.A02, r33)) {
            2iS r2 = this.A01;
            if (r2 != null) {
                r2.A02();
            }
            this.A02 = r33;
        }
        this.A08.setTag(null);
        if (r33 instanceof 2dz) {
            this.A01 = new 34R(i, this, context, activity, r37, this.A0Y, this.A0f, this.A0g, this.A0H, this.A0Z, this.A0c, this.A0I, this.A0h, this.A0S, this.A0T, this.A0G, this.A0d, this.A0U, this.A0b, this.A0j, this.A0P, this.A0e, this.A0i, this.A0V, this.A0a, this.A0W, this.A0O, this.A0J, this.A0X);
        } else if (r33 instanceof 2e0) {
            this.A01 = new 34P(this.A0Z, context, this.A0Y, this.A0g, this.A0H, this.A0I, this.A0h, this.A0T, this.A0d, this.A0U, this.A0b, this.A0P, this.A0i, this.A0O, this.A0J, this, activity, r37, this.A0j, this.A0V, this.A0X);
        } else if (r33 instanceof 2e3) {
            this.A01 = new 34a(this.A0Z, context, this.A0Y, this.A0g, this.A0H, this.A0I, this.A0h, this.A0T, this.A0d, this.A0U, this.A0b, this.A0P, this.A0O, this.A0J, this, activity, r37, this.A0j, this.A0W, this.A0X);
        }
        this.A01.A03(this.A02, z);
    }

    @OnLifecycleEvent(AnonymousClass0AV.ON_DESTROY)
    public void onDestroy() {
        2iS r0 = this.A01;
        if (r0 != null) {
            r0.A02();
        }
    }
}
