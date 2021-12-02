package com.adcolony.sdk;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.adcolony.sdk.i0 */
class C0145i0 extends InputStream {

    /* renamed from: a */
    InputStream f946a;

    /* renamed from: b */
    int f947b;

    C0145i0(InputStream inputStream, int i, int i2) throws IOException {
        this.f946a = inputStream;
        while (i > 0) {
            i -= (int) inputStream.skip((long) i);
        }
        this.f947b = i2;
    }

    public int available() throws IOException {
        int available = this.f946a.available();
        int i = this.f947b;
        return available <= i ? available : i;
    }

    public void close() throws IOException {
        this.f946a.close();
    }

    public int read() throws IOException {
        int i = this.f947b;
        if (i == 0) {
            return -1;
        }
        this.f947b = i - 1;
        return this.f946a.read();
    }

    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f947b;
        if (i3 == 0) {
            return -1;
        }
        if (i2 > i3) {
            i2 = i3;
        }
        int read = this.f946a.read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        this.f947b -= read;
        return read;
    }

    public long skip(long j) throws IOException {
        int i = (int) j;
        if (i <= 0) {
            return 0;
        }
        int i2 = this.f947b;
        if (i > i2) {
            i = i2;
        }
        this.f947b = i2 - i;
        while (i > 0) {
            i -= (int) this.f946a.skip(j);
        }
        return j;
    }
}
