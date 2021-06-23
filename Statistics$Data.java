package com.whatsapp;

import X.AnonymousClass00C;
import java.io.Serializable;
import org.json.JSONObject;

public class Statistics$Data implements Serializable {
    public static final long serialVersionUID = 1;
    public final long last_reset;
    public long rx_google_drive_bytes = 0;
    public long rx_media_bytes = 0;
    public long rx_media_msgs = 0;
    public long rx_message_service_bytes = 0;
    public long rx_offline_delay = 0;
    public long rx_offline_msgs = 0;
    public long rx_payment_msgs = 0;
    public long rx_roaming_bytes = 0;
    public long rx_status_bytes = 0;
    public long rx_statuses = 0;
    public long rx_text_msgs = 0;
    public long rx_voip_bytes = 0;
    public long rx_voip_calls = 0;
    public long tx_google_drive_bytes = 0;
    public long tx_media_bytes = 0;
    public long tx_media_msgs = 0;
    public long tx_message_service_bytes = 0;
    public long tx_payment_msgs = 0;
    public long tx_roaming_bytes = 0;
    public long tx_status_bytes = 0;
    public long tx_statuses = 0;
    public long tx_text_msgs = 0;
    public long tx_voip_bytes = 0;
    public long tx_voip_calls = 0;

    public Statistics$Data(JSONObject jSONObject) {
        this.rx_text_msgs = jSONObject.getLong("rx_text_msgs");
        this.tx_text_msgs = jSONObject.getLong("tx_text_msgs");
        this.rx_media_msgs = jSONObject.getLong("rx_media_msgs");
        this.tx_media_msgs = jSONObject.getLong("tx_media_msgs");
        this.rx_payment_msgs = jSONObject.getLong("rx_payment_msgs");
        this.tx_payment_msgs = jSONObject.getLong("tx_payment_msgs");
        this.rx_statuses = jSONObject.getLong("rx_statuses");
        this.tx_statuses = jSONObject.getLong("tx_statuses");
        this.rx_offline_msgs = jSONObject.getLong("rx_offline_msgs");
        this.rx_offline_delay = jSONObject.getLong("rx_offline_delay");
        this.rx_media_bytes = jSONObject.getLong("rx_media_bytes");
        this.tx_media_bytes = jSONObject.getLong("tx_media_bytes");
        this.rx_message_service_bytes = jSONObject.getLong("rx_message_service_bytes");
        this.tx_message_service_bytes = jSONObject.getLong("tx_message_service_bytes");
        this.rx_status_bytes = jSONObject.getLong("rx_status_bytes");
        this.tx_status_bytes = jSONObject.getLong("tx_status_bytes");
        this.last_reset = jSONObject.getLong("last_reset");
        this.rx_voip_calls = jSONObject.getLong("rx_voip_calls");
        this.tx_voip_calls = jSONObject.getLong("tx_voip_calls");
        this.rx_voip_bytes = jSONObject.getLong("rx_voip_bytes");
        this.tx_voip_bytes = jSONObject.getLong("tx_voip_bytes");
        this.rx_google_drive_bytes = jSONObject.getLong("rx_google_drive_bytes");
        this.tx_google_drive_bytes = jSONObject.getLong("tx_google_drive_bytes");
        this.rx_roaming_bytes = jSONObject.getLong("rx_roaming_bytes");
        this.tx_roaming_bytes = jSONObject.getLong("tx_roaming_bytes");
    }

    public Statistics$Data(boolean z) {
        if (z) {
            this.last_reset = System.currentTimeMillis();
        } else {
            this.last_reset = Long.MIN_VALUE;
        }
    }

    public String A00() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("rx_text_msgs", this.rx_text_msgs);
        jSONObject.put("tx_text_msgs", this.tx_text_msgs);
        jSONObject.put("rx_media_msgs", this.rx_media_msgs);
        jSONObject.put("tx_media_msgs", this.tx_media_msgs);
        jSONObject.put("rx_payment_msgs", this.rx_payment_msgs);
        jSONObject.put("tx_payment_msgs", this.tx_payment_msgs);
        jSONObject.put("rx_statuses", this.rx_statuses);
        jSONObject.put("tx_statuses", this.tx_statuses);
        jSONObject.put("rx_offline_msgs", this.rx_offline_msgs);
        jSONObject.put("rx_offline_delay", this.rx_offline_delay);
        jSONObject.put("rx_media_bytes", this.rx_media_bytes);
        jSONObject.put("tx_media_bytes", this.tx_media_bytes);
        jSONObject.put("rx_message_service_bytes", this.rx_message_service_bytes);
        jSONObject.put("tx_message_service_bytes", this.tx_message_service_bytes);
        jSONObject.put("rx_status_bytes", this.rx_status_bytes);
        jSONObject.put("tx_status_bytes", this.tx_status_bytes);
        jSONObject.put("last_reset", this.last_reset);
        jSONObject.put("rx_voip_calls", this.rx_voip_calls);
        jSONObject.put("tx_voip_calls", this.tx_voip_calls);
        jSONObject.put("rx_voip_bytes", this.rx_voip_bytes);
        jSONObject.put("tx_voip_bytes", this.tx_voip_bytes);
        jSONObject.put("rx_google_drive_bytes", this.rx_google_drive_bytes);
        jSONObject.put("tx_google_drive_bytes", this.tx_google_drive_bytes);
        jSONObject.put("rx_roaming_bytes", this.rx_roaming_bytes);
        jSONObject.put("tx_roaming_bytes", this.tx_roaming_bytes);
        return jSONObject.toString();
    }

    public String toString() {
        StringBuilder A0R = AnonymousClass00C.A0R("Text Messages: ");
        A0R.append(this.tx_text_msgs);
        A0R.append(" sent, ");
        A0R.append(this.rx_text_msgs);
        A0R.append(" received");
        A0R.append(" / Media Messages: ");
        A0R.append(this.tx_media_msgs);
        A0R.append(" sent (");
        long j = this.tx_media_bytes;
        A0R.append(j);
        A0R.append(" bytes), ");
        A0R.append(this.rx_media_msgs);
        A0R.append(" received (");
        long j2 = this.rx_media_bytes;
        A0R.append(j2);
        A0R.append(" bytes)");
        A0R.append(" / Offline Messages: ");
        A0R.append(this.rx_offline_msgs);
        A0R.append(" received (");
        A0R.append(this.rx_offline_delay);
        A0R.append(" msec average delay)");
        A0R.append(" / Status : ");
        A0R.append(this.tx_statuses);
        A0R.append(" sent (");
        long j3 = this.tx_status_bytes;
        A0R.append(j3);
        A0R.append(" bytes), ");
        A0R.append(this.rx_statuses);
        A0R.append(" received (");
        long j4 = this.rx_status_bytes;
        A0R.append(j4);
        A0R.append(" bytes)");
        A0R.append(" / Payment Messages : ");
        A0R.append(this.tx_payment_msgs);
        A0R.append(" sent, ");
        A0R.append(this.rx_payment_msgs);
        A0R.append(" received");
        A0R.append(" / Message Service: ");
        long j5 = this.tx_message_service_bytes;
        A0R.append(j5);
        A0R.append(" bytes sent, ");
        long j6 = this.rx_message_service_bytes;
        A0R.append(j6);
        A0R.append(" bytes received");
        A0R.append(" / Voip Calls: ");
        A0R.append(this.tx_voip_calls);
        A0R.append(" outgoing calls, ");
        A0R.append(this.rx_voip_calls);
        A0R.append(" incoming calls, ");
        long j7 = this.tx_voip_bytes;
        A0R.append(j7);
        A0R.append(" bytes sent, ");
        long j8 = this.rx_voip_bytes;
        A0R.append(j8);
        A0R.append(" bytes received");
        A0R.append(" / Google Drive: ");
        long j9 = this.tx_google_drive_bytes;
        A0R.append(j9);
        A0R.append(" bytes sent, ");
        long j10 = this.rx_google_drive_bytes;
        A0R.append(j10);
        A0R.append(" bytes received");
        A0R.append(" / Roaming: ");
        A0R.append(this.tx_roaming_bytes);
        A0R.append(" bytes sent, ");
        A0R.append(this.rx_roaming_bytes);
        A0R.append(" bytes received");
        A0R.append(" / Total Data: ");
        A0R.append(j + j5 + j7 + j9 + j3);
        A0R.append(" bytes sent, ");
        A0R.append(j2 + j6 + j8 + j10 + j4);
        A0R.append(" bytes received");
        return A0R.toString();
    }
}
