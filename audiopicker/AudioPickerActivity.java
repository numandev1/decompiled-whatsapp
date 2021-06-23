package com.whatsapp.audiopicker;

import X.1dn;
import X.1do;
import X.1fs;
import X.1lY;
import X.1la;
import X.1uK;
import X.2K7;
import X.2Ky;
import X.AbstractC003001o;
import X.AbstractC07960bU;
import X.AnonymousClass00I;
import X.AnonymousClass01G;
import X.AnonymousClass07X;
import X.AnonymousClass09I;
import X.AnonymousClass09K;
import X.AnonymousClass0D8;
import X.AnonymousClass0EE;
import X.AnonymousClass0EF;
import X.AnonymousClass0LK;
import X.AnonymousClass16D;
import X.AnonymousClass1CS;
import X.AnonymousClass1CT;
import X.AnonymousClass1CU;
import X.AnonymousClass1CY;
import X.AnonymousClass1CZ;
import X.AnonymousClass1X8;
import X.C018308s;
import X.C05230Pn;
import X.C07980bW;
import android.database.Cursor;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class AudioPickerActivity extends AnonymousClass0EE implements AnonymousClass0EF {
    public AudioManager A00;
    public Menu A01;
    public ImageButton A02;
    public ListView A03;
    public RelativeLayout A04;
    public RelativeLayout A05;
    public TextView A06;
    public C05230Pn A07;
    public AnonymousClass1CZ A08;
    public AnonymousClass0D8 A09;
    public 1dn A0A;
    public 1do A0B;
    public 1uK A0C;
    public 1fs A0D;
    public C018308s A0E;
    public 2Ky A0F;
    public 1lY A0G;
    public String A0H;
    public ArrayList A0I;
    public LinkedHashMap A0J;

    public final void A1S() {
        MenuItem findItem;
        AnonymousClass0LK A0c = A0c();
        AnonymousClass00I.A04(A0c, "supportActionBar is null");
        Iterator it = this.A0J.values().iterator();
        while (it.hasNext()) {
            String str = ((AnonymousClass1CY) it.next()).A03;
            if (str == null || !new File(str).exists()) {
                it.remove();
            }
        }
        if (this.A08.getCursor() == null) {
            this.A03.setVisibility(8);
            this.A05.setVisibility(8);
            this.A04.setVisibility(0);
            this.A06.setVisibility(8);
            this.A0D.A05();
            A0c.A0G("");
        } else {
            this.A04.setVisibility(8);
            int count = this.A08.getCursor().getCount();
            ListView listView = this.A03;
            if (count == 0) {
                listView.setVisibility(8);
                1la.A12(this.A02, false, false);
                boolean A052 = this.A07.A05();
                RelativeLayout relativeLayout = this.A05;
                if (A052) {
                    relativeLayout.setVisibility(8);
                    this.A06.setVisibility(0);
                    this.A06.setText(getString(2131886279, this.A0H));
                } else {
                    relativeLayout.setVisibility(0);
                    this.A06.setVisibility(8);
                    this.A0J.clear();
                }
                A0c.A0G("");
            } else {
                listView.setVisibility(0);
                this.A05.setVisibility(8);
                this.A06.setVisibility(8);
                LinkedHashMap linkedHashMap = this.A0J;
                if (linkedHashMap.isEmpty()) {
                    A0c.A07(2131890196);
                } else {
                    A0c.A0G(((AnonymousClass09K) this).A01.A0C(2131755134, (long) linkedHashMap.size(), Integer.valueOf(linkedHashMap.size())));
                }
                boolean isEmpty = this.A0J.isEmpty();
                ImageButton imageButton = this.A02;
                if (isEmpty) {
                    1la.A12(imageButton, false, false);
                } else {
                    1la.A12(imageButton, true, false);
                }
            }
        }
        Menu menu = this.A01;
        if (menu != null && (findItem = menu.findItem(2131363645)) != null) {
            findItem.setVisible(this.A08.getCursor() != null && this.A08.getCursor().getCount() > 0);
        }
    }

    @Override // X.AnonymousClass0EF
    public C07980bW AJg(int i, Bundle bundle) {
        return new AnonymousClass16D(this, this.A0I, getContentResolver());
    }

    @Override // X.AnonymousClass0EF
    public /* bridge */ /* synthetic */ void AM7(C07980bW r2, Object obj) {
        this.A08.swapCursor((Cursor) obj);
        A1S();
    }

    @Override // X.AnonymousClass0EF
    public void AMD(C07980bW r3) {
        this.A08.swapCursor(null);
        A1S();
    }

    public void lambda$onCreate$1083$AudioPickerActivity(View view) {
        String A0C2;
        String A042 = this.A0B.A04(this.A0E);
        LinkedHashMap linkedHashMap = this.A0J;
        int size = linkedHashMap.size();
        if (size == 1) {
            String str = ((AnonymousClass1CY) linkedHashMap.values().iterator().next()).A07;
            int i = 2131886818;
            if (this.A0E.A0C()) {
                i = 2131887802;
            }
            A0C2 = getString(i, str, A042);
        } else {
            AnonymousClass01G r3 = ((AnonymousClass09K) this).A01;
            int i2 = 2131755024;
            if (this.A0E.A0C()) {
                i2 = 2131755097;
            }
            A0C2 = r3.A0C(i2, (long) size, Integer.valueOf(size), A042);
        }
        AnonymousClass07X r1 = new AnonymousClass07X(this);
        r1.A01.A0E = A0C2;
        r1.A06(2131889645, new AnonymousClass1CT(this));
        r1.A04(2131886565, null);
        r1.A00().show();
    }

    public /* synthetic */ void lambda$onSearchRequested$1084$AudioPickerActivity(View view) {
        this.A04.setVisibility(8);
        if (!this.A0J.isEmpty()) {
            1la.A12(this.A02, true, true);
        }
        this.A07.A04(true);
    }

    @Override // X.AnonymousClass09N, X.AnonymousClass09I
    public void onBackPressed() {
        if (this.A07.A05()) {
            if (!this.A0J.isEmpty()) {
                1la.A12(this.A02, true, true);
            }
            this.A07.A04(true);
            return;
        }
        super.onBackPressed();
    }

    @Override // X.AnonymousClass0EE, X.AnonymousClass09L, X.AnonymousClass09K, X.AnonymousClass09N, X.AnonymousClass09M, X.AnonymousClass09H, X.AnonymousClass09G, X.AnonymousClass09J, X.AnonymousClass09I, X.AnonymousClass09F, X.AnonymousClass09O
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131558439);
        this.A0J = new LinkedHashMap();
        this.A0F = new 2Ky(this.A09, getContentResolver(), new Handler());
        Toolbar toolbar = (Toolbar) findViewById(2131365014);
        A0k(toolbar);
        this.A07 = new C05230Pn(this, ((AnonymousClass09K) this).A01, findViewById(2131364487), toolbar, new AnonymousClass1X8(this));
        1dn r0 = this.A0A;
        AbstractC003001o A022 = AbstractC003001o.A02(getIntent().getStringExtra("jid"));
        if (A022 != null) {
            this.A0E = r0.A0A(A022);
            AnonymousClass0LK A0c = A0c();
            AnonymousClass00I.A04(A0c, "supportActionBar is null");
            A0c.A0L(true);
            A0c.A0H(getString(2131889663, this.A0B.A04(this.A0E)));
            this.A05 = (RelativeLayout) findViewById(2131363766);
            this.A04 = (RelativeLayout) findViewById(2131363466);
            this.A06 = (TextView) findViewById(2131362850);
            ListView A1Q = A1Q();
            this.A03 = A1Q;
            A1Q.setBackground(null);
            ImageButton imageButton = (ImageButton) findViewById(2131362988);
            this.A02 = imageButton;
            1la.A12(imageButton, false, false);
            this.A02.setOnClickListener(new AnonymousClass1CS(this));
            this.A02.setContentDescription(getString(2131889645));
            AnonymousClass1CZ r02 = new AnonymousClass1CZ(this, this);
            this.A08 = r02;
            A1R(r02);
            this.A00 = ((AnonymousClass09I) this).A0F.A0D();
            return;
        }
        throw null;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        boolean z = false;
        menu.add(0, 2131363645, 0, 2131889576).setIcon(2131231363).setShowAsAction(10);
        this.A01 = menu;
        MenuItem findItem = menu.findItem(2131363645);
        if (findItem != null) {
            if (this.A03.getCount() > 0) {
                z = true;
            }
            findItem.setVisible(z);
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override // X.AnonymousClass09L, X.AnonymousClass09M, X.AnonymousClass09I, X.AnonymousClass09E
    public void onDestroy() {
        super.onDestroy();
        this.A0F.A00();
        this.A0F = null;
    }

    @Override // X.AnonymousClass09L, X.AnonymousClass09G
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        AudioManager audioManager = this.A00;
        if (audioManager != null) {
            if (i == 24) {
                audioManager.adjustStreamVolume(3, 1, 1);
                return true;
            } else if (i == 25) {
                audioManager.adjustStreamVolume(3, -1, 1);
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // X.AnonymousClass09I
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 2131363645) {
            onSearchRequested();
            return true;
        } else if (itemId != 16908332) {
            return true;
        } else {
            finish();
            return true;
        }
    }

    public boolean onSearchRequested() {
        1la.A12(this.A02, false, true);
        this.A07.A01();
        findViewById(2131364468).setOnClickListener(new AnonymousClass1CU(this));
        return false;
    }

    @Override // X.AnonymousClass09L, X.AnonymousClass09M, X.AnonymousClass09G, X.AnonymousClass09I
    public void onStart() {
        A1S();
        AbstractC07960bU.A00(this).A02(0, null, this);
        super.onStart();
    }

    @Override // X.AnonymousClass09L, X.AnonymousClass09M
    public void onStop() {
        super.onStop();
        2K7 A012 = this.A0D.A01();
        if (A012 != null) {
            A012.A06();
            this.A0D.A07((2K7) null);
        }
    }
}
