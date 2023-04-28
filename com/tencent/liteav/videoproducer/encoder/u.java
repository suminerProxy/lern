package com.tencent.liteav.videoproducer.encoder;

import android.annotation.SuppressLint;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.util.Pair;
import androidx.annotation.RequiresApi;
import com.tencent.liteav.videoproducer.encoder.VideoEncoderDef;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class u {

    /* renamed from: a  reason: collision with root package name */
    public boolean f12644a;
    public boolean b;
    public boolean c;

    /* renamed from: d  reason: collision with root package name */
    private final MediaCodec f12645d;

    /* renamed from: e  reason: collision with root package name */
    private final String f12646e;

    /* renamed from: f  reason: collision with root package name */
    private final VideoEncodeParams f12647f;

    /* renamed from: com.tencent.liteav.videoproducer.encoder.u$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f12648a = null;
        public static final /* synthetic */ int[] b = null;
    }

    public u(MediaCodec mediaCodec, String str, VideoEncodeParams videoEncodeParams) {
    }

    @RequiresApi(api = 23)
    private static Pair<Integer, Integer> a(MediaFormat mediaFormat) {
    }

    @RequiresApi(api = 21)
    private MediaCodecInfo.VideoCapabilities a(int i2, int i3) {
    }

    @RequiresApi(api = 21)
    private static int a(VideoEncoderDef.BitrateMode bitrateMode) {
    }

    @SuppressLint({"NewApi"})
    public final MediaFormat a() {
    }
}
