package com.whatsapp;

import X.1dn;
import X.1eD;
import X.1eK;
import X.1eQ;
import X.1eW;
import X.1eZ;
import X.1f6;
import X.1fE;
import X.1fH;
import X.1fN;
import X.1fO;
import X.1fS;
import X.1fV;
import X.1fX;
import X.1ff;
import X.1fg;
import X.1fu;
import X.1g9;
import X.1gE;
import X.1hd;
import X.1hm;
import X.1hp;
import X.1hu;
import X.1i2;
import X.1iH;
import X.1iN;
import X.1ij;
import X.1im;
import X.1j0;
import X.1j6;
import X.1jN;
import X.1ko;
import X.1la;
import X.1li;
import X.1oX;
import X.1uG;
import X.1wB;
import X.1wD;
import X.1ya;
import X.1yb;
import X.1yi;
import X.20U;
import X.24f;
import X.25X;
import X.2Db;
import X.2Ed;
import X.2FC;
import X.2GZ;
import X.2Hm;
import X.2Np;
import X.2Ob;
import X.2SF;
import X.2id;
import X.2je;
import X.2vI;
import X.3C6;
import X.3ZK;
import X.3ZT;
import X.AbstractC000800k;
import X.AnonymousClass00A;
import X.AnonymousClass00C;
import X.AnonymousClass00E;
import X.AnonymousClass00G;
import X.AnonymousClass00H;
import X.AnonymousClass00O;
import X.AnonymousClass01O;
import X.AnonymousClass01T;
import X.AnonymousClass020;
import X.AnonymousClass028;
import X.AnonymousClass032;
import X.AnonymousClass04N;
import X.AnonymousClass05K;
import X.AnonymousClass0B8;
import X.AnonymousClass0BE;
import X.AnonymousClass0BK;
import X.AnonymousClass0BR;
import X.AnonymousClass0BS;
import X.AnonymousClass0BW;
import X.AnonymousClass0C2;
import X.AnonymousClass0CB;
import X.AnonymousClass0CG;
import X.AnonymousClass0G5;
import X.AnonymousClass0H4;
import X.AnonymousClass16T;
import X.AnonymousClass16U;
import X.AnonymousClass16X;
import X.C000100c;
import X.C000700j;
import X.C001100o;
import X.C001300q;
import X.C02130Ag;
import X.C24261Am;
import X.C25891If;
import X.C25901Ig;
import X.EnumC10510fw;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.PowerManager;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.cron.HourlyCronWorker;
import com.whatsapp.jobqueue.job.RotateSignedPreKeyJob;
import com.whatsapp.util.Log;
import com.whatsapp.util.WhatsAppLibLoader;
import com.whatsapp.workers.ntp.NtpSyncWorker;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class AlarmService extends AnonymousClass0BK {
    public static volatile long A1K;
    public AnonymousClass0C2 A00;
    public AnonymousClass00H A01;
    public C24261Am A02;
    public C02130Ag A03;
    public AnonymousClass028 A04;
    public C000700j A05;
    public AnonymousClass0CB A06;
    public AnonymousClass0BE A07;
    public 2Db A08;
    public 1g9 A09;
    public 1hm A0A;
    public 1fS A0B;
    public 1f6 A0C;
    public 1yb A0D;
    public 1yi A0E;
    public 1ya A0F;
    public 1dn A0G;
    public 1li A0H;
    public 1hp A0I;
    public AnonymousClass0G5 A0J;
    public 2Ed A0K;
    public 2id A0L;
    public AnonymousClass00E A0M;
    public AnonymousClass020 A0N;
    public C000100c A0O;
    public AnonymousClass00O A0P;
    public AnonymousClass00G A0Q;
    public 1hu A0R;
    public C001300q A0S;
    public AnonymousClass04N A0T;
    public 2GZ A0U;
    public 1eZ A0V;
    public 1fg A0W;
    public 1gE A0X;
    public 1eQ A0Y;
    public 1ko A0Z;
    public 1fX A0a;
    public 2vI A0b;
    public 1ij A0c;
    public 1oX A0d;
    public 24f A0e;
    public 1i2 A0f;
    public 1eW A0g;
    public 1ff A0h;
    public 20U A0i;
    public C001100o A0j;
    public AnonymousClass01T A0k;
    public 1wD A0l;
    public 1wB A0m;
    public 25X A0n;
    public 3C6 A0o;
    public 1iH A0p;
    public 1eD A0q;
    public 1im A0r;
    public 1iN A0s;
    public 2Np A0t;
    public 1fE A0u;
    public 1eK A0v;
    public 1fN A0w;
    public 1j0 A0x;
    public 2Hm A0y;
    public 1fH A0z;
    public 1fO A10;
    public 1hd A11;
    public 3ZK A12;
    public 2je A13;
    public 2FC A14;
    public 1j6 A15;
    public AnonymousClass01O A16;
    public WhatsAppLibLoader A17;
    public 2Ob A18;
    public AnonymousClass0CG A19;
    public 2SF A1A;
    public AnonymousClass032 A1B;
    public 1fu A1C;
    public 1jN A1D;
    public AnonymousClass00A A1E;
    public AnonymousClass00A A1F;
    public AnonymousClass00A A1G;
    public AnonymousClass00A A1H;
    public final Random A1I = new Random();
    public volatile String A1J;

    public static void A00(AlarmManager alarmManager, int i, long j, PendingIntent pendingIntent) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            alarmManager.setExactAndAllowWhileIdle(i, j, pendingIntent);
        } else if (i2 >= 19) {
            alarmManager.setExact(i, j, pendingIntent);
        } else {
            alarmManager.set(i, j, pendingIntent);
        }
    }

    public static void A01(SharedPreferences.Editor editor, String str, String str2, String str3, String str4) {
        editor.remove(str);
        editor.remove(str2);
        editor.remove(str3);
        editor.remove(str4);
    }

    /* JADX INFO: finally extract failed */
    @Override // X.AnonymousClass0BM
    public void A05(Intent intent) {
        String action = intent.getAction();
        if (action == null) {
            Log.w("AlarmService received null action in intent");
        } else if (!this.A17.A04()) {
            Log.e("AlarmService skip, native libraries missing");
        } else {
            try {
                this.A1J = action;
                if (TextUtils.equals(action, "com.whatsapp.action.BACKUP_MESSAGES")) {
                    A0I(intent);
                } else if (TextUtils.equals(action, "com.whatsapp.action.DAILY_CRON") || TextUtils.equals(action, "com.whatsapp.action.DAILY_CATCHUP_CRON")) {
                    try {
                        this.A08.A01(0, true);
                        A0J(intent);
                        this.A08.A01(0, false);
                    } catch (Throwable th) {
                        this.A08.A01(0, false);
                        throw th;
                    }
                } else if (TextUtils.equals(action, "com.whatsapp.action.HOURLY_CRON")) {
                    A0L(intent);
                } else if (TextUtils.equals(action, "com.whatsapp.action.SETUP")) {
                    A0N(intent);
                } else if (TextUtils.equals(action, "com.whatsapp.action.UPDATE_NTP")) {
                    A0O(intent);
                } else if (TextUtils.equals(action, "com.whatsapp.action.ROTATE_SIGNED_PREKEY")) {
                    A0M(intent);
                } else if (TextUtils.equals(action, "com.whatsapp.action.HEARTBEAT_WAKEUP")) {
                    A0K(intent);
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("AlarmService received unrecognized intent; intent=");
                    sb.append(intent);
                    Log.w(sb.toString());
                }
                this.A1J = null;
            } catch (Throwable th2) {
                this.A1J = null;
                throw th2;
            }
        }
    }

    @Override // X.AnonymousClass0BM
    public boolean A07() {
        return !"com.whatsapp.action.BACKUP_MESSAGES".equals(this.A1J);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x01b1, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x01b2, code lost:
        if (r3 != null) goto L_0x01b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x01b7, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x01ba, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x01bb, code lost:
        if (r11 != null) goto L_0x01bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x01c0, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x01ca, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        r15.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x01ce, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A08() {
        /*
        // Method dump skipped, instructions count: 689
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.AlarmService.A08():void");
    }

    public void A09() {
        this.A0X.A04();
        this.A0e.A03(true);
        this.A0Y.A03();
        this.A0c.A01();
        this.A0d.A02(this.A0O.A05() - 3ZT.A00);
        this.A0b.A00();
        if (this.A0r.A03()) {
            1iN r0 = this.A0s;
            r0.A04();
            r0.A08.A0E();
            this.A0t.A02();
        }
        this.A18.A04();
        this.A0y.A06(this.A0f.A07());
        this.A0U.A01();
        this.A0L.A04();
    }

    public void A0A() {
        AnonymousClass0B8 A0C2 = this.A0S.A0C();
        byte[] bArr = new byte[32];
        System.arraycopy(A0C2.A00().A01.A00(), 1, bArr, 0, 32);
        if (Arrays.equals(bArr, A0C2.A00().A00.A01)) {
            Log.w("AlarmService/bad signed pre key found");
            AnonymousClass0H4 A0F2 = this.A0S.A0F();
            this.A06.A01(new RotateSignedPreKeyJob(A0F2.A01, A0F2.A00, A0F2.A02));
            AnonymousClass00C.A0l(this.A0Q, "bad_signed_pre_key_check_done", true);
            return;
        }
        AnonymousClass00C.A0l(this.A0Q, "bad_signed_pre_key_check_done", true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0075, code lost:
        if (java.lang.System.currentTimeMillis() < r0.A00.getLong("phoneid_last_sync_timestamp", -1)) goto L_0x0077;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0B() {
        /*
        // Method dump skipped, instructions count: 904
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.AlarmService.A0B():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:110:0x02e5, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x02e9, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x04c3, code lost:
        r3 = new X.AnonymousClass1YM();
        r3.A0G = java.lang.Long.valueOf(r8 - r6);
        r3.A07 = java.lang.Long.valueOf(r10);
        r3.A06 = java.lang.Long.valueOf(r12);
        r3.A00 = java.lang.Boolean.valueOf(r2.A04.AG4());
        r3.A09 = java.lang.Long.valueOf(r14);
        r3.A08 = java.lang.Long.valueOf(r0);
        r3.A01 = java.lang.Boolean.valueOf(r2.A03.AG4());
        r3.A0B = java.lang.Long.valueOf(r0);
        r3.A0A = java.lang.Long.valueOf(r0);
        r3.A02 = java.lang.Boolean.valueOf(r2.A07.AG4());
        r3.A0F = java.lang.Long.valueOf(r0);
        r3.A0E = java.lang.Long.valueOf(r0);
        r3.A04 = java.lang.Boolean.valueOf(r2.A06.AG4());
        r3.A0D = java.lang.Long.valueOf(r0);
        r3.A0C = java.lang.Long.valueOf(r0);
        r3.A03 = java.lang.Boolean.valueOf(r2.A05.AG4());
        r3.A0I = java.lang.Long.valueOf(r0);
        r3.A0H = java.lang.Long.valueOf(r0);
        r3.A05 = java.lang.Boolean.valueOf(r2.A08.AG4());
        r2.A01.A0C(r3, null, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x056b, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x056f, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0572, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0576, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x09b5, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x09b9, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:0x0b7a, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x0b7e, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x0b81, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:?, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:347:0x0b85, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:0x0bc4, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x0bc8, code lost:
        throw r2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:356:0x0bb6  */
    /* JADX WARNING: Removed duplicated region for block: B:413:0x090a A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0C() {
        /*
        // Method dump skipped, instructions count: 3059
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.AlarmService.A0C():void");
    }

    public final void A0D() {
        Calendar instance = Calendar.getInstance();
        if (instance.get(11) >= 2) {
            instance.add(5, 1);
        }
        instance.set(14, 0);
        instance.set(13, 0);
        instance.set(12, 0);
        instance.set(11, 2);
        long timeInMillis = instance.getTimeInMillis();
        C000700j r0 = this.A05;
        Random random = this.A1I;
        int A072 = r0.A07(AbstractC000800k.A3C);
        long nextInt = (A072 <= 0 ? 0 : ((long) random.nextInt(A072 << 1)) * 1000) + timeInMillis;
        StringBuilder A0R2 = AnonymousClass00C.A0R("AlarmService/setupBackupMessagesAlarm; alarmTimeMillis=");
        A0R2.append(new Date(nextInt));
        Log.i(A0R2.toString());
        Intent intent = new Intent("com.whatsapp.action.BACKUP_MESSAGES", null, this, AlarmBroadcastReceiver.class);
        AlarmManager A022 = this.A0N.A02();
        if (A022 != null) {
            A00(A022, 0, nextInt, PendingIntent.getBroadcast(this, 0, intent, 134217728));
        } else {
            Log.w("AlarmService/setupBackupMessagesAlarm AlarmManager is null");
        }
    }

    public final void A0E() {
        AlarmManager A022 = this.A0N.A02();
        if (A022 == null) {
            Log.w("AlarmService/dailyCatchupCron; AlarmManager is null");
            return;
        }
        Intent intent = new Intent("com.whatsapp.action.DAILY_CATCHUP_CRON", null, this, AlarmBroadcastReceiver.class);
        PendingIntent broadcast = PendingIntent.getBroadcast(this, 0, intent, 536870912);
        if (!A0P()) {
            long currentTimeMillis = System.currentTimeMillis();
            long j = this.A0Q.A00.getLong("next_daily_cron_catchup", 0);
            long j2 = j - currentTimeMillis;
            if (broadcast == null || j2 <= 0 || j2 >= 900000) {
                long j3 = 900000 + currentTimeMillis;
                A00(A022, 1, j3, PendingIntent.getBroadcast(this, 0, intent, 0));
                AnonymousClass00C.A0j(this.A0Q, "next_daily_cron_catchup", j3);
                1uG.A02(j3);
                1uG.A02(this.A0Q.A00.getLong("last_daily_cron", 0));
                return;
            }
            1uG.A02(j);
        } else if (broadcast != null) {
            A022.cancel(broadcast);
            broadcast.cancel();
        }
    }

    public final void A0F() {
        Calendar instance = Calendar.getInstance();
        instance.add(5, 1);
        instance.set(14, 0);
        instance.set(13, 0);
        instance.set(12, 0);
        instance.set(11, 0);
        long timeInMillis = instance.getTimeInMillis();
        C000700j r0 = this.A05;
        Random random = this.A1I;
        int A072 = r0.A07(AbstractC000800k.A3C);
        long nextInt = (A072 <= 0 ? 0 : ((long) random.nextInt(A072 << 1)) * 1000) + timeInMillis;
        StringBuilder A0R2 = AnonymousClass00C.A0R("AlarmService/setupDailyCronAlarm; alarmTimeMillis=");
        A0R2.append(new Date(nextInt));
        Log.i(A0R2.toString());
        Intent intent = new Intent("com.whatsapp.action.DAILY_CRON", null, this, AlarmBroadcastReceiver.class);
        AlarmManager A022 = this.A0N.A02();
        if (A022 != null) {
            A00(A022, 0, nextInt, PendingIntent.getBroadcast(this, 0, intent, 134217728));
        } else {
            Log.w("AlarmService/setupDailyCronAlarm AlarmManager is null");
        }
    }

    public final void A0G() {
        long A052 = this.A0O.A05();
        int A072 = this.A05.A07(AbstractC000800k.A2g);
        if (!this.A0Q.A00.contains("last_heartbeat_login")) {
            long nextInt = A052 - (((long) this.A1I.nextInt(A072)) * 1000);
            this.A0Q.A0E().putLong("last_heartbeat_login", nextInt).apply();
            StringBuilder sb = new StringBuilder("no last heartbeat known; setting to ");
            sb.append(1uG.A02(nextInt));
            Log.i(sb.toString());
        }
        long j = this.A0Q.A00.getLong("last_heartbeat_login", 0);
        if (j > A052 || ((long) (A072 * SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS)) + j < A052) {
            StringBuilder A0U2 = AnonymousClass00C.A0U("AlarmService/setupHeartbeatAlarm/last heart beat login=", j, " server time=");
            A0U2.append(A052);
            A0U2.append(" client time=");
            A0U2.append(System.currentTimeMillis());
            A0U2.append(" interval=");
            A0U2.append(A072);
            Log.i(A0U2.toString());
            A0K(null);
            return;
        }
        long elapsedRealtime = (((((long) A072) * 1000) + j) - A052) + SystemClock.elapsedRealtime();
        StringBuilder A0R2 = AnonymousClass00C.A0R("AlarmService/setupHeartbeatAlarm; elapsedRealTimeHeartbeatLogin=");
        A0R2.append(1uG.A02(elapsedRealtime));
        Log.i(A0R2.toString());
        Intent intent = new Intent("com.whatsapp.action.HEARTBEAT_WAKEUP", null, this, AlarmBroadcastReceiver.class);
        AlarmManager A022 = this.A0N.A02();
        if (A022 != null) {
            A00(A022, 2, elapsedRealtime, PendingIntent.getBroadcast(this, 0, intent, 134217728));
        } else {
            Log.w("AlarmService/setupHeartbeatAlarm AlarmManager is null");
        }
    }

    public final void A0H() {
        long A052 = this.A0O.A05();
        if (!this.A0Q.A00.contains("dithered_last_signed_prekey_rotation")) {
            long nextInt = A052 - (((long) this.A1I.nextInt(2592000)) * 1000);
            StringBuilder A0R2 = AnonymousClass00C.A0R("no signed prekey rotation schedule established; setting last rotation time to ");
            A0R2.append(1uG.A02(nextInt));
            Log.i(A0R2.toString());
            AnonymousClass00C.A0j(this.A0Q, "dithered_last_signed_prekey_rotation", nextInt);
        }
        long j = this.A0Q.A00.getLong("dithered_last_signed_prekey_rotation", Long.MIN_VALUE);
        if (j >= 0 && j <= A052) {
            long j2 = 2592000000L + j;
            if (j2 >= A052) {
                if (!this.A0Q.A00.getBoolean("bad_signed_pre_key_check_done", false)) {
                    Log.i("AlarmService/checking bad signed pre key");
                    AnonymousClass04N r6 = this.A0T;
                    r6.A00.submit(new AnonymousClass16U(this));
                }
                long j3 = j2 - A052;
                StringBuilder A0R3 = AnonymousClass00C.A0R("scheduling alarm to trigger signed prekey rotation; now=");
                A0R3.append(1uG.A02(A052));
                A0R3.append("; lastSignedPrekeyRotation=");
                A0R3.append(1uG.A02(j));
                A0R3.append("; deltaToAlarm=");
                A0R3.append(j3);
                Log.i(A0R3.toString());
                long elapsedRealtime = SystemClock.elapsedRealtime();
                PendingIntent broadcast = PendingIntent.getBroadcast(this, 0, new Intent("com.whatsapp.action.ROTATE_SIGNED_PREKEY", null, this, AlarmBroadcastReceiver.class), 134217728);
                AlarmManager A022 = this.A0N.A02();
                if (A022 != null) {
                    A00(A022, 2, elapsedRealtime + j3, broadcast);
                    return;
                } else {
                    Log.w("AlarmService/setupRotateKeysAlarm AlarmManager is null");
                    return;
                }
            }
        }
        StringBuilder A0R4 = AnonymousClass00C.A0R("scheduling immediate signed prekey rotation; now=");
        A0R4.append(1uG.A02(A052));
        A0R4.append("; lastSignedPrekeyRotation=");
        A0R4.append(1uG.A02(j));
        Log.i(A0R4.toString());
        this.A16.ASf(new AnonymousClass16X(this));
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x005b A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0I(android.content.Intent r13) {
        /*
        // Method dump skipped, instructions count: 283
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.AlarmService.A0I(android.content.Intent):void");
    }

    public final void A0J(Intent intent) {
        PowerManager.WakeLock wakeLock;
        StringBuilder sb = new StringBuilder("AlarmService/dailyCron intent=");
        sb.append(intent);
        Log.i(sb.toString());
        PowerManager A0G2 = this.A0N.A0G();
        if (A0G2 == null) {
            Log.w("AlarmService/dailyCron pm=null");
            wakeLock = null;
        } else {
            PowerManager.WakeLock A0I2 = 1la.A0I(A0G2, 1, "AlarmService#dailyCron");
            A0I2.setReferenceCounted(false);
            A0I2.acquire(600000);
            wakeLock = A0I2;
        }
        try {
            A0F();
            if (A0P()) {
                Log.i("AlarmService/dailyCron; too frequent, skipping...");
            } else {
                A0B();
                this.A0Q.A0E().putLong("last_daily_cron", System.currentTimeMillis()).apply();
            }
        } finally {
            A0E();
            if (wakeLock != null) {
                wakeLock.release();
            }
        }
    }

    public final void A0K(Intent intent) {
        StringBuilder sb = new StringBuilder("AlarmService/heartbeatWakeup; intent=");
        sb.append(intent);
        Log.i(sb.toString());
        long A052 = this.A0O.A05();
        this.A0q.A0D(false, true, true, true, 0);
        AnonymousClass00C.A0w("AlarmService/heartbeatWakeup/setting last heart beat login time: ", A052);
        this.A0Q.A0E().putLong("last_heartbeat_login", A052).apply();
        A0G();
    }

    public final void A0L(Intent intent) {
        if (SystemClock.elapsedRealtime() - A1K < 1800000) {
            Log.i("AlarmService/hourlyCron too soon skip");
            return;
        }
        StringBuilder sb = new StringBuilder("AlarmService/hourlyCron; intent=");
        sb.append(intent);
        Log.i(sb.toString());
        HourlyCronWorker.A00(this.A0R, (Set) this.A1G.get());
        A1K = SystemClock.elapsedRealtime();
    }

    public final void A0M(Intent intent) {
        PowerManager.WakeLock wakeLock;
        StringBuilder sb = new StringBuilder("AlarmService/rotateSignedPrekeyAndSenderKeys; intent=");
        sb.append(intent);
        Log.i(sb.toString());
        PowerManager A0G2 = this.A0N.A0G();
        if (A0G2 == null) {
            Log.w("AlarmService/rotateSignedPrekeyAndSenderKeys pm=null");
            wakeLock = null;
        } else {
            PowerManager.WakeLock A0I2 = 1la.A0I(A0G2, 1, "AlarmService#rotateSignedPrekeyAndSenderKeys");
            A0I2.setReferenceCounted(false);
            A0I2.acquire(300000);
            wakeLock = A0I2;
        }
        try {
            this.A0T.A00.submit(new AnonymousClass16T(this)).get();
            A0H();
            if (wakeLock != null) {
                wakeLock.release();
            }
        } catch (InterruptedException e) {
            AssertionError assertionError = new AssertionError("interrupted during rotate keys alarm");
            assertionError.initCause(e);
            throw assertionError;
        } catch (ExecutionException e2) {
            AssertionError assertionError2 = new AssertionError("exception during rotate keys alarm");
            assertionError2.initCause(e2);
            throw assertionError2;
        } catch (Throwable th) {
            if (wakeLock != null) {
                wakeLock.release();
            }
            throw th;
        }
    }

    public final void A0N(Intent intent) {
        Class cls;
        long j;
        EnumC10510fw r8 = EnumC10510fw.KEEP;
        StringBuilder sb = new StringBuilder("AlarmService/setup; intent=");
        sb.append(intent);
        Log.i(sb.toString());
        A0D();
        A0F();
        A0E();
        if (this.A0k.A0C(161)) {
            Log.i("AlarmService/hourly-cron; cancelling alarms.");
            PendingIntent broadcast = PendingIntent.getBroadcast(this, 0, new Intent("com.whatsapp.action.HOURLY_CRON", null, this, AlarmBroadcastReceiver.class), 536870912);
            if (broadcast != null) {
                AlarmManager A022 = this.A0N.A02();
                if (A022 != null) {
                    A022.cancel(broadcast);
                }
                broadcast.cancel();
            }
            Log.i("AlarmService/hourly-cron; setting hourly cron using work manager.");
            1hu r1 = this.A0R;
            if (r1 != null) {
                C25891If r0 = new C25891If(HourlyCronWorker.class, TimeUnit.MILLISECONDS);
                r0.A01.add("tag.whatsapp.cron.hourly");
                ((AnonymousClass0BW) r1.A03.get()).A03("name.whatsapp.cron.hourly", r8, (C25901Ig) r0.A00());
                cls = AlarmBroadcastReceiver.class;
            } else {
                throw null;
            }
        } else {
            Log.i("AlarmService/hourly-cron; cancelling work manager jobs.");
            1hu r12 = this.A0R;
            ((AnonymousClass0BW) r12.A03.get()).A02("name.whatsapp.cron.hourly");
            ((AnonymousClass0BW) r12.A03.get()).A01("tag.whatsapp.cron.hourly");
            Log.i("AlarmService/hourly-cron; setting hourly cron using alarms");
            Intent intent2 = new Intent("com.whatsapp.action.HOURLY_CRON", null, this, AlarmBroadcastReceiver.class);
            if (PendingIntent.getBroadcast(this, 0, intent2, 536870912) == null) {
                AlarmManager A023 = this.A0N.A02();
                if (A023 != null) {
                    A023.setInexactRepeating(3, SystemClock.elapsedRealtime() + 3600000, 3600000, PendingIntent.getBroadcast(this, 0, intent2, 0));
                    cls = AlarmBroadcastReceiver.class;
                } else {
                    Log.w("AlarmService/hourly-cron; setup skipped, AlarmManager is null");
                    cls = AlarmBroadcastReceiver.class;
                }
            } else {
                cls = AlarmBroadcastReceiver.class;
            }
        }
        if (this.A0k.A0C(170)) {
            Log.i("AlarmService/ntp-sync; cancelling ntp sync using alarm manager.");
            PendingIntent broadcast2 = PendingIntent.getBroadcast(this, 0, new Intent("com.whatsapp.action.UPDATE_NTP", null, this, cls), 536870912);
            if (broadcast2 != null) {
                AlarmManager A024 = this.A0N.A02();
                if (A024 != null) {
                    A024.cancel(broadcast2);
                }
                broadcast2.cancel();
            }
            Log.i("AlarmService/ntp-sync; setting ntp sync using work manager.");
            1jN r9 = this.A1D;
            if (r9 != null) {
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                C25891If r02 = new C25891If(NtpSyncWorker.class, 43200000, timeUnit, 21600000, timeUnit);
                r02.A01.add("tag.whatsapp.time.ntp");
                AnonymousClass0BR r13 = new AnonymousClass0BR();
                r13.A03 = AnonymousClass05K.CONNECTED;
                r02.A00.A09 = new AnonymousClass0BS(r13);
                1fV r2 = r9.A02;
                ((AnonymousClass0BW) r2.get()).A03("name.whatsapp.time.ntp", r8, (C25901Ig) r02.A00());
                SharedPreferences.Editor edit = r9.A00().edit();
                synchronized (r2) {
                    j = r2.A00;
                }
                edit.putLong("/ntp/work_manager_init", j).apply();
            } else {
                throw null;
            }
        } else {
            Log.i("AlarmService/ntp-sync; cancelling ntp sync using work manager.");
            1jN r22 = this.A1D;
            ((AnonymousClass0BW) r22.A02.get()).A02("name.whatsapp.time.ntp");
            ((AnonymousClass0BW) r22.A02.get()).A01("tag.whatsapp.time.ntp");
            Log.i("AlarmService/ntp-sync; setting up ntp sync using alarm manager.");
            PendingIntent broadcast3 = PendingIntent.getBroadcast(this, 0, new Intent("com.whatsapp.action.UPDATE_NTP", null, this, cls), 134217728);
            AlarmManager A025 = this.A0N.A02();
            if (A025 != null) {
                A025.setInexactRepeating(3, SystemClock.elapsedRealtime() + 43200000, 43200000, broadcast3);
            } else {
                Log.w("AlarmService/setupUpdateNtpAlarm AlarmManager is null");
            }
        }
        A0H();
        A0G();
        AnonymousClass00G r03 = this.A0Q;
        String string = r03.A00.getString("web_session_verification_browser_ids", null);
        if (!(string == null || Arrays.asList(string.split(",")) == null || r03.A00.getLong("web_session_verification_when_millis", -1) == -1)) {
            this.A1C.A0D(getApplicationContext(), this.A0Q.A00.getLong("web_session_verification_when_millis", -1));
        }
        A0O(null);
    }

    public final void A0O(Intent intent) {
        PowerManager.WakeLock wakeLock;
        StringBuilder sb = new StringBuilder("AlarmService#updateNtp; intent=");
        sb.append(intent);
        Log.i(sb.toString());
        PowerManager A0G2 = this.A0N.A0G();
        if (A0G2 == null) {
            Log.w("AlarmService/updateNtp pm=null");
            wakeLock = null;
        } else {
            PowerManager.WakeLock A0I2 = 1la.A0I(A0G2, 1, "AlarmService#updateNtp");
            A0I2.setReferenceCounted(false);
            A0I2.acquire(300000);
            wakeLock = A0I2;
        }
        try {
            NtpSyncWorker.A00(this.A1D, this.A0P.A00, this.A0j, this.A0O);
        } finally {
            if (wakeLock != null) {
                wakeLock.release();
            }
        }
    }

    public final boolean A0P() {
        long j = this.A0Q.A00.getLong("last_daily_cron", 0);
        Calendar instance = Calendar.getInstance();
        instance.set(14, 0);
        instance.set(13, 0);
        instance.set(12, 0);
        instance.set(11, 0);
        long timeInMillis = instance.getTimeInMillis();
        if (j >= timeInMillis && j < timeInMillis + 86400000) {
            return true;
        }
        long currentTimeMillis = System.currentTimeMillis() - j;
        return currentTimeMillis > 0 && currentTimeMillis < 21600000;
    }
}
