package com.tencent.live2;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import javax.microedition.khronos.egl.EGLContext;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class V2TXLiveDef {

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class V2TXLiveAudioFrame {
        public int channel;
        public byte[] data;
        public int sampleRate;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class V2TXLiveAudioQuality {
        private static final /* synthetic */ V2TXLiveAudioQuality[] $VALUES = null;
        public static final V2TXLiveAudioQuality V2TXLiveAudioQualityDefault = null;
        public static final V2TXLiveAudioQuality V2TXLiveAudioQualityMusic = null;
        public static final V2TXLiveAudioQuality V2TXLiveAudioQualitySpeech = null;

        private V2TXLiveAudioQuality(String str, int i2) {
        }

        public static V2TXLiveAudioQuality valueOf(String str) {
        }

        public static V2TXLiveAudioQuality[] values() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class V2TXLiveBufferType {
        private static final /* synthetic */ V2TXLiveBufferType[] $VALUES = null;
        public static final V2TXLiveBufferType V2TXLiveBufferTypeByteArray = null;
        public static final V2TXLiveBufferType V2TXLiveBufferTypeByteBuffer = null;
        public static final V2TXLiveBufferType V2TXLiveBufferTypeTexture = null;
        public static final V2TXLiveBufferType V2TXLiveBufferTypeUnknown = null;

        private V2TXLiveBufferType(String str, int i2) {
        }

        public static V2TXLiveBufferType valueOf(String str) {
        }

        public static V2TXLiveBufferType[] values() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class V2TXLiveFillMode {
        private static final /* synthetic */ V2TXLiveFillMode[] $VALUES = null;
        public static final V2TXLiveFillMode V2TXLiveFillModeFill = null;
        public static final V2TXLiveFillMode V2TXLiveFillModeFit = null;
        public static final V2TXLiveFillMode V2TXLiveFillModeScaleFill = null;

        private V2TXLiveFillMode(String str, int i2) {
        }

        public static V2TXLiveFillMode valueOf(String str) {
        }

        public static V2TXLiveFillMode[] values() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class V2TXLiveLogConfig {
        public boolean enableConsole;
        public boolean enableLogFile;
        public boolean enableObserver;
        public int logLevel;
        public String logPath;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class V2TXLiveLogLevel {
        public static final int V2TXLiveLogLevelAll = 0;
        public static final int V2TXLiveLogLevelDebug = 1;
        public static final int V2TXLiveLogLevelError = 4;
        public static final int V2TXLiveLogLevelFatal = 5;
        public static final int V2TXLiveLogLevelInfo = 2;
        public static final int V2TXLiveLogLevelNULL = 6;
        public static final int V2TXLiveLogLevelWarning = 3;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class V2TXLiveMirrorType {
        private static final /* synthetic */ V2TXLiveMirrorType[] $VALUES = null;
        public static final V2TXLiveMirrorType V2TXLiveMirrorTypeAuto = null;
        public static final V2TXLiveMirrorType V2TXLiveMirrorTypeDisable = null;
        public static final V2TXLiveMirrorType V2TXLiveMirrorTypeEnable = null;

        private V2TXLiveMirrorType(String str, int i2) {
        }

        public static V2TXLiveMirrorType valueOf(String str) {
        }

        public static V2TXLiveMirrorType[] values() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class V2TXLiveMixInputType {
        private static final /* synthetic */ V2TXLiveMixInputType[] $VALUES = null;
        public static final V2TXLiveMixInputType V2TXLiveMixInputTypeAudioVideo = null;
        public static final V2TXLiveMixInputType V2TXLiveMixInputTypePureAudio = null;
        public static final V2TXLiveMixInputType V2TXLiveMixInputTypePureVideo = null;

        private V2TXLiveMixInputType(String str, int i2) {
        }

        public static V2TXLiveMixInputType valueOf(String str) {
        }

        public static V2TXLiveMixInputType[] values() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class V2TXLiveMode {
        private static final /* synthetic */ V2TXLiveMode[] $VALUES = null;
        public static final V2TXLiveMode TXLiveMode_RTC = null;
        public static final V2TXLiveMode TXLiveMode_RTMP = null;

        private V2TXLiveMode(String str, int i2) {
        }

        public static V2TXLiveMode valueOf(String str) {
        }

        public static V2TXLiveMode[] values() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class V2TXLivePixelFormat {
        private static final /* synthetic */ V2TXLivePixelFormat[] $VALUES = null;
        public static final V2TXLivePixelFormat V2TXLivePixelFormatI420 = null;
        public static final V2TXLivePixelFormat V2TXLivePixelFormatTexture2D = null;
        public static final V2TXLivePixelFormat V2TXLivePixelFormatUnknown = null;

        private V2TXLivePixelFormat(String str, int i2) {
        }

        public static V2TXLivePixelFormat valueOf(String str) {
        }

        public static V2TXLivePixelFormat[] values() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class V2TXLivePlayerStatistics {
        public int appCpu;
        public int audioBitrate;
        public int fps;
        public int height;
        public int systemCpu;
        public int videoBitrate;
        public int width;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class V2TXLivePushStatus {
        private static final /* synthetic */ V2TXLivePushStatus[] $VALUES = null;
        public static final V2TXLivePushStatus V2TXLivePushStatusConnectSuccess = null;
        public static final V2TXLivePushStatus V2TXLivePushStatusConnecting = null;
        public static final V2TXLivePushStatus V2TXLivePushStatusDisconnected = null;
        public static final V2TXLivePushStatus V2TXLivePushStatusReconnecting = null;

        private V2TXLivePushStatus(String str, int i2) {
        }

        public static V2TXLivePushStatus valueOf(String str) {
        }

        public static V2TXLivePushStatus[] values() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class V2TXLivePusherStatistics {
        public int appCpu;
        public int audioBitrate;
        public int fps;
        public int height;
        public int systemCpu;
        public int videoBitrate;
        public int width;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class V2TXLiveRotation {
        private static final /* synthetic */ V2TXLiveRotation[] $VALUES = null;
        public static final V2TXLiveRotation V2TXLiveRotation0 = null;
        public static final V2TXLiveRotation V2TXLiveRotation180 = null;
        public static final V2TXLiveRotation V2TXLiveRotation270 = null;
        public static final V2TXLiveRotation V2TXLiveRotation90 = null;

        private V2TXLiveRotation(String str, int i2) {
        }

        public static V2TXLiveRotation valueOf(String str) {
        }

        public static V2TXLiveRotation[] values() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class V2TXLiveTexture {
        public EGLContext eglContext10;
        public android.opengl.EGLContext eglContext14;
        public int textureId;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class V2TXLiveVideoEncoderParam {
        public int minVideoBitrate;
        public int videoBitrate;
        public int videoFps;
        public V2TXLiveVideoResolution videoResolution;
        public V2TXLiveVideoResolutionMode videoResolutionMode;

        public V2TXLiveVideoEncoderParam(V2TXLiveVideoResolution v2TXLiveVideoResolution) {
        }

        public final String toString() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class V2TXLiveVideoFrame {
        public ByteBuffer buffer;
        public V2TXLiveBufferType bufferType;
        public byte[] data;
        public int height;
        public V2TXLivePixelFormat pixelFormat;
        public int rotation;
        public V2TXLiveTexture texture;
        public int width;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class V2TXLiveVideoResolution {
        private static final /* synthetic */ V2TXLiveVideoResolution[] $VALUES = null;
        public static final V2TXLiveVideoResolution V2TXLiveVideoResolution1280x720 = null;
        public static final V2TXLiveVideoResolution V2TXLiveVideoResolution160x160 = null;
        public static final V2TXLiveVideoResolution V2TXLiveVideoResolution1920x1080 = null;
        public static final V2TXLiveVideoResolution V2TXLiveVideoResolution270x270 = null;
        public static final V2TXLiveVideoResolution V2TXLiveVideoResolution320x180 = null;
        public static final V2TXLiveVideoResolution V2TXLiveVideoResolution320x240 = null;
        public static final V2TXLiveVideoResolution V2TXLiveVideoResolution480x270 = null;
        public static final V2TXLiveVideoResolution V2TXLiveVideoResolution480x360 = null;
        public static final V2TXLiveVideoResolution V2TXLiveVideoResolution480x480 = null;
        public static final V2TXLiveVideoResolution V2TXLiveVideoResolution640x360 = null;
        public static final V2TXLiveVideoResolution V2TXLiveVideoResolution640x480 = null;
        public static final V2TXLiveVideoResolution V2TXLiveVideoResolution960x540 = null;

        private V2TXLiveVideoResolution(String str, int i2) {
        }

        public static V2TXLiveVideoResolution valueOf(String str) {
        }

        public static V2TXLiveVideoResolution[] values() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class V2TXLiveVideoResolutionMode {
        private static final /* synthetic */ V2TXLiveVideoResolutionMode[] $VALUES = null;
        public static final V2TXLiveVideoResolutionMode V2TXLiveVideoResolutionModeLandscape = null;
        public static final V2TXLiveVideoResolutionMode V2TXLiveVideoResolutionModePortrait = null;

        private V2TXLiveVideoResolutionMode(String str, int i2) {
        }

        public static V2TXLiveVideoResolutionMode valueOf(String str) {
        }

        public static V2TXLiveVideoResolutionMode[] values() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class V2TXLiveMixStream {
        public int height;
        public V2TXLiveMixInputType inputType;
        public String streamId;
        public String userId;
        public int width;
        public int x;
        public int y;
        public int zOrder;

        public V2TXLiveMixStream() {
        }

        public String toString() {
        }

        public V2TXLiveMixStream(String str, int i2, int i3, int i4, int i5, int i6) {
        }

        public V2TXLiveMixStream(V2TXLiveMixStream v2TXLiveMixStream) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class V2TXLiveTranscodingConfig {
        public int audioBitrate;
        public int audioChannels;
        public int audioSampleRate;
        public int backgroundColor;
        public String backgroundImage;
        public ArrayList<V2TXLiveMixStream> mixStreams;
        public String outputStreamId;
        public int videoBitrate;
        public int videoFramerate;
        public int videoGOP;
        public int videoHeight;
        public int videoWidth;

        public V2TXLiveTranscodingConfig() {
        }

        public final String toString() {
        }

        public V2TXLiveTranscodingConfig(V2TXLiveTranscodingConfig v2TXLiveTranscodingConfig) {
        }
    }
}
