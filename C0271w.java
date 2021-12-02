package com.adcolony.sdk;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: com.adcolony.sdk.w */
class C0271w {

    /* renamed from: e */
    static final SimpleDateFormat f1304e = new SimpleDateFormat("yyyyMMdd'T'HHmmss.SSSZ", Locale.US);

    /* renamed from: f */
    static final String f1305f = "message";

    /* renamed from: g */
    static final String f1306g = "timestamp";
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Date f1307a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public int f1308b;

    /* renamed from: c */
    protected String f1309c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C0266s f1310d;

    /* renamed from: com.adcolony.sdk.w$a */
    static class C0272a {

        /* renamed from: a */
        protected C0271w f1311a = new C0271w();

        C0272a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C0272a mo718a(int i) {
            int unused = this.f1311a.f1308b = i;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C0272a mo719a(C0266s sVar) {
            C0266s unused = this.f1311a.f1310d = sVar;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C0272a mo720a(String str) {
            this.f1311a.f1309c = str;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C0272a mo682a(Date date) {
            Date unused = this.f1311a.f1307a = date;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C0271w mo721a() {
            if (this.f1311a.f1307a == null) {
                Date unused = this.f1311a.f1307a = new Date(System.currentTimeMillis());
            }
            return this.f1311a;
        }
    }

    C0271w() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0266s mo710a() {
        return this.f1310d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo711a(int i) {
        this.f1308b = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo712a(C0266s sVar) {
        this.f1310d = sVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo713b() {
        return this.f1308b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public String mo714c() {
        switch (this.f1308b) {
            case -1:
                return "Fatal";
            case 0:
                return "Error";
            case 1:
                return "Warn";
            case 2:
                return "Info";
            case 3:
                return "Debug";
            default:
                return "UNKNOWN LOG LEVEL";
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public String mo715d() {
        return this.f1309c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public String mo716e() {
        return f1304e.format(this.f1307a);
    }

    public String toString() {
        return mo716e() + " " + mo714c() + "/" + mo710a().mo698a() + ": " + mo715d();
    }
}
