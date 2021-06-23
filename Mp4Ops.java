package com.whatsapp;

import X.1jK;
import X.1uw;
import X.AnonymousClass00C;
import X.AnonymousClass00E;
import X.AnonymousClass00H;
import X.AnonymousClass00Q;
import X.AnonymousClass01T;
import X.C002701g;
import X.C02130Ag;
import X.C02950Eb;
import X.C02970Ee;
import android.content.Context;
import android.os.Environment;
import android.os.SystemClock;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;

public class Mp4Ops {
    public static volatile Mp4Ops A02;
    public final AnonymousClass00E A00;
    public final AnonymousClass01T A01;

    public class LibMp4CheckAndRepairResult {
        public final int errorCode;
        public final String errorMessage;
        public final boolean ioException;
        public final long newMajorVersion;
        public final long newMinorVersion;
        public final int newOriginator;
        public final long newReleaseVersion;
        public final long oldMajorVersion;
        public final long oldMinorVersion;
        public final int oldOriginator;
        public final long oldReleaseVersion;
        public final boolean repairRequired;
        public final boolean repaired;
        public final boolean success;

        public LibMp4CheckAndRepairResult(boolean z, boolean z2, boolean z3, int i, String str, boolean z4, long j, long j2, long j3, int i2, long j4, long j5, long j6, int i3) {
            this.success = z;
            this.repaired = z2;
            this.repairRequired = z3;
            this.errorCode = i;
            this.errorMessage = str;
            this.ioException = z4;
            this.oldMajorVersion = j;
            this.oldMinorVersion = j2;
            this.oldReleaseVersion = j3;
            this.oldOriginator = i2;
            this.newMajorVersion = j4;
            this.newMinorVersion = j5;
            this.newReleaseVersion = j6;
            this.newOriginator = i3;
        }
    }

    public class LibMp4OperationResult {
        public final int errorCode;
        public final String errorMessage;
        public final boolean ioException;
        public final int rotationDegrees;
        public final boolean success;

        public LibMp4OperationResult(boolean z, boolean z2, int i, int i2, String str) {
            this.success = z;
            this.ioException = z2;
            this.errorCode = i;
            this.errorMessage = str;
            this.rotationDegrees = i2;
        }
    }

    public class LibMp4StreamCheckResult {
        public final long bytesRequiredToExtractThumbnail;
        public final int errorCode;
        public final String errorMessage;
        public final boolean ioException;
        public final boolean success;

        public LibMp4StreamCheckResult(boolean z, boolean z2, int i, String str, long j) {
            this.success = z;
            this.ioException = z2;
            this.errorCode = i;
            this.errorMessage = str;
            this.bytesRequiredToExtractThumbnail = j;
        }
    }

    public Mp4Ops(AnonymousClass01T r1, AnonymousClass00E r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public static Mp4Ops A00() {
        if (A02 == null) {
            synchronized (Mp4Ops.class) {
                try {
                    if (A02 == null) {
                        AnonymousClass01T A002 = AnonymousClass01T.A00();
                        C02130Ag.A00();
                        A02 = new Mp4Ops(A002, AnonymousClass00E.A00());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return A02;
    }

    public static void A01(Context context, AnonymousClass00H r7, File file, Exception exc, String str) {
        boolean z;
        StringBuilder sb = new StringBuilder();
        sb.append(Environment.getExternalStorageDirectory().getPath());
        sb.append("/WhatsApp/Media/WhatsApp Video/video.fos");
        File file2 = new File(sb.toString());
        try {
            z = mp4forensic(400, file2.getAbsolutePath(), file.getAbsolutePath());
            StringBuilder sb2 = new StringBuilder("mp4ops/forensic ret=");
            sb2.append(z);
            Log.e(sb2.toString());
        } catch (Error e) {
            Log.e("videotranscodder/forensic fail/", e);
            z = false;
        }
        AnonymousClass00C.A1E("mp4ops/forensic-upload/create result=", z);
        if (z) {
            try {
                File A09 = C002701g.A09(context, file2);
                Log.e("Mp4Ops/uploadMp4FailureLogs", exc);
                StringBuilder sb3 = new StringBuilder();
                sb3.append("LibMp4Operations ");
                sb3.append(str);
                sb3.append(" failed (file): ");
                sb3.append(exc.getMessage());
                String obj = sb3.toString();
                AnonymousClass00Q r72 = (AnonymousClass00Q) r7;
                if (r72 != null) {
                    C02950Eb r3 = new C02950Eb("Mp4Ops/uploadMp4FailureLogs");
                    r72.A0E(r3, "Mp4Ops/uploadMp4FailureLogs", obj, true);
                    if (r72.A02.A00("Mp4Ops/uploadMp4FailureLogs")) {
                        C002701g.A0c();
                        Log.e("UNCAUGHT EXCEPTION", r3);
                        r72.A0G(new HashSet(Collections.singletonList("log_files_upload")), A09, "attachment", r3);
                    }
                } else {
                    throw null;
                }
            } catch (IOException e2) {
                Log.e("mp4ops/forensic-upload/", e2);
            }
        }
        file2.delete();
    }

    public static void A02(AnonymousClass00E r4, File file) {
        try {
            if (1uw.A06(file).A00 != 0) {
                File A07 = r4.A07(file);
                LibMp4OperationResult removeAudioTracks = removeAudioTracks(file.getAbsolutePath(), A07.getAbsolutePath());
                if (!removeAudioTracks.success) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("mp4ops/remove-audio-tracks");
                    sb.append(removeAudioTracks.errorMessage);
                    Log.e(sb.toString());
                    int i = removeAudioTracks.errorCode;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("invalid result, error_code: ");
                    sb2.append(i);
                    throw new C02970Ee(i, sb2.toString());
                } else if (!1jK.A0Y(r4, A07, file)) {
                    Log.e("mp4ops/remove-audio-tracks failed to apply tag properly.  Renaming marked file to original filepath unsuccessful");
                    throw new C02970Ee(0, "mp4ops/remove-audio-tracks failed to apply tag properly.  Renaming marked file to original filepath unsuccessful");
                }
            }
        } catch (IOException e) {
            Log.e("Could not access file or failed to move files properly", e);
            throw new C02970Ee(0, "Could not access file or failed to move files properly");
        }
    }

    public static void A03(File file, File file2) {
        try {
            Log.i("mp4ops/removeExifData/start");
            LibMp4OperationResult mp4mux = mp4mux(file.getAbsolutePath(), file.getAbsolutePath(), file2.getAbsolutePath(), -1.0f, 0.0f, -1.0f, -1.0f, -1, file.getAbsolutePath(), 0.0f);
            StringBuilder sb = new StringBuilder();
            sb.append("mp4ops/removeExifData/finished success=");
            sb.append(mp4mux.success);
            Log.i(sb.toString());
            if (mp4mux.success) {
                return;
            }
            if (mp4mux.ioException) {
                throw new IOException("mp4ops/removeExifData/No space");
            }
            int i = mp4mux.errorCode;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("mp4ops/removeExifData failed, error_code: ");
            sb2.append(i);
            throw new C02970Ee(i, sb2.toString(), new Throwable());
        } catch (Error e) {
            Log.e("mp4ops/removeExifData/failed: mp4mux error, exiting", e);
            throw new C02970Ee(0, e.getMessage(), new Throwable());
        }
    }

    public static void A04(File file, File file2, File file3, File file4, int i, long j, long j2, long j3, long j4) {
        Log.i("mp4ops/mux/start");
        float f = ((float) j) / 1000.0f;
        float f2 = ((float) j4) / 1000.0f;
        float f3 = ((float) j3) / 1000.0f;
        float f4 = ((float) j2) / 1000.0f;
        String str = "";
        String absolutePath = file2 == null ? "" : file2.getAbsolutePath();
        if (file3 != null) {
            try {
                str = file3.getAbsolutePath();
            } catch (Error e) {
                Log.e("mp4ops/mux/failed: mp4mux error, exiting", e);
                throw new C02970Ee(0, e.getMessage(), new Throwable());
            }
        }
        LibMp4OperationResult mp4mux = mp4mux(absolutePath, str, file.getAbsolutePath(), f, 0.0f, f3, f4, i, file4.getAbsolutePath(), f2);
        AnonymousClass00C.A1X(AnonymousClass00C.A0R("mp4ops/mux/result: "), mp4mux.success);
        if (!mp4mux.success) {
            AnonymousClass00C.A1O(AnonymousClass00C.A0R("mp4ops/mux/error_message/"), mp4mux.errorMessage);
            if (mp4mux.ioException) {
                throw new IOException("No space");
            }
            StringBuilder A0R = AnonymousClass00C.A0R("invalid result, error_code: ");
            int i2 = mp4mux.errorCode;
            A0R.append(i2);
            throw new C02970Ee(i2, A0R.toString(), new Throwable());
        }
        StringBuilder A0R2 = AnonymousClass00C.A0R("mp4ops/mux/finished, size:");
        A0R2.append(file.length());
        Log.i(A0R2.toString());
    }

    public static void A05(File file, boolean z) {
        LibMp4OperationResult mp4check;
        Log.i("mp4ops/check/start");
        int i = 0;
        do {
            try {
                mp4check = mp4check(file.getAbsolutePath(), z);
                if (!mp4check.success && mp4check.ioException) {
                    SystemClock.sleep(100);
                    i++;
                }
            } catch (Error e) {
                Log.e("mp4ops/integration fail/", e);
                throw new C02970Ee(0, "integrity check error", new Throwable());
            }
        } while (i < 5);
        if (mp4check.success) {
            Log.i("mp4ops/check/finished");
            return;
        }
        StringBuilder A0R = AnonymousClass00C.A0R("mp4ops/check/error_message/");
        A0R.append(mp4check.errorMessage);
        Log.e(A0R.toString());
        int i2 = mp4check.errorCode;
        StringBuilder A0R2 = AnonymousClass00C.A0R("integrity check failed, error_code: ");
        A0R2.append(i2);
        throw new C02970Ee(i2, A0R2.toString(), new Throwable());
    }

    public static native LibMp4OperationResult mp4check(String str, boolean z);

    public static native LibMp4CheckAndRepairResult mp4checkAndRepair(String str, String str2);

    public static native boolean mp4forensic(int i, String str, String str2);

    public static native LibMp4OperationResult mp4mux(String str, String str2, String str3, float f, float f2, float f3, float f4, int i, String str4, float f5);

    public static native LibMp4OperationResult mp4removeDolbyEAC3Track(String str, String str2);

    public static native LibMp4StreamCheckResult mp4streamcheck(String str, boolean z, long j);

    public static native LibMp4OperationResult removeAudioTracks(String str, String str2);

    public boolean A06(File file) {
        Log.i("mp4ops/checkAndRepair/start");
        AnonymousClass00E r2 = this.A00;
        File A07 = r2.A07(file);
        StringBuilder A0R = AnonymousClass00C.A0R("mp4ops/checkAndRepair/repairFileName.exists");
        A0R.append(A07.exists());
        Log.i(A0R.toString());
        try {
            LibMp4CheckAndRepairResult mp4checkAndRepair = mp4checkAndRepair(file.getAbsolutePath(), A07.getAbsolutePath());
            if (!mp4checkAndRepair.success) {
                if (mp4checkAndRepair.repaired) {
                    A07.delete();
                }
                AnonymousClass00C.A1O(AnonymousClass00C.A0R("mp4ops/checkAndRepair/error_message/"), mp4checkAndRepair.errorMessage);
                if (mp4checkAndRepair.ioException) {
                    throw new IOException("No space");
                }
                int i = mp4checkAndRepair.errorCode;
                StringBuilder A0R2 = AnonymousClass00C.A0R("integrity check/repair failed, error_code: ");
                A0R2.append(i);
                throw new C02970Ee(i, A0R2.toString(), new Throwable());
            }
            Log.i("mp4ops/checkAndRepair/finished");
            if (mp4checkAndRepair.repaired) {
                StringBuilder A0R3 = AnonymousClass00C.A0R("mp4ops/checkAndRepair/file_is_repaired, new file created and renamed: ");
                A0R3.append(A07.getAbsolutePath());
                Log.i(A0R3.toString());
                if (this.A01.A0C(239)) {
                    A03(A07, file);
                    return true;
                } else if (A07.renameTo(file)) {
                    return true;
                } else {
                    Log.i("mp4ops/checkAndRepair/rename_failed");
                    throw new IOException("unable to rename file");
                }
            } else if (this.A01.A0C(239)) {
                Log.i("mp4ops/checkAndRepair/file_repair_not_needed but will remove exif data");
                File A072 = r2.A07(file);
                A03(file, A072);
                if (file.length() == A072.length()) {
                    return false;
                }
                if (A072.renameTo(file)) {
                    return true;
                }
                Log.i("mp4ops/checkAndRepair/rename_failed");
                throw new IOException("unable to rename file");
            } else {
                Log.i("mp4ops/checkAndRepair/file_repair_not_needed");
                return false;
            }
        } catch (Error e) {
            Log.e("mp4ops/integration fail/", e);
            throw new C02970Ee(0, "integrity check error", new Throwable());
        }
    }
}
