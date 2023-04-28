package com.google.android.exoplayer2.video.spherical;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.video.spherical.Projection;
import java.nio.FloatBuffer;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class ProjectionRenderer {
    private static final String[] FRAGMENT_SHADER_CODE = null;
    private static final float[] TEX_MATRIX_BOTTOM = null;
    private static final float[] TEX_MATRIX_LEFT = null;
    private static final float[] TEX_MATRIX_RIGHT = null;
    private static final float[] TEX_MATRIX_TOP = null;
    private static final float[] TEX_MATRIX_WHOLE = null;
    private static final String[] VERTEX_SHADER_CODE = null;
    @Nullable
    private MeshData leftMeshData;
    private int mvpMatrixHandle;
    private int positionHandle;
    private int program;
    @Nullable
    private MeshData rightMeshData;
    private int stereoMode;
    private int texCoordsHandle;
    private int textureHandle;
    private int uTexMatrixHandle;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class MeshData {
        private final int drawMode;
        private final FloatBuffer textureBuffer;
        private final FloatBuffer vertexBuffer;
        private final int vertexCount;

        public MeshData(Projection.SubMesh subMesh) {
        }

        public static /* synthetic */ FloatBuffer access$000(MeshData meshData) {
        }

        public static /* synthetic */ FloatBuffer access$100(MeshData meshData) {
        }

        public static /* synthetic */ int access$200(MeshData meshData) {
        }

        public static /* synthetic */ int access$300(MeshData meshData) {
        }
    }

    public static boolean isSupported(Projection projection) {
    }

    public void draw(int textureId, float[] mvpMatrix, boolean rightEye) {
    }

    public void init() {
    }

    public void setProjection(Projection projection) {
    }

    public void shutdown() {
    }
}
