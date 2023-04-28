package com.tencent.liteav.videobase.a;

import com.tencent.liteav.base.util.p;
import java.nio.FloatBuffer;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class b {
    private static final float[] IDENTITY_MATRIX = null;
    public static final String NO_FILTER_FRAGMENT_SHADER = "varying highp vec2 textureCoordinate;\n \nuniform sampler2D inputImageTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}";
    public static final String NO_FILTER_VERTEX_SHADER = "attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\nuniform mat4 textureTransform;\nvarying highp vec2 textureCoordinate;\nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = (textureTransform * inputTextureCoordinate).xy;\n}";
    private static final String TAG = "TXCGPUImageFilter";
    private static final AtomicInteger sFilterCount = null;
    public int mGLAttribPosition;
    public int mGLAttribTextureCoord;
    private final com.tencent.liteav.videobase.frame.c mGLFrameBuffer;
    public int mGLUniformTexture;
    private boolean mIsInitialized;
    public final p mOutputSize;
    private final com.tencent.liteav.videobase.utils.j mProgram;
    private int mProgramId;
    private final com.tencent.liteav.videobase.utils.e mRunOnDrawQueue;
    private float[] mTextureMatrix;
    public com.tencent.liteav.videobase.frame.e mTexturePool;
    private int mUniformTextureTransform;

    public b() {
    }

    public static /* synthetic */ void lambda$runOnDrawAndWaitDone$4(Runnable runnable, CountDownLatch countDownLatch) {
    }

    public static /* synthetic */ void lambda$setFloatOnDraw$0(int i2, float f2) {
    }

    public static /* synthetic */ void lambda$setFloatVec2OnDraw$2(int i2, float[] fArr) {
    }

    public static /* synthetic */ void lambda$setFloatVec3OnDraw$1(int i2, float[] fArr) {
    }

    public static /* synthetic */ void lambda$setFloatVec4OnDraw$3(int i2, float[] fArr) {
    }

    public void afterDrawArrays() {
    }

    public void beforeDrawArrays(int i2) {
    }

    public int buildProgram() {
    }

    public boolean canBeSkipped() {
    }

    public p getOutputSize() {
    }

    public final int getProgramId() {
    }

    public int getTarget() {
    }

    public final void initialize(com.tencent.liteav.videobase.frame.e eVar) {
    }

    public boolean isInitialized() {
    }

    public void onDraw(int i2, com.tencent.liteav.videobase.frame.d dVar, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
    }

    public void onFilterBeenSkipped() {
    }

    public void onInit(com.tencent.liteav.videobase.frame.e eVar) {
    }

    public void onOutputSizeChanged(int i2, int i3) {
    }

    public void onUninit() {
    }

    public final void runOnDraw(Runnable runnable) {
    }

    public void runOnDrawAndWaitDone(Runnable runnable) {
    }

    public void runPendingOnDrawTasks() {
    }

    public void setFloatOnDraw(int i2, float f2) {
    }

    public void setFloatVec2OnDraw(int i2, float[] fArr) {
    }

    public void setFloatVec3OnDraw(int i2, float[] fArr) {
    }

    public void setFloatVec4OnDraw(int i2, float[] fArr) {
    }

    public void setTexutreTransform(float[] fArr) {
    }

    public final void uninitialize() {
    }

    public b(String str, String str2) {
    }
}
