package com.adcolony.sdk;

import android.os.Bundle;
import java.util.HashMap;

/* renamed from: com.adcolony.sdk.e0 */
class C0081e0 {

    /* renamed from: a */
    private static int f248a = 0;

    /* renamed from: b */
    private static HashMap<String, Integer> f249b = new HashMap<>();

    /* renamed from: c */
    private static HashMap<String, Integer> f250c = new HashMap<>();

    /* renamed from: d */
    static final int f251d = 5;

    /* renamed from: e */
    static final int f252e = 1;

    /* renamed from: f */
    static final int f253f = 3;

    /* renamed from: g */
    static final int f254g = 0;

    /* renamed from: h */
    static final int f255h = 1;

    C0081e0() {
    }

    /* renamed from: a */
    static boolean m226a(int i, Bundle bundle) {
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        if (i != 0) {
            if (i != 1 || bundle == null) {
                return false;
            }
            String string = bundle.getString("zone_id");
            if (f249b.get(string) == null) {
                f249b.put(string, Integer.valueOf(currentTimeMillis));
            }
            if (f250c.get(string) == null) {
                f250c.put(string, 0);
            }
            if (currentTimeMillis - f249b.get(string).intValue() > 1) {
                f250c.put(string, 1);
                f249b.put(string, Integer.valueOf(currentTimeMillis));
                return false;
            }
            int intValue = f250c.get(string).intValue() + 1;
            f250c.put(string, Integer.valueOf(intValue));
            return intValue > 3;
        } else if (currentTimeMillis - f248a < 5) {
            return true;
        } else {
            f248a = currentTimeMillis;
            return false;
        }
    }
}
