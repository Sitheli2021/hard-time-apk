package com.adcolony.sdk;

import android.util.Log;
import com.adobe.air.wand.message.MessageManager;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.adcolony.sdk.x */
class C0273x {

    /* renamed from: e */
    static boolean f1312e = false;

    /* renamed from: f */
    private static final int f1313f = 4000;

    /* renamed from: g */
    private static final int f1314g = 4;

    /* renamed from: h */
    static final int f1315h = 3;

    /* renamed from: i */
    static final int f1316i = 2;

    /* renamed from: j */
    static final int f1317j = 1;

    /* renamed from: k */
    static final int f1318k = 0;

    /* renamed from: l */
    static final int f1319l = -1;

    /* renamed from: m */
    static int f1320m = 3;

    /* renamed from: n */
    static int f1321n = 1;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public JSONObject f1322a = C0267t.m805b();

    /* renamed from: b */
    private ExecutorService f1323b = null;

    /* renamed from: c */
    private final Queue<Runnable> f1324c = new ConcurrentLinkedQueue();

    /* renamed from: d */
    C0114f0 f1325d;

    /* renamed from: com.adcolony.sdk.x$a */
    class C0274a implements C0028a0 {
        C0274a() {
        }

        /* renamed from: a */
        public void mo278a(C0284y yVar) {
            C0273x.this.mo729b(C0267t.m817f(yVar.mo736b(), "module"), 0, C0267t.m819h(yVar.mo736b(), MessageManager.NAME_ERROR_MESSAGE), true);
        }
    }

    /* renamed from: com.adcolony.sdk.x$b */
    class C0275b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f1327a;

        /* renamed from: b */
        final /* synthetic */ String f1328b;

        /* renamed from: c */
        final /* synthetic */ int f1329c;

        /* renamed from: d */
        final /* synthetic */ boolean f1330d;

        C0275b(int i, String str, int i2, boolean z) {
            this.f1327a = i;
            this.f1328b = str;
            this.f1329c = i2;
            this.f1330d = z;
        }

        public void run() {
            C0273x.this.m849a(this.f1327a, this.f1328b, this.f1329c);
            int i = 0;
            while (i <= this.f1328b.length() / C0273x.f1313f) {
                int i2 = i * C0273x.f1313f;
                i++;
                int min = Math.min(i * C0273x.f1313f, this.f1328b.length());
                if (this.f1329c == 3) {
                    C0273x xVar = C0273x.this;
                    if (xVar.mo727a(C0267t.m818g(xVar.f1322a, Integer.toString(this.f1327a)), 3, this.f1330d)) {
                        Log.d("AdColony [TRACE]", this.f1328b.substring(i2, min));
                    }
                }
                if (this.f1329c == 2) {
                    C0273x xVar2 = C0273x.this;
                    if (xVar2.mo727a(C0267t.m818g(xVar2.f1322a, Integer.toString(this.f1327a)), 2, this.f1330d)) {
                        Log.i("AdColony [INFO]", this.f1328b.substring(i2, min));
                    }
                }
                if (this.f1329c == 1) {
                    C0273x xVar3 = C0273x.this;
                    if (xVar3.mo727a(C0267t.m818g(xVar3.f1322a, Integer.toString(this.f1327a)), 1, this.f1330d)) {
                        Log.w("AdColony [WARNING]", this.f1328b.substring(i2, min));
                    }
                }
                if (this.f1329c == 0) {
                    C0273x xVar4 = C0273x.this;
                    if (xVar4.mo727a(C0267t.m818g(xVar4.f1322a, Integer.toString(this.f1327a)), 0, this.f1330d)) {
                        Log.e("AdColony [ERROR]", this.f1328b.substring(i2, min));
                    }
                }
                if (this.f1329c == -1 && C0273x.f1320m >= -1) {
                    Log.e("AdColony [FATAL]", this.f1328b.substring(i2, min));
                }
            }
        }
    }

    /* renamed from: com.adcolony.sdk.x$c */
    class C0276c implements C0028a0 {
        C0276c() {
        }

        /* renamed from: a */
        public void mo278a(C0284y yVar) {
            C0273x.f1320m = C0267t.m817f(yVar.mo736b(), "level");
        }
    }

    /* renamed from: com.adcolony.sdk.x$d */
    class C0277d implements C0028a0 {
        C0277d() {
        }

        /* renamed from: a */
        public void mo278a(C0284y yVar) {
            C0273x.this.mo729b(C0267t.m817f(yVar.mo736b(), "module"), 3, C0267t.m819h(yVar.mo736b(), MessageManager.NAME_ERROR_MESSAGE), false);
        }
    }

    /* renamed from: com.adcolony.sdk.x$e */
    class C0278e implements C0028a0 {
        C0278e() {
        }

        /* renamed from: a */
        public void mo278a(C0284y yVar) {
            C0273x.this.mo729b(C0267t.m817f(yVar.mo736b(), "module"), 3, C0267t.m819h(yVar.mo736b(), MessageManager.NAME_ERROR_MESSAGE), true);
        }
    }

    /* renamed from: com.adcolony.sdk.x$f */
    class C0279f implements C0028a0 {
        C0279f() {
        }

        /* renamed from: a */
        public void mo278a(C0284y yVar) {
            C0273x.this.mo729b(C0267t.m817f(yVar.mo736b(), "module"), 2, C0267t.m819h(yVar.mo736b(), MessageManager.NAME_ERROR_MESSAGE), false);
        }
    }

    /* renamed from: com.adcolony.sdk.x$g */
    class C0280g implements C0028a0 {
        C0280g() {
        }

        /* renamed from: a */
        public void mo278a(C0284y yVar) {
            C0273x.this.mo729b(C0267t.m817f(yVar.mo736b(), "module"), 2, C0267t.m819h(yVar.mo736b(), MessageManager.NAME_ERROR_MESSAGE), true);
        }
    }

    /* renamed from: com.adcolony.sdk.x$h */
    class C0281h implements C0028a0 {
        C0281h() {
        }

        /* renamed from: a */
        public void mo278a(C0284y yVar) {
            C0273x.this.mo729b(C0267t.m817f(yVar.mo736b(), "module"), 1, C0267t.m819h(yVar.mo736b(), MessageManager.NAME_ERROR_MESSAGE), false);
        }
    }

    /* renamed from: com.adcolony.sdk.x$i */
    class C0282i implements C0028a0 {
        C0282i() {
        }

        /* renamed from: a */
        public void mo278a(C0284y yVar) {
            C0273x.this.mo729b(C0267t.m817f(yVar.mo736b(), "module"), 1, C0267t.m819h(yVar.mo736b(), MessageManager.NAME_ERROR_MESSAGE), true);
        }
    }

    /* renamed from: com.adcolony.sdk.x$j */
    class C0283j implements C0028a0 {
        C0283j() {
        }

        /* renamed from: a */
        public void mo278a(C0284y yVar) {
            C0273x.this.mo729b(C0267t.m817f(yVar.mo736b(), "module"), 0, C0267t.m819h(yVar.mo736b(), MessageManager.NAME_ERROR_MESSAGE), false);
        }
    }

    C0273x() {
    }

    /* renamed from: a */
    private Runnable m847a(int i, int i2, String str, boolean z) {
        return new C0275b(i, str, i2, z);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m849a(int i, String str, int i2) {
        if (this.f1325d != null) {
            if (i2 == 3 && mo726a(C0267t.m818g(this.f1322a, Integer.toString(i)), 3)) {
                this.f1325d.mo383a(str);
            } else if (i2 == 2 && mo726a(C0267t.m818g(this.f1322a, Integer.toString(i)), 2)) {
                this.f1325d.mo387c(str);
            } else if (i2 == 1 && mo726a(C0267t.m818g(this.f1322a, Integer.toString(i)), 1)) {
                this.f1325d.mo388d(str);
            } else if (i2 == 0 && mo726a(C0267t.m818g(this.f1322a, Integer.toString(i)), 0)) {
                this.f1325d.mo386b(str);
            }
        }
    }

    /* renamed from: a */
    private boolean m851a(Runnable runnable) {
        try {
            ExecutorService executorService = this.f1323b;
            if (executorService == null || executorService.isShutdown() || this.f1323b.isTerminated()) {
                return false;
            }
            this.f1323b.submit(runnable);
            return true;
        } catch (RejectedExecutionException unused) {
            Log.e("ADCLogError", "Internal error when submitting log to executor service.");
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0114f0 mo722a() {
        return this.f1325d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public JSONObject mo723a(JSONArray jSONArray) {
        JSONObject b = C0267t.m805b();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject c = C0267t.m812c(jSONArray, i);
            C0267t.m800a(b, Integer.toString(C0267t.m817f(c, "id")), c);
        }
        return b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo724a(int i, String str, boolean z) {
        mo729b(0, i, str, z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo725a(HashMap<String, Object> hashMap) {
        try {
            C0114f0 f0Var = new C0114f0(new C0268u(new URL("https://wd.adcolony.com/logs")), Executors.newSingleThreadScheduledExecutor(), hashMap);
            this.f1325d = f0Var;
            f0Var.mo380a(5, TimeUnit.SECONDS);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo726a(JSONObject jSONObject, int i) {
        int f = C0267t.m817f(jSONObject, "send_level");
        if (jSONObject.length() == 0) {
            f = f1321n;
        }
        return f >= i && f != 4;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo727a(JSONObject jSONObject, int i, boolean z) {
        int f = C0267t.m817f(jSONObject, "print_level");
        boolean d = C0267t.m814d(jSONObject, "log_private");
        if (jSONObject.length() == 0) {
            f = f1320m;
            d = f1312e;
        }
        return (!z || d) && f != 4 && f >= i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo728b() {
        C0026a.m76a("Log.set_log_level", (C0028a0) new C0276c());
        C0026a.m76a("Log.public.trace", (C0028a0) new C0277d());
        C0026a.m76a("Log.private.trace", (C0028a0) new C0278e());
        C0026a.m76a("Log.public.info", (C0028a0) new C0279f());
        C0026a.m76a("Log.private.info", (C0028a0) new C0280g());
        C0026a.m76a("Log.public.warning", (C0028a0) new C0281h());
        C0026a.m76a("Log.private.warning", (C0028a0) new C0282i());
        C0026a.m76a("Log.public.error", (C0028a0) new C0283j());
        C0026a.m76a("Log.private.error", (C0028a0) new C0274a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo729b(int i, int i2, String str, boolean z) {
        if (!m851a(m847a(i, i2, str, z))) {
            synchronized (this.f1324c) {
                this.f1324c.add(m847a(i, i2, str, z));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo730b(JSONArray jSONArray) {
        this.f1322a = mo723a(jSONArray);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo731c() {
        ExecutorService executorService = this.f1323b;
        if (executorService == null || executorService.isShutdown() || this.f1323b.isTerminated()) {
            this.f1323b = Executors.newSingleThreadExecutor();
        }
        synchronized (this.f1324c) {
            while (!this.f1324c.isEmpty()) {
                m851a(this.f1324c.poll());
            }
        }
    }
}
