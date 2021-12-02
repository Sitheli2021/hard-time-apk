package com.adcolony.sdk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.VideoView;
import androidx.annotation.FloatRange;
import com.adcolony.sdk.C0269v;
import com.iab.omid.library.adcolony.adsession.AdSession;
import com.iab.omid.library.adcolony.adsession.FriendlyObstructionPurpose;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.adcolony.sdk.c */
class C0032c extends FrameLayout {

    /* renamed from: a */
    private HashMap<Integer, C0195m0> f127a;

    /* renamed from: b */
    private HashMap<Integer, C0173k0> f128b;

    /* renamed from: c */
    private HashMap<Integer, C0210n0> f129c;

    /* renamed from: d */
    private HashMap<Integer, C0226o> f130d;

    /* renamed from: e */
    private HashMap<Integer, C0262r> f131e;

    /* renamed from: f */
    private HashMap<Integer, Boolean> f132f;

    /* renamed from: g */
    private HashMap<Integer, View> f133g;

    /* renamed from: h */
    private int f134h;

    /* renamed from: i */
    private int f135i;

    /* renamed from: j */
    private int f136j;

    /* renamed from: k */
    private int f137k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public String f138l;

    /* renamed from: m */
    boolean f139m;

    /* renamed from: n */
    boolean f140n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public float f141o = 0.0f;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public double f142p = 0.0d;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public int f143q = 0;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public int f144r = 0;

    /* renamed from: s */
    private ArrayList<C0028a0> f145s;

    /* renamed from: t */
    private ArrayList<String> f146t;

    /* renamed from: u */
    private boolean f147u;

    /* renamed from: v */
    private boolean f148v;

    /* renamed from: w */
    private boolean f149w;

    /* renamed from: x */
    private AdSession f150x;

    /* renamed from: y */
    Context f151y;

    /* renamed from: z */
    VideoView f152z;

    /* renamed from: com.adcolony.sdk.c$a */
    class C0033a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Runnable f153a;

        C0033a(Runnable runnable) {
            this.f153a = runnable;
        }

        public void run() {
            while (!C0032c.this.f139m) {
                C0190l0.m510a(this.f153a);
                try {
                    Thread.sleep(200);
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    /* renamed from: com.adcolony.sdk.c$b */
    class C0034b implements C0028a0 {
        C0034b() {
        }

        /* renamed from: a */
        public void mo278a(C0284y yVar) {
            if (C0032c.this.mo314i(yVar)) {
                C0032c cVar = C0032c.this;
                cVar.mo292a((View) cVar.mo300c(yVar), FriendlyObstructionPurpose.OTHER);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.c$c */
    class C0035c implements C0028a0 {
        C0035c() {
        }

        /* renamed from: a */
        public void mo278a(C0284y yVar) {
            if (C0032c.this.mo314i(yVar)) {
                C0032c.this.mo310g(yVar);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.c$d */
    class C0036d implements C0028a0 {

        /* renamed from: com.adcolony.sdk.c$d$a */
        class C0037a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C0284y f158a;

            C0037a(C0284y yVar) {
                this.f158a = yVar;
            }

            public void run() {
                C0032c cVar = C0032c.this;
                cVar.mo292a((View) cVar.mo303d(this.f158a), FriendlyObstructionPurpose.OTHER);
            }
        }

        C0036d() {
        }

        /* renamed from: a */
        public void mo278a(C0284y yVar) {
            if (C0032c.this.mo314i(yVar)) {
                C0190l0.m510a((Runnable) new C0037a(yVar));
            }
        }
    }

    /* renamed from: com.adcolony.sdk.c$e */
    class C0038e implements C0028a0 {

        /* renamed from: com.adcolony.sdk.c$e$a */
        class C0039a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C0284y f161a;

            C0039a(C0284y yVar) {
                this.f161a = yVar;
            }

            public void run() {
                C0032c.this.mo312h(this.f161a);
            }
        }

        C0038e() {
        }

        /* renamed from: a */
        public void mo278a(C0284y yVar) {
            if (C0032c.this.mo314i(yVar)) {
                C0190l0.m510a((Runnable) new C0039a(yVar));
            }
        }
    }

    /* renamed from: com.adcolony.sdk.c$f */
    class C0040f implements C0028a0 {
        C0040f() {
        }

        /* renamed from: a */
        public void mo278a(C0284y yVar) {
            if (C0032c.this.mo314i(yVar)) {
                C0032c cVar = C0032c.this;
                cVar.mo292a(cVar.mo296b(yVar), FriendlyObstructionPurpose.OTHER);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.c$g */
    class C0041g implements C0028a0 {
        C0041g() {
        }

        /* renamed from: a */
        public void mo278a(C0284y yVar) {
            if (C0032c.this.mo314i(yVar)) {
                C0032c.this.mo308f(yVar);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.c$h */
    class C0042h implements C0028a0 {
        C0042h() {
        }

        /* renamed from: a */
        public void mo278a(C0284y yVar) {
            if (C0032c.this.mo314i(yVar)) {
                C0032c cVar = C0032c.this;
                cVar.mo292a((View) cVar.mo288a(yVar), FriendlyObstructionPurpose.OTHER);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.c$i */
    class C0043i implements C0028a0 {
        C0043i() {
        }

        /* renamed from: a */
        public void mo278a(C0284y yVar) {
            if (C0032c.this.mo314i(yVar)) {
                C0032c.this.mo306e(yVar);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.c$j */
    class C0044j implements Runnable {

        /* renamed from: a */
        final /* synthetic */ boolean f167a;

        C0044j(boolean z) {
            this.f167a = z;
        }

        public void run() {
            View view = (View) C0032c.this.getParent();
            AdColonyAdView adColonyAdView = C0026a.m80c().mo432b().mo342b().get(C0032c.this.f138l);
            C0210n0 webView = adColonyAdView == null ? null : adColonyAdView.getWebView();
            Context b = C0026a.m78b();
            boolean z = false;
            float a = C0240p0.m721a(view, b, true, this.f167a, true, adColonyAdView != null);
            double a2 = b == null ? 0.0d : C0190l0.m495a(C0190l0.m501a(b));
            int a3 = C0190l0.m498a((View) webView);
            int b2 = C0190l0.m514b((View) webView);
            if (!(a3 == C0032c.this.f143q && b2 == C0032c.this.f144r)) {
                z = true;
            }
            if (z) {
                int unused = C0032c.this.f143q = a3;
                int unused2 = C0032c.this.f144r = b2;
                C0032c.this.m102a(a3, b2, webView);
            }
            if (!(C0032c.this.f141o == a && C0032c.this.f142p == a2 && !z)) {
                C0032c.this.m101a(a, a2);
            }
            float unused3 = C0032c.this.f141o = a;
            double unused4 = C0032c.this.f142p = a2;
        }
    }

    C0032c(Context context, String str) {
        super(context);
        this.f151y = context;
        this.f138l = str;
        setBackgroundColor(-16777216);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m101a(@FloatRange(from = 0.0d, to = 100.0d) float f, @FloatRange(from = 0.0d, to = 1.0d) double d) {
        JSONObject b = C0267t.m805b();
        C0267t.m808b(b, "id", this.f136j);
        C0267t.m798a(b, "ad_session_id", this.f138l);
        C0267t.m796a(b, "exposure", (double) f);
        C0267t.m796a(b, "volume", d);
        new C0284y("AdContainer.on_exposure_change", this.f137k, b).mo740d();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m102a(int i, int i2, C0210n0 n0Var) {
        float n = C0026a.m80c().mo445h().mo533n();
        if (n0Var != null) {
            JSONObject b = C0267t.m805b();
            C0267t.m808b(b, "app_orientation", C0190l0.m526d(C0190l0.m529e()));
            C0267t.m808b(b, "width", (int) (((float) n0Var.mo630m()) / n));
            C0267t.m808b(b, "height", (int) (((float) n0Var.mo629l()) / n));
            C0267t.m808b(b, "x", i);
            C0267t.m808b(b, "y", i2);
            C0267t.m798a(b, "ad_session_id", this.f138l);
            new C0284y("MRAID.on_size_change", this.f137k, b).mo740d();
        }
    }

    /* renamed from: a */
    private void m105a(boolean z) {
        new Thread(new C0033a(new C0044j(z))).start();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0262r mo288a(C0284y yVar) {
        int f = C0267t.m817f(yVar.mo736b(), "id");
        C0262r rVar = new C0262r(this.f151y, yVar, f, this);
        rVar.mo696a();
        this.f131e.put(Integer.valueOf(f), rVar);
        this.f133g.put(Integer.valueOf(f), rVar);
        return rVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo289a() {
        return this.f138l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo290a(int i) {
        this.f135i = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo291a(View view) {
        AdSession adSession = this.f150x;
        if (adSession != null && view != null) {
            try {
                adSession.removeFriendlyObstruction(view);
            } catch (RuntimeException unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo292a(View view, FriendlyObstructionPurpose friendlyObstructionPurpose) {
        AdSession adSession = this.f150x;
        if (adSession != null && view != null) {
            try {
                adSession.addFriendlyObstruction(view, friendlyObstructionPurpose, (String) null);
            } catch (RuntimeException unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo293a(AdSession adSession) {
        this.f150x = adSession;
        mo294a((Map) this.f133g);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo294a(Map map) {
        if (this.f150x != null && map != null) {
            for (Map.Entry value : map.entrySet()) {
                mo292a((View) value.getValue(), FriendlyObstructionPurpose.OTHER);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo295b() {
        return this.f135i;
    }

    /* access modifiers changed from: package-private */
    @SuppressLint({"InlinedApi"})
    /* renamed from: b */
    public View mo296b(C0284y yVar) {
        JSONObject b = yVar.mo736b();
        int f = C0267t.m817f(b, "id");
        if (C0267t.m814d(b, "editable")) {
            C0226o oVar = new C0226o(this.f151y, yVar, f, this);
            oVar.mo666a();
            this.f130d.put(Integer.valueOf(f), oVar);
            this.f133g.put(Integer.valueOf(f), oVar);
            this.f132f.put(Integer.valueOf(f), Boolean.TRUE);
            return oVar;
        } else if (!C0267t.m814d(b, "button")) {
            C0173k0 k0Var = new C0173k0(this.f151y, yVar, f, this);
            k0Var.mo554a();
            this.f128b.put(Integer.valueOf(f), k0Var);
            this.f133g.put(Integer.valueOf(f), k0Var);
            this.f132f.put(Integer.valueOf(f), Boolean.FALSE);
            return k0Var;
        } else {
            C0173k0 k0Var2 = new C0173k0(this.f151y, 16974145, yVar, f, this);
            k0Var2.mo554a();
            this.f128b.put(Integer.valueOf(f), k0Var2);
            this.f133g.put(Integer.valueOf(f), k0Var2);
            this.f132f.put(Integer.valueOf(f), Boolean.FALSE);
            return k0Var2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo297b(int i) {
        this.f134h = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo298b(boolean z) {
        this.f147u = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo299c() {
        return this.f136j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C0195m0 mo300c(C0284y yVar) {
        int f = C0267t.m817f(yVar.mo736b(), "id");
        C0195m0 m0Var = new C0195m0(this.f151y, yVar, f, this);
        m0Var.mo586d();
        this.f127a.put(Integer.valueOf(f), m0Var);
        this.f133g.put(Integer.valueOf(f), m0Var);
        return m0Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo301c(boolean z) {
        this.f149w = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo302d() {
        return this.f134h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C0210n0 mo303d(C0284y yVar) {
        C0210n0 n0Var;
        JSONObject b = yVar.mo736b();
        int f = C0267t.m817f(b, "id");
        boolean d = C0267t.m814d(b, "is_module");
        C0122i c = C0026a.m80c();
        if (d) {
            n0Var = c.mo461x().get(Integer.valueOf(C0267t.m817f(b, "module_id")));
            if (n0Var == null) {
                new C0269v.C0270a().mo707a("Module WebView created with invalid id").mo709a(C0269v.f1299i);
                return null;
            }
            n0Var.mo617a(yVar, f, this);
        } else {
            try {
                n0Var = new C0210n0(this.f151y, yVar, f, c.mo451n().mo750d(), this);
            } catch (RuntimeException e) {
                C0269v.C0270a aVar = new C0269v.C0270a();
                aVar.mo707a(e.toString() + ": during WebView initialization.").mo707a(" Disabling AdColony.").mo709a(C0269v.f1299i);
                AdColony.disable();
                return null;
            }
        }
        this.f129c.put(Integer.valueOf(f), n0Var);
        this.f133g.put(Integer.valueOf(f), n0Var);
        JSONObject b2 = C0267t.m805b();
        C0267t.m808b(b2, "module_id", n0Var.mo287d());
        C0267t.m808b(b2, "mraid_module_id", n0Var.mo286c());
        yVar.mo735a(b2).mo740d();
        return n0Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo304d(boolean z) {
        this.f148v = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public HashMap<Integer, View> mo305e() {
        return this.f133g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo306e(C0284y yVar) {
        int f = C0267t.m817f(yVar.mo736b(), "id");
        View remove = this.f133g.remove(Integer.valueOf(f));
        C0262r remove2 = this.f131e.remove(Integer.valueOf(f));
        if (remove == null || remove2 == null) {
            C0046d b = C0026a.m80c().mo432b();
            String c = yVar.mo739c();
            b.mo340a(c, "" + f);
            return false;
        }
        removeView(remove2);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public HashMap<Integer, C0226o> mo307f() {
        return this.f130d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo308f(C0284y yVar) {
        int f = C0267t.m817f(yVar.mo736b(), "id");
        View remove = this.f133g.remove(Integer.valueOf(f));
        TextView remove2 = this.f132f.remove(Integer.valueOf(f)).booleanValue() ? this.f130d.remove(Integer.valueOf(f)) : this.f128b.remove(Integer.valueOf(f));
        if (remove == null || remove2 == null) {
            C0046d b = C0026a.m80c().mo432b();
            String c = yVar.mo739c();
            b.mo340a(c, "" + f);
            return false;
        }
        removeView(remove2);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public HashMap<Integer, Boolean> mo309g() {
        return this.f132f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo310g(C0284y yVar) {
        int f = C0267t.m817f(yVar.mo736b(), "id");
        View remove = this.f133g.remove(Integer.valueOf(f));
        C0195m0 remove2 = this.f127a.remove(Integer.valueOf(f));
        if (remove == null || remove2 == null) {
            C0046d b = C0026a.m80c().mo432b();
            String c = yVar.mo739c();
            b.mo340a(c, "" + f);
            return false;
        }
        if (remove2.mo585c()) {
            remove2.mo591j();
        }
        remove2.mo583a();
        removeView(remove2);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public HashMap<Integer, C0262r> mo311h() {
        return this.f131e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo312h(C0284y yVar) {
        int f = C0267t.m817f(yVar.mo736b(), "id");
        C0122i c = C0026a.m80c();
        View remove = this.f133g.remove(Integer.valueOf(f));
        C0210n0 remove2 = this.f129c.remove(Integer.valueOf(f));
        if (remove2 == null || remove == null) {
            C0046d b = c.mo432b();
            String c2 = yVar.mo739c();
            b.mo340a(c2, "" + f);
            return false;
        }
        c.mo451n().mo741a(remove2.mo287d());
        removeView(remove2);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public ArrayList<C0028a0> mo313i() {
        return this.f145s;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo314i(C0284y yVar) {
        JSONObject b = yVar.mo736b();
        return C0267t.m817f(b, "container_id") == this.f136j && C0267t.m819h(b, "ad_session_id").equals(this.f138l);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public ArrayList<String> mo315j() {
        return this.f146t;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo316j(C0284y yVar) {
        this.f127a = new HashMap<>();
        this.f128b = new HashMap<>();
        this.f129c = new HashMap<>();
        this.f130d = new HashMap<>();
        this.f131e = new HashMap<>();
        this.f132f = new HashMap<>();
        this.f133g = new HashMap<>();
        this.f145s = new ArrayList<>();
        this.f146t = new ArrayList<>();
        JSONObject b = yVar.mo736b();
        if (C0267t.m814d(b, "transparent")) {
            setBackgroundColor(0);
        }
        this.f136j = C0267t.m817f(b, "id");
        this.f134h = C0267t.m817f(b, "width");
        this.f135i = C0267t.m817f(b, "height");
        this.f137k = C0267t.m817f(b, "module_id");
        this.f140n = C0267t.m814d(b, "viewability_enabled");
        this.f147u = this.f136j == 1;
        C0122i c = C0026a.m80c();
        if (this.f134h == 0 && this.f135i == 0) {
            this.f134h = c.mo445h().mo537r();
            this.f135i = c.mo455r().getMultiWindowEnabled() ? c.mo445h().mo536q() - C0190l0.m528e(C0026a.m78b()) : c.mo445h().mo536q();
        } else {
            setLayoutParams(new FrameLayout.LayoutParams(this.f134h, this.f135i));
        }
        this.f145s.add(C0026a.m72a("VideoView.create", (C0028a0) new C0034b(), true));
        this.f145s.add(C0026a.m72a("VideoView.destroy", (C0028a0) new C0035c(), true));
        this.f145s.add(C0026a.m72a("WebView.create", (C0028a0) new C0036d(), true));
        this.f145s.add(C0026a.m72a("WebView.destroy", (C0028a0) new C0038e(), true));
        this.f145s.add(C0026a.m72a("TextView.create", (C0028a0) new C0040f(), true));
        this.f145s.add(C0026a.m72a("TextView.destroy", (C0028a0) new C0041g(), true));
        this.f145s.add(C0026a.m72a("ImageView.create", (C0028a0) new C0042h(), true));
        this.f145s.add(C0026a.m72a("ImageView.destroy", (C0028a0) new C0043i(), true));
        this.f146t.add("VideoView.create");
        this.f146t.add("VideoView.destroy");
        this.f146t.add("WebView.create");
        this.f146t.add("WebView.destroy");
        this.f146t.add("TextView.create");
        this.f146t.add("TextView.destroy");
        this.f146t.add("ImageView.create");
        this.f146t.add("ImageView.destroy");
        VideoView videoView = new VideoView(this.f151y);
        this.f152z = videoView;
        videoView.setVisibility(8);
        addView(this.f152z);
        setClipToPadding(false);
        if (this.f140n) {
            m105a(C0267t.m814d(yVar.mo736b(), "advanced_viewability"));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public int mo317k() {
        return this.f137k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public HashMap<Integer, C0173k0> mo318l() {
        return this.f128b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public HashMap<Integer, C0195m0> mo319m() {
        return this.f127a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public HashMap<Integer, C0210n0> mo320n() {
        return this.f129c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public boolean mo321o() {
        return this.f148v;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action != 0 && action != 1 && action != 3 && action != 2 && action != 5 && action != 6) {
            return false;
        }
        C0122i c = C0026a.m80c();
        C0046d b = c.mo432b();
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        JSONObject b2 = C0267t.m805b();
        C0267t.m808b(b2, "view_id", -1);
        C0267t.m798a(b2, "ad_session_id", this.f138l);
        C0267t.m808b(b2, "container_x", x);
        C0267t.m808b(b2, "container_y", y);
        C0267t.m808b(b2, "view_x", x);
        C0267t.m808b(b2, "view_y", y);
        C0267t.m808b(b2, "id", this.f136j);
        switch (action) {
            case 0:
                new C0284y("AdContainer.on_touch_began", this.f137k, b2).mo740d();
                break;
            case 1:
                if (!this.f147u) {
                    c.mo423a(b.mo342b().get(this.f138l));
                }
                new C0284y("AdContainer.on_touch_ended", this.f137k, b2).mo740d();
                break;
            case 2:
                new C0284y("AdContainer.on_touch_moved", this.f137k, b2).mo740d();
                break;
            case 3:
                new C0284y("AdContainer.on_touch_cancelled", this.f137k, b2).mo740d();
                break;
            case 5:
                int action2 = (motionEvent.getAction() & 65280) >> 8;
                C0267t.m808b(b2, "container_x", (int) motionEvent.getX(action2));
                C0267t.m808b(b2, "container_y", (int) motionEvent.getY(action2));
                C0267t.m808b(b2, "view_x", (int) motionEvent.getX(action2));
                C0267t.m808b(b2, "view_y", (int) motionEvent.getY(action2));
                new C0284y("AdContainer.on_touch_began", this.f137k, b2).mo740d();
                break;
            case 6:
                int action3 = (motionEvent.getAction() & 65280) >> 8;
                C0267t.m808b(b2, "container_x", (int) motionEvent.getX(action3));
                C0267t.m808b(b2, "container_y", (int) motionEvent.getY(action3));
                C0267t.m808b(b2, "view_x", (int) motionEvent.getX(action3));
                C0267t.m808b(b2, "view_y", (int) motionEvent.getY(action3));
                C0267t.m808b(b2, "x", (int) motionEvent.getX(action3));
                C0267t.m808b(b2, "y", (int) motionEvent.getY(action3));
                if (!this.f147u) {
                    c.mo423a(b.mo342b().get(this.f138l));
                }
                new C0284y("AdContainer.on_touch_ended", this.f137k, b2).mo740d();
                break;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public boolean mo324p() {
        return this.f147u;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public boolean mo325q() {
        return this.f149w;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo326r() {
        JSONObject b = C0267t.m805b();
        C0267t.m798a(b, "id", this.f138l);
        new C0284y("AdSession.on_error", this.f137k, b).mo740d();
    }
}
