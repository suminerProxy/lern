package com.davemorrissey.labs.subscaleview.decoder;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;
import java.io.FileFilter;
import java.util.Map;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReadWriteLock;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class SkiaPooledImageRegionDecoder implements ImageRegionDecoder {
    private static final String ASSET_PREFIX = "file:///android_asset/";
    private static final String FILE_PREFIX = "file://";
    private static final String RESOURCE_PREFIX = "android.resource://";
    private static final String TAG = "SkiaPooledImageRegionDecoder";
    private static boolean debug;
    private final Bitmap.Config bitmapConfig;
    private Context context;
    private final ReadWriteLock decoderLock;
    private DecoderPool decoderPool;
    private long fileLength;
    private final Point imageDimensions;
    private final AtomicBoolean lazyInited;
    private Uri uri;

    /* renamed from: com.davemorrissey.labs.subscaleview.decoder.SkiaPooledImageRegionDecoder$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 extends Thread {
        public final /* synthetic */ SkiaPooledImageRegionDecoder this$0;

        public AnonymousClass1(SkiaPooledImageRegionDecoder skiaPooledImageRegionDecoder) {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.davemorrissey.labs.subscaleview.decoder.SkiaPooledImageRegionDecoder$1CpuFilter  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class C1CpuFilter implements FileFilter {
        public final /* synthetic */ SkiaPooledImageRegionDecoder this$0;

        public C1CpuFilter(SkiaPooledImageRegionDecoder skiaPooledImageRegionDecoder) {
        }

        @Override // java.io.FileFilter
        public boolean accept(File file) {
        }
    }

    @Keep
    public SkiaPooledImageRegionDecoder() {
    }

    public static /* synthetic */ DecoderPool access$100(SkiaPooledImageRegionDecoder skiaPooledImageRegionDecoder) {
    }

    public static /* synthetic */ long access$300(SkiaPooledImageRegionDecoder skiaPooledImageRegionDecoder) {
    }

    public static /* synthetic */ void access$400(SkiaPooledImageRegionDecoder skiaPooledImageRegionDecoder, String str) {
    }

    public static /* synthetic */ void access$500(SkiaPooledImageRegionDecoder skiaPooledImageRegionDecoder) throws Exception {
    }

    private void debug(String str) {
    }

    private int getNumCoresOldPhones() {
    }

    private int getNumberOfCores() {
    }

    private void initialiseDecoder() throws Exception {
    }

    private boolean isLowMemory() {
    }

    private void lazyInit() {
    }

    @Keep
    public static void setDebug(boolean z) {
    }

    public boolean allowAdditionalDecoder(int i2, long j2) {
    }

    @Override // com.davemorrissey.labs.subscaleview.decoder.ImageRegionDecoder
    @NonNull
    public Bitmap decodeRegion(@NonNull Rect rect, int i2) {
    }

    @Override // com.davemorrissey.labs.subscaleview.decoder.ImageRegionDecoder
    @NonNull
    public Point init(Context context, @NonNull Uri uri) throws Exception {
    }

    @Override // com.davemorrissey.labs.subscaleview.decoder.ImageRegionDecoder
    public synchronized boolean isReady() {
    }

    @Override // com.davemorrissey.labs.subscaleview.decoder.ImageRegionDecoder
    public synchronized void recycle() {
    }

    public SkiaPooledImageRegionDecoder(@Nullable Bitmap.Config config) {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class DecoderPool {
        private final Semaphore available;
        private final Map<BitmapRegionDecoder, Boolean> decoders;

        private DecoderPool() {
        }

        public static /* synthetic */ void access$1000(DecoderPool decoderPool) {
        }

        public static /* synthetic */ int access$200(DecoderPool decoderPool) {
        }

        public static /* synthetic */ void access$600(DecoderPool decoderPool, BitmapRegionDecoder bitmapRegionDecoder) {
        }

        public static /* synthetic */ BitmapRegionDecoder access$700(DecoderPool decoderPool) {
        }

        public static /* synthetic */ void access$800(DecoderPool decoderPool, BitmapRegionDecoder bitmapRegionDecoder) {
        }

        public static /* synthetic */ boolean access$900(DecoderPool decoderPool) {
        }

        private BitmapRegionDecoder acquire() {
        }

        private synchronized void add(BitmapRegionDecoder bitmapRegionDecoder) {
        }

        private synchronized BitmapRegionDecoder getNextAvailable() {
        }

        private synchronized boolean isEmpty() {
        }

        private synchronized boolean markAsUnused(BitmapRegionDecoder bitmapRegionDecoder) {
        }

        private synchronized void recycle() {
        }

        private void release(BitmapRegionDecoder bitmapRegionDecoder) {
        }

        private synchronized int size() {
        }

        public /* synthetic */ DecoderPool(AnonymousClass1 anonymousClass1) {
        }
    }
}
