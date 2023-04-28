package com.google.android.exoplayer2.video.spherical;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.video.spherical.Projection;
import java.util.ArrayList;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class ProjectionDecoder {
    private static final int MAX_COORDINATE_COUNT = 10000;
    private static final int MAX_TRIANGLE_INDICES = 128000;
    private static final int MAX_VERTEX_COUNT = 32000;
    private static final int TYPE_DFL8 = 1684433976;
    private static final int TYPE_MESH = 1835365224;
    private static final int TYPE_MSHP = 1836279920;
    private static final int TYPE_PROJ = 1886547818;
    private static final int TYPE_RAW = 1918990112;
    private static final int TYPE_YTMP = 2037673328;

    private ProjectionDecoder() {
    }

    @Nullable
    public static Projection decode(byte[] projectionData, int stereoMode) {
    }

    private static int decodeZigZag(int n2) {
    }

    private static boolean isProj(ParsableByteArray input) {
    }

    @Nullable
    private static Projection.Mesh parseMesh(ParsableByteArray input) {
    }

    @Nullable
    private static ArrayList<Projection.Mesh> parseMshp(ParsableByteArray input) {
    }

    @Nullable
    private static ArrayList<Projection.Mesh> parseProj(ParsableByteArray input) {
    }

    @Nullable
    private static ArrayList<Projection.Mesh> parseRawMshpData(ParsableByteArray input) {
    }
}
