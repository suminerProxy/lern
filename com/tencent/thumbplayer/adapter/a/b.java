package com.tencent.thumbplayer.adapter.a;

import android.content.res.AssetFileDescriptor;
import android.os.ParcelFileDescriptor;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.tencent.thumbplayer.adapter.a.c;
import com.tencent.thumbplayer.api.TPCaptureCallBack;
import com.tencent.thumbplayer.api.TPCaptureParams;
import com.tencent.thumbplayer.api.TPCommonEnum;
import com.tencent.thumbplayer.api.TPOptionalParam;
import com.tencent.thumbplayer.api.TPProgramInfo;
import com.tencent.thumbplayer.api.TPTrackInfo;
import com.tencent.thumbplayer.api.composition.ITPMediaAsset;
import java.util.List;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public interface b {
    void a(float f2);

    void a(int i2);

    void a(int i2, @TPCommonEnum.TPSeekMode int i3);

    void a(int i2, long j2);

    void a(AssetFileDescriptor assetFileDescriptor);

    void a(ParcelFileDescriptor parcelFileDescriptor);

    void a(Surface surface);

    void a(SurfaceHolder surfaceHolder);

    void a(c.a aVar);

    void a(c.b bVar);

    void a(c.InterfaceC0243c interfaceC0243c);

    void a(c.d dVar);

    void a(c.e eVar);

    void a(c.f fVar);

    void a(c.g gVar);

    void a(c.h hVar);

    void a(c.i iVar);

    void a(c.j jVar);

    void a(c.l lVar);

    void a(c.m mVar);

    void a(c.n nVar);

    void a(c.o oVar);

    void a(c.p pVar);

    void a(TPCaptureParams tPCaptureParams, TPCaptureCallBack tPCaptureCallBack);

    void a(TPOptionalParam tPOptionalParam);

    void a(ITPMediaAsset iTPMediaAsset);

    void a(ITPMediaAsset iTPMediaAsset, @TPCommonEnum.TPSwitchDefMode int i2, long j2);

    void a(com.tencent.thumbplayer.f.b bVar);

    void a(String str);

    void a(String str, @TPCommonEnum.TPSwitchDefMode int i2, long j2);

    void a(String str, String str2, String str3);

    void a(String str, String str2, List<TPOptionalParam> list);

    void a(String str, Map<String, String> map);

    void a(String str, Map<String, String> map, @TPCommonEnum.TPSwitchDefMode int i2, long j2);

    void a(boolean z);

    void a(boolean z, long j2, long j3);

    long b(int i2);

    void b(float f2);

    void b(int i2, long j2);

    void b(boolean z);

    String c(int i2);

    void c(int i2, long j2);

    void f();

    void g();

    void h();

    void i();

    void j();

    void k();

    void l();

    long m();

    long n();

    long o();

    int p();

    int q();

    TPTrackInfo[] r();

    TPProgramInfo[] s();

    long t();
}
