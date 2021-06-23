package com.whatsapp;

import X.AbstractC05460Qw;
import X.AnonymousClass00G;
import X.AnonymousClass08x;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import com.whatsapp.components.Button;

public class EmptyTellAFriendView extends AbstractC05460Qw {
    public WaTextView A00;
    public Button A01;
    public AnonymousClass00G A02;

    public EmptyTellAFriendView(Context context) {
        super(context);
        A00();
    }

    public EmptyTellAFriendView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    public final void A00() {
        ScrollView.inflate(getContext(), 2131558780, this);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.A01 = AnonymousClass08x.A0D(this, 2131363363);
        this.A00 = (WaTextView) AnonymousClass08x.A0D(this, 2131364892);
        boolean equals = "91".equals(this.A02.A0I());
        WaTextView waTextView = this.A00;
        int i = 2131890919;
        if (equals) {
            i = 2131890920;
        }
        waTextView.setText(i);
    }

    public void setInviteButtonClickListener(View.OnClickListener onClickListener) {
        this.A01.setOnClickListener(onClickListener);
    }
}
