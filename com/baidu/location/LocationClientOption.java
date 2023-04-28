package com.baidu.location;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class LocationClientOption {
    public static final int GpsFirst = 1;
    public static final int GpsOnly = 3;
    public static final int LOC_SENSITIVITY_HIGHT = 1;
    public static final int LOC_SENSITIVITY_LOW = 3;
    public static final int LOC_SENSITIVITY_MIDDLE = 2;
    public static final int MIN_AUTO_NOTIFY_INTERVAL = 10000;
    public static final int MIN_SCAN_SPAN = 1000;
    public static final int NetWorkFirst = 2;

    /* renamed from: a  reason: collision with root package name */
    public LocationMode f1130a;
    public String addrType;
    public float autoNotifyLocSensitivity;
    public int autoNotifyMaxInterval;
    public int autoNotifyMinDistance;
    public int autoNotifyMinTimeInterval;
    public String coorType;
    public boolean disableLocCache;
    public boolean enableSimulateGps;
    public boolean isIgnoreCacheException;
    public boolean isIgnoreKillProcess;
    public boolean isNeedAltitude;
    public boolean isNeedAptag;
    public boolean isNeedAptagd;
    public boolean isNeedNewVersionRgc;
    public boolean isNeedPoiRegion;
    public boolean isNeedRegular;
    public boolean isOnceLocation;
    public boolean location_change_notify;
    public boolean mIsNeedDeviceDirect;
    public boolean openGps;
    public int priority;
    public String prodName;
    public int scanSpan;
    public String serviceName;
    public int timeOut;
    public int wifiCacheTimeOut;

    /* renamed from: com.baidu.location.LocationClientOption$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f1131a = null;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class BDLocationPurpose {
        private static final /* synthetic */ BDLocationPurpose[] $VALUES = null;
        public static final BDLocationPurpose SignIn = null;
        public static final BDLocationPurpose Sport = null;
        public static final BDLocationPurpose Transport = null;

        private BDLocationPurpose(String str, int i2) {
        }

        public static BDLocationPurpose valueOf(String str) {
        }

        public static BDLocationPurpose[] values() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class LocationMode {
        private static final /* synthetic */ LocationMode[] $VALUES = null;
        public static final LocationMode Battery_Saving = null;
        public static final LocationMode Device_Sensors = null;
        public static final LocationMode Hight_Accuracy = null;

        private LocationMode(String str, int i2) {
        }

        public static LocationMode valueOf(String str) {
        }

        public static LocationMode[] values() {
        }
    }

    public LocationClientOption() {
    }

    public LocationClientOption(LocationClientOption locationClientOption) {
    }

    public void SetIgnoreCacheException(boolean z) {
    }

    public int a() {
    }

    public float b() {
    }

    public void disableCache(boolean z) {
    }

    public String getAddrType() {
    }

    public int getAutoNotifyMinDistance() {
    }

    public int getAutoNotifyMinTimeInterval() {
    }

    public String getCoorType() {
    }

    public LocationMode getLocationMode() {
    }

    public int getPriority() {
    }

    public String getProdName() {
    }

    public int getScanSpan() {
    }

    public String getServiceName() {
    }

    public int getTimeOut() {
    }

    public boolean isDisableCache() {
    }

    public boolean isLocationNotify() {
    }

    public boolean isOnceLocation() {
    }

    public boolean isOpenGps() {
    }

    public boolean optionEquals(LocationClientOption locationClientOption) {
    }

    @Deprecated
    public void setAddrType(String str) {
    }

    public void setCoorType(String str) {
    }

    public void setEnableSimulateGps(boolean z) {
    }

    public void setIgnoreKillProcess(boolean z) {
    }

    public void setIsNeedAddress(boolean z) {
    }

    public void setIsNeedAltitude(boolean z) {
    }

    public void setIsNeedLocationDescribe(boolean z) {
    }

    public void setIsNeedLocationPoiList(boolean z) {
    }

    public void setLocationMode(LocationMode locationMode) {
    }

    public void setLocationNotify(boolean z) {
    }

    public void setLocationPurpose(BDLocationPurpose bDLocationPurpose) {
    }

    public void setNeedDeviceDirect(boolean z) {
    }

    public void setNeedNewVersionRgc(boolean z) {
    }

    public void setOnceLocation(boolean z) {
    }

    public void setOpenAutoNotifyMode() {
    }

    public void setOpenAutoNotifyMode(int i2, int i3, int i4) {
    }

    public void setOpenGps(boolean z) {
    }

    @Deprecated
    public void setPriority(int i2) {
    }

    public void setProdName(String str) {
    }

    public void setScanSpan(int i2) {
    }

    @Deprecated
    public void setSema(boolean z, boolean z2, boolean z3) {
    }

    public void setServiceName(String str) {
    }

    public void setTimeOut(int i2) {
    }

    public void setWifiCacheTimeOut(int i2) {
    }
}
