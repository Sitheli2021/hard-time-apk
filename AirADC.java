package com.adcolony.airadc;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREExtension;

public class AirADC implements FREExtension {
    private static final String EXT_NAME = "AirADC";
    private FREContext context;

    public FREContext createContext(String str) {
        if (this.context == null) {
            this.context = new AirAdcContext(EXT_NAME);
        }
        return this.context;
    }

    public void dispose() {
    }

    public void initialize() {
    }
}
