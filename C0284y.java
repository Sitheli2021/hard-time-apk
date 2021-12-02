package com.adcolony.sdk;

import com.adcolony.sdk.C0269v;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.adcolony.sdk.y */
class C0284y {

    /* renamed from: a */
    private String f1340a;

    /* renamed from: b */
    private JSONObject f1341b;

    C0284y(String str, int i) {
        try {
            this.f1340a = str;
            JSONObject jSONObject = new JSONObject();
            this.f1341b = jSONObject;
            jSONObject.put("m_target", i);
        } catch (JSONException e) {
            new C0269v.C0270a().mo707a("JSON Error in ADCMessage constructor: ").mo707a(e.toString()).mo709a(C0269v.f1300j);
        }
    }

    C0284y(String str, int i, String str2) {
        try {
            this.f1340a = str;
            JSONObject b = C0267t.m806b(str2);
            this.f1341b = b;
            b.put("m_target", i);
        } catch (JSONException e) {
            new C0269v.C0270a().mo707a("JSON Error in ADCMessage constructor: ").mo707a(e.toString()).mo709a(C0269v.f1300j);
        }
    }

    C0284y(String str, int i, JSONObject jSONObject) {
        try {
            this.f1340a = str;
            jSONObject = jSONObject == null ? new JSONObject() : jSONObject;
            this.f1341b = jSONObject;
            jSONObject.put("m_target", i);
        } catch (JSONException e) {
            new C0269v.C0270a().mo707a("JSON Error in ADCMessage constructor: ").mo707a(e.toString()).mo709a(C0269v.f1300j);
        }
    }

    C0284y(JSONObject jSONObject) {
        try {
            this.f1341b = jSONObject;
            this.f1340a = jSONObject.getString("m_type");
        } catch (JSONException e) {
            new C0269v.C0270a().mo707a("JSON Error in ADCMessage constructor: ").mo707a(e.toString()).mo709a(C0269v.f1300j);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0284y mo733a() {
        return mo735a((JSONObject) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0284y mo734a(String str) {
        return mo735a(C0267t.m806b(str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0284y mo735a(JSONObject jSONObject) {
        try {
            C0284y yVar = new C0284y("reply", this.f1341b.getInt("m_origin"), jSONObject);
            yVar.f1341b.put("m_id", this.f1341b.getInt("m_id"));
            return yVar;
        } catch (JSONException e) {
            new C0269v.C0270a().mo707a("JSON error in ADCMessage's createReply(): ").mo707a(e.toString()).mo709a(C0269v.f1300j);
            return new C0284y("JSONException", 0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public JSONObject mo736b() {
        return this.f1341b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo737b(String str) {
        this.f1340a = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo738b(JSONObject jSONObject) {
        this.f1341b = jSONObject;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public String mo739c() {
        return this.f1340a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo740d() {
        C0026a.m77a(this.f1340a, this.f1341b);
    }
}
