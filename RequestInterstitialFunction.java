package com.adcolony.airadc;

import android.util.Log;
import com.adcolony.sdk.AdColony;
import com.adcolony.sdk.AdColonyAdOptions;
import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;

class RequestInterstitialFunction implements FREFunction {
    static final String KEY = "requestInterstitial";

    RequestInterstitialFunction() {
    }

    public FREObject call(FREContext fREContext, FREObject[] fREObjectArr) {
        FREObject fREObject;
        String asString;
        AirAdcInterstitialListener interstitialListener;
        AirAdcContext airAdcContext = (AirAdcContext) fREContext;
        AdColonyAdOptions adColonyAdOptions = null;
        try {
            if (!airAdcContext.configured) {
                return FREObject.newObject("undefined");
            }
            fREObject = FREObject.newObject(false);
            try {
                if (!(fREObjectArr.length < 1 || fREObjectArr[0] == null || (asString = fREObjectArr[0].getAsString()) == null || (interstitialListener = airAdcContext.getInterstitialListener(asString)) == null)) {
                    AdColony.getZone(asString);
                    if (fREObjectArr.length > 1 && fREObjectArr[1] != null) {
                        adColonyAdOptions = AirAdcUtils.parseJsonIntoAdOptions(fREObjectArr[1].getAsString());
                    }
                    return FREObject.newObject(AdColony.requestInterstitial(asString, interstitialListener, adColonyAdOptions));
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
