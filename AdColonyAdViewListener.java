package com.adcolony.sdk;

public abstract class AdColonyAdViewListener {

    /* renamed from: a */
    String f58a = "";

    /* renamed from: b */
    AdColonyAdSize f59b;

    /* renamed from: c */
    C0076d0 f60c;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public AdColonyAdSize mo149a() {
        return this.f59b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo150a(AdColonyAdSize adColonyAdSize) {
        this.f59b = adColonyAdSize;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo151a(C0076d0 d0Var) {
        this.f60c = d0Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo152a(String str) {
        this.f58a = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C0076d0 mo153b() {
        return this.f60c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public String mo154c() {
        return this.f58a;
    }

    public void onClicked(AdColonyAdView adColonyAdView) {
    }

    public void onClosed(AdColonyAdView adColonyAdView) {
    }

    public void onLeftApplication(AdColonyAdView adColonyAdView) {
    }

    public void onOpened(AdColonyAdView adColonyAdView) {
    }

    public abstract void onRequestFilled(AdColonyAdView adColonyAdView);

    public void onRequestNotFilled(AdColonyZone adColonyZone) {
    }
}
