package com.adcolony.sdk;

import com.adobe.air.wand.message.MessageManager;
import org.json.JSONObject;

/* renamed from: com.adcolony.sdk.j */
class C0146j implements C0028a0 {

    /* renamed from: com.adcolony.sdk.j$a */
    class C0147a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f948a;

        /* renamed from: b */
        final /* synthetic */ String f949b;

        C0147a(String str, String str2) {
            this.f948a = str;
            this.f949b = str2;
        }

        public void run() {
            try {
                AdColonyCustomMessageListener adColonyCustomMessageListener = C0026a.m80c().mo444g().get(this.f948a);
                if (adColonyCustomMessageListener != null) {
                    adColonyCustomMessageListener.onAdColonyCustomMessage(new AdColonyCustomMessage(this.f948a, this.f949b));
                }
            } catch (RuntimeException unused) {
            }
        }
    }

    C0146j() {
        C0026a.m76a("CustomMessage.controller_send", (C0028a0) this);
    }

    /* renamed from: a */
    public void mo278a(C0284y yVar) {
        JSONObject b = yVar.mo736b();
        C0190l0.m510a((Runnable) new C0147a(C0267t.m819h(b, "type"), C0267t.m819h(b, MessageManager.NAME_ERROR_MESSAGE)));
    }
}
