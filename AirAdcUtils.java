package com.adcolony.airadc;

import android.location.Location;
import android.util.Log;
import com.adcolony.sdk.AdColonyAdOptions;
import com.adcolony.sdk.AdColonyAppOptions;
import com.adcolony.sdk.AdColonyInterstitial;
import com.adcolony.sdk.AdColonyReward;
import com.adcolony.sdk.AdColonyUserMetadata;
import com.adcolony.sdk.AdColonyZone;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class AirAdcUtils {
    static final String TAG = "AdColony";

    AirAdcUtils() {
    }

    private static void dispatchEvent(AirAdcContext airAdcContext, String str, JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("eventName", str);
        if (jSONObject != null) {
            jSONObject2.put("extras", jSONObject);
        }
        String jSONObject3 = jSONObject2.toString();
        airAdcContext.getClass();
        Log.i("AdColonyANE", "Dispatch event string=" + jSONObject3);
        airAdcContext.dispatchStatusEventAsync(jSONObject3, TAG);
    }

    static void dispatchInterstitialEvent(AirAdcContext airAdcContext, AdColonyInterstitial adColonyInterstitial, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("interstitial", toJson(adColonyInterstitial));
            dispatchEvent(airAdcContext, str, jSONObject);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void dispatchInterstitialEvent(AirAdcContext airAdcContext, AdColonyInterstitial adColonyInterstitial, String str, int i, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("interstitial", toJson(adColonyInterstitial));
            jSONObject.put("iapProductId", str);
            jSONObject.put("engagementType", i);
            dispatchEvent(airAdcContext, str2, jSONObject);
        } catch (Exception e) {
            airAdcContext.getClass();
            Log.i("AdColonyANE", e.getMessage());
            e.printStackTrace();
        }
    }

    static void dispatchInterstitialEvent(AirAdcContext airAdcContext, AdColonyZone adColonyZone, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("zone", toJson(adColonyZone));
            dispatchEvent(airAdcContext, str, jSONObject);
        } catch (Exception e) {
            airAdcContext.getClass();
            Log.i("AdColonyANE", e.getMessage());
            e.printStackTrace();
        }
    }

    static void dispatchLogEvent(AirAdcContext airAdcContext, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("logMessage", str);
            dispatchEvent(airAdcContext, "adColonyLogEvent", jSONObject);
        } catch (Exception e) {
            airAdcContext.getClass();
            Log.i("AdColonyANE", e.getMessage());
            e.printStackTrace();
        }
    }

    static void dispatchRewardedAdEvent(AirAdcContext airAdcContext, AdColonyReward adColonyReward, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("reward", toJson(adColonyReward));
            dispatchEvent(airAdcContext, str, jSONObject);
        } catch (Exception e) {
            airAdcContext.getClass();
            Log.i("AdColonyANE", e.getMessage());
            e.printStackTrace();
        }
    }

    static AdColonyAdOptions parseJsonIntoAdOptions(String str) {
        AdColonyAdOptions adColonyAdOptions;
        AdColonyUserMetadata parseJsonIntoUserMetadata;
        if (str == null) {
            return null;
        }
        try {
            adColonyAdOptions = new AdColonyAdOptions();
            try {
                Log.i(TAG, "parseJsonIntoAdOptions=" + str);
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("systemOptions")) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("systemOptions");
                    if (jSONObject2.has("confirmationEnabled")) {
                        adColonyAdOptions.enableConfirmationDialog(jSONObject2.getBoolean("confirmationEnabled"));
                    }
                    if (jSONObject2.has("resultsEnabled")) {
                        adColonyAdOptions.enableResultsDialog(jSONObject2.getBoolean("resultsEnabled"));
                    }
                }
                if (jSONObject.has("metadata") && (parseJsonIntoUserMetadata = parseJsonIntoUserMetadata(new JSONObject(jSONObject.getString("metadata")))) != null) {
                    adColonyAdOptions.setUserMetadata(parseJsonIntoUserMetadata);
                }
                if (!jSONObject.has("userOptions")) {
                    return adColonyAdOptions;
                }
                JSONObject jSONObject3 = jSONObject.getJSONObject("userOptions");
                Iterator<String> keys = jSONObject3.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    Object obj = jSONObject3.get(next);
                    if (obj instanceof Boolean) {
                        adColonyAdOptions.setOption(next, ((Boolean) obj).booleanValue());
                    } else if (obj instanceof String) {
                        adColonyAdOptions.setOption(next, (String) obj);
                    } else {
                        adColonyAdOptions.setOption(next, obj instanceof Integer ? (double) ((Integer) obj).intValue() : obj instanceof Float ? (double) ((Float) obj).floatValue() : ((Double) obj).doubleValue());
                    }
                }
                return adColonyAdOptions;
            } catch (Exception e) {
                e = e;
                Log.i(TAG, e.getMessage());
                e.printStackTrace();
                return adColonyAdOptions;
            }
        } catch (Exception e2) {
            e = e2;
            adColonyAdOptions = null;
            Log.i(TAG, e.getMessage());
            e.printStackTrace();
            return adColonyAdOptions;
        }
    }

    static AdColonyAppOptions parseJsonIntoAppOptions(String str) {
        AdColonyUserMetadata parseJsonIntoUserMetadata;
        JSONObject jSONObject;
        AdColonyAppOptions adColonyAppOptions = new AdColonyAppOptions();
        if (str != null) {
            try {
                Log.i(TAG, "parseJsonIntoAppOptions=" + str);
                JSONObject jSONObject2 = new JSONObject(str);
                if (jSONObject2.has("systemOptions") && (jSONObject = jSONObject2.getJSONObject("systemOptions")) != null) {
                    if (jSONObject.has("appVersion")) {
                        adColonyAppOptions.setAppVersion(jSONObject.getString("appVersion"));
                    }
                    if (jSONObject.has("userId")) {
                        adColonyAppOptions.setUserID(jSONObject.getString("userId"));
                    }
                    if (jSONObject.has("orientation")) {
                        adColonyAppOptions.setRequestedAdOrientation(jSONObject.getInt("orientation"));
                    }
                    if (jSONObject.has("testMode")) {
                        adColonyAppOptions.setTestModeEnabled(jSONObject.getBoolean("testMode"));
                    }
                    if (jSONObject.has("gdpr_required")) {
                        adColonyAppOptions.setGDPRRequired(jSONObject.getBoolean("gdpr_required"));
                    }
                    if (jSONObject.has("consent_string")) {
                        adColonyAppOptions.setGDPRConsentString(jSONObject.getString("consent_string"));
                    }
                }
                if (jSONObject2.has("userOptions")) {
                    JSONObject jSONObject3 = jSONObject2.getJSONObject("userOptions");
                    Iterator<String> keys = jSONObject3.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        Object obj = jSONObject3.get(next);
                        if (obj instanceof Boolean) {
                            adColonyAppOptions.setOption(next, ((Boolean) obj).booleanValue());
                        } else if (obj instanceof String) {
                            adColonyAppOptions.setOption(next, (String) obj);
                        } else {
                            adColonyAppOptions.setOption(next, obj instanceof Integer ? (double) ((Integer) obj).intValue() : obj instanceof Float ? (double) ((Float) obj).floatValue() : ((Double) obj).doubleValue());
                        }
                    }
                }
                if (jSONObject2.has("metadata") && (parseJsonIntoUserMetadata = parseJsonIntoUserMetadata(new JSONObject(jSONObject2.getString("metadata")))) != null) {
                    adColonyAppOptions.setUserMetadata(parseJsonIntoUserMetadata);
                }
            } catch (JSONException e) {
                Log.i(TAG, e.getMessage());
                e.printStackTrace();
            }
        }
        return adColonyAppOptions;
    }

    static AdColonyUserMetadata parseJsonIntoUserMetadata(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        int i;
        try {
            Log.i(TAG, "parseJsonIntoUserMetadata=" + jSONObject.toString());
            AdColonyUserMetadata adColonyUserMetadata = new AdColonyUserMetadata();
            if (jSONObject != null) {
                if (jSONObject.has("systemOptions") && (jSONObject3 = jSONObject.getJSONObject("systemOptions")) != null) {
                    Location location = new Location("");
                    if (jSONObject3.has("gender")) {
                        adColonyUserMetadata.setUserGender(jSONObject3.getString("gender"));
                    }
                    if (jSONObject3.has("age")) {
                        adColonyUserMetadata.setUserAge(jSONObject3.getInt("age"));
                    }
                    if (jSONObject3.has("maritalStatus")) {
                        adColonyUserMetadata.setUserMaritalStatus(jSONObject3.getString("maritalStatus"));
                    }
                    if (jSONObject3.has("householdIncome")) {
                        adColonyUserMetadata.setUserAnnualHouseholdIncome(jSONObject3.getInt("householdIncome"));
                    }
                    if (jSONObject3.has("education")) {
                        adColonyUserMetadata.setUserEducation(jSONObject3.getString("education"));
                    }
                    if (jSONObject3.has("zip")) {
                        adColonyUserMetadata.setUserZipCode(jSONObject3.getString("zip"));
                    }
                    if (jSONObject3.has("longitude")) {
                        location.setLongitude(jSONObject3.getDouble("longitude"));
                        i = 1;
                    } else {
                        i = 0;
                    }
                    if (jSONObject3.has("latitude")) {
                        location.setLatitude(jSONObject3.getDouble("latitude"));
                        i++;
                    }
                    if (i == 2) {
                        adColonyUserMetadata.setUserLocation(location);
                    }
                }
                if (jSONObject.has("userOptions") && (jSONObject2 = jSONObject.getJSONObject("userOptions")) != null) {
                    Iterator<String> keys = jSONObject2.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        Object obj = jSONObject2.get(next);
                        if (obj != null) {
                            if (obj instanceof String) {
                                adColonyUserMetadata.setMetadata(next, (String) obj);
                            } else if (obj instanceof Boolean) {
                                adColonyUserMetadata.setMetadata(next, ((Boolean) obj).booleanValue());
                            } else {
                                adColonyUserMetadata.setMetadata(next, obj instanceof Integer ? (double) ((Integer) obj).intValue() : obj instanceof Float ? (double) ((Float) obj).floatValue() : ((Double) obj).doubleValue());
                            }
                        }
                    }
                }
                if (jSONObject.has("interests")) {
                    JSONArray jSONArray = jSONObject.getJSONArray("interests");
                    for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                        adColonyUserMetadata.addUserInterest(jSONArray.getString(i2));
                    }
                }
            }
            return adColonyUserMetadata;
        } catch (Exception e) {
            Log.i(TAG, e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

    static JSONObject toJson(AdColonyInterstitial adColonyInterstitial) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("zoneId", adColonyInterstitial.getZoneID());
        jSONObject.put("expired", adColonyInterstitial.isExpired());
        return jSONObject;
    }

    static JSONObject toJson(AdColonyReward adColonyReward) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", adColonyReward.getRewardName());
        jSONObject.put("zoneId", adColonyReward.getZoneID());
        jSONObject.put("amount", adColonyReward.getRewardAmount());
        jSONObject.put("success", adColonyReward.success());
        return jSONObject;
    }

    static JSONObject toJson(AdColonyZone adColonyZone) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("zoneId", adColonyZone.getZoneID());
        jSONObject.put("zoneType", adColonyZone.getZoneType());
        jSONObject.put("rewarded", adColonyZone.isRewarded());
        jSONObject.put("valid", adColonyZone.isValid());
        jSONObject.put("viewsPerReward", adColonyZone.getViewsPerReward());
        jSONObject.put("rewardName", adColonyZone.getRewardName());
        jSONObject.put("rewardAmount", adColonyZone.getRewardAmount());
        jSONObject.put("viewsUntilReward", adColonyZone.getRemainingViewsUntilReward());
        return jSONObject;
    }
}
