package com.mob.tools.utils;

import com.mob.tools.proguard.PublicMemberKeeper;
import java.io.FileOutputStream;
import java.nio.channels.FileLock;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class FileLocker implements PublicMemberKeeper {

    /* renamed from: a  reason: collision with root package name */
    private FileOutputStream f4509a;
    private FileLock b;

    private boolean a(boolean z) throws Throwable {
    }

    public synchronized boolean lock(boolean z) {
    }

    public synchronized void release() {
    }

    public synchronized void setLockFile(String str) {
    }

    public synchronized void unlock() {
    }

    public synchronized boolean lock(boolean z, long j2, long j3) {
    }

    public synchronized void lock(Runnable runnable, boolean z) {
    }
}
