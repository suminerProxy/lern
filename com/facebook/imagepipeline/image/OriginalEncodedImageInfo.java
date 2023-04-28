package com.facebook.imagepipeline.image;

import android.net.Uri;
import com.facebook.infer.annotation.Nullsafe;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class OriginalEncodedImageInfo {
    public static final OriginalEncodedImageInfo EMPTY = null;
    @Nullable
    private final Object mCallerContext;
    private final int mHeight;
    @Nullable
    private final EncodedImageOrigin mOrigin;
    private final int mSize;
    @Nullable
    private final Uri mUri;
    private final int mWidth;

    private OriginalEncodedImageInfo() {
    }

    @Nullable
    public Object getCallerContext() {
    }

    public int getHeight() {
    }

    @Nullable
    public EncodedImageOrigin getOrigin() {
    }

    public int getSize() {
    }

    @Nullable
    public Uri getUri() {
    }

    public int getWidth() {
    }

    public OriginalEncodedImageInfo(Uri sourceUri, EncodedImageOrigin origin, @Nullable Object callerContext, int width, int height, int size) {
    }
}
