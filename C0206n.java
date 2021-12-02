package com.adcolony.sdk;

import com.adcolony.sdk.C0193m;
import com.adcolony.sdk.C0269v;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.adcolony.sdk.n */
class C0206n implements C0193m.C0194a {

    /* renamed from: a */
    private BlockingQueue<Runnable> f1122a = new LinkedBlockingQueue();

    /* renamed from: b */
    private ThreadPoolExecutor f1123b = new ThreadPoolExecutor(4, 16, 60, TimeUnit.SECONDS, this.f1122a);

    /* renamed from: c */
    private LinkedList<C0193m> f1124c = new LinkedList<>();

    /* renamed from: d */
    private String f1125d;

    /* renamed from: com.adcolony.sdk.n$a */
    class C0207a implements C0028a0 {
        C0207a() {
        }

        /* renamed from: a */
        public void mo278a(C0284y yVar) {
            C0206n nVar = C0206n.this;
            nVar.mo609a(new C0193m(yVar, nVar));
        }
    }

    /* renamed from: com.adcolony.sdk.n$b */
    class C0208b implements C0028a0 {
        C0208b() {
        }

        /* renamed from: a */
        public void mo278a(C0284y yVar) {
            C0206n nVar = C0206n.this;
            nVar.mo609a(new C0193m(yVar, nVar));
        }
    }

    /* renamed from: com.adcolony.sdk.n$c */
    class C0209c implements C0028a0 {
        C0209c() {
        }

        /* renamed from: a */
        public void mo278a(C0284y yVar) {
            C0206n nVar = C0206n.this;
            nVar.mo609a(new C0193m(yVar, nVar));
        }
    }

    C0206n() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo607a() {
        return this.f1123b.getCorePoolSize();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo608a(int i) {
        this.f1123b.setCorePoolSize(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo609a(C0193m mVar) {
        String str = this.f1125d;
        if (str == null || str.equals("")) {
            this.f1124c.push(mVar);
            return;
        }
        try {
            this.f1123b.execute(mVar);
        } catch (RejectedExecutionException unused) {
            C0269v.C0270a a = new C0269v.C0270a().mo707a("RejectedExecutionException: ThreadPoolExecutor unable to ");
            a.mo707a("execute download for url " + mVar.f1061n).mo709a(C0269v.f1300j);
            mo429a(mVar, mVar.mo581b(), (Map<String, List<String>>) null);
        }
    }

    /* renamed from: a */
    public void mo429a(C0193m mVar, C0284y yVar, Map<String, List<String>> map) {
        JSONObject b = C0267t.m805b();
        C0267t.m798a(b, "url", mVar.f1061n);
        C0267t.m809b(b, "success", mVar.f1063p);
        C0267t.m808b(b, "status", mVar.f1065r);
        C0267t.m798a(b, "body", mVar.f1062o);
        C0267t.m808b(b, "size", mVar.f1064q);
        if (map != null) {
            JSONObject b2 = C0267t.m805b();
            for (Map.Entry next : map.entrySet()) {
                String obj = ((List) next.getValue()).toString();
                String substring = obj.substring(1, obj.length() - 1);
                if (next.getKey() != null) {
                    C0267t.m798a(b2, (String) next.getKey(), substring);
                }
            }
            C0267t.m800a(b, "headers", b2);
        }
        yVar.mo735a(b).mo740d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo610a(String str) {
        this.f1125d = str;
        while (!this.f1124c.isEmpty()) {
            mo609a(this.f1124c.removeLast());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo611b() {
        C0026a.m80c().mo445h().mo512J();
        C0026a.m76a("WebServices.download", (C0028a0) new C0207a());
        C0026a.m76a("WebServices.get", (C0028a0) new C0208b());
        C0026a.m76a("WebServices.post", (C0028a0) new C0209c());
    }
}
