package com.google.android.exoplayer2.extractor.mp4;

import androidx.annotation.Nullable;
import java.util.UUID;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class PsshAtomUtil {
    private static final String TAG = "PsshAtomUtil";

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class PsshAtom {
        private final byte[] schemeData;
        private final UUID uuid;
        private final int version;

        public PsshAtom(UUID uuid, int version, byte[] schemeData) {
        }

        public static /* synthetic */ UUID access$000(PsshAtom psshAtom) {
        }

        public static /* synthetic */ int access$100(PsshAtom psshAtom) {
        }

        public static /* synthetic */ byte[] access$200(PsshAtom psshAtom) {
        }
    }

    private PsshAtomUtil() {
    }

    public static byte[] buildPsshAtom(UUID systemId, @Nullable byte[] data) {
    }

    public static boolean isPsshAtom(byte[] data) {
    }

    @Nullable
    private static PsshAtom parsePsshAtom(byte[] atom) {
    }

    @Nullable
    public static byte[] parseSchemeSpecificData(byte[] atom, UUID uuid) {
    }

    @Nullable
    public static UUID parseUuid(byte[] atom) {
    }

    public static int parseVersion(byte[] atom) {
    }

    public static byte[] buildPsshAtom(UUID systemId, @Nullable UUID[] keyIds, @Nullable byte[] data) {
    }
}
