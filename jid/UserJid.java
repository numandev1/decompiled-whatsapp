package com.whatsapp.jid;

import X.1nW;
import X.1nX;
import X.AbstractC003001o;
import X.AnonymousClass00C;
import X.C002701g;
import X.C003401t;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

public class UserJid extends AbstractC003001o implements Parcelable {
    public static final Parcelable.Creator CREATOR = new 1nX();
    public static final 1nW JID_FACTORY = 1nW.A01();
    public static final UserJid WHATSAPP_SURVEY;

    static {
        try {
            WHATSAPP_SURVEY = getFromIdentifier("16505361212");
        } catch (C003401t e) {
            throw new IllegalStateException(e);
        }
    }

    public UserJid(Parcel parcel) {
        super(parcel);
    }

    public UserJid(String str) {
        super(str);
        int type;
        if (!isValidRegularUser(str) && (type = getType()) != 11 && type != 7 && type != 8) {
            throw new C003401t(AnonymousClass00C.A0J("Invalid user: ", str));
        }
    }

    public static UserJid get(String str) {
        Jid jid = Jid.get(str);
        if (jid instanceof UserJid) {
            return (UserJid) jid;
        }
        throw new C003401t(str);
    }

    public static UserJid getFromIdentifier(String str) {
        return JID_FACTORY.A03(str, "s.whatsapp.net");
    }

    public static UserJid getNullable(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return get(str);
        } catch (C003401t e) {
            return null;
        }
    }

    public static boolean isValidRegularUser(String str) {
        char charAt;
        int length = str.length();
        if (length < 5 || length > 20 || str.startsWith("10") || (charAt = str.charAt(0)) < '1' || charAt > '9') {
            return false;
        }
        for (int i = 1; i < length; i++) {
            char charAt2 = str.charAt(i);
            if (charAt2 < '0' || charAt2 > '9') {
                return false;
            }
        }
        return true;
    }

    public static UserJid of(Jid jid) {
        if (jid instanceof UserJid) {
            return (UserJid) jid;
        }
        return null;
    }

    @Override // com.whatsapp.jid.Jid
    public int describeContents() {
        return 0;
    }

    @Override // com.whatsapp.jid.Jid
    public String getObfuscatedString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C002701g.A0R(this.user, 4));
        sb.append('@');
        sb.append(getServer());
        return sb.toString();
    }

    public DeviceJid getPrimaryDevice() {
        try {
            return DeviceJid.getFromUserJidAndDeviceId(this, 0);
        } catch (C003401t e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // com.whatsapp.jid.Jid
    public String getServer() {
        return "s.whatsapp.net";
    }

    @Override // com.whatsapp.jid.Jid
    public int getType() {
        return 0;
    }

    @Override // com.whatsapp.jid.Jid
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.user);
    }
}
