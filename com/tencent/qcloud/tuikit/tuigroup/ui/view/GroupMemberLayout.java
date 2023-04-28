package com.tencent.qcloud.tuikit.tuigroup.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.qcloud.tuicore.component.TitleBarLayout;
import com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback;
import com.tencent.qcloud.tuikit.tuigroup.bean.GroupInfo;
import com.tencent.qcloud.tuikit.tuigroup.bean.GroupMemberInfo;
import com.tencent.qcloud.tuikit.tuigroup.component.BottomSelectSheet;
import com.tencent.qcloud.tuikit.tuigroup.presenter.GroupInfoPresenter;
import com.tencent.qcloud.tuikit.tuigroup.ui.interfaces.IGroupMemberChangedCallback;
import com.tencent.qcloud.tuikit.tuigroup.ui.interfaces.IGroupMemberLayout;
import com.tencent.qcloud.tuikit.tuigroup.ui.interfaces.IGroupMemberListener;
import java.util.ArrayList;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class GroupMemberLayout extends LinearLayout implements IGroupMemberLayout {
    private static final int SCROLL_TO_END_OFFSET = -999999;
    private ArrayList<String> alreadySelectedList;
    private TextView confirmButton;
    private ArrayList<String> excludeList;
    private IGroupMemberListener groupMemberListener;
    private boolean isSelectMode;
    private GroupMemberAdapter mAdapter;
    private GroupInfo mGroupInfo;
    private TitleBarLayout mTitleBar;
    private GroupInfoPresenter presenter;
    private RecyclerView recyclerView;
    private View selectArea;
    private RecyclerView selectedList;
    private SelectedAdapter selectedListAdapter;
    private String title;

    /* renamed from: com.tencent.qcloud.tuikit.tuigroup.ui.view.GroupMemberLayout$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements View.OnClickListener {
        public final /* synthetic */ GroupMemberLayout this$0;

        public AnonymousClass1(GroupMemberLayout groupMemberLayout) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuigroup.ui.view.GroupMemberLayout$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 implements IGroupMemberChangedCallback {
        public final /* synthetic */ GroupMemberLayout this$0;

        public AnonymousClass2(GroupMemberLayout groupMemberLayout) {
        }

        @Override // com.tencent.qcloud.tuikit.tuigroup.ui.interfaces.IGroupMemberChangedCallback
        public void onMemberRemoved(GroupMemberInfo groupMemberInfo) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuigroup.ui.view.GroupMemberLayout$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass3 extends RecyclerView.OnScrollListener {
        public final /* synthetic */ GroupMemberLayout this$0;

        /* renamed from: com.tencent.qcloud.tuikit.tuigroup.ui.view.GroupMemberLayout$3$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass1 extends IUIKitCallback<GroupInfo> {
            public final /* synthetic */ AnonymousClass3 this$1;

            public AnonymousClass1(AnonymousClass3 anonymousClass3) {
            }

            @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
            public void onError(String str, int i2, String str2) {
            }

            @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
            public /* bridge */ /* synthetic */ void onSuccess(GroupInfo groupInfo) {
            }

            /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
            public void onSuccess2(GroupInfo groupInfo) {
            }
        }

        public AnonymousClass3(GroupMemberLayout groupMemberLayout) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i2) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuigroup.ui.view.GroupMemberLayout$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass4 implements View.OnClickListener {
        public final /* synthetic */ GroupMemberLayout this$0;

        public AnonymousClass4(GroupMemberLayout groupMemberLayout) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuigroup.ui.view.GroupMemberLayout$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass5 implements OnSelectChangedListener {
        public final /* synthetic */ GroupMemberLayout this$0;

        public AnonymousClass5(GroupMemberLayout groupMemberLayout) {
        }

        @Override // com.tencent.qcloud.tuikit.tuigroup.ui.view.GroupMemberLayout.OnSelectChangedListener
        public void onSelectChanged() {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuigroup.ui.view.GroupMemberLayout$6  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass6 implements View.OnClickListener {
        public final /* synthetic */ GroupMemberLayout this$0;

        public AnonymousClass6(GroupMemberLayout groupMemberLayout) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuigroup.ui.view.GroupMemberLayout$7  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass7 implements BottomSelectSheet.BottomSelectSheetOnClickListener {
        public final /* synthetic */ GroupMemberLayout this$0;

        public AnonymousClass7(GroupMemberLayout groupMemberLayout) {
        }

        @Override // com.tencent.qcloud.tuikit.tuigroup.component.BottomSelectSheet.BottomSelectSheetOnClickListener
        public void onSheetClick(int i2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface OnSelectChangedListener {
        void onSelectChanged();
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class SelectedAdapter extends RecyclerView.Adapter<SelectedViewHolder> {
        private List<GroupMemberInfo> mMembers;

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public static class SelectedViewHolder extends RecyclerView.ViewHolder {
            public final ImageView userIconView;

            public SelectedViewHolder(@NonNull View view) {
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public /* bridge */ /* synthetic */ void onBindViewHolder(@NonNull SelectedViewHolder selectedViewHolder, int i2) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NonNull
        public /* bridge */ /* synthetic */ SelectedViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i2) {
        }

        public void setMembers(List<GroupMemberInfo> list) {
        }

        /* renamed from: onBindViewHolder  reason: avoid collision after fix types in other method */
        public void onBindViewHolder2(@NonNull SelectedViewHolder selectedViewHolder, int i2) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NonNull
        /* renamed from: onCreateViewHolder  reason: avoid collision after fix types in other method */
        public SelectedViewHolder onCreateViewHolder2(@NonNull ViewGroup viewGroup, int i2) {
        }
    }

    public GroupMemberLayout(Context context) {
    }

    public static /* synthetic */ void access$000(GroupMemberLayout groupMemberLayout) {
    }

    public static /* synthetic */ String access$100(GroupMemberLayout groupMemberLayout) {
    }

    public static /* synthetic */ TitleBarLayout access$200(GroupMemberLayout groupMemberLayout) {
    }

    public static /* synthetic */ GroupInfo access$300(GroupMemberLayout groupMemberLayout) {
    }

    public static /* synthetic */ GroupMemberAdapter access$400(GroupMemberLayout groupMemberLayout) {
    }

    public static /* synthetic */ GroupInfoPresenter access$500(GroupMemberLayout groupMemberLayout) {
    }

    public static /* synthetic */ void access$600(GroupMemberLayout groupMemberLayout) {
    }

    public static /* synthetic */ SelectedAdapter access$700(GroupMemberLayout groupMemberLayout) {
    }

    public static /* synthetic */ IGroupMemberListener access$800(GroupMemberLayout groupMemberLayout) {
    }

    private void buildPopMenu() {
    }

    private void confirmAndFinish() {
    }

    private void init() {
    }

    @Override // com.tencent.qcloud.tuicore.component.interfaces.ILayout
    public TitleBarLayout getTitleBar() {
    }

    @Override // com.tencent.qcloud.tuikit.tuigroup.ui.interfaces.IGroupMemberLayout
    public void onGroupInfoChanged(GroupInfo groupInfo) {
    }

    @Override // com.tencent.qcloud.tuikit.tuigroup.ui.interfaces.IGroupMemberLayout
    public void onGroupInfoModified(Object obj, int i2) {
    }

    public void setAlreadySelectedList(ArrayList<String> arrayList) {
    }

    public void setExcludeList(ArrayList<String> arrayList) {
    }

    public void setGroupMemberListener(IGroupMemberListener iGroupMemberListener) {
    }

    @Override // com.tencent.qcloud.tuicore.component.interfaces.ILayout
    public void setParentLayout(Object obj) {
    }

    public void setPresenter(GroupInfoPresenter groupInfoPresenter) {
    }

    public void setSelectMode(boolean z) {
    }

    public void setTitle(String str) {
    }

    public GroupMemberLayout(Context context, @Nullable AttributeSet attributeSet) {
    }

    public GroupMemberLayout(Context context, @Nullable AttributeSet attributeSet, int i2) {
    }
}
