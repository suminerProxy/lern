package com.tencent.thumbplayer.a;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.io.FileDescriptor;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private static b f12947a;
    private HandlerThread b;
    private c c;

    /* renamed from: d  reason: collision with root package name */
    private MediaMetadataRetriever f12948d;

    /* renamed from: e  reason: collision with root package name */
    private int f12949e;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface a {
        void a(int i2, int i3);

        void a(int i2, long j2, int i3, int i4, Bitmap bitmap, long j3);
    }

    /* renamed from: com.tencent.thumbplayer.a.b$b  reason: collision with other inner class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class C0239b {

        /* renamed from: a  reason: collision with root package name */
        public a f12950a;
        private int b;
        private String c;

        /* renamed from: d  reason: collision with root package name */
        private FileDescriptor f12951d;

        /* renamed from: e  reason: collision with root package name */
        private AssetFileDescriptor f12952e;

        /* renamed from: f  reason: collision with root package name */
        private long f12953f;

        /* renamed from: g  reason: collision with root package name */
        private int f12954g;

        /* renamed from: h  reason: collision with root package name */
        private int f12955h;

        private C0239b() {
        }

        public /* synthetic */ C0239b(AnonymousClass1 anonymousClass1) {
        }

        public static /* synthetic */ int a(C0239b c0239b, int i2) {
        }

        public static /* synthetic */ long a(C0239b c0239b, long j2) {
        }

        public static /* synthetic */ AssetFileDescriptor a(C0239b c0239b, AssetFileDescriptor assetFileDescriptor) {
        }

        public static /* synthetic */ FileDescriptor a(C0239b c0239b) {
        }

        public static /* synthetic */ FileDescriptor a(C0239b c0239b, FileDescriptor fileDescriptor) {
        }

        public static /* synthetic */ String a(C0239b c0239b, String str) {
        }

        public static /* synthetic */ int b(C0239b c0239b, int i2) {
        }

        public static /* synthetic */ AssetFileDescriptor b(C0239b c0239b) {
        }

        public static /* synthetic */ int c(C0239b c0239b, int i2) {
        }

        public static /* synthetic */ String c(C0239b c0239b) {
        }

        public static /* synthetic */ long d(C0239b c0239b) {
        }

        public static /* synthetic */ int e(C0239b c0239b) {
        }

        public static /* synthetic */ int f(C0239b c0239b) {
        }

        public static /* synthetic */ int g(C0239b c0239b) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class c extends Handler {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f12956a;

        public c(b bVar, Looper looper) {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public String f12957a;
        public FileDescriptor b;
        public AssetFileDescriptor c;

        /* renamed from: d  reason: collision with root package name */
        public long f12958d;

        /* renamed from: e  reason: collision with root package name */
        public int f12959e;

        /* renamed from: f  reason: collision with root package name */
        public int f12960f;
    }

    private b() {
    }

    public static /* synthetic */ MediaMetadataRetriever a(b bVar) {
    }

    public static /* synthetic */ MediaMetadataRetriever a(b bVar, MediaMetadataRetriever mediaMetadataRetriever) {
    }

    public static synchronized b a() {
    }

    private void a(C0239b c0239b) {
    }

    public static /* synthetic */ void a(b bVar, C0239b c0239b) {
    }

    public int a(d dVar, a aVar) {
    }
}
