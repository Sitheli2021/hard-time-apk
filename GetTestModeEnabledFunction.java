package com.adcolony.airadc;

import android.util.Log;
import com.adcolony.sdk.AdColony;
import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;

class GetTestModeEnabledFunction implements FREFunction {
    static final String KEY = "getTestModeEnabled";

    GetTestModeEnabledFunction() {
    }

    public FREObject call(FREContext fREContext, FREObject[] fREObjectArr) {
        AirAdcContext airAdcContext = (AirAdcContext) fREContext;
        FREObject fREObject = null;
        try {
            airAdcContext.getClass();
            Log.i("AdColonyANE", "Starting function getTestModeEnabled");
            FREObject newObject = FREObject.newObject(false);
            try {
                return FREObject.newObject(AdColony.getAppOptions().getTestModeEnabled());
            } catch (Exception e) {
                FREObject fREObject2 = newObject;
                e = e;
                fREObject = fREObject2;
                airAdcContext.getClass();
                Log.i("AdColonyANE", e.getMessage());
                e.printStackTrace();
                return fREObject;
            }
        } catch (Exception e2) {
            e = e2;
            airAdcContext.getClass();
            Log.i("AdColonyANE", e.getMessage());
            e.printStackTrace();
            return fREObject;
        }
    }
}
