package com.whatsapp.voipcalling;

import X.AnonymousClass00I;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;

public class CallOfferInfo {
    public final CallGroupInfo callGroupInfo;
    public final String callId;
    public final long epochTimeMillis;
    public final UserJid fromJid;
    public final boolean isJoinableCall;
    public final boolean isVideoCall;
    public final CallMetadata metadata;
    public final boolean resume;
    public final boolean uploadFieldStat;

    public CallOfferInfo(UserJid userJid, GroupJid groupJid, String str, long j, boolean z, CallGroupInfo callGroupInfo2, boolean z2, boolean z3, boolean z4) {
        this.fromJid = userJid;
        this.metadata = new CallMetadata(groupJid);
        this.callId = str;
        this.epochTimeMillis = j;
        this.isVideoCall = z;
        this.callGroupInfo = callGroupInfo2;
        this.resume = z2;
        this.uploadFieldStat = z3;
        this.isJoinableCall = z4;
    }

    public static CallOfferInfo create(UserJid userJid, GroupJid groupJid, String str, long j, boolean z, CallGroupInfo callGroupInfo2, boolean z2, boolean z3, boolean z4) {
        if (str != null) {
            return new CallOfferInfo(userJid, groupJid, str, j, z, callGroupInfo2, z2, z3, z4);
        }
        AnonymousClass00I.A08(false, "callId shouldn't be null");
        return null;
    }

    public boolean isJoinableGroupCall() {
        return this.isJoinableCall && this.callGroupInfo != null;
    }
}
