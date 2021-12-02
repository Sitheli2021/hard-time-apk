package com.adcolony.sdk;

import android.app.AlertDialog;
import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import com.adcolony.sdk.C0269v;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.adcolony.sdk.d */
class C0046d {

    /* renamed from: a */
    private HashMap<String, C0032c> f169a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public ConcurrentHashMap<String, AdColonyInterstitial> f170b;

    /* renamed from: c */
    private HashMap<String, AdColonyAdViewListener> f171c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public HashMap<String, AdColonyAdView> f172d;

    /* renamed from: com.adcolony.sdk.d$a */
    class C0047a implements C0028a0 {
        C0047a() {
        }

        /* renamed from: a */
        public void mo278a(C0284y yVar) {
            C0046d.this.mo341a(yVar);
        }
    }

    /* renamed from: com.adcolony.sdk.d$b */
    class C0048b implements C0028a0 {
        C0048b() {
        }

        /* renamed from: a */
        public void mo278a(C0284y yVar) {
            C0046d.this.mo348e(yVar);
        }
    }

    /* renamed from: com.adcolony.sdk.d$c */
    class C0049c implements C0028a0 {

        /* renamed from: com.adcolony.sdk.d$c$a */
        class C0050a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C0284y f176a;

            C0050a(C0284y yVar) {
                this.f176a = yVar;
            }

            public void run() {
                AdColonyInterstitial adColonyInterstitial = (AdColonyInterstitial) C0046d.this.f170b.get(C0267t.m819h(this.f176a.mo736b(), "id"));
                if (adColonyInterstitial != null && adColonyInterstitial.getListener() != null) {
                    adColonyInterstitial.getListener().onAudioStopped(adColonyInterstitial);
                }
            }
        }

        C0049c() {
        }

        /* renamed from: a */
        public void mo278a(C0284y yVar) {
            C0190l0.m510a((Runnable) new C0050a(yVar));
        }
    }

    /* renamed from: com.adcolony.sdk.d$d */
    class C0051d implements C0028a0 {

        /* renamed from: com.adcolony.sdk.d$d$a */
        class C0052a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C0284y f179a;

            C0052a(C0284y yVar) {
                this.f179a = yVar;
            }

            public void run() {
                AdColonyInterstitial adColonyInterstitial = (AdColonyInterstitial) C0046d.this.f170b.get(C0267t.m819h(this.f179a.mo736b(), "id"));
                if (adColonyInterstitial != null && adColonyInterstitial.getListener() != null) {
                    adColonyInterstitial.getListener().onAudioStarted(adColonyInterstitial);
                }
            }
        }

        C0051d() {
        }

        /* renamed from: a */
        public void mo278a(C0284y yVar) {
            C0190l0.m510a((Runnable) new C0052a(yVar));
        }
    }

    /* renamed from: com.adcolony.sdk.d$e */
    class C0053e implements C0028a0 {
        C0053e() {
        }

        /* renamed from: a */
        public void mo278a(C0284y yVar) {
            C0046d.this.mo350i(yVar);
        }
    }

    /* renamed from: com.adcolony.sdk.d$f */
    class C0054f implements C0028a0 {
        C0054f() {
        }

        /* renamed from: a */
        public void mo278a(C0284y yVar) {
            C0046d.this.mo349h(yVar);
        }
    }

    /* renamed from: com.adcolony.sdk.d$g */
    class C0055g implements C0028a0 {
        C0055g() {
        }

        /* renamed from: a */
        public void mo278a(C0284y yVar) {
            boolean unused = C0046d.this.m169g(yVar);
        }
    }

    /* renamed from: com.adcolony.sdk.d$h */
    class C0056h implements C0028a0 {
        C0056h() {
        }

        /* renamed from: a */
        public void mo278a(C0284y yVar) {
            JSONObject b = C0267t.m805b();
            C0267t.m809b(b, "success", true);
            yVar.mo735a(b).mo740d();
        }
    }

    /* renamed from: com.adcolony.sdk.d$i */
    class C0057i implements C0028a0 {

        /* renamed from: com.adcolony.sdk.d$i$a */
        class C0058a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C0284y f186a;

            C0058a(C0284y yVar) {
                this.f186a = yVar;
            }

            public void run() {
                C0284y yVar = this.f186a;
                yVar.mo735a(yVar.mo736b()).mo740d();
            }
        }

        C0057i() {
        }

        /* renamed from: a */
        public void mo278a(C0284y yVar) {
            C0190l0.m510a((Runnable) new C0058a(yVar));
        }
    }

    /* renamed from: com.adcolony.sdk.d$j */
    class C0059j implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdColonyInterstitial f188a;

        /* renamed from: b */
        final /* synthetic */ AdColonyInterstitialListener f189b;

        C0059j(AdColonyInterstitial adColonyInterstitial, AdColonyInterstitialListener adColonyInterstitialListener) {
            this.f188a = adColonyInterstitial;
            this.f189b = adColonyInterstitialListener;
        }

        public void run() {
            this.f188a.mo214a(true);
            this.f189b.onExpiring(this.f188a);
            C0184l i = C0026a.m80c().mo446i();
            if (i.mo567a() != null) {
                i.mo567a().dismiss();
                i.mo568a((AlertDialog) null);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.d$k */
    class C0060k implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f191a;

        /* renamed from: b */
        final /* synthetic */ C0284y f192b;

        /* renamed from: c */
        final /* synthetic */ AdColonyAdViewListener f193c;

        /* renamed from: d */
        final /* synthetic */ String f194d;

        C0060k(Context context, C0284y yVar, AdColonyAdViewListener adColonyAdViewListener, String str) {
            this.f191a = context;
            this.f192b = yVar;
            this.f193c = adColonyAdViewListener;
            this.f194d = str;
        }

        public void run() {
            AdColonyAdView adColonyAdView = new AdColonyAdView(this.f191a, this.f192b, this.f193c);
            C0046d.this.f172d.put(this.f194d, adColonyAdView);
            adColonyAdView.setOmidManager(this.f193c.mo153b());
            adColonyAdView.mo117d();
            this.f193c.mo151a((C0076d0) null);
            this.f193c.onRequestFilled(adColonyAdView);
        }
    }

    /* renamed from: com.adcolony.sdk.d$l */
    class C0061l implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdColonyInterstitial f196a;

        /* renamed from: b */
        final /* synthetic */ C0284y f197b;

        /* renamed from: c */
        final /* synthetic */ AdColonyInterstitialListener f198c;

        C0061l(AdColonyInterstitial adColonyInterstitial, C0284y yVar, AdColonyInterstitialListener adColonyInterstitialListener) {
            this.f196a = adColonyInterstitial;
            this.f197b = yVar;
            this.f198c = adColonyInterstitialListener;
        }

        public void run() {
            if (this.f196a.mo225f() == null) {
                this.f196a.mo213a(C0267t.m818g(this.f197b.mo736b(), "iab"));
            }
            this.f196a.mo212a(C0267t.m819h(this.f197b.mo736b(), "ad_id"));
            this.f196a.mo220c(C0267t.m819h(this.f197b.mo736b(), "creative_id"));
            C0076d0 f = this.f196a.mo225f();
            if (!(f == null || f.mo371d() == 2)) {
                try {
                    f.mo364a();
                } catch (IllegalArgumentException unused) {
                    new C0269v.C0270a().mo707a("IllegalArgumentException when creating omid session").mo709a(C0269v.f1300j);
                }
            }
            this.f198c.onRequestFilled(this.f196a);
        }
    }

    /* renamed from: com.adcolony.sdk.d$m */
    class C0062m implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdColonyInterstitial f200a;

        /* renamed from: b */
        final /* synthetic */ AdColonyInterstitialListener f201b;

        C0062m(AdColonyInterstitial adColonyInterstitial, AdColonyInterstitialListener adColonyInterstitialListener) {
            this.f200a = adColonyInterstitial;
            this.f201b = adColonyInterstitialListener;
        }

        public void run() {
            AdColonyZone adColonyZone = C0026a.m80c().mo462y().get(this.f200a.getZoneID());
            if (adColonyZone == null) {
                adColonyZone = new AdColonyZone(this.f200a.getZoneID());
                adColonyZone.mo267c(6);
            }
            this.f201b.onRequestNotFilled(adColonyZone);
        }
    }

    /* renamed from: com.adcolony.sdk.d$n */
    class C0063n implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdColonyInterstitialListener f203a;

        /* renamed from: b */
        final /* synthetic */ AdColonyInterstitial f204b;

        C0063n(AdColonyInterstitialListener adColonyInterstitialListener, AdColonyInterstitial adColonyInterstitial) {
            this.f203a = adColonyInterstitialListener;
            this.f204b = adColonyInterstitial;
        }

        public void run() {
            C0026a.m80c().mo442e(false);
            this.f203a.onClosed(this.f204b);
        }
    }

    /* renamed from: com.adcolony.sdk.d$o */
    class C0064o implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f206a;

        /* renamed from: b */
        final /* synthetic */ C0210n0 f207b;

        /* renamed from: c */
        final /* synthetic */ C0032c f208c;

        C0064o(String str, C0210n0 n0Var, C0032c cVar) {
            this.f206a = str;
            this.f207b = n0Var;
            this.f208c = cVar;
        }

        public void run() {
            try {
                AdColonyInterstitial adColonyInterstitial = C0046d.this.mo334a().get(this.f206a);
                AdColonyAdView adColonyAdView = C0046d.this.mo342b().get(this.f206a);
                C0076d0 f = adColonyInterstitial == null ? null : adColonyInterstitial.mo225f();
                if (f == null && adColonyAdView != null) {
                    f = adColonyAdView.getOmidManager();
                }
                int d = f == null ? -1 : f.mo371d();
                if (f != null && d == 2) {
                    f.mo365a((WebView) this.f207b);
                    f.mo366a(this.f208c);
                }
            } catch (IllegalArgumentException unused) {
                new C0269v.C0270a().mo707a("IllegalArgumentException when creating omid session").mo709a(C0269v.f1300j);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.d$p */
    class C0065p implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C0032c f210a;

        C0065p(C0032c cVar) {
            this.f210a = cVar;
        }

        public void run() {
            for (int i = 0; i < this.f210a.mo313i().size(); i++) {
                C0026a.m79b(this.f210a.mo315j().get(i), this.f210a.mo313i().get(i));
            }
            this.f210a.mo315j().clear();
            this.f210a.mo313i().clear();
            this.f210a.removeAllViews();
            C0032c cVar = this.f210a;
            cVar.f152z = null;
            cVar.f151y = null;
            for (C0210n0 next : cVar.mo320n().values()) {
                if (!next.mo641y()) {
                    int c = next.mo286c();
                    if (c <= 0) {
                        c = next.mo287d();
                    }
                    C0026a.m80c().mo430a(c);
                    next.loadUrl("about:blank");
                    next.clearCache(true);
                    next.removeAllViews();
                    next.mo618a(true);
                }
            }
            for (C0195m0 next2 : this.f210a.mo319m().values()) {
                next2.mo591j();
                next2.mo592k();
            }
            this.f210a.mo319m().clear();
            this.f210a.mo318l().clear();
            this.f210a.mo320n().clear();
            this.f210a.mo311h().clear();
            this.f210a.mo305e().clear();
            this.f210a.mo307f().clear();
            this.f210a.mo309g().clear();
            this.f210a.f139m = true;
        }
    }

    /* renamed from: com.adcolony.sdk.d$q */
    class C0066q implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdColonyAdViewListener f212a;

        C0066q(AdColonyAdViewListener adColonyAdViewListener) {
            this.f212a = adColonyAdViewListener;
        }

        public void run() {
            String c = this.f212a.mo154c();
            AdColonyZone adColonyZone = C0026a.m80c().mo462y().get(c);
            if (adColonyZone == null) {
                adColonyZone = new AdColonyZone(c);
                adColonyZone.mo267c(6);
            }
            this.f212a.onRequestNotFilled(adColonyZone);
        }
    }

    /* renamed from: com.adcolony.sdk.d$r */
    class C0067r implements C0028a0 {

        /* renamed from: com.adcolony.sdk.d$r$a */
        class C0068a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C0284y f215a;

            C0068a(C0284y yVar) {
                this.f215a = yVar;
            }

            public void run() {
                C0046d.this.mo345c(this.f215a);
            }
        }

        C0067r() {
        }

        /* renamed from: a */
        public void mo278a(C0284y yVar) {
            C0190l0.m510a((Runnable) new C0068a(yVar));
        }
    }

    /* renamed from: com.adcolony.sdk.d$s */
    class C0069s implements C0028a0 {

        /* renamed from: com.adcolony.sdk.d$s$a */
        class C0070a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C0284y f218a;

            C0070a(C0284y yVar) {
                this.f218a = yVar;
            }

            public void run() {
                boolean unused = C0046d.this.m165d(this.f218a);
            }
        }

        C0069s() {
        }

        /* renamed from: a */
        public void mo278a(C0284y yVar) {
            C0190l0.m510a((Runnable) new C0070a(yVar));
        }
    }

    /* renamed from: com.adcolony.sdk.d$t */
    class C0071t implements C0028a0 {
        C0071t() {
        }

        /* renamed from: a */
        public void mo278a(C0284y yVar) {
            boolean unused = C0046d.this.m171k(yVar);
        }
    }

    /* renamed from: com.adcolony.sdk.d$u */
    class C0072u implements C0028a0 {
        C0072u() {
        }

        /* renamed from: a */
        public void mo278a(C0284y yVar) {
            boolean unused = C0046d.this.m170j(yVar);
        }
    }

    /* renamed from: com.adcolony.sdk.d$v */
    class C0073v implements C0028a0 {
        C0073v() {
        }

        /* renamed from: a */
        public void mo278a(C0284y yVar) {
            boolean unused = C0046d.this.m168f(yVar);
        }
    }

    /* renamed from: com.adcolony.sdk.d$w */
    class C0074w implements C0028a0 {
        C0074w() {
        }

        /* renamed from: a */
        public void mo278a(C0284y yVar) {
            boolean unused = C0046d.this.m172l(yVar);
        }
    }

    /* renamed from: com.adcolony.sdk.d$x */
    class C0075x implements C0028a0 {
        C0075x() {
        }

        /* renamed from: a */
        public void mo278a(C0284y yVar) {
            C0046d.this.mo343b(yVar);
        }
    }

    C0046d() {
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public boolean m165d(C0284y yVar) {
        String h = C0267t.m819h(yVar.mo736b(), "ad_session_id");
        C0032c cVar = this.f169a.get(h);
        if (cVar == null) {
            mo340a(yVar.mo739c(), h);
            return false;
        }
        mo336a(cVar);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public boolean m168f(C0284y yVar) {
        JSONObject b = yVar.mo736b();
        int f = C0267t.m817f(b, "status");
        if (f == 5 || f == 1 || f == 0 || f == 6) {
            return false;
        }
        String h = C0267t.m819h(b, "id");
        AdColonyInterstitial remove = this.f170b.remove(h);
        AdColonyInterstitialListener listener = remove == null ? null : remove.getListener();
        if (listener == null) {
            mo340a(yVar.mo739c(), h);
            return false;
        }
        C0190l0.m510a((Runnable) new C0063n(listener, remove));
        remove.mo211a((C0032c) null);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public boolean m169g(C0284y yVar) {
        String h = C0267t.m819h(yVar.mo736b(), "id");
        JSONObject b = C0267t.m805b();
        C0267t.m798a(b, "id", h);
        Context b2 = C0026a.m78b();
        if (b2 == null) {
            C0267t.m809b(b, "has_audio", false);
            yVar.mo735a(b).mo740d();
            return false;
        }
        boolean b3 = C0190l0.m521b(C0190l0.m501a(b2));
        double a = C0190l0.m495a(C0190l0.m501a(b2));
        C0267t.m809b(b, "has_audio", b3);
        C0267t.m796a(b, "volume", a);
        yVar.mo735a(b).mo740d();
        return b3;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public boolean m170j(C0284y yVar) {
        JSONObject b = yVar.mo736b();
        String c = yVar.mo739c();
        String h = C0267t.m819h(b, "ad_session_id");
        int f = C0267t.m817f(b, "view_id");
        C0032c cVar = this.f169a.get(h);
        if (cVar == null) {
            mo340a(c, h);
            return false;
        }
        View view = cVar.mo305e().get(Integer.valueOf(f));
        if (view == null) {
            mo340a(c, "" + f);
            return false;
        }
        cVar.removeView(view);
        cVar.addView(view, view.getLayoutParams());
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public boolean m171k(C0284y yVar) {
        JSONObject b = yVar.mo736b();
        String c = yVar.mo739c();
        String h = C0267t.m819h(b, "ad_session_id");
        int f = C0267t.m817f(b, "view_id");
        C0032c cVar = this.f169a.get(h);
        if (cVar == null) {
            mo340a(c, h);
            return false;
        }
        View view = cVar.mo305e().get(Integer.valueOf(f));
        if (view == null) {
            mo340a(c, "" + f);
            return false;
        }
        view.bringToFront();
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public boolean m172l(C0284y yVar) {
        JSONObject b = yVar.mo736b();
        String h = C0267t.m819h(b, "id");
        AdColonyInterstitial adColonyInterstitial = this.f170b.get(h);
        AdColonyAdView adColonyAdView = this.f172d.get(h);
        int a = C0267t.m784a(b, "orientation", -1);
        boolean z = adColonyAdView != null;
        if (adColonyInterstitial != null || z) {
            C0267t.m798a(C0267t.m805b(), "id", h);
            if (adColonyInterstitial != null) {
                adColonyInterstitial.mo209a(a);
                adColonyInterstitial.mo232j();
            }
            return true;
        }
        mo340a(yVar.mo739c(), h);
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public ConcurrentHashMap<String, AdColonyInterstitial> mo334a() {
        return this.f170b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo335a(@NonNull Context context, @NonNull JSONObject jSONObject, @NonNull String str) {
        C0284y yVar = new C0284y("AdSession.finish_fullscreen_ad", 0);
        C0267t.m808b(jSONObject, "status", 1);
        new C0269v.C0270a().mo707a(str).mo709a(C0269v.f1299i);
        ((C0029b) context).mo235a(yVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo336a(C0032c cVar) {
        C0190l0.m510a((Runnable) new C0065p(cVar));
        AdColonyAdView adColonyAdView = this.f172d.get(cVar.mo289a());
        if (adColonyAdView == null || adColonyAdView.mo116c()) {
            this.f169a.remove(cVar.mo289a());
            cVar.f151y = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo337a(C0210n0 n0Var, String str, C0032c cVar) {
        C0190l0.m510a((Runnable) new C0064o(str, n0Var, cVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo338a(String str, AdColonyAdViewListener adColonyAdViewListener, AdColonyAdSize adColonyAdSize, AdColonyAdOptions adColonyAdOptions) {
        JSONObject jSONObject;
        String a = C0190l0.m502a();
        JSONObject b = C0267t.m805b();
        float n = C0026a.m80c().mo445h().mo533n();
        C0267t.m798a(b, "zone_id", str);
        C0267t.m808b(b, "type", 1);
        C0267t.m808b(b, "width_pixels", (int) (((float) adColonyAdSize.getWidth()) * n));
        C0267t.m808b(b, "height_pixels", (int) (((float) adColonyAdSize.getHeight()) * n));
        C0267t.m808b(b, "width", adColonyAdSize.getWidth());
        C0267t.m808b(b, "height", adColonyAdSize.getHeight());
        C0267t.m798a(b, "id", a);
        adColonyAdViewListener.mo152a(str);
        adColonyAdViewListener.mo150a(adColonyAdSize);
        if (!(adColonyAdOptions == null || (jSONObject = adColonyAdOptions.f31d) == null)) {
            C0267t.m800a(b, "options", jSONObject);
        }
        this.f171c.put(a, adColonyAdViewListener);
        new C0284y("AdSession.on_request", 1, b).mo740d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo339a(String str, AdColonyInterstitialListener adColonyInterstitialListener, AdColonyAdOptions adColonyAdOptions) {
        String a = C0190l0.m502a();
        C0122i c = C0026a.m80c();
        JSONObject b = C0267t.m805b();
        C0267t.m798a(b, "zone_id", str);
        C0267t.m809b(b, "fullscreen", true);
        C0267t.m808b(b, "width", c.mo445h().mo537r());
        C0267t.m808b(b, "height", c.mo445h().mo536q());
        C0267t.m808b(b, "type", 0);
        C0267t.m798a(b, "id", a);
        AdColonyInterstitial adColonyInterstitial = new AdColonyInterstitial(a, adColonyInterstitialListener, str);
        this.f170b.put(a, adColonyInterstitial);
        if (!(adColonyAdOptions == null || adColonyAdOptions.f31d == null)) {
            adColonyInterstitial.mo210a(adColonyAdOptions);
            C0267t.m800a(b, "options", adColonyAdOptions.f31d);
        }
        new C0284y("AdSession.on_request", 1, b).mo740d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo340a(String str, String str2) {
        new C0269v.C0270a().mo707a("Message '").mo707a(str).mo707a("' sent with invalid id: ").mo707a(str2).mo709a(C0269v.f1299i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo341a(C0284y yVar) {
        String h = C0267t.m819h(yVar.mo736b(), "id");
        AdColonyAdViewListener remove = this.f171c.remove(h);
        if (remove == null) {
            mo340a(yVar.mo739c(), h);
            return false;
        }
        C0190l0.m510a((Runnable) new C0066q(remove));
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public HashMap<String, AdColonyAdView> mo342b() {
        return this.f172d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo343b(C0284y yVar) {
        String h = C0267t.m819h(yVar.mo736b(), "id");
        AdColonyAdViewListener remove = this.f171c.remove(h);
        if (remove == null) {
            mo340a(yVar.mo739c(), h);
            return false;
        }
        Context b = C0026a.m78b();
        if (b == null) {
            return false;
        }
        C0190l0.m510a((Runnable) new C0060k(b, yVar, remove, h));
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public HashMap<String, AdColonyAdViewListener> mo344c() {
        return this.f171c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo345c(C0284y yVar) {
        Context b = C0026a.m78b();
        if (b == null) {
            return false;
        }
        JSONObject b2 = yVar.mo736b();
        String h = C0267t.m819h(b2, "ad_session_id");
        C0032c cVar = new C0032c(b.getApplicationContext(), h);
        cVar.mo316j(yVar);
        this.f169a.put(h, cVar);
        if (C0267t.m817f(b2, "width") == 0) {
            AdColonyInterstitial adColonyInterstitial = this.f170b.get(h);
            if (adColonyInterstitial == null) {
                mo340a(yVar.mo739c(), h);
                return false;
            }
            adColonyInterstitial.mo211a(cVar);
        } else {
            cVar.mo298b(false);
        }
        JSONObject b3 = C0267t.m805b();
        C0267t.m809b(b3, "success", true);
        yVar.mo735a(b3).mo740d();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public HashMap<String, C0032c> mo346d() {
        return this.f169a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo347e() {
        this.f169a = new HashMap<>();
        this.f170b = new ConcurrentHashMap<>();
        this.f171c = new HashMap<>();
        this.f172d = new HashMap<>();
        C0026a.m76a("AdContainer.create", (C0028a0) new C0067r());
        C0026a.m76a("AdContainer.destroy", (C0028a0) new C0069s());
        C0026a.m76a("AdContainer.move_view_to_index", (C0028a0) new C0071t());
        C0026a.m76a("AdContainer.move_view_to_front", (C0028a0) new C0072u());
        C0026a.m76a("AdSession.finish_fullscreen_ad", (C0028a0) new C0073v());
        C0026a.m76a("AdSession.start_fullscreen_ad", (C0028a0) new C0074w());
        C0026a.m76a("AdSession.ad_view_available", (C0028a0) new C0075x());
        C0026a.m76a("AdSession.ad_view_unavailable", (C0028a0) new C0047a());
        C0026a.m76a("AdSession.expiring", (C0028a0) new C0048b());
        C0026a.m76a("AdSession.audio_stopped", (C0028a0) new C0049c());
        C0026a.m76a("AdSession.audio_started", (C0028a0) new C0051d());
        C0026a.m76a("AdSession.interstitial_available", (C0028a0) new C0053e());
        C0026a.m76a("AdSession.interstitial_unavailable", (C0028a0) new C0054f());
        C0026a.m76a("AdSession.has_audio", (C0028a0) new C0055g());
        C0026a.m76a("WebView.prepare", (C0028a0) new C0056h());
        C0026a.m76a("AdSession.expanded", (C0028a0) new C0057i());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo348e(C0284y yVar) {
        JSONObject b = yVar.mo736b();
        String h = C0267t.m819h(b, "id");
        if (C0267t.m817f(b, "type") != 0) {
            return true;
        }
        AdColonyInterstitial remove = this.f170b.remove(h);
        AdColonyInterstitialListener listener = remove == null ? null : remove.getListener();
        if (listener == null) {
            mo340a(yVar.mo739c(), h);
            return false;
        } else if (!C0026a.m81d()) {
            return false;
        } else {
            C0190l0.m510a((Runnable) new C0059j(remove, listener));
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo349h(C0284y yVar) {
        String h = C0267t.m819h(yVar.mo736b(), "id");
        AdColonyInterstitial remove = this.f170b.remove(h);
        AdColonyInterstitialListener listener = remove == null ? null : remove.getListener();
        if (listener == null) {
            mo340a(yVar.mo739c(), h);
            return false;
        } else if (!C0026a.m81d()) {
            return false;
        } else {
            C0190l0.m510a((Runnable) new C0062m(remove, listener));
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo350i(C0284y yVar) {
        String h = C0267t.m819h(yVar.mo736b(), "id");
        AdColonyInterstitial adColonyInterstitial = this.f170b.get(h);
        AdColonyInterstitialListener listener = adColonyInterstitial == null ? null : adColonyInterstitial.getListener();
        if (listener == null) {
            mo340a(yVar.mo739c(), h);
            return false;
        } else if (!C0026a.m81d()) {
            return false;
        } else {
            C0190l0.m510a((Runnable) new C0061l(adColonyInterstitial, yVar, listener));
            return true;
        }
    }
}
