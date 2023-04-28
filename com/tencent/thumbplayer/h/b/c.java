package com.tencent.thumbplayer.h.b;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tencent.thumbplayer.h.f.a;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public interface c {
    int a(long j2);

    int a(@NonNull MediaCodec.BufferInfo bufferInfo, long j2);

    @NonNull
    MediaCodec a();

    void a(int i2, int i3, int i4, long j2, int i5);

    void a(int i2, boolean z);

    void a(@NonNull MediaFormat mediaFormat, @Nullable Surface surface, @Nullable MediaCrypto mediaCrypto, int i2);

    @TargetApi(23)
    void a(@NonNull Surface surface);

    void a(@Nullable com.tencent.thumbplayer.h.a.a aVar);

    @NonNull
    a.b b(@NonNull e eVar);

    void b();

    void c();

    void d();

    void e();

    void f();

    void g();
}
