package androidx.constraintlayout.motion.utils;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class Easing {
    private static final String ACCELERATE = "cubic(0.4, 0.05, 0.8, 0.7)";
    private static final String ACCELERATE_NAME = "accelerate";
    private static final String DECELERATE = "cubic(0.0, 0.0, 0.2, 0.95)";
    private static final String DECELERATE_NAME = "decelerate";
    private static final String LINEAR = "cubic(1, 1, 0, 0)";
    private static final String LINEAR_NAME = "linear";
    public static String[] NAMED_EASING = null;
    private static final String STANDARD = "cubic(0.4, 0.0, 0.2, 1)";
    private static final String STANDARD_NAME = "standard";
    public static Easing sDefault;
    public String str;

    public static Easing getInterpolator(String str) {
    }

    public double get(double d2) {
    }

    public double getDiff(double d2) {
    }

    public String toString() {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class CubicEasing extends Easing {
        private static double d_error = 1.0E-4d;
        private static double error = 0.01d;
        public double x1;
        public double x2;
        public double y1;
        public double y2;

        public CubicEasing(String str) {
        }

        private double getDiffX(double d2) {
        }

        private double getDiffY(double d2) {
        }

        private double getX(double d2) {
        }

        private double getY(double d2) {
        }

        @Override // androidx.constraintlayout.motion.utils.Easing
        public double get(double d2) {
        }

        @Override // androidx.constraintlayout.motion.utils.Easing
        public double getDiff(double d2) {
        }

        public void setup(double d2, double d3, double d4, double d5) {
        }

        public CubicEasing(double d2, double d3, double d4, double d5) {
        }
    }
}
