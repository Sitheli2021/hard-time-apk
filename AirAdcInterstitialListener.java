package com.adcolony.airadc;

import com.adcolony.sdk.AdColony;
import com.adcolony.sdk.AdColonyInterstitial;
import com.adcolony.sdk.AdColonyInterstitialListener;
import com.adcolony.sdk.AdColonyReward;
import com.adcolony.sdk.AdColonyRewardListener;
import com.adcolony.sdk.AdColonyZone;

class AirAdcInterstitialListener extends AdColonyInterstitialListener implements AdColonyRewardListener {
    private AirAdcContext _context;
    private AdColonyInterstitial _interstitialAd;

    AirAdcInterstitialListener(AirAdcContext airAdcContext) {
        this._context = airAdcContext;
    }

    /* access modifiers changed from: package-private */
    public AdColonyInterstitial getInterstitialAd() {
        return this._interstitialAd;
    }

    public void onAudioStarted(AdColonyInterstitial adColonyInterstitial) {
        super.onAudioStarted(adColonyInterstitial);
        AirAdcUtils.dispatchInterstitialEvent(this._context, adColonyInterstitial, "InterstitialAudioStarted");
    }

    public void onAudioStopped(AdColonyInterstitial adColonyInterstitial) {
        super.onAudioStopped(adColonyInterstitial);
        AirAdcUtils.dispatchInterstitialEvent(this._context, adColonyInterstitial, "InterstitialAudioStopped");
    }

    public void onClicked(AdColonyInterstitial adColonyInterstitial) {
        super.onClicked(adColonyInterstitial);
        this._interstitialAd = adColonyInterstitial;
        AirAdcUtils.dispatchInterstitialEvent(this._context, adColonyInterstitial, "InterstitialClicked");
    }

    public void onClosed(AdColonyInterstitial adColonyInterstitial) {
        super.onClosed(adColonyInterstitial);
        this._interstitialAd = adColonyInterstitial;
        AirAdcUtils.dispatchInterstitialEvent(this._context, adColonyInterstitial, "InterstitialClosed");
    }

    public void onExpiring(AdColonyInterstitial adColonyInterstitial) {
        super.onExpiring(adColonyInterstitial);
        this._interstitialAd = adColonyInterstitial;
        AirAdcUtils.dispatchInterstitialEvent(this._context, adColonyInterstitial, "InterstitialExpiring");
    }

    public void onIAPEvent(AdColonyInterstitial adColonyInterstitial, String str, int i) {
        super.onIAPEvent(adColonyInterstitial, str, i);
        this._interstitialAd = adColonyInterstitial;
        AirAdcUtils.dispatchInterstitialEvent(this._context, adColonyInterstitial, str, i, "InterstitialIapEvent");
    }

    public void onLeftApplication(AdColonyInterstitial adColonyInterstitial) {
        super.onLeftApplication(adColonyInterstitial);
        this._interstitialAd = adColonyInterstitial;
        AirAdcUtils.dispatchInterstitialEvent(this._context, adColonyInterstitial, "InterstitialLeftApplication");
    }

    public void onOpened(AdColonyInterstitial adColonyInterstitial) {
        super.onOpened(adColonyInterstitial);
        this._interstitialAd = adColonyInterstitial;
        AirAdcUtils.dispatchInterstitialEvent(this._context, adColonyInterstitial, "InterstitialOpened");
    }

    public void onRequestFilled(AdColonyInterstitial adColonyInterstitial) {
        this._interstitialAd = adColonyInterstitial;
        try {
            this._interstitialAd.getZoneID();
            if (AdColony.getZone(this._interstitialAd.getZoneID()).isRewarded()) {
                AdColony.setRewardListener(this);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        AirAdcUtils.dispatchInterstitialEvent(this._context, adColonyInterstitial, "InterstitialRequestFilled");
    }

    public void onRequestNotFilled(AdColonyZone adColonyZone) {
        super.onRequestNotFilled(adColonyZone);
        if (adColonyZone.isRewarded()) {
            AdColony.removeRewardListener();
        }
        AirAdcUtils.dispatchInterstitialEvent(this._context, adColonyZone, "InterstitialRequestNotFilled");
    }

    public void onReward(AdColonyReward adColonyReward) {
        AirAdcUtils.dispatchRewardedAdEvent(this._context, adColonyReward, "InterstitialOnReward");
    }
}
