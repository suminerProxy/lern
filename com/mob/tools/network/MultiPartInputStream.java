package com.mob.tools.network;

import com.mob.tools.proguard.PublicMemberKeeper;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class MultiPartInputStream extends InputStream implements PublicMemberKeeper {

    /* renamed from: a  reason: collision with root package name */
    private ArrayList<InputStream> f4434a;
    private int b;

    private boolean a() {
    }

    public void addInputStream(InputStream inputStream) throws Throwable {
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
    }

    @Override // java.io.InputStream
    public long skip(long j2) throws IOException {
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i2, int i3) throws IOException {
    }
}
