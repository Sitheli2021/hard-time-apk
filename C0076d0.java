package com.adcolony.sdk;

import android.webkit.WebView;
import com.adcolony.sdk.C0269v;
import com.adobe.air.wand.message.MessageManager;
import com.google.android.gms.common.ConnectionResult;
import com.iab.omid.library.adcolony.adsession.AdEvents;
import com.iab.omid.library.adcolony.adsession.AdSession;
import com.iab.omid.library.adcolony.adsession.AdSessionConfiguration;
import com.iab.omid.library.adcolony.adsession.AdSessionContext;
import com.iab.omid.library.adcolony.adsession.CreativeType;
import com.iab.omid.library.adcolony.adsession.ImpressionType;
import com.iab.omid.library.adcolony.adsession.Owner;
import com.iab.omid.library.adcolony.adsession.VerificationScriptResource;
import com.iab.omid.library.adcolony.adsession.media.InteractionType;
import com.iab.omid.library.adcolony.adsession.media.MediaEvents;
import com.iab.omid.library.adcolony.adsession.media.Position;
import com.iab.omid.library.adcolony.adsession.media.VastProperties;
import java.io.IOException;
import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.adcolony.sdk.d0 */
class C0076d0 {

    /* renamed from: a */
    private AdSession f225a;

    /* renamed from: b */
    private AdEvents f226b;

    /* renamed from: c */
    private MediaEvents f227c;

    /* renamed from: d */
    private List<VerificationScriptResource> f228d = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public int f229e = -1;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public String f230f = "";

    /* renamed from: g */
    private boolean f231g;

    /* renamed from: h */
    private boolean f232h;

    /* renamed from: i */
    private boolean f233i;

    /* renamed from: j */
    private boolean f234j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f235k;

    /* renamed from: l */
    private int f236l;

    /* renamed from: m */
    private int f237m;

    /* renamed from: n */
    private String f238n = "";
    /* access modifiers changed from: private */

    /* renamed from: o */
    public String f239o = "";

    /* renamed from: com.adcolony.sdk.d0$a */
    class C0077a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f240a;

        C0077a(String str) {
            this.f240a = str;
        }

        public void run() {
            JSONObject b = C0267t.m805b();
            JSONObject b2 = C0267t.m805b();
            C0267t.m808b(b2, "session_type", C0076d0.this.f229e);
            C0267t.m798a(b2, "session_id", C0076d0.this.f230f);
            C0267t.m798a(b2, "event", this.f240a);
            C0267t.m798a(b, "type", "iab_hook");
            C0267t.m798a(b, MessageManager.NAME_ERROR_MESSAGE, b2.toString());
            new C0284y("CustomMessage.controller_send", 0, b).mo740d();
        }
    }

    /* renamed from: com.adcolony.sdk.d0$b */
    class C0078b implements AdColonyCustomMessageListener {

        /* renamed from: com.adcolony.sdk.d0$b$a */
        class C0079a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ String f243a;

            /* renamed from: b */
            final /* synthetic */ String f244b;

            /* renamed from: c */
            final /* synthetic */ float f245c;

            C0079a(String str, String str2, float f) {
                this.f243a = str;
                this.f244b = str2;
                this.f245c = f;
            }

            public void run() {
                if (this.f243a.equals(C0076d0.this.f239o)) {
                    C0076d0.this.mo368a(this.f244b, this.f245c);
                    return;
                }
                AdColonyAdView adColonyAdView = C0026a.m80c().mo432b().mo342b().get(this.f243a);
                C0076d0 omidManager = adColonyAdView != null ? adColonyAdView.getOmidManager() : null;
                if (omidManager != null) {
                    omidManager.mo368a(this.f244b, this.f245c);
                }
            }
        }

        C0078b() {
        }

        public void onAdColonyCustomMessage(AdColonyCustomMessage adColonyCustomMessage) {
            JSONObject b = C0267t.m806b(adColonyCustomMessage.getMessage());
            String h = C0267t.m819h(b, "event_type");
            float floatValue = BigDecimal.valueOf(C0267t.m815e(b, "duration")).floatValue();
            boolean d = C0267t.m814d(b, "replay");
            boolean equals = C0267t.m819h(b, "skip_type").equals("dec");
            String h2 = C0267t.m819h(b, "asi");
            if (h.equals("skip") && equals) {
                boolean unused = C0076d0.this.f235k = true;
            } else if (!d || (!h.equals("start") && !h.equals("first_quartile") && !h.equals("midpoint") && !h.equals("third_quartile") && !h.equals("complete"))) {
                C0190l0.m510a((Runnable) new C0079a(h2, h, floatValue));
            }
        }
    }

    C0076d0(JSONObject jSONObject, String str) {
        this.f229e = m207a(jSONObject);
        this.f234j = C0267t.m814d(jSONObject, "skippable");
        this.f236l = C0267t.m817f(jSONObject, "skip_offset");
        this.f237m = C0267t.m817f(jSONObject, "video_duration");
        JSONArray c = C0267t.m810c(jSONObject, "js_resources");
        JSONArray c2 = C0267t.m810c(jSONObject, "verification_params");
        JSONArray c3 = C0267t.m810c(jSONObject, "vendor_keys");
        this.f239o = str;
        for (int i = 0; i < c.length(); i++) {
            try {
                String d = C0267t.m813d(c2, i);
                String d2 = C0267t.m813d(c3, i);
                URL url = new URL(C0267t.m813d(c, i));
                this.f228d.add((d.equals("") || d2.equals("")) ? !d2.equals("") ? VerificationScriptResource.createVerificationScriptResourceWithoutParameters(url) : VerificationScriptResource.createVerificationScriptResourceWithoutParameters(url) : VerificationScriptResource.createVerificationScriptResourceWithParameters(d2, url, d));
            } catch (MalformedURLException unused) {
                new C0269v.C0270a().mo707a("Invalid js resource url passed to Omid").mo709a(C0269v.f1300j);
            }
        }
        try {
            this.f238n = C0026a.m80c().mo448k().mo683a(C0267t.m819h(jSONObject, "filepath"), true).toString();
        } catch (IOException unused2) {
            new C0269v.C0270a().mo707a("Error loading IAB JS Client").mo709a(C0269v.f1300j);
        }
    }

    /* renamed from: a */
    private int m207a(JSONObject jSONObject) {
        if (this.f229e == -1) {
            int f = C0267t.m817f(jSONObject, "ad_unit_type");
            String h = C0267t.m819h(jSONObject, "ad_type");
            if (f == 0) {
                return 0;
            }
            if (f == 1) {
                if (h.equals("video")) {
                    return 0;
                }
                if (h.equals("display")) {
                    return 1;
                }
                if (h.equals("banner_display") || h.equals("interstitial_display")) {
                    return 2;
                }
            }
        }
        return this.f229e;
    }

    /* renamed from: b */
    private void m210b(C0032c cVar) {
        m211b("register_ad_view");
        C0210n0 n0Var = C0026a.m80c().mo461x().get(Integer.valueOf(cVar.mo317k()));
        if (n0Var == null && !cVar.mo320n().isEmpty()) {
            n0Var = (C0210n0) cVar.mo320n().entrySet().iterator().next().getValue();
        }
        AdSession adSession = this.f225a;
        if (adSession != null && n0Var != null) {
            adSession.registerAdView(n0Var);
            n0Var.mo624e();
        } else if (adSession != null) {
            adSession.registerAdView(cVar);
            cVar.mo293a(this.f225a);
            m211b("register_obstructions");
        }
    }

    /* renamed from: b */
    private void m211b(String str) {
        C0190l0.f1041b.execute(new C0077a(str));
    }

    /* renamed from: e */
    private void m213e() {
        AdColony.addCustomMessageListener(new C0078b(), "viewability_ad_event");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo364a() throws IllegalArgumentException {
        mo365a((WebView) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo365a(WebView webView) throws IllegalArgumentException {
        String str;
        List<VerificationScriptResource> list;
        if (this.f229e >= 0 && (str = this.f238n) != null && !str.equals("") && (list = this.f228d) != null) {
            if (!list.isEmpty() || mo371d() == 2) {
                C0122i c = C0026a.m80c();
                Owner owner = Owner.NATIVE;
                ImpressionType impressionType = ImpressionType.BEGIN_TO_RENDER;
                int d = mo371d();
                if (d == 0) {
                    CreativeType creativeType = CreativeType.VIDEO;
                    AdSession createAdSession = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(creativeType, impressionType, owner, owner, false), AdSessionContext.createNativeAdSessionContext(c.mo454q(), this.f238n, this.f228d, (String) null, (String) null));
                    this.f225a = createAdSession;
                    this.f230f = createAdSession.getAdSessionId();
                    m211b("inject_javascript");
                } else if (d == 1) {
                    CreativeType creativeType2 = CreativeType.NATIVE_DISPLAY;
                    AdSession createAdSession2 = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(creativeType2, impressionType, owner, (Owner) null, false), AdSessionContext.createNativeAdSessionContext(c.mo454q(), this.f238n, this.f228d, (String) null, (String) null));
                    this.f225a = createAdSession2;
                    this.f230f = createAdSession2.getAdSessionId();
                    m211b("inject_javascript");
                } else if (d == 2) {
                    CreativeType creativeType3 = CreativeType.HTML_DISPLAY;
                    AdSession createAdSession3 = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(creativeType3, impressionType, owner, (Owner) null, false), AdSessionContext.createHtmlAdSessionContext(c.mo454q(), webView, "", (String) null));
                    this.f225a = createAdSession3;
                    this.f230f = createAdSession3.getAdSessionId();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo366a(C0032c cVar) {
        if (!this.f233i && this.f229e >= 0 && this.f225a != null) {
            m210b(cVar);
            m213e();
            this.f227c = this.f229e != 0 ? null : MediaEvents.createMediaEvents(this.f225a);
            this.f225a.start();
            this.f226b = AdEvents.createAdEvents(this.f225a);
            m211b("start_session");
            if (this.f227c != null) {
                Position position = Position.PREROLL;
                this.f226b.loaded(this.f234j ? VastProperties.createVastPropertiesForSkippableMedia((float) this.f236l, true, position) : VastProperties.createVastPropertiesForNonSkippableMedia(true, position));
            } else {
                this.f226b.loaded();
            }
            this.f233i = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo367a(String str) {
        mo368a(str, 0.0f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo368a(String str, float f) {
        if (C0026a.m81d() && this.f225a != null) {
            if (this.f227c != null || str.equals("start") || str.equals("skip") || str.equals("continue") || str.equals("cancel")) {
                char c = 65535;
                try {
                    switch (str.hashCode()) {
                        case -1941887438:
                            if (str.equals("first_quartile")) {
                                c = 1;
                                break;
                            }
                            break;
                        case -1710060637:
                            if (str.equals("buffer_start")) {
                                c = 12;
                                break;
                            }
                            break;
                        case -1638835128:
                            if (str.equals("midpoint")) {
                                c = 2;
                                break;
                            }
                            break;
                        case -1367724422:
                            if (str.equals("cancel")) {
                                c = 7;
                                break;
                            }
                            break;
                        case -934426579:
                            if (str.equals("resume")) {
                                c = 11;
                                break;
                            }
                            break;
                        case -651914917:
                            if (str.equals("third_quartile")) {
                                c = 3;
                                break;
                            }
                            break;
                        case -599445191:
                            if (str.equals("complete")) {
                                c = 4;
                                break;
                            }
                            break;
                        case -567202649:
                            if (str.equals("continue")) {
                                c = 5;
                                break;
                            }
                            break;
                        case -342650039:
                            if (str.equals("sound_mute")) {
                                c = 8;
                                break;
                            }
                            break;
                        case 3532159:
                            if (str.equals("skip")) {
                                c = 6;
                                break;
                            }
                            break;
                        case 106440182:
                            if (str.equals("pause")) {
                                c = 10;
                                break;
                            }
                            break;
                        case 109757538:
                            if (str.equals("start")) {
                                c = 0;
                                break;
                            }
                            break;
                        case 583742045:
                            if (str.equals("in_video_engagement")) {
                                c = 14;
                                break;
                            }
                            break;
                        case 823102269:
                            if (str.equals("html5_interaction")) {
                                c = 15;
                                break;
                            }
                            break;
                        case 1648173410:
                            if (str.equals("sound_unmute")) {
                                c = 9;
                                break;
                            }
                            break;
                        case 1906584668:
                            if (str.equals("buffer_end")) {
                                c = 13;
                                break;
                            }
                            break;
                    }
                    switch (c) {
                        case 0:
                            this.f226b.impressionOccurred();
                            MediaEvents mediaEvents = this.f227c;
                            if (mediaEvents != null) {
                                if (f <= 0.0f) {
                                    f = (float) this.f237m;
                                }
                                mediaEvents.start(f, 1.0f);
                            }
                            m211b(str);
                            return;
                        case 1:
                            this.f227c.firstQuartile();
                            m211b(str);
                            return;
                        case 2:
                            this.f227c.midpoint();
                            m211b(str);
                            return;
                        case 3:
                            this.f227c.thirdQuartile();
                            m211b(str);
                            return;
                        case 4:
                            this.f235k = true;
                            this.f227c.complete();
                            m211b(str);
                            return;
                        case 5:
                            m211b(str);
                            mo369b();
                            return;
                        case 6:
                        case 7:
                            MediaEvents mediaEvents2 = this.f227c;
                            if (mediaEvents2 != null) {
                                mediaEvents2.skipped();
                            }
                            m211b(str);
                            mo369b();
                            return;
                        case 8:
                            this.f227c.volumeChange(0.0f);
                            m211b(str);
                            return;
                        case ConnectionResult.SERVICE_INVALID /*9*/:
                            this.f227c.volumeChange(1.0f);
                            m211b(str);
                            return;
                        case 10:
                            if (!this.f231g && !this.f232h && !this.f235k) {
                                this.f227c.pause();
                                m211b(str);
                                this.f231g = true;
                                this.f232h = false;
                                return;
                            }
                            return;
                        case ConnectionResult.LICENSE_CHECK_FAILED /*11*/:
                            if (this.f231g && !this.f235k) {
                                this.f227c.resume();
                                m211b(str);
                                this.f231g = false;
                                return;
                            }
                            return;
                        case 12:
                            this.f227c.bufferStart();
                            m211b(str);
                            return;
                        case 13:
                            this.f227c.bufferFinish();
                            m211b(str);
                            return;
                        case 14:
                        case 15:
                            this.f227c.adUserInteraction(InteractionType.CLICK);
                            m211b(str);
                            if (this.f232h && !this.f231g && !this.f235k) {
                                this.f227c.pause();
                                m211b("pause");
                                this.f231g = true;
                                this.f232h = false;
                                return;
                            }
                            return;
                        default:
                            return;
                    }
                } catch (IllegalArgumentException | IllegalStateException e) {
                    C0269v.C0270a a = new C0269v.C0270a().mo707a("Recording IAB event for ").mo707a(str);
                    a.mo707a(" caused " + e.getClass()).mo709a(C0269v.f1298h);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo369b() {
        AdColony.removeCustomMessageListener("viewability_ad_event");
        this.f225a.finish();
        m211b("end_session");
        this.f225a = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public AdSession mo370c() {
        return this.f225a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo371d() {
        return this.f229e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo372f() {
        this.f232h = true;
    }
}
