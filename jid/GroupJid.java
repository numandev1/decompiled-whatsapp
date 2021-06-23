package com.whatsapp.jid;

import X.AbstractC003201r;
import X.C003401t;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

public abstract class GroupJid extends AbstractC003201r implements Parcelable {
    public GroupJid(Parcel parcel) {
        super(parcel);
    }

    public GroupJid(String str) {
        super(str);
    }

    public static GroupJid getNullable(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            Jid jid = Jid.get(str);
            if (jid instanceof GroupJid) {
                return (GroupJid) jid;
            }
            throw new C003401t(str);
        } catch (C003401t e) {
            return null;
        }
    }

    public static GroupJid of(Jid jid) {
        if (jid instanceof GroupJid) {
            return (GroupJid) jid;
        }
        return null;
    }
}
