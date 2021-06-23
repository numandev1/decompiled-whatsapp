package com.whatsapp.voipcalling;

import X.AnonymousClass00C;
import X.AnonymousClass00I;
import X.AnonymousClass04D;
import X.C02130Ag;
import android.graphics.Bitmap;
import android.media.audiofx.AcousticEchoCanceler;
import android.media.audiofx.AutomaticGainControl;
import android.media.audiofx.NoiseSuppressor;
import android.text.TextUtils;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.protocol.VoipStanzaChildNode;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.zip.GZIPOutputStream;

public final class Voip {
    public static CryptoCallback A00;
    public static final AnonymousClass04D A01 = new AnonymousClass04D();
    public static final SimpleDateFormat A02 = new SimpleDateFormat("yyyyMMddHHmmss", Locale.US);

    public class CallLogInfo {
        public final int callLogResultType;
        public Map groupCallLogs;
        public final UserJid initialPeerJid;
        public final long rxTotalBytes;
        public final long txTotalBytes;

        public CallLogInfo(UserJid userJid, int i, long j, long j2) {
            this.callLogResultType = i;
            this.txTotalBytes = j;
            this.rxTotalBytes = j2;
            this.initialPeerJid = userJid;
        }

        public void addGroupCallLog(String str, int i) {
            Map map = this.groupCallLogs;
            if (map == null) {
                map = new LinkedHashMap();
                this.groupCallLogs = map;
            }
            map.put(str, Integer.valueOf(i));
        }

        public Map getGroupCallLogs() {
            return this.groupCallLogs;
        }
    }

    public enum CallState {
        NONE,
        CALLING,
        PRE_ACCEPT_RECEIVED,
        RECEIVED_CALL,
        ACCEPT_SENT,
        ACCEPT_RECEIVED,
        ACTIVE,
        ACTIVE_ELSEWHERE,
        RECEIVED_CALL_WITHOUT_OFFER,
        REJOINING
    }

    public class RecordingInfo {
        public File outputFile;
        public OutputStream outputStream;

        public RecordingInfo(C02130Ag r8, DebugTapType debugTapType) {
            String str;
            int ordinal = debugTapType.ordinal();
            if (ordinal == 0) {
                str = "received.decoded";
            } else if (ordinal == 1) {
                str = "record.processed";
            } else if (ordinal == 2) {
                str = "record.encoded";
            } else if (ordinal == 3) {
                str = "record.raw";
            } else if (ordinal == 4) {
                str = "playback.raw";
            } else {
                StringBuilder sb = new StringBuilder("unknown debug tap type: ");
                sb.append(debugTapType);
                throw new IllegalStateException(sb.toString());
            }
            String format = Voip.A02.format(new Date(System.currentTimeMillis()));
            r8.A04();
            File file = new File((File) null, AnonymousClass00C.A0L(format, ".", str, ".wav.gz"));
            this.outputFile = file;
            try {
                this.outputStream = new GZIPOutputStream(new FileOutputStream(file, true));
            } catch (IOException e) {
                Log.e(e);
                this.outputStream = null;
            }
        }

        public File getOutputFile() {
            return this.outputFile;
        }

        public OutputStream getOutputStream() {
            return this.outputStream;
        }
    }

    public static Boolean A00(String str) {
        Integer A012 = A01(str);
        if (A012 == null) {
            return null;
        }
        int intValue = A012.intValue();
        boolean z = false;
        if (intValue != 0) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static Integer A01(String str) {
        String A06 = A06(str);
        if (A06 == null || A06.isEmpty()) {
            AnonymousClass00C.A16("No value found for param ", str);
            return null;
        }
        try {
            return Integer.valueOf(A06);
        } catch (NumberFormatException e) {
            StringBuilder sb = new StringBuilder("Wrong format for param ");
            sb.append(str);
            sb.append(", value ");
            sb.append(A06);
            Log.e(sb.toString(), e);
            return null;
        }
    }

    public static Object A02(int i, boolean z) {
        if (A07() && i >= 0) {
            int i2 = 0;
            while (i2 <= 50) {
                int i3 = i2 == 0 ? i + 3 : i + i2;
                try {
                    AcousticEchoCanceler create = AcousticEchoCanceler.create(i3);
                    if (create != null) {
                        create.setEnabled(z);
                        StringBuilder sb = new StringBuilder();
                        sb.append("voip/hackBuiltInAec/enabled ");
                        sb.append(create.getEnabled());
                        sb.append(" on session id ");
                        sb.append(i3);
                        sb.append(" with previous session id ");
                        sb.append(i);
                        Log.i(sb.toString());
                        return create;
                    }
                    i2++;
                } catch (Throwable th) {
                    Log.e(th);
                }
            }
            AnonymousClass00C.A0v("voip/hackBuiltInAec/failed previousAudioSessionId = ", i, ", range = ", 50);
        }
        return null;
    }

    public static Object A03(int i, boolean z) {
        boolean z2;
        try {
            z2 = AutomaticGainControl.isAvailable();
        } catch (Throwable th) {
            Log.e(th);
            z2 = false;
        }
        if (z2 && i >= 0) {
            int i2 = 0;
            while (i2 <= 50) {
                int i3 = i2 == 0 ? i + 3 : i + i2;
                try {
                    AutomaticGainControl create = AutomaticGainControl.create(i3);
                    if (create != null) {
                        create.setEnabled(z);
                        StringBuilder sb = new StringBuilder();
                        sb.append("voip/hackBuiltInAgc/enabled ");
                        sb.append(create.getEnabled());
                        sb.append(" on session id ");
                        sb.append(i3);
                        sb.append(" with previous session id ");
                        sb.append(i);
                        Log.i(sb.toString());
                        return create;
                    }
                    i2++;
                } catch (Throwable th2) {
                    Log.e(th2);
                }
            }
            AnonymousClass00C.A0v("voip/hackBuiltInAgc/failed previousAudioSessionId = ", i, ", range = ", 50);
        }
        return null;
    }

    public static Object A04(int i, boolean z) {
        boolean z2;
        try {
            z2 = NoiseSuppressor.isAvailable();
        } catch (Throwable th) {
            Log.e(th);
            z2 = false;
        }
        if (z2 && i >= 0) {
            int i2 = 0;
            while (i2 <= 50) {
                int i3 = i2 == 0 ? i + 3 : i + i2;
                try {
                    NoiseSuppressor create = NoiseSuppressor.create(i3);
                    if (create != null) {
                        create.setEnabled(z);
                        StringBuilder sb = new StringBuilder();
                        sb.append("voip/hackBuiltInNs/enabled ");
                        sb.append(create.getEnabled());
                        sb.append(" on session id ");
                        sb.append(i3);
                        sb.append(" with previous session id ");
                        sb.append(i);
                        Log.i(sb.toString());
                        return create;
                    }
                    i2++;
                } catch (Throwable th2) {
                    Log.e(th2);
                }
            }
            AnonymousClass00C.A0v("voip/hackBuiltInNs/failed previousAudioSessionId = ", i, ", range = ", 50);
        }
        return null;
    }

    public static String A05(int i) {
        if (i == 0) {
            return "kAudOutputDefault";
        }
        if (i == 1) {
            return "kAudOutputSpeaker";
        }
        if (i == 2) {
            return "kAudOutputEarpiece";
        }
        if (i == 3) {
            return "kAudOutputBluetooth";
        }
        if (i == 4) {
            return "kAudOutputHeadset";
        }
        AnonymousClass00I.A08(false, "UNKNOWN AudioRoute");
        return "UNKNOWN AudioRoute";
    }

    public static String A06(String str) {
        String voipParam = getVoipParam(str);
        if (voipParam == null || voipParam.isEmpty()) {
            return null;
        }
        return voipParam;
    }

    public static boolean A07() {
        try {
            return AcousticEchoCanceler.isAvailable();
        } catch (Throwable th) {
            Log.e(th);
            return false;
        }
    }

    public static boolean A08(CallInfo callInfo) {
        return (callInfo == null || callInfo.callState == CallState.NONE) ? false : true;
    }

    public static boolean A09(CallInfo callInfo) {
        return A08(callInfo) && callInfo.callState != CallState.ACTIVE_ELSEWHERE;
    }

    public static boolean A0A(CallInfo callInfo, String str) {
        return A08(callInfo) && TextUtils.equals(str, callInfo.callId);
    }

    public static boolean A0B(CallState callState) {
        return callState == CallState.RECEIVED_CALL || callState == CallState.REJOINING;
    }

    public static native void acceptCall();

    public static native int acceptVideoUpgrade();

    public static native void adjustAudioLevel(int i);

    public static native int cancelInviteToGroupCall(UserJid userJid);

    public static native int cancelVideoUpgrade(int i);

    public static native void checkOngoingCalls(String[] strArr, DeviceJid[] deviceJidArr);

    public static native void clearVoipParam(String str);

    public static native void debugAdjustAECMParams(short s, short s2);

    public static native boolean dumpLastVideoFrame(String str, Bitmap bitmap);

    public static native void endCall(boolean z);

    public static native void endCallAndAcceptPendingCall(String str);

    public static native CallInfo getCallInfo();

    public static native int getCameraCount();

    public static native String getCurrentCallId();

    public static native CallState getCurrentCallState();

    public static native String getCurrentRxNetworkConditionerParameters();

    public static native String getCurrentTxNetworkConditionerParameters();

    public static native UserJid getPeerJid();

    public static native String getStreamStatistics();

    public static native String getStreamStatisticsShort();

    public static native String getVoipParam(String str);

    public static native int getVoipParamElemCount(String str);

    public static native String getVoipParamForCall(String str, String str2);

    public static native int inviteToGroupCall(CallParticipantJid callParticipantJid);

    public static native boolean isRxNetworkConditionerOn();

    public static native boolean isTxNetworkConditionerOn();

    public static native int joinOngoingCall(String str, UserJid userJid, DeviceJid deviceJid, boolean z, CallParticipantJid[] callParticipantJidArr, boolean z2, CallMetadata callMetadata, int i);

    public static native void muteCall(boolean z);

    public static native int nativeHandleIncomingSignalingXmpp(Jid jid, VoipStanzaChildNode voipStanzaChildNode, String str, String str2, long j, long j2, boolean z);

    public static native int nativeHandleIncomingSignalingXmppAck(Jid jid, String str, int i, VoipStanzaChildNode[] voipStanzaChildNodeArr);

    public static native int nativeHandleIncomingSignalingXmppReceipt(Jid jid, VoipStanzaChildNode voipStanzaChildNode);

    public static native int nativeHandleIncomingXmppOffer(Jid jid, VoipStanzaChildNode voipStanzaChildNode, String str, String str2, long j, long j2, boolean z, boolean z2, int i);

    public static native int nativeHandleWebClientMessage(String str, String str2, int i, VoipStanzaChildNode voipStanzaChildNode);

    public static native int nativeParseXmppOffer(CallOfferInfo[] callOfferInfoArr, Jid jid, VoipStanzaChildNode voipStanzaChildNode, String str, String str2, long j, long j2, boolean z);

    public static native void nativeRegisterCryptoCallback(CryptoCallback cryptoCallback);

    public static native void nativeRegisterEventCallback(VoipEventCallback voipEventCallback);

    public static native void nativeRegisterMultiNetworkCallback(MultiNetworkCallback multiNetworkCallback);

    public static native void nativeRegisterSignalingXmppCallback(SignalingXmppCallback signalingXmppCallback);

    public static native void nativeUnregisterCryptoCallback();

    public static native void nativeUnregisterEventCallback();

    public static native void nativeUnregisterMultiNetworkCallback();

    public static native void nativeUnregisterSignalingXmppCallback();

    public static native void notifyAudioRouteChange(int i);

    public static native void notifyDeviceIdentityChanged(DeviceJid deviceJid);

    public static native void notifyDeviceIdentityDeleted(DeviceJid deviceJid);

    public static native int notifyFailureToCreateAlternativeSocket(boolean z);

    public static native int notifyLostOfAlternativeNetwork();

    public static native void onCallInterrupted(boolean z, boolean z2);

    public static native void processPipModeChange(boolean z);

    public static native int refreshVideoDevice();

    public static native void rejectCall(String str, String str2);

    public static native void rejectCallWithoutCallContext(String str, boolean z, String str2, String str3, String str4, int i, int i2);

    public static native void rejectPendingCall(String str);

    public static native int rejectVideoUpgrade(int i);

    public static native int requestVideoUpgrade();

    public static native void resendOfferOnDecryptionFailure(DeviceJid deviceJid, String str);

    public static native void saveCallMetrics(String str);

    public static native void sendRekeyRequest(String str, int i);

    public static native int setBatteryState(float f, float f2, boolean z);

    public static native int setScreenSize(int i, int i2);

    public static native int setVideoDisplayPort(String str, VideoPort videoPort);

    public static native int setVideoPreviewPort(VideoPort videoPort, String str);

    public static native int setVideoPreviewSize(int i, int i2);

    public static native int startCall(String str, CallParticipantJid callParticipantJid, boolean z);

    public static native boolean startCallRecording(RecordingInfo[] recordingInfoArr);

    public static native int startGroupCall(String str, CallParticipantJid[] callParticipantJidArr, boolean z, CallMetadata callMetadata);

    public static native int startTestNetworkConditionWithAlternativeSocket(int i, String str, int i2);

    public static native void startVideoCaptureStream();

    public static native void startVideoRenderStream(String str);

    public static native boolean stopCallRecording();

    public static native void stopVideoCaptureStream();

    public static native void stopVideoRenderStream(String str);

    public static native int switchCamera();

    public static native int switchNetworkWithAlternativeSocket(int i, String str, int i2);

    public static native void timeoutPendingCall(String str);

    public static native void transitionToRejoining();

    public static native int turnCameraOff();

    public static native int turnCameraOn();

    public static native void updateNetworkMedium(int i, int i2);

    public static native void updateNetworkRestrictions(boolean z);

    public static native void videoOrientationChanged(int i);
}
