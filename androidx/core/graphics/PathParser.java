package androidx.core.graphics;

import android.graphics.Path;
import androidx.annotation.Nullable;
import java.util.ArrayList;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class PathParser {
    private static final String LOGTAG = "PathParser";

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class ExtractFloatResult {
        public int mEndPosition;
        public boolean mEndWithNegOrDot;
    }

    private PathParser() {
    }

    private static void addNode(ArrayList<PathDataNode> arrayList, char c, float[] fArr) {
    }

    public static boolean canMorph(@Nullable PathDataNode[] pathDataNodeArr, @Nullable PathDataNode[] pathDataNodeArr2) {
    }

    public static float[] copyOfRange(float[] fArr, int i2, int i3) {
    }

    public static PathDataNode[] createNodesFromPathData(String str) {
    }

    public static Path createPathFromPathData(String str) {
    }

    public static PathDataNode[] deepCopyNodes(PathDataNode[] pathDataNodeArr) {
    }

    private static void extract(String str, int i2, ExtractFloatResult extractFloatResult) {
    }

    private static float[] getFloats(String str) {
    }

    public static boolean interpolatePathDataNodes(PathDataNode[] pathDataNodeArr, PathDataNode[] pathDataNodeArr2, PathDataNode[] pathDataNodeArr3, float f2) {
    }

    private static int nextStart(String str, int i2) {
    }

    public static void updateNodes(PathDataNode[] pathDataNodeArr, PathDataNode[] pathDataNodeArr2) {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class PathDataNode {
        public float[] mParams;
        public char mType;

        public PathDataNode(char c, float[] fArr) {
        }

        private static void addCommand(Path path, float[] fArr, char c, char c2, float[] fArr2) {
        }

        private static void arcToBezier(Path path, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10) {
        }

        private static void drawArc(Path path, float f2, float f3, float f4, float f5, float f6, float f7, float f8, boolean z, boolean z2) {
        }

        public static void nodesToPath(PathDataNode[] pathDataNodeArr, Path path) {
        }

        public void interpolatePathDataNode(PathDataNode pathDataNode, PathDataNode pathDataNode2, float f2) {
        }

        public PathDataNode(PathDataNode pathDataNode) {
        }
    }
}
