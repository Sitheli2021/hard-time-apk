package com.adcolony.sdk;

import org.json.JSONObject;

public class AdColonyReward {

    /* renamed from: a */
    private int f86a;

    /* renamed from: b */
    private String f87b;

    /* renamed from: c */
    private String f88c;

    /* renamed from: d */
    private boolean f89d;

    AdColonyReward(C0284y yVar) {
        JSONObject b = yVar.mo736b();
        this.f86a = C0267t.m817f(b, "reward_amount");
        this.f87b = C0267t.m819h(b, "reward_name");
        this.f89d = C0267t.m814d(b, "success");
        this.f88c = C0267t.m819h(b, "zone_id");
    }

    public int getRewardAmount() {
        return this.f86a;
    }

    public String getRewardName() {
        return this.f87b;
    }

    public String getZoneID() {
        return this.f88c;
    }

    public boolean success() {
        return this.f89d;
    }
}
