package com.mob.tools.utils;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ResolveInfo;
import android.location.Location;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.mob.MobSDK;
import com.mob.commons.o;
import com.mob.commons.v;
import com.mob.tools.MobLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class DH {

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface DHResponder {
        void onResponse(DHResponse dHResponse);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class DHResponse {
        private LinkedList<ArrayList<HashMap<String, String>>> A;
        private ArrayList<HashMap<String, String>> B;
        private boolean C;
        private String D;
        private String E;
        private String F;
        private String[] G;
        private LinkedList<Location> H;
        private int I;
        private int J;
        private int K;
        private int L;
        private int M;
        private int N;
        private int O;
        private int P;
        private ArrayList<HashMap<String, Object>> Q;
        private String R;
        private LinkedList<String> S;
        private LinkedList<List<String>> T;
        private Activity U;
        private HashMap<String, Object> V;
        private ArrayList<HashMap<String, Object>> W;
        private boolean X;
        private LinkedList<Boolean> Y;
        private HashMap<String, Object> Z;

        /* renamed from: a  reason: collision with root package name */
        private boolean f4468a;
        private int aA;
        private String aB;
        private HashMap<String, Object> aC;
        private ArrayList<HashMap<String, Object>> aD;
        private boolean aE;
        private HashMap<String, Object> aF;
        private LinkedList<Boolean> aG;
        private Void aH;
        private LinkedList<List<ResolveInfo>> aI;
        private LinkedList<ResolveInfo> aJ;
        private LinkedList<PackageInfo> aK;
        private LinkedList<PackageInfo> aL;
        private LinkedList<PackageInfo> aM;
        private String aN;
        private String aO;
        private String aP;
        private long aQ;
        private String aR;
        private String aS;
        private String aT;
        private String aU;
        private String aV;
        private String aW;
        private String aX;
        private String aY;
        private String aZ;
        private ArrayList<ArrayList<String>> aa;
        private HashMap<String, Object> ab;
        private int ac;
        private int ad;
        private String ae;
        private HashMap<String, HashMap<String, Long>> af;
        private HashMap<String, Long> ag;
        private String ah;
        private int ai;
        private boolean aj;
        private boolean ak;
        private boolean al;
        private boolean am;
        private boolean an;
        private boolean ao;
        private boolean ap;
        private boolean aq;
        private ArrayList<HashMap<String, String>> ar;
        private HashMap<String, Object> as;
        private HashMap<String, String> at;
        private String au;
        private String av;
        private HashMap<String, Object> aw;
        private String ax;
        private String ay;
        private String az;
        private String b;
        private String ba;
        private String bb;
        private String bc;
        private HashMap<String, Object> bd;
        private ApplicationInfo be;
        private ArrayList<HashMap<String, Object>> bf;
        private LinkedList<ApplicationInfo> bg;
        private LinkedList<ApplicationInfo> bh;
        private String c;

        /* renamed from: d  reason: collision with root package name */
        private String f4469d;

        /* renamed from: e  reason: collision with root package name */
        private String f4470e;
        public Error errors;

        /* renamed from: f  reason: collision with root package name */
        private String[] f4471f;

        /* renamed from: g  reason: collision with root package name */
        private LinkedList<String> f4472g;

        /* renamed from: h  reason: collision with root package name */
        private String f4473h;

        /* renamed from: i  reason: collision with root package name */
        private String f4474i;

        /* renamed from: j  reason: collision with root package name */
        private String f4475j;

        /* renamed from: k  reason: collision with root package name */
        private LinkedList<String> f4476k;

        /* renamed from: l  reason: collision with root package name */
        private String f4477l;

        /* renamed from: m  reason: collision with root package name */
        private LinkedList<String> f4478m;

        /* renamed from: n  reason: collision with root package name */
        private String f4479n;

        /* renamed from: o  reason: collision with root package name */
        private String f4480o;

        /* renamed from: p  reason: collision with root package name */
        private String f4481p;
        private LinkedList<String> q;
        private String r;
        private LinkedList<String> s;
        private boolean t;
        private String u;
        private String v;
        private String w;
        private LinkedList<String> x;
        private String y;
        private LinkedList<String> z;

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class Error {
            private Throwable A;
            private LinkedList<Throwable> B;
            private Throwable C;
            private LinkedList<Throwable> D;
            private LinkedList<Throwable> E;
            private Throwable F;
            private Throwable G;
            private Throwable H;
            private Throwable I;
            private Throwable J;
            private LinkedList<Throwable> K;
            private Throwable L;
            private Throwable M;
            private Throwable N;
            private Throwable O;
            private Throwable P;
            private Throwable Q;
            private Throwable R;
            private Throwable S;
            private Throwable T;
            private Throwable U;
            private LinkedList<Throwable> V;
            private Throwable W;
            private Throwable X;
            private Throwable Y;
            private Throwable Z;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ DHResponse f4482a;
            private Throwable aA;
            private Throwable aB;
            private Throwable aC;
            private Throwable aD;
            private Throwable aE;
            private Throwable aF;
            private Throwable aG;
            private Throwable aH;
            private Throwable aI;
            private LinkedList<Throwable> aJ;
            private Throwable aK;
            private LinkedList<Throwable> aL;
            private LinkedList<Throwable> aM;
            private LinkedList<Throwable> aN;
            private LinkedList<Throwable> aO;
            private LinkedList<Throwable> aP;
            private Throwable aQ;
            private Throwable aR;
            private Throwable aS;
            private Throwable aT;
            private Throwable aU;
            private Throwable aV;
            private Throwable aW;
            private Throwable aX;
            private Throwable aY;
            private Throwable aZ;
            private Throwable aa;
            private LinkedList<Throwable> ab;
            private Throwable ac;
            private Throwable ad;
            private Throwable ae;
            private Throwable af;
            private Throwable ag;
            private Throwable ah;
            private Throwable ai;
            private Throwable aj;
            private Throwable ak;
            private Throwable al;
            private Throwable am;
            private Throwable an;
            private Throwable ao;
            private Throwable ap;
            private Throwable aq;
            private Throwable ar;
            private Throwable as;
            private Throwable at;
            private Throwable au;
            private Throwable av;
            private Throwable aw;
            private Throwable ax;
            private Throwable ay;
            private Throwable az;
            private boolean b;
            private Throwable ba;
            private Throwable bb;
            private Throwable bc;
            private Throwable bd;
            private Throwable be;
            private Throwable bf;
            private Throwable bg;
            private Throwable bh;
            private Throwable bi;
            private LinkedList<Throwable> bj;
            private LinkedList<Throwable> bk;
            private boolean c;

            /* renamed from: d  reason: collision with root package name */
            private Throwable f4483d;

            /* renamed from: e  reason: collision with root package name */
            private Throwable f4484e;

            /* renamed from: f  reason: collision with root package name */
            private Throwable f4485f;

            /* renamed from: g  reason: collision with root package name */
            private Throwable f4486g;

            /* renamed from: h  reason: collision with root package name */
            private Throwable f4487h;

            /* renamed from: i  reason: collision with root package name */
            private Throwable f4488i;

            /* renamed from: j  reason: collision with root package name */
            private Throwable f4489j;

            /* renamed from: k  reason: collision with root package name */
            private LinkedList<Throwable> f4490k;

            /* renamed from: l  reason: collision with root package name */
            private Throwable f4491l;

            /* renamed from: m  reason: collision with root package name */
            private Throwable f4492m;

            /* renamed from: n  reason: collision with root package name */
            private Throwable f4493n;

            /* renamed from: o  reason: collision with root package name */
            private LinkedList<Throwable> f4494o;

            /* renamed from: p  reason: collision with root package name */
            private Throwable f4495p;
            private LinkedList<Throwable> q;
            private Throwable r;
            private Throwable s;
            private Throwable t;
            private LinkedList<Throwable> u;
            private Throwable v;
            private LinkedList<Throwable> w;
            private Throwable x;
            private Throwable y;
            private Throwable z;

            public Error(DHResponse dHResponse) {
            }

            public static /* synthetic */ void a(Error error, String str, Throwable th) {
            }

            public Throwable checkNetworkAvailable() {
            }

            public Throwable checkPad() {
            }

            public Throwable checkUA() {
            }

            public Throwable cx() {
            }

            public Throwable debugable() {
            }

            public Throwable devEnable() {
            }

            public Throwable getAD() {
            }

            public Throwable getAInfo() {
            }

            public Throwable getAInfoForPkg(int... iArr) {
            }

            public Throwable getAInfoForPkgForce(int... iArr) {
            }

            public Throwable getALLD() {
            }

            public Throwable getAdvertisingID() {
            }

            public Throwable getAlbumCount() {
            }

            public Throwable getAppLastUpdateTime() {
            }

            public Throwable getAppName() {
            }

            public Throwable getAppNameForPkg(int... iArr) {
            }

            public Throwable getAvailableWifiList() {
            }

            public Throwable getAvailableWifiListOneKey() {
            }

            public Throwable getBaseband() {
            }

            public Throwable getBatteryState() {
            }

            public Throwable getBluetoothName() {
            }

            public Throwable getBoard() {
            }

            public Throwable getBoardFromSysProperty() {
            }

            public Throwable getBoardPlatform() {
            }

            public Throwable getBssid() {
            }

            public Throwable getCInfo() {
            }

            public Throwable getCPUFreq() {
            }

            public Throwable getCPUInfo() {
            }

            public Throwable getCPUType() {
            }

            public Throwable getCamResolution() {
            }

            public Throwable getCarrier() {
            }

            public Throwable getCarrierForce(int... iArr) {
            }

            public Throwable getCarrierName() {
            }

            public Throwable getCarrierNameForce(int... iArr) {
            }

            public Throwable getCdmaBid() {
            }

            public Throwable getCdmaLat() {
            }

            public Throwable getCdmaLon() {
            }

            public Throwable getCdmaNid() {
            }

            public Throwable getCdmaSid() {
            }

            public Throwable getCellId() {
            }

            public Throwable getCellLac() {
            }

            public Throwable getCgroup() {
            }

            public Throwable getCurrentWifiInfo() {
            }

            public Throwable getDataNtType() {
            }

            public Throwable getDefaultIM() {
            }

            public Throwable getDefaultIMPkg() {
            }

            public Throwable getDefaultResolvePkg(int... iArr) {
            }

            public Throwable getDetailNetworkTypeForStatic() {
            }

            public Throwable getDeviceData() {
            }

            public Throwable getDeviceDataNotAES() {
            }

            public Throwable getDeviceId() {
            }

            public Throwable getDeviceKey() {
            }

            public Throwable getDeviceKeyFromCache(int... iArr) {
            }

            public Throwable getDeviceMemUsage() {
            }

            public Throwable getDeviceName() {
            }

            public Throwable getDeviceType() {
            }

            public Throwable getDisplayId() {
            }

            public Throwable getFingerprint() {
            }

            public Throwable getFlavor() {
            }

            public Throwable getGlobal() {
            }

            public Throwable getIA(int... iArr) {
            }

            public Throwable getIMEI() {
            }

            public Throwable getIMList() {
            }

            public Throwable getIMSI() {
            }

            public Throwable getIPAddress() {
            }

            public Throwable getLocation(int... iArr) {
            }

            public Throwable getMIUIVersion() {
            }

            public Throwable getMemoryInfo() {
            }

            public Throwable getNeighboringCellInfo() {
            }

            public Throwable getNetworkType() {
            }

            public Throwable getNetworkTypeForStatic() {
            }

            public Throwable getNetworkTypeForce(int... iArr) {
            }

            public Throwable getOD() {
            }

            public Throwable getODH() {
            }

            public Throwable getPInfo(int... iArr) {
            }

            public Throwable getPInfoForce(int... iArr) {
            }

            public Throwable getPInfoStrategy(int... iArr) {
            }

            public Throwable getPsc() {
            }

            public Throwable getQemuKernel() {
            }

            public Throwable getRadioVersion() {
            }

            public Throwable getResolvePkgs() {
            }

            public Throwable getSA() {
            }

            public Throwable getSSID() {
            }

            public Throwable getScreenBrightness() {
            }

            public Throwable getScreenBrightnessMode() {
            }

            public Throwable getScreenSize() {
            }

            public Throwable getSdcardState() {
            }

            public Throwable getSerialno() {
            }

            public Throwable getSignMD5() {
            }

            public Throwable getSignMD5ForPkg(int... iArr) {
            }

            public Throwable getSimSerialNumber() {
            }

            public Throwable getSizeInfo() {
            }

            public Throwable getSupport() {
            }

            public Throwable getSystemProperties(int... iArr) {
            }

            public Throwable getTTYDriversInfo() {
            }

            public Throwable getTopActivity() {
            }

            public Throwable getTraffic() {
            }

            public Throwable getUD() {
            }

            public Throwable getVD() {
            }

            public boolean hasError() {
            }

            public boolean hasGlobalError() {
            }

            public Throwable isFakePass(int... iArr) {
            }

            public Throwable isPackageInstalled(int... iArr) {
            }

            public Throwable isRooted() {
            }

            public Throwable isSmlt() {
            }

            public Throwable isWifiProxy() {
            }

            public Throwable queryIMEI() {
            }

            public Throwable queryIMSI() {
            }

            public Throwable queryIntentServices(int... iArr) {
            }

            public Throwable registerWifiScanReceiver() {
            }

            public Throwable resolveActivity(int... iArr) {
            }

            public Throwable scanWifiList() {
            }

            public Throwable usbEnable() {
            }

            public Throwable vpn() {
            }

            private void a(String str, Throwable th) {
            }
        }

        public static /* synthetic */ Object a(LinkedList linkedList, Object obj, int[] iArr) {
        }

        private static <T> T b(LinkedList<T> linkedList, T t, int... iArr) {
        }

        public boolean checkNetworkAvailable() {
        }

        public boolean checkPad() {
        }

        public boolean checkUA() {
        }

        public boolean cx() {
        }

        public boolean debugable() {
        }

        public boolean devEnable() {
        }

        public String getAD() {
        }

        public ApplicationInfo getAInfo() {
        }

        public ApplicationInfo getAInfoForPkg(int... iArr) {
        }

        public ApplicationInfo getAInfoForPkgForce(int... iArr) {
        }

        public HashMap<String, Object> getALLD() {
        }

        public String getAdvertisingID() {
        }

        public int getAlbumCount() {
        }

        public long getAppLastUpdateTime() {
        }

        public String getAppName() {
        }

        public String getAppNameForPkg(int... iArr) {
        }

        public ArrayList<HashMap<String, Object>> getAvailableWifiList() {
        }

        public ArrayList<HashMap<String, Object>> getAvailableWifiListOneKey() {
        }

        public String getBaseband() {
        }

        public HashMap<String, Object> getBatteryState() {
        }

        public String getBluetoothName() {
        }

        public String getBoard() {
        }

        public String getBoardFromSysProperty() {
        }

        public String getBoardPlatform() {
        }

        public String getBssid() {
        }

        public String getCInfo() {
        }

        public HashMap<String, String> getCPUFreq() {
        }

        public HashMap<String, Object> getCPUInfo() {
        }

        public String getCPUType() {
        }

        public ArrayList<HashMap<String, String>> getCamResolution() {
        }

        public String getCarrier() {
        }

        public String getCarrierForce(int... iArr) {
        }

        public String getCarrierName() {
        }

        public String getCarrierNameForce(int... iArr) {
        }

        public int getCdmaBid() {
        }

        public int getCdmaLat() {
        }

        public int getCdmaLon() {
        }

        public int getCdmaNid() {
        }

        public int getCdmaSid() {
        }

        public int getCellId() {
        }

        public int getCellLac() {
        }

        public String getCgroup() {
        }

        public HashMap<String, Object> getCurrentWifiInfo() {
        }

        public int getDataNtType() {
        }

        public HashMap<String, Object> getDefaultIM() {
        }

        public String getDefaultIMPkg() {
        }

        public String getDefaultResolvePkg(int... iArr) {
        }

        public String getDetailNetworkTypeForStatic() {
        }

        public String getDeviceData() {
        }

        public String getDeviceDataNotAES() {
        }

        public String getDeviceId() {
        }

        public String getDeviceKey() {
        }

        public String getDeviceKeyFromCache(int... iArr) {
        }

        public HashMap<String, Object> getDeviceMemUsage() {
        }

        public String getDeviceName() {
        }

        public String getDeviceType() {
        }

        public String getDisplayId() {
        }

        public String getFingerprint() {
        }

        public String getFlavor() {
        }

        public ArrayList<HashMap<String, String>> getIA(int... iArr) {
        }

        public String getIMEI() {
        }

        public ArrayList<HashMap<String, Object>> getIMList() {
        }

        public String getIMSI() {
        }

        public String getIPAddress() {
        }

        public Location getLocation(int... iArr) {
        }

        public String getMIUIVersion() {
        }

        public HashMap<String, Long> getMemoryInfo() {
        }

        public ArrayList<HashMap<String, Object>> getNeighboringCellInfo() {
        }

        public String getNetworkType() {
        }

        public String getNetworkTypeForStatic() {
        }

        public String getNetworkTypeForce(int... iArr) {
        }

        public String getOD() {
        }

        public String getODH() {
        }

        public PackageInfo getPInfo(int... iArr) {
        }

        public PackageInfo getPInfoForce(int... iArr) {
        }

        public PackageInfo getPInfoStrategy(int... iArr) {
        }

        public int getPsc() {
        }

        public String getQemuKernel() {
        }

        public String getRadioVersion() {
        }

        public List<String> getResolvePkgs(int... iArr) {
        }

        public ArrayList<HashMap<String, String>> getSA() {
        }

        public String getSSID() {
        }

        public int getScreenBrightness() {
        }

        public int getScreenBrightnessMode() {
        }

        public String getScreenSize() {
        }

        public boolean getSdcardState() {
        }

        public String getSerialno() {
        }

        public String getSignMD5() {
        }

        public String getSignMD5ForPkg(int... iArr) {
        }

        public String getSimSerialNumber() {
        }

        public HashMap<String, HashMap<String, Long>> getSizeInfo() {
        }

        public HashMap<String, Object> getSupport() {
        }

        public String getSystemProperties(int... iArr) {
        }

        public ArrayList<ArrayList<String>> getTTYDriversInfo() {
        }

        public Activity getTopActivity() {
        }

        public HashMap<String, Object> getTraffic() {
        }

        public String getUD() {
        }

        public String getVD() {
        }

        public boolean isFakePass(int... iArr) {
        }

        public boolean isPackageInstalled(int... iArr) {
        }

        public boolean isRooted() {
        }

        public boolean isSmlt() {
        }

        public boolean isWifiProxy() {
        }

        public String[] queryIMEI() {
        }

        public String[] queryIMSI() {
        }

        public List<ResolveInfo> queryIntentServices(int... iArr) {
        }

        public Void registerWifiScanReceiver() {
        }

        public ResolveInfo resolveActivity(int... iArr) {
        }

        public boolean scanWifiList() {
        }

        public boolean usbEnable() {
        }

        public boolean vpn() {
        }

        public void a(String str, Object obj) throws Throwable {
        }

        public void a(String str, Object obj, boolean z) throws Throwable {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class RequestBuilder {

        /* renamed from: a  reason: collision with root package name */
        private Context f4496a;
        private LinkedList<a> b;

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class a {

            /* renamed from: a  reason: collision with root package name */
            public final String f4502a;
            public final Object[] b;
            public final /* synthetic */ RequestBuilder c;

            public /* synthetic */ a(RequestBuilder requestBuilder, String str, Object[] objArr, AnonymousClass1 anonymousClass1) {
            }

            private a(RequestBuilder requestBuilder, String str, Object... objArr) {
            }
        }

        public RequestBuilder checkNetworkAvailable() {
            this.b.add(new a(this, "cknavbl", new Object[0], null));
            return this;
        }

        public RequestBuilder checkPad() {
            this.b.add(new a(this, "ckpd", new Object[0], null));
            return this;
        }

        public RequestBuilder checkUA() {
            this.b.add(new a(this, "ckua", new Object[0], null));
            return this;
        }

        public RequestBuilder cx() {
            this.b.add(new a(this, "cx", new Object[0], null));
            return this;
        }

        public RequestBuilder debugable() {
            this.b.add(new a(this, "degb", new Object[0], null));
            return this;
        }

        public RequestBuilder devEnable() {
            this.b.add(new a(this, "dvenbl", new Object[0], null));
            return this;
        }

        public RequestBuilder getAD() {
            this.b.add(new a(this, "gadm", new Object[0], null));
            return this;
        }

        public RequestBuilder getAInfo() {
            this.b.add(new a(this, "gtaif", new Object[0], null));
            return this;
        }

        public RequestBuilder getAInfoForPkg(String str, int i2) {
            this.b.add(new a(this, "gtaifprm", new Object[]{str, Integer.valueOf(i2)}, null));
            return this;
        }

        public RequestBuilder getAInfoForPkgForce(boolean z, String str, int i2) {
            this.b.add(new a(this, "gtaifprmfce", new Object[]{Boolean.valueOf(z), str, Integer.valueOf(i2)}, null));
            return this;
        }

        public RequestBuilder getALLD() {
            this.b.add(new a(this, "galdm", new Object[0], null));
            return this;
        }

        public RequestBuilder getAdvertisingID() {
            this.b.add(new a(this, "gavti", new Object[0], null));
            return this;
        }

        public RequestBuilder getAlbumCount() {
            this.b.add(new a(this, "gabct", new Object[0], null));
            return this;
        }

        public RequestBuilder getAppLastUpdateTime() {
            this.b.add(new a(this, "galtut", new Object[0], null));
            return this;
        }

        public RequestBuilder getAppName() {
            this.b.add(new a(this, "gpnmmt", new Object[0], null));
            return this;
        }

        public RequestBuilder getAppNameForPkg(String str) {
            this.b.add(new a(this, "gpnmfp", new Object[]{str}, null));
            return this;
        }

        public RequestBuilder getAvailableWifiList() {
            this.b.add(new a(this, "gavlwls", new Object[0], null));
            return this;
        }

        public RequestBuilder getAvailableWifiListOneKey() {
            this.b.add(new a(this, "gtaifok", new Object[0], null));
            return this;
        }

        public RequestBuilder getBaseband() {
            this.b.add(new a(this, "gbsbd", new Object[0], null));
            return this;
        }

        public RequestBuilder getBatteryState() {
            this.b.add(new a(this, "gbtrstt", new Object[0], null));
            return this;
        }

        public RequestBuilder getBluetoothName() {
            this.b.add(new a(this, "gbhnm", new Object[0], null));
            return this;
        }

        public RequestBuilder getBoard() {
            this.b.add(new a(this, "gbrdm", new Object[0], null));
            return this;
        }

        public RequestBuilder getBoardFromSysProperty() {
            this.b.add(new a(this, "gbfspy", new Object[0], null));
            return this;
        }

        public RequestBuilder getBoardPlatform() {
            this.b.add(new a(this, "gbplfo", new Object[0], null));
            return this;
        }

        public RequestBuilder getBssid() {
            this.b.add(new a(this, "gbsi", new Object[0], null));
            return this;
        }

        public RequestBuilder getCInfo() {
            this.b.add(new a(this, "gcifm", new Object[0], null));
            return this;
        }

        public RequestBuilder getCPUFreq() {
            this.b.add(new a(this, "gcfre", new Object[0], null));
            return this;
        }

        public RequestBuilder getCPUInfo() {
            this.b.add(new a(this, "gcuin", new Object[0], null));
            return this;
        }

        public RequestBuilder getCPUType() {
            this.b.add(new a(this, "gctp", new Object[0], null));
            return this;
        }

        public RequestBuilder getCamResolution() {
            this.b.add(new a(this, "gcrslt", new Object[0], null));
            return this;
        }

        public RequestBuilder getCarrier() {
            this.b.add(new a(this, "gcrie", new Object[0], null));
            return this;
        }

        public RequestBuilder getCarrierForce(boolean z) {
            this.b.add(new a(this, "gcriefce", new Object[]{Boolean.valueOf(z)}, null));
            return this;
        }

        public RequestBuilder getCarrierName() {
            this.b.add(new a(this, "gcrnm", new Object[0], null));
            return this;
        }

        public RequestBuilder getCarrierNameForce(boolean z) {
            this.b.add(new a(this, "gcrnmfce", new Object[]{Boolean.valueOf(z)}, null));
            return this;
        }

        public RequestBuilder getCdmaBid() {
            this.b.add(new a(this, "gcmbd", new Object[0], null));
            return this;
        }

        public RequestBuilder getCdmaLat() {
            this.b.add(new a(this, "gcmlt", new Object[0], null));
            return this;
        }

        public RequestBuilder getCdmaLon() {
            this.b.add(new a(this, "gcmln", new Object[0], null));
            return this;
        }

        public RequestBuilder getCdmaNid() {
            this.b.add(new a(this, "gcmnd", new Object[0], null));
            return this;
        }

        public RequestBuilder getCdmaSid() {
            this.b.add(new a(this, "gcmsd", new Object[0], null));
            return this;
        }

        public RequestBuilder getCellId() {
            this.b.add(new a(this, "gcld", new Object[0], null));
            return this;
        }

        public RequestBuilder getCellLac() {
            this.b.add(new a(this, "gcllc", new Object[0], null));
            return this;
        }

        public RequestBuilder getCgroup() {
            this.b.add(new a(this, "gcrup", new Object[0], null));
            return this;
        }

        public RequestBuilder getCurrentWifiInfo() {
            this.b.add(new a(this, "wmcwi", new Object[0], null));
            return this;
        }

        public RequestBuilder getDataNtType() {
            this.b.add(new a(this, "gdntp", new Object[0], null));
            return this;
        }

        public RequestBuilder getDefaultIM() {
            this.b.add(new a(this, "gdltm", new Object[0], null));
            return this;
        }

        public RequestBuilder getDefaultIMPkg() {
            this.b.add(new a(this, "gdltmpg", new Object[0], null));
            return this;
        }

        public RequestBuilder getDefaultResolvePkg(String str) {
            this.b.add(new a(this, "gdfrspg", new Object[]{str}, null));
            return this;
        }

        public RequestBuilder getDetailNetworkTypeForStatic() {
            this.b.add(new a(this, "gdtlnktpfs", new Object[0], null));
            return this;
        }

        public RequestBuilder getDeviceData() {
            this.b.add(new a(this, "gdvda", new Object[0], null));
            return this;
        }

        public RequestBuilder getDeviceDataNotAES() {
            this.b.add(new a(this, "gdvdtnas", new Object[0], null));
            return this;
        }

        public RequestBuilder getDeviceId() {
            this.b.add(new a(this, "gdvci", new Object[0], null));
            return this;
        }

        public RequestBuilder getDeviceKey() {
            this.b.add(new a(this, "gdvk", new Object[0], null));
            return this;
        }

        public RequestBuilder getDeviceKeyFromCache(boolean z) {
            this.b.add(new a(this, "gdvkfc", new Object[]{Boolean.valueOf(z)}, null));
            return this;
        }

        public RequestBuilder getDeviceMemUsage() {
            this.b.add(new a(this, "gdvmua", new Object[0], null));
            return this;
        }

        public RequestBuilder getDeviceName() {
            this.b.add(new a(this, "gdvme", new Object[0], null));
            return this;
        }

        public RequestBuilder getDeviceType() {
            this.b.add(new a(this, "gdvtp", new Object[0], null));
            return this;
        }

        public RequestBuilder getDisplayId() {
            this.b.add(new a(this, "gdpyd", new Object[0], null));
            return this;
        }

        public RequestBuilder getFingerprint() {
            this.b.add(new a(this, "gfgrnt", new Object[0], null));
            return this;
        }

        public RequestBuilder getFlavor() {
            this.b.add(new a(this, "gflv", new Object[0], null));
            return this;
        }

        public RequestBuilder getIA(boolean z) {
            this.b.add(new a(this, "gia", new Object[]{Boolean.valueOf(z)}, null));
            return this;
        }

        public RequestBuilder getIMEI() {
            this.b.add(new a(this, "gimi", new Object[0], null));
            return this;
        }

        public RequestBuilder getIMList() {
            this.b.add(new a(this, "gmlt", new Object[0], null));
            return this;
        }

        public RequestBuilder getIMSI() {
            this.b.add(new a(this, "gisi", new Object[0], null));
            return this;
        }

        public RequestBuilder getIPAddress() {
            this.b.add(new a(this, "giads", new Object[0], null));
            return this;
        }

        public RequestBuilder getLocation(int i2, int i3, boolean z) {
            this.b.add(new a(this, "glctn", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Boolean.valueOf(z)}, null));
            return this;
        }

        public RequestBuilder getMIUIVersion() {
            this.b.add(new a(this, "gmivsn", new Object[0], null));
            return this;
        }

        public RequestBuilder getMemoryInfo() {
            this.b.add(new a(this, "gmrin", new Object[0], null));
            return this;
        }

        public RequestBuilder getNeighboringCellInfo() {
            this.b.add(new a(this, "gnbclin", new Object[0], null));
            return this;
        }

        public RequestBuilder getNetworkType() {
            this.b.add(new a(this, "gneyp", new Object[0], null));
            return this;
        }

        public RequestBuilder getNetworkTypeForStatic() {
            this.b.add(new a(this, "gnktpfs", new Object[0], null));
            return this;
        }

        public RequestBuilder getNetworkTypeForce(boolean z) {
            this.b.add(new a(this, "gneypfce", new Object[]{Boolean.valueOf(z)}, null));
            return this;
        }

        public RequestBuilder getOD() {
            this.b.add(new a(this, "godm", new Object[0], null));
            return this;
        }

        public RequestBuilder getODH() {
            this.b.add(new a(this, "godhm", new Object[0], null));
            return this;
        }

        public RequestBuilder getPInfo(String str, int i2) {
            this.b.add(new a(this, "gpgif", new Object[]{str, Integer.valueOf(i2)}, null));
            return this;
        }

        public RequestBuilder getPInfoForce(boolean z, String str, int i2) {
            this.b.add(new a(this, "gpgiffcin", new Object[]{Boolean.valueOf(z), str, Integer.valueOf(i2)}, null));
            return this;
        }

        public RequestBuilder getPInfoStrategy(int i2, String str, int i3) {
            this.b.add(new a(this, "gpgifstrg", new Object[]{Integer.valueOf(i2), str, Integer.valueOf(i3)}, null));
            return this;
        }

        public RequestBuilder getPsc() {
            this.b.add(new a(this, "gpcmt", new Object[0], null));
            return this;
        }

        public RequestBuilder getQemuKernel() {
            this.b.add(new a(this, "gqmkn", new Object[0], null));
            return this;
        }

        public RequestBuilder getRadioVersion() {
            this.b.add(new a(this, "grivsn", new Object[0], null));
            return this;
        }

        public RequestBuilder getResolvePkgs(String str) {
            this.b.add(new a(this, "grsvps", new Object[]{str}, null));
            return this;
        }

        public RequestBuilder getSA() {
            this.b.add(new a(this, "gsl", new Object[0], null));
            return this;
        }

        public RequestBuilder getSSID() {
            this.b.add(new a(this, "gsimt", new Object[0], null));
            return this;
        }

        public RequestBuilder getScreenBrightness() {
            this.b.add(new a(this, "gsnbtns", new Object[0], null));
            return this;
        }

        public RequestBuilder getScreenBrightnessMode() {
            this.b.add(new a(this, "gsnbtmd", new Object[0], null));
            return this;
        }

        public RequestBuilder getScreenSize() {
            this.b.add(new a(this, "gscsz", new Object[0], null));
            return this;
        }

        public RequestBuilder getSdcardState() {
            this.b.add(new a(this, "sdcsta", new Object[0], null));
            return this;
        }

        public RequestBuilder getSerialno() {
            this.b.add(new a(this, "gsrln", new Object[0], null));
            return this;
        }

        public RequestBuilder getSignMD5() {
            this.b.add(new a(this, "gsnmd", new Object[0], null));
            return this;
        }

        public RequestBuilder getSignMD5ForPkg(String str) {
            this.b.add(new a(this, "gsnmdfp", new Object[]{str}, null));
            return this;
        }

        public RequestBuilder getSimSerialNumber() {
            this.b.add(new a(this, "gssn", new Object[0], null));
            return this;
        }

        public RequestBuilder getSizeInfo() {
            this.b.add(new a(this, "gszin", new Object[0], null));
            return this;
        }

        public RequestBuilder getSupport() {
            this.b.add(new a(this, "gspt", new Object[0], null));
            return this;
        }

        public RequestBuilder getSystemProperties(String str) {
            this.b.add(new a(this, "gstmpts", new Object[]{str}, null));
            return this;
        }

        public RequestBuilder getTTYDriversInfo() {
            this.b.add(new a(this, "gtydvin", new Object[0], null));
            return this;
        }

        public RequestBuilder getTopActivity() {
            this.b.add(new a(this, "tpact", new Object[0], null));
            return this;
        }

        public RequestBuilder getTraffic() {
            this.b.add(new a(this, "gtrc", new Object[0], null));
            return this;
        }

        public RequestBuilder getUD() {
            this.b.add(new a(this, "gudm", new Object[0], null));
            return this;
        }

        public RequestBuilder getVD() {
            this.b.add(new a(this, "gvdm", new Object[0], null));
            return this;
        }

        public RequestBuilder isFakePass(String str) {
            this.b.add(new a(this, "ifkps", new Object[]{str}, null));
            return this;
        }

        public RequestBuilder isPackageInstalled(String str) {
            this.b.add(new a(this, "ipgist", new Object[]{str}, null));
            return this;
        }

        public RequestBuilder isRooted() {
            this.b.add(new a(this, "cird", new Object[0], null));
            return this;
        }

        public RequestBuilder isSmlt() {
            this.b.add(new a(this, "ismlt", new Object[0], null));
            return this;
        }

        public RequestBuilder isWifiProxy() {
            this.b.add(new a(this, "iwpxy", new Object[0], null));
            return this;
        }

        public RequestBuilder queryIMEI() {
            this.b.add(new a(this, "qriei", new Object[0], null));
            return this;
        }

        public RequestBuilder queryIMSI() {
            this.b.add(new a(this, "qryisi", new Object[0], null));
            return this;
        }

        public RequestBuilder queryIntentServices(Intent intent, int i2) {
            this.b.add(new a(this, "qritsvc", new Object[]{intent, Integer.valueOf(i2)}, null));
            return this;
        }

        public RequestBuilder registerWifiScanReceiver(BlockingQueue<Boolean> blockingQueue) {
            this.b.add(new a(this, "rgwsr", new Object[]{blockingQueue}, null));
            return this;
        }

        public void request(DHResponder dHResponder) {
            try {
                boolean z = Looper.getMainLooper() == Looper.myLooper();
                Runnable runnable = new Runnable(this, com.mob.tools.b.a.b.get(), com.mob.tools.b.a.c.get(), dHResponder, z) { // from class: com.mob.tools.utils.DH.RequestBuilder.1

                    /* renamed from: a  reason: collision with root package name */
                    public final /* synthetic */ Boolean f4497a;
                    public final /* synthetic */ Boolean b;
                    public final /* synthetic */ DHResponder c;

                    /* renamed from: d  reason: collision with root package name */
                    public final /* synthetic */ boolean f4498d;

                    /* renamed from: e  reason: collision with root package name */
                    public final /* synthetic */ RequestBuilder f4499e;

                    /* renamed from: com.mob.tools.utils.DH$RequestBuilder$1$1  reason: invalid class name and collision with other inner class name */
                    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
                    public class C01121 implements Handler.Callback {

                        /* renamed from: a  reason: collision with root package name */
                        public final /* synthetic */ DHResponse f4500a;
                        public final /* synthetic */ AnonymousClass1 b;

                        public C01121(AnonymousClass1 anonymousClass1, DHResponse dHResponse) {
                        }

                        @Override // android.os.Handler.Callback
                        public boolean handleMessage(Message message) {
                        }
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                    }
                };
                if (z) {
                    v.f3699g.execute(runnable);
                } else {
                    runnable.run();
                }
            } catch (Throwable th) {
                MobLog.getInstance().d(th);
                if (dHResponder != null) {
                    dHResponder.onResponse(new DHResponse());
                }
            }
        }

        public RequestBuilder resolveActivity(Intent intent, int i2) {
            this.b.add(new a(this, "rsaciy", new Object[]{intent, Integer.valueOf(i2)}, null));
            return this;
        }

        public RequestBuilder scanWifiList() {
            this.b.add(new a(this, "scwls", new Object[0], null));
            return this;
        }

        public RequestBuilder usbEnable() {
            this.b.add(new a(this, "ubenbl", new Object[0], null));
            return this;
        }

        public RequestBuilder vpn() {
            this.b.add(new a(this, "vnmt", new Object[0], null));
            return this;
        }

        private RequestBuilder(Context context) {
            this.f4496a = context;
            this.b = new LinkedList<>();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public DHResponse a() {
            DHResponse dHResponse = new DHResponse();
            for (int i2 = 0; i2 < this.b.size(); i2++) {
                a aVar = this.b.get(i2);
                try {
                    String str = aVar.f4502a;
                    dHResponse.a(str, a(str, aVar.b));
                    DHResponse.Error.a(dHResponse.errors, aVar.f4502a, null);
                } finally {
                    try {
                    } catch (Throwable th) {
                    }
                }
            }
            return dHResponse;
        }

        private Object a(String str, Object[] objArr) throws Throwable {
            if ("cird".equals(str)) {
                return Boolean.valueOf(com.mob.tools.a.c.a(this.f4496a).b().a());
            }
            if ("gsimt".equals(str)) {
                return com.mob.tools.a.c.a(this.f4496a).b().r();
            }
            if ("gbsi".equals(str)) {
                return com.mob.tools.a.c.a(this.f4496a).b().s();
            }
            if ("gdvci".equals(str)) {
                return com.mob.tools.a.c.a(this.f4496a).b().ax();
            }
            if ("gimi".equals(str)) {
                return com.mob.tools.a.c.a(this.f4496a).b().n();
            }
            if ("qriei".equals(str)) {
                return com.mob.tools.a.c.a(this.f4496a).b().C();
            }
            if ("gstmpts".equals(str)) {
                if (objArr != null && objArr.length == 1) {
                    return com.mob.tools.a.c.a(this.f4496a).b().b((String) objArr[0]);
                }
                throw new Throwable("params illegal: " + objArr);
            } else if ("gsrln".equals(str)) {
                return com.mob.tools.a.c.a(this.f4496a).b().l();
            } else {
                if ("gscsz".equals(str)) {
                    return com.mob.tools.a.c.a(this.f4496a).b().ad();
                }
                if ("gcrie".equals(str)) {
                    return com.mob.tools.a.c.a(this.f4496a).b().t();
                }
                if ("gcriefce".equals(str)) {
                    if (objArr != null && objArr.length == 1) {
                        return com.mob.tools.a.c.a(this.f4496a).b().c(((Boolean) objArr[0]).booleanValue());
                    }
                    throw new Throwable("params illegal: " + objArr);
                } else if ("gcrnm".equals(str)) {
                    return com.mob.tools.a.c.a(this.f4496a).b().u();
                } else {
                    if ("gcrnmfce".equals(str)) {
                        if (objArr != null && objArr.length == 1) {
                            return com.mob.tools.a.c.a(this.f4496a).b().d(((Boolean) objArr[0]).booleanValue());
                        }
                        throw new Throwable("params illegal: " + objArr);
                    } else if ("gssn".equals(str)) {
                        return com.mob.tools.a.c.a(this.f4496a).b().v();
                    } else {
                        if ("gbhnm".equals(str)) {
                            return com.mob.tools.a.c.a(this.f4496a).b().D();
                        }
                        if ("gsnmd".equals(str)) {
                            return com.mob.tools.a.c.a(this.f4496a).b().aD();
                        }
                        if ("gsnmdfp".equals(str)) {
                            if (objArr != null && objArr.length == 1) {
                                return com.mob.tools.a.c.a(this.f4496a).b().f((String) objArr[0]);
                            }
                            throw new Throwable("params illegal: " + objArr);
                        } else if ("gneyp".equals(str)) {
                            return com.mob.tools.a.c.a(this.f4496a).b().ae();
                        } else {
                            if ("gneypfce".equals(str)) {
                                if (objArr != null && objArr.length == 1) {
                                    return com.mob.tools.a.c.a(this.f4496a).b().e(((Boolean) objArr[0]).booleanValue());
                                }
                                throw new Throwable("params illegal: " + objArr);
                            } else if ("cknavbl".equals(str)) {
                                return Boolean.valueOf(com.mob.tools.a.c.a(this.f4496a).b().ah());
                            } else {
                                if ("gnktpfs".equals(str)) {
                                    return com.mob.tools.a.c.a(this.f4496a).b().af();
                                }
                                if ("gdtlnktpfs".equals(str)) {
                                    return com.mob.tools.a.c.a(this.f4496a).b().ag();
                                }
                                if ("gdvk".equals(str)) {
                                    return com.mob.tools.a.c.a(this.f4496a).b().ay();
                                }
                                if ("gdvkfc".equals(str)) {
                                    if (objArr != null && objArr.length == 1) {
                                        return com.mob.tools.a.c.a(this.f4496a).b().g(((Boolean) objArr[0]).booleanValue());
                                    }
                                    throw new Throwable("params illegal: " + objArr);
                                } else if ("gpnmmt".equals(str)) {
                                    return com.mob.tools.a.c.a(this.f4496a).b().aF();
                                } else {
                                    if ("gpnmfp".equals(str)) {
                                        if (objArr != null && objArr.length == 1) {
                                            return com.mob.tools.a.c.a(this.f4496a).b().g((String) objArr[0]);
                                        }
                                        throw new Throwable("params illegal: " + objArr);
                                    } else if ("gia".equals(str)) {
                                        if (objArr != null && objArr.length == 1) {
                                            return com.mob.tools.a.c.a(this.f4496a).b().f(((Boolean) objArr[0]).booleanValue());
                                        }
                                        throw new Throwable("params illegal: " + objArr);
                                    } else if ("gsl".equals(str)) {
                                        return com.mob.tools.a.c.a(this.f4496a).b().aw();
                                    } else {
                                        if ("sdcsta".equals(str)) {
                                            return Boolean.FALSE;
                                        }
                                        if ("gscpt".equals(str)) {
                                            return com.mob.tools.a.c.a(this.f4496a).b().aC();
                                        }
                                        if ("gavti".equals(str)) {
                                            return com.mob.tools.a.c.a(this.f4496a).b().m();
                                        }
                                        if ("gisi".equals(str)) {
                                            return com.mob.tools.a.c.a(this.f4496a).b().p();
                                        }
                                        if ("qryisi".equals(str)) {
                                            return com.mob.tools.a.c.a(this.f4496a).b().q();
                                        }
                                        if ("glctn".equals(str)) {
                                            if (objArr != null && objArr.length == 3) {
                                                return com.mob.tools.a.c.a(this.f4496a).b().a(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Boolean) objArr[2]).booleanValue());
                                            }
                                            throw new Throwable("params illegal: " + objArr);
                                        } else if ("gcld".equals(str)) {
                                            return Integer.valueOf(com.mob.tools.a.c.a(this.f4496a).b().E());
                                        } else {
                                            if ("gcllc".equals(str)) {
                                                return Integer.valueOf(com.mob.tools.a.c.a(this.f4496a).b().F());
                                            }
                                            if ("gpcmt".equals(str)) {
                                                return Integer.valueOf(com.mob.tools.a.c.a(this.f4496a).b().G());
                                            }
                                            if ("gcmlt".equals(str)) {
                                                return Integer.valueOf(com.mob.tools.a.c.a(this.f4496a).b().H());
                                            }
                                            if ("gcmln".equals(str)) {
                                                return Integer.valueOf(com.mob.tools.a.c.a(this.f4496a).b().I());
                                            }
                                            if ("gcmbd".equals(str)) {
                                                return Integer.valueOf(com.mob.tools.a.c.a(this.f4496a).b().J());
                                            }
                                            if ("gcmsd".equals(str)) {
                                                return Integer.valueOf(com.mob.tools.a.c.a(this.f4496a).b().K());
                                            }
                                            if ("gcmnd".equals(str)) {
                                                return Integer.valueOf(com.mob.tools.a.c.a(this.f4496a).b().L());
                                            }
                                            if ("gnbclin".equals(str)) {
                                                return com.mob.tools.a.c.a(this.f4496a).b().M();
                                            }
                                            if ("gdvtp".equals(str)) {
                                                return com.mob.tools.a.c.a(this.f4496a).b().B();
                                            }
                                            if ("gdfrspg".equals(str)) {
                                                if (objArr != null && objArr.length == 1) {
                                                    return com.mob.tools.a.c.a(this.f4496a).b().c((String) objArr[0]);
                                                }
                                                throw new Throwable("params illegal: " + objArr);
                                            } else if ("grsvps".equals(str)) {
                                                if (objArr != null && objArr.length == 1) {
                                                    return com.mob.tools.a.c.a(this.f4496a).b().d((String) objArr[0]);
                                                }
                                                throw new Throwable("params illegal: " + objArr);
                                            } else if ("tpact".equals(str)) {
                                                return null;
                                            } else {
                                                if ("wmcwi".equals(str)) {
                                                    return com.mob.tools.a.c.a(this.f4496a).b().N();
                                                }
                                                if ("gavlwls".equals(str)) {
                                                    return com.mob.tools.a.c.a(this.f4496a).b().O();
                                                }
                                                if ("scwls".equals(str)) {
                                                    return Boolean.valueOf(com.mob.tools.a.c.a(this.f4496a).b().P());
                                                }
                                                if ("ipgist".equals(str)) {
                                                    if (objArr != null && objArr.length == 1) {
                                                        return Boolean.valueOf(com.mob.tools.a.c.a(this.f4496a).b().e((String) objArr[0]));
                                                    }
                                                    throw new Throwable("params illegal: " + objArr);
                                                } else if ("gcuin".equals(str)) {
                                                    return com.mob.tools.a.c.a(this.f4496a).b().U();
                                                } else {
                                                    if ("gtydvin".equals(str)) {
                                                        return com.mob.tools.a.c.a(this.f4496a).b().V();
                                                    }
                                                    if ("gbtrstt".equals(str)) {
                                                        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
                                                        com.mob.tools.a.c.a(this.f4496a).b().a(new Handler.Callback(this, linkedBlockingQueue) { // from class: com.mob.tools.utils.DH.RequestBuilder.2

                                                            /* renamed from: a  reason: collision with root package name */
                                                            public final /* synthetic */ BlockingQueue f4501a;
                                                            public final /* synthetic */ RequestBuilder b;

                                                            @Override // android.os.Handler.Callback
                                                            public boolean handleMessage(Message message) {
                                                            }
                                                        });
                                                        return linkedBlockingQueue.poll(5000L, TimeUnit.MILLISECONDS);
                                                    } else if ("gsnbtns".equals(str)) {
                                                        return Integer.valueOf(com.mob.tools.a.c.a(this.f4496a).b().W());
                                                    } else {
                                                        if ("gsnbtmd".equals(str)) {
                                                            return Integer.valueOf(com.mob.tools.a.c.a(this.f4496a).b().X());
                                                        }
                                                        if ("gqmkn".equals(str)) {
                                                            return com.mob.tools.a.c.a(this.f4496a).b().Y();
                                                        }
                                                        if ("gszin".equals(str)) {
                                                            return com.mob.tools.a.c.a(this.f4496a).b().Z();
                                                        }
                                                        if ("gmrin".equals(str)) {
                                                            return com.mob.tools.a.c.a(this.f4496a).b().aa();
                                                        }
                                                        if ("gmivsn".equals(str)) {
                                                            return com.mob.tools.a.c.a(this.f4496a).b().w();
                                                        }
                                                        if ("gabct".equals(str)) {
                                                            return Integer.valueOf(com.mob.tools.a.c.a(this.f4496a).b().ab());
                                                        }
                                                        if ("cx".equals(str)) {
                                                            return Boolean.valueOf(com.mob.tools.a.c.a(this.f4496a).b().b());
                                                        }
                                                        if ("ckpd".equals(str)) {
                                                            return Boolean.valueOf(com.mob.tools.a.c.a(this.f4496a).b().c());
                                                        }
                                                        if ("ubenbl".equals(str)) {
                                                            return Boolean.valueOf(com.mob.tools.a.c.a(this.f4496a).b().h());
                                                        }
                                                        if ("dvenbl".equals(str)) {
                                                            return Boolean.valueOf(com.mob.tools.a.c.a(this.f4496a).b().g());
                                                        }
                                                        if ("ckua".equals(str)) {
                                                            return Boolean.valueOf(com.mob.tools.a.c.a(this.f4496a).b().f());
                                                        }
                                                        if ("vnmt".equals(str)) {
                                                            return Boolean.valueOf(com.mob.tools.a.c.a(this.f4496a).b().e());
                                                        }
                                                        if ("degb".equals(str)) {
                                                            return Boolean.valueOf(com.mob.tools.a.c.a(this.f4496a).b().d());
                                                        }
                                                        if ("iwpxy".equals(str)) {
                                                            return Boolean.valueOf(com.mob.tools.a.c.a(this.f4496a).b().i());
                                                        }
                                                        if ("gcrslt".equals(str)) {
                                                            return com.mob.tools.a.c.a(this.f4496a).b().aj();
                                                        }
                                                        if ("gspt".equals(str)) {
                                                            return com.mob.tools.a.c.a(this.f4496a).b().al();
                                                        }
                                                        if ("gcfre".equals(str)) {
                                                            return com.mob.tools.a.c.a(this.f4496a).b().am();
                                                        }
                                                        if ("gctp".equals(str)) {
                                                            return com.mob.tools.a.c.a(this.f4496a).b().an();
                                                        }
                                                        if ("gflv".equals(str)) {
                                                            return com.mob.tools.a.c.a(this.f4496a).b().ao();
                                                        }
                                                        if ("gtrc".equals(str)) {
                                                            return com.mob.tools.a.c.a(this.f4496a).b().ap();
                                                        }
                                                        if ("gbsbd".equals(str)) {
                                                            return com.mob.tools.a.c.a(this.f4496a).b().aq();
                                                        }
                                                        if ("gbfspy".equals(str)) {
                                                            return com.mob.tools.a.c.a(this.f4496a).b().ar();
                                                        }
                                                        if ("gbplfo".equals(str)) {
                                                            return com.mob.tools.a.c.a(this.f4496a).b().as();
                                                        }
                                                        if ("gdntp".equals(str)) {
                                                            return Integer.valueOf(com.mob.tools.a.c.a(this.f4496a).b().ai());
                                                        }
                                                        if ("gdltmpg".equals(str)) {
                                                            return com.mob.tools.a.c.a(this.f4496a).b().az();
                                                        }
                                                        if ("gdltm".equals(str)) {
                                                            return com.mob.tools.a.c.a(this.f4496a).b().aA();
                                                        }
                                                        if ("gmlt".equals(str)) {
                                                            return com.mob.tools.a.c.a(this.f4496a).b().aB();
                                                        }
                                                        if ("ismlt".equals(str)) {
                                                            return Boolean.valueOf(com.mob.tools.a.c.a(this.f4496a).b().j());
                                                        }
                                                        if ("gdvmua".equals(str)) {
                                                            return com.mob.tools.a.c.a(this.f4496a).b().at();
                                                        }
                                                        if ("ifkps".equals(str)) {
                                                            if (objArr != null && objArr.length == 1) {
                                                                return Boolean.valueOf(com.mob.tools.a.c.a(this.f4496a).b().a((String) objArr[0]));
                                                            }
                                                            throw new Throwable("params illegal: " + objArr);
                                                        } else if ("rgwsr".equals(str)) {
                                                            if (objArr != null && objArr.length == 1) {
                                                                com.mob.tools.a.c.a(this.f4496a).b().a((BlockingQueue) objArr[0]);
                                                                return null;
                                                            }
                                                            throw new Throwable("params illegal: " + objArr);
                                                        } else if ("qritsvc".equals(str)) {
                                                            if (objArr != null && objArr.length == 2) {
                                                                int intValue = ((Integer) objArr[1]).intValue();
                                                                return com.mob.tools.a.c.a(this.f4496a).b().a((Intent) objArr[0], intValue);
                                                            }
                                                            throw new Throwable("params illegal: " + objArr);
                                                        } else if ("rsaciy".equals(str)) {
                                                            if (objArr != null && objArr.length == 2) {
                                                                int intValue2 = ((Integer) objArr[1]).intValue();
                                                                return com.mob.tools.a.c.a(this.f4496a).b().b((Intent) objArr[0], intValue2);
                                                            }
                                                            throw new Throwable("params illegal: " + objArr);
                                                        } else if ("gpgif".equals(str)) {
                                                            if (objArr != null && objArr.length == 2) {
                                                                int intValue3 = ((Integer) objArr[1]).intValue();
                                                                return com.mob.tools.a.c.a(this.f4496a).b().a(false, 0, (String) objArr[0], intValue3);
                                                            }
                                                            throw new Throwable("params illegal: " + objArr);
                                                        } else if ("gpgiffcin".equals(str)) {
                                                            if (objArr != null && objArr.length == 3) {
                                                                int intValue4 = ((Integer) objArr[2]).intValue();
                                                                return com.mob.tools.a.c.a(this.f4496a).b().a(((Boolean) objArr[0]).booleanValue(), 0, (String) objArr[1], intValue4);
                                                            }
                                                            throw new Throwable("params illegal: " + objArr);
                                                        } else if ("gpgifstrg".equals(str)) {
                                                            if (objArr != null && objArr.length == 3) {
                                                                int intValue5 = ((Integer) objArr[2]).intValue();
                                                                return com.mob.tools.a.c.a(this.f4496a).b().a(false, ((Integer) objArr[0]).intValue(), (String) objArr[1], intValue5);
                                                            }
                                                            throw new Throwable("params illegal: " + objArr);
                                                        } else if ("giads".equals(str)) {
                                                            return com.mob.tools.a.c.a(this.f4496a).b().au();
                                                        } else {
                                                            if ("gdvda".equals(str)) {
                                                                return com.mob.tools.a.c.a(this.f4496a).b().aN();
                                                            }
                                                            if ("gdvdtnas".equals(str)) {
                                                                return com.mob.tools.a.c.a(this.f4496a).b().aO();
                                                            }
                                                            if ("galtut".equals(str)) {
                                                                return Long.valueOf(com.mob.tools.a.c.a(this.f4496a).b().aP());
                                                            }
                                                            if ("gbrdm".equals(str)) {
                                                                return com.mob.tools.a.c.a(this.f4496a).b().aQ();
                                                            }
                                                            if ("gdvme".equals(str)) {
                                                                return com.mob.tools.a.c.a(this.f4496a).b().aR();
                                                            }
                                                            if ("gdpyd".equals(str)) {
                                                                return com.mob.tools.a.c.a(this.f4496a).b().aS();
                                                            }
                                                            if ("gfgrnt".equals(str)) {
                                                                return com.mob.tools.a.c.a(this.f4496a).b().aT();
                                                            }
                                                            if ("grivsn".equals(str)) {
                                                                return com.mob.tools.a.c.a(this.f4496a).b().aU();
                                                            }
                                                            if ("gcrup".equals(str)) {
                                                                return com.mob.tools.a.c.a(this.f4496a).b().aV();
                                                            }
                                                            if ("gcifm".equals(str)) {
                                                                return com.mob.tools.a.c.a(this.f4496a).b().aW();
                                                            }
                                                            if ("godm".equals(str)) {
                                                                return com.mob.tools.a.c.a(this.f4496a).b().aX();
                                                            }
                                                            if ("godhm".equals(str)) {
                                                                return com.mob.tools.a.c.a(this.f4496a).b().aY();
                                                            }
                                                            if ("gadm".equals(str) || "gvdm".equals(str) || "gudm".equals(str)) {
                                                                return null;
                                                            }
                                                            if ("galdm".equals(str)) {
                                                                return com.mob.tools.a.c.a(this.f4496a).b().bc();
                                                            }
                                                            if ("gtaif".equals(str)) {
                                                                return com.mob.tools.a.c.a(this.f4496a).b().bd();
                                                            }
                                                            if ("gtaifok".equals(str)) {
                                                                return com.mob.tools.a.c.a(this.f4496a).b().be();
                                                            }
                                                            if ("gtaifprm".equals(str)) {
                                                                if (objArr != null && objArr.length == 2) {
                                                                    int intValue6 = ((Integer) objArr[1]).intValue();
                                                                    return com.mob.tools.a.c.a(this.f4496a).b().a((String) objArr[0], intValue6);
                                                                }
                                                                throw new Throwable("params illegal: " + objArr);
                                                            } else if ("gtaifprmfce".equals(str)) {
                                                                if (objArr != null && objArr.length == 3) {
                                                                    int intValue7 = ((Integer) objArr[2]).intValue();
                                                                    return com.mob.tools.a.c.a(this.f4496a).b().a(((Boolean) objArr[0]).booleanValue(), (String) objArr[1], intValue7);
                                                                }
                                                                throw new Throwable("params illegal: " + objArr);
                                                            } else {
                                                                return null;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static RequestBuilder requester(Context context) {
        return new RequestBuilder(context);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class SyncMtd {
        public static String Base64AES(String str, String str2) {
            return com.mob.tools.a.b.a(MobSDK.getContext()).a(str, str2);
        }

        public static boolean checkPermission(String str) throws Throwable {
            return com.mob.tools.a.b.a(MobSDK.getContext()).g(str);
        }

        public static Object currentActivityThread() {
            return com.mob.tools.a.c.a(MobSDK.getContext()).b().aL();
        }

        public static String getAppLanguage() {
            return com.mob.tools.a.c.a(MobSDK.getContext()).b().ac();
        }

        public static int getAppVersion() {
            return com.mob.tools.a.c.a(MobSDK.getContext()).b().aG();
        }

        public static String getAppVersionName() {
            return com.mob.tools.a.c.a(MobSDK.getContext()).b().aH();
        }

        public static Context getApplication() {
            return com.mob.tools.a.c.a(MobSDK.getContext()).b().aM();
        }

        public static String getBrand() {
            return com.mob.tools.a.c.a(MobSDK.getContext()).b().A();
        }

        public static String getCurrentProcessName() {
            return com.mob.tools.a.c.a(MobSDK.getContext()).b().aJ();
        }

        public static String getManufacturer() {
            return com.mob.tools.a.c.a(MobSDK.getContext()).b().z();
        }

        public static String getModel() {
            return com.mob.tools.a.c.a(MobSDK.getContext()).b().y();
        }

        public static String getOSCountry() {
            return com.mob.tools.a.c.a(MobSDK.getContext()).b().T();
        }

        public static String getOSLanguage() {
            return com.mob.tools.a.c.a(MobSDK.getContext()).b().S();
        }

        public static int getOSVersionInt() {
            return com.mob.tools.a.c.a(MobSDK.getContext()).b().Q();
        }

        public static String getOSVersionName() {
            return com.mob.tools.a.c.a(MobSDK.getContext()).b().R();
        }

        public static String getPackageName() {
            return com.mob.tools.a.c.a(MobSDK.getContext()).b().aE();
        }

        public static int getPlatformCode() {
            return 1;
        }

        public static String getSandboxPath() {
            return com.mob.tools.a.c.a(MobSDK.getContext()).b().aC();
        }

        public static Object getSystemServiceSafe(String str) {
            try {
                return MobSDK.getContext().getSystemService(str);
            } catch (Throwable th) {
                MobLog.getInstance().w(th);
                return null;
            }
        }

        public static String getTimezone() {
            return com.mob.tools.a.c.a(MobSDK.getContext()).b().ak();
        }

        public static void hideSoftInput(View view) {
            Object systemServiceSafe = getSystemServiceSafe("input_method");
            if (systemServiceSafe == null) {
                return;
            }
            ((InputMethodManager) systemServiceSafe).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }

        public static <T> T invokeInstanceMethod(Object obj, String str, Object... objArr) {
            try {
                return (T) ReflectHelper.invokeInstanceMethod(obj, str, objArr);
            } catch (Throwable th) {
                MobLog.getInstance().d(th);
                return null;
            }
        }

        public static Object invokeRuntimeExec(String str) throws Throwable {
            return ReflectHelper.invokeInstanceMethod(ReflectHelper.invokeStaticMethod(ReflectHelper.importClass(o.b("017Bgece.i-cedkdccecjeedkfdcbcj@c]cd[kh")), o.b("010%eeYhc@fdcbcj8c0cd.kh"), new Object[0]), o.b("004hXckJhEcf"), new Object[]{str}, new Class[]{String.class});
        }

        public static boolean isInMainProcess() {
            return com.mob.tools.a.c.a(MobSDK.getContext()).b().aI();
        }

        public static boolean isSensitiveDevice() {
            return com.mob.tools.a.c.a(MobSDK.getContext()).b().k();
        }

        public static void regReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) throws Throwable {
            com.mob.tools.a.b.a(MobSDK.getContext()).a(broadcastReceiver, intentFilter);
        }

        public static void showSoftInput(View view) {
            Object systemServiceSafe = getSystemServiceSafe("input_method");
            if (systemServiceSafe == null) {
                return;
            }
            ((InputMethodManager) systemServiceSafe).toggleSoftInputFromWindow(view.getWindowToken(), 2, 0);
        }

        public static void unregReceiver(BroadcastReceiver broadcastReceiver) throws Throwable {
            com.mob.tools.a.b.a(MobSDK.getContext()).a(broadcastReceiver);
        }

        public static <T> T invokeInstanceMethod(Object obj, String str, Object[] objArr, Class<?>[] clsArr) {
            try {
                return (T) ReflectHelper.invokeInstanceMethod(obj, str, objArr, clsArr);
            } catch (Throwable th) {
                MobLog.getInstance().d(th);
                return null;
            }
        }
    }
}
