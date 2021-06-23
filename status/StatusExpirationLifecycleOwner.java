package com.whatsapp.status;

import X.1i2;
import X.24f;
import X.AnonymousClass01O;
import X.AnonymousClass07S;
import X.AnonymousClass09P;
import X.AnonymousClass0AV;
import X.AnonymousClass0GR;
import androidx.lifecycle.OnLifecycleEvent;
import com.facebook.redex.RunnableEBaseShape6S0100000_I0_6;

public class StatusExpirationLifecycleOwner implements AnonymousClass0GR {
    public final AnonymousClass07S A00;
    public final 24f A01;
    public final 1i2 A02;
    public final AnonymousClass01O A03;
    public final Runnable A04 = new RunnableEBaseShape6S0100000_I0_6(this, 46);

    public StatusExpirationLifecycleOwner(AnonymousClass09P r3, AnonymousClass07S r4, AnonymousClass01O r5, 1i2 r6, 24f r7) {
        this.A00 = r4;
        this.A03 = r5;
        this.A02 = r6;
        this.A01 = r7;
        r3.ABB().A02(this);
    }

    public void A00() {
        AnonymousClass07S r0 = this.A00;
        r0.A02.removeCallbacks(this.A04);
        this.A03.ASf(new RunnableEBaseShape6S0100000_I0_6(this, 43));
    }

    @OnLifecycleEvent(AnonymousClass0AV.ON_DESTROY)
    public void onDestroy() {
        AnonymousClass07S r0 = this.A00;
        r0.A02.removeCallbacks(this.A04);
    }

    @OnLifecycleEvent(AnonymousClass0AV.ON_START)
    public void onStart() {
        A00();
    }
}
