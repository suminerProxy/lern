package com.tencent.qcloud.tuikit.tuigroup.ui.view;

import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback;
import com.tencent.qcloud.tuikit.tuigroup.bean.GroupInfo;
import com.tencent.qcloud.tuikit.tuigroup.bean.GroupMemberInfo;
import com.tencent.qcloud.tuikit.tuigroup.presenter.GroupInfoPresenter;
import com.tencent.qcloud.tuikit.tuigroup.ui.interfaces.IGroupMemberChangedCallback;
import com.tencent.qcloud.tuikit.tuigroup.ui.view.GroupMemberLayout;
import java.util.ArrayList;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class GroupMemberAdapter extends RecyclerView.Adapter<GroupMemberViewHodler> {
    private ArrayList<String> alreadySelectedList;
    private ArrayList<String> excludeList;
    private boolean isSelectMode;
    private IGroupMemberChangedCallback mCallback;
    private GroupInfo mGroupInfo;
    private List<GroupMemberInfo> mGroupMembers;
    private GroupMemberLayout.OnSelectChangedListener onSelectChangedListener;
    private GroupInfoPresenter presenter;
    private List<GroupMemberInfo> selectedGroupMemberInfos;
    private ArrayList<String> selectedMember;

    /* renamed from: com.tencent.qcloud.tuikit.tuigroup.ui.view.GroupMemberAdapter$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements View.OnClickListener {
        public final /* synthetic */ GroupMemberAdapter this$0;
        public final /* synthetic */ GroupMemberViewHodler val$holder;
        public final /* synthetic */ GroupMemberInfo val$info;

        public AnonymousClass1(GroupMemberAdapter groupMemberAdapter, GroupMemberViewHodler groupMemberViewHodler, GroupMemberInfo groupMemberInfo) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuigroup.ui.view.GroupMemberAdapter$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 implements View.OnLongClickListener {
        public final /* synthetic */ GroupMemberAdapter this$0;
        public final /* synthetic */ GroupMemberViewHodler val$holder;
        public final /* synthetic */ GroupMemberInfo val$info;

        /* renamed from: com.tencent.qcloud.tuikit.tuigroup.ui.view.GroupMemberAdapter$2$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass1 implements View.OnClickListener {
            public final /* synthetic */ AnonymousClass2 this$1;
            public final /* synthetic */ PopupWindow val$window;

            /* renamed from: com.tencent.qcloud.tuikit.tuigroup.ui.view.GroupMemberAdapter$2$1$1  reason: invalid class name and collision with other inner class name */
            /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
            public class C02371 extends IUIKitCallback {
                public final /* synthetic */ AnonymousClass1 this$2;

                public C02371(AnonymousClass1 anonymousClass1) {
                }

                @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
                public void onError(String str, int i2, String str2) {
                }

                @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
                public void onSuccess(Object obj) {
                }
            }

            public AnonymousClass1(AnonymousClass2 anonymousClass2, PopupWindow popupWindow) {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        }

        public AnonymousClass2(GroupMemberAdapter groupMemberAdapter, GroupMemberViewHodler groupMemberViewHodler, GroupMemberInfo groupMemberInfo) {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuigroup.ui.view.GroupMemberAdapter$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass3 implements View.OnClickListener {
        public final /* synthetic */ GroupMemberAdapter this$0;
        public final /* synthetic */ GroupMemberInfo val$info;

        public AnonymousClass3(GroupMemberAdapter groupMemberAdapter, GroupMemberInfo groupMemberInfo) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuigroup.ui.view.GroupMemberAdapter$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass4 implements Runnable {
        public final /* synthetic */ GroupMemberAdapter this$0;

        public AnonymousClass4(GroupMemberAdapter groupMemberAdapter) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class GroupMemberViewHodler extends RecyclerView.ViewHolder {
        private CheckBox checkBox;
        private ImageView memberIcon;
        private TextView memberName;
        public final /* synthetic */ GroupMemberAdapter this$0;

        public GroupMemberViewHodler(@NonNull GroupMemberAdapter groupMemberAdapter, View view) {
        }

        public static /* synthetic */ ImageView access$000(GroupMemberViewHodler groupMemberViewHodler) {
        }

        public static /* synthetic */ TextView access$100(GroupMemberViewHodler groupMemberViewHodler) {
        }

        public static /* synthetic */ CheckBox access$200(GroupMemberViewHodler groupMemberViewHodler) {
        }
    }

    public static /* synthetic */ ArrayList access$300(GroupMemberAdapter groupMemberAdapter) {
    }

    public static /* synthetic */ List access$400(GroupMemberAdapter groupMemberAdapter) {
    }

    public static /* synthetic */ GroupMemberLayout.OnSelectChangedListener access$500(GroupMemberAdapter groupMemberAdapter) {
    }

    public static /* synthetic */ GroupInfo access$600(GroupMemberAdapter groupMemberAdapter) {
    }

    public static /* synthetic */ GroupInfoPresenter access$700(GroupMemberAdapter groupMemberAdapter) {
    }

    public static /* synthetic */ List access$800(GroupMemberAdapter groupMemberAdapter) {
    }

    public static /* synthetic */ IGroupMemberChangedCallback access$900(GroupMemberAdapter groupMemberAdapter) {
    }

    private void setAlreadySelected(GroupMemberViewHodler groupMemberViewHodler, GroupMemberInfo groupMemberInfo) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
    }

    public ArrayList<String> getSelectedMember() {
    }

    public List<GroupMemberInfo> getSelectedMemberInfoList() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onBindViewHolder(@NonNull GroupMemberViewHodler groupMemberViewHodler, int i2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public /* bridge */ /* synthetic */ GroupMemberViewHodler onCreateViewHolder(@NonNull ViewGroup viewGroup, int i2) {
    }

    public void setAlreadySelectedList(ArrayList<String> arrayList) {
    }

    public void setDataSource(GroupInfo groupInfo) {
    }

    public void setExcludeList(ArrayList<String> arrayList) {
    }

    public void setMemberChangedCallback(IGroupMemberChangedCallback iGroupMemberChangedCallback) {
    }

    public void setOnSelectChangedListener(GroupMemberLayout.OnSelectChangedListener onSelectChangedListener) {
    }

    public void setPresenter(GroupInfoPresenter groupInfoPresenter) {
    }

    public void setSelectMode(boolean z) {
    }

    /* renamed from: onBindViewHolder  reason: avoid collision after fix types in other method */
    public void onBindViewHolder2(@NonNull GroupMemberViewHodler groupMemberViewHodler, int i2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    /* renamed from: onCreateViewHolder  reason: avoid collision after fix types in other method */
    public GroupMemberViewHodler onCreateViewHolder2(@NonNull ViewGroup viewGroup, int i2) {
    }
}
