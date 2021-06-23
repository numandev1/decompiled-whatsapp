package com.whatsapp;

import com.google.android.search.verification.client.SearchActionVerificationClientActivity;

public class VoiceMessagingActivity extends SearchActionVerificationClientActivity {
    @Override // com.google.android.search.verification.client.SearchActionVerificationClientActivity
    public Class getServiceClass() {
        return VoiceMessagingService.class;
    }
}
