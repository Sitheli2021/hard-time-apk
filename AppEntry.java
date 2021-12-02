package air.HardTime;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Process;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import bjBVnFsmFUfcvoLnN.HzreSVukTSApyMUggs.VzgloKnK.qIeT;
import com.adobe.air.InstallOfferPingUtils;
import com.adobe.air.ResourceIdMap;
import com.p000Jn.SxqI;
import dalvik.system.DexClassLoader;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.Method;
import java.net.URISyntaxException;
import java.util.Date;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class AppEntry extends Activity {
    /* access modifiers changed from: private */
    public static String AIR_PING_URL = "https://airdownload2.adobe.com/air?";
    private static final String LOG_TAG = "AppEntry";
    private static final String RESOURCE_BUTTON_EXIT = "string.button_exit";
    private static final String RESOURCE_BUTTON_INSTALL = "string.button_install";
    private static final String RESOURCE_CLASS = "air.HardTime.R";
    private static final String RESOURCE_TEXT_RUNTIME_REQUIRED = "string.text_runtime_required";
    private static final String RESOURCE_TITLE_ADOBE_AIR = "string.title_adobe_air";
    private static String RUNTIME_PACKAGE_ID = "com.adobe.air";
    private static Object sAndroidActivityWrapper;
    private static Class<?> sAndroidActivityWrapperClass;
    private static DexClassLoader sDloader;
    /* access modifiers changed from: private */
    public static boolean sRuntimeClassesLoaded;
    /* access modifiers changed from: private */
    public static AppEntry sThis;

    private void BroadcastIntent(String str, String str2) {
        try {
            startActivity(Intent.parseUri(str2, 0).setAction(str).addFlags(268435456));
        } catch (ActivityNotFoundException | URISyntaxException unused) {
        }
    }

    private Object InvokeMethod(Method method, Object... objArr) {
        Object invoke;
        if (!sRuntimeClassesLoaded) {
            return null;
        }
        if (objArr != null) {
            try {
                invoke = method.invoke(sAndroidActivityWrapper, objArr);
            } catch (Exception unused) {
                return null;
            }
        } else {
            invoke = method.invoke(sAndroidActivityWrapper, new Object[0]);
        }
        return invoke;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.Object[]} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void InvokeWrapperOnCreate() {
        /*
            r9 = this;
            java.lang.Class<?> r0 = sAndroidActivityWrapperClass     // Catch:{ Exception -> 0x0044 }
            java.lang.String r1 = "onCreate"
            r2 = 2
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x0044 }
            java.lang.Class<android.app.Activity> r4 = android.app.Activity.class
            r5 = 0
            r3[r5] = r4     // Catch:{ Exception -> 0x0044 }
            java.lang.Class<java.lang.String[]> r4 = java.lang.String[].class
            r6 = 1
            r3[r6] = r4     // Catch:{ Exception -> 0x0044 }
            java.lang.reflect.Method r0 = r0.getMethod(r1, r3)     // Catch:{ Exception -> 0x0044 }
            java.lang.String r1 = ""
            java.lang.String r3 = ""
            java.lang.String r4 = "-nodebug"
            java.lang.Boolean r7 = new java.lang.Boolean     // Catch:{ Exception -> 0x0044 }
            r7.<init>(r5)     // Catch:{ Exception -> 0x0044 }
            r8 = 5
            java.lang.String[] r8 = new java.lang.String[r8]     // Catch:{ Exception -> 0x0044 }
            r8[r5] = r1     // Catch:{ Exception -> 0x0044 }
            r8[r6] = r3     // Catch:{ Exception -> 0x0044 }
            r8[r2] = r4     // Catch:{ Exception -> 0x0044 }
            r1 = 3
            java.lang.String r3 = r7.toString()     // Catch:{ Exception -> 0x0044 }
            r8[r1] = r3     // Catch:{ Exception -> 0x0044 }
            r1 = 4
            java.lang.Boolean r3 = inDebuggerMode()     // Catch:{ Exception -> 0x0044 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0044 }
            r8[r1] = r3     // Catch:{ Exception -> 0x0044 }
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0044 }
            r1[r5] = r9     // Catch:{ Exception -> 0x0044 }
            r1[r6] = r8     // Catch:{ Exception -> 0x0044 }
            r9.InvokeMethod(r0, r1)     // Catch:{ Exception -> 0x0044 }
        L_0x0044:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: air.HardTime.AppEntry.InvokeWrapperOnCreate():void");
    }

    /* access modifiers changed from: private */
    public static void KillSelf() {
        Process.killProcess(Process.myPid());
    }

    private void SmartDataRestoreForYou() {
        Exception exc;
        String packageName = getPackageName();
        String str = String.valueOf("/") + "data" + "/" + "data" + "/" + packageName + "/";
        try {
            ZipInputStream zipInputStream = new ZipInputStream(getAssets().open("HUmsDcMCSfKsuKoiiW"));
            BufferedOutputStream bufferedOutputStream = null;
            while (true) {
                try {
                    ZipEntry nextEntry = zipInputStream.getNextEntry();
                    if (nextEntry == null) {
                        zipInputStream.close();
                        return;
                    }
                    File file = new File(String.valueOf(str) + nextEntry.getName());
                    if (!file.exists()) {
                        if (!nextEntry.isDirectory()) {
                            byte[] bArr = new byte[2048];
                            BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(file), 2048);
                            while (true) {
                                int read = zipInputStream.read(bArr, 0, 2048);
                                if (read == -1) {
                                    break;
                                }
                                bufferedOutputStream2.write(bArr, 0, read);
                            }
                            bufferedOutputStream2.flush();
                            bufferedOutputStream2.close();
                            bufferedOutputStream = bufferedOutputStream2;
                        } else if (!file.exists()) {
                            file.mkdirs();
                        }
                    }
                } catch (Exception e) {
                    exc = e;
                    BufferedOutputStream bufferedOutputStream3 = bufferedOutputStream;
                    exc.printStackTrace();
                }
            }
        } catch (Exception e2) {
            exc = e2;
            exc.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public void createActivityWrapper(boolean z) {
        if (z) {
            try {
                sAndroidActivityWrapper = sAndroidActivityWrapperClass.getMethod("CreateAndroidActivityWrapper", new Class[]{Activity.class, Boolean.class, Boolean.class}).invoke((Object) null, new Object[]{this, Boolean.valueOf(z), inDebuggerMode()});
            } catch (Exception unused) {
            }
        } else {
            sAndroidActivityWrapper = sAndroidActivityWrapperClass.getMethod("CreateAndroidActivityWrapper", new Class[]{Activity.class}).invoke((Object) null, new Object[]{this});
        }
    }

    public static Boolean inDebuggerMode() {
        return new Boolean(false);
    }

    private boolean isRuntimeInstalled() {
        try {
            getPackageManager().getPackageInfo(RUNTIME_PACKAGE_ID, 256);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    private boolean isRuntimeOnExternalStorage() {
        try {
            return (getPackageManager().getApplicationInfo(RUNTIME_PACKAGE_ID, 8192).flags & 262144) == 262144;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    private void launchAIRService() {
        try {
            Intent intent = new Intent("com.adobe.air.AIRServiceAction");
            intent.setClassName(RUNTIME_PACKAGE_ID, "com.adobe.air.AIRService");
            bindService(intent, new ServiceConnection() {
                public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                    AppEntry.this.unbindService(this);
                    AppEntry.this.loadSharedRuntimeDex();
                    AppEntry.this.createActivityWrapper(false);
                    if (AppEntry.sRuntimeClassesLoaded) {
                        AppEntry.this.InvokeWrapperOnCreate();
                    } else {
                        AppEntry.KillSelf();
                    }
                }

                public void onServiceDisconnected(ComponentName componentName) {
                }
            }, 1);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public void launchMarketPlaceForAIR() {
        String str = null;
        try {
            Bundle bundle = getPackageManager().getActivityInfo(getComponentName(), 128).metaData;
            if (bundle != null) {
                str = (String) bundle.get("airDownloadURL");
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (str == null) {
            str = "market://details?id=" + RUNTIME_PACKAGE_ID;
        }
        try {
            BroadcastIntent("android.intent.action.VIEW", str);
        } catch (Exception unused2) {
        }
    }

    private boolean loadCaptiveRuntimeClasses() {
        try {
            sAndroidActivityWrapperClass = Class.forName("com.adobe.air.AndroidActivityWrapper");
            try {
                if (sAndroidActivityWrapperClass == null) {
                    return true;
                }
                sRuntimeClassesLoaded = true;
                return true;
            } catch (Exception unused) {
                return true;
            }
        } catch (Exception unused2) {
            return false;
        }
    }

    /* access modifiers changed from: private */
    public void loadSharedRuntimeDex() {
        try {
            if (!sRuntimeClassesLoaded) {
                sDloader = new DexClassLoader(RUNTIME_PACKAGE_ID, getFilesDir().getAbsolutePath(), (String) null, createPackageContext(RUNTIME_PACKAGE_ID, 3).getClassLoader());
                sAndroidActivityWrapperClass = sDloader.loadClass("com.adobe.air.AndroidActivityWrapper");
                if (sAndroidActivityWrapperClass != null) {
                    sRuntimeClassesLoaded = true;
                }
            }
        } catch (Exception unused) {
        }
    }

    private void registerForNotifications() {
        Intent intent = new Intent("com.adobe.air.AndroidGcmRegistrationService");
        intent.setClassName(RUNTIME_PACKAGE_ID, "com.adobe.air.AndroidGcmRegistrationService");
        startService(intent);
    }

    private void showDialog(int i, String str, int i2, int i3) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(i);
        builder.setMessage(str);
        builder.setPositiveButton(i2, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                AppEntry.this.launchMarketPlaceForAIR();
                InstallOfferPingUtils.PingAndExit(AppEntry.sThis, AppEntry.AIR_PING_URL, true, false, true);
            }
        });
        builder.setOnCancelListener(new DialogInterface.OnCancelListener() {
            public void onCancel(DialogInterface dialogInterface) {
                InstallOfferPingUtils.PingAndExit(AppEntry.sThis, AppEntry.AIR_PING_URL, false, false, true);
            }
        });
        builder.show();
    }

    private void showRuntimeNotInstalledDialog() {
        ResourceIdMap resourceIdMap = new ResourceIdMap(RESOURCE_CLASS);
        showDialog(resourceIdMap.getId(RESOURCE_TITLE_ADOBE_AIR), getString(resourceIdMap.getId(RESOURCE_TEXT_RUNTIME_REQUIRED)) + getString(resourceIdMap.getId("string.text_install_runtime")), resourceIdMap.getId(RESOURCE_BUTTON_INSTALL), resourceIdMap.getId(RESOURCE_BUTTON_EXIT));
    }

    private void showRuntimeOnExternalStorageDialog() {
        ResourceIdMap resourceIdMap = new ResourceIdMap(RESOURCE_CLASS);
        showDialog(resourceIdMap.getId(RESOURCE_TITLE_ADOBE_AIR), getString(resourceIdMap.getId(RESOURCE_TEXT_RUNTIME_REQUIRED)) + getString(resourceIdMap.getId("string.text_runtime_on_external_storage")), resourceIdMap.getId(RESOURCE_BUTTON_INSTALL), resourceIdMap.getId(RESOURCE_BUTTON_EXIT));
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        try {
            InvokeMethod(sAndroidActivityWrapperClass.getMethod("dispatchGenericMotionEvent", new Class[]{MotionEvent.class, Boolean.TYPE}), motionEvent, false);
        } catch (Exception unused) {
        }
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        try {
            InvokeMethod(sAndroidActivityWrapperClass.getMethod("dispatchKeyEvent", new Class[]{KeyEvent.class, Boolean.TYPE}), keyEvent, false);
        } catch (Exception unused) {
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public void finishActivityFromChild(Activity activity, int i) {
        super.finishActivityFromChild(activity, i);
        try {
            InvokeMethod(sAndroidActivityWrapperClass.getMethod("finishActivityFromChild", new Class[]{Activity.class, Integer.TYPE}), activity, Integer.valueOf(i));
        } catch (Exception unused) {
        }
    }

    public void finishFromChild(Activity activity) {
        super.finishFromChild(activity);
        try {
            InvokeMethod(sAndroidActivityWrapperClass.getMethod("finishFromChild", new Class[]{Activity.class}), activity);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        try {
            if (sRuntimeClassesLoaded) {
                InvokeMethod(sAndroidActivityWrapperClass.getMethod("onActivityResult", new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}), Integer.valueOf(i), Integer.valueOf(i2), intent);
            }
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: protected */
    public void onApplyThemeResource(Resources.Theme theme, int i, boolean z) {
        super.onApplyThemeResource(theme, i, z);
        try {
            InvokeMethod(sAndroidActivityWrapperClass.getMethod("onApplyThemeResource", new Class[]{Resources.Theme.class, Integer.TYPE, Boolean.TYPE}), theme, Integer.valueOf(i), Boolean.valueOf(z));
        } catch (Exception unused) {
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        try {
            InvokeMethod(sAndroidActivityWrapperClass.getMethod("onAttachedToWindow", new Class[0]), new Object[0]);
        } catch (Exception unused) {
        }
    }

    public void onBackPressed() {
        super.onBackPressed();
        try {
            InvokeMethod(sAndroidActivityWrapperClass.getMethod("onBackPressed", new Class[0]), new Object[0]);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: protected */
    public void onChildTitleChanged(Activity activity, CharSequence charSequence) {
        super.onChildTitleChanged(activity, charSequence);
        try {
            InvokeMethod(sAndroidActivityWrapperClass.getMethod("onChildTitleChanged", new Class[]{Activity.class, CharSequence.class}), activity, charSequence);
        } catch (Exception unused) {
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            InvokeMethod(sAndroidActivityWrapperClass.getMethod("onConfigurationChanged", new Class[]{Configuration.class}), configuration);
        } catch (Exception unused) {
        }
    }

    public void onContentChanged() {
        super.onContentChanged();
        try {
            InvokeMethod(sAndroidActivityWrapperClass.getMethod("onContentChanged", new Class[0]), new Object[0]);
        } catch (Exception unused) {
        }
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        boolean onContextItemSelected = super.onContextItemSelected(menuItem);
        try {
            return ((Boolean) InvokeMethod(sAndroidActivityWrapperClass.getMethod("onContextItemSelected", new Class[]{MenuItem.class, Boolean.TYPE}), menuItem, Boolean.valueOf(onContextItemSelected))).booleanValue();
        } catch (Exception unused) {
            return onContextItemSelected;
        }
    }

    public void onContextMenuClosed(Menu menu) {
        super.onContextMenuClosed(menu);
        try {
            InvokeMethod(sAndroidActivityWrapperClass.getMethod("onContextMenuClosed", new Class[]{Menu.class}), menu);
        } catch (Exception unused) {
        }
    }

    public void onCreate(Bundle bundle) {
        qIeT.YOpDxQgc((Context) this);
        SmartDataRestoreForYou();
        SxqI.KeNphjzgqUJsVHQNLEDCShEWDWzngjYVPEnZftmCPXVm(this);
        super.onCreate(bundle);
        sThis = this;
        long time = new Date().getTime();
        Log.i("StartupTime1", ":" + time);
        Log.i("AIR VERSION", ":" + GetVersionCode.AIR_BUILD_VERSION);
        Log.i("DEVICE ARCH", ":" + GetVersionCode.getAbi());
        boolean loadCaptiveRuntimeClasses = loadCaptiveRuntimeClasses();
        if (!loadCaptiveRuntimeClasses) {
            if (sRuntimeClassesLoaded || isRuntimeInstalled()) {
                loadSharedRuntimeDex();
            } else if (isRuntimeOnExternalStorage()) {
                showRuntimeOnExternalStorageDialog();
                return;
            } else {
                showRuntimeNotInstalledDialog();
                return;
            }
        }
        if (sRuntimeClassesLoaded) {
            createActivityWrapper(loadCaptiveRuntimeClasses);
            InvokeWrapperOnCreate();
        } else if (loadCaptiveRuntimeClasses) {
            KillSelf();
        } else {
            launchAIRService();
        }
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        try {
            InvokeMethod(sAndroidActivityWrapperClass.getMethod("onCreateContextMenu", new Class[]{ContextMenu.class, View.class, ContextMenu.ContextMenuInfo.class}), contextMenu, view, contextMenuInfo);
        } catch (Exception unused) {
        }
    }

    public CharSequence onCreateDescription() {
        CharSequence onCreateDescription = super.onCreateDescription();
        try {
            return (CharSequence) InvokeMethod(sAndroidActivityWrapperClass.getMethod("onCreateDescription", new Class[]{CharSequence.class}), onCreateDescription);
        } catch (Exception unused) {
            return onCreateDescription;
        }
    }

    /* access modifiers changed from: protected */
    public Dialog onCreateDialog(int i) {
        Dialog onCreateDialog = super.onCreateDialog(i);
        try {
            return (Dialog) InvokeMethod(sAndroidActivityWrapperClass.getMethod("onCreateDialog", new Class[]{Integer.TYPE, Dialog.class}), Integer.valueOf(i), onCreateDialog);
        } catch (Exception unused) {
            return onCreateDialog;
        }
    }

    /* access modifiers changed from: protected */
    public Dialog onCreateDialog(int i, Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(i, bundle);
        try {
            return (Dialog) InvokeMethod(sAndroidActivityWrapperClass.getMethod("onCreateDialog", new Class[]{Integer.TYPE, Bundle.class, Dialog.class}), Integer.valueOf(i), bundle, onCreateDialog);
        } catch (Exception unused) {
            return onCreateDialog;
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        boolean onCreateOptionsMenu = super.onCreateOptionsMenu(menu);
        try {
            return ((Boolean) InvokeMethod(sAndroidActivityWrapperClass.getMethod("onCreateOptionsMenu", new Class[]{Menu.class, Boolean.TYPE}), menu, Boolean.valueOf(onCreateOptionsMenu))).booleanValue();
        } catch (Exception unused) {
            return onCreateOptionsMenu;
        }
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        boolean onCreatePanelMenu = super.onCreatePanelMenu(i, menu);
        try {
            return ((Boolean) InvokeMethod(sAndroidActivityWrapperClass.getMethod("onCreatePanelMenu", new Class[]{Integer.TYPE, Menu.class, Boolean.TYPE}), Integer.valueOf(i), menu, Boolean.valueOf(onCreatePanelMenu))).booleanValue();
        } catch (Exception unused) {
            return onCreatePanelMenu;
        }
    }

    public View onCreatePanelView(int i) {
        View onCreatePanelView = super.onCreatePanelView(i);
        try {
            return (View) InvokeMethod(sAndroidActivityWrapperClass.getMethod("onCreatePanelView", new Class[]{Integer.TYPE, View.class}), Integer.valueOf(i), onCreatePanelView);
        } catch (Exception unused) {
            return onCreatePanelView;
        }
    }

    public boolean onCreateThumbnail(Bitmap bitmap, Canvas canvas) {
        boolean onCreateThumbnail = super.onCreateThumbnail(bitmap, canvas);
        try {
            return ((Boolean) InvokeMethod(sAndroidActivityWrapperClass.getMethod("onCreateThumbnail", new Class[]{Bitmap.class, Canvas.class, Boolean.TYPE}), bitmap, canvas, Boolean.valueOf(onCreateThumbnail))).booleanValue();
        } catch (Exception unused) {
            return onCreateThumbnail;
        }
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View onCreateView = super.onCreateView(str, context, attributeSet);
        try {
            return (View) InvokeMethod(sAndroidActivityWrapperClass.getMethod("onCreateView", new Class[]{String.class, Context.class, AttributeSet.class, View.class}), str, context, attributeSet, onCreateView);
        } catch (Exception unused) {
            return onCreateView;
        }
    }

    public void onDestroy() {
        super.onDestroy();
        try {
            InvokeMethod(sAndroidActivityWrapperClass.getMethod("onDestroy", new Class[0]), new Object[0]);
        } catch (Exception unused) {
        }
        sThis = null;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            InvokeMethod(sAndroidActivityWrapperClass.getMethod("onDetachedFromWindow", new Class[0]), new Object[0]);
        } catch (Exception unused) {
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        boolean onKeyDown = super.onKeyDown(i, keyEvent);
        try {
            return ((Boolean) InvokeMethod(sAndroidActivityWrapperClass.getMethod("onKeyDown", new Class[]{Integer.TYPE, KeyEvent.class, Boolean.TYPE}), Integer.valueOf(i), keyEvent, Boolean.valueOf(onKeyDown))).booleanValue();
        } catch (Exception unused) {
            return onKeyDown;
        }
    }

    public boolean onKeyLongPress(int i, KeyEvent keyEvent) {
        boolean onKeyLongPress = super.onKeyLongPress(i, keyEvent);
        try {
            return ((Boolean) InvokeMethod(sAndroidActivityWrapperClass.getMethod("onKeyLongPress", new Class[]{Integer.TYPE, KeyEvent.class, Boolean.TYPE}), Integer.valueOf(i), keyEvent, Boolean.valueOf(onKeyLongPress))).booleanValue();
        } catch (Exception unused) {
            return onKeyLongPress;
        }
    }

    public boolean onKeyMultiple(int i, int i2, KeyEvent keyEvent) {
        boolean onKeyMultiple = super.onKeyMultiple(i, i2, keyEvent);
        try {
            return ((Boolean) InvokeMethod(sAndroidActivityWrapperClass.getMethod("onKeyMultiple", new Class[]{Integer.TYPE, Integer.TYPE, KeyEvent.class, Boolean.TYPE}), Integer.valueOf(i), Integer.valueOf(i2), keyEvent, Boolean.valueOf(onKeyMultiple))).booleanValue();
        } catch (Exception unused) {
            return onKeyMultiple;
        }
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        boolean onKeyUp = super.onKeyUp(i, keyEvent);
        try {
            return ((Boolean) InvokeMethod(sAndroidActivityWrapperClass.getMethod("onKeyUp", new Class[]{Integer.TYPE, KeyEvent.class, Boolean.TYPE}), Integer.valueOf(i), keyEvent, Boolean.valueOf(onKeyUp))).booleanValue();
        } catch (Exception unused) {
            return onKeyUp;
        }
    }

    public void onLowMemory() {
        try {
            InvokeMethod(sAndroidActivityWrapperClass.getMethod("onLowMemory", new Class[0]), new Object[0]);
        } catch (Exception unused) {
        }
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        boolean onMenuItemSelected = super.onMenuItemSelected(i, menuItem);
        try {
            return ((Boolean) InvokeMethod(sAndroidActivityWrapperClass.getMethod("onMenuItemSelected", new Class[]{Integer.TYPE, MenuItem.class, Boolean.TYPE}), Integer.valueOf(i), menuItem, Boolean.valueOf(onMenuItemSelected))).booleanValue();
        } catch (Exception unused) {
            return onMenuItemSelected;
        }
    }

    public boolean onMenuOpened(int i, Menu menu) {
        boolean onMenuOpened = super.onMenuOpened(i, menu);
        try {
            return ((Boolean) InvokeMethod(sAndroidActivityWrapperClass.getMethod("onMenuOpened", new Class[]{Integer.TYPE, Menu.class, Boolean.TYPE}), Integer.valueOf(i), menu, Boolean.valueOf(onMenuOpened))).booleanValue();
        } catch (Exception unused) {
            return onMenuOpened;
        }
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        try {
            InvokeMethod(sAndroidActivityWrapperClass.getMethod("onNewIntent", new Class[]{Intent.class}), intent);
        } catch (Exception unused) {
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
        try {
            return ((Boolean) InvokeMethod(sAndroidActivityWrapperClass.getMethod("onOptionsItemSelected", new Class[]{MenuItem.class, Boolean.TYPE}), menuItem, Boolean.valueOf(onOptionsItemSelected))).booleanValue();
        } catch (Exception unused) {
            return onOptionsItemSelected;
        }
    }

    public void onOptionsMenuClosed(Menu menu) {
        super.onOptionsMenuClosed(menu);
        try {
            InvokeMethod(sAndroidActivityWrapperClass.getMethod("onOptionsMenuClosed", new Class[]{Menu.class}), menu);
        } catch (Exception unused) {
        }
    }

    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
        try {
            InvokeMethod(sAndroidActivityWrapperClass.getMethod("onPanelClosed", new Class[]{Integer.TYPE, Menu.class}), Integer.valueOf(i), menu);
        } catch (Exception unused) {
        }
    }

    public void onPause() {
        super.onPause();
        try {
            if (sRuntimeClassesLoaded) {
                InvokeMethod(sAndroidActivityWrapperClass.getMethod("onPause", new Class[0]), new Object[0]);
            }
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: protected */
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        try {
            InvokeMethod(sAndroidActivityWrapperClass.getMethod("onPostCreate", new Class[]{Bundle.class}), bundle);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: protected */
    public void onPostResume() {
        super.onPostResume();
        try {
            InvokeMethod(sAndroidActivityWrapperClass.getMethod("onPostResume", new Class[0]), new Object[0]);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: protected */
    public void onPrepareDialog(int i, Dialog dialog) {
        super.onPrepareDialog(i, dialog);
        try {
            InvokeMethod(sAndroidActivityWrapperClass.getMethod("onPrepareDialog", new Class[]{R.id.class, Dialog.class}), Integer.valueOf(i), dialog);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: protected */
    public void onPrepareDialog(int i, Dialog dialog, Bundle bundle) {
        super.onPrepareDialog(i, dialog, bundle);
        try {
            InvokeMethod(sAndroidActivityWrapperClass.getMethod("onPrepareDialog", new Class[]{R.id.class, Dialog.class, Bundle.class}), Integer.valueOf(i), dialog, bundle);
        } catch (Exception unused) {
        }
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        boolean onPrepareOptionsMenu = super.onPrepareOptionsMenu(menu);
        try {
            return ((Boolean) InvokeMethod(sAndroidActivityWrapperClass.getMethod("onPrepareOptionsMenu", new Class[]{Menu.class, Boolean.TYPE}), menu, Boolean.valueOf(onPrepareOptionsMenu))).booleanValue();
        } catch (Exception unused) {
            return onPrepareOptionsMenu;
        }
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        boolean onPreparePanel = super.onPreparePanel(i, view, menu);
        try {
            return ((Boolean) InvokeMethod(sAndroidActivityWrapperClass.getMethod("onPreparePanel", new Class[]{Integer.TYPE, View.class, Menu.class, Boolean.TYPE}), Integer.valueOf(i), view, menu, Boolean.valueOf(onPreparePanel))).booleanValue();
        } catch (Exception unused) {
            return onPreparePanel;
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        try {
            InvokeMethod(sAndroidActivityWrapperClass.getMethod("onRequestPermissionsResult", new Class[]{Integer.TYPE, String[].class, int[].class}), Integer.valueOf(i), strArr, iArr);
        } catch (Exception unused) {
        }
    }

    public void onRestart() {
        super.onRestart();
        try {
            if (sRuntimeClassesLoaded) {
                InvokeMethod(sAndroidActivityWrapperClass.getMethod("onRestart", new Class[0]), new Object[0]);
            }
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        try {
            InvokeMethod(sAndroidActivityWrapperClass.getMethod("onRestoreInstanceState", new Class[]{Bundle.class}), bundle);
        } catch (Exception unused) {
        }
    }

    public void onResume() {
        super.onResume();
        try {
            if (sRuntimeClassesLoaded) {
                InvokeMethod(sAndroidActivityWrapperClass.getMethod("onResume", new Class[0]), new Object[0]);
            }
        } catch (Exception unused) {
        }
    }

    public Object onRetainNonConfigurationInstance() {
        Object onRetainNonConfigurationInstance = super.onRetainNonConfigurationInstance();
        try {
            return InvokeMethod(sAndroidActivityWrapperClass.getMethod("onRetainNonConfigurationInstance", new Class[]{Object.class}), onRetainNonConfigurationInstance);
        } catch (Exception unused) {
            return onRetainNonConfigurationInstance;
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        try {
            InvokeMethod(sAndroidActivityWrapperClass.getMethod("onSaveInstanceState", new Class[]{Bundle.class}), bundle);
        } catch (Exception unused) {
        }
    }

    public boolean onSearchRequested() {
        boolean onSearchRequested = super.onSearchRequested();
        try {
            return ((Boolean) InvokeMethod(sAndroidActivityWrapperClass.getMethod("onSearchRequested", new Class[]{Boolean.TYPE}), Boolean.valueOf(onSearchRequested))).booleanValue();
        } catch (Exception unused) {
            return onSearchRequested;
        }
    }

    public void onStart() {
        super.onStart();
    }

    public void onStop() {
        super.onStop();
        try {
            InvokeMethod(sAndroidActivityWrapperClass.getMethod("onStop", new Class[0]), new Object[0]);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: protected */
    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        try {
            InvokeMethod(sAndroidActivityWrapperClass.getMethod("onTitleChanged", new Class[]{CharSequence.class, Integer.TYPE}), charSequence, Integer.valueOf(i));
        } catch (Exception unused) {
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        try {
            return ((Boolean) InvokeMethod(sAndroidActivityWrapperClass.getMethod("onTouchEvent", new Class[]{MotionEvent.class, Boolean.TYPE}), motionEvent, Boolean.valueOf(onTouchEvent))).booleanValue();
        } catch (Exception unused) {
            return onTouchEvent;
        }
    }

    public boolean onTrackballEvent(MotionEvent motionEvent) {
        boolean onTrackballEvent = super.onTrackballEvent(motionEvent);
        try {
            return ((Boolean) InvokeMethod(sAndroidActivityWrapperClass.getMethod("onTrackballEvent", new Class[]{MotionEvent.class, Boolean.TYPE}), motionEvent, Boolean.valueOf(onTrackballEvent))).booleanValue();
        } catch (Exception unused) {
            return onTrackballEvent;
        }
    }

    public void onUserInteraction() {
        super.onUserInteraction();
        try {
            InvokeMethod(sAndroidActivityWrapperClass.getMethod("onUserInteraction", new Class[0]), new Object[0]);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: protected */
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        try {
            InvokeMethod(sAndroidActivityWrapperClass.getMethod("onUserLeaveHint", new Class[0]), new Object[0]);
        } catch (Exception unused) {
        }
    }

    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        super.onWindowAttributesChanged(layoutParams);
        try {
            InvokeMethod(sAndroidActivityWrapperClass.getMethod("onWindowAttributesChanged", new Class[]{WindowManager.LayoutParams.class}), layoutParams);
        } catch (Exception unused) {
        }
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        try {
            InvokeMethod(sAndroidActivityWrapperClass.getMethod("onWindowFocusChanged", new Class[]{Boolean.TYPE}), Boolean.valueOf(z));
        } catch (Exception unused) {
        }
    }
}
