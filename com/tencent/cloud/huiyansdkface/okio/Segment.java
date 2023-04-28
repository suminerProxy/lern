package com.tencent.cloud.huiyansdkface.okio;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class Segment {
    public static final int SHARE_MINIMUM = 1024;
    public static final int SIZE = 8192;
    public final byte[] data;
    public int limit;
    public Segment next;
    public boolean owner;
    public int pos;
    public Segment prev;
    public boolean shared;

    public Segment() {
    }

    public Segment(byte[] bArr, int i2, int i3, boolean z, boolean z2) {
    }

    public final void compact() {
    }

    public final Segment pop() {
    }

    public final Segment push(Segment segment) {
    }

    public final Segment sharedCopy() {
    }

    public final Segment split(int i2) {
    }

    public final Segment unsharedCopy() {
    }

    public final void writeTo(Segment segment, int i2) {
    }
}
