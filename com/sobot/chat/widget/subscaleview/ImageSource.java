package com.sobot.chat.widget.subscaleview;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import androidx.annotation.NonNull;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class ImageSource {
    public static final String ASSET_SCHEME = "file:///android_asset/";
    public static final String FILE_SCHEME = "file:///";
    private final Bitmap bitmap;
    private boolean cached;
    private final Integer resource;
    private int sHeight;
    private Rect sRegion;
    private int sWidth;
    private boolean tile;
    private final Uri uri;

    private ImageSource(Bitmap bitmap, boolean z) {
    }

    @NonNull
    public static ImageSource asset(@NonNull String str) {
    }

    @NonNull
    public static ImageSource bitmap(@NonNull Bitmap bitmap) {
    }

    @NonNull
    public static ImageSource cachedBitmap(@NonNull Bitmap bitmap) {
    }

    @NonNull
    public static ImageSource resource(int i2) {
    }

    private void setInvariants() {
    }

    @NonNull
    public static ImageSource uri(@NonNull String str) {
    }

    @NonNull
    public ImageSource dimensions(int i2, int i3) {
    }

    public final Bitmap getBitmap() {
    }

    public final Integer getResource() {
    }

    public final int getSHeight() {
    }

    public final Rect getSRegion() {
    }

    public final int getSWidth() {
    }

    public final boolean getTile() {
    }

    public final Uri getUri() {
    }

    public final boolean isCached() {
    }

    @NonNull
    public ImageSource region(Rect rect) {
    }

    @NonNull
    public ImageSource tiling(boolean z) {
    }

    @NonNull
    public ImageSource tilingDisabled() {
    }

    @NonNull
    public ImageSource tilingEnabled() {
    }

    @NonNull
    public static ImageSource uri(@NonNull Uri uri) {
    }

    private ImageSource(@NonNull Uri uri) {
    }

    private ImageSource(int i2) {
    }
}
