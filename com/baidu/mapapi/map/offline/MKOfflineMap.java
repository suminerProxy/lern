package com.baidu.mapapi.map.offline;

import com.baidu.mapsdkplatform.comapi.map.n;
import java.util.ArrayList;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class MKOfflineMap {
    public static final int TYPE_DOWNLOAD_UPDATE = 0;
    public static final int TYPE_NETWORK_ERROR = 2;
    public static final int TYPE_NEW_OFFLINE = 6;
    public static final int TYPE_VER_UPDATE = 4;

    /* renamed from: a  reason: collision with root package name */
    private static final String f1914a = "MKOfflineMap";
    private n b;
    private MKOfflineMapListener c;

    public static /* synthetic */ n a(MKOfflineMap mKOfflineMap) {
    }

    public static /* synthetic */ MKOfflineMapListener b(MKOfflineMap mKOfflineMap) {
    }

    public void destroy() {
    }

    public ArrayList<MKOLUpdateElement> getAllUpdateInfo() {
    }

    public ArrayList<MKOLSearchRecord> getHotCityList() {
    }

    public ArrayList<MKOLSearchRecord> getOfflineCityList() {
    }

    public MKOLUpdateElement getUpdateInfo(int i2) {
    }

    @Deprecated
    public int importOfflineData() {
    }

    public boolean init(MKOfflineMapListener mKOfflineMapListener) {
    }

    public boolean pause(int i2) {
    }

    public boolean remove(int i2) {
    }

    public ArrayList<MKOLSearchRecord> searchCity(String str) {
    }

    public boolean start(int i2) {
    }

    public boolean update(int i2) {
    }

    @Deprecated
    public int importOfflineData(boolean z) {
    }
}
