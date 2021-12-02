package com.adcolony.sdk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.adcolony.sdk.C0269v;

/* renamed from: com.adcolony.sdk.c0 */
class C0045c0 {
    C0045c0() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo331a() {
        return mo333c() ? "wifi" : mo332b() ? "cell" : "none";
    }

    /* access modifiers changed from: package-private */
    @SuppressLint({"MissingPermission"})
    /* renamed from: b */
    public boolean mo332b() {
        Context b = C0026a.m78b();
        if (b == null) {
            return false;
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) b.getApplicationContext().getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager == null ? null : connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return false;
            }
            int type = activeNetworkInfo.getType();
            return type == 0 || type >= 2;
        } catch (SecurityException e) {
            new C0269v.C0270a().mo707a("SecurityException - please ensure you added the ").mo707a("ACCESS_NETWORK_STATE permission: ").mo707a(e.toString()).mo709a(C0269v.f1299i);
            return false;
        } catch (Exception e2) {
            new C0269v.C0270a().mo707a("Exception occurred when retrieving activeNetworkInfo in ").mo707a("ADCNetwork.using_mobile(): ").mo707a(e2.toString()).mo709a(C0269v.f1300j);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    @SuppressLint({"MissingPermission"})
    /* renamed from: c */
    public boolean mo333c() {
        Context b = C0026a.m78b();
        if (b == null) {
            return false;
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) b.getApplicationContext().getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager == null ? null : connectivityManager.getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.getType() == 1;
        } catch (SecurityException e) {
            new C0269v.C0270a().mo707a("SecurityException - please ensure you added the ").mo707a("ACCESS_NETWORK_STATE permission: ").mo707a(e.toString()).mo709a(C0269v.f1299i);
            return false;
        } catch (Exception e2) {
            new C0269v.C0270a().mo707a("Exception occurred when retrieving activeNetworkInfo in ").mo707a("ADCNetwork.using_wifi(): ").mo707a(e2.toString()).mo709a(C0269v.f1300j);
            return false;
        }
    }
}
