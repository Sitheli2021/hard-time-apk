package com.adcolony.sdk;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.JavascriptInterface;
import android.webkit.JsResult;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AbsoluteLayout;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.RequiresApi;
import com.adcolony.sdk.C0269v;
import com.iab.omid.library.adcolony.ScriptInjector;
import com.iab.omid.library.adcolony.adsession.FriendlyObstructionPurpose;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.regex.Matcher;
import org.json.JSONArray;
import org.json.JSONObject;

@SuppressLint({"SetJavaScriptEnabled"})
/* renamed from: com.adcolony.sdk.n0 */
class C0210n0 extends WebView implements C0031b0 {

    /* renamed from: O */
    static boolean f1129O;

    /* renamed from: A */
    private boolean f1130A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public boolean f1131B;

    /* renamed from: C */
    private boolean f1132C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public boolean f1133D;

    /* renamed from: E */
    private boolean f1134E;

    /* renamed from: F */
    private boolean f1135F;

    /* renamed from: G */
    private boolean f1136G;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public JSONArray f1137H = C0267t.m785a();
    /* access modifiers changed from: private */

    /* renamed from: I */
    public JSONObject f1138I = C0267t.m805b();

    /* renamed from: J */
    private JSONObject f1139J = C0267t.m805b();
    /* access modifiers changed from: private */

    /* renamed from: K */
    public C0032c f1140K;
    /* access modifiers changed from: private */

    /* renamed from: L */
    public C0284y f1141L;

    /* renamed from: M */
    private ImageView f1142M;
    /* access modifiers changed from: private */

    /* renamed from: N */
    public final Object f1143N = new Object();

    /* renamed from: a */
    private String f1144a;

    /* renamed from: b */
    private String f1145b;

    /* renamed from: c */
    private String f1146c = "";

    /* renamed from: d */
    private String f1147d = "";
    /* access modifiers changed from: private */

    /* renamed from: e */
    public String f1148e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public String f1149f = "";

    /* renamed from: g */
    private String f1150g = "";

    /* renamed from: h */
    private String f1151h = "";
    /* access modifiers changed from: private */

    /* renamed from: i */
    public String f1152i = "";

    /* renamed from: j */
    private String f1153j = "";
    /* access modifiers changed from: private */

    /* renamed from: k */
    public String f1154k = "";
    /* access modifiers changed from: private */

    /* renamed from: l */
    public int f1155l;

    /* renamed from: m */
    private int f1156m;

    /* renamed from: n */
    private int f1157n;

    /* renamed from: o */
    private int f1158o;

    /* renamed from: p */
    private int f1159p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public int f1160q;

    /* renamed from: r */
    private int f1161r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public int f1162s;

    /* renamed from: t */
    private int f1163t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public int f1164u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public int f1165v;

    /* renamed from: w */
    private int f1166w;

    /* renamed from: x */
    private int f1167x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public boolean f1168y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public boolean f1169z;

    /* renamed from: com.adcolony.sdk.n0$a */
    class C0211a extends C0225k {
        C0211a() {
            super(C0210n0.this, (C0211a) null);
        }

        @RequiresApi(api = 23)
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            C0210n0.this.m619a(webResourceError.getErrorCode(), webResourceError.getDescription().toString(), webResourceRequest.getUrl().toString());
        }

        @RequiresApi(api = 23)
        public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            if (webResourceRequest.getUrl().toString().endsWith("mraid.js")) {
                try {
                    return new WebResourceResponse("text/javascript", "UTF-8", new ByteArrayInputStream(C0210n0.this.f1149f.getBytes("UTF-8")));
                } catch (UnsupportedEncodingException unused) {
                    new C0269v.C0270a().mo707a("UTF-8 not supported.").mo709a(C0269v.f1300j);
                }
            }
            return null;
        }

        @RequiresApi(api = 24)
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            if (!C0210n0.this.f1131B || !webResourceRequest.isForMainFrame()) {
                return false;
            }
            String k = C0210n0.this.mo628k();
            Uri url = k == null ? webResourceRequest.getUrl() : Uri.parse(k);
            C0190l0.m508a(new Intent("android.intent.action.VIEW", url));
            JSONObject b = C0267t.m805b();
            C0267t.m798a(b, "url", url.toString());
            C0267t.m798a(b, "ad_session_id", C0210n0.this.f1148e);
            new C0284y("WebView.redirect_detected", C0210n0.this.f1140K.mo317k(), b).mo740d();
            C0148j0 w = C0026a.m80c().mo460w();
            w.mo488a(C0210n0.this.f1148e);
            w.mo490c(C0210n0.this.f1148e);
            return true;
        }
    }

    /* renamed from: com.adcolony.sdk.n0$b */
    class C0212b extends C0225k {
        C0212b() {
            super(C0210n0.this, (C0211a) null);
        }

        @RequiresApi(api = 21)
        public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            if (webResourceRequest.getUrl().toString().endsWith("mraid.js")) {
                try {
                    return new WebResourceResponse("text/javascript", "UTF-8", new ByteArrayInputStream(C0210n0.this.f1149f.getBytes("UTF-8")));
                } catch (UnsupportedEncodingException unused) {
                    new C0269v.C0270a().mo707a("UTF-8 not supported.").mo709a(C0269v.f1300j);
                }
            }
            return null;
        }
    }

    /* renamed from: com.adcolony.sdk.n0$c */
    class C0213c implements C0028a0 {

        /* renamed from: com.adcolony.sdk.n0$c$a */
        class C0214a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C0284y f1173a;

            C0214a(C0284y yVar) {
                this.f1173a = yVar;
            }

            public void run() {
                C0210n0.this.mo620b(this.f1173a);
            }
        }

        C0213c() {
        }

        /* renamed from: a */
        public void mo278a(C0284y yVar) {
            if (C0210n0.this.mo623c(yVar)) {
                C0190l0.m510a((Runnable) new C0214a(yVar));
            }
        }
    }

    /* renamed from: com.adcolony.sdk.n0$d */
    class C0215d implements C0028a0 {

        /* renamed from: com.adcolony.sdk.n0$d$a */
        class C0216a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C0284y f1176a;

            C0216a(C0284y yVar) {
                this.f1176a = yVar;
            }

            public void run() {
                C0210n0.this.mo615a(this.f1176a);
            }
        }

        C0215d() {
        }

        /* renamed from: a */
        public void mo278a(C0284y yVar) {
            if (C0210n0.this.mo623c(yVar)) {
                C0190l0.m510a((Runnable) new C0216a(yVar));
            }
        }
    }

    /* renamed from: com.adcolony.sdk.n0$e */
    class C0217e implements C0028a0 {

        /* renamed from: com.adcolony.sdk.n0$e$a */
        class C0218a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C0284y f1179a;

            C0218a(C0284y yVar) {
                this.f1179a = yVar;
            }

            public void run() {
                C0210n0.this.mo621b(C0267t.m819h(this.f1179a.mo736b(), "custom_js"));
            }
        }

        C0217e() {
        }

        /* renamed from: a */
        public void mo278a(C0284y yVar) {
            if (C0210n0.this.mo623c(yVar)) {
                C0190l0.m510a((Runnable) new C0218a(yVar));
            }
        }
    }

    /* renamed from: com.adcolony.sdk.n0$f */
    class C0219f implements C0028a0 {

        /* renamed from: com.adcolony.sdk.n0$f$a */
        class C0220a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C0284y f1182a;

            C0220a(C0284y yVar) {
                this.f1182a = yVar;
            }

            public void run() {
                C0210n0.this.m629b(C0267t.m814d(this.f1182a.mo736b(), "transparent"));
            }
        }

        C0219f() {
        }

        /* renamed from: a */
        public void mo278a(C0284y yVar) {
            if (C0210n0.this.mo623c(yVar)) {
                C0190l0.m510a((Runnable) new C0220a(yVar));
            }
        }
    }

    /* renamed from: com.adcolony.sdk.n0$g */
    class C0221g implements View.OnClickListener {
        C0221g() {
        }

        public void onClick(View view) {
            C0190l0.m508a(new Intent("android.intent.action.VIEW", Uri.parse(C0210n0.this.f1152i)));
            C0026a.m80c().mo460w().mo490c(C0210n0.this.f1148e);
        }
    }

    /* renamed from: com.adcolony.sdk.n0$h */
    class C0222h implements Runnable {
        C0222h() {
        }

        public void run() {
            String str = "";
            synchronized (C0210n0.this.f1143N) {
                if (C0210n0.this.f1137H.length() > 0) {
                    if (C0210n0.this.f1168y) {
                        str = C0210n0.this.f1137H.toString();
                    }
                    JSONArray unused = C0210n0.this.f1137H = C0267t.m785a();
                }
            }
            if (C0210n0.this.f1168y) {
                C0210n0 n0Var = C0210n0.this;
                n0Var.mo621b("NativeLayer.dispatch_messages(ADC3_update(" + str + "), '" + C0210n0.this.f1154k + "');");
            }
        }
    }

    /* renamed from: com.adcolony.sdk.n0$i */
    private class C0223i {
        private C0223i() {
        }

        /* synthetic */ C0223i(C0210n0 n0Var, C0211a aVar) {
            this();
        }

        @JavascriptInterface
        public void dispatch_messages(String str, String str2) {
            if (str2.equals(C0210n0.this.f1154k)) {
                C0210n0.this.m622a(str);
            }
        }

        @JavascriptInterface
        public void enable_reverse_messaging(String str) {
            if (str.equals(C0210n0.this.f1154k)) {
                boolean unused = C0210n0.this.f1133D = true;
            }
        }

        @JavascriptInterface
        public String pull_messages(String str) {
            if (!str.equals(C0210n0.this.f1154k)) {
                return "[]";
            }
            String str2 = "[]";
            synchronized (C0210n0.this.f1143N) {
                if (C0210n0.this.f1137H.length() > 0) {
                    if (C0210n0.this.f1168y) {
                        str2 = C0210n0.this.f1137H.toString();
                    }
                    JSONArray unused = C0210n0.this.f1137H = C0267t.m785a();
                }
            }
            return str2;
        }

        @JavascriptInterface
        public void push_messages(String str, String str2) {
            if (str2.equals(C0210n0.this.f1154k)) {
                C0210n0.this.m622a(str);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.n0$j */
    private class C0224j extends WebChromeClient {
        private C0224j() {
        }

        /* synthetic */ C0224j(C0210n0 n0Var, C0211a aVar) {
            this();
        }

        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            ConsoleMessage.MessageLevel messageLevel = consoleMessage.messageLevel();
            C0046d b = C0026a.m80c().mo432b();
            String message = consoleMessage.message();
            boolean z = false;
            boolean z2 = message.contains("Viewport target-densitydpi is not supported.") || message.contains("Viewport argument key \"shrink-to-fit\" not recognized and ignored");
            boolean z3 = messageLevel == ConsoleMessage.MessageLevel.ERROR;
            if (messageLevel == ConsoleMessage.MessageLevel.WARNING) {
                z = true;
            }
            if (message.contains("ADC3_update is not defined") || message.contains("NativeLayer.dispatch_messages is not a function")) {
                C0210n0 n0Var = C0210n0.this;
                n0Var.m623a(n0Var.f1141L.mo736b(), "Unable to communicate with AdColony. Please ensure that you have added an exception for our Javascript interface in your ProGuard configuration and that you do not have a faulty proxy enabled on your device.");
            }
            if (!z2 && (z || z3)) {
                AdColonyInterstitial adColonyInterstitial = C0210n0.this.f1148e == null ? null : b.mo334a().get(C0210n0.this.f1148e);
                String a = adColonyInterstitial == null ? "unknown" : adColonyInterstitial.mo208a();
                C0269v.C0270a aVar = new C0269v.C0270a();
                aVar.mo707a("onConsoleMessage: " + message + " with ad id: " + a).mo709a(z3 ? C0269v.f1300j : C0269v.f1298h);
            }
            return true;
        }

        public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            jsResult.confirm();
            return true;
        }
    }

    /* renamed from: com.adcolony.sdk.n0$k */
    private class C0225k extends WebViewClient {
        private C0225k() {
        }

        /* synthetic */ C0225k(C0210n0 n0Var, C0211a aVar) {
            this();
        }

        public void onPageFinished(WebView webView, String str) {
            JSONObject b = C0267t.m805b();
            C0267t.m808b(b, "id", C0210n0.this.f1155l);
            C0267t.m798a(b, "url", str);
            if (C0210n0.this.f1140K == null) {
                new C0284y("WebView.on_load", C0210n0.this.f1164u, b).mo740d();
            } else {
                C0267t.m798a(b, "ad_session_id", C0210n0.this.f1148e);
                C0267t.m808b(b, "container_id", C0210n0.this.f1140K.mo299c());
                new C0284y("WebView.on_load", C0210n0.this.f1140K.mo317k(), b).mo740d();
            }
            if ((C0210n0.this.f1168y || C0210n0.this.f1169z) && !C0210n0.this.f1131B) {
                int i = C0210n0.this.f1165v > 0 ? C0210n0.this.f1165v : C0210n0.this.f1164u;
                if (C0210n0.this.f1165v > 0) {
                    float n = C0026a.m80c().mo445h().mo533n();
                    C0267t.m808b(C0210n0.this.f1138I, "app_orientation", C0190l0.m526d(C0190l0.m529e()));
                    C0267t.m808b(C0210n0.this.f1138I, "x", C0190l0.m498a((View) C0210n0.this));
                    C0267t.m808b(C0210n0.this.f1138I, "y", C0190l0.m514b((View) C0210n0.this));
                    C0267t.m808b(C0210n0.this.f1138I, "width", (int) (((float) C0210n0.this.f1160q) / n));
                    C0267t.m808b(C0210n0.this.f1138I, "height", (int) (((float) C0210n0.this.f1162s) / n));
                    C0267t.m798a(C0210n0.this.f1138I, "ad_session_id", C0210n0.this.f1148e);
                }
                String unused = C0210n0.this.f1154k = C0190l0.m502a();
                JSONObject a = C0267t.m791a(C0267t.m805b(), C0210n0.this.f1138I);
                C0267t.m798a(a, "message_key", C0210n0.this.f1154k);
                C0210n0 n0Var = C0210n0.this;
                n0Var.mo621b("ADC3_init(" + i + "," + a.toString() + ");");
                boolean unused2 = C0210n0.this.f1131B = true;
            }
            if (!C0210n0.this.f1169z) {
                return;
            }
            if (C0210n0.this.f1164u != 1 || C0210n0.this.f1165v > 0) {
                JSONObject b2 = C0267t.m805b();
                C0267t.m809b(b2, "success", true);
                C0267t.m808b(b2, "id", C0210n0.this.f1164u);
                C0210n0.this.f1141L.mo735a(b2).mo740d();
            }
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            boolean unused = C0210n0.this.f1131B = false;
        }

        public void onReceivedError(WebView webView, int i, String str, String str2) {
            if (Build.VERSION.SDK_INT < 23) {
                C0210n0.this.m619a(i, str, str2);
            }
        }

        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            if (Build.VERSION.SDK_INT < 26) {
                return super.onRenderProcessGone(webView, renderProcessGoneDetail);
            }
            if (!renderProcessGoneDetail.didCrash()) {
                return true;
            }
            C0210n0.this.m623a(C0267t.m805b(), "An error occurred while rendering the ad. Ad closing.");
            return true;
        }

        @TargetApi(11)
        public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            if (Build.VERSION.SDK_INT < 21 && str.endsWith("mraid.js")) {
                try {
                    return new WebResourceResponse("text/javascript", "UTF-8", new ByteArrayInputStream(C0210n0.this.f1149f.getBytes("UTF-8")));
                } catch (UnsupportedEncodingException unused) {
                    new C0269v.C0270a().mo707a("UTF-8 not supported.").mo709a(C0269v.f1300j);
                }
            }
            return null;
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (!C0210n0.this.f1131B) {
                return false;
            }
            String k = C0210n0.this.mo628k();
            if (k == null) {
                k = str;
            }
            C0190l0.m508a(new Intent("android.intent.action.VIEW", Uri.parse(k)));
            C0148j0 w = C0026a.m80c().mo460w();
            w.mo488a(C0210n0.this.f1148e);
            w.mo490c(C0210n0.this.f1148e);
            JSONObject b = C0267t.m805b();
            C0267t.m798a(b, "url", k);
            C0267t.m798a(b, "ad_session_id", C0210n0.this.f1148e);
            new C0284y("WebView.redirect_detected", C0210n0.this.f1140K.mo317k(), b).mo740d();
            return true;
        }
    }

    private C0210n0(Context context) {
        super(context);
    }

    C0210n0(Context context, int i, boolean z) {
        super(context);
        this.f1164u = i;
        this.f1130A = z;
    }

    C0210n0(Context context, C0284y yVar, int i, int i2, C0032c cVar) {
        super(context);
        this.f1141L = yVar;
        mo616a(yVar, i, i2, cVar);
        mo638u();
    }

    /* renamed from: A */
    private boolean m614A() {
        return m649t() != null;
    }

    /* renamed from: a */
    private String m617a(String str, String str2) {
        C0046d b = C0026a.m80c().mo432b();
        AdColonyInterstitial t = m649t();
        AdColonyAdViewListener adColonyAdViewListener = b.mo344c().get(this.f1148e);
        if (t != null && this.f1139J.length() > 0 && !C0267t.m819h(this.f1139J, "ad_type").equals("video")) {
            t.mo213a(this.f1139J);
        } else if (adColonyAdViewListener != null && this.f1139J.length() > 0) {
            adColonyAdViewListener.mo151a(new C0076d0(this.f1139J, this.f1148e));
        }
        C0076d0 f = t == null ? null : t.mo225f();
        if (f == null && adColonyAdViewListener != null) {
            f = adColonyAdViewListener.mo153b();
        }
        if (f != null && f.mo371d() == 2) {
            this.f1134E = true;
            if (!str2.equals("")) {
                try {
                    return ScriptInjector.injectScriptContentIntoHtml(C0026a.m80c().mo448k().mo683a(str2, false).toString(), str);
                } catch (IOException e) {
                    m625a((Exception) e);
                }
            }
        }
        return str;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m619a(int i, String str, String str2) {
        if (this.f1140K != null) {
            JSONObject b = C0267t.m805b();
            C0267t.m808b(b, "id", this.f1155l);
            C0267t.m798a(b, "ad_session_id", this.f1148e);
            C0267t.m808b(b, "container_id", this.f1140K.mo299c());
            C0267t.m808b(b, "code", i);
            C0267t.m798a(b, "error", str);
            C0267t.m798a(b, "url", str2);
            new C0284y("WebView.on_error", this.f1140K.mo317k(), b).mo740d();
        }
        new C0269v.C0270a().mo707a("onReceivedError: ").mo707a(str).mo709a(C0269v.f1300j);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m622a(String str) {
        JSONArray a = C0267t.m786a(str);
        for (int i = 0; i < a.length(); i++) {
            C0026a.m80c().mo451n().mo746a(C0267t.m812c(a, i));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m623a(JSONObject jSONObject, String str) {
        Context b = C0026a.m78b();
        if (b != null && (b instanceof C0029b)) {
            C0026a.m80c().mo432b().mo335a(b, jSONObject, str);
        } else if (this.f1164u == 1) {
            new C0269v.C0270a().mo707a("Unable to communicate with controller, disabling AdColony.").mo709a(C0269v.f1299i);
            AdColony.disable();
        } else if (this.f1165v > 0) {
            this.f1168y = false;
        }
    }

    /* renamed from: a */
    private boolean m625a(Exception exc) {
        AdColonyInterstitialListener listener;
        new C0269v.C0270a().mo707a(exc.getClass().toString()).mo707a(" during metadata injection w/ metadata = ").mo707a(C0267t.m819h(this.f1138I, "metadata")).mo709a(C0269v.f1300j);
        AdColonyInterstitial remove = C0026a.m80c().mo432b().mo334a().remove(C0267t.m819h(this.f1138I, "ad_session_id"));
        if (remove == null || (listener = remove.getListener()) == null) {
            return false;
        }
        listener.onExpiring(remove);
        remove.mo214a(true);
        return true;
    }

    /* renamed from: b */
    private void m628b(Exception exc) {
        new C0269v.C0270a().mo707a(exc.getClass().toString()).mo707a(" during metadata injection w/ metadata = ").mo707a(C0267t.m819h(this.f1138I, "metadata")).mo709a(C0269v.f1300j);
        JSONObject b = C0267t.m805b();
        C0267t.m798a(b, "id", this.f1148e);
        new C0284y("AdSession.on_error", this.f1140K.mo317k(), b).mo740d();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m629b(boolean z) {
        setBackgroundColor(z ? 0 : -1);
    }

    /* renamed from: g */
    private void m637g() {
        Context b = C0026a.m78b();
        if (b != null && this.f1140K != null && !this.f1135F) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(-1);
            gradientDrawable.setShape(1);
            ImageView imageView = new ImageView(b);
            this.f1142M = imageView;
            imageView.setImageURI(Uri.fromFile(new File(this.f1151h)));
            this.f1142M.setBackground(gradientDrawable);
            this.f1142M.setOnClickListener(new C0221g());
            mo613C();
            addView(this.f1142M);
        }
    }

    /* renamed from: j */
    private AdColonyAdView m640j() {
        if (this.f1148e == null) {
            return null;
        }
        return C0026a.m80c().mo432b().mo342b().get(this.f1148e);
    }

    /* renamed from: t */
    private AdColonyInterstitial m649t() {
        if (this.f1148e == null) {
            return null;
        }
        return C0026a.m80c().mo432b().mo334a().get(this.f1148e);
    }

    /* renamed from: w */
    private boolean m650w() {
        return m640j() != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public void mo612B() {
        String str;
        if (this.f1130A) {
            try {
                if (this.f1153j.equals("")) {
                    FileInputStream fileInputStream = new FileInputStream(this.f1145b);
                    StringBuilder sb = new StringBuilder(fileInputStream.available());
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = fileInputStream.read(bArr, 0, 1024);
                        if (read < 0) {
                            break;
                        }
                        sb.append(new String(bArr, 0, read));
                    }
                    if (this.f1145b.contains(".html")) {
                        str = sb.toString();
                    } else {
                        str = "<html><script>" + sb.toString() + "</script></html>";
                    }
                } else {
                    str = this.f1153j.replaceFirst("script\\s*src\\s*=\\s*\"mraid.js\"", "script src=\"file://" + this.f1150g + "\"");
                }
                String h = C0267t.m819h(C0267t.m818g(this.f1141L.mo736b(), "info"), "metadata");
                loadDataWithBaseURL(this.f1144a.equals("") ? this.f1147d : this.f1144a, m617a(str, C0267t.m819h(C0267t.m806b(h), "iab_filepath")).replaceFirst("var\\s*ADC_DEVICE_INFO\\s*=\\s*null\\s*;", Matcher.quoteReplacement("var ADC_DEVICE_INFO = " + h + ";")), "text/html", (String) null, (String) null);
            } catch (IOException e) {
                m625a((Exception) e);
            } catch (IllegalArgumentException e2) {
                m625a((Exception) e2);
            } catch (IndexOutOfBoundsException e3) {
                m625a((Exception) e3);
            }
        } else if (!this.f1144a.startsWith("http") && !this.f1144a.startsWith("file")) {
            loadDataWithBaseURL(this.f1147d, this.f1144a, "text/html", (String) null, (String) null);
        } else if (this.f1144a.contains(".html") || !this.f1144a.startsWith("file")) {
            loadUrl(this.f1144a);
        } else {
            loadDataWithBaseURL(this.f1144a, "<html><script src=\"" + this.f1144a + "\"></script></html>", "text/html", (String) null, (String) null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public void mo613C() {
        if (this.f1142M != null) {
            int r = C0026a.m80c().mo445h().mo537r();
            int q = C0026a.m80c().mo445h().mo536q();
            boolean z = this.f1136G;
            if (z) {
                r = this.f1156m + this.f1160q;
            }
            if (z) {
                q = this.f1158o + this.f1162s;
            }
            float n = C0026a.m80c().mo445h().mo533n();
            int i = (int) (((float) this.f1166w) * n);
            int i2 = (int) (((float) this.f1167x) * n);
            this.f1142M.setLayoutParams(new AbsoluteLayout.LayoutParams(i, i2, r - i, q - i2));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public void mo614D() {
        C0190l0.m510a((Runnable) new C0222h());
    }

    /* renamed from: a */
    public void mo283a() {
        if (C0026a.m81d() && this.f1131B && !this.f1133D) {
            mo614D();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo615a(C0284y yVar) {
        JSONObject b = yVar.mo736b();
        this.f1156m = C0267t.m817f(b, "x");
        this.f1158o = C0267t.m817f(b, "y");
        this.f1160q = C0267t.m817f(b, "width");
        this.f1162s = C0267t.m817f(b, "height");
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        layoutParams.setMargins(this.f1156m, this.f1158o, 0, 0);
        layoutParams.width = this.f1160q;
        layoutParams.height = this.f1162s;
        setLayoutParams(layoutParams);
        if (this.f1169z) {
            JSONObject b2 = C0267t.m805b();
            C0267t.m809b(b2, "success", true);
            C0267t.m808b(b2, "id", this.f1164u);
            yVar.mo735a(b2).mo740d();
        }
        mo613C();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo616a(C0284y yVar, int i, int i2, C0032c cVar) {
        JSONObject b = yVar.mo736b();
        String h = C0267t.m819h(b, "url");
        this.f1144a = h;
        if (h.equals("")) {
            this.f1144a = C0267t.m819h(b, "data");
        }
        this.f1147d = C0267t.m819h(b, "base_url");
        this.f1146c = C0267t.m819h(b, "custom_js");
        this.f1148e = C0267t.m819h(b, "ad_session_id");
        this.f1138I = C0267t.m818g(b, "info");
        this.f1150g = C0267t.m819h(b, "mraid_filepath");
        this.f1165v = C0267t.m814d(b, "use_mraid_module") ? C0026a.m80c().mo451n().mo750d() : this.f1165v;
        this.f1151h = C0267t.m819h(b, "ad_choices_filepath");
        this.f1152i = C0267t.m819h(b, "ad_choices_url");
        this.f1135F = C0267t.m814d(b, "disable_ad_choices");
        this.f1136G = C0267t.m814d(b, "ad_choices_snap_to_webview");
        this.f1166w = C0267t.m817f(b, "ad_choices_width");
        this.f1167x = C0267t.m817f(b, "ad_choices_height");
        if (this.f1139J.length() == 0) {
            this.f1139J = C0267t.m818g(b, "iab");
        }
        boolean z = false;
        if (!this.f1130A && !this.f1150g.equals("")) {
            if (this.f1165v > 0) {
                this.f1144a = m617a(this.f1144a.replaceFirst("script\\s*src\\s*=\\s*\"mraid.js\"", "script src=\"file://" + this.f1150g + "\""), C0267t.m819h(C0267t.m818g(this.f1138I, "device_info"), "iab_filepath"));
            } else {
                try {
                    this.f1149f = C0026a.m80c().mo448k().mo683a(this.f1150g, false).toString();
                    this.f1149f = this.f1149f.replaceFirst("bridge.os_name\\s*=\\s*\"\"\\s*;", "bridge.os_name = \"\";\nvar ADC_DEVICE_INFO = " + this.f1138I.toString() + ";\n");
                } catch (IOException e) {
                    m628b((Exception) e);
                } catch (IllegalArgumentException e2) {
                    m628b((Exception) e2);
                } catch (IndexOutOfBoundsException e3) {
                    m628b((Exception) e3);
                }
            }
        }
        this.f1155l = i;
        this.f1140K = cVar;
        if (i2 >= 0) {
            this.f1164u = i2;
        } else {
            mo625f();
        }
        this.f1160q = C0267t.m817f(b, "width");
        this.f1162s = C0267t.m817f(b, "height");
        this.f1156m = C0267t.m817f(b, "x");
        int f = C0267t.m817f(b, "y");
        this.f1158o = f;
        this.f1161r = this.f1160q;
        this.f1163t = this.f1162s;
        this.f1159p = f;
        this.f1157n = this.f1156m;
        if (C0267t.m814d(b, "enable_messages") || this.f1169z) {
            z = true;
        }
        this.f1168y = z;
        mo626h();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo617a(C0284y yVar, int i, C0032c cVar) {
        mo616a(yVar, i, -1, cVar);
        mo639v();
    }

    /* renamed from: a */
    public void mo284a(JSONObject jSONObject) {
        synchronized (this.f1143N) {
            this.f1137H.put(jSONObject);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo618a(boolean z) {
        this.f1132C = z;
    }

    /* access modifiers changed from: package-private */
    @SuppressLint({"AddJavascriptInterface"})
    /* renamed from: a */
    public void mo619a(boolean z, C0284y yVar) {
        String str;
        this.f1169z = z;
        C0284y yVar2 = this.f1141L;
        if (yVar2 != null) {
            yVar = yVar2;
        }
        this.f1141L = yVar;
        JSONObject b = yVar.mo736b();
        this.f1130A = C0267t.m814d(b, "is_display_module");
        setFocusable(true);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        int i = Build.VERSION.SDK_INT;
        if (i >= 19) {
            WebView.setWebContentsDebuggingEnabled(false);
        }
        if (z) {
            this.f1168y = true;
            String h = C0267t.m819h(b, "filepath");
            this.f1153j = C0267t.m819h(b, "interstitial_html");
            this.f1150g = C0267t.m819h(b, "mraid_filepath");
            this.f1147d = C0267t.m819h(b, "base_url");
            this.f1139J = C0267t.m818g(b, "iab");
            this.f1138I = C0267t.m818g(b, "info");
            this.f1148e = C0267t.m819h(b, "ad_session_id");
            this.f1145b = h;
            if (f1129O && this.f1164u == 1) {
                this.f1145b = "android_asset/ADCController.js";
            }
            if (this.f1153j.equals("")) {
                str = "file:///" + this.f1145b;
            } else {
                str = "";
            }
            this.f1144a = str;
        }
        setWebChromeClient(new C0224j(this, (C0211a) null));
        WebSettings settings = getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setGeolocationEnabled(true);
        settings.setUseWideViewPort(true);
        if (i >= 17) {
            settings.setMediaPlaybackRequiresUserGesture(false);
        }
        if (i >= 16) {
            settings.setAllowFileAccessFromFileURLs(true);
            settings.setAllowUniversalAccessFromFileURLs(true);
            settings.setAllowFileAccess(true);
        }
        addJavascriptInterface(new C0223i(this, (C0211a) null), "NativeLayer");
        setWebViewClient(mo627i());
        mo612B();
        if (!z) {
            mo625f();
            mo639v();
        }
        if (z || this.f1168y) {
            C0026a.m80c().mo451n().mo742a((C0031b0) this);
        }
        if (!this.f1146c.equals("")) {
            mo621b(this.f1146c);
        }
    }

    /* renamed from: b */
    public void mo285b() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo620b(C0284y yVar) {
        if (C0267t.m814d(yVar.mo736b(), "visible")) {
            setVisibility(0);
        } else {
            setVisibility(4);
        }
        if (this.f1169z) {
            JSONObject b = C0267t.m805b();
            C0267t.m809b(b, "success", true);
            C0267t.m808b(b, "id", this.f1164u);
            yVar.mo735a(b).mo740d();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo621b(String str) {
        if (this.f1132C) {
            new C0269v.C0270a().mo707a("Ignoring call to execute_js as WebView has been destroyed.").mo709a(C0269v.f1294d);
        } else if (Build.VERSION.SDK_INT >= 19) {
            try {
                evaluateJavascript(str, (ValueCallback) null);
            } catch (IllegalStateException unused) {
                new C0269v.C0270a().mo707a("Device reporting incorrect OS version, evaluateJavascript ").mo707a("is not available. Disabling AdColony.").mo709a(C0269v.f1299i);
                AdColony.disable();
            }
        } else {
            loadUrl("javascript:" + str);
        }
    }

    /* renamed from: c */
    public int mo286c() {
        return this.f1165v;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public String mo622c(String str) {
        String c = (!m614A() || m649t() == null) ? str : m649t().mo219c();
        return ((c == null || c.equals(str)) && m650w() && m640j() != null) ? m640j().getClickOverride() : c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo623c(C0284y yVar) {
        JSONObject b = yVar.mo736b();
        return C0267t.m817f(b, "id") == this.f1155l && C0267t.m817f(b, "container_id") == this.f1140K.mo299c() && C0267t.m819h(b, "ad_session_id").equals(this.f1140K.mo289a());
    }

    /* renamed from: d */
    public int mo287d() {
        return this.f1164u;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo624e() {
        ImageView imageView = this.f1142M;
        if (imageView != null) {
            this.f1140K.mo292a((View) imageView, FriendlyObstructionPurpose.OTHER);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo625f() {
        this.f1140K.mo313i().add(C0026a.m72a("WebView.set_visible", (C0028a0) new C0213c(), true));
        this.f1140K.mo313i().add(C0026a.m72a("WebView.set_bounds", (C0028a0) new C0215d(), true));
        this.f1140K.mo313i().add(C0026a.m72a("WebView.execute_js", (C0028a0) new C0217e(), true));
        this.f1140K.mo313i().add(C0026a.m72a("WebView.set_transparent", (C0028a0) new C0219f(), true));
        this.f1140K.mo315j().add("WebView.set_visible");
        this.f1140K.mo315j().add("WebView.set_bounds");
        this.f1140K.mo315j().add("WebView.execute_js");
        this.f1140K.mo315j().add("WebView.set_transparent");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo626h() {
        C0026a.m80c().mo432b().mo337a(this, this.f1148e, this.f1140K);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C0225k mo627i() {
        int i = Build.VERSION.SDK_INT;
        return i >= 23 ? new C0211a() : i >= 21 ? new C0212b() : new C0225k(this, (C0211a) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public String mo628k() {
        return mo622c((String) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public int mo629l() {
        return this.f1162s;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public int mo630m() {
        return this.f1160q;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public int mo631n() {
        return this.f1156m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public int mo632o() {
        return this.f1158o;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        AdColonyAdView j;
        if (motionEvent.getAction() == 1 && (j = m640j()) != null && !j.getUserInteraction()) {
            JSONObject b = C0267t.m805b();
            C0267t.m798a(b, "ad_session_id", this.f1148e);
            new C0284y("WebView.on_first_click", 1, b).mo740d();
            j.setUserInteraction(true);
        }
        return super.onTouchEvent(motionEvent);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public int mo634p() {
        return this.f1163t;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public int mo635q() {
        return this.f1161r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public int mo636r() {
        return this.f1157n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public int mo637s() {
        return this.f1159p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo638u() {
        mo619a(false, (C0284y) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo639v() {
        setVisibility(4);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f1160q, this.f1162s);
        layoutParams.setMargins(this.f1156m, this.f1158o, 0, 0);
        layoutParams.gravity = 0;
        this.f1140K.addView(this, layoutParams);
        if (!this.f1151h.equals("") && !this.f1152i.equals("")) {
            m637g();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public boolean mo640x() {
        return this.f1132C;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public boolean mo641y() {
        return this.f1130A;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public boolean mo642z() {
        return this.f1134E;
    }
}
