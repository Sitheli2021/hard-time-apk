package com.adcolony.sdk;

import androidx.annotation.NonNull;
import com.adcolony.sdk.C0269v;
import org.json.JSONObject;

public class AdColonyZone {
    public static final int BANNER = 1;
    public static final int INTERSTITIAL = 0;
    @Deprecated
    public static final int NATIVE = 2;

    /* renamed from: l */
    static final int f94l = 0;

    /* renamed from: m */
    static final int f95m = 1;

    /* renamed from: n */
    static final int f96n = 5;

    /* renamed from: o */
    static final int f97o = 6;

    /* renamed from: a */
    private String f98a;

    /* renamed from: b */
    private String f99b;

    /* renamed from: c */
    private int f100c = 5;

    /* renamed from: d */
    private int f101d;

    /* renamed from: e */
    private int f102e;

    /* renamed from: f */
    private int f103f;

    /* renamed from: g */
    private int f104g;

    /* renamed from: h */
    private int f105h;

    /* renamed from: i */
    private int f106i;

    /* renamed from: j */
    private boolean f107j;

    /* renamed from: k */
    private boolean f108k;

    AdColonyZone(@NonNull String str) {
        this.f98a = str;
    }

    /* renamed from: a */
    private int m62a(int i) {
        if (C0026a.m82e() && !C0026a.m80c().mo418A() && !C0026a.m80c().mo419B()) {
            return i;
        }
        m66c();
        return 0;
    }

    /* renamed from: a */
    private String m63a(String str) {
        return m64a(str, "");
    }

    /* renamed from: a */
    private String m64a(String str, String str2) {
        if (C0026a.m82e() && !C0026a.m80c().mo418A() && !C0026a.m80c().mo419B()) {
            return str;
        }
        m66c();
        return str2;
    }

    /* renamed from: a */
    private boolean m65a(boolean z) {
        if (C0026a.m82e() && !C0026a.m80c().mo418A() && !C0026a.m80c().mo419B()) {
            return z;
        }
        m66c();
        return false;
    }

    /* renamed from: c */
    private void m66c() {
        new C0269v.C0270a().mo707a("The AdColonyZone API is not available while AdColony is disabled.").mo709a(C0269v.f1299i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo263a() {
        return this.f106i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo264a(C0284y yVar) {
        JSONObject b = yVar.mo736b();
        JSONObject g = C0267t.m818g(b, "reward");
        this.f99b = C0267t.m819h(g, "reward_name");
        this.f105h = C0267t.m817f(g, "reward_amount");
        this.f103f = C0267t.m817f(g, "views_per_reward");
        this.f102e = C0267t.m817f(g, "views_until_reward");
        this.f108k = C0267t.m814d(b, "rewarded");
        this.f100c = C0267t.m817f(b, "status");
        this.f101d = C0267t.m817f(b, "type");
        this.f104g = C0267t.m817f(b, "play_interval");
        this.f98a = C0267t.m819h(b, "zone_id");
        boolean z = true;
        if (this.f100c == 1) {
            z = false;
        }
        this.f107j = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo265b(int i) {
        this.f106i = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo266b() {
        return this.f100c == 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo267c(int i) {
        this.f100c = i;
    }

    public int getPlayFrequency() {
        return m62a(this.f104g);
    }

    public int getRemainingViewsUntilReward() {
        return m62a(this.f102e);
    }

    public int getRewardAmount() {
        return m62a(this.f105h);
    }

    public String getRewardName() {
        return m63a(this.f99b);
    }

    public int getViewsPerReward() {
        return m62a(this.f103f);
    }

    public String getZoneID() {
        return m63a(this.f98a);
    }

    public int getZoneType() {
        return this.f101d;
    }

    public boolean isRewarded() {
        return this.f108k;
    }

    public boolean isValid() {
        return m65a(this.f107j);
    }
}
