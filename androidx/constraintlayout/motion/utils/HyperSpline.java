package androidx.constraintlayout.motion.utils;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class HyperSpline {
    public double[][] mCtl;
    public Cubic[][] mCurve;
    public double[] mCurveLength;
    public int mDimensionality;
    public int mPoints;
    public double mTotalLength;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class Cubic {
        public static final double HALF = 0.5d;
        public static final double THIRD = 0.3333333333333333d;
        public double mA;
        public double mB;
        public double mC;
        public double mD;

        public Cubic(double d2, double d3, double d4, double d5) {
        }

        public double eval(double d2) {
        }

        public double vel(double d2) {
        }
    }

    public HyperSpline(double[][] dArr) {
    }

    public static Cubic[] calcNaturalCubic(int i2, double[] dArr) {
    }

    public double approxLength(Cubic[] cubicArr) {
    }

    public void getPos(double d2, double[] dArr) {
    }

    public void getVelocity(double d2, double[] dArr) {
    }

    public void setup(double[][] dArr) {
    }

    public HyperSpline() {
    }

    public void getPos(double d2, float[] fArr) {
    }

    public double getPos(double d2, int i2) {
    }
}
