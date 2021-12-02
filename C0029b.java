package com.adcolony.sdk;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.adcolony.sdk.b */
class C0029b extends Activity {

    /* renamed from: k */
    static final int f114k = 0;

    /* renamed from: l */
    static final int f115l = 1;

    /* renamed from: a */
    C0032c f116a;

    /* renamed from: b */
    String f117b;

    /* renamed from: c */
    int f118c = -1;

    /* renamed from: d */
    int f119d;

    /* renamed from: e */
    boolean f120e;

    /* renamed from: f */
    boolean f121f;

    /* renamed from: g */
    boolean f122g;

    /* renamed from: h */
    boolean f123h;

    /* renamed from: i */
    boolean f124i;

    /* renamed from: j */
    boolean f125j;

    /* renamed from: com.adcolony.sdk.b$a */
    class C0030a implements C0028a0 {
        C0030a() {
        }

        /* renamed from: a */
        public void mo278a(C0284y yVar) {
            C0029b.this.mo235a(yVar);
        }
    }

    C0029b() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo279a() {
        C0122i c = C0026a.m80c();
        if (this.f116a == null) {
            this.f116a = c.mo443f();
        }
        C0032c cVar = this.f116a;
        if (cVar != null) {
            cVar.mo301c(false);
            if (C0190l0.m532f()) {
                this.f116a.mo301c(true);
            }
            int r = c.mo445h().mo537r();
            int q = this.f123h ? c.mo445h().mo536q() - C0190l0.m528e(C0026a.m78b()) : c.mo445h().mo536q();
            if (r > 0 && q > 0) {
                JSONObject b = C0267t.m805b();
                JSONObject b2 = C0267t.m805b();
                float n = c.mo445h().mo533n();
                C0267t.m808b(b2, "width", (int) (((float) r) / n));
                C0267t.m808b(b2, "height", (int) (((float) q) / n));
                C0267t.m808b(b2, "app_orientation", C0190l0.m526d(C0190l0.m529e()));
                C0267t.m808b(b2, "x", 0);
                C0267t.m808b(b2, "y", 0);
                C0267t.m798a(b2, "ad_session_id", this.f116a.mo289a());
                C0267t.m808b(b, "screen_width", r);
                C0267t.m808b(b, "screen_height", q);
                C0267t.m798a(b, "ad_session_id", this.f116a.mo289a());
                C0267t.m808b(b, "id", this.f116a.mo299c());
                this.f116a.setLayoutParams(new FrameLayout.LayoutParams(r, q));
                this.f116a.mo297b(r);
                this.f116a.mo290a(q);
                new C0284y("MRAID.on_size_change", this.f116a.mo317k(), b2).mo740d();
                new C0284y("AdContainer.on_orientation_change", this.f116a.mo317k(), b).mo740d();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo280a(int i) {
        if (i == 0) {
            setRequestedOrientation(7);
        } else if (i != 1) {
            setRequestedOrientation(4);
        } else {
            setRequestedOrientation(6);
        }
        this.f118c = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo235a(C0284y yVar) {
        int f = C0267t.m817f(yVar.mo736b(), "status");
        if ((f == 5 || f == 0 || f == 6 || f == 1) && !this.f120e) {
            C0122i c = C0026a.m80c();
            C0184l i = c.mo446i();
            c.mo439d(yVar);
            if (i.mo567a() != null) {
                i.mo567a().dismiss();
                i.mo568a((AlertDialog) null);
            }
            if (!this.f122g) {
                finish();
            }
            this.f120e = true;
            ((ViewGroup) getWindow().getDecorView()).removeAllViews();
            c.mo442e(false);
            JSONObject b = C0267t.m805b();
            C0267t.m798a(b, "id", this.f116a.mo289a());
            new C0284y("AdSession.on_close", this.f116a.mo317k(), b).mo740d();
            c.mo428a((C0032c) null);
            c.mo426a((AdColonyInterstitial) null);
            c.mo423a((AdColonyAdView) null);
            C0026a.m80c().mo432b().mo334a().remove(this.f116a.mo289a());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo281a(boolean z) {
        Iterator<Map.Entry<Integer, C0195m0>> it = this.f116a.mo319m().entrySet().iterator();
        while (it.hasNext() && !isFinishing()) {
            C0195m0 m0Var = (C0195m0) it.next().getValue();
            if (!m0Var.mo588f() && m0Var.mo584b().isPlaying()) {
                m0Var.mo589h();
            }
        }
        AdColonyInterstitial d = C0026a.m80c().mo438d();
        if (d != null && d.mo229h() && d.mo225f().mo370c() != null && z && this.f124i) {
            d.mo225f().mo367a("pause");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo282b(boolean z) {
        for (Map.Entry<Integer, C0195m0> value : this.f116a.mo319m().entrySet()) {
            C0195m0 m0Var = (C0195m0) value.getValue();
            if (!m0Var.mo588f() && !m0Var.mo584b().isPlaying() && !C0026a.m80c().mo446i().mo569b()) {
                m0Var.mo590i();
            }
        }
        AdColonyInterstitial d = C0026a.m80c().mo438d();
        if (d != null && d.mo229h() && d.mo225f().mo370c() != null) {
            if ((!z || !this.f124i) && this.f125j) {
                d.mo225f().mo367a("resume");
            }
        }
    }

    public void onBackPressed() {
        JSONObject b = C0267t.m805b();
        C0267t.m798a(b, "id", this.f116a.mo289a());
        new C0284y("AdSession.on_back_button", this.f116a.mo317k(), b).mo740d();
    }

    public void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this instanceof AdColonyInterstitialActivity) {
            mo279a();
        } else {
            ((AdColonyAdViewActivity) this).mo141c();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!C0026a.m82e() || C0026a.m80c().mo443f() == null) {
            finish();
            return;
        }
        C0122i c = C0026a.m80c();
        this.f122g = false;
        C0032c f = c.mo443f();
        this.f116a = f;
        f.mo301c(false);
        if (C0190l0.m532f()) {
            this.f116a.mo301c(true);
        }
        this.f117b = this.f116a.mo289a();
        this.f119d = this.f116a.mo317k();
        boolean multiWindowEnabled = c.mo455r().getMultiWindowEnabled();
        this.f123h = multiWindowEnabled;
        if (multiWindowEnabled) {
            getWindow().addFlags(2048);
            getWindow().clearFlags(1024);
        } else {
            getWindow().addFlags(1024);
            getWindow().clearFlags(2048);
        }
        requestWindowFeature(1);
        getWindow().getDecorView().setBackgroundColor(-16777216);
        if (c.mo455r().getKeepScreenOn()) {
            getWindow().addFlags(128);
        }
        ViewParent parent = this.f116a.getParent();
        if (parent != null) {
            ((ViewGroup) parent).removeView(this.f116a);
        }
        setContentView(this.f116a);
        this.f116a.mo313i().add(C0026a.m72a("AdSession.finish_fullscreen_ad", (C0028a0) new C0030a(), true));
        this.f116a.mo315j().add("AdSession.finish_fullscreen_ad");
        mo280a(this.f118c);
        if (!this.f116a.mo321o()) {
            JSONObject b = C0267t.m805b();
            C0267t.m798a(b, "id", this.f116a.mo289a());
            C0267t.m808b(b, "screen_width", this.f116a.mo302d());
            C0267t.m808b(b, "screen_height", this.f116a.mo295b());
            new C0284y("AdSession.on_fullscreen_ad_started", this.f116a.mo317k(), b).mo740d();
            this.f116a.mo304d(true);
            return;
        }
        mo279a();
    }

    public void onDestroy() {
        super.onDestroy();
        if (C0026a.m82e() && this.f116a != null && !this.f120e) {
            if ((Build.VERSION.SDK_INT < 24 || !C0190l0.m532f()) && !this.f116a.mo325q()) {
                JSONObject b = C0267t.m805b();
                C0267t.m798a(b, "id", this.f116a.mo289a());
                new C0284y("AdSession.on_error", this.f116a.mo317k(), b).mo740d();
                this.f122g = true;
            }
        }
    }

    public void onPause() {
        super.onPause();
        mo281a(this.f121f);
        this.f121f = false;
    }

    public void onResume() {
        super.onResume();
        mo279a();
        mo282b(this.f121f);
        this.f121f = true;
        this.f125j = true;
    }

    public void onWindowFocusChanged(boolean z) {
        if (z && this.f121f) {
            C0026a.m80c().mo458u().mo397b(true);
            mo282b(this.f121f);
            this.f124i = true;
        } else if (!z && this.f121f) {
            C0026a.m80c().mo458u().mo395a(true);
            mo281a(this.f121f);
            this.f124i = false;
        }
    }
}
