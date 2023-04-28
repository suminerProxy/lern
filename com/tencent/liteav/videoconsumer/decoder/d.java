package com.tencent.liteav.videoconsumer.decoder;

import androidx.annotation.NonNull;
import com.tencent.liteav.videobase.common.EncodedVideoFrame;
import com.tencent.liteav.videobase.videobase.IVideoReporter;
import com.tencent.liteav.videoconsumer.decoder.VideoDecodeController;
import com.tencent.liteav.videoconsumer.decoder.av;
import java.nio.ByteBuffer;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class d {
    @NonNull

    /* renamed from: a  reason: collision with root package name */
    public final InterfaceC0201d f12222a;
    @NonNull
    public final IVideoReporter b;
    @NonNull
    public final SpsInfo c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f12223d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f12224e;

    /* renamed from: f  reason: collision with root package name */
    public VideoDecodeController.DecodeStrategy f12225f;

    /* renamed from: g  reason: collision with root package name */
    public av.a f12226g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f12227h;

    /* renamed from: i  reason: collision with root package name */
    public e f12228i;

    /* renamed from: j  reason: collision with root package name */
    public long f12229j;

    /* renamed from: k  reason: collision with root package name */
    public long f12230k;

    /* renamed from: l  reason: collision with root package name */
    public int f12231l;

    /* renamed from: m  reason: collision with root package name */
    public int f12232m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f12233n;

    /* renamed from: o  reason: collision with root package name */
    public int f12234o;

    /* renamed from: p  reason: collision with root package name */
    public int f12235p;
    public boolean q;
    public int r;
    public int s;
    public boolean t;

    /* renamed from: com.tencent.liteav.videoconsumer.decoder.d$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f12236a = null;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface a {
        b a(EncodedVideoFrame encodedVideoFrame);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final c f12237a;
        public final e b;

        public b(c cVar, e eVar) {
        }

        public final String toString() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public static final c f12238a = null;
        public static final c b = null;
        public static final c c = null;

        /* renamed from: d  reason: collision with root package name */
        public static final c f12239d = null;

        /* renamed from: e  reason: collision with root package name */
        public static final c f12240e = null;

        /* renamed from: f  reason: collision with root package name */
        public static final c f12241f = null;

        /* renamed from: g  reason: collision with root package name */
        public static final c f12242g = null;

        /* renamed from: h  reason: collision with root package name */
        private static final /* synthetic */ c[] f12243h = null;
        private final int mPriority;

        private c(String str, int i2, int i3) {
        }

        public static /* synthetic */ int a(c cVar) {
        }

        public static c valueOf(String str) {
        }

        public static c[] values() {
        }
    }

    /* renamed from: com.tencent.liteav.videoconsumer.decoder.d$d  reason: collision with other inner class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface InterfaceC0201d {
        SpsInfo a(boolean z, ByteBuffer byteBuffer);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        public static final e f12244a = null;
        public static final e b = null;
        public static final e c = null;

        /* renamed from: d  reason: collision with root package name */
        public static final e f12245d = null;

        /* renamed from: e  reason: collision with root package name */
        public static final e f12246e = null;

        /* renamed from: f  reason: collision with root package name */
        public static final e f12247f = null;

        /* renamed from: g  reason: collision with root package name */
        private static final /* synthetic */ e[] f12248g = null;
        public final int mPriority;

        private e(String str, int i2, int i3) {
        }

        public static e valueOf(String str) {
        }

        public static e[] values() {
        }
    }

    public d(@NonNull InterfaceC0201d interfaceC0201d, @NonNull IVideoReporter iVideoReporter, boolean z, boolean z2) {
    }

    public final boolean a(EncodedVideoFrame encodedVideoFrame) {
    }

    public final boolean b(EncodedVideoFrame encodedVideoFrame) {
    }

    public final void a() {
    }
}
