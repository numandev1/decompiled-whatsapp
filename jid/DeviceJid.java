package com.whatsapp.jid;

import X.2KD;
import X.AnonymousClass00C;
import X.C002701g;
import X.C003401t;
import X.C003501u;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

public class DeviceJid extends Jid implements Parcelable {
    public static final Parcelable.Creator CREATOR = new 2KD();
    public final byte agent;
    public final byte device;
    public final UserJid userJid;

    public DeviceJid(Parcel parcel) {
        super(parcel);
        UserJid userJid2 = (UserJid) parcel.readParcelable(UserJid.class.getClassLoader());
        if (userJid2 != null) {
            this.userJid = userJid2;
            this.agent = parcel.readByte();
            this.device = parcel.readByte();
            return;
        }
        throw null;
    }

    public DeviceJid(UserJid userJid2, int i, int i2) {
        super(userJid2.user);
        if (userJid2 != C003501u.A00) {
            this.userJid = userJid2;
            if (i < 0 || i > 99) {
                throw new C003401t(AnonymousClass00C.A0E("Invalid agent: ", i));
            }
            this.agent = (byte) i;
            if (i2 < 0 || i2 > 99) {
                throw new C003401t(AnonymousClass00C.A0E("Invalid device: ", i2));
            }
            this.device = (byte) i2;
            return;
        }
        throw new C003401t(userJid2);
    }

    public static DeviceJid get(String str) {
        DeviceJid of;
        Jid jid = Jid.get(str);
        if (jid instanceof DeviceJid) {
            return (DeviceJid) jid;
        }
        if ((jid instanceof UserJid) && (of = of(jid)) != null) {
            return of;
        }
        throw new C003401t(str);
    }

    public static DeviceJid getFromUserJidAndDeviceId(UserJid userJid2, int i) {
        String str = userJid2.user;
        String server = userJid2.getServer();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('.');
        sb.append(0);
        sb.append(':');
        sb.append(i);
        sb.append('@');
        sb.append(server);
        return get(sb.toString());
    }

    public static DeviceJid getNullable(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return get(str);
        } catch (C003401t e) {
            return null;
        }
    }

    public static DeviceJid of(Jid jid) {
        if (jid instanceof DeviceJid) {
            return (DeviceJid) jid;
        }
        if (jid instanceof UserJid) {
            return ((UserJid) jid).getPrimaryDevice();
        }
        return null;
    }

    @Override // com.whatsapp.jid.Jid
    public int describeContents() {
        return 0;
    }

    @Override // com.whatsapp.jid.Jid
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DeviceJid.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        DeviceJid deviceJid = (DeviceJid) obj;
        if (this.agent == deviceJid.agent && this.device == deviceJid.device) {
            return this.userJid.equals(deviceJid.userJid);
        }
        return false;
    }

    @Override // com.whatsapp.jid.Jid
    public int getAgent() {
        return this.agent;
    }

    @Override // com.whatsapp.jid.Jid
    public int getDevice() {
        return this.device;
    }

    @Override // com.whatsapp.jid.Jid
    public String getObfuscatedString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C002701g.A0R(this.user, 4));
        sb.append('.');
        sb.append((int) this.agent);
        sb.append(':');
        sb.append((int) this.device);
        sb.append('@');
        sb.append("s.whatsapp.net");
        return sb.toString();
    }

    @Override // com.whatsapp.jid.Jid
    public String getRawString() {
        String str = this.user;
        byte b = this.agent;
        byte b2 = this.device;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('.');
        sb.append((int) b);
        sb.append(':');
        sb.append((int) b2);
        sb.append('@');
        sb.append("s.whatsapp.net");
        return sb.toString();
    }

    @Override // com.whatsapp.jid.Jid
    public String getServer() {
        return "s.whatsapp.net";
    }

    @Override // com.whatsapp.jid.Jid
    public int getType() {
        return 17;
    }

    @Override // com.whatsapp.jid.Jid
    public int hashCode() {
        return (((((super.hashCode() * 31) + this.userJid.hashCode()) * 31) + this.agent) * 31) + this.device;
    }

    public boolean isPrimary() {
        return this.device == 0;
    }

    @Override // com.whatsapp.jid.Jid
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.user);
        parcel.writeParcelable(this.userJid, i);
        parcel.writeByte(this.agent);
        parcel.writeByte(this.device);
    }
}
