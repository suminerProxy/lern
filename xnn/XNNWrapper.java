package xnn;

import android.content.Context;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class XNNWrapper {
    private static String TAG = "XNNWrapper";
    public static int XNN_FLOAT = 1;
    public static int XNN_INT32 = 2;
    public static int XNN_INT64 = 3;
    private static String libPath;
    private static String libSqlPath;
    private static String libStlPath;

    public static long buildSharedModel(String str, String str2) {
    }

    public static XNNResult classifyImage(long j2, int[] iArr, int i2, int i3, int[] iArr2) {
    }

    public static XNNResult classifyYuv(long j2, byte[] bArr, int i2, int i3, int[] iArr, int i4) {
    }

    public static XNNResult detectImage(long j2, int[] iArr, int i2, int i3, int[] iArr2) {
    }

    public static XNNResult detectImageBGRA(long j2, int[] iArr, int i2, int i3, int[] iArr2) {
    }

    public static XNNResult detectYuv(long j2, byte[] bArr, int i2, int i3, int[] iArr, int i4) {
    }

    public static boolean exportUpdates(long j2, String str) {
    }

    public static int fillInput(long j2, byte[] bArr, float[] fArr, int i2) {
    }

    public static int fillInputBytes(long j2, byte[] bArr, byte[] bArr2, int i2) {
    }

    public static int fillInputWithType(long j2, byte[] bArr, float[] fArr, int i2, int i3) {
    }

    public static int forward(long j2) {
    }

    public static XNNResult getOutput(long j2, byte[] bArr) {
    }

    public static XNNResult getOutputShape(long j2, byte[] bArr) {
    }

    public static XNNResult getShape(long j2, byte[] bArr) {
    }

    public static synchronized long getxNNContext(Context context) {
    }

    public static long init(String str, String str2) {
    }

    public static long initWithConfiger(byte[] bArr, byte[] bArr2) {
    }

    public static long initWithSharedModel(long j2, String str) {
    }

    public static boolean loadxNNLibrary() {
    }

    public static long patchSharedModel(long j2, String str) {
    }

    public static int propagateShape(long j2) {
    }

    public static void release(long j2) {
    }

    public static void releaseSharedModel(long j2) {
    }

    public static int setShape(long j2, byte[] bArr, int[] iArr, int i2) {
    }

    public static boolean train(Context context, long j2, String str, String str2, String str3, int i2, int i3, int i4) {
    }

    public static XNNResult classifyImage(long j2, int[] iArr, int i2, int i3, int[] iArr2, int i4) {
    }

    public static XNNResult detectImage(long j2, int[] iArr, int i2, int i3, int[] iArr2, int i4) {
    }

    public static XNNResult detectImageBGRA(long j2, int[] iArr, int i2, int i3, int[] iArr2, int i4) {
    }

    public static void release(XNNInstance xNNInstance) {
    }

    public static XNNInstance init(String str, String[] strArr, String str2) {
    }
}
