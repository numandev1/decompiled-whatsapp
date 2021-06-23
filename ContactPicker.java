package com.whatsapp;

import X.1iG;
import X.1jK;
import X.1pw;
import X.1tY;
import X.248;
import X.2Bw;
import X.2CA;
import X.AbstractActivityC03530Hm;
import X.AbstractC03470Hf;
import X.AnonymousClass00f;
import X.AnonymousClass022;
import X.AnonymousClass02S;
import X.AnonymousClass07T;
import X.AnonymousClass09G;
import X.AnonymousClass09I;
import X.AnonymousClass0C1;
import X.AnonymousClass0PI;
import X.C002701g;
import X.C020709z;
import X.C02710Da;
import android.app.Dialog;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import com.whatsapp.contact.picker.BaseSharedPreviewDialogFragment;
import com.whatsapp.contact.picker.ContactPickerFragment;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.WhatsAppLibLoader;
import java.util.List;

public class ContactPicker extends AbstractActivityC03530Hm implements 2CA, 248 {
    public AnonymousClass02S A00;
    public AnonymousClass0C1 A01;
    public AnonymousClass07T A02;
    public BaseSharedPreviewDialogFragment A03;
    public 2Bw A04;
    public ContactPickerFragment A05;
    public WhatsAppLibLoader A06;

    @Override // X.AnonymousClass09I
    public void A10(int i) {
        ContactPickerFragment contactPickerFragment = this.A05;
        if (contactPickerFragment != null) {
            contactPickerFragment.A1F(i);
        }
    }

    @Override // X.AnonymousClass09G
    public AnonymousClass00f A1G() {
        return AnonymousClass022.A02;
    }

    @Override // X.AbstractActivityC03090Fa
    public void A1Q() {
        ContactPickerFragment contactPickerFragment = this.A05;
        if (contactPickerFragment != null) {
            contactPickerFragment.A16();
        }
    }

    @Override // X.AbstractActivityC03090Fa
    public void A1S(1pw r2) {
        ContactPickerFragment contactPickerFragment = this.A05;
        if (contactPickerFragment != null) {
            contactPickerFragment.A14();
        }
    }

    public final Intent A1W(List list) {
        if (list.size() != 1) {
            return HomeActivity.A01(this);
        }
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(this, "com.whatsapp.Conversation"));
        intent.putExtra("jid", C002701g.A0G((Jid) list.get(0)));
        intent.addFlags(335544320);
        1iG.A0T(intent, "ContactPicker:getPostSendIntent", ((AnonymousClass09G) this).A09);
        return intent;
    }

    public ContactPickerFragment A1X() {
        return new ContactPickerFragment();
    }

    public 2Bw AAo() {
        2Bw r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        2Bw r02 = new 2Bw(this);
        this.A04 = r02;
        return r02;
    }

    @Override // X.AbstractC015007b, X.AnonymousClass09L, X.AnonymousClass09I
    public void APw(AbstractC03470Hf r3) {
        super.APw(r3);
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().setStatusBarColor(C020709z.A00(this, 2131100412));
        }
    }

    @Override // X.AbstractC015007b, X.AnonymousClass09L, X.AnonymousClass09I
    public void APx(AbstractC03470Hf r3) {
        super.APx(r3);
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().setStatusBarColor(C020709z.A00(this, 2131099684));
        }
    }

    public void AS6() {
        this.A03 = null;
    }

    public void AT8(Uri uri, List list, Bundle bundle) {
        this.A01.A0A(list, uri, 1jK.A0T(((AnonymousClass09I) this).A0F, uri), null, AAo(), false);
        AAo().A00.A1M(list);
        startActivity(A1W(list));
        finish();
    }

    public void ATD(String str, List list, Bundle bundle) {
        Boolean valueOf = Boolean.valueOf(bundle.getBoolean("load_preview"));
        if (valueOf != null) {
            C02710Da A002 = valueOf.booleanValue() ? AnonymousClass0PI.A00(1tY.A01(str)) : null;
            Boolean valueOf2 = Boolean.valueOf(bundle.getBoolean("has_text_from_url"));
            if (valueOf2 != null) {
                this.A02.A0m(list, str, A002, null, null, false, valueOf2.booleanValue());
                AAo().A00.A1M(list);
                startActivity(A1W(list));
                finish();
                return;
            }
            throw null;
        }
        throw null;
    }

    public void AUX(BaseSharedPreviewDialogFragment baseSharedPreviewDialogFragment) {
        this.A03 = baseSharedPreviewDialogFragment;
    }

    @Override // X.AnonymousClass09I
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (IllegalArgumentException e) {
            return false;
        }
    }

    @Override // X.AnonymousClass09N, X.AnonymousClass09I
    public void onBackPressed() {
        ContactPickerFragment contactPickerFragment = this.A05;
        if (contactPickerFragment == null || !contactPickerFragment.A1b()) {
            super.onBackPressed();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: com.whatsapp.ContactPicker */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v26, types: [com.whatsapp.DisplayExceptionDialogFactory$UnsupportedDeviceDialogFragment, androidx.fragment.app.DialogFragment] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // X.AbstractActivityC03530Hm, X.AbstractActivityC03090Fa, X.AbstractActivityC03100Fb, X.AnonymousClass09L, X.AnonymousClass09K, X.AnonymousClass09N, X.AnonymousClass09M, X.AnonymousClass09H, X.AnonymousClass09G, X.AnonymousClass09J, X.AnonymousClass09I, X.AnonymousClass09O
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r9) {
        /*
        // Method dump skipped, instructions count: 248
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ContactPicker.onCreate(android.os.Bundle):void");
    }

    @Override // X.AbstractActivityC03090Fa, X.AnonymousClass09G
    public Dialog onCreateDialog(int i) {
        Dialog A0y;
        ContactPickerFragment contactPickerFragment = this.A05;
        return (contactPickerFragment == null || (A0y = contactPickerFragment.A0y(i)) == null) ? super.onCreateDialog(i) : A0y;
    }

    @Override // X.AnonymousClass09I
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            BaseSharedPreviewDialogFragment baseSharedPreviewDialogFragment = this.A03;
            if (baseSharedPreviewDialogFragment != null) {
                baseSharedPreviewDialogFragment.A16(false, false);
                return true;
            }
            ContactPickerFragment contactPickerFragment = this.A05;
            if (contactPickerFragment != null && contactPickerFragment.A1b()) {
                return true;
            }
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public boolean onSearchRequested() {
        ContactPickerFragment contactPickerFragment = this.A05;
        if (contactPickerFragment == null) {
            return false;
        }
        contactPickerFragment.A17();
        return true;
    }

    public boolean onSearchRequested(SearchEvent searchEvent) {
        ContactPickerFragment contactPickerFragment = this.A05;
        if (contactPickerFragment == null) {
            return false;
        }
        contactPickerFragment.A17();
        return true;
    }
}
