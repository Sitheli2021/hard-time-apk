package com.adcolony.sdk;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;

public class AdColonyAdViewActivity extends C0029b {

    /* renamed from: m */
    AdColonyAdView f57m;

    public AdColonyAdViewActivity() {
        this.f57m = !C0026a.m82e() ? null : C0026a.m80c().mo441e();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo140b() {
        ViewParent parent = this.f116a.getParent();
        if (parent != null) {
            ((ViewGroup) parent).removeView(this.f116a);
        }
        this.f57m.mo114a();
        C0026a.m80c().mo423a((AdColonyAdView) null);
        finish();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo141c() {
        this.f57m.mo115b();
    }

    public void onBackPressed() {
        mo140b();
    }

    public /* bridge */ /* synthetic */ void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public void onCreate(Bundle bundle) {
        AdColonyAdView adColonyAdView;
        if (!C0026a.m82e() || (adColonyAdView = this.f57m) == null) {
            C0026a.m80c().mo423a((AdColonyAdView) null);
            finish();
            return;
        }
        this.f118c = adColonyAdView.getOrientation();
        super.onCreate(bundle);
        this.f57m.mo115b();
        AdColonyAdViewListener listener = this.f57m.getListener();
        if (listener != null) {
            listener.onOpened(this.f57m);
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
