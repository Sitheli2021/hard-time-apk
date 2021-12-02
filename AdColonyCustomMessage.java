package com.adcolony.sdk;

import androidx.annotation.NonNull;
import com.adobe.air.wand.message.MessageManager;
import java.util.concurrent.RejectedExecutionException;
import org.json.JSONObject;

public class AdColonyCustomMessage {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public String f66a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public String f67b;

    /* renamed from: com.adcolony.sdk.AdColonyCustomMessage$a */
    class C0025a implements Runnable {
        C0025a() {
        }

        public void run() {
            AdColony.m7b();
            JSONObject b = C0267t.m805b();
            C0267t.m798a(b, "type", AdColonyCustomMessage.this.f66a);
            C0267t.m798a(b, MessageManager.NAME_ERROR_MESSAGE, AdColonyCustomMessage.this.f67b);
            new C0284y("CustomMessage.native_send", 1, b).mo740d();
        }
    }

    public AdColonyCustomMessage(@NonNull String str, @NonNull String str2) {
        if (C0190l0.m530e(str) || C0190l0.m530e(str2)) {
            this.f66a = str;
            this.f67b = str2;
        }
    }

    public String getMessage() {
        return this.f67b;
    }

    public String getType() {
        return this.f66a;
    }

    public void send() {
        try {
            AdColony.f0a.execute(new C0025a());
        } catch (RejectedExecutionException unused) {
        }
    }

    public AdColonyCustomMessage set(String str, String str2) {
        this.f66a = str;
        this.f67b = str2;
        return this;
    }
}
