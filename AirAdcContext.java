package com.adcolony.airadc;

import android.util.Log;
import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class AirAdcContext extends FREContext {
    static final String VERSION = "4.4.0";
    final String TAG = "AdColonyANE";
    private JSONObject _appOptionsJson;
    private String _extensionName;
    private Map<String, AirAdcInterstitialListener> _interstitialListeners;
    boolean configured;

    public AirAdcContext(String str) {
        Log.i("AdColonyANE", "Creating ANE context");
        this._extensionName = str;
        this._interstitialListeners = new HashMap();
    }

    public void dispose() {
        Log.i("AdColonyANE", "Disposing ANE context");
    }

    /* access modifiers changed from: package-private */
    public JSONObject getAppOptions() {
        return this._appOptionsJson;
    }

    public Map<String, FREFunction> getFunctions() {
        HashMap hashMap = new HashMap();
        hashMap.put("configure", new ConfigureFunction());
        hashMap.put("getZone", new GetZoneFunction());
        hashMap.put("requestInterstitial", new RequestInterstitialFunction());
        hashMap.put("showInterstitial", new ShowInterstitialFunction());
        hashMap.put("cancelInterstitial", new CancelInterstitialFunction());
        hashMap.put("getSdkVersion", new GetSdkVersionFunction());
        hashMap.put("getAppOptions", new GetAppOptionsFunction());
        hashMap.put("setAppOptions", new SetAppOptionsFunction());
        hashMap.put("isAndroidOsSupported", new IsAndroidOsSupportedFunction());
        hashMap.put("logPieEvent", new SendPieEventFunction());
        hashMap.put("getTestModeEnabled", new GetTestModeEnabledFunction());
        hashMap.put("getPluginInfo", new GetPluginInfoFunction());
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    public AirAdcInterstitialListener getInterstitialListener(String str) {
        if (this._interstitialListeners == null || !this._interstitialListeners.keySet().contains(str)) {
            return null;
        }
        return this._interstitialListeners.get(str);
    }

    /* access modifiers changed from: package-private */
    public void setAppOptions(String str) {
        try {
            this._appOptionsJson = new JSONObject(str);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: package-private */
    public void updateAdListeners(List<String> list) {
        for (String next : list) {
            if (!this._interstitialListeners.keySet().contains(next)) {
                this._interstitialListeners.put(next, new AirAdcInterstitialListener(this));
            }
        }
    }
}
