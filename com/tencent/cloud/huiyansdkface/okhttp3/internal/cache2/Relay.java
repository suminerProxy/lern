package com.tencent.cloud.huiyansdkface.okhttp3.internal.cache2;

import com.tencent.cloud.huiyansdkface.okio.Buffer;
import com.tencent.cloud.huiyansdkface.okio.ByteString;
import com.tencent.cloud.huiyansdkface.okio.Source;
import com.tencent.cloud.huiyansdkface.okio.Timeout;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class Relay {

    /* renamed from: j  reason: collision with root package name */
    private static ByteString f10881j;

    /* renamed from: k  reason: collision with root package name */
    private static ByteString f10882k;

    /* renamed from: a  reason: collision with root package name */
    public RandomAccessFile f10883a;
    public Thread b;
    public Source c;

    /* renamed from: d  reason: collision with root package name */
    public final Buffer f10884d;

    /* renamed from: e  reason: collision with root package name */
    public long f10885e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f10886f;

    /* renamed from: g  reason: collision with root package name */
    public final Buffer f10887g;

    /* renamed from: h  reason: collision with root package name */
    public final long f10888h;

    /* renamed from: i  reason: collision with root package name */
    public int f10889i;

    /* renamed from: l  reason: collision with root package name */
    private final ByteString f10890l;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class RelaySource implements Source {

        /* renamed from: a  reason: collision with root package name */
        private final Timeout f10891a;
        private FileOperator b;
        private long c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Relay f10892d;

        public RelaySource(Relay relay) {
        }

        @Override // com.tencent.cloud.huiyansdkface.okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        @Override // com.tencent.cloud.huiyansdkface.okio.Source
        public long read(Buffer buffer, long j2) throws IOException {
        }

        @Override // com.tencent.cloud.huiyansdkface.okio.Source
        public Timeout timeout() {
        }
    }

    private Relay(RandomAccessFile randomAccessFile, Source source, long j2, ByteString byteString, long j3) {
    }

    private void a(ByteString byteString, long j2, long j3) throws IOException {
    }

    public static Relay edit(File file, Source source, ByteString byteString, long j2) throws IOException {
    }

    public static Relay read(File file) throws IOException {
    }

    public final void a(long j2) throws IOException {
    }

    public final ByteString metadata() {
    }

    public final Source newSource() {
    }
}
