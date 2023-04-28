package com.facebook.common.webp;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import com.facebook.infer.annotation.Nullsafe;
import java.io.FileDescriptor;
import java.io.InputStream;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public interface WebpBitmapFactory {

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface WebpErrorLogger {
        void onWebpErrorLog(String message, @Nullable String extra);
    }

    @Nullable
    Bitmap decodeByteArray(byte[] array, int offset, int length, @Nullable BitmapFactory.Options opts);

    @Nullable
    Bitmap decodeFile(String pathName, @Nullable BitmapFactory.Options opts);

    @Nullable
    Bitmap decodeFileDescriptor(FileDescriptor fd, @Nullable Rect outPadding, @Nullable BitmapFactory.Options opts);

    @Nullable
    Bitmap decodeStream(InputStream inputStream, @Nullable Rect outPadding, @Nullable BitmapFactory.Options opts);

    void setBitmapCreator(final BitmapCreator bitmapCreator);

    void setWebpErrorLogger(WebpErrorLogger logger);
}
