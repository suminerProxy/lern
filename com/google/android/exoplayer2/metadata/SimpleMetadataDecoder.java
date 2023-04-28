package com.google.android.exoplayer2.metadata;

import androidx.annotation.Nullable;
import java.nio.ByteBuffer;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class SimpleMetadataDecoder implements MetadataDecoder {
    @Override // com.google.android.exoplayer2.metadata.MetadataDecoder
    @Nullable
    public final Metadata decode(MetadataInputBuffer inputBuffer) {
    }

    @Nullable
    public abstract Metadata decode(MetadataInputBuffer inputBuffer, ByteBuffer buffer);
}
