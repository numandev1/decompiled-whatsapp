package com.whatsapp;

import X.2Aq;
import X.2O7;
import X.2O8;
import X.2Oy;
import X.2dQ;
import X.2oO;
import X.AnonymousClass08x;
import X.AnonymousClass0LK;
import X.AnonymousClass0N3;
import X.AnonymousClass1C3;
import X.AnonymousClass1VN;
import X.AnonymousClass1VO;
import X.AnonymousClass1VP;
import X.C020709z;
import X.C28701Uj;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.jid.UserJid;

public class CatalogImageListActivity extends AnonymousClass0N3 {
    public static final boolean A0A;
    public int A00;
    public int A01;
    public LinearLayoutManager A02;
    public RecyclerView A03;
    public AnonymousClass1VP A04;
    public 2O8 A05;
    public 2O7 A06;
    public 2Oy A07;
    public 2Aq A08;
    public UserJid A09;

    static {
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 21) {
            z = true;
        }
        A0A = z;
    }

    @Override // X.AnonymousClass0N3, X.AnonymousClass09L, X.AnonymousClass09K, X.AnonymousClass09N, X.AnonymousClass09M, X.AnonymousClass09H, X.AnonymousClass09G, X.AnonymousClass09J, X.AnonymousClass09I, X.AnonymousClass09O
    public void onCreate(Bundle bundle) {
        if (2dQ.A00) {
            Window window = getWindow();
            window.requestFeature(12);
            window.requestFeature(13);
        }
        super.onCreate(bundle);
        2oO.A02(this, bundle, new AnonymousClass1C3(this));
        if (A0A) {
            getWindow().getDecorView().setSystemUiVisibility(1792);
            getWindow().addFlags(134217728);
            getWindow().addFlags(EditorInfoCompat.IME_FLAG_FORCE_ASCII);
            getWindow().setStatusBarColor(C020709z.A00(this, 2131100412));
        }
        UserJid nullable = UserJid.getNullable(getIntent().getStringExtra("cached_jid"));
        if (nullable != null) {
            this.A09 = nullable;
            this.A08 = getIntent().getParcelableExtra("product");
            this.A00 = getIntent().getIntExtra("image_index", 0);
            setContentView(2131558512);
            this.A03 = (RecyclerView) findViewById(2131362355);
            A0k((Toolbar) findViewById(2131362357));
            AnonymousClass0LK A0c = A0c();
            if (A0c != null) {
                A0c.A0L(true);
                A0c.A0H(this.A08.A04);
                this.A07 = new 2Oy(this.A06);
                AnonymousClass1VO r0 = new AnonymousClass1VO(this, new AnonymousClass1C3(this));
                this.A02 = new LinearLayoutManager(1);
                this.A03.setAdapter(r0);
                this.A03.setLayoutManager(this.A02);
                AnonymousClass1VP r02 = new AnonymousClass1VP(this.A08.A06.size(), getResources().getDimensionPixelSize(2131165263));
                this.A04 = r02;
                this.A03.A0k(r02);
                AnonymousClass08x.A0d(this.A03, new C28701Uj(this));
                int A002 = C020709z.A00(this, 2131100402);
                int A003 = C020709z.A00(this, 2131100412);
                this.A03.A0m(new AnonymousClass1VN(this, A002, C020709z.A00(this, 2131099843), A0c, A003));
                if (bundle == null) {
                    this.A05.A02(8, 27, (String) null, this.A09);
                    return;
                }
                return;
            }
            throw null;
        }
        throw null;
    }

    @Override // X.AnonymousClass09L, X.AnonymousClass09M, X.AnonymousClass09I
    public void onDestroy() {
        this.A07.A00();
        super.onDestroy();
    }

    @Override // X.AnonymousClass09I
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }
}
