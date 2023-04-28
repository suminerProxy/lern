package com.google.android.exoplayer2.drm;

import java.util.UUID;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class FrameworkMediaCrypto implements ExoMediaCrypto {
    public static final boolean WORKAROUND_DEVICE_NEEDS_KEYS_TO_CONFIGURE_CODEC = false;
    public final boolean forceAllowInsecureDecoderComponents;
    public final byte[] sessionId;
    public final UUID uuid;

    public FrameworkMediaCrypto(UUID uuid, byte[] sessionId, boolean forceAllowInsecureDecoderComponents) {
    }
}
