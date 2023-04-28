package com.tencent.turingcam.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class spXPg extends SurfaceView {

    /* renamed from: a  reason: collision with root package name */
    private SurfaceHolderC0267spXPg f13903a;

    public spXPg(Context context, AttributeSet attrs) {
    }

    private void a() {
    }

    @Override // android.view.SurfaceView
    public SurfaceHolder getHolder() {
    }

    /* renamed from: com.tencent.turingcam.view.spXPg$spXPg  reason: collision with other inner class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class SurfaceHolderC0267spXPg implements SurfaceHolder {

        /* renamed from: a  reason: collision with root package name */
        private SurfaceHolder f13904a;
        private List<SurfaceHolder.Callback> b;
        private SurfaceHolder.Callback c;

        /* renamed from: com.tencent.turingcam.view.spXPg$spXPg$spXPg  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class SurfaceHolder$CallbackC0268spXPg implements SurfaceHolder.Callback {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ SurfaceHolderC0267spXPg f13905a;

            public SurfaceHolder$CallbackC0268spXPg(final SurfaceHolderC0267spXPg this$1) {
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceCreated(SurfaceHolder holder) {
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceDestroyed(SurfaceHolder holder) {
            }
        }

        public SurfaceHolderC0267spXPg(final spXPg this$0, SurfaceHolder holder) {
        }

        public static /* synthetic */ List a(SurfaceHolderC0267spXPg surfaceHolderC0267spXPg) {
        }

        @Override // android.view.SurfaceHolder
        public void addCallback(SurfaceHolder.Callback callback) {
        }

        @Override // android.view.SurfaceHolder
        public Surface getSurface() {
        }

        @Override // android.view.SurfaceHolder
        public Rect getSurfaceFrame() {
        }

        @Override // android.view.SurfaceHolder
        public boolean isCreating() {
        }

        @Override // android.view.SurfaceHolder
        public Canvas lockCanvas() {
        }

        @Override // android.view.SurfaceHolder
        public void removeCallback(SurfaceHolder.Callback callback) {
        }

        @Override // android.view.SurfaceHolder
        public void setFixedSize(int width, int height) {
        }

        @Override // android.view.SurfaceHolder
        public void setFormat(int format) {
        }

        @Override // android.view.SurfaceHolder
        public void setKeepScreenOn(boolean screenOn) {
        }

        @Override // android.view.SurfaceHolder
        public void setSizeFromLayout() {
        }

        @Override // android.view.SurfaceHolder
        public void setType(int type) {
        }

        @Override // android.view.SurfaceHolder
        public void unlockCanvasAndPost(Canvas canvas) {
        }

        @Override // android.view.SurfaceHolder
        public Canvas lockCanvas(Rect dirty) {
        }
    }

    public spXPg(Context context, AttributeSet attrs, int defStyleAttr) {
    }
}
