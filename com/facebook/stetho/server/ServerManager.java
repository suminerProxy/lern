package com.facebook.stetho.server;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class ServerManager {
    private static final String THREAD_PREFIX = "StethoListener";
    private final LocalSocketServer mServer;
    private volatile boolean mStarted;

    /* renamed from: com.facebook.stetho.server.ServerManager$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 extends Thread {
        public final /* synthetic */ ServerManager this$0;
        public final /* synthetic */ LocalSocketServer val$server;

        public AnonymousClass1(ServerManager serverManager, String str, LocalSocketServer localSocketServer) {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
        }
    }

    public ServerManager(LocalSocketServer localSocketServer) {
    }

    private void startServer(LocalSocketServer localSocketServer) {
    }

    public void start() {
    }
}
