package com.adcolony.sdk;

import android.content.Context;
import android.os.StatFs;
import com.adcolony.sdk.C0269v;
import java.io.File;

/* renamed from: com.adcolony.sdk.h0 */
class C0121h0 {

    /* renamed from: a */
    private String f862a;

    /* renamed from: b */
    private String f863b;

    /* renamed from: c */
    private String f864c;

    /* renamed from: d */
    private String f865d;

    /* renamed from: e */
    private File f866e;

    /* renamed from: f */
    private File f867f;

    /* renamed from: g */
    private File f868g;

    C0121h0() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public double mo410a(String str) {
        try {
            StatFs statFs = new StatFs(str);
            return (double) (((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize()));
        } catch (RuntimeException unused) {
            return 0.0d;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo411a() {
        return this.f862a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public String mo412b() {
        return this.f864c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public String mo413c() {
        return this.f863b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public String mo414d() {
        return this.f865d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo415e() {
        C0122i c = C0026a.m80c();
        this.f862a = mo416f() + "/adc3/";
        this.f863b = this.f862a + "media/";
        File file = new File(this.f863b);
        this.f866e = file;
        if (!file.isDirectory()) {
            this.f866e.delete();
            this.f866e.mkdirs();
        }
        if (!this.f866e.isDirectory()) {
            c.mo435b(true);
            return false;
        } else if (mo410a(this.f863b) < 2.097152E7d) {
            new C0269v.C0270a().mo707a("Not enough memory available at media path, disabling AdColony.").mo709a(C0269v.f1297g);
            c.mo435b(true);
            return false;
        } else {
            this.f864c = mo416f() + "/adc3/data/";
            File file2 = new File(this.f864c);
            this.f867f = file2;
            if (!file2.isDirectory()) {
                this.f867f.delete();
            }
            this.f867f.mkdirs();
            this.f865d = this.f862a + "tmp/";
            File file3 = new File(this.f865d);
            this.f868g = file3;
            if (!file3.isDirectory()) {
                this.f868g.delete();
                this.f868g.mkdirs();
            }
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public String mo416f() {
        Context b = C0026a.m78b();
        return b == null ? "" : b.getFilesDir().getAbsolutePath();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo417g() {
        File file = this.f866e;
        if (file == null || this.f867f == null || this.f868g == null) {
            return false;
        }
        if (!file.isDirectory()) {
            this.f866e.delete();
        }
        if (!this.f867f.isDirectory()) {
            this.f867f.delete();
        }
        if (!this.f868g.isDirectory()) {
            this.f868g.delete();
        }
        this.f866e.mkdirs();
        this.f867f.mkdirs();
        this.f868g.mkdirs();
        return true;
    }
}
