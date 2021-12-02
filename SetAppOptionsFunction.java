package com.adcolony.airadc;

import android.util.Log;
import com.adcolony.sdk.AdColony;
import com.adcolony.sdk.AdColonyAppOptions;
import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;

class SetAppOptionsFunction implements FREFunction {
    static final String KEY = "setAppOptions";

    SetAppOptionsFunction() {
    }

    public FREObject call(FREContext fREContext, FREObject[] fREObjectArr) {
        FREObject fREObject;
        AirAdcContext airAdcContext = (AirAdcContext) fREContext;
        FREObject fREObject2 = null;
        try {
            if (!airAdcContext.configured) {
                return FREObject.newObject("undefined");
            }
            FREObject newObject = FREObject.newObject(false);
            try {
                if (fREObjectArr.length != 1 || (fREObject = fREObjectArr[0]) == null) {
                    return newObject;
                }
                String asString = fREObject.getAsString();
                AdColonyAppOptions parseJsonIntoAppOptions = AirAdcUtils.parseJsonIntoAppOptions(asString);
                airAdcContext.getClass();
                Log.i("AdColonyANE", "App Options to be set: " + asString);
                fREObject2 = FREObject.newObject(AdColony.setAppOptions(parseJsonIntoAppOptions));
                airAdcContext.setAppOptions(asString);
                return fREObject2;
            } catch (Exception e) {
                e = e;
                fREObject2 = newObject;
                airAdcContext.getClass();
                Log.i("AdColonyANE", e.getMessage());
                e.printStackTrace();
                return fREObject2;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }
}
