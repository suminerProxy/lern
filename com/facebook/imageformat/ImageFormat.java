package com.facebook.imageformat;

import com.facebook.infer.annotation.Nullsafe;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class ImageFormat {
    public static final ImageFormat UNKNOWN = new ImageFormat("UNKNOWN", null);
    @Nullable
    private final String mFileExtension;
    private final String mName;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface FormatChecker {
        @Nullable
        ImageFormat determineFormat(@Nonnull byte[] headerBytes, int headerSize);

        int getHeaderSize();
    }

    public ImageFormat(String name, @Nullable String fileExtension) {
        this.mName = name;
        this.mFileExtension = fileExtension;
    }

    @Nullable
    public String getFileExtension() {
        return this.mFileExtension;
    }

    public String getName() {
        return this.mName;
    }

    public String toString() {
        return getName();
    }
}
