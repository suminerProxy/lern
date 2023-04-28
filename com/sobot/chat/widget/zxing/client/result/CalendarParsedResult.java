package com.sobot.chat.widget.zxing.client.result;

import java.text.ParseException;
import java.util.Date;
import java.util.regex.Pattern;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class CalendarParsedResult extends ParsedResult {
    private static final Pattern DATE_TIME = null;
    private static final Pattern RFC2445_DURATION = null;
    private static final long[] RFC2445_DURATION_FIELD_UNITS = null;
    private final String[] attendees;
    private final String description;
    private final long end;
    private final boolean endAllDay;
    private final double latitude;
    private final String location;
    private final double longitude;
    private final String organizer;
    private final long start;
    private final boolean startAllDay;
    private final String summary;

    public CalendarParsedResult(String str, String str2, String str3, String str4, String str5, String str6, String[] strArr, String str7, double d2, double d3) {
    }

    private static String format(boolean z, long j2) {
    }

    private static long parseDate(String str) throws ParseException {
    }

    private static long parseDateTimeString(String str) throws ParseException {
    }

    private static long parseDurationMS(CharSequence charSequence) {
    }

    public String[] getAttendees() {
    }

    public String getDescription() {
    }

    @Override // com.sobot.chat.widget.zxing.client.result.ParsedResult
    public String getDisplayResult() {
    }

    @Deprecated
    public Date getEnd() {
    }

    public long getEndTimestamp() {
    }

    public double getLatitude() {
    }

    public String getLocation() {
    }

    public double getLongitude() {
    }

    public String getOrganizer() {
    }

    @Deprecated
    public Date getStart() {
    }

    public long getStartTimestamp() {
    }

    public String getSummary() {
    }

    public boolean isEndAllDay() {
    }

    public boolean isStartAllDay() {
    }
}
