package com.whatsapp.util;

import X.AnonymousClass00C;
import X.AnonymousClass00E;
import X.AnonymousClass00G;
import X.AnonymousClass00H;
import X.AnonymousClass00W;
import X.C000600i;
import android.content.Context;
import com.whatsapp.voipcalling.Voip;
import java.util.Arrays;
import java.util.Map;

public class WhatsAppLibLoader {
    public static final String[] A07 = new String[0];
    public static final String[] A08 = {"vlc", "whatsapp", "curve25519"};
    public static volatile WhatsAppLibLoader A09;
    public Boolean A00 = null;
    public Map A01 = null;
    public final AnonymousClass00H A02;
    public final AnonymousClass00E A03;
    public final C000600i A04;
    public final AnonymousClass00G A05;
    public final AnonymousClass00W A06;

    public WhatsAppLibLoader(AnonymousClass00H r2, AnonymousClass00E r3, AnonymousClass00G r4, AnonymousClass00W r5, C000600i r6) {
        this.A02 = r2;
        this.A03 = r3;
        this.A05 = r4;
        this.A06 = r5;
        this.A04 = r6;
    }

    public static WhatsAppLibLoader A00() {
        if (A09 == null) {
            synchronized (WhatsAppLibLoader.class) {
                try {
                    if (A09 == null) {
                        A09 = new WhatsAppLibLoader(AnonymousClass00H.A00(), AnonymousClass00E.A00(), AnonymousClass00G.A00(), AnonymousClass00W.A00(), new C000600i());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return A09;
    }

    public static final boolean A01() {
        byte[] bArr = new byte[3];
        try {
            testLibraryUsable(bArr);
            if (!Arrays.equals(new byte[]{31, 41, 59}, bArr)) {
                Log.w("whatsapplibloader/usable test array does not match");
                return false;
            }
            try {
                String jNICodeVersion = getJNICodeVersion();
                StringBuilder sb = new StringBuilder();
                sb.append("whatsapplibloader/usable jniVersion: ");
                sb.append(jNICodeVersion);
                Log.i(sb.toString());
                if (!"2.21.12.20".equals(jNICodeVersion)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("whatsapplibloader/usable version does not match. JAVA version: ");
                    sb2.append("2.21.12.20");
                    sb2.append(", JNI version: ");
                    sb2.append(jNICodeVersion);
                    Log.w(sb2.toString());
                    return false;
                }
                try {
                    Voip.getCallInfo();
                    Log.i("whatsapplibloader/usable isLibraryUsable: True");
                    return true;
                } catch (UnsatisfiedLinkError e) {
                    Log.w("whatsapplibloader/usable error while testing library usability getCallInfo", e);
                    return false;
                }
            } catch (UnsatisfiedLinkError e2) {
                Log.w("whatsapplibloader/usable error while testing library usability getJNICodeVersion", e2);
                return false;
            }
        } catch (UnsatisfiedLinkError e3) {
            Log.w("whatsapplibloader/usable error while testing library usability testLibraryUsable", e3);
            return false;
        }
    }

    public static native String getJNICodeVersion();

    public static native void testLibraryUsable(byte[] bArr);

    public final void A02(Context context, String str) {
        AnonymousClass00C.A16("whatsapplibloader/system-load-library-with-install start, loading: ", str);
        try {
            if (this.A04 != null) {
                System.loadLibrary(str);
                Log.i("whatsapplibloader/system-load-library-with-install end");
                return;
            }
            throw null;
        } catch (UnsatisfiedLinkError e) {
            Log.w("whatsapplibloader/system-load-library-with-install error", e);
            A03(context, Arrays.asList(str));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a7, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00fb, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00ff, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0102, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0103, code lost:
        if (r8 != null) goto L_0x0105;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0108, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(android.content.Context r12, java.util.List r13) {
        /*
        // Method dump skipped, instructions count: 487
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.WhatsAppLibLoader.A03(android.content.Context, java.util.List):void");
    }

    public boolean A04() {
        boolean z;
        synchronized (this) {
            if (this.A00 == null) {
                Log.e("whatsapplibloader/is-loaded: isLoaded() was called before load was attempted");
            }
            z = false;
            if (this.A00 == Boolean.TRUE) {
                z = true;
            }
        }
        return z;
    }
}
