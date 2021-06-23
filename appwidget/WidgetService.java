package com.whatsapp.appwidget;

import X.1dn;
import X.1do;
import X.1tQ;
import X.AnonymousClass01G;
import X.AnonymousClass0CR;
import X.AnonymousClass1CO;
import X.AnonymousClass1X5;
import X.C000100c;
import android.content.Intent;
import android.widget.RemoteViewsService;

public class WidgetService extends AnonymousClass1X5 {
    public AnonymousClass0CR A00;
    public 1dn A01;
    public 1do A02;
    public C000100c A03;
    public AnonymousClass01G A04;
    public 1tQ A05;

    public RemoteViewsService.RemoteViewsFactory onGetViewFactory(Intent intent) {
        return new AnonymousClass1CO(getApplicationContext(), this.A03, this.A00, this.A01, this.A02, this.A04, this.A05);
    }
}
