package com.sobot.chat.activity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.sobot.chat.activity.base.SobotDialogBaseActivity;
import com.sobot.chat.adapter.SobotCusFieldAdapter;
import com.sobot.chat.api.model.SobotCusFieldConfig;
import com.sobot.chat.api.model.SobotCusFieldDataInfo;
import com.sobot.chat.api.model.SobotFieldModel;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class SobotCusFieldActivity extends SobotDialogBaseActivity {
    private SobotCusFieldAdapter adapter;
    private Bundle bundle;
    private SobotCusFieldConfig cusFieldConfig;
    private StringBuffer dataName;
    private StringBuffer dataValue;
    private String fieldId;
    private int fieldType;
    private List<SobotCusFieldDataInfo> infoLists;
    private ListView mListView;
    private SobotFieldModel model;
    private float screenHeight70;
    private LinearLayout sobot_btn_cancle;
    private Button sobot_btn_submit;
    private EditText sobot_et_search;
    private LinearLayout sobot_ll_search;
    private LinearLayout sobot_ll_submit;
    private TextView sobot_tv_title;

    /* renamed from: com.sobot.chat.activity.SobotCusFieldActivity$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass1 implements AdapterView.OnItemClickListener {
        public final /* synthetic */ SobotCusFieldActivity this$0;

        public AnonymousClass1(SobotCusFieldActivity sobotCusFieldActivity) {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
        }
    }

    /* renamed from: com.sobot.chat.activity.SobotCusFieldActivity$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass2 implements View.OnClickListener {
        public final /* synthetic */ SobotCusFieldActivity this$0;

        public AnonymousClass2(SobotCusFieldActivity sobotCusFieldActivity) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.sobot.chat.activity.SobotCusFieldActivity$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass3 implements View.OnClickListener {
        public final /* synthetic */ SobotCusFieldActivity this$0;

        public AnonymousClass3(SobotCusFieldActivity sobotCusFieldActivity) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.sobot.chat.activity.SobotCusFieldActivity$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass4 implements TextWatcher {
        public final /* synthetic */ SobotCusFieldActivity this$0;

        public AnonymousClass4(SobotCusFieldActivity sobotCusFieldActivity) {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }
    }

    public static /* synthetic */ List access$000(SobotCusFieldActivity sobotCusFieldActivity) {
    }

    public static /* synthetic */ int access$100(SobotCusFieldActivity sobotCusFieldActivity) {
    }

    public static /* synthetic */ StringBuffer access$200(SobotCusFieldActivity sobotCusFieldActivity) {
    }

    public static /* synthetic */ StringBuffer access$300(SobotCusFieldActivity sobotCusFieldActivity) {
    }

    public static /* synthetic */ String access$402(SobotCusFieldActivity sobotCusFieldActivity, String str) {
    }

    public static /* synthetic */ SobotCusFieldAdapter access$500(SobotCusFieldActivity sobotCusFieldActivity) {
    }

    public static /* synthetic */ void access$600(SobotCusFieldActivity sobotCusFieldActivity) {
    }

    private String[] convertStrToArray(String str) {
    }

    private void finishPageOrSDK() {
    }

    private void sendCloseIntent(int i2) {
    }

    private void setListViewHeight(ListView listView, int i2, int i3) {
    }

    @Override // com.sobot.chat.activity.base.SobotBaseActivity
    public int getContentViewResId() {
    }

    @Override // com.sobot.chat.activity.base.SobotBaseActivity
    public void initData() {
    }

    @Override // com.sobot.chat.activity.base.SobotBaseActivity
    public void initView() {
    }

    @Override // com.sobot.chat.activity.base.SobotDialogBaseActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    @Override // com.sobot.chat.activity.base.SobotBaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
    }

    public void onSumbitClick() {
    }

    @Override // com.sobot.chat.activity.base.SobotDialogBaseActivity, android.app.Activity
    public boolean onTouchEvent(MotionEvent motionEvent) {
    }
}
