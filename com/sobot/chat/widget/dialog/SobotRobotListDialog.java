package com.sobot.chat.widget.dialog;

import android.app.Activity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sobot.chat.adapter.SobotRobotListAdapter;
import com.sobot.chat.api.model.SobotRobot;
import com.sobot.chat.widget.dialog.base.SobotActionSheet;
import com.sobot.network.http.callback.StringResultCallBack;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class SobotRobotListDialog extends SobotActionSheet implements AdapterView.OnItemClickListener, View.OnClickListener {
    private final String CANCEL_TAG;
    private LinearLayout coustom_pop_layout;
    private SobotRobotListAdapter mListAdapter;
    private SobotRobotListListener mListener;
    private String mRobotFlag;
    private String mUid;
    private GridView sobot_gv;
    private LinearLayout sobot_negativeButton;
    private TextView sobot_tv_title;

    /* renamed from: com.sobot.chat.widget.dialog.SobotRobotListDialog$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass1 implements StringResultCallBack<List<SobotRobot>> {
        public final /* synthetic */ SobotRobotListDialog this$0;

        public AnonymousClass1(SobotRobotListDialog sobotRobotListDialog) {
        }

        @Override // com.sobot.network.http.callback.StringResultCallBack
        public void onFailure(Exception exc, String str) {
        }

        @Override // com.sobot.network.http.callback.StringResultCallBack
        public /* bridge */ /* synthetic */ void onSuccess(List<SobotRobot> list) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(List<SobotRobot> list) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface SobotRobotListListener {
        void onSobotRobotListItemClick(SobotRobot sobotRobot);
    }

    private SobotRobotListDialog(Activity activity) {
    }

    public static /* synthetic */ String access$000(SobotRobotListDialog sobotRobotListDialog) {
    }

    public static /* synthetic */ SobotRobotListAdapter access$100(SobotRobotListDialog sobotRobotListDialog) {
    }

    public static /* synthetic */ SobotRobotListAdapter access$102(SobotRobotListDialog sobotRobotListDialog, SobotRobotListAdapter sobotRobotListAdapter) {
    }

    public static /* synthetic */ GridView access$200(SobotRobotListDialog sobotRobotListDialog) {
    }

    @Override // com.sobot.chat.widget.dialog.base.SobotActionSheet, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
    }

    @Override // com.sobot.chat.widget.dialog.base.SobotActionSheet
    public View getDialogContainer() {
    }

    @Override // com.sobot.chat.widget.dialog.base.SobotActionSheet
    public String getLayoutStrName() {
    }

    @Override // com.sobot.chat.widget.dialog.base.SobotActionSheet
    public void initData() {
    }

    @Override // com.sobot.chat.widget.dialog.base.SobotActionSheet
    public void initView() {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
    }

    public SobotRobotListDialog(Activity activity, String str, String str2, SobotRobotListListener sobotRobotListListener) {
    }
}
