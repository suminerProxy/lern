package com.tencent.android.tpush.stat.b;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.android.tpush.logging.TLogger;
import com.tencent.tpns.dataacquisition.CustomDeviceInfos;
import java.util.Random;
import org.json.JSONObject;

/* compiled from: ProGuard */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class e {
    public static String a(Context context) {
        String a2 = d.a(context, "xg.mta.ui", "");
        if (TextUtils.isEmpty(a2)) {
            a2 = CustomDeviceInfos.getFacilityIdentity(context);
        }
        if (TextUtils.isEmpty(a2)) {
            a2 = Integer.toString(new Random().nextInt(Integer.MAX_VALUE));
        }
        d.b(context, "xg.mta.ui", a2);
        return a2;
    }

    public static Context b(Context context) {
        return (context == null || context.getApplicationContext() == null) ? context : context.getApplicationContext();
    }

    public static void a(JSONObject jSONObject, String str, String str2) {
        if (str2 != null) {
            try {
                if (str2.length() > 0) {
                    jSONObject.put(str, str2);
                }
            } catch (Throwable th) {
                TLogger.e("XgStat", "jsonPut error", th);
            }
        }
    }
}
