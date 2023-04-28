package h.y.a.n;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.baidu.location.BDLocation;
import com.sobot.chat.utils.ZhiChiConstant;
import com.taihebase.activity.model.CityBean;
import com.taihebase.activity.model.ProvinceBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: GPSCodeUtils.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class d0 {
    public static void a(BDLocation bDLocation, Function1<Boolean, Unit> function1) {
        String str = ZhiChiConstant.message_type_history_custom;
        String str2 = "北京";
        if (bDLocation != null) {
            try {
                if (!TextUtils.isEmpty(bDLocation.getCityCode())) {
                    str = bDLocation.getCityCode();
                }
                if (!TextUtils.isEmpty(bDLocation.getProvince())) {
                    str2 = bDLocation.getProvince();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                i0.d("ApiHelper", "转换百度code错误");
                if (function1 != null) {
                    function1.invoke(Boolean.FALSE);
                    return;
                }
                return;
            }
        }
        b(str, str2, function1);
    }

    public static void b(String str, String str2, Function1<Boolean, Unit> function1) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            t0.h(new i.a.x0.a(str2, str, function1) { // from class: h.y.a.n.i
                public final /* synthetic */ String b;
                public final /* synthetic */ String c;

                /* renamed from: d  reason: collision with root package name */
                public final /* synthetic */ Function1 f26315d;

                @Override // i.a.x0.a
                public final void run() {
                }
            });
        } else if (function1 != null) {
            function1.invoke(Boolean.FALSE);
        }
    }

    public static /* synthetic */ void c(String str, String str2, Function1 function1) throws Exception {
        for (ProvinceBean provinceBean : JSON.parseArray(h.x.e.e.o.K(h.y.a.f.k.b(), "city_json.txt"), ProvinceBean.class)) {
            if (str.contains(provinceBean.provinceName) || provinceBean.provinceName.contains(str)) {
                for (CityBean cityBean : provinceBean.cityList) {
                    if (str2.equals(cityBean.baiduCode)) {
                        String str3 = cityBean.code;
                        u0.L().s1(str3);
                        u0.L().t1(provinceBean.provinceCode);
                        if (function1 != null) {
                            function1.invoke(Boolean.TRUE);
                        }
                        i0.d("ApiHelper", "写入code:" + str3);
                        return;
                    }
                }
                continue;
            }
        }
    }
}
