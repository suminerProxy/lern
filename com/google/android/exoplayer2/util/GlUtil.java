package com.google.android.exoplayer2.util;

import android.content.Context;
import androidx.annotation.Nullable;
import java.nio.Buffer;
import java.nio.FloatBuffer;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class GlUtil {
    private static final String EXTENSION_PROTECTED_CONTENT = "EGL_EXT_protected_content";
    private static final String EXTENSION_SURFACELESS_CONTEXT = "EGL_KHR_surfaceless_context";
    private static final String TAG = "GlUtil";

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Attribute {
        @Nullable
        private Buffer buffer;
        private final int index;
        private final int location;
        public final String name;
        private int size;

        public Attribute(int program, int index) {
        }

        public void bind() {
        }

        public void setBuffer(float[] buffer, int size) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Uniform {
        private final int location;
        public final String name;
        private int texId;
        private final int type;
        private int unit;
        private final float[] value;

        public Uniform(int program, int index) {
        }

        public void bind() {
        }

        public void setFloat(float value) {
        }

        public void setFloats(float[] value) {
        }

        public void setSamplerTexId(int texId, int unit) {
        }
    }

    private GlUtil() {
    }

    public static /* synthetic */ int access$000(byte[] bArr) {
    }

    private static void addShader(int type, String source, int program) {
    }

    public static void checkGlError() {
    }

    public static int compileProgram(String[] vertexCode, String[] fragmentCode) {
    }

    public static FloatBuffer createBuffer(float[] data) {
    }

    public static int createExternalTexture() {
    }

    public static Attribute[] getAttributes(int program) {
    }

    public static Uniform[] getUniforms(int program) {
    }

    public static boolean isProtectedContentExtensionSupported(Context context) {
    }

    public static boolean isSurfacelessContextExtensionSupported() {
    }

    private static int strlen(byte[] strVal) {
    }

    private static void throwGlError(String errorMsg) {
    }

    public static int compileProgram(String vertexCode, String fragmentCode) {
    }

    public static FloatBuffer createBuffer(int capacity) {
    }
}
