package com.tencent.qcloud.tuikit.tuicontact.ui.pages;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.qcloud.tuicore.component.TitleBarLayout;
import com.tencent.qcloud.tuicore.component.activities.BaseLightActivity;
import com.tencent.qcloud.tuikit.tuicontact.bean.ContactItemBean;
import com.tencent.qcloud.tuikit.tuicontact.bean.GroupMemberInfo;
import com.tencent.qcloud.tuikit.tuicontact.presenter.ContactPresenter;
import com.tencent.qcloud.tuikit.tuicontact.ui.view.ContactListView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class StartGroupMemberSelectActivity extends BaseLightActivity {
    private static final String TAG = null;
    private ArrayList<String> alreadySelectedList;
    private TextView confirmButton;
    private int limit;
    private ContactListView mContactListView;
    private ArrayList<GroupMemberInfo> mMembers;
    private TitleBarLayout mTitleBar;
    private ContactPresenter presenter;
    private RecyclerView selectedList;
    private SelectedAdapter selectedListAdapter;

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.ui.pages.StartGroupMemberSelectActivity$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements View.OnClickListener {
        public final /* synthetic */ StartGroupMemberSelectActivity this$0;

        public AnonymousClass1(StartGroupMemberSelectActivity startGroupMemberSelectActivity) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.ui.pages.StartGroupMemberSelectActivity$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 implements View.OnClickListener {
        public final /* synthetic */ StartGroupMemberSelectActivity this$0;

        public AnonymousClass2(StartGroupMemberSelectActivity startGroupMemberSelectActivity) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.ui.pages.StartGroupMemberSelectActivity$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass3 implements ContactListView.OnItemClickListener {
        public final /* synthetic */ StartGroupMemberSelectActivity this$0;

        public AnonymousClass3(StartGroupMemberSelectActivity startGroupMemberSelectActivity) {
        }

        @Override // com.tencent.qcloud.tuikit.tuicontact.ui.view.ContactListView.OnItemClickListener
        public void onItemClick(int i2, ContactItemBean contactItemBean) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.ui.pages.StartGroupMemberSelectActivity$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass4 implements ContactListView.OnSelectChangedListener {
        public final /* synthetic */ StartGroupMemberSelectActivity this$0;

        public AnonymousClass4(StartGroupMemberSelectActivity startGroupMemberSelectActivity) {
        }

        @Override // com.tencent.qcloud.tuikit.tuicontact.ui.view.ContactListView.OnSelectChangedListener
        public void onSelectChanged(ContactItemBean contactItemBean, boolean z) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.ui.pages.StartGroupMemberSelectActivity$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass5 implements View.OnClickListener {
        public final /* synthetic */ StartGroupMemberSelectActivity this$0;

        public AnonymousClass5(StartGroupMemberSelectActivity startGroupMemberSelectActivity) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class SelectedAdapter extends RecyclerView.Adapter<SelectedViewHolder> {
        private List<GroupMemberInfo> mMembers;

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class SelectedViewHolder extends RecyclerView.ViewHolder {
            public final /* synthetic */ SelectedAdapter this$0;
            public ImageView userIconView;

            public SelectedViewHolder(@NonNull SelectedAdapter selectedAdapter, View view) {
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

    public static /* synthetic */ void access$000(StartGroupMemberSelectActivity startGroupMemberSelectActivity) {
    }

    public static /* synthetic */ ArrayList access$100(StartGroupMemberSelectActivity startGroupMemberSelectActivity) {
    }

    public static /* synthetic */ SelectedAdapter access$200(StartGroupMemberSelectActivity startGroupMemberSelectActivity) {
    }

    private void confirmAndFinish() {
    }

    private ArrayList<String> getMembersNameCard() {
    }

    private ArrayList<String> getMembersUserId() {
    }

    private void init() {
    }

    @Override // com.tencent.qcloud.tuicore.component.activities.BaseLightActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
    }
}
