package com.whatsapp.wamsys;

import X.AbstractC03580Hr;
import X.AbstractC15320oI;
import X.AbstractC15340oK;
import X.AbstractC15350oL;
import X.AnonymousClass00C;
import X.AnonymousClass00H;
import X.AnonymousClass00b;
import X.AnonymousClass00f;
import X.AnonymousClass00x;
import X.AnonymousClass01M;
import X.AnonymousClass04F;
import X.AnonymousClass04Y;
import X.AnonymousClass04Z;
import X.AnonymousClass04b;
import X.AnonymousClass094;
import X.AnonymousClass0B0;
import X.AnonymousClass0B1;
import X.AnonymousClass0B4;
import X.AnonymousClass0B9;
import X.AnonymousClass0BD;
import X.AnonymousClass0BZ;
import X.AnonymousClass0H2;
import X.AnonymousClass0QV;
import X.AnonymousClass0ZD;
import X.AnonymousClass0ZE;
import X.AnonymousClass1D0;
import X.AnonymousClass1D1;
import X.AnonymousClass1D2;
import X.AnonymousClass1Et;
import X.C000900m;
import X.C001000n;
import X.C001200p;
import X.C001300q;
import X.C001500s;
import X.C001700u;
import X.C001800w;
import X.C001900y;
import X.C002000z;
import X.C02390Bi;
import X.C05350Qd;
import X.C07360aO;
import X.C07370aP;
import X.C15330oJ;
import X.C15390oP;
import X.C15400oQ;
import X.C15430oT;
import X.C25211Er;
import X.RunnableC24861De;
import X.RunnableC24881Dg;
import android.text.TextUtils;
import com.facebook.simplejni.NativeHolder;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.search.verification.api.ISearchActionVerificationService;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

public class JniBridge {
    public static volatile JniBridge INSTANCE;
    public final AnonymousClass04F jniBridgeExceptionHandler;
    public C000900m jniCallbacks = null;
    public final AtomicReference wajContext = new AtomicReference();

    public JniBridge(AnonymousClass04F r2) {
        this.jniBridgeExceptionHandler = r2;
    }

    public static JniBridge getInstance() {
        if (INSTANCE == null) {
            synchronized (JniBridge.class) {
                try {
                    if (INSTANCE == null) {
                        if (AnonymousClass04F.A01 == null) {
                            synchronized (AnonymousClass04F.class) {
                                try {
                                    if (AnonymousClass04F.A01 == null) {
                                        AnonymousClass04F.A01 = new AnonymousClass04F(AnonymousClass00H.A00());
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                        INSTANCE = new JniBridge(AnonymousClass04F.A01);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return INSTANCE;
    }

    public static long jnidispatchI(int i) {
        if (i == 0) {
            return INSTANCE.jniCallbacks.A0A.A05() / 1000;
        }
        if (i != 1) {
            return 0;
        }
        try {
            if (INSTANCE.jniCallbacks != null) {
                return 0;
            }
            throw null;
        } catch (Exception e) {
            INSTANCE.jniBridgeExceptionHandler.A00(e);
            return 0;
        }
    }

    public static long jnidispatchIIIIIIIIIIIIIIIOOOOOOOO(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        int i = (int) j;
        int i2 = (int) j2;
        int i3 = (int) j3;
        try {
            String str = (String) obj;
            int i4 = (int) j4;
            int i5 = (int) j5;
            String str2 = (String) obj2;
            String str3 = (String) obj3;
            boolean z = false;
            if (0 != j13) {
                z = true;
            }
            int i6 = (int) j6;
            String str4 = (String) obj4;
            String str5 = (String) obj5;
            String str6 = (String) obj6;
            boolean z2 = false;
            if (0 != j14) {
                z2 = true;
            }
            ((AbstractC15320oI) obj8).A02(i, i2, i3, str, j7, i4, i5, j8, j9, j10, str2, str3, j11, j12, z, i6, str4, str5, str6, z2, (String) obj7);
            return 0;
        } catch (Exception e) {
            INSTANCE.jniBridgeExceptionHandler.A00(e);
            return 0;
        }
    }

    public static long jnidispatchIIIIIIIIIIIIOOOOOOOOOO(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        int i = (int) j;
        int i2 = (int) j2;
        int i3 = (int) j3;
        try {
            String str = (String) obj;
            int i4 = (int) j4;
            String str2 = (String) obj2;
            String str3 = (String) obj3;
            boolean z = false;
            if (0 != j10) {
                z = true;
            }
            int i5 = (int) j5;
            String str4 = (String) obj4;
            String str5 = (String) obj5;
            String str6 = (String) obj6;
            String str7 = (String) obj7;
            String str8 = (String) obj8;
            boolean z2 = false;
            if (0 != j11) {
                z2 = true;
            }
            ((AbstractC15320oI) obj10).A01(i, i2, i3, str, i4, j6, str2, str3, j7, j8, j9, z, i5, str4, str5, str6, str7, str8, z2, (String) obj9);
            return 0;
        } catch (Exception e) {
            INSTANCE.jniBridgeExceptionHandler.A00(e);
            return 0;
        }
    }

    public static long jnidispatchIIIIIIIIIIIOOOOOOOOOO(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        int i = (int) j;
        int i2 = (int) j2;
        try {
            String str = (String) obj;
            int i3 = (int) j3;
            String str2 = (String) obj2;
            String str3 = (String) obj3;
            String str4 = (String) obj4;
            String str5 = (String) obj5;
            int i4 = (int) j4;
            int i5 = (int) j5;
            String str6 = (String) obj6;
            String str7 = (String) obj7;
            String str8 = (String) obj8;
            boolean z = false;
            if (0 != j10) {
                z = true;
            }
            ((AbstractC15320oI) obj10).A04(i, i2, str, i3, j6, str2, str3, j7, j8, str4, str5, j9, i4, i5, str6, str7, str8, z, (String) obj9);
            return 0;
        } catch (Exception e) {
            INSTANCE.jniBridgeExceptionHandler.A00(e);
            return 0;
        }
    }

    public static long jnidispatchIIIIIIIOOOOOOOOOO(long j, long j2, long j3, long j4, long j5, long j6, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        int i = (int) j;
        int i2 = (int) j2;
        int i3 = (int) j3;
        try {
            String str = (String) obj;
            String str2 = (String) obj2;
            String str3 = (String) obj3;
            String str4 = (String) obj4;
            String str5 = (String) obj5;
            String str6 = (String) obj6;
            String str7 = (String) obj7;
            String str8 = (String) obj8;
            boolean z = false;
            if (0 != j6) {
                z = true;
            }
            ((AbstractC15320oI) obj10).A03(i, i2, i3, str, j4, str2, str3, j5, str4, str5, str6, str7, str8, z, (String) obj9);
            return 0;
        } catch (Exception e) {
            INSTANCE.jniBridgeExceptionHandler.A00(e);
            return 0;
        }
    }

    public static long jnidispatchIIIIIIO(long j, long j2, long j3, long j4, long j5, Object obj) {
        try {
            C000900m r2 = INSTANCE.jniCallbacks;
            int i = (int) j;
            byte[] bArr = (byte[]) obj;
            int i2 = (int) j2;
            int i3 = (int) j3;
            int i4 = (int) j4;
            int i5 = (int) j5;
            if (r2 != null) {
                AnonymousClass00f r9 = new AnonymousClass00f(i3, i4, i5);
                AnonymousClass00b r3 = r2.A0C;
                Integer A02 = r3.A02(i, r9, false);
                if (A02 != null) {
                    int intValue = A02.intValue();
                    if (i2 != 2) {
                        r3.A0F.A01.execute(new RunnableC24861De(r3, i2, i, bArr, intValue));
                        return 0;
                    } else if (r3.A0K) {
                        r3.A0F.A02.execute(new RunnableC24881Dg(r3, i, bArr, intValue));
                        return 0;
                    }
                }
                return 0;
            }
            throw null;
        } catch (Exception e) {
            INSTANCE.jniBridgeExceptionHandler.A00(e);
            return 0;
        }
    }

    public static long jnidispatchIIIIO(int i, long j, long j2, long j3, Object obj) {
        if (i == 0) {
            ((AbstractC15350oL) obj).ARX(j, j2, j3);
            return 0;
        } else if (i != 1) {
            return 0;
        } else {
            try {
                ((AbstractC15340oK) obj).ARX(j, j2, j3);
                return 0;
            } catch (Exception e) {
                INSTANCE.jniBridgeExceptionHandler.A00(e);
                return 0;
            }
        }
    }

    public static long jnidispatchIIIO(long j, long j2, Object obj) {
        try {
            ((AbstractC15320oI) obj).A00((int) j, (int) j2);
        } catch (Exception e) {
            INSTANCE.jniBridgeExceptionHandler.A00(e);
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0084, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0085, code lost:
        if (r0 != null) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008a, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x008d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0091, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ec, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00f0, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0153, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0154, code lost:
        if (r1 != null) goto L_0x0156;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0159, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x015c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0160, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long jnidispatchIIO(int r9, long r10, java.lang.Object r12) {
        /*
        // Method dump skipped, instructions count: 404
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wamsys.JniBridge.jnidispatchIIO(int, long, java.lang.Object):long");
    }

    public static long jnidispatchIIOO(int i, long j, Object obj, Object obj2) {
        if (i == 0) {
            int i2 = (int) j;
            byte[] bArr = (byte[]) obj2;
            C001900y r0 = INSTANCE.getJniCallbacks((NativeHolder) obj).A09;
            if (r0 == null) {
                throw null;
            } else if (bArr == null || bArr.length <= 0) {
                return 0;
            } else {
                r0.A00.A0D.A00(i2, bArr);
                return 1;
            }
        } else if (i == 1) {
            int i3 = (int) j;
            C001300q r5 = INSTANCE.getJniCallbacks((NativeHolder) obj).A0B;
            r5.A0I.A00();
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : ((Map) obj2).entrySet()) {
                arrayList.add(new AnonymousClass0H2(((Integer) entry.getKey()).intValue(), (byte[]) entry.getValue()));
            }
            r5.A0S(arrayList, (i3 % 16777214) + 1);
            return 0;
        } else if (i == 2) {
            List list = (List) obj2;
            C001200p r6 = INSTANCE.getJniCallbacks((NativeHolder) obj).A05;
            if (r6 != null) {
                int[] iArr = new int[list.size()];
                for (int i4 = 0; i4 < list.size(); i4++) {
                    iArr[i4] = ((Integer) list.get(i4)).intValue();
                }
                r6.A00.A0A.A03(iArr);
                return 1;
            }
            throw null;
        } else if (i == 3) {
            C001700u r02 = INSTANCE.getJniCallbacks((NativeHolder) obj2).A08;
            AnonymousClass0B1 r62 = new AnonymousClass0B1((String) obj, (int) j);
            AnonymousClass04Z r03 = r02.A00.A0C;
            byte[] A03 = r03.A03(r62);
            if (A03 != null) {
                try {
                    C001300q.A02(new AnonymousClass0QV(A03));
                    return 1;
                } catch (IOException e) {
                    r03.A01(r62);
                }
            }
            return 0;
        } else if (i != 4) {
            return 0;
        } else {
            try {
                C001700u r04 = INSTANCE.getJniCallbacks((NativeHolder) obj2).A08;
                r04.A00.A0C.A01(new AnonymousClass0B1((String) obj, (int) j));
                return 1;
            } catch (Exception e2) {
                INSTANCE.jniBridgeExceptionHandler.A00(e2);
                return 0;
            }
        }
    }

    public static long jnidispatchIIOOO(int i, long j, Object obj, Object obj2, Object obj3) {
        if (i != 0) {
            if (i == 1) {
                byte[] bArr = (byte[]) obj3;
                AnonymousClass00x r4 = INSTANCE.getJniCallbacks((NativeHolder) obj2).A04;
                AnonymousClass0B1 r6 = new AnonymousClass0B1((String) obj, (int) j);
                if (bArr == null) {
                    r4.A00.A0K(r6);
                } else {
                    try {
                        r4.A00.A0L(r6, new C02390Bi(AnonymousClass01M.A0L(bArr)));
                    } catch (AnonymousClass0B0 e) {
                        Log.e("IdentityKeyStoreImpl/Could not save the identity key.", e);
                        return 0;
                    }
                }
                return 1;
            } else if (i == 2) {
                INSTANCE.getJniCallbacks((NativeHolder) obj2);
                AnonymousClass04b.A00(new AnonymousClass0B1((String) obj, (int) j));
                return 1;
            } else if (i != 3) {
                return 0;
            } else {
                try {
                    String str = (String) obj;
                    int i2 = (int) j;
                    byte[] bArr2 = (byte[]) obj3;
                    C001700u r42 = INSTANCE.getJniCallbacks((NativeHolder) obj2).A08;
                    try {
                        C001300q.A02(new AnonymousClass0QV(bArr2));
                        r42.A00.A0C.A02(new AnonymousClass0B1(str, i2), bArr2);
                        return 1;
                    } catch (IOException e2) {
                        Log.e("sessionStoreImpl/invalid-session-record", e2);
                        return 0;
                    }
                } catch (Exception e3) {
                    INSTANCE.jniBridgeExceptionHandler.A00(e3);
                    return 0;
                }
            }
        } else if (INSTANCE.getJniCallbacks((NativeHolder) obj).A04 != null) {
            return 0;
        } else {
            throw null;
        }
    }

    public static long jnidispatchIIOOOO(int i, long j, Object obj, Object obj2, Object obj3, Object obj4) {
        if (i == 0) {
            byte[] bArr = (byte[]) obj4;
            C001800w r4 = INSTANCE.getJniCallbacks((NativeHolder) obj3).A07;
            AnonymousClass0B4 r6 = new AnonymousClass0B4((String) obj, new AnonymousClass0B1((String) obj2, (int) j));
            C001300q r42 = r4.A00;
            if (bArr == null) {
                r42.A0P(r6);
                return 1;
            }
            r42.A0R(r6, bArr);
            return 1;
        } else if (i != 1) {
            return 0;
        } else {
            try {
                byte[] bArr2 = (byte[]) obj4;
                C002000z r43 = INSTANCE.getJniCallbacks((NativeHolder) obj3).A03;
                AnonymousClass0B4 r62 = new AnonymousClass0B4((String) obj, new AnonymousClass0B1((String) obj2, (int) j));
                C001300q r44 = r43.A00;
                if (bArr2 == null) {
                    r44.A0O(r62);
                    return 1;
                }
                r44.A0Q(r62, bArr2);
                return 1;
            } catch (Exception e) {
                INSTANCE.jniBridgeExceptionHandler.A00(e);
                return 0;
            }
        }
    }

    public static long jnidispatchIIOOOOOOOOO(long j, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        try {
            ((AbstractC15350oL) obj3).A6Y((int) j, (String) obj, (String) obj2, (byte[]) obj4, (byte[]) obj5, (byte[]) obj6, (byte[]) obj7, (byte[]) obj8, (byte[]) obj9);
            return 0;
        } catch (Exception e) {
            INSTANCE.jniBridgeExceptionHandler.A00(e);
            return 0;
        }
    }

    public static long jnidispatchIO(int i, Object obj) {
        switch (i) {
            case 0:
                try {
                    if (INSTANCE.jniCallbacks != null) {
                        return 0;
                    }
                    throw null;
                } catch (Exception e) {
                    INSTANCE.jniBridgeExceptionHandler.A00(e);
                    return 0;
                }
            case 1:
                return ((AbstractC15350oL) obj).AFQ() ? 1 : 0;
            case ISearchActionVerificationService.Stub.TRANSACTION_getVersion:
                return ((AbstractC15340oK) obj).AFQ() ? 1 : 0;
            case ModuleDescriptor.MODULE_VERSION:
                return (long) INSTANCE.getJniCallbacks((NativeHolder) obj).A04.A00.A08.A02();
            case 4:
                return (long) INSTANCE.getJniCallbacks((NativeHolder) obj).A09.A00.A0C().A00.A01;
            case 5:
                return (long) INSTANCE.getJniCallbacks((NativeHolder) obj).A05.A00.A0A.A00();
            case 6:
                return (long) INSTANCE.getJniCallbacks((NativeHolder) obj).A05.A00.A08.A01();
            case 7:
                return (long) INSTANCE.jniCallbacks.A0D.getTypeFromKeyValue(obj);
            default:
                return 0;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0059, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005d, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long jnidispatchIOO(int r10, java.lang.Object r11, java.lang.Object r12) {
        /*
        // Method dump skipped, instructions count: 122
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wamsys.JniBridge.jnidispatchIOO(int, java.lang.Object, java.lang.Object):long");
    }

    public static long jnidispatchIOOO(Object obj, Object obj2, Object obj3) {
        try {
            byte[] bArr = (byte[]) obj3;
            AbstractC03580Hr r4 = (AbstractC03580Hr) obj;
            INSTANCE.getJniCallbacks((NativeHolder) obj2).A01.A00.A0I.A00();
            if (r4 == null) {
                return 0;
            }
            r4.AEY(bArr);
            return 1;
        } catch (Exception e) {
            INSTANCE.jniBridgeExceptionHandler.A00(e);
            return 0;
        }
    }

    public static Object jnidispatchOI(long j) {
        try {
            int i = (int) j;
            if (INSTANCE.jniCallbacks.A06 != null) {
                try {
                    byte[] bArr = new byte[i];
                    SecureRandom.getInstance("SHA1PRNG").nextBytes(bArr);
                    return bArr;
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            } else {
                throw null;
            }
        } catch (Exception e2) {
            INSTANCE.jniBridgeExceptionHandler.A00(e2);
            return null;
        }
    }

    public static Object jnidispatchOIO(int i, long j, Object obj) {
        if (i == 0) {
            int i2 = (int) j;
            byte[] A01 = INSTANCE.getJniCallbacks((NativeHolder) obj).A09.A00.A0D.A01(i2);
            if (A01 == null) {
                AnonymousClass00C.A0r("no signed prekey available with id ", i2);
                return null;
            }
            try {
                StringBuilder sb = new StringBuilder();
                sb.append("axolotl loaded a signed pre key with id ");
                sb.append(i2);
                Log.i(sb.toString());
                AnonymousClass094.A03(AnonymousClass0B9.A06, A01);
                return A01;
            } catch (IOException e) {
                StringBuilder sb2 = new StringBuilder("failed to parse signed pre key record during load for id ");
                sb2.append(i2);
                Log.e(sb2.toString(), e);
                return null;
            }
        } else if (i == 1) {
            int i3 = (int) j;
            AnonymousClass04Y r3 = INSTANCE.getJniCallbacks((NativeHolder) obj).A05.A00.A0A;
            byte[] A05 = r3.A05(i3);
            if (A05 == null) {
                return null;
            }
            try {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("axolotl found a pre key with id ");
                sb3.append(i3);
                Log.i(sb3.toString());
                C001300q.A01(i3, A05);
                return A05;
            } catch (IOException e2) {
                StringBuilder sb4 = new StringBuilder("error reading prekey ");
                sb4.append(i3);
                sb4.append("; deleting");
                Log.e(sb4.toString(), e2);
                r3.A02(i3);
                return null;
            }
        } else if (i != 2) {
            return null;
        } else {
            try {
                int i4 = (int) j;
                C001200p r0 = INSTANCE.getJniCallbacks((NativeHolder) obj).A05;
                if (i4 <= 0) {
                    return null;
                }
                List A012 = r0.A00.A0A.A01();
                HashMap hashMap = new HashMap();
                Iterator it = ((ArrayList) A012).iterator();
                while (it.hasNext()) {
                    AnonymousClass0H2 r02 = (AnonymousClass0H2) it.next();
                    hashMap.put(Integer.valueOf(r02.A00), r02.A01);
                    if (hashMap.size() == i4) {
                        return hashMap;
                    }
                }
                return hashMap;
            } catch (Exception e3) {
                INSTANCE.jniBridgeExceptionHandler.A00(e3);
                return null;
            }
        }
    }

    public static Object jnidispatchOIOO(int i, long j, Object obj, Object obj2) {
        if (i == 0) {
            C15330oJ AGX = ((AnonymousClass0BD) obj2).AGX((String) obj, (int) j);
            if (AGX != null) {
                return AGX.A00;
            }
            return null;
        } else if (i == 1) {
            AnonymousClass00x r1 = INSTANCE.getJniCallbacks((NativeHolder) obj2).A04;
            C02390Bi A0A = r1.A00.A0A(new AnonymousClass0B1((String) obj, (int) j));
            if (A0A != null) {
                return A0A.A00.A00();
            }
            return null;
        } else if (i != 2) {
            return null;
        } else {
            try {
                C001700u r12 = INSTANCE.getJniCallbacks((NativeHolder) obj2).A08;
                AnonymousClass0B1 r3 = new AnonymousClass0B1((String) obj, (int) j);
                AnonymousClass04Z r2 = r12.A00.A0C;
                byte[] A03 = r2.A03(r3);
                if (A03 == null) {
                    return null;
                }
                try {
                    C001300q.A02(new AnonymousClass0QV(A03));
                    return A03;
                } catch (IOException e) {
                    r2.A01(r3);
                    return null;
                }
            } catch (Exception e2) {
                INSTANCE.jniBridgeExceptionHandler.A00(e2);
                return null;
            }
        }
    }

    public static Object jnidispatchOIOOO(int i, long j, Object obj, Object obj2, Object obj3) {
        C15430oT r0;
        C15390oP r02;
        if (i == 0) {
            AnonymousClass1D2 A00 = INSTANCE.getJniCallbacks((NativeHolder) obj3).A07.A00.A0B.A00(new AnonymousClass0B4((String) obj, new AnonymousClass0B1((String) obj2, (int) j)));
            if (A00 != null) {
                try {
                    byte[] bArr = A00.A01;
                    LinkedList linkedList = new LinkedList();
                    for (AnonymousClass0ZD r03 : ((AnonymousClass0ZE) AnonymousClass094.A03(AnonymousClass0ZE.A01, bArr)).A00) {
                        linkedList.add(new AnonymousClass1Et(r03));
                    }
                    r0 = new C15430oT(bArr, A00.A00);
                } catch (IOException e) {
                    Log.e("SenderKeyStoreImpl/loadSenderKeyImpl", e);
                    r0 = null;
                }
            } else {
                r0 = null;
            }
            if (r0 != null) {
                return r0.A00;
            }
            return null;
        } else if (i == 1) {
            AnonymousClass1D0 A002 = INSTANCE.getJniCallbacks((NativeHolder) obj3).A03.A00.A07.A00(new AnonymousClass0B4((String) obj, new AnonymousClass0B1((String) obj2, (int) j)));
            if (A002 != null) {
                try {
                    byte[] bArr2 = A002.A01;
                    LinkedList linkedList2 = new LinkedList();
                    for (C07360aO r04 : ((C07370aP) AnonymousClass094.A03(C07370aP.A01, bArr2)).A00) {
                        linkedList2.add(new C25211Er(r04));
                    }
                    r02 = new C15390oP(bArr2, A002.A00);
                } catch (IOException e2) {
                    Log.e("FastRatchetSenderKeyStoreImpl/loadFastRatchetSenderKeyImpl", e2);
                    r02 = null;
                }
            } else {
                r02 = null;
            }
            if (r02 != null) {
                return r02.A00;
            }
            return null;
        } else if (i != 2) {
            return null;
        } else {
            try {
                return INSTANCE.jniCallbacks.A0D.createKeyValue((String) obj, (String) obj2, obj3, (byte) ((int) j));
            } catch (Exception e3) {
                INSTANCE.jniBridgeExceptionHandler.A00(e3);
                return null;
            }
        }
    }

    public static Object jnidispatchOO(int i, Object obj) {
        C05350Qd r1;
        switch (i) {
            case 0:
                String str = (String) obj;
                C001000n r12 = INSTANCE.jniCallbacks.A02;
                if (TextUtils.isEmpty(str)) {
                    return null;
                }
                try {
                    InetAddress[] inetAddressArr = r12.A00.A01(str).A04;
                    Arrays.toString(inetAddressArr);
                    ArrayList arrayList = new ArrayList();
                    for (InetAddress inetAddress : inetAddressArr) {
                        arrayList.add(inetAddress.getHostAddress());
                    }
                    return arrayList;
                } catch (UnknownHostException e) {
                    return null;
                }
            case 1:
                C001500s r2 = INSTANCE.getJniCallbacks((NativeHolder) obj).A00.A00;
                synchronized (r2) {
                    r1 = r2.A02().A01;
                    if (r1 == null) {
                        throw new RuntimeException("AuthKeyStore/failed to get client static key pair");
                    }
                }
                byte[] bArr = r1.A01.A01;
                int length = bArr.length;
                if (length == 32) {
                    return bArr;
                }
                AnonymousClass00C.A1I(AnonymousClass00C.A0R("AuthKeyStoreImpl/the key length is not expected/privateLength="), length);
                return null;
            case ISearchActionVerificationService.Stub.TRANSACTION_getVersion:
                if (INSTANCE.jniCallbacks != null) {
                    AnonymousClass1D1 A03 = INSTANCE.getJniCallbacks((NativeHolder) obj).A04.A00.A08.A03();
                    return new C15400oQ(A03.A01, A03.A00).A00;
                }
                throw null;
            case ModuleDescriptor.MODULE_VERSION:
                return INSTANCE.getJniCallbacks((NativeHolder) obj).A09.A00.A0C().A00.A0B();
            case 4:
                return INSTANCE.jniCallbacks.A0D.getTagFromProtocolTreeNode(obj);
            case 5:
                Object[] attributesFromProtocolTreeNode = INSTANCE.jniCallbacks.A0D.getAttributesFromProtocolTreeNode(obj);
                if (attributesFromProtocolTreeNode != null) {
                    return Arrays.asList(attributesFromProtocolTreeNode);
                }
                return null;
            case 6:
                Object[] childrenFromProtocolTreeNode = INSTANCE.jniCallbacks.A0D.getChildrenFromProtocolTreeNode(obj);
                if (childrenFromProtocolTreeNode != null) {
                    return Arrays.asList(childrenFromProtocolTreeNode);
                }
                return null;
            case 7:
                return INSTANCE.jniCallbacks.A0D.getDataFromProtocolTreeNode(obj);
            case AnonymousClass0BZ.A00:
                return INSTANCE.jniCallbacks.A0D.getKeyFromKeyValue(obj);
            case 9:
                try {
                    return INSTANCE.jniCallbacks.A0D.getValueStringFromKeyValue(obj);
                } catch (Exception e2) {
                    INSTANCE.jniBridgeExceptionHandler.A00(e2);
                    return null;
                }
            case 10:
                return INSTANCE.jniCallbacks.A0D.createNewJid((String) obj);
            default:
                return null;
        }
    }

    public static Object jnidispatchOOO(Object obj, Object obj2) {
        try {
            Map map = (Map) obj2;
            C001700u r2 = INSTANCE.getJniCallbacks((NativeHolder) obj).A08;
            if (map == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Integer num : map.keySet()) {
                int intValue = num.intValue();
                Object obj3 = map.get(Integer.valueOf(intValue));
                if (obj3 != null) {
                    arrayList.add(new AnonymousClass0B1((String) obj3, intValue));
                } else {
                    throw null;
                }
            }
            Set A0G = r2.A00.A0G(arrayList);
            HashMap hashMap = new HashMap();
            Iterator it = ((HashSet) A0G).iterator();
            while (it.hasNext()) {
                AnonymousClass0B1 r0 = (AnonymousClass0B1) it.next();
                hashMap.put(Integer.valueOf(r0.A00), r0.A01);
            }
            return hashMap;
        } catch (Exception e) {
            INSTANCE.jniBridgeExceptionHandler.A00(e);
            return null;
        }
    }

    public static Object jnidispatchOOOOO(Object obj, Object obj2, Object obj3, Object obj4) {
        try {
            List list = (List) obj3;
            List list2 = (List) obj4;
            return INSTANCE.jniCallbacks.A0D.createProtocolTreeNode((String) obj, list != null ? list.toArray() : null, list2 != null ? list2.toArray() : null, (byte[]) obj2);
        } catch (Exception e) {
            INSTANCE.jniBridgeExceptionHandler.A00(e);
            return null;
        }
    }

    public static native double jvidispatchDIO(int i, long j, Object obj);

    public static native long jvidispatchI();

    public static native long jvidispatchIIDO(int i, long j, double d, Object obj);

    public static native long jvidispatchIIIIIIOOOOOOO(long j, long j2, long j3, long j4, long j5, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7);

    public static native long jvidispatchIIIIIOOOO(long j, long j2, long j3, long j4, Object obj, Object obj2, Object obj3, Object obj4);

    public static native long jvidispatchIIIIOOOOOOOOO(long j, long j2, long j3, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9);

    public static native long jvidispatchIIIO(int i, long j, long j2, Object obj);

    public static native long jvidispatchIIIOO(long j, long j2, Object obj, Object obj2);

    public static native long jvidispatchIIO(int i, long j, Object obj);

    public static native long jvidispatchIIOO(int i, long j, Object obj, Object obj2);

    public static native long jvidispatchIIOOOO(int i, long j, Object obj, Object obj2, Object obj3, Object obj4);

    public static native long jvidispatchIIOOOOO(long j, Object obj, Object obj2, Object obj3, Object obj4, Object obj5);

    public static native long jvidispatchIIOOOOOOOO(long j, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8);

    public static native long jvidispatchIO(int i, Object obj);

    public static native long jvidispatchIOO(Object obj, Object obj2);

    public static native long jvidispatchIOOO(Object obj, Object obj2, Object obj3);

    public static native long jvidispatchIOOOOOOO(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7);

    public static native long jvidispatchIOOOOOOOO(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8);

    public static native long jvidispatchIOOOOOOOOO(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9);

    public static native Object jvidispatchO();

    public static native Object jvidispatchOII(long j, long j2);

    public static native Object jvidispatchOIIIIIIOOO(long j, long j2, long j3, long j4, long j5, long j6, Object obj, Object obj2, Object obj3);

    public static native Object jvidispatchOIIIOOOO(long j, long j2, long j3, Object obj, Object obj2, Object obj3, Object obj4);

    public static native Object jvidispatchOIIIOOOOO(long j, long j2, long j3, Object obj, Object obj2, Object obj3, Object obj4, Object obj5);

    public static native Object jvidispatchOIIO(int i, long j, long j2, Object obj);

    public static native Object jvidispatchOIIOO(long j, long j2, Object obj, Object obj2);

    public static native Object jvidispatchOIO(int i, long j, Object obj);

    public static native Object jvidispatchOIOO(int i, long j, Object obj, Object obj2);

    public static native Object jvidispatchOIOOO(int i, long j, Object obj, Object obj2, Object obj3);

    public static native Object jvidispatchOIOOOO(int i, long j, Object obj, Object obj2, Object obj3, Object obj4);

    public static native Object jvidispatchOIOOOOO(int i, long j, Object obj, Object obj2, Object obj3, Object obj4, Object obj5);

    public static native Object jvidispatchOO(int i, Object obj);

    public static native Object jvidispatchOOO(int i, Object obj, Object obj2);

    public static native Object jvidispatchOOOO(int i, Object obj, Object obj2, Object obj3);

    public static native Object jvidispatchOOOOO(int i, Object obj, Object obj2, Object obj3, Object obj4);

    public static native Object jvidispatchOOOOOO(Object obj, Object obj2, Object obj3, Object obj4, Object obj5);

    public static native Object jvidispatchOOOOOOO(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6);

    public C000900m getJniCallbacks(NativeHolder nativeHolder) {
        NativeHolder wajContext2 = getWajContext();
        if (wajContext2 == null || nativeHolder == null || wajContext2.isNativeEqual(nativeHolder) || this.jniCallbacks != null) {
            return this.jniCallbacks;
        }
        throw null;
    }

    public NativeHolder getWajContext() {
        return (NativeHolder) this.wajContext.get();
    }

    public byte[] modelGetByteArray(NativeHolder nativeHolder, int i) {
        return (byte[]) jvidispatchOIO(0, (long) i, nativeHolder);
    }

    public int modelGetInt(NativeHolder nativeHolder, int i) {
        return (int) jvidispatchIIO(1, (long) i, nativeHolder);
    }
}
