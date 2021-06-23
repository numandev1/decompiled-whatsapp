package com.whatsapp.backup.encryptedbackup;

import X.1la;
import X.AbstractC03230Fr;
import X.AnonymousClass00G;
import X.AnonymousClass01G;
import X.AnonymousClass01O;
import X.AnonymousClass0EB;
import X.AnonymousClass1DE;
import X.AnonymousClass1DF;
import X.C02740De;
import android.os.CountDownTimer;
import com.whatsapp.util.Log;
import java.util.Map;

public class EncBackupViewModel extends AbstractC03230Fr {
    public CountDownTimer A00;
    public final AnonymousClass0EB A01 = new AnonymousClass0EB();
    public final AnonymousClass0EB A02 = new AnonymousClass0EB();
    public final AnonymousClass0EB A03 = new AnonymousClass0EB();
    public final AnonymousClass0EB A04 = new AnonymousClass0EB();
    public final AnonymousClass0EB A05 = new AnonymousClass0EB();
    public final AnonymousClass0EB A06 = new AnonymousClass0EB();
    public final AnonymousClass0EB A07 = new AnonymousClass0EB();
    public final C02740De A08;
    public final AnonymousClass00G A09;
    public final AnonymousClass01G A0A;
    public final AnonymousClass01O A0B;

    public EncBackupViewModel(AnonymousClass01O r2, AnonymousClass01G r3, C02740De r4, AnonymousClass00G r5) {
        this.A0B = r2;
        this.A0A = r3;
        this.A08 = r4;
        this.A09 = r5;
    }

    public static void A00(EncBackupViewModel encBackupViewModel, int i) {
        if (encBackupViewModel == null) {
            throw null;
        } else if (i == 0) {
            encBackupViewModel.A03.A0A(3);
            if (encBackupViewModel.A03() == 1 || encBackupViewModel.A03() == 5) {
                Log.i("EncBackupViewModel/enabled encrypted backup");
                encBackupViewModel.A02.A0A(500);
            } else if (encBackupViewModel.A03() == 4) {
                Log.i("EncBackupViewModel/successfully changed password");
                encBackupViewModel.A02.A0A(501);
            }
        } else {
            Log.e("EncBackupViewModel/failed to enable encrypted backup");
            encBackupViewModel.A03.A0A(4);
        }
    }

    public static void A01(EncBackupViewModel encBackupViewModel, int i) {
        if (encBackupViewModel == null) {
            throw null;
        } else if (i == 0) {
            Log.i("EncBackupViewModel/enabled encrypted backup");
            encBackupViewModel.A03.A0A(3);
            encBackupViewModel.A02.A0A(401);
        } else {
            Log.e("EncBackupViewModel/failed to enable encrypted backup");
            encBackupViewModel.A03.A0A(4);
        }
    }

    public static void A02(EncBackupViewModel encBackupViewModel, int i, int i2) {
        if (encBackupViewModel == null) {
            throw null;
        } else if (i == 0) {
            Log.i("EncBackupViewModel/successfully retrieved and saved backup key");
            encBackupViewModel.A03.A0A(3);
            encBackupViewModel.A05.A0A(-1);
        } else if (i == 8) {
            Log.i("EncBackupViewModel/invalid password");
            encBackupViewModel.A03.A0A(5);
            if (i2 == 0) {
                Log.i("EncBackupViewModel/all password attempts used");
            }
        } else if (i == 404) {
            Log.i("EncBackupViewModel/account not found");
            encBackupViewModel.A03.A0A(7);
        } else {
            Log.e("EncBackupViewModel/failed to retrieve and save backup key");
            encBackupViewModel.A03.A0A(4);
        }
    }

    public int A03() {
        Object A012 = this.A07.A01();
        if (A012 != null) {
            return ((Number) A012).intValue();
        }
        throw null;
    }

    public void A04(int i) {
        this.A02.A0B(Integer.valueOf(i));
    }

    public void A05(int i, int i2) {
        if (i == 0) {
            Log.i("EncBackupViewModel/successfully verified password");
            this.A03.A0A(3);
            if (A03() == 3) {
                this.A02.A0A(301);
            } else if (A03() == 4) {
                this.A02.A0A(300);
            }
        } else if (i == 8) {
            Log.i("EncBackupViewModel/invalid password");
            Map map = AnonymousClass1DE.A00;
            Integer valueOf = Integer.valueOf(i2);
            if (map.containsKey(valueOf)) {
                long intValue = (long) ((Number) map.get(valueOf)).intValue();
                this.A06.A0A(1la.A0b(this.A0A, intValue));
                AnonymousClass1DF r0 = new AnonymousClass1DF(this, intValue);
                this.A00 = r0;
                r0.start();
            }
            this.A03.A0A(5);
        } else if (i == 408) {
            Log.i("EncBackupViewModel/request timeout");
            this.A03.A0A(6);
        } else {
            Log.e("EncBackupViewModel/failed to verify password");
            this.A03.A0A(4);
        }
    }

    public void A06(boolean z) {
        if (z) {
            Log.i("EncBackupViewModel/successfully verified encryption key");
            this.A03.A0A(3);
            if (A03() == 3) {
                this.A02.A0A(301);
            } else if (A03() == 5) {
                this.A02.A0A(300);
            }
        } else {
            Log.i("EncBackupViewModel/invalid encryption key");
            this.A03.A0A(5);
        }
    }
}
