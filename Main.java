package com.whatsapp;

import X.1fX;
import X.1hb;
import X.2Nw;
import X.AbstractActivityC03090Fa;
import X.AnonymousClass00A;
import X.AnonymousClass00C;
import X.AnonymousClass01M;
import X.AnonymousClass01O;
import X.AnonymousClass028;
import X.AnonymousClass02S;
import X.AnonymousClass07X;
import X.AnonymousClass09I;
import X.AnonymousClass09K;
import X.AnonymousClass0H0;
import X.AnonymousClass0L5;
import X.AnonymousClass187;
import X.AnonymousClass188;
import X.AnonymousClass189;
import X.AnonymousClass1WU;
import X.C015307e;
import X.C03390Gu;
import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import com.whatsapp.registration.EULA;
import com.whatsapp.registration.RegisterName;
import com.whatsapp.registration.VerifySms;
import com.whatsapp.registration.VerifyTwoFactorAuth;
import com.whatsapp.util.Log;
import com.whatsapp.util.WhatsAppLibLoader;

public class Main extends AnonymousClass0H0 {
    public Uri A00;
    public C03390Gu A01;
    public AnonymousClass0L5 A02;
    public AnonymousClass1WU A03;
    public AnonymousClass02S A04;
    public C015307e A05;
    public 1fX A06;
    public 2Nw A07;
    public AnonymousClass01O A08;
    public WhatsAppLibLoader A09;
    public AnonymousClass00A A0A;
    public boolean A0B;

    @Override // X.AbstractActivityC03090Fa
    public void A1Q() {
        Intent intent;
        AnonymousClass028 r0 = ((AbstractActivityC03090Fa) this).A00;
        r0.A05();
        if (r0.A00 == null) {
            if (!isFinishing()) {
                int A012 = ((AbstractActivityC03090Fa) this).A0J.A01();
                if (A012 != 0) {
                    if (A012 != 1) {
                        if (A012 == 2) {
                            Log.i("main/no-me/regname");
                            ((1hb) this.A0A.get()).A01("verification_successful", "continue");
                            intent = new Intent(this, RegisterName.class);
                        } else if (A012 == 4) {
                            intent = new Intent(this, VerifySms.class);
                            if (this.A01.A04()) {
                                intent.putExtra("changenumber", true);
                            }
                        } else if (A012 != 5) {
                            if (A012 == 6) {
                                intent = new Intent();
                                intent.setClassName(getPackageName(), "com.whatsapp.account.delete.DeleteAccountConfirmation");
                            } else if (A012 != 7) {
                                StringBuilder sb = new StringBuilder("main/invalid/registration state=");
                                sb.append(A012);
                                sb.append("; default to EULA");
                                Log.e(sb.toString());
                                ((AbstractActivityC03090Fa) this).A0I.A0B(0);
                                intent = new Intent(this, EULA.class);
                            } else {
                                ((1hb) this.A0A.get()).A01("verification_successful", "continue");
                                intent = new Intent(this, VerifyTwoFactorAuth.class);
                                if (this.A01.A04()) {
                                    intent.putExtra("changenumber", true);
                                }
                            }
                        }
                    }
                    ((AbstractActivityC03090Fa) this).A0I.A0B(0);
                    intent = new Intent(this, EULA.class);
                } else {
                    intent = new Intent(this, EULA.class);
                    if (getIntent().getBooleanExtra("show_registration_first_dlg", false)) {
                        intent.putExtra("show_registration_first_dlg", true);
                    }
                }
                if (this.A0B && !isFinishing()) {
                    startActivity(intent);
                }
                finish();
            }
            Log.i("main/me App.me is null, can't proceed.");
        } else if (((AbstractActivityC03090Fa) this).A0J.A01() == 2) {
            Log.i("main/me/regname");
            ((1hb) this.A0A.get()).A01("verification_successful", "continue");
            Intent intent2 = new Intent(this, RegisterName.class);
            if (this.A0B && !isFinishing()) {
                startActivity(intent2);
            }
            finish();
        } else {
            ((AbstractActivityC03090Fa) this).A0I.A0B(3);
            Log.i("main/verified/setregverified");
            this.A08.ASj(new AnonymousClass189(this));
        }
    }

    public void A1W() {
        Uri uri = this.A00;
        if (uri != null && this.A03 == null) {
            AnonymousClass01O r1 = this.A08;
            AnonymousClass1WU r2 = new AnonymousClass1WU(this, uri.getPath());
            this.A03 = r2;
            r1.ASi(r2, new Void[0]);
        } else if (((AbstractActivityC03090Fa) this).A0E.A0m) {
            A1X();
        } else {
            Log.i("main/messageStoreVerified/gotoActivity");
            Log.i("main/gotoActivity");
            A1Y();
        }
    }

    public final void A1X() {
        AnonymousClass0L5 r0 = this.A02;
        if (r0 == null || r0.A00() != AsyncTask.Status.RUNNING) {
            AnonymousClass0L5 r02 = new AnonymousClass0L5(this);
            this.A02 = r02;
            this.A08.ASi(r02, new Void[0]);
            return;
        }
        Log.i("main/show dialog sync");
        if (this.A0B) {
            AnonymousClass01M.A0t(this, 104);
        }
    }

    public final void A1Y() {
        if (!isFinishing()) {
            Intent intent = getIntent();
            if (intent != null && !"android.intent.action.MAIN".equals(intent.getAction()) && (intent.getFlags() & 67108864) != 0 && ((AnonymousClass09I) this).A0G.A00.getInt("shortcut_version", 0) == 0) {
                Log.i("main/recreate_shortcut");
                RegisterName.A00(this, getString(2131886236));
                RegisterName.A01(this, getString(2131886236));
                AnonymousClass00C.A0i(((AnonymousClass09I) this).A0G, "shortcut_version", 1);
            }
            if (this.A0B && !isFinishing()) {
                startActivity(new Intent(this, HomeActivity.class));
                overridePendingTransition(0, 0);
            }
            finish();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.whatsapp.Main */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v26, types: [com.whatsapp.DisplayExceptionDialogFactory$UnsupportedDeviceDialogFragment, androidx.fragment.app.DialogFragment] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // X.AbstractActivityC03090Fa, X.AbstractActivityC03100Fb, X.AnonymousClass09L, X.AnonymousClass09K, X.AnonymousClass09N, X.AnonymousClass09M, X.AnonymousClass09H, X.AnonymousClass09G, X.AnonymousClass09J, X.AnonymousClass09I, X.AnonymousClass0H0, X.AnonymousClass09O
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r5) {
        /*
        // Method dump skipped, instructions count: 260
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.Main.onCreate(android.os.Bundle):void");
    }

    @Override // X.AbstractActivityC03090Fa, X.AnonymousClass09G
    public Dialog onCreateDialog(int i) {
        setTheme(2131952225);
        if (i != 0) {
            return super.onCreateDialog(i);
        }
        Log.i("main/dialog/upgrade");
        ((AnonymousClass09K) this).A02.A01();
        AnonymousClass07X r0 = new AnonymousClass07X(this);
        r0.A03(2131890416);
        r0.A02(2131890415);
        r0.A01.A0J = false;
        r0.A06(2131890940, new AnonymousClass188(this));
        r0.A04(2131888095, new AnonymousClass187(this));
        return r0.A00();
    }

    @Override // X.AnonymousClass09L, X.AnonymousClass09M, X.AnonymousClass09G, X.AnonymousClass09I
    public void onStart() {
        super.onStart();
        this.A0B = true;
    }

    @Override // X.AnonymousClass09L, X.AnonymousClass09M
    public void onStop() {
        super.onStop();
        this.A0B = false;
    }
}
