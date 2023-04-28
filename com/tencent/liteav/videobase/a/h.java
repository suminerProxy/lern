package com.tencent.liteav.videobase.a;

import androidx.annotation.NonNull;
import java.nio.FloatBuffer;
import java.util.List;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class h extends b {
    private static final String TAG = "TXCGPUImageFilterChain";
    private final List<b> mFilters;
    private final Map<b, List<a>> mInterceptorsBeforeFilter;
    @NonNull
    private final List<a> mLastInterceptors;
    private final FloatBuffer mNormalCubeVerticesBuffer;
    private final FloatBuffer mNormalTextureCoordsBuffer;
    private long mTimestamp;

    public static /* synthetic */ void access$lambda$0(h hVar) {
    }

    private com.tencent.liteav.videobase.frame.d doIntercept(List<a> list, com.tencent.liteav.videobase.frame.d dVar) {
    }

    private com.tencent.liteav.videobase.frame.d doLastIntercept(com.tencent.liteav.videobase.frame.d dVar) {
    }

    private void initFiltersAndInterceptors() {
    }

    private void initFiltersAndInterceptorsOnDraw() {
    }

    public synchronized void addFilter(b bVar) {
    }

    public synchronized void addInterceptor(a aVar) {
    }

    @Override // com.tencent.liteav.videobase.a.b
    public void onDraw(int i2, com.tencent.liteav.videobase.frame.d dVar, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
    }

    @Override // com.tencent.liteav.videobase.a.b
    public void onInit(com.tencent.liteav.videobase.frame.e eVar) {
    }

    @Override // com.tencent.liteav.videobase.a.b
    public void onOutputSizeChanged(int i2, int i3) {
    }

    @Override // com.tencent.liteav.videobase.a.b
    public void onUninit() {
    }

    public synchronized void removeAllFilterAndInterceptor() {
    }

    public void setTimestamp(long j2) {
    }
}
