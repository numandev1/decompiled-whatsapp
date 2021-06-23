package com.whatsapp;

import X.1la;
import X.AnonymousClass07X;
import X.AnonymousClass07Y;
import X.AnonymousClass07Z;
import X.AnonymousClass09K;
import X.AnonymousClass0LK;
import X.AnonymousClass0NK;
import X.AnonymousClass0Nn;
import X.AnonymousClass1BL;
import X.AnonymousClass1BM;
import X.C020709z;
import X.C240719s;
import X.DialogInterface$OnClickListenerC240619r;
import X.View$OnClickListenerC240819t;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;

public class WaInAppBrowsingActivity extends AnonymousClass0NK {
    public WebView A00;
    public ProgressBar A01;
    public AnonymousClass07Z A02;
    public String A03;

    public static void A00(WaInAppBrowsingActivity waInAppBrowsingActivity, String str) {
        if (waInAppBrowsingActivity.A0c() != null && str != null && !"about:blank".equals(str) && !waInAppBrowsingActivity.getIntent().getBooleanExtra("webview_hide_url", false)) {
            TextView textView = (TextView) waInAppBrowsingActivity.findViewById(2131365326);
            textView.setText(str);
            TextView textView2 = (TextView) waInAppBrowsingActivity.findViewById(2131365325);
            if (TextUtils.isEmpty(str)) {
                textView2.setTextColor(C020709z.A00(waInAppBrowsingActivity, 2131100485));
                textView2.setTypeface(null, 0);
                textView.setVisibility(8);
                return;
            }
            textView2.setTextColor(C020709z.A00(waInAppBrowsingActivity, 2131100423));
            textView2.setTypeface(null, 1);
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            textView.setVisibility(0);
            alphaAnimation.setDuration(300);
            textView.startAnimation(alphaAnimation);
        }
    }

    public final void A1Q(String str) {
        if (A0c() != null) {
            String stringExtra = getIntent().getStringExtra("webview_title");
            TextView textView = (TextView) findViewById(2131365325);
            if (!TextUtils.isEmpty(stringExtra)) {
                textView.setText(stringExtra);
            } else if (!TextUtils.isEmpty(str)) {
                textView.setText(str);
            }
        }
    }

    public void A1R(String str, boolean z) {
        if (this.A02 == null) {
            AnonymousClass07X r0 = new AnonymousClass07X(this);
            AnonymousClass07Y r1 = r0.A01;
            r1.A0E = str;
            r1.A0J = false;
            r0.A06(2131888548, new DialogInterface$OnClickListenerC240619r(this, z));
            this.A02 = r0.A01();
        }
    }

    public boolean A1S(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(this.A03) || !str.contains(this.A03)) {
            return false;
        }
        Intent intent = new Intent();
        intent.putExtra("webview_callback", str);
        setResult(-1, intent);
        finish();
        return true;
    }

    public /* synthetic */ void lambda$onCreate$1066$WaInAppBrowsingActivity(View view) {
        onBackPressed();
    }

    @Override // X.AnonymousClass09N, X.AnonymousClass09I
    public void onBackPressed() {
        setResult(0, getIntent());
        super.onBackPressed();
    }

    @Override // X.AnonymousClass09L, X.AnonymousClass09K, X.AnonymousClass09N, X.AnonymousClass09M, X.AnonymousClass09H, X.AnonymousClass09G, X.AnonymousClass09J, X.AnonymousClass09I, X.AnonymousClass0NK, X.AnonymousClass09O
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131558887);
        this.A03 = getIntent().getStringExtra("webview_callback");
        Toolbar toolbar = (Toolbar) findViewById(2131365014);
        A0k(toolbar);
        AnonymousClass0LK A0c = A0c();
        if (A0c != null) {
            A0c.A0L(true);
            AnonymousClass0Nn r1 = new AnonymousClass0Nn(((AnonymousClass09K) this).A01, C020709z.A03(this, 2131231402));
            r1.setColorFilter(getResources().getColor(2131099948), PorterDuff.Mode.SRC_ATOP);
            toolbar.setNavigationIcon(r1);
            toolbar.setNavigationOnClickListener(new View$OnClickListenerC240819t(this));
            ProgressBar progressBar = (ProgressBar) findViewById(2131364219);
            this.A01 = progressBar;
            1la.A15(progressBar, 2131100767);
        }
        WebView webView = (WebView) findViewById(2131365323);
        this.A00 = webView;
        webView.getSettings().setAllowContentAccess(false);
        this.A00.getSettings().setAllowFileAccess(false);
        this.A00.getSettings().setJavaScriptEnabled(getIntent().getBooleanExtra("webview_javascript_enabled", false));
        this.A00.getSettings().setJavaScriptCanOpenWindowsAutomatically(false);
        this.A00.getSettings().setGeolocationEnabled(false);
        this.A00.clearCache(true);
        this.A00.getSettings().setSaveFormData(false);
        this.A00.getSettings().setSupportMultipleWindows(false);
        CookieManager.getInstance().setAcceptCookie(false);
        if (Build.VERSION.SDK_INT < 18) {
            this.A00.getSettings().setPluginState(WebSettings.PluginState.OFF);
            this.A00.getSettings().setSavePassword(false);
        }
        this.A00.getSettings().setAllowFileAccessFromFileURLs(false);
        this.A00.getSettings().setAllowUniversalAccessFromFileURLs(false);
        this.A00.setWebViewClient(new AnonymousClass1BM(this));
        this.A00.setWebChromeClient(new AnonymousClass1BL(this));
        getWindow().setFlags(8192, 8192);
        if (Build.VERSION.SDK_INT >= 27) {
            WebView.startSafeBrowsing(this, C240719s.A00);
        }
        A1Q(getString(2131890916));
        String stringExtra = getIntent().getStringExtra("webview_url");
        if (A1S(stringExtra)) {
            return;
        }
        if (getIntent().getBooleanExtra("webview_post_on_initial_request", false)) {
            String stringExtra2 = getIntent().getStringExtra("webview_initial_body_params");
            if (stringExtra2 == null) {
                stringExtra2 = "";
            }
            this.A00.postUrl(stringExtra, stringExtra2.getBytes());
            return;
        }
        this.A00.loadUrl(stringExtra);
    }

    @Override // X.AnonymousClass09L, X.AnonymousClass09M, X.AnonymousClass09I
    public void onDestroy() {
        super.onDestroy();
        WebView webView = this.A00;
        if (webView != null) {
            webView.onPause();
            this.A00.loadUrl("about:blank");
            this.A00.clearHistory();
            this.A00.clearCache(true);
            this.A00.removeAllViews();
            this.A00.destroyDrawingCache();
            this.A00 = null;
        }
    }
}
