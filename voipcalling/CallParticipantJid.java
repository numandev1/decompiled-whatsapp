package com.whatsapp.voipcalling;

import X.AnonymousClass00C;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import java.util.Arrays;

public class CallParticipantJid {
    public final DeviceJid[] deviceJids;
    public final UserJid userJid;

    public CallParticipantJid(UserJid userJid2, DeviceJid[] deviceJidArr) {
        this.userJid = userJid2;
        this.deviceJids = deviceJidArr;
    }

    public DeviceJid[] getDeviceJids() {
        return this.deviceJids;
    }

    public UserJid getUserJid() {
        return this.userJid;
    }

    public String toString() {
        StringBuilder A0R = AnonymousClass00C.A0R("CallParticipantJid userJid=");
        A0R.append(this.userJid);
        A0R.append(", deviceJids=(");
        A0R.append(Arrays.toString(this.deviceJids));
        A0R.append(')');
        return A0R.toString();
    }
}
