package com.whatsapp;

import X.1hb;
import X.1hr;
import X.1iD;
import X.1la;
import X.2IO;
import X.AbstractActivityC02570Cf;
import X.AnonymousClass00C;
import X.AnonymousClass00G;
import X.AnonymousClass021;
import X.AnonymousClass07S;
import X.AnonymousClass0I5;
import X.C04560Me;
import X.ComponentCallbacksC019009d;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.util.Log;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class RequestPermissionActivity extends AbstractActivityC02570Cf {
    public static final Map A09;
    public AnonymousClass0I5 A00;
    public 1hr A01;
    public AnonymousClass021 A02;
    public AnonymousClass00G A03;
    public 2IO A04;
    public 1hb A05;
    public String A06;
    public boolean A07;
    public boolean A08;

    static {
        HashMap hashMap = new HashMap(4);
        int i = Build.VERSION.SDK_INT;
        int i2 = i < 30 ? 2131889143 : 2131889145;
        int i3 = 2131889178;
        if (i < 30) {
            i3 = 2131889176;
        }
        hashMap.put(30, new int[]{2131889144, i2, 2131889177, i3, 2131889080, 2131889061});
        int i4 = i < 30 ? 2131889137 : 2131889139;
        int i5 = 2131889169;
        if (i < 30) {
            i5 = 2131889167;
        }
        hashMap.put(31, new int[]{2131889138, i4, 2131889168, i5, 2131889063, 2131889062});
        int i6 = i < 30 ? 2131889140 : 2131889142;
        int i7 = 2131889172;
        if (i < 30) {
            i7 = 2131889170;
        }
        hashMap.put(32, new int[]{2131889141, i6, 2131889171, i7, 2131889065, 2131889064});
        int i8 = i < 30 ? 2131889146 : 2131889148;
        int i9 = 2131889187;
        if (i < 30) {
            i9 = 2131889185;
        }
        hashMap.put(33, new int[]{2131889147, i8, 2131889186, i9, 2131889082, 2131889081});
        A09 = Collections.unmodifiableMap(hashMap);
    }

    public static Intent A00(Context context, int i, int i2, boolean z) {
        return new Intent(context, RequestPermissionActivity.class).putExtra("drawable_id", 2131232037).putExtra("permissions", new String[]{"android.permission.GET_ACCOUNTS", "android.permission.READ_CONTACTS", "android.permission.WRITE_CONTACTS"}).putExtra("message_id", i).putExtra("perm_denial_message_id", i2).putExtra("force_ui", z);
    }

    public static Intent A01(Context context, int i, int i2, boolean z) {
        return new Intent(context, RequestPermissionActivity.class).putExtra("drawable_id", 2131232042).putExtra("permissions", new String[]{"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"}).putExtra("message_id", i).putExtra("perm_denial_message_id", i2).putExtra("force_ui", z);
    }

    public static Intent A02(Context context, AnonymousClass021 r10, int i) {
        boolean z = !r10.A06();
        boolean z2 = r10.A02("android.permission.CAMERA") != 0;
        int[] iArr = (int[]) A09.get(Integer.valueOf(i));
        if (iArr == null) {
            AnonymousClass00C.A0r("conversation/check/camera/storage/permissions/unexpected request code ", i);
            return null;
        } else if (z2) {
            if (z) {
                return new Intent(context, RequestPermissionActivity.class).putExtra("drawable_ids", new int[]{2131232042, 2131232040, 2131232035}).putExtra("permissions", new String[]{"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"}).putExtra("message_id", iArr[0]).putExtra("perm_denial_message_id", iArr[1]);
            }
            return new Intent(context, RequestPermissionActivity.class).putExtra("drawable_id", 2131232035).putExtra("message_id", iArr[4]).putExtra("perm_denial_message_id", iArr[5]).putExtra("permissions", new String[]{"android.permission.CAMERA"});
        } else if (z) {
            return A01(context, iArr[2], iArr[3], false);
        } else {
            return null;
        }
    }

    public static void A03(Activity activity) {
        if (!activity.isFinishing()) {
            activity.startActivityForResult(new Intent(activity, RequestPermissionActivity.class).putExtra("drawable_id", 2131232034).putExtra("permissions", (String[]) ((AbstractCollection) AnonymousClass021.A01()).toArray(new String[0])).putExtra("message_id", 2131889130).putExtra("perm_denial_message_id", 2131889129).putExtra("force_ui", true), 155);
        }
    }

    public static void A04(Activity activity, int i, int i2) {
        if (!activity.isFinishing()) {
            activity.startActivityForResult(A00(activity, i, i2, false), 150);
        }
    }

    public static void A05(Activity activity, int i, int i2) {
        A07(activity, i, i2, false, 151, null);
    }

    public static void A06(Activity activity, int i, int i2, int i3) {
        A07(activity, i, i2, false, i3, null);
    }

    public static void A07(Activity activity, int i, int i2, boolean z, int i3, String str) {
        if (!activity.isFinishing()) {
            Intent A012 = A01(activity, i, i2, z);
            if (str != null) {
                A012.putExtra("permission_requester_screen", str);
            }
            activity.startActivityForResult(A012, i3);
        }
    }

    public static void A08(Activity activity, AnonymousClass07S r9, AnonymousClass021 r10, boolean z) {
        boolean z2 = (Build.VERSION.SDK_INT < 23 && !r10.A0A()) || (Build.VERSION.SDK_INT >= 23 && r10.A02("android.permission.RECORD_AUDIO") != 0);
        boolean z3 = z && ((Build.VERSION.SDK_INT < 23 && !r10.A08()) || (Build.VERSION.SDK_INT >= 23 && r10.A02("android.permission.CAMERA") != 0));
        StringBuilder sb = new StringBuilder("request/permission/checkCameraAndMicPermissionsForVoipCall needMicPerm = ");
        sb.append(z2);
        sb.append(", needCameraPerm = ");
        sb.append(z3);
        Log.i(sb.toString());
        if (Build.VERSION.SDK_INT >= 23) {
            if (z3 && z2) {
                activity.startActivityForResult(new Intent(activity, RequestPermissionActivity.class).putExtra("drawable_ids", new int[]{2131232039, 2131232040, 2131232035}).putExtra("permissions", new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"}).putExtra("message_id", 2131889128).putExtra("perm_denial_message_id", 2131889127).putExtra("force_ui", true), 152);
            } else if (z2) {
                activity.startActivityForResult(new Intent(activity, RequestPermissionActivity.class).putExtra("drawable_id", 2131232039).putExtra("message_id", 2131889122).putExtra("perm_denial_message_id", 2131889113).putExtra("permissions", new String[]{"android.permission.RECORD_AUDIO"}).putExtra("force_ui", true), 152);
            } else if (z3) {
                activity.startActivityForResult(new Intent(activity, RequestPermissionActivity.class).putExtra("drawable_id", 2131232035).putExtra("message_id", 2131889077).putExtra("perm_denial_message_id", 2131889076).putExtra("permissions", new String[]{"android.permission.CAMERA"}).putExtra("force_ui", true), 152);
            }
        } else if (z3) {
            if (z2) {
                r9.A04(2131886559, 1);
            } else {
                r9.A04(2131886558, 1);
            }
        } else if (z2) {
            r9.A04(2131886564, 1);
        }
    }

    public static void A0E(Activity activity, AnonymousClass021 r6) {
        if (!activity.isFinishing() && (!r6.A05())) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(AnonymousClass021.A01());
            Intent intent = new Intent(activity, RequestPermissionActivity.class);
            if (Build.VERSION.SDK_INT >= 28) {
                arrayList.add("android.permission.READ_CALL_LOG");
                arrayList.add("android.permission.ANSWER_PHONE_CALLS");
                intent.putExtra("permissions", (String[]) arrayList.toArray(new String[0])).putExtra("message_id", 2131889105).putExtra("perm_denial_message_id", 2131889104);
            } else {
                arrayList.add("android.permission.CALL_PHONE");
                intent.putExtra("permissions", (String[]) arrayList.toArray(new String[0])).putExtra("message_id", 2131889107).putExtra("perm_denial_message_id", 2131889106);
            }
            intent.putExtra("title_id", 2131889103).putExtra("force_ui", true);
            activity.startActivityForResult(intent, 700);
        }
    }

    public static void A0F(Activity activity, AnonymousClass021 r6, int i) {
        Intent putExtra;
        if (!activity.isFinishing()) {
            boolean z = !r6.A0B();
            boolean A092 = r6.A09();
            if (z && (!A092)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add("android.permission.SEND_SMS");
                arrayList.addAll(AnonymousClass021.A01());
                putExtra = new Intent(activity, RequestPermissionActivity.class).putExtra("drawable_ids", new int[]{2131232041, 2131232040, 2131232034}).putExtra("permissions", (String[]) arrayList.toArray(new String[0])).putExtra("message_id", 2131889134).putExtra("perm_denial_message_id", 2131889133).putExtra("force_ui", false);
            } else if (z) {
                putExtra = new Intent(activity, RequestPermissionActivity.class).putExtra("drawable_id", 2131232041).putExtra("permissions", new String[]{"android.permission.SEND_SMS"}).putExtra("message_id", 2131889132).putExtra("perm_denial_message_id", 2131889131).putExtra("force_ui", false);
            } else {
                putExtra = new Intent(activity, RequestPermissionActivity.class).putExtra("drawable_id", 2131232034).putExtra("permissions", (String[]) ((AbstractCollection) AnonymousClass021.A01()).toArray(new String[0])).putExtra("message_id", 2131889227).putExtra("perm_denial_message_id", 2131889226).putExtra("force_ui", false);
            }
            activity.startActivityForResult(putExtra, i);
        }
    }

    public static void A0G(ComponentCallbacksC019009d r3, int i, int i2) {
        Context A0a = r3.A0a();
        if (A0a != null) {
            r3.A0O(A00(A0a, i, i2, false), 150, null);
        }
    }

    public static void A0L(AnonymousClass00G r5, String[] strArr) {
        for (String str : strArr) {
            AnonymousClass00C.A0l(r5, str, true);
            if (1la.A1R(1iD.A02, str)) {
                AnonymousClass00C.A0l(r5, "live_location_is_new_user", true);
                AnonymousClass00C.A0l(r5, "nearby_location_new_user", true);
            }
        }
    }

    public static boolean A0M(Activity activity, AnonymousClass021 r5) {
        if (!(!r5.A06())) {
            return true;
        }
        int i = 2131889165;
        if (Build.VERSION.SDK_INT < 30) {
            i = 2131889163;
        }
        activity.startActivityForResult(A01(activity, 2131889164, i, false), 34);
        return false;
    }

    public static boolean A0N(Activity activity, AnonymousClass021 r5) {
        if (r5.A06()) {
            return true;
        }
        int i = 2131889151;
        if (Build.VERSION.SDK_INT < 30) {
            i = 2131889149;
        }
        activity.startActivityForResult(A01(activity, 2131889150, i, false), 151);
        return false;
    }

    public static boolean A0O(Activity activity, AnonymousClass021 r2, int i) {
        Intent A022 = A02(activity, r2, i);
        if (A022 == null) {
            return true;
        }
        activity.startActivityForResult(A022, i);
        return false;
    }

    public static boolean A0P(Activity activity, AnonymousClass021 r5, int i, int i2, int i3) {
        String[] strArr = 1iD.A02;
        if (r5.A04()) {
            return true;
        }
        activity.startActivityForResult(new Intent(activity, RequestPermissionActivity.class).putExtra("drawable_id", 2131232038).putExtra("permissions", strArr).putExtra("perm_denial_message_id", i2).putExtra("message_id", i), i3);
        return false;
    }

    public static boolean A0Q(Activity activity, String[] strArr) {
        for (String str : strArr) {
            if (!C04560Me.A0I(activity, str)) {
                return false;
            }
        }
        return true;
    }

    public static boolean A0R(Context context, AnonymousClass021 r5) {
        if (!(!r5.A06())) {
            return true;
        }
        int i = 2131889165;
        if (Build.VERSION.SDK_INT < 30) {
            i = 2131889163;
        }
        context.startActivity(A01(context, 2131889164, i, false));
        return false;
    }

    public static boolean A0S(ComponentCallbacksC019009d r5, AnonymousClass021 r6) {
        if (r6.A06()) {
            return true;
        }
        Context A0a = r5.A0a();
        int i = 2131889151;
        if (Build.VERSION.SDK_INT < 30) {
            i = 2131889149;
        }
        r5.A0O(A01(A0a, 2131889150, i, false), 151, null);
        return false;
    }

    public static boolean A0T(AnonymousClass00G r5, String[] strArr) {
        for (String str : strArr) {
            if (r5.A00.getBoolean(str, false)) {
                return false;
            }
        }
        return true;
    }

    public final String A0p(Bundle bundle, boolean z) {
        int i = z ? bundle.getInt("perm_denial_message_id") : bundle.getInt("message_id");
        if (i == 0) {
            return null;
        }
        int[] intArray = z ? bundle.getIntArray("perm_denial_message_params_id") : bundle.getIntArray("message_params_id");
        if (intArray == null) {
            return getString(i);
        }
        int length = intArray.length;
        String[] strArr = new String[length];
        for (int i2 = 0; i2 < length; i2++) {
            strArr[i2] = getString(intArray[i2]);
        }
        return getString(i, strArr);
    }

    public void A0q(Bundle bundle, String str) {
        if (str != null) {
            View findViewById = findViewById(2131364066);
            if (findViewById != null) {
                ((TextView) findViewById).setText(str);
                return;
            }
            throw null;
        }
        StringBuilder A0R = AnonymousClass00C.A0R("request/permission/activity/there is no message id for ");
        A0R.append(Arrays.toString(bundle.getStringArray("permissions")));
        Log.e(A0R.toString());
        finish();
    }

    public void A0r(String[] strArr) {
        this.A08 = true;
        A0L(this.A03, strArr);
        C04560Me.A0H(this, strArr, 0);
        View findViewById = findViewById(2131364067);
        if (findViewById != null) {
            findViewById.setVisibility(8);
            return;
        }
        throw null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: android.widget.TextView */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.1WZ, android.view.View$OnClickListener] */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.1WY, android.view.View$OnClickListener] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0s(java.lang.String[] r3, boolean r4) {
        /*
            r2 = this;
            r0 = 2131364889(0x7f0a0c19, float:1.8349628E38)
            android.view.View r0 = r2.findViewById(r0)
            if (r0 == 0) goto L_0x0025
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r4 == 0) goto L_0x001c
            r1 = 2131889135(0x7f120bef, float:1.9412925E38)
            r0.setText(r1)
            X.1WY r1 = new X.1WY
            r1.<init>(r2)
            r0.setOnClickListener(r1)
        L_0x001b:
            return
        L_0x001c:
            X.1WZ r1 = new X.1WZ
            r1.<init>(r2, r3)
            r0.setOnClickListener(r1)
            goto L_0x001b
        L_0x0025:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.RequestPermissionActivity.A0s(java.lang.String[], boolean):void");
    }

    public boolean A0t(String[] strArr) {
        for (String str : strArr) {
            if (this.A02.A02(str) != 0) {
                return false;
            }
            AnonymousClass00C.A0h(this.A03, str);
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [X.1WX, android.view.View$OnClickListener] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // X.AnonymousClass09L, X.AnonymousClass09K, X.AnonymousClass09N, X.AnonymousClass09M, X.AbstractActivityC02570Cf, X.AnonymousClass09O
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r11) {
        /*
        // Method dump skipped, instructions count: 417
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.RequestPermissionActivity.onCreate(android.os.Bundle):void");
    }

    @Override // X.AnonymousClass09M, X.AnonymousClass09V
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        String str;
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 0) {
            setResult(-1);
            for (int i2 = 0; i2 < strArr.length; i2++) {
                if (iArr[i2] == 0) {
                    AnonymousClass00C.A0h(this.A03, strArr[i2]);
                    if ("android.permission.WRITE_CONTACTS".equals(strArr[i2])) {
                        this.A00.A01(getApplicationContext());
                        this.A01.A04();
                    }
                } else {
                    StringBuilder A0R = AnonymousClass00C.A0R("request/permission/activity/");
                    A0R.append(strArr[i2]);
                    A0R.append(" denied");
                    Log.i(A0R.toString());
                    setResult(0);
                }
                if (this.A06 != null) {
                    String str2 = strArr[i2];
                    boolean z = iArr[i2] == 0;
                    if ("android.permission.WRITE_CONTACTS".equals(str2)) {
                        str = "access_to_contacts";
                    } else if ("android.permission.WRITE_EXTERNAL_STORAGE".equals(str2)) {
                        str = "access_to_files";
                    }
                    String str3 = z ? "allow" : "not_now";
                    1hb r4 = this.A05;
                    if (r4.A02()) {
                        r4.A00(str);
                        r4.A01(str, str3);
                    }
                }
            }
            finish();
        }
    }

    @Override // X.AnonymousClass09M
    public void onResume() {
        super.onResume();
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String[] stringArray = extras.getStringArray("permissions");
            if ((stringArray == null || A0t(stringArray)) && !this.A07) {
                Log.i("request/permission/activity/permissions has been granted while we were paused");
                setResult(-1);
                finish();
                return;
            }
            return;
        }
        throw null;
    }

    @Override // X.AnonymousClass09L, X.AnonymousClass09N, X.AnonymousClass09M, X.AnonymousClass09O
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("permissions_requested", this.A08);
    }
}
