package com.tencent.liteav.videoproducer.preprocessor;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.tencent.liteav.beauty.b.h;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videobase.frame.PixelFrame;
import com.tencent.liteav.videobase.videobase.IVideoReporter;
import com.tencent.liteav.videobase.videobase.e;
import com.tencent.liteav.videoproducer.capture.CaptureSourceInterface;
import java.nio.FloatBuffer;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class h implements com.tencent.liteav.videobase.base.a {
    @NonNull

    /* renamed from: a  reason: collision with root package name */
    public final IVideoReporter f12693a;
    @NonNull
    public final com.tencent.liteav.videobase.utils.e b;
    @NonNull
    public final BeautyProcessor c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final com.tencent.liteav.videobase.a.h f12694d;

    /* renamed from: e  reason: collision with root package name */
    public CaptureSourceInterface.SourceType f12695e;

    /* renamed from: f  reason: collision with root package name */
    public int f12696f;

    /* renamed from: g  reason: collision with root package name */
    public int f12697g;

    /* renamed from: h  reason: collision with root package name */
    public Object f12698h;

    /* renamed from: i  reason: collision with root package name */
    public com.tencent.liteav.videobase.b.e f12699i;

    /* renamed from: j  reason: collision with root package name */
    public com.tencent.liteav.videobase.frame.j f12700j;

    /* renamed from: k  reason: collision with root package name */
    public com.tencent.liteav.videobase.frame.e f12701k;

    /* renamed from: l  reason: collision with root package name */
    public com.tencent.liteav.videobase.a.a f12702l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final com.tencent.liteav.videobase.videobase.e f12703m;

    /* renamed from: n  reason: collision with root package name */
    public com.tencent.liteav.videobase.videobase.e f12704n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final List<c> f12705o;

    /* renamed from: p  reason: collision with root package name */
    public final List<c> f12706p;
    @NonNull
    private final Context q;
    @NonNull
    private final FloatBuffer r;
    @NonNull
    private final FloatBuffer s;
    @NonNull
    private final com.tencent.liteav.videobase.a.b[] t;
    private Boolean u;
    private final h.a v;

    /* renamed from: com.tencent.liteav.videoproducer.preprocessor.h$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements h.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ h f12707a;

        public AnonymousClass1(h hVar) {
        }
    }

    /* renamed from: com.tencent.liteav.videoproducer.preprocessor.h$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f12708a = null;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class a extends com.tencent.liteav.videobase.a.a {
        private final com.tencent.liteav.videobase.videobase.e b;

        public a(com.tencent.liteav.videobase.videobase.e eVar) {
        }

        @Override // com.tencent.liteav.videobase.a.a
        public final com.tencent.liteav.videobase.frame.d a(long j2, com.tencent.liteav.videobase.frame.d dVar) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static final int f12709a = 1;
        public static final int b = 2;
        public static final int c = 3;

        /* renamed from: d  reason: collision with root package name */
        public static final int f12710d = 4;

        /* renamed from: e  reason: collision with root package name */
        public static final int f12711e = 5;

        /* renamed from: f  reason: collision with root package name */
        private static final /* synthetic */ int[] f12712f = null;

        public static int[] a() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class c implements e.a {

        /* renamed from: a  reason: collision with root package name */
        public int f12713a;
        public com.tencent.liteav.videobase.videobase.a b;
        public GLConstants.PixelBufferType c;

        /* renamed from: d  reason: collision with root package name */
        public GLConstants.PixelFormatType f12714d;

        /* renamed from: e  reason: collision with root package name */
        public ah f12715e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ h f12716f;

        public c(h hVar, int i2, com.tencent.liteav.videobase.videobase.a aVar, GLConstants.PixelBufferType pixelBufferType, GLConstants.PixelFormatType pixelFormatType, ah ahVar) {
        }

        @Override // com.tencent.liteav.videobase.videobase.e.a
        public final void onFrameConverted(int i2, PixelFrame pixelFrame) {
        }
    }

    public h(@NonNull Context context, @NonNull BeautyProcessor beautyProcessor, @NonNull IVideoReporter iVideoReporter) {
    }

    public final void a(PixelFrame pixelFrame) {
    }

    public final <T> T b(int i2) {
    }

    public final void c(int i2) {
    }

    public final void b() {
    }

    public final void c() {
    }

    public final void a(float f2, Bitmap bitmap, float f3, Bitmap bitmap2, float f4) {
    }

    public final void a() {
    }

    public final <T> T a(int i2) {
    }

    public static void a(c cVar, List<c> list) {
    }

    public static c a(int i2, ah ahVar, List<c> list) {
    }
}
