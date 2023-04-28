package com.tencent.qcloud.tuikit.tuigroup.ui.page;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.qcloud.tuicore.component.TitleBarLayout;
import com.tencent.qcloud.tuicore.component.activities.BaseLightActivity;
import com.tencent.qcloud.tuicore.component.gatherimage.ShadeImageView;
import com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback;
import com.tencent.qcloud.tuikit.tuigroup.bean.GroupInfo;
import com.tencent.qcloud.tuikit.tuigroup.bean.GroupMemberInfo;
import com.tencent.qcloud.tuikit.tuigroup.presenter.GroupManagerPresenter;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class SetGroupManagerActivity extends BaseLightActivity {
    private GroupInfo groupInfo;
    private ManagerAdapter managerAdapter;
    private TextView managerCountLabel;
    private RecyclerView managerList;
    private ShadeImageView ownerFace;
    private String ownerID;
    private TextView ownerName;
    private GroupManagerPresenter presenter;
    private View setManagerView;
    private TitleBarLayout titleBarLayout;

    /* renamed from: com.tencent.qcloud.tuikit.tuigroup.ui.page.SetGroupManagerActivity$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 extends IUIKitCallback<List<GroupMemberInfo>> {
        public final /* synthetic */ SetGroupManagerActivity this$0;

        public AnonymousClass1(SetGroupManagerActivity setGroupManagerActivity) {
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

    /* renamed from: com.tencent.qcloud.tuikit.tuigroup.ui.page.SetGroupManagerActivity$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 extends IUIKitCallback<GroupMemberInfo> {
        public final /* synthetic */ SetGroupManagerActivity this$0;

        public AnonymousClass2(SetGroupManagerActivity setGroupManagerActivity) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public void onError(String str, int i2, String str2) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public /* bridge */ /* synthetic */ void onSuccess(GroupMemberInfo groupMemberInfo) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(GroupMemberInfo groupMemberInfo) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuigroup.ui.page.SetGroupManagerActivity$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass3 implements View.OnClickListener {
        public final /* synthetic */ SetGroupManagerActivity this$0;

        public AnonymousClass3(SetGroupManagerActivity setGroupManagerActivity) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuigroup.ui.page.SetGroupManagerActivity$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass4 implements View.OnClickListener {
        public final /* synthetic */ SetGroupManagerActivity this$0;

        public AnonymousClass4(SetGroupManagerActivity setGroupManagerActivity) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuigroup.ui.page.SetGroupManagerActivity$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass5 implements OnItemLongClickListener {
        public final /* synthetic */ SetGroupManagerActivity this$0;

        /* renamed from: com.tencent.qcloud.tuikit.tuigroup.ui.page.SetGroupManagerActivity$5$1  reason: invalid class name */
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

        /* renamed from: com.tencent.qcloud.tuikit.tuigroup.ui.page.SetGroupManagerActivity$5$2  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass2 implements View.OnClickListener {
            public final /* synthetic */ AnonymousClass5 this$1;
            public final /* synthetic */ GroupMemberInfo val$memberInfo;
            public final /* synthetic */ PopupWindow val$popupWindow;

            /* renamed from: com.tencent.qcloud.tuikit.tuigroup.ui.page.SetGroupManagerActivity$5$2$1  reason: invalid class name */
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
                public void onSuccess2(Void r1) {
                }
            }

            public AnonymousClass2(AnonymousClass5 anonymousClass5, PopupWindow popupWindow, GroupMemberInfo groupMemberInfo) {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        }

        public AnonymousClass5(SetGroupManagerActivity setGroupManagerActivity) {
        }

        @Override // com.tencent.qcloud.tuikit.tuigroup.ui.page.SetGroupManagerActivity.OnItemLongClickListener
        public void onClick(View view, GroupMemberInfo groupMemberInfo, int i2) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuigroup.ui.page.SetGroupManagerActivity$6  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass6 extends IUIKitCallback<Void> {
        public final /* synthetic */ SetGroupManagerActivity this$0;

        public AnonymousClass6(SetGroupManagerActivity setGroupManagerActivity) {
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
    public class ManagerAdapter extends RecyclerView.Adapter<ManagerViewHolder> {
        private List<GroupMemberInfo> groupMemberInfoList;
        private OnItemLongClickListener onItemLongClickListener;
        public final /* synthetic */ SetGroupManagerActivity this$0;

        /* renamed from: com.tencent.qcloud.tuikit.tuigroup.ui.page.SetGroupManagerActivity$ManagerAdapter$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass1 implements View.OnLongClickListener {
            public final /* synthetic */ ManagerAdapter this$1;
            public final /* synthetic */ GroupMemberInfo val$groupMemberInfo;
            public final /* synthetic */ int val$position;

            public AnonymousClass1(ManagerAdapter managerAdapter, GroupMemberInfo groupMemberInfo, int i2) {
            }

            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
            }
        }

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class ManagerViewHolder extends RecyclerView.ViewHolder {
            public ShadeImageView faceIcon;
            public TextView managerName;
            public final /* synthetic */ ManagerAdapter this$1;

            public ManagerViewHolder(@NonNull ManagerAdapter managerAdapter, View view) {
            }
        }

        public ManagerAdapter(SetGroupManagerActivity setGroupManagerActivity) {
        }

        public static /* synthetic */ OnItemLongClickListener access$1000(ManagerAdapter managerAdapter) {
        }

        public List<GroupMemberInfo> getGroupMemberInfoList() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public /* bridge */ /* synthetic */ void onBindViewHolder(@NonNull ManagerViewHolder managerViewHolder, int i2) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NonNull
        public /* bridge */ /* synthetic */ ManagerViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i2) {
        }

        public void setGroupMemberInfoList(List<GroupMemberInfo> list) {
        }

        public void setOnItemLongClickListener(OnItemLongClickListener onItemLongClickListener) {
        }

        /* renamed from: onBindViewHolder  reason: avoid collision after fix types in other method */
        public void onBindViewHolder2(@NonNull ManagerViewHolder managerViewHolder, int i2) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NonNull
        /* renamed from: onCreateViewHolder  reason: avoid collision after fix types in other method */
        public ManagerViewHolder onCreateViewHolder2(@NonNull ViewGroup viewGroup, int i2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface OnItemLongClickListener {
        void onClick(View view, GroupMemberInfo groupMemberInfo, int i2);
    }

    public static /* synthetic */ TextView access$000(SetGroupManagerActivity setGroupManagerActivity) {
    }

    public static /* synthetic */ ManagerAdapter access$100(SetGroupManagerActivity setGroupManagerActivity) {
    }

    public static /* synthetic */ String access$200(SetGroupManagerActivity setGroupManagerActivity) {
    }

    public static /* synthetic */ String access$202(SetGroupManagerActivity setGroupManagerActivity, String str) {
    }

    public static /* synthetic */ String access$300(SetGroupManagerActivity setGroupManagerActivity, GroupMemberInfo groupMemberInfo) {
    }

    public static /* synthetic */ ShadeImageView access$400(SetGroupManagerActivity setGroupManagerActivity) {
    }

    public static /* synthetic */ TextView access$500(SetGroupManagerActivity setGroupManagerActivity) {
    }

    public static /* synthetic */ GroupInfo access$600(SetGroupManagerActivity setGroupManagerActivity) {
    }

    public static /* synthetic */ void access$700(SetGroupManagerActivity setGroupManagerActivity) {
    }

    public static /* synthetic */ GroupManagerPresenter access$800(SetGroupManagerActivity setGroupManagerActivity) {
    }

    public static /* synthetic */ RecyclerView access$900(SetGroupManagerActivity setGroupManagerActivity) {
    }

    private String getDisplayName(GroupMemberInfo groupMemberInfo) {
    }

    private void loadGroupManager() {
    }

    private void loadGroupOwner() {
    }

    private void setClickListener() {
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i2, int i3, @Nullable Intent intent) {
    }

    @Override // com.tencent.qcloud.tuicore.component.activities.BaseLightActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
    }
}
