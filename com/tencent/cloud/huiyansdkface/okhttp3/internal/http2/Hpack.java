package com.tencent.cloud.huiyansdkface.okhttp3.internal.http2;

import com.tencent.cloud.huiyansdkface.okio.Buffer;
import com.tencent.cloud.huiyansdkface.okio.BufferedSource;
import com.tencent.cloud.huiyansdkface.okio.ByteString;
import com.tencent.cloud.huiyansdkface.okio.Source;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class Hpack {

    /* renamed from: a  reason: collision with root package name */
    public static final Header[] f10980a = null;
    public static final Map<ByteString, Integer> b = null;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class Reader {

        /* renamed from: a  reason: collision with root package name */
        private final List<Header> f10981a;
        private final BufferedSource b;
        private final int c;

        /* renamed from: d  reason: collision with root package name */
        private int f10982d;

        /* renamed from: e  reason: collision with root package name */
        private Header[] f10983e;

        /* renamed from: f  reason: collision with root package name */
        private int f10984f;

        /* renamed from: g  reason: collision with root package name */
        private int f10985g;

        /* renamed from: h  reason: collision with root package name */
        private int f10986h;

        private Reader(int i2, int i3, Source source) {
        }

        public Reader(int i2, Source source) {
        }

        private int a(int i2) {
        }

        private int a(int i2, int i3) throws IOException {
        }

        private void a(int i2, Header header) {
        }

        private int b(int i2) {
        }

        private void b() {
        }

        private ByteString c(int i2) throws IOException {
        }

        private void c() {
        }

        private int d() throws IOException {
        }

        private static boolean d(int i2) {
        }

        private ByteString e() throws IOException {
        }

        public final void a() throws IOException {
        }

        public final List<Header> getAndResetHeaderList() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class Writer {

        /* renamed from: a  reason: collision with root package name */
        private final Buffer f10987a;
        private final boolean b;
        private int c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f10988d;

        /* renamed from: e  reason: collision with root package name */
        private int f10989e;

        /* renamed from: f  reason: collision with root package name */
        private Header[] f10990f;

        /* renamed from: g  reason: collision with root package name */
        private int f10991g;

        /* renamed from: h  reason: collision with root package name */
        private int f10992h;

        /* renamed from: i  reason: collision with root package name */
        private int f10993i;

        private Writer(int i2, boolean z, Buffer buffer) {
        }

        public Writer(Buffer buffer) {
        }

        private void a() {
        }

        private void a(int i2, int i3, int i4) {
        }

        private void a(Header header) {
        }

        private void a(ByteString byteString) throws IOException {
        }

        private int b(int i2) {
        }

        public final void a(int i2) {
        }

        public final void a(List<Header> list) throws IOException {
        }
    }

    private Hpack() {
    }

    public static ByteString a(ByteString byteString) throws IOException {
    }
}
