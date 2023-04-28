package com.facebook.stetho.inspector.network;

import java.util.Map;
import javax.annotation.Nullable;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class AsyncPrettyPrinterRegistry {
    private final Map<String, AsyncPrettyPrinterFactory> mRegistry;

    @Nullable
    public synchronized AsyncPrettyPrinterFactory lookup(String str) {
    }

    public synchronized void register(String str, AsyncPrettyPrinterFactory asyncPrettyPrinterFactory) {
    }

    public synchronized boolean unregister(String str) {
    }
}
