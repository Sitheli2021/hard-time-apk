package com.adcolony.airadc;

import com.adobe.fre.FREFunction;

class ConfigureFunction implements FREFunction {
    static final String KEY = "configure";

    ConfigureFunction() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: com.adobe.fre.FREObject} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: com.adobe.fre.FREObject} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r0v1, types: [com.adobe.fre.FREObject] */
    /* JADX WARNING: type inference failed for: r0v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.adobe.fre.FREObject call(com.adobe.fre.FREContext r13, com.adobe.fre.FREObject[] r14) {
        /*
            r12 = this;
            com.adcolony.airadc.AirAdcContext r13 = (com.adcolony.airadc.AirAdcContext) r13
            r0 = 0
            r1 = 0
            com.adobe.fre.FREObject r2 = com.adobe.fre.FREObject.newObject((boolean) r1)     // Catch:{ Exception -> 0x00a1 }
            android.app.Activity r3 = r13.getActivity()     // Catch:{ Exception -> 0x009e }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ Exception -> 0x009e }
            r4.<init>()     // Catch:{ Exception -> 0x009e }
            com.adcolony.sdk.AdColonyAppOptions r5 = new com.adcolony.sdk.AdColonyAppOptions     // Catch:{ Exception -> 0x009e }
            r5.<init>()     // Catch:{ Exception -> 0x009e }
            r13.getClass()     // Catch:{ Exception -> 0x009e }
            java.lang.String r6 = "AdColonyANE"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x009e }
            r7.<init>()     // Catch:{ Exception -> 0x009e }
            java.lang.String r8 = "ADC ConfigureFunction number of args="
            r7.append(r8)     // Catch:{ Exception -> 0x009e }
            int r8 = r14.length     // Catch:{ Exception -> 0x009e }
            r7.append(r8)     // Catch:{ Exception -> 0x009e }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x009e }
            android.util.Log.i(r6, r7)     // Catch:{ Exception -> 0x009e }
            int r6 = r14.length     // Catch:{ Exception -> 0x009e }
            r7 = 3
            if (r6 != r7) goto L_0x009c
            r6 = r14[r1]     // Catch:{ Exception -> 0x009e }
            r7 = 1
            r8 = r14[r7]     // Catch:{ Exception -> 0x009e }
            r9 = 2
            r14 = r14[r9]     // Catch:{ Exception -> 0x009e }
            if (r6 == 0) goto L_0x004a
            java.lang.String r5 = r6.getAsString()     // Catch:{ Exception -> 0x009e }
            com.adcolony.sdk.AdColonyAppOptions r6 = com.adcolony.airadc.AirAdcUtils.parseJsonIntoAppOptions(r5)     // Catch:{ Exception -> 0x009e }
            r13.setAppOptions(r5)     // Catch:{ Exception -> 0x009e }
            r5 = r6
        L_0x004a:
            java.lang.String r6 = "Adobe AIR"
            java.lang.String r9 = "4.4.0"
            r5.setPlugin(r6, r9)     // Catch:{ Exception -> 0x009e }
            if (r8 == 0) goto L_0x0057
            java.lang.String r0 = r8.getAsString()     // Catch:{ Exception -> 0x009e }
        L_0x0057:
            if (r14 == 0) goto L_0x0079
            boolean r6 = r14 instanceof com.adobe.fre.FREArray     // Catch:{ Exception -> 0x009e }
            if (r6 == 0) goto L_0x0079
            com.adobe.fre.FREArray r14 = (com.adobe.fre.FREArray) r14     // Catch:{ Exception -> 0x009e }
        L_0x005f:
            long r8 = (long) r1     // Catch:{ Exception -> 0x009e }
            long r10 = r14.getLength()     // Catch:{ Exception -> 0x009e }
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 >= 0) goto L_0x0076
            com.adobe.fre.FREObject r6 = r14.getObjectAt(r8)     // Catch:{ Exception -> 0x009e }
            java.lang.String r6 = r6.getAsString()     // Catch:{ Exception -> 0x009e }
            r4.add(r6)     // Catch:{ Exception -> 0x009e }
            int r1 = r1 + 1
            goto L_0x005f
        L_0x0076:
            r13.updateAdListeners(r4)     // Catch:{ Exception -> 0x009e }
        L_0x0079:
            if (r0 == 0) goto L_0x0092
            int r14 = r4.size()     // Catch:{ Exception -> 0x009e }
            java.lang.String[] r14 = new java.lang.String[r14]     // Catch:{ Exception -> 0x009e }
            java.lang.Object[] r14 = r4.toArray(r14)     // Catch:{ Exception -> 0x009e }
            java.lang.String[] r14 = (java.lang.String[]) r14     // Catch:{ Exception -> 0x009e }
            boolean r14 = com.adcolony.sdk.AdColony.configure((android.app.Activity) r3, (com.adcolony.sdk.AdColonyAppOptions) r5, (java.lang.String) r0, (java.lang.String[]) r14)     // Catch:{ Exception -> 0x009e }
            com.adobe.fre.FREObject r0 = com.adobe.fre.FREObject.newObject((boolean) r14)     // Catch:{ Exception -> 0x009e }
            r13.configured = r7     // Catch:{ Exception -> 0x00a1 }
            goto L_0x00b1
        L_0x0092:
            r13.getClass()     // Catch:{ Exception -> 0x009e }
            java.lang.String r14 = "AdColonyANE"
            java.lang.String r0 = "AdColony Unable to call configure because an invalid appId was passed."
            android.util.Log.e(r14, r0)     // Catch:{ Exception -> 0x009e }
        L_0x009c:
            r0 = r2
            goto L_0x00b1
        L_0x009e:
            r14 = move-exception
            r0 = r2
            goto L_0x00a2
        L_0x00a1:
            r14 = move-exception
        L_0x00a2:
            r13.getClass()
            java.lang.String r13 = "AdColonyANE"
            java.lang.String r1 = r14.getMessage()
            android.util.Log.i(r13, r1)
            r14.printStackTrace()
        L_0x00b1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.airadc.ConfigureFunction.call(com.adobe.fre.FREContext, com.adobe.fre.FREObject[]):com.adobe.fre.FREObject");
    }
}
