package com.google.android.material.datepicker;

import androidx.annotation.Nullable;
import java.util.Calendar;
import java.util.TimeZone;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class TimeSource {
    private static final TimeSource SYSTEM_TIME_SOURCE = null;
    @Nullable
    private final Long fixedTimeMs;
    @Nullable
    private final TimeZone fixedTimeZone;

    private TimeSource(@Nullable Long l2, @Nullable TimeZone timeZone) {
    }

    public static TimeSource fixed(long j2, @Nullable TimeZone timeZone) {
    }

    public static TimeSource system() {
    }

    public Calendar now() {
    }

    public static TimeSource fixed(long j2) {
    }

    public Calendar now(@Nullable TimeZone timeZone) {
    }
}
