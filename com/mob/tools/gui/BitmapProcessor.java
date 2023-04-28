package com.mob.tools.gui;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Message;
import com.mob.tools.network.NetworkHelper;
import com.mob.tools.network.RawNetworkCallback;
import java.io.File;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.SoftReference;
import java.util.ArrayList;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class BitmapProcessor {
    private static final int CAPACITY = 3;
    private static final int MAX_CACHE_SIZE = 50;
    private static final int MAX_CACHE_TIME = 60000;
    private static final int MAX_REQ_TIME = 20000;
    private static final int MAX_SIZE = 100;
    private static final int OVERFLOW_SIZE = 120;
    private static final int SCAN_INTERVAL = 20000;
    private static File cacheDir;
    private static CachePoolInner<String, SoftReference<Bitmap>> cachePool;
    private static ManagerThread manager;
    private static ArrayList<ImageReq> netReqTPS;
    private static ArrayList<ImageReq> reqList;
    private static NetworkHelper.NetworkTimeOut timeout;
    private static boolean work;
    private static WorkerThread[] workerList;

    /* renamed from: com.mob.tools.gui.BitmapProcessor$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass1 extends Thread {
        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface BitmapCallback {
        void onImageGot(String str, Bitmap bitmap);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class BitmapDesiredOptions {
        public int desiredHeight;
        public int desiredWidth;
        public long maxBytes;
        public int quality;

        public boolean equals(Object obj) {
        }

        public String toString() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class ImageReq {
        private BitmapDesiredOptions bitmapDesiredOptions;
        private ArrayList<BitmapCallback> callbacks;
        private long diskCacheTime;
        private long reqTime;
        private String url;
        private boolean useDiskCache;
        private boolean useRamCache;
        private WorkerThread worker;

        public static /* synthetic */ String access$000(ImageReq imageReq) {
        }

        public static /* synthetic */ String access$002(ImageReq imageReq, String str) {
        }

        public static /* synthetic */ BitmapDesiredOptions access$100(ImageReq imageReq) {
        }

        public static /* synthetic */ BitmapDesiredOptions access$102(ImageReq imageReq, BitmapDesiredOptions bitmapDesiredOptions) {
        }

        public static /* synthetic */ WorkerThread access$1402(ImageReq imageReq, WorkerThread workerThread) {
        }

        public static /* synthetic */ void access$1500(ImageReq imageReq, Bitmap bitmap) {
        }

        public static /* synthetic */ void access$1800(ImageReq imageReq) {
        }

        public static /* synthetic */ ArrayList access$200(ImageReq imageReq) {
        }

        public static /* synthetic */ boolean access$300(ImageReq imageReq) {
        }

        public static /* synthetic */ boolean access$302(ImageReq imageReq, boolean z) {
        }

        public static /* synthetic */ long access$400(ImageReq imageReq) {
        }

        public static /* synthetic */ long access$402(ImageReq imageReq, long j2) {
        }

        public static /* synthetic */ boolean access$500(ImageReq imageReq) {
        }

        public static /* synthetic */ boolean access$502(ImageReq imageReq, boolean z) {
        }

        private void throwComplete(Bitmap bitmap) {
        }

        private void throwError() {
        }

        public String toString() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class ManagerThread implements Handler.Callback {
        private Handler handler;

        /* renamed from: com.mob.tools.gui.BitmapProcessor$ManagerThread$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 implements Runnable {
            public final /* synthetic */ ManagerThread this$0;

            public AnonymousClass1(ManagerThread managerThread) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
        }

        public void quit() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class PatchInputStream extends FilterInputStream {
        public InputStream in;

        public PatchInputStream(InputStream inputStream) {
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public long skip(long j2) throws IOException {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class WorkerThread extends Thread {
        private ImageReq curReq;
        private boolean localType;

        /* renamed from: com.mob.tools.gui.BitmapProcessor$WorkerThread$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 implements RawNetworkCallback {
            public final /* synthetic */ WorkerThread this$0;
            public final /* synthetic */ String val$md5;
            public final /* synthetic */ ImageReq val$req;

            public AnonymousClass1(WorkerThread workerThread, String str, ImageReq imageReq) {
            }

            @Override // com.mob.tools.network.RawNetworkCallback
            public void onResponse(InputStream inputStream) throws Throwable {
            }
        }

        private WorkerThread() {
        }

        public static /* synthetic */ void access$1900(WorkerThread workerThread, InputStream inputStream, File file) {
        }

        public static /* synthetic */ ImageReq access$2002(WorkerThread workerThread, ImageReq imageReq) {
        }

        public static /* synthetic */ boolean access$902(WorkerThread workerThread, boolean z) {
        }

        private void doLocalTask() throws Throwable {
        }

        private void doNetworkTask() throws Throwable {
        }

        private void doTask(ImageReq imageReq) throws Throwable {
        }

        private void saveFile(InputStream inputStream, File file) {
        }

        @Override // java.lang.Thread
        public void interrupt() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
        }

        public /* synthetic */ WorkerThread(AnonymousClass1 anonymousClass1) {
        }
    }

    public static /* synthetic */ CachePoolInner access$1000() {
    }

    public static /* synthetic */ ArrayList access$1100() {
    }

    public static /* synthetic */ boolean access$1200() {
    }

    public static /* synthetic */ String access$1300(String str, BitmapDesiredOptions bitmapDesiredOptions) {
    }

    public static /* synthetic */ File access$1600() {
    }

    public static /* synthetic */ ArrayList access$1700() {
    }

    public static /* synthetic */ NetworkHelper.NetworkTimeOut access$2100() {
    }

    public static /* synthetic */ void access$600() {
    }

    public static /* synthetic */ WorkerThread[] access$700() {
    }

    public static void deleteCacheDir(boolean z) {
    }

    public static void deleteCachedFile(String str, BitmapDesiredOptions bitmapDesiredOptions) {
    }

    public static Bitmap getBitmapFromCache(String str) {
    }

    private static String getCacheKey(String str, BitmapDesiredOptions bitmapDesiredOptions) {
    }

    public static long getCacheSizeInByte() {
    }

    public static String getCacheSizeText() {
    }

    public static synchronized void prepare(Context context) {
    }

    public static synchronized void process(String str, BitmapCallback bitmapCallback) {
    }

    public static void removeBitmapFromRamCache(String str, BitmapDesiredOptions bitmapDesiredOptions) {
    }

    public static synchronized void start() {
    }

    public static synchronized void stop() {
    }

    public static Bitmap getBitmapFromCache(String str, BitmapDesiredOptions bitmapDesiredOptions) {
    }

    public static synchronized void process(String str, BitmapDesiredOptions bitmapDesiredOptions, BitmapCallback bitmapCallback) {
    }

    private static synchronized void deleteCacheDir() {
    }

    public static synchronized void process(String str, BitmapDesiredOptions bitmapDesiredOptions, boolean z, BitmapCallback bitmapCallback) {
    }

    public static synchronized void process(String str, BitmapDesiredOptions bitmapDesiredOptions, boolean z, boolean z2, BitmapCallback bitmapCallback) {
    }

    public static synchronized void process(String str, BitmapDesiredOptions bitmapDesiredOptions, boolean z, boolean z2, long j2, BitmapCallback bitmapCallback) {
    }
}
