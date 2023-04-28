package com.baidu.platform.comjni.map.dataengine;

import android.os.Bundle;
import com.baidu.platform.comjni.NativeComponent;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class NADataEngine extends NativeComponent {
    private native void nativeCancelThumbImageRequest(long j2);

    private native long nativeCreate();

    private native String nativeGetCurrentStreetId(long j2);

    private native String nativeGetCurrentStreetInfo(long j2, Bundle bundle);

    private native boolean nativeGetHotMapCityInfo(long j2, Bundle bundle);

    private native boolean nativeGetStreetCityInfo(long j2, Bundle bundle);

    private native boolean nativeQueryThumbImage(long j2, String str);

    private native int nativeRelease(long j2);

    private native void nativeSetStreetPOIUID(long j2, String str);

    private native boolean nativeStreetSwitchByUID(long j2, String str, String str2);

    private native boolean nativeStreetSwitchToID(long j2, String str, int i2);

    private native boolean nativeStreetSwitchToIDFromReGeo(long j2, String str, String str2, long j3, long j4);

    private native boolean nativeStreetSwitchToIID(long j2, String str, String str2, boolean z);

    @Override // com.baidu.platform.comjni.NativeComponent
    public long create() {
    }

    @Override // com.baidu.platform.comjni.NativeComponent
    public int dispose() {
    }
}
