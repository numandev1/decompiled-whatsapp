package com.whatsapp.backup.encryptedbackup;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import com.whatsapp.base.WaDialogFragment;

public class ConnectionErrorDialogFragment extends WaDialogFragment {
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.whatsapp.backup.encryptedbackup.ConnectionErrorDialogFragment */
    /* JADX WARN: Multi-variable type inference failed */
    public Dialog A0z(Bundle bundle) {
        Dialog dialog = new Dialog(A09());
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        dialog.setContentView(2131558784);
        dialog.setCanceledOnTouchOutside(true);
        return dialog;
    }
}
