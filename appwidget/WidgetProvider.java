package com.whatsapp.appwidget;

import X.1eb;
import X.1f5;
import X.1kV;
import X.AnonymousClass00C;
import X.AnonymousClass01G;
import X.AnonymousClass07S;
import X.AnonymousClass0AZ;
import X.AnonymousClass0CQ;
import X.AnonymousClass0CR;
import X.AnonymousClass1CL;
import X.C02090Ab;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;

public class WidgetProvider extends AppWidgetProvider {
    public static ArrayList A0A;
    public AnonymousClass07S A00;
    public AnonymousClass1CL A01;
    public AnonymousClass0CQ A02;
    public AnonymousClass0CR A03;
    public AnonymousClass01G A04;
    public 1f5 A05;
    public 1eb A06;
    public 1kV A07;
    public final Object A08;
    public volatile boolean A09;

    public WidgetProvider() {
        this(0);
    }

    public WidgetProvider(int i) {
        this.A09 = false;
        this.A08 = new Object();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (r13 <= 100) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.widget.RemoteViews A00(android.content.Context r8, X.AnonymousClass0CR r9, X.AnonymousClass01G r10, int r11, int r12, int r13) {
        /*
        // Method dump skipped, instructions count: 322
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.appwidget.WidgetProvider.A00(android.content.Context, X.0CR, X.01G, int, int, int):android.widget.RemoteViews");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001a, code lost:
        if (r5 != 0) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAppWidgetOptionsChanged(android.content.Context r7, android.appwidget.AppWidgetManager r8, int r9, android.os.Bundle r10) {
        /*
            r6 = this;
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r10 == 0) goto L_0x001c
            java.lang.String r1 = "appWidgetMinWidth"
            int r4 = r10.getInt(r1)
            java.lang.String r1 = "appWidgetMinHeight"
            int r5 = r10.getInt(r1)
            java.lang.String r1 = "widgetprovider/onappwidgetoptionschanged "
            java.lang.String r2 = "x"
            X.AnonymousClass00C.A0v(r1, r4, r2, r5)
            if (r4 == 0) goto L_0x001c
            if (r5 != 0) goto L_0x001e
        L_0x001c:
            r4 = r0
            r5 = r0
        L_0x001e:
            X.0CR r1 = r6.A03
            X.01G r2 = r6.A04
            r0 = r7
            r3 = r9
            android.widget.RemoteViews r0 = A00(r0, r1, r2, r3, r4, r5)
            r8.updateAppWidget(r9, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.appwidget.WidgetProvider.onAppWidgetOptionsChanged(android.content.Context, android.appwidget.AppWidgetManager, int, android.os.Bundle):void");
    }

    public void onReceive(Context context, Intent intent) {
        if (!this.A09) {
            synchronized (this.A08) {
                if (!this.A09) {
                    ((AnonymousClass0AZ) C02090Ab.A0M(context)).A2O(this);
                    this.A09 = true;
                }
            }
        }
        super.onReceive(context, intent);
    }

    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        AnonymousClass00C.A1H(AnonymousClass00C.A0R("widgetprovider/update "), iArr.length);
        AnonymousClass1CL r0 = this.A01;
        if (r0 != null) {
            r0.A08.set(true);
            this.A02.A01().removeCallbacks(this.A01);
        }
        this.A01 = new AnonymousClass1CL(context, this.A00, this.A05, this.A03, this.A04, appWidgetManager, this.A07, this.A06, iArr);
        this.A02.A01().post(this.A01);
        super.onUpdate(context, appWidgetManager, iArr);
    }
}
