package com.adcolony.airadc;

import android.util.Log;
import com.adcolony.sdk.AdColonyEventTracker;
import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

public class SendPieEventFunction implements FREFunction {
    static final String KEY = "logPieEvent";

    private void achievementUnlockedHelper(JSONObject jSONObject) throws JSONException {
        String string = jSONObject.getString("description");
        Log.i("AdColonyANE", "[DEBUG] sending PIE Event achievementUnlocked");
        AdColonyEventTracker.logAchievementUnlocked(string);
    }

    private void addToCartHelper(JSONObject jSONObject) throws JSONException {
        String string = jSONObject.getString("itemId");
        Log.i("AdColonyANE", "[DEBUG] sending PIE Event addToCart");
        AdColonyEventTracker.logAddToCart(string);
    }

    private void addToWishlistHelper(JSONObject jSONObject) throws JSONException {
        String string = jSONObject.getString("itemId");
        Log.i("AdColonyANE", "[DEBUG] sending PIE Event addToWishList");
        AdColonyEventTracker.logAddToWishlist(string);
    }

    private void contentViewHelper(JSONObject jSONObject) throws JSONException {
        String string = jSONObject.getString("contentId");
        String string2 = jSONObject.getString("content_type");
        Log.i("AdColonyANE", "[DEBUG] sending PIE Event contentView");
        AdColonyEventTracker.logContentView(string, string2);
    }

    private void creditsSpentHelper(JSONObject jSONObject) throws JSONException {
        String string = jSONObject.getString("creditName");
        Integer valueOf = Integer.valueOf(jSONObject.getInt("quantity"));
        Double valueOf2 = Double.valueOf(jSONObject.getDouble("creditsValue"));
        String string2 = jSONObject.getString("currencyCode");
        Log.i("AdColonyANE", "[DEBUG] sending PIE Event creditsspent");
        AdColonyEventTracker.logCreditsSpent(string, valueOf, valueOf2, string2);
    }

    private void customEventHelper(JSONObject jSONObject) throws JSONException {
        String string = jSONObject.getString("event");
        String string2 = jSONObject.getString("description");
        Log.i("AdColonyANE", "[DEBUG] sending PIE Event customEvent");
        AdColonyEventTracker.logCustomEvent(string, string2);
    }

    private void eventHelper(JSONObject jSONObject) throws JSONException {
        String string = jSONObject.getString("eventName");
        Log.i("AdColonyANE", "[DEBUG] sending PIE Event event");
        if (jSONObject.length() == 1) {
            AdColonyEventTracker.logEvent(string);
            return;
        }
        jSONObject.remove("eventName");
        AdColonyEventTracker.logEvent(string, jsonToMap(jSONObject));
    }

    private HashMap<String, String> jsonToMap(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject(jSONObject.getString("eventPayload"));
        HashMap<String, String> hashMap = new HashMap<>();
        while (jSONObject2.keys().hasNext()) {
            String next = jSONObject2.keys().next();
            hashMap.put(next, (String) jSONObject2.get(next));
            jSONObject2.remove(next);
        }
        return hashMap;
    }

    private void levelAchievedHelper(JSONObject jSONObject) throws JSONException {
        Integer valueOf = Integer.valueOf(jSONObject.getInt("levelAchieved"));
        Log.i("AdColonyANE", "[DEBUG] sending PIE Event level achieved");
        AdColonyEventTracker.logLevelAchieved(valueOf);
    }

    private void loginHelper(JSONObject jSONObject) throws JSONException {
        String string = jSONObject.getString("methodUsed");
        Log.i("AdColonyANE", "[DEBUG] sending PIE Event login");
        AdColonyEventTracker.logLogin(string);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean parseEvent(java.lang.String r5, java.lang.String r6) {
        /*
            r4 = this;
            r0 = 0
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x0146 }
            r1.<init>(r6)     // Catch:{ Exception -> 0x0146 }
            r6 = -1
            int r2 = r5.hashCode()     // Catch:{ Exception -> 0x0146 }
            r3 = 1
            switch(r2) {
                case -1870669480: goto L_0x00e5;
                case -1689734419: goto L_0x00db;
                case -1399679673: goto L_0x00d1;
                case -1343953670: goto L_0x00c6;
                case -1256706207: goto L_0x00bc;
                case -1148078770: goto L_0x00b2;
                case -1063191312: goto L_0x00a7;
                case -991721531: goto L_0x009c;
                case -936419752: goto L_0x0092;
                case -753314328: goto L_0x0087;
                case -204704013: goto L_0x007b;
                case -171231235: goto L_0x0070;
                case 449446287: goto L_0x0064;
                case 763552169: goto L_0x0058;
                case 831890091: goto L_0x004d;
                case 1478495406: goto L_0x0041;
                case 1660566381: goto L_0x0035;
                case 1937928716: goto L_0x0029;
                case 1989757366: goto L_0x001d;
                case 1996015237: goto L_0x0011;
                default: goto L_0x000f;
            }     // Catch:{ Exception -> 0x0146 }
        L_0x000f:
            goto L_0x00ef
        L_0x0011:
            java.lang.String r2 = "logLogin"
            boolean r5 = r5.equals(r2)     // Catch:{ Exception -> 0x0146 }
            if (r5 == 0) goto L_0x00ef
            r5 = 12
            goto L_0x00f0
        L_0x001d:
            java.lang.String r2 = "logEvent"
            boolean r5 = r5.equals(r2)     // Catch:{ Exception -> 0x0146 }
            if (r5 == 0) goto L_0x00ef
            r5 = 9
            goto L_0x00f0
        L_0x0029:
            java.lang.String r2 = "logSearch"
            boolean r5 = r5.equals(r2)     // Catch:{ Exception -> 0x0146 }
            if (r5 == 0) goto L_0x00ef
            r5 = 16
            goto L_0x00f0
        L_0x0035:
            java.lang.String r2 = "logInvite"
            boolean r5 = r5.equals(r2)     // Catch:{ Exception -> 0x0146 }
            if (r5 == 0) goto L_0x00ef
            r5 = 10
            goto L_0x00f0
        L_0x0041:
            java.lang.String r2 = "logRegistrationCompleted"
            boolean r5 = r5.equals(r2)     // Catch:{ Exception -> 0x0146 }
            if (r5 == 0) goto L_0x00ef
            r5 = 14
            goto L_0x00f0
        L_0x004d:
            java.lang.String r2 = "content_view"
            boolean r5 = r5.equals(r2)     // Catch:{ Exception -> 0x0146 }
            if (r5 == 0) goto L_0x00ef
            r5 = 6
            goto L_0x00f0
        L_0x0058:
            java.lang.String r2 = "logTutorialCompleted"
            boolean r5 = r5.equals(r2)     // Catch:{ Exception -> 0x0146 }
            if (r5 == 0) goto L_0x00ef
            r5 = 19
            goto L_0x00f0
        L_0x0064:
            java.lang.String r2 = "logSocialSharingEvent"
            boolean r5 = r5.equals(r2)     // Catch:{ Exception -> 0x0146 }
            if (r5 == 0) goto L_0x00ef
            r5 = 17
            goto L_0x00f0
        L_0x0070:
            java.lang.String r2 = "logAddToWishlist"
            boolean r5 = r5.equals(r2)     // Catch:{ Exception -> 0x0146 }
            if (r5 == 0) goto L_0x00ef
            r5 = 3
            goto L_0x00f0
        L_0x007b:
            java.lang.String r2 = "logLevelAchieved"
            boolean r5 = r5.equals(r2)     // Catch:{ Exception -> 0x0146 }
            if (r5 == 0) goto L_0x00ef
            r5 = 11
            goto L_0x00f0
        L_0x0087:
            java.lang.String r2 = "logReservation"
            boolean r5 = r5.equals(r2)     // Catch:{ Exception -> 0x0146 }
            if (r5 == 0) goto L_0x00ef
            r5 = 15
            goto L_0x00f0
        L_0x0092:
            java.lang.String r2 = "logCreditsSpent"
            boolean r5 = r5.equals(r2)     // Catch:{ Exception -> 0x0146 }
            if (r5 == 0) goto L_0x00ef
            r5 = 7
            goto L_0x00f0
        L_0x009c:
            java.lang.String r2 = "logCustomEvent"
            boolean r5 = r5.equals(r2)     // Catch:{ Exception -> 0x0146 }
            if (r5 == 0) goto L_0x00ef
            r5 = 8
            goto L_0x00f0
        L_0x00a7:
            java.lang.String r2 = "logPaymentInfoAdded"
            boolean r5 = r5.equals(r2)     // Catch:{ Exception -> 0x0146 }
            if (r5 == 0) goto L_0x00ef
            r5 = 13
            goto L_0x00f0
        L_0x00b2:
            java.lang.String r2 = "logAchievementUnlocked"
            boolean r5 = r5.equals(r2)     // Catch:{ Exception -> 0x0146 }
            if (r5 == 0) goto L_0x00ef
            r5 = 0
            goto L_0x00f0
        L_0x00bc:
            java.lang.String r2 = "logCheckoutInitiated"
            boolean r5 = r5.equals(r2)     // Catch:{ Exception -> 0x0146 }
            if (r5 == 0) goto L_0x00ef
            r5 = 5
            goto L_0x00f0
        L_0x00c6:
            java.lang.String r2 = "logTransaction"
            boolean r5 = r5.equals(r2)     // Catch:{ Exception -> 0x0146 }
            if (r5 == 0) goto L_0x00ef
            r5 = 18
            goto L_0x00f0
        L_0x00d1:
            java.lang.String r2 = "logAppRated"
            boolean r5 = r5.equals(r2)     // Catch:{ Exception -> 0x0146 }
            if (r5 == 0) goto L_0x00ef
            r5 = 4
            goto L_0x00f0
        L_0x00db:
            java.lang.String r2 = "logActivated"
            boolean r5 = r5.equals(r2)     // Catch:{ Exception -> 0x0146 }
            if (r5 == 0) goto L_0x00ef
            r5 = 1
            goto L_0x00f0
        L_0x00e5:
            java.lang.String r2 = "logAddToCart"
            boolean r5 = r5.equals(r2)     // Catch:{ Exception -> 0x0146 }
            if (r5 == 0) goto L_0x00ef
            r5 = 2
            goto L_0x00f0
        L_0x00ef:
            r5 = -1
        L_0x00f0:
            switch(r5) {
                case 0: goto L_0x0141;
                case 1: goto L_0x013d;
                case 2: goto L_0x0139;
                case 3: goto L_0x0135;
                case 4: goto L_0x0131;
                case 5: goto L_0x012d;
                case 6: goto L_0x0129;
                case 7: goto L_0x0125;
                case 8: goto L_0x0121;
                case 9: goto L_0x011d;
                case 10: goto L_0x0119;
                case 11: goto L_0x0115;
                case 12: goto L_0x0111;
                case 13: goto L_0x010d;
                case 14: goto L_0x0109;
                case 15: goto L_0x0105;
                case 16: goto L_0x0101;
                case 17: goto L_0x00fd;
                case 18: goto L_0x00f9;
                case 19: goto L_0x00f5;
                default: goto L_0x00f3;
            }     // Catch:{ Exception -> 0x0146 }
        L_0x00f3:
            goto L_0x014a
        L_0x00f5:
            com.adcolony.sdk.AdColonyEventTracker.logTutorialCompleted()     // Catch:{ Exception -> 0x0146 }
            goto L_0x0144
        L_0x00f9:
            r4.transactionHelper(r1)     // Catch:{ Exception -> 0x0146 }
            goto L_0x0144
        L_0x00fd:
            r4.socialSharingHelper(r1)     // Catch:{ Exception -> 0x0146 }
            goto L_0x0144
        L_0x0101:
            r4.searchHelper(r1)     // Catch:{ Exception -> 0x0146 }
            goto L_0x0144
        L_0x0105:
            com.adcolony.sdk.AdColonyEventTracker.logReservation()     // Catch:{ Exception -> 0x0146 }
            goto L_0x0144
        L_0x0109:
            r4.registrationCompletedHelper(r1)     // Catch:{ Exception -> 0x0146 }
            goto L_0x0144
        L_0x010d:
            com.adcolony.sdk.AdColonyEventTracker.logPaymentInfoAdded()     // Catch:{ Exception -> 0x0146 }
            goto L_0x0144
        L_0x0111:
            r4.loginHelper(r1)     // Catch:{ Exception -> 0x0146 }
            goto L_0x0144
        L_0x0115:
            r4.levelAchievedHelper(r1)     // Catch:{ Exception -> 0x0146 }
            goto L_0x0144
        L_0x0119:
            com.adcolony.sdk.AdColonyEventTracker.logInvite()     // Catch:{ Exception -> 0x0146 }
            goto L_0x0144
        L_0x011d:
            r4.eventHelper(r1)     // Catch:{ Exception -> 0x0146 }
            goto L_0x0144
        L_0x0121:
            r4.customEventHelper(r1)     // Catch:{ Exception -> 0x0146 }
            goto L_0x0144
        L_0x0125:
            r4.creditsSpentHelper(r1)     // Catch:{ Exception -> 0x0146 }
            goto L_0x0144
        L_0x0129:
            r4.contentViewHelper(r1)     // Catch:{ Exception -> 0x0146 }
            goto L_0x0144
        L_0x012d:
            com.adcolony.sdk.AdColonyEventTracker.logCheckoutInitiated()     // Catch:{ Exception -> 0x0146 }
            goto L_0x0144
        L_0x0131:
            com.adcolony.sdk.AdColonyEventTracker.logAppRated()     // Catch:{ Exception -> 0x0146 }
            goto L_0x0144
        L_0x0135:
            r4.addToWishlistHelper(r1)     // Catch:{ Exception -> 0x0146 }
            goto L_0x0144
        L_0x0139:
            r4.addToCartHelper(r1)     // Catch:{ Exception -> 0x0146 }
            goto L_0x0144
        L_0x013d:
            com.adcolony.sdk.AdColonyEventTracker.logActivated()     // Catch:{ Exception -> 0x0146 }
            goto L_0x0144
        L_0x0141:
            r4.achievementUnlockedHelper(r1)     // Catch:{ Exception -> 0x0146 }
        L_0x0144:
            r0 = 1
            goto L_0x014a
        L_0x0146:
            r5 = move-exception
            r5.printStackTrace()
        L_0x014a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.airadc.SendPieEventFunction.parseEvent(java.lang.String, java.lang.String):boolean");
    }

    private void registrationCompletedHelper(JSONObject jSONObject) throws JSONException {
        String string = jSONObject.getString("registrationMethod");
        String string2 = jSONObject.getString("registrationDescription");
        Log.i("AdColonyANE", "[DEBUG] sending PIE Event registration");
        AdColonyEventTracker.logRegistrationCompleted(string, string2);
    }

    private void searchHelper(JSONObject jSONObject) throws JSONException {
        String string = jSONObject.getString("searchString");
        Log.i("AdColonyANE", "[DEBUG] sending PIE Event search");
        AdColonyEventTracker.logSearch(string);
    }

    private void socialSharingHelper(JSONObject jSONObject) throws JSONException {
        String string = jSONObject.getString("network");
        String string2 = jSONObject.getString("logDescription");
        Log.i("AdColonyANE", "[DEBUG] sending PIE Event social");
        AdColonyEventTracker.logSocialSharingEvent(string, string2);
    }

    private void transactionHelper(JSONObject jSONObject) throws JSONException {
        String string = jSONObject.getString("itemId");
        Integer valueOf = Integer.valueOf(jSONObject.getInt("quantity"));
        Double valueOf2 = Double.valueOf(jSONObject.getDouble("price"));
        String string2 = jSONObject.getString("currencyCode");
        String string3 = jSONObject.getString("receipt");
        String string4 = jSONObject.getString("store");
        String string5 = jSONObject.getString("productDescription");
        Log.i("AdColonyANE", "[DEBUG] sending PIE Event transaction");
        AdColonyEventTracker.logTransaction(string, valueOf, valueOf2, string2, string3, string4, string5);
    }

    public FREObject call(FREContext fREContext, FREObject[] fREObjectArr) {
        FREObject fREObject;
        AirAdcContext airAdcContext = (AirAdcContext) fREContext;
        try {
            fREObject = FREObject.newObject(false);
            if (fREObjectArr != null) {
                try {
                    if (fREObjectArr.length == 2) {
                        return FREObject.newObject(parseEvent(fREObjectArr[0].getAsString(), fREObjectArr[1].getAsString()));
                    }
                } catch (Exception e) {
                    e = e;
                    airAdcContext.getClass();
                    Log.i("AdColonyANE", e.getMessage());
                    e.printStackTrace();
                    return fREObject;
                }
            }
            airAdcContext.getClass();
            Log.e("AdColonyANE", "SendPieEvent freObjects null or incorrect params sent.");
            return fREObject;
        } catch (Exception e2) {
            e = e2;
            fREObject = null;
            airAdcContext.getClass();
            Log.i("AdColonyANE", e.getMessage());
            e.printStackTrace();
            return fREObject;
        }
    }
}
