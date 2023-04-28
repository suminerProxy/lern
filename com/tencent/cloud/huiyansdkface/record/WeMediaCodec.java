package com.tencent.cloud.huiyansdkface.record;

import android.content.Context;
import android.media.MediaCodec;
import androidx.annotation.WorkerThread;
import com.tencent.cloud.huiyansdkface.record.h264.NV21Convert;
import java.io.ByteArrayOutputStream;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class WeMediaCodec {

    /* renamed from: g  reason: collision with root package name */
    private static int f11157g;

    /* renamed from: a  reason: collision with root package name */
    private int f11158a;
    private int b;
    private MediaCodec c;

    /* renamed from: d  reason: collision with root package name */
    private NV21Convert f11159d;

    /* renamed from: e  reason: collision with root package name */
    private WbRecordFinishListener f11160e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f11161f;

    /* renamed from: h  reason: collision with root package name */
    private int f11162h;

    /* renamed from: i  reason: collision with root package name */
    private int f11163i;

    /* renamed from: j  reason: collision with root package name */
    private int f11164j;

    /* renamed from: k  reason: collision with root package name */
    private byte[] f11165k;

    /* renamed from: l  reason: collision with root package name */
    private byte[] f11166l;

    /* renamed from: m  reason: collision with root package name */
    private WeWrapMp4Jni f11167m;

    /* renamed from: n  reason: collision with root package name */
    private byte[] f11168n;

    /* renamed from: o  reason: collision with root package name */
    private byte[] f11169o;

    /* renamed from: p  reason: collision with root package name */
    private byte[] f11170p;
    private int q;
    private int r;
    private ByteArrayOutputStream s;

    public WeMediaCodec(Context context, WeWrapMp4Jni weWrapMp4Jni, int i2, int i3, int i4, int i5) {
    }

    public void destroy() {
    }

    public ByteArrayOutputStream getVideoByte() {
    }

    public boolean initMediaCodec(Context context) {
    }

    @WorkerThread
    public void onPreviewFrame(byte[] bArr) {
    }

    public void start(WbRecordFinishListener wbRecordFinishListener) {
    }

    public void stop() {
    }
}
