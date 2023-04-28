package com.tencent.qcloud.tuikit.tuigroup.ui.view;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.qcloud.tuikit.tuigroup.bean.GroupApplyInfo;
import com.tencent.qcloud.tuikit.tuigroup.bean.GroupInfo;
import com.tencent.qcloud.tuikit.tuigroup.presenter.GroupApplyPresenter;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class GroupApplyAdapter extends BaseAdapter {
    private List<GroupApplyInfo> mGroupMembers;
    private OnItemClickListener mOnItemClickListener;
    private GroupApplyPresenter presenter;

    /* renamed from: com.tencent.qcloud.tuikit.tuigroup.ui.view.GroupApplyAdapter$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements View.OnClickListener {
        public final /* synthetic */ GroupApplyAdapter this$0;
        public final /* synthetic */ GroupApplyInfo val$info;

        public AnonymousClass1(GroupApplyAdapter groupApplyAdapter, GroupApplyInfo groupApplyInfo) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuigroup.ui.view.GroupApplyAdapter$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 implements View.OnClickListener {
        public final /* synthetic */ GroupApplyAdapter this$0;
        public final /* synthetic */ int val$i;
        public final /* synthetic */ GroupApplyInfo val$info;

        public AnonymousClass2(GroupApplyAdapter groupApplyAdapter, int i2, GroupApplyInfo groupApplyInfo) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuigroup.ui.view.GroupApplyAdapter$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass3 implements View.OnClickListener {
        public final /* synthetic */ GroupApplyAdapter this$0;
        public final /* synthetic */ int val$i;
        public final /* synthetic */ GroupApplyInfo val$info;

        public AnonymousClass3(GroupApplyAdapter groupApplyAdapter, int i2, GroupApplyInfo groupApplyInfo) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class MyViewHolder {
        private Button accept;
        private ImageView memberIcon;
        private TextView memberName;
        private TextView reason;
        private Button refuse;
        public final /* synthetic */ GroupApplyAdapter this$0;

        private MyViewHolder(GroupApplyAdapter groupApplyAdapter) {
        }

        public static /* synthetic */ ImageView access$202(MyViewHolder myViewHolder, ImageView imageView) {
        }

        public static /* synthetic */ TextView access$300(MyViewHolder myViewHolder) {
        }

        public static /* synthetic */ TextView access$302(MyViewHolder myViewHolder, TextView textView) {
        }

        public static /* synthetic */ TextView access$400(MyViewHolder myViewHolder) {
        }

        public static /* synthetic */ TextView access$402(MyViewHolder myViewHolder, TextView textView) {
        }

        public static /* synthetic */ Button access$500(MyViewHolder myViewHolder) {
        }

        public static /* synthetic */ Button access$502(MyViewHolder myViewHolder, Button button) {
        }

        public static /* synthetic */ Button access$600(MyViewHolder myViewHolder) {
        }

        public static /* synthetic */ Button access$602(MyViewHolder myViewHolder, Button button) {
        }

        public /* synthetic */ MyViewHolder(GroupApplyAdapter groupApplyAdapter, AnonymousClass1 anonymousClass1) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface OnItemClickListener {
        void onItemClick(GroupApplyInfo groupApplyInfo);
    }

    public static /* synthetic */ OnItemClickListener access$000(GroupApplyAdapter groupApplyAdapter) {
    }

    public void acceptApply(int i2, GroupApplyInfo groupApplyInfo) {
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

    public int getUnHandledSize() {
    }

    @Override // android.widget.Adapter
    public View getView(int i2, View view, ViewGroup viewGroup) {
    }

    public void refuseApply(int i2, GroupApplyInfo groupApplyInfo) {
    }

    public void setDataSource(GroupInfo groupInfo) {
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
    }

    public void setPresenter(GroupApplyPresenter groupApplyPresenter) {
    }

    public void updateItemData(GroupApplyInfo groupApplyInfo) {
    }

    @Override // android.widget.Adapter
    public GroupApplyInfo getItem(int i2) {
    }

    public void setDataSource(List<GroupApplyInfo> list) {
    }
}
