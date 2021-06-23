package com.whatsapp.voipcalling;

import com.whatsapp.fieldstats.events.WamCall;
import com.whatsapp.fieldstats.events.WamJoinableCall;
import com.whatsapp.jid.UserJid;
import com.whatsapp.voipcalling.Voip;

public interface VoipEventCallback {
    void NoSamplingRatesForAudioRecord();

    void audioDriverRestart();

    void audioInitError();

    void audioRouteChangeRequest(int i);

    void audioStreamStarted();

    void audioTestReplayFinished();

    void batteryLevelLow();

    void callAcceptFailed();

    void callAcceptReceived();

    void callAutoConnected(String str, String str2);

    void callCaptureBufferFilled(Voip.DebugTapType debugTapType, byte[] bArr, int i, Voip.RecordingInfo[] recordingInfoArr);

    void callCaptureEnded(Voip.DebugTapType debugTapType, Voip.RecordingInfo[] recordingInfoArr);

    void callEnding(Voip.CallLogInfo callLogInfo, int i, String str);

    void callMissed(String str, String str2, String str3, String str4, int i, long j, boolean z, CallGroupInfo callGroupInfo, boolean z2, boolean z3, boolean z4);

    void callOfferAcked();

    void callOfferNacked(CallOfferAckError[] callOfferAckErrorArr);

    void callOfferReceiptReceived();

    void callOfferReceived();

    void callOfferSent();

    void callPreAcceptReceived();

    void callRejectReceived(String str, String str2);

    void callStateChanged(Voip.CallState callState, CallInfo callInfo);

    void callTerminateReceived(String str);

    void callWaitingStateChanged(int i);

    void errorGatheringHostCandidates();

    void fieldstatsReady(WamCall wamCall, String str, boolean z, boolean z2);

    void groupInfoChanged();

    void groupParticipantLeft(String str, String str2, int i);

    void handleAcceptAckFailed(String str, int i);

    void handleAcceptFailed();

    void handleCallFatal(int i);

    void handleFDLeakDetected();

    void handleOfferAckFailed();

    void handleOfferFailed();

    void handlePreAcceptFailed();

    void interruptionStateChanged();

    void joinableFieldstatsReady(WamJoinableCall wamJoinableCall, boolean z);

    void lobbyNacked(int i, String str);

    void mediaStreamError();

    void mediaStreamStartError();

    void missingRelayInfo();

    void muteStateChanged();

    void p2pNegotaitionFailed();

    void p2pNegotiationSuccess();

    void p2pTransportCreateFailed();

    void p2pTransportMediaCreateFailed();

    void p2pTransportRestartSuccess();

    void p2pTransportStartFailed();

    void peerBatteryLevelLow(String str);

    void peerVideoStateChanged(int i);

    void playCallTone(int i);

    void rejectedDecryptionFailure(String str, String str2, byte[] bArr, int i);

    void relayBindsFailed(boolean z);

    void relayCreateSuccess();

    void relayElectionSendFailed();

    void relayLatencySendFailed();

    void restartCamera();

    void rtcpByeReceived();

    void rxTimeout();

    void rxTrafficStarted();

    void rxTrafficStateForPeerChanged();

    void rxTrafficStopped();

    void selfVideoStateChanged(int i);

    void sendAcceptFailed();

    void sendJoinableClientPollCriticalEvent(int i);

    void sendOfferFailed();

    void soundPortCreateFailed();

    void soundPortCreated(int i);

    void syncDevices(SyncDevicesUserInfo[] syncDevicesUserInfoArr);

    void transportCandSendFailed();

    void txTimeout();

    void updateJoinableCallLog(int i, String str, UserJid[] userJidArr);

    void videoCaptureStarted();

    void videoCodecMismatch();

    void videoCodecStateChanged();

    void videoDecodeFatalError();

    void videoDecodePaused();

    void videoDecodeResumed();

    void videoDecodeStarted();

    void videoEncodeFatalError();

    void videoPortCreateFailed();

    void videoPortCreated(String str);

    void videoPreviewError();

    void videoPreviewReady();

    void videoRenderFormatChanged(String str);

    void videoRenderStarted(String str);

    void videoStreamCreateError();

    void weakWifiSwitchedToCellular();

    void willCreateSoundPort();
}
