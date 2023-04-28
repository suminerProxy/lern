package com.tencent.qcloud.tuikit.tuicontact.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.qcloud.tuicore.component.CustomLinearLayoutManager;
import com.tencent.qcloud.tuikit.tuicontact.bean.ContactItemBean;
import com.tencent.qcloud.tuikit.tuicontact.component.indexlib.IndexBar.widget.IndexBar;
import com.tencent.qcloud.tuikit.tuicontact.component.indexlib.suspension.SuspensionDecoration;
import com.tencent.qcloud.tuikit.tuicontact.presenter.ContactPresenter;
import com.tencent.qcloud.tuikit.tuicontact.ui.interfaces.IContactListView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class ContactListView extends LinearLayout implements IContactListView {
    private static final String TAG = null;
    private ArrayList<String> alreadySelectedList;
    private int dataSourceType;
    private String groupId;
    private boolean isGroupList;
    private ContactAdapter mAdapter;
    private ProgressBar mContactLoadingBar;
    private List<ContactItemBean> mData;
    private SuspensionDecoration mDecoration;
    private IndexBar mIndexBar;
    private CustomLinearLayoutManager mManager;
    private RecyclerView mRv;
    private TextView mTvSideBarHint;
    private TextView notFoundTip;
    private ContactPresenter presenter;

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.ui.view.ContactListView$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 extends RecyclerView.OnScrollListener {
        public final /* synthetic */ ContactListView this$0;

        public AnonymousClass1(ContactListView contactListView) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i2, int i3) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class DataSource {
        public static final int BLACK_LIST = 2;
        public static final int CONTACT_LIST = 4;
        public static final int FRIEND_LIST = 1;
        public static final int GROUP_LIST = 3;
        public static final int GROUP_MEMBER_LIST = 5;
        public static final int UNKNOWN = -1;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface OnItemClickListener {
        void onItemClick(int i2, ContactItemBean contactItemBean);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface OnSelectChangedListener {
        void onSelectChanged(ContactItemBean contactItemBean, boolean z);
    }

    public ContactListView(Context context) {
    }

    public static /* synthetic */ ContactPresenter access$000(ContactListView contactListView) {
    }

    public static /* synthetic */ String access$100(ContactListView contactListView) {
    }

    private void init() {
    }

    public ContactAdapter getAdapter() {
    }

    public void loadDataSource(int i2) {
    }

    @Override // com.tencent.qcloud.tuikit.tuicontact.ui.interfaces.IContactListView
    public void onDataSourceChanged(List<ContactItemBean> list) {
    }

    @Override // com.tencent.qcloud.tuikit.tuicontact.ui.interfaces.IContactListView
    public void onFriendApplicationChanged() {
    }

    public void setAlreadySelectedList(ArrayList<String> arrayList) {
    }

    public void setGroupId(String str) {
    }

    public void setIsGroupList(boolean z) {
    }

    public void setNotFoundTip(String str) {
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
    }

    public void setOnSelectChangeListener(OnSelectChangedListener onSelectChangedListener) {
    }

    public void setPresenter(ContactPresenter contactPresenter) {
    }

    public void setSingleSelectMode(boolean z) {
    }

    public ContactListView(Context context, @Nullable AttributeSet attributeSet) {
    }

    public ContactListView(Context context, @Nullable AttributeSet attributeSet, int i2) {
    }
}
