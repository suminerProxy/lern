package com.sobot.chat.activity;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import com.sobot.chat.activity.base.SobotBaseActivity;
import com.sobot.chat.adapter.SobotFilesAdapter;
import java.io.File;
import java.util.Comparator;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class SobotChooseFileActivity extends SobotBaseActivity implements AdapterView.OnItemClickListener, View.OnClickListener {
    private static final int READ_REQUEST_CODE = 42;
    private SobotFilesAdapter mAdapter;
    private File mCurrentDir;
    private List<File> mDatas;
    private File mRootDir;
    private ListView sobot_lv_files;
    private TextView sobot_tv_send;
    private TextView sobot_tv_total;

    /* renamed from: com.sobot.chat.activity.SobotChooseFileActivity$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass1 implements Comparator<File> {
        public final /* synthetic */ SobotChooseFileActivity this$0;

        public AnonymousClass1(SobotChooseFileActivity sobotChooseFileActivity) {
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(File file, File file2) {
        }

        /* renamed from: compare  reason: avoid collision after fix types in other method */
        public int compare2(File file, File file2) {
        }
    }

    private File[] getChildFiles(File file) {
    }

    private void goback() {
    }

    private void showCurrentFiles(File file) {
    }

    private void showData(File[] fileArr) {
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

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i2, int i3, Intent intent) {
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
    }

    @Override // com.sobot.chat.activity.base.SobotBaseActivity
    public void onLeftMenuClick(View view) {
    }
}
