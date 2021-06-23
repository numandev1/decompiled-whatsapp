package com.whatsapp;

import X.AnonymousClass01G;
import X.AnonymousClass1WS;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class IntentChooserBottomSheetDialogFragment extends Hilt_IntentChooserBottomSheetDialogFragment {
    public int A00;
    public int A01;
    public AnonymousClass01G A02;
    public Integer A03;
    public ArrayList A04;

    @Override // X.ComponentCallbacksC019009d
    public View A0p(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(2131558945, viewGroup, false);
        Bundle A022 = A02();
        this.A00 = A022.getInt("request_code");
        ArrayList parcelableArrayList = A022.getParcelableArrayList("choosable_intents");
        if (parcelableArrayList != null) {
            this.A04 = parcelableArrayList;
            this.A01 = A022.getInt("title_resource");
            if (A022.containsKey("parent_fragment")) {
                this.A03 = Integer.valueOf(A022.getInt("parent_fragment"));
            }
            RecyclerView recyclerView = (RecyclerView) inflate.findViewById(2131363355);
            A00();
            recyclerView.setLayoutManager(new GridLayoutManager(4));
            recyclerView.setAdapter(new AnonymousClass1WS(this, this.A04));
            ((TextView) inflate.findViewById(2131364988)).setText(this.A01);
            return inflate;
        }
        throw null;
    }
}
