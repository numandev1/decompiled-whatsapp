package com.whatsapp.watls13;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Map;

public class WtPersistentSession implements Serializable {
    public static final long serialVersionUID = 84430201;
    public final Map certs;
    public final String cipher;
    public final int port;
    public final LinkedHashSet psks;
    public final String sni;

    public WtPersistentSession(String str, int i, String str2, LinkedHashSet linkedHashSet, Map map) {
        this.psks = linkedHashSet;
        this.certs = map;
        this.sni = str;
        this.port = i;
        this.cipher = str2;
    }
}
