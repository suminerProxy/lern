package com.tencent.liteav.videobase.videobase;

import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import androidx.annotation.NonNull;
import com.tencent.liteav.base.annotations.CalledByNative;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.p;
import com.tencent.rtmp.ui.TXCloudVideoView;
import java.lang.ref.WeakReference;

@JNINamespace("liteav::video")
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class DisplayTarget {
    private int mHeight;
    private Surface mSurface;
    private WeakReference<SurfaceView> mSurfaceView;
    private a mTargetType;
    private WeakReference<TextureView> mTextureView;
    private WeakReference<TXCloudVideoView> mTxCloudVideoView;
    private final com.tencent.liteav.base.util.b mUIHandler;
    private int mWidth;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f12020a = null;
        public static final a b = null;
        public static final a c = null;

        /* renamed from: d  reason: collision with root package name */
        public static final a f12021d = null;

        /* renamed from: e  reason: collision with root package name */
        private static final /* synthetic */ a[] f12022e = null;

        private a(String str, int i2) {
        }

        public static a valueOf(String str) {
        }

        public static a[] values() {
        }
    }

    public DisplayTarget(@NonNull TXCloudVideoView tXCloudVideoView) {
    }

    private void addVideoView() {
    }

    @CalledByNative
    public static DisplayTarget createDisplayTarget(TXCloudVideoView tXCloudVideoView) {
    }

    public static /* synthetic */ void lambda$addVideoView$1(DisplayTarget displayTarget) {
    }

    public static /* synthetic */ void lambda$removeVideoView$2(DisplayTarget displayTarget) {
    }

    public static /* synthetic */ void lambda$setVisibility$0(View view, int i2) {
    }

    private void removeVideoView() {
    }

    private void runOnUIThread(Runnable runnable) {
    }

    private void setVisibility(View view, int i2) {
    }

    public boolean equals(Object obj) {
    }

    public int getHeight() {
    }

    public p getSize() {
    }

    public Surface getSurface() {
    }

    public SurfaceView getSurfaceView() {
    }

    public TXCloudVideoView getTXCloudVideoView() {
    }

    public TextureView getTextureView() {
    }

    public a getType() {
    }

    public int getWidth() {
    }

    public void hideAll() {
    }

    public void setSurfaceView(SurfaceView surfaceView) {
    }

    public void setTextureView(TextureView textureView) {
    }

    public void showAll() {
    }

    public String toString() {
    }

    public DisplayTarget(TextureView textureView) {
    }

    public DisplayTarget(SurfaceView surfaceView) {
    }

    public DisplayTarget(Surface surface, int i2, int i3) {
    }

    public DisplayTarget(DisplayTarget displayTarget) {
    }
}
