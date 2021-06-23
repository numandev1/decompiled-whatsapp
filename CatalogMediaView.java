package com.whatsapp;

import X.2Aq;
import X.2Hg;
import X.2dQ;
import X.2oO;
import X.AbstractC02340Bc;
import X.AnonymousClass0N7;
import X.AnonymousClass1C3;
import X.C02360Be;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import com.whatsapp.biz.catalog.CatalogMediaViewFragment;
import com.whatsapp.jid.UserJid;
import com.whatsapp.mediaview.MediaViewBaseFragment;

public class CatalogMediaView extends AnonymousClass0N7 implements 2Hg {
    public static void A00(Context context, 2Aq r4, AnonymousClass1C3 r5, int i, View view, UserJid userJid) {
        Intent intent = new Intent(context, CatalogMediaView.class);
        intent.putExtra("product", (Parcelable) r4);
        intent.putExtra("target_image_index", i);
        intent.putExtra("cached_jid", userJid.getRawString());
        2dQ.A03(context, intent, view);
        2dQ.A04(context, r5, intent, view, 2oO.A00(r4.A0C, i));
    }

    public void AK3() {
    }

    public void AMe() {
        finish();
    }

    public void APz() {
    }

    public boolean AVF() {
        return true;
    }

    @Override // X.AnonymousClass09L, X.AnonymousClass09K, X.AnonymousClass09N, X.AnonymousClass09M, X.AnonymousClass09H, X.AnonymousClass09G, X.AnonymousClass09J, X.AnonymousClass09I, X.AnonymousClass0N7, X.AnonymousClass09O
    public void onCreate(Bundle bundle) {
        MediaViewBaseFragment.A05(this);
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent != null) {
            setContentView(2131559003);
            AbstractC02340Bc A0N = A0N();
            CatalogMediaViewFragment A01 = A0N.A0Q.A01("catalog_media_view_fragment");
            if (A01 == null) {
                A01 = new CatalogMediaViewFragment();
            }
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("product", intent.getParcelableExtra("product"));
            bundle2.putInt("target_image_index", intent.getIntExtra("target_image_index", 0));
            bundle2.putString("cached_jid", intent.getStringExtra("cached_jid"));
            bundle2.putBundle("animation_bundle", intent.getBundleExtra("animation_bundle"));
            A01.A0P(bundle2);
            C02360Be r1 = new C02360Be(A0N);
            r1.A01(2131363567, A01, "catalog_media_view_fragment");
            r1.A04();
        }
    }

    @Override // X.AnonymousClass09L, X.AnonymousClass09M
    public void onStop() {
        super.onStop();
        MediaViewBaseFragment.A06(this, true);
    }
}
