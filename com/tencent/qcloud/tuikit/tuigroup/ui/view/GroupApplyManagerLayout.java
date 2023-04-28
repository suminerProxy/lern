package com.tencent.qcloud.tuikit.tuigroup.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;
import androidx.annotation.Nullable;
import com.tencent.qcloud.tuicore.component.TitleBarLayout;
import com.tencent.qcloud.tuikit.tuigroup.bean.GroupApplyInfo;
import com.tencent.qcloud.tuikit.tuigroup.bean.GroupInfo;
import com.tencent.qcloud.tuikit.tuigroup.presenter.GroupApplyPresenter;
import com.tencent.qcloud.tuikit.tuigroup.ui.interfaces.IGroupApplyLayout;
import com.tencent.qcloud.tuikit.tuigroup.ui.view.GroupApplyAdapter;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class GroupApplyManagerLayout extends LinearLayout implements IGroupApplyLayout {
    private GroupApplyAdapter mAdapter;
    private ListView mApplyMemberList;
    private TitleBarLayout mTitleBar;
    private GroupApplyPresenter presenter;

    /* renamed from: com.tencent.qcloud.tuikit.tuigroup.ui.view.GroupApplyManagerLayout$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements GroupApplyAdapter.OnItemClickListener {
        public final /* synthetic */ GroupApplyManagerLayout this$0;

        public AnonymousClass1(GroupApplyManagerLayout groupApplyManagerLayout) {
        }

        @Override // com.tencent.qcloud.tuikit.tuigroup.ui.view.GroupApplyAdapter.OnItemClickListener
        public void onItemClick(GroupApplyInfo groupApplyInfo) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuigroup.ui.view.GroupApplyManagerLayout$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 implements View.OnClickListener {
        public final /* synthetic */ GroupApplyManagerLayout this$0;

        public AnonymousClass2(GroupApplyManagerLayout groupApplyManagerLayout) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    public GroupApplyManagerLayout(Context context) {
    }

    private void init() {
    }

    public TitleBarLayout getTitleBar() {
    }

    @Override // com.tencent.qcloud.tuikit.tuigroup.ui.interfaces.IGroupApplyLayout
    public void onDataSetChanged() {
    }

    @Override // com.tencent.qcloud.tuikit.tuigroup.ui.interfaces.IGroupApplyLayout
    public void onGroupApplyInfoListChanged(List<GroupApplyInfo> list) {
    }

    public void setDataSource(GroupInfo groupInfo) {
    }

    public void setPresenter(GroupApplyPresenter groupApplyPresenter) {
    }

    public void updateItemData(GroupApplyInfo groupApplyInfo) {
    }

    public GroupApplyManagerLayout(Context context, @Nullable AttributeSet attributeSet) {
    }

    public GroupApplyManagerLayout(Context context, @Nullable AttributeSet attributeSet, int i2) {
    }
}
