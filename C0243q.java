package com.adcolony.sdk;

import com.adcolony.sdk.C0269v;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.zip.GZIPInputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.adcolony.sdk.q */
class C0243q {

    /* renamed from: a */
    private LinkedList<Runnable> f1244a = new LinkedList<>();

    /* renamed from: b */
    private boolean f1245b;

    /* renamed from: com.adcolony.sdk.q$a */
    class C0244a implements C0028a0 {

        /* renamed from: com.adcolony.sdk.q$a$a */
        class C0245a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C0284y f1247a;

            C0245a(C0284y yVar) {
                this.f1247a = yVar;
            }

            public void run() {
                boolean unused = C0243q.this.m752g(this.f1247a);
                C0243q.this.m732a();
            }
        }

        C0244a() {
        }

        /* renamed from: a */
        public void mo278a(C0284y yVar) {
            C0243q.this.m735a((Runnable) new C0245a(yVar));
        }
    }

    /* renamed from: com.adcolony.sdk.q$b */
    class C0246b implements C0028a0 {

        /* renamed from: com.adcolony.sdk.q$b$a */
        class C0247a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C0284y f1250a;

            C0247a(C0284y yVar) {
                this.f1250a = yVar;
            }

            public void run() {
                boolean unused = C0243q.this.m739a(this.f1250a, new File(C0267t.m819h(this.f1250a.mo736b(), "filepath")));
                C0243q.this.m732a();
            }
        }

        C0246b() {
        }

        /* renamed from: a */
        public void mo278a(C0284y yVar) {
            C0243q.this.m735a((Runnable) new C0247a(yVar));
        }
    }

    /* renamed from: com.adcolony.sdk.q$c */
    class C0248c implements C0028a0 {

        /* renamed from: com.adcolony.sdk.q$c$a */
        class C0249a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C0284y f1253a;

            C0249a(C0284y yVar) {
                this.f1253a = yVar;
            }

            public void run() {
                boolean unused = C0243q.this.m746d(this.f1253a);
                C0243q.this.m732a();
            }
        }

        C0248c() {
        }

        /* renamed from: a */
        public void mo278a(C0284y yVar) {
            C0243q.this.m735a((Runnable) new C0249a(yVar));
        }
    }

    /* renamed from: com.adcolony.sdk.q$d */
    class C0250d implements C0028a0 {

        /* renamed from: com.adcolony.sdk.q$d$a */
        class C0251a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C0284y f1256a;

            C0251a(C0284y yVar) {
                this.f1256a = yVar;
            }

            public void run() {
                String unused = C0243q.this.m747e(this.f1256a);
                C0243q.this.m732a();
            }
        }

        C0250d() {
        }

        /* renamed from: a */
        public void mo278a(C0284y yVar) {
            C0243q.this.m735a((Runnable) new C0251a(yVar));
        }
    }

    /* renamed from: com.adcolony.sdk.q$e */
    class C0252e implements C0028a0 {

        /* renamed from: com.adcolony.sdk.q$e$a */
        class C0253a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C0284y f1259a;

            C0253a(C0284y yVar) {
                this.f1259a = yVar;
            }

            public void run() {
                boolean unused = C0243q.this.m750f(this.f1259a);
                C0243q.this.m732a();
            }
        }

        C0252e() {
        }

        /* renamed from: a */
        public void mo278a(C0284y yVar) {
            C0243q.this.m735a((Runnable) new C0253a(yVar));
        }
    }

    /* renamed from: com.adcolony.sdk.q$f */
    class C0254f implements C0028a0 {

        /* renamed from: com.adcolony.sdk.q$f$a */
        class C0255a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C0284y f1262a;

            C0255a(C0284y yVar) {
                this.f1262a = yVar;
            }

            public void run() {
                boolean unused = C0243q.this.m742b(this.f1262a);
                C0243q.this.m732a();
            }
        }

        C0254f() {
        }

        /* renamed from: a */
        public void mo278a(C0284y yVar) {
            C0243q.this.m735a((Runnable) new C0255a(yVar));
        }
    }

    /* renamed from: com.adcolony.sdk.q$g */
    class C0256g implements C0028a0 {

        /* renamed from: com.adcolony.sdk.q$g$a */
        class C0257a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C0284y f1265a;

            C0257a(C0284y yVar) {
                this.f1265a = yVar;
            }

            public void run() {
                boolean unused = C0243q.this.m744c(this.f1265a);
                C0243q.this.m732a();
            }
        }

        C0256g() {
        }

        /* renamed from: a */
        public void mo278a(C0284y yVar) {
            C0243q.this.m735a((Runnable) new C0257a(yVar));
        }
    }

    /* renamed from: com.adcolony.sdk.q$h */
    class C0258h implements C0028a0 {

        /* renamed from: com.adcolony.sdk.q$h$a */
        class C0259a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C0284y f1268a;

            C0259a(C0284y yVar) {
                this.f1268a = yVar;
            }

            public void run() {
                boolean unused = C0243q.this.m754h(this.f1268a);
                C0243q.this.m732a();
            }
        }

        C0258h() {
        }

        /* renamed from: a */
        public void mo278a(C0284y yVar) {
            C0243q.this.m735a((Runnable) new C0259a(yVar));
        }
    }

    /* renamed from: com.adcolony.sdk.q$i */
    class C0260i implements C0028a0 {

        /* renamed from: com.adcolony.sdk.q$i$a */
        class C0261a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C0284y f1271a;

            C0261a(C0284y yVar) {
                this.f1271a = yVar;
            }

            public void run() {
                boolean unused = C0243q.this.m738a(this.f1271a);
                C0243q.this.m732a();
            }
        }

        C0260i() {
        }

        /* renamed from: a */
        public void mo278a(C0284y yVar) {
            C0243q.this.m735a((Runnable) new C0261a(yVar));
        }
    }

    C0243q() {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m732a() {
        this.f1245b = false;
        if (!this.f1244a.isEmpty()) {
            this.f1245b = true;
            this.f1244a.removeLast().run();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m735a(Runnable runnable) {
        if (!this.f1244a.isEmpty() || this.f1245b) {
            this.f1244a.push(runnable);
            return;
        }
        this.f1245b = true;
        runnable.run();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m738a(C0284y yVar) {
        String h = C0267t.m819h(yVar.mo736b(), "filepath");
        C0026a.m80c().mo459v().mo417g();
        JSONObject b = C0267t.m805b();
        try {
            if (new File(h).mkdir()) {
                C0267t.m809b(b, "success", true);
                yVar.mo735a(b).mo740d();
                return true;
            }
            C0267t.m809b(b, "success", false);
            return false;
        } catch (Exception unused) {
            C0267t.m809b(b, "success", false);
            yVar.mo735a(b).mo740d();
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m739a(C0284y yVar, File file) {
        C0026a.m80c().mo459v().mo417g();
        JSONObject b = C0267t.m805b();
        if (mo685a(file)) {
            C0267t.m809b(b, "success", true);
            yVar.mo735a(b).mo740d();
            return true;
        }
        C0267t.m809b(b, "success", false);
        yVar.mo735a(b).mo740d();
        return false;
    }

    /* renamed from: a */
    private boolean m740a(String str) {
        return new File(str).exists();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public boolean m742b(C0284y yVar) {
        String h = C0267t.m819h(yVar.mo736b(), "filepath");
        C0026a.m80c().mo459v().mo417g();
        JSONObject b = C0267t.m805b();
        try {
            boolean a = m740a(h);
            C0267t.m809b(b, "result", a);
            C0267t.m809b(b, "success", true);
            yVar.mo735a(b).mo740d();
            return a;
        } catch (Exception e) {
            C0267t.m809b(b, "result", false);
            C0267t.m809b(b, "success", false);
            yVar.mo735a(b).mo740d();
            e.printStackTrace();
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public boolean m744c(C0284y yVar) {
        JSONObject b = yVar.mo736b();
        String h = C0267t.m819h(b, "filepath");
        C0026a.m80c().mo459v().mo417g();
        JSONObject b2 = C0267t.m805b();
        try {
            int f = C0267t.m817f(b, "offset");
            int f2 = C0267t.m817f(b, "size");
            boolean d = C0267t.m814d(b, "gunzip");
            String h2 = C0267t.m819h(b, "output_filepath");
            C0145i0 i0Var = new C0145i0(new FileInputStream(h), f, f2);
            InputStream gZIPInputStream = d ? new GZIPInputStream(i0Var, 1024) : i0Var;
            if (h2.equals("")) {
                StringBuilder sb = new StringBuilder(gZIPInputStream.available());
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = gZIPInputStream.read(bArr, 0, 1024);
                    if (read < 0) {
                        break;
                    }
                    sb.append(new String(bArr, 0, read, "ISO-8859-1"));
                }
                C0267t.m808b(b2, "size", sb.length());
                C0267t.m798a(b2, "data", sb.toString());
            } else {
                FileOutputStream fileOutputStream = new FileOutputStream(h2);
                byte[] bArr2 = new byte[1024];
                int i = 0;
                while (true) {
                    int read2 = gZIPInputStream.read(bArr2, 0, 1024);
                    if (read2 < 0) {
                        break;
                    }
                    fileOutputStream.write(bArr2, 0, read2);
                    i += read2;
                }
                fileOutputStream.close();
                C0267t.m808b(b2, "size", i);
            }
            gZIPInputStream.close();
            C0267t.m809b(b2, "success", true);
            yVar.mo735a(b2).mo740d();
            return true;
        } catch (IOException unused) {
            C0267t.m809b(b2, "success", false);
            yVar.mo735a(b2).mo740d();
            return false;
        } catch (OutOfMemoryError unused2) {
            new C0269v.C0270a().mo707a("Out of memory error - disabling AdColony.").mo709a(C0269v.f1299i);
            C0026a.m80c().mo435b(true);
            C0267t.m809b(b2, "success", false);
            yVar.mo735a(b2).mo740d();
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public boolean m746d(C0284y yVar) {
        String h = C0267t.m819h(yVar.mo736b(), "filepath");
        C0026a.m80c().mo459v().mo417g();
        JSONObject b = C0267t.m805b();
        String[] list = new File(h).list();
        if (list != null) {
            JSONArray a = C0267t.m785a();
            for (String str : list) {
                JSONObject b2 = C0267t.m805b();
                C0267t.m798a(b2, "filename", str);
                if (new File(h + str).isDirectory()) {
                    C0267t.m809b(b2, "is_folder", true);
                } else {
                    C0267t.m809b(b2, "is_folder", false);
                }
                C0267t.m792a(a, (Object) b2);
            }
            C0267t.m809b(b, "success", true);
            C0267t.m799a(b, "entries", a);
            yVar.mo735a(b).mo740d();
            return true;
        }
        C0267t.m809b(b, "success", false);
        yVar.mo735a(b).mo740d();
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public String m747e(C0284y yVar) {
        JSONObject b = yVar.mo736b();
        String h = C0267t.m819h(b, "filepath");
        String h2 = C0267t.m819h(b, "encoding");
        boolean z = h2 != null && h2.equals("utf8");
        C0026a.m80c().mo459v().mo417g();
        JSONObject b2 = C0267t.m805b();
        try {
            StringBuilder a = mo683a(h, z);
            C0267t.m809b(b2, "success", true);
            C0267t.m798a(b2, "data", a.toString());
            yVar.mo735a(b2).mo740d();
            return a.toString();
        } catch (IOException unused) {
            C0267t.m809b(b2, "success", false);
            yVar.mo735a(b2).mo740d();
            return "";
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public boolean m750f(C0284y yVar) {
        JSONObject b = yVar.mo736b();
        String h = C0267t.m819h(b, "filepath");
        String h2 = C0267t.m819h(b, "new_filepath");
        C0026a.m80c().mo459v().mo417g();
        JSONObject b2 = C0267t.m805b();
        try {
            if (new File(h).renameTo(new File(h2))) {
                C0267t.m809b(b2, "success", true);
                yVar.mo735a(b2).mo740d();
                return true;
            }
            C0267t.m809b(b2, "success", false);
            yVar.mo735a(b2).mo740d();
            return false;
        } catch (Exception unused) {
            C0267t.m809b(b2, "success", false);
            yVar.mo735a(b2).mo740d();
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public boolean m752g(C0284y yVar) {
        JSONObject b = yVar.mo736b();
        String h = C0267t.m819h(b, "filepath");
        String h2 = C0267t.m819h(b, "data");
        boolean equals = C0267t.m819h(b, "encoding").equals("utf8");
        C0026a.m80c().mo459v().mo417g();
        JSONObject b2 = C0267t.m805b();
        try {
            mo684a(h, h2, equals);
            C0267t.m809b(b2, "success", true);
            yVar.mo735a(b2).mo740d();
            return true;
        } catch (IOException unused) {
            C0267t.m809b(b2, "success", false);
            yVar.mo735a(b2).mo740d();
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00ef, code lost:
        new com.adcolony.sdk.C0269v.C0270a().mo707a("Out of memory error - disabling AdColony.").mo709a(com.adcolony.sdk.C0269v.f1299i);
        com.adcolony.sdk.C0026a.m80c().mo435b(true);
        com.adcolony.sdk.C0267t.m809b(r4, "success", false);
        r0.mo735a(r4).mo740d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0114, code lost:
        return false;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[ExcHandler: OutOfMemoryError (unused java.lang.OutOfMemoryError), SYNTHETIC, Splitter:B:1:0x0027] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean m754h(com.adcolony.sdk.C0284y r19) {
        /*
            r18 = this;
            r0 = r19
            org.json.JSONObject r1 = r19.mo736b()
            java.lang.String r2 = "filepath"
            java.lang.String r2 = com.adcolony.sdk.C0267t.m819h(r1, r2)
            java.lang.String r3 = "bundle_path"
            java.lang.String r3 = com.adcolony.sdk.C0267t.m819h(r1, r3)
            java.lang.String r4 = "bundle_filenames"
            org.json.JSONArray r1 = com.adcolony.sdk.C0267t.m810c((org.json.JSONObject) r1, (java.lang.String) r4)
            com.adcolony.sdk.i r4 = com.adcolony.sdk.C0026a.m80c()
            com.adcolony.sdk.h0 r4 = r4.mo459v()
            r4.mo417g()
            org.json.JSONObject r4 = com.adcolony.sdk.C0267t.m805b()
            java.io.File r7 = new java.io.File     // Catch:{ IOException -> 0x0115, OutOfMemoryError -> 0x00ef }
            r7.<init>(r3)     // Catch:{ IOException -> 0x0115, OutOfMemoryError -> 0x00ef }
            java.io.RandomAccessFile r8 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x0115, OutOfMemoryError -> 0x00ef }
            java.lang.String r9 = "r"
            r8.<init>(r7, r9)     // Catch:{ IOException -> 0x0115, OutOfMemoryError -> 0x00ef }
            r9 = 32
            byte[] r9 = new byte[r9]     // Catch:{ IOException -> 0x0115, OutOfMemoryError -> 0x00ef }
            r8.readInt()     // Catch:{ IOException -> 0x0115, OutOfMemoryError -> 0x00ef }
            int r10 = r8.readInt()     // Catch:{ IOException -> 0x0115, OutOfMemoryError -> 0x00ef }
            org.json.JSONArray r11 = new org.json.JSONArray     // Catch:{ IOException -> 0x0115, OutOfMemoryError -> 0x00ef }
            r11.<init>()     // Catch:{ IOException -> 0x0115, OutOfMemoryError -> 0x00ef }
            r12 = 1024(0x400, float:1.435E-42)
            byte[] r13 = new byte[r12]     // Catch:{ IOException -> 0x0115, OutOfMemoryError -> 0x00ef }
            r14 = 0
        L_0x0048:
            if (r14 >= r10) goto L_0x00d5
            int r15 = r14 * 44
            int r15 = r15 + 8
            long r5 = (long) r15     // Catch:{ IOException -> 0x0115, OutOfMemoryError -> 0x00ef }
            r8.seek(r5)     // Catch:{ IOException -> 0x0115, OutOfMemoryError -> 0x00ef }
            r8.read(r9)     // Catch:{ IOException -> 0x0115, OutOfMemoryError -> 0x00ef }
            r8.readInt()     // Catch:{ IOException -> 0x0115, OutOfMemoryError -> 0x00ef }
            int r5 = r8.readInt()     // Catch:{ IOException -> 0x0115, OutOfMemoryError -> 0x00ef }
            int r6 = r8.readInt()     // Catch:{ IOException -> 0x0115, OutOfMemoryError -> 0x00ef }
            r11.put(r6)     // Catch:{ IOException -> 0x0115, OutOfMemoryError -> 0x00ef }
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x00a9 }
            r15.<init>()     // Catch:{ JSONException -> 0x00a9 }
            r15.append(r2)     // Catch:{ JSONException -> 0x00a9 }
            java.lang.Object r12 = r1.get(r14)     // Catch:{ JSONException -> 0x00a9 }
            r15.append(r12)     // Catch:{ JSONException -> 0x00a9 }
            java.lang.String r12 = r15.toString()     // Catch:{ JSONException -> 0x00a9 }
            r17 = r1
            r16 = r2
            long r1 = (long) r5
            r8.seek(r1)     // Catch:{ IOException -> 0x0115, OutOfMemoryError -> 0x00ef }
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0115, OutOfMemoryError -> 0x00ef }
            r1.<init>(r12)     // Catch:{ IOException -> 0x0115, OutOfMemoryError -> 0x00ef }
            int r2 = r6 / 1024
            int r6 = r6 % 1024
            r5 = 0
        L_0x0088:
            if (r5 >= r2) goto L_0x0096
            r12 = 1024(0x400, float:1.435E-42)
            r15 = 0
            r8.read(r13, r15, r12)     // Catch:{ IOException -> 0x0115, OutOfMemoryError -> 0x00ef }
            r1.write(r13, r15, r12)     // Catch:{ IOException -> 0x0115, OutOfMemoryError -> 0x00ef }
            int r5 = r5 + 1
            goto L_0x0088
        L_0x0096:
            r12 = 1024(0x400, float:1.435E-42)
            r15 = 0
            r8.read(r13, r15, r6)     // Catch:{ IOException -> 0x0115, OutOfMemoryError -> 0x00ef }
            r1.write(r13, r15, r6)     // Catch:{ IOException -> 0x0115, OutOfMemoryError -> 0x00ef }
            r1.close()     // Catch:{ IOException -> 0x0115, OutOfMemoryError -> 0x00ef }
            int r14 = r14 + 1
            r2 = r16
            r1 = r17
            goto L_0x0048
        L_0x00a9:
            com.adcolony.sdk.v$a r1 = new com.adcolony.sdk.v$a     // Catch:{ IOException -> 0x0115, OutOfMemoryError -> 0x00ef }
            r1.<init>()     // Catch:{ IOException -> 0x0115, OutOfMemoryError -> 0x00ef }
            java.lang.String r2 = "Couldn't extract file name at index "
            com.adcolony.sdk.v$a r1 = r1.mo707a((java.lang.String) r2)     // Catch:{ IOException -> 0x0115, OutOfMemoryError -> 0x00ef }
            com.adcolony.sdk.v$a r1 = r1.mo705a((int) r14)     // Catch:{ IOException -> 0x0115, OutOfMemoryError -> 0x00ef }
            java.lang.String r2 = " unpacking ad unit bundle at "
            com.adcolony.sdk.v$a r1 = r1.mo707a((java.lang.String) r2)     // Catch:{ IOException -> 0x0115, OutOfMemoryError -> 0x00ef }
            com.adcolony.sdk.v$a r1 = r1.mo707a((java.lang.String) r3)     // Catch:{ IOException -> 0x0115, OutOfMemoryError -> 0x00ef }
            com.adcolony.sdk.v r2 = com.adcolony.sdk.C0269v.f1299i     // Catch:{ IOException -> 0x0115, OutOfMemoryError -> 0x00ef }
            r1.mo709a((com.adcolony.sdk.C0269v) r2)     // Catch:{ IOException -> 0x0115, OutOfMemoryError -> 0x00ef }
            java.lang.String r1 = "success"
            r2 = 0
            com.adcolony.sdk.C0267t.m809b((org.json.JSONObject) r4, (java.lang.String) r1, (boolean) r2)     // Catch:{ IOException -> 0x0116, OutOfMemoryError -> 0x00ef }
            com.adcolony.sdk.y r1 = r0.mo735a((org.json.JSONObject) r4)     // Catch:{ IOException -> 0x0116, OutOfMemoryError -> 0x00ef }
            r1.mo740d()     // Catch:{ IOException -> 0x0116, OutOfMemoryError -> 0x00ef }
            return r2
        L_0x00d5:
            r8.close()     // Catch:{ IOException -> 0x0115, OutOfMemoryError -> 0x00ef }
            r7.delete()     // Catch:{ IOException -> 0x0115, OutOfMemoryError -> 0x00ef }
            java.lang.String r1 = "success"
            r2 = 1
            com.adcolony.sdk.C0267t.m809b((org.json.JSONObject) r4, (java.lang.String) r1, (boolean) r2)     // Catch:{ IOException -> 0x0115, OutOfMemoryError -> 0x00ef }
            java.lang.String r1 = "file_sizes"
            com.adcolony.sdk.C0267t.m799a((org.json.JSONObject) r4, (java.lang.String) r1, (org.json.JSONArray) r11)     // Catch:{ IOException -> 0x0115, OutOfMemoryError -> 0x00ef }
            com.adcolony.sdk.y r1 = r0.mo735a((org.json.JSONObject) r4)     // Catch:{ IOException -> 0x0115, OutOfMemoryError -> 0x00ef }
            r1.mo740d()     // Catch:{ IOException -> 0x0115, OutOfMemoryError -> 0x00ef }
            r1 = 1
            return r1
        L_0x00ef:
            com.adcolony.sdk.v$a r1 = new com.adcolony.sdk.v$a
            r1.<init>()
            java.lang.String r2 = "Out of memory error - disabling AdColony."
            com.adcolony.sdk.v$a r1 = r1.mo707a((java.lang.String) r2)
            com.adcolony.sdk.v r2 = com.adcolony.sdk.C0269v.f1299i
            r1.mo709a((com.adcolony.sdk.C0269v) r2)
            com.adcolony.sdk.i r1 = com.adcolony.sdk.C0026a.m80c()
            r2 = 1
            r1.mo435b((boolean) r2)
            java.lang.String r1 = "success"
            r2 = 0
            com.adcolony.sdk.C0267t.m809b((org.json.JSONObject) r4, (java.lang.String) r1, (boolean) r2)
            com.adcolony.sdk.y r0 = r0.mo735a((org.json.JSONObject) r4)
            r0.mo740d()
            return r2
        L_0x0115:
            r2 = 0
        L_0x0116:
            com.adcolony.sdk.v$a r1 = new com.adcolony.sdk.v$a
            r1.<init>()
            java.lang.String r5 = "Failed to find or open ad unit bundle at path: "
            com.adcolony.sdk.v$a r1 = r1.mo707a((java.lang.String) r5)
            com.adcolony.sdk.v$a r1 = r1.mo707a((java.lang.String) r3)
            com.adcolony.sdk.v r3 = com.adcolony.sdk.C0269v.f1300j
            r1.mo709a((com.adcolony.sdk.C0269v) r3)
            java.lang.String r1 = "success"
            com.adcolony.sdk.C0267t.m809b((org.json.JSONObject) r4, (java.lang.String) r1, (boolean) r2)
            com.adcolony.sdk.y r0 = r0.mo735a((org.json.JSONObject) r4)
            r0.mo740d()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.C0243q.m754h(com.adcolony.sdk.y):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public StringBuilder mo683a(String str, boolean z) throws IOException {
        File file = new File(str);
        StringBuilder sb = new StringBuilder((int) file.length());
        BufferedReader bufferedReader = z ? new BufferedReader(new InputStreamReader(new FileInputStream(file.getAbsolutePath()), "UTF-8")) : new BufferedReader(new InputStreamReader(new FileInputStream(file.getAbsolutePath())));
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                sb.append(readLine);
                sb.append("\n");
            } else {
                bufferedReader.close();
                return sb;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo684a(String str, String str2, boolean z) throws IOException {
        BufferedWriter bufferedWriter = z ? new BufferedWriter(new OutputStreamWriter(new FileOutputStream(str), "UTF-8")) : new BufferedWriter(new OutputStreamWriter(new FileOutputStream(str)));
        bufferedWriter.write(str2);
        bufferedWriter.flush();
        bufferedWriter.close();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo685a(File file) {
        try {
            if (!file.isDirectory()) {
                return file.delete();
            }
            if (file.list().length == 0) {
                return file.delete();
            }
            String[] list = file.list();
            if (list.length > 0) {
                return mo685a(new File(file, list[0]));
            }
            if (file.list().length == 0) {
                return file.delete();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo686b() {
        C0026a.m76a("FileSystem.save", (C0028a0) new C0244a());
        C0026a.m76a("FileSystem.delete", (C0028a0) new C0246b());
        C0026a.m76a("FileSystem.listing", (C0028a0) new C0248c());
        C0026a.m76a("FileSystem.load", (C0028a0) new C0250d());
        C0026a.m76a("FileSystem.rename", (C0028a0) new C0252e());
        C0026a.m76a("FileSystem.exists", (C0028a0) new C0254f());
        C0026a.m76a("FileSystem.extract", (C0028a0) new C0256g());
        C0026a.m76a("FileSystem.unpack_bundle", (C0028a0) new C0258h());
        C0026a.m76a("FileSystem.create_directory", (C0028a0) new C0260i());
    }
}
