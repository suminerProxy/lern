package com.tencent.android.tpush.service.a;

import android.content.Context;
import java.util.Map;
import org.json.JSONArray;

/* compiled from: ProGuard */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class a {
    private static volatile a L;
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public String I;
    public JSONArray J;
    public Map<String, String> K;
    private Context M;

    /* renamed from: a  reason: collision with root package name */
    public long f8839a;
    public int b;
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public int f8840d;

    /* renamed from: e  reason: collision with root package name */
    public int f8841e;

    /* renamed from: f  reason: collision with root package name */
    public int f8842f;

    /* renamed from: g  reason: collision with root package name */
    public int f8843g;

    /* renamed from: h  reason: collision with root package name */
    public int f8844h;

    /* renamed from: i  reason: collision with root package name */
    public int f8845i;

    /* renamed from: j  reason: collision with root package name */
    public int f8846j;

    /* renamed from: k  reason: collision with root package name */
    public int f8847k;

    /* renamed from: l  reason: collision with root package name */
    public int f8848l;

    /* renamed from: m  reason: collision with root package name */
    public int f8849m;

    /* renamed from: n  reason: collision with root package name */
    public int f8850n;

    /* renamed from: o  reason: collision with root package name */
    public int f8851o;

    /* renamed from: p  reason: collision with root package name */
    public int f8852p;
    public int q;
    public int r;
    public int s;
    public int t;
    public String u;
    public int v;
    public int w;
    public String x;
    public int y;
    public int z;

    private a() {
        this.M = null;
        this.x = null;
        this.y = 1;
        this.z = 1;
        this.A = 60000;
        this.B = 1;
        this.C = 1;
        this.D = 1;
        this.E = -1;
        this.F = -1;
        this.G = -1;
        this.H = -1;
        this.I = "xiaomi";
        this.J = null;
    }

    public static a a(Context context) {
        if (L == null) {
            synchronized (a.class) {
                if (L == null) {
                    L = new a(context);
                }
            }
        }
        return L;
    }

    public String toString() {
        return "ConfigurationManager [context=" + this.M + ", configurationVersion=" + this.f8839a + ", receiveTimeout=" + this.b + ", heartbeatInterval=" + this.c + ", httpHeartbeatInterval=" + this.f8840d + ", speedTestInterval=" + this.f8841e + ", channelMessageExpires=" + this.f8842f + ", freqencySuccess=" + this.f8843g + ", freqencyFailed=" + this.f8844h + ", reportInterval=" + this.f8845i + ", reportMaxCount=" + this.f8846j + ", httpRetryCount=" + this.f8847k + ", ackMaxCount=" + this.f8848l + ", ackDuration=" + this.f8849m + ", loadIpInerval=" + this.f8850n + ", redirectConnectTimeOut=" + this.f8851o + ", redirectSoTimeOut=" + this.f8852p + ", strategyExpiredTime=" + this.q + ", logLevel=" + this.r + ", logFileSizeLimit=" + this.s + ", errCount=" + this.t + ", logUploadDomain=" + this.u + ", rptLive=" + this.v + ", rptLiveIntvl=" + this.w + ", disableXG=" + this.x + ", enableNewWd=" + this.y + ", enableMonitor=" + this.z + ", monitorFreg=" + this.A + ", enableReport=" + this.B + ", abTestVersion=" + this.C + ", isHttpDNSEnable=" + this.D + ", isLBSEnable=" + this.E + ", isAPPListEnable=" + this.F + ", isNotificatiobStatusEnable=" + this.G + ", isQgameEnable=" + this.H + ", pullup_Arr_ProviderAndActivty=" + this.J + ", pullup_packges_map=" + this.K + ", wakeupCtrl=" + this.I + "]";
    }

    private a(Context context) {
        this.M = null;
        this.x = null;
        this.y = 1;
        this.z = 1;
        this.A = 60000;
        this.B = 1;
        this.C = 1;
        this.D = 1;
        this.E = -1;
        this.F = -1;
        this.G = -1;
        this.H = -1;
        this.I = "xiaomi";
        this.J = null;
        this.M = context.getApplicationContext();
    }
}
