package com.adcolony.sdk;

import android.annotation.SuppressLint;
import android.content.Context;
import com.adcolony.sdk.C0269v;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.adcolony.sdk.a */
class C0026a {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: a */
    private static Context f109a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static C0122i f110b;

    /* renamed from: c */
    static boolean f111c;

    /* renamed from: d */
    static boolean f112d;

    /* renamed from: com.adcolony.sdk.a$a */
    static class C0027a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f113a;

        C0027a(Context context) {
            this.f113a = context;
        }

        public void run() {
            C0026a.f110b.mo431a(this.f113a, (C0284y) null);
        }
    }

    C0026a() {
    }

    /* renamed from: a */
    static C0028a0 m72a(String str, C0028a0 a0Var, boolean z) {
        m80c().mo451n().mo744a(str, a0Var);
        return a0Var;
    }

    /* renamed from: a */
    static void m74a(Context context) {
        f109a = context;
    }

    /* renamed from: a */
    static void m75a(Context context, AdColonyAppOptions adColonyAppOptions, boolean z) {
        m74a(context);
        f112d = true;
        if (f110b == null) {
            f110b = new C0122i();
            adColonyAppOptions.mo165b(context);
            f110b.mo425a(adColonyAppOptions, z);
        } else {
            adColonyAppOptions.mo165b(context);
            f110b.mo424a(adColonyAppOptions);
        }
        C0190l0.f1041b.execute(new C0027a(context));
        new C0269v.C0270a().mo707a("Configuring AdColony").mo709a(C0269v.f1295e);
        f110b.mo437c(false);
        f110b.mo458u().mo400d(true);
        f110b.mo458u().mo402e(true);
        f110b.mo458u().mo404f(false);
        f110b.mo440d(true);
        f110b.mo458u().mo399c(false);
    }

    /* renamed from: a */
    static void m76a(String str, C0028a0 a0Var) {
        m80c().mo451n().mo744a(str, a0Var);
    }

    /* renamed from: a */
    static void m77a(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = C0267t.m805b();
        }
        C0267t.m798a(jSONObject, "m_type", str);
        m80c().mo451n().mo746a(jSONObject);
    }

    /* renamed from: b */
    static Context m78b() {
        return f109a;
    }

    /* renamed from: b */
    static void m79b(String str, C0028a0 a0Var) {
        m80c().mo451n().mo748b(str, a0Var);
    }

    /* renamed from: c */
    static C0122i m80c() {
        if (!m82e()) {
            Context b = m78b();
            if (b == null) {
                return new C0122i();
            }
            f110b = new C0122i();
            JSONObject c = C0267t.m811c(b.getFilesDir().getAbsolutePath() + "/adc3/AppInfo");
            JSONArray c2 = C0267t.m810c(c, "zoneIds");
            f110b.mo425a(new AdColonyAppOptions().mo161a(C0267t.m819h(c, "appId")).mo162a(C0267t.m802a(c2)), false);
        }
        return f110b;
    }

    /* renamed from: d */
    static boolean m81d() {
        return f109a != null;
    }

    /* renamed from: e */
    static boolean m82e() {
        return f110b != null;
    }

    /* renamed from: f */
    static boolean m83f() {
        return f111c;
    }

    /* renamed from: g */
    static void m84g() {
        m80c().mo451n().mo751e();
    }
}
