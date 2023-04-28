package com.facebook.imagepipeline.decoder;

import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.infer.annotation.Nullsafe;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class DecodeException extends RuntimeException {
    private final EncodedImage mEncodedImage;

    public DecodeException(String message, EncodedImage encodedImage) {
        super(message);
        this.mEncodedImage = encodedImage;
    }

    public EncodedImage getEncodedImage() {
        return this.mEncodedImage;
    }

    public DecodeException(String message, Throwable t, EncodedImage encodedImage) {
        super(message, t);
        this.mEncodedImage = encodedImage;
    }
}
