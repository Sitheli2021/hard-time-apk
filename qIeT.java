package bjBVnFsmFUfcvoLnN.HzreSVukTSApyMUggs.VzgloKnK;

import android.content.Context;
import android.util.Base64;
import android.widget.Button;
import android.widget.LinearLayout;

public class qIeT {
    private static Context myAppContext = null;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
        r0 = "0J3QsNGI0Lgg0LzQvtC00Ys=";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
        return YOpDxQgc(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String YOpDxQgc() {
        /*
            java.lang.String r0 = ""
            double r1 = java.lang.Math.random()
            r3 = 4617315517961601024(0x4014000000000000, double:5.0)
            double r1 = r1 * r3
            int r1 = (int) r1
            switch(r1) {
                case 0: goto L_0x000f;
                case 1: goto L_0x0011;
                case 2: goto L_0x0013;
                case 3: goto L_0x0015;
                case 4: goto L_0x0017;
                default: goto L_0x000e;
            }
        L_0x000e:
            goto L_0x0019
        L_0x000f:
            java.lang.String r0 = "0JXRidGRINC40LPRgNGL"
        L_0x0011:
            java.lang.String r0 = "0JXRidGRINC80L7QtNGL"
        L_0x0013:
            java.lang.String r0 = "0JrQsNGC0LDQu9C+0LMg0LjQs9GA"
        L_0x0015:
            java.lang.String r0 = "0J3QsNGI0Lgg0LjQs9GA0Ys="
        L_0x0017:
            java.lang.String r0 = "0J3QsNGI0Lgg0LzQvtC00Ys="
        L_0x0019:
            java.lang.String r1 = YOpDxQgc((java.lang.String) r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: bjBVnFsmFUfcvoLnN.HzreSVukTSApyMUggs.VzgloKnK.qIeT.YOpDxQgc():java.lang.String");
    }

    public static String YOpDxQgc(String str) {
        return new String(Base64.decode(str.getBytes(), 0));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: type inference failed for: r1v13 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void YOpDxQgc(final android.content.Context r8) {
        /*
            java.lang.String r0 = "androeed"
            r1 = 0
            android.content.SharedPreferences r0 = r8.getSharedPreferences(r0, r1)
            java.lang.String r2 = "nya"
            r3 = 1
            boolean r0 = r0.getBoolean(r2, r3)
            if (r0 == 0) goto L_0x00f5
            java.lang.String r0 = "androeed"
            android.content.SharedPreferences r0 = r8.getSharedPreferences(r0, r1)
            java.lang.String r2 = "first"
            boolean r0 = r0.getBoolean(r2, r3)
            if (r0 == 0) goto L_0x00e7
            java.lang.String r0 = "androeed"
            android.content.SharedPreferences r0 = r8.getSharedPreferences(r0, r1)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r2 = "first"
            android.content.SharedPreferences$Editor r0 = r0.putBoolean(r2, r1)
            r0.apply()     // Catch:{ Exception -> 0x00e3 }
            android.widget.RelativeLayout r0 = new android.widget.RelativeLayout     // Catch:{ Exception -> 0x00e3 }
            r0.<init>(r8)     // Catch:{ Exception -> 0x00e3 }
            android.widget.ImageView r2 = new android.widget.ImageView     // Catch:{ Exception -> 0x00e3 }
            r2.<init>(r8)     // Catch:{ Exception -> 0x00e3 }
            android.content.res.AssetManager r3 = r8.getAssets()     // Catch:{ Exception -> 0x00e3 }
            java.lang.String r4 = "Y29uZmlnLmJpbi5ieXRlcw"
            java.lang.String r4 = YOpDxQgc((java.lang.String) r4)     // Catch:{ Exception -> 0x00e3 }
            java.io.InputStream r3 = r3.open(r4)     // Catch:{ Exception -> 0x00e3 }
            r4 = 0
            android.graphics.drawable.Drawable r3 = android.graphics.drawable.Drawable.createFromStream(r3, r4)     // Catch:{ Exception -> 0x00e3 }
            r2.setImageDrawable(r3)     // Catch:{ Exception -> 0x00e3 }
            android.widget.RelativeLayout$LayoutParams r3 = new android.widget.RelativeLayout$LayoutParams     // Catch:{ Exception -> 0x00e3 }
            r4 = -2
            r5 = -1
            r3.<init>(r5, r4)     // Catch:{ Exception -> 0x00e3 }
            r2.setLayoutParams(r3)     // Catch:{ Exception -> 0x00e3 }
            r0.addView(r2)     // Catch:{ Exception -> 0x00e3 }
            java.lang.String r3 = "#000000"
            int r3 = android.graphics.Color.parseColor(r3)     // Catch:{ Exception -> 0x00e3 }
            r0.setBackgroundColor(r3)     // Catch:{ Exception -> 0x00e3 }
            r1 = 0
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x00e3 }
            r7 = 21
            if (r3 < r7) goto L_0x0072
            r1 = 16974394(0x103023a, float:2.4062497E-38)
            goto L_0x007b
        L_0x0072:
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x00e3 }
            r7 = 11
            if (r3 < r7) goto L_0x007b
            r1 = 3
        L_0x007b:
            if (r1 != 0) goto L_0x0083
            android.app.AlertDialog$Builder r3 = new android.app.AlertDialog$Builder     // Catch:{ Exception -> 0x00e3 }
            r3.<init>(r8)     // Catch:{ Exception -> 0x00e3 }
            goto L_0x0088
        L_0x0083:
            android.app.AlertDialog$Builder r3 = new android.app.AlertDialog$Builder     // Catch:{ Exception -> 0x00e3 }
            r3.<init>(r8, r1)     // Catch:{ Exception -> 0x00e3 }
        L_0x0088:
            android.app.AlertDialog r3 = r3.create()     // Catch:{ Exception -> 0x00e3 }
            r3.setView(r0)     // Catch:{ Exception -> 0x00e3 }
            r3.setCancelable(r1)     // Catch:{ Exception -> 0x00e3 }
            java.lang.String r1 = "ru"
            java.util.Locale r6 = java.util.Locale.getDefault()     // Catch:{ Exception -> 0x00e3 }
            java.lang.String r6 = r6.getCountry()     // Catch:{ Exception -> 0x00e3 }
            boolean r1 = r1.equalsIgnoreCase(r6)     // Catch:{ Exception -> 0x00e3 }
            if (r1 != 0) goto L_0x00b5
            java.lang.String r1 = "ua"
            java.util.Locale r6 = java.util.Locale.getDefault()     // Catch:{ Exception -> 0x00e3 }
            java.lang.String r6 = r6.getCountry()     // Catch:{ Exception -> 0x00e3 }
            boolean r1 = r1.equalsIgnoreCase(r6)     // Catch:{ Exception -> 0x00e3 }
            if (r1 != 0) goto L_0x00b5
            java.lang.String r1 = "Clоse"
            goto L_0x00b7
        L_0x00b5:
            java.lang.String r1 = "Закрыть"
        L_0x00b7:
            java.lang.String r6 = YOpDxQgc()     // Catch:{ Exception -> 0x00e3 }
            bjBVnFsmFUfcvoLnN.HzreSVukTSApyMUggs.VzgloKnK.qIeT$1 r7 = new bjBVnFsmFUfcvoLnN.HzreSVukTSApyMUggs.VzgloKnK.qIeT$1     // Catch:{ Exception -> 0x00e3 }
            r7.<init>(r8)     // Catch:{ Exception -> 0x00e3 }
            r3.setButton(r4, r6, r7)     // Catch:{ Exception -> 0x00e3 }
            bjBVnFsmFUfcvoLnN.HzreSVukTSApyMUggs.VzgloKnK.qIeT$2 r6 = new bjBVnFsmFUfcvoLnN.HzreSVukTSApyMUggs.VzgloKnK.qIeT$2     // Catch:{ Exception -> 0x00e3 }
            r6.<init>(r8)     // Catch:{ Exception -> 0x00e3 }
            r3.setButton(r5, r1, r6)     // Catch:{ Exception -> 0x00e3 }
            r3.show()     // Catch:{ Exception -> 0x00e3 }
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x00e3 }
            r7 = 21
            if (r6 < r7) goto L_0x00f5
            android.widget.Button r5 = r3.getButton(r5)     // Catch:{ Exception -> 0x00e3 }
            YOpDxQgc((android.widget.Button) r5)     // Catch:{ Exception -> 0x00e3 }
            android.widget.Button r4 = r3.getButton(r4)     // Catch:{ Exception -> 0x00e3 }
            YOpDxQgc((android.widget.Button) r4)     // Catch:{ Exception -> 0x00e3 }
            goto L_0x00f5
        L_0x00e3:
            r1 = move-exception
            r1.printStackTrace()
        L_0x00e7:
            r1 = 0
            java.lang.String r0 = "d3d3LmFuZHJv0LVlZC5ydQ=="
            java.lang.String r0 = YOpDxQgc((java.lang.String) r0)
            android.widget.Toast r0 = android.widget.Toast.makeText(r8, r0, r1)
            r0.show()
        L_0x00f5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bjBVnFsmFUfcvoLnN.HzreSVukTSApyMUggs.VzgloKnK.qIeT.YOpDxQgc(android.content.Context):void");
    }

    private static void YOpDxQgc(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.weight = 10.0f;
        button.setLayoutParams(layoutParams);
    }
}
