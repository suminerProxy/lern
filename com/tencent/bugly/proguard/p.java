package com.tencent.bugly.proguard;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.bugly.BuglyStrategy;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: BUGLY */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f9941a = true;
    public static List<o> b = new ArrayList();
    public static boolean c;

    /* renamed from: d  reason: collision with root package name */
    private static w f9942d;

    /* renamed from: e  reason: collision with root package name */
    private static boolean f9943e;

    private static boolean a(aa aaVar) {
        List<String> list = aaVar.v;
        aaVar.getClass();
        return list != null && list.contains("bugly");
    }

    public static synchronized void a(Context context) {
        synchronized (p.class) {
            a(context, null);
        }
    }

    public static synchronized void a(Context context, BuglyStrategy buglyStrategy) {
        synchronized (p.class) {
            if (f9943e) {
                al.d("[init] initial Multi-times, ignore this.", new Object[0]);
            } else if (context == null) {
                String str = al.b;
            } else {
                aa a2 = aa.a(context);
                if (a(a2)) {
                    f9941a = false;
                    return;
                }
                String e2 = a2.e();
                if (e2 == null) {
                    String str2 = al.b;
                } else {
                    a(context, e2, a2.D, buglyStrategy);
                }
            }
        }
    }

    public static synchronized void a(Context context, String str, boolean z, BuglyStrategy buglyStrategy) {
        byte[] bArr;
        synchronized (p.class) {
            if (f9943e) {
                al.d("[init] initial Multi-times, ignore this.", new Object[0]);
            } else if (context == null) {
                String str2 = al.b;
            } else if (str == null) {
                String str3 = al.b;
            } else {
                f9943e = true;
                if (z) {
                    c = true;
                    al.c = true;
                    al.d("Bugly debug模式开启，请在发布时把isDebug关闭。 -- Running in debug model for 'isDebug' is enabled. Please disable it when you release.", new Object[0]);
                    al.e("--------------------------------------------------------------------------------------------", new Object[0]);
                    al.d("Bugly debug模式将有以下行为特性 -- The following list shows the behaviour of debug model: ", new Object[0]);
                    al.d("[1] 输出详细的Bugly SDK的Log -- More detailed log of Bugly SDK will be output to logcat;", new Object[0]);
                    al.d("[2] 每一条Crash都会被立即上报 -- Every crash caught by Bugly will be uploaded immediately.", new Object[0]);
                    al.d("[3] 自定义日志将会在Logcat中输出 -- Custom log will be output to logcat.", new Object[0]);
                    al.e("--------------------------------------------------------------------------------------------", new Object[0]);
                    al.b("[init] Open debug mode of Bugly.", new Object[0]);
                }
                al.a(" crash report start initializing...", new Object[0]);
                al.b("[init] Bugly start initializing...", new Object[0]);
                al.a("[init] Bugly complete version: v%s", "4.1.9.2");
                Context a2 = ap.a(context);
                aa a3 = aa.a(a2);
                a3.o();
                ao.a(a2);
                f9942d = w.a(a2, b);
                ai.a(a2);
                ac.a(a2, b);
                u a4 = u.a(a2);
                if (a(a3)) {
                    f9941a = false;
                    return;
                }
                a3.r = str;
                a3.b("APP_ID", str);
                al.a("[param] Set APP ID:%s", str);
                if (buglyStrategy != null) {
                    String appVersion = buglyStrategy.getAppVersion();
                    if (!TextUtils.isEmpty(appVersion)) {
                        if (appVersion.length() > 100) {
                            String substring = appVersion.substring(0, 100);
                            al.d("appVersion %s length is over limit %d substring to %s", appVersion, 100, substring);
                            appVersion = substring;
                        }
                        a3.f9663o = appVersion;
                        al.a("[param] Set App version: %s", buglyStrategy.getAppVersion());
                    }
                    try {
                        if (buglyStrategy.isReplaceOldChannel()) {
                            String appChannel = buglyStrategy.getAppChannel();
                            if (!TextUtils.isEmpty(appChannel)) {
                                if (appChannel.length() > 100) {
                                    String substring2 = appChannel.substring(0, 100);
                                    al.d("appChannel %s length is over limit %d substring to %s", appChannel, 100, substring2);
                                    appChannel = substring2;
                                }
                                f9942d.a(556, "app_channel", appChannel.getBytes(), false);
                                a3.s = appChannel;
                            }
                        } else {
                            Map<String, byte[]> a5 = f9942d.a(556, (v) null);
                            if (a5 != null && (bArr = a5.get("app_channel")) != null) {
                                a3.s = new String(bArr);
                            }
                        }
                        al.a("[param] Set App channel: %s", a3.s);
                    } catch (Exception e2) {
                        if (c) {
                            e2.printStackTrace();
                        }
                    }
                    String appPackageName = buglyStrategy.getAppPackageName();
                    if (!TextUtils.isEmpty(appPackageName)) {
                        if (appPackageName.length() > 100) {
                            String substring3 = appPackageName.substring(0, 100);
                            al.d("appPackageName %s length is over limit %d substring to %s", appPackageName, 100, substring3);
                            appPackageName = substring3;
                        }
                        a3.c = appPackageName;
                        al.a("[param] Set App package: %s", buglyStrategy.getAppPackageName());
                    }
                    String deviceID = buglyStrategy.getDeviceID();
                    if (deviceID != null) {
                        if (deviceID.length() > 100) {
                            String substring4 = deviceID.substring(0, 100);
                            al.d("deviceId %s length is over limit %d substring to %s", deviceID, 100, substring4);
                            deviceID = substring4;
                        }
                        a3.a(deviceID);
                        al.a("[param] Set device ID: %s", deviceID);
                    }
                    String deviceModel = buglyStrategy.getDeviceModel();
                    if (deviceModel != null) {
                        a3.b(deviceModel);
                        al.a("[param] Set device model: %s", deviceModel);
                    }
                    a3.f9654f = buglyStrategy.isUploadProcess();
                    ao.b = buglyStrategy.isBuglyLogUpload();
                }
                for (int i2 = 0; i2 < b.size(); i2++) {
                    if (a4.b(b.get(i2).id)) {
                        b.get(i2).init(a2, z, buglyStrategy);
                    }
                }
                s.a(a2, buglyStrategy);
                long appReportDelay = buglyStrategy != null ? buglyStrategy.getAppReportDelay() : 0L;
                final ac a6 = ac.a();
                a6.c.a(new Thread() { // from class: com.tencent.bugly.proguard.ac.1
                    @Override // java.lang.Thread, java.lang.Runnable
                    public final void run() {
                        try {
                            Map<String, byte[]> a7 = w.a().a(ac.f9666a, (v) null);
                            if (a7 != null) {
                                byte[] bArr2 = a7.get(com.alipay.sdk.packet.e.f733n);
                                byte[] bArr3 = a7.get("gateway");
                                if (bArr2 != null) {
                                    aa.a(a6.f9672h).d(new String(bArr2));
                                }
                                if (bArr3 != null) {
                                    aa.a(a6.f9672h).c(new String(bArr3));
                                }
                            }
                            a6.f9671g = ac.d();
                            if (a6.f9671g != null) {
                                if (ap.b(ac.f9668i) || !ap.d(ac.f9668i)) {
                                    a6.f9671g.q = StrategyBean.f9207a;
                                    a6.f9671g.r = StrategyBean.b;
                                } else {
                                    a6.f9671g.q = ac.f9668i;
                                    a6.f9671g.r = ac.f9668i;
                                }
                            }
                        } catch (Throwable th) {
                            if (!al.a(th)) {
                                th.printStackTrace();
                            }
                        }
                        ac acVar = a6;
                        acVar.a(acVar.f9671g, false);
                    }
                }, appReportDelay);
                al.b("[init] Bugly initialization finished.", new Object[0]);
            }
        }
    }

    public static synchronized void a(o oVar) {
        synchronized (p.class) {
            if (!b.contains(oVar)) {
                b.add(oVar);
            }
        }
    }
}
