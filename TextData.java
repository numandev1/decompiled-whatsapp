package com.whatsapp;

import X.AnonymousClass00C;
import java.io.Serializable;
import java.util.Arrays;

public class TextData implements Serializable {
    public static final long serialVersionUID = 1;
    public int backgroundColor;
    public int fontStyle;
    public int textColor;
    public byte[] thumbnail;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && TextData.class == obj.getClass()) {
            TextData textData = (TextData) obj;
            if (this.fontStyle == textData.fontStyle && this.textColor == textData.textColor && this.backgroundColor == textData.backgroundColor) {
                byte[] bArr = this.thumbnail;
                byte[] bArr2 = textData.thumbnail;
                if (bArr == bArr2) {
                    return true;
                }
                if (bArr != null) {
                    if (bArr2 != null) {
                        return Arrays.equals(bArr, bArr2);
                    }
                    if (bArr.length == 0) {
                        return true;
                    }
                } else if (bArr2.length == 0) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.deepHashCode(new Object[]{Integer.valueOf(this.fontStyle), Integer.valueOf(this.textColor), Integer.valueOf(this.backgroundColor), this.thumbnail});
    }

    public String toString() {
        StringBuilder A0R = AnonymousClass00C.A0R("TextData; fontStyle=");
        A0R.append(this.fontStyle);
        A0R.append("; textColor=");
        A0R.append(this.textColor);
        A0R.append("; backgroundColor=");
        A0R.append(this.backgroundColor);
        A0R.append("; thumbnail=");
        byte[] bArr = this.thumbnail;
        A0R.append(bArr == null ? "null" : Integer.valueOf(bArr.length));
        return A0R.toString();
    }
}
