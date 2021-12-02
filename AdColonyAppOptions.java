package com.adcolony.sdk;

import android.content.Context;
import android.util.Log;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

public class AdColonyAppOptions {
    public static final String ADMARVEL = "AdMarvel";
    public static final String ADMOB = "AdMob";
    public static final String ADOBEAIR = "Adobe AIR";
    public static final String AERSERVE = "AerServe";
    @Deprecated
    public static final int ALL = 2;
    public static final String APPODEAL = "Appodeal";
    public static final String CCPA = "CCPA";
    public static final String COCOS2DX = "Cocos2d-x";
    public static final String COPPA = "COPPA";
    public static final String CORONA = "Corona";
    public static final String FUSEPOWERED = "Fuse Powered";
    public static final String FYBER = "Fyber";
    public static final String GDPR = "GDPR";
    public static final String IRONSOURCE = "ironSource";
    @Deprecated
    public static final int LANDSCAPE = 1;
    public static final String MOPUB = "MoPub";
    @Deprecated
    public static final int PORTRAIT = 0;
    @Deprecated
    public static final int SENSOR = 2;
    public static final String UNITY = "Unity";

    /* renamed from: a */
    private String f61a = "";

    /* renamed from: b */
    private String[] f62b;

    /* renamed from: c */
    private JSONArray f63c = C0267t.m785a();

    /* renamed from: d */
    private JSONObject f64d = C0267t.m805b();

    /* renamed from: e */
    private AdColonyUserMetadata f65e;

    public AdColonyAppOptions() {
        setOriginStore("google");
        if (C0026a.m82e()) {
            C0122i c = C0026a.m80c();
            if (c.mo463z()) {
                mo161a(c.mo455r().f61a);
                mo162a(c.mo455r().f62b);
            }
        }
    }

    /* renamed from: a */
    private void m24a(@NonNull Context context) {
        setOption("bundle_id", C0190l0.m523c(context));
    }

    public static AdColonyAppOptions getMoPubAppOptions(@NonNull String str) {
        AdColonyAppOptions mediationNetwork = new AdColonyAppOptions().setMediationNetwork(MOPUB, "unknown");
        if (str != null && !str.isEmpty()) {
            String[] split = str.split(",");
            int length = split.length;
            int i = 0;
            while (i < length) {
                String[] split2 = split[i].split(":");
                if (split2.length == 2) {
                    String str2 = split2[0];
                    str2.hashCode();
                    if (str2.equals("store")) {
                        mediationNetwork.setOriginStore(split2[1]);
                    } else if (!str2.equals("version")) {
                        Log.e("AdColonyMoPub", "AdColony client options in wrong format - please check your MoPub dashboard");
                        return mediationNetwork;
                    } else {
                        mediationNetwork.setAppVersion(split2[1]);
                    }
                    i++;
                } else {
                    Log.e("AdColonyMoPub", "AdColony client options not recognized - please check your MoPub dashboard");
                    return null;
                }
            }
        }
        return mediationNetwork;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public AdColonyAppOptions mo161a(String str) {
        if (str == null) {
            return this;
        }
        this.f61a = str;
        C0267t.m798a(this.f64d, "app_id", str);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public AdColonyAppOptions mo162a(String... strArr) {
        if (strArr == null) {
            return this;
        }
        this.f62b = strArr;
        this.f63c = C0267t.m785a();
        for (String b : strArr) {
            C0267t.m807b(this.f63c, b);
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo163a() {
        return this.f61a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public JSONObject mo164b() {
        return this.f64d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo165b(@NonNull Context context) {
        m24a(context);
        if (C0267t.m795a(this.f64d, "use_forced_controller")) {
            C0210n0.f1129O = C0267t.m814d(this.f64d, "use_forced_controller");
        }
        if (C0267t.m795a(this.f64d, "use_staging_launch_server") && C0267t.m814d(this.f64d, "use_staging_launch_server")) {
            C0122i.f871U = "https://adc3-launch-staging.adcolony.com/v4/launch";
        }
        String b = C0190l0.m517b(context, "IABUSPrivacy_String");
        String b2 = C0190l0.m517b(context, "IABTCF_TCString");
        int a = C0190l0.m496a(context, "IABTCF_gdprApplies");
        if (b != null) {
            C0267t.m798a(this.f64d, "ccpa_consent_string", b);
        }
        if (b2 != null) {
            C0267t.m798a(this.f64d, "gdpr_consent_string", b2);
        }
        boolean z = true;
        if (a == 0 || a == 1) {
            JSONObject jSONObject = this.f64d;
            if (a != 1) {
                z = false;
            }
            C0267t.m809b(jSONObject, "gdpr_required", z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public String[] mo166c() {
        return this.f62b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public JSONArray mo167d() {
        return this.f63c;
    }

    public int getAppOrientation() {
        return C0267t.m784a(this.f64d, "app_orientation", -1);
    }

    public String getAppVersion() {
        return C0267t.m819h(this.f64d, "app_version");
    }

    @Deprecated
    public String getGDPRConsentString() {
        return C0267t.m819h(this.f64d, "consent_string");
    }

    @Deprecated
    public boolean getGDPRRequired() {
        return C0267t.m814d(this.f64d, "gdpr_required");
    }

    public boolean getKeepScreenOn() {
        return C0267t.m814d(this.f64d, "keep_screen_on");
    }

    public JSONObject getMediationInfo() {
        JSONObject b = C0267t.m805b();
        C0267t.m798a(b, "name", C0267t.m819h(this.f64d, "mediation_network"));
        C0267t.m798a(b, "version", C0267t.m819h(this.f64d, "mediation_network_version"));
        return b;
    }

    public boolean getMultiWindowEnabled() {
        return C0267t.m814d(this.f64d, "multi_window_enabled");
    }

    public Object getOption(@NonNull String str) {
        return C0267t.m804b(this.f64d, str);
    }

    public String getOriginStore() {
        return C0267t.m819h(this.f64d, "origin_store");
    }

    public JSONObject getPluginInfo() {
        JSONObject b = C0267t.m805b();
        C0267t.m798a(b, "name", C0267t.m819h(this.f64d, "plugin"));
        C0267t.m798a(b, "version", C0267t.m819h(this.f64d, "plugin_version"));
        return b;
    }

    public String getPrivacyConsentString(@NonNull String str) {
        JSONObject jSONObject = this.f64d;
        return C0267t.m819h(jSONObject, str.toLowerCase(Locale.ENGLISH) + "_consent_string");
    }

    public boolean getPrivacyFrameworkRequired(@NonNull String str) {
        JSONObject jSONObject = this.f64d;
        return C0267t.m814d(jSONObject, str.toLowerCase(Locale.ENGLISH) + "_required");
    }

    @Deprecated
    public int getRequestedAdOrientation() {
        return C0267t.m784a(this.f64d, "orientation", -1);
    }

    public boolean getTestModeEnabled() {
        return C0267t.m814d(this.f64d, "test_mode");
    }

    public String getUserID() {
        return C0267t.m819h(this.f64d, "user_id");
    }

    @Deprecated
    public AdColonyUserMetadata getUserMetadata() {
        return this.f65e;
    }

    public AdColonyAppOptions setAppOrientation(@IntRange(from = 0, to = 2) int i) {
        setOption("app_orientation", (double) i);
        return this;
    }

    public AdColonyAppOptions setAppVersion(@NonNull String str) {
        setOption("app_version", str);
        return this;
    }

    @Deprecated
    public AdColonyAppOptions setGDPRConsentString(@NonNull String str) {
        C0267t.m798a(this.f64d, "consent_string", str);
        return this;
    }

    @Deprecated
    public AdColonyAppOptions setGDPRRequired(boolean z) {
        setOption("gdpr_required", z);
        return this;
    }

    public AdColonyAppOptions setKeepScreenOn(boolean z) {
        C0267t.m809b(this.f64d, "keep_screen_on", z);
        return this;
    }

    public AdColonyAppOptions setMediationNetwork(@NonNull String str, @NonNull String str2) {
        C0267t.m798a(this.f64d, "mediation_network", str);
        C0267t.m798a(this.f64d, "mediation_network_version", str2);
        return this;
    }

    public AdColonyAppOptions setMultiWindowEnabled(boolean z) {
        C0267t.m809b(this.f64d, "multi_window_enabled", z);
        return this;
    }

    public AdColonyAppOptions setOption(@NonNull String str, double d) {
        C0267t.m796a(this.f64d, str, d);
        return this;
    }

    public AdColonyAppOptions setOption(@NonNull String str, @NonNull String str2) {
        C0267t.m798a(this.f64d, str, str2);
        return this;
    }

    public AdColonyAppOptions setOption(@NonNull String str, boolean z) {
        C0267t.m809b(this.f64d, str, z);
        return this;
    }

    public AdColonyAppOptions setOriginStore(@NonNull String str) {
        setOption("origin_store", str);
        return this;
    }

    public AdColonyAppOptions setPlugin(@NonNull String str, @NonNull String str2) {
        C0267t.m798a(this.f64d, "plugin", str);
        C0267t.m798a(this.f64d, "plugin_version", str2);
        return this;
    }

    public AdColonyAppOptions setPrivacyConsentString(@NonNull String str, @NonNull String str2) {
        JSONObject jSONObject = this.f64d;
        C0267t.m798a(jSONObject, str.toLowerCase(Locale.ENGLISH) + "_consent_string", str2);
        return this;
    }

    public AdColonyAppOptions setPrivacyFrameworkRequired(@NonNull String str, boolean z) {
        setOption(str.toLowerCase(Locale.ENGLISH) + "_required", z);
        return this;
    }

    @Deprecated
    public AdColonyAppOptions setRequestedAdOrientation(@IntRange(from = 0, to = 2) int i) {
        setOption("orientation", (double) i);
        return this;
    }

    public AdColonyAppOptions setTestModeEnabled(boolean z) {
        C0267t.m809b(this.f64d, "test_mode", z);
        return this;
    }

    public AdColonyAppOptions setUserID(@NonNull String str) {
        setOption("user_id", str);
        return this;
    }

    @Deprecated
    public AdColonyAppOptions setUserMetadata(@NonNull AdColonyUserMetadata adColonyUserMetadata) {
        this.f65e = adColonyUserMetadata;
        C0267t.m800a(this.f64d, "user_metadata", adColonyUserMetadata.f92b);
        return this;
    }
}
