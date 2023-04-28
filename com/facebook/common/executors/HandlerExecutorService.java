package com.facebook.common.executors;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public interface HandlerExecutorService extends ScheduledExecutorService {
    boolean isHandlerThread();

    void quit();
}
