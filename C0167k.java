package com.adcolony.sdk;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.AsyncTask;
import android.os.Build;
import android.provider.Settings;
import android.security.NetworkSecurityPolicy;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import com.adcolony.sdk.C0269v;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONObject;

@SuppressLint({"ObsoleteSdkInt"})
/* renamed from: com.adcolony.sdk.k */
class C0167k {

    /* renamed from: i */
    private static int f972i = 2;

    /* renamed from: j */
    static final String f973j = "Production";

    /* renamed from: a */
    private String f974a = "";
    /* access modifiers changed from: private */

    /* renamed from: b */
    public String f975b;

    /* renamed from: c */
    private final C0080e f976c = new C0080e();

    /* renamed from: d */
    private boolean f977d;

    /* renamed from: e */
    private JSONObject f978e = C0267t.m805b();

    /* renamed from: f */
    private String f979f = "android";

    /* renamed from: g */
    private String f980g = "android_native";

    /* renamed from: h */
    private String f981h = "";

    /* renamed from: com.adcolony.sdk.k$a */
    class C0168a implements C0028a0 {

        /* renamed from: com.adcolony.sdk.k$a$a */
        class C0169a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C0284y f983a;

            C0169a(C0284y yVar) {
                this.f983a = yVar;
            }

            public void run() {
                try {
                    if (C0167k.this.mo525f() < 14) {
                        new C0172c(this.f983a, false).execute(new Void[0]);
                    } else {
                        new C0172c(this.f983a, false).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
                    }
                } catch (RuntimeException unused) {
                    new C0269v.C0270a().mo707a("Error retrieving device info, disabling AdColony.").mo709a(C0269v.f1300j);
                    AdColony.disable();
                } catch (StackOverflowError unused2) {
                    new C0269v.C0270a().mo707a("StackOverflowError on info AsyncTask execution, disabling AdColony").mo709a(C0269v.f1300j);
                    AdColony.disable();
                }
            }
        }

        C0168a() {
        }

        /* renamed from: a */
        public void mo278a(C0284y yVar) {
            C0190l0.m510a((Runnable) new C0169a(yVar));
        }
    }

    /* renamed from: com.adcolony.sdk.k$b */
    class C0170b implements Runnable {

        /* renamed from: com.adcolony.sdk.k$b$a */
        class C0171a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ WebSettings f986a;

            C0171a(WebSettings webSettings) {
                this.f986a = webSettings;
            }

            public void run() {
                String unused = C0167k.this.f975b = this.f986a.getUserAgentString();
                C0026a.m80c().mo447j().mo610a(C0167k.this.f975b);
            }
        }

        C0170b() {
        }

        public void run() {
            Context b;
            if (C0167k.this.f975b == null && (b = C0026a.m78b()) != null) {
                try {
                    C0190l0.f1041b.execute(new C0171a(new WebView(b).getSettings()));
                } catch (RuntimeException e) {
                    C0269v.C0270a aVar = new C0269v.C0270a();
                    aVar.mo707a(e.toString() + ": during WebView initialization.").mo707a(" Disabling AdColony.").mo709a(C0269v.f1299i);
                    String unused = C0167k.this.f975b = "";
                    AdColony.disable();
                }
            }
        }
    }

    /* renamed from: com.adcolony.sdk.k$c */
    private static class C0172c extends AsyncTask<Void, Void, JSONObject> {

        /* renamed from: a */
        private C0284y f988a;

        /* renamed from: b */
        private boolean f989b;

        C0172c(C0284y yVar, boolean z) {
            this.f988a = yVar;
            this.f989b = z;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public JSONObject doInBackground(Void... voidArr) {
            if (Build.VERSION.SDK_INT < 14) {
                return null;
            }
            return C0026a.m80c().mo445h().mo515a(true);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(JSONObject jSONObject) {
            if (this.f989b) {
                new C0284y("Device.update_info", 1, jSONObject).mo740d();
            } else {
                this.f988a.mo735a(jSONObject).mo740d();
            }
        }
    }

    C0167k() {
    }

    /* access modifiers changed from: package-private */
    @SuppressLint({"SwitchIntDef"})
    /* renamed from: A */
    public int mo503A() {
        Context b = C0026a.m78b();
        if (b == null) {
            return 2;
        }
        int i = b.getResources().getConfiguration().orientation;
        if (i != 1) {
            return i != 2 ? 2 : 1;
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public String mo504B() {
        return Build.VERSION.RELEASE;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public String mo505C() {
        return "4.4.1";
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        r0 = (android.telephony.TelephonyManager) r0.getSystemService("phone");
     */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo506D() {
        /*
            r2 = this;
            android.content.Context r0 = com.adcolony.sdk.C0026a.m78b()
            if (r0 != 0) goto L_0x0009
            java.lang.String r0 = ""
            return r0
        L_0x0009:
            java.lang.String r1 = "phone"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0
            if (r0 != 0) goto L_0x0016
            java.lang.String r0 = ""
            goto L_0x001a
        L_0x0016:
            java.lang.String r0 = r0.getSimCountryIso()
        L_0x001a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.C0167k.mo506D():java.lang.String");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public int mo507E() {
        return TimeZone.getDefault().getOffset(15) / 60000;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public String mo508F() {
        return TimeZone.getDefault().getID();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public String mo509G() {
        return this.f975b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public void mo510H() {
        this.f976c.mo376a(false);
        C0026a.m76a("Device.get_info", (C0028a0) new C0168a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public boolean mo511I() {
        Context b = C0026a.m78b();
        if (b == null) {
            return false;
        }
        DisplayMetrics displayMetrics = b.getResources().getDisplayMetrics();
        float f = ((float) displayMetrics.widthPixels) / displayMetrics.xdpi;
        float f2 = ((float) displayMetrics.heightPixels) / displayMetrics.ydpi;
        return Math.sqrt((double) ((f * f) + (f2 * f2))) >= 6.0d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public void mo512J() {
        C0190l0.m510a((Runnable) new C0170b());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo513a() {
        return System.getProperty("os.arch").toLowerCase(Locale.ENGLISH);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo514a(@NonNull Context context) {
        return C0190l0.m523c(context);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public JSONObject mo515a(boolean z) {
        JSONObject b = C0267t.m805b();
        C0122i c = C0026a.m80c();
        C0267t.m798a(b, "carrier_name", mo527h());
        C0267t.m798a(b, "data_path", C0026a.m80c().mo459v().mo412b());
        C0267t.m808b(b, "device_api", mo525f());
        C0267t.m808b(b, "display_width", mo537r());
        C0267t.m808b(b, "display_height", mo536q());
        C0267t.m808b(b, "screen_width", mo537r());
        C0267t.m808b(b, "screen_height", mo536q());
        C0267t.m808b(b, "display_dpi", mo535p());
        C0267t.m798a(b, "device_type", mo534o());
        C0267t.m798a(b, "locale_language_code", mo538s());
        C0267t.m798a(b, "ln", mo538s());
        C0267t.m798a(b, "locale_country_code", mo530k());
        C0267t.m798a(b, "locale", mo530k());
        C0267t.m798a(b, "mac_address", mo541v());
        C0267t.m798a(b, "manufacturer", mo542w());
        C0267t.m798a(b, "device_brand", mo542w());
        C0267t.m798a(b, "media_path", C0026a.m80c().mo459v().mo413c());
        C0267t.m798a(b, "temp_storage_path", C0026a.m80c().mo459v().mo414d());
        C0267t.m808b(b, "memory_class", mo543x());
        C0267t.m808b(b, "network_speed", 20);
        C0267t.m797a(b, "memory_used_mb", mo544y());
        C0267t.m798a(b, "model", mo545z());
        C0267t.m798a(b, "device_model", mo545z());
        C0267t.m798a(b, "sdk_type", this.f980g);
        C0267t.m798a(b, "sdk_version", mo505C());
        C0267t.m798a(b, "network_type", c.mo452o().mo331a());
        C0267t.m798a(b, "os_version", mo504B());
        C0267t.m798a(b, "os_name", this.f979f);
        C0267t.m798a(b, "platform", this.f979f);
        C0267t.m798a(b, "arch", mo513a());
        C0267t.m798a(b, "user_id", C0267t.m819h(c.mo455r().mo164b(), "user_id"));
        C0267t.m798a(b, "app_id", c.mo455r().mo163a());
        C0267t.m798a(b, "app_bundle_name", C0190l0.m516b());
        C0267t.m798a(b, "app_bundle_version", C0190l0.m522c());
        C0267t.m796a(b, "battery_level", mo526g());
        C0267t.m798a(b, "cell_service_country_code", mo506D());
        C0267t.m798a(b, "timezone_ietf", mo508F());
        C0267t.m808b(b, "timezone_gmt_m", mo507E());
        C0267t.m808b(b, "timezone_dst_m", mo531l());
        C0267t.m800a(b, "launch_metadata", mo539t());
        C0267t.m798a(b, "controller_version", c.mo436c());
        int A = mo503A();
        f972i = A;
        C0267t.m808b(b, "current_orientation", A);
        C0267t.m809b(b, "cleartext_permitted", mo528i());
        C0267t.m796a(b, "density", (double) mo533n());
        C0267t.m809b(b, "dark_mode", mo532m());
        JSONArray a = C0267t.m785a();
        if (C0190l0.m524c("com.android.vending")) {
            a.put("google");
        }
        if (C0190l0.m524c("com.amazon.venezia")) {
            a.put("amazon");
        }
        C0267t.m799a(b, "available_stores", a);
        C0267t.m799a(b, "permissions", C0190l0.m527d(C0026a.m78b()));
        if (!this.f976c.mo377a() && z) {
            this.f976c.mo375a(2000);
        }
        C0267t.m798a(b, "advertiser_id", mo518b());
        C0267t.m809b(b, "limit_tracking", mo540u());
        if (mo518b() == null || mo518b().equals("")) {
            C0267t.m798a(b, "android_id_sha1", C0190l0.m519b(mo524e()));
        }
        return b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo516a(String str) {
        this.f974a = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo517a(JSONObject jSONObject) {
        this.f978e = jSONObject;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public String mo518b() {
        return this.f974a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo519b(String str) {
        this.f981h = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo520b(boolean z) {
        this.f976c.mo376a(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public String mo521c() {
        Context b = C0026a.m78b();
        return b == null ? "" : Settings.Secure.getString(b.getContentResolver(), "advertising_id");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo522c(boolean z) {
        this.f977d = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo523d() {
        Context b = C0026a.m78b();
        if (b == null) {
            return false;
        }
        try {
            return Settings.Secure.getInt(b.getContentResolver(), "limit_ad_tracking") != 0;
        } catch (Settings.SettingNotFoundException unused) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    @SuppressLint({"HardwareIds"})
    /* renamed from: e */
    public String mo524e() {
        Context b = C0026a.m78b();
        return b == null ? "" : Settings.Secure.getString(b.getContentResolver(), "android_id");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo525f() {
        return Build.VERSION.SDK_INT;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public double mo526g() {
        Context b = C0026a.m78b();
        if (b == null) {
            return 0.0d;
        }
        try {
            Intent registerReceiver = b.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver == null) {
                return 0.0d;
            }
            int intExtra = registerReceiver.getIntExtra("level", -1);
            int intExtra2 = registerReceiver.getIntExtra("scale", -1);
            if (intExtra < 0 || intExtra2 < 0) {
                return 0.0d;
            }
            double d = (double) intExtra;
            double d2 = (double) intExtra2;
            Double.isNaN(d);
            Double.isNaN(d2);
            return d / d2;
        } catch (IllegalArgumentException unused) {
            return 0.0d;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public String mo527h() {
        Context b = C0026a.m78b();
        if (b == null) {
            return "";
        }
        TelephonyManager telephonyManager = (TelephonyManager) b.getSystemService("phone");
        String networkOperatorName = telephonyManager == null ? "" : telephonyManager.getNetworkOperatorName();
        return networkOperatorName.length() == 0 ? "unknown" : networkOperatorName;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo528i() {
        return Build.VERSION.SDK_INT < 23 || NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public String mo529j() {
        return this.f981h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public String mo530k() {
        return Locale.getDefault().getCountry();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public int mo531l() {
        TimeZone timeZone = TimeZone.getDefault();
        if (!timeZone.inDaylightTime(new Date())) {
            return 0;
        }
        return timeZone.getDSTSavings() / 60000;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
        r0 = r0.getResources().getConfiguration().uiMode & 48;
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo532m() {
        /*
            r4 = this;
            android.content.Context r0 = com.adcolony.sdk.C0026a.m78b()
            r1 = 0
            if (r0 == 0) goto L_0x0024
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 29
            if (r2 >= r3) goto L_0x000e
            goto L_0x0024
        L_0x000e:
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.uiMode
            r0 = r0 & 48
            r2 = 16
            if (r0 == r2) goto L_0x0024
            r2 = 32
            if (r0 == r2) goto L_0x0023
            goto L_0x0024
        L_0x0023:
            r1 = 1
        L_0x0024:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.C0167k.mo532m():boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public float mo533n() {
        Context b = C0026a.m78b();
        if (b == null) {
            return 0.0f;
        }
        return b.getResources().getDisplayMetrics().density;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public String mo534o() {
        return mo511I() ? "tablet" : "phone";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public int mo535p() {
        Context b = C0026a.m78b();
        if (b == null) {
            return 0;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        WindowManager windowManager = (WindowManager) b.getSystemService("window");
        if (windowManager != null) {
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        }
        return displayMetrics.densityDpi;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public int mo536q() {
        Context b = C0026a.m78b();
        if (b == null) {
            return 0;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        WindowManager windowManager = (WindowManager) b.getSystemService("window");
        if (windowManager != null) {
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        }
        return displayMetrics.heightPixels;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public int mo537r() {
        Context b = C0026a.m78b();
        if (b == null) {
            return 0;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        WindowManager windowManager = (WindowManager) b.getSystemService("window");
        if (windowManager != null) {
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        }
        return displayMetrics.widthPixels;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public String mo538s() {
        return Locale.getDefault().getLanguage();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public JSONObject mo539t() {
        return this.f978e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public boolean mo540u() {
        return this.f977d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public String mo541v() {
        return "";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public String mo542w() {
        return Build.MANUFACTURER;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public int mo543x() {
        ActivityManager activityManager;
        Context b = C0026a.m78b();
        if (b == null || (activityManager = (ActivityManager) b.getSystemService("activity")) == null) {
            return 0;
        }
        return activityManager.getMemoryClass();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public long mo544y() {
        Runtime runtime = Runtime.getRuntime();
        return (runtime.totalMemory() - runtime.freeMemory()) / ((long) 1048576);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public String mo545z() {
        return Build.MODEL;
    }
}
