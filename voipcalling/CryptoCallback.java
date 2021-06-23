package com.whatsapp.voipcalling;

public interface CryptoCallback {
    boolean generateE2EKeysV2(byte[] bArr, byte[] bArr2, String str);

    boolean generateRandomBytes(byte[] bArr);

    boolean getSecureSsrc(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4);
}
