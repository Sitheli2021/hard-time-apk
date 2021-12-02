package air.HardTime;

import android.os.Build;

public class GetVersionCode {
    public static String AIR_BUILD_VERSION = "33.1.1.406";

    public static String getAbi() {
        return Build.VERSION.SDK_INT >= 21 ? Build.SUPPORTED_ABIS[0] : Build.CPU_ABI;
    }

    public static void main(String[] strArr) {
        System.out.println("33.1.1.406");
    }
}
