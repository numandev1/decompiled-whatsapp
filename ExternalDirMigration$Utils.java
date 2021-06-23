package com.whatsapp;

import android.system.ErrnoException;
import android.system.OsConstants;
import com.whatsapp.util.StatResult;
import java.io.File;
import java.io.IOException;

public final class ExternalDirMigration$Utils {
    public static StatResult lstatOpenFile(File file) {
        try {
            return StatResult.lstatOpenFile(file.getPath());
        } catch (ErrnoException e) {
            if (e.errno == OsConstants.ENOENT) {
                return null;
            }
            throw new IOException(e);
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
