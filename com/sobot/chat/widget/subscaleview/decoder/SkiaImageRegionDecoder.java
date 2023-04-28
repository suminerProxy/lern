package com.sobot.chat.widget.subscaleview.decoder;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class SkiaImageRegionDecoder implements ImageRegionDecoder {
    private static final String ASSET_PREFIX = "file:///android_asset/";
    private static final String FILE_PREFIX = "file://";
    private static final String RESOURCE_PREFIX = "android.resource://";
    private final Bitmap.Config bitmapConfig;
    private BitmapRegionDecoder decoder;
    private final ReadWriteLock decoderLock;

    @Keep
    public SkiaImageRegionDecoder() {
    }

    private Lock getDecodeLock() {
    }

    @Override // com.sobot.chat.widget.subscaleview.decoder.ImageRegionDecoder
    @NonNull
    public Bitmap decodeRegion(@NonNull Rect rect, int i2) {
    }

    @Override // com.sobot.chat.widget.subscaleview.decoder.ImageRegionDecoder
    @NonNull
    public Point init(Context context, @NonNull Uri uri) throws Exception {
    }

    @Override // com.sobot.chat.widget.subscaleview.decoder.ImageRegionDecoder
    public synchronized boolean isReady() {
    }

    @Override // com.sobot.chat.widget.subscaleview.decoder.ImageRegionDecoder
    public synchronized void recycle() {
    }

    public SkiaImageRegionDecoder(@Nullable Bitmap.Config config) {
    }
}
