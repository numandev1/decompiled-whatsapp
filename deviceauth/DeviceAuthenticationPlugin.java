package com.whatsapp.deviceauth;

import X.AnonymousClass0AV;
import X.AnonymousClass0GR;
import androidx.lifecycle.OnLifecycleEvent;

public abstract class DeviceAuthenticationPlugin implements AnonymousClass0GR {
    public abstract void A00();

    public abstract boolean A01();

    @OnLifecycleEvent(AnonymousClass0AV.ON_CREATE)
    public void onCreate() {
        if (A01()) {
            A00();
        }
    }
}
