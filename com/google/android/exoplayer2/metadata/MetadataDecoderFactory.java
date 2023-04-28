package com.google.android.exoplayer2.metadata;

import com.google.android.exoplayer2.Format;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public interface MetadataDecoderFactory {
    public static final MetadataDecoderFactory DEFAULT = null;

    /* renamed from: com.google.android.exoplayer2.metadata.MetadataDecoderFactory$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 implements MetadataDecoderFactory {
        @Override // com.google.android.exoplayer2.metadata.MetadataDecoderFactory
        public MetadataDecoder createDecoder(Format format) {
        }

        @Override // com.google.android.exoplayer2.metadata.MetadataDecoderFactory
        public boolean supportsFormat(Format format) {
        }
    }

    MetadataDecoder createDecoder(Format format);

    boolean supportsFormat(Format format);
}
