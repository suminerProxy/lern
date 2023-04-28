package h.x.g.k;

import com.tencent.rtmp.ITXVodPlayListener;
import com.tencent.rtmp.TXLivePlayer;
import com.tencent.rtmp.TXVodPlayer;
import com.tencent.rtmp.ui.TXCloudVideoView;
import h.x.g.f;
import h.x.g.h;
import h.x.g.k.d.h;
import java.util.List;

/* compiled from: SuperPlayer.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public interface a {
    void a();

    void b(boolean z);

    f.d c();

    void d(h hVar);

    void e(ITXVodPlayListener iTXVodPlayListener);

    void enableHardwareDecode(boolean z);

    void f(String str);

    void g();

    f.e getPlayerType();

    void h(int i2, String str, String str2);

    f.c i();

    TXVodPlayer j();

    void k(f.c cVar);

    void l(int i2, String str);

    void m(int i2, List<h.a> list, int i3);

    String n();

    void o(c cVar);

    void p();

    void pause();

    void resume();

    void resumeLive();

    void seek(int i2);

    void setMirror(boolean z);

    void setPlayerView(TXCloudVideoView tXCloudVideoView);

    void setRate(float f2);

    void snapshot(TXLivePlayer.ITXSnapshotListener iTXSnapshotListener);

    void stop();
}
