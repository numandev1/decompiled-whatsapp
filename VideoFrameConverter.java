package com.whatsapp;

import java.nio.ByteBuffer;

public class VideoFrameConverter {
    public long A00 = create();

    public static native void configure(long j, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10);

    public static native void convertAndroid420toI420(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5, int i6, ByteBuffer byteBuffer4);

    public static native void convertAndroid420toNV21(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5, int i6, int i7, ByteBuffer byteBuffer4);

    public static native void convertFrame(long j, ByteBuffer byteBuffer, ByteBuffer byteBuffer2);

    public static native long create();

    public static native void release(long j);

    public static native void scalePlane(ByteBuffer byteBuffer, int i, int i2, int i3, ByteBuffer byteBuffer2, int i4, int i5, int i6);

    public static native void setLogFilePath(String str);

    public static native void setOverlay(long j, ByteBuffer byteBuffer, int i, int i2, int i3, int i4);
}
