package com.whatsapp;

import X.AnonymousClass004;
import X.AnonymousClass006;
import X.AnonymousClass008;
import X.AnonymousClass009;
import X.AnonymousClass00C;
import X.AnonymousClass00D;
import X.AnonymousClass00E;
import X.AnonymousClass00G;
import X.AnonymousClass00H;
import X.AnonymousClass00I;
import X.AnonymousClass00T;
import X.AnonymousClass00U;
import X.AnonymousClass017;
import X.AnonymousClass01B;
import X.AnonymousClass01C;
import X.AnonymousClass01E;
import X.AnonymousClass01F;
import X.AnonymousClass01G;
import X.AnonymousClass01H;
import X.AnonymousClass01I;
import X.AnonymousClass01K;
import X.AnonymousClass01L;
import X.AnonymousClass01M;
import X.AnonymousClass01N;
import X.AnonymousClass01P;
import X.AnonymousClass01Q;
import X.AnonymousClass01R;
import X.AnonymousClass01S;
import X.AnonymousClass01T;
import X.AnonymousClass01U;
import X.AnonymousClass01V;
import X.AnonymousClass01W;
import X.AnonymousClass16O;
import X.AnonymousClass16P;
import android.app.Application;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.breakpad.BreakpadManager;
import com.whatsapp.util.Log;
import com.whatsapp.util.crash.SigquitBasedANRDetector;
import java.io.File;
import java.util.Locale;

public class AbstractAppShell extends Application implements AnonymousClass004 {
    public static final String COMPRESSED_LIBS_ARCHIVE_NAME = "libs.spk.zst";
    public static final AnonymousClass006 appStartStat = AnonymousClass006.A03;
    public AnonymousClass01T abProps;
    public AnonymousClass01R genderUtils;
    public volatile AnonymousClass01F waResourcesWrapper;
    public AnonymousClass01G whatsAppLocale;

    public static void installClassLoaderProfiling() {
    }

    public static void lambda$attachBaseContext$6() {
        if (AnonymousClass008.A03 == null) {
            synchronized (AnonymousClass008.class) {
                try {
                    if (AnonymousClass008.A03 == null) {
                        AnonymousClass008.A03 = new AnonymousClass008(AnonymousClass009.A00);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        AnonymousClass008 r1 = AnonymousClass008.A03;
        synchronized (r1) {
            SigquitBasedANRDetector sigquitBasedANRDetector = (SigquitBasedANRDetector) r1.A01.get();
            r1.A00 = sigquitBasedANRDetector;
            synchronized (sigquitBasedANRDetector.A07) {
                if (!sigquitBasedANRDetector.A0A) {
                    HandlerThread handlerThread = new HandlerThread("SigquitBasedANRDetectorThread");
                    sigquitBasedANRDetector.A00 = handlerThread;
                    handlerThread.start();
                    sigquitBasedANRDetector.A08 = new Handler(sigquitBasedANRDetector.A00.getLooper());
                    SigquitBasedANRDetector.startDetector();
                    sigquitBasedANRDetector.A0A = true;
                }
            }
        }
    }

    private void logDebugInfo() {
        StringBuilder A0R = AnonymousClass00C.A0R("appshell/debug_info: pkg=");
        A0R.append(getPackageName());
        A0R.append("; v=");
        A0R.append("2.21.12.20-website-release");
        A0R.append("; vc=");
        A0R.append(211220000);
        A0R.append("; p=");
        A0R.append("consumer");
        A0R.append("; e=");
        A0R.append(180L);
        A0R.append("; g=");
        A0R.append(AnonymousClass00D.A00);
        A0R.append("; t=");
        A0R.append(1623796567000L);
        A0R.append("; d=");
        A0R.append(Build.MANUFACTURER);
        A0R.append(" ");
        A0R.append(Build.MODEL);
        A0R.append("; os=Android ");
        A0R.append(Build.VERSION.RELEASE);
        A0R.append("; abis=");
        AnonymousClass00C.A1P(A0R, TextUtils.join(",", Build.VERSION.SDK_INT >= 21 ? Build.SUPPORTED_ABIS : new String[]{Build.CPU_ABI, Build.CPU_ABI2}));
    }

    private void maybeReportDecompressionFailure(Exception exc) {
        StringBuilder A0R = AnonymousClass00C.A0R("appshell/decompression-failure: available internal storage: ");
        A0R.append(AnonymousClass00E.A00().A03());
        Log.i(A0R.toString());
        Log.e("AbstractAppShell/maybeReportDecompressionFailure", exc);
        AnonymousClass00G A00 = AnonymousClass00G.A00();
        if (A00.A0u(86400000, "decompression_failure_reported_timestamp")) {
            AnonymousClass00H.A00().A08("AbstractAppShell/maybeReportDecompressionFailure", "superpack decompression failed", true);
            A00.A0D("decompression_failure_reported_timestamp");
        }
    }

    public static void setStrictModePolicyForAppInit() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x013f, code lost:
        if (r4 == 3) goto L_0x0141;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00cb A[SYNTHETIC, Splitter:B:24:0x00cb] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void attachBaseContext(android.content.Context r19) {
        /*
        // Method dump skipped, instructions count: 1270
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.AbstractAppShell.attachBaseContext(android.content.Context):void");
    }

    public void configureProductDependencies() {
        AnonymousClass017.A00().A00 = AnonymousClass01B.A00();
        AnonymousClass01C.A00().A00 = AnonymousClass01E.A00();
    }

    public Resources getResources() {
        if (AnonymousClass00I.A00.booleanValue()) {
            return super.getResources();
        }
        if (this.waResourcesWrapper == null) {
            synchronized (this) {
                if (this.waResourcesWrapper == null) {
                    Resources resources = super.getResources();
                    AnonymousClass01G A00 = AnonymousClass01G.A00();
                    if (resources == null || A00 == null) {
                        throw new NullPointerException("Resources and/or WhatsAppLocale can't be null");
                    }
                    this.waResourcesWrapper = resources instanceof AnonymousClass01F ? (AnonymousClass01F) resources : new AnonymousClass01F(resources, A00);
                }
            }
        }
        return this.waResourcesWrapper;
    }

    @Override // X.AnonymousClass004
    public AnonymousClass01I getWorkManagerConfiguration() {
        Log.i("work-manager/configuration/created");
        AnonymousClass01H r0 = new AnonymousClass01H();
        r0.A03 = SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS;
        r0.A01 = Integer.MAX_VALUE;
        r0.A00 = 2;
        return new AnonymousClass01I(r0);
    }

    public void lambda$attachBaseContext$4$AbstractAppShell() {
        boolean z = true;
        synchronized (BreakpadManager.class) {
            try {
                AnonymousClass00I.A08(BreakpadManager.A00 == null, "breakpad/initialized more than once");
                File A00 = AnonymousClass01K.A00(this);
                String absolutePath = A00.getAbsolutePath();
                String packageCodePath = getPackageCodePath();
                String absolutePath2 = new File(getFilesDir(), "decompressed/libs.spk.zst").getAbsolutePath();
                String str = AnonymousClass01L.A08;
                String property = System.getProperty("java.vm.version");
                if (property == null || property.startsWith("1.") || property.startsWith("0.")) {
                    z = false;
                }
                BreakpadManager.setUpBreakpad(absolutePath, packageCodePath, absolutePath2, str, z, 1536000);
                BreakpadManager.A00 = A00;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public /* synthetic */ void lambda$null$7$AbstractAppShell() {
        AnonymousClass01M.A0u(this);
    }

    public boolean lambda$onCreate$8$AbstractAppShell() {
        Log.i("app-init main thread idle");
        AnonymousClass01N.A00().ASf(new AnonymousClass16P(this));
        return false;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        AnonymousClass01G r0 = this.whatsAppLocale;
        Locale A01 = AnonymousClass01G.A01(configuration);
        if (!r0.A05.equals(A01)) {
            StringBuilder A0R = AnonymousClass00C.A0R("whatsapplocale/savedefaultlanguage/phone language changed to: ");
            A0R.append(AnonymousClass01P.A05(A01));
            Log.i(A0R.toString());
            r0.A05 = A01;
            if (!r0.A06) {
                r0.A04 = A01;
                r0.A0N();
                r0.A0M();
            }
        }
        this.whatsAppLocale.A0L();
        AnonymousClass01Q.A04();
        this.genderUtils.A04();
    }

    /* JADX INFO: finally extract failed */
    public void onCreate() {
        boolean z = true;
        Log.i("appshell/onCreate");
        super.onCreate();
        AnonymousClass00U r1 = AnonymousClass00T.A00().A00;
        AnonymousClass01S.A01("AppShell/onCreate");
        try {
            this.genderUtils = AnonymousClass01R.A00();
            this.abProps = AnonymousClass01T.A00();
            AnonymousClass01G.A0D = true;
            if (!this.abProps.A0C(334)) {
                z = false;
            }
            AnonymousClass01U.A06 = z;
            this.whatsAppLocale = AnonymousClass01G.A00();
            AnonymousClass00G A00 = AnonymousClass00G.A00();
            configureProductDependencies();
            AnonymousClass01V.A00(this);
            AnonymousClass00I.A00 = Boolean.FALSE;
            Looper.myQueue().addIdleHandler(new AnonymousClass16O(this));
            AnonymousClass01S.A00();
            AnonymousClass01W.A00(A00.A07());
            r1.A03.AGj(r1.A01.A00, 2);
            Log.i("appshell/onCreate done");
        } catch (Throwable th) {
            AnonymousClass01S.A00();
            throw th;
        }
    }
}
