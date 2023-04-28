package com.sobot.chat.activity;

import android.util.SparseArray;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.sobot.chat.activity.base.SobotDialogBaseActivity;
import com.sobot.chat.adapter.SobotPostCategoryAdapter;
import com.sobot.chat.api.model.SobotTypeModel;
import java.util.ArrayList;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class SobotPostCategoryActivity extends SobotDialogBaseActivity {
    private SobotPostCategoryAdapter categoryAdapter;
    private int currentLevel;
    private ListView listView;
    private ImageView sobot_btn_back;
    private LinearLayout sobot_btn_cancle;
    private TextView sobot_tv_title;
    private List<SobotTypeModel> tmpDatas;
    private SparseArray<List<SobotTypeModel>> tmpMap;
    private String typeId;
    private String typeName;
    private List<SobotTypeModel> types;

    /* renamed from: com.sobot.chat.activity.SobotPostCategoryActivity$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass1 implements AdapterView.OnItemClickListener {
        public final /* synthetic */ SobotPostCategoryActivity this$0;

        public AnonymousClass1(SobotPostCategoryActivity sobotPostCategoryActivity) {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
        }
    }

    /* renamed from: com.sobot.chat.activity.SobotPostCategoryActivity$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass2 implements View.OnClickListener {
        public final /* synthetic */ SobotPostCategoryActivity this$0;

        public AnonymousClass2(SobotPostCategoryActivity sobotPostCategoryActivity) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.sobot.chat.activity.SobotPostCategoryActivity$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass3 implements View.OnClickListener {
        public final /* synthetic */ SobotPostCategoryActivity this$0;

        public AnonymousClass3(SobotPostCategoryActivity sobotPostCategoryActivity) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    public static /* synthetic */ int access$000(SobotPostCategoryActivity sobotPostCategoryActivity) {
    }

    public static /* synthetic */ int access$008(SobotPostCategoryActivity sobotPostCategoryActivity) {
    }

    public static /* synthetic */ SparseArray access$100(SobotPostCategoryActivity sobotPostCategoryActivity) {
    }

    public static /* synthetic */ void access$200(SobotPostCategoryActivity sobotPostCategoryActivity, int i2) {
    }

    public static /* synthetic */ SobotPostCategoryAdapter access$300(SobotPostCategoryActivity sobotPostCategoryActivity) {
    }

    public static /* synthetic */ void access$400(SobotPostCategoryActivity sobotPostCategoryActivity) {
    }

    private void backPressed() {
    }

    private void notifyListData(List<SobotTypeModel> list) {
    }

    private void resetChecked(ArrayList<SobotTypeModel> arrayList) {
    }

    private void showDataWithLevel(int i2) {
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
}
