package com.whatsapp.util.crash;

import X.1dW;
import X.1dX;
import X.1dY;
import X.AnonymousClass00O;
import X.AnonymousClass020;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.regex.Pattern;

public class SigquitBasedANRDetector {
    public static volatile SigquitBasedANRDetector A0B;
    public HandlerThread A00;
    public String A01;
    public Pattern A02;
    public Pattern A03;
    public final 1dW A04;
    public final 1dX A05;
    public final Object A06 = new Object();
    public final Object A07 = new Object();
    public volatile Handler A08;
    public volatile boolean A09;
    public volatile boolean A0A;

    public SigquitBasedANRDetector(AnonymousClass00O r3, 1dW r4, boolean z, int i, AnonymousClass020 r7) {
        1dX r0 = new 1dX(r3.A00, r7);
        this.A04 = r4;
        this.A05 = r0;
        init(this, z, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002b, code lost:
        if (r0.startsWith("0.") != false) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.whatsapp.util.crash.SigquitBasedANRDetector A00() {
        /*
            com.whatsapp.util.crash.SigquitBasedANRDetector r0 = com.whatsapp.util.crash.SigquitBasedANRDetector.A0B
            if (r0 != 0) goto L_0x003e
            java.lang.Class<com.whatsapp.util.crash.SigquitBasedANRDetector> r0 = com.whatsapp.util.crash.SigquitBasedANRDetector.class
            monitor-enter(r0)
            com.whatsapp.util.crash.SigquitBasedANRDetector r0 = com.whatsapp.util.crash.SigquitBasedANRDetector.A0B     // Catch:{ all -> 0x0041 }
            if (r0 != 0) goto L_0x003b
            X.00O r1 = X.AnonymousClass00O.A01     // Catch:{ all -> 0x0041 }
            X.1dW r2 = X.1dW.A00()     // Catch:{ all -> 0x0041 }
            X.C000700j.A00()     // Catch:{ all -> 0x0041 }
            java.lang.String r0 = "java.vm.version"
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch:{ all -> 0x0041 }
            if (r0 == 0) goto L_0x002d
            java.lang.String r3 = "1."
            boolean r3 = r0.startsWith(r3)     // Catch:{ all -> 0x0041 }
            if (r3 != 0) goto L_0x002d
            java.lang.String r3 = "0."
            boolean r0 = r0.startsWith(r3)     // Catch:{ all -> 0x0041 }
            r3 = 1
            if (r0 == 0) goto L_0x002e
        L_0x002d:
            r3 = 0
        L_0x002e:
            com.whatsapp.util.crash.SigquitBasedANRDetector r0 = new com.whatsapp.util.crash.SigquitBasedANRDetector     // Catch:{ all -> 0x0041 }
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0041 }
            X.020 r5 = X.AnonymousClass020.A00()     // Catch:{ all -> 0x0041 }
            r0.<init>(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x0041 }
            com.whatsapp.util.crash.SigquitBasedANRDetector.A0B = r0     // Catch:{ all -> 0x0041 }
        L_0x003b:
            java.lang.Class<com.whatsapp.util.crash.SigquitBasedANRDetector> r0 = com.whatsapp.util.crash.SigquitBasedANRDetector.class
            monitor-exit(r0)     // Catch:{ all -> 0x0041 }
        L_0x003e:
            com.whatsapp.util.crash.SigquitBasedANRDetector r0 = com.whatsapp.util.crash.SigquitBasedANRDetector.A0B
            return r0
        L_0x0041:
            r0 = move-exception
            java.lang.Class<com.whatsapp.util.crash.SigquitBasedANRDetector> r1 = com.whatsapp.util.crash.SigquitBasedANRDetector.class
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.crash.SigquitBasedANRDetector.A00():com.whatsapp.util.crash.SigquitBasedANRDetector");
    }

    public static native void init(SigquitBasedANRDetector sigquitBasedANRDetector, boolean z, int i);

    public static native boolean startDetector();

    public static native void stopDetector();

    public final void A01(File file) {
        int i;
        synchronized (this.A07) {
            1dX r0 = this.A05;
            synchronized (r0) {
                i = r0.A00;
            }
            if (i != 0) {
                r0.A00();
            }
            Log.i("SigquitBasedANRDetector/About to start process anr error monitor");
            r0.A02(new 1dY(this, file));
        }
    }

    public final void A02(String str, String str2) {
        Log.i("SigquitBasedANRDetector/processing ANR start");
        Log.i("SigquitBasedANRDetector/persisting ANR report start");
        if (str2 != null) {
            StringBuilder sb = new StringBuilder("  | detected using Sigquit based detector\n");
            sb.append(str2);
            str = str.replace(str2, sb.toString());
        }
        StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
        Exception exc = new Exception("ANR detected");
        exc.setStackTrace(stackTrace);
        Log.e("SigquitBasedANRDetector/Generating ANR Report", exc);
        try {
            File A022 = this.A04.A02(str);
            if (A022 != null) {
                A01(A022);
                Log.i("SigquitBasedANRDetector/processing ANR finish");
            }
        } catch (IOException e) {
            Log.e("SigquitBasedANRDetector/Error saving ANR report", e);
        }
        Log.e("SigquitBasedANRDetector/couldn't write ANR to file, aborting");
        Log.i("SigquitBasedANRDetector/abortANR");
        this.A09 = false;
        Log.i("SigquitBasedANRDetector/processing ANR finish");
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0055 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void anrDetected(java.lang.String r6) {
        /*
        // Method dump skipped, instructions count: 139
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.crash.SigquitBasedANRDetector.anrDetected(java.lang.String):void");
    }
}
