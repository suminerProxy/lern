package com.tencent.liteav.txcvodplayer.renderer;

import android.view.Surface;
import android.view.View;
import com.tencent.liteav.txcplayer.ITXVCubePlayer;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public interface a {

    /* renamed from: com.tencent.liteav.txcvodplayer.renderer.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface InterfaceC0199a {
        void a(b bVar);

        void a(b bVar, int i2, int i3);

        void b(b bVar);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface b {
        a a();

        void a(ITXVCubePlayer iTXVCubePlayer);

        Surface b();

        Surface c();
    }

    void a(int i2, int i3);

    void a(InterfaceC0199a interfaceC0199a);

    boolean a();

    void b(int i2, int i3);

    void b(InterfaceC0199a interfaceC0199a);

    View getView();

    void setAspectRatio(int i2);

    void setVideoRotation(int i2);
}
