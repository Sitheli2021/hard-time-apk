package com.adcolony.sdk;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.adcolony.sdk.C0269v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import org.json.JSONException;
import org.json.JSONObject;

public class AdColonyEventTracker {
    public static final String CUSTOM_EVENT_1 = "ADCT_CUSTOM_EVENT_1";
    public static final String CUSTOM_EVENT_2 = "ADCT_CUSTOM_EVENT_2";
    public static final String CUSTOM_EVENT_3 = "ADCT_CUSTOM_EVENT_3";
    public static final String CUSTOM_EVENT_4 = "ADCT_CUSTOM_EVENT_4";
    public static final String CUSTOM_EVENT_5 = "ADCT_CUSTOM_EVENT_5";
    public static final String LOGIN_DEFAULT = "ADCT_DEFAULT_LOGIN";
    public static final String LOGIN_FACEBOOK = "ADCT_FACEBOOK_LOGIN";
    public static final String LOGIN_GOOGLE = "ADCT_GOOGLE_LOGIN";
    public static final String LOGIN_LINKEDIN = "ADCT_LINKEDIN_LOGIN";
    public static final String LOGIN_OPENID = "ADCT_OPENID_LOGIN";
    public static final String LOGIN_TWITTER = "ADCT_TWITTER_LOGIN";
    public static final String REGISTRATION_CUSTOM = "ADCT_CUSTOM_REGISTRATION";
    public static final String REGISTRATION_DEFAULT = "ADCT_DEFAULT_REGISTRATION";
    public static final String REGISTRATION_FACEBOOK = "ADCT_FACEBOOK_REGISTRATION";
    public static final String REGISTRATION_GOOGLE = "ADCT_GOOGLE_REGISTRATION";
    public static final String REGISTRATION_LINKEDIN = "ADCT_LINKEDIN_REGISTRATION";
    public static final String REGISTRATION_OPENID = "ADCT_OPENID_REGISTRATION";
    public static final String REGISTRATION_TWITTER = "ADCT_TWITTER_REGISTRATION";
    public static final String SOCIAL_SHARING_CUSTOM = "ADCT_CUSTOM_SHARING";
    public static final String SOCIAL_SHARING_FACEBOOK = "ADCT_FACEBOOK_SHARING";
    public static final String SOCIAL_SHARING_FLICKR = "ADCT_FLICKR_SHARING";
    public static final String SOCIAL_SHARING_FOURSQUARE = "ADCT_FOURSQUARE_SHARING";
    public static final String SOCIAL_SHARING_GOOGLE = "ADCT_GOOGLE_SHARING";
    public static final String SOCIAL_SHARING_INSTAGRAM = "ADCT_INSTAGRAM_SHARING";
    public static final String SOCIAL_SHARING_LINKEDIN = "ADCT_LINKEDIN_SHARING";
    public static final String SOCIAL_SHARING_PINTEREST = "ADCT_PINTEREST_SHARING";
    public static final String SOCIAL_SHARING_SNAPCHAT = "ADCT_SNAPCHAT_SHARING";
    public static final String SOCIAL_SHARING_TUMBLR = "ADCT_TUMBLR_SHARING";
    public static final String SOCIAL_SHARING_TWITTER = "ADCT_TWITTER_SHARING";
    public static final String SOCIAL_SHARING_VIMEO = "ADCT_VIMEO_SHARING";
    public static final String SOCIAL_SHARING_VINE = "ADCT_VINE_SHARING";
    public static final String SOCIAL_SHARING_YOUTUBE = "ADCT_YOUTUBE_SHARING";

    /* renamed from: a */
    private static final List<JSONObject> f69a = Collections.synchronizedList(new ArrayList());

    /* renamed from: b */
    private static final int f70b = 200;

    /* renamed from: a */
    static void m34a(JSONObject jSONObject) {
        List<JSONObject> list = f69a;
        synchronized (list) {
            if (f70b > list.size()) {
                list.add(jSONObject);
            }
        }
    }

    /* renamed from: a */
    static boolean m35a() {
        boolean z;
        List<JSONObject> list = f69a;
        synchronized (list) {
            z = list.size() != 0;
        }
        return z;
    }

    /* renamed from: a */
    private static boolean m36a(String str, String str2) {
        if (str == null || str.length() <= 512) {
            return false;
        }
        new C0269v.C0270a().mo707a("Description of event ").mo707a(str2).mo707a(" must be less").mo707a(" than 512 characters").mo709a(C0269v.f1299i);
        return true;
    }

    /* renamed from: b */
    static void m37b() {
        C0122i c = C0026a.m80c();
        if (!c.mo456s().equals("") && c.mo420C()) {
            List<JSONObject> list = f69a;
            synchronized (list) {
                for (JSONObject b : list) {
                    m38b(b);
                }
                f69a.clear();
            }
        }
    }

    /* renamed from: b */
    private static void m38b(JSONObject jSONObject) {
        C0122i c = C0026a.m80c();
        if (c.mo456s().equals("") || !c.mo420C()) {
            m34a(jSONObject);
            return;
        }
        m39c(jSONObject);
        new C0284y("AdColony.log_event", 1, jSONObject).mo740d();
    }

    /* renamed from: c */
    private static void m39c(JSONObject jSONObject) {
        JSONObject g = C0267t.m818g(jSONObject, "payload");
        if (C0210n0.f1129O) {
            C0267t.m798a(g, "api_key", "bb2cf0647ba654d7228dd3f9405bbc6a");
        } else {
            C0267t.m798a(g, "api_key", C0026a.m80c().mo456s());
        }
        try {
            jSONObject.remove("payload");
            jSONObject.put("payload", g);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: d */
    private static void m40d(JSONObject jSONObject) {
        C0267t.m798a(jSONObject, "timezone", TimeZone.getDefault().getID());
        C0267t.m798a(jSONObject, "action_time", String.valueOf(Math.round((float) (System.currentTimeMillis() / 1000))));
    }

    public static void logAchievementUnlocked(@Nullable String str) {
        if (!m36a(str, "logAchievementUnlocked")) {
            HashMap hashMap = new HashMap();
            hashMap.put("description", str);
            logEvent("achievement_unlocked", hashMap);
        }
    }

    public static void logActivated() {
        logEvent("activated");
    }

    public static void logAdImpression() {
        logEvent("ad_impression");
    }

    public static void logAddToCart(@Nullable String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("item_id", str);
        logEvent("add_to_cart", hashMap);
    }

    public static void logAddToWishlist(@Nullable String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("item_id", str);
        logEvent("add_to_wishlist", hashMap);
    }

    public static void logAppOpen() {
        logEvent("app_open");
    }

    public static void logAppRated() {
        logEvent("app_rated");
    }

    public static void logCheckoutInitiated() {
        logEvent("checkout_initiated");
    }

    public static void logContentView(@Nullable String str, @Nullable String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("content_id", str);
        hashMap.put("content_type", str2);
        logEvent("content_view", hashMap);
    }

    public static void logCreditsSpent(@Nullable String str, @Nullable Integer num, @Nullable Double d, @Nullable String str2) {
        if (str2 == null || str2.length() == 3) {
            HashMap hashMap = new HashMap();
            hashMap.put("name", str);
            hashMap.put("quantity", String.valueOf(num));
            hashMap.put("value", String.valueOf(d));
            hashMap.put("currency_code", str2);
            logEvent("credits_spent", hashMap);
            return;
        }
        new C0269v.C0270a().mo707a("Event logCreditsSpentWithName currency code is specified, but a three-letter ISO 4217 code, (e.g.: 'USD'). Event will not be sent.").mo709a(C0269v.f1299i);
    }

    public static void logCustomEvent(@Nullable String str, @Nullable String str2) {
        if (!m36a(str2, "logCustomEvent")) {
            HashMap hashMap = new HashMap();
            hashMap.put("event", str);
            hashMap.put("description", str2);
            logEvent("custom_event", hashMap);
        }
    }

    public static void logEvent(@Nullable String str) {
        logEvent(str, (HashMap<String, String>) null);
    }

    public static void logEvent(@NonNull String str, @Nullable HashMap<String, String> hashMap) {
        JSONObject b = C0267t.m805b();
        C0267t.m798a(b, "event_name", str);
        JSONObject b2 = C0267t.m805b();
        if (hashMap != null) {
            for (Map.Entry next : hashMap.entrySet()) {
                if (next.getValue() != null && !((String) next.getValue()).equals("null")) {
                    C0267t.m798a(b2, (String) next.getKey(), (String) next.getValue());
                }
            }
        }
        m40d(b2);
        C0267t.m800a(b, "payload", b2);
        m38b(b);
    }

    public static void logInvite() {
        logEvent("invite");
    }

    public static void logLevelAchieved(@Nullable Integer num) {
        HashMap hashMap = new HashMap();
        hashMap.put("level_achieved", String.valueOf(num));
        logEvent("level_achieved", hashMap);
    }

    public static void logLogin(@Nullable String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("method", str);
        logEvent("login", hashMap);
    }

    public static void logPaymentInfoAdded() {
        logEvent("payment_info_added");
    }

    public static void logRegistrationCompleted(@Nullable String str, @Nullable String str2) {
        if (!m36a(str2, "logRegistrationCompleted")) {
            HashMap hashMap = new HashMap();
            hashMap.put("method", str);
            hashMap.put("description", str2);
            logEvent("registration_completed", hashMap);
        }
    }

    public static void logReservation() {
        logEvent("reservation");
    }

    public static void logSearch(@Nullable String str) {
        if (str == null || str.length() <= 512) {
            HashMap hashMap = new HashMap();
            hashMap.put("search_string", str);
            logEvent("search", hashMap);
            return;
        }
        new C0269v.C0270a().mo707a("logSearch searchString cannot exceed 512 characters. Event will ").mo707a("not be sent.").mo709a(C0269v.f1299i);
    }

    public static void logSocialSharingEvent(@Nullable String str, @Nullable String str2) {
        if (!m36a(str2, "logSocialSharingEvent")) {
            HashMap hashMap = new HashMap();
            hashMap.put("network", str);
            hashMap.put("description", str2);
            logEvent("social_sharing_event", hashMap);
        }
    }

    public static void logTransaction(@Nullable String str, @Nullable Integer num, @Nullable Double d, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        if (!m36a(str5, "logTransaction")) {
            if (str2 == null || str2.length() == 3) {
                HashMap hashMap = new HashMap();
                hashMap.put("item_id", str);
                hashMap.put("quantity", String.valueOf(num));
                hashMap.put("price", String.valueOf(d));
                hashMap.put("currency_code", str2);
                hashMap.put("receipt", str3);
                hashMap.put("store", str4);
                hashMap.put("description", str5);
                logEvent("transaction", hashMap);
                return;
            }
            new C0269v.C0270a().mo707a("Event logCreditsSpentWithName currency code is specified, but a three-letter ISO 4217 code, (e.g.: 'USD'). Event will not be sent.").mo709a(C0269v.f1299i);
        }
    }

    public static void logTutorialCompleted() {
        logEvent("tutorial_completed");
    }
}
