package com.tencent.cloud.huiyansdkface.okhttp3;

import com.tencent.cloud.huiyansdkface.okhttp3.internal.cache.CacheRequest;
import com.tencent.cloud.huiyansdkface.okhttp3.internal.cache.CacheStrategy;
import com.tencent.cloud.huiyansdkface.okhttp3.internal.cache.DiskLruCache;
import com.tencent.cloud.huiyansdkface.okhttp3.internal.cache.InternalCache;
import com.tencent.cloud.huiyansdkface.okhttp3.internal.io.FileSystem;
import com.tencent.cloud.huiyansdkface.okio.BufferedSink;
import com.tencent.cloud.huiyansdkface.okio.BufferedSource;
import com.tencent.cloud.huiyansdkface.okio.ForwardingSink;
import com.tencent.cloud.huiyansdkface.okio.ForwardingSource;
import com.tencent.cloud.huiyansdkface.okio.Sink;
import com.tencent.cloud.huiyansdkface.okio.Source;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.util.Iterator;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class Cache implements Closeable, Flushable {

    /* renamed from: a  reason: collision with root package name */
    public final InternalCache f10587a;
    public final DiskLruCache b;
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public int f10588d;

    /* renamed from: e  reason: collision with root package name */
    private int f10589e;

    /* renamed from: f  reason: collision with root package name */
    private int f10590f;

    /* renamed from: g  reason: collision with root package name */
    private int f10591g;

    /* renamed from: com.tencent.cloud.huiyansdkface.okhttp3.Cache$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements InternalCache {

        /* renamed from: a  reason: collision with root package name */
        private /* synthetic */ Cache f10592a;

        public AnonymousClass1(Cache cache) {
        }

        @Override // com.tencent.cloud.huiyansdkface.okhttp3.internal.cache.InternalCache
        public Response get(Request request) throws IOException {
        }

        @Override // com.tencent.cloud.huiyansdkface.okhttp3.internal.cache.InternalCache
        public CacheRequest put(Response response) throws IOException {
        }

        @Override // com.tencent.cloud.huiyansdkface.okhttp3.internal.cache.InternalCache
        public void remove(Request request) throws IOException {
        }

        @Override // com.tencent.cloud.huiyansdkface.okhttp3.internal.cache.InternalCache
        public void trackConditionalCacheHit() {
        }

        @Override // com.tencent.cloud.huiyansdkface.okhttp3.internal.cache.InternalCache
        public void trackResponse(CacheStrategy cacheStrategy) {
        }

        @Override // com.tencent.cloud.huiyansdkface.okhttp3.internal.cache.InternalCache
        public void update(Response response, Response response2) {
        }
    }

    /* renamed from: com.tencent.cloud.huiyansdkface.okhttp3.Cache$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 implements Iterator<String> {

        /* renamed from: a  reason: collision with root package name */
        private Iterator<DiskLruCache.Snapshot> f10593a;
        private String b;
        private boolean c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Cache f10594d;

        public AnonymousClass2(Cache cache) throws IOException {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ String next() {
        }

        @Override // java.util.Iterator
        /* renamed from: next  reason: avoid collision after fix types in other method */
        public String next2() {
        }

        @Override // java.util.Iterator
        public void remove() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public final class CacheRequestImpl implements CacheRequest {

        /* renamed from: a  reason: collision with root package name */
        public boolean f10595a;
        public final /* synthetic */ Cache b;
        private final DiskLruCache.Editor c;

        /* renamed from: d  reason: collision with root package name */
        private Sink f10596d;

        /* renamed from: e  reason: collision with root package name */
        private Sink f10597e;

        /* renamed from: com.tencent.cloud.huiyansdkface.okhttp3.Cache$CacheRequestImpl$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass1 extends ForwardingSink {

            /* renamed from: a  reason: collision with root package name */
            private /* synthetic */ DiskLruCache.Editor f10598a;
            private /* synthetic */ CacheRequestImpl b;

            public AnonymousClass1(CacheRequestImpl cacheRequestImpl, Sink sink, Cache cache, DiskLruCache.Editor editor) {
            }

            @Override // com.tencent.cloud.huiyansdkface.okio.ForwardingSink, com.tencent.cloud.huiyansdkface.okio.Sink, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
            }
        }

        public CacheRequestImpl(Cache cache, DiskLruCache.Editor editor) {
        }

        @Override // com.tencent.cloud.huiyansdkface.okhttp3.internal.cache.CacheRequest
        public final void abort() {
        }

        @Override // com.tencent.cloud.huiyansdkface.okhttp3.internal.cache.CacheRequest
        public final Sink body() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class CacheResponseBody extends ResponseBody {

        /* renamed from: a  reason: collision with root package name */
        public final DiskLruCache.Snapshot f10599a;
        private final BufferedSource b;
        private final String c;

        /* renamed from: d  reason: collision with root package name */
        private final String f10600d;

        /* renamed from: com.tencent.cloud.huiyansdkface.okhttp3.Cache$CacheResponseBody$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass1 extends ForwardingSource {

            /* renamed from: a  reason: collision with root package name */
            private /* synthetic */ DiskLruCache.Snapshot f10601a;

            public AnonymousClass1(CacheResponseBody cacheResponseBody, Source source, DiskLruCache.Snapshot snapshot) {
            }

            @Override // com.tencent.cloud.huiyansdkface.okio.ForwardingSource, com.tencent.cloud.huiyansdkface.okio.Source, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
            }
        }

        public CacheResponseBody(DiskLruCache.Snapshot snapshot, String str, String str2) {
        }

        @Override // com.tencent.cloud.huiyansdkface.okhttp3.ResponseBody
        public long contentLength() {
        }

        @Override // com.tencent.cloud.huiyansdkface.okhttp3.ResponseBody
        public MediaType contentType() {
        }

        @Override // com.tencent.cloud.huiyansdkface.okhttp3.ResponseBody
        public BufferedSource source() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class Entry {

        /* renamed from: a  reason: collision with root package name */
        private static final String f10602a = null;
        private static final String b = null;
        private final String c;

        /* renamed from: d  reason: collision with root package name */
        private final Headers f10603d;

        /* renamed from: e  reason: collision with root package name */
        private final String f10604e;

        /* renamed from: f  reason: collision with root package name */
        private final Protocol f10605f;

        /* renamed from: g  reason: collision with root package name */
        private final int f10606g;

        /* renamed from: h  reason: collision with root package name */
        private final String f10607h;

        /* renamed from: i  reason: collision with root package name */
        private final Headers f10608i;

        /* renamed from: j  reason: collision with root package name */
        private final Handshake f10609j;

        /* renamed from: k  reason: collision with root package name */
        private final long f10610k;

        /* renamed from: l  reason: collision with root package name */
        private final long f10611l;

        public Entry(Response response) {
        }

        public Entry(Source source) throws IOException {
        }

        private static List<Certificate> a(BufferedSource bufferedSource) throws IOException {
        }

        private static void a(BufferedSink bufferedSink, List<Certificate> list) throws IOException {
        }

        private boolean a() {
        }

        public final boolean matches(Request request, Response response) {
        }

        public final Response response(DiskLruCache.Snapshot snapshot) {
        }

        public final void writeTo(DiskLruCache.Editor editor) throws IOException {
        }
    }

    public Cache(File file, long j2) {
    }

    private Cache(File file, long j2, FileSystem fileSystem) {
    }

    public static int a(BufferedSource bufferedSource) throws IOException {
    }

    private static void a(DiskLruCache.Editor editor) {
    }

    public static String key(HttpUrl httpUrl) {
    }

    public final Response a(Request request) {
    }

    public final CacheRequest a(Response response) {
    }

    public final synchronized void a() {
    }

    public final void a(Response response, Response response2) {
    }

    public final synchronized void a(CacheStrategy cacheStrategy) {
    }

    public final void b(Request request) throws IOException {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }

    public final void delete() throws IOException {
    }

    public final File directory() {
    }

    public final void evictAll() throws IOException {
    }

    @Override // java.io.Flushable
    public final void flush() throws IOException {
    }

    public final synchronized int hitCount() {
    }

    public final void initialize() throws IOException {
    }

    public final boolean isClosed() {
    }

    public final long maxSize() {
    }

    public final synchronized int networkCount() {
    }

    public final synchronized int requestCount() {
    }

    public final long size() throws IOException {
    }

    public final Iterator<String> urls() throws IOException {
    }

    public final synchronized int writeAbortCount() {
    }

    public final synchronized int writeSuccessCount() {
    }
}
