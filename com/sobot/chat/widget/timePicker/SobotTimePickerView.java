package com.sobot.chat.widget.timePicker;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.sobot.chat.widget.timePicker.lib.SobotWheelView;
import com.sobot.chat.widget.timePicker.listener.SobotCustomListener;
import com.sobot.chat.widget.timePicker.view.SobotBasePickerView;
import com.sobot.chat.widget.timePicker.view.SobotWheelTime;
import java.util.Calendar;
import java.util.Date;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class SobotTimePickerView extends SobotBasePickerView implements View.OnClickListener {
    private static final String TAG_CANCEL = "cancel";
    private static final String TAG_SUBMIT = "submit";
    private int Color_Background_Title;
    private int Color_Background_Wheel;
    private int Color_Cancel;
    private int Color_Submit;
    private int Color_Title;
    private int Size_Content;
    private int Size_Submit_Cancel;
    private int Size_Title;
    private String Str_Cancel;
    private String Str_Submit;
    private String Str_Title;
    private int backgroundId;
    private ImageView btnCancel;
    private Button btnSubmit;
    private boolean cancelable;
    private SobotCustomListener customListener;
    private boolean cyclic;
    private Calendar date;
    private int dividerColor;
    private SobotWheelView.DividerType dividerType;
    private Calendar endDate;
    private int endYear;
    private int gravity;
    private boolean isCenterLabel;
    private boolean isDialog;
    private String label_day;
    private String label_hours;
    private String label_mins;
    private String label_month;
    private String label_seconds;
    private String label_year;
    private String layoutRes;
    private float lineSpacingMultiplier;
    private Calendar startDate;
    private int startYear;
    private int textColorCenter;
    private int textColorOut;
    private OnTimeSelectListener timeSelectListener;
    private TextView tvTitle;
    private boolean[] type;
    public SobotWheelTime wheelTime;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class Builder {
        private int Color_Background_Title;
        private int Color_Background_Wheel;
        private int Color_Cancel;
        private int Color_Submit;
        private int Color_Title;
        private int Size_Content;
        private int Size_Submit_Cancel;
        private int Size_Title;
        private String Str_Cancel;
        private String Str_Submit;
        private String Str_Title;
        private int backgroundId;
        private boolean cancelable;
        private Context context;
        private SobotCustomListener customListener;
        private boolean cyclic;
        private Calendar date;
        public ViewGroup decorView;
        private int dividerColor;
        private SobotWheelView.DividerType dividerType;
        private Calendar endDate;
        private int endYear;
        private int gravity;
        private boolean isCenterLabel;
        private boolean isDialog;
        private String label_day;
        private String label_hours;
        private String label_mins;
        private String label_month;
        private String label_seconds;
        private String label_year;
        private String layoutRes;
        private float lineSpacingMultiplier;
        private Calendar startDate;
        private int startYear;
        private int textColorCenter;
        private int textColorOut;
        private OnTimeSelectListener timeSelectListener;
        private boolean[] type;

        public Builder(Context context, OnTimeSelectListener onTimeSelectListener) {
        }

        public static /* synthetic */ Context access$000(Builder builder) {
        }

        public static /* synthetic */ OnTimeSelectListener access$100(Builder builder) {
        }

        public static /* synthetic */ int access$1000(Builder builder) {
        }

        public static /* synthetic */ int access$1100(Builder builder) {
        }

        public static /* synthetic */ int access$1200(Builder builder) {
        }

        public static /* synthetic */ int access$1300(Builder builder) {
        }

        public static /* synthetic */ int access$1400(Builder builder) {
        }

        public static /* synthetic */ int access$1500(Builder builder) {
        }

        public static /* synthetic */ int access$1600(Builder builder) {
        }

        public static /* synthetic */ Calendar access$1700(Builder builder) {
        }

        public static /* synthetic */ Calendar access$1800(Builder builder) {
        }

        public static /* synthetic */ Calendar access$1900(Builder builder) {
        }

        public static /* synthetic */ int access$200(Builder builder) {
        }

        public static /* synthetic */ boolean access$2000(Builder builder) {
        }

        public static /* synthetic */ boolean access$2100(Builder builder) {
        }

        public static /* synthetic */ boolean access$2200(Builder builder) {
        }

        public static /* synthetic */ String access$2300(Builder builder) {
        }

        public static /* synthetic */ String access$2400(Builder builder) {
        }

        public static /* synthetic */ String access$2500(Builder builder) {
        }

        public static /* synthetic */ String access$2600(Builder builder) {
        }

        public static /* synthetic */ String access$2700(Builder builder) {
        }

        public static /* synthetic */ String access$2800(Builder builder) {
        }

        public static /* synthetic */ int access$2900(Builder builder) {
        }

        public static /* synthetic */ boolean[] access$300(Builder builder) {
        }

        public static /* synthetic */ int access$3000(Builder builder) {
        }

        public static /* synthetic */ int access$3100(Builder builder) {
        }

        public static /* synthetic */ SobotCustomListener access$3200(Builder builder) {
        }

        public static /* synthetic */ String access$3300(Builder builder) {
        }

        public static /* synthetic */ float access$3400(Builder builder) {
        }

        public static /* synthetic */ boolean access$3500(Builder builder) {
        }

        public static /* synthetic */ SobotWheelView.DividerType access$3600(Builder builder) {
        }

        public static /* synthetic */ int access$3700(Builder builder) {
        }

        public static /* synthetic */ String access$400(Builder builder) {
        }

        public static /* synthetic */ String access$500(Builder builder) {
        }

        public static /* synthetic */ String access$600(Builder builder) {
        }

        public static /* synthetic */ int access$700(Builder builder) {
        }

        public static /* synthetic */ int access$800(Builder builder) {
        }

        public static /* synthetic */ int access$900(Builder builder) {
        }

        public SobotTimePickerView build() {
        }

        public Builder gravity(int i2) {
        }

        public Builder isCenterLabel(boolean z) {
        }

        public Builder isCyclic(boolean z) {
        }

        public Builder isDialog(boolean z) {
        }

        public Builder setBackgroundId(int i2) {
        }

        public Builder setBgColor(int i2) {
        }

        public Builder setCancelColor(int i2) {
        }

        public Builder setCancelText(String str) {
        }

        public Builder setContentSize(int i2) {
        }

        public Builder setDate(Calendar calendar) {
        }

        public Builder setDecorView(ViewGroup viewGroup) {
        }

        public Builder setDividerColor(int i2) {
        }

        public Builder setDividerType(SobotWheelView.DividerType dividerType) {
        }

        public Builder setLabel(String str, String str2, String str3, String str4, String str5, String str6) {
        }

        public Builder setLayoutRes(String str, SobotCustomListener sobotCustomListener) {
        }

        public Builder setLineSpacingMultiplier(float f2) {
        }

        public Builder setOutSideCancelable(boolean z) {
        }

        public Builder setRangDate(Calendar calendar, Calendar calendar2) {
        }

        public Builder setRange(int i2, int i3) {
        }

        public Builder setSubCalSize(int i2) {
        }

        public Builder setSubmitColor(int i2) {
        }

        public Builder setSubmitText(String str) {
        }

        public Builder setTextColorCenter(int i2) {
        }

        public Builder setTextColorOut(int i2) {
        }

        public Builder setTitleBgColor(int i2) {
        }

        public Builder setTitleColor(int i2) {
        }

        public Builder setTitleSize(int i2) {
        }

        public Builder setTitleText(String str) {
        }

        public Builder setType(boolean[] zArr) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface OnTimeSelectListener {
        void onTimeSelect(Date date, View view);
    }

    public SobotTimePickerView(Builder builder) {
    }

    private void initView(Context context) {
    }

    private void setRangDate() {
    }

    private void setRange() {
    }

    private void setTime() {
    }

    @Override // com.sobot.chat.widget.timePicker.view.SobotBasePickerView
    public boolean isDialog() {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    public void returnData() {
    }

    public void setDate(Calendar calendar) {
    }
}
