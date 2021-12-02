package com.adcolony.sdk;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.adcolony.sdk.C0193m;
import com.adcolony.sdk.C0269v;
import com.adobe.air.wand.message.MessageManager;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.iab.omid.library.adcolony.Omid;
import com.iab.omid.library.adcolony.adsession.Partner;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.adcolony.sdk.i */
class C0122i implements C0193m.C0194a {

    /* renamed from: S */
    static final String f869S = "026ae9c9824b3e483fa6c71fa88f57ae27816141";

    /* renamed from: T */
    static final String f870T = "7bf3a1e7bbd31e612eda3310c2cdb8075c43c6b5";

    /* renamed from: U */
    static String f871U = "https://adc3-launch.adcolony.com/v4/launch";

    /* renamed from: V */
    private static volatile String f872V = "";

    /* renamed from: A */
    private String f873A = "";

    /* renamed from: B */
    private boolean f874B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public boolean f875C;

    /* renamed from: D */
    private boolean f876D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public boolean f877E;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public boolean f878F;

    /* renamed from: G */
    private boolean f879G;

    /* renamed from: H */
    private boolean f880H;

    /* renamed from: I */
    private boolean f881I;

    /* renamed from: J */
    private boolean f882J;
    /* access modifiers changed from: private */

    /* renamed from: K */
    public boolean f883K;
    /* access modifiers changed from: private */

    /* renamed from: L */
    public boolean f884L;
    /* access modifiers changed from: private */

    /* renamed from: M */
    public boolean f885M;

    /* renamed from: N */
    private int f886N;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public int f887O = 1;

    /* renamed from: P */
    private final int f888P = 120;

    /* renamed from: Q */
    private Application.ActivityLifecycleCallbacks f889Q;
    /* access modifiers changed from: private */

    /* renamed from: R */
    public Partner f890R = null;

    /* renamed from: a */
    private C0146j f891a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C0285z f892b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C0206n f893c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C0118g0 f894d;

    /* renamed from: e */
    private C0046d f895e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C0184l f896f;

    /* renamed from: g */
    private C0243q f897g;

    /* renamed from: h */
    private C0148j0 f898h;

    /* renamed from: i */
    private C0121h0 f899i;

    /* renamed from: j */
    private C0273x f900j;

    /* renamed from: k */
    private C0167k f901k;

    /* renamed from: l */
    private C0045c0 f902l;

    /* renamed from: m */
    private C0032c f903m;

    /* renamed from: n */
    private AdColonyAdView f904n;

    /* renamed from: o */
    private AdColonyInterstitial f905o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public AdColonyRewardListener f906p;

    /* renamed from: q */
    private HashMap<String, AdColonyCustomMessageListener> f907q = new HashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: r */
    public AdColonyAppOptions f908r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public C0284y f909s;

    /* renamed from: t */
    private JSONObject f910t;

    /* renamed from: u */
    private HashMap<String, AdColonyZone> f911u = new HashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: v */
    public HashMap<Integer, C0210n0> f912v = new HashMap<>();

    /* renamed from: w */
    private String f913w;

    /* renamed from: x */
    private String f914x;

    /* renamed from: y */
    private String f915y;

    /* renamed from: z */
    private String f916z;

    /* renamed from: com.adcolony.sdk.i$a */
    class C0123a implements C0028a0 {
        C0123a() {
        }

        /* renamed from: a */
        public void mo278a(C0284y yVar) {
            int f = C0267t.m817f(yVar.mo736b(), "number");
            JSONObject b = C0267t.m805b();
            C0267t.m799a(b, "uuids", C0190l0.m505a(f));
            yVar.mo735a(b).mo740d();
        }
    }

    /* renamed from: com.adcolony.sdk.i$b */
    class C0124b implements C0028a0 {

        /* renamed from: com.adcolony.sdk.i$b$a */
        class C0125a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ Context f919a;

            /* renamed from: b */
            final /* synthetic */ C0284y f920b;

            C0125a(Context context, C0284y yVar) {
                this.f919a = context;
                this.f920b = yVar;
            }

            public void run() {
                C0122i.this.mo431a(this.f919a, this.f920b);
            }
        }

        C0124b() {
        }

        /* renamed from: a */
        public void mo278a(C0284y yVar) {
            Context b = C0026a.m78b();
            if (b != null) {
                C0190l0.f1041b.execute(new C0125a(b, yVar));
            }
        }
    }

    /* renamed from: com.adcolony.sdk.i$c */
    class C0126c implements C0028a0 {
        C0126c() {
        }

        /* renamed from: a */
        public void mo278a(C0284y yVar) {
            C0114f0 a = C0122i.this.mo450m().mo722a();
            C0122i.this.mo445h().mo519b(C0267t.m819h(yVar.mo736b(), "version"));
            if (a != null) {
                a.mo389e(C0122i.this.mo445h().mo529j());
            }
        }
    }

    /* renamed from: com.adcolony.sdk.i$d */
    class C0127d implements Runnable {
        C0127d() {
        }

        public void run() {
            Context b = C0026a.m78b();
            if (!C0122i.this.f885M && b != null) {
                try {
                    Omid.activate(b.getApplicationContext());
                    boolean unused = C0122i.this.f885M = true;
                } catch (IllegalArgumentException unused2) {
                    new C0269v.C0270a().mo707a("IllegalArgumentException when activating Omid").mo709a(C0269v.f1300j);
                    boolean unused3 = C0122i.this.f885M = false;
                }
            }
            if (C0122i.this.f885M && C0122i.this.f890R == null) {
                try {
                    Partner unused4 = C0122i.this.f890R = Partner.createPartner("AdColony", "4.4.1");
                } catch (IllegalArgumentException unused5) {
                    new C0269v.C0270a().mo707a("IllegalArgumentException when creating Omid Partner").mo709a(C0269v.f1300j);
                    boolean unused6 = C0122i.this.f885M = false;
                }
            }
        }
    }

    /* renamed from: com.adcolony.sdk.i$e */
    class C0128e implements Runnable {
        C0128e() {
        }

        public void run() {
            JSONObject b = C0267t.m805b();
            C0267t.m798a(b, "url", C0122i.f871U);
            C0267t.m798a(b, "content_type", "application/json");
            C0267t.m798a(b, "content", C0190l0.m506a(C0122i.this.mo445h().mo515a(true)).toString());
            C0122i.this.f893c.mo609a(new C0193m(new C0284y("WebServices.post", 0, b), C0122i.this));
        }
    }

    /* renamed from: com.adcolony.sdk.i$f */
    class C0129f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f925a;

        /* renamed from: b */
        final /* synthetic */ boolean f926b;

        /* renamed from: c */
        final /* synthetic */ C0284y f927c;

        C0129f(Context context, boolean z, C0284y yVar) {
            this.f925a = context;
            this.f926b = z;
            this.f927c = yVar;
        }

        public void run() {
            C0210n0 n0Var = new C0210n0(this.f925a.getApplicationContext(), C0122i.this.f892b.mo750d(), this.f926b);
            n0Var.mo619a(true, this.f927c);
            C0122i.this.f912v.put(Integer.valueOf(n0Var.mo287d()), n0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.i$g */
    class C0130g implements Runnable {

        /* renamed from: com.adcolony.sdk.i$g$a */
        class C0131a implements Runnable {
            C0131a() {
            }

            public void run() {
                if (C0026a.m80c().mo458u().mo403e()) {
                    C0122i.this.m268E();
                }
            }
        }

        C0130g() {
        }

        public void run() {
            new Handler().postDelayed(new C0131a(), (long) (C0122i.this.f887O * 1000));
        }
    }

    /* renamed from: com.adcolony.sdk.i$h */
    class C0132h implements Runnable {
        C0132h() {
        }

        public void run() {
            boolean unused = C0122i.this.m269F();
        }
    }

    /* renamed from: com.adcolony.sdk.i$i */
    class C0133i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C0210n0 f932a;

        C0133i(C0210n0 n0Var) {
            this.f932a = n0Var;
        }

        public void run() {
            C0210n0 n0Var = this.f932a;
            if (n0Var != null && n0Var.mo641y()) {
                this.f932a.loadUrl("about:blank");
                this.f932a.clearCache(true);
                this.f932a.removeAllViews();
                this.f932a.mo618a(true);
                this.f932a.destroy();
            }
        }
    }

    /* renamed from: com.adcolony.sdk.i$j */
    class C0134j implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C0284y f934a;

        C0134j(C0284y yVar) {
            this.f934a = yVar;
        }

        public void run() {
            C0122i.this.f906p.onReward(new AdColonyReward(this.f934a));
        }
    }

    /* renamed from: com.adcolony.sdk.i$k */
    class C0135k implements C0028a0 {
        C0135k() {
        }

        /* renamed from: a */
        public void mo278a(C0284y yVar) {
            boolean unused = C0122i.this.m291c(yVar);
        }
    }

    /* renamed from: com.adcolony.sdk.i$l */
    class C0136l implements Application.ActivityLifecycleCallbacks {
        C0136l() {
        }

        public void onActivityCreated(@NonNull Activity activity, Bundle bundle) {
            if (!C0122i.this.f894d.mo403e()) {
                C0122i.this.f894d.mo399c(true);
            }
            C0026a.m74a(activity);
        }

        public void onActivityDestroyed(@NonNull Activity activity) {
        }

        public void onActivityPaused(@NonNull Activity activity) {
            C0026a.f112d = false;
            C0122i.this.f894d.mo400d(false);
            C0122i.this.f894d.mo402e(true);
        }

        public void onActivityResumed(@NonNull Activity activity) {
            ScheduledExecutorService scheduledExecutorService;
            C0026a.f112d = true;
            C0026a.m74a(activity);
            C0114f0 a = C0122i.this.mo450m().mo722a();
            Context b = C0026a.m78b();
            if (b == null || !C0122i.this.f894d.mo401d() || !(b instanceof C0029b) || ((C0029b) b).f120e) {
                C0026a.m74a(activity);
                if (C0122i.this.f909s != null) {
                    C0122i.this.f909s.mo735a(C0122i.this.f909s.mo736b()).mo740d();
                    C0284y unused = C0122i.this.f909s = null;
                }
                boolean unused2 = C0122i.this.f875C = false;
                C0122i.this.f894d.mo400d(true);
                C0122i.this.f894d.mo402e(true);
                C0122i.this.f894d.mo404f(false);
                if (C0122i.this.f878F && !C0122i.this.f894d.mo403e()) {
                    C0122i.this.f894d.mo399c(true);
                }
                C0122i.this.f896f.mo570c();
                if (a == null || (scheduledExecutorService = a.f829b) == null || scheduledExecutorService.isShutdown() || a.f829b.isTerminated()) {
                    AdColony.m2a((Context) activity, C0026a.m80c().f908r);
                }
            }
        }

        public void onActivitySaveInstanceState(@NonNull Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(@NonNull Activity activity) {
        }

        public void onActivityStopped(@NonNull Activity activity) {
        }
    }

    /* renamed from: com.adcolony.sdk.i$m */
    class C0137m implements C0028a0 {
        C0137m() {
        }

        /* renamed from: a */
        public void mo278a(C0284y yVar) {
            C0122i.this.m274a(yVar);
        }
    }

    /* renamed from: com.adcolony.sdk.i$n */
    class C0138n implements C0028a0 {
        C0138n() {
        }

        /* renamed from: a */
        public void mo278a(C0284y yVar) {
            C0114f0 a = C0122i.this.mo450m().mo722a();
            boolean unused = C0122i.this.f877E = true;
            if (C0122i.this.f883K) {
                JSONObject b = C0267t.m805b();
                JSONObject b2 = C0267t.m805b();
                C0267t.m798a(b2, "app_version", C0190l0.m522c());
                C0267t.m800a(b, "app_bundle_info", b2);
                new C0284y("AdColony.on_update", 1, b).mo740d();
                boolean unused2 = C0122i.this.f883K = false;
            }
            if (C0122i.this.f884L) {
                new C0284y("AdColony.on_install", 1).mo740d();
            }
            if (a != null) {
                a.mo390f(C0267t.m819h(yVar.mo736b(), "app_session_id"));
            }
            if (AdColonyEventTracker.m35a()) {
                AdColonyEventTracker.m37b();
            }
            int a2 = C0267t.m784a(yVar.mo736b(), "concurrent_requests", 4);
            if (a2 != C0122i.this.f893c.mo607a()) {
                C0122i.this.f893c.mo608a(a2);
            }
            C0122i.this.m270G();
        }
    }

    /* renamed from: com.adcolony.sdk.i$o */
    class C0139o implements C0028a0 {
        C0139o() {
        }

        /* renamed from: a */
        public void mo278a(C0284y yVar) {
            C0122i.this.m285b(yVar);
        }
    }

    /* renamed from: com.adcolony.sdk.i$p */
    class C0140p implements C0028a0 {
        C0140p() {
        }

        /* renamed from: a */
        public void mo278a(C0284y yVar) {
            boolean unused = C0122i.this.m298e(yVar);
        }
    }

    /* renamed from: com.adcolony.sdk.i$q */
    class C0141q implements C0028a0 {
        C0141q() {
        }

        /* renamed from: a */
        public void mo278a(C0284y yVar) {
            C0122i.this.m301f(yVar);
        }
    }

    /* renamed from: com.adcolony.sdk.i$r */
    class C0142r implements C0028a0 {
        C0142r() {
        }

        /* renamed from: a */
        public void mo278a(C0284y yVar) {
            boolean unused = C0122i.this.m282a(true, true);
        }
    }

    /* renamed from: com.adcolony.sdk.i$s */
    class C0143s implements C0028a0 {
        C0143s() {
        }

        /* renamed from: a */
        public void mo278a(C0284y yVar) {
            JSONObject b = C0267t.m805b();
            C0267t.m798a(b, "sha1", C0190l0.m519b(C0267t.m819h(yVar.mo736b(), "data")));
            yVar.mo735a(b).mo740d();
        }
    }

    /* renamed from: com.adcolony.sdk.i$t */
    class C0144t implements C0028a0 {
        C0144t() {
        }

        /* renamed from: a */
        public void mo278a(C0284y yVar) {
            JSONObject b = C0267t.m805b();
            C0267t.m808b(b, "crc32", C0190l0.m500a(C0267t.m819h(yVar.mo736b(), "data")));
            yVar.mo735a(b).mo740d();
        }
    }

    C0122i() {
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public void m268E() {
        new Thread(new C0128e()).start();
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public boolean m269F() {
        this.f892b.mo743a();
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public void m270G() {
        JSONObject b = C0267t.m805b();
        C0267t.m798a(b, "type", "AdColony.on_configuration_completed");
        JSONArray jSONArray = new JSONArray();
        for (String put : mo462y().keySet()) {
            jSONArray.put(put);
        }
        JSONObject b2 = C0267t.m805b();
        C0267t.m799a(b2, "zone_ids", jSONArray);
        C0267t.m800a(b, MessageManager.NAME_ERROR_MESSAGE, b2);
        new C0284y("CustomMessage.controller_send", 0, b).mo740d();
    }

    /* renamed from: H */
    private void m271H() {
        Context b = C0026a.m78b();
        if (b != null && this.f889Q == null && Build.VERSION.SDK_INT > 14) {
            this.f889Q = new C0136l();
            (b instanceof Application ? (Application) b : ((Activity) b).getApplication()).registerActivityLifecycleCallbacks(this.f889Q);
        }
    }

    /* renamed from: I */
    private void m272I() {
        if (C0026a.m80c().mo458u().mo403e()) {
            int i = this.f886N + 1;
            this.f886N = i;
            this.f887O = Math.min(this.f887O * i, 120);
            C0190l0.m510a((Runnable) new C0130g());
            return;
        }
        new C0269v.C0270a().mo707a("Max launch server download attempts hit, or AdColony is no longer").mo707a(" active.").mo709a(C0269v.f1298h);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m274a(C0284y yVar) {
        mo430a(C0267t.m817f(yVar.mo736b(), "id"));
    }

    /* renamed from: a */
    private boolean m279a(String str) {
        Context b = C0026a.m78b();
        if (b == null) {
            return false;
        }
        File file = new File(b.getFilesDir().getAbsolutePath() + "/adc3/" + f870T);
        if (file.exists()) {
            return C0190l0.m512a(str, file);
        }
        return false;
    }

    /* renamed from: a */
    private boolean m280a(JSONObject jSONObject) {
        if (!this.f879G) {
            return true;
        }
        JSONObject jSONObject2 = this.f910t;
        if (jSONObject2 != null && C0267t.m819h(C0267t.m818g(jSONObject2, "controller"), "sha1").equals(C0267t.m819h(C0267t.m818g(jSONObject, "controller"), "sha1"))) {
            return false;
        }
        new C0269v.C0270a().mo707a("Controller sha1 does not match, downloading new controller.").mo709a(C0269v.f1298h);
        return true;
    }

    /* renamed from: a */
    private boolean m281a(boolean z) {
        return m282a(z, false);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m282a(boolean z, boolean z2) {
        if (!C0026a.m81d()) {
            return false;
        }
        this.f882J = z2;
        this.f879G = z;
        if (z && !z2 && !m269F()) {
            return false;
        }
        m268E();
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m285b(C0284y yVar) {
        JSONObject b = this.f908r.mo164b();
        C0267t.m798a(b, "app_id", this.f908r.mo163a());
        C0267t.m799a(b, "zone_ids", this.f908r.mo167d());
        JSONObject b2 = C0267t.m805b();
        C0267t.m800a(b2, "options", b);
        yVar.mo735a(b2).mo740d();
    }

    /* renamed from: b */
    private void m286b(JSONObject jSONObject) {
        if (!C0210n0.f1129O) {
            JSONObject g = C0267t.m818g(jSONObject, "logging");
            C0273x.f1321n = C0267t.m784a(g, "send_level", 1);
            C0273x.f1312e = C0267t.m814d(g, "log_private");
            C0273x.f1320m = C0267t.m784a(g, "print_level", 3);
            this.f900j.mo730b(C0267t.m810c(g, "modules"));
        }
        JSONObject g2 = C0267t.m818g(jSONObject, "metadata");
        mo445h().mo517a(g2);
        mo458u().mo394a(C0267t.m817f(g2, "session_timeout"));
        this.f873A = C0267t.m819h(C0267t.m818g(jSONObject, "controller"), "version");
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public boolean m291c(C0284y yVar) {
        Context b = C0026a.m78b();
        if (b == null) {
            return false;
        }
        try {
            int f = yVar.mo736b().has("id") ? C0267t.m817f(yVar.mo736b(), "id") : 0;
            if (f <= 0) {
                f = this.f892b.mo750d();
            }
            mo430a(f);
            C0190l0.m510a((Runnable) new C0129f(b, C0267t.m814d(yVar.mo736b(), "is_display_module"), yVar));
            return true;
        } catch (RuntimeException e) {
            C0269v.C0270a aVar = new C0269v.C0270a();
            aVar.mo707a(e.toString() + ": during WebView initialization.").mo707a(" Disabling AdColony.").mo709a(C0269v.f1299i);
            AdColony.disable();
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        new java.io.File(r3.f899i.mo411a() + f869S).delete();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0037 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m292c(org.json.JSONObject r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.lang.String r1 = "controller"
            org.json.JSONObject r1 = com.adcolony.sdk.C0267t.m818g(r4, r1)     // Catch:{ Exception -> 0x0037 }
            java.lang.String r2 = "url"
            java.lang.String r2 = com.adcolony.sdk.C0267t.m819h(r1, r2)     // Catch:{ Exception -> 0x0037 }
            r3.f914x = r2     // Catch:{ Exception -> 0x0037 }
            java.lang.String r2 = "sha1"
            java.lang.String r1 = com.adcolony.sdk.C0267t.m819h(r1, r2)     // Catch:{ Exception -> 0x0037 }
            r3.f915y = r1     // Catch:{ Exception -> 0x0037 }
            java.lang.String r1 = "status"
            java.lang.String r1 = com.adcolony.sdk.C0267t.m819h(r4, r1)     // Catch:{ Exception -> 0x0037 }
            r3.f916z = r1     // Catch:{ Exception -> 0x0037 }
            java.lang.String r1 = "pie"
            java.lang.String r1 = com.adcolony.sdk.C0267t.m819h(r4, r1)     // Catch:{ Exception -> 0x0037 }
            f872V = r1     // Catch:{ Exception -> 0x0037 }
            boolean r1 = com.adcolony.sdk.AdColonyEventTracker.m35a()     // Catch:{ Exception -> 0x0037 }
            if (r1 == 0) goto L_0x0033
            com.adcolony.sdk.AdColonyEventTracker.m37b()     // Catch:{ Exception -> 0x0037 }
        L_0x0033:
            r3.m286b((org.json.JSONObject) r4)     // Catch:{ Exception -> 0x0037 }
            goto L_0x0058
        L_0x0037:
            java.io.File r4 = new java.io.File     // Catch:{ Exception -> 0x0057 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0057 }
            r1.<init>()     // Catch:{ Exception -> 0x0057 }
            com.adcolony.sdk.h0 r2 = r3.f899i     // Catch:{ Exception -> 0x0057 }
            java.lang.String r2 = r2.mo411a()     // Catch:{ Exception -> 0x0057 }
            r1.append(r2)     // Catch:{ Exception -> 0x0057 }
            java.lang.String r2 = "026ae9c9824b3e483fa6c71fa88f57ae27816141"
            r1.append(r2)     // Catch:{ Exception -> 0x0057 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0057 }
            r4.<init>(r1)     // Catch:{ Exception -> 0x0057 }
            r4.delete()     // Catch:{ Exception -> 0x0057 }
            goto L_0x0058
        L_0x0057:
        L_0x0058:
            java.lang.String r4 = r3.f916z
            java.lang.String r1 = "disable"
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L_0x009f
            boolean r4 = com.adcolony.sdk.C0210n0.f1129O
            if (r4 != 0) goto L_0x009f
            java.io.File r4 = new java.io.File     // Catch:{ Exception -> 0x0085 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0085 }
            r1.<init>()     // Catch:{ Exception -> 0x0085 }
            com.adcolony.sdk.h0 r2 = r3.f899i     // Catch:{ Exception -> 0x0085 }
            java.lang.String r2 = r2.mo411a()     // Catch:{ Exception -> 0x0085 }
            r1.append(r2)     // Catch:{ Exception -> 0x0085 }
            java.lang.String r2 = "7bf3a1e7bbd31e612eda3310c2cdb8075c43c6b5"
            r1.append(r2)     // Catch:{ Exception -> 0x0085 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0085 }
            r4.<init>(r1)     // Catch:{ Exception -> 0x0085 }
            r4.delete()     // Catch:{ Exception -> 0x0085 }
        L_0x0085:
            com.adcolony.sdk.v$a r4 = new com.adcolony.sdk.v$a
            r4.<init>()
            java.lang.String r1 = "Launch server response with disabled status. Disabling AdColony "
            com.adcolony.sdk.v$a r4 = r4.mo707a((java.lang.String) r1)
            java.lang.String r1 = "until next launch."
            com.adcolony.sdk.v$a r4 = r4.mo707a((java.lang.String) r1)
            com.adcolony.sdk.v r1 = com.adcolony.sdk.C0269v.f1298h
            r4.mo709a((com.adcolony.sdk.C0269v) r1)
            com.adcolony.sdk.AdColony.disable()
            return r0
        L_0x009f:
            java.lang.String r4 = r3.f914x
            java.lang.String r1 = ""
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x00b3
            java.lang.String r4 = r3.f916z
            java.lang.String r1 = ""
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L_0x00ce
        L_0x00b3:
            boolean r4 = com.adcolony.sdk.C0210n0.f1129O
            if (r4 != 0) goto L_0x00ce
            com.adcolony.sdk.v$a r4 = new com.adcolony.sdk.v$a
            r4.<init>()
            java.lang.String r1 = "Missing controller status or URL. Disabling AdColony until next "
            com.adcolony.sdk.v$a r4 = r4.mo707a((java.lang.String) r1)
            java.lang.String r1 = "launch."
            com.adcolony.sdk.v$a r4 = r4.mo707a((java.lang.String) r1)
            com.adcolony.sdk.v r1 = com.adcolony.sdk.C0269v.f1300j
            r4.mo709a((com.adcolony.sdk.C0269v) r1)
            return r0
        L_0x00ce:
            r4 = 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.C0122i.m292c(org.json.JSONObject):boolean");
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public boolean m298e(C0284y yVar) {
        if (this.f906p == null) {
            return false;
        }
        C0190l0.m510a((Runnable) new C0134j(yVar));
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m301f(C0284y yVar) {
        AdColonyZone adColonyZone;
        if (!this.f876D) {
            String h = C0267t.m819h(yVar.mo736b(), "zone_id");
            if (this.f911u.containsKey(h)) {
                adColonyZone = this.f911u.get(h);
            } else {
                AdColonyZone adColonyZone2 = new AdColonyZone(h);
                this.f911u.put(h, adColonyZone2);
                adColonyZone = adColonyZone2;
            }
            adColonyZone.mo264a(yVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public boolean mo418A() {
        return this.f875C;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public boolean mo419B() {
        return this.f876D;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public boolean mo420C() {
        return this.f877E;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public boolean mo421D() {
        return this.f874B;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Context mo422a() {
        return C0026a.m78b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo423a(AdColonyAdView adColonyAdView) {
        this.f904n = adColonyAdView;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo424a(AdColonyAppOptions adColonyAppOptions) {
        synchronized (this.f895e.mo334a()) {
            for (Map.Entry<String, AdColonyInterstitial> value : this.f895e.mo334a().entrySet()) {
                AdColonyInterstitial adColonyInterstitial = (AdColonyInterstitial) value.getValue();
                AdColonyInterstitialListener listener = adColonyInterstitial.getListener();
                adColonyInterstitial.mo214a(true);
                if (listener != null) {
                    listener.onExpiring(adColonyInterstitial);
                }
            }
            this.f895e.mo334a().clear();
        }
        this.f877E = false;
        AdColony.m2a(C0026a.m78b(), adColonyAppOptions);
        mo430a(1);
        this.f911u.clear();
        this.f908r = adColonyAppOptions;
        this.f892b.mo743a();
        m282a(true, true);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0101  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo425a(com.adcolony.sdk.AdColonyAppOptions r4, boolean r5) {
        /*
            r3 = this;
            r3.f876D = r5
            r3.f908r = r4
            com.adcolony.sdk.z r0 = new com.adcolony.sdk.z
            r0.<init>()
            r3.f892b = r0
            com.adcolony.sdk.j r0 = new com.adcolony.sdk.j
            r0.<init>()
            r3.f891a = r0
            com.adcolony.sdk.k r0 = new com.adcolony.sdk.k
            r0.<init>()
            r3.f901k = r0
            r0.mo510H()
            com.adcolony.sdk.n r0 = new com.adcolony.sdk.n
            r0.<init>()
            r3.f893c = r0
            r0.mo611b()
            com.adcolony.sdk.g0 r0 = new com.adcolony.sdk.g0
            r0.<init>()
            r3.f894d = r0
            r0.mo398c()
            com.adcolony.sdk.d r0 = new com.adcolony.sdk.d
            r0.<init>()
            r3.f895e = r0
            r0.mo347e()
            com.adcolony.sdk.l r0 = new com.adcolony.sdk.l
            r0.<init>()
            r3.f896f = r0
            com.adcolony.sdk.q r0 = new com.adcolony.sdk.q
            r0.<init>()
            r3.f897g = r0
            r0.mo686b()
            com.adcolony.sdk.x r0 = new com.adcolony.sdk.x
            r0.<init>()
            r3.f900j = r0
            r0.mo728b()
            com.adcolony.sdk.h0 r0 = new com.adcolony.sdk.h0
            r0.<init>()
            r3.f899i = r0
            r0.mo415e()
            com.adcolony.sdk.j0 r0 = new com.adcolony.sdk.j0
            r0.<init>()
            r3.f898h = r0
            r0.mo487a()
            com.adcolony.sdk.c0 r0 = new com.adcolony.sdk.c0
            r0.<init>()
            r3.f902l = r0
            java.lang.String r0 = r0.mo331a()
            r3.f913w = r0
            android.content.Context r0 = com.adcolony.sdk.C0026a.m78b()
            com.adcolony.sdk.AdColony.m2a((android.content.Context) r0, (com.adcolony.sdk.AdColonyAppOptions) r4)
            r4 = 0
            r0 = 1
            if (r5 != 0) goto L_0x0129
            java.io.File r5 = new java.io.File
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            com.adcolony.sdk.h0 r2 = r3.f899i
            java.lang.String r2 = r2.mo411a()
            r1.append(r2)
            java.lang.String r2 = "026ae9c9824b3e483fa6c71fa88f57ae27816141"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r5.<init>(r1)
            boolean r5 = r5.exists()
            r3.f880H = r5
            java.io.File r5 = new java.io.File
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            com.adcolony.sdk.h0 r2 = r3.f899i
            java.lang.String r2 = r2.mo411a()
            r1.append(r2)
            java.lang.String r2 = "7bf3a1e7bbd31e612eda3310c2cdb8075c43c6b5"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r5.<init>(r1)
            boolean r5 = r5.exists()
            r3.f881I = r5
            boolean r1 = r3.f880H
            if (r1 == 0) goto L_0x00fa
            if (r5 == 0) goto L_0x00fa
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            com.adcolony.sdk.h0 r1 = r3.f899i
            java.lang.String r1 = r1.mo411a()
            r5.append(r1)
            java.lang.String r1 = "026ae9c9824b3e483fa6c71fa88f57ae27816141"
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            org.json.JSONObject r5 = com.adcolony.sdk.C0267t.m811c(r5)
            java.lang.String r1 = "sdkVersion"
            java.lang.String r5 = com.adcolony.sdk.C0267t.m819h(r5, r1)
            com.adcolony.sdk.k r1 = r3.f901k
            java.lang.String r1 = r1.mo505C()
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L_0x00fa
            r5 = 1
            goto L_0x00fb
        L_0x00fa:
            r5 = 0
        L_0x00fb:
            r3.f879G = r5
            boolean r5 = r3.f880H
            if (r5 == 0) goto L_0x0121
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            com.adcolony.sdk.h0 r1 = r3.f899i
            java.lang.String r1 = r1.mo411a()
            r5.append(r1)
            java.lang.String r1 = "026ae9c9824b3e483fa6c71fa88f57ae27816141"
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            org.json.JSONObject r5 = com.adcolony.sdk.C0267t.m811c(r5)
            r3.f910t = r5
            r3.m286b((org.json.JSONObject) r5)
        L_0x0121:
            boolean r5 = r3.f879G
            r3.m281a((boolean) r5)
            r3.m271H()
        L_0x0129:
            com.adcolony.sdk.i$k r5 = new com.adcolony.sdk.i$k
            r5.<init>()
            java.lang.String r1 = "Module.load"
            com.adcolony.sdk.C0026a.m76a((java.lang.String) r1, (com.adcolony.sdk.C0028a0) r5)
            com.adcolony.sdk.i$m r5 = new com.adcolony.sdk.i$m
            r5.<init>()
            java.lang.String r1 = "Module.unload"
            com.adcolony.sdk.C0026a.m76a((java.lang.String) r1, (com.adcolony.sdk.C0028a0) r5)
            com.adcolony.sdk.i$n r5 = new com.adcolony.sdk.i$n
            r5.<init>()
            java.lang.String r1 = "AdColony.on_configured"
            com.adcolony.sdk.C0026a.m76a((java.lang.String) r1, (com.adcolony.sdk.C0028a0) r5)
            com.adcolony.sdk.i$o r5 = new com.adcolony.sdk.i$o
            r5.<init>()
            java.lang.String r1 = "AdColony.get_app_info"
            com.adcolony.sdk.C0026a.m76a((java.lang.String) r1, (com.adcolony.sdk.C0028a0) r5)
            com.adcolony.sdk.i$p r5 = new com.adcolony.sdk.i$p
            r5.<init>()
            java.lang.String r1 = "AdColony.v4vc_reward"
            com.adcolony.sdk.C0026a.m76a((java.lang.String) r1, (com.adcolony.sdk.C0028a0) r5)
            com.adcolony.sdk.i$q r5 = new com.adcolony.sdk.i$q
            r5.<init>()
            java.lang.String r1 = "AdColony.zone_info"
            com.adcolony.sdk.C0026a.m76a((java.lang.String) r1, (com.adcolony.sdk.C0028a0) r5)
            com.adcolony.sdk.i$r r5 = new com.adcolony.sdk.i$r
            r5.<init>()
            java.lang.String r1 = "AdColony.probe_launch_server"
            com.adcolony.sdk.C0026a.m76a((java.lang.String) r1, (com.adcolony.sdk.C0028a0) r5)
            com.adcolony.sdk.i$s r5 = new com.adcolony.sdk.i$s
            r5.<init>()
            java.lang.String r1 = "Crypto.sha1"
            com.adcolony.sdk.C0026a.m76a((java.lang.String) r1, (com.adcolony.sdk.C0028a0) r5)
            com.adcolony.sdk.i$t r5 = new com.adcolony.sdk.i$t
            r5.<init>()
            java.lang.String r1 = "Crypto.crc32"
            com.adcolony.sdk.C0026a.m76a((java.lang.String) r1, (com.adcolony.sdk.C0028a0) r5)
            com.adcolony.sdk.i$a r5 = new com.adcolony.sdk.i$a
            r5.<init>()
            java.lang.String r1 = "Crypto.uuid"
            com.adcolony.sdk.C0026a.m76a((java.lang.String) r1, (com.adcolony.sdk.C0028a0) r5)
            com.adcolony.sdk.i$b r5 = new com.adcolony.sdk.i$b
            r5.<init>()
            java.lang.String r1 = "Device.query_advertiser_info"
            com.adcolony.sdk.C0026a.m76a((java.lang.String) r1, (com.adcolony.sdk.C0028a0) r5)
            com.adcolony.sdk.i$c r5 = new com.adcolony.sdk.i$c
            r5.<init>()
            java.lang.String r1 = "AdColony.controller_version"
            com.adcolony.sdk.C0026a.m76a((java.lang.String) r1, (com.adcolony.sdk.C0028a0) r5)
            com.adcolony.sdk.h0 r5 = r3.f899i
            int r5 = com.adcolony.sdk.C0190l0.m499a((com.adcolony.sdk.C0121h0) r5)
            if (r5 != r0) goto L_0x01ab
            r1 = 1
            goto L_0x01ac
        L_0x01ab:
            r1 = 0
        L_0x01ac:
            r3.f883K = r1
            r1 = 2
            if (r5 != r1) goto L_0x01b2
            r4 = 1
        L_0x01b2:
            r3.f884L = r4
            com.adcolony.sdk.i$d r4 = new com.adcolony.sdk.i$d
            r4.<init>()
            com.adcolony.sdk.C0190l0.m510a((java.lang.Runnable) r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.C0122i.mo425a(com.adcolony.sdk.AdColonyAppOptions, boolean):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo426a(AdColonyInterstitial adColonyInterstitial) {
        this.f905o = adColonyInterstitial;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo427a(AdColonyRewardListener adColonyRewardListener) {
        this.f906p = adColonyRewardListener;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo428a(C0032c cVar) {
        this.f903m = cVar;
    }

    /* renamed from: a */
    public void mo429a(C0193m mVar, C0284y yVar, Map<String, List<String>> map) {
        if (mVar.f1061n.equals(f871U)) {
            if (mVar.f1063p) {
                JSONObject a = C0267t.m789a(mVar.f1062o, "Parsing launch response");
                C0267t.m798a(a, "sdkVersion", mo445h().mo505C());
                C0267t.m820i(a, this.f899i.mo411a() + f869S);
                if (m292c(a)) {
                    if (m280a(a)) {
                        JSONObject b = C0267t.m805b();
                        C0267t.m798a(b, "url", this.f914x);
                        C0267t.m798a(b, "filepath", this.f899i.mo411a() + f870T);
                        this.f893c.mo609a(new C0193m(new C0284y("WebServices.download", 0, b), this));
                    }
                    this.f910t = a;
                } else if (!this.f879G) {
                    new C0269v.C0270a().mo707a("Incomplete or disabled launch server response. ").mo707a("Disabling AdColony until next launch.").mo709a(C0269v.f1299i);
                    mo435b(true);
                }
            } else {
                m272I();
            }
        } else if (!mVar.f1061n.equals(this.f914x)) {
        } else {
            if (!m279a(this.f915y) && !C0210n0.f1129O) {
                new C0269v.C0270a().mo707a("Downloaded controller sha1 does not match, retrying.").mo709a(C0269v.f1297g);
                m272I();
            } else if (!this.f879G && !this.f882J) {
                C0190l0.m510a((Runnable) new C0132h());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo430a(int i) {
        C0031b0 a = this.f892b.mo741a(i);
        C0210n0 remove = this.f912v.remove(Integer.valueOf(i));
        boolean z = false;
        if (a == null) {
            return false;
        }
        if (remove != null && remove.mo642z()) {
            z = true;
        }
        C0133i iVar = new C0133i(remove);
        if (z) {
            if (Looper.myLooper() == null) {
                Looper.prepare();
            }
            new Handler().postDelayed(iVar, 1000);
        } else {
            iVar.run();
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo431a(Context context, C0284y yVar) {
        boolean z;
        if (context == null) {
            return false;
        }
        String str = "";
        AdvertisingIdClient.Info info = null;
        C0114f0 a = mo450m().mo722a();
        try {
            info = AdvertisingIdClient.getAdvertisingIdInfo(context);
        } catch (NoClassDefFoundError unused) {
            new C0269v.C0270a().mo707a("Google Play Services ads dependencies are missing. Collecting ").mo707a("Android ID instead of Advertising ID.").mo709a(C0269v.f1297g);
            return false;
        } catch (NoSuchMethodError unused2) {
            new C0269v.C0270a().mo707a("Google Play Services is out of date, please update to GPS 4.0+. ").mo707a("Collecting Android ID instead of Advertising ID.").mo709a(C0269v.f1297g);
        } catch (Exception e) {
            e.printStackTrace();
            if (!Build.MANUFACTURER.equals("Amazon")) {
                new C0269v.C0270a().mo707a("Advertising ID is not available. Collecting Android ID instead of").mo707a(" Advertising ID.").mo709a(C0269v.f1297g);
                return false;
            }
            str = mo445h().mo521c();
            z = mo445h().mo523d();
        }
        z = false;
        String str2 = Build.MANUFACTURER;
        if (!str2.equals("Amazon") && info == null) {
            return false;
        }
        if (!str2.equals("Amazon")) {
            str = info.getId();
            z = info.isLimitAdTrackingEnabled();
        }
        mo445h().mo516a(str);
        if (a != null) {
            a.f832e.put("advertisingId", mo445h().mo518b());
        }
        mo445h().mo522c(z);
        mo445h().mo520b(true);
        if (yVar != null) {
            JSONObject b = C0267t.m805b();
            C0267t.m798a(b, "advertiser_id", mo445h().mo518b());
            C0267t.m809b(b, "limit_ad_tracking", mo445h().mo540u());
            yVar.mo735a(b).mo740d();
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C0046d mo432b() {
        if (this.f895e == null) {
            C0046d dVar = new C0046d();
            this.f895e = dVar;
            dVar.mo347e();
        }
        return this.f895e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo433b(@NonNull AdColonyAppOptions adColonyAppOptions) {
        this.f908r = adColonyAppOptions;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo434b(String str) {
        this.f913w = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo435b(boolean z) {
        this.f876D = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public String mo436c() {
        return this.f873A;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo437c(boolean z) {
        this.f875C = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public AdColonyInterstitial mo438d() {
        return this.f905o;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo439d(C0284y yVar) {
        this.f909s = yVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo440d(boolean z) {
        this.f878F = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public AdColonyAdView mo441e() {
        return this.f904n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo442e(boolean z) {
        this.f874B = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C0032c mo443f() {
        return this.f903m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public HashMap<String, AdColonyCustomMessageListener> mo444g() {
        return this.f907q;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public C0167k mo445h() {
        if (this.f901k == null) {
            C0167k kVar = new C0167k();
            this.f901k = kVar;
            kVar.mo510H();
        }
        return this.f901k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C0184l mo446i() {
        if (this.f896f == null) {
            this.f896f = new C0184l();
        }
        return this.f896f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public C0206n mo447j() {
        if (this.f893c == null) {
            this.f893c = new C0206n();
        }
        return this.f893c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public C0243q mo448k() {
        if (this.f897g == null) {
            C0243q qVar = new C0243q();
            this.f897g = qVar;
            qVar.mo686b();
        }
        return this.f897g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public JSONObject mo449l() {
        return this.f910t;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public C0273x mo450m() {
        if (this.f900j == null) {
            C0273x xVar = new C0273x();
            this.f900j = xVar;
            xVar.mo728b();
        }
        return this.f900j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public C0285z mo451n() {
        if (this.f892b == null) {
            C0285z zVar = new C0285z();
            this.f892b = zVar;
            zVar.mo743a();
        }
        return this.f892b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public C0045c0 mo452o() {
        if (this.f902l == null) {
            this.f902l = new C0045c0();
        }
        return this.f902l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public String mo453p() {
        return this.f913w;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public Partner mo454q() {
        return this.f890R;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public AdColonyAppOptions mo455r() {
        if (this.f908r == null) {
            this.f908r = new AdColonyAppOptions();
        }
        return this.f908r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public String mo456s() {
        return f872V;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public AdColonyRewardListener mo457t() {
        return this.f906p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public C0118g0 mo458u() {
        if (this.f894d == null) {
            C0118g0 g0Var = new C0118g0();
            this.f894d = g0Var;
            g0Var.mo398c();
        }
        return this.f894d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public C0121h0 mo459v() {
        if (this.f899i == null) {
            C0121h0 h0Var = new C0121h0();
            this.f899i = h0Var;
            h0Var.mo415e();
        }
        return this.f899i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public C0148j0 mo460w() {
        if (this.f898h == null) {
            C0148j0 j0Var = new C0148j0();
            this.f898h = j0Var;
            j0Var.mo487a();
        }
        return this.f898h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public HashMap<Integer, C0210n0> mo461x() {
        return this.f912v;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public HashMap<String, AdColonyZone> mo462y() {
        return this.f911u;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public boolean mo463z() {
        return this.f908r != null;
    }
}
