package com.sobot.chat.widget.dialog;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import com.sobot.chat.activity.base.SobotDialogBaseActivity;
import com.sobot.chat.api.ResultCallBack;
import com.sobot.chat.api.model.CommonModel;
import com.sobot.chat.api.model.Information;
import com.sobot.chat.api.model.SatisfactionSet;
import com.sobot.chat.api.model.SatisfactionSetBase;
import com.sobot.chat.api.model.SobotCommentParam;
import com.sobot.chat.api.model.ZhiChiInitModeBase;
import com.sobot.chat.widget.SobotAntoLineLayout;
import com.sobot.chat.widget.SobotEditTextLayout;
import com.sobot.chat.widget.SobotTenRatingLayout;
import com.sobot.network.http.callback.StringResultCallBack;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class SobotEvaluateActivity extends SobotDialogBaseActivity {
    private final String CANCEL_TAG;
    private List<CheckBox> checkBoxList;
    private int commentType;
    private Activity context;
    private LinearLayout coustom_pop_layout;
    private int current_model;
    private String customName;
    private String evaluateChecklables;
    private Information information;
    private ZhiChiInitModeBase initModel;
    private boolean isBackShowEvaluate;
    private boolean isExitSession;
    private boolean isFinish;
    private boolean isSessionOver;
    private int isSolve;
    private int ratingType;
    private List<SatisfactionSetBase> satisFactionList;
    private SatisfactionSetBase satisfactionSetBase;
    private int score;
    private SobotEditTextLayout setl_submit_content;
    private EditText sobot_add_content;
    private RadioButton sobot_btn_no_robot;
    private RadioButton sobot_btn_ok_robot;
    private Button sobot_close_now;
    private TextView sobot_custom_center_title;
    private LinearLayout sobot_custom_relative;
    private TextView sobot_evaluate_cancel;
    private SobotAntoLineLayout sobot_evaluate_lable_autoline;
    private LinearLayout sobot_hide_layout;
    private LinearLayout sobot_negativeButton;
    private RatingBar sobot_ratingBar;
    private View sobot_ratingBar_split_view;
    private TextView sobot_ratingBar_title;
    private RadioGroup sobot_readiogroup;
    private TextView sobot_robot_center_title;
    private LinearLayout sobot_robot_relative;
    private SobotTenRatingLayout sobot_ten_rating_ll;
    private LinearLayout sobot_ten_root_ll;
    private TextView sobot_ten_very_dissatisfied;
    private TextView sobot_ten_very_satisfaction;
    private TextView sobot_text_other_problem;
    private TextView sobot_tv_evaluate_title;
    private TextView sobot_tv_evaluate_title_hint;

    /* renamed from: com.sobot.chat.widget.dialog.SobotEvaluateActivity$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass1 implements View.OnClickListener {
        public final /* synthetic */ SobotEvaluateActivity this$0;

        public AnonymousClass1(SobotEvaluateActivity sobotEvaluateActivity) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.sobot.chat.widget.dialog.SobotEvaluateActivity$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass2 implements ResultCallBack<SatisfactionSet> {
        public final /* synthetic */ SobotEvaluateActivity this$0;

        public AnonymousClass2(SobotEvaluateActivity sobotEvaluateActivity) {
        }

        @Override // com.sobot.chat.api.ResultCallBack
        public void onFailure(Exception exc, String str) {
        }

        @Override // com.sobot.chat.api.ResultCallBack
        public void onLoading(long j2, long j3, boolean z) {
        }

        @Override // com.sobot.chat.api.ResultCallBack
        public /* bridge */ /* synthetic */ void onSuccess(SatisfactionSet satisfactionSet) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(SatisfactionSet satisfactionSet) {
        }
    }

    /* renamed from: com.sobot.chat.widget.dialog.SobotEvaluateActivity$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass3 implements RatingBar.OnRatingBarChangeListener {
        public final /* synthetic */ SobotEvaluateActivity this$0;

        public AnonymousClass3(SobotEvaluateActivity sobotEvaluateActivity) {
        }

        @Override // android.widget.RatingBar.OnRatingBarChangeListener
        public void onRatingChanged(RatingBar ratingBar, float f2, boolean z) {
        }
    }

    /* renamed from: com.sobot.chat.widget.dialog.SobotEvaluateActivity$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass4 implements RadioGroup.OnCheckedChangeListener {
        public final /* synthetic */ SobotEvaluateActivity this$0;

        public AnonymousClass4(SobotEvaluateActivity sobotEvaluateActivity) {
        }

        @Override // android.widget.RadioGroup.OnCheckedChangeListener
        public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i2) {
        }
    }

    /* renamed from: com.sobot.chat.widget.dialog.SobotEvaluateActivity$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass5 implements View.OnClickListener {
        public final /* synthetic */ SobotEvaluateActivity this$0;

        public AnonymousClass5(SobotEvaluateActivity sobotEvaluateActivity) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.sobot.chat.widget.dialog.SobotEvaluateActivity$6  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass6 implements View.OnClickListener {
        public final /* synthetic */ SobotEvaluateActivity this$0;

        public AnonymousClass6(SobotEvaluateActivity sobotEvaluateActivity) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.sobot.chat.widget.dialog.SobotEvaluateActivity$7  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass7 implements SobotTenRatingLayout.OnClickItemListener {
        public final /* synthetic */ SobotEvaluateActivity this$0;

        public AnonymousClass7(SobotEvaluateActivity sobotEvaluateActivity) {
        }

        @Override // com.sobot.chat.widget.SobotTenRatingLayout.OnClickItemListener
        public void onClickItem(int i2) {
        }
    }

    /* renamed from: com.sobot.chat.widget.dialog.SobotEvaluateActivity$8  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass8 implements StringResultCallBack<CommonModel> {
        public final /* synthetic */ SobotEvaluateActivity this$0;
        public final /* synthetic */ SobotCommentParam val$commentParam;

        public AnonymousClass8(SobotEvaluateActivity sobotEvaluateActivity, SobotCommentParam sobotCommentParam) {
        }

        @Override // com.sobot.network.http.callback.StringResultCallBack
        public void onFailure(Exception exc, String str) {
        }

        @Override // com.sobot.network.http.callback.StringResultCallBack
        public /* bridge */ /* synthetic */ void onSuccess(CommonModel commonModel) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(CommonModel commonModel) {
        }
    }

    public static /* synthetic */ List access$000(SobotEvaluateActivity sobotEvaluateActivity) {
    }

    public static /* synthetic */ List access$002(SobotEvaluateActivity sobotEvaluateActivity, List list) {
    }

    public static /* synthetic */ int access$100(SobotEvaluateActivity sobotEvaluateActivity) {
    }

    public static /* synthetic */ void access$1000(SobotEvaluateActivity sobotEvaluateActivity, int i2, List list) {
    }

    public static /* synthetic */ Button access$1100(SobotEvaluateActivity sobotEvaluateActivity) {
    }

    public static /* synthetic */ TextView access$1200(SobotEvaluateActivity sobotEvaluateActivity) {
    }

    public static /* synthetic */ SatisfactionSetBase access$1300(SobotEvaluateActivity sobotEvaluateActivity) {
    }

    public static /* synthetic */ LinearLayout access$1400(SobotEvaluateActivity sobotEvaluateActivity) {
    }

    public static /* synthetic */ View access$1500(SobotEvaluateActivity sobotEvaluateActivity) {
    }

    public static /* synthetic */ int access$1600(SobotEvaluateActivity sobotEvaluateActivity) {
    }

    public static /* synthetic */ ZhiChiInitModeBase access$1700(SobotEvaluateActivity sobotEvaluateActivity) {
    }

    public static /* synthetic */ LinearLayout access$1800(SobotEvaluateActivity sobotEvaluateActivity) {
    }

    public static /* synthetic */ SobotEditTextLayout access$1900(SobotEvaluateActivity sobotEvaluateActivity) {
    }

    public static /* synthetic */ int access$200(SobotEvaluateActivity sobotEvaluateActivity) {
    }

    public static /* synthetic */ String[] access$2000(String str) {
    }

    public static /* synthetic */ int access$202(SobotEvaluateActivity sobotEvaluateActivity, int i2) {
    }

    public static /* synthetic */ void access$2100(SobotEvaluateActivity sobotEvaluateActivity, String[] strArr) {
    }

    public static /* synthetic */ void access$2200(SobotEvaluateActivity sobotEvaluateActivity) {
    }

    public static /* synthetic */ boolean access$2300(SobotEvaluateActivity sobotEvaluateActivity) {
    }

    public static /* synthetic */ Activity access$2400(SobotEvaluateActivity sobotEvaluateActivity) {
    }

    public static /* synthetic */ boolean access$2500(SobotEvaluateActivity sobotEvaluateActivity) {
    }

    public static /* synthetic */ boolean access$2600(SobotEvaluateActivity sobotEvaluateActivity) {
    }

    public static /* synthetic */ LinearLayout access$300(SobotEvaluateActivity sobotEvaluateActivity) {
    }

    public static /* synthetic */ RatingBar access$400(SobotEvaluateActivity sobotEvaluateActivity) {
    }

    public static /* synthetic */ int access$500(SobotEvaluateActivity sobotEvaluateActivity) {
    }

    public static /* synthetic */ int access$502(SobotEvaluateActivity sobotEvaluateActivity, int i2) {
    }

    public static /* synthetic */ SobotTenRatingLayout access$600(SobotEvaluateActivity sobotEvaluateActivity) {
    }

    public static /* synthetic */ int access$700(SobotEvaluateActivity sobotEvaluateActivity) {
    }

    public static /* synthetic */ RadioButton access$800(SobotEvaluateActivity sobotEvaluateActivity) {
    }

    public static /* synthetic */ RadioButton access$900(SobotEvaluateActivity sobotEvaluateActivity) {
    }

    private String checkBoxIsChecked() {
    }

    private boolean checkInput() {
    }

    private void checkLable(String[] strArr) {
    }

    private void comment() {
    }

    private static String[] convertStrToArray(String str) {
    }

    private void createChildLableView(SobotAntoLineLayout sobotAntoLineLayout, String[] strArr) {
    }

    private SobotCommentParam getCommentParam() {
    }

    private int getResovled() {
    }

    private SatisfactionSetBase getSatisFaction(int i2, List<SatisfactionSetBase> list) {
    }

    private void setCustomLayoutViewVisible(int i2, List<SatisfactionSetBase> list) {
    }

    private void setLableViewVisible(String[] strArr) {
    }

    private void setViewGone() {
    }

    private void setViewListener() {
    }

    private void subMitEvaluate() {
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(@NonNull MotionEvent motionEvent) {
    }

    @Override // com.sobot.chat.activity.base.SobotBaseActivity
    public int getContentViewResId() {
    }

    @Override // com.sobot.chat.activity.base.SobotDialogBaseActivity
    public Activity getContext() {
    }

    @Override // com.sobot.chat.activity.base.SobotBaseActivity
    public void initData() {
    }

    @Override // com.sobot.chat.activity.base.SobotBaseActivity
    public void initView() {
    }

    public boolean isShouldHideInput(View view, MotionEvent motionEvent) {
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onDetachedFromWindow() {
    }
}
