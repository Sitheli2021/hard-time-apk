package com.adcolony.sdk;

import com.adcolony.sdk.C0269v;
import java.io.IOException;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.adcolony.sdk.t */
class C0267t {
    C0267t() {
    }

    /* renamed from: a */
    static int m784a(JSONObject jSONObject, String str, int i) {
        return jSONObject.optInt(str, i);
    }

    /* renamed from: a */
    static JSONArray m785a() {
        return new JSONArray();
    }

    /* renamed from: a */
    static JSONArray m786a(String str) {
        try {
            return new JSONArray(str);
        } catch (JSONException e) {
            new C0269v.C0270a().mo707a(e.toString()).mo709a(C0269v.f1300j);
            return new JSONArray();
        }
    }

    /* renamed from: a */
    static JSONArray m787a(JSONArray jSONArray, String[] strArr, boolean z) {
        for (String str : strArr) {
            if (!z || !m794a(jSONArray, str)) {
                m807b(jSONArray, str);
            }
        }
        return jSONArray;
    }

    /* renamed from: a */
    static JSONArray m788a(String[] strArr) {
        JSONArray a = m785a();
        for (String b : strArr) {
            m807b(a, b);
        }
        return a;
    }

    /* renamed from: a */
    static JSONObject m789a(String str, String str2) {
        String str3;
        try {
            return new JSONObject(str);
        } catch (JSONException e) {
            if (str2 == null) {
                str3 = "";
            } else {
                str3 = str2 + ": " + e.toString();
            }
            new C0269v.C0270a().mo707a(str3).mo709a(C0269v.f1300j);
            return new JSONObject();
        }
    }

    /* renamed from: a */
    static JSONObject m790a(JSONArray jSONArray, int i) {
        try {
            return jSONArray.getJSONObject(i);
        } catch (JSONException e) {
            new C0269v.C0270a().mo707a(e.toString()).mo709a(C0269v.f1300j);
            return new JSONObject();
        }
    }

    /* renamed from: a */
    static JSONObject m791a(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                jSONObject.put(next, jSONObject2.get(next));
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    static void m792a(JSONArray jSONArray, Object obj) {
        jSONArray.put(obj);
    }

    /* renamed from: a */
    static void m793a(JSONArray jSONArray, boolean z) {
        jSONArray.put(z);
    }

    /* renamed from: a */
    static boolean m794a(JSONArray jSONArray, String str) {
        for (int i = 0; i < jSONArray.length(); i++) {
            if (m813d(jSONArray, i).equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    static boolean m795a(JSONObject jSONObject, String str) {
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            if (str.equals(keys.next())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    static boolean m796a(JSONObject jSONObject, String str, double d) {
        try {
            jSONObject.put(str, d);
            return true;
        } catch (JSONException unused) {
            C0269v.C0270a a = new C0269v.C0270a().mo707a("JSON error in ADCJSON putDouble(): ");
            C0269v.C0270a a2 = a.mo707a(" with key: " + str);
            a2.mo707a(" and value: " + d).mo709a(C0269v.f1300j);
            return false;
        }
    }

    /* renamed from: a */
    static boolean m797a(JSONObject jSONObject, String str, long j) {
        try {
            jSONObject.put(str, j);
            return true;
        } catch (JSONException e) {
            C0269v.C0270a a = new C0269v.C0270a().mo707a("JSON error in ADCJSON putLong(): ").mo707a(e.toString());
            C0269v.C0270a a2 = a.mo707a(" with key: " + str);
            a2.mo707a(" and value: " + j).mo709a(C0269v.f1300j);
            return false;
        }
    }

    /* renamed from: a */
    static boolean m798a(JSONObject jSONObject, String str, String str2) {
        try {
            jSONObject.put(str, str2);
            return true;
        } catch (JSONException e) {
            C0269v.C0270a a = new C0269v.C0270a().mo707a("JSON error in ADCJSON putString(): ").mo707a(e.toString());
            C0269v.C0270a a2 = a.mo707a(" with key: " + str);
            a2.mo707a(" and value: " + str2).mo709a(C0269v.f1300j);
            return false;
        }
    }

    /* renamed from: a */
    static boolean m799a(JSONObject jSONObject, String str, JSONArray jSONArray) {
        try {
            jSONObject.put(str, jSONArray);
            return true;
        } catch (JSONException e) {
            C0269v.C0270a a = new C0269v.C0270a().mo707a("JSON error in ADCJSON putArray(): ").mo707a(e.toString());
            C0269v.C0270a a2 = a.mo707a(" with key: " + str);
            a2.mo707a(" and value: " + jSONArray).mo709a(C0269v.f1300j);
            return false;
        }
    }

    /* renamed from: a */
    static boolean m800a(JSONObject jSONObject, String str, JSONObject jSONObject2) {
        try {
            jSONObject.put(str, jSONObject2);
            return true;
        } catch (JSONException e) {
            C0269v.C0270a a = new C0269v.C0270a().mo707a("JSON error in ADCJSON putObject(): ").mo707a(e.toString());
            C0269v.C0270a a2 = a.mo707a(" with key: " + str);
            a2.mo707a(" and value: " + jSONObject2).mo709a(C0269v.f1300j);
            return false;
        }
    }

    /* renamed from: a */
    static boolean m801a(JSONObject jSONObject, String str, boolean z) {
        return jSONObject.optBoolean(str, z);
    }

    /* renamed from: a */
    static String[] m802a(JSONArray jSONArray) {
        String[] strArr = new String[jSONArray.length()];
        for (int i = 0; i < jSONArray.length(); i++) {
            strArr[i] = m813d(jSONArray, i);
        }
        return strArr;
    }

    /* renamed from: b */
    static Object m803b(JSONArray jSONArray, int i) {
        Object opt = jSONArray.opt(i);
        return opt == null ? Boolean.FALSE : opt;
    }

    /* renamed from: b */
    static Object m804b(JSONObject jSONObject, String str) {
        Object opt = jSONObject.opt(str);
        return opt == null ? Boolean.FALSE : opt;
    }

    /* renamed from: b */
    static JSONObject m805b() {
        return new JSONObject();
    }

    /* renamed from: b */
    static JSONObject m806b(String str) {
        return m789a(str, (String) null);
    }

    /* renamed from: b */
    static void m807b(JSONArray jSONArray, String str) {
        jSONArray.put(str);
    }

    /* renamed from: b */
    static boolean m808b(JSONObject jSONObject, String str, int i) {
        try {
            jSONObject.put(str, i);
            return true;
        } catch (JSONException e) {
            C0269v.C0270a a = new C0269v.C0270a().mo707a("JSON error in ADCJSON putInteger(): ").mo707a(e.toString());
            C0269v.C0270a a2 = a.mo707a(" with key: " + str);
            a2.mo707a(" and value: " + i).mo709a(C0269v.f1300j);
            return false;
        }
    }

    /* renamed from: b */
    static boolean m809b(JSONObject jSONObject, String str, boolean z) {
        try {
            jSONObject.put(str, z);
            return true;
        } catch (JSONException e) {
            C0269v.C0270a a = new C0269v.C0270a().mo707a("JSON error in ADCJSON putBoolean(): ").mo707a(e.toString());
            C0269v.C0270a a2 = a.mo707a(" with key: " + str);
            a2.mo707a(" and value: " + z).mo709a(C0269v.f1300j);
            return false;
        }
    }

    /* renamed from: c */
    static JSONArray m810c(JSONObject jSONObject, String str) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        return optJSONArray == null ? new JSONArray() : optJSONArray;
    }

    /* renamed from: c */
    static JSONObject m811c(String str) {
        try {
            String sb = C0026a.m80c().mo448k().mo683a(str, false).toString();
            return m789a(sb, "loadObject from filepath " + str);
        } catch (IOException e) {
            new C0269v.C0270a().mo707a("IOException in ADCJSON's loadObject: ").mo707a(e.toString()).mo709a(C0269v.f1300j);
            return m805b();
        }
    }

    /* renamed from: c */
    static JSONObject m812c(JSONArray jSONArray, int i) {
        JSONObject optJSONObject = jSONArray.optJSONObject(i);
        return optJSONObject == null ? new JSONObject() : optJSONObject;
    }

    /* renamed from: d */
    static String m813d(JSONArray jSONArray, int i) {
        return jSONArray.optString(i);
    }

    /* renamed from: d */
    static boolean m814d(JSONObject jSONObject, String str) {
        return jSONObject.optBoolean(str);
    }

    /* renamed from: e */
    static double m815e(JSONObject jSONObject, String str) {
        return jSONObject.optDouble(str, 0.0d);
    }

    /* renamed from: e */
    static void m816e(JSONArray jSONArray, int i) {
        jSONArray.put(i);
    }

    /* renamed from: f */
    static int m817f(JSONObject jSONObject, String str) {
        return jSONObject.optInt(str);
    }

    /* renamed from: g */
    static JSONObject m818g(JSONObject jSONObject, String str) {
        JSONObject optJSONObject = jSONObject.optJSONObject(str);
        return optJSONObject == null ? new JSONObject() : optJSONObject;
    }

    /* renamed from: h */
    static String m819h(JSONObject jSONObject, String str) {
        return jSONObject.optString(str);
    }

    /* renamed from: i */
    static boolean m820i(JSONObject jSONObject, String str) {
        try {
            C0026a.m80c().mo448k().mo684a(str, jSONObject.toString(), false);
            return true;
        } catch (IOException e) {
            new C0269v.C0270a().mo707a("IOException in ADCJSON's saveObject: ").mo707a(e.toString()).mo709a(C0269v.f1300j);
            return false;
        }
    }
}
