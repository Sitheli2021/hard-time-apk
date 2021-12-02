package com.adcolony.sdk;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.preference.PreferenceManager;
import com.adcolony.sdk.C0269v;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.zip.CRC32;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.adcolony.sdk.l0 */
class C0190l0 {

    /* renamed from: a */
    static final int f1040a = 128;

    /* renamed from: b */
    static ExecutorService f1041b = Executors.newSingleThreadExecutor();

    /* renamed from: c */
    static Handler f1042c;

    /* renamed from: com.adcolony.sdk.l0$a */
    static class C0191a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f1043a;

        /* renamed from: b */
        final /* synthetic */ String f1044b;

        /* renamed from: c */
        final /* synthetic */ int f1045c;

        C0191a(Context context, String str, int i) {
            this.f1043a = context;
            this.f1044b = str;
            this.f1045c = i;
        }

        public void run() {
            Toast.makeText(this.f1043a, this.f1044b, this.f1045c).show();
        }
    }

    /* renamed from: com.adcolony.sdk.l0$b */
    static class C0192b {

        /* renamed from: a */
        double f1046a;

        /* renamed from: b */
        double f1047b = ((double) System.currentTimeMillis());

        C0192b(double d) {
            mo576a(d);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo576a(double d) {
            this.f1046a = d;
            double currentTimeMillis = (double) System.currentTimeMillis();
            Double.isNaN(currentTimeMillis);
            this.f1047b = (currentTimeMillis / 1000.0d) + this.f1046a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo577a() {
            return mo578b() == 0.0d;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public double mo578b() {
            double currentTimeMillis = (double) System.currentTimeMillis();
            Double.isNaN(currentTimeMillis);
            double d = this.f1047b - (currentTimeMillis / 1000.0d);
            if (d <= 0.0d) {
                return 0.0d;
            }
            return d;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo579c() {
            mo576a(this.f1046a);
        }

        public String toString() {
            return C0190l0.m503a(mo578b(), 2);
        }
    }

    C0190l0() {
    }

    /* renamed from: a */
    static double m495a(AudioManager audioManager) {
        if (audioManager == null) {
            new C0269v.C0270a().mo707a("getAudioVolume() called with a null AudioManager").mo709a(C0269v.f1300j);
            return 0.0d;
        }
        try {
            double streamVolume = (double) audioManager.getStreamVolume(3);
            double streamMaxVolume = (double) audioManager.getStreamMaxVolume(3);
            if (streamMaxVolume == 0.0d) {
                return 0.0d;
            }
            Double.isNaN(streamVolume);
            Double.isNaN(streamMaxVolume);
            return streamVolume / streamMaxVolume;
        } catch (Exception e) {
            new C0269v.C0270a().mo707a("Exception occurred when accessing AudioManager: ").mo707a(e.toString()).mo709a(C0269v.f1300j);
            return 0.0d;
        }
    }

    /* renamed from: a */
    static int m496a(@NonNull Context context, @NonNull String str) {
        return m497a(m515b(context), str);
    }

    /* renamed from: a */
    static int m497a(@NonNull SharedPreferences sharedPreferences, @NonNull String str) {
        try {
            return sharedPreferences.getInt(str, -1);
        } catch (ClassCastException unused) {
            C0269v.C0270a aVar = new C0269v.C0270a();
            aVar.mo707a("Key " + str + " in SharedPreferences ").mo707a("does not have an int value.").mo709a(C0269v.f1298h);
            return -1;
        }
    }

    /* renamed from: a */
    static int m498a(View view) {
        if (view == null) {
            return 0;
        }
        int[] iArr = {0, 0};
        view.getLocationOnScreen(iArr);
        return (int) (((float) iArr[0]) / C0026a.m80c().mo445h().mo533n());
    }

    /* renamed from: a */
    static int m499a(C0121h0 h0Var) {
        int i = 0;
        try {
            Context b = C0026a.m78b();
            if (b != null) {
                int i2 = (int) (b.getPackageManager().getPackageInfo(b.getPackageName(), 0).lastUpdateTime / 1000);
                boolean exists = new File(h0Var.mo411a() + "AppVersion").exists();
                boolean z = true;
                if (exists) {
                    if (C0267t.m817f(C0267t.m811c(h0Var.mo411a() + "AppVersion"), "last_update") != i2) {
                        i = 1;
                    } else {
                        z = false;
                    }
                } else {
                    i = 2;
                }
                if (z) {
                    JSONObject b2 = C0267t.m805b();
                    C0267t.m808b(b2, "last_update", i2);
                    C0267t.m820i(b2, h0Var.mo411a() + "AppVersion");
                }
            }
        } catch (Exception unused) {
        }
        return i;
    }

    /* renamed from: a */
    static int m500a(String str) {
        CRC32 crc32 = new CRC32();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            crc32.update(str.charAt(i));
        }
        return (int) crc32.getValue();
    }

    /* renamed from: a */
    static AudioManager m501a(Context context) {
        if (context != null) {
            return (AudioManager) context.getSystemService("audio");
        }
        new C0269v.C0270a().mo707a("getAudioManager called with a null Context").mo709a(C0269v.f1300j);
        return null;
    }

    /* renamed from: a */
    static String m502a() {
        return UUID.randomUUID().toString();
    }

    /* renamed from: a */
    static String m503a(double d, int i) {
        StringBuilder sb = new StringBuilder();
        m507a(d, i, sb);
        return sb.toString();
    }

    /* renamed from: a */
    static String m504a(JSONArray jSONArray) throws JSONException {
        String str = "";
        for (int i = 0; i < jSONArray.length(); i++) {
            if (i > 0) {
                str = str + ",";
            }
            switch (jSONArray.getInt(i)) {
                case 1:
                    str = str + "MO";
                    break;
                case 2:
                    str = str + "TU";
                    break;
                case 3:
                    str = str + "WE";
                    break;
                case 4:
                    str = str + "TH";
                    break;
                case 5:
                    str = str + "FR";
                    break;
                case 6:
                    str = str + "SA";
                    break;
                case 7:
                    str = str + "SU";
                    break;
            }
        }
        return str;
    }

    /* renamed from: a */
    static JSONArray m505a(int i) {
        JSONArray a = C0267t.m785a();
        for (int i2 = 0; i2 < i; i2++) {
            C0267t.m807b(a, m502a());
        }
        return a;
    }

    /* renamed from: a */
    static JSONObject m506a(JSONObject jSONObject) {
        jSONObject.remove("permissions");
        return jSONObject;
    }

    /* renamed from: a */
    static void m507a(double d, int i, StringBuilder sb) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            sb.append(d);
            return;
        }
        if (d < 0.0d) {
            d = -d;
            sb.append('-');
        }
        if (i == 0) {
            sb.append(Math.round(d));
            return;
        }
        long pow = (long) Math.pow(10.0d, (double) i);
        double d2 = (double) pow;
        Double.isNaN(d2);
        long round = Math.round(d * d2);
        sb.append(round / pow);
        sb.append('.');
        long j = round % pow;
        if (j == 0) {
            for (int i2 = 0; i2 < i; i2++) {
                sb.append('0');
            }
            return;
        }
        for (long j2 = j * 10; j2 < pow; j2 *= 10) {
            sb.append('0');
        }
        sb.append(j);
    }

    /* renamed from: a */
    static boolean m508a(Intent intent) {
        return m509a(intent, false);
    }

    /* renamed from: a */
    static boolean m509a(Intent intent, boolean z) {
        try {
            Context b = C0026a.m78b();
            if (b == null) {
                return false;
            }
            if (!(b instanceof Activity)) {
                intent.addFlags(268435456);
            }
            AdColonyInterstitial d = C0026a.m80c().mo438d();
            if (d != null && d.mo229h()) {
                d.mo225f().mo372f();
            }
            if (z) {
                b.startActivity(Intent.createChooser(intent, "Handle this via..."));
                return true;
            }
            b.startActivity(intent);
            return true;
        } catch (Exception e) {
            new C0269v.C0270a().mo707a(e.toString()).mo709a(C0269v.f1298h);
            return false;
        }
    }

    /* renamed from: a */
    static boolean m510a(Runnable runnable) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper == null) {
            return false;
        }
        if (f1042c == null) {
            f1042c = new Handler(mainLooper);
        }
        if (mainLooper == Looper.myLooper()) {
            runnable.run();
            return true;
        }
        f1042c.post(runnable);
        return true;
    }

    /* renamed from: a */
    static boolean m511a(String str, int i) {
        Context b = C0026a.m78b();
        if (b == null) {
            return false;
        }
        m510a((Runnable) new C0191a(b, str, i));
        return true;
    }

    /* renamed from: a */
    static boolean m512a(String str, File file) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA1");
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                byte[] bArr = new byte[8192];
                while (true) {
                    try {
                        int read = fileInputStream.read(bArr);
                        if (read <= 0) {
                            break;
                        }
                        instance.update(bArr, 0, read);
                    } catch (IOException e) {
                        throw new RuntimeException("Unable to process file for MD5", e);
                    } catch (Throwable th) {
                        try {
                            fileInputStream.close();
                        } catch (IOException unused) {
                            new C0269v.C0270a().mo707a("Exception on closing MD5 input stream").mo709a(C0269v.f1300j);
                        }
                        throw th;
                    }
                }
                boolean equals = str.equals(String.format("%40s", new Object[]{new BigInteger(1, instance.digest()).toString(16)}).replace(' ', '0'));
                try {
                    fileInputStream.close();
                } catch (IOException unused2) {
                    new C0269v.C0270a().mo707a("Exception on closing MD5 input stream").mo709a(C0269v.f1300j);
                }
                return equals;
            } catch (FileNotFoundException unused3) {
                new C0269v.C0270a().mo707a("Exception while getting FileInputStream").mo709a(C0269v.f1300j);
                return false;
            }
        } catch (NoSuchAlgorithmException unused4) {
            new C0269v.C0270a().mo707a("Exception while getting Digest").mo709a(C0269v.f1300j);
            return false;
        }
    }

    /* renamed from: a */
    static boolean m513a(String[] strArr, String[] strArr2) {
        if (strArr == null || strArr2 == null || strArr.length != strArr2.length) {
            return false;
        }
        Arrays.sort(strArr);
        Arrays.sort(strArr2);
        return Arrays.equals(strArr, strArr2);
    }

    /* renamed from: b */
    static int m514b(View view) {
        if (view == null) {
            return 0;
        }
        int[] iArr = {0, 0};
        view.getLocationOnScreen(iArr);
        return (int) (((float) iArr[1]) / C0026a.m80c().mo445h().mo533n());
    }

    /* renamed from: b */
    static SharedPreferences m515b(@NonNull Context context) {
        try {
            Class.forName("androidx.preference.PreferenceManager");
            return PreferenceManager.getDefaultSharedPreferences(context);
        } catch (ClassNotFoundException unused) {
            return context.getSharedPreferences(context.getPackageName() + "_preferences", 0);
        }
    }

    /* renamed from: b */
    static String m516b() {
        Context b = C0026a.m78b();
        if (b == null) {
            return "";
        }
        PackageManager packageManager = (b instanceof Application ? (Application) b : ((Activity) b).getApplication()).getPackageManager();
        try {
            return packageManager.getApplicationLabel(packageManager.getApplicationInfo(b.getPackageName(), 0)).toString();
        } catch (Exception unused) {
            new C0269v.C0270a().mo707a("Failed to retrieve application label.").mo709a(C0269v.f1300j);
            return "";
        }
    }

    /* renamed from: b */
    static String m517b(@NonNull Context context, @NonNull String str) {
        return m518b(m515b(context), str);
    }

    /* renamed from: b */
    static String m518b(@NonNull SharedPreferences sharedPreferences, @NonNull String str) {
        try {
            return sharedPreferences.getString(str, (String) null);
        } catch (ClassCastException unused) {
            C0269v.C0270a aVar = new C0269v.C0270a();
            aVar.mo707a("Key " + str + " in SharedPreferences ").mo707a("does not have a String value.").mo709a(C0269v.f1298h);
            return null;
        }
    }

    /* renamed from: b */
    static String m519b(String str) {
        try {
            return C0237o0.m713a(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    static String m520b(JSONArray jSONArray) throws JSONException {
        String str = "";
        for (int i = 0; i < jSONArray.length(); i++) {
            if (i > 0) {
                str = str + ",";
            }
            str = str + jSONArray.getInt(i);
        }
        return str;
    }

    /* renamed from: b */
    static boolean m521b(AudioManager audioManager) {
        if (audioManager == null) {
            new C0269v.C0270a().mo707a("isAudioEnabled() called with a null AudioManager").mo709a(C0269v.f1300j);
            return false;
        }
        try {
            return audioManager.getStreamVolume(3) > 0;
        } catch (Exception e) {
            new C0269v.C0270a().mo707a("Exception occurred when accessing AudioManager.getStreamVolume: ").mo707a(e.toString()).mo709a(C0269v.f1300j);
            return false;
        }
    }

    /* renamed from: c */
    static String m522c() {
        Context b = C0026a.m78b();
        if (b == null) {
            return "1.0";
        }
        try {
            return b.getPackageManager().getPackageInfo(b.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            new C0269v.C0270a().mo707a("Failed to retrieve package info.").mo709a(C0269v.f1300j);
            return "1.0";
        }
    }

    /* renamed from: c */
    static String m523c(@NonNull Context context) {
        try {
            return context.getPackageName();
        } catch (Exception unused) {
            return "unknown";
        }
    }

    /* renamed from: c */
    static boolean m524c(String str) {
        Context b = C0026a.m78b();
        if (b == null) {
            return false;
        }
        try {
            (b instanceof Application ? (Application) b : ((Activity) b).getApplication()).getPackageManager().getApplicationInfo(str, 0);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    @Deprecated
    /* renamed from: d */
    static int m525d() {
        Context b = C0026a.m78b();
        if (b == null) {
            return 0;
        }
        try {
            return b.getPackageManager().getPackageInfo(b.getPackageName(), 0).versionCode;
        } catch (Exception unused) {
            new C0269v.C0270a().mo707a("Failed to retrieve package info.").mo709a(C0269v.f1300j);
            return 0;
        }
    }

    /* renamed from: d */
    static int m526d(String str) {
        str.hashCode();
        if (!str.equals("portrait")) {
            return !str.equals("landscape") ? -1 : 1;
        }
        return 0;
    }

    /* renamed from: d */
    static JSONArray m527d(Context context) {
        JSONArray a = C0267t.m785a();
        if (context == null) {
            return a;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096);
            if (packageInfo.requestedPermissions == null) {
                return a;
            }
            JSONArray a2 = C0267t.m785a();
            int i = 0;
            while (true) {
                try {
                    String[] strArr = packageInfo.requestedPermissions;
                    if (i >= strArr.length) {
                        break;
                    }
                    a2.put(strArr[i]);
                    i++;
                } catch (Exception unused) {
                }
            }
            return a2;
        } catch (Exception unused2) {
            return a;
        }
    }

    /* renamed from: e */
    static int m528e(Context context) {
        int identifier;
        if (context != null && (identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android")) > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* renamed from: e */
    static String m529e() {
        Context b = C0026a.m78b();
        return (!(b instanceof Activity) || b.getResources().getConfiguration().orientation != 1) ? "landscape" : "portrait";
    }

    /* renamed from: e */
    static boolean m530e(String str) {
        if (str != null && str.length() <= f1040a) {
            return true;
        }
        new C0269v.C0270a().mo707a("String must be non-null and the max length is 128 characters.").mo709a(C0269v.f1297g);
        return false;
    }

    /* renamed from: f */
    static int m531f(String str) {
        try {
            return (int) Long.parseLong(str, 16);
        } catch (NumberFormatException unused) {
            new C0269v.C0270a().mo707a("Unable to parse '").mo707a(str).mo707a("' as a color.").mo709a(C0269v.f1298h);
            return -16777216;
        }
    }

    /* renamed from: f */
    static boolean m532f() {
        Context b = C0026a.m78b();
        return b != null && Build.VERSION.SDK_INT >= 24 && (b instanceof Activity) && ((Activity) b).isInMultiWindowMode();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:4|5|6) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0020, code lost:
        return new java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", r1).parse(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0025, code lost:
        return new java.text.SimpleDateFormat("yyyy-MM-dd", r1).parse(r5);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x001c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0021 */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.util.Date m533g(java.lang.String r5) {
        /*
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r2 = "yyyy-MM-dd'T'HH:mmZ"
            r0.<init>(r2, r1)
            java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat
            java.lang.String r3 = "yyyy-MM-dd'T'HH:mm:ssZ"
            r2.<init>(r3, r1)
            java.text.SimpleDateFormat r3 = new java.text.SimpleDateFormat
            java.lang.String r4 = "yyyy-MM-dd"
            r3.<init>(r4, r1)
            java.util.Date r0 = r0.parse(r5)     // Catch:{ Exception -> 0x001c }
            return r0
        L_0x001c:
            java.util.Date r0 = r2.parse(r5)     // Catch:{ Exception -> 0x0021 }
            return r0
        L_0x0021:
            java.util.Date r5 = r3.parse(r5)     // Catch:{ Exception -> 0x0026 }
            return r5
        L_0x0026:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.C0190l0.m533g(java.lang.String):java.util.Date");
    }
}
