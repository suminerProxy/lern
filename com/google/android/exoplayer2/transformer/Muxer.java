package com.google.android.exoplayer2.transformer;

import android.os.ParcelFileDescriptor;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public interface Muxer {

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface Factory {
        Muxer create(ParcelFileDescriptor parcelFileDescriptor, String outputMimeType) throws IOException;

        Muxer create(String path, String outputMimeType) throws IOException;

        boolean supportsOutputMimeType(String mimeType);
    }

    int addTrack(Format format);

    void release(boolean forCancellation);

    boolean supportsSampleMimeType(@Nullable String mimeType);

    void writeSampleData(int trackIndex, ByteBuffer data, boolean isKeyFrame, long presentationTimeUs);
}
