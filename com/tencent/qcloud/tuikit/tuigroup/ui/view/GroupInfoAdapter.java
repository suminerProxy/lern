package com.tencent.qcloud.tuikit.tuigroup.ui.view;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.qcloud.tuikit.tuigroup.bean.GroupInfo;
import com.tencent.qcloud.tuikit.tuigroup.bean.GroupMemberInfo;
import com.tencent.qcloud.tuikit.tuigroup.presenter.GroupInfoPresenter;
import com.tencent.qcloud.tuikit.tuigroup.ui.interfaces.IGroupMemberListener;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class GroupInfoAdapter extends BaseAdapter {
    private static final int ADD_TYPE = -100;
    private static final int DEL_TYPE = -101;
    private static final int NORMAL_CHATROOM_MAX_LIMIT = 10;
    private static final int NORMAL_COMMUNITY_MAX_LIMIT = 9;
    private static final int NORMAL_PRIVATE_MAX_LIMIT = 9;
    private static final int NORMAL_PUBLIC_MAX_LIMIT = 10;
    private static final int OWNER_CHATROOM_MAX_LIMIT = 9;
    private static final int OWNER_COMMUNITY_MAX_LIMIT = 8;
    private static final int OWNER_PRIVATE_MAX_LIMIT = 8;
    private static final int OWNER_PUBLIC_MAX_LIMIT = 9;
    private GroupInfo mGroupInfo;
    private List<GroupMemberInfo> mGroupMembers;
    private IGroupMemberListener mTailListener;
    private GroupInfoPresenter presenter;

    /* renamed from: com.tencent.qcloud.tuikit.tuigroup.ui.view.GroupInfoAdapter$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements View.OnClickListener {
        public final /* synthetic */ GroupInfoAdapter this$0;

        public AnonymousClass1(GroupInfoAdapter groupInfoAdapter) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuigroup.ui.view.GroupInfoAdapter$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 implements View.OnClickListener {
        public final /* synthetic */ GroupInfoAdapter this$0;

        public AnonymousClass2(GroupInfoAdapter groupInfoAdapter) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuigroup.ui.view.GroupInfoAdapter$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass3 implements Runnable {
        public final /* synthetic */ GroupInfoAdapter this$0;

        public AnonymousClass3(GroupInfoAdapter groupInfoAdapter) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class MyViewHolder {
        private ImageView memberIcon;
        private TextView memberName;
        public final /* synthetic */ GroupInfoAdapter this$0;

        private MyViewHolder(GroupInfoAdapter groupInfoAdapter) {
        }

        public static /* synthetic */ ImageView access$100(MyViewHolder myViewHolder) {
        }

        public static /* synthetic */ ImageView access$102(MyViewHolder myViewHolder, ImageView imageView) {
        }

        public static /* synthetic */ TextView access$200(MyViewHolder myViewHolder) {
        }

        public static /* synthetic */ TextView access$202(MyViewHolder myViewHolder, TextView textView) {
        }

        public /* synthetic */ MyViewHolder(GroupInfoAdapter groupInfoAdapter, AnonymousClass1 anonymousClass1) {
        }
    }

    public static /* synthetic */ IGroupMemberListener access$300(GroupInfoAdapter groupInfoAdapter) {
    }

    public static /* synthetic */ GroupInfo access$400(GroupInfoAdapter groupInfoAdapter) {
    }

    @Override // android.widget.Adapter
    public int getCount() {
    }

    @Override // android.widget.Adapter
    public /* bridge */ /* synthetic */ Object getItem(int i2) {
    }

    @Override // android.widget.Adapter
    public long getItemId(int i2) {
    }

    @Override // android.widget.Adapter
    public View getView(int i2, View view, ViewGroup viewGroup) {
    }

    public boolean isAdmin(int i2) {
    }

    public boolean isSelf(String str) {
    }

    public void setDataSource(GroupInfo groupInfo) {
    }

    public void setManagerCallBack(IGroupMemberListener iGroupMemberListener) {
    }

    public void setPresenter(GroupInfoPresenter groupInfoPresenter) {
    }

    @Override // android.widget.Adapter
    public GroupMemberInfo getItem(int i2) {
    }
}
