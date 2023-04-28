package com.tencent.cloud.huiyansdkface.okhttp3.internal.cache;

import com.tencent.cloud.huiyansdkface.okhttp3.internal.io.FileSystem;
import com.tencent.cloud.huiyansdkface.okio.BufferedSink;
import com.tencent.cloud.huiyansdkface.okio.Sink;
import com.tencent.cloud.huiyansdkface.okio.Source;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class DiskLruCache implements Closeable, Flushable {

    /* renamed from: l  reason: collision with root package name */
    private static Pattern f10849l;
    private static /* synthetic */ boolean v;

    /* renamed from: a  reason: collision with root package name */
    public final FileSystem f10850a;
    public final File b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public BufferedSink f10851d;

    /* renamed from: e  reason: collision with root package name */
    public final LinkedHashMap<String, Entry> f10852e;

    /* renamed from: f  reason: collision with root package name */
    public int f10853f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f10854g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f10855h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f10856i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f10857j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f10858k;

    /* renamed from: m  reason: collision with root package name */
    private final File f10859m;

    /* renamed from: n  reason: collision with root package name */
    private final File f10860n;

    /* renamed from: o  reason: collision with root package name */
    private final File f10861o;

    /* renamed from: p  reason: collision with root package name */
    private final int f10862p;
    private long q;
    private long r;
    private long s;
    private final Executor t;
    private final Runnable u;

    /* renamed from: com.tencent.cloud.huiyansdkface.okhttp3.internal.cache.DiskLruCache$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private /* synthetic */ DiskLruCache f10863a;

        public AnonymousClass1(DiskLruCache diskLruCache) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.tencent.cloud.huiyansdkface.okhttp3.internal.cache.DiskLruCache$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 extends FaultHidingSink {

        /* renamed from: a  reason: collision with root package name */
        private static /* synthetic */ boolean f10864a;
        private /* synthetic */ DiskLruCache b;

        public AnonymousClass2(DiskLruCache diskLruCache, Sink sink) {
        }

        @Override // com.tencent.cloud.huiyansdkface.okhttp3.internal.cache.FaultHidingSink
        public final void a() {
        }
    }

    /* renamed from: com.tencent.cloud.huiyansdkface.okhttp3.internal.cache.DiskLruCache$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass3 implements Iterator<Snapshot> {

        /* renamed from: a  reason: collision with root package name */
        private Iterator<Entry> f10865a;
        private Snapshot b;
        private Snapshot c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ DiskLruCache f10866d;

        public AnonymousClass3(DiskLruCache diskLruCache) {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        public Snapshot next() {
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Snapshot next() {
        }

        @Override // java.util.Iterator
        public void remove() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public final class Editor {

        /* renamed from: a  reason: collision with root package name */
        public final Entry f10867a;
        public final boolean[] b;
        public final /* synthetic */ DiskLruCache c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f10868d;

        /* renamed from: com.tencent.cloud.huiyansdkface.okhttp3.internal.cache.DiskLruCache$Editor$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass1 extends FaultHidingSink {

            /* renamed from: a  reason: collision with root package name */
            private /* synthetic */ Editor f10869a;

            public AnonymousClass1(Editor editor, Sink sink) {
            }

            @Override // com.tencent.cloud.huiyansdkface.okhttp3.internal.cache.FaultHidingSink
            public final void a() {
            }
        }

        public Editor(DiskLruCache diskLruCache, Entry entry) {
        }

        public final void a() {
        }

        public final void abort() throws IOException {
        }

        public final void abortUnlessCommitted() {
        }

        public final void commit() throws IOException {
        }

        public final Sink newSink(int i2) {
        }

        public final Source newSource(int i2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public final class Entry {

        /* renamed from: a  reason: collision with root package name */
        public final String f10870a;
        public final long[] b;
        public final File[] c;

        /* renamed from: d  reason: collision with root package name */
        public final File[] f10871d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f10872e;

        /* renamed from: f  reason: collision with root package name */
        public Editor f10873f;

        /* renamed from: g  reason: collision with root package name */
        public long f10874g;

        /* renamed from: h  reason: collision with root package name */
        private /* synthetic */ DiskLruCache f10875h;

        public Entry(DiskLruCache diskLruCache, String str) {
        }

        private static IOException b(String[] strArr) throws IOException {
        }

        public final Snapshot a() {
        }

        public final void a(BufferedSink bufferedSink) throws IOException {
        }

        public final void a(String[] strArr) throws IOException {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public final class Snapshot implements Closeable {

        /* renamed from: a  reason: collision with root package name */
        private final String f10876a;
        private final long b;
        private final Source[] c;

        /* renamed from: d  reason: collision with root package name */
        private final long[] f10877d;

        /* renamed from: e  reason: collision with root package name */
        private /* synthetic */ DiskLruCache f10878e;

        public Snapshot(DiskLruCache diskLruCache, String str, long j2, Source[] sourceArr, long[] jArr) {
        }

        public static /* synthetic */ String a(Snapshot snapshot) {
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }

        public final Editor edit() throws IOException {
        }

        public final long getLength(int i2) {
        }

        public final Source getSource(int i2) {
        }

        public final String key() {
        }
    }

    private DiskLruCache(FileSystem fileSystem, File file, int i2, int i3, long j2, Executor executor) {
    }

    private static void a(String str) {
    }

    public static DiskLruCache create(FileSystem fileSystem, File file, int i2, int i3, long j2) {
    }

    private void d() throws IOException {
    }

    private BufferedSink e() throws FileNotFoundException {
    }

    private void f() throws IOException {
    }

    private synchronized void g() {
    }

    public final synchronized Editor a(String str, long j2) throws IOException {
    }

    public final synchronized void a() throws IOException {
    }

    public final synchronized void a(Editor editor, boolean z) throws IOException {
    }

    public final boolean a(Entry entry) throws IOException {
    }

    public final boolean b() {
    }

    public final void c() throws IOException {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
    }

    public final void delete() throws IOException {
    }

    public final Editor edit(String str) throws IOException {
    }

    public final synchronized void evictAll() throws IOException {
    }

    @Override // java.io.Flushable
    public final synchronized void flush() throws IOException {
    }

    public final synchronized Snapshot get(String str) throws IOException {
    }

    public final File getDirectory() {
    }

    public final synchronized long getMaxSize() {
    }

    public final synchronized void initialize() throws IOException {
    }

    public final synchronized boolean isClosed() {
    }

    public final synchronized boolean remove(String str) throws IOException {
    }

    public final synchronized void setMaxSize(long j2) {
    }

    public final synchronized long size() throws IOException {
    }

    public final synchronized Iterator<Snapshot> snapshots() throws IOException {
    }
}
