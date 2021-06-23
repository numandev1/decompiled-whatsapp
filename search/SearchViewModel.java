package com.whatsapp.search;

import X.1dn;
import X.1do;
import X.1du;
import X.1eb;
import X.1gG;
import X.1hw;
import X.1iX;
import X.1jQ;
import X.1uN;
import X.23h;
import X.26n;
import X.28A;
import X.28B;
import X.28C;
import X.28a;
import X.2Cq;
import X.2Ny;
import X.2Tk;
import X.2UT;
import X.2UU;
import X.2ck;
import X.2dd;
import X.2de;
import X.2di;
import X.2dj;
import X.2dk;
import X.2dl;
import X.2dm;
import X.2do;
import X.2dp;
import X.3WB;
import X.3iq;
import X.3ir;
import X.3iv;
import X.3iw;
import X.3ix;
import X.3j0;
import X.3j1;
import X.3j2;
import X.3j3;
import X.AbstractC003001o;
import X.AbstractC03230Fr;
import X.AnonymousClass019;
import X.AnonymousClass01G;
import X.AnonymousClass01M;
import X.AnonymousClass01O;
import X.AnonymousClass01X;
import X.AnonymousClass07S;
import X.AnonymousClass0AV;
import X.AnonymousClass0EB;
import X.AnonymousClass0EC;
import X.AnonymousClass0GQ;
import X.AnonymousClass0GR;
import X.AnonymousClass0GV;
import X.AnonymousClass0Px;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseIntArray;
import androidx.lifecycle.OnLifecycleEvent;
import com.facebook.redex.RunnableEBaseShape6S0100000_I0_6;
import com.whatsapp.jid.UserJid;
import com.whatsapp.mediaview.MediaViewFragment;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public class SearchViewModel extends AbstractC03230Fr implements AnonymousClass0GQ, AnonymousClass0GR {
    public long A00 = 0;
    public Handler A01 = new Handler(Looper.getMainLooper(), new 3WB(this));
    public SparseIntArray A02 = new SparseIntArray();
    public AnonymousClass0EC A03;
    public AnonymousClass0EC A04;
    public AnonymousClass0EC A05;
    public AnonymousClass0EC A06;
    public AnonymousClass0GV A07 = new AnonymousClass0GV();
    public AnonymousClass0GV A08 = new AnonymousClass0GV();
    public AnonymousClass0GV A09 = new AnonymousClass0GV();
    public AnonymousClass0GV A0A = new AnonymousClass0GV();
    public AnonymousClass0GV A0B = new AnonymousClass0GV();
    public AnonymousClass0GV A0C = new AnonymousClass0GV();
    public AnonymousClass0GV A0D = new AnonymousClass0GV();
    public AnonymousClass0EB A0E = new AnonymousClass0EB();
    public AnonymousClass0EB A0F = new AnonymousClass0EB();
    public AnonymousClass0EB A0G = new AnonymousClass0EB();
    public AnonymousClass019 A0H = new 2dj(this);
    public UserJid A0I;
    public 2di A0J = 2di.A00();
    public 2dk A0K = new 2dk(this);
    public 2UT A0L = new 2UT();
    public 28B A0M = new 28B();
    public 28B A0N = new 28B();
    public 28B A0O = new 28B();
    public 28B A0P = new 28B();
    public 28B A0Q = new 28B();
    public 28B A0R = new 28B();
    public 28B A0S = new 28B();
    public 28B A0T = new 28B();
    public Integer A0U;
    public Runnable A0V;
    public Runnable A0W;
    public String A0X;
    public List A0Y = new ArrayList();
    public List A0Z = new ArrayList();
    public List A0a = new ArrayList();
    public AtomicBoolean A0b = new AtomicBoolean();
    public boolean A0c = true;
    public final AnonymousClass0Px A0d;
    public final AnonymousClass07S A0e;
    public final 23h A0f;
    public final AnonymousClass01G A0g;
    public final 1jQ A0h;
    public final 1iX A0i;
    public final 1uN A0j;
    public final 2dd A0k;
    public final 2de A0l;
    public final 28a A0m;
    public final 26n A0n;
    public final 2Cq A0o;
    public final AnonymousClass01O A0p;
    public final AtomicBoolean A0q = new AtomicBoolean();

    public SearchViewModel(AnonymousClass07S r13, AnonymousClass01O r14, 1jQ r15, 1dn r16, 2Ny r17, 1do r18, AnonymousClass01G r19, 1hw r20, 1iX r21, AnonymousClass0Px r22, 2Cq r23, 1uN r24, 26n r25, 23h r26, 1eb r27, AnonymousClass01X r28, 1gG r29) {
        this.A0e = r13;
        this.A0p = r14;
        this.A0h = r15;
        this.A0g = r19;
        this.A0i = r21;
        this.A0d = r22;
        this.A0o = r23;
        this.A0j = r24;
        this.A0n = r25;
        this.A0f = r26;
        this.A03 = r22.A01("current_screen", false, null);
        this.A0C.A0C(r22.A01("query_text", false, null), new 3iv(this));
        this.A05 = r22.A01("search_type", false, null);
        this.A04 = r22.A01("search_jid", false, null);
        this.A06 = r22.A01("user_grid_view_choice", false, null);
        this.A0k = new 2dd(r17, r18, r19, r27, r28, r29, this.A0C, this.A05, this.A04);
        this.A0l = new 2de(r17, r18, r19, r27, r28, r29, this.A0C, this.A05, this.A04);
        28a r2 = new 28a(r17, r16, r18, r19, r20, r28, this.A0C, this.A05, this.A04);
        this.A0m = r2;
        this.A0i.A01(r2.A00);
        this.A0i.A01(this.A0H);
        this.A0D.A0C(this.A0k.A01, new 3iq(this));
        this.A0D.A0C(this.A0l.A01, new 3j1(this));
        this.A0D.A0C(this.A0m.A05, new 2dl(this));
        this.A0D.A0C(this.A0m.A02, new 3j2(this));
        this.A0D.A0C(this.A0m.A03, new 3j0(this));
        this.A0D.A0C(this.A06, new 3ix(this));
        this.A0B.A0C(this.A0m.A08, new 2dm(this));
        this.A0B.A0C(this.A0m.A0A, new 2dm(this));
        this.A0B.A0C(this.A0m.A0B, new 2dm(this));
        this.A0B.A0C(this.A0k.A03, new 2dm(this));
        this.A0B.A0C(this.A0l.A03, new 2dm(this));
        this.A0B.A0C(this.A0F, new 3ir(this));
        this.A0B.A0C(this.A0D, new 3iw(this));
        this.A0C.A0C(this.A0m.A0C, new 3j3(this, r22));
        this.A0D.A0B(A07());
    }

    @Override // X.AbstractC03230Fr
    public void A01() {
        this.A0f.A00();
        1iX r0 = this.A0i;
        r0.A00(this.A0m.A00);
        r0.A00(this.A0H);
    }

    public int A02() {
        Number number = (Number) this.A0d.A02.get("last_nav_type");
        if (number == null) {
            return 0;
        }
        return number.intValue();
    }

    public int A03() {
        Number number = (Number) this.A0d.A01("search_type", true, 0).A01();
        if (number != null) {
            return number.intValue();
        }
        return 0;
    }

    public int A04(AbstractC003001o r6) {
        28A A082 = A08();
        int i = -2;
        for (int i2 = 0; i2 < A082.size(); i2++) {
            i = ((((2ck) A082.get(i2)).A00 == 3 || ((2ck) A082.get(i2)).A00 == 2) && AnonymousClass01M.A1E(((2Tk) A082.get(i2)).AB1(), r6)) ? i2 : i;
        }
        return i;
    }

    public int A05(1du r6) {
        int i = -2;
        if (this.A0J.A00.contains(r6)) {
            28A A082 = A08();
            for (int i2 = 0; i2 < A082.size(); i2++) {
                int A002 = A082.A00(i2);
                if ((28C.A00(A002) || A002 == 17 || A002 == 18 || A002 == 16 || A002 == 14) && AnonymousClass01M.A1E(A082.A01(i2), r6)) {
                    i = i2;
                }
            }
        }
        return i;
    }

    public UserJid A06() {
        return (UserJid) this.A0d.A01("search_jid", true, null).A01();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0172, code lost:
        if (A0M() == false) goto L_0x0174;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01b8, code lost:
        if (r5.A02.size() <= 0) goto L_0x01ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01d2, code lost:
        if (A0P() != false) goto L_0x01d4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.28A A07() {
        /*
        // Method dump skipped, instructions count: 598
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.search.SearchViewModel.A07():X.28A");
    }

    public final 28A A08() {
        return this.A0D.A01() == null ? A07() : (28A) this.A0D.A01();
    }

    public String A09() {
        String str = (String) this.A0d.A01("query_text", true, "").A01();
        return str != null ? str : "";
    }

    public void A0A() {
        A0H(0);
        A0I(null);
        A0L(false);
        A0J("");
        this.A0d.A02("user_grid_view_choice", null);
        this.A0P.A0B(null);
        this.A0m.A00(true);
        this.A0l.A01.A0B(new ArrayList());
        this.A0k.A01.A0B(new ArrayList());
        this.A0a = new ArrayList();
        this.A0Y = new ArrayList();
        this.A0Z = new ArrayList();
        this.A0J = 2di.A00();
        Runnable runnable = this.A0W;
        if (runnable != null) {
            runnable.run();
        }
        this.A0L = new 2UT();
        A0C();
    }

    public final void A0B() {
        this.A0b.set(true);
        if (TextUtils.isEmpty(A09()) && A03() == 0 && A06() == null) {
            this.A0q.set(true);
            this.A0c = true;
        } else if (this.A0c) {
            this.A00 = SystemClock.uptimeMillis();
            this.A0c = false;
        }
    }

    public final void A0C() {
        AnonymousClass01O r0 = this.A0p;
        RunnableEBaseShape6S0100000_I0_6 runnableEBaseShape6S0100000_I0_6 = new RunnableEBaseShape6S0100000_I0_6(this, 25);
        this.A0V = runnableEBaseShape6S0100000_I0_6;
        r0.ASf(runnableEBaseShape6S0100000_I0_6);
    }

    public final void A0D() {
        if (A08().size() - (this.A0F.A01() == null ? 0 : ((Number) this.A0F.A01()).intValue()) < 300) {
            28a r1 = this.A0m;
            if (!r1.A01.get()) {
                AnonymousClass0GV r3 = r1.A06;
                if (r3.A01() != null) {
                    Object obj = ((Pair) r3.A01()).first;
                    Number number = (Number) ((Pair) r3.A01()).second;
                    if (number != null) {
                        AnonymousClass0EB r12 = r1.A09;
                        if (r12.A01() != null && ((Number) r12.A01()).intValue() != -1) {
                            r3.A0B(new Pair(obj, Integer.valueOf(number.intValue() + 1)));
                        } else if (Boolean.TRUE.equals(obj)) {
                            r3.A0B(new Pair(Boolean.FALSE, 0));
                        }
                    }
                }
            }
        }
    }

    public final void A0E() {
        boolean z = false;
        AbstractCollection abstractCollection = (AbstractCollection) this.A0D.A01();
        int size = abstractCollection == null ? 0 : abstractCollection.size();
        int intValue = this.A0F.A01() == null ? 0 : ((Number) this.A0F.A01()).intValue();
        if (A0O() && intValue > size - 3) {
            z = true;
        }
        Boolean valueOf = Boolean.valueOf(z);
        if (!AnonymousClass01M.A1E(valueOf, this.A0B.A01())) {
            this.A0B.A0B(valueOf);
        }
    }

    public void A0F(int i) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        AnonymousClass0Px r2 = this.A0d;
        r2.A02("last_nav_time", Long.valueOf(elapsedRealtime));
        r2.A02("last_nav_type", Integer.valueOf(i));
    }

    public void A0G(int i) {
        Integer valueOf = Integer.valueOf(i);
        if (!AnonymousClass01M.A1E(valueOf, this.A03.A01())) {
            this.A0d.A02("current_screen", valueOf);
        }
    }

    public void A0H(int i) {
        if (i != A03()) {
            2UT r0 = this.A0L;
            Integer valueOf = Integer.valueOf(i);
            r0.A00(new 2UU(2, valueOf, A06(), A09()));
            this.A0d.A02("search_type", valueOf);
        }
    }

    public void A0I(UserJid userJid) {
        if (!AnonymousClass01M.A1E(userJid, A06())) {
            this.A0L.A00(new 2UU(3, Integer.valueOf(A03()), userJid, A09()));
            this.A0d.A02("search_jid", userJid);
        }
    }

    public void A0J(String str) {
        if (!AnonymousClass01M.A1E(str, A09())) {
            this.A0L.A00(new 2UU(1, Integer.valueOf(A03()), A06(), str));
            this.A0d.A02("query_text", str);
        }
    }

    public void A0K(boolean z) {
        A0A();
        A0G(1);
        A0F(4);
        this.A0P.A0A(Boolean.valueOf(z));
    }

    public void A0L(boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        if (!valueOf.equals(this.A0G.A01())) {
            this.A0G.A0B(valueOf);
        }
    }

    public boolean A0M() {
        return A03() == 103 || A03() == 105 || A03() == 118;
    }

    public final boolean A0N() {
        boolean z;
        if (this.A0J.A01.size() == 0) {
            return false;
        }
        Boolean bool = (Boolean) this.A0d.A02.get("user_grid_view_choice");
        if (bool != null) {
            z = bool.booleanValue();
        } else if (A0M() && A09().isEmpty()) {
            return true;
        } else {
            z = false;
        }
        return z;
    }

    public final boolean A0O() {
        Boolean bool = Boolean.TRUE;
        if (!bool.equals(this.A0k.A03.A01()) && !bool.equals(this.A0l.A03.A01())) {
            28a r1 = this.A0m;
            return bool.equals(r1.A08.A01()) || bool.equals(r1.A0B.A01()) || bool.equals(r1.A0A.A01());
        }
    }

    public final boolean A0P() {
        return (!Boolean.TRUE.equals(this.A0m.A0B.A01()) || this.A0J.A01.size() > 0) && this.A02.size() > 0;
    }

    public final boolean A0Q(long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Number number = (Number) this.A0d.A02.get("last_nav_time");
        return elapsedRealtime - (number == null ? 0 : number.longValue()) > j;
    }

    @Override // X.AnonymousClass0GQ
    public 2dp A74(MediaViewFragment mediaViewFragment, 1du r3) {
        return new 2do(this);
    }

    @OnLifecycleEvent(AnonymousClass0AV.ON_PAUSE)
    public void onPause() {
        A02();
        if (A02() != 2 && A02() != 1 && A02() != 4) {
            if (A02() != 0 || A0Q(500)) {
                A0F(3);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        if (r0 != false) goto L_0x001c;
     */
    @androidx.lifecycle.OnLifecycleEvent(X.AnonymousClass0AV.ON_RESUME)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onResume() {
        /*
            r6 = this;
            r4 = 300000(0x493e0, double:1.482197E-318)
            r2 = 0
            r6.A02()
            int r0 = r6.A02()
            if (r0 == 0) goto L_0x0030
            r1 = 1
            if (r0 == r1) goto L_0x001c
            r1 = 2
            if (r0 == r1) goto L_0x0023
            r1 = 3
            if (r0 != r1) goto L_0x0030
            boolean r0 = r6.A0Q(r4)
        L_0x001a:
            if (r0 == 0) goto L_0x0030
        L_0x001c:
            r6.A02()
            r6.A0K(r2)
        L_0x0022:
            return
        L_0x0023:
            r0 = 500(0x1f4, double:2.47E-321)
            boolean r0 = r6.A0Q(r0)
            if (r0 == 0) goto L_0x0022
            boolean r0 = r6.A0Q(r4)
            goto L_0x001a
        L_0x0030:
            r6.A0F(r2)
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.search.SearchViewModel.onResume():void");
    }
}
