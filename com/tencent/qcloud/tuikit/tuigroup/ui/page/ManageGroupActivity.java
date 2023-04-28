package com.tencent.qcloud.tuikit.tuigroup.ui.page;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.qcloud.tuicore.component.LineControllerView;
import com.tencent.qcloud.tuicore.component.TitleBarLayout;
import com.tencent.qcloud.tuicore.component.activities.BaseLightActivity;
import com.tencent.qcloud.tuicore.component.gatherimage.ShadeImageView;
import com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback;
import com.tencent.qcloud.tuikit.tuigroup.bean.GroupInfo;
import com.tencent.qcloud.tuikit.tuigroup.bean.GroupMemberInfo;
import com.tencent.qcloud.tuikit.tuigroup.presenter.GroupManagerPresenter;
import com.tencent.qcloud.tuikit.tuigroup.ui.page.SetGroupManagerActivity;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class ManageGroupActivity extends BaseLightActivity {
    private View addMuteMemberView;
    private GroupInfo groupInfo;
    private LineControllerView muteAllView;
    private RecyclerView mutedList;
    private MutedMemberAdapter mutedMemberAdapter;
    private GroupManagerPresenter presenter;
    private LineControllerView setManagerView;
    private TitleBarLayout titleBarLayout;

    /* renamed from: com.tencent.qcloud.tuikit.tuigroup.ui.page.ManageGroupActivity$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements View.OnClickListener {
        public final /* synthetic */ ManageGroupActivity this$0;

        public AnonymousClass1(ManageGroupActivity manageGroupActivity) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuigroup.ui.page.ManageGroupActivity$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 implements CompoundButton.OnCheckedChangeListener {
        public final /* synthetic */ ManageGroupActivity this$0;

        /* renamed from: com.tencent.qcloud.tuikit.tuigroup.ui.page.ManageGroupActivity$2$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass1 extends IUIKitCallback<Void> {
            public final /* synthetic */ AnonymousClass2 this$1;
            public final /* synthetic */ boolean val$isChecked;

            public AnonymousClass1(AnonymousClass2 anonymousClass2, boolean z) {
            }

            @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
            public void onError(String str, int i2, String str2) {
            }

            @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
            public /* bridge */ /* synthetic */ void onSuccess(Void r1) {
            }

            /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
            public void onSuccess2(Void r2) {
            }
        }

        public AnonymousClass2(ManageGroupActivity manageGroupActivity) {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuigroup.ui.page.ManageGroupActivity$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass3 implements View.OnClickListener {
        public final /* synthetic */ ManageGroupActivity this$0;

        public AnonymousClass3(ManageGroupActivity manageGroupActivity) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuigroup.ui.page.ManageGroupActivity$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass4 implements View.OnClickListener {
        public final /* synthetic */ ManageGroupActivity this$0;

        public AnonymousClass4(ManageGroupActivity manageGroupActivity) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuigroup.ui.page.ManageGroupActivity$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass5 implements SetGroupManagerActivity.OnItemLongClickListener {
        public final /* synthetic */ ManageGroupActivity this$0;

        /* renamed from: com.tencent.qcloud.tuikit.tuigroup.ui.page.ManageGroupActivity$5$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass1 implements PopupWindow.OnDismissListener {
            public final /* synthetic */ AnonymousClass5 this$1;
            public final /* synthetic */ Drawable val$drawable;

            public AnonymousClass1(AnonymousClass5 anonymousClass5, Drawable drawable) {
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
            }
        }

        /* renamed from: com.tencent.qcloud.tuikit.tuigroup.ui.page.ManageGroupActivity$5$2  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass2 implements View.OnClickListener {
            public final /* synthetic */ AnonymousClass5 this$1;
            public final /* synthetic */ GroupMemberInfo val$memberInfo;
            public final /* synthetic */ PopupWindow val$popupWindow;

            /* renamed from: com.tencent.qcloud.tuikit.tuigroup.ui.page.ManageGroupActivity$5$2$1  reason: invalid class name */
            /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
            public class AnonymousClass1 extends IUIKitCallback<Void> {
                public final /* synthetic */ AnonymousClass2 this$2;

                public AnonymousClass1(AnonymousClass2 anonymousClass2) {
                }

                @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
                public void onError(String str, int i2, String str2) {
                }

                @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
                public /* bridge */ /* synthetic */ void onSuccess(Void r1) {
                }

                /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
                public void onSuccess2(Void r2) {
                }
            }

            public AnonymousClass2(AnonymousClass5 anonymousClass5, PopupWindow popupWindow, GroupMemberInfo groupMemberInfo) {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        }

        public AnonymousClass5(ManageGroupActivity manageGroupActivity) {
        }

        @Override // com.tencent.qcloud.tuikit.tuigroup.ui.page.SetGroupManagerActivity.OnItemLongClickListener
        public void onClick(View view, GroupMemberInfo groupMemberInfo, int i2) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuigroup.ui.page.ManageGroupActivity$6  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass6 extends IUIKitCallback<List<GroupMemberInfo>> {
        public final /* synthetic */ ManageGroupActivity this$0;

        public AnonymousClass6(ManageGroupActivity manageGroupActivity) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public void onError(String str, int i2, String str2) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public /* bridge */ /* synthetic */ void onSuccess(List<GroupMemberInfo> list) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(List<GroupMemberInfo> list) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuigroup.ui.page.ManageGroupActivity$7  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass7 extends IUIKitCallback<Void> {
        public final /* synthetic */ ManageGroupActivity this$0;

        public AnonymousClass7(ManageGroupActivity manageGroupActivity) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public void onError(String str, int i2, String str2) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public /* bridge */ /* synthetic */ void onSuccess(Void r1) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(Void r1) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class MutedMemberAdapter extends RecyclerView.Adapter<MutedMemberViewHolder> {
        private List<GroupMemberInfo> groupMemberInfoList;
        private SetGroupManagerActivity.OnItemLongClickListener onItemLongClickListener;
        public final /* synthetic */ ManageGroupActivity this$0;

        /* renamed from: com.tencent.qcloud.tuikit.tuigroup.ui.page.ManageGroupActivity$MutedMemberAdapter$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass1 implements View.OnLongClickListener {
            public final /* synthetic */ MutedMemberAdapter this$1;
            public final /* synthetic */ GroupMemberInfo val$groupMemberInfo;
            public final /* synthetic */ int val$position;

            public AnonymousClass1(MutedMemberAdapter mutedMemberAdapter, GroupMemberInfo groupMemberInfo, int i2) {
            }

            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
            }
        }

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class MutedMemberViewHolder extends RecyclerView.ViewHolder {
            public ShadeImageView faceIcon;
            public TextView managerName;
            public final /* synthetic */ MutedMemberAdapter this$1;

            public MutedMemberViewHolder(@NonNull MutedMemberAdapter mutedMemberAdapter, View view) {
            }
        }

        public MutedMemberAdapter(ManageGroupActivity manageGroupActivity) {
        }

        public static /* synthetic */ SetGroupManagerActivity.OnItemLongClickListener access$600(MutedMemberAdapter mutedMemberAdapter) {
        }

        public List<GroupMemberInfo> getGroupMemberInfoList() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public /* bridge */ /* synthetic */ void onBindViewHolder(@NonNull MutedMemberViewHolder mutedMemberViewHolder, int i2) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NonNull
        public /* bridge */ /* synthetic */ MutedMemberViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i2) {
        }

        public void onItemRemoved(GroupMemberInfo groupMemberInfo) {
        }

        public void setGroupMemberInfoList(List<GroupMemberInfo> list) {
        }

        public void setOnItemLongClickListener(SetGroupManagerActivity.OnItemLongClickListener onItemLongClickListener) {
        }

        /* renamed from: onBindViewHolder  reason: avoid collision after fix types in other method */
        public void onBindViewHolder2(@NonNull MutedMemberViewHolder mutedMemberViewHolder, int i2) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NonNull
        /* renamed from: onCreateViewHolder  reason: avoid collision after fix types in other method */
        public MutedMemberViewHolder onCreateViewHolder2(@NonNull ViewGroup viewGroup, int i2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface OnItemLongClickListener {
        void onClick(View view, GroupMemberInfo groupMemberInfo);
    }

    public static /* synthetic */ GroupInfo access$000(ManageGroupActivity manageGroupActivity) {
    }

    public static /* synthetic */ View access$100(ManageGroupActivity manageGroupActivity) {
    }

    public static /* synthetic */ RecyclerView access$200(ManageGroupActivity manageGroupActivity) {
    }

    public static /* synthetic */ GroupManagerPresenter access$300(ManageGroupActivity manageGroupActivity) {
    }

    public static /* synthetic */ MutedMemberAdapter access$400(ManageGroupActivity manageGroupActivity) {
    }

    public static /* synthetic */ void access$500(ManageGroupActivity manageGroupActivity) {
    }

    public static /* synthetic */ String access$700(ManageGroupActivity manageGroupActivity, GroupMemberInfo groupMemberInfo) {
    }

    private String getDisplayName(GroupMemberInfo groupMemberInfo) {
    }

    private void loadMutedMember() {
    }

    private void setClickListener() {
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i2, int i3, Intent intent) {
    }

    @Override // com.tencent.qcloud.tuicore.component.activities.BaseLightActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
    }
}
