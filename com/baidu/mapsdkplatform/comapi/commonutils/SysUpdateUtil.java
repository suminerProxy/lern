package com.baidu.mapsdkplatform.comapi.commonutils;

import android.content.Context;
import com.baidu.mapsdkplatform.comapi.util.SysUpdateObserver;
import com.baidu.platform.comjni.map.commonmemcache.NACommonMemCache;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class SysUpdateUtil implements SysUpdateObserver {

    /* renamed from: a  reason: collision with root package name */
    private static NACommonMemCache f2277a = null;
    private static boolean b = false;
    private static String c = "";

    /* renamed from: d  reason: collision with root package name */
    private static int f2278d;

    @Override // com.baidu.mapsdkplatform.comapi.util.SysUpdateObserver
    public void init(String str) {
    }

    @Override // com.baidu.mapsdkplatform.comapi.util.SysUpdateObserver
    public void updateNetworkInfo(Context context) {
    }

    @Override // com.baidu.mapsdkplatform.comapi.util.SysUpdateObserver
    public void updateNetworkProxy(Context context) {
    }

    @Override // com.baidu.mapsdkplatform.comapi.util.SysUpdateObserver
    public void updatePhoneInfo(String str) {
    }
}
