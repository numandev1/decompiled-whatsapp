package com.whatsapp;

import X.1dr;
import X.1ga;
import X.1jK;
import X.1la;
import X.1uz;
import X.21Q;
import X.2vs;
import X.AnonymousClass00E;
import X.C002701g;
import X.C02970Ee;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import com.whatsapp.Mp4Ops;
import com.whatsapp.jid.Jid;
import com.whatsapp.mediacomposer.MediaComposerActivity;
import com.whatsapp.mentions.MentionableEntry;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GifHelper {
    public static Intent A00(File file, Activity activity, MentionableEntry mentionableEntry, List list, 1dr r13) {
        String str;
        ArrayList A0X;
        String str2;
        Uri fromFile = Uri.fromFile(new File(file.getAbsolutePath()));
        ArrayList arrayList = new ArrayList();
        arrayList.add(fromFile);
        String A0B = 2vs.A0B(mentionableEntry.getStringText());
        1uz r2 = new 1uz(fromFile);
        r2.A0B(A0B);
        r2.A0C(1la.A0q(mentionableEntry.getMentions()));
        Bundle A00 = new 21Q(r2).A00();
        if (list.size() == 1) {
            str = C002701g.A0G((Jid) list.get(0));
            A0X = null;
        } else {
            str = null;
            A0X = C002701g.A0X(list);
        }
        long j = 0;
        if (r13 != null) {
            j = r13.A0p;
            str2 = C002701g.A0G(1ga.A04(r13));
        } else {
            str2 = null;
        }
        Intent intent = new Intent(activity, MediaComposerActivity.class);
        intent.putExtra("android.intent.extra.STREAM", arrayList);
        intent.putExtra("android.intent.extra.TEXT", (String) null);
        intent.putExtra("jid", str);
        intent.putExtra("jids", A0X);
        intent.putExtra("max_items", 0);
        intent.putExtra("origin", 9);
        intent.putExtra("picker_open_time", SystemClock.elapsedRealtime());
        intent.putExtra("send", true);
        intent.putExtra("quoted_message_row_id", j);
        intent.putExtra("quoted_group_jid", str2);
        intent.putExtra("number_from_url", false);
        intent.putExtra("media_preview_params", A00);
        intent.putExtra("smb_quick_reply", false);
        intent.putExtra("start_home", false);
        intent.putExtra("animate_uri", (Parcelable) null);
        intent.putExtra("preselected_image_uri", (Parcelable) null);
        intent.putExtra("scan_for_qr", false);
        return intent;
    }

    public static void A01(AnonymousClass00E r4, File file) {
        try {
            File A07 = r4.A07(file);
            Mp4Ops.LibMp4OperationResult applyGifTag = applyGifTag(file.getAbsolutePath(), A07.getAbsolutePath());
            if (applyGifTag == null) {
                Log.e("gif-helper/applyGifTag is null");
                throw new C02970Ee(0, "result is null");
            } else if (!applyGifTag.success) {
                StringBuilder sb = new StringBuilder();
                sb.append("gif-helper/applyGifTag");
                sb.append(applyGifTag.errorMessage);
                Log.e(sb.toString());
                int i = applyGifTag.errorCode;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("invalid result, error_code: ");
                sb2.append(i);
                throw new C02970Ee(i, sb2.toString());
            } else if (!1jK.A0Y(r4, A07, file)) {
                Log.e("gif-helper/applyGifTag failed to apply tag properly.  Renaming marked file to original filepath unsuccessful");
                throw new C02970Ee(0, "applyGifTag failed to apply tag properly.  Renaming marked file to original filepath unsuccessful");
            }
        } catch (IOException e) {
            Log.e("Could not access file or failed to move files properly", e);
            throw new C02970Ee(0, "Could not access file or failed to move files properly");
        }
    }

    public static boolean A02(File file) {
        return file != null && hasGifTag(file.getAbsolutePath());
    }

    public static native Mp4Ops.LibMp4OperationResult applyGifTag(String str, String str2);

    public static native boolean hasGifTag(String str);
}
