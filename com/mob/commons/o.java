package com.mob.commons;

import android.content.Context;
import android.os.Bundle;
import cn.sharesdk.framework.ShareSDK;
import com.mob.MobSDK;
import com.mob.tools.MobLog;
import java.io.ObjectInputStream;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.GZIPInputStream;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class o {

    /* renamed from: a  reason: collision with root package name */
    public static volatile String f3664a = null;
    public static volatile String b = null;
    public static volatile InternationalDomain c = null;

    /* renamed from: d  reason: collision with root package name */
    public static volatile boolean f3665d = false;

    /* renamed from: e  reason: collision with root package name */
    public static volatile boolean f3666e = true;

    /* renamed from: f  reason: collision with root package name */
    public static volatile boolean f3667f = false;

    /* renamed from: g  reason: collision with root package name */
    public static volatile boolean f3668g = true;

    /* renamed from: h  reason: collision with root package name */
    public static volatile boolean f3669h;

    /* renamed from: i  reason: collision with root package name */
    public static volatile String f3670i;

    /* renamed from: j  reason: collision with root package name */
    private static AtomicBoolean f3671j = new AtomicBoolean(false);

    /* renamed from: k  reason: collision with root package name */
    private static HashMap<String, HashMap<String, Object>> f3672k = new HashMap<>();

    public static void a(Context context) {
        try {
            if (f3671j.compareAndSet(false, true)) {
                try {
                    if (f3664a == null) {
                        f3664a = (String) MobMeta.get(null, "Mob-AppKey", String.class, null);
                    }
                    if (b == null) {
                        b = (String) MobMeta.get(null, "Mob-AppSecret", String.class, null);
                    }
                    if (b == null) {
                        b = (String) MobMeta.get(null, "Mob-AppSeret", String.class, null);
                    }
                } catch (Throwable unused) {
                }
                String str = (String) MobMeta.get(null, b("006^ehdbZk)cecdcj"), String.class, null);
                if (str != null) {
                    c = InternationalDomain.domainOf(str);
                }
                f3670i = (String) MobMeta.get(null, "Mob-OdVivoAppId", String.class, null);
                String b2 = b("009$fhdbebghgc5ccd]ef");
                Class cls = Boolean.TYPE;
                Boolean bool = Boolean.FALSE;
                f3665d = ((Boolean) MobMeta.get(null, b2, cls, bool)).booleanValue();
                f3666e = ((Boolean) MobMeta.get(null, b("015Dfhdbebghfg)dBdeRh3cfZhEefefcecgch"), cls, Boolean.valueOf(f3666e))).booleanValue();
                f3667f = ((Boolean) MobMeta.get(null, b("006;fhdbebghfehd"), cls, bool)).booleanValue();
                f3668g = ((Boolean) MobMeta.get(null, "Mob-elog", cls, Boolean.TRUE)).booleanValue();
                f3669h = ((Boolean) MobMeta.get(null, "Mob-GPP", cls, bool)).booleanValue();
            }
        } catch (Throwable th) {
            MobLog.getInstance().d(th);
        }
    }

    public static String b(String str) {
        return s.a(str, 98);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v5 */
    public static <T> T a(String str, Class<T> cls, MobProduct mobProduct) {
        T t;
        ObjectInputStream objectInputStream;
        HashMap<String, Object> hashMap;
        Object obj;
        T cast;
        boolean z;
        T t2 = null;
        try {
            String a2 = a(mobProduct);
            if (f3672k.containsKey(a2)) {
                hashMap = f3672k.get(a2);
                objectInputStream = null;
            } else {
                objectInputStream = new ObjectInputStream(new GZIPInputStream(MobSDK.getContext().getResources().getAssets().open(a2)));
                try {
                    HashMap<String, Object> hashMap2 = (HashMap) objectInputStream.readObject();
                    if (hashMap2 != null && !hashMap2.isEmpty()) {
                        f3672k.put(a2, hashMap2);
                    }
                    hashMap = hashMap2;
                    objectInputStream = objectInputStream;
                } catch (Throwable th) {
                    th = th;
                    obj = null;
                    t2 = (T) objectInputStream;
                    t = obj;
                    try {
                        MobLog.getInstance().d(th);
                        s.a(t2);
                        return t;
                    } catch (Throwable th2) {
                        s.a(t2);
                        throw th2;
                    }
                }
            }
            if (hashMap != null && !hashMap.isEmpty()) {
                obj = hashMap.get(str);
                if (b("009=fhdbebghgc:ccd4ef").equals(str) && obj != 0 && (obj instanceof String)) {
                    if (!b("003Och@h]ef").equalsIgnoreCase(String.valueOf(obj)) && !b("004c)cgcbAh").equalsIgnoreCase(String.valueOf(obj))) {
                        z = false;
                        t2 = (T) Boolean.valueOf(z);
                    }
                    z = true;
                    t2 = (T) Boolean.valueOf(z);
                } else if (obj != null) {
                    if (cls != null && obj != null) {
                        if (cls != Void.class) {
                            try {
                                if (cls == Boolean.TYPE) {
                                    if (obj instanceof String) {
                                        cast = (T) Boolean.valueOf((String) obj);
                                    } else {
                                        cast = (T) Boolean.class.cast(obj);
                                    }
                                } else if (cls == Integer.TYPE) {
                                    if (obj instanceof String) {
                                        cast = (T) Integer.valueOf((String) obj);
                                    } else {
                                        cast = (T) Integer.class.cast(obj);
                                    }
                                } else if (cls == Byte.TYPE) {
                                    if (obj instanceof String) {
                                        cast = (T) Byte.valueOf((String) obj);
                                    } else {
                                        cast = (T) Byte.class.cast(obj);
                                    }
                                } else {
                                    Class<T> cls2 = Character.TYPE;
                                    if (cls == cls2) {
                                        if (obj instanceof String) {
                                            cast = cls2.cast(obj);
                                        } else {
                                            cast = (T) Character.class.cast(obj);
                                        }
                                    } else if (cls == Short.TYPE) {
                                        if (obj instanceof String) {
                                            cast = (T) Short.valueOf((String) obj);
                                        } else {
                                            cast = (T) Short.class.cast(obj);
                                        }
                                    } else if (cls == Long.TYPE) {
                                        if (obj instanceof String) {
                                            cast = (T) Long.valueOf((String) obj);
                                        } else {
                                            cast = (T) Long.class.cast(obj);
                                        }
                                    } else if (cls == Float.TYPE) {
                                        if (obj instanceof String) {
                                            cast = (T) Float.valueOf((String) obj);
                                        } else {
                                            cast = (T) Float.class.cast(obj);
                                        }
                                    } else if (cls == Double.TYPE) {
                                        if (obj instanceof String) {
                                            cast = (T) Double.valueOf((String) obj);
                                        } else {
                                            cast = (T) Double.class.cast(obj);
                                        }
                                    } else {
                                        cast = cls.cast(obj);
                                    }
                                }
                                t2 = cast;
                            } catch (Throwable th3) {
                                try {
                                    MobLog.getInstance().d(th3);
                                } catch (Throwable th4) {
                                    th = th4;
                                    t2 = (T) objectInputStream;
                                    t = obj;
                                    MobLog.getInstance().d(th);
                                    s.a(t2);
                                    return t;
                                }
                            }
                        }
                    }
                    t2 = obj;
                }
            }
            s.a(objectInputStream);
            return t2;
        } catch (Throwable th5) {
            th = th5;
            t = null;
        }
    }

    public static <T> T a(String str) {
        try {
            Bundle bundle = com.mob.tools.a.c.a(MobSDK.getContext()).b().a(MobSDK.getContext().getPackageName(), 128).metaData;
            if (bundle != null) {
                T t = (T) bundle.get(str);
                if (b("009^fhdbebghgcMccdCef").equals(str) && t != null && (t instanceof String)) {
                    return (T) Boolean.valueOf(b("003FchVhIef").equalsIgnoreCase(String.valueOf(t)));
                }
                if (t != null) {
                    return t;
                }
                return null;
            }
            return null;
        } catch (Throwable th) {
            MobLog.getInstance().d(th);
            return null;
        }
    }

    private static String a(MobProduct mobProduct) {
        String str;
        if (mobProduct != null) {
            try {
                String productTag = mobProduct.getProductTag();
                if (ShareSDK.SDK_TAG.equals(productTag)) {
                    str = "ShareSDK.mt";
                } else if (b("0061dgfhdgdgehgi").equals(productTag)) {
                    str = "SMSSDK.mt";
                } else if ("MOBLINK".equals(productTag)) {
                    str = "MobLink.mt";
                } else if ("MOBPUSH".equals(productTag)) {
                    str = "MobPush.mt";
                } else if (!b("009Hdgfcfffefcfddfejhh").equals(productTag)) {
                    return "MobSDK.mt";
                } else {
                    str = "SecVerify.mt";
                }
                return str;
            } catch (Throwable th) {
                MobLog.getInstance().d(th);
                return "MobSDK.mt";
            }
        }
        return "MobSDK.mt";
    }
}
