package com.whatsapp;

import X.1dr;
import X.1iE;
import X.1jF;
import X.1jJ;
import X.1tQ;
import X.AbstractC003001o;
import X.AnonymousClass00C;
import X.AnonymousClass01G;
import X.AnonymousClass02V;
import X.AnonymousClass07T;
import X.AnonymousClass0AZ;
import X.AnonymousClass0C7;
import X.AnonymousClass0JO;
import X.C002701g;
import X.C015207d;
import X.C02090Ab;
import X.RunnableC240119m;
import X.RunnableC240219n;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.util.Collections;

public class VoiceMessagingService extends SearchActionVerificationClientService {
    public AnonymousClass0C7 A00;
    public AnonymousClass07T A01;
    public AnonymousClass01G A02;
    public 1iE A03;
    public 1jF A04;
    public 1jJ A05;
    public final Handler A06 = new Handler(Looper.getMainLooper());

    public /* synthetic */ void A00(AbstractC003001o r9, C015207d r10) {
        this.A01.A0f(this.A03.A08(r9, r10, (byte) 2, 1, (1dr) null, false));
    }

    public /* synthetic */ void A01(AbstractC003001o r9, String str) {
        this.A01.A0m(Collections.singletonList(r9), str, null, null, null, false, false);
    }

    public void attachBaseContext(Context context) {
        AnonymousClass0AZ r0 = (AnonymousClass0AZ) C02090Ab.A0N(context.getApplicationContext(), AnonymousClass0AZ.class);
        this.A04 = r0.A21();
        this.A01 = r0.A0Y();
        this.A03 = r0.A1Y();
        this.A05 = r0.A28();
        this.A02 = r0.A0y();
        AnonymousClass0C7 A0R = r0.A0R();
        this.A00 = A0R;
        super.attachBaseContext(new AnonymousClass0JO(context, this.A02, A0R));
    }

    @Override // com.google.android.search.verification.client.SearchActionVerificationClientService
    public void performAction(Intent intent, boolean z, Bundle bundle) {
        Uri uri;
        if (!z) {
            Log.w("VoiceMessagingService/ignoring unverified voice message");
        } else if (!this.A04.A05()) {
            Log.i("VoiceMessagingService/ignoring voice message due to ToS update state");
        } else {
            String stringExtra = intent.getStringExtra("com.google.android.voicesearch.extra.RECIPIENT_CONTACT_CHAT_ID");
            AbstractC003001o A022 = AbstractC003001o.A02(stringExtra);
            if (C002701g.A1B(A022) || C002701g.A0z(A022) || C002701g.A14(A022)) {
                ClipData clipData = intent.getClipData();
                if (clipData != null) {
                    if (clipData.getItemCount() == 1) {
                        ClipData.Item itemAt = clipData.getItemAt(0);
                        if (!(itemAt == null || (uri = itemAt.getUri()) == null)) {
                            try {
                                C015207d r2 = new C015207d();
                                r2.A0F = this.A05.A0D(uri);
                                StringBuilder sb = new StringBuilder();
                                sb.append("VoiceMessagingService/sending verified voice message (voice); jid=");
                                sb.append(A022);
                                Log.i(sb.toString());
                                this.A06.post(new RunnableC240119m(this, A022, r2));
                                return;
                            } catch (IOException e) {
                                Log.w("VoiceMessagingService/IO Exception while trying to send voice message", e);
                                return;
                            }
                        }
                    } else if (clipData.getItemCount() > 1 || clipData.getItemCount() < 0) {
                        StringBuilder A0R = AnonymousClass00C.A0R("VoiceMessagingService/ignoring voice message with unexpected item count; itemCount=");
                        A0R.append(clipData.getItemCount());
                        Log.w(A0R.toString());
                        return;
                    }
                }
                String stringExtra2 = intent.getStringExtra("android.intent.extra.TEXT");
                if (TextUtils.isEmpty(stringExtra2)) {
                    StringBuilder sb2 = new StringBuilder("VoiceMessagingService/ignoring voice message with empty contents; jid=");
                    sb2.append(A022);
                    sb2.append("; text=");
                    sb2.append(stringExtra2);
                    Log.w(sb2.toString());
                    return;
                }
                AnonymousClass00C.A0x("VoiceMessagingService/sending verified voice message (text); jid=", A022);
                this.A06.post(new RunnableC240219n(this, A022, stringExtra2));
                return;
            }
            AnonymousClass00C.A17("VoiceMessagingService/ignoring voice message directed at invalid jid; jid=", stringExtra);
        }
    }

    @Override // com.google.android.search.verification.client.SearchActionVerificationClientService
    public void postForegroundNotification() {
        AnonymousClass02V A002 = 1tQ.A00(this);
        A002.A0J = "other_notifications@1";
        A002.A0A(getString(2131889672));
        A002.A09 = PendingIntent.getActivity(this, 1, new Intent(this, HomeActivity.class), 0);
        A002.A03 = -2;
        A002.A07.icon = 2131231578;
        Notification A012 = A002.A01();
        StringBuilder sb = new StringBuilder("VoiceMessagingService/posting assistant notif:");
        sb.append(A012);
        Log.i(sb.toString());
        startForeground(19, A012);
    }
}
