package com.whatsapp.acceptinvitelink;

import X.1dn;
import X.1do;
import X.1eQ;
import X.1f5;
import X.1fZ;
import X.1fw;
import X.1iG;
import X.1iH;
import X.1iL;
import X.1mz;
import X.1uY;
import X.23h;
import X.2UQ;
import X.2e4;
import X.2e5;
import X.AnonymousClass00C;
import X.AnonymousClass01G;
import X.AnonymousClass01O;
import X.AnonymousClass028;
import X.AnonymousClass09I;
import X.AnonymousClass0NM;
import X.AnonymousClass0Sq;
import X.AnonymousClass0Ss;
import X.AnonymousClass1BV;
import X.AnonymousClass1BW;
import X.AnonymousClass1BX;
import X.AnonymousClass1BY;
import X.C000100c;
import X.C002701g;
import X.C003101p;
import X.C020709z;
import X.C05780Sn;
import X.C05790Sp;
import X.ViewTreeObserver$OnGlobalLayoutListenerC05800Sr;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.nfc.NdefMessage;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.util.Log;
import java.nio.charset.Charset;

public class AcceptInviteLinkActivity extends AnonymousClass0NM {
    public AnonymousClass028 A00;
    public 1dn A01;
    public 1do A02;
    public 23h A03;
    public 1uY A04;
    public C000100c A05;
    public AnonymousClass01G A06;
    public 1f5 A07;
    public 1fZ A08;
    public 1eQ A09;
    public 2e5 A0A;
    public C003101p A0B;
    public 1iH A0C;
    public 1iL A0D;
    public AnonymousClass01O A0E;
    public Runnable A0F;
    public final 1fw A0G = new C05780Sn(this);

    public static String A00(Uri uri) {
        if (uri == null) {
            return null;
        }
        if ("whatsapp".equals(uri.getScheme())) {
            if (!"chat".equals(uri.getHost())) {
                return null;
            }
            String queryParameter = uri.getQueryParameter("code");
            return queryParameter == null ? uri.getLastPathSegment() : queryParameter;
        } else if (!"http".equals(uri.getScheme()) && !"https".equals(uri.getScheme())) {
            return null;
        } else {
            if ("chat.whatsapp.com".equals(uri.getHost())) {
                return uri.getLastPathSegment();
            }
            if (!"whatsapp.com".equals(uri.getHost()) || !"chat".equals(uri.getLastPathSegment())) {
                return null;
            }
            return uri.getQueryParameter("code");
        }
    }

    public static void A01(Activity activity, Intent intent) {
        String A002;
        Uri data = intent.getData();
        String action = intent.getAction();
        if ("android.nfc.action.NDEF_DISCOVERED".equals(action)) {
            NdefMessage ndefMessage = (NdefMessage) intent.getParcelableArrayExtra("android.nfc.extra.NDEF_MESSAGES")[0];
            if ("application/com.whatsapp.join".equals(new String(ndefMessage.getRecords()[0].getType(), Charset.forName("US-ASCII")))) {
                String str = new String(ndefMessage.getRecords()[0].getPayload(), Charset.forName("US-ASCII"));
                if (TextUtils.isEmpty(str)) {
                    Log.e("acceptlink/nfc/no-code");
                    A002 = str;
                } else {
                    AnonymousClass00C.A16("acceptlink/nfc/code/", str);
                    A002 = str;
                }
            } else {
                return;
            }
        } else if (!"android.intent.action.VIEW".equals(action) || (A002 = A00(data)) == null) {
            return;
        }
        intent.setData(null);
        Intent intent2 = new Intent(activity, AcceptInviteLinkActivity.class);
        intent2.putExtra("code", A002);
        activity.startActivity(intent2);
    }

    public static void A02(AcceptInviteLinkActivity acceptInviteLinkActivity, C003101p r7, int i) {
        if (r7 != null) {
            if (acceptInviteLinkActivity.A07.A0D(r7)) {
                1eQ r0 = acceptInviteLinkActivity.A09;
                if (r0.A01(r7).A0B(r0.A01)) {
                    StringBuilder sb = new StringBuilder("acceptlink/processcode/exists/");
                    sb.append(r7);
                    Log.i(sb.toString());
                    Intent intent = new Intent();
                    intent.setComponent(new ComponentName(acceptInviteLinkActivity, "com.whatsapp.Conversation"));
                    intent.putExtra("jid", C002701g.A0G(r7));
                    intent.addFlags(335544320);
                    1iG.A0T(intent, "AcceptInviteLinkActivity", acceptInviteLinkActivity.A05);
                    acceptInviteLinkActivity.A16(intent, true);
                    return;
                }
            }
            StringBuilder sb2 = new StringBuilder("acceptlink/sendjoin/willwait/");
            sb2.append(r7);
            Log.i(sb2.toString());
            StringBuilder sb3 = new StringBuilder("acceptlink/wait/");
            sb3.append(acceptInviteLinkActivity.A0B);
            Log.i(sb3.toString());
            Runnable runnable = acceptInviteLinkActivity.A0F;
            if (runnable == null) {
                runnable = new AnonymousClass1BY(acceptInviteLinkActivity);
                acceptInviteLinkActivity.A0F = runnable;
            }
            ((AnonymousClass09I) acceptInviteLinkActivity).A0A.A02.postDelayed(runnable, 32000);
            return;
        }
        AnonymousClass00C.A0r("acceptlink/sendjoin/failed/", i);
        if (i == 401) {
            acceptInviteLinkActivity.A1Q(2131887449);
        } else if (i == 404) {
            acceptInviteLinkActivity.A1Q(2131887451);
        } else if (i == 419) {
            acceptInviteLinkActivity.A1Q(2131887448);
        } else if (i == 409) {
            C003101p r02 = acceptInviteLinkActivity.A0B;
            Intent intent2 = new Intent();
            intent2.setComponent(new ComponentName(acceptInviteLinkActivity, "com.whatsapp.Conversation"));
            intent2.putExtra("jid", C002701g.A0G(r02));
            intent2.addFlags(335544320);
            1iG.A0T(intent2, "AcceptInviteLinkActivity", acceptInviteLinkActivity.A05);
            acceptInviteLinkActivity.A16(intent2, true);
            acceptInviteLinkActivity.A0D.A0E(acceptInviteLinkActivity.A0B, (String) null);
        } else if (i != 410) {
            acceptInviteLinkActivity.A1Q(2131889423);
        } else {
            acceptInviteLinkActivity.A1Q(2131887452);
        }
    }

    public static void A03(AcceptInviteLinkActivity acceptInviteLinkActivity, String str, 2e4 r5, int i) {
        if (r5 != null) {
            1f5 r0 = acceptInviteLinkActivity.A07;
            C003101p r1 = r5.A01;
            if (r0.A0D(r1) && acceptInviteLinkActivity.A09.A05(r1)) {
                StringBuilder A0R = AnonymousClass00C.A0R("acceptlink/processcode/exists/");
                A0R.append(r1);
                Log.i(A0R.toString());
                ((AnonymousClass09I) acceptInviteLinkActivity).A0A.A06(2131886112, 1);
                acceptInviteLinkActivity.A1R(str, r5, true);
            } else if (!acceptInviteLinkActivity.AFX()) {
                StringBuilder A0R2 = AnonymousClass00C.A0R("acceptlink/processcode/showconfirmation/");
                A0R2.append(r1);
                Log.i(A0R2.toString());
                acceptInviteLinkActivity.A1R(str, r5, false);
            } else {
                StringBuilder A0R3 = AnonymousClass00C.A0R("acceptlink/processcode/activityended/");
                A0R3.append(r1);
                Log.i(A0R3.toString());
            }
        } else {
            AnonymousClass00C.A0r("acceptlink/processcode/failed/", i);
            if (i == 0) {
                acceptInviteLinkActivity.A1Q(2131888391);
            } else if (i == 401) {
                acceptInviteLinkActivity.A1Q(2131887449);
            } else if (i == 404) {
                acceptInviteLinkActivity.A1Q(2131887451);
            } else if (i == 406) {
                acceptInviteLinkActivity.A1Q(2131887450);
            } else if (i == 410) {
                acceptInviteLinkActivity.A1Q(2131887452);
            } else if (i != 419) {
                acceptInviteLinkActivity.A1Q(2131889423);
            } else {
                acceptInviteLinkActivity.A1Q(2131887448);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [android.view.View$OnClickListener, X.0So] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A1Q(int r3) {
        /*
            r2 = this;
            r1 = 4
            r0 = 2131364214(0x7f0a0976, float:1.8348259E38)
            android.view.View r0 = r2.findViewById(r0)
            r0.setVisibility(r1)
            r0 = 2131363238(0x7f0a05a6, float:1.834628E38)
            android.view.View r0 = r2.findViewById(r0)
            r0.setVisibility(r1)
            r0 = 2131362925(0x7f0a046d, float:1.8345644E38)
            android.view.View r0 = r2.findViewById(r0)
            r1 = 0
            r0.setVisibility(r1)
            r0 = 2131362931(0x7f0a0473, float:1.8345657E38)
            android.view.View r0 = r2.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setText(r3)
            r0 = 2131363812(0x7f0a07e4, float:1.8347443E38)
            android.view.View r0 = r2.findViewById(r0)
            X.0So r1 = new X.0So
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.acceptinvitelink.AcceptInviteLinkActivity.A1Q(int):void");
    }

    public final void A1R(String str, 2e4 r12, boolean z) {
        this.A0A.A01(r12, 0);
        C003101p r0 = r12.A01;
        1iL r1 = this.A0D;
        C05790Sp r2 = new C05790Sp(this);
        if (r1.A02.A07 && r1.A02.A03) {
            1iH r13 = r1.A07;
            String A022 = r13.A02();
            try {
                r13.A05(A022, Message.obtain(null, 0, 112, 0, new 2UQ(A022, r0, str, r2)), false);
            } catch (1mz e) {
            }
        }
        TextView textView = (TextView) findViewById(2131363360);
        if (z) {
            textView.setText(2131887882);
        } else {
            textView.setText(2131888088);
        }
        textView.setOnClickListener(new AnonymousClass1BW(this, z, r12, str));
        findViewById(2131363370).setOnClickListener(new AnonymousClass1BV(this));
        findViewById(2131364214).setVisibility(8);
        findViewById(2131363238).setVisibility(0);
    }

    public void A1S(boolean z, 2e4 r7, String str) {
        Log.i("acceptlink/confirmation/ok");
        C003101p r1 = r7.A01;
        if (z) {
            Intent intent = new Intent();
            intent.setComponent(new ComponentName(this, "com.whatsapp.Conversation"));
            intent.putExtra("jid", C002701g.A0G(r1));
            intent.addFlags(335544320);
            1iG.A0T(intent, "AcceptInviteLinkActivity", this.A05);
            A16(intent, true);
            return;
        }
        StringBuilder sb = new StringBuilder("acceptlink/sendjoin/");
        sb.append(str);
        sb.append(" ");
        sb.append(r1);
        Log.i(sb.toString());
        ((TextView) findViewById(2131364224)).setText(2131888091);
        findViewById(2131364214).setVisibility(0);
        findViewById(2131363238).setVisibility(4);
        findViewById(2131362925).setVisibility(4);
        this.A0B = r1;
        this.A0E.ASc(new AnonymousClass0Sq(this.A0D, this, str), new Void[0]);
    }

    public /* synthetic */ void lambda$displayGroupInfo$1077$AcceptInviteLinkActivity(View view) {
        Log.i("acceptlink/confirmation/ok");
        finish();
    }

    public /* synthetic */ void lambda$onCreate$1073$AcceptInviteLinkActivity(View view) {
        finish();
    }

    @Override // X.AnonymousClass09L, X.AnonymousClass09K, X.AnonymousClass09N, X.AnonymousClass09M, X.AnonymousClass09H, X.AnonymousClass09G, X.AnonymousClass09J, X.AnonymousClass09I, X.AnonymousClass0NM, X.AnonymousClass09O
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(2131886236);
        setContentView(2131559334);
        View findViewById = findViewById(2131363365);
        findViewById.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC05800Sr(findViewById, findViewById(2131362030)));
        this.A03 = this.A04.A03(this);
        findViewById(2131363016).setOnClickListener(new AnonymousClass1BX(this));
        String stringExtra = getIntent().getStringExtra("code");
        if (TextUtils.isEmpty(stringExtra)) {
            ((AnonymousClass09I) this).A0A.A06(2131887447, 1);
            finish();
        } else {
            AnonymousClass00C.A16("acceptlink/processcode/", stringExtra);
            this.A0E.ASc(new AnonymousClass0Ss(this.A00, this.A0D, this.A0C, this.A01, this.A02, this, stringExtra), new Void[0]);
        }
        2e5 r0 = new 2e5(this, this.A05, this.A07, this.A01, this.A02, this.A06, this.A03, (ViewGroup) findViewById(2131363372));
        this.A0A = r0;
        r0.A0G = true;
        this.A08.A00(this.A0G);
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().addFlags(EditorInfoCompat.IME_FLAG_FORCE_ASCII);
            getWindow().setStatusBarColor(0);
            getWindow().setNavigationBarColor(C020709z.A00(this, 2131099750));
        }
    }

    @Override // X.AnonymousClass09L, X.AnonymousClass09M, X.AnonymousClass09I
    public void onDestroy() {
        super.onDestroy();
        this.A08.A01(this.A0G);
        Runnable runnable = this.A0F;
        if (runnable != null) {
            ((AnonymousClass09I) this).A0A.A02.removeCallbacks(runnable);
        }
        this.A03.A00();
    }
}
