package com.whatsapp.util;

import X.AnonymousClass00C;
import X.AnonymousClass00L;
import X.AnonymousClass00R;
import X.AnonymousClass023;
import X.AnonymousClass024;
import X.C002701g;
import android.os.Looper;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;

public class Log {
    public static final CharsetEncoder DO_LOG_ENCODER = Charset.defaultCharset().newEncoder();
    public static final ByteBuffer DO_LOG_ENCODE_BUFFER = ByteBuffer.allocate(16384);
    public static final AnonymousClass00R LOGGER_THREAD;
    public static final PrintStream ORIGINAL_SYSTEM_ERR = System.err;
    public static FileChannel channel = null;
    public static final Object compressFileLock = new Object();
    public static AnonymousClass00L connectivityInfoProvider = null;
    public static int level = 5;
    public static final AtomicReference logDirRef = new AtomicReference();
    public static File logFile;
    public static final CountDownLatch logFileLatch = new CountDownLatch(1);
    public static File logTempFile;
    public static final Object tempFileLock = new Object();
    public static String timezone;
    public static final ReentrantLock writeFileLock = new ReentrantLock(true);

    static {
        AnonymousClass00R r0 = new AnonymousClass00R();
        r0.start();
        LOGGER_THREAD = r0;
    }

    public static int A00(File file, File file2) {
        int i;
        int length;
        String name = file2.getName();
        int length2 = name.length() + 1;
        File[] listFiles = file.getParentFile().listFiles();
        if (listFiles == null) {
            return 0;
        }
        int length3 = listFiles.length;
        int i2 = 0;
        int i3 = 0;
        while (i3 < length3) {
            String name2 = listFiles[i3].getName();
            if (name2.startsWith(name) && length2 < (length = name2.length())) {
                try {
                    i = Integer.parseInt(name2.substring(length2, length));
                    if (i > i2) {
                        i3++;
                        i2 = i;
                    }
                } catch (NumberFormatException e) {
                    i = i2;
                }
            }
            i = i2;
            i3++;
            i2 = i;
        }
        return i2;
    }

    public static void a(String str) {
        log("LL_A ", str);
    }

    public static void a(boolean z) {
        if (!z) {
            log("LL_A ", "Assertion Failed");
        }
    }

    public static String adorn(String str, StringBuilder sb) {
        StringBuilder sb2;
        Thread currentThread = Thread.currentThread();
        long id = currentThread.getId();
        String name = currentThread.getName();
        StringBuilder A0R = AnonymousClass00C.A0R(str);
        AnonymousClass00L r0 = connectivityInfoProvider;
        String A0N = AnonymousClass00C.A0N(A0R, r0 != null ? (String) r0.A00.get() : "D", " ");
        if (level < 5) {
            int length = A0N.length() + 20 + name.length() + 4;
            if (sb.length() > 16384) {
                sb2 = new StringBuilder(length + 16384 + 3);
                sb2.append(A0N);
                sb2.append('[');
                sb2.append(id);
                sb2.append(':');
                sb2.append(name);
                sb2.append("] ");
                sb2.append(sb.substring(0, 16384));
                sb2.append("...");
            } else {
                sb2 = new StringBuilder(length + sb.length());
                sb2.append(A0N);
                sb2.append('[');
                sb2.append(id);
                sb2.append(':');
                sb2.append(name);
                sb2.append("] ");
                sb2.append((CharSequence) sb);
            }
            return sb2.toString();
        }
        StackTraceElement[] stackTrace = currentThread.getStackTrace();
        String str2 = "";
        String str3 = "";
        int i = 5;
        while (true) {
            if (i >= stackTrace.length) {
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i];
            if (!stackTraceElement.isNativeMethod()) {
                if (stackTraceElement.getFileName() != null) {
                    str2 = stackTraceElement.getFileName();
                    str3 = String.valueOf(stackTraceElement.getLineNumber());
                    break;
                }
                str3 = String.valueOf(stackTraceElement.getLineNumber());
                str2 = "(null)";
            } else if (i == 5) {
                str2 = stackTraceElement.getFileName();
                str3 = "native";
            }
            i++;
        }
        int length2 = A0N.length();
        StringBuilder sb3 = new StringBuilder(length2 + 1 + 20 + 1 + name.length() + 1 + str2.length() + 1 + str3.length() + 1 + sb.length());
        sb3.append(A0N);
        sb3.append('[');
        sb3.append(id);
        sb3.append(':');
        sb3.append(name);
        sb3.append(']');
        sb3.append(str2);
        sb3.append(':');
        sb3.append(str3);
        sb3.append(' ');
        sb3.append((CharSequence) sb);
        return sb3.toString();
    }

    public static void blockingLog(int i, String str) {
        if (i <= level) {
            String adorn = adorn(getLogPrefix(i), new StringBuilder(str));
            doLogToFile(adorn);
            if (level == 5) {
                logToLogcat(i, adorn);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ca, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ce, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00d1, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00d5, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00d8, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00dc, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00f0, code lost:
        if (r8.getAbsolutePath().equals(r2.getAbsolutePath()) == false) goto L_0x00f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00f2, code lost:
        r8.delete();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x014b, code lost:
        if (r8.getAbsolutePath().equals(r2.getAbsolutePath()) == false) goto L_0x00f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0150, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0154, code lost:
        throw r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.io.File compress() {
        /*
        // Method dump skipped, instructions count: 392
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.Log.compress():java.io.File");
    }

    public static void d(String str) {
        int i = level;
        if (i == 5) {
            logToLogcat(4, log("LL_D ", str));
        } else if (i >= 4) {
            log("LL_D ", str);
        }
    }

    public static void d(String str, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("; exception=");
        sb.append(th);
        String obj = sb.toString();
        int i = level;
        if (i == 5) {
            logToLogcat(4, log("LL_D ", obj, getStackTraceString(th)));
        } else if (i >= 4) {
            log("LL_D ", obj, getStackTraceString(th));
        }
    }

    public static void d(Throwable th) {
        int i = level;
        if (i == 5) {
            logToLogcat(4, log("LL_D ", getStackTraceString(th)));
        } else if (i >= 4) {
            log("LL_D ", getStackTraceString(th));
        }
    }

    public static void doLogToFile(String str) {
        StringBuilder sb = new StringBuilder();
        Calendar instance = Calendar.getInstance();
        sb.append(instance.get(1));
        sb.append('-');
        if (instance.get(2) < 9) {
            sb.append('0');
        }
        sb.append(instance.get(2) + 1);
        sb.append('-');
        if (instance.get(5) < 10) {
            sb.append('0');
        }
        sb.append(instance.get(5));
        sb.append(' ');
        if (instance.get(11) < 10) {
            sb.append('0');
        }
        sb.append(instance.get(11));
        sb.append(':');
        if (instance.get(12) < 10) {
            sb.append('0');
        }
        sb.append(instance.get(12));
        sb.append(':');
        if (instance.get(13) < 10) {
            sb.append('0');
        }
        sb.append(instance.get(13));
        sb.append('.');
        if (instance.get(14) < 10) {
            sb.append("00");
        } else if (instance.get(14) < 100) {
            sb.append('0');
        }
        sb.append(instance.get(14));
        sb.append(' ');
        writeFileLock.lock();
        try {
            if (!initialize()) {
                writeFileLock.unlock();
                return;
            }
            FileChannel fileChannel = channel;
            if (fileChannel != null) {
                fileChannel.position(fileChannel.size());
                FileChannel fileChannel2 = channel;
                CharsetEncoder charsetEncoder = DO_LOG_ENCODER;
                ByteBuffer byteBuffer = DO_LOG_ENCODE_BUFFER;
                encodeAndWriteToChannel(fileChannel2, charsetEncoder, byteBuffer, sb);
                FileChannel fileChannel3 = channel;
                CharsetEncoder charsetEncoder2 = DO_LOG_ENCODER;
                ByteBuffer byteBuffer2 = DO_LOG_ENCODE_BUFFER;
                encodeAndWriteToChannel(fileChannel3, charsetEncoder2, byteBuffer, str);
                encodeAndWriteToChannel(channel, charsetEncoder2, byteBuffer2, "\n");
                writeFileLock.unlock();
                return;
            }
            throw new NullPointerException();
        } catch (IOException e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("IOException on ");
            sb2.append(str);
            android.util.Log.e("WhatsApp", sb2.toString(), e);
        } catch (Throwable th) {
            writeFileLock.unlock();
            throw th;
        }
    }

    public static void doLogToLogcat(int i, String str) {
        if (i == 0 || i == 5) {
            android.util.Log.v("WhatsApp", str);
        } else if (i == 4) {
            android.util.Log.d("WhatsApp", str);
        } else if (i == 3) {
            android.util.Log.i("WhatsApp", str);
        } else if (i == 2) {
            android.util.Log.w("WhatsApp", str);
        } else if (i == 1) {
            android.util.Log.e("WhatsApp", str);
        }
    }

    public static void e(String str) {
        if (level == 5) {
            logToLogcat(1, log("LL_E ", str));
        } else {
            log("LL_E ", str);
        }
    }

    public static void e(String str, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("; exception=");
        sb.append(th);
        String obj = sb.toString();
        int i = level;
        String stackTraceString = getStackTraceString(th);
        if (i == 5) {
            logToLogcat(1, log("LL_E ", obj, stackTraceString));
        } else {
            log("LL_E ", obj, stackTraceString);
        }
    }

    public static void e(Throwable th) {
        int i = level;
        String stackTraceString = getStackTraceString(th);
        if (i == 5) {
            logToLogcat(1, log("LL_E ", stackTraceString));
        } else {
            log("LL_E ", stackTraceString);
        }
    }

    public static void encodeAndWriteToChannel(FileChannel fileChannel, CharsetEncoder charsetEncoder, ByteBuffer byteBuffer, CharSequence charSequence) {
        CharBuffer wrap = CharBuffer.wrap(charSequence);
        charsetEncoder.reset();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        charsetEncoder.onMalformedInput(codingErrorAction);
        charsetEncoder.onUnmappableCharacter(codingErrorAction);
        byteBuffer.clear();
        CoderResult coderResult = CoderResult.OVERFLOW;
        while (coderResult.isOverflow()) {
            coderResult = charsetEncoder.encode(wrap, byteBuffer, true);
            byteBuffer.flip();
            if (coderResult.isError()) {
                coderResult.throwException();
            }
            fileChannel.write(byteBuffer);
            byteBuffer.clear();
        }
    }

    /* JADX INFO: finally extract failed */
    public static void flush() {
        try {
            blockingLog(5, "log/flush/start");
            AnonymousClass00R r1 = LOGGER_THREAD;
            if (Thread.currentThread() == r1) {
                int size = r1.A03.size();
                for (int i = 0; i < size; i++) {
                    r1.A00();
                }
            } else {
                FutureTask futureTask = new FutureTask(AnonymousClass00R.A05, null);
                r1.A01(futureTask);
                while (!futureTask.isDone()) {
                    try {
                        futureTask.get();
                    } catch (InterruptedException | ExecutionException e) {
                    }
                }
            }
            blockingLog(5, "log/flush/logs written");
            blockingLog(5, "log/flush/forcing to disk");
            writeFileLock.lock();
            try {
                FileChannel fileChannel = channel;
                if (fileChannel != null && fileChannel.isOpen()) {
                    channel.force(true);
                }
                writeFileLock.unlock();
                blockingLog(5, "log/flush/end");
            } catch (Throwable th) {
                writeFileLock.unlock();
                throw th;
            }
        } catch (IOException e2) {
            String logPrefix = getLogPrefix(1);
            StringBuilder sb = new StringBuilder("log/flush/failed");
            sb.append("; exception=");
            sb.append(e2);
            String obj = sb.toString();
            String stackTraceString = getStackTraceString(e2);
            StringBuilder sb2 = new StringBuilder(obj.length() + 1 + stackTraceString.length());
            AnonymousClass00C.A1U(sb2, obj, "\n", stackTraceString);
            String adorn = adorn(logPrefix, sb2);
            doLogToFile(adorn);
            if (level == 5) {
                logToLogcat(1, adorn);
            }
        }
    }

    public static ArrayList getLatestLogs(int i) {
        File file = logFile;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        ArrayList arrayList = new ArrayList();
        Date date = new Date();
        String pattern = simpleDateFormat.toPattern();
        String A0U = C002701g.A0U(file.getName(), ".gz");
        String A0N = C002701g.A0N(file.getName());
        File[] listFiles = file.getParentFile().listFiles();
        if (listFiles != null) {
            Arrays.sort(listFiles);
            for (File file2 : listFiles) {
                String name = file2.getName();
                if (name.startsWith(A0N) && name.endsWith(A0U)) {
                    int length = A0N.length();
                    try {
                        if ((date.getTime() - simpleDateFormat.parse(name.substring(length, pattern.length() + length)).getTime()) / TimeUnit.DAYS.toMillis(1) < ((long) i)) {
                            arrayList.add(file2);
                        }
                    } catch (ParseException e) {
                    }
                }
            }
        }
        return arrayList;
    }

    public static String getLogPrefix(int i) {
        if (i == 0) {
            return "LL_A ";
        }
        if (i == 1) {
            return "LL_E ";
        }
        if (i == 2) {
            return "LL_W ";
        }
        if (i == 3) {
            return "LL_I ";
        }
        if (i == 4) {
            return "LL_D ";
        }
        if (i == 5) {
            return "LL_V ";
        }
        throw new IllegalArgumentException(AnonymousClass00C.A0E("Invalid log level ", i));
    }

    public static String getStackTraceString(Throwable th) {
        if (th == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder("### begin stack trace 2.21.12.20(298754650)\n");
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        sb.append(stringWriter.toString());
        sb.append("### end stack trace");
        return sb.toString();
    }

    public static void i(String str) {
        int i = level;
        if (i == 5) {
            logToLogcat(3, log("LL_I ", str));
        } else if (i >= 3) {
            log("LL_I ", str);
        }
    }

    public static void i(String str, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("; exception=");
        sb.append(th);
        String obj = sb.toString();
        int i = level;
        if (i == 5) {
            logToLogcat(3, log("LL_I ", obj, getStackTraceString(th)));
        } else if (i >= 3) {
            log("LL_I ", obj, getStackTraceString(th));
        }
    }

    public static void i(Throwable th) {
        int i = level;
        if (i == 5) {
            logToLogcat(3, log("LL_I ", getStackTraceString(th)));
        } else if (i >= 3) {
            log("LL_I ", getStackTraceString(th));
        }
    }

    public static boolean initialize() {
        FileChannel fileChannel = channel;
        if (fileChannel != null && fileChannel.isOpen()) {
            return true;
        }
        if (Looper.myLooper() == Looper.getMainLooper() && logFileLatch.getCount() == 1) {
            throw new AssertionError("If Log.initialize() is called on the main thread,  Log.setApplicationContext() must have been called beforehand.");
        }
        try {
            logFileLatch.await();
            File file = (File) logDirRef.get();
            if (file == null) {
                return false;
            }
            if (!file.exists() && !file.mkdirs()) {
                return false;
            }
            try {
                channel = new FileOutputStream(logFile, true).getChannel();
                PrintStream printStream = System.err;
                PrintStream printStream2 = ORIGINAL_SYSTEM_ERR;
                boolean z = printStream != printStream2;
                System.setErr(new PrintStream((OutputStream) new AnonymousClass024(new AnonymousClass023(printStream2), Channels.newOutputStream(channel)), true));
                if (z) {
                    printStream.close();
                } else {
                    printStream.flush();
                }
                Calendar instance = Calendar.getInstance();
                int i = (instance.get(16) + instance.get(15)) / 60000;
                int i2 = i / 60;
                Locale locale = Locale.US;
                char c = '+';
                if (i2 < 0) {
                    c = '-';
                }
                String format = String.format(locale, "%c%02d%02d", Character.valueOf(c), Integer.valueOf(Math.abs(i2)), Integer.valueOf(Math.abs(i % 60)));
                timezone = format;
                StringBuilder A0R = AnonymousClass00C.A0R("==== logfile level=");
                A0R.append(level);
                A0R.append(" tz=");
                doLogToFile(adorn("LL_I ", new StringBuilder(AnonymousClass00C.A0N(A0R, format, " ===="))));
                FileChannel fileChannel2 = channel;
                return fileChannel2 != null && fileChannel2.isOpen();
            } catch (FileNotFoundException e) {
                return false;
            }
        } catch (InterruptedException e2) {
            return false;
        }
    }

    public static String log(String str, String str2) {
        String adorn = adorn(str, new StringBuilder(str2));
        logAdorned(adorn, false);
        return adorn;
    }

    public static String log(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str2.length() + 1 + str3.length());
        AnonymousClass00C.A1U(sb, str2, "\n", str3);
        String adorn = adorn(str, sb);
        logAdorned(adorn, false);
        return adorn;
    }

    public static void log(int i, String str) {
        if (i <= level) {
            String log = log(getLogPrefix(i), str);
            if (level == 5) {
                logToLogcat(i, log);
            }
        }
    }

    public static String logAdorned(String str, boolean z) {
        Thread currentThread;
        AnonymousClass00R r1;
        if (z || (currentThread = Thread.currentThread()) == (r1 = LOGGER_THREAD)) {
            doLogToFile(str);
        } else if (currentThread == r1) {
            blockingLog(2, "postLog called on the logging thread. Next log will be out of order.");
            doLogToFile(str);
        } else {
            r1.A01(str);
        }
        return str;
    }

    public static void logToLogcat(int i, String str) {
        int length = str.length();
        if (length <= 4000) {
            doLogToLogcat(i, str);
            return;
        }
        StringBuilder sb = new StringBuilder(4006);
        int i2 = 0;
        while (length - i2 > 4000) {
            if (i2 > 0) {
                sb.append("...");
            }
            sb.append(str.substring(i2, (i2 + 4000) - 3));
            sb.append("...");
            doLogToLogcat(i, sb.toString());
            i2 += 3997;
            sb.setLength(0);
        }
        StringBuilder sb2 = new StringBuilder(4006);
        if (i2 > 0) {
            sb2.append("...");
        }
        sb2.append(str.substring(i2, length));
        doLogToLogcat(i, sb2.toString());
    }

    public static boolean rotate() {
        boolean z = false;
        synchronized (tempFileLock) {
            writeFileLock.lock();
            try {
                if (initialize()) {
                    FileChannel fileChannel = channel;
                    if (fileChannel != null) {
                        try {
                            fileChannel.close();
                            channel = null;
                            File file = logFile;
                            File file2 = logTempFile;
                            if (file.exists()) {
                                int A00 = A00(file, file2);
                                StringBuilder sb = new StringBuilder();
                                sb.append(file2.getPath());
                                sb.append(".");
                                sb.append(A00 + 1);
                                try {
                                    z = file.renameTo(new File(sb.toString()));
                                } catch (SecurityException e) {
                                }
                            }
                            initialize();
                            writeFileLock.unlock();
                        } catch (IOException e2) {
                            channel = null;
                            writeFileLock.unlock();
                        } catch (Throwable th) {
                            channel = null;
                            throw th;
                        }
                    } else {
                        throw new NullPointerException();
                    }
                }
            } finally {
                writeFileLock.unlock();
            }
        }
        return z;
    }

    public static void v(String str) {
        if (level >= 5) {
            logToLogcat(5, log("LL_V ", str));
        }
    }

    public static void v(String str, Throwable th) {
        if (level >= 5) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("; exception=");
            sb.append(th);
            logToLogcat(5, log("LL_V ", sb.toString(), getStackTraceString(th)));
        }
    }

    public static void v(Throwable th) {
        if (level >= 5) {
            logToLogcat(5, log("LL_V ", getStackTraceString(th)));
        }
    }

    public static void w(String str) {
        int i = level;
        if (i == 5) {
            logToLogcat(2, log("LL_W ", str));
        } else if (i >= 2) {
            log("LL_W ", str);
        }
    }

    public static void w(String str, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("; exception=");
        sb.append(th);
        String obj = sb.toString();
        int i = level;
        if (i == 5) {
            logToLogcat(2, log("LL_W ", obj, getStackTraceString(th)));
        } else if (i >= 2) {
            log("LL_W ", obj, getStackTraceString(th));
        }
    }

    public static void w(Throwable th) {
        int i = level;
        if (i == 5) {
            logToLogcat(2, log("LL_W ", getStackTraceString(th)));
        } else if (i >= 2) {
            log("LL_W ", getStackTraceString(th));
        }
    }
}
