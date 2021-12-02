package com.adcolony.airadc;

import android.util.Log;
import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import org.json.JSONObject;

class GetAppOptionsFunction implements FREFunction {
    static final String KEY = "getAppOptions";

    GetAppOptionsFunction() {
    }

    public FREObject call(FREContext fREContext, FREObject[] fREObjectArr) {
        AirAdcContext airAdcContext = (AirAdcContext) fREContext;
        try {
            if (!airAdcContext.configured) {
                return FREObject.newObject("undefined");
            }
            JSONObject appOptions = airAdcContext.getAppOptions();
            if (appOptions != null) {
                return FREObject.newObject(appOptions.toString());
            }
            return null;
        } catch (Exception e) {
            airAdcContext.getClass();
            Log.i("AdColonyANE", e.getMessage());
            e.printStackTrace();
            return null;
        }
    }
}
