package com.whatsapp.jid;

import X.1nW;
import X.AnonymousClass01M;
import X.C003401t;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.Arrays;

public abstract class Jid implements Parcelable, Comparable {
    public static final 1nW JID_FACTORY = 1nW.A01();
    public final String user;

    public Jid(Parcel parcel) {
        this.user = parcel.readString();
    }

    public Jid(String str) {
        this.user = str;
    }

    public static String buildRawString(String str, String str2) {
        if (str.isEmpty()) {
            return str2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('@');
        sb.append(str2);
        return sb.toString();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0100, code lost:
        if (r5.equals("call") == false) goto L_0x003c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.whatsapp.jid.Jid get(java.lang.String r10) {
        /*
        // Method dump skipped, instructions count: 400
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jid.Jid.get(java.lang.String):com.whatsapp.jid.Jid");
    }

    public static Jid getNullable(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return get(str);
        } catch (C003401t e) {
            return null;
        }
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return getRawString().compareTo(((Jid) obj).getRawString());
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Jid)) {
            return false;
        }
        Jid jid = (Jid) obj;
        return AnonymousClass01M.A1E(this.user, jid.user) && getServer().equals(jid.getServer()) && getType() == jid.getType();
    }

    public int getAgent() {
        return 0;
    }

    public int getDevice() {
        return 0;
    }

    public String getObfuscatedString() {
        return getRawString();
    }

    public String getRawString() {
        return buildRawString(this.user, getServer());
    }

    public abstract String getServer();

    public abstract int getType();

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.user, getServer(), Integer.valueOf(getType())});
    }

    public boolean isProtocolCompliant() {
        int type = getType();
        return (type == 2 || type == 9 || type == 11 || type == 8) ? false : true;
    }

    public final String toString() {
        return getObfuscatedString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.user);
    }
}
