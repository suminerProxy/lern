package com.tencent.cloud.huiyansdkface.record;

import android.graphics.YuvImage;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class VideoEncoder {
    public static final int COLOR_FORMAT_YUV_420_SEMI_PLANAR = 21;

    /* renamed from: a  reason: collision with root package name */
    private static final String f11142a = "VideoEncoder";

    /* renamed from: m  reason: collision with root package name */
    private static int f11143m;

    /* renamed from: n  reason: collision with root package name */
    private static int f11144n;
    private IYUVToVideoEncoderCallback b;
    private File c;

    /* renamed from: d  reason: collision with root package name */
    private ConcurrentLinkedQueue<YuvImage> f11145d;

    /* renamed from: e  reason: collision with root package name */
    private ConcurrentLinkedQueue<Object> f11146e;

    /* renamed from: f  reason: collision with root package name */
    private byte[] f11147f;

    /* renamed from: g  reason: collision with root package name */
    private MediaCodec f11148g;

    /* renamed from: h  reason: collision with root package name */
    private MediaMuxer f11149h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f11150i;

    /* renamed from: j  reason: collision with root package name */
    private final Object f11151j;

    /* renamed from: k  reason: collision with root package name */
    private final Object f11152k;

    /* renamed from: l  reason: collision with root package name */
    private CountDownLatch f11153l;

    /* renamed from: o  reason: collision with root package name */
    private boolean f11154o;

    /* renamed from: p  reason: collision with root package name */
    private int f11155p;
    private int q;
    private int r;
    private boolean s;
    private boolean t;
    private boolean u;
    private int v;
    private int w;
    private byte[] x;
    private ByteArrayOutputStream y;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface IYUVToVideoEncoderCallback {
        void onEncodingComplete(File file);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f11156a = null;
        private static final /* synthetic */ a[] b = null;

        private a(String str, int i2) {
        }

        public static a valueOf(String str) {
        }

        public static a[] values() {
        }
    }

    public VideoEncoder(IYUVToVideoEncoderCallback iYUVToVideoEncoderCallback, boolean z) {
    }

    private static int a(MediaCodecInfo mediaCodecInfo, String str) {
    }

    private long a(long j2, int i2) {
    }

    private static MediaCodecInfo a(String str) {
    }

    private ByteBuffer a(a aVar, int i2) {
    }

    private void a() {
    }

    private void a(a aVar, MediaFormat mediaFormat) {
    }

    private static boolean a(int i2) {
    }

    private byte[] a(int i2, int i3, YuvImage yuvImage) {
    }

    private ByteBuffer b(a aVar, int i2) {
    }

    private byte[] b(int i2, int i3, YuvImage yuvImage) {
    }

    private byte[] c(int i2, int i3, YuvImage yuvImage) {
    }

    public void abortEncoding() {
    }

    public void encode() {
    }

    public void encodeH264() {
    }

    public int getColorFormat() {
    }

    public int getYUVImageSize() {
    }

    public boolean isEncodingStarted() {
    }

    public void queueFrame(YuvImage yuvImage) {
    }

    public void queueFrameH264(YuvImage yuvImage) {
    }

    public void startEncoding(int i2, int i3, File file, int i4, int i5, int i6) {
    }

    public void startEncodingH264(int i2, int i3, ByteArrayOutputStream byteArrayOutputStream, int i4, int i5, int i6) {
    }

    public void stopEncoding() {
    }

    public void stopEncodingH264() {
    }
}
