package com.whatsapp;

import X.1dn;
import X.1do;
import X.1eD;
import X.1eE;
import X.1eK;
import X.1eZ;
import X.1eb;
import X.1ek;
import X.1f5;
import X.1f9;
import X.1fD;
import X.1fX;
import X.1fZ;
import X.1fc;
import X.1fd;
import X.1fs;
import X.1fw;
import X.1gG;
import X.1hK;
import X.1hp;
import X.1hw;
import X.1iH;
import X.1iL;
import X.1iN;
import X.1iX;
import X.1ih;
import X.1im;
import X.1iz;
import X.1jG;
import X.1jQ;
import X.1lO;
import X.1li;
import X.1lj;
import X.1nf;
import X.1s7;
import X.1tQ;
import X.1td;
import X.1uM;
import X.1uN;
import X.1uY;
import X.1uZ;
import X.1uc;
import X.23N;
import X.23h;
import X.26n;
import X.297;
import X.2Cp;
import X.2Cq;
import X.2E1;
import X.2E3;
import X.2Hg;
import X.2Hh;
import X.2Hi;
import X.2Hj;
import X.2Hk;
import X.2Nk;
import X.2Ns;
import X.2Nt;
import X.2Ny;
import X.2OH;
import X.2OL;
import X.2OT;
import X.2Of;
import X.2Og;
import X.2Oh;
import X.2Oi;
import X.2Ti;
import X.2Tj;
import X.2U1;
import X.2U5;
import X.2UT;
import X.2UU;
import X.2cJ;
import X.AbstractActivityC03680Ic;
import X.AbstractC003001o;
import X.AbstractC02340Bc;
import X.AbstractC02900Dv;
import X.AbstractC02910Dw;
import X.AbstractC02920Dx;
import X.AbstractC03230Fr;
import X.AbstractC03470Hf;
import X.AbstractC03500Hi;
import X.AbstractC03740Ii;
import X.AnonymousClass00C;
import X.AnonymousClass00E;
import X.AnonymousClass00I;
import X.AnonymousClass00J;
import X.AnonymousClass00O;
import X.AnonymousClass00b;
import X.AnonymousClass00f;
import X.AnonymousClass01G;
import X.AnonymousClass01O;
import X.AnonymousClass01T;
import X.AnonymousClass020;
import X.AnonymousClass021;
import X.AnonymousClass022;
import X.AnonymousClass028;
import X.AnonymousClass02A;
import X.AnonymousClass02S;
import X.AnonymousClass02T;
import X.AnonymousClass05F;
import X.AnonymousClass07P;
import X.AnonymousClass08x;
import X.AnonymousClass09I;
import X.AnonymousClass09K;
import X.AnonymousClass09M;
import X.AnonymousClass0BC;
import X.AnonymousClass0BE;
import X.AnonymousClass0CB;
import X.AnonymousClass0CL;
import X.AnonymousClass0D8;
import X.AnonymousClass0Gx;
import X.AnonymousClass0Nn;
import X.AnonymousClass0O5;
import X.AnonymousClass0PQ;
import X.AnonymousClass0PR;
import X.AnonymousClass0PS;
import X.AnonymousClass0PU;
import X.AnonymousClass0PV;
import X.AnonymousClass0PW;
import X.AnonymousClass0PY;
import X.AnonymousClass0Pc;
import X.AnonymousClass0Px;
import X.AnonymousClass0Q5;
import X.AnonymousClass0Q8;
import X.AnonymousClass0QE;
import X.AnonymousClass180;
import X.AnonymousClass181;
import X.AnonymousClass1V2;
import X.C000100c;
import X.C000700j;
import X.C002701g;
import X.C003901y;
import X.C009304t;
import X.C018308s;
import X.C020709z;
import X.C02130Ag;
import X.C02260Au;
import X.C02360Be;
import X.C03460He;
import X.C05190Pg;
import X.C05200Ph;
import X.C05210Pi;
import X.C05230Pn;
import X.C05240Po;
import X.C05260Pq;
import X.C05270Pr;
import X.C05280Ps;
import X.C05290Pt;
import X.C05300Pu;
import X.C234517i;
import X.C234817l;
import X.C234917m;
import X.C236017x;
import X.ComponentCallbacksC019009d;
import X.RunnableC05310Pv;
import X.RunnableC235117o;
import X.RunnableC235317q;
import X.RunnableC235417r;
import X.RunnableC235517s;
import X.RunnableC235717u;
import X.View$OnClickListenerC235917w;
import X.View$OnClickListenerC236217z;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.Interpolator;
import android.view.animation.TranslateAnimation;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.acceptinvitelink.AcceptInviteLinkActivity;
import com.whatsapp.collections.observablelistview.ObservableListView;
import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.insufficientstoragespace.InsufficientStorageSpaceActivity;
import com.whatsapp.jid.UserJid;
import com.whatsapp.profile.ProfilePhotoReminder;
import com.whatsapp.search.SearchFragment;
import com.whatsapp.search.SearchViewModel;
import com.whatsapp.settings.Settings;
import com.whatsapp.status.SetStatus;
import com.whatsapp.status.StatusesFragment;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallsFragment;
import com.whatsapp.voipcalling.Voip;
import com.whatsapp.voipcalling.VoipActivityV2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;

public class HomeActivity extends AbstractActivityC03680Ic implements 2Hg, 2Hh, 2Hi, 2Hj, 2Hk {
    public static List A1x = new ArrayList();
    public static final int A1y;
    public static final int A1z;
    public static final int A20;
    public static final int A21;
    public int A00;
    public int A01;
    public int A02;
    public int A03 = 200;
    public long A04;
    public AnimatorSet A05;
    public BroadcastReceiver A06;
    public View.OnLayoutChangeListener A07 = new AnonymousClass0PU(this);
    public View A08;
    public View A09;
    public View A0A;
    public View A0B;
    public View A0C;
    public View A0D;
    public View A0E;
    public TextView A0F;
    public AbstractC03470Hf A0G;
    public SearchView A0H;
    public Toolbar A0I;
    public C05210Pi A0J;
    public AnonymousClass0PS A0K = new AnonymousClass0PR(this);
    public CameraHomeFragment A0L;
    public AnonymousClass0BC A0M;
    public C02130Ag A0N;
    public TabsPager A0O;
    public AnonymousClass0Pc A0P;
    public C05280Ps A0Q;
    public AnonymousClass028 A0R;
    public PagerSlidingTabStrip A0S;
    public AnonymousClass02S A0T;
    public AnonymousClass0CL A0U;
    public C000700j A0V;
    public AnonymousClass0Gx A0W;
    public AnonymousClass0CB A0X;
    public AnonymousClass0BE A0Y;
    public AnonymousClass0D8 A0Z;
    public 2Nk A0a;
    public 2OL A0b;
    public 1dn A0c;
    public 1li A0d;
    public 1hp A0e;
    public 1do A0f;
    public 1lj A0g;
    public 1uY A0h;
    public 1uZ A0i;
    public 1fs A0j;
    public AnonymousClass00J A0k;
    public AnonymousClass00E A0l;
    public AnonymousClass020 A0m;
    public C000100c A0n;
    public AnonymousClass00O A0o;
    public AnonymousClass02T A0p;
    public AnonymousClass021 A0q;
    public 1hK A0r;
    public 1f5 A0s;
    public 1gG A0t;
    public 1fw A0u = null;
    public 1fZ A0v;
    public 1eb A0w;
    public 1eZ A0x;
    public 1hw A0y;
    public 1jQ A0z;
    public 1iX A10;
    public 1fX A11;
    public AnonymousClass01T A12;
    public 1s7 A13;
    public 1uN A14;
    public AnonymousClass00b A15;
    public 1iH A16;
    public 1eD A17;
    public 1iL A18;
    public 1fc A19;
    public 1eE A1A;
    public 1fd A1B;
    public 1tQ A1C;
    public 1td A1D;
    public 1im A1E;
    public 1iN A1F;
    public C009304t A1G;
    public 2Cp A1H;
    public AnonymousClass02A A1I;
    public 297 A1J;
    public 1fD A1K;
    public 1eK A1L;
    public SearchViewModel A1M;
    public 1iz A1N;
    public 2Og A1O;
    public 2Ns A1P;
    public 2Nt A1Q;
    public 2OT A1R;
    public 2Oh A1S;
    public 2Of A1T;
    public 26n A1U;
    public 2Cq A1V;
    public 1uc A1W;
    public 1lO A1X;
    public 2OH A1Y;
    public 1jG A1Z;
    public 1uM A1a;
    public C003901y A1b;
    public 2Ny A1c;
    public AnonymousClass01O A1d;
    public 2E3 A1e = null;
    public 2E1 A1f;
    public 2Oi A1g;
    public 1ih A1h;
    public 1nf A1i;
    public boolean A1j;
    public boolean A1k;
    public boolean A1l;
    public boolean A1m;
    public final Rect A1n = new Rect();
    public final Interpolator A1o = new AnonymousClass05F();
    public final C03460He A1p = new C03460He();
    public final AbstractC03740Ii A1q = new AnonymousClass0PQ(this);
    public final 1f9 A1r = new AnonymousClass1V2(this);
    public final Runnable A1s = new RunnableC235317q(this);
    public final Runnable A1t = new RunnableC235517s(this);
    public final Runnable A1u = new AnonymousClass181(this);
    public final Runnable A1v = new AnonymousClass180(this);
    public final Random A1w = new Random();

    public class TabsPager extends AnonymousClass0PY {
        public AnonymousClass01G A00;
        public boolean A01;

        public TabsPager(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
            if (r4 != 0.0f) goto L_0x0013;
         */
        @Override // androidx.viewpager.widget.ViewPager
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void A09(int r3, float r4, int r5) {
            /*
                r2 = this;
                super.A09(r3, r4, r5)
                X.01G r0 = r2.A00
                r1 = 100
                int r0 = com.whatsapp.HomeActivity.A00(r0, r1)
                if (r3 != r0) goto L_0x0013
                r0 = 1
                r1 = 0
                int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
                if (r1 == 0) goto L_0x0014
            L_0x0013:
                r0 = 0
            L_0x0014:
                r2.A01 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.HomeActivity.TabsPager.A09(int, float, int):void");
        }

        public final boolean A0O(MotionEvent motionEvent) {
            boolean z;
            2cJ r0;
            HomeActivity homeActivity = (HomeActivity) AnonymousClass07P.A01(getContext(), HomeActivity.class);
            if (!homeActivity.A0b.A0T() && ((r0 = homeActivity.A0b.A0S) == null || r0.getVisibility() != 0)) {
                if (!this.A01) {
                    z = true;
                    return z;
                } else if (motionEvent.getPointerCount() < 2) {
                    return true;
                }
            }
            z = false;
            return z;
        }

        @Override // androidx.viewpager.widget.ViewPager
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return A0O(motionEvent) && super.onInterceptTouchEvent(motionEvent);
        }

        @Override // androidx.viewpager.widget.ViewPager
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return A0O(motionEvent) && super.onTouchEvent(motionEvent);
        }

        @Override // androidx.viewpager.widget.ViewPager
        public void setCurrentItem(int i) {
            HomeActivity homeActivity;
            AbstractC02910Dw A1X;
            View view;
            AbsListView absListView;
            if (!(i != getCurrentItem() || (A1X = (homeActivity = (HomeActivity) AnonymousClass07P.A01(getContext(), HomeActivity.class)).A1X(i)) == null || (view = ((ComponentCallbacksC019009d) A1X).A0A) == null || (absListView = (AbsListView) view.findViewById(16908298)) == null)) {
                if (absListView.getFirstVisiblePosition() < 8) {
                    absListView.smoothScrollToPosition(0);
                } else {
                    absListView.setSelection(0);
                }
                homeActivity.A1d();
            }
            super.setCurrentItem(i);
        }
    }

    static {
        int i = 220;
        int i2 = Build.VERSION.SDK_INT;
        A20 = i2 >= 21 ? 250 : 220;
        A21 = i2 >= 21 ? 250 : 220;
        A1y = i2 >= 21 ? 500 : 220;
        if (i2 >= 21) {
            i = 250;
        }
        A1z = i;
    }

    public static int A00(AnonymousClass01G r3, int i) {
        boolean A0P2 = r3.A0P();
        List list = A1x;
        return A0P2 ^ true ? list.indexOf(Integer.valueOf(i)) : (list.size() - A1x.indexOf(Integer.valueOf(i))) - 1;
    }

    public static Intent A01(Context context) {
        return new Intent(context, HomeActivity.class).setAction("com.whatsapp.intent.action.CHATS");
    }

    public static final Pair A02(int i, int i2, int i3, int i4) {
        double sqrt = ((double) i) / (Build.VERSION.SDK_INT >= 21 ? Math.sqrt((double) ((i3 * i3) + (i2 * i2))) / ((double) i3) : 1.0d);
        int i5 = (int) ((((double) i4) / ((double) i3)) * sqrt);
        return new Pair(Integer.valueOf(i5), Integer.valueOf((int) (sqrt - ((double) i5))));
    }

    public static void A03(View view, ComponentCallbacksC019009d r7, int i) {
        AnonymousClass09M A092 = r7.A09();
        if (A092 instanceof HomeActivity) {
            HomeActivity homeActivity = (HomeActivity) A092;
            ViewGroup viewGroup = (ViewGroup) view.findViewById(16908290);
            viewGroup.setPadding(0, homeActivity.A1Q(), 0, 0);
            viewGroup.setClipToPadding(false);
            viewGroup.setClipChildren(false);
            ObservableListView findViewById = view.findViewById(16908298);
            AnonymousClass0PV r2 = new AnonymousClass0PV(homeActivity);
            AnonymousClass08x.A0U(r2, 2);
            findViewById.addHeaderView(r2, null, false);
            AnonymousClass0PW r22 = new AnonymousClass0PW(homeActivity, i);
            AnonymousClass08x.A0U(r22, 2);
            findViewById.addFooterView(r22, null, false);
            findViewById.setScrollViewCallbacks(homeActivity);
        }
    }

    @Override // X.AnonymousClass09M
    public void A0Y(ComponentCallbacksC019009d r5, Intent intent, int i, Bundle bundle) {
        if (intent.getLongExtra("row_id", -1) == -1 && A1v()) {
            if (A1u()) {
                SearchFragment A012 = A0N().A0Q.A01("search_fragment");
                if (A012 != null) {
                    A012.A16.A0F(1);
                }
            } else {
                ((AnonymousClass09I) this).A0A.A02.postDelayed(new RunnableC235717u(this), (long) getResources().getInteger(17694722));
            }
        }
        super.A0Y(r5, intent, i, bundle);
    }

    @Override // X.AnonymousClass09L, X.AnonymousClass09I
    public AbstractC03470Hf A0e(AbstractC03500Hi r5) {
        this.A0G = super.A0e(r5);
        if (!A1v()) {
            ValueAnimator valueAnimator = new ValueAnimator();
            valueAnimator.setObjectValues(Integer.valueOf(C020709z.A00(this, 2131100402)), Integer.valueOf(C020709z.A00(this, 2131099683)));
            valueAnimator.setEvaluator(new ArgbEvaluator());
            valueAnimator.addUpdateListener(new C234817l(this));
            valueAnimator.start();
        }
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().setStatusBarColor(C020709z.A00(this, 2131099684));
        }
        AnonymousClass07P.A04(findViewById(2131361894), getWindowManager());
        return this.A0G;
    }

    @Override // X.AnonymousClass09I
    public void A10(int i) {
        if (A1R(this.A0O.getCurrentItem()) != 100) {
            return;
        }
        if (i == 2131889162 || i == 2131889358 || i == 2131889359 || i == 2131887365 || i == 2131888047) {
            this.A0O.A0B(A00(((AnonymousClass09K) this).A01, 200), true);
        }
    }

    @Override // X.AnonymousClass09G
    public AnonymousClass00f A1G() {
        return AnonymousClass022.A01;
    }

    public final int A1Q() {
        int i = Build.VERSION.SDK_INT >= 22 ? 0 : 1;
        return A1x.size() > 1 ? i + getResources().getDimensionPixelSize(2131165263) : i;
    }

    public final int A1R(int i) {
        boolean A0P2 = ((AnonymousClass09K) this).A01.A0P();
        List list = A1x;
        return A0P2 ^ true ? ((Number) list.get(i)).intValue() : ((Number) list.get((list.size() - i) - 1)).intValue();
    }

    public final Animator A1S(int i) {
        View A1U2 = A1U();
        if (A1U2 == null) {
            return null;
        }
        A1U2.clearAnimation();
        ValueAnimator ofInt = ValueAnimator.ofInt((int) A1U2.getTranslationY(), i);
        ofInt.addUpdateListener(new C236017x(A1U2));
        return ofInt;
    }

    public final Animator A1T(int i, int i2, boolean z) {
        this.A09.clearAnimation();
        ValueAnimator ofInt = ValueAnimator.ofInt(i, i2);
        ofInt.addUpdateListener(new C234517i(this, z, new FrameLayout.LayoutParams(-1, -2), z ? new LinearLayout.LayoutParams(-1, 0, 1.0f) : new LinearLayout.LayoutParams(-1, -2)));
        return ofInt;
    }

    public final View A1U() {
        View view;
        ComponentCallbacksC019009d A1V2 = A1V();
        if (A1V2 == null || (view = A1V2.A0A) == null) {
            return null;
        }
        return view.findViewById(16908290);
    }

    public final ComponentCallbacksC019009d A1V() {
        return (ComponentCallbacksC019009d) A1X(A00(((AnonymousClass09K) this).A01, this.A03));
    }

    public final AbstractC02910Dw A1W() {
        return A1X(A00(((AnonymousClass09K) this).A01, this.A03));
    }

    public final AbstractC02910Dw A1X(int i) {
        int A1R2 = A1R(i);
        for (ComponentCallbacksC019009d r0 : A0t()) {
            if (A1R2 == 100) {
                if (r0 instanceof CameraHomeFragment) {
                    return (CameraHomeFragment) r0;
                }
            } else if (A1R2 == 200) {
                if (r0 instanceof ConversationsFragment) {
                    return (AbstractC02910Dw) r0;
                }
            } else if (A1R2 == 300) {
                if (r0 instanceof StatusesFragment) {
                    return (AbstractC02910Dw) r0;
                }
            } else if (A1R2 == 400 && (r0 instanceof CallsFragment)) {
                return (AbstractC02910Dw) r0;
            }
        }
        return null;
    }

    public final ObservableListView A1Y() {
        View view;
        ComponentCallbacksC019009d A1V2 = A1V();
        if (A1V2 == null || (view = A1V2.A0A) == null) {
            return null;
        }
        return view.findViewById(16908298);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0093, code lost:
        if (r0 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1Z() {
        /*
        // Method dump skipped, instructions count: 155
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.HomeActivity.A1Z():void");
    }

    public final void A1a() {
        long min;
        boolean z = true;
        if (((AnonymousClass09I) this).A0G.A0u(43200000, "insufficient_storage_prompt_timestamp")) {
            long A032 = this.A0l.A03();
            AnonymousClass01T r2 = this.A12;
            AnonymousClass00E r3 = this.A0l;
            if (r2 == null) {
                min = 10000000;
            } else {
                int A033 = r2.A03(224);
                min = A033 == -1 ? Math.min((r3.A05() * 1) / 100, 50000000L) : ((long) A033) * SearchActionVerificationClientService.MS_TO_NS;
            }
            if (A032 < min) {
                Log.w(String.format(Locale.ENGLISH, "home/resume/free-internal-storage-too-low available: %,d required: %,d", Long.valueOf(A032), Long.valueOf(min)));
                if (min <= 0) {
                    z = false;
                }
                AnonymousClass00I.A08(z, "required free space should be > 0");
                Intent intent = new Intent(this, InsufficientStorageSpaceActivity.class);
                intent.putExtra("spaceNeededInBytes", min);
                intent.putExtra("allowSkipKey", false);
                if (!AFX()) {
                    startActivity(intent);
                } else {
                    Log.w("home/show-low-free-space-on-internal-storage/cannot-start/home-activity-ended");
                }
            }
        }
    }

    public final void A1b() {
        C05190Pg A0H2 = this.A0P.A0H(A00(((AnonymousClass09K) this).A01, 300));
        if (A0H2.A00 != 0) {
            A0H2.A00 = 0;
            A1g();
        }
        long j = this.A04;
        if (j != 0) {
            AnonymousClass00C.A0j(((AnonymousClass09I) this).A0G, "last_notified_status_row_id", j);
        }
    }

    public final void A1c() {
        boolean z = true;
        1jG r3 = this.A1Z;
        if (!r3.A02().isEmpty()) {
            long j = r3.A01().getLong("two_factor_auth_nag_time", -1);
            C000100c r6 = r3.A05;
            boolean z2 = r6.A05() > 1jG.A0F[Math.min(5, r3.A01().getInt("two_factor_auth_nag_interval", 0))] + j;
            boolean z3 = r3.A01().getBoolean("two_factor_auth_last_code_correctness", false);
            if (r6.A05() < j) {
                Log.w("twofactorauthmanager/clock-moved-back");
            } else {
                z = false;
            }
            if (z2 || !z3 || z) {
                ((AnonymousClass09I) this).A0A.A02.post(new RunnableC235117o(this));
            }
        }
    }

    public final void A1d() {
        if (this.A09.getTranslationY() != 0.0f) {
            this.A09.animate().cancel();
            this.A09.animate().translationY(0.0f).setDuration(250).start();
            this.A01 = 0;
        }
        A1q(true);
    }

    public final void A1e() {
        this.A1k = false;
        AbstractC02340Bc A0N2 = A0N();
        if (!A0N2.A0r()) {
            SearchFragment A012 = A0N2.A0Q.A01("search_fragment");
            if (A012 != null) {
                A012.A10();
                A012.A16.A0L(false);
            }
            AbstractC02340Bc A0N3 = A0N();
            A0N3.A0g(new C05200Ph(A0N3, "search_fragment", -1, 1), false);
            this.A0C.setVisibility(8);
            SearchViewModel searchViewModel = this.A1M;
            if (searchViewModel != null) {
                searchViewModel.A0G(0);
                this.A1M.A0F(4);
            }
        }
    }

    public final void A1f() {
        int size;
        Iterator it = this.A0w.A08().iterator();
        int i = 0;
        while (it.hasNext()) {
            if (this.A0s.A01((AbstractC003001o) it.next()) != 0) {
                i++;
            }
        }
        this.A0P.A0H(A00(((AnonymousClass09K) this).A01, 200)).A00 = i;
        if (A1x.contains(400)) {
            C05190Pg A0H2 = this.A0P.A0H(A00(((AnonymousClass09K) this).A01, 400));
            if (this.A1g.A01() > 0) {
                size = this.A1g.A01();
            } else {
                1fd r0 = this.A1B;
                r0.A05();
                size = r0.A00.size();
            }
            A0H2.A00 = size;
        }
        A1g();
    }

    public final void A1g() {
        C05210Pi r2;
        C05210Pi r22;
        int A002 = A00(((AnonymousClass09K) this).A01, this.A03);
        int i = 0;
        while (true) {
            AnonymousClass0Pc r23 = this.A0P;
            if (i < r23.A00) {
                C05190Pg A0H2 = r23.A0H(i);
                if (A1R(i) == 300 || (A1R(i) == 400 && this.A1g.A01() > 0)) {
                    A0H2.A03.setVisibility(8);
                    int A1R2 = A1R(i);
                    ImageView imageView = A0H2.A02;
                    if (A1R2 == 400) {
                        imageView.setVisibility(0);
                        if (Build.VERSION.SDK_INT >= 21 && (r2 = this.A0J) != null && !r2.isRunning()) {
                            this.A0J.start();
                        }
                    } else {
                        imageView.setVisibility(A0H2.A00 > 0 ? 0 : 8);
                    }
                } else {
                    if (A1R(i) == 400) {
                        A0H2.A02.setVisibility(8);
                        if (Build.VERSION.SDK_INT >= 21 && (r22 = this.A0J) != null && r22.isRunning()) {
                            this.A0J.stop();
                        }
                    }
                    int i2 = A0H2.A00;
                    TextView textView = A0H2.A03;
                    if (i2 > 0) {
                        textView.setVisibility(0);
                        A0H2.A03.setText(((AnonymousClass09K) this).A01.A0I().format((long) A0H2.A00));
                        int i3 = 2131100127;
                        if (i == A002) {
                            i3 = 2131100126;
                        }
                        Drawable r7 = new 2Ti(C020709z.A00(this, i3));
                        int dimensionPixelSize = getResources().getDimensionPixelSize(2131166275);
                        ((2Ti) r7).A04.set(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
                        A0H2.A03.setBackground(r7);
                    } else {
                        textView.setVisibility(8);
                    }
                }
                if (A0H2.A02.getDrawable() != null) {
                    A0H2.A02.setSelected(i == A002);
                }
                A0H2.A01.setSelected(i == A002);
                TextView textView2 = A0H2.A04;
                int i4 = 2131100127;
                if (i == A002) {
                    i4 = 2131100126;
                }
                textView2.setTextColor(C020709z.A00(this, i4));
                i++;
            } else {
                return;
            }
        }
    }

    public /* synthetic */ void A1h() {
        if (this.A03 == 400) {
            this.A1B.A02();
        }
    }

    public /* synthetic */ void A1i() {
        if (this.A03 == 200) {
            this.A1A.A0B(true);
            this.A1B.A03();
        }
    }

    public /* synthetic */ void A1j() {
        A14(new Intent(this, ProfilePhotoReminder.class));
    }

    public final void A1k(int i) {
        this.A0O.A0B(A00(((AnonymousClass09K) this).A01, i), false);
        this.A03 = i;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [com.whatsapp.MuteDialogFragment, androidx.fragment.app.DialogFragment] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A1l(android.content.Intent r4) {
        /*
            r3 = this;
            r2 = 0
            java.lang.String r0 = "show_mute"
            r1 = 0
            boolean r0 = r4.getBooleanExtra(r0, r1)
            if (r0 == 0) goto L_0x002b
            X.1s7 r0 = r3.A13
            r1 = 8
            r0.A01 = r1
            java.lang.String r0 = "mute_jid"
            java.lang.String r0 = r4.getStringExtra(r0)
            X.01o r0 = X.AbstractC003001o.A02(r0)
            if (r0 == 0) goto L_0x002c
            java.util.Set r0 = java.util.Collections.singleton(r0)
            com.whatsapp.MuteDialogFragment r0 = com.whatsapp.MuteDialogFragment.A01(r0)
            X.0Bc r1 = r3.A0N()
            r0.A14(r1, r2)
        L_0x002b:
            return
        L_0x002c:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.HomeActivity.A1l(android.content.Intent):void");
    }

    public final void A1m(Intent intent) {
        Uri data = intent.getData();
        if (2Tj.A01(data)) {
            C018308s A052 = this.A0c.A05(2Tj.A00(data));
            ConversationsFragment A1W2 = A1W();
            if (A052 != null && (A1W2 instanceof ConversationsFragment)) {
                ConversationsFragment conversationsFragment = A1W2;
                if (conversationsFragment != null) {
                    AbstractC003001o r1 = (AbstractC003001o) A052.A03(AbstractC003001o.class);
                    conversationsFragment.A1O = r1;
                    if (r1 != null) {
                        int i = 0;
                        while (true) {
                            23N r4 = conversationsFragment.A0m;
                            if (i < r4.getCount()) {
                                if (r1.equals(r4.A00(i).AB1())) {
                                    break;
                                }
                                i++;
                            } else {
                                i = 0;
                                break;
                            }
                        }
                        if (conversationsFragment.A06.getFirstVisiblePosition() >= i || conversationsFragment.A06.getLastVisiblePosition() <= i) {
                            conversationsFragment.A06.setTranscriptMode(0);
                            conversationsFragment.A06.setSelectionFromTop(i, conversationsFragment.A06.getHeight() / 3);
                            return;
                        }
                        return;
                    }
                    return;
                }
                throw null;
            }
        }
    }

    public /* synthetic */ void A1n(AnonymousClass0O5 r7) {
        Rect rect = this.A1n;
        rect.set(r7.A02(), r7.A04(), r7.A03(), r7.A01());
        findViewById(2131363748).setPadding(0, 0, 0, rect.bottom);
        View findViewById = findViewById(2131361894);
        if (Build.VERSION.SDK_INT >= 19 && findViewById != null) {
            findViewById.setX((float) rect.left);
        }
    }

    public final void A1o(String str) {
        int width;
        int i;
        AbstractC02900Dv r0;
        AbstractC02910Dw A1W2 = A1W();
        if (A1W2 != null && A1W2.AVy() && !A1v()) {
            View findViewById = findViewById(2131363645);
            if (findViewById != null) {
                int[] iArr = new int[2];
                findViewById.getLocationInWindow(iArr);
                int width2 = iArr[0] + (findViewById.getWidth() / 2);
                i = findViewById.getTop() + (findViewById.getHeight() / 2);
                width = width2;
            } else {
                width = this.A09.getWidth();
                i = 0;
            }
            if (!1ek.A0p(this.A0y) || this.A03 != 200) {
                if (this.A0H == null) {
                    C05230Pn.A00(this.A0D);
                    getLayoutInflater().inflate(2131558880, (ViewGroup) this.A0D, true);
                    SearchView searchView = (SearchView) this.A0D.findViewById(2131364525);
                    this.A0H = searchView;
                    ((TextView) searchView.findViewById(2131364521)).setTextColor(C020709z.A00(this, 2131100478));
                    this.A0H.setIconifiedByDefault(false);
                    this.A0H.setQueryHint(getString(2131889591));
                    SearchView searchView2 = this.A0H;
                    searchView2.A0B = new C05240Po(this);
                    ((ImageView) searchView2.findViewById(2131364493)).setImageDrawable(new C05260Pq(C020709z.A03(this, 2131231405)));
                    this.A0H.A07 = new View$OnClickListenerC235917w(this);
                    if (!C002701g.A1H(str)) {
                        this.A0H.A0H(str);
                    }
                    ImageView imageView = (ImageView) this.A0D.findViewById(2131364468);
                    imageView.setImageDrawable(new AnonymousClass0Nn(((AnonymousClass09K) this).A01, C020709z.A03(this, 2131231405)));
                    imageView.setOnClickListener(new View$OnClickListenerC236217z(this));
                }
                this.A0D.setVisibility(0);
                if (Build.VERSION.SDK_INT < 21) {
                    TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, (float) (-this.A0D.getHeight()), 0.0f);
                    translateAnimation.setDuration((long) A20);
                    this.A0D.clearAnimation();
                    this.A0D.startAnimation(translateAnimation);
                } else if (this.A0D.isAttachedToWindow()) {
                    View view = this.A0D;
                    Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, width, i, 0.0f, (float) view.getWidth());
                    createCircularReveal.setDuration((long) A20);
                    createCircularReveal.start();
                }
                View A1U2 = A1U();
                if (A1U2 != null) {
                    A1U2.setPadding(0, A1Q() - getResources().getDimensionPixelSize(2131166277), 0, 0);
                    A1U2.clearAnimation();
                    TranslateAnimation translateAnimation2 = new TranslateAnimation(0.0f, 0.0f, (float) getResources().getDimensionPixelSize(2131166277), 0.0f);
                    translateAnimation2.setDuration((long) ((A20 << 2) / 3));
                    translateAnimation2.setAnimationListener(new C05270Pr(this));
                    A1U2.startAnimation(translateAnimation2);
                } else {
                    this.A0H.setIconified(false);
                }
                TranslateAnimation translateAnimation3 = new TranslateAnimation(0.0f, 0.0f, 0.0f, (float) (-getResources().getDimensionPixelSize(2131166277)));
                translateAnimation3.setDuration((long) A20);
                this.A09.startAnimation(translateAnimation3);
                this.A09.setVisibility(8);
                if (Build.VERSION.SDK_INT >= 21) {
                    getWindow().setStatusBarColor(C020709z.A00(this, 2131100466));
                }
            } else if (this.A0C != null) {
                AbstractC02910Dw A1W3 = A1W();
                if ((A1W3 instanceof AbstractC02900Dv) && (r0 = (AbstractC02900Dv) A1W3) != null) {
                    C05280Ps r4 = this.A0Q;
                    r4.A02 = true;
                    r4.A01(r0);
                }
                AbstractC02340Bc A0N2 = A0N();
                ComponentCallbacksC019009d A012 = A0N2.A0Q.A01("search_fragment");
                this.A0C.setVisibility(0);
                if (A012 == null) {
                    Integer valueOf = Integer.valueOf(A1y);
                    Integer valueOf2 = Integer.valueOf(A1z);
                    ComponentCallbacksC019009d searchFragment = new SearchFragment();
                    Bundle bundle = new Bundle();
                    bundle.putInt("x", width);
                    bundle.putInt("y", i);
                    if (valueOf != null) {
                        bundle.putInt("enter_duration_ms", valueOf.intValue());
                    }
                    if (valueOf2 != null) {
                        bundle.putInt("exit_duration_ms", valueOf2.intValue());
                    }
                    searchFragment.A0P(bundle);
                    C02360Be r1 = new C02360Be(A0N2);
                    r1.A0F = true;
                    r1.A01(2131364485, searchFragment, "search_fragment");
                    r1.A03("search_fragment");
                    r1.A04();
                    A0N2.A0B();
                    this.A0C.addOnLayoutChangeListener(this.A07);
                }
            } else {
                return;
            }
            ComponentCallbacksC019009d A1V2 = A1V();
            if (A1V2 instanceof AbstractC02920Dx) {
                ((AbstractC02920Dx) A1V2).A7R();
            }
        }
    }

    public void A1p(boolean z) {
        AbstractC02900Dv r0;
        if (A1v() || A1t()) {
            if (!A1u() && !A1t()) {
                this.A1p.A01 = "";
                this.A0H.A0H("");
                if (!z) {
                    this.A0H.setIconified(true);
                    this.A0D.setVisibility(4);
                } else if (Build.VERSION.SDK_INT >= 21) {
                    int width = (this.A0D.getWidth() - getResources().getDimensionPixelSize(2131165199)) - (getResources().getDimensionPixelSize(2131165198) / 2);
                    Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(this.A0D, ((AnonymousClass09K) this).A01.A0P() ^ true ? width : this.A0D.getWidth() - width, this.A0D.getHeight() / 2, (float) width, 0.0f);
                    createCircularReveal.setDuration((long) A21);
                    createCircularReveal.addListener(new AnonymousClass0QE(this));
                    createCircularReveal.start();
                } else {
                    AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                    TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, (float) (-this.A0D.getHeight()));
                    AnimationSet animationSet = new AnimationSet(true);
                    animationSet.addAnimation(alphaAnimation);
                    animationSet.addAnimation(translateAnimation);
                    animationSet.setDuration((long) A21);
                    animationSet.setAnimationListener(new C05290Pt(this));
                    this.A0D.startAnimation(animationSet);
                }
                A1r(z);
            } else if (!A0N().A0r()) {
                A1r(false);
                AbstractC02910Dw A1W2 = A1W();
                if ((A1W2 instanceof AbstractC02900Dv) && (r0 = (AbstractC02900Dv) A1W2) != null) {
                    C05280Ps r1 = this.A0Q;
                    r1.A02 = false;
                    r1.A01(r0);
                }
                SearchFragment A012 = A0N().A0Q.A01("search_fragment");
                this.A0C.setBackgroundResource(0);
                if (!this.A1k) {
                    this.A1k = true;
                    if (A012 != null) {
                        if (!z) {
                            this.A1k = false;
                            AbstractC02340Bc A0N2 = A0N();
                            if (!A0N2.A0r()) {
                                SearchFragment A013 = A0N2.A0Q.A01("search_fragment");
                                if (A013 != null) {
                                    A013.A10();
                                    A013.A16.A0L(false);
                                }
                                AbstractC02340Bc A0N3 = A0N();
                                A0N3.A0g(new C05200Ph(A0N3, "search_fragment", -1, 1), false);
                                this.A0C.setVisibility(8);
                                SearchViewModel searchViewModel = this.A1M;
                                if (searchViewModel != null) {
                                    searchViewModel.A0G(0);
                                    this.A1M.A0F(4);
                                }
                            }
                        } else {
                            RunnableC05310Pv r6 = new RunnableC05310Pv(this);
                            if (A012.A02 != null) {
                                A012.A10();
                                A012.A12(A012.A02.getLeft(), A012.A02.getTop(), A012.A02.getRight(), A012.A02.getBottom(), false, r6);
                            }
                        }
                    }
                    this.A0C.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                    Animator A1S2 = A1S(0);
                    Animator A1T2 = A1T(this.A0E.getHeight(), 0, false);
                    int A1Q2 = A1Q();
                    int dimensionPixelSize = getResources().getDimensionPixelSize(2131166277);
                    Pair A022 = A02(z ? A1z : 0, this.A09.getHeight(), this.A09.getWidth(), A1Q2 + dimensionPixelSize);
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.setStartDelay((long) ((Number) A022.first).intValue());
                    animatorSet.setDuration((long) ((Number) A022.second).intValue());
                    animatorSet.setInterpolator(this.A1o);
                    animatorSet.playTogether(A1T2, A1S2);
                    animatorSet.addListener(new C05300Pu(this));
                    animatorSet.start();
                }
            } else {
                return;
            }
            AbstractC02910Dw A1X2 = A1X(A00(((AnonymousClass09K) this).A01, this.A03));
            if (A1X2 != null) {
                A1X2.AUT(false);
            }
        }
    }

    public final void A1q(boolean z) {
        ComponentCallbacksC019009d r0;
        View view;
        ObservableListView findViewById;
        int height = this.A0I.getHeight();
        for (int i = 0; i < this.A0P.A00; i++) {
            if (!(i == this.A0O.getCurrentItem() || (r0 = (ComponentCallbacksC019009d) A1X(i)) == null || (view = r0.A0A) == null || (findViewById = view.findViewById(16908298)) == null)) {
                int currentScrollY = findViewById.getCurrentScrollY();
                if (z) {
                    if (currentScrollY > 0) {
                        findViewById.setSelection(0);
                    }
                } else if (currentScrollY < height) {
                    findViewById.setSelection(1);
                }
            }
        }
    }

    public final void A1r(boolean z) {
        this.A09.setVisibility(0);
        View A1U2 = A1U();
        if (A1U2 != null) {
            A1U2.setPadding(0, A1Q(), 0, 0);
        }
        if (z) {
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, (float) (-getResources().getDimensionPixelSize(2131166277)), 0.0f);
            translateAnimation.setDuration((long) A21);
            this.A09.startAnimation(translateAnimation);
            if (A1U2 != null) {
                A1U2.startAnimation(translateAnimation);
            }
        }
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().setStatusBarColor(C020709z.A00(this, 2131100412));
        }
        ComponentCallbacksC019009d A1V2 = A1V();
        if (A1V2 instanceof AbstractC02920Dx) {
            ((AbstractC02920Dx) A1V2).A7m();
        }
    }

    public final boolean A1s() {
        AnonymousClass028 r1 = this.A0R;
        r1.A05();
        if (r1.A00 != null) {
            1fX r12 = this.A11;
            r12.A06();
            if (r12.A01 && this.A1L.A02()) {
                return true;
            }
        }
        Log.i("home/create/no-me-or-msgstore-db");
        if (((AnonymousClass09I) this).A0A != null) {
            ((AnonymousClass09I) this).A08.A08("home/conversations bounced to main", null, false);
            startActivity(new Intent(this, Main.class));
            finish();
            return false;
        }
        throw null;
    }

    public final boolean A1t() {
        if (!1ek.A0p(this.A0y) || this.A03 != 200) {
            return false;
        }
        AbstractC02340Bc A0N2 = A0N();
        return (A0N2.A0Q.A01("search_fragment") == null || A0N2.A0Q.A01("media_view_fragment") == null) ? false : true;
    }

    public final boolean A1u() {
        if (1ek.A0p(this.A0y) && this.A03 == 200) {
            AbstractC02340Bc A0N2 = A0N();
            if (A0N2.A03() == 1 && A0N2.A0Q.A01("search_fragment") != null && this.A0C.getVisibility() == 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean A1v() {
        return (!1ek.A0p(this.A0y) || this.A03 != 200) ? this.A0D.getVisibility() == 0 : A1u();
    }

    public final boolean A1w(Intent intent) {
        Uri data = intent.getData();
        if ("com.whatsapp.intent.action.CALLS".equals(intent.getAction())) {
            A1k(400);
            return true;
        } else if ("com.whatsapp.intent.action.CHATS".equals(intent.getAction())) {
            A1k(200);
            return true;
        } else if (!"android.intent.action.VIEW".equals(intent.getAction()) || data == null || !"whatsapp".equals(data.getScheme()) || !"status".equals(data.getHost())) {
            return false;
        } else {
            A1k(300);
            return true;
        }
    }

    public 2OL A93() {
        return this.A0b;
    }

    public SearchViewModel ADI(23h r22) {
        AbstractC03230Fr r1;
        2U1 r12 = new 2U1(this, ((AnonymousClass09I) this).A0A, this.A1d, ((AnonymousClass09I) this).A08, r22, this.A0z, this.A0c, this.A1c, this.A0f, ((AnonymousClass09K) this).A01, this.A0y, this.A10, this.A1V, this.A14, this.A1U, this.A0w, this.A1G, ((AnonymousClass09K) this).A03, this.A0t);
        C02260Au AEC = AEC();
        String canonicalName = SearchViewModel.class.getCanonicalName();
        if (canonicalName != null) {
            String A0J2 = AnonymousClass00C.A0J("androidx.lifecycle.ViewModelProvider.DefaultKey:", canonicalName);
            HashMap hashMap = AEC.A00;
            AbstractC03230Fr r2 = (AbstractC03230Fr) hashMap.get(A0J2);
            if (SearchViewModel.class.isInstance(r2)) {
                r12.A00(r2);
            } else {
                r2 = r12.A01(A0J2, SearchViewModel.class);
                AbstractC03230Fr r13 = (AbstractC03230Fr) hashMap.put(A0J2, r2);
                if (r13 != null) {
                    r13.A01();
                    r1 = r2;
                    return (SearchViewModel) r1;
                }
            }
            r1 = r2;
            return (SearchViewModel) r1;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public void AK3() {
        SearchFragment A012 = A0N().A0Q.A01("search_fragment");
        if (A012 != null) {
            A012.A16.A0G(4);
        }
    }

    public void AMe() {
        SearchFragment A012 = A0N().A0Q.A01("search_fragment");
        if (A012 != null) {
            A012.A16.onResume();
            A012.A16.A0G(3);
        }
        A0N().A0D();
    }

    public void AO1() {
        ((2U5) this.A0b.A0X).A0E = false;
    }

    public void AOv() {
        C05230Pn.A00(this.A0C);
        this.A09.setVisibility(4);
    }

    @Override // X.AbstractC015007b, X.AnonymousClass09L, X.AnonymousClass09I
    public void APw(AbstractC03470Hf r8) {
        super.APw(r8);
        this.A0G = null;
        if (!A1v()) {
            ValueAnimator valueAnimator = new ValueAnimator();
            valueAnimator.setObjectValues(Integer.valueOf(C020709z.A00(this, 2131099683)), Integer.valueOf(C020709z.A00(this, 2131100402)));
            valueAnimator.setEvaluator(new ArgbEvaluator());
            valueAnimator.setDuration(valueAnimator.getDuration() + 25);
            valueAnimator.addUpdateListener(new C234917m(this));
            valueAnimator.start();
            if (Build.VERSION.SDK_INT >= 21) {
                getWindow().setStatusBarColor(C020709z.A00(this, 2131100412));
            }
        } else if (Build.VERSION.SDK_INT >= 21) {
            getWindow().setStatusBarColor(C020709z.A00(this, 2131100466));
        }
    }

    public void APz() {
        SearchFragment A012 = A0N().A0Q.A01("search_fragment");
        if (A012 != null) {
            A012.A16.A0G(5);
        }
    }

    public boolean AVF() {
        return false;
    }

    @Override // X.AnonymousClass09I
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (IllegalArgumentException e) {
            return false;
        }
    }

    public /* synthetic */ void lambda$initSearchView$2885$HomeActivity(View view) {
        AbstractC02910Dw A1X2 = A1X(A00(((AnonymousClass09K) this).A01, this.A03));
        if (A1X2 != null) {
            A1X2.AUT(true);
        }
    }

    public /* synthetic */ void lambda$initSearchView$2888$HomeActivity(View view) {
        A1p(true);
    }

    public /* synthetic */ void lambda$onCreate$2877$HomeActivity(View view) {
        UserJid peerJid = Voip.getPeerJid();
        if (peerJid != null) {
            Intent A012 = VoipActivityV2.A01(this, peerJid, Boolean.FALSE);
            A012.putExtra("lobbyEntryPoint", 7);
            startActivity(A012);
        }
    }

    @Override // X.AnonymousClass09M
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 30) {
            super.onActivityResult(i, i2, intent);
            return;
        }
        TabsPager tabsPager = this.A0O;
        if (i2 == -1) {
            tabsPager.A0B(A00(((AnonymousClass09K) this).A01, 100), true);
            this.A0b.A08();
            this.A0b.A07();
            if (this.A0b.A0U()) {
                findViewById(2131364430).setSystemUiVisibility(4);
            }
            this.A0Y.A04();
            return;
        }
        tabsPager.A0B(A00(((AnonymousClass09K) this).A01, 200), true);
    }

    @Override // X.AnonymousClass09N, X.AnonymousClass09I
    public void onBackPressed() {
        if (A1v()) {
            if (A1u()) {
                SearchFragment A012 = A0N().A0Q.A01("search_fragment");
                if (A012 != null) {
                    SearchViewModel searchViewModel = A012.A16;
                    2UT r0 = searchViewModel.A0L;
                    if (r0.size() >= 3) {
                        r0.pop();
                        2UU r02 = (2UU) r0.peek();
                        if (r02 != null) {
                            AnonymousClass0Px r1 = searchViewModel.A0d;
                            r1.A02("query_text", r02.A03);
                            r1.A02("search_type", r02.A02);
                            r1.A02("search_jid", r02.A01);
                            return;
                        }
                    }
                    searchViewModel.A0K(true);
                    return;
                }
                return;
            }
            A1p(true);
        } else if (A1t()) {
            SearchFragment A013 = A0N().A0Q.A01("search_fragment");
            if (A013 != null) {
                A013.A16.onResume();
                A013.A16.A0G(3);
            }
            super.onBackPressed();
        } else {
            2OL r03 = this.A0b;
            if (r03 != null && r03.A0V()) {
                return;
            }
            if (this.A03 != 200) {
                this.A0O.A0B(A00(((AnonymousClass09K) this).A01, 200), true);
            } else {
                super.onBackPressed();
            }
        }
    }

    @Override // X.AnonymousClass09L, X.AnonymousClass09K, X.AnonymousClass09M, X.AnonymousClass09I
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        A1d();
        AnonymousClass07P.A04(findViewById(2131361894), getWindowManager());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r36v0, resolved type: com.whatsapp.HomeActivity */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v53, types: [com.whatsapp.DisplayExceptionDialogFactory$SoftwareAboutToExpireDialogFragment, androidx.fragment.app.DialogFragment] */
    /* JADX WARN: Type inference failed for: r1v55, types: [com.whatsapp.DisplayExceptionDialogFactory$SoftwareExpiredDialogFragment, androidx.fragment.app.DialogFragment] */
    /* JADX WARN: Type inference failed for: r1v57, types: [com.whatsapp.DisplayExceptionDialogFactory$ClockWrongDialogFragment, androidx.fragment.app.DialogFragment] */
    /* JADX WARN: Type inference failed for: r1v106, types: [com.whatsapp.DisplayExceptionDialogFactory$UnsupportedDeviceDialogFragment, androidx.fragment.app.DialogFragment] */
    /* JADX WARNING: Unknown variable types count: 4 */
    @Override // X.AnonymousClass09L, X.AnonymousClass09K, X.AnonymousClass09N, X.AnonymousClass09M, X.AnonymousClass09H, X.AnonymousClass09G, X.AnonymousClass09J, X.AnonymousClass09I, X.AbstractActivityC03680Ic, X.AnonymousClass09O
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r37) {
        /*
        // Method dump skipped, instructions count: 1150
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.HomeActivity.onCreate(android.os.Bundle):void");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        if (menu.size() == 0) {
            MenuItem icon = menu.add(0, 2131363645, 0, 2131889576).setIcon(C020709z.A03(this, 2131231363));
            icon.setShowAsAction(2);
            ColorStateList valueOf = ColorStateList.valueOf(C020709z.A00(this, 2131100125));
            if (icon instanceof AnonymousClass0Q8) {
                ((AnonymousClass0Q8) icon).setIconTintList(valueOf);
            } else if (Build.VERSION.SDK_INT >= 26) {
                icon.setIconTintList(valueOf);
            }
            menu.add(4, 2131363648, 196608, 2131888250).setAlphabeticShortcut('o');
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override // X.AnonymousClass09L, X.AnonymousClass09M, X.AnonymousClass09I
    public void onDestroy() {
        super.onDestroy();
        1fw r0 = this.A0u;
        if (r0 != null) {
            this.A0v.A01(r0);
            this.A0u = null;
        }
        2E3 r02 = this.A1e;
        if (r02 != null) {
            this.A1f.A00(r02);
            this.A1e = null;
        }
        this.A0b.A03();
        AnonymousClass01G r03 = ((AnonymousClass09K) this).A01;
        r03.A0A.remove(this.A1r);
    }

    @Override // X.AnonymousClass09L, X.AnonymousClass09G
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return (this.A03 == 100 && this.A0b.A0X(i)) || super.onKeyDown(i, keyEvent);
    }

    @Override // X.AnonymousClass09G
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        return (this.A03 == 100 && this.A0b.A0Y(i)) || super.onKeyUp(i, keyEvent);
    }

    @Override // X.AnonymousClass09M
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.i("home/newintent");
        if (A1w(intent)) {
            A1p(false);
        }
        AnonymousClass0Q5.A04(this, this.A0n, this.A0R, this.A0s, this.A0r, this.A0X, this.A0c, this.A0x, this.A1X, intent);
        AcceptInviteLinkActivity.A01(this, intent);
        A1l(intent);
        A1m(intent);
    }

    @Override // X.AnonymousClass09I
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 2131363645) {
            A1o("");
            return true;
        } else if (menuItem.getItemId() == 2131363662) {
            startActivity(new Intent(this, SetStatus.class));
            return true;
        } else if (menuItem.getItemId() == 2131363648) {
            startActivity(new Intent(this, Settings.class));
            return true;
        } else {
            if (menuItem.getItemId() == 2131363636) {
                Class ACd = this.A1F.A03().ACd();
                StringBuilder sb = new StringBuilder("PAY: HomeActivity - Loading payment class: ");
                sb.append(ACd);
                Log.i(sb.toString());
                Intent intent = new Intent(this, ACd);
                intent.putExtra("referral_screen", "chat");
                startActivity(intent);
            } else if (menuItem.getItemId() == 2131363618) {
                startActivity(new Intent().setClassName(this, "com.whatsapp.Advanced"));
                return true;
            } else if (menuItem.getItemId() == 2131363619) {
                startActivity(new Intent().setClassName(this, "com.whatsapp.DebugToolsActivity"));
                return true;
            }
            return super.onOptionsItemSelected(menuItem);
        }
    }

    @Override // X.AnonymousClass09M, X.AnonymousClass09G, X.AnonymousClass09I
    public void onPause() {
        super.onPause();
        this.A0b.A04();
        BroadcastReceiver broadcastReceiver = this.A06;
        if (broadcastReceiver != null) {
            unregisterReceiver(broadcastReceiver);
            this.A06 = null;
        }
    }

    @Override // X.AnonymousClass09I
    public void onRestart() {
        ((AnonymousClass09K) this).A02.A06(this.A09, "HomeActivity", 1, new RunnableC235417r(this));
        super.onRestart();
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        int i = bundle.getInt("selected_tab", this.A03);
        this.A03 = i;
        this.A0O.A0B(A00(((AnonymousClass09K) this).A01, i), false);
        if (this.A03 == 100) {
            this.A0L = (CameraHomeFragment) this.A0P.A0G(A00(((AnonymousClass09K) this).A01, 100));
        }
        if (bundle.getBoolean("search")) {
            A1o(bundle.getString("query", ""));
        }
        this.A0b.A0F(bundle);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: com.whatsapp.HomeActivity */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v44, types: [com.whatsapp.DisplayExceptionDialogFactory$DoNotShareCodeDialogFragment, androidx.fragment.app.DialogFragment] */
    /* JADX WARN: Type inference failed for: r0v45, types: [com.whatsapp.DisplayExceptionDialogFactory$SoftwareAboutToExpireDialogFragment, androidx.fragment.app.DialogFragment] */
    /* JADX WARN: Type inference failed for: r0v46, types: [com.whatsapp.DisplayExceptionDialogFactory$SoftwareExpiredDialogFragment, androidx.fragment.app.DialogFragment] */
    /* JADX WARN: Type inference failed for: r0v47, types: [com.whatsapp.DisplayExceptionDialogFactory$ClockWrongDialogFragment, androidx.fragment.app.DialogFragment] */
    /* JADX WARN: Type inference failed for: r0v49, types: [com.whatsapp.DisplayExceptionDialogFactory$UnsupportedDeviceDialogFragment, androidx.fragment.app.DialogFragment] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00fe  */
    /* JADX WARNING: Unknown variable types count: 5 */
    @Override // X.AnonymousClass09M, X.AnonymousClass09G, X.AnonymousClass09I
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onResume() {
        /*
        // Method dump skipped, instructions count: 447
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.HomeActivity.onResume():void");
    }

    @Override // X.AnonymousClass09L, X.AnonymousClass09N, X.AnonymousClass09M, X.AnonymousClass09O
    public void onSaveInstanceState(Bundle bundle) {
        SearchView searchView;
        bundle.putInt("selected_tab", this.A03);
        boolean A1v2 = A1v();
        bundle.putBoolean("search", A1v2);
        if (A1v2 && (searchView = this.A0H) != null && searchView.getQuery().length() > 0) {
            bundle.putString("query", this.A0H.getQuery().toString());
        }
        this.A0b.A0G(bundle);
        super.onSaveInstanceState(bundle);
    }

    public boolean onSearchRequested() {
        A1o("");
        return false;
    }
}
