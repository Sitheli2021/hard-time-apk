package com.adcolony.sdk;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import com.adcolony.sdk.C0269v;
import org.json.JSONObject;

public class AdColonyInterstitial {
    public static final int ADCOLONY_IAP_ENGAGEMENT_END_CARD = 0;
    public static final int ADCOLONY_IAP_ENGAGEMENT_OVERLAY = 1;

    /* renamed from: a */
    private AdColonyInterstitialListener f71a;

    /* renamed from: b */
    private C0032c f72b;

    /* renamed from: c */
    private AdColonyAdOptions f73c;

    /* renamed from: d */
    private C0076d0 f74d;

    /* renamed from: e */
    private int f75e;

    /* renamed from: f */
    private String f76f;

    /* renamed from: g */
    private String f77g;

    /* renamed from: h */
    private String f78h;

    /* renamed from: i */
    private String f79i;

    /* renamed from: j */
    private String f80j;

    /* renamed from: k */
    private boolean f81k;

    /* renamed from: l */
    private boolean f82l;

    /* renamed from: m */
    private boolean f83m;

    AdColonyInterstitial(String str, AdColonyInterstitialListener adColonyInterstitialListener, String str2) {
        this.f71a = adColonyInterstitialListener;
        this.f79i = str2;
        this.f76f = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo208a() {
        String str = this.f77g;
        return str == null ? "" : str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo209a(int i) {
        this.f75e = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo210a(AdColonyAdOptions adColonyAdOptions) {
        this.f73c = adColonyAdOptions;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo211a(C0032c cVar) {
        this.f72b = cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo212a(String str) {
        this.f77g = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo213a(JSONObject jSONObject) {
        if (jSONObject.length() > 0) {
            this.f74d = new C0076d0(jSONObject, this.f76f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo214a(boolean z) {
        this.f81k = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo215a(AdColonyZone adColonyZone) {
        if (adColonyZone != null) {
            if (adColonyZone.getPlayFrequency() <= 1) {
                return false;
            }
            if (adColonyZone.mo263a() == 0) {
                adColonyZone.mo265b(adColonyZone.getPlayFrequency() - 1);
                return false;
            }
            adColonyZone.mo265b(adColonyZone.mo263a() - 1);
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public String mo216b() {
        return this.f76f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo217b(String str) {
        this.f80j = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo218b(boolean z) {
        this.f83m = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public String mo219c() {
        return this.f80j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo220c(String str) {
        this.f78h = str;
    }

    public boolean cancel() {
        if (this.f72b == null) {
            return false;
        }
        Context b = C0026a.m78b();
        if (b != null && !(b instanceof AdColonyInterstitialActivity)) {
            return false;
        }
        JSONObject b2 = C0267t.m805b();
        C0267t.m798a(b2, "id", this.f72b.mo289a());
        new C0284y("AdSession.on_request_close", this.f72b.mo317k(), b2).mo740d();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C0032c mo222d() {
        return this.f72b;
    }

    public boolean destroy() {
        C0026a.m80c().mo432b().mo334a().remove(this.f76f);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public String mo224e() {
        String str = this.f78h;
        return str == null ? "" : str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C0076d0 mo225f() {
        return this.f74d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public int mo226g() {
        return this.f75e;
    }

    public AdColonyInterstitialListener getListener() {
        return this.f71a;
    }

    public String getZoneID() {
        return this.f79i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo229h() {
        return this.f74d != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo230i() {
        return this.f83m;
    }

    public boolean isExpired() {
        return this.f81k || this.f82l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean mo232j() {
        Context b = C0026a.m78b();
        if (b == null || !C0026a.m82e()) {
            return false;
        }
        C0026a.m80c().mo442e(true);
        C0026a.m80c().mo428a(this.f72b);
        C0026a.m80c().mo426a(this);
        C0190l0.m508a(new Intent(b, AdColonyInterstitialActivity.class));
        this.f82l = true;
        return true;
    }

    public void setListener(@NonNull AdColonyInterstitialListener adColonyInterstitialListener) {
        this.f71a = adColonyInterstitialListener;
    }

    public boolean show() {
        if (!C0026a.m82e()) {
            return false;
        }
        C0122i c = C0026a.m80c();
        if (this.f82l) {
            new C0269v.C0270a().mo707a("This ad object has already been shown. Please request a new ad ").mo707a("via AdColony.requestInterstitial.").mo709a(C0269v.f1297g);
            return false;
        } else if (this.f81k) {
            new C0269v.C0270a().mo707a("This ad object has expired. Please request a new ad via AdColony").mo707a(".requestInterstitial.").mo709a(C0269v.f1297g);
            return false;
        } else if (c.mo421D()) {
            new C0269v.C0270a().mo707a("Can not show ad while an interstitial is already active.").mo709a(C0269v.f1297g);
            return false;
        } else if (mo215a(c.mo462y().get(this.f79i))) {
            return false;
        } else {
            JSONObject b = C0267t.m805b();
            C0267t.m798a(b, "zone_id", this.f79i);
            C0267t.m808b(b, "type", 0);
            C0267t.m798a(b, "id", this.f76f);
            AdColonyAdOptions adColonyAdOptions = this.f73c;
            if (adColonyAdOptions != null) {
                C0267t.m809b(b, "pre_popup", adColonyAdOptions.f28a);
                C0267t.m809b(b, "post_popup", this.f73c.f29b);
            }
            AdColonyZone adColonyZone = c.mo462y().get(this.f79i);
            if (adColonyZone != null && adColonyZone.isRewarded() && c.mo457t() == null) {
                new C0269v.C0270a().mo707a("Rewarded ad: show() called with no reward listener set.").mo709a(C0269v.f1297g);
            }
            new C0284y("AdSession.launch_ad_unit", 1, b).mo740d();
            return true;
        }
    }
}
