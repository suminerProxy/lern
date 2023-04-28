package com.mob.tools.utils;

import com.mob.tools.utils.ExecutorDispatcher;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public interface a {
    <T extends ExecutorDispatcher.SafeRunnable> void executeDelayed(T t, long j2);

    <T extends ExecutorDispatcher.SafeRunnable> void executeDuctile(T t);

    <T extends ExecutorDispatcher.SafeRunnable> void executeImmediately(T t);

    <T extends ExecutorDispatcher.SafeRunnable> void executeSerial(T t);
}
