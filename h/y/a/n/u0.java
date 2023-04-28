package h.y.a.n;

import android.content.Context;
import android.os.Parcelable;
import android.text.TextUtils;
import cn.sharesdk.framework.InnerShareParams;
import com.google.android.material.shadow.ShadowDrawableWrapper;
import com.sobot.chat.utils.ZhiChiConstant;
import com.tencent.android.tpush.common.Constants;
import com.tencent.cloud.huiyansdkface.facelight.api.WbCloudFaceContant;
import com.tencent.mmkv.MMKV;
import java.util.Calendar;
import java.util.Collections;
import java.util.Set;
import net.sourceforge.pinyin4j.ChineseToPinyinResource;

/* compiled from: SPUtileBiz.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class u0 {

    /* renamed from: a  reason: collision with root package name */
    private static u0 f26369a;
    private static MMKV b;

    public u0() {
        b = MMKV.defaultMMKV();
    }

    public static u0 L() {
        if (f26369a == null) {
            synchronized (u0.class) {
                if (f26369a == null) {
                    f26369a = new u0();
                }
            }
        }
        return f26369a;
    }

    public static void a() {
        b.clearAll();
    }

    private Boolean c(String str) {
        return Boolean.valueOf(b.decodeBool(str, false));
    }

    private byte[] e(String str) {
        return b.decodeBytes(str);
    }

    private Double f(String str) {
        return Double.valueOf(b.decodeDouble(str, ShadowDrawableWrapper.COS_45));
    }

    private Float g(String str) {
        return Float.valueOf(b.decodeFloat(str, 0.0f));
    }

    public static void j1(String str) {
        b.removeValueForKey(str);
    }

    private Parcelable k(String str) {
        return b.decodeParcelable(str, null);
    }

    private Set<String> n(String str) {
        return b.decodeStringSet(str, Collections.emptySet());
    }

    private static void o(String str, Object obj) {
        if (obj instanceof String) {
            b.encode(str, (String) obj);
        } else if (obj instanceof Integer) {
            b.encode(str, ((Integer) obj).intValue());
        } else if (obj instanceof Boolean) {
            b.encode(str, ((Boolean) obj).booleanValue());
        } else if (obj instanceof Float) {
            b.encode(str, ((Float) obj).floatValue());
        } else if (obj instanceof Long) {
            b.encode(str, ((Long) obj).longValue());
        } else if (obj instanceof Double) {
            b.encode(str, ((Double) obj).doubleValue());
        } else if (obj instanceof byte[]) {
            b.encode(str, (byte[]) obj);
        } else {
            b.encode(str, obj.toString());
        }
    }

    private static void p(String str, Parcelable parcelable) {
        b.encode(str, parcelable);
    }

    private static void q(String str, Set<String> set) {
        b.encode(str, set);
    }

    public String A() {
        return l("userid");
    }

    public boolean A0() {
        return c("UserAgreementSer").booleanValue();
    }

    public void A1(String str, String str2) {
        o("selectcity", str);
        o("selectcitycode", str2);
        o("isHaveSelectCity", Boolean.TRUE);
    }

    public void A2(String str) {
        o("dynamicQrCode", str);
    }

    public String B() {
        return l("CUSIT");
    }

    public String B0() {
        return l("avatar");
    }

    public void B1(boolean z) {
        o("isShowCityDiff", Boolean.valueOf(z));
    }

    public void B2(String str) {
        o("tel", str);
    }

    public String C() {
        return l("cityAreaCode");
    }

    public String C0() {
        return m(h.x.e.e.o.f25898e, "北京");
    }

    public void C1(long j2) {
        o("showCurrentLong", Long.valueOf(j2));
    }

    public boolean C2() {
        return c("showFloatP").booleanValue();
    }

    public String D(Context context) {
        return l("app_config");
    }

    public String D0() {
        return m("citycode", ZhiChiConstant.message_type_history_custom).trim();
    }

    public void D1(String str) {
        o("showDate", str);
    }

    public boolean E() {
        return c("CouponNew").booleanValue();
    }

    public Boolean E0() {
        return d("opneDanmu", true);
    }

    public void E1() {
        o("showFloatP", Boolean.TRUE);
    }

    public String F() {
        return m("expireTime", "");
    }

    public String F0() {
        return l("id");
    }

    public void F1(long j2) {
        o("showPayLong", Long.valueOf(j2));
    }

    public boolean G() {
        return c("appFirstFind").booleanValue();
    }

    public String G0() {
        return l("historyPhone");
    }

    public void G1() {
        o("appFirstTipsShow", Boolean.TRUE);
    }

    public boolean H(String str) {
        return c("fistfavorite" + str).booleanValue();
    }

    public boolean H0() {
        return d("userRequestFirstLocation", false).booleanValue();
    }

    public void H1(String str, String str2, String str3) {
        o("service_name", str);
        o("service_uri", str);
        o("service_id", str2);
        if (TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        o("rong_service", str3);
    }

    public String I() {
        return l("FROM_SIGN");
    }

    public double I0() {
        String m2 = m(InnerShareParams.LATITUDE, "0");
        return Math.round(Double.parseDouble(m2.equals("5e-324") ? "0" : m2) * 10000.0d) / 10000.0d;
    }

    public void I1(boolean z) {
        o("ticketFirstReal", Boolean.valueOf(z));
    }

    public boolean J() {
        long longValue = j("salePopDataSaveTime").longValue();
        if (longValue == 0) {
            return true;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(longValue);
        return calendar.get(5) != Calendar.getInstance().get(5);
    }

    public int J0() {
        return h("userLevel").intValue();
    }

    public void J1(boolean z) {
        o("ticketGuideBind", Boolean.valueOf(z));
    }

    public String K() {
        return l("homeShowJson");
    }

    public String K0() {
        return l("userLoginJson");
    }

    public void K1(boolean z) {
        o("ticketGuideCar", Boolean.valueOf(z));
    }

    public double L0() {
        String m2 = m("Longitude", "0");
        return Math.round(Double.parseDouble(m2.equals("5e-324") ? "0" : m2) * 10000.0d) / 10000.0d;
    }

    public void L1(boolean z) {
        o("ticketGuideGift", Boolean.valueOf(z));
    }

    public int M() {
        return h("isChoose").intValue();
    }

    public String M0() {
        return l("userMineJson");
    }

    public void M1(boolean z) {
        o("ticketGuideGiftSM", Boolean.valueOf(z));
    }

    public int N() {
        return h("isRealName").intValue();
    }

    public String N0() {
        return l("name");
    }

    public void N1(boolean z) {
        o("ticketGuideJoin", Boolean.valueOf(z));
    }

    public boolean O() {
        return c("isWebOpen").booleanValue();
    }

    public String O0() {
        return m("Province", "北京");
    }

    public void O1(boolean z) {
        o("ticketGuideLoc", Boolean.valueOf(z));
    }

    public String P() {
        return l("liveSeeTime");
    }

    public String P0() {
        return m("provinceCode", ZhiChiConstant.message_type_history_custom).trim();
    }

    public void P1(boolean z) {
        o("ticketGuideQr", Boolean.valueOf(z));
    }

    public boolean Q() {
        return d("locStatus", false).booleanValue();
    }

    public String Q0() {
        return l("pwd");
    }

    public void Q1(boolean z) {
        o("ticketGuideQrSm", Boolean.valueOf(z));
    }

    public boolean R() {
        return c("locationSuccess").booleanValue();
    }

    public String R0() {
        return l("dynamicQrCode");
    }

    public void R1(boolean z) {
        o("ticketGuideQrZQ", Boolean.valueOf(z));
    }

    public String S() {
        return m("loginTime", "");
    }

    public String S0() {
        return l("userREF");
    }

    public void S1(boolean z) {
        o("ticketGuideSTZQ", Boolean.valueOf(z));
    }

    public String T() {
        return m("logintype", "tel");
    }

    public String T0() {
        String l2 = l(h.x.e.e.o.f25898e);
        return (c("isHaveSelectCity").booleanValue() || TextUtils.isEmpty(l2)) ? m("selectcity", "北京") : l2;
    }

    public void T1(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        o("ticketListJson", str);
    }

    public String U() {
        return l("nft_phone");
    }

    public String U0() {
        String D0 = D0();
        return (c("isHaveSelectCity").booleanValue() || TextUtils.isEmpty(D0)) ? m("selectcitycode", ZhiChiConstant.message_type_history_custom) : D0;
    }

    public void U1(String str, String str2, boolean z) {
        o("isTouchTopNotify" + str + str2, Boolean.valueOf(z));
    }

    public String V() {
        return l("salePopDataImageUrl");
    }

    public int V0() {
        return h("sex").intValue();
    }

    public void V1(String str) {
        o("DEVICE_ID", str);
    }

    public String W() {
        return l("salePopDataLinkUrl");
    }

    public String W0() {
        return l("tel");
    }

    public void W1(String str, String str2) {
        o("userat", str);
        o("useref", str2);
    }

    public String X() {
        return l("history");
    }

    public int X0() {
        return h("UserTicketPJ").intValue();
    }

    public void X1(boolean z) {
        o("UserAgreementSer", Boolean.valueOf(z));
    }

    public String Y() {
        return l("searchKey");
    }

    public String Y0() {
        return l(Constants.FLAG_TOKEN);
    }

    public void Y1(String str) {
        o("avatar", str);
    }

    public String Z() {
        return "400-188-6980";
    }

    public int Z0() {
        return i("userType", -1).intValue();
    }

    public void Z1(boolean z) {
        o("opneDanmu", Boolean.valueOf(z));
    }

    public String a0() {
        return "https://s4.showstart.com/20170815033555123.png";
    }

    public String a1() {
        return l("userat");
    }

    public void a2(String str) {
        o("userid", str);
    }

    public void b() {
        f2(false);
        x2("");
        o(Constants.FLAG_TOKEN, "");
        o("userLoginJson", "");
        o(WbCloudFaceContant.SIGN, "");
        o("id", "");
        o("userREF", "");
        o("userType", 0);
        o("name", "");
        o("CUSIT", "");
        o("userid", "");
    }

    public Long b0() {
        return j("showCurrentLong");
    }

    public String b1() {
        return l("useref");
    }

    public void b2(String str) {
        o("CUSIT", str);
    }

    public String c0() {
        return l("showDate");
    }

    public String c1() {
        return l("webOpenId");
    }

    public void c2(String str, String str2) {
        b2(str);
        a2(str2);
    }

    public Boolean d(String str, boolean z) {
        return Boolean.valueOf(b.decodeBool(str, z));
    }

    public Long d0() {
        return j("showPayLong");
    }

    public String d1() {
        return l("webOpenType");
    }

    public void d2(String str, String str2, String str3, String str4, int i2, String str5, String str6, String str7, String str8, int i3, String str9, int i4, String str10, String str11, int i5) {
        o("id", str);
        o(WbCloudFaceContant.SIGN, str2);
        o("avatar", str3);
        o("name", str4);
        o("userType", Integer.valueOf(i2));
        o("pwd", str5);
        o("tel", str6);
        o("areaCode", str7);
        o("logintype", str8);
        o("isRealName", Integer.valueOf(i3));
        o("userREF", str9);
        o("tuType", Integer.valueOf(i4));
        o("loginTime", str10);
        o("expireTime", str11);
        o("isChoose", Integer.valueOf(i5));
    }

    public boolean e0() {
        return c("appFirstTipsShow").booleanValue();
    }

    public String e1(String str) {
        return l("welcomePath" + str);
    }

    public void e2(String str) {
        o("historyPhone", str);
    }

    public String f0() {
        return l("service_id");
    }

    public boolean f1() {
        String x = x.o().x();
        if (c0().equals(x)) {
            return c("isShowCityDiff").booleanValue();
        }
        D1(x);
        return false;
    }

    public void f2(boolean z) {
        o("isLogin", Boolean.valueOf(z));
    }

    public String g0() {
        return l("service_name");
    }

    public boolean g1(String str, String str2) {
        return c("isTouchTopNotify" + str + str2).booleanValue();
    }

    public void g2(int i2) {
        o("userLevel", Integer.valueOf(i2));
    }

    public Integer h(String str) {
        return Integer.valueOf(b.decodeInt(str, 0));
    }

    public String h0() {
        return l("service_uri");
    }

    public boolean h1() {
        return c("isLogin").booleanValue();
    }

    public void h2(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        o("userLoginJson", str);
    }

    public Integer i(String str, int i2) {
        return Integer.valueOf(b.decodeInt(str, i2));
    }

    public String i0() {
        return l("rong_service");
    }

    public void i1(String str, Object obj) {
        o(str, obj);
    }

    public void i2(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        o("userMineJson", str);
    }

    public Long j(String str) {
        return Long.valueOf(b.decodeLong(str, 0L));
    }

    public String j0() {
        return l(WbCloudFaceContant.SIGN);
    }

    public void j2(String str) {
        o("name", str);
    }

    public int k0() {
        return h("tencentImAppId").intValue();
    }

    public void k1(String str) {
        o("aesKey", str);
    }

    public void k2(int i2) {
        o("sex", Integer.valueOf(i2));
    }

    public String l(String str) {
        return b.decodeString(str, "");
    }

    public String l0() {
        return l("tencentImToken");
    }

    public void l1() {
        o("appFirstUse", m0.J(h.y.a.f.k.b()) + ChineseToPinyinResource.Field.COMMA + true);
    }

    public void l2(String str, String str2, int i2, String str3) {
        o("userThirdName", str);
        o("thirdUid", str2);
        o("thirdUserType", Integer.valueOf(i2));
        o("thirdUserUrl", str3);
    }

    public String m(String str, String str2) {
        return b.decodeString(str, str2);
    }

    public boolean m0() {
        return d("ticketFirstReal", false).booleanValue();
    }

    public void m1(String str) {
        o("cityAreaCode", str);
    }

    public void m2(int i2) {
        o("UserTicketPJ", Integer.valueOf(i2));
    }

    public boolean n0() {
        return d("ticketGuideBind", false).booleanValue();
    }

    public void n1(String str) {
        o("app_config", str);
    }

    public void n2(boolean z) {
        o("isWebOpen", Boolean.valueOf(z));
    }

    public boolean o0() {
        return d("ticketGuideCar", false).booleanValue();
    }

    public void o1() {
        o("appFirstFind", Boolean.TRUE);
    }

    public void o2(String str) {
        o("webOpenId", str);
    }

    public boolean p0() {
        return d("ticketGuideGift", false).booleanValue();
    }

    public void p1(String str) {
        o("fistfavorite" + str, Boolean.TRUE);
    }

    public void p2(String str) {
        o("webOpenType", str);
    }

    public boolean q0() {
        return d("ticketGuideGiftSM", false).booleanValue();
    }

    public void q1(String str) {
        o("FROM_SIGN", str);
    }

    public void q2(String str, String str2) {
        o("welcomePath" + str, str2);
    }

    public long r() {
        return j("welcoemADVEndTime").longValue();
    }

    public boolean r0() {
        return d("ticketGuideJoin", false).booleanValue();
    }

    public void r1(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        o("homeShowJson", str);
    }

    public void r2(String str, String str2, String str3, int i2, String str4, long j2) {
        o("welcoemADVTitle", str);
        o("welcoemADVID", str2);
        o("welcoemADVPath", str3);
        o("welcoemADVType", Integer.valueOf(i2));
        o("welcoemADVUrl", str4);
        o("welcoemADVUrl", str4);
        o("welcoemADVEndTime", Long.valueOf(j2));
    }

    public String s() {
        return l("welcoemADVID");
    }

    public boolean s0() {
        return d("ticketGuideLoc", false).booleanValue();
    }

    public void s1(String str) {
        o("citycode", str);
    }

    public void s2() {
        o("locationSuccess", Boolean.TRUE);
    }

    public String t() {
        return l("welcoemADVPath");
    }

    public boolean t0() {
        return d("ticketGuideQr", false).booleanValue();
    }

    public void t1(String str) {
        o("provinceCode", str);
    }

    public void t2(int i2) {
        o("isRealName", Integer.valueOf(i2));
    }

    public String u() {
        return l("welcoemADVTitle");
    }

    public boolean u0() {
        return d("ticketGuideQrSm", false).booleanValue();
    }

    public void u1() {
        o("locStatus", Boolean.TRUE);
    }

    public void u2(String str) {
        o("liveSeeTime", str);
    }

    public int v() {
        return h("welcoemADVType").intValue();
    }

    public boolean v0() {
        return d("ticketGuideQrZQ", false).booleanValue();
    }

    public void v1(String str) {
        o("nft_phone", str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006c, code lost:
        if (r5 > com.google.android.material.shadow.ShadowDrawableWrapper.COS_45) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006e, code lost:
        r5 = (r7 > com.google.android.material.shadow.ShadowDrawableWrapper.COS_45 ? 1 : (r7 == com.google.android.material.shadow.ShadowDrawableWrapper.COS_45 ? 0 : -1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0073, code lost:
        if (r5 > com.google.android.material.shadow.ShadowDrawableWrapper.COS_45) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:
        r10 = "0";
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void v2(com.baidu.location.BDLocation r16, kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> r17) {
        /*
            r15 = this;
            r0 = r17
            java.lang.String r1 = "city"
            java.lang.String r2 = "Longitude"
            java.lang.String r3 = "latitude"
            java.lang.String r4 = "0"
            if (r16 == 0) goto Lc3
            double r5 = r16.getLatitude()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r6 = "5e-324"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto Lc3
            double r7 = r16.getLongitude()
            java.lang.String r5 = java.lang.String.valueOf(r7)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L2c
            goto Lc3
        L2c:
            h.y.a.n.u0 r5 = L()
            double r5 = r5.I0()
            h.y.a.n.u0 r7 = L()
            double r7 = r7.L0()
            double r9 = r16.getLatitude()
            java.lang.String r9 = java.lang.String.valueOf(r9)
            double r10 = r16.getLongitude()
            java.lang.String r10 = java.lang.String.valueOf(r10)
            boolean r11 = android.text.TextUtils.isEmpty(r9)
            r12 = 0
            if (r11 != 0) goto L71
            boolean r11 = android.text.TextUtils.isEmpty(r10)
            if (r11 != 0) goto L71
            java.lang.String r11 = "4.9E-324"
            boolean r14 = r11.equals(r9)
            if (r14 != 0) goto L6a
            boolean r11 = r11.equals(r10)
            if (r11 != 0) goto L6a
            r4 = r9
            goto L77
        L6a:
            int r5 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r5 <= 0) goto L76
        L6e:
            int r5 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            goto L76
        L71:
            int r5 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r5 <= 0) goto L76
            goto L6e
        L76:
            r10 = r4
        L77:
            java.lang.String r5 = r16.getCity()
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            java.lang.String r7 = ""
            if (r6 != 0) goto L8f
            java.lang.String r6 = "市"
            boolean r8 = r5.contains(r6)
            if (r8 == 0) goto L8f
            java.lang.String r5 = r5.replace(r6, r7)
        L8f:
            java.lang.String r6 = r16.getProvince()
            boolean r8 = android.text.TextUtils.isEmpty(r6)
            if (r8 != 0) goto La5
            java.lang.String r8 = "省"
            boolean r9 = r6.contains(r8)
            if (r9 == 0) goto La5
            java.lang.String r6 = r6.replace(r8, r7)
        La5:
            o(r3, r4)
            o(r2, r10)
            boolean r2 = android.text.TextUtils.isEmpty(r5)
            if (r2 != 0) goto Lb4
            o(r1, r5)
        Lb4:
            boolean r1 = android.text.TextUtils.isEmpty(r6)
            if (r1 != 0) goto Lbf
            java.lang.String r1 = "Province"
            o(r1, r6)
        Lbf:
            h.y.a.n.d0.a(r16, r17)
            goto Ldc
        Lc3:
            o(r3, r4)
            o(r2, r4)
            java.lang.String r2 = "北京"
            o(r1, r2)
            java.lang.String r1 = "citycode"
            java.lang.String r2 = "10"
            o(r1, r2)
            if (r0 == 0) goto Ldc
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.invoke(r1)
        Ldc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h.y.a.n.u0.v2(com.baidu.location.BDLocation, kotlin.jvm.functions.Function1):void");
    }

    public String w() {
        return l("welcoemADVUrl");
    }

    public boolean w0() {
        return d("ticketGuideSTZQ", false).booleanValue();
    }

    public void w1(String str, String str2) {
        o("salePopDataImageUrl", str);
        o("salePopDataLinkUrl", str2);
        o("salePopDataSaveTime", Long.valueOf(Calendar.getInstance().getTimeInMillis()));
    }

    public void w2(int i2) {
        o("tencentImAppId", Integer.valueOf(i2));
    }

    public String x() {
        return l("aesKey");
    }

    public String x0() {
        return l("ticketListJson");
    }

    public void x1(String str) {
        o("publicKeyValue", str);
    }

    public void x2(String str) {
        o("tencentImToken", str);
    }

    public String y() {
        return l("appFirstUse");
    }

    public int y0() {
        return h("tuType").intValue();
    }

    public void y1(String str) {
        o("history", str);
    }

    public void y2() {
        o("userRequestFirstLocation", Boolean.TRUE);
    }

    public String z() {
        return l("areaCode");
    }

    public String z0() {
        return l("DEVICE_ID");
    }

    public void z1(String str) {
        o("searchKey", str);
    }

    public void z2(String str) {
        o("pwd", str);
    }
}
