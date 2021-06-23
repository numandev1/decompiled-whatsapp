package com.whatsapp.voipcalling;

import X.3eN;
import X.3eV;
import android.content.Context;
import android.graphics.Point;
import android.view.SurfaceHolder;

public interface VideoPort {
    public static final int ERROR_CREATE_EGL = -5;
    public static final int ERROR_CREATE_RENDERER = -2;
    public static final int ERROR_NO_EGL = -6;
    public static final int ERROR_NO_SURFACE = -1;
    public static final int ERROR_POST_TO_LOOPER = -100;
    public static final int ERROR_STALE_TEXTURE = -7;
    public static final int ERROR_SWAP_BUFFERS = -3;
    public static final int ERROR_UPDATE_WINDOW_SIZE = -4;
    public static final int SUCCESS = 0;

    3eN createSurfaceTexture();

    Context getContext();

    SurfaceHolder getSurfaceHolder();

    Point getWindowSize();

    void release();

    void releaseSurfaceTexture(3eN v);

    int renderNativeFrame(long j, int i, int i2, int i3, int i4, int i5);

    int renderTexture(3eN v, int i, int i2);

    int resetBlackScreen();

    void setListener(3eV v);

    int setScaleType(int i);
}
