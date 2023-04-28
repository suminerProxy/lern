package com.sobot.chat.widget.timePicker.view;

import android.view.View;
import com.sobot.chat.widget.timePicker.lib.SobotWheelView;
import com.sobot.chat.widget.timePicker.listener.SobotOnItemSelectedListener;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class SobotWheelTime {
    private static final int DEFAULT_END_DAY = 31;
    private static final int DEFAULT_END_MONTH = 12;
    private static final int DEFAULT_END_YEAR = 2100;
    private static final int DEFAULT_START_DAY = 1;
    private static final int DEFAULT_START_MONTH = 1;
    private static final int DEFAULT_START_YEAR = 1900;
    public static DateFormat dateFormat;
    private int currentYear;
    public int dividerColor;
    private SobotWheelView.DividerType dividerType;
    private int endDay;
    private int endMonth;
    private int endYear;
    private int gravity;
    public float lineSpacingMultiplier;
    private int startDay;
    private int startMonth;
    private int startYear;
    public int textColorCenter;
    public int textColorOut;
    private int textSize;
    private boolean[] type;
    private View view;
    private SobotWheelView wv_day;
    private SobotWheelView wv_hours;
    private SobotWheelView wv_mins;
    private SobotWheelView wv_month;
    private SobotWheelView wv_seconds;
    private SobotWheelView wv_year;

    /* renamed from: com.sobot.chat.widget.timePicker.view.SobotWheelTime$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass1 implements SobotOnItemSelectedListener {
        public final /* synthetic */ SobotWheelTime this$0;
        public final /* synthetic */ List val$list_big;
        public final /* synthetic */ List val$list_little;

        public AnonymousClass1(SobotWheelTime sobotWheelTime, List list, List list2) {
        }

        @Override // com.sobot.chat.widget.timePicker.listener.SobotOnItemSelectedListener
        public void onItemSelected(int i2) {
        }
    }

    /* renamed from: com.sobot.chat.widget.timePicker.view.SobotWheelTime$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass2 implements SobotOnItemSelectedListener {
        public final /* synthetic */ SobotWheelTime this$0;
        public final /* synthetic */ List val$list_big;
        public final /* synthetic */ List val$list_little;

        public AnonymousClass2(SobotWheelTime sobotWheelTime, List list, List list2) {
        }

        @Override // com.sobot.chat.widget.timePicker.listener.SobotOnItemSelectedListener
        public void onItemSelected(int i2) {
        }
    }

    public SobotWheelTime(View view) {
    }

    public static /* synthetic */ int access$000(SobotWheelTime sobotWheelTime) {
    }

    public static /* synthetic */ int access$100(SobotWheelTime sobotWheelTime) {
    }

    public static /* synthetic */ int access$102(SobotWheelTime sobotWheelTime, int i2) {
    }

    public static /* synthetic */ SobotWheelView access$200(SobotWheelTime sobotWheelTime) {
    }

    public static /* synthetic */ int access$300(SobotWheelTime sobotWheelTime) {
    }

    public static /* synthetic */ int access$400(SobotWheelTime sobotWheelTime) {
    }

    public static /* synthetic */ int access$500(SobotWheelTime sobotWheelTime) {
    }

    public static /* synthetic */ int access$600(SobotWheelTime sobotWheelTime) {
    }

    public static /* synthetic */ int access$700(SobotWheelTime sobotWheelTime) {
    }

    public static /* synthetic */ void access$800(SobotWheelTime sobotWheelTime, int i2, int i3, int i4, int i5, List list, List list2) {
    }

    private void setContentTextSize() {
    }

    private void setDividerColor() {
    }

    private void setDividerType() {
    }

    private void setLineSpacingMultiplier() {
    }

    private void setReDay(int i2, int i3, int i4, int i5, List<String> list, List<String> list2) {
    }

    private void setTextColorCenter() {
    }

    private void setTextColorOut() {
    }

    public int getEndYear() {
    }

    public int getStartYear() {
    }

    public String getTime() {
    }

    public View getView() {
    }

    public void isCenterLabel(Boolean bool) {
    }

    public void setCyclic(boolean z) {
    }

    public void setEndYear(int i2) {
    }

    public void setLabels(String str, String str2, String str3, String str4, String str5, String str6) {
    }

    public void setPicker(int i2, int i3, int i4) {
    }

    public void setRangDate(Calendar calendar, Calendar calendar2) {
    }

    public void setStartYear(int i2) {
    }

    public void setView(View view) {
    }

    public void setPicker(int i2, int i3, int i4, int i5, int i6, int i7) {
    }

    public void setDividerColor(int i2) {
    }

    public void setDividerType(SobotWheelView.DividerType dividerType) {
    }

    public void setLineSpacingMultiplier(float f2) {
    }

    public void setTextColorCenter(int i2) {
    }

    public void setTextColorOut(int i2) {
    }

    public SobotWheelTime(View view, boolean[] zArr, int i2, int i3) {
    }
}
