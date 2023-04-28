package xnn;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class XNNJNI {
    private static String TAG = "XNNJNI";
    public static volatile boolean isSoLoaded;

    public static native long buildSharedModel(byte[] bArr, byte[] bArr2);

    public static native XNNResult classifyImage(long j2, int[] iArr, int i2, int i3, int[] iArr2, int i4);

    public static native XNNResult classifyYuv(long j2, byte[] bArr, int i2, int i3, int[] iArr, int i4);

    public static native XNNResult detectImage(long j2, int[] iArr, int i2, int i3, int[] iArr2, int i4);

    public static native XNNResult detectImageBGRA(long j2, int[] iArr, int i2, int i3, int[] iArr2, int i4);

    public static native XNNResult detectYuv(long j2, byte[] bArr, int i2, int i3, int[] iArr, int i4);

    public static native boolean exportUpdates(long j2, byte[] bArr);

    public static native int fillInput(long j2, byte[] bArr, float[] fArr, int i2);

    public static native int fillInputBytes(long j2, byte[] bArr, byte[] bArr2, int i2);

    public static native int fillInputWithType(long j2, byte[] bArr, float[] fArr, int i2, int i3);

    public static native int forward(long j2);

    public static native XNNResult getOutput(long j2, byte[] bArr);

    public static native XNNResult getOutputShape(long j2, byte[] bArr);

    public static native XNNResult getShape(long j2, byte[] bArr);

    public static native long init(byte[] bArr);

    public static native long initWithConfiger(byte[] bArr, byte[] bArr2);

    public static native long initWithSharedModel(long j2, byte[] bArr);

    public static boolean loadxNNLibrary() {
    }

    public static native long patchSharedModel(long j2, byte[] bArr);

    public static native int propagateShape(long j2);

    public static native void release(long j2);

    public static native void releaseSharedModel(long j2);

    public static native int setShape(long j2, byte[] bArr, int[] iArr, int i2);

    public static native boolean train(long j2, long j3, byte[] bArr, byte[] bArr2, int i2, int i3);
}
