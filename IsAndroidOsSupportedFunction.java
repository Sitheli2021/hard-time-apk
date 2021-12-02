package com.adcolony.airadc;

import android.os.Build;
import android.util.Log;
import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;

class IsAndroidOsSupportedFunction implements FREFunction {
    static final String KEY = "isAndroidOsSupported";
    static final int MIN_SDK_INT = 15;

    IsAndroidOsSupportedFunction() {
    }

    public FREObject call(FREContext fREContext, FREObject[] fREObjectArr) {
        AirAdcContext airAdcContext = (AirAdcContext) fREContext;
        FREObject fREObject = null;
        try {
            airAdcContext.getClass();
            Log.i("AdColonyANE", "Starting function isAndroidOsSupported");
            FREObject newObject = FREObject.newObject(false);
            try {
                return Build.VERSION.SDK_INT >= 15 ? FREObject.newObject(true) : newObject;
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
