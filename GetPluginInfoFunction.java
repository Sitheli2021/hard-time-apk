package com.adcolony.airadc;

import android.util.Log;
import com.adcolony.sdk.AdColony;
import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;

class GetPluginInfoFunction implements FREFunction {
    static final String KEY = "getPluginInfo";

    GetPluginInfoFunction() {
    }

    public FREObject call(FREContext fREContext, FREObject[] fREObjectArr) {
        AirAdcContext airAdcContext = (AirAdcContext) fREContext;
        try {
            airAdcContext.getClass();
            Log.i("AdColonyANE", "Starting function getTestModeEnabled");
            return FREObject.newObject(AdColony.getAppOptions().getPluginInfo().toString());
        } catch (Exception e) {
            airAdcContext.getClass();
            Log.i("AdColonyANE", e.getMessage());
            e.printStackTrace();
            return null;
        }
    }
}
