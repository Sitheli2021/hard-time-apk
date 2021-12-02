package com.adcolony.sdk;

import android.content.Context;
import com.adcolony.sdk.C0190l0;
import com.adcolony.sdk.C0269v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executors;
import org.json.JSONObject;

/* renamed from: com.adcolony.sdk.g0 */
class C0118g0 implements Runnable {

    /* renamed from: a */
    private final int f839a = 17;

    /* renamed from: b */
    private final int f840b = 15000;

    /* renamed from: c */
    private final int f841c = 1000;

    /* renamed from: d */
    private long f842d = 30000;

    /* renamed from: e */
    private int f843e;

    /* renamed from: f */
    private long f844f;

    /* renamed from: g */
    private long f845g;

    /* renamed from: h */
    private long f846h;

    /* renamed from: i */
    private long f847i;

    /* renamed from: j */
    private long f848j;

    /* renamed from: k */
    private long f849k;

    /* renamed from: l */
    private long f850l;

    /* renamed from: m */
    private long f851m;

    /* renamed from: n */
    private boolean f852n = true;

    /* renamed from: o */
    private boolean f853o = true;

    /* renamed from: p */
    private boolean f854p;

    /* renamed from: q */
    private boolean f855q;

    /* renamed from: r */
    private boolean f856r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public boolean f857s;

    /* renamed from: t */
    private boolean f858t;

    /* renamed from: com.adcolony.sdk.g0$a */
    class C0119a implements C0028a0 {
        C0119a() {
        }

        /* renamed from: a */
        public void mo278a(C0284y yVar) {
            boolean unused = C0118g0.this.f857s = true;
        }
    }

    C0118g0() {
    }

    /* renamed from: a */
    private void m241a(long j) {
        try {
            Thread.sleep(j);
        } catch (InterruptedException unused) {
        }
    }

    /* renamed from: f */
    private void m243f() {
        mo395a(false);
    }

    /* renamed from: g */
    private void m244g() {
        mo397b(false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo393a() {
        return this.f843e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo394a(int i) {
        this.f842d = i <= 0 ? this.f842d : (long) (i * 1000);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo395a(boolean z) {
        ArrayList<C0031b0> b = C0026a.m80c().mo451n().mo747b();
        synchronized (b) {
            Iterator<C0031b0> it = b.iterator();
            while (it.hasNext()) {
                C0031b0 next = it.next();
                JSONObject b2 = C0267t.m805b();
                C0267t.m809b(b2, "from_window_focus", z);
                new C0284y("SessionInfo.on_pause", next.mo287d(), b2).mo740d();
            }
        }
        this.f853o = true;
        C0026a.m84g();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo396b() {
        this.f843e++;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo397b(boolean z) {
        C0122i c = C0026a.m80c();
        ArrayList<C0031b0> b = c.mo451n().mo747b();
        synchronized (b) {
            Iterator<C0031b0> it = b.iterator();
            while (it.hasNext()) {
                C0031b0 next = it.next();
                JSONObject b2 = C0267t.m805b();
                C0267t.m809b(b2, "from_window_focus", z);
                new C0284y("SessionInfo.on_resume", next.mo287d(), b2).mo740d();
            }
        }
        c.mo450m().mo731c();
        this.f853o = false;
    }

    /* renamed from: c */
    public void mo398c() {
        C0026a.m76a("SessionInfo.stopped", (C0028a0) new C0119a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo399c(boolean z) {
        C0122i c = C0026a.m80c();
        if (!this.f855q) {
            if (this.f856r) {
                c.mo437c(false);
                this.f856r = false;
            }
            this.f843e = 0;
            this.f844f = 0;
            this.f845g = 0;
            this.f855q = true;
            this.f852n = true;
            this.f857s = false;
            new Thread(this).start();
            if (z) {
                JSONObject b = C0267t.m805b();
                C0267t.m798a(b, "id", C0190l0.m502a());
                new C0284y("SessionInfo.on_start", 1, b).mo740d();
                C0210n0 n0Var = (C0210n0) C0026a.m80c().mo451n().mo749c().get(1);
                if (n0Var != null) {
                    n0Var.mo614D();
                }
            }
            if (AdColony.f0a.isShutdown()) {
                AdColony.f0a = Executors.newSingleThreadExecutor();
            }
            c.mo450m().mo731c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo400d(boolean z) {
        this.f852n = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo401d() {
        return this.f852n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo402e(boolean z) {
        this.f854p = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo403e() {
        return this.f855q;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo404f(boolean z) {
        this.f858t = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo405h() {
        C0114f0 a = C0026a.m80c().mo450m().mo722a();
        this.f855q = false;
        this.f852n = false;
        if (a != null) {
            a.mo384b();
        }
        JSONObject b = C0267t.m805b();
        double d = (double) this.f844f;
        Double.isNaN(d);
        C0267t.m796a(b, "session_length", d / 1000.0d);
        new C0284y("SessionInfo.on_stop", 1, b).mo740d();
        C0026a.m84g();
        AdColony.f0a.shutdown();
    }

    public void run() {
        while (true) {
            this.f847i = System.currentTimeMillis();
            C0026a.m84g();
            if (this.f845g > this.f842d) {
                break;
            }
            if (!this.f852n) {
                if (this.f854p && !this.f853o) {
                    this.f854p = false;
                    m243f();
                }
                this.f845g += this.f851m == 0 ? 0 : System.currentTimeMillis() - this.f851m;
                this.f851m = System.currentTimeMillis();
            } else {
                if (this.f854p && this.f853o) {
                    this.f854p = false;
                    m244g();
                }
                this.f845g = 0;
                this.f851m = 0;
            }
            this.f846h = 17;
            m241a(17);
            long currentTimeMillis = System.currentTimeMillis() - this.f847i;
            this.f848j = currentTimeMillis;
            if (currentTimeMillis > 0 && currentTimeMillis < 6000) {
                this.f844f += currentTimeMillis;
            }
            C0122i c = C0026a.m80c();
            long currentTimeMillis2 = System.currentTimeMillis();
            if (currentTimeMillis2 - this.f850l > 15000) {
                this.f850l = currentTimeMillis2;
            }
            if (C0026a.m81d() && currentTimeMillis2 - this.f849k > 1000) {
                this.f849k = currentTimeMillis2;
                String a = c.mo452o().mo331a();
                if (!a.equals(c.mo453p())) {
                    c.mo434b(a);
                    JSONObject b = C0267t.m805b();
                    C0267t.m798a(b, "network_type", c.mo453p());
                    new C0284y("Network.on_status_change", 1, b).mo740d();
                }
            }
        }
        new C0269v.C0270a().mo707a("AdColony session ending, releasing Context.").mo709a(C0269v.f1295e);
        C0026a.m80c().mo437c(true);
        C0026a.m74a((Context) null);
        this.f856r = true;
        this.f858t = true;
        mo405h();
        C0190l0.C0192b bVar = new C0190l0.C0192b(10.0d);
        while (!this.f857s && !bVar.mo577a() && this.f858t) {
            C0026a.m84g();
            m241a(100);
        }
    }
}
