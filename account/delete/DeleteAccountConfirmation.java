package com.whatsapp.account.delete;

import X.1eK;
import X.1fo;
import X.1iH;
import X.1iL;
import X.1im;
import X.2Ol;
import X.AnonymousClass00A;
import X.AnonymousClass00J;
import X.AnonymousClass01A;
import X.AnonymousClass01M;
import X.AnonymousClass07X;
import X.AnonymousClass09I;
import X.AnonymousClass09K;
import X.AnonymousClass0I1;
import X.AnonymousClass0LK;
import X.AnonymousClass0NQ;
import X.AnonymousClass1X0;
import X.DialogInterface$OnClickListenerC24391Bb;
import X.DialogInterface$OnClickListenerC24411Bd;
import X.HandlerC24491Bm;
import X.View$OnClickListenerC24401Bc;
import X.ViewTreeObserver$OnPreDrawListenerC24481Bl;
import X.ViewTreeObserver$OnScrollChangedListenerC24471Bk;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.MenuItem;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import com.whatsapp.Main;
import com.whatsapp.util.Log;

public class DeleteAccountConfirmation extends AnonymousClass0NQ {
    public int A00;
    public Handler A01;
    public View A02;
    public ScrollView A03;
    public AnonymousClass01A A04;
    public AnonymousClass0I1 A05;
    public 1fo A06;
    public AnonymousClass00J A07;
    public 2Ol A08;
    public 1iL A09;
    public 1im A0A;
    public 1eK A0B;
    public AnonymousClass00A A0C;

    public final void A1Q() {
        boolean canScrollVertically = this.A03.canScrollVertically(1);
        View view = this.A02;
        if (canScrollVertically) {
            view.setElevation((float) this.A00);
        } else {
            view.setElevation(0.0f);
        }
    }

    public void lambda$onCreate$2$DeleteAccountConfirmation(View view) {
        if (!this.A07.A04()) {
            Log.i("deleteaccountconfirm/no-connectivity");
            AnonymousClass01M.A0t(this, 2);
            return;
        }
        AnonymousClass01M.A0t(this, 1);
        this.A01.sendEmptyMessageDelayed(0, 60000);
        1iL r0 = this.A09;
        String A062 = ((AnonymousClass09K) this).A01.A06();
        String A052 = ((AnonymousClass09K) this).A01.A05();
        String stringExtra = getIntent().getStringExtra("additionalComments");
        int intExtra = getIntent().getIntExtra("deleteReason", -1);
        if (r0.A02.A07) {
            Log.i("sendmethods/sendremoveaccount");
            1iH r02 = r0.A07;
            Message obtain = Message.obtain(null, 0, 27, 0);
            obtain.getData().putString("lg", A062);
            obtain.getData().putString("lc", A052);
            obtain.getData().putString("userFeedback", stringExtra);
            obtain.getData().putInt("deleteReason", intExtra);
            r02.A0A(obtain, false);
        }
    }

    @Override // X.AnonymousClass09L, X.AnonymousClass09K, X.AnonymousClass09M, X.AnonymousClass09I
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (Build.VERSION.SDK_INT >= 21) {
            this.A03.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver$OnPreDrawListenerC24481Bl(this));
        }
    }

    @Override // X.AnonymousClass09L, X.AnonymousClass09K, X.AnonymousClass09N, X.AnonymousClass09M, X.AnonymousClass09H, X.AnonymousClass09G, X.AnonymousClass09J, X.AnonymousClass09I, X.AnonymousClass0NQ, X.AnonymousClass09O
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A01 = new HandlerC24491Bm(this.A0B, this);
        this.A04 = new AnonymousClass1X0(this);
        setTitle(2131889726);
        AnonymousClass0LK A0c = A0c();
        if (A0c != null) {
            A0c.A0L(true);
        }
        setContentView(2131558731);
        this.A03 = (ScrollView) findViewById(2131364462);
        this.A02 = findViewById(2131362132);
        findViewById(2131362680).setOnClickListener(new View$OnClickListenerC24401Bc(this));
        TextView textView = (TextView) findViewById(2131362676);
        String string = getString(2131889729);
        this.A00 = getResources().getDimensionPixelSize(2131166146);
        if (this.A06.A0A() && ((AnonymousClass09I) this).A0G.A0G() != null && this.A0A.A05()) {
            string = getString(2131889731, string);
        } else if (this.A06.A0A() && ((AnonymousClass09I) this).A0G.A0G() != null) {
            string = getString(2131889730, string);
        } else if (this.A0A.A05()) {
            string = getString(2131889732, string);
        }
        textView.setText(string);
        AnonymousClass0I1 r0 = this.A05;
        r0.A0j.add(this.A04);
        if (Build.VERSION.SDK_INT >= 21) {
            this.A00 = getResources().getDimensionPixelSize(2131166146);
            this.A03.getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserver$OnScrollChangedListenerC24471Bk(this));
            this.A03.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver$OnPreDrawListenerC24481Bl(this));
        }
    }

    @Override // X.AnonymousClass09G
    public Dialog onCreateDialog(int i) {
        if (i == 1) {
            ProgressDialog progressDialog = new ProgressDialog(this);
            progressDialog.setMessage(getString(2131887040));
            progressDialog.setIndeterminate(true);
            progressDialog.setCancelable(false);
            return progressDialog;
        } else if (i == 2) {
            AnonymousClass07X r0 = new AnonymousClass07X(this);
            r0.A01.A0E = getString(2131889373, getString(2131886823));
            r0.A06(2131888548, new DialogInterface$OnClickListenerC24411Bd(this));
            return r0.A00();
        } else if (i != 3) {
            return super.onCreateDialog(i);
        } else {
            AnonymousClass07X r02 = new AnonymousClass07X(this);
            r02.A02(2131887031);
            r02.A06(2131888548, new DialogInterface$OnClickListenerC24391Bb(this));
            return r02.A00();
        }
    }

    @Override // X.AnonymousClass09L, X.AnonymousClass09M, X.AnonymousClass09I
    public void onDestroy() {
        super.onDestroy();
        AnonymousClass0I1 r0 = this.A05;
        r0.A0j.remove(this.A04);
        this.A01.removeMessages(0);
    }

    @Override // X.AnonymousClass09I
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        finish();
        return true;
    }

    @Override // X.AnonymousClass09M, X.AnonymousClass09G, X.AnonymousClass09I
    public void onResume() {
        super.onResume();
        int A012 = this.A0B.A01();
        if (!this.A0B.A02() && A012 != 6) {
            StringBuilder sb = new StringBuilder("deleteaccountconfirm/wrong-state bounce to main ");
            sb.append(A012);
            Log.e(sb.toString());
            startActivity(new Intent(this, Main.class));
            finish();
        }
    }
}
