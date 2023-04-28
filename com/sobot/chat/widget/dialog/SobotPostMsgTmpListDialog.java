package com.sobot.chat.widget.dialog;

import android.app.Activity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sobot.chat.adapter.SobotPostMsgTmpListAdapter;
import com.sobot.chat.api.model.SobotPostMsgTemplate;
import com.sobot.chat.widget.dialog.base.SobotActionSheet;
import java.util.ArrayList;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class SobotPostMsgTmpListDialog extends SobotActionSheet implements AdapterView.OnItemClickListener, View.OnClickListener {
    private final String CANCEL_TAG;
    private LinearLayout coustom_pop_layout;
    private ArrayList<SobotPostMsgTemplate> mDatas;
    private SobotPostMsgTmpListAdapter mListAdapter;
    private SobotDialogListener mListener;
    private GridView sobot_gv;
    private LinearLayout sobot_negativeButton;
    private TextView sobot_tv_title;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface SobotDialogListener {
        void onListItemClick(SobotPostMsgTemplate sobotPostMsgTemplate);
    }

    private SobotPostMsgTmpListDialog(Activity activity) {
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

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
    }

    public SobotPostMsgTmpListDialog(Activity activity, ArrayList<SobotPostMsgTemplate> arrayList, SobotDialogListener sobotDialogListener) {
    }
}
