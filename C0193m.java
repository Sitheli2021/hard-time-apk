package com.adcolony.sdk;

import android.content.Context;
import com.adcolony.sdk.C0269v;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.adcolony.sdk.m */
class C0193m implements Runnable {

    /* renamed from: a */
    private final int f1048a = 4096;

    /* renamed from: b */
    private final int f1049b = 299;

    /* renamed from: c */
    private final int f1050c = 60000;

    /* renamed from: d */
    private HttpURLConnection f1051d;

    /* renamed from: e */
    private InputStream f1052e;

    /* renamed from: f */
    private C0284y f1053f;

    /* renamed from: g */
    private C0194a f1054g;

    /* renamed from: h */
    private String f1055h;

    /* renamed from: i */
    private int f1056i = 0;

    /* renamed from: j */
    private boolean f1057j = false;

    /* renamed from: k */
    private Map<String, List<String>> f1058k;

    /* renamed from: l */
    private String f1059l = "";

    /* renamed from: m */
    private String f1060m = "";

    /* renamed from: n */
    String f1061n = "";

    /* renamed from: o */
    String f1062o = "";

    /* renamed from: p */
    boolean f1063p;

    /* renamed from: q */
    int f1064q;

    /* renamed from: r */
    int f1065r;

    /* renamed from: com.adcolony.sdk.m$a */
    interface C0194a {
        /* renamed from: a */
        void mo429a(C0193m mVar, C0284y yVar, Map<String, List<String>> map);
    }

    C0193m(C0284y yVar, C0194a aVar) {
        this.f1053f = yVar;
        this.f1054g = aVar;
    }

    /* renamed from: a */
    private void m538a(String str, String str2) {
        try {
            String substring = str2.substring(0, str2.lastIndexOf("/") + 1);
            if (!str2.equals("") && !substring.equals(C0026a.m80c().mo459v().mo414d()) && !new File(str).renameTo(new File(str2))) {
                new C0269v.C0270a().mo707a("Moving of ").mo707a(str).mo707a(" failed.").mo709a(C0269v.f1298h);
            }
        } catch (Exception e) {
            new C0269v.C0270a().mo707a("Exception: ").mo707a(e.toString()).mo709a(C0269v.f1299i);
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private boolean m539a() throws IOException {
        JSONObject b = this.f1053f.mo736b();
        String h = C0267t.m819h(b, "content_type");
        String h2 = C0267t.m819h(b, "content");
        int a = C0267t.m784a(b, "read_timeout", 60000);
        int a2 = C0267t.m784a(b, "connect_timeout", 60000);
        boolean d = C0267t.m814d(b, "no_redirect");
        this.f1061n = C0267t.m819h(b, "url");
        this.f1059l = C0267t.m819h(b, "filepath");
        StringBuilder sb = new StringBuilder();
        sb.append(C0026a.m80c().mo459v().mo414d());
        String str = this.f1059l;
        sb.append(str.substring(str.lastIndexOf("/") + 1));
        this.f1060m = sb.toString();
        this.f1055h = C0267t.m819h(b, "encoding");
        int a3 = C0267t.m784a(b, "max_size", 0);
        this.f1056i = a3;
        this.f1057j = a3 != 0;
        this.f1064q = 0;
        this.f1052e = null;
        this.f1051d = null;
        this.f1058k = null;
        if (!this.f1061n.startsWith("file://")) {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f1061n).openConnection();
            this.f1051d = httpURLConnection;
            httpURLConnection.setReadTimeout(a);
            this.f1051d.setConnectTimeout(a2);
            this.f1051d.setInstanceFollowRedirects(!d);
            this.f1051d.setRequestProperty("Accept-Charset", "UTF-8");
            String G = C0026a.m80c().mo445h().mo509G();
            if (G != null && !G.equals("")) {
                this.f1051d.setRequestProperty("User-Agent", G);
            }
            if (!h.equals("")) {
                this.f1051d.setRequestProperty("Content-Type", h);
            }
            if (this.f1053f.mo739c().equals("WebServices.post")) {
                this.f1051d.setDoOutput(true);
                this.f1051d.setFixedLengthStreamingMode(h2.getBytes("UTF-8").length);
                new PrintStream(this.f1051d.getOutputStream()).print(h2);
            }
        } else if (this.f1061n.startsWith("file:///android_asset/")) {
            Context b2 = C0026a.m78b();
            if (b2 != null) {
                this.f1052e = b2.getAssets().open(this.f1061n.substring(22));
            }
        } else {
            this.f1052e = new FileInputStream(this.f1061n.substring(7));
        }
        return (this.f1051d == null && this.f1052e == null) ? false : true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0059, code lost:
        r0 = "UTF-8";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r2 = r8.f1055h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005d, code lost:
        if (r2 == null) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0063, code lost:
        if (r2.isEmpty() != false) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0065, code lost:
        r0 = r8.f1055h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0069, code lost:
        if ((r10 instanceof java.io.ByteArrayOutputStream) == false) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006b, code lost:
        r8.f1062o = ((java.io.ByteArrayOutputStream) r10).toString(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0075, code lost:
        if (r10 == null) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0077, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007a, code lost:
        if (r9 == null) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007c, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007f, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0082, code lost:
        return true;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m540a(java.io.InputStream r9, java.io.OutputStream r10) throws java.lang.Exception {
        /*
            r8 = this;
            r0 = 0
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x0087, all -> 0x0085 }
            r1.<init>(r9)     // Catch:{ Exception -> 0x0087, all -> 0x0085 }
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r2 = new byte[r0]     // Catch:{ Exception -> 0x0083 }
        L_0x000a:
            r3 = 0
            int r4 = r1.read(r2, r3, r0)     // Catch:{ Exception -> 0x0083 }
            r5 = -1
            if (r4 == r5) goto L_0x0059
            int r5 = r8.f1064q     // Catch:{ Exception -> 0x0083 }
            int r5 = r5 + r4
            r8.f1064q = r5     // Catch:{ Exception -> 0x0083 }
            boolean r6 = r8.f1057j     // Catch:{ Exception -> 0x0083 }
            if (r6 == 0) goto L_0x0055
            int r6 = r8.f1056i     // Catch:{ Exception -> 0x0083 }
            if (r5 > r6) goto L_0x0020
            goto L_0x0055
        L_0x0020:
            java.lang.Exception r0 = new java.lang.Exception     // Catch:{ Exception -> 0x0083 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0083 }
            r2.<init>()     // Catch:{ Exception -> 0x0083 }
            java.lang.String r3 = "Data exceeds expected maximum ("
            r2.append(r3)     // Catch:{ Exception -> 0x0083 }
            int r3 = r8.f1064q     // Catch:{ Exception -> 0x0083 }
            r2.append(r3)     // Catch:{ Exception -> 0x0083 }
            java.lang.String r3 = "/"
            r2.append(r3)     // Catch:{ Exception -> 0x0083 }
            int r3 = r8.f1056i     // Catch:{ Exception -> 0x0083 }
            r2.append(r3)     // Catch:{ Exception -> 0x0083 }
            java.lang.String r3 = "): "
            r2.append(r3)     // Catch:{ Exception -> 0x0083 }
            java.net.HttpURLConnection r3 = r8.f1051d     // Catch:{ Exception -> 0x0083 }
            java.net.URL r3 = r3.getURL()     // Catch:{ Exception -> 0x0083 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0083 }
            r2.append(r3)     // Catch:{ Exception -> 0x0083 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0083 }
            r0.<init>(r2)     // Catch:{ Exception -> 0x0083 }
            throw r0     // Catch:{ Exception -> 0x0083 }
        L_0x0055:
            r10.write(r2, r3, r4)     // Catch:{ Exception -> 0x0083 }
            goto L_0x000a
        L_0x0059:
            java.lang.String r0 = "UTF-8"
            java.lang.String r2 = r8.f1055h     // Catch:{ Exception -> 0x0083 }
            if (r2 == 0) goto L_0x0067
            boolean r2 = r2.isEmpty()     // Catch:{ Exception -> 0x0083 }
            if (r2 != 0) goto L_0x0067
            java.lang.String r0 = r8.f1055h     // Catch:{ Exception -> 0x0083 }
        L_0x0067:
            boolean r2 = r10 instanceof java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x0083 }
            if (r2 == 0) goto L_0x0074
            r2 = r10
            java.io.ByteArrayOutputStream r2 = (java.io.ByteArrayOutputStream) r2     // Catch:{ Exception -> 0x0083 }
            java.lang.String r0 = r2.toString(r0)     // Catch:{ Exception -> 0x0083 }
            r8.f1062o = r0     // Catch:{ Exception -> 0x0083 }
        L_0x0074:
            r0 = 1
            if (r10 == 0) goto L_0x007a
            r10.close()
        L_0x007a:
            if (r9 == 0) goto L_0x007f
            r9.close()
        L_0x007f:
            r1.close()
            return r0
        L_0x0083:
            r0 = move-exception
            goto L_0x008b
        L_0x0085:
            r1 = move-exception
            goto L_0x0090
        L_0x0087:
            r1 = move-exception
            r7 = r1
            r1 = r0
            r0 = r7
        L_0x008b:
            throw r0     // Catch:{ all -> 0x008c }
        L_0x008c:
            r0 = move-exception
            r7 = r1
            r1 = r0
            r0 = r7
        L_0x0090:
            if (r10 == 0) goto L_0x0095
            r10.close()
        L_0x0095:
            if (r9 == 0) goto L_0x009a
            r9.close()
        L_0x009a:
            if (r0 == 0) goto L_0x009f
            r0.close()
        L_0x009f:
            throw r1
        L_0x00a0:
            goto L_0x00a0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.C0193m.m540a(java.io.InputStream, java.io.OutputStream):boolean");
    }

    /* renamed from: c */
    private boolean m541c() throws Exception {
        OutputStream outputStream;
        String c = this.f1053f.mo739c();
        if (this.f1052e != null) {
            outputStream = this.f1059l.length() == 0 ? new ByteArrayOutputStream(4096) : new FileOutputStream(new File(this.f1059l).getAbsolutePath());
        } else if (c.equals("WebServices.download")) {
            this.f1052e = this.f1051d.getInputStream();
            outputStream = new FileOutputStream(this.f1060m);
        } else if (c.equals("WebServices.get")) {
            this.f1052e = this.f1051d.getInputStream();
            outputStream = new ByteArrayOutputStream(4096);
        } else if (c.equals("WebServices.post")) {
            this.f1051d.connect();
            this.f1052e = (this.f1051d.getResponseCode() < 200 || this.f1051d.getResponseCode() > 299) ? this.f1051d.getErrorStream() : this.f1051d.getInputStream();
            outputStream = new ByteArrayOutputStream(4096);
        } else {
            outputStream = null;
        }
        HttpURLConnection httpURLConnection = this.f1051d;
        if (httpURLConnection != null) {
            this.f1065r = httpURLConnection.getResponseCode();
            this.f1058k = this.f1051d.getHeaderFields();
        }
        return m540a(this.f1052e, outputStream);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C0284y mo581b() {
        return this.f1053f;
    }

    public void run() {
        boolean z = false;
        this.f1063p = false;
        try {
            if (m539a()) {
                this.f1063p = m541c();
                if (this.f1053f.mo739c().equals("WebServices.post") && this.f1065r != 200) {
                    this.f1063p = false;
                }
            }
        } catch (MalformedURLException e) {
            new C0269v.C0270a().mo707a("MalformedURLException: ").mo707a(e.toString()).mo709a(C0269v.f1300j);
            this.f1063p = true;
        } catch (OutOfMemoryError unused) {
            C0269v.C0270a a = new C0269v.C0270a().mo707a("Out of memory error - disabling AdColony. (").mo705a(this.f1064q).mo707a("/").mo705a(this.f1056i);
            a.mo707a("): " + this.f1061n).mo709a(C0269v.f1299i);
            C0026a.m80c().mo435b(true);
        } catch (IOException e2) {
            new C0269v.C0270a().mo707a("Download of ").mo707a(this.f1061n).mo707a(" failed: ").mo707a(e2.toString()).mo709a(C0269v.f1298h);
            int i = this.f1065r;
            if (i == 0) {
                i = 504;
            }
            this.f1065r = i;
        } catch (IllegalStateException e3) {
            new C0269v.C0270a().mo707a("okhttp error: ").mo707a(e3.toString()).mo709a(C0269v.f1299i);
            e3.printStackTrace();
        } catch (Exception e4) {
            new C0269v.C0270a().mo707a("Exception: ").mo707a(e4.toString()).mo709a(C0269v.f1299i);
            e4.printStackTrace();
        }
        z = true;
        if (z) {
            if (this.f1053f.mo739c().equals("WebServices.download")) {
                m538a(this.f1060m, this.f1059l);
            }
            this.f1054g.mo429a(this, this.f1053f, this.f1058k);
        }
    }
}
