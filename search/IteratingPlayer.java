package com.whatsapp.search;

import X.3jD;
import X.AbstractC012606c;
import X.AbstractC05760Sl;
import X.AnonymousClass07S;
import X.AnonymousClass0AV;
import X.AnonymousClass0GR;
import X.AnonymousClass0GY;
import android.view.View;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.RunnableEBaseShape6S0100000_I0_6;

public class IteratingPlayer implements AnonymousClass0GY, AnonymousClass0GR {
    public int A00 = 0;
    public int A01 = 0;
    public int A02 = 0;
    public boolean A03;
    public final AbstractC012606c A04 = new 3jD(this);
    public final RecyclerView A05;
    public final AnonymousClass07S A06;
    public final Runnable A07 = new RunnableEBaseShape6S0100000_I0_6(this, 20);

    public IteratingPlayer(AnonymousClass07S r3, RecyclerView recyclerView) {
        this.A06 = r3;
        this.A05 = recyclerView;
    }

    public final void A00() {
        if (!this.A03) {
            this.A03 = true;
            AnonymousClass07S r0 = this.A06;
            r0.A02.postDelayed(this.A07, 2000);
        }
    }

    public final void A01() {
        this.A03 = false;
        AbstractC05760Sl r0 = (AbstractC05760Sl) this.A05.A0D(this.A00, false);
        if (r0 != null) {
            r0.A0G(false);
        }
        AnonymousClass07S r02 = this.A06;
        r02.A02.removeCallbacks(this.A07);
    }

    public final void A02() {
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.A05.A0S;
        if (linearLayoutManager == null) {
            A00();
            return;
        }
        this.A01 = linearLayoutManager.A1F();
        this.A02 = linearLayoutManager.A1H();
    }

    public final void A03(int i) {
        if (this.A01 > 0 || this.A02 > 0) {
            int i2 = this.A00;
            RecyclerView recyclerView = this.A05;
            AbstractC05760Sl r0 = (AbstractC05760Sl) recyclerView.A0D(i2, false);
            if (r0 != null) {
                r0.A0G(false);
            }
            int min = Math.min(Math.max(i, this.A01), this.A02);
            int i3 = min;
            while (true) {
                AbstractC05760Sl r02 = (AbstractC05760Sl) recyclerView.A0D(i3, false);
                if (r02 == null || !r02.A0H()) {
                    int i4 = i3 + 1;
                    int i5 = this.A02;
                    if (i4 > i5) {
                        i4 = this.A01;
                    }
                    if (min == i4 || i4 > i5 || i4 < this.A01) {
                        A01();
                    } else {
                        i3 = i4;
                    }
                } else {
                    AbstractC05760Sl r03 = (AbstractC05760Sl) recyclerView.A0D(i3, false);
                    if (r03 != null) {
                        r03.A0G(true);
                    }
                    this.A00 = i3;
                    return;
                }
            }
            A01();
            return;
        }
        A01();
    }

    @Override // X.AnonymousClass0GY
    public void AIy(View view) {
        A02();
        A00();
    }

    @Override // X.AnonymousClass0GY
    public void AIz(View view) {
        A02();
    }

    @OnLifecycleEvent(AnonymousClass0AV.ON_START)
    public void onStart() {
        A00();
    }

    @OnLifecycleEvent(AnonymousClass0AV.ON_STOP)
    public void onStop() {
        A01();
    }
}
