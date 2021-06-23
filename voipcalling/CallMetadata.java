package com.whatsapp.voipcalling;

import X.AnonymousClass00C;
import com.whatsapp.jid.GroupJid;

public class CallMetadata {
    public final GroupJid groupJid;

    public CallMetadata(GroupJid groupJid2) {
        this.groupJid = groupJid2;
    }

    public GroupJid getGroupJid() {
        return this.groupJid;
    }

    public String toString() {
        StringBuilder A0R = AnonymousClass00C.A0R("CallMetadata groupJid=");
        A0R.append(this.groupJid);
        return A0R.toString();
    }
}
