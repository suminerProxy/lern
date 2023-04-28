package com.efs.sdk.pa;

import android.content.Context;
import com.efs.sdk.base.EfsReporter;
import com.efs.sdk.pa.config.ConfigManager;
import com.efs.sdk.pa.config.IEfsReporter;
import com.efs.sdk.pa.config.PackageLevel;
import java.util.HashMap;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class PAFactory {
    private static final long DEFAULT_TIME_OUT_TIME = 2000;
    private static final long INVALID_TIME_OUT_TIME = 0;
    private static final long MAX_TIME_OUT_TIME = 4000;
    private static final String TAG = "pafactory";
    public static final ThreadLocal<PA> sThreadLocal = null;
    private ConfigManager mConfigManager;
    private Context mContext;
    private HashMap<String, String> mExtend;
    private EfsReporter mReporter;
    private IEfsReporter mReporterFactory;
    private String mSerial;
    private String mSver;
    private long mTimeOutTime;
    private PATraceListener mTraceListener;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class Builder {

        /* renamed from: a  reason: collision with root package name */
        private PackageLevel f3227a;
        private IEfsReporter b;
        private boolean c;

        /* renamed from: d  reason: collision with root package name */
        private Context f3228d;

        /* renamed from: e  reason: collision with root package name */
        private String f3229e;

        /* renamed from: f  reason: collision with root package name */
        private HashMap<String, String> f3230f;

        /* renamed from: g  reason: collision with root package name */
        private String f3231g;

        /* renamed from: h  reason: collision with root package name */
        private long f3232h;

        /* renamed from: i  reason: collision with root package name */
        private PATraceListener f3233i;

        public Builder(Context context, IEfsReporter iEfsReporter) {
        }

        public PAFactory build() {
        }

        public Builder extendLogInfo(HashMap<String, String> hashMap) {
        }

        public Builder isNewInstall(boolean z) {
        }

        public Builder packageLevel(PackageLevel packageLevel) {
        }

        public Builder serial(String str) {
        }

        public Builder sver(String str) {
        }

        public Builder timeoutTime(long j2) {
        }

        public Builder traceListener(PATraceListener pATraceListener) {
        }
    }

    public /* synthetic */ PAFactory(Context context, PackageLevel packageLevel, IEfsReporter iEfsReporter, boolean z, String str, HashMap hashMap, String str2, long j2, PATraceListener pATraceListener, AnonymousClass1 anonymousClass1) {
    }

    public ConfigManager getConfigManager() {
    }

    public HashMap<String, String> getExtend() {
    }

    public synchronized PA getPaInstance() {
    }

    public EfsReporter getReporter() {
    }

    public String getSerial() {
    }

    public String getSver() {
    }

    public PATraceListener getTraceListener() {
    }

    private PAFactory(Context context, PackageLevel packageLevel, IEfsReporter iEfsReporter, boolean z, String str, HashMap<String, String> hashMap, String str2, long j2, PATraceListener pATraceListener) {
    }
}
