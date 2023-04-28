package com.tencent.android.tpns.mqtt.internal.wire;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class MultiByteArrayInputStream extends InputStream {
    private byte[] bytesA;
    private byte[] bytesB;
    private int lengthA;
    private int lengthB;
    private int offsetA;
    private int offsetB;
    private int pos;

    public MultiByteArrayInputStream(byte[] bArr, int i2, int i3, byte[] bArr2, int i4, int i5) {
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
    }
}
