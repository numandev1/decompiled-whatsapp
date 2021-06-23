package com.whatsapp.backup.google;

import X.1dl;
import X.1fX;
import X.1fY;
import X.1fo;
import X.1hb;
import X.1iA;
import X.1lE;
import X.1la;
import X.1ng;
import X.1pw;
import X.2C4;
import X.2C7;
import X.2Eq;
import X.2Ez;
import X.2F0;
import X.2Nl;
import X.2OH;
import X.2On;
import X.2kK;
import X.2nG;
import X.2nU;
import X.2nc;
import X.2vv;
import X.2w3;
import X.2w5;
import X.2wB;
import X.357;
import X.358;
import X.3Vq;
import X.AbstractActivityC03090Fa;
import X.AbstractC02340Bc;
import X.AbstractC03480Hg;
import X.AbstractC03490Hh;
import X.AnonymousClass00C;
import X.AnonymousClass00E;
import X.AnonymousClass00G;
import X.AnonymousClass00H;
import X.AnonymousClass00I;
import X.AnonymousClass00J;
import X.AnonymousClass00O;
import X.AnonymousClass01M;
import X.AnonymousClass01O;
import X.AnonymousClass021;
import X.AnonymousClass02A;
import X.AnonymousClass02R;
import X.AnonymousClass07P;
import X.AnonymousClass07S;
import X.AnonymousClass09I;
import X.AnonymousClass09K;
import X.AnonymousClass0BY;
import X.AnonymousClass0C0;
import X.AnonymousClass0CD;
import X.AnonymousClass0EB;
import X.AnonymousClass0KJ;
import X.AnonymousClass0LK;
import X.C002701g;
import X.C015307e;
import X.C020709z;
import X.C02130Ag;
import X.C02270Av;
import X.C02360Be;
import X.C02740De;
import X.ComponentCallbacksC019009d;
import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.Dialog;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.text.TextUtils;
import android.util.Pair;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.facebook.redex.RunnableEBaseShape0S0100000_I0;
import com.facebook.redex.RunnableEBaseShape0S0200000_I0;
import com.facebook.redex.RunnableEBaseShape0S1100000_I0;
import com.facebook.redex.RunnableEBaseShape0S1101000_I0;
import com.facebook.redex.RunnableEBaseShape0S1200100_I0;
import com.facebook.redex.ViewOnClickEBaseShape0S0100000_I0;
import com.facebook.redex.ViewOnClickEBaseShape0S0110000_I0;
import com.facebook.redex.ViewOnClickEBaseShape0S1200000_I0;
import com.whatsapp.Main;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.backup.google.viewmodel.RestoreFromBackupViewModel;
import com.whatsapp.registration.RegisterPhone;
import com.whatsapp.settings.SettingsChat;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

public final class RestoreFromBackupActivity extends AnonymousClass0KJ implements AbstractC03480Hg, AbstractC03490Hh {
    public int A00;
    public long A01;
    public long A02;
    public View A03;
    public Button A04;
    public ProgressBar A05;
    public TextView A06;
    public TextView A07;
    public TextView A08;
    public AnonymousClass00H A09;
    public C02130Ag A0A;
    public AnonymousClass0C0 A0B;
    public C015307e A0C;
    public C02740De A0D;
    public 2w5 A0E;
    public 2nU A0F;
    public 1fo A0G;
    public 2C7 A0H;
    public GoogleBackupService A0I;
    public GoogleDriveRestoreAnimationView A0J;
    public 2On A0K;
    public RestoreFromBackupViewModel A0L;
    public AnonymousClass00J A0M;
    public AnonymousClass00E A0N;
    public AnonymousClass0CD A0O;
    public AnonymousClass00O A0P;
    public AnonymousClass021 A0Q;
    public 1pw A0R;
    public 1fX A0S;
    public 1lE A0T;
    public AnonymousClass0BY A0U;
    public 2Nl A0V;
    public 1iA A0W;
    public AnonymousClass02A A0X;
    public 1hb A0Y;
    public 3Vq A0Z;
    public 1fY A0a;
    public 2Eq A0b;
    public 2OH A0c;
    public 1dl A0d;
    public AnonymousClass02R A0e;
    public AnonymousClass01O A0f;
    public String A0g;
    public boolean A0h;
    public boolean A0i;
    public boolean A0j;
    public final ServiceConnection A0k = new 2nc(this);
    public final ConditionVariable A0l = new ConditionVariable(false);
    public final ConditionVariable A0m = new ConditionVariable(false);
    public final ConditionVariable A0n = new ConditionVariable(false);
    public final 2C4 A0o = new 357(this);
    public final 2Ez A0p = new 2wB(this);
    public final List A0q = new ArrayList();
    public final Set A0r = Collections.newSetFromMap(new ConcurrentHashMap());
    public final AtomicBoolean A0s = new AtomicBoolean(false);
    public final AtomicBoolean A0t = new AtomicBoolean(false);
    public final AtomicBoolean A0u = new AtomicBoolean(true);

    public RestoreFromBackupActivity() {
        super(true);
    }

    public static String A00(int i) {
        switch (i) {
            case 21:
                return "new";
            case 22:
                return "restore-from-gdrive";
            case 23:
                return "restore-from-local";
            case 24:
                return "restoring-from-gdrive";
            case 25:
                return "return-from-auth";
            case 26:
                return "msgstore-restored";
            case 27:
                return "restoring-from-local";
            default:
                throw new IllegalStateException(AnonymousClass00C.A0E("Unknown state: ", i));
        }
    }

    @Override // X.AbstractActivityC03090Fa
    public void A1R(int i) {
        if (i - this.A00 > 0) {
            this.A00 = i;
            if (i % 10 == 0) {
                StringBuilder sb = new StringBuilder("gdrive-activity/msg-restore-progress/");
                sb.append(i);
                sb.append("%");
                Log.i(sb.toString());
            }
            if (i <= 100) {
                this.A08.setText(getString(2131889757, ((AnonymousClass09K) this).A01.A0J().format(((double) i) / 100.0d)));
                this.A05.setIndeterminate(true);
            }
        }
    }

    @Override // X.AbstractActivityC03090Fa
    public void A1S(1pw r12) {
        String string;
        AnonymousClass00I.A01();
        if (this.A0j) {
            setResult(2);
            finish();
        } else if (this.A0L.A00 == 26) {
            StringBuilder sb = new StringBuilder("gdrive-activity/after-msgstore-verified/state-is-msgstore-restored/call-ignored ");
            sb.append(r12);
            Log.i(sb.toString());
        } else {
            StringBuilder sb2 = new StringBuilder("gdrive-activity/after-msgstore-verified/");
            sb2.append(r12);
            Log.i(sb2.toString());
            A1j(26, r12);
            int i = r12.A00;
            boolean z = i != 2;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(i);
            sb3.append(" is unexpected here");
            AnonymousClass00I.A08(z, sb3.toString());
            if (i == 1) {
                A1Z();
            } else if (i == 5) {
                AnonymousClass00I.A01();
                if (!2F0.A0F(this)) {
                    Bundle A012 = AnonymousClass00C.A01("dialog_id", 19);
                    A012.putString("message", getString(2131887649));
                    A012.putBoolean("cancelable", false);
                    A012.putString("positive_button", getString(2131889534));
                    A012.putString("negative_button", getString(2131889928));
                    ComponentCallbacksC019009d promptDialogFragment = new PromptDialogFragment();
                    promptDialogFragment.A0P(A012);
                    AbstractC02340Bc A0N2 = A0N();
                    if (A0N2 != null) {
                        C02360Be r4 = new C02360Be(A0N2);
                        r4.A0A(0, promptDialogFragment, null, 1);
                        r4.A05();
                        return;
                    }
                    throw null;
                }
            } else {
                2nU r0 = this.A0F;
                if (r0 == null || !r0.A03) {
                    this.A0u.set(false);
                    Log.i("gdrive-activity/after-msgstore-verified/failed/unrestorable-local-backup");
                } else {
                    this.A0r.add(new Account(r0.A05, "com.google"));
                    StringBuilder sb4 = new StringBuilder("gdrive-activity/after-msgstore-verified/failed/unrestorable-gdrive-backup/");
                    sb4.append(2F0.A0A(this.A0F.A05));
                    Log.i(sb4.toString());
                }
                if (i == 3) {
                    AnonymousClass00I.A01();
                    if (!2F0.A0F(this)) {
                        Bundle A013 = AnonymousClass00C.A01("dialog_id", 20);
                        String[] strArr = (String[]) Collections.unmodifiableSet(((AbstractActivityC03090Fa) this).A08.A0Y).toArray(new String[0]);
                        AnonymousClass00C.A1P(AnonymousClass00C.A0R("gdrive-activity/get-jid-mismatch-message "), Arrays.toString(strArr));
                        int length = strArr.length;
                        if (length == 0) {
                            string = getString(2131887647);
                        } else if (length == 1) {
                            string = getString(2131887648, 1ng.A03(((AnonymousClass09I) this).A0G.A0J()), strArr[0]);
                        } else {
                            Arrays.sort(strArr);
                            int i2 = length - 1;
                            String[] strArr2 = new String[i2];
                            String str = strArr[i2];
                            System.arraycopy(strArr, 0, strArr2, 0, i2);
                            string = getString(2131887646, 1ng.A03(((AnonymousClass09I) this).A0G.A0J()), 1la.A0n(((AnonymousClass09K) this).A01, false, strArr2), str);
                        }
                        A013.putString("message", string);
                        A013.putBoolean("cancelable", false);
                        A013.putString("positive_button", getString(2131887650));
                        A013.putString("negative_button", getString(A1s() ? 2131889531 : 2131889928));
                        ComponentCallbacksC019009d promptDialogFragment2 = new PromptDialogFragment();
                        promptDialogFragment2.A0P(A013);
                        AbstractC02340Bc A0N3 = A0N();
                        if (A0N3 != null) {
                            C02360Be r42 = new C02360Be(A0N3);
                            r42.A0A(0, promptDialogFragment2, null, 1);
                            r42.A05();
                            return;
                        }
                        throw null;
                    }
                    return;
                }
                TextUtils.join(",", this.A0q);
                TextUtils.join(",", this.A0r);
                if (((AnonymousClass09I) this).A0G.A00.getBoolean("encrypted_backup_using_encryption_key", false)) {
                    AnonymousClass00I.A01();
                    if (!2F0.A0F(this)) {
                        Bundle A014 = AnonymousClass00C.A01("dialog_id", 21);
                        A014.putString("message", getString(2131887645));
                        A014.putBoolean("cancelable", false);
                        A014.putString("positive_button", getString(2131887277));
                        A014.putString("negative_button", getString(2131889928));
                        ComponentCallbacksC019009d promptDialogFragment3 = new PromptDialogFragment();
                        promptDialogFragment3.A0P(A014);
                        AbstractC02340Bc A0N4 = A0N();
                        if (A0N4 != null) {
                            C02360Be r43 = new C02360Be(A0N4);
                            r43.A0A(0, promptDialogFragment3, null, 1);
                            r43.A05();
                            return;
                        }
                        throw null;
                    }
                } else if (A1s()) {
                    AnonymousClass00I.A01();
                    if (!2F0.A0F(this)) {
                        Bundle A015 = AnonymousClass00C.A01("dialog_id", 18);
                        A015.putString("message", getString(2131887651));
                        A015.putBoolean("cancelable", false);
                        A015.putString("positive_button", getString(2131889531));
                        A015.putString("negative_button", getString(2131889928));
                        ComponentCallbacksC019009d promptDialogFragment4 = new PromptDialogFragment();
                        promptDialogFragment4.A0P(A015);
                        AbstractC02340Bc A0N5 = A0N();
                        if (A0N5 != null) {
                            C02360Be r44 = new C02360Be(A0N5);
                            r44.A0A(0, promptDialogFragment4, null, 1);
                            r44.A05();
                            return;
                        }
                        throw null;
                    }
                } else {
                    A1U(false);
                    A1Z();
                    ((AnonymousClass09I) this).A0A.A0B(this, 2131888351);
                }
            }
        }
    }

    public final long A1W() {
        return ((AbstractActivityC03090Fa) this).A08.A07();
    }

    public void A1X() {
        StringBuilder A0R2 = AnonymousClass00C.A0R("gdrive-activity/skip-restore user declined to restore backup from ");
        2nU r0 = this.A0F;
        A0R2.append(r0 == null ? "<unset account>" : 2F0.A0A(r0.A05));
        Log.i(A0R2.toString());
        Log.i("gdrive-activity/skip-restore/stopping-approx-transfer-size-calc-thread");
        this.A0s.set(true);
        ((AnonymousClass09I) this).A0G.A0U(0);
        ((AnonymousClass09I) this).A0G.A0L();
        ((AnonymousClass09I) this).A0G.A0t(0);
        AnonymousClass00C.A0l(((AnonymousClass09I) this).A0G, "gdrive_include_videos_in_backup", false);
        2nU r02 = this.A0F;
        if (r02 != null && r02.A02) {
            this.A0D.A01(new 358());
        }
        Runnable runnableEBaseShape0S0100000_I0 = new RunnableEBaseShape0S0100000_I0(this, 7);
        if (C002701g.A0v()) {
            this.A0f.ASf(runnableEBaseShape0S0100000_I0);
        } else {
            ((RestoreFromBackupActivity) ((RunnableEBaseShape0S0100000_I0) runnableEBaseShape0S0100000_I0).A00).A1h();
        }
        GoogleBackupService googleBackupService = this.A0I;
        if (googleBackupService != null) {
            googleBackupService.A04(10);
        } else {
            Log.e("gdrive-activity/skip-restore/google-drive-service-object-is-null");
        }
        String A0G2 = ((AnonymousClass09I) this).A0G.A0G();
        if (A0G2 != null) {
            Intent intent = new Intent("action_remove_backup_info");
            intent.putExtra("account_name", A0G2);
            intent.putExtra("remove_account_name", true);
            2F0.A0E(this, intent);
        }
        setResult(2);
        A1d();
    }

    public final void A1Y() {
        1hb r0 = this.A0Y;
        if (r0.A02()) {
            r0.A00("restore_unsuccessful");
            r0.A01("restore_unsuccessful", "next");
        }
    }

    public final void A1Z() {
        String A0C2;
        AnonymousClass00I.A01();
        2nU r0 = this.A0F;
        boolean z = r0 != null && !r0.A01;
        GoogleDriveRestoreAnimationView googleDriveRestoreAnimationView = this.A0J;
        if (googleDriveRestoreAnimationView == null) {
            View findViewById = findViewById(2131363183);
            if (findViewById != null) {
                googleDriveRestoreAnimationView = (GoogleDriveRestoreAnimationView) findViewById;
                this.A0J = googleDriveRestoreAnimationView;
            } else {
                throw null;
            }
        }
        googleDriveRestoreAnimationView.A02(false);
        AnonymousClass00C.A0e(this, 2131364382, 8);
        this.A05.setVisibility(8);
        this.A08.setVisibility(8);
        TextView textView = this.A07;
        if (textView == null) {
            View findViewById2 = findViewById(2131363179);
            if (findViewById2 != null) {
                textView = (TextView) findViewById2;
                this.A07 = textView;
            } else {
                throw null;
            }
        }
        textView.setVisibility(8);
        View findViewById3 = findViewById(2131363716);
        if (findViewById3 != null) {
            TextView textView2 = (TextView) findViewById3;
            textView2.setVisibility(0);
            if (z) {
                ((AnonymousClass09I) this).A0G.A0U(2);
                A0C2 = ((AnonymousClass09K) this).A01.A0C(2131755092, (long) this.A0S.A01(), Integer.valueOf(this.A0S.A01()));
            } else {
                A0C2 = ((AnonymousClass09K) this).A01.A0C(2131755093, (long) this.A0S.A01(), Integer.valueOf(this.A0S.A01()));
            }
            StringBuilder sb = new StringBuilder("gdrive-activity/after-msgstore-verified/ ");
            sb.append(A0C2);
            Log.i(sb.toString());
            textView2.setText(A0C2);
            View findViewById4 = findViewById(2131363760);
            if (findViewById4 != null) {
                findViewById4.setVisibility(0);
                AccessibilityManager A0L2 = ((AnonymousClass09I) this).A0F.A0L();
                if (A0L2 != null && A0L2.isTouchExplorationEnabled()) {
                    findViewById4.setFocusableInTouchMode(true);
                    findViewById4.requestFocus();
                }
                findViewById4.setOnClickListener(new ViewOnClickEBaseShape0S0110000_I0(this, z, 0));
                return;
            }
            throw null;
        }
        throw null;
    }

    public final void A1a() {
        Log.i("gdrive-activity/set-skip-restore/");
        this.A0j = true;
    }

    public final void A1b() {
        AnonymousClass00I.A01();
        Log.i("gdrive-activity/show-msgstore-downloading-view");
        AnonymousClass00C.A0e(this, 2131364382, 8);
        AnonymousClass00C.A0e(this, 2131364392, 8);
        AnonymousClass00C.A0e(this, 2131362237, 8);
        AnonymousClass00C.A0e(this, 2131363183, 0);
        this.A05.setVisibility(0);
        this.A05.setIndeterminate(true);
        1la.A15(this.A05, C020709z.A00(this, 2131100215));
        this.A08.setVisibility(0);
        this.A07 = (TextView) findViewById(2131363179);
        long j = this.A02;
        if (j == 0) {
            j = ((AnonymousClass09I) this).A0G.A00.getLong("gdrive_approx_media_download_size", 0);
            this.A02 = j;
        }
        if (j > 0) {
            String A0e2 = 1la.A0e(((AnonymousClass09K) this).A01, j);
            this.A07.setText(getString(2131886169, A0e2));
            this.A07.setVisibility(0);
        }
    }

    public final void A1c() {
        Log.i("gdrive-activity/show-restore-for-local-backup");
        AnonymousClass00C.A0e(this, 2131363178, 8);
        AnonymousClass00C.A0e(this, 2131363184, 0);
        this.A0m.open();
        setTitle(2131886172);
        AnonymousClass00C.A0e(this, 2131362237, 8);
        AnonymousClass00C.A0e(this, 2131363136, 8);
        AnonymousClass00C.A0e(this, 2131362238, 8);
        CharSequence A0T2 = 1la.A0T(((AnonymousClass09K) this).A01, A1W());
        TextView textView = (TextView) findViewById(2131363135);
        if (textView != null) {
            textView.setText(getString(2131888172, A0T2));
            this.A0L.A01.A05(this, new 2vv(this));
            RestoreFromBackupViewModel restoreFromBackupViewModel = this.A0L;
            restoreFromBackupViewModel.A05.ASf(new RunnableEBaseShape0S0100000_I0(restoreFromBackupViewModel, 26));
            this.A03.setVisibility(8);
            if (this.A0J == null) {
                this.A0J = findViewById(2131363183);
            }
            TextView textView2 = (TextView) findViewById(2131364392);
            if (textView2 != null) {
                int i = 2131889915;
                if (AnonymousClass00E.A01()) {
                    i = 2131889575;
                }
                textView2.setText(i);
                View findViewById = findViewById(2131362757);
                if (findViewById != null) {
                    findViewById.setOnClickListener(new ViewOnClickEBaseShape0S0100000_I0(this, 4));
                    this.A04.setOnClickListener(new ViewOnClickEBaseShape0S0100000_I0(this, 2));
                    this.A0Y.A00("backup_found");
                    return;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    public final void A1d() {
        Log.i("gdrive-activity/show-new-user-settings");
        A1a();
        A1U(false);
        ((AnonymousClass09I) this).A0G.A0W(System.currentTimeMillis() + 604800000);
    }

    public final void A1e() {
        Log.i("gdrive-activity/restore-media");
        2F0.A0E(this, new Intent("action_restore_media"));
    }

    public final void A1f() {
        Log.i("gdrive-activity/restore-messages");
        2nU r0 = this.A0F;
        if (r0 == null || !r0.A01) {
            2F0.A0E(this, new Intent("action_restore"));
        } else {
            this.A0o.AMh(true);
        }
        AnonymousClass07S r02 = ((AnonymousClass09I) this).A0A;
        r02.A02.post(new RunnableEBaseShape0S0100000_I0(this, 9));
    }

    public final void A1g() {
        View view = this.A03;
        if (this.A0D != null) {
            view.setVisibility(8);
            return;
        }
        throw null;
    }

    public /* synthetic */ void A1h() {
        this.A0G.A0D(0);
    }

    public final void A1i(int i) {
        Bundle A012 = AnonymousClass00C.A01("dialog_id", i);
        A012.putString("message", getString(2131887151));
        A012.putBoolean("cancelable", true);
        A012.putString("positive_button", getString(2131888349));
        A012.putString("negative_button", getString(2131886565));
        ComponentCallbacksC019009d promptDialogFragment = new PromptDialogFragment();
        promptDialogFragment.A0P(A012);
        if (!2F0.A0F(this)) {
            AbstractC02340Bc A0N2 = A0N();
            if (A0N2 != null) {
                C02360Be r2 = new C02360Be(A0N2);
                r2.A0A(0, promptDialogFragment, null, 1);
                r2.A05();
                return;
            }
            throw null;
        }
    }

    public final void A1j(int i, 1pw r6) {
        this.A0L.A00 = i;
        this.A0R = r6;
        StringBuilder A0R2 = AnonymousClass00C.A0R("gdrive-activity/state ");
        A0R2.append(A00(i));
        A0R2.append(" ");
        A0R2.append(r6);
        Log.i(A0R2.toString());
        AnonymousClass00G r1 = ((AnonymousClass09I) this).A0G;
        int i2 = this.A0L.A00;
        1pw r0 = this.A0R;
        Integer valueOf = r0 != null ? Integer.valueOf(r0.A00) : null;
        SharedPreferences.Editor A0E2 = r1.A0E();
        A0E2.putInt("gdrive_activity_state", i2);
        if (valueOf != null) {
            A0E2.putInt("gdrive_activity_msgstore_init_key", valueOf.intValue());
        } else {
            A0E2.remove("gdrive_activity_msgstore_init_key");
        }
        A0E2.apply();
    }

    public void A1k(long j, long j2) {
        String string;
        AnonymousClass00I.A00();
        this.A01 = j;
        this.A02 = j2;
        ((AnonymousClass09I) this).A0G.A0E().putLong("gdrive_approx_media_download_size", j2).apply();
        AnonymousClass00C.A1K(new StringBuilder("washaredpreferences/save-gdrive-media-download-transfer-size/"), j2);
        if (j <= 0) {
            string = getString(2131887611);
        } else {
            string = getString(2131887609, 1la.A0e(((AnonymousClass09K) this).A01, j));
        }
        this.A0m.block();
        StringBuilder sb = new StringBuilder("gdrive-activity/update-restore-info/ total download size: ");
        sb.append(j);
        sb.append(" media download size: ");
        AnonymousClass00C.A1K(sb, j2);
        AnonymousClass07S r1 = ((AnonymousClass09I) this).A0A;
        r1.A02.post(new RunnableEBaseShape0S1100000_I0(this, string, 3));
    }

    public final void A1l(2nU r15) {
        StringBuilder A0R2 = AnonymousClass00C.A0R("gdrive-activity/show-restore-for-gdrive-backup/");
        String str = r15.A05;
        A0R2.append(2F0.A0A(str));
        Log.i(A0R2.toString());
        long j = r15.A04;
        long j2 = r15.A00;
        String A012 = r15.A01();
        if (!TextUtils.isEmpty(A012)) {
            AnonymousClass00C.A16("gdrive-activity/show-restore/", A012);
        }
        AnonymousClass00C.A0e(this, 2131363178, 8);
        AnonymousClass00C.A0e(this, 2131363184, 0);
        this.A0m.open();
        setTitle(2131886172);
        if (this.A0J == null) {
            this.A0J = (GoogleDriveRestoreAnimationView) findViewById(2131363183);
        }
        boolean z = r15.A01;
        TextView textView = (TextView) findViewById(2131364392);
        if (z) {
            if (textView != null) {
                int i = 2131889915;
                if (AnonymousClass00E.A01()) {
                    i = 2131889575;
                }
                textView.setText(i);
            } else {
                throw null;
            }
        } else if (textView != null) {
            textView.setText(2131887677);
        } else {
            throw null;
        }
        StringBuilder sb = new StringBuilder(getString(2131887600));
        StringBuilder sb2 = new StringBuilder();
        if (j > 0) {
            sb.setLength(0);
            sb.append(1la.A0T(((AnonymousClass09K) this).A01, j));
        }
        this.A01 = r15.A01 ? 0 : j2;
        if (j2 >= 0) {
            sb2.setLength(0);
            sb2.append(1la.A0e(((AnonymousClass09K) this).A01, j2));
        }
        if (!r15.A03) {
            sb.setLength(0);
            sb.append(1la.A0T(((AnonymousClass09K) this).A01, A1W()));
            Log.i("gdrive-activity/show-restore-for-gdrive-backup/local message backup will be used. showing local backup timestamp");
        }
        TextView textView2 = (TextView) findViewById(2131363135);
        if (textView2 != null) {
            int i2 = 2131887678;
            if (r15.A01) {
                i2 = 2131888171;
            }
            textView2.setText(getString(i2, str, sb.toString(), sb2.toString()));
            A1g();
            View findViewById = findViewById(2131362757);
            if (findViewById != null) {
                findViewById.setOnClickListener(new ViewOnClickEBaseShape0S0100000_I0(this, 5));
                this.A04.setOnClickListener(new ViewOnClickEBaseShape0S1200000_I0(this, str, r15, 1));
                this.A0Y.A00("backup_found");
                return;
            }
            throw null;
        }
        throw null;
    }

    public final void A1m(2nU r9) {
        A1b();
        this.A0f.ASf(new RunnableEBaseShape0S1200100_I0(this, r9.A05, r9.A00, r9, 0));
    }

    public final void A1n(boolean z) {
        setTitle(2131886172);
        if (((AnonymousClass09I) this).A0G.A00.getBoolean("gdrive_restore_overwrite_local_files", false)) {
            StringBuilder sb = new StringBuilder("gdrive-activity/msgstore-download/finished, success: ");
            sb.append(z);
            sb.append(", now, restoring it.");
            Log.i(sb.toString());
        } else {
            StringBuilder sb2 = new StringBuilder("gdrive-activity/msgstore-download/not performed since we are using local, success: ");
            sb2.append(z);
            sb2.append(", now, restoring it.");
            Log.i(sb2.toString());
        }
        ((AbstractActivityC03090Fa) this).A01.A0A(z, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001d, code lost:
        if (r32.A0Q.A03() == false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A1o(boolean r33) {
        /*
        // Method dump skipped, instructions count: 269
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.backup.google.RestoreFromBackupActivity.A1o(boolean):void");
    }

    public final void A1p(boolean z) {
        if (!this.A0Q.A06()) {
            if (z) {
                A1r(true, false, 6);
                return;
            }
            ((AbstractActivityC03090Fa) this).A08.A00 = 4;
            A1a();
            A1U(false);
        } else if (((AbstractActivityC03090Fa) this).A08.A05() > 0) {
            ((AbstractActivityC03090Fa) this).A08.A00 = 3;
            A1j(23, null);
            A1c();
        } else {
            ((AbstractActivityC03090Fa) this).A08.A00 = 4;
            A1a();
            A1U(false);
        }
    }

    public final void A1q(boolean z) {
        AnonymousClass00I.A01();
        AnonymousClass00C.A0e(this, 2131364382, 0);
        AnonymousClass00C.A0e(this, 2131364392, 0);
        AnonymousClass00C.A0e(this, 2131362237, 0);
        AnonymousClass00C.A0e(this, 2131363178, 0);
        AnonymousClass00C.A0e(this, 2131363183, 8);
        AnonymousClass00C.A0e(this, 2131363180, 8);
        AnonymousClass00C.A0e(this, 2131363181, 8);
        AnonymousClass00C.A0e(this, 2131363184, 8);
        AnonymousClass00C.A0e(this, 2131363179, 8);
        AnonymousClass00C.A0e(this, 2131363716, 8);
        View findViewById = findViewById(2131363760);
        if (findViewById != null) {
            findViewById.setVisibility(8);
            File databasePath = getDatabasePath("msgstore.db");
            if (databasePath.exists()) {
                boolean delete = databasePath.delete();
                StringBuilder sb = new StringBuilder();
                sb.append("gdrive-activity/show-msgstore-downloading-view/restore-failed ");
                if (!delete) {
                    sb.append(databasePath);
                    sb.append(" exists but cannot be deleted, message restore might fail");
                    Log.w(sb.toString());
                } else {
                    sb.append(databasePath);
                    sb.append(" deleted");
                    Log.i(sb.toString());
                }
            }
            this.A0T.A01();
            A1o(!z);
            return;
        }
        throw null;
    }

    public final void A1r(boolean z, boolean z2, int i) {
        if (z) {
            if (z2) {
                int i2 = 2131889154;
                if (Build.VERSION.SDK_INT < 30) {
                    i2 = 2131889152;
                }
                if (!isFinishing()) {
                    Intent putExtra = new Intent(this, RequestPermissionActivity.class).putExtra("drawable_ids", new int[]{2131232036, 2131232040, 2131232042}).putExtra("permissions", new String[]{"android.permission.GET_ACCOUNTS", "android.permission.READ_CONTACTS", "android.permission.WRITE_CONTACTS", "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"}).putExtra("message_id", 2131889153).putExtra("perm_denial_message_id", i2).putExtra("force_ui", true);
                    putExtra.putExtra("permission_requester_screen", "google_backup");
                    startActivityForResult(putExtra, i);
                    return;
                }
                return;
            }
            int i3 = 2131889199;
            if (Build.VERSION.SDK_INT < 30) {
                i3 = 2131889197;
            }
            RequestPermissionActivity.A07(this, 2131889198, i3, true, i, "google_backup");
        } else if (!isFinishing()) {
            Intent A002 = RequestPermissionActivity.A00(this, 2131889087, 2131889086, true);
            A002.putExtra("permission_requester_screen", "google_backup");
            startActivityForResult(A002, i);
        }
    }

    public final boolean A1s() {
        return this.A0r.size() < this.A0q.size() || this.A0u.get();
    }

    public final boolean A1t(String str, int i) {
        AnonymousClass00I.A00();
        StringBuilder sb = new StringBuilder("gdrive-activity/auth-request account being used is ");
        sb.append(2F0.A0A(str));
        Log.i(sb.toString());
        this.A0f.ASf(new RunnableEBaseShape0S1101000_I0(this, str, i, 0));
        Log.i("gdrive-activity/auth-request blocking on tokenReceived");
        this.A0n.block(100000);
        return this.A0g != null;
    }

    @Override // X.AbstractC03480Hg
    public void AJx(int i) {
        if (i == 10 || i == 11) {
            AnonymousClass00C.A0s("gdrive-activity/dialog-negative-click/dialog-id/", i);
        } else if (i == 12) {
            Log.i("gdrive-activity/restore-media-on-cellular-dialog Wi-Fi unavailable and user agreed to restore media on cellular.");
            ((AnonymousClass09I) this).A0G.A0R();
            Log.i("gdrive-activity/restore-media");
            2F0.A0E(this, new Intent("action_restore_media"));
            Log.i("gdrive-activity/msgstore-download-finish setting result of Google Drive activity to BACKUP_FOUND_AND_RESTORED.");
            setResult(3);
            finish();
        } else if (i == 14) {
            Log.i("gdrive-activity/no-local-or-gdrive-backup-found-dialog no google drive backups found and user is not interested in adding an account for that either.");
            A1d();
            setResult(1);
        } else if (i == 16) {
            Log.i("gdrive-activity/one-time-setup-is-taking-too-long/user-decided-to-cancel");
            2kK.A02();
            this.A0t.set(true);
            if (((AbstractActivityC03090Fa) this).A08.A05() > 0) {
                A1j(23, null);
                A1c();
                return;
            }
            A1Y();
            A1a();
            A1U(false);
        } else if (i == 18) {
            Log.i("gdrive-activity/failed-to-restore-messages-from-selected-backup/user-decided-to-continue");
            A1Y();
            A1a();
            A1U(false);
            A1Z();
        } else if (i == 19) {
            Log.i("gdrive-activity/failed-to-restore-messages/internal-storage-out-of-free-space/user-decided-to-skip");
            A1Y();
            A1a();
            A1U(false);
        } else if (i == 20) {
            if (A1s()) {
                Log.i("gdrive-activity/msgstore-jid-mismatch/restore-from-older");
                A1q(true);
                return;
            }
            Log.i("gdrive-activity/msgstore-jid-mismatch/skip");
            A1Y();
            A1U(false);
            A1Z();
        } else if (i == 21) {
            Log.i("gdrive-activity/failed-to-restore-messages-from-selected-backup/user-decided-to-continue");
            A1Y();
            A1a();
            A1U(false);
            A1Z();
        } else {
            throw new IllegalStateException(AnonymousClass00C.A0E("unexpected dialog box: ", i));
        }
    }

    @Override // X.AbstractC03480Hg
    public void AJy(int i) {
        if (i == 13) {
            Log.i("gdrive-activity/insufficient-space-dialog/neutral-click");
            return;
        }
        throw new IllegalStateException(AnonymousClass00C.A0E("unexpected dialog box: ", i));
    }

    @Override // X.AbstractC03480Hg
    public void AJz(int i) {
        if (i == 10) {
            Log.i("gdrive-activity/show-restore user declined to restore from local backup");
            setResult(2);
            A1d();
        } else if (i == 11) {
            Log.i("gdrive-activity/user-confirmed-skip-restore");
            A1X();
        } else if (i == 12) {
            Log.i("gdrive-activity/restore-media-on-cellular-dialog, Wi-Fi unavailable and user declined to restore media on cellular.");
            setResult(3);
            finish();
        } else if (i == 13) {
            Log.i("gdrive-activity/insufficient-storage-for-restore/user-decided-to-visit-storage-settings");
            startActivity(new Intent("android.settings.INTERNAL_STORAGE_SETTINGS"));
        } else if (i == 14) {
            Log.i("gdrive-activity/one-time-setup no google drive backups found and user decided to add an account or give permission to an existing one.");
            Account[] accountsByType = AccountManager.get(this).getAccountsByType("com.google");
            int length = accountsByType.length;
            int i2 = length + 1;
            String[] strArr = new String[i2];
            for (int i3 = 0; i3 < length; i3++) {
                strArr[i3] = accountsByType[i3].name;
            }
            int i4 = i2 - 1;
            strArr[i4] = getString(2131887711);
            String[] strArr2 = new String[i2];
            boolean[] zArr = new boolean[i2];
            List list = this.A0q;
            list.clear();
            for (int i5 = 0; i5 < length; i5++) {
                list.add(accountsByType[i5]);
                if (this.A0r.contains(accountsByType[i5])) {
                    strArr2[i5] = getString(2131887735);
                    zArr[i5] = false;
                } else {
                    strArr2[i5] = null;
                    zArr[i5] = true;
                }
            }
            zArr[i4] = true;
            SingleChoiceListDialogFragment singleChoiceListDialogFragment = new SingleChoiceListDialogFragment();
            Bundle A012 = AnonymousClass00C.A01("dialog_id", 17);
            A012.putString("title", getString(2131887712));
            A012.putStringArray("multi_line_list_items_key", strArr);
            A012.putStringArray("multi_line_list_item_values_key", strArr2);
            A012.putBooleanArray("list_item_enabled_key", zArr);
            A012.putString("disabled_item_toast_key", getString(2131887671));
            singleChoiceListDialogFragment.A0P(A012);
            if (!2F0.A0F(this)) {
                singleChoiceListDialogFragment.A14(A0N(), null);
            }
        } else if (i == 15) {
            Log.i("gdrive-activity/google-play-services-is-broken/user-decided-to-skip");
            setResult(1);
            finish();
        } else if (i == 16) {
            Log.i("gdrive-activity/one-time-setup-taking-too-long/user-decided-to-wait");
        } else if (i == 18) {
            Log.i("gdrive-activity/failed-to-restore-from-selected-backup/restore-from-older");
            A1q(true);
        } else if (i == 19) {
            A1q(true);
        } else if (i == 20) {
            Log.i("gdrive-activity/msgstore-jid-mistmatch/user-decided-to-reregister");
            AnonymousClass02A r0 = this.A0X;
            Log.i("register/phone/clear-reg-preferences");
            SharedPreferences.Editor edit = r0.A01(1fY.A01(this, RegisterPhone.class)).edit();
            edit.clear();
            if (!edit.commit()) {
                Log.w("register/phone/failed-to-clear-reg-preferences");
            }
            this.A0a.A0A();
            Intent intent = new Intent(this, Main.class);
            intent.setFlags(268435456);
            startActivity(intent);
            System.exit(0);
        } else if (i == 21) {
            Log.i("gdrive-activity/failed-to-restore-from-selected-backup/re-enter-encryption-key");
            A1q(false);
        } else {
            throw new IllegalStateException(AnonymousClass00C.A0E("unexpected dialog box: ", i));
        }
    }

    @Override // X.AbstractC03490Hh
    public void AK0(int i) {
        if (i == 17) {
            Log.i("gdrive-activity/user-dismissed-account-selector-dialog-dismissed");
            A1o(true);
            return;
        }
        throw new IllegalStateException(AnonymousClass00C.A0E("Unexpected dialog id:", i));
    }

    @Override // X.AbstractC03490Hh
    public void APG(int i, int i2, String[] strArr) {
        if (i != 17) {
            throw new IllegalStateException(AnonymousClass00C.A0G("Unexpected dialogId: ", i, " index:", i2));
        } else if (strArr[i2].equals(getString(2131887711))) {
            2F0.A00.execute(new RunnableEBaseShape0S0200000_I0(this, AccountManager.get(this).addAccount("com.google", null, null, null, this, null, null), 4));
            Log.i("gdrive-activity/show-accounts/waiting-for-add-account-activity-to-return");
        } else {
            Intent intent = new Intent();
            intent.putExtra("authAccount", strArr[i2]);
            onActivityResult(3, -1, intent);
        }
    }

    public /* synthetic */ void lambda$displayDriveErrorsDuringMessageStoreDownload$1141$RestoreFromBackupActivity(View view) {
        GoogleBackupService googleBackupService = this.A0I;
        if (googleBackupService != null) {
            googleBackupService.A04(10);
            A1f();
            return;
        }
        throw null;
    }

    public void lambda$displayDriveErrorsDuringMessageStoreDownload$1143$RestoreFromBackupActivity(View view) {
        startActivity(new Intent("android.intent.action.VIEW", C015307e.A00()));
    }

    public /* synthetic */ void lambda$displayDriveErrorsDuringMessageStoreDownload$1144$RestoreFromBackupActivity(View view) {
        Log.i("gdrive-activity/show-skip-gdrive-restore-dialog");
        A1i(11);
    }

    public /* synthetic */ void lambda$showRestorePanelForUsersWithGoogleDriveBackups$1128$RestoreFromBackupActivity(View view) {
        Log.i("gdrive-activity/show-skip-gdrive-restore-dialog");
        A1i(11);
    }

    public /* synthetic */ void lambda$showRestorePanelForUsersWithOnlyLocalBackup$1131$RestoreFromBackupActivity(View view) {
        Log.i("gdrive-activity/show-local-restore-skip-dialog");
        A1i(10);
    }

    public void lambda$showRestorePanelForUsersWithOnlyLocalBackup$1132$RestoreFromBackupActivity(View view) {
        A1j(27, null);
        A1b();
        A1n(true);
    }

    @Override // X.AbstractActivityC03090Fa, X.AnonymousClass09M
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 5) {
            StringBuilder sb = new StringBuilder("gdrive-activity/request-permissions/result/");
            sb.append(i2);
            Log.i(sb.toString());
            A1o(true);
        } else if (i == 6) {
            StringBuilder sb2 = new StringBuilder("gdrive-activity/request-permissions-non-gps/result/");
            sb2.append(i2);
            Log.i(sb2.toString());
            A1p(false);
        } else if (i == 2) {
            StringBuilder sb3 = new StringBuilder("gdrive-activity/request-to-fix-google-play-services/result/");
            sb3.append(i2);
            Log.i(sb3.toString());
            A1o(false);
        } else if (i == 1) {
            if (i2 != -1) {
                return;
            }
            if (intent != null) {
                this.A0g = intent.getStringExtra("authtoken");
                this.A0n.open();
                this.A0f.ASf(new RunnableEBaseShape0S0100000_I0(this, 10));
                return;
            }
            throw null;
        } else if (i == 3) {
            if (i2 != -1) {
                StringBuilder sb4 = new StringBuilder("gdrive-activity/activity-result/account-picker-request/");
                sb4.append(i2);
                Log.e(sb4.toString());
                A1a();
                A1U(false);
            } else if (intent == null) {
                throw null;
            } else if (intent.getExtras() != null) {
                String string = intent.getExtras().getString("authAccount");
                2F0.A0A(string);
                if (string == null) {
                    Log.e("gdrive-activity/activity-result/account-picker-returned-null-account");
                } else {
                    this.A0f.ASf(new RunnableEBaseShape0S1100000_I0(this, string, 4));
                }
            } else {
                throw null;
            }
        } else if (i == 4) {
            StringBuilder sb5 = new StringBuilder("gdrive-activity/activity-result/account-added-request/");
            sb5.append(i2);
            Log.i(sb5.toString());
            Intent intent2 = new Intent(this, RestoreFromBackupActivity.class);
            intent2.setAction("action_show_restore_one_time_setup");
            startActivity(intent2);
        } else if (i == 102) {
            AnonymousClass00C.A0s("gdrive-activity/activity-result/password-input-activity/", i2);
            if (i2 == -1) {
                A1m(this.A0F);
            }
        } else {
            super.onActivityResult(i, i2, intent);
        }
    }

    @Override // X.AnonymousClass09N, X.AnonymousClass09I
    public void onBackPressed() {
        AnonymousClass07P.A03(this);
    }

    @Override // X.AnonymousClass0KJ, X.AbstractActivityC03090Fa, X.AbstractActivityC03100Fb, X.AnonymousClass09L, X.AnonymousClass09K, X.AnonymousClass09N, X.AnonymousClass09M, X.AnonymousClass09H, X.AnonymousClass09G, X.AnonymousClass09J, X.AnonymousClass09I, X.AnonymousClass09O
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A0Z = new 3Vq(this.A0f, this.A0d, ((AnonymousClass09K) this).A01, this.A0V, this.A0W);
        this.A0L = new C02270Av(this).A00(RestoreFromBackupViewModel.class);
        if (!this.A0G.A0A()) {
            Log.i("gdrive-activity/no-google-drive-access-possible");
            setResult(0);
            finish();
            return;
        }
        setContentView(2131558450);
        Toolbar toolbar = (Toolbar) findViewById(2131365004);
        if (!ViewConfiguration.get(getApplicationContext()).hasPermanentMenuKey()) {
            A0k(toolbar);
            AnonymousClass0LK A0c2 = A0c();
            if (A0c2 != null) {
                A0c2.A0L(false);
                A0c2.A0O(false);
            }
        }
        setTitle(2131886173);
        1la.A15((ProgressBar) findViewById(2131363124), C020709z.A00(this, 2131100416));
        1la.A15((ProgressBar) findViewById(2131362238), C020709z.A00(this, 2131100416));
        View findViewById = findViewById(2131363180);
        if (findViewById != null) {
            this.A05 = (ProgressBar) findViewById;
            View findViewById2 = findViewById(2131363181);
            if (findViewById2 != null) {
                this.A08 = (TextView) findViewById2;
                View findViewById3 = findViewById(2131363132);
                if (findViewById3 != null) {
                    this.A03 = findViewById3;
                    View findViewById4 = findViewById(2131364062);
                    if (findViewById4 != null) {
                        this.A04 = (Button) findViewById4;
                        View findViewById5 = findViewById(2131363135);
                        if (findViewById5 != null) {
                            this.A06 = (TextView) findViewById5;
                            this.A0L.A02.A05(this, new 2w3(this));
                            this.A0i = getApplicationContext().bindService(new Intent(getApplicationContext(), GoogleBackupService.class), this.A0k, 1);
                            if (Build.VERSION.SDK_INT < 23) {
                                1la.A14((ImageView) findViewById(2131363133), C020709z.A00(this, 2131099746));
                            }
                            if (bundle == null) {
                                this.A0L.A00 = 21;
                                this.A0R = null;
                                ((AnonymousClass09I) this).A0G.A0E().remove("gdrive_activity_state").remove("gdrive_activity_msgstore_init_key").apply();
                            } else {
                                AnonymousClass00G r0 = ((AnonymousClass09I) this).A0G;
                                Pair pair = new Pair(Integer.valueOf(r0.A00.getInt("gdrive_activity_state", -1)), Integer.valueOf(r0.A00.getInt("gdrive_activity_msgstore_init_key", -1)));
                                RestoreFromBackupViewModel restoreFromBackupViewModel = this.A0L;
                                int intValue = ((Number) pair.first).intValue();
                                if (intValue == -1) {
                                    intValue = 21;
                                }
                                restoreFromBackupViewModel.A00 = intValue;
                                if (intValue == 26) {
                                    int intValue2 = ((Number) pair.second).intValue();
                                    if (intValue2 == -1) {
                                        this.A0R = 1pw.A00(0);
                                    } else {
                                        this.A0R = 1pw.A00(intValue2);
                                    }
                                } else {
                                    this.A0R = null;
                                }
                            }
                            if (this.A0L.A00 == 24 && !this.A0G.A0f.get()) {
                                Log.i("gdrive-activity/create/it looks like restoring from gdrive has been completed but we missed it, let's try again");
                                A1j(22, this.A0R);
                            }
                            Bundle bundle2 = bundle == null ? null : bundle.getBundle("restore_account_data");
                            StringBuilder A0R2 = AnonymousClass00C.A0R("gdrive-activity/create/state/");
                            A0R2.append(A00(this.A0L.A00));
                            Log.i(A0R2.toString());
                            int i = this.A0L.A00;
                            switch (i) {
                                case 21:
                                    Intent intent = getIntent();
                                    if (intent.getAction() == null) {
                                        Log.e("gdrive-activity/create no action provided.");
                                        finish();
                                        return;
                                    }
                                    onNewIntent(intent);
                                    return;
                                case 22:
                                    if (bundle2 != null) {
                                        this.A0F = 2nU.A00(bundle2);
                                        A1j(22, null);
                                        A1l(this.A0F);
                                        this.A0f.ASf(new RunnableEBaseShape0S0200000_I0(this, bundle, 2));
                                        return;
                                    }
                                    throw new IllegalStateException("restore_account_data cannot be null");
                                case 23:
                                    A1j(23, null);
                                    A1c();
                                    return;
                                case 24:
                                    if (bundle2 != null) {
                                        this.A0F = 2nU.A00(bundle2);
                                        A1j(22, null);
                                        A1l(this.A0F);
                                        A1j(24, null);
                                        A1b();
                                        if (!2F0.A0I(((AnonymousClass09I) this).A0G)) {
                                            Log.i("gdrive-activity/create/gdrive-msgstore-download-not-pending");
                                            A1n(true);
                                            return;
                                        }
                                        Log.i("gdrive-activity/create/gdrive-msgstore-download-pending");
                                        return;
                                    }
                                    throw new IllegalStateException("restore_account_data cannot be null");
                                case 25:
                                    if (bundle2 != null) {
                                        this.A0F = 2nU.A00(bundle2);
                                        return;
                                    }
                                    return;
                                case 26:
                                    1pw r1 = this.A0R;
                                    if (bundle2 != null) {
                                        this.A0F = 2nU.A00(bundle2);
                                        A1j(22, null);
                                        A1l(this.A0F);
                                    } else {
                                        A1j(23, null);
                                        A1c();
                                    }
                                    A1b();
                                    StringBuilder sb = new StringBuilder("gdrive-activity/create/msgstore-init-status/");
                                    sb.append(r1);
                                    Log.i(sb.toString());
                                    A1S(r1);
                                    return;
                                case 27:
                                    A1j(23, null);
                                    A1c();
                                    A1b();
                                    A1n(true);
                                    A1j(27, null);
                                    return;
                                default:
                                    StringBuilder A0R3 = AnonymousClass00C.A0R("Unknown state: ");
                                    A0R3.append(i);
                                    throw new IllegalStateException(A0R3.toString());
                            }
                        } else {
                            throw null;
                        }
                    } else {
                        throw null;
                    }
                } else {
                    throw null;
                }
            } else {
                throw null;
            }
        } else {
            throw null;
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 0, 0, 2131889467);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // X.AnonymousClass09L, X.AnonymousClass09M, X.AnonymousClass09I
    public void onDestroy() {
        this.A0h = true;
        if (this.A0I != null) {
            this.A0H.A04(this.A0o);
        }
        if (this.A0i) {
            getApplicationContext().unbindService(this.A0k);
            this.A0I = null;
        }
        this.A0Z.A00();
        super.onDestroy();
    }

    @Override // X.AnonymousClass09M
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (intent.getAction() == null) {
            Log.e("gdrive-activity/new-intent action is null");
            return;
        }
        String action = intent.getAction();
        if (action.hashCode() != -1725923122 || !action.equals("action_show_restore_one_time_setup")) {
            StringBuilder A0R2 = AnonymousClass00C.A0R("gdrive-activity/new-intent unexpected action: ");
            A0R2.append(intent.getAction());
            Log.e(A0R2.toString());
            finish();
            return;
        }
        Dialog A022 = 2F0.A02(AnonymousClass01M.A00(this.A0P.A00), this, 2, new 2nG(this), false);
        if (A022 != null && !2F0.A0F(this)) {
            boolean z = ((AnonymousClass09I) this).A0G.A00.getBoolean("new_jid", false);
            AnonymousClass00C.A1E("gdrive-util/is-new-jid/", z);
            if (!z) {
                Log.i("gdrive-activity/google-play-service-unavailable/existing-user");
                A022.show();
                return;
            }
        }
        if (((AnonymousClass09I) this).A0G.A0G() == null) {
            A1o(false);
        } else if (2F0.A0I(((AnonymousClass09I) this).A0G)) {
            Log.i("gdrive-activity/create/continue-msgstore-download");
            AnonymousClass00C.A0e(this, 2131363178, 8);
            View findViewById = findViewById(2131363184);
            if (findViewById != null) {
                findViewById.setVisibility(0);
                A1b();
                String A0G2 = ((AnonymousClass09I) this).A0G.A0G();
                if (A0G2 != null) {
                    long A0C2 = ((AnonymousClass09I) this).A0G.A0C(A0G2);
                    long A0B2 = ((AnonymousClass09I) this).A0G.A0B(A0G2);
                    Object string = getString(2131887600);
                    if (A0B2 > 0) {
                        string = 1la.A0T(((AnonymousClass09K) this).A01, A0B2);
                    }
                    Object A0T2 = !((AnonymousClass09I) this).A0G.A00.getBoolean("gdrive_restore_overwrite_local_files", false) ? 1la.A0T(((AnonymousClass09K) this).A01, A1W()) : string;
                    Object A0e2 = 1la.A0e(((AnonymousClass09K) this).A01, A0C2);
                    if (this.A0F == null) {
                        this.A0F = new 2nU(A0G2, A0B2, A0C2, ((AnonymousClass09I) this).A0G.A00.getBoolean("gdrive_restore_overwrite_local_files", false), false, ((AnonymousClass09I) this).A0G.A00.getBoolean("gdrive_last_restore_file_is_encrypted", false));
                    }
                    TextView textView = (TextView) findViewById(2131363135);
                    if (textView != null) {
                        textView.setText(getString(2131887678, A0G2, A0T2, A0e2));
                        A1g();
                        A1f();
                        return;
                    }
                    throw null;
                }
                throw null;
            }
            throw null;
        } else if (((AnonymousClass09I) this).A0G.A03() != 0) {
            Log.i("gdrive-activity/create/msgstore-download-already-finished, restoring");
            AnonymousClass00C.A0e(this, 2131363178, 8);
            AnonymousClass00C.A0e(this, 2131363184, 0);
            AnonymousClass0EB r0 = this.A0L.A02;
            r0.A05(this, new 2w3(this));
            Number number = (Number) r0.A01();
            if (number != null) {
                this.A06.setText(SettingsChat.A02(this, ((AnonymousClass09K) this).A01, number.longValue()));
            }
            RestoreFromBackupViewModel restoreFromBackupViewModel = this.A0L;
            restoreFromBackupViewModel.A05.ASf(new RunnableEBaseShape0S0100000_I0(restoreFromBackupViewModel, 27));
            ((AnonymousClass09I) this).A0G.A00.getBoolean("gdrive_last_restore_file_is_encrypted", false);
            A1g();
            A1b();
            A1n(true);
        } else {
            A1d();
            setResult(2);
        }
    }

    @Override // X.AnonymousClass09I
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 0) {
            return super.onOptionsItemSelected(menuItem);
        }
        String str = "one-time-restore";
        this.A0b.A02("one-time-restore");
        3Vq r2 = this.A0Z;
        2Eq r3 = this.A0b;
        1pw r4 = this.A0R;
        if (r4 != null) {
            int i = r4.A00;
            if (i == 3) {
                str = "one-time-restore-jid-mismatch";
            } else if (i == 4) {
                str = "one-time-restore-integrity-check-failed";
            }
        }
        int A002 = AnonymousClass01M.A00(this.A0P.A00);
        if (A002 != 0) {
            str = A002 != 1 ? A002 != 2 ? A002 != 3 ? AnonymousClass00C.A0J(str, "-gs-invalid") : AnonymousClass00C.A0J(str, "-gs-disabled") : AnonymousClass00C.A0J(str, "-update-gs") : AnonymousClass00C.A0J(str, "-no-gs");
        }
        r2.A01(this, r3, str);
        return true;
    }

    @Override // X.AnonymousClass09L, X.AnonymousClass09N, X.AnonymousClass09M, X.AnonymousClass09O
    public void onSaveInstanceState(Bundle bundle) {
        Bundle bundle2;
        super.onSaveInstanceState(bundle);
        2nU r0 = this.A0F;
        if (r0 != null) {
            StringBuilder A0R2 = AnonymousClass00C.A0R("gdrive-activity/save-state/restore-account-data/ ");
            A0R2.append(r0);
            Log.i(A0R2.toString());
            2nU r1 = this.A0F;
            synchronized (r1) {
                bundle2 = new Bundle();
                bundle2.putString("account_name", r1.A05);
                bundle2.putLong("total_backup_size", r1.A00);
                bundle2.putLong("last_modified", r1.A04);
                bundle2.putBoolean("overwrite_local_files", r1.A03);
                bundle2.putBoolean("is_download_size_zero", r1.A01);
                bundle2.putBoolean("is_encrypted_backup", r1.A02);
            }
            bundle.putBundle("restore_account_data", bundle2);
        }
        AnonymousClass00C.A1K(AnonymousClass00C.A0R("gdrive-activity/save-state/total-download-size/"), this.A01);
        bundle.putLong("total_download_size", this.A01);
        AnonymousClass00C.A1K(new StringBuilder("gdrive-activity/save-state/media-download-size/"), this.A02);
        bundle.putLong("media_download_size", this.A02);
    }

    @Override // android.app.Activity
    public void setTitle(int i) {
        TextView textView = (TextView) findViewById(2131365005);
        if (textView != null) {
            textView.setText(i);
            return;
        }
        throw null;
    }
}
