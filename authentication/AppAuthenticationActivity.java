package com.whatsapp.authentication;

import X.AnonymousClass0CQ;
import X.AnonymousClass0CR;
import X.AnonymousClass0E8;
import X.AnonymousClass0JM;
import X.AnonymousClass0LF;
import X.AnonymousClass1XD;
import X.AnonymousClass1XE;
import X.C020709z;
import X.C06550Xo;
import X.C06560Xp;
import X.C06570Xq;
import X.RunnableC24761Cu;
import X.View$OnClickListenerC24651Cf;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.util.Log;

public class AppAuthenticationActivity extends AnonymousClass0LF implements AnonymousClass0JM {
    public int A00;
    public C06560Xp A01;
    public C06570Xq A02;
    public AnonymousClass0E8 A03;
    public AnonymousClass0CQ A04;
    public AnonymousClass0CR A05;
    public FingerprintView A06;
    public Runnable A07;

    public static Intent A00(Context context) {
        Intent intent = new Intent(context, AppAuthenticationActivity.class);
        intent.setFlags(131072);
        return intent;
    }

    public final void A1G() {
        if (this.A00 != 0) {
            this.A04.A02();
            Intent intent = new Intent();
            intent.putExtra("appWidgetId", this.A00);
            setResult(-1, intent);
            return;
        }
        setResult(-1);
    }

    public final void A1H() {
        Log.i("AuthenticationActivity/start-listening");
        if (this.A05.A07()) {
            this.A02.A01(this.A01);
            return;
        }
        this.A06.removeCallbacks(this.A07);
        AnonymousClass0E8 r0 = new AnonymousClass0E8();
        this.A03 = r0;
        this.A05.A02(r0, this);
        FingerprintView fingerprintView = this.A06;
        fingerprintView.A03(fingerprintView.A04);
    }

    @Override // X.AnonymousClass0JM
    public void AI3(int i, CharSequence charSequence) {
        Log.i("AppAuthenticationActivity/fingerprint-error");
        this.A05.A03(true);
        if (i == 7) {
            Log.i("AppAuthenticationActivity/fingerprint-error-too-many-attempts");
            charSequence = getString(2131887508, 30);
            this.A06.removeCallbacks(this.A07);
            this.A06.postDelayed(this.A07, 30000);
        }
        this.A06.A04(charSequence);
    }

    @Override // X.AnonymousClass0JM
    public void AI4() {
        Log.i("AppAuthenticationActivity/fingerprint-failed");
        this.A06.A00();
    }

    @Override // X.AnonymousClass0JM
    public void AI6(int i, CharSequence charSequence) {
        Log.i("AppAuthenticationActivity/fingerprint-help");
        this.A06.A05(charSequence.toString());
    }

    @Override // X.AnonymousClass0JM
    public void AI7(byte[] bArr) {
        Log.i("AppAuthenticationActivity/fingerprint-success");
        this.A05.A03(false);
        this.A06.A01();
    }

    public /* synthetic */ void lambda$onCreate$1095$AppAuthenticationActivity(View view) {
        this.A02.A01(this.A01);
    }

    @Override // X.AnonymousClass09N, X.AnonymousClass09I
    public void onBackPressed() {
        ActivityManager A012 = this.A0F.A01();
        if (A012 == null || A012.getLockTaskModeState() != 2) {
            setResult(0);
            finishAffinity();
        }
    }

    @Override // X.AnonymousClass09L, X.AnonymousClass09K, X.AnonymousClass09N, X.AnonymousClass09M, X.AnonymousClass09J, X.AnonymousClass09I, X.AnonymousClass0LF, X.AnonymousClass09O
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.A00 = extras.getInt("appWidgetId", 0);
        }
        if (!this.A05.A05()) {
            Log.i("AppAuthenticationActivity/onCreate: setting not enabled");
            A1G();
            finish();
            overridePendingTransition(0, 17432577);
            return;
        }
        setContentView(2131558440);
        ((TextView) findViewById(2131362021)).setText(2131886229);
        View findViewById = findViewById(2131361974);
        this.A06 = (FingerprintView) findViewById(2131363037);
        if (this.A05.A07()) {
            findViewById.setVisibility(0);
            this.A06.setVisibility(8);
            this.A02 = new C06570Xq(this, C020709z.A05(this), new AnonymousClass1XD(this));
            C06550Xo r0 = new C06550Xo();
            r0.A02 = getString(2131886235);
            r0.A04 = true;
            r0.A03 = false;
            this.A01 = r0.A00();
            findViewById.setOnClickListener(new View$OnClickListenerC24651Cf(this));
            return;
        }
        findViewById.setVisibility(8);
        this.A06.setVisibility(0);
        this.A06.A00 = new AnonymousClass1XE(this);
        this.A07 = new RunnableC24761Cu(this);
    }

    @Override // X.AnonymousClass09L, X.AnonymousClass09M, X.AnonymousClass09I
    public void onDestroy() {
        super.onDestroy();
        FingerprintView fingerprintView = this.A06;
        if (fingerprintView != null) {
            fingerprintView.A00 = null;
        }
    }

    @Override // X.AnonymousClass09M, X.AnonymousClass09I
    public void onPause() {
        super.onPause();
        Log.i("AuthenticationActivity/stop-listening");
        if (this.A05.A07()) {
            this.A02.A00();
            return;
        }
        this.A06.removeCallbacks(this.A07);
        AnonymousClass0E8 r0 = this.A03;
        if (r0 != null) {
            try {
                r0.A01();
            } catch (NullPointerException e) {
                e.getMessage();
            } catch (Throwable th) {
                this.A03 = null;
                throw th;
            }
            this.A03 = null;
        }
    }

    @Override // X.AnonymousClass09M, X.AnonymousClass09I
    public void onResume() {
        super.onResume();
        if (!this.A05.A04()) {
            Log.i("AppAuthenticationActivity/not-enrolled");
            setResult(-1);
            finish();
            return;
        }
        Log.i("AuthenticationActivity/start-listening");
        if (this.A05.A07()) {
            this.A02.A01(this.A01);
            return;
        }
        this.A06.removeCallbacks(this.A07);
        AnonymousClass0E8 r0 = new AnonymousClass0E8();
        this.A03 = r0;
        this.A05.A02(r0, this);
        FingerprintView fingerprintView = this.A06;
        fingerprintView.A03(fingerprintView.A04);
    }
}
