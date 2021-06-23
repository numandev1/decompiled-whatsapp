package com.whatsapp.registration.backuptoken;

import X.AnonymousClass01M;
import X.AnonymousClass0AZ;
import X.AnonymousClass0GZ;
import android.app.backup.BackupAgentHelper;
import android.app.backup.BackupDataInput;
import android.app.backup.BackupDataOutput;
import android.app.backup.FileBackupHelper;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.whatsapp.util.Log;

public class BackupTokenAgentHelper extends BackupAgentHelper {
    @Override // android.app.backup.BackupAgentHelper, android.app.backup.BackupAgent
    public void onBackup(ParcelFileDescriptor parcelFileDescriptor, BackupDataOutput backupDataOutput, ParcelFileDescriptor parcelFileDescriptor2) {
        if (Build.VERSION.SDK_INT < 28) {
            Log.i("BackupTokenAgentHelper/onBackup/backup skipped/older api version");
        } else if ((backupDataOutput.getTransportFlags() & 1) == 0) {
            Log.i("BackupTokenAgentHelper/onBackup/backup skipped/encryption not enabled");
        } else if (!AnonymousClass01M.A1A(((AnonymousClass0AZ) AnonymousClass01M.A0V(this)).A0v().A00)) {
            Log.i("BackupTokenAgentHelper/onBackup/backup skipped/google play services is not installed");
        } else {
            synchronized (AnonymousClass0GZ.A00) {
                Log.i("BackupTokenAgentHelper/onBackup/success");
                super.onBackup(parcelFileDescriptor, backupDataOutput, parcelFileDescriptor2);
            }
        }
    }

    public void onCreate() {
        addHelper("backup_helper_key", new FileBackupHelper(this, "backup_token"));
    }

    @Override // android.app.backup.BackupAgentHelper, android.app.backup.BackupAgent
    public void onRestore(BackupDataInput backupDataInput, int i, ParcelFileDescriptor parcelFileDescriptor) {
        if (Build.VERSION.SDK_INT < 23) {
            Log.i("BackupTokenAgentHelper/onRestore/backup skipped/feature not enabled");
            return;
        }
        synchronized (AnonymousClass0GZ.A00) {
            Log.i("BackupTokenAgentHelper/onRestore/success");
            super.onRestore(backupDataInput, i, parcelFileDescriptor);
        }
    }
}
