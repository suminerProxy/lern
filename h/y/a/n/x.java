package h.y.a.n;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/* compiled from: DateHelper.java */
@SuppressLint({"SimpleDateFormat"})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class x {

    /* renamed from: a  reason: collision with root package name */
    private static x f26380a = null;
    public static SimpleDateFormat b = new SimpleDateFormat("yyyy.MM.dd HH:mm");
    public static SimpleDateFormat c = new SimpleDateFormat("MM.dd HH:mm");

    /* renamed from: d  reason: collision with root package name */
    public static SimpleDateFormat f26381d = new SimpleDateFormat("MM月dd日");

    /* renamed from: e  reason: collision with root package name */
    public static SimpleDateFormat f26382e = new SimpleDateFormat("HH");

    /* renamed from: f  reason: collision with root package name */
    public static SimpleDateFormat f26383f = new SimpleDateFormat("HH");

    /* renamed from: g  reason: collision with root package name */
    public static SimpleDateFormat f26384g = new SimpleDateFormat(d1.b);

    /* renamed from: h  reason: collision with root package name */
    public static SimpleDateFormat f26385h = new SimpleDateFormat("yyyy.MM.dd");

    /* renamed from: i  reason: collision with root package name */
    public static SimpleDateFormat f26386i = new SimpleDateFormat("MM.dd");

    /* renamed from: j  reason: collision with root package name */
    public static SimpleDateFormat f26387j = new SimpleDateFormat("yyyy-MM-dd");

    /* renamed from: k  reason: collision with root package name */
    public static SimpleDateFormat f26388k = new SimpleDateFormat(d1.c);

    /* renamed from: l  reason: collision with root package name */
    public static SimpleDateFormat f26389l = new SimpleDateFormat("yyyy年MM月dd日 HH:mm");

    /* renamed from: m  reason: collision with root package name */
    public static SimpleDateFormat f26390m = new SimpleDateFormat(d1.f26280d);

    /* renamed from: n  reason: collision with root package name */
    public static SimpleDateFormat f26391n = new SimpleDateFormat("yyyy/MM/dd");

    /* renamed from: o  reason: collision with root package name */
    public static SimpleDateFormat f26392o = new SimpleDateFormat("yyyy");

    /* renamed from: p  reason: collision with root package name */
    public static SimpleDateFormat f26393p = new SimpleDateFormat("MM");
    public static SimpleDateFormat q = new SimpleDateFormat("dd");
    public static final String r = "yyyy-MM-dd";

    private x() {
    }

    public static long a(long j2, int i2) {
        return j2 + (i2 * 86400000);
    }

    public static long m(long j2, long j3) {
        return (j3 - j2) / 86400000;
    }

    public static synchronized x o() {
        x xVar;
        synchronized (x.class) {
            if (f26380a == null) {
                f26380a = new x();
            }
            xVar = f26380a;
        }
        return xVar;
    }

    public String A(SimpleDateFormat simpleDateFormat, SimpleDateFormat simpleDateFormat2, String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            return simpleDateFormat2.format(simpleDateFormat.parse(str));
        } catch (ParseException e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public long b(String str, String str2) {
        try {
            return new SimpleDateFormat(str2).parse(str).getTime();
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0L;
        }
    }

    public String c(Long l2) {
        Integer num = 1000;
        Integer valueOf = Integer.valueOf(num.intValue() * 60);
        Integer valueOf2 = Integer.valueOf(valueOf.intValue() * 60);
        Integer valueOf3 = Integer.valueOf(valueOf2.intValue() * 24);
        Long valueOf4 = Long.valueOf(l2.longValue() / valueOf3.intValue());
        Long valueOf5 = Long.valueOf((l2.longValue() - (valueOf4.longValue() * valueOf3.intValue())) / valueOf2.intValue());
        Long valueOf6 = Long.valueOf(((l2.longValue() - (valueOf4.longValue() * valueOf3.intValue())) - (valueOf5.longValue() * valueOf2.intValue())) / valueOf.intValue());
        Long valueOf7 = Long.valueOf((((l2.longValue() - (valueOf4.longValue() * valueOf3.intValue())) - (valueOf5.longValue() * valueOf2.intValue())) - (valueOf6.longValue() * valueOf.intValue())) / num.intValue());
        l2.longValue();
        valueOf4.longValue();
        valueOf3.intValue();
        valueOf5.longValue();
        valueOf2.intValue();
        valueOf6.longValue();
        valueOf.intValue();
        valueOf7.longValue();
        num.intValue();
        StringBuffer stringBuffer = new StringBuffer();
        if (valueOf4.longValue() < 0) {
            valueOf4 = 0L;
        }
        Long valueOf8 = Long.valueOf((valueOf4.longValue() * 24) + valueOf5.longValue());
        if (valueOf8.longValue() > 0) {
            stringBuffer.append(valueOf8 + "小时");
        }
        if (valueOf6.longValue() > 0) {
            stringBuffer.append(valueOf6 + "分");
        }
        stringBuffer.append(valueOf7 + "秒");
        return stringBuffer.toString();
    }

    public String d(long j2) {
        int i2;
        int i3;
        int i4 = 0;
        if (j2 >= 0) {
            i4 = Integer.parseInt(o().k(new SimpleDateFormat("yyyy"), j2));
            i3 = Integer.parseInt(o().k(new SimpleDateFormat("MM"), j2));
            i2 = Integer.parseInt(o().k(new SimpleDateFormat("dd"), j2));
        } else {
            i2 = 0;
            i3 = 0;
        }
        return i4 + "年" + i3 + "月" + i2 + "日";
    }

    public String e() {
        Calendar calendar = Calendar.getInstance();
        return calendar.get(5) + "";
    }

    public String f() {
        Calendar calendar = Calendar.getInstance();
        return (calendar.get(2) + 1) + "";
    }

    public String g() {
        Calendar calendar = Calendar.getInstance();
        return calendar.get(1) + "";
    }

    public String h(SimpleDateFormat simpleDateFormat, Date date) {
        if (date == null) {
            date = new Date();
        }
        return simpleDateFormat.format(date);
    }

    public Date i(SimpleDateFormat simpleDateFormat, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return simpleDateFormat.parse(str);
        } catch (ParseException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public int j(long j2) {
        return ((int) (Calendar.getInstance().getTimeInMillis() - j2)) / 86400000;
    }

    public String k(SimpleDateFormat simpleDateFormat, long j2) {
        if (simpleDateFormat == null) {
            simpleDateFormat = f26388k;
        }
        return simpleDateFormat.format(Long.valueOf(j2));
    }

    public String l(SimpleDateFormat simpleDateFormat, String str) {
        if (simpleDateFormat == null) {
            simpleDateFormat = new SimpleDateFormat("yyyy-MM");
        }
        try {
            return simpleDateFormat.format(b.parse(str));
        } catch (ParseException e2) {
            e2.printStackTrace();
            return str;
        }
    }

    public String n(Calendar calendar, int i2, int i3) {
        calendar.add(i2, i3);
        return b.format(calendar.getTime());
    }

    public int p(int i2, int i3) {
        if (i3 == 0) {
            return 0;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.set(1, i2);
        calendar.set(2, i3 - 1);
        calendar.set(5, 1);
        calendar.roll(5, -1);
        return calendar.get(5);
    }

    public String q() {
        try {
            Date date = new Date();
            String[] strArr = {"周日", "周一", "周二", "周三", "周四", "周五", "周六"};
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            int i2 = calendar.get(7) - 1;
            if (i2 < 0) {
                i2 = 0;
            }
            return strArr[i2];
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public String r(SimpleDateFormat simpleDateFormat, SimpleDateFormat simpleDateFormat2, String str) {
        Date i2 = i(simpleDateFormat, str);
        if (i2 == null) {
            return str;
        }
        Calendar calendar = Calendar.getInstance();
        if (simpleDateFormat2.format(calendar.getTime()).equals(simpleDateFormat2.format(i2))) {
            int timeInMillis = (int) ((calendar.getTimeInMillis() - i2.getTime()) / 3600000);
            if (timeInMillis == 0) {
                return Math.max((calendar.getTimeInMillis() - i2.getTime()) / 60000, 1L) + "分钟前";
            }
            return timeInMillis + "小时以前";
        }
        int timeInMillis2 = (int) ((calendar.getTimeInMillis() / 86400000) - (i2.getTime() / 86400000));
        if (timeInMillis2 != 0) {
            if (timeInMillis2 < 7) {
                return timeInMillis2 + "天以前";
            }
            return simpleDateFormat2.format(i2);
        }
        int timeInMillis3 = (int) ((calendar.getTimeInMillis() - i2.getTime()) / 3600000);
        if (timeInMillis3 == 0) {
            long max = Math.max((calendar.getTimeInMillis() - i2.getTime()) / 60000, 1L);
            if (max < 2) {
                return "刚刚";
            }
            return max + "分钟以前";
        }
        return timeInMillis3 + "小时以前";
    }

    public String s(SimpleDateFormat simpleDateFormat, SimpleDateFormat simpleDateFormat2, String str) {
        Date i2 = i(simpleDateFormat, str);
        if (i2 == null) {
            return str;
        }
        Calendar calendar = Calendar.getInstance();
        String h2 = h(f26384g, i2);
        int timeInMillis = (int) ((calendar.getTimeInMillis() / 86400000) - (i2.getTime() / 86400000));
        if (timeInMillis == 0) {
            return "今天 " + h2;
        } else if (timeInMillis == 1) {
            return "昨天 " + h2;
        } else {
            return simpleDateFormat.format(i2);
        }
    }

    public String t(long j2) {
        try {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(j2);
            return v(calendar);
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public String u(String str) {
        try {
            return w(f26388k.parse(str));
        } catch (ParseException e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public String v(Calendar calendar) {
        try {
            String[] strArr = {"周日", "周一", "周二", "周三", "周四", "周五", "周六"};
            int i2 = calendar.get(7) - 1;
            if (i2 < 0) {
                i2 = 0;
            }
            return strArr[i2];
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public String w(Date date) {
        try {
            Calendar calendar = Calendar.getInstance();
            if (date != null) {
                calendar.setTime(date);
            }
            return v(calendar);
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public String x() {
        return g() + "年" + f() + "月" + e() + "日";
    }

    public boolean y(String str) {
        String u = u(str);
        String q2 = q();
        try {
            Date parse = f26388k.parse(str);
            Calendar calendar = Calendar.getInstance();
            int i2 = calendar.get(3);
            if ("周日".equals(q2)) {
                i2--;
            }
            calendar.setTime(parse);
            int i3 = calendar.get(3);
            if ("周日".equals(u)) {
                i3--;
            }
            return i3 == i2;
        } catch (ParseException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public String z(String str, String str2, String str3) {
        return A(new SimpleDateFormat(str), new SimpleDateFormat(str2), str3);
    }
}
