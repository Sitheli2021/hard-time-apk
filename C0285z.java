package com.adcolony.sdk;

import android.annotation.SuppressLint;
import android.content.Context;
import com.adcolony.sdk.C0269v;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressLint({"UseSparseArrays"})
/* renamed from: com.adcolony.sdk.z */
class C0285z {

    /* renamed from: a */
    private ArrayList<C0031b0> f1342a = new ArrayList<>();

    /* renamed from: b */
    private HashMap<Integer, C0031b0> f1343b = new HashMap<>();

    /* renamed from: c */
    private int f1344c = 2;

    /* renamed from: d */
    private HashMap<String, ArrayList<C0028a0>> f1345d = new HashMap<>();

    /* renamed from: e */
    private JSONArray f1346e = C0267t.m785a();

    /* renamed from: f */
    private int f1347f = 1;

    /* renamed from: com.adcolony.sdk.z$a */
    class C0286a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f1348a;

        C0286a(Context context) {
            this.f1348a = context;
        }

        public void run() {
            JSONObject b = C0026a.m80c().mo455r().mo164b();
            JSONObject b2 = C0267t.m805b();
            C0267t.m798a(b, "os_name", "android");
            C0267t.m798a(b2, "filepath", C0026a.m80c().mo459v().mo411a() + "7bf3a1e7bbd31e612eda3310c2cdb8075c43c6b5");
            C0267t.m800a(b2, "info", b);
            C0267t.m808b(b2, "m_origin", 0);
            C0267t.m808b(b2, "m_id", C0285z.m879a(C0285z.this));
            C0267t.m798a(b2, "m_type", "Controller.create");
            try {
                new C0210n0(this.f1348a, 1, false).mo619a(true, new C0284y(b2));
            } catch (RuntimeException e) {
                C0269v.C0270a aVar = new C0269v.C0270a();
                aVar.mo707a(e.toString() + ": during WebView initialization.").mo707a(" Disabling AdColony.").mo709a(C0269v.f1299i);
                AdColony.disable();
            }
        }
    }

    /* renamed from: com.adcolony.sdk.z$b */
    class C0287b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f1350a;

        /* renamed from: b */
        final /* synthetic */ JSONObject f1351b;

        C0287b(String str, JSONObject jSONObject) {
            this.f1350a = str;
            this.f1351b = jSONObject;
        }

        public void run() {
            C0285z.this.mo745a(this.f1350a, this.f1351b);
        }
    }

    C0285z() {
    }

    /* renamed from: a */
    static /* synthetic */ int m879a(C0285z zVar) {
        int i = zVar.f1347f;
        zVar.f1347f = i + 1;
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0031b0 mo741a(int i) {
        synchronized (this.f1342a) {
            C0031b0 b0Var = this.f1343b.get(Integer.valueOf(i));
            if (b0Var == null) {
                return null;
            }
            this.f1342a.remove(b0Var);
            this.f1343b.remove(Integer.valueOf(i));
            b0Var.mo285b();
            return b0Var;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0031b0 mo742a(C0031b0 b0Var) {
        synchronized (this.f1342a) {
            int c = b0Var.mo286c();
            if (c <= 0) {
                c = b0Var.mo287d();
            }
            this.f1342a.add(b0Var);
            this.f1343b.put(Integer.valueOf(c), b0Var);
        }
        return b0Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo743a() {
        Context b;
        C0122i c = C0026a.m80c();
        if (!c.mo418A() && !c.mo419B() && (b = C0026a.m78b()) != null) {
            C0190l0.m510a((Runnable) new C0286a(b));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo744a(String str, C0028a0 a0Var) {
        ArrayList arrayList = this.f1345d.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f1345d.put(str, arrayList);
        }
        arrayList.add(a0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo745a(String str, JSONObject jSONObject) {
        synchronized (this.f1345d) {
            ArrayList arrayList = this.f1345d.get(str);
            if (arrayList != null) {
                C0284y yVar = new C0284y(jSONObject);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    try {
                        ((C0028a0) it.next()).mo278a(yVar);
                    } catch (RuntimeException e) {
                        new C0269v.C0270a().mo706a((Object) e).mo709a(C0269v.f1300j);
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo746a(JSONObject jSONObject) {
        try {
            if (!jSONObject.has("m_id")) {
                int i = this.f1347f;
                this.f1347f = i + 1;
                jSONObject.put("m_id", i);
            }
            if (!jSONObject.has("m_origin")) {
                jSONObject.put("m_origin", 0);
            }
            int i2 = jSONObject.getInt("m_target");
            if (i2 == 0) {
                synchronized (this) {
                    this.f1346e.put(jSONObject);
                }
                return;
            }
            C0031b0 b0Var = this.f1343b.get(Integer.valueOf(i2));
            if (b0Var != null) {
                b0Var.mo284a(jSONObject);
            }
        } catch (JSONException e) {
            new C0269v.C0270a().mo707a("JSON error in ADCMessageDispatcher's sendMessage(): ").mo707a(e.toString()).mo709a(C0269v.f1300j);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public ArrayList<C0031b0> mo747b() {
        return this.f1342a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo748b(String str, C0028a0 a0Var) {
        synchronized (this.f1345d) {
            ArrayList arrayList = this.f1345d.get(str);
            if (arrayList != null) {
                arrayList.remove(a0Var);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public HashMap<Integer, C0031b0> mo749c() {
        return this.f1343b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo750d() {
        int i = this.f1344c;
        this.f1344c = i + 1;
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public synchronized void mo751e() {
        synchronized (this.f1342a) {
            for (int size = this.f1342a.size() - 1; size >= 0; size--) {
                this.f1342a.get(size).mo283a();
            }
        }
        JSONArray jSONArray = null;
        if (this.f1346e.length() > 0) {
            jSONArray = this.f1346e;
            this.f1346e = C0267t.m785a();
        }
        if (jSONArray != null) {
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    String string = jSONObject.getString("m_type");
                    if (jSONObject.getInt("m_origin") >= 2) {
                        C0190l0.m510a((Runnable) new C0287b(string, jSONObject));
                    } else {
                        mo745a(string, jSONObject);
                    }
                } catch (JSONException e) {
                    new C0269v.C0270a().mo707a("JSON error from message dispatcher's updateModules(): ").mo707a(e.toString()).mo709a(C0269v.f1300j);
                }
            }
        }
    }
}
