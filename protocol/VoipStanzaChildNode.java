package com.whatsapp.protocol;

import X.3U2;
import X.AnonymousClass047;
import X.C02410Bl;
import com.whatsapp.jid.Jid;
import java.util.Arrays;

public class VoipStanzaChildNode {
    public final AnonymousClass047[] attributes;
    public final VoipStanzaChildNode[] children;
    public final byte[] data;
    public final String tag;

    public VoipStanzaChildNode(String str, AnonymousClass047[] r2, VoipStanzaChildNode[] voipStanzaChildNodeArr, byte[] bArr) {
        this.tag = str;
        this.attributes = r2;
        this.children = voipStanzaChildNodeArr;
        this.data = bArr;
    }

    public /* synthetic */ VoipStanzaChildNode(String str, AnonymousClass047[] r2, VoipStanzaChildNode[] voipStanzaChildNodeArr, byte[] bArr, 3U2 r5) {
        this(str, r2, voipStanzaChildNodeArr, bArr);
    }

    public static VoipStanzaChildNode fromProtocolTreeNode(C02410Bl r6) {
        VoipStanzaChildNode[] voipStanzaChildNodeArr;
        C02410Bl[] r4 = r6.A03;
        if (r4 != null) {
            int length = r4.length;
            voipStanzaChildNodeArr = new VoipStanzaChildNode[length];
            int i = 0;
            int i2 = 0;
            while (i < length) {
                voipStanzaChildNodeArr[i2] = fromProtocolTreeNode(r4[i]);
                i++;
                i2++;
            }
        } else {
            voipStanzaChildNodeArr = null;
        }
        return new VoipStanzaChildNode(r6.A00, r6.A0I(), voipStanzaChildNodeArr, r6.A01);
    }

    public AnonymousClass047[] getAttributesCopy() {
        AnonymousClass047[] r0 = this.attributes;
        if (r0 != null) {
            return (AnonymousClass047[]) Arrays.copyOf(r0, r0.length);
        }
        return null;
    }

    public Object[] getAttributesFlattedCopy() {
        int i;
        AnonymousClass047[] r4 = this.attributes;
        if (r4 == null) {
            return null;
        }
        int length = r4.length;
        Object[] objArr = new Object[(length << 1)];
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            AnonymousClass047 r6 = r4[i2];
            int i4 = i3 + 1;
            objArr[i3] = r6.A02;
            Jid jid = r6.A01;
            if (jid != null) {
                i = i4 + 1;
                objArr[i4] = jid;
            } else {
                i = i4 + 1;
                objArr[i4] = r6.A03;
            }
            i2++;
            i3 = i;
        }
        return objArr;
    }

    public VoipStanzaChildNode[] getChildrenCopy() {
        VoipStanzaChildNode[] voipStanzaChildNodeArr = this.children;
        if (voipStanzaChildNodeArr != null) {
            return (VoipStanzaChildNode[]) Arrays.copyOf(voipStanzaChildNodeArr, voipStanzaChildNodeArr.length);
        }
        return null;
    }

    public byte[] getDataCopy() {
        byte[] bArr = this.data;
        if (bArr != null) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        return null;
    }

    public String getTag() {
        return this.tag;
    }

    public boolean hasAttribute(AnonymousClass047 r6) {
        AnonymousClass047[] r2 = this.attributes;
        if (r2 == null) {
            return false;
        }
        for (AnonymousClass047 r4 : r2) {
            if (r4.equals(r6)) {
                return true;
            }
        }
        return false;
    }

    public C02410Bl toProtocolTreeNode() {
        C02410Bl[] r0;
        int length;
        byte[] bArr = this.data;
        if (bArr != null) {
            return new C02410Bl(this.tag, this.attributes, null, bArr);
        }
        VoipStanzaChildNode[] voipStanzaChildNodeArr = this.children;
        if (voipStanzaChildNodeArr == null || (length = voipStanzaChildNodeArr.length) <= 0) {
            r0 = null;
        } else {
            r0 = new C02410Bl[length];
            int i = 0;
            int i2 = 0;
            while (i < length) {
                r0[i2] = voipStanzaChildNodeArr[i].toProtocolTreeNode();
                i++;
                i2++;
            }
        }
        return new C02410Bl(this.tag, this.attributes, r0, null);
    }
}
