package com.facebook.drawee.backends.pipeline;

import android.content.Context;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.imagepipeline.core.ImagePipelineConfig;
import com.facebook.imagepipeline.core.ImagePipelineFactory;
import com.facebook.imagepipeline.systrace.FrescoSystrace;
import javax.annotation.Nullable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class Fresco {
    private static final Class<?> TAG = Fresco.class;
    private static PipelineDraweeControllerBuilderSupplier sDraweeControllerBuilderSupplier;
    private static volatile boolean sIsInitialized;

    private Fresco() {
    }

    public static PipelineDraweeControllerBuilderSupplier getDraweeControllerBuilderSupplier() {
        return sDraweeControllerBuilderSupplier;
    }

    public static ImagePipeline getImagePipeline() {
        return getImagePipelineFactory().getImagePipeline();
    }

    public static ImagePipelineFactory getImagePipelineFactory() {
        return ImagePipelineFactory.getInstance();
    }

    public static boolean hasBeenInitialized() {
        return sIsInitialized;
    }

    public static void initialize(Context context) {
        initialize(context, null, null);
    }

    private static void initializeDrawee(Context context, @Nullable DraweeConfig draweeConfig) {
        if (FrescoSystrace.isTracing()) {
            FrescoSystrace.beginSection("Fresco.initializeDrawee");
        }
        PipelineDraweeControllerBuilderSupplier pipelineDraweeControllerBuilderSupplier = new PipelineDraweeControllerBuilderSupplier(context, draweeConfig);
        sDraweeControllerBuilderSupplier = pipelineDraweeControllerBuilderSupplier;
        SimpleDraweeView.initialize(pipelineDraweeControllerBuilderSupplier);
        if (FrescoSystrace.isTracing()) {
            FrescoSystrace.endSection();
        }
    }

    public static PipelineDraweeControllerBuilder newDraweeControllerBuilder() {
        return sDraweeControllerBuilderSupplier.get();
    }

    public static void shutDown() {
        sDraweeControllerBuilderSupplier = null;
        SimpleDraweeView.shutDown();
        ImagePipelineFactory.shutDown();
    }

    public static void initialize(Context context, @Nullable ImagePipelineConfig imagePipelineConfig) {
        initialize(context, imagePipelineConfig, null);
    }

    public static void initialize(Context context, @Nullable ImagePipelineConfig imagePipelineConfig, @Nullable DraweeConfig draweeConfig) {
        initialize(context, imagePipelineConfig, draweeConfig, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004d, code lost:
        if (com.facebook.imagepipeline.systrace.FrescoSystrace.isTracing() != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005e, code lost:
        if (com.facebook.imagepipeline.systrace.FrescoSystrace.isTracing() == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006d, code lost:
        if (com.facebook.imagepipeline.systrace.FrescoSystrace.isTracing() == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007c, code lost:
        if (com.facebook.imagepipeline.systrace.FrescoSystrace.isTracing() == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008b, code lost:
        if (com.facebook.imagepipeline.systrace.FrescoSystrace.isTracing() == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008d, code lost:
        com.facebook.imagepipeline.systrace.FrescoSystrace.endSection();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void initialize(android.content.Context r5, @javax.annotation.Nullable com.facebook.imagepipeline.core.ImagePipelineConfig r6, @javax.annotation.Nullable com.facebook.drawee.backends.pipeline.DraweeConfig r7, boolean r8) {
        /*
            boolean r0 = com.facebook.imagepipeline.systrace.FrescoSystrace.isTracing()
            if (r0 == 0) goto Lb
            java.lang.String r0 = "Fresco#initialize"
            com.facebook.imagepipeline.systrace.FrescoSystrace.beginSection(r0)
        Lb:
            boolean r0 = com.facebook.drawee.backends.pipeline.Fresco.sIsInitialized
            r1 = 1
            if (r0 == 0) goto L18
            java.lang.Class<?> r0 = com.facebook.drawee.backends.pipeline.Fresco.TAG
            java.lang.String r2 = "Fresco has already been initialized! `Fresco.initialize(...)` should only be called 1 single time to avoid memory leaks!"
            com.facebook.common.logging.FLog.w(r0, r2)
            goto L1a
        L18:
            com.facebook.drawee.backends.pipeline.Fresco.sIsInitialized = r1
        L1a:
            com.facebook.imagepipeline.core.NativeCodeSetup.setUseNativeCode(r8)
            boolean r8 = com.facebook.soloader.nativeloader.NativeLoader.isInitialized()
            if (r8 != 0) goto L9b
            boolean r8 = com.facebook.imagepipeline.systrace.FrescoSystrace.isTracing()
            if (r8 == 0) goto L2e
            java.lang.String r8 = "Fresco.initialize->SoLoader.init"
            com.facebook.imagepipeline.systrace.FrescoSystrace.beginSection(r8)
        L2e:
            java.lang.String r8 = "com.facebook.imagepipeline.nativecode.NativeCodeInitializer"
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch: java.lang.Throwable -> L50 java.lang.NoSuchMethodException -> L52 java.lang.reflect.InvocationTargetException -> L61 java.lang.IllegalAccessException -> L70 java.lang.ClassNotFoundException -> L7f
            java.lang.String r0 = "init"
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch: java.lang.Throwable -> L50 java.lang.NoSuchMethodException -> L52 java.lang.reflect.InvocationTargetException -> L61 java.lang.IllegalAccessException -> L70 java.lang.ClassNotFoundException -> L7f
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r4 = 0
            r2[r4] = r3     // Catch: java.lang.Throwable -> L50 java.lang.NoSuchMethodException -> L52 java.lang.reflect.InvocationTargetException -> L61 java.lang.IllegalAccessException -> L70 java.lang.ClassNotFoundException -> L7f
            java.lang.reflect.Method r8 = r8.getMethod(r0, r2)     // Catch: java.lang.Throwable -> L50 java.lang.NoSuchMethodException -> L52 java.lang.reflect.InvocationTargetException -> L61 java.lang.IllegalAccessException -> L70 java.lang.ClassNotFoundException -> L7f
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L50 java.lang.NoSuchMethodException -> L52 java.lang.reflect.InvocationTargetException -> L61 java.lang.IllegalAccessException -> L70 java.lang.ClassNotFoundException -> L7f
            r1[r4] = r5     // Catch: java.lang.Throwable -> L50 java.lang.NoSuchMethodException -> L52 java.lang.reflect.InvocationTargetException -> L61 java.lang.IllegalAccessException -> L70 java.lang.ClassNotFoundException -> L7f
            r8.invoke(r0, r1)     // Catch: java.lang.Throwable -> L50 java.lang.NoSuchMethodException -> L52 java.lang.reflect.InvocationTargetException -> L61 java.lang.IllegalAccessException -> L70 java.lang.ClassNotFoundException -> L7f
            boolean r8 = com.facebook.imagepipeline.systrace.FrescoSystrace.isTracing()
            if (r8 == 0) goto L9b
            goto L8d
        L50:
            r5 = move-exception
            goto L91
        L52:
            com.facebook.soloader.nativeloader.SystemDelegate r8 = new com.facebook.soloader.nativeloader.SystemDelegate     // Catch: java.lang.Throwable -> L50
            r8.<init>()     // Catch: java.lang.Throwable -> L50
            com.facebook.soloader.nativeloader.NativeLoader.initIfUninitialized(r8)     // Catch: java.lang.Throwable -> L50
            boolean r8 = com.facebook.imagepipeline.systrace.FrescoSystrace.isTracing()
            if (r8 == 0) goto L9b
            goto L8d
        L61:
            com.facebook.soloader.nativeloader.SystemDelegate r8 = new com.facebook.soloader.nativeloader.SystemDelegate     // Catch: java.lang.Throwable -> L50
            r8.<init>()     // Catch: java.lang.Throwable -> L50
            com.facebook.soloader.nativeloader.NativeLoader.initIfUninitialized(r8)     // Catch: java.lang.Throwable -> L50
            boolean r8 = com.facebook.imagepipeline.systrace.FrescoSystrace.isTracing()
            if (r8 == 0) goto L9b
            goto L8d
        L70:
            com.facebook.soloader.nativeloader.SystemDelegate r8 = new com.facebook.soloader.nativeloader.SystemDelegate     // Catch: java.lang.Throwable -> L50
            r8.<init>()     // Catch: java.lang.Throwable -> L50
            com.facebook.soloader.nativeloader.NativeLoader.initIfUninitialized(r8)     // Catch: java.lang.Throwable -> L50
            boolean r8 = com.facebook.imagepipeline.systrace.FrescoSystrace.isTracing()
            if (r8 == 0) goto L9b
            goto L8d
        L7f:
            com.facebook.soloader.nativeloader.SystemDelegate r8 = new com.facebook.soloader.nativeloader.SystemDelegate     // Catch: java.lang.Throwable -> L50
            r8.<init>()     // Catch: java.lang.Throwable -> L50
            com.facebook.soloader.nativeloader.NativeLoader.initIfUninitialized(r8)     // Catch: java.lang.Throwable -> L50
            boolean r8 = com.facebook.imagepipeline.systrace.FrescoSystrace.isTracing()
            if (r8 == 0) goto L9b
        L8d:
            com.facebook.imagepipeline.systrace.FrescoSystrace.endSection()
            goto L9b
        L91:
            boolean r6 = com.facebook.imagepipeline.systrace.FrescoSystrace.isTracing()
            if (r6 == 0) goto L9a
            com.facebook.imagepipeline.systrace.FrescoSystrace.endSection()
        L9a:
            throw r5
        L9b:
            android.content.Context r5 = r5.getApplicationContext()
            if (r6 != 0) goto La5
            com.facebook.imagepipeline.core.ImagePipelineFactory.initialize(r5)
            goto La8
        La5:
            com.facebook.imagepipeline.core.ImagePipelineFactory.initialize(r6)
        La8:
            initializeDrawee(r5, r7)
            boolean r5 = com.facebook.imagepipeline.systrace.FrescoSystrace.isTracing()
            if (r5 == 0) goto Lb4
            com.facebook.imagepipeline.systrace.FrescoSystrace.endSection()
        Lb4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.drawee.backends.pipeline.Fresco.initialize(android.content.Context, com.facebook.imagepipeline.core.ImagePipelineConfig, com.facebook.drawee.backends.pipeline.DraweeConfig, boolean):void");
    }
}
