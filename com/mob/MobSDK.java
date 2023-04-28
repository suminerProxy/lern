package com.mob;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.mob.commons.InternationalDomain;
import com.mob.commons.MobProduct;
import com.mob.commons.o;
import com.mob.commons.p;
import com.mob.commons.r;
import com.mob.commons.s;
import com.mob.commons.t;
import com.mob.tools.MobLog;
import com.mob.tools.proguard.PublicMemberKeeper;
import com.mob.tools.utils.ReflectHelper;
import com.mob.tools.utils.UIHandler;
import org.apache.commons.cli.HelpFormatter;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class MobSDK implements PublicMemberKeeper {
    public static final int CHANNEL_APICLOUD = 5;
    public static final int CHANNEL_COCOS = 1;
    public static final int CHANNEL_FLUTTER = 4;
    public static final int CHANNEL_JS = 3;
    public static final int CHANNEL_NATIVE = 0;
    public static final int CHANNEL_QUICKSDK = 6;
    public static final int CHANNEL_REACT_NATIVE = 8;
    public static final int CHANNEL_UNIAPP = 7;
    public static final int CHANNEL_UNITY = 2;
    public static final int SDK_VERSION_CODE;
    public static final String SDK_VERSION_NAME;

    /* renamed from: a  reason: collision with root package name */
    private static volatile Context f3375a;

    static {
        int i2;
        String str = "1.0.0";
        try {
            str = "2023-04-18".replace(HelpFormatter.DEFAULT_OPT_PREFIX, ".");
            i2 = Integer.parseInt("2023-04-18".replace(HelpFormatter.DEFAULT_OPT_PREFIX, ""));
        } catch (Throwable unused) {
            i2 = 1;
        }
        SDK_VERSION_CODE = i2;
        SDK_VERSION_NAME = str;
    }

    @Deprecated
    public static void canIContinueBusiness(final MobProduct mobProduct, Object obj, final Object obj2) {
        if (obj2 != null) {
            new Thread(new Runnable() { // from class: com.mob.MobSDK.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (MobProduct.this == null) {
                            ReflectHelper.invokeInstanceMethod(obj2, "onFailure", new Throwable("MobProduct can not be null"));
                        } else {
                            ReflectHelper.invokeInstanceMethod(obj2, "onComplete", Boolean.TRUE);
                        }
                    } catch (Throwable th) {
                        MobLog.getInstance().e(th);
                        try {
                            ReflectHelper.invokeInstanceMethod(obj2, "onFailure", th);
                        } catch (Throwable unused) {
                        }
                    }
                }
            }).start();
            return;
        }
        throw new IllegalArgumentException("callback can not be null");
    }

    public static boolean checkForceHttps() {
        return o.f3665d;
    }

    @Deprecated
    public static String checkRequestUrl(String str) {
        return s.a(str);
    }

    public static boolean checkV6() {
        return o.f3667f;
    }

    @Deprecated
    public static String dynamicModifyUrl(String str) {
        return s.a(str);
    }

    public static String getAppSecret() {
        return o.b;
    }

    public static String getAppkey() {
        if (TextUtils.isEmpty(o.f3664a) && f3375a != null) {
            o.a(f3375a);
        }
        return o.f3664a;
    }

    public static Context getContext() {
        if (f3375a == null) {
            try {
                Context a2 = s.a();
                if (a2 != null) {
                    init(a2);
                }
            } catch (Throwable unused) {
            }
        }
        return f3375a;
    }

    public static Context getContextSafely() {
        return f3375a;
    }

    public static boolean getDefaultPrivacy() {
        return o.f3666e;
    }

    public static InternationalDomain getDomain() {
        return o.c == null ? InternationalDomain.DEFAULT : o.c;
    }

    public static int getPrivacyGrantedStatus() {
        return t.d();
    }

    public static synchronized void init(Context context) {
        synchronized (MobSDK.class) {
            init(context, null, null);
        }
    }

    public static final int isAuth() {
        return r.c();
    }

    public static final boolean isForb() {
        return r.e();
    }

    public static final boolean isGppVer() {
        return o.f3669h;
    }

    public static final boolean isMob() {
        return r.d();
    }

    public static void setChannel(MobProduct mobProduct, int i2) {
        p.a().a(mobProduct, i2);
    }

    public static void submitPolicyGrantResult(boolean z) {
        t.b(z);
    }

    @Deprecated
    public static void submitPolicyGrantResult(boolean z, final OperationCallback<Void> operationCallback) {
        t.b(z);
        if (operationCallback != null) {
            UIHandler.sendEmptyMessage(0, new Handler.Callback() { // from class: com.mob.MobSDK.1
                @Override // android.os.Handler.Callback
                public boolean handleMessage(Message message) {
                    OperationCallback operationCallback2 = OperationCallback.this;
                    if (operationCallback2 != null) {
                        operationCallback2.onComplete(null);
                        return false;
                    }
                    return false;
                }
            });
        }
    }

    public static synchronized void init(Context context, String str) {
        synchronized (MobSDK.class) {
            init(context, str, null);
        }
    }

    public static synchronized void init(Context context, String str, String str2) {
        synchronized (MobSDK.class) {
            if (context == null) {
                return;
            }
            if (f3375a == null) {
                f3375a = context.getApplicationContext();
                o.f3664a = str;
                o.b = str2;
                r.a();
            } else if (!TextUtils.isEmpty(str) && TextUtils.isEmpty(o.f3664a)) {
                o.f3664a = str;
                o.b = str2;
                r.b();
            }
        }
    }
}
