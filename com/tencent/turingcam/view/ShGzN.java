package com.tencent.turingcam.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.TextureView;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class ShGzN extends TextureView implements TextureView.SurfaceTextureListener {

    /* renamed from: a  reason: collision with root package name */
    private spXPg f13902a;
    private AtomicBoolean b;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface spXPg {
        void onSurfaceTextureAvailable(SurfaceTexture surface, int width, int height);

        boolean onSurfaceTextureDestroyed(SurfaceTexture surface);
    }

    public ShGzN(Context context, AttributeSet attrs) {
    }

    private void a() {
    }

    @Override // android.view.TextureView
    public Bitmap getBitmap() {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surface, int width, int height) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surface) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surface, int width, int height) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surface) {
    }

    public ShGzN(Context context, AttributeSet attrs, int defStyleAttr) {
    }

    public void a(spXPg lifeCallBack) {
    }
}
