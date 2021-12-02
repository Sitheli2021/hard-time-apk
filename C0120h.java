package com.adcolony.sdk;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;
import org.json.JSONObject;

/* renamed from: com.adcolony.sdk.h */
class C0120h extends ContentObserver {

    /* renamed from: a */
    private AudioManager f860a;

    /* renamed from: b */
    private AdColonyInterstitial f861b;

    C0120h(Handler handler, AdColonyInterstitial adColonyInterstitial) {
        super(handler);
        Context b = C0026a.m78b();
        if (b != null) {
            this.f860a = (AudioManager) b.getSystemService("audio");
            this.f861b = adColonyInterstitial;
            b.getApplicationContext().getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo407a() {
        Context b = C0026a.m78b();
        if (b != null) {
            b.getApplicationContext().getContentResolver().unregisterContentObserver(this);
        }
        this.f861b = null;
        this.f860a = null;
    }

    public boolean deliverSelfNotifications() {
        return false;
    }

    public void onChange(boolean z) {
        AdColonyInterstitial adColonyInterstitial;
        if (this.f860a != null && (adColonyInterstitial = this.f861b) != null && adColonyInterstitial.mo222d() != null) {
            double streamVolume = (double) ((((float) this.f860a.getStreamVolume(3)) / 15.0f) * 100.0f);
            JSONObject b = C0267t.m805b();
            C0267t.m796a(b, "audio_percentage", streamVolume);
            C0267t.m798a(b, "ad_session_id", this.f861b.mo222d().mo289a());
            C0267t.m808b(b, "id", this.f861b.mo222d().mo299c());
            new C0284y("AdContainer.on_audio_change", this.f861b.mo222d().mo317k(), b).mo740d();
        }
    }
}
