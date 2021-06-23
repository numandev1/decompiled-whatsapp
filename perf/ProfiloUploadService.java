package com.whatsapp.perf;

import X.3Sx;
import X.3fS;
import X.AnonymousClass00G;
import X.AnonymousClass00H;
import X.AnonymousClass00Q;
import X.AnonymousClass02R;
import X.AnonymousClass0CD;
import X.AnonymousClass14Y;
import X.C005502o;
import X.C03020Eo;
import android.content.Intent;
import android.util.Pair;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilenameFilter;
import java.util.List;

public class ProfiloUploadService extends AnonymousClass14Y {
    public AnonymousClass00H A00;
    public AnonymousClass0CD A01;
    public AnonymousClass00G A02;
    public C005502o A03;
    public AnonymousClass02R A04;

    @Override // X.AnonymousClass0BM
    public void A05(Intent intent) {
        File[] listFiles;
        int length;
        File file = new File(getCacheDir(), "profilo/upload");
        if (file.exists() && (listFiles = file.listFiles((FilenameFilter) 3Sx.A00)) != null && (length = listFiles.length) != 0) {
            for (int i = 1; i < length; i++) {
                listFiles[i].delete();
                listFiles[i].getPath();
            }
            File file2 = listFiles[0];
            if (this.A01.A03(true) != 1) {
                file2.delete();
                return;
            }
            try {
                C03020Eo r0 = new C03020Eo(this.A03, "https://crashlogs.whatsapp.net/wa_profilo_data", this.A04.A02(), new 3fS(file2), false, false);
                List list = r0.A0C;
                list.add(Pair.create("access_token", "1063127757113399|745146ffa34413f9dbb5469f5370b7af"));
                list.add(Pair.create("from", this.A00.A05()));
                r0.A06(new FileInputStream(file2), "file", file2.getName(), 0, file2.length());
                list.add(Pair.create("agent", AnonymousClass02R.A01(((AnonymousClass00Q) this.A00).A08, "2.21.12.20-website-release")));
                list.add(Pair.create("device_id", this.A02.A0H()));
                r0.A01();
            } catch (Exception | OutOfMemoryError e) {
                Log.w("ProfiloUpload/Error Uploading file", e);
                file2.delete();
            }
        }
    }
}
