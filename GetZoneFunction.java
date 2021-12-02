package com.adcolony.airadc;

import android.util.Log;
import com.adcolony.sdk.AdColony;
import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;

class GetZoneFunction implements FREFunction {
    static final String KEY = "getZone";

    GetZoneFunction() {
    }

    public FREObject call(FREContext fREContext, FREObject[] fREObjectArr) {
        AirAdcContext airAdcContext = (AirAdcContext) fREContext;
        try {
            if (!airAdcContext.configured) {
                return FREObject.newObject("undefined");
            }
            if (fREObjectArr.length != 1 || fREObjectArr[0] == null) {
                return null;
            }
            return FREObject.newObject(AirAdcUtils.toJson(AdColony.getZone(fREObjectArr[0].getAsString())).toString());
        } catch (Exception e) {
            airAdcContext.getClass();
            Log.i("AdColonyANE", e.getMessage());
            e.printStackTrace();
            return null;
        }
    }
}
