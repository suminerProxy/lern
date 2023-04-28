package com.davemorrissey.labs.subscaleview.decoder;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class SkiaImageDecoder implements ImageDecoder {
    private static final String ASSET_PREFIX = "file:///android_asset/";
    private static final String FILE_PREFIX = "file://";
    private static final String RESOURCE_PREFIX = "android.resource://";
    private final Bitmap.Config bitmapConfig;

    @Keep
    public SkiaImageDecoder() {
    }

    @Override // com.davemorrissey.labs.subscaleview.decoder.ImageDecoder
    @NonNull
    public Bitmap decode(Context context, @NonNull Uri uri) throws Exception {
    }

    public SkiaImageDecoder(@Nullable Bitmap.Config config) {
    }
}
