package com.adcolony.sdk;

import com.adcolony.sdk.C0271w;
import com.adobe.air.wand.message.MessageManager;
import java.util.Date;
import org.json.JSONObject;

/* renamed from: com.adcolony.sdk.p */
class C0238p extends C0271w {

    /* renamed from: i */
    static final C0266s f1227i = new C0266s("adcolony_fatal_reports", "4.4.1", "Production");

    /* renamed from: j */
    static final String f1228j = "sourceFile";

    /* renamed from: k */
    static final String f1229k = "lineNumber";

    /* renamed from: l */
    static final String f1230l = "methodName";

    /* renamed from: m */
    static final String f1231m = "stackTrace";

    /* renamed from: n */
    static final String f1232n = "isAdActive";

    /* renamed from: o */
    static final String f1233o = "activeAdId";

    /* renamed from: p */
    static final String f1234p = "active_creative_ad_id";

    /* renamed from: q */
    static final String f1235q = "listOfCachedAds";

    /* renamed from: r */
    static final String f1236r = "listOfCreativeAdIds";

    /* renamed from: s */
    static final String f1237s = "adCacheSize";
    /* access modifiers changed from: private */

    /* renamed from: h */
    public JSONObject f1238h;

    /* renamed from: com.adcolony.sdk.p$a */
    private class C0239a extends C0271w.C0272a {
        C0239a() {
            this.f1311a = new C0238p();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C0239a mo681a(JSONObject jSONObject) {
            JSONObject unused = ((C0238p) this.f1311a).f1238h = jSONObject;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C0271w.C0272a mo682a(Date date) {
            C0267t.m798a(((C0238p) this.f1311a).f1238h, "timestamp", C0271w.f1304e.format(date));
            return super.mo682a(date);
        }
    }

    C0238p() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0238p mo679a(JSONObject jSONObject) {
        C0239a aVar = new C0239a();
        aVar.mo681a(jSONObject);
        aVar.mo720a(C0267t.m819h(jSONObject, MessageManager.NAME_ERROR_MESSAGE));
        try {
            aVar.mo682a(new Date(Long.parseLong(C0267t.m819h(jSONObject, "timestamp"))));
        } catch (NumberFormatException unused) {
        }
        aVar.mo719a(f1227i);
        aVar.mo718a(-1);
        return (C0238p) aVar.mo721a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public JSONObject mo680f() {
        return this.f1238h;
    }
}
