package com.whatsapp.voipcalling;

import X.AnonymousClass00C;
import X.AnonymousClass00I;
import X.AnonymousClass1ES;
import X.C002701g;
import X.C03150Fh;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.voipcalling.Voip;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class CallInfo {
    public long ECMode;
    public long audioDuration;
    public long bytesReceived;
    public long bytesSent;
    public long callActiveTime;
    public long callDuration;
    public boolean callEnding;
    public final String callId;
    public int callResult;
    public int callSetupErrorType;
    public final Voip.CallState callState;
    public AnonymousClass1ES callWaitingInfo;
    public final UserJid creatorJid;
    public final GroupJid groupJid;
    public int initialGroupTransactionId;
    public final UserJid initialPeerJid;
    public boolean isCaller;
    public boolean isEndedByMe;
    public boolean isGroupCall;
    public boolean isGroupCallCreatedOnServer;
    public boolean isGroupCallEnabled;
    public final boolean isJoinableGroupCall;
    public final Map participants = new LinkedHashMap();
    public final UserJid peerJid;
    public C03150Fh self;
    public boolean videoCaptureStarted;
    public long videoDuration;
    public boolean videoEnabled;
    public boolean videoPreviewReady;

    public CallInfo(Voip.CallState callState2, String str, UserJid userJid, UserJid userJid2, UserJid userJid3, GroupJid groupJid2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i, int i2, boolean z7, boolean z8, boolean z9, long j, long j2, long j3, long j4, long j5, long j6, long j7, int i3, boolean z10) {
        this.callState = callState2;
        this.callId = str;
        this.peerJid = userJid;
        this.initialPeerJid = userJid2;
        this.creatorJid = userJid3;
        this.groupJid = groupJid2;
        this.isCaller = z;
        this.isGroupCall = z2;
        this.isGroupCallEnabled = z3;
        this.isGroupCallCreatedOnServer = z4;
        this.videoEnabled = z5;
        this.isEndedByMe = z6;
        this.callResult = i;
        this.callSetupErrorType = i2;
        this.callEnding = z7;
        this.videoPreviewReady = z8;
        this.videoCaptureStarted = z9;
        this.callActiveTime = j;
        this.callDuration = j2;
        this.audioDuration = j3;
        this.videoDuration = j4;
        this.bytesSent = j5;
        this.bytesReceived = j6;
        this.ECMode = j7;
        this.initialGroupTransactionId = i3;
        this.isJoinableGroupCall = z10;
    }

    private void addParticipantInfo(UserJid userJid, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i2, boolean z6, boolean z7, boolean z8, boolean z9, int i3, int i4, int i5, boolean z10, boolean z11, int i6, boolean z12, boolean z13) {
        boolean z14 = true;
        if (i < 1 || (i > 7 && i != 11)) {
            z14 = false;
        }
        StringBuilder sb = new StringBuilder("invalid participant state ");
        sb.append(i);
        AnonymousClass00I.A08(z14, sb.toString());
        C03150Fh r1 = new C03150Fh(userJid, i, z, z2, z3, z4, z5, z6, z7, z8, z9, i2, i3, i4, i5, z10, z11, i6, z12, z13);
        this.participants.put(userJid, r1);
        if (r1.A0E) {
            this.self = r1;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Throwable, java.lang.Runtime] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.whatsapp.voipcalling.CallInfo convertCallWaitingInfoToCallInfo(com.whatsapp.voipcalling.CallInfo r2) {
        /*
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "d2j fail translate: java.lang.RuntimeException: can not merge Z and I\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.useAs(TypeTransformer.java:868)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:668)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.CallInfo.convertCallWaitingInfoToCallInfo(com.whatsapp.voipcalling.CallInfo):com.whatsapp.voipcalling.CallInfo");
    }

    private void setCallWaitingInfo(boolean z, int i, String str, int i2, String[] strArr, String str2, boolean z2, boolean z3, int i3, int i4, boolean z4, Voip.CallLogInfo callLogInfo, boolean z5) {
        this.callWaitingInfo = new AnonymousClass1ES(i, str, i2, C002701g.A0Y(UserJid.class, Arrays.asList(strArr)), str2, z2, callLogInfo, z5);
    }

    public boolean enableAudioVideoSwitch() {
        return this.self.A07;
    }

    public long getAudioDuration() {
        return this.audioDuration;
    }

    public long getBytesReceived() {
        return this.bytesReceived;
    }

    public long getBytesSent() {
        return this.bytesSent;
    }

    public long getCallActiveTime() {
        return this.callActiveTime;
    }

    public long getCallDuration() {
        return this.callDuration;
    }

    public String getCallId() {
        return this.callId;
    }

    public int getCallResult() {
        return this.callResult;
    }

    public int getCallSetupErrorType() {
        return this.callSetupErrorType;
    }

    public Voip.CallState getCallState() {
        return this.callState;
    }

    public AnonymousClass1ES getCallWaitingInfo() {
        return this.callWaitingInfo;
    }

    public int getConnectedParticipantsCount() {
        int i = 0;
        for (Map.Entry entry : this.participants.entrySet()) {
            if (((C03150Fh) entry.getValue()).A01 == 1) {
                i++;
            }
        }
        return i;
    }

    public UserJid getCreatorJid() {
        return this.creatorJid;
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0017  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C03150Fh getDefaultPeerInfo() {
        /*
            r5 = this;
            r1 = 0
            boolean r0 = r5.isGroupCall
            if (r0 == 0) goto L_0x0007
            r0 = r1
        L_0x0006:
            return r0
        L_0x0007:
            java.util.Map r0 = r5.participants
            java.util.Collection r0 = r0.values()
            java.util.Iterator r2 = r0.iterator()
        L_0x0011:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x002c
            java.lang.Object r0 = r2.next()
            X.0Fh r0 = (X.C03150Fh) r0
            boolean r3 = r0.A0E
            if (r3 == 0) goto L_0x0006
            com.whatsapp.jid.UserJid r3 = r0.A06
            com.whatsapp.jid.UserJid r4 = r5.peerJid
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0011
            goto L_0x0006
        L_0x002c:
            r0 = r1
            goto L_0x0006
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.CallInfo.getDefaultPeerInfo():X.0Fh");
    }

    public long getECMode() {
        return this.ECMode;
    }

    public GroupJid getGroupJid() {
        return this.groupJid;
    }

    public C03150Fh getInfoByJid(UserJid userJid) {
        return (C03150Fh) this.participants.get(userJid);
    }

    public UserJid getInitialPeerJid() {
        return this.initialPeerJid;
    }

    public Set getParticipantJids() {
        return this.participants.keySet();
    }

    public Map getParticipants() {
        return this.participants;
    }

    public UserJid getPeerJid() {
        return this.peerJid;
    }

    public C03150Fh getSelfInfo() {
        return this.self;
    }

    public long getVideoDuration() {
        return this.videoDuration;
    }

    public boolean hasOutgoingParticipantInActiveOneToOneCall() {
        return this.callState == Voip.CallState.ACTIVE && getDefaultPeerInfo() != null && getDefaultPeerInfo().A00();
    }

    public int initialGroupTransactionId() {
        return this.initialGroupTransactionId;
    }

    public boolean isCallEnding() {
        return this.callEnding;
    }

    public boolean isCallOnHold() {
        if (this.self.A09) {
            return true;
        }
        for (C03150Fh r0 : this.participants.values()) {
            if (!(r0.A0E || r0.A09)) {
                return false;
            }
        }
        return true;
    }

    public boolean isCaller() {
        return this.isCaller;
    }

    public boolean isEitherSideRequestingUpgrade() {
        C03150Fh r1;
        if (this.isGroupCall || this.callState == Voip.CallState.NONE || (r1 = this.self) == null) {
            return false;
        }
        return r1.A01() || isPeerRequestingUpgrade();
    }

    public boolean isEndedByMe() {
        return this.isEndedByMe;
    }

    public boolean isGroupCall() {
        return this.isGroupCall;
    }

    public boolean isGroupCallCreatedOnServer() {
        return this.isGroupCallCreatedOnServer;
    }

    public boolean isGroupCallEnabled() {
        return this.isGroupCallEnabled;
    }

    public boolean isInLonelyState() {
        if (this.callState != Voip.CallState.ACTIVE) {
            return false;
        }
        for (C03150Fh r0 : this.participants.values()) {
            if (r0.A01 == 1 && !r0.A0E) {
                return false;
            }
        }
        return true;
    }

    public boolean isJoinableGroupCall() {
        return this.isJoinableGroupCall;
    }

    public boolean isPeerRequestingUpgrade() {
        C03150Fh defaultPeerInfo = getDefaultPeerInfo();
        return defaultPeerInfo != null && defaultPeerInfo.A01();
    }

    public boolean isSelfRequestingUpgrade() {
        C03150Fh r0;
        if (this.isGroupCall || (r0 = this.self) == null || this.callState == Voip.CallState.NONE) {
            return false;
        }
        return r0.A01();
    }

    public boolean isVideoCaptureStarted() {
        return this.videoCaptureStarted;
    }

    public boolean isVideoEnabled() {
        return this.videoEnabled;
    }

    public boolean isVideoPreviewReady() {
        return this.videoPreviewReady;
    }

    public String toString() {
        StringBuilder A0R = AnonymousClass00C.A0R("CallId: ");
        A0R.append(this.callId);
        A0R.append(", peerJid: ");
        A0R.append(this.peerJid);
        A0R.append(", callState: ");
        A0R.append(this.callState);
        return A0R.toString();
    }
}
