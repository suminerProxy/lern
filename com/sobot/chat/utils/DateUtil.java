package com.sobot.chat.utils;

import android.content.Context;
import android.view.View;
import com.sobot.chat.widget.timePicker.SobotTimePickerView;
import java.text.SimpleDateFormat;
import java.util.Date;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class DateUtil {
    public static final SimpleDateFormat DATE_FORMAT = null;
    public static final SimpleDateFormat DATE_FORMAT0 = null;
    public static final SimpleDateFormat DATE_FORMAT2 = null;
    public static final SimpleDateFormat DATE_FORMAT3 = null;
    public static final SimpleDateFormat DATE_FORMAT4 = null;
    public static final SimpleDateFormat DATE_FORMAT5 = null;
    public static final SimpleDateFormat DATE_FORMAT6 = null;
    public static String DATE_FORMAT_CHINESE;
    public static String DATE_TIME_FORMAT;
    public static String YEAR_DATE_FORMAT;

    /* renamed from: com.sobot.chat.utils.DateUtil$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class AnonymousClass1 implements SobotTimePickerView.OnTimeSelectListener {
        public final /* synthetic */ Context val$context;
        public final /* synthetic */ int val$displayType;
        public final /* synthetic */ View val$view;

        public AnonymousClass1(int i2, View view, Context context) {
        }

        @Override // com.sobot.chat.widget.timePicker.SobotTimePickerView.OnTimeSelectListener
        public void onTimeSelect(Date date, View view) {
        }
    }

    public static String bjToLocal(String str, String str2, Boolean bool) {
    }

    public static String dateToDateTime(Date date) {
    }

    public static String dateToString(Date date) {
    }

    public static String formatDateTime(String str, Boolean bool) {
    }

    public static String formatDateTime2(String str) {
    }

    public static String getCurrentDate() {
    }

    public static String getCurrentDateTime() {
    }

    public static String getCurrentTime() {
    }

    public static int getDayOfDate(Date date) {
    }

    public static int getMonthOfDate(Date date) {
    }

    public static String getStandardDate(String str, Boolean bool) {
    }

    public static int getWeekOfDate(Date date) {
    }

    public static int getYearOfDate(Date date) {
    }

    public static String longToDateStr(Long l2, String str) {
    }

    public static void main(String[] strArr) {
    }

    public static void openTimePickerView(Context context, View view, View view2, Date date, int i2) {
    }

    public static Date parse(String str, SimpleDateFormat simpleDateFormat) {
    }

    public static Date stringToDate(String str) {
    }

    public static String stringToFormatString(String str, String str2, Boolean bool) {
    }

    public static long stringToLong(String str) {
    }

    public static long stringToLongMs(String str) {
    }

    public static String timeStamp2Date(String str, String str2, Boolean bool) {
    }

    public static String toDate(long j2, SimpleDateFormat simpleDateFormat) {
    }

    public static String formatDateTime(String str, boolean z, String str2, Boolean bool) {
    }

    public static String dateToString(Date date, String str) {
    }

    public static String getCurrentDateTime(String str) {
    }

    public static Date stringToDate(String str, String str2) {
    }

    public static String bjToLocal(long j2, String str, Boolean bool) {
    }
}
