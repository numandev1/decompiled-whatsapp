package com.whatsapp.authentication;

import X.1eE;
import X.AbstractActivityC04780Nc;
import X.AbstractC02340Bc;
import X.AnonymousClass00C;
import X.AnonymousClass02T;
import X.AnonymousClass09G;
import X.AnonymousClass09I;
import X.AnonymousClass09K;
import X.AnonymousClass0CQ;
import X.AnonymousClass0LK;
import X.AnonymousClass16C;
import X.AnonymousClass1XC;
import X.AnonymousClass1XG;
import X.C020709z;
import X.C06550Xo;
import X.C06560Xp;
import X.C06570Xq;
import X.View$OnClickListenerC24621Cc;
import X.View$OnClickListenerC24631Cd;
import X.View$OnClickListenerC24641Ce;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import com.whatsapp.util.Log;

public class AppAuthSettingsActivity extends AbstractActivityC04780Nc {
    public View A00;
    public View A01;
    public RadioButton A02;
    public RadioButton A03;
    public RadioButton A04;
    public SwitchCompat A05;
    public SwitchCompat A06;
    public C06560Xp A07;
    public C06570Xq A08;
    public AnonymousClass0CQ A09;
    public FingerprintBottomSheet A0A;
    public AnonymousClass02T A0B;
    public 1eE A0C;
    public final AnonymousClass1XG A0D = new AnonymousClass16C(this);

    public final void A1Q() {
        Log.i("AppAuthSettingsActivity/disable-setting");
        ((AnonymousClass09G) this).A06.A03(true);
        AnonymousClass00C.A0l(((AnonymousClass09I) this).A0G, "privacy_fingerprint_enabled", false);
        this.A0C.A04();
        A1S(false);
        this.A05.setChecked(false);
        this.A09.A02();
        ((AnonymousClass09G) this).A06.A01(this);
    }

    public /* synthetic */ void A1R(long j) {
        AnonymousClass00C.A0j(((AnonymousClass09I) this).A0G, "privacy_fingerprint_timeout", j);
    }

    public final void A1S(boolean z) {
        int i = 8;
        Log.i("AppAuthSettingsActivity/update-dependent-views");
        this.A01.setVisibility(z ? 0 : 8);
        View view = this.A00;
        if (z) {
            i = 0;
        }
        view.setVisibility(i);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.whatsapp.authentication.AppAuthSettingsActivity */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [com.whatsapp.authentication.SetupDeviceAuthDialog, androidx.fragment.app.DialogFragment] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void lambda$onCreate$1092$AppAuthSettingsActivity(android.view.View r4) {
        /*
            r3 = this;
            r2 = 0
            androidx.appcompat.widget.SwitchCompat r0 = r3.A05
            boolean r0 = r0.isChecked()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x004a
            X.0CR r0 = r3.A06
            boolean r0 = r0.A04()
            if (r0 == 0) goto L_0x003c
            java.lang.String r0 = "AppAuthSettingsActivity/show-bottom-sheet"
            com.whatsapp.util.Log.i(r0)
            X.0CR r0 = r3.A06
            boolean r0 = r0.A07()
            if (r0 == 0) goto L_0x0028
            X.0Xq r0 = r3.A08
            X.0Xp r1 = r3.A07
            r0.A01(r1)
        L_0x0027:
            return
        L_0x0028:
            r0 = 2131887499(0x7f12058b, float:1.9409607E38)
            r1 = 2131887498(0x7f12058a, float:1.9409605E38)
            com.whatsapp.authentication.FingerprintBottomSheet r0 = com.whatsapp.authentication.FingerprintBottomSheet.A00(r0, r1, r2, r2)
            r3.A0A = r0
            X.1XG r1 = r3.A0D
            r0.A04 = r1
            r3.AVN(r0)
            goto L_0x0027
        L_0x003c:
            java.lang.String r0 = "AppAuthSettingsActivity/setup"
            com.whatsapp.util.Log.i(r0)
            com.whatsapp.authentication.SetupDeviceAuthDialog r0 = new com.whatsapp.authentication.SetupDeviceAuthDialog
            r0.<init>()
            r3.AVN(r0)
            goto L_0x0027
        L_0x004a:
            r3.A1Q()
            goto L_0x0027
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.authentication.AppAuthSettingsActivity.lambda$onCreate$1092$AppAuthSettingsActivity(android.view.View):void");
    }

    public void lambda$onCreate$1093$AppAuthSettingsActivity(View view) {
        boolean z = !this.A06.isChecked();
        AnonymousClass00C.A0l(((AnonymousClass09I) this).A0G, "privacy_fingerprint_show_notification_content", z);
        this.A06.setChecked(z);
        this.A0B.A05(null, 1);
        this.A0C.A04();
        this.A09.A02();
    }

    @Override // X.AbstractActivityC04780Nc, X.AnonymousClass09L, X.AnonymousClass09K, X.AnonymousClass09N, X.AnonymousClass09M, X.AnonymousClass09H, X.AnonymousClass09G, X.AnonymousClass09J, X.AnonymousClass09I, X.AnonymousClass09O
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131558471);
        AnonymousClass0LK A0c = A0c();
        if (A0c != null) {
            A0c.A0L(true);
            TextView textView = (TextView) findViewById(2131364541);
            TextView textView2 = (TextView) findViewById(2131364540);
            if (((AnonymousClass09G) this).A06.A07()) {
                setTitle(2131889839);
                textView.setText(2131889826);
                textView2.setText(2131889827);
                this.A08 = new C06570Xq(this, C020709z.A05(this), new AnonymousClass1XC(this));
                C06550Xo r0 = new C06550Xo();
                r0.A01 = getString(2131886306);
                r0.A02 = getString(2131886307);
                r0.A04 = false;
                r0.A03 = false;
                this.A07 = r0.A00();
            } else {
                setTitle(2131889840);
                textView.setText(2131889828);
                textView2.setText(2131889829);
                if (bundle != null) {
                    AbstractC02340Bc A0N = A0N();
                    FingerprintBottomSheet fingerprintBottomSheet = (FingerprintBottomSheet) A0N.A0Q.A01(FingerprintBottomSheet.class.getName());
                    this.A0A = fingerprintBottomSheet;
                    if (fingerprintBottomSheet != null) {
                        fingerprintBottomSheet.A04 = this.A0D;
                    }
                }
            }
            this.A01 = findViewById(2131364982);
            this.A05 = (SwitchCompat) findViewById(2131361973);
            this.A00 = findViewById(2131363796);
            this.A06 = (SwitchCompat) findViewById(2131363792);
            findViewById(2131361972).setOnClickListener(new View$OnClickListenerC24621Cc(this));
            this.A00.setOnClickListener(new View$OnClickListenerC24641Ce(this));
            this.A02 = (RadioButton) findViewById(2131364983);
            this.A03 = (RadioButton) findViewById(2131364984);
            this.A04 = (RadioButton) findViewById(2131364985);
            this.A02.setText(2131886234);
            this.A03.setText(((AnonymousClass09K) this).A01.A0C(2131755009, 1, 1));
            this.A04.setText(((AnonymousClass09K) this).A01.A0C(2131755009, 30, 30));
            this.A02.setOnClickListener(new View$OnClickListenerC24631Cd(this, 0));
            this.A03.setOnClickListener(new View$OnClickListenerC24631Cd(this, 60000));
            this.A04.setOnClickListener(new View$OnClickListenerC24631Cd(this, 1800000));
            return;
        }
        throw null;
    }

    @Override // X.AnonymousClass09L, X.AnonymousClass09M, X.AnonymousClass09I
    public void onDestroy() {
        super.onDestroy();
        if (((AnonymousClass09G) this).A06.A07()) {
            this.A08.A00();
            return;
        }
        FingerprintBottomSheet fingerprintBottomSheet = this.A0A;
        if (fingerprintBottomSheet != null) {
            fingerprintBottomSheet.A04 = null;
            this.A0A = null;
        }
    }

    @Override // X.AnonymousClass09M, X.AnonymousClass09G, X.AnonymousClass09I
    public void onResume() {
        boolean z = false;
        super.onResume();
        Log.i("AppAuthSettingsActivity/update-ui");
        boolean z2 = ((AnonymousClass09I) this).A0G.A00.getBoolean("privacy_fingerprint_enabled", false);
        long j = ((AnonymousClass09I) this).A0G.A00.getLong("privacy_fingerprint_timeout", 60000);
        boolean z3 = ((AnonymousClass09I) this).A0G.A00.getBoolean("privacy_fingerprint_show_notification_content", true);
        A1S(z2);
        StringBuilder sb = new StringBuilder("AppAuthSettingsActivity/update-timeout: ");
        sb.append(j);
        Log.i(sb.toString());
        this.A02.setChecked(j == 0);
        this.A03.setChecked(j == 60000);
        RadioButton radioButton = this.A04;
        if (j == 1800000) {
            z = true;
        }
        radioButton.setChecked(z);
        this.A05.setChecked(z2);
        this.A06.setChecked(z3);
    }
}
