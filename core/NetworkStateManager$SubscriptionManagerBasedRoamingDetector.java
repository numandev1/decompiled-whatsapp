package com.whatsapp.core;

import X.AnonymousClass020;
import android.telephony.SubscriptionManager;
import android.util.Pair;

public class NetworkStateManager$SubscriptionManagerBasedRoamingDetector {
    public static Pair determineNetworkStateUsingSubscriptionManager(AnonymousClass020 r3, boolean z) {
        int defaultDataSubscriptionId;
        SubscriptionManager A0J = r3.A0J();
        if (A0J == null || (defaultDataSubscriptionId = SubscriptionManager.getDefaultDataSubscriptionId()) == -1) {
            return new Pair(Boolean.FALSE, 0);
        }
        boolean isNetworkRoaming = A0J.isNetworkRoaming(defaultDataSubscriptionId);
        Boolean bool = Boolean.TRUE;
        return isNetworkRoaming ? new Pair(bool, 3) : new Pair(bool, 2);
    }
}
