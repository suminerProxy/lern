package com.google.android.exoplayer2.metadata.icy;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.MetadataInputBuffer;
import com.google.android.exoplayer2.metadata.SimpleMetadataDecoder;
import java.nio.ByteBuffer;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Pattern;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class IcyDecoder extends SimpleMetadataDecoder {
    private static final Pattern METADATA_ELEMENT = null;
    private static final String STREAM_KEY_NAME = "streamtitle";
    private static final String STREAM_KEY_URL = "streamurl";
    private final CharsetDecoder iso88591Decoder;
    private final CharsetDecoder utf8Decoder;

    @Nullable
    private String decodeToString(ByteBuffer data) {
    }

    @Override // com.google.android.exoplayer2.metadata.SimpleMetadataDecoder
    public Metadata decode(MetadataInputBuffer inputBuffer, ByteBuffer buffer) {
    }
}
