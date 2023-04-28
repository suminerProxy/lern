package com.sobot.chat.activity;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.sobot.chat.activity.base.SobotDialogBaseActivity;
import com.sobot.chat.adapter.SobotProvinAdapter;
import com.sobot.chat.api.model.SobotCityResult;
import com.sobot.chat.api.model.SobotCusFieldConfig;
import com.sobot.chat.api.model.SobotProvinInfo;
import com.sobot.network.http.callback.StringResultCallBack;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class SobotChooseCityActivity extends SobotDialogBaseActivity {
    private SobotProvinAdapter categoryAdapter;
    private int currentLevel;
    private SobotCusFieldConfig cusFieldConfig;
    private boolean isRunning;
    private String mFiledId;
    private SobotProvinInfo.SobotProvinceModel mFinalData;
    private Bundle mIntentBundleData;
    private ListView mListView;
    private SobotProvinInfo mProvinInfo;
    private LinearLayout sobot_btn_cancle;
    private TextView sobot_tv_title;
    private List<SobotProvinInfo.SobotProvinceModel> tmpDatas;
    private SparseArray<List<SobotProvinInfo.SobotProvinceModel>> tmpMap;

    /* renamed from: com.sobot.chat.activity.SobotChooseCityActivity$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass1 implements AdapterView.OnItemClickListener {
        public final /* synthetic */ SobotChooseCityActivity this$0;

        public AnonymousClass1(SobotChooseCityActivity sobotChooseCityActivity) {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
        }
    }

    /* renamed from: com.sobot.chat.activity.SobotChooseCityActivity$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass2 implements View.OnClickListener {
        public final /* synthetic */ SobotChooseCityActivity this$0;

        public AnonymousClass2(SobotChooseCityActivity sobotChooseCityActivity) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.sobot.chat.activity.SobotChooseCityActivity$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass3 implements StringResultCallBack<SobotCityResult> {
        public final /* synthetic */ SobotChooseCityActivity this$0;
        public final /* synthetic */ SobotProvinInfo.SobotProvinceModel val$data;

        public AnonymousClass3(SobotChooseCityActivity sobotChooseCityActivity, SobotProvinInfo.SobotProvinceModel sobotProvinceModel) {
        }

        @Override // com.sobot.network.http.callback.StringResultCallBack
        public void onFailure(Exception exc, String str) {
        }

        @Override // com.sobot.network.http.callback.StringResultCallBack
        public /* bridge */ /* synthetic */ void onSuccess(SobotCityResult sobotCityResult) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(SobotCityResult sobotCityResult) {
        }
    }

    public static /* synthetic */ List access$000(SobotChooseCityActivity sobotChooseCityActivity) {
    }

    public static /* synthetic */ void access$100(SobotChooseCityActivity sobotChooseCityActivity, SobotProvinInfo.SobotProvinceModel sobotProvinceModel) {
    }

    public static /* synthetic */ void access$1000(SobotChooseCityActivity sobotChooseCityActivity, List list, SobotProvinInfo.SobotProvinceModel sobotProvinceModel) {
    }

    public static /* synthetic */ int access$200(SobotChooseCityActivity sobotChooseCityActivity) {
    }

    public static /* synthetic */ void access$300(SobotChooseCityActivity sobotChooseCityActivity, int i2, SobotProvinInfo.SobotProvinceModel sobotProvinceModel) {
    }

    public static /* synthetic */ SobotProvinInfo.SobotProvinceModel access$400(SobotChooseCityActivity sobotChooseCityActivity) {
    }

    public static /* synthetic */ String access$500(SobotChooseCityActivity sobotChooseCityActivity) {
    }

    public static /* synthetic */ SparseArray access$600(SobotChooseCityActivity sobotChooseCityActivity) {
    }

    public static /* synthetic */ SobotProvinAdapter access$700(SobotChooseCityActivity sobotChooseCityActivity) {
    }

    public static /* synthetic */ void access$800(SobotChooseCityActivity sobotChooseCityActivity) {
    }

    public static /* synthetic */ boolean access$902(SobotChooseCityActivity sobotChooseCityActivity, boolean z) {
    }

    private void backPressed() {
    }

    private void fillData(int i2) {
    }

    private void initIntent() {
    }

    private void notifyListData(List<SobotProvinInfo.SobotProvinceModel> list) {
    }

    private void saveData(int i2, SobotProvinInfo.SobotProvinceModel sobotProvinceModel) {
    }

    private void showData(List<SobotProvinInfo.SobotProvinceModel> list, SobotProvinInfo.SobotProvinceModel sobotProvinceModel) {
    }

    private void showDataWithLevel(SobotProvinInfo.SobotProvinceModel sobotProvinceModel) {
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
}
