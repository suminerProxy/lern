package com.sobot.chat.viewHolder;

import android.content.Context;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.annotation.IdRes;
import com.sobot.chat.api.ResultCallBack;
import com.sobot.chat.api.model.Information;
import com.sobot.chat.api.model.SatisfactionSet;
import com.sobot.chat.api.model.SatisfactionSetBase;
import com.sobot.chat.api.model.SobotEvaluateModel;
import com.sobot.chat.api.model.ZhiChiMessageBase;
import com.sobot.chat.viewHolder.base.MessageHolderBase;
import com.sobot.chat.widget.SobotAntoLineLayout;
import com.sobot.chat.widget.SobotTenRatingLayout;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class CusEvaluateMessageHolder extends MessageHolderBase implements RadioGroup.OnCheckedChangeListener, RatingBar.OnRatingBarChangeListener {
    private List<CheckBox> checkBoxList;
    private int deftaultScore;
    public Information information;
    public ZhiChiMessageBase message;
    private int ratingType;
    private List<SatisfactionSetBase> satisFactionList;
    public SobotEvaluateModel sobotEvaluateModel;
    public RadioButton sobot_btn_no_robot;
    public RadioButton sobot_btn_ok_robot;
    public TextView sobot_center_title;
    private SobotAntoLineLayout sobot_evaluate_lable_autoline;
    private LinearLayout sobot_hide_layout;
    public RatingBar sobot_ratingBar;
    public View sobot_ratingBar_split_view;
    public TextView sobot_ratingBar_title;
    public RadioGroup sobot_readiogroup;
    public TextView sobot_submit;
    private SobotTenRatingLayout sobot_ten_rating_ll;
    private LinearLayout sobot_ten_root_ll;
    private TextView sobot_ten_very_dissatisfied;
    private TextView sobot_ten_very_satisfaction;
    public TextView sobot_tv_star_title;

    /* renamed from: com.sobot.chat.viewHolder.CusEvaluateMessageHolder$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass1 implements ResultCallBack<SatisfactionSet> {
        public final /* synthetic */ CusEvaluateMessageHolder this$0;
        public final /* synthetic */ Context val$context;

        public AnonymousClass1(CusEvaluateMessageHolder cusEvaluateMessageHolder, Context context) {
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

    /* renamed from: com.sobot.chat.viewHolder.CusEvaluateMessageHolder$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass2 implements View.OnClickListener {
        public final /* synthetic */ CusEvaluateMessageHolder this$0;

        public AnonymousClass2(CusEvaluateMessageHolder cusEvaluateMessageHolder) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.sobot.chat.viewHolder.CusEvaluateMessageHolder$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass3 implements SobotTenRatingLayout.OnClickItemListener {
        public final /* synthetic */ CusEvaluateMessageHolder this$0;

        public AnonymousClass3(CusEvaluateMessageHolder cusEvaluateMessageHolder) {
        }

        @Override // com.sobot.chat.widget.SobotTenRatingLayout.OnClickItemListener
        public void onClickItem(int i2) {
        }
    }

    public CusEvaluateMessageHolder(Context context, View view) {
    }

    public static /* synthetic */ List access$000(CusEvaluateMessageHolder cusEvaluateMessageHolder) {
    }

    public static /* synthetic */ List access$002(CusEvaluateMessageHolder cusEvaluateMessageHolder, List list) {
    }

    public static /* synthetic */ int access$100(CusEvaluateMessageHolder cusEvaluateMessageHolder) {
    }

    public static /* synthetic */ String access$1000(CusEvaluateMessageHolder cusEvaluateMessageHolder) {
    }

    public static /* synthetic */ int access$102(CusEvaluateMessageHolder cusEvaluateMessageHolder, int i2) {
    }

    public static /* synthetic */ Context access$1100(CusEvaluateMessageHolder cusEvaluateMessageHolder) {
    }

    public static /* synthetic */ Context access$1200(CusEvaluateMessageHolder cusEvaluateMessageHolder) {
    }

    public static /* synthetic */ Context access$1300(CusEvaluateMessageHolder cusEvaluateMessageHolder) {
    }

    public static /* synthetic */ Context access$1400(CusEvaluateMessageHolder cusEvaluateMessageHolder) {
    }

    public static /* synthetic */ LinearLayout access$200(CusEvaluateMessageHolder cusEvaluateMessageHolder) {
    }

    public static /* synthetic */ int access$300(CusEvaluateMessageHolder cusEvaluateMessageHolder) {
    }

    public static /* synthetic */ int access$302(CusEvaluateMessageHolder cusEvaluateMessageHolder, int i2) {
    }

    public static /* synthetic */ SobotTenRatingLayout access$400(CusEvaluateMessageHolder cusEvaluateMessageHolder) {
    }

    public static /* synthetic */ LinearLayout access$500(CusEvaluateMessageHolder cusEvaluateMessageHolder) {
    }

    public static /* synthetic */ SatisfactionSetBase access$600(CusEvaluateMessageHolder cusEvaluateMessageHolder, int i2, List list) {
    }

    public static /* synthetic */ String[] access$700(String str) {
    }

    public static /* synthetic */ void access$800(CusEvaluateMessageHolder cusEvaluateMessageHolder, String[] strArr) {
    }

    public static /* synthetic */ void access$900(CusEvaluateMessageHolder cusEvaluateMessageHolder, boolean z, int i2) {
    }

    private String checkBoxIsChecked() {
    }

    private void checkQuestionFlag() {
    }

    private static String[] convertStrToArray(String str) {
    }

    private void createChildLableView(SobotAntoLineLayout sobotAntoLineLayout, String[] strArr) {
    }

    private void doEvaluate(boolean z, int i2) {
    }

    private SatisfactionSetBase getSatisFaction(int i2, List<SatisfactionSetBase> list) {
    }

    private void setEvaluatedLayout() {
    }

    private void setLableViewVisible(String[] strArr) {
    }

    private void setNotEvaluatedLayout() {
    }

    @Override // com.sobot.chat.viewHolder.base.MessageHolderBase
    public void bindData(Context context, ZhiChiMessageBase zhiChiMessageBase) {
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i2) {
    }

    @Override // android.widget.RatingBar.OnRatingBarChangeListener
    public void onRatingChanged(RatingBar ratingBar, float f2, boolean z) {
    }

    public void refreshItem() {
    }
}
