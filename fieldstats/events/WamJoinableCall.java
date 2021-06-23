package com.whatsapp.fieldstats.events;

import X.AbstractC000300e;

public final class WamJoinableCall extends AbstractC000300e {
    public String callRandomId;
    public Boolean isPendingCall;
    public Boolean isRejoin;
    public Boolean isRering;
    public Boolean joinableAcceptBeforeLobbyAck;
    public Boolean joinableDuringCall;
    public Boolean joinableEndCallBeforeLobbyAck;
    public Integer legacyCallResult;
    public Long lobbyAckLatencyMs;
    public Integer lobbyEntryPoint;
    public Integer lobbyExit;
    public Long lobbyExitNackCode;
    public Boolean lobbyQueryWhileConnected;
    public Long lobbyVisibleT;
    public Long numConnectedPeers;
    public Long numInvitedParticipants;
    public Long numOutgoingRingingPeers;
    public Boolean previousJoinNotEnded;
    public Long timeSinceLastClientPollMinutes;
    public Boolean videoEnabled;

    public WamJoinableCall() {
        super(2572, AbstractC000300e.DEFAULT_SAMPLING_RATE, 0);
    }
}
