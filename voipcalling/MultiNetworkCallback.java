package com.whatsapp.voipcalling;

import X.2KX;
import X.3dE;
import com.facebook.redex.RunnableEBaseShape1S0110000_I1;

public class MultiNetworkCallback {
    public final 2KX provider;

    public MultiNetworkCallback(2KX r1) {
        this.provider = r1;
    }

    public void closeAlternativeSocket(boolean z) {
        2KX r0 = this.provider;
        r0.A06.execute(new RunnableEBaseShape1S0110000_I1(r0, z, 2));
    }

    public void createAlternativeSocket(boolean z, boolean z2) {
        2KX r0 = this.provider;
        r0.A06.execute(new 3dE(r0, z, z2));
    }
}
