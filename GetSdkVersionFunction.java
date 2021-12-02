package com.adcolony.airadc;

import android.util.Log;
import com.adcolony.sdk.AdColony;
import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;

class GetSdkVersionFunction implements FREFunction {
    static final String KEY = "getSdkVersion";

    GetSdkVersionFunction() {
    }

    public FREObject call(FREContext fREContext, FREObject[] fREObjectArr) {
        AirAdcContext airAdcContext = (AirAdcContext) fREContext;
        try {
            return !airAdcContext.configured ? FREObject.newObject("undefined") : FREObject.newObject(AdColony.getSDKVersion());
        } catch (Exception e) {
            airAdcContext.getClass();
            Log.i("AdColonyANE", e.getMessage());
            e.printStackTrace();
            return null;
        }
    }
}
