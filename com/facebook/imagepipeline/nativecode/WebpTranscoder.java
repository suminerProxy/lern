package com.facebook.imagepipeline.nativecode;

import com.facebook.imageformat.ImageFormat;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public interface WebpTranscoder {
    boolean isWebpNativelySupported(ImageFormat webpFormat);

    void transcodeWebpToJpeg(InputStream inputStream, OutputStream outputStream, int quality) throws IOException;

    void transcodeWebpToPng(InputStream inputStream, OutputStream outputStream) throws IOException;
}
