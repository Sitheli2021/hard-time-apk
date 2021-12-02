package com.adcolony.sdk;

/* renamed from: com.adcolony.sdk.e */
class C0080e {

    /* renamed from: a */
    private boolean f247a;

    C0080e() {
    }

    /* renamed from: a */
    public synchronized void mo375a(long j) {
        if (!this.f247a) {
            try {
                wait(j);
            } catch (InterruptedException unused) {
            }
        }
    }

    /* renamed from: a */
    public synchronized void mo376a(boolean z) {
        this.f247a = z;
        if (z) {
            notifyAll();
        }
    }

    /* renamed from: a */
    public boolean mo377a() {
        return this.f247a;
    }
}
