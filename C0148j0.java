package com.adcolony.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Vibrator;
import androidx.annotation.NonNull;
import com.adcolony.sdk.C0269v;
import com.adobe.air.wand.message.MessageManager;
import java.util.Date;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.adcolony.sdk.j0 */
class C0148j0 {

    /* renamed from: com.adcolony.sdk.j0$a */
    class C0149a implements C0028a0 {
        C0149a() {
        }

        /* renamed from: a */
        public void mo278a(C0284y yVar) {
            C0148j0.this.mo498m(yVar);
        }
    }

    /* renamed from: com.adcolony.sdk.j0$b */
    class C0150b implements C0028a0 {
        C0150b() {
        }

        /* renamed from: a */
        public void mo278a(C0284y yVar) {
            boolean unused = C0148j0.this.m380f(yVar);
        }
    }

    /* renamed from: com.adcolony.sdk.j0$c */
    class C0151c implements C0028a0 {
        C0151c() {
        }

        /* renamed from: a */
        public void mo278a(C0284y yVar) {
            boolean unused = C0148j0.this.m373a(yVar);
        }
    }

    /* renamed from: com.adcolony.sdk.j0$d */
    class C0152d implements C0028a0 {
        C0152d() {
        }

        /* renamed from: a */
        public void mo278a(C0284y yVar) {
            C0148j0.this.mo491c(yVar);
        }
    }

    /* renamed from: com.adcolony.sdk.j0$e */
    class C0153e implements C0028a0 {
        C0153e() {
        }

        /* renamed from: a */
        public void mo278a(C0284y yVar) {
            boolean unused = C0148j0.this.m383o(yVar);
        }
    }

    /* renamed from: com.adcolony.sdk.j0$f */
    class C0154f implements C0028a0 {
        C0154f() {
        }

        /* renamed from: a */
        public void mo278a(C0284y yVar) {
            boolean unused = C0148j0.this.m382k(yVar);
        }
    }

    /* renamed from: com.adcolony.sdk.j0$g */
    class C0155g implements C0028a0 {
        C0155g() {
        }

        /* renamed from: a */
        public void mo278a(C0284y yVar) {
            boolean unused = C0148j0.this.m381j(yVar);
        }
    }

    /* renamed from: com.adcolony.sdk.j0$h */
    class C0156h implements MediaScannerConnection.OnScanCompletedListener {

        /* renamed from: a */
        final /* synthetic */ JSONObject f958a;

        /* renamed from: b */
        final /* synthetic */ C0284y f959b;

        C0156h(JSONObject jSONObject, C0284y yVar) {
            this.f958a = jSONObject;
            this.f959b = yVar;
        }

        public void onScanCompleted(String str, Uri uri) {
            C0190l0.m511a("Screenshot saved to Gallery!", 0);
            C0267t.m809b(this.f958a, "success", true);
            this.f959b.mo735a(this.f958a).mo740d();
        }
    }

    /* renamed from: com.adcolony.sdk.j0$i */
    class C0157i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f961a;

        C0157i(String str) {
            this.f961a = str;
        }

        public void run() {
            JSONObject b = C0267t.m805b();
            C0267t.m798a(b, "type", "open_hook");
            C0267t.m798a(b, MessageManager.NAME_ERROR_MESSAGE, this.f961a);
            new C0284y("CustomMessage.controller_send", 0, b).mo740d();
        }
    }

    /* renamed from: com.adcolony.sdk.j0$j */
    class C0158j implements C0028a0 {
        C0158j() {
        }

        /* renamed from: a */
        public void mo278a(C0284y yVar) {
            C0148j0.this.mo495h(yVar);
        }
    }

    /* renamed from: com.adcolony.sdk.j0$k */
    class C0159k implements C0028a0 {
        C0159k() {
        }

        /* renamed from: a */
        public void mo278a(C0284y yVar) {
            C0148j0.this.mo496i(yVar);
        }
    }

    /* renamed from: com.adcolony.sdk.j0$l */
    class C0160l implements C0028a0 {
        C0160l() {
        }

        /* renamed from: a */
        public void mo278a(C0284y yVar) {
            C0148j0.this.mo499n(yVar);
        }
    }

    /* renamed from: com.adcolony.sdk.j0$m */
    class C0161m implements C0028a0 {
        C0161m() {
        }

        /* renamed from: a */
        public void mo278a(C0284y yVar) {
            C0148j0.this.mo497l(yVar);
        }
    }

    /* renamed from: com.adcolony.sdk.j0$n */
    class C0162n implements C0028a0 {
        C0162n() {
        }

        /* renamed from: a */
        public void mo278a(C0284y yVar) {
            C0148j0.this.mo500p(yVar);
        }
    }

    /* renamed from: com.adcolony.sdk.j0$o */
    class C0163o implements C0028a0 {
        C0163o() {
        }

        /* renamed from: a */
        public void mo278a(C0284y yVar) {
            C0148j0.this.mo494g(yVar);
        }
    }

    /* renamed from: com.adcolony.sdk.j0$p */
    class C0164p implements C0028a0 {
        C0164p() {
        }

        /* renamed from: a */
        public void mo278a(C0284y yVar) {
            C0148j0.this.mo493e(yVar);
        }
    }

    /* renamed from: com.adcolony.sdk.j0$q */
    class C0165q implements C0028a0 {
        C0165q() {
        }

        /* renamed from: a */
        public void mo278a(C0284y yVar) {
            C0148j0.this.mo492d(yVar);
        }
    }

    /* renamed from: com.adcolony.sdk.j0$r */
    class C0166r implements C0028a0 {
        C0166r() {
        }

        /* renamed from: a */
        public void mo278a(C0284y yVar) {
            C0148j0.this.mo489b(yVar);
        }
    }

    C0148j0() {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m373a(C0284y yVar) {
        String h = C0267t.m819h(yVar.mo736b(), "ad_session_id");
        Activity activity = C0026a.m78b() instanceof Activity ? (Activity) C0026a.m78b() : null;
        boolean z = activity instanceof AdColonyAdViewActivity;
        if (!(activity instanceof C0029b)) {
            return false;
        }
        if (z) {
            ((AdColonyAdViewActivity) activity).mo140b();
            return true;
        }
        JSONObject b = C0267t.m805b();
        C0267t.m798a(b, "id", h);
        new C0284y("AdSession.on_request_close", ((C0029b) activity).f119d, b).mo740d();
        return true;
    }

    /* renamed from: b */
    private boolean m375b(@NonNull String str) {
        if (C0026a.m80c().mo432b().mo342b().get(str) == null) {
            return false;
        }
        JSONObject b = C0267t.m805b();
        C0267t.m798a(b, "ad_session_id", str);
        new C0284y("MRAID.on_event", 1, b).mo740d();
        return true;
    }

    /* renamed from: d */
    private void m377d(String str) {
        C0190l0.f1041b.execute(new C0157i(str));
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public boolean m380f(C0284y yVar) {
        JSONObject b = yVar.mo736b();
        C0046d b2 = C0026a.m80c().mo432b();
        String h = C0267t.m819h(b, "ad_session_id");
        AdColonyInterstitial adColonyInterstitial = b2.mo334a().get(h);
        AdColonyAdView adColonyAdView = b2.mo342b().get(h);
        if ((adColonyInterstitial == null || adColonyInterstitial.getListener() == null || adColonyInterstitial.mo222d() == null) && (adColonyAdView == null || adColonyAdView.getListener() == null)) {
            return false;
        }
        if (adColonyAdView == null) {
            new C0284y("AdUnit.make_in_app_purchase", adColonyInterstitial.mo222d().mo317k()).mo740d();
        }
        mo488a(h);
        m375b(h);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public boolean m381j(C0284y yVar) {
        JSONObject b = yVar.mo736b();
        String h = C0267t.m819h(C0267t.m818g(b, "clickOverride"), "url");
        String h2 = C0267t.m819h(b, "ad_session_id");
        C0046d b2 = C0026a.m80c().mo432b();
        AdColonyInterstitial adColonyInterstitial = b2.mo334a().get(h2);
        AdColonyAdView adColonyAdView = b2.mo342b().get(h2);
        if (adColonyInterstitial != null) {
            adColonyInterstitial.mo217b(h);
            return true;
        } else if (adColonyAdView == null) {
            return false;
        } else {
            adColonyAdView.setClickOverride(h);
            return true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public boolean m382k(C0284y yVar) {
        JSONObject b = yVar.mo736b();
        String h = C0267t.m819h(b, "ad_session_id");
        int f = C0267t.m817f(b, "orientation");
        C0046d b2 = C0026a.m80c().mo432b();
        AdColonyAdView adColonyAdView = b2.mo342b().get(h);
        AdColonyInterstitial adColonyInterstitial = b2.mo334a().get(h);
        Context b3 = C0026a.m78b();
        if (adColonyAdView != null) {
            adColonyAdView.setOrientation(f);
        } else if (adColonyInterstitial != null) {
            adColonyInterstitial.mo209a(f);
        }
        if (adColonyInterstitial == null && adColonyAdView == null) {
            new C0269v.C0270a().mo707a("Invalid ad session id sent with set orientation properties message: ").mo707a(h).mo709a(C0269v.f1300j);
            return false;
        } else if (!(b3 instanceof C0029b)) {
            return true;
        } else {
            ((C0029b) b3).mo280a(adColonyAdView == null ? adColonyInterstitial.mo226g() : adColonyAdView.getOrientation());
            return true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public boolean m383o(C0284y yVar) {
        AdColonyAdView adColonyAdView = C0026a.m80c().mo432b().mo342b().get(C0267t.m819h(yVar.mo736b(), "ad_session_id"));
        if (adColonyAdView == null) {
            return false;
        }
        adColonyAdView.setNoCloseButton(C0267t.m814d(yVar.mo736b(), "use_custom_close"));
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo487a() {
        C0026a.m76a("System.open_store", (C0028a0) new C0158j());
        C0026a.m76a("System.save_screenshot", (C0028a0) new C0159k());
        C0026a.m76a("System.telephone", (C0028a0) new C0160l());
        C0026a.m76a("System.sms", (C0028a0) new C0161m());
        C0026a.m76a("System.vibrate", (C0028a0) new C0162n());
        C0026a.m76a("System.open_browser", (C0028a0) new C0163o());
        C0026a.m76a("System.mail", (C0028a0) new C0164p());
        C0026a.m76a("System.launch_app", (C0028a0) new C0165q());
        C0026a.m76a("System.create_calendar_event", (C0028a0) new C0166r());
        C0026a.m76a("System.social_post", (C0028a0) new C0149a());
        C0026a.m76a("System.make_in_app_purchase", (C0028a0) new C0150b());
        C0026a.m76a("System.close", (C0028a0) new C0151c());
        C0026a.m76a("System.expand", (C0028a0) new C0152d());
        C0026a.m76a("System.use_custom_close", (C0028a0) new C0153e());
        C0026a.m76a("System.set_orientation_properties", (C0028a0) new C0154f());
        C0026a.m76a("System.click_override", (C0028a0) new C0155g());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo488a(String str) {
        C0046d b = C0026a.m80c().mo432b();
        AdColonyInterstitial adColonyInterstitial = b.mo334a().get(str);
        if (adColonyInterstitial == null || adColonyInterstitial.getListener() == null) {
            AdColonyAdView adColonyAdView = b.mo342b().get(str);
            AdColonyAdViewListener listener = adColonyAdView != null ? adColonyAdView.getListener() : null;
            if (adColonyAdView != null && listener != null) {
                listener.onClicked(adColonyAdView);
                return;
            }
            return;
        }
        adColonyInterstitial.getListener().onClicked(adColonyInterstitial);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo489b(C0284y yVar) {
        Intent intent;
        C0284y yVar2 = yVar;
        JSONObject b = C0267t.m805b();
        JSONObject b2 = yVar.mo736b();
        String str = "";
        String str2 = "";
        String h = C0267t.m819h(b2, "ad_session_id");
        JSONObject g = C0267t.m818g(b2, "params");
        JSONObject g2 = C0267t.m818g(g, "recurrence");
        JSONArray a = C0267t.m785a();
        JSONArray a2 = C0267t.m785a();
        JSONArray a3 = C0267t.m785a();
        String h2 = C0267t.m819h(g, "description");
        C0267t.m819h(g, "location");
        String h3 = C0267t.m819h(g, "start");
        String h4 = C0267t.m819h(g, "end");
        String h5 = C0267t.m819h(g, "summary");
        if (g2 != null && g2.length() > 0) {
            str2 = C0267t.m819h(g2, "expires");
            str = C0267t.m819h(g2, "frequency").toUpperCase(Locale.getDefault());
            a = C0267t.m810c(g2, "daysInWeek");
            a2 = C0267t.m810c(g2, "daysInMonth");
            a3 = C0267t.m810c(g2, "daysInYear");
        }
        if (h5.equals("")) {
            h5 = h2;
        }
        Date g3 = C0190l0.m533g(h3);
        Date g4 = C0190l0.m533g(h4);
        Date g5 = C0190l0.m533g(str2);
        if (g3 == null || g4 == null) {
            C0190l0.m511a("Unable to create Calendar Event", 0);
            C0267t.m809b(b, "success", false);
            yVar2.mo735a(b).mo740d();
            return false;
        }
        long time = g3.getTime();
        long time2 = g4.getTime();
        long j = 0;
        long time3 = g5 != null ? (g5.getTime() - g3.getTime()) / 1000 : 0;
        if (str.equals("DAILY")) {
            j = (time3 / 86400) + 1;
        } else if (str.equals("WEEKLY")) {
            j = (time3 / 604800) + 1;
        } else if (str.equals("MONTHLY")) {
            j = (time3 / 2629800) + 1;
        } else if (str.equals("YEARLY")) {
            j = (time3 / 31557600) + 1;
        }
        long j2 = j;
        if (g2 == null || g2.length() <= 0) {
            intent = new Intent("android.intent.action.EDIT").setType("vnd.android.cursor.item/event").putExtra("title", h5).putExtra("description", h2).putExtra("beginTime", time).putExtra("endTime", time2);
        } else {
            String str3 = "FREQ=" + str + ";COUNT=" + j2;
            try {
                if (a.length() != 0) {
                    str3 = str3 + ";BYDAY=" + C0190l0.m504a(a);
                }
                if (a2.length() != 0) {
                    str3 = str3 + ";BYMONTHDAY=" + C0190l0.m520b(a2);
                }
                if (a3.length() != 0) {
                    str3 = str3 + ";BYYEARDAY=" + C0190l0.m520b(a3);
                }
            } catch (JSONException unused) {
            }
            intent = new Intent("android.intent.action.EDIT").setType("vnd.android.cursor.item/event").putExtra("title", h5).putExtra("description", h2).putExtra("beginTime", time).putExtra("endTime", time2).putExtra("rrule", str3);
        }
        if (C0190l0.m508a(intent)) {
            C0267t.m809b(b, "success", true);
            yVar.mo735a(b).mo740d();
            mo490c(h);
            mo488a(h);
            m375b(h);
            return true;
        }
        C0190l0.m511a("Unable to create Calendar Event.", 0);
        C0267t.m809b(b, "success", false);
        yVar.mo735a(b).mo740d();
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo490c(String str) {
        C0046d b = C0026a.m80c().mo432b();
        AdColonyInterstitial adColonyInterstitial = b.mo334a().get(str);
        if (adColonyInterstitial == null || adColonyInterstitial.getListener() == null) {
            AdColonyAdView adColonyAdView = b.mo342b().get(str);
            AdColonyAdViewListener listener = adColonyAdView != null ? adColonyAdView.getListener() : null;
            if (adColonyAdView != null && listener != null) {
                listener.onLeftApplication(adColonyAdView);
                return;
            }
            return;
        }
        adColonyInterstitial.getListener().onLeftApplication(adColonyInterstitial);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo491c(C0284y yVar) {
        JSONObject b = yVar.mo736b();
        Context b2 = C0026a.m78b();
        if (b2 != null && C0026a.m82e()) {
            String h = C0267t.m819h(b, "ad_session_id");
            C0122i c = C0026a.m80c();
            AdColonyAdView adColonyAdView = c.mo432b().mo342b().get(h);
            if (adColonyAdView != null && ((adColonyAdView.getTrustedDemandSource() || adColonyAdView.getUserInteraction()) && c.mo441e() != adColonyAdView)) {
                adColonyAdView.setExpandMessage(yVar);
                adColonyAdView.setExpandedWidth(C0267t.m817f(b, "width"));
                adColonyAdView.setExpandedHeight(C0267t.m817f(b, "height"));
                adColonyAdView.setOrientation(C0267t.m784a(b, "orientation", -1));
                adColonyAdView.setNoCloseButton(C0267t.m814d(b, "use_custom_close"));
                c.mo423a(adColonyAdView);
                c.mo428a(adColonyAdView.getContainer());
                Intent intent = new Intent(b2, AdColonyAdViewActivity.class);
                m375b(h);
                mo488a(h);
                C0190l0.m508a(intent);
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo492d(C0284y yVar) {
        JSONObject b = C0267t.m805b();
        JSONObject b2 = yVar.mo736b();
        String h = C0267t.m819h(b2, "ad_session_id");
        if (C0267t.m814d(b2, "deep_link")) {
            return mo495h(yVar);
        }
        Context b3 = C0026a.m78b();
        if (b3 == null) {
            return false;
        }
        if (C0190l0.m508a(b3.getPackageManager().getLaunchIntentForPackage(C0267t.m819h(b2, "handle")))) {
            C0267t.m809b(b, "success", true);
            yVar.mo735a(b).mo740d();
            mo490c(h);
            mo488a(h);
            m375b(h);
            return true;
        }
        C0190l0.m511a("Failed to launch external application.", 0);
        C0267t.m809b(b, "success", false);
        yVar.mo735a(b).mo740d();
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo493e(C0284y yVar) {
        JSONObject b = C0267t.m805b();
        JSONObject b2 = yVar.mo736b();
        JSONArray c = C0267t.m810c(b2, "recipients");
        boolean d = C0267t.m814d(b2, "html");
        String h = C0267t.m819h(b2, "subject");
        String h2 = C0267t.m819h(b2, "body");
        String h3 = C0267t.m819h(b2, "ad_session_id");
        String[] strArr = new String[c.length()];
        for (int i = 0; i < c.length(); i++) {
            strArr[i] = C0267t.m813d(c, i);
        }
        Intent intent = new Intent("android.intent.action.SEND");
        if (!d) {
            intent.setType("plain/text");
        }
        intent.putExtra("android.intent.extra.SUBJECT", h).putExtra("android.intent.extra.TEXT", h2).putExtra("android.intent.extra.EMAIL", strArr);
        if (C0190l0.m508a(intent)) {
            C0267t.m809b(b, "success", true);
            yVar.mo735a(b).mo740d();
            mo490c(h3);
            mo488a(h3);
            m375b(h3);
            return true;
        }
        C0190l0.m511a("Failed to send email.", 0);
        C0267t.m809b(b, "success", false);
        yVar.mo735a(b).mo740d();
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo494g(C0284y yVar) {
        JSONObject b = C0267t.m805b();
        JSONObject b2 = yVar.mo736b();
        String h = C0267t.m819h(b2, "url");
        String h2 = C0267t.m819h(b2, "ad_session_id");
        AdColonyAdView adColonyAdView = C0026a.m80c().mo432b().mo342b().get(h2);
        if (adColonyAdView != null && !adColonyAdView.getTrustedDemandSource() && !adColonyAdView.getUserInteraction()) {
            return false;
        }
        if (h.startsWith("browser")) {
            h = h.replaceFirst("browser", "http");
        }
        if (h.startsWith("safari")) {
            h = h.replaceFirst("safari", "http");
        }
        m377d(h);
        if (C0190l0.m508a(new Intent("android.intent.action.VIEW", Uri.parse(h)))) {
            C0267t.m809b(b, "success", true);
            yVar.mo735a(b).mo740d();
            mo490c(h2);
            mo488a(h2);
            m375b(h2);
            return true;
        }
        C0190l0.m511a("Failed to launch browser.", 0);
        C0267t.m809b(b, "success", false);
        yVar.mo735a(b).mo740d();
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo495h(C0284y yVar) {
        JSONObject b = C0267t.m805b();
        JSONObject b2 = yVar.mo736b();
        String h = C0267t.m819h(b2, "product_id");
        String h2 = C0267t.m819h(b2, "ad_session_id");
        if (h.equals("")) {
            h = C0267t.m819h(b2, "handle");
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(h));
        m377d(h);
        if (C0190l0.m508a(intent)) {
            C0267t.m809b(b, "success", true);
            yVar.mo735a(b).mo740d();
            mo490c(h2);
            mo488a(h2);
            m375b(h2);
            return true;
        }
        C0190l0.m511a("Unable to open.", 0);
        C0267t.m809b(b, "success", false);
        yVar.mo735a(b).mo740d();
        return false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:8|9|10|11|12|13) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        com.adcolony.sdk.C0190l0.m511a("Error saving screenshot.", 0);
        com.adcolony.sdk.C0267t.m809b(r2, "success", false);
        r11.mo735a(r2).mo740d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00e1, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00e2, code lost:
        com.adcolony.sdk.C0190l0.m511a("Error saving screenshot.", 0);
        com.adcolony.sdk.C0267t.m809b(r2, "success", false);
        r11.mo735a(r2).mo740d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00f3, code lost:
        return false;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x00ab */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo496i(com.adcolony.sdk.C0284y r11) {
        /*
            r10 = this;
            android.content.Context r0 = com.adcolony.sdk.C0026a.m78b()
            r1 = 0
            if (r0 == 0) goto L_0x011f
            boolean r2 = r0 instanceof android.app.Activity
            if (r2 != 0) goto L_0x000d
            goto L_0x011f
        L_0x000d:
            java.lang.String r2 = "android.permission.WRITE_EXTERNAL_STORAGE"
            int r2 = androidx.core.app.ActivityCompat.checkSelfPermission(r0, r2)     // Catch:{ NoClassDefFoundError -> 0x010a }
            if (r2 != 0) goto L_0x00f4
            org.json.JSONObject r2 = r11.mo736b()     // Catch:{ NoClassDefFoundError -> 0x010a }
            java.lang.String r3 = "ad_session_id"
            java.lang.String r2 = com.adcolony.sdk.C0267t.m819h(r2, r3)     // Catch:{ NoClassDefFoundError -> 0x010a }
            r10.mo488a((java.lang.String) r2)     // Catch:{ NoClassDefFoundError -> 0x010a }
            org.json.JSONObject r2 = com.adcolony.sdk.C0267t.m805b()     // Catch:{ NoClassDefFoundError -> 0x010a }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ NoClassDefFoundError -> 0x010a }
            r3.<init>()     // Catch:{ NoClassDefFoundError -> 0x010a }
            java.io.File r4 = android.os.Environment.getExternalStorageDirectory()     // Catch:{ NoClassDefFoundError -> 0x010a }
            java.lang.String r4 = r4.toString()     // Catch:{ NoClassDefFoundError -> 0x010a }
            r3.append(r4)     // Catch:{ NoClassDefFoundError -> 0x010a }
            java.lang.String r4 = "/Pictures/AdColony_Screenshots/AdColony_Screenshot_"
            r3.append(r4)     // Catch:{ NoClassDefFoundError -> 0x010a }
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ NoClassDefFoundError -> 0x010a }
            r3.append(r4)     // Catch:{ NoClassDefFoundError -> 0x010a }
            java.lang.String r4 = ".jpg"
            r3.append(r4)     // Catch:{ NoClassDefFoundError -> 0x010a }
            java.lang.String r3 = r3.toString()     // Catch:{ NoClassDefFoundError -> 0x010a }
            r4 = r0
            android.app.Activity r4 = (android.app.Activity) r4     // Catch:{ NoClassDefFoundError -> 0x010a }
            android.view.Window r4 = r4.getWindow()     // Catch:{ NoClassDefFoundError -> 0x010a }
            android.view.View r4 = r4.getDecorView()     // Catch:{ NoClassDefFoundError -> 0x010a }
            android.view.View r4 = r4.getRootView()     // Catch:{ NoClassDefFoundError -> 0x010a }
            r5 = 1
            r4.setDrawingCacheEnabled(r5)     // Catch:{ NoClassDefFoundError -> 0x010a }
            android.graphics.Bitmap r6 = r4.getDrawingCache()     // Catch:{ NoClassDefFoundError -> 0x010a }
            android.graphics.Bitmap r6 = android.graphics.Bitmap.createBitmap(r6)     // Catch:{ NoClassDefFoundError -> 0x010a }
            r4.setDrawingCacheEnabled(r1)     // Catch:{ NoClassDefFoundError -> 0x010a }
            java.io.File r4 = new java.io.File     // Catch:{ Exception -> 0x00ab }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00ab }
            r7.<init>()     // Catch:{ Exception -> 0x00ab }
            java.io.File r8 = android.os.Environment.getExternalStorageDirectory()     // Catch:{ Exception -> 0x00ab }
            java.lang.String r8 = r8.getPath()     // Catch:{ Exception -> 0x00ab }
            r7.append(r8)     // Catch:{ Exception -> 0x00ab }
            java.lang.String r8 = "/Pictures"
            r7.append(r8)     // Catch:{ Exception -> 0x00ab }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x00ab }
            r4.<init>(r7)     // Catch:{ Exception -> 0x00ab }
            java.io.File r7 = new java.io.File     // Catch:{ Exception -> 0x00ab }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00ab }
            r8.<init>()     // Catch:{ Exception -> 0x00ab }
            java.io.File r9 = android.os.Environment.getExternalStorageDirectory()     // Catch:{ Exception -> 0x00ab }
            java.lang.String r9 = r9.getPath()     // Catch:{ Exception -> 0x00ab }
            r8.append(r9)     // Catch:{ Exception -> 0x00ab }
            java.lang.String r9 = "/Pictures/AdColony_Screenshots"
            r8.append(r9)     // Catch:{ Exception -> 0x00ab }
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x00ab }
            r7.<init>(r8)     // Catch:{ Exception -> 0x00ab }
            r4.mkdirs()     // Catch:{ Exception -> 0x00ab }
            r7.mkdirs()     // Catch:{ Exception -> 0x00ab }
        L_0x00ab:
            java.io.File r4 = new java.io.File     // Catch:{ FileNotFoundException -> 0x00e2, IOException -> 0x00d0 }
            r4.<init>(r3)     // Catch:{ FileNotFoundException -> 0x00e2, IOException -> 0x00d0 }
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x00e2, IOException -> 0x00d0 }
            r7.<init>(r4)     // Catch:{ FileNotFoundException -> 0x00e2, IOException -> 0x00d0 }
            android.graphics.Bitmap$CompressFormat r4 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ FileNotFoundException -> 0x00e2, IOException -> 0x00d0 }
            r8 = 90
            r6.compress(r4, r8, r7)     // Catch:{ FileNotFoundException -> 0x00e2, IOException -> 0x00d0 }
            r7.flush()     // Catch:{ FileNotFoundException -> 0x00e2, IOException -> 0x00d0 }
            r7.close()     // Catch:{ FileNotFoundException -> 0x00e2, IOException -> 0x00d0 }
            java.lang.String[] r4 = new java.lang.String[r5]     // Catch:{ FileNotFoundException -> 0x00e2, IOException -> 0x00d0 }
            r4[r1] = r3     // Catch:{ FileNotFoundException -> 0x00e2, IOException -> 0x00d0 }
            r3 = 0
            com.adcolony.sdk.j0$h r6 = new com.adcolony.sdk.j0$h     // Catch:{ FileNotFoundException -> 0x00e2, IOException -> 0x00d0 }
            r6.<init>(r2, r11)     // Catch:{ FileNotFoundException -> 0x00e2, IOException -> 0x00d0 }
            android.media.MediaScannerConnection.scanFile(r0, r4, r3, r6)     // Catch:{ FileNotFoundException -> 0x00e2, IOException -> 0x00d0 }
            return r5
        L_0x00d0:
            java.lang.String r0 = "Error saving screenshot."
            com.adcolony.sdk.C0190l0.m511a((java.lang.String) r0, (int) r1)     // Catch:{ NoClassDefFoundError -> 0x010a }
            java.lang.String r0 = "success"
            com.adcolony.sdk.C0267t.m809b((org.json.JSONObject) r2, (java.lang.String) r0, (boolean) r1)     // Catch:{ NoClassDefFoundError -> 0x010a }
            com.adcolony.sdk.y r0 = r11.mo735a((org.json.JSONObject) r2)     // Catch:{ NoClassDefFoundError -> 0x010a }
            r0.mo740d()     // Catch:{ NoClassDefFoundError -> 0x010a }
            return r1
        L_0x00e2:
            java.lang.String r0 = "Error saving screenshot."
            com.adcolony.sdk.C0190l0.m511a((java.lang.String) r0, (int) r1)     // Catch:{ NoClassDefFoundError -> 0x010a }
            java.lang.String r0 = "success"
            com.adcolony.sdk.C0267t.m809b((org.json.JSONObject) r2, (java.lang.String) r0, (boolean) r1)     // Catch:{ NoClassDefFoundError -> 0x010a }
            com.adcolony.sdk.y r0 = r11.mo735a((org.json.JSONObject) r2)     // Catch:{ NoClassDefFoundError -> 0x010a }
            r0.mo740d()     // Catch:{ NoClassDefFoundError -> 0x010a }
            return r1
        L_0x00f4:
            java.lang.String r0 = "Error saving screenshot."
            com.adcolony.sdk.C0190l0.m511a((java.lang.String) r0, (int) r1)     // Catch:{ NoClassDefFoundError -> 0x010a }
            org.json.JSONObject r0 = r11.mo736b()     // Catch:{ NoClassDefFoundError -> 0x010a }
            java.lang.String r2 = "success"
            com.adcolony.sdk.C0267t.m809b((org.json.JSONObject) r0, (java.lang.String) r2, (boolean) r1)     // Catch:{ NoClassDefFoundError -> 0x010a }
            com.adcolony.sdk.y r0 = r11.mo735a((org.json.JSONObject) r0)     // Catch:{ NoClassDefFoundError -> 0x010a }
            r0.mo740d()     // Catch:{ NoClassDefFoundError -> 0x010a }
            return r1
        L_0x010a:
            java.lang.String r0 = "Error saving screenshot."
            com.adcolony.sdk.C0190l0.m511a((java.lang.String) r0, (int) r1)
            org.json.JSONObject r0 = r11.mo736b()
            java.lang.String r2 = "success"
            com.adcolony.sdk.C0267t.m809b((org.json.JSONObject) r0, (java.lang.String) r2, (boolean) r1)
            com.adcolony.sdk.y r11 = r11.mo735a((org.json.JSONObject) r0)
            r11.mo740d()
        L_0x011f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.C0148j0.mo496i(com.adcolony.sdk.y):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public boolean mo497l(C0284y yVar) {
        JSONObject b = yVar.mo736b();
        JSONObject b2 = C0267t.m805b();
        String h = C0267t.m819h(b, "ad_session_id");
        JSONArray c = C0267t.m810c(b, "recipients");
        String str = "";
        for (int i = 0; i < c.length(); i++) {
            if (i != 0) {
                str = str + ";";
            }
            str = str + C0267t.m813d(c, i);
        }
        if (C0190l0.m508a(new Intent("android.intent.action.VIEW", Uri.parse("smsto:" + str)).putExtra("sms_body", C0267t.m819h(b, "body")))) {
            C0267t.m809b(b2, "success", true);
            yVar.mo735a(b2).mo740d();
            mo490c(h);
            mo488a(h);
            m375b(h);
            return true;
        }
        C0190l0.m511a("Failed to create sms.", 0);
        C0267t.m809b(b2, "success", false);
        yVar.mo735a(b2).mo740d();
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public boolean mo498m(C0284y yVar) {
        JSONObject b = C0267t.m805b();
        JSONObject b2 = yVar.mo736b();
        Intent type = new Intent("android.intent.action.SEND").setType("text/plain");
        Intent putExtra = type.putExtra("android.intent.extra.TEXT", C0267t.m819h(b2, "text") + " " + C0267t.m819h(b2, "url"));
        String h = C0267t.m819h(b2, "ad_session_id");
        if (C0190l0.m509a(putExtra, true)) {
            C0267t.m809b(b, "success", true);
            yVar.mo735a(b).mo740d();
            mo490c(h);
            mo488a(h);
            m375b(h);
            return true;
        }
        C0190l0.m511a("Unable to create social post.", 0);
        C0267t.m809b(b, "success", false);
        yVar.mo735a(b).mo740d();
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public boolean mo499n(C0284y yVar) {
        JSONObject b = C0267t.m805b();
        JSONObject b2 = yVar.mo736b();
        Intent intent = new Intent("android.intent.action.DIAL");
        Intent data = intent.setData(Uri.parse("tel:" + C0267t.m819h(b2, "phone_number")));
        String h = C0267t.m819h(b2, "ad_session_id");
        if (C0190l0.m508a(data)) {
            C0267t.m809b(b, "success", true);
            yVar.mo735a(b).mo740d();
            mo490c(h);
            mo488a(h);
            m375b(h);
            return true;
        }
        C0190l0.m511a("Failed to dial number.", 0);
        C0267t.m809b(b, "success", false);
        yVar.mo735a(b).mo740d();
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public boolean mo500p(C0284y yVar) {
        Context b = C0026a.m78b();
        if (b == null) {
            return false;
        }
        int a = C0267t.m784a(yVar.mo736b(), "length_ms", 500);
        JSONObject b2 = C0267t.m805b();
        JSONArray d = C0190l0.m527d(b);
        boolean z = false;
        for (int i = 0; i < d.length(); i++) {
            if (C0267t.m813d(d, i).equals("android.permission.VIBRATE")) {
                z = true;
            }
        }
        if (!z) {
            new C0269v.C0270a().mo707a("No vibrate permission detected.").mo709a(C0269v.f1297g);
            C0267t.m809b(b2, "success", false);
            yVar.mo735a(b2).mo740d();
            return false;
        }
        try {
            Vibrator vibrator = (Vibrator) b.getSystemService("vibrator");
            if (vibrator != null) {
                vibrator.vibrate((long) a);
                C0267t.m809b(b2, "success", true);
                yVar.mo735a(b2).mo740d();
                return true;
            }
        } catch (Exception unused) {
            new C0269v.C0270a().mo707a("Vibrate command failed.").mo709a(C0269v.f1297g);
        }
        C0267t.m809b(b2, "success", false);
        yVar.mo735a(b2).mo740d();
        return false;
    }
}
