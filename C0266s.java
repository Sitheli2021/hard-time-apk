package com.adcolony.sdk;

/* renamed from: com.adcolony.sdk.s */
class C0266s {

    /* renamed from: a */
    private String f1288a;

    /* renamed from: b */
    private String f1289b;

    /* renamed from: c */
    private String f1290c;

    /* renamed from: d */
    private String f1291d = "%s_%s_%s";

    public C0266s(String str, String str2, String str3) {
        this.f1288a = str;
        this.f1289b = str2;
        this.f1290c = str3;
    }

    /* renamed from: a */
    public String mo698a() {
        return this.f1290c;
    }

    /* renamed from: b */
    public String mo699b() {
        return String.format(this.f1291d, new Object[]{mo700c(), mo701d(), mo698a()});
    }

    /* renamed from: c */
    public String mo700c() {
        return this.f1288a;
    }

    /* renamed from: d */
    public String mo701d() {
        return this.f1289b;
    }
}
