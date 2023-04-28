package com.tencent.tpns.baseapi.base.util;

import android.content.ContentValues;
import android.content.Context;
import com.mobile.auth.BuildConfig;
import com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum;
import com.tencent.tpns.baseapi.base.PushPreferences;
import com.tencent.tpns.baseapi.base.logger.TBaseLogger;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: ProGuard */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class CloudManager {
    public static final String KEY_CONFIG = "cloud";

    /* renamed from: a  reason: collision with root package name */
    private static Context f13649a;
    private String A;
    private int B;
    private int C;
    private int D;
    private int E;
    private String b;
    private long c;

    /* renamed from: d  reason: collision with root package name */
    private int f13650d;

    /* renamed from: e  reason: collision with root package name */
    private int f13651e;

    /* renamed from: f  reason: collision with root package name */
    private int f13652f;

    /* renamed from: g  reason: collision with root package name */
    private int f13653g;

    /* renamed from: h  reason: collision with root package name */
    private int f13654h;

    /* renamed from: i  reason: collision with root package name */
    private long f13655i;

    /* renamed from: j  reason: collision with root package name */
    private long f13656j;

    /* renamed from: k  reason: collision with root package name */
    private int f13657k;

    /* renamed from: l  reason: collision with root package name */
    private int f13658l;

    /* renamed from: m  reason: collision with root package name */
    private int f13659m;

    /* renamed from: n  reason: collision with root package name */
    private int f13660n;

    /* renamed from: o  reason: collision with root package name */
    private int f13661o;

    /* renamed from: p  reason: collision with root package name */
    private int f13662p;
    private String q;
    private String r;
    private String s;
    private String t;
    private String u;
    private int v;
    private int w;
    private int x;
    private String y;
    private JSONArray z;

    /* compiled from: ProGuard */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class CloudManagerHolder {
        public static CloudManager instance;
    }

    public static CloudManager getInstance(Context context) {
        if (f13649a == null) {
            f13649a = context.getApplicationContext();
        }
        return CloudManagerHolder.instance;
    }

    public void clearGuid() {
        this.u = null;
        this.q = null;
        try {
            PushPreferences.remove(f13649a, "cloud_control_addrCfg");
        } catch (Throwable unused) {
            TBaseLogger.w("CloudManager", "unexpected for clearGuid");
        }
    }

    public boolean disableCollData() {
        return i() == 1;
    }

    public boolean disablePullMsg() {
        if (this.v == -1) {
            this.v = a(f13649a, "cloud_control_pullMsg", 0);
        }
        return this.v == 1;
    }

    public boolean disablePullUp() {
        return c() == 10 || h() == 1;
    }

    public boolean disableRepLanuEv() {
        if (this.f13662p == -1) {
            this.f13662p = a(f13649a, "cloud_control_repoLanuEv", 1);
        }
        return this.f13662p == 1;
    }

    public boolean disableRepoCloudArrive() {
        if (this.D == -1) {
            this.D = a(f13649a, "cloud_control_repoCloudArrive", 1);
        }
        return this.D == 1;
    }

    public boolean disableRepoCusEv() {
        if (this.E == -1) {
            this.E = a(f13649a, "cloud_control_repoCusEv", 2);
        }
        return this.E == 1;
    }

    public boolean disableReptErrCode() {
        int reptErrCode = getReptErrCode();
        if (reptErrCode == 1) {
            return true;
        }
        return reptErrCode > 0 && new Random().nextInt(100) < reptErrCode;
    }

    public boolean disableReptLog() {
        if (this.w == -1) {
            this.w = a(f13649a, "cloud_control_reptLog", 0);
        }
        return this.w == 1;
    }

    public boolean disableShareBugly() {
        return j() == 1;
    }

    public int getAppClsAlive() {
        if (this.f13661o == -1) {
            this.f13661o = a(f13649a, "cloud_control_appClsAlive", 0);
        }
        return this.f13661o;
    }

    public String getCloud() {
        return this.b;
    }

    public long getCloudVersion() {
        if (this.c == -1) {
            this.c = PushPreferences.getLong(f13649a, "cloud_control_version", 0L);
        }
        return this.c;
    }

    public int getCompressLevel() {
        if (this.x == -1) {
            this.x = a(f13649a, "cloud_control_compress", 0);
        }
        return this.x;
    }

    public String getCustom() {
        if (!Util.isNullOrEmptyString(this.s)) {
            return this.s;
        }
        try {
        } catch (Throwable unused) {
            TBaseLogger.d("CloudManager", "unexpected for getCustom");
        }
        if (Util.isNullOrEmptyString(l())) {
            return this.s;
        }
        this.s = new JSONObject(l()).getString("custom");
        return this.s;
    }

    public String getGuid() {
        if (!Util.isNullOrEmptyString(this.u)) {
            return this.u;
        }
        try {
        } catch (Throwable unused) {
            TBaseLogger.d("CloudManager", "unexpected for getGuid");
        }
        if (Util.isNullOrEmptyString(l())) {
            return this.u;
        }
        this.u = new JSONObject(l()).getString(TPDownloadProxyEnum.USER_GUID);
        return this.u;
    }

    public int getInterval() {
        if (this.f13652f == -1) {
            this.f13652f = PushPreferences.getInt(f13649a, "cloud_control_interval", 0);
        }
        return this.f13652f;
    }

    public String getLog() {
        if (!Util.isNullOrEmptyString(this.t)) {
            return this.t;
        }
        try {
        } catch (Throwable unused) {
            TBaseLogger.d("CloudManager", "unexpected for getLog");
        }
        if (Util.isNullOrEmptyString(l())) {
            return this.t;
        }
        this.t = new JSONObject(l()).getString(BuildConfig.FLAVOR_type);
        return this.t;
    }

    public JSONArray getPullupArrProviderAndActivity() {
        JSONArray jSONArray = this.z;
        if (jSONArray != null) {
            return jSONArray;
        }
        try {
        } catch (Throwable unused) {
            TBaseLogger.d("CloudManager", "unexpected for getPullupJSONArr");
        }
        if (Util.isNullOrEmptyString(k())) {
            return null;
        }
        this.z = new JSONArray(this.y);
        return this.z;
    }

    public String getPullupBlackList() {
        try {
            if (this.A == null) {
                this.A = PushPreferences.getString(f13649a, "cloud_control_conf_pull_black_list", "");
            }
        } catch (Throwable unused) {
            TBaseLogger.d("CloudManager", "unexpected for getPullupBlackList");
        }
        return "";
    }

    public int getRecons() {
        if (this.f13657k == -1) {
            this.f13657k = a(f13649a, "cloud_control_recons", 0);
        }
        return this.f13657k;
    }

    public int getReptErrCode() {
        if (this.f13658l == -1) {
            this.f13658l = a(f13649a, "cloud_control_reptErrCode", 1);
        }
        return this.f13658l;
    }

    public String getStat() {
        if (!Util.isNullOrEmptyString(this.r)) {
            return this.r;
        }
        try {
        } catch (Throwable unused) {
            TBaseLogger.d("CloudManager", "unexpected for getStat");
        }
        if (Util.isNullOrEmptyString(l())) {
            return this.r;
        }
        this.r = new JSONObject(l()).getString("stat");
        return this.r;
    }

    public void parseCloudConfig(String str, long j2) {
        if (Util.isNullOrEmptyString(str) || f13649a == null) {
            return;
        }
        CommonWorkingThread.getInstance().execute(new TTask(this, str, j2) { // from class: com.tencent.tpns.baseapi.base.util.CloudManager.1

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f13663a;
            public final /* synthetic */ long b;
            public final /* synthetic */ CloudManager c;

            @Override // com.tencent.tpns.baseapi.base.util.TTask
            public void TRun() {
            }
        });
    }

    public ContentValues reset() {
        this.b = null;
        this.c = -1L;
        this.f13650d = -1;
        this.f13651e = -1;
        this.f13652f = -1;
        this.f13653g = -1;
        this.f13654h = -1;
        this.f13657k = -1;
        this.f13658l = -1;
        this.f13659m = -1;
        this.f13660n = -1;
        this.f13661o = -1;
        this.x = -1;
        this.v = -1;
        this.w = -1;
        this.B = -1;
        this.q = null;
        this.y = null;
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.putNull("cloud_control_keepAlive");
            contentValues.putNull("cloud_control_packetLoss");
            contentValues.putNull("cloud_control_version");
            contentValues.putNull("cloud_control_interval");
            contentValues.putNull("cloud_control_appAlive");
            contentValues.putNull("cloud_control_losePkt");
            contentValues.putNull("cloud_control_recons");
            contentValues.putNull("cloud_control_reptErrCode");
            contentValues.putNull("cloud_control_collData");
            contentValues.putNull("cloud_control_shrBugly");
            contentValues.putNull("cloud_control_appClsAlive");
            contentValues.putNull("cloud_control_repoLanuEv");
            contentValues.putNull("cloud_control_compress");
            contentValues.putNull("cloud_control_pullMsg");
            contentValues.putNull("cloud_control_reptLog");
            contentValues.putNull("cloud_control_addrCfg");
            contentValues.putNull("cloud_control_conf_pull_arr");
            contentValues.putNull("cloud_control_conf_pull_black_list");
            contentValues.putNull("cloud_control_useHttpAccount");
            contentValues.putNull("cloud_control_useTpnsChannel");
            contentValues.putNull("cloud_control_repoCloudArrive");
            contentValues.putNull("cloud_control_repoCusEv");
            return contentValues;
        } catch (Throwable th) {
            TBaseLogger.w("CloudManager", "unexpected for reset", th);
            return null;
        }
    }

    public boolean shouldRefuse() {
        if (!b()) {
            TBaseLogger.d("CloudManager", "shouldRefuse | isCloudRefuse : false");
            return false;
        }
        f();
        g();
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = this.f13656j;
        if (currentTimeMillis > j2 || currentTimeMillis < this.f13655i) {
            long j3 = this.f13655i;
            if ((j3 != 0 || j2 != 0) && ((currentTimeMillis > j2 || j3 != 0) && (currentTimeMillis < j3 || j2 != 0))) {
                return false;
            }
        }
        TBaseLogger.d("CloudManager", "shouldRefuse | refuse ");
        return true;
    }

    public int useHttp() {
        if (this.B == -1) {
            this.B = a(f13649a, "cloud_control_useHttpAccount", 0);
        }
        return this.B;
    }

    public int useTpnsChannel() {
        if (this.C == -1) {
            this.C = a(f13649a, "cloud_control_useTpnsChannel", 0);
        }
        return this.C;
    }

    private CloudManager() {
        this.b = null;
        this.c = -1L;
        this.f13650d = -1;
        this.f13651e = -1;
        this.f13652f = -1;
        this.f13653g = -1;
        this.f13654h = -1;
        this.f13655i = 0L;
        this.f13656j = 0L;
        this.f13657k = -1;
        this.f13658l = -1;
        this.f13659m = -1;
        this.f13660n = -1;
        this.f13661o = -1;
        this.f13662p = -1;
        this.q = null;
        this.r = null;
        this.s = null;
        this.t = null;
        this.u = null;
        this.v = -1;
        this.w = -1;
        this.x = -1;
        this.y = null;
        this.z = null;
        this.A = null;
        this.B = -1;
        this.C = -1;
        this.D = -1;
        this.E = -1;
    }

    private int e() {
        if (this.f13654h == -1) {
            this.f13654h = a(f13649a, "cloud_control_losePkt", 0);
        }
        return this.f13654h;
    }

    private long f() {
        if (this.f13655i == 0) {
            this.f13655i = a(f13649a, "cloud_control_loseStart", 0);
        }
        return this.f13655i;
    }

    private long g() {
        if (this.f13656j == 0) {
            this.f13656j = a(f13649a, "cloud_control_loseStart", 0);
        }
        return this.f13656j;
    }

    private int h() {
        if (this.f13653g == -1) {
            this.f13653g = a(f13649a, "cloud_control_appAlive", 0);
        }
        return this.f13653g;
    }

    private int i() {
        if (this.f13659m == -1) {
            this.f13659m = a(f13649a, "cloud_control_collData", 0);
        }
        return this.f13659m;
    }

    private int j() {
        if (this.f13660n == -1) {
            this.f13660n = a(f13649a, "cloud_control_shrBugly", 0);
        }
        return this.f13660n;
    }

    private String k() {
        if (this.y == null) {
            this.y = PushPreferences.getString(f13649a, "cloud_control_conf_pull_arr", "");
        }
        return this.y;
    }

    private String l() {
        if (this.q == null) {
            this.q = PushPreferences.getString(f13649a, "cloud_control_addrCfg", "");
        }
        return this.q;
    }

    private int d() {
        if (this.f13651e == -1) {
            this.f13651e = a(f13649a, "cloud_control_packetLoss", 0);
        }
        return this.f13651e;
    }

    private boolean b() {
        if (d() == 20 || e() == 1) {
            return true;
        }
        int max = Math.max(d(), e());
        return max > 0 && new Random().nextInt(100) < max;
    }

    private int c() {
        if (this.f13650d == -1) {
            this.f13650d = a(f13649a, "cloud_control_keepAlive", 0);
        }
        return this.f13650d;
    }

    private int a(Context context, String str, int i2) {
        if (context == null) {
            return i2;
        }
        try {
            return PushPreferences.getInt(context, str, i2);
        } catch (Throwable unused) {
            TBaseLogger.d("CloudManager", "unexpected for getCloudConfig:" + str);
            return i2;
        }
    }
}
