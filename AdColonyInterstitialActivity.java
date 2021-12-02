package com.adcolony.sdk;

import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import org.json.JSONArray;
import org.json.JSONObject;

public class AdColonyInterstitialActivity extends C0029b {

    /* renamed from: m */
    AdColonyInterstitial f84m;

    /* renamed from: n */
    private C0120h f85n;

    public AdColonyInterstitialActivity() {
        this.f84m = !C0026a.m82e() ? null : C0026a.m80c().mo438d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo235a(C0284y yVar) {
        AdColonyInterstitial adColonyInterstitial;
        super.mo235a(yVar);
        C0046d b = C0026a.m80c().mo432b();
        JSONObject g = C0267t.m818g(yVar.mo736b(), "v4iap");
        JSONArray c = C0267t.m810c(g, "product_ids");
        if (!(g == null || (adColonyInterstitial = this.f84m) == null || adColonyInterstitial.getListener() == null || c.length() <= 0)) {
            this.f84m.getListener().onIAPEvent(this.f84m, C0267t.m813d(c, 0), C0267t.m817f(g, "engagement_type"));
        }
        b.mo336a(this.f116a);
        if (this.f84m != null) {
            b.mo334a().remove(this.f84m.mo216b());
        }
        AdColonyInterstitial adColonyInterstitial2 = this.f84m;
        if (!(adColonyInterstitial2 == null || adColonyInterstitial2.getListener() == null)) {
            this.f84m.getListener().onClosed(this.f84m);
            this.f84m.mo211a((C0032c) null);
            this.f84m.setListener((AdColonyInterstitialListener) null);
            this.f84m = null;
        }
        C0120h hVar = this.f85n;
        if (hVar != null) {
            hVar.mo407a();
            this.f85n = null;
        }
    }

    public /* bridge */ /* synthetic */ void onBackPressed() {
        super.onBackPressed();
    }

    public /* bridge */ /* synthetic */ void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public void onCreate(Bundle bundle) {
        AdColonyInterstitial adColonyInterstitial;
        AdColonyInterstitial adColonyInterstitial2 = this.f84m;
        this.f118c = adColonyInterstitial2 == null ? -1 : adColonyInterstitial2.mo226g();
        super.onCreate(bundle);
        if (C0026a.m82e() && (adColonyInterstitial = this.f84m) != null) {
            C0076d0 f = adColonyInterstitial.mo225f();
            if (f != null) {
                f.mo366a(this.f116a);
            }
            this.f85n = new C0120h(new Handler(Looper.getMainLooper()), this.f84m);
            if (this.f84m.getListener() != null) {
                this.f84m.getListener().onOpened(this.f84m);
            }
        }
    }

    public /* bridge */ /* synthetic */ void onDestroy() {
        super.onDestroy();
    }

    public /* bridge */ /* synthetic */ void onPause() {
        super.onPause();
    }

    public /* bridge */ /* synthetic */ void onResume() {
        super.onResume();
    }

    public /* bridge */ /* synthetic */ void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }
}
