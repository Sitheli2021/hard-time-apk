package com.adcolony.sdk;

import android.util.Log;
import com.adcolony.sdk.C0271w;
import com.adobe.air.wand.message.MessageManager;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.adcolony.sdk.f0 */
class C0114f0 {

    /* renamed from: h */
    static final String f826h = "adcolony_android";

    /* renamed from: i */
    static final String f827i = "adcolony_fatal_reports";

    /* renamed from: a */
    C0268u f828a;

    /* renamed from: b */
    ScheduledExecutorService f829b;

    /* renamed from: c */
    List<C0271w> f830c = new ArrayList();

    /* renamed from: d */
    List<C0271w> f831d = new ArrayList();

    /* renamed from: e */
    HashMap<String, Object> f832e;

    /* renamed from: f */
    private C0266s f833f = new C0266s(f826h, "4.4.1", "Production");

    /* renamed from: g */
    private C0266s f834g = new C0266s(f827i, "4.4.1", "Production");

    /* renamed from: com.adcolony.sdk.f0$a */
    class C0115a implements Runnable {
        C0115a() {
        }

        public void run() {
            C0114f0.this.mo379a();
        }
    }

    /* renamed from: com.adcolony.sdk.f0$b */
    class C0116b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C0271w f836a;

        C0116b(C0271w wVar) {
            this.f836a = wVar;
        }

        public void run() {
            C0114f0.this.f830c.add(this.f836a);
        }
    }

    C0114f0(C0268u uVar, ScheduledExecutorService scheduledExecutorService, HashMap<String, Object> hashMap) {
        this.f828a = uVar;
        this.f829b = scheduledExecutorService;
        this.f832e = hashMap;
    }

    /* renamed from: c */
    private synchronized JSONObject m227c(C0271w wVar) throws JSONException {
        JSONObject jSONObject;
        jSONObject = new JSONObject(this.f832e);
        jSONObject.put("environment", wVar.mo710a().mo698a());
        jSONObject.put("level", wVar.mo714c());
        jSONObject.put(MessageManager.NAME_ERROR_MESSAGE, wVar.mo715d());
        jSONObject.put("clientTimestamp", wVar.mo716e());
        JSONObject mediationInfo = C0026a.m80c().mo455r().getMediationInfo();
        JSONObject pluginInfo = C0026a.m80c().mo455r().getPluginInfo();
        double g = C0026a.m80c().mo445h().mo526g();
        jSONObject.put("mediation_network", C0267t.m819h(mediationInfo, "name"));
        jSONObject.put("mediation_network_version", C0267t.m819h(mediationInfo, "version"));
        jSONObject.put("plugin", C0267t.m819h(pluginInfo, "name"));
        jSONObject.put("plugin_version", C0267t.m819h(pluginInfo, "version"));
        jSONObject.put("batteryInfo", g);
        if (wVar instanceof C0238p) {
            jSONObject = C0267t.m791a(jSONObject, ((C0238p) wVar).mo680f());
            jSONObject.put("platform", "android");
        }
        return jSONObject;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo378a(C0266s sVar, List<C0271w> list) throws IOException, JSONException {
        String b = C0026a.m80c().mo445h().mo518b();
        String str = this.f832e.get("advertiserId") != null ? (String) this.f832e.get("advertiserId") : "unknown";
        if (b != null && b.length() > 0 && !b.equals(str)) {
            this.f832e.put("advertiserId", b);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("index", sVar.mo700c());
        jSONObject.put("environment", sVar.mo698a());
        jSONObject.put("version", sVar.mo701d());
        JSONArray jSONArray = new JSONArray();
        for (C0271w c : list) {
            jSONArray.put(m227c(c));
        }
        jSONObject.put("logs", jSONArray);
        return jSONObject.toString();
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: a */
    synchronized void mo379a() {
        /*
            r2 = this;
            monitor-enter(r2)
            monitor-enter(r2)     // Catch:{ all -> 0x0049 }
            java.util.List<com.adcolony.sdk.w> r0 = r2.f830c     // Catch:{ IOException -> 0x003f, JSONException -> 0x0039 }
            int r0 = r0.size()     // Catch:{ IOException -> 0x003f, JSONException -> 0x0039 }
            if (r0 <= 0) goto L_0x001c
            com.adcolony.sdk.s r0 = r2.f833f     // Catch:{ IOException -> 0x003f, JSONException -> 0x0039 }
            java.util.List<com.adcolony.sdk.w> r1 = r2.f830c     // Catch:{ IOException -> 0x003f, JSONException -> 0x0039 }
            java.lang.String r0 = r2.mo378a((com.adcolony.sdk.C0266s) r0, (java.util.List<com.adcolony.sdk.C0271w>) r1)     // Catch:{ IOException -> 0x003f, JSONException -> 0x0039 }
            com.adcolony.sdk.u r1 = r2.f828a     // Catch:{ IOException -> 0x003f, JSONException -> 0x0039 }
            r1.mo702a(r0)     // Catch:{ IOException -> 0x003f, JSONException -> 0x0039 }
            java.util.List<com.adcolony.sdk.w> r0 = r2.f830c     // Catch:{ IOException -> 0x003f, JSONException -> 0x0039 }
            r0.clear()     // Catch:{ IOException -> 0x003f, JSONException -> 0x0039 }
        L_0x001c:
            java.util.List<com.adcolony.sdk.w> r0 = r2.f831d     // Catch:{ IOException -> 0x003f, JSONException -> 0x0039 }
            int r0 = r0.size()     // Catch:{ IOException -> 0x003f, JSONException -> 0x0039 }
            if (r0 <= 0) goto L_0x0044
            com.adcolony.sdk.s r0 = r2.f834g     // Catch:{ IOException -> 0x003f, JSONException -> 0x0039 }
            java.util.List<com.adcolony.sdk.w> r1 = r2.f831d     // Catch:{ IOException -> 0x003f, JSONException -> 0x0039 }
            java.lang.String r0 = r2.mo378a((com.adcolony.sdk.C0266s) r0, (java.util.List<com.adcolony.sdk.C0271w>) r1)     // Catch:{ IOException -> 0x003f, JSONException -> 0x0039 }
            com.adcolony.sdk.u r1 = r2.f828a     // Catch:{ IOException -> 0x003f, JSONException -> 0x0039 }
            r1.mo702a(r0)     // Catch:{ IOException -> 0x003f, JSONException -> 0x0039 }
            java.util.List<com.adcolony.sdk.w> r0 = r2.f831d     // Catch:{ IOException -> 0x003f, JSONException -> 0x0039 }
            r0.clear()     // Catch:{ IOException -> 0x003f, JSONException -> 0x0039 }
            goto L_0x0044
        L_0x0037:
            r0 = move-exception
            goto L_0x0047
        L_0x0039:
            java.util.List<com.adcolony.sdk.w> r0 = r2.f830c     // Catch:{ all -> 0x0037 }
            r0.clear()     // Catch:{ all -> 0x0037 }
            goto L_0x0044
        L_0x003f:
            java.util.List<com.adcolony.sdk.w> r0 = r2.f830c     // Catch:{ all -> 0x0037 }
            r0.clear()     // Catch:{ all -> 0x0037 }
        L_0x0044:
            monitor-exit(r2)     // Catch:{ all -> 0x0037 }
            monitor-exit(r2)
            return
        L_0x0047:
            monitor-exit(r2)     // Catch:{ all -> 0x0037 }
            throw r0     // Catch:{ all -> 0x0049 }
        L_0x0049:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.C0114f0.mo379a():void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo380a(long j, TimeUnit timeUnit) {
        try {
            if (!this.f829b.isShutdown() && !this.f829b.isTerminated()) {
                this.f829b.scheduleAtFixedRate(new C0115a(), j, j, timeUnit);
            }
        } catch (RuntimeException unused) {
            Log.e("ADCLogError", "Internal error when submitting remote log to executor service");
        }
        return;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo381a(C0238p pVar) {
        pVar.mo712a(this.f834g);
        pVar.mo711a(-1);
        mo382a((C0271w) pVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo382a(C0271w wVar) {
        this.f831d.add(wVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo383a(String str) {
        mo385b(new C0271w.C0272a().mo718a(3).mo719a(this.f833f).mo720a(str).mo721a());
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:9|10) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r4.f829b.shutdownNow();
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x003e */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo384b() {
        /*
            r4 = this;
            monitor-enter(r4)
            java.util.concurrent.ScheduledExecutorService r0 = r4.f829b     // Catch:{ all -> 0x004c }
            r0.shutdown()     // Catch:{ all -> 0x004c }
            java.util.concurrent.ScheduledExecutorService r0 = r4.f829b     // Catch:{ InterruptedException -> 0x003e }
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x003e }
            r2 = 1
            boolean r0 = r0.awaitTermination(r2, r1)     // Catch:{ InterruptedException -> 0x003e }
            if (r0 != 0) goto L_0x004a
            java.util.concurrent.ScheduledExecutorService r0 = r4.f829b     // Catch:{ InterruptedException -> 0x003e }
            r0.shutdownNow()     // Catch:{ InterruptedException -> 0x003e }
            java.util.concurrent.ScheduledExecutorService r0 = r4.f829b     // Catch:{ InterruptedException -> 0x003e }
            boolean r0 = r0.awaitTermination(r2, r1)     // Catch:{ InterruptedException -> 0x003e }
            if (r0 != 0) goto L_0x004a
            java.io.PrintStream r0 = java.lang.System.err     // Catch:{ InterruptedException -> 0x003e }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ InterruptedException -> 0x003e }
            r1.<init>()     // Catch:{ InterruptedException -> 0x003e }
            java.lang.Class r2 = r4.getClass()     // Catch:{ InterruptedException -> 0x003e }
            java.lang.String r2 = r2.getSimpleName()     // Catch:{ InterruptedException -> 0x003e }
            r1.append(r2)     // Catch:{ InterruptedException -> 0x003e }
            java.lang.String r2 = ": ScheduledExecutorService did not terminate"
            r1.append(r2)     // Catch:{ InterruptedException -> 0x003e }
            java.lang.String r1 = r1.toString()     // Catch:{ InterruptedException -> 0x003e }
            r0.println(r1)     // Catch:{ InterruptedException -> 0x003e }
            goto L_0x004a
        L_0x003e:
            java.util.concurrent.ScheduledExecutorService r0 = r4.f829b     // Catch:{ all -> 0x004c }
            r0.shutdownNow()     // Catch:{ all -> 0x004c }
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x004c }
            r0.interrupt()     // Catch:{ all -> 0x004c }
        L_0x004a:
            monitor-exit(r4)
            return
        L_0x004c:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.C0114f0.mo384b():void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized void mo385b(C0271w wVar) {
        try {
            if (!this.f829b.isShutdown() && !this.f829b.isTerminated()) {
                this.f829b.submit(new C0116b(wVar));
            }
        } catch (RejectedExecutionException unused) {
            Log.e("ADCLogError", "Internal error when submitting remote log to executor service");
        }
        return;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized void mo386b(String str) {
        mo385b(new C0271w.C0272a().mo718a(0).mo719a(this.f833f).mo720a(str).mo721a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public synchronized void mo387c(String str) {
        mo385b(new C0271w.C0272a().mo718a(2).mo719a(this.f833f).mo720a(str).mo721a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public synchronized void mo388d(String str) {
        mo385b(new C0271w.C0272a().mo718a(1).mo719a(this.f833f).mo720a(str).mo721a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public synchronized void mo389e(String str) {
        this.f832e.put("controllerVersion", str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public synchronized void mo390f(String str) {
        this.f832e.put("sessionId", str);
    }
}
