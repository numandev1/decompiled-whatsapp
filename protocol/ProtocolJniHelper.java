package com.whatsapp.protocol;

import X.AnonymousClass047;
import X.C003401t;
import X.C02410Bl;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;

public class ProtocolJniHelper {
    public static final ProtocolJniHelper INSTANCE = new ProtocolJniHelper();

    public static ProtocolJniHelper getInstance() {
        return INSTANCE;
    }

    public Object createKeyValue(String str, String str2, Object obj, byte b) {
        return new AnonymousClass047(str, str2, (Jid) obj, b);
    }

    public Object createNewJid(String str) {
        try {
            return Jid.get(str);
        } catch (C003401t e) {
            Log.w("ProtocolJniHelper/createNewJid", e);
            return null;
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:25:0x0029 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:16:0x0029 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: X.0Bl[] */
    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: X.047[] */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: X.0Bl[] */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: X.0Bl[] */
    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: X.047[] */
    /* JADX DEBUG: Multi-variable search result rejected for r2v4, resolved type: X.047[] */
    /* JADX WARN: Multi-variable type inference failed */
    public Object createProtocolTreeNode(String str, Object[] objArr, Object[] objArr2, byte[] bArr) {
        AnonymousClass047[] r2;
        C02410Bl[] r0 = 0;
        boolean z = true;
        boolean z2 = objArr == null || (objArr[0] instanceof AnonymousClass047);
        if (objArr2 != null && !(objArr2[0] instanceof C02410Bl)) {
            z = false;
        }
        if (!z2 || !z) {
            throw new IllegalArgumentException("ProtocolJniHelper/createProtocolTreeNode");
        }
        if (objArr != null) {
            int length = objArr.length;
            r2 = new AnonymousClass047[length];
            for (int i = 0; i < length; i++) {
                r2[i] = objArr[i];
            }
        } else {
            r2 = 0;
        }
        if (objArr2 != null) {
            int length2 = objArr2.length;
            r0 = new C02410Bl[length2];
            for (int i2 = 0; i2 < length2; i2++) {
                r0[i2] = objArr2[i2];
            }
        }
        return new C02410Bl(str, r2, r0, bArr);
    }

    public Object[] getAttributesFromProtocolTreeNode(Object obj) {
        if (obj instanceof C02410Bl) {
            return ((C02410Bl) obj).A0I();
        }
        throw new IllegalArgumentException("ProtocolJniHelper/getAttributesFromProtocolTreeNode");
    }

    public Object[] getChildrenFromProtocolTreeNode(Object obj) {
        if ((obj instanceof C02410Bl) && obj != null) {
            return ((C02410Bl) obj).A03;
        }
        throw new IllegalArgumentException("ProtocolJniHelper/getChildrenFromProtocolTreeNode");
    }

    public byte[] getDataFromProtocolTreeNode(Object obj) {
        if (obj instanceof C02410Bl) {
            return ((C02410Bl) obj).A01;
        }
        throw new IllegalArgumentException("ProtocolJniHelper/getDataFromProtocolTreeNode");
    }

    public String getKeyFromKeyValue(Object obj) {
        if (obj instanceof AnonymousClass047) {
            return ((AnonymousClass047) obj).A02;
        }
        throw new IllegalArgumentException("ProtocolJniHelper/getKeyFromKeyValue");
    }

    public String getTagFromProtocolTreeNode(Object obj) {
        if (obj instanceof C02410Bl) {
            return ((C02410Bl) obj).A00;
        }
        throw new IllegalArgumentException("ProtocolJniHelper/getTagFromProtocolTreeNode");
    }

    public byte getTypeFromKeyValue(Object obj) {
        if (obj instanceof AnonymousClass047) {
            return ((AnonymousClass047) obj).A00;
        }
        throw new IllegalArgumentException("ProtocolJniHelper/getTypeFromKeyValue");
    }

    public String getValueStringFromKeyValue(Object obj) {
        if (obj instanceof AnonymousClass047) {
            return ((AnonymousClass047) obj).A03;
        }
        throw new IllegalArgumentException("ProtocolJniHelper/getValueStringFromKeyValue");
    }
}
