package com.umeng.commonsdk.statistics.noise;

import android.content.Context;
import com.umeng.commonsdk.statistics.idtracking.ImprintHandler;
import com.umeng.commonsdk.statistics.internal.StatTracer;
import com.umeng.commonsdk.statistics.internal.d;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class ImLatent implements d {
    private static ImLatent instanse;
    private final int LATENT_MAX;
    private final int LATENT_WINDOW;
    private final long _360HOURS_IN_MS;
    private final long _36HOURS_IN_MS;
    private final int _DEFAULT_HOURS;
    private final int _DEFAULT_MAX_LATENT;
    private final int _DEFAULT_MIN_HOURS;
    private final int _DEFAULT_MIN_LATENT;
    private final long _ONE_HOURS_IN_MS;
    private Context context;
    private long latentHour;
    private int latentWindow;
    private long mDelay;
    private long mElapsed;
    private boolean mLatentActivite;
    private Object mLatentLock;
    private StatTracer statTracer;
    private com.umeng.commonsdk.statistics.common.d storeHelper;

    private ImLatent(Context context, StatTracer statTracer) {
    }

    public static synchronized ImLatent getService(Context context, StatTracer statTracer) {
    }

    public long getDelayTime() {
    }

    public long getElapsedTime() {
    }

    public boolean isLatentActivite() {
    }

    public void latentDeactivite() {
    }

    @Override // com.umeng.commonsdk.statistics.internal.d
    public void onImprintChanged(ImprintHandler.a aVar) {
    }

    public boolean shouldStartLatency() {
    }
}
