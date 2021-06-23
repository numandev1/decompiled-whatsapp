package com.whatsapp.voipcalling;

import com.whatsapp.jid.Jid;
import com.whatsapp.protocol.VoipStanzaChildNode;

public interface SignalingXmppCallback {
    void sendCallStanza(Jid jid, String str, VoipStanzaChildNode voipStanzaChildNode);
}
