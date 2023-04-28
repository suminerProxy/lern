package androidx.constraintlayout.motion.utils;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public abstract class CurveFit {
    public static final int CONSTANT = 2;
    public static final int LINEAR = 1;
    public static final int SPLINE = 0;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class Constant extends CurveFit {
        public double mTime;
        public double[] mValue;

        public Constant(double d2, double[] dArr) {
        }

        @Override // androidx.constraintlayout.motion.utils.CurveFit
        public void getPos(double d2, double[] dArr) {
        }

        @Override // androidx.constraintlayout.motion.utils.CurveFit
        public double getSlope(double d2, int i2) {
        }

        @Override // androidx.constraintlayout.motion.utils.CurveFit
        public void getSlope(double d2, double[] dArr) {
        }

        @Override // androidx.constraintlayout.motion.utils.CurveFit
        public double[] getTimePoints() {
        }

        @Override // androidx.constraintlayout.motion.utils.CurveFit
        public void getPos(double d2, float[] fArr) {
        }

        @Override // androidx.constraintlayout.motion.utils.CurveFit
        public double getPos(double d2, int i2) {
        }
    }

    public static CurveFit get(int i2, double[] dArr, double[][] dArr2) {
    }

    public static CurveFit getArc(int[] iArr, double[] dArr, double[][] dArr2) {
    }

    public abstract double getPos(double d2, int i2);

    public abstract void getPos(double d2, double[] dArr);

    public abstract void getPos(double d2, float[] fArr);

    public abstract double getSlope(double d2, int i2);

    public abstract void getSlope(double d2, double[] dArr);

    public abstract double[] getTimePoints();
}
