package com.whatsapp.util;

import X.AnonymousClass00C;
import android.system.ErrnoException;
import android.system.Os;
import java.io.File;

public class FileUtils$OsRename {
    public static int attempt(File file, File file2) {
        try {
            Os.rename(file.getAbsolutePath(), file2.getAbsolutePath());
            return -1;
        } catch (ErrnoException e) {
            StringBuilder A0R = AnonymousClass00C.A0R("MMS Os.rename also failed, from=");
            A0R.append(file.getAbsolutePath());
            A0R.append(" to=");
            A0R.append(file2.getAbsolutePath());
            A0R.append(" errno=");
            A0R.append(e.errno);
            Log.e(A0R.toString(), e);
            return e.errno;
        }
    }
}
