package com.tencent.thumbplayer.tplayer;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import com.tencent.thumbplayer.api.ITPSurface;
import com.tencent.thumbplayer.api.ITPSurfaceListener;
import com.tencent.thumbplayer.core.player.ITPNativePlayerSurfaceCallback;
import com.tencent.thumbplayer.core.player.TPNativePlayerSurface;
import com.tencent.thumbplayer.core.player.TPNativePlayerSurfaceRenderInfo;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class e implements ITPSurface {

    /* renamed from: a  reason: collision with root package name */
    private TPNativePlayerSurface f13538a;
    private ITPSurfaceListener b;
    private ITPNativePlayerSurfaceCallback c;

    /* renamed from: com.tencent.thumbplayer.tplayer.e$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements ITPNativePlayerSurfaceCallback {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ e f13539a;

        public AnonymousClass1(e eVar) {
        }

        @Override // com.tencent.thumbplayer.core.player.ITPNativePlayerSurfaceCallback
        public void onRenderInfo(TPNativePlayerSurfaceRenderInfo tPNativePlayerSurfaceRenderInfo) {
        }
    }

    public e(SurfaceTexture surfaceTexture) {
    }

    public static /* synthetic */ ITPSurfaceListener a(e eVar) {
    }

    public Surface a() {
    }

    public void finalize() {
    }

    @Override // com.tencent.thumbplayer.api.ITPSurface
    public void setSurfaceListener(ITPSurfaceListener iTPSurfaceListener) {
    }
}
