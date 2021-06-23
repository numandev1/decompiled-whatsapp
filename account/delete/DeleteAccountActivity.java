package com.whatsapp.account.delete;

import X.1fo;
import X.1im;
import X.2Ok;
import X.AnonymousClass0NO;
import android.content.Intent;
import android.view.View;
import com.whatsapp.registration.ChangeNumberOverview;
import com.whatsapp.util.Log;

public class DeleteAccountActivity extends AnonymousClass0NO implements 2Ok {
    public 1fo A00;
    public 1im A01;

    public void AMR() {
        A16(new Intent(this, DeleteAccountFeedback.class), true);
    }

    public void AMk() {
        AVP(2131887039);
    }

    public /* synthetic */ void lambda$onCreate$0$DeleteAccountActivity(View view) {
        Log.i("delete-account/changenumber");
        startActivity(new Intent(this, ChangeNumberOverview.class));
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [X.1Wz, android.view.View$OnClickListener] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // X.AnonymousClass09L, X.AnonymousClass09K, X.AnonymousClass09N, X.AnonymousClass09M, X.AnonymousClass09H, X.AnonymousClass09G, X.AnonymousClass09J, X.AnonymousClass09I, X.AnonymousClass0NO, X.AnonymousClass09O
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r6) {
        /*
        // Method dump skipped, instructions count: 173
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.account.delete.DeleteAccountActivity.onCreate(android.os.Bundle):void");
    }
}
