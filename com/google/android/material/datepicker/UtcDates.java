package com.google.android.material.datepicker;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.icu.text.DateFormat;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class UtcDates {
    public static final String UTC = "UTC";
    public static AtomicReference<TimeSource> timeSourceRef;

    private UtcDates() {
    }

    public static long canonicalYearMonthDay(long j2) {
    }

    private static int findCharactersInDateFormatPattern(@NonNull String str, @NonNull String str2, int i2, int i3) {
    }

    @TargetApi(24)
    public static DateFormat getAbbrMonthDayFormat(Locale locale) {
    }

    @TargetApi(24)
    public static DateFormat getAbbrMonthWeekdayDayFormat(Locale locale) {
    }

    @TargetApi(24)
    private static DateFormat getAndroidFormat(String str, Locale locale) {
    }

    public static Calendar getDayCopy(Calendar calendar) {
    }

    private static java.text.DateFormat getFormat(int i2, Locale locale) {
    }

    public static java.text.DateFormat getFullFormat() {
    }

    public static java.text.DateFormat getMediumFormat() {
    }

    public static java.text.DateFormat getMediumNoYear() {
    }

    public static SimpleDateFormat getSimpleFormat(String str) {
    }

    public static SimpleDateFormat getTextInputFormat() {
    }

    public static String getTextInputHint(Resources resources, SimpleDateFormat simpleDateFormat) {
    }

    public static TimeSource getTimeSource() {
    }

    private static TimeZone getTimeZone() {
    }

    public static Calendar getTodayCalendar() {
    }

    @TargetApi(24)
    private static android.icu.util.TimeZone getUtcAndroidTimeZone() {
    }

    public static Calendar getUtcCalendar() {
    }

    public static Calendar getUtcCalendarOf(@Nullable Calendar calendar) {
    }

    @TargetApi(24)
    public static DateFormat getYearAbbrMonthDayFormat(Locale locale) {
    }

    @TargetApi(24)
    public static DateFormat getYearAbbrMonthWeekdayDayFormat(Locale locale) {
    }

    @NonNull
    private static String removeYearFromDateFormatPattern(@NonNull String str) {
    }

    public static void setTimeSource(@Nullable TimeSource timeSource) {
    }

    public static java.text.DateFormat getFullFormat(Locale locale) {
    }

    public static java.text.DateFormat getMediumFormat(Locale locale) {
    }

    public static java.text.DateFormat getMediumNoYear(Locale locale) {
    }

    private static SimpleDateFormat getSimpleFormat(String str, Locale locale) {
    }
}
