package com.whatsapp.breakpad;

import java.io.File;

public class BreakpadManager {
    public static File A00;

    public static native boolean crashThisProcess();

    public static native boolean overwriteBuffer(String str);

    public static native boolean setUpBreakpad(String str, String str2, String str3, String str4, boolean z, int i);
}
