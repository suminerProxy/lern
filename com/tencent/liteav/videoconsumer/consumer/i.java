package com.tencent.liteav.videoconsumer.consumer;

import android.os.Message;
import androidx.annotation.NonNull;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videobase.frame.PixelFrame;
import com.tencent.liteav.videobase.utils.Rotation;
import com.tencent.liteav.videobase.videobase.DisplayTarget;
import com.tencent.liteav.videobase.videobase.IVideoReporter;
import com.tencent.liteav.videoconsumer.decoder.VideoDecodeController;
import com.tencent.liteav.videoconsumer.decoder.VideoDecoderDef;
import com.tencent.liteav.videoconsumer.renderer.VideoRenderListener;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class i {
    private VideoRenderListener A;

    /* renamed from: a  reason: collision with root package name */
    public com.tencent.liteav.base.util.b f12117a;
    @NonNull
    public final IVideoReporter b;
    public com.tencent.liteav.videoconsumer.renderer.f c;

    /* renamed from: d  reason: collision with root package name */
    public com.tencent.liteav.videoconsumer.renderer.f f12118d;

    /* renamed from: e  reason: collision with root package name */
    public VideoDecodeController f12119e;

    /* renamed from: f  reason: collision with root package name */
    public b f12120f;

    /* renamed from: g  reason: collision with root package name */
    public VideoRenderListener f12121g;

    /* renamed from: h  reason: collision with root package name */
    public DisplayTarget f12122h;

    /* renamed from: i  reason: collision with root package name */
    public GLConstants.GLScaleType f12123i;

    /* renamed from: j  reason: collision with root package name */
    public Rotation f12124j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f12125k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final com.tencent.liteav.videobase.utils.e f12126l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f12127m;

    /* renamed from: n  reason: collision with root package name */
    public final com.tencent.liteav.videobase.utils.g f12128n;

    /* renamed from: o  reason: collision with root package name */
    public a f12129o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f12130p;
    public int q;
    public int r;
    public VideoDecoderDef.ConsumerScene s;
    public Object t;
    public final AtomicLong u;
    public final com.tencent.liteav.videoconsumer.renderer.g v;
    public final com.tencent.liteav.videobase.utils.k w;
    public final Runnable x;
    public final VideoDecodeController.a y;
    private VideoRenderListener z;

    /* renamed from: com.tencent.liteav.videoconsumer.consumer.i$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements VideoRenderListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ i f12131a;

        public AnonymousClass1(i iVar) {
        }

        @Override // com.tencent.liteav.videoconsumer.renderer.VideoRenderListener
        public final void onRenderFrame(PixelFrame pixelFrame) {
        }

        @Override // com.tencent.liteav.videoconsumer.renderer.VideoRenderListener
        public final void onRenderTargetSizeChanged(int i2, int i3) {
        }
    }

    /* renamed from: com.tencent.liteav.videoconsumer.consumer.i$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 implements VideoRenderListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ i f12132a;

        public AnonymousClass2(i iVar) {
        }

        @Override // com.tencent.liteav.videoconsumer.renderer.VideoRenderListener
        public final void onRenderFrame(PixelFrame pixelFrame) {
        }

        @Override // com.tencent.liteav.videoconsumer.renderer.VideoRenderListener
        public final void onRenderTargetSizeChanged(int i2, int i3) {
        }
    }

    /* renamed from: com.tencent.liteav.videoconsumer.consumer.i$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass3 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ i f12133a;

        public AnonymousClass3(i iVar) {
        }

        @Override // java.lang.Runnable
        public final void run() {
        }
    }

    /* renamed from: com.tencent.liteav.videoconsumer.consumer.i$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass4 implements VideoDecodeController.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ i f12134a;

        public AnonymousClass4(i iVar) {
        }

        @Override // com.tencent.liteav.videoconsumer.decoder.aw
        public final void onAbandonDecodingFramesCompleted() {
        }

        @Override // com.tencent.liteav.videoconsumer.decoder.aw
        public final void onDecodeCompleted() {
        }

        @Override // com.tencent.liteav.videoconsumer.decoder.aw
        public final void onDecodeFailed() {
        }

        @Override // com.tencent.liteav.videoconsumer.decoder.aw
        public final void onDecodeFrame(PixelFrame pixelFrame, long j2) {
        }

        @Override // com.tencent.liteav.videoconsumer.decoder.aw
        public final void onFrameEnqueuedToDecoder() {
        }

        @Override // com.tencent.liteav.videoconsumer.decoder.aw
        public final void onRequestKeyFrame() {
        }
    }

    /* renamed from: com.tencent.liteav.videoconsumer.consumer.i$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass5 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ i f12135a;

        public AnonymousClass5(i iVar) {
        }

        @Override // java.lang.Runnable
        public final void run() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f12136a = null;
        public static final a b = null;
        public static final a c = null;

        /* renamed from: d  reason: collision with root package name */
        private static final /* synthetic */ a[] f12137d = null;

        private a(String str, int i2) {
        }

        public static a valueOf(String str) {
        }

        public static a[] values() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface b {
    }

    public i(@NonNull IVideoReporter iVideoReporter) {
    }

    public final void a(boolean z) {
    }

    public final void a(com.tencent.liteav.videoconsumer.renderer.f fVar) {
    }

    public final void a(PixelFrame pixelFrame) {
    }

    public final void a(Runnable runnable, String str, boolean z) {
    }

    public final boolean a(@NonNull Message message) {
    }

    public final List<com.tencent.liteav.videoconsumer.renderer.f> a() {
    }
}
