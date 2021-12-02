package com.adcolony.sdk;

/* renamed from: com.adcolony.sdk.v */
class C0269v {

    /* renamed from: c */
    static C0269v f1293c = new C0269v(3, false);

    /* renamed from: d */
    static C0269v f1294d = new C0269v(3, true);

    /* renamed from: e */
    static C0269v f1295e = new C0269v(2, false);

    /* renamed from: f */
    static C0269v f1296f = new C0269v(2, true);

    /* renamed from: g */
    static C0269v f1297g = new C0269v(1, false);

    /* renamed from: h */
    static C0269v f1298h = new C0269v(1, true);

    /* renamed from: i */
    static C0269v f1299i = new C0269v(0, false);

    /* renamed from: j */
    static C0269v f1300j = new C0269v(0, true);

    /* renamed from: a */
    private int f1301a;

    /* renamed from: b */
    private boolean f1302b;

    /* renamed from: com.adcolony.sdk.v$a */
    static class C0270a {

        /* renamed from: a */
        StringBuilder f1303a = new StringBuilder();

        C0270a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C0270a mo703a(char c) {
            if (c != 10) {
                this.f1303a.append(c);
            }
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C0270a mo704a(double d) {
            C0190l0.m507a(d, 2, this.f1303a);
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C0270a mo705a(int i) {
            this.f1303a.append(i);
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C0270a mo706a(Object obj) {
            if (obj != null) {
                this.f1303a.append(obj.toString());
            } else {
                this.f1303a.append("null");
            }
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C0270a mo707a(String str) {
            this.f1303a.append(str);
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C0270a mo708a(boolean z) {
            this.f1303a.append(z);
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo709a(C0269v vVar) {
            vVar.m823a(this.f1303a.toString());
        }
    }

    C0269v(int i, boolean z) {
        this.f1301a = i;
        this.f1302b = z;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m823a(String str) {
        C0026a.m80c().mo450m().mo724a(this.f1301a, str, this.f1302b);
    }
}
