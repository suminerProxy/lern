package com.facebook.stetho.server;

import android.net.LocalServerSocket;
import android.net.LocalSocket;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nonnull;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class LocalSocketServer {
    private static final int MAX_BIND_RETRIES = 2;
    private static final int TIME_BETWEEN_BIND_RETRIES_MS = 1000;
    private static final String WORKER_THREAD_NAME_PREFIX = "StethoWorker";
    private final String mAddress;
    private final String mFriendlyName;
    private Thread mListenerThread;
    private LocalServerSocket mServerSocket;
    private final SocketHandler mSocketHandler;
    private boolean mStopped;
    private final AtomicInteger mThreadId;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class WorkerThread extends Thread {
        private final LocalSocket mSocket;
        private final SocketHandler mSocketHandler;

        public WorkerThread(LocalSocket localSocket, SocketHandler socketHandler) {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
        }
    }

    public LocalSocketServer(String str, String str2, SocketHandler socketHandler) {
    }

    @Nonnull
    private static LocalServerSocket bindToSocket(String str) throws IOException {
    }

    private void listenOnAddress(String str) throws IOException {
    }

    public String getName() {
    }

    public void run() throws IOException {
    }

    public void stop() {
    }
}
