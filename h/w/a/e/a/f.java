package h.w.a.e.a;

import android.view.View;
import h.w.a.e.a.c;
import h.w.a.e.b.b.m;

/* compiled from: IDanmakuView.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public interface f {
    public static final int b0 = 0;
    public static final int c0 = 1;
    public static final int d0 = 2;
    public static final int e0 = 3;

    /* compiled from: IDanmakuView.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface a {
        boolean onDanmakuClick(m mVar);

        boolean onDanmakuLongClick(m mVar);

        boolean onViewClick(f fVar);
    }

    void addDanmaku(h.w.a.e.b.b.d dVar);

    void clearDanmakusOnScreen();

    void enableDanmakuDrawingCache(boolean z);

    void forceRender();

    h.w.a.e.b.b.s.d getConfig();

    long getCurrentTime();

    m getCurrentVisibleDanmakus();

    int getHeight();

    a getOnDanmakuClickListener();

    View getView();

    int getWidth();

    float getXOff();

    float getYOff();

    void hide();

    long hideAndPauseDrawTask();

    void invalidateDanmaku(h.w.a.e.b.b.d dVar, boolean z);

    boolean isDanmakuDrawingCacheEnabled();

    boolean isHardwareAccelerated();

    boolean isPaused();

    boolean isPrepared();

    boolean isShown();

    void pause();

    void prepare(h.w.a.e.b.c.a aVar, h.w.a.e.b.b.s.d dVar);

    void release();

    void removeAllDanmakus(boolean z);

    void removeAllLiveDanmakus();

    void resume();

    void seekTo(Long l2);

    void setCallback(c.d dVar);

    void setDrawingThreadType(int i2);

    void setOnDanmakuClickListener(a aVar);

    void setOnDanmakuClickListener(a aVar, float f2, float f3);

    void setVisibility(int i2);

    void show();

    void showAndResumeDrawTask(Long l2);

    void showFPS(boolean z);

    void start();

    void start(long j2);

    void stop();

    void toggle();
}
