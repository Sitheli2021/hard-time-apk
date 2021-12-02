package com.adcolony.airadc;

import android.util.Log;
import com.adcolony.sdk.AdColonyInterstitial;
import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import org.json.JSONObject;

class ShowInterstitialFunction implements FREFunction {
    static final String KEY = "showInterstitial";

    ShowInterstitialFunction() {
    }

    public FREObject call(FREContext fREContext, FREObject[] fREObjectArr) {
        FREObject fREObject;
        String asString;
        AirAdcInterstitialListener interstitialListener;
        AirAdcContext airAdcContext = (AirAdcContext) fREContext;
        String str = null;
        try {
            if (!airAdcContext.configured) {
                return FREObject.newObject("undefined");
            }
            fREObject = FREObject.newObject(false);
            try {
                if (!(fREObjectArr.length != 1 || fREObjectArr[0] == null || (asString = fREObjectArr[0].getAsString()) == null)) {
                    JSONObject jSONObject = new JSONObject(asString);
                    if (jSONObject.get("zoneId") != null) {
                        str = jSONObject.getString("zoneId");
                    }
                    if (!(str == null || (interstitialListener = airAdcContext.getInterstitialListener(str)) == null)) {
                        AdColonyInterstitial interstitialAd = interstitialListener.getInterstitialAd();
                        if (interstitialAd != null) {
                            return FREObject.newObject(interstitialAd.show());
                        }
                        airAdcContext.getClass();
                        Log.i("AdColonyANE", "Unable to show ad. interstitialAd is null. zone=" + str);
                    }
                }
            } catch (Exception e) {
                e = e;
                airAdcContext.getClass();
                Log.i("AdColonyANE", e.getMessage());
                e.printStackTrace();
                return fREObject;
            }
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
