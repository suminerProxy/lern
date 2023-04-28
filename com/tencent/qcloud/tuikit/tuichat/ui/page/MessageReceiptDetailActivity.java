package com.tencent.qcloud.tuikit.tuichat.ui.page;

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
import com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback;
import com.tencent.qcloud.tuikit.tuichat.bean.ChatInfo;
import com.tencent.qcloud.tuikit.tuichat.bean.GroupMemberInfo;
import com.tencent.qcloud.tuikit.tuichat.bean.MessageReceiptInfo;
import com.tencent.qcloud.tuikit.tuichat.bean.message.GroupMessageReadMembersInfo;
import com.tencent.qcloud.tuikit.tuichat.bean.message.TUIMessageBean;
import com.tencent.qcloud.tuikit.tuichat.presenter.MessageReceiptPresenter;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class MessageReceiptDetailActivity extends BaseLightActivity {
    private static final String TAG = null;
    private View c2cDetailArea;
    private ChatInfo chatInfo;
    private View groupDetailArea;
    private TUIMessageBean messageBean;
    private TextView msgAbstract;
    private ImageView msgAbstractImg;
    private TextView nameTv;
    private MessageReceiptPresenter presenter;
    private MemberAdapter readAdapter;
    private boolean readFinished;
    private RecyclerView readList;
    private boolean readLoading;
    private final List<GroupMemberInfo> readMemberList;
    private long readNextSeq;
    private View readTitle;
    private View readTitleLine;
    private TextView readTitleTv;
    private TextView timeTv;
    private TitleBarLayout titleBarLayout;
    private MemberAdapter unreadAdapter;
    private boolean unreadFinished;
    private RecyclerView unreadList;
    private boolean unreadLoading;
    private final List<GroupMemberInfo> unreadMemberList;
    private long unreadNextSeq;
    private View unreadTitle;
    private View unreadTitleLine;
    private TextView unreadTitleTv;
    private ImageView userFace;
    private TextView userName;

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.page.MessageReceiptDetailActivity$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements View.OnClickListener {
        public final /* synthetic */ MessageReceiptDetailActivity this$0;

        public AnonymousClass1(MessageReceiptDetailActivity messageReceiptDetailActivity) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.page.MessageReceiptDetailActivity$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 implements View.OnClickListener {
        public final /* synthetic */ MessageReceiptDetailActivity this$0;

        public AnonymousClass2(MessageReceiptDetailActivity messageReceiptDetailActivity) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.page.MessageReceiptDetailActivity$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass3 implements View.OnClickListener {
        public final /* synthetic */ MessageReceiptDetailActivity this$0;

        public AnonymousClass3(MessageReceiptDetailActivity messageReceiptDetailActivity) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.page.MessageReceiptDetailActivity$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass4 extends IUIKitCallback<List<MessageReceiptInfo>> {
        public final /* synthetic */ MessageReceiptDetailActivity this$0;

        public AnonymousClass4(MessageReceiptDetailActivity messageReceiptDetailActivity) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public void onError(String str, int i2, String str2) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public /* bridge */ /* synthetic */ void onSuccess(List<MessageReceiptInfo> list) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(List<MessageReceiptInfo> list) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.page.MessageReceiptDetailActivity$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass5 extends RecyclerView.OnScrollListener {
        public final /* synthetic */ MessageReceiptDetailActivity this$0;

        public AnonymousClass5(MessageReceiptDetailActivity messageReceiptDetailActivity) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i2) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.page.MessageReceiptDetailActivity$6  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass6 extends RecyclerView.OnScrollListener {
        public final /* synthetic */ MessageReceiptDetailActivity this$0;

        public AnonymousClass6(MessageReceiptDetailActivity messageReceiptDetailActivity) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i2) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.page.MessageReceiptDetailActivity$7  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass7 implements View.OnClickListener {
        public final /* synthetic */ MessageReceiptDetailActivity this$0;
        public final /* synthetic */ String val$userId;

        public AnonymousClass7(MessageReceiptDetailActivity messageReceiptDetailActivity, String str) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.page.MessageReceiptDetailActivity$8  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass8 extends IUIKitCallback<GroupMessageReadMembersInfo> {
        public final /* synthetic */ MessageReceiptDetailActivity this$0;

        public AnonymousClass8(MessageReceiptDetailActivity messageReceiptDetailActivity) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public void onError(String str, int i2, String str2) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public /* bridge */ /* synthetic */ void onSuccess(GroupMessageReadMembersInfo groupMessageReadMembersInfo) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(GroupMessageReadMembersInfo groupMessageReadMembersInfo) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.page.MessageReceiptDetailActivity$9  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass9 extends IUIKitCallback<GroupMessageReadMembersInfo> {
        public final /* synthetic */ MessageReceiptDetailActivity this$0;

        public AnonymousClass9(MessageReceiptDetailActivity messageReceiptDetailActivity) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public void onError(String str, int i2, String str2) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public /* bridge */ /* synthetic */ void onSuccess(GroupMessageReadMembersInfo groupMessageReadMembersInfo) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(GroupMessageReadMembersInfo groupMessageReadMembersInfo) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class MemberAdapter extends RecyclerView.Adapter<MemberViewHolder> {
        private List<GroupMemberInfo> data;

        /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.page.MessageReceiptDetailActivity$MemberAdapter$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass1 implements View.OnClickListener {
            public final /* synthetic */ MemberAdapter this$0;
            public final /* synthetic */ GroupMemberInfo val$memberInfo;

            public AnonymousClass1(MemberAdapter memberAdapter, GroupMemberInfo groupMemberInfo) {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        }

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public static class MemberViewHolder extends RecyclerView.ViewHolder {
            private final ImageView face;
            private final TextView name;

            public MemberViewHolder(@NonNull View view) {
            }

            public static /* synthetic */ ImageView access$1900(MemberViewHolder memberViewHolder) {
            }

            public static /* synthetic */ TextView access$2000(MemberViewHolder memberViewHolder) {
            }
        }

        private String getDisplayName(GroupMemberInfo groupMemberInfo) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public /* bridge */ /* synthetic */ void onBindViewHolder(@NonNull MemberViewHolder memberViewHolder, int i2) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NonNull
        public /* bridge */ /* synthetic */ MemberViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i2) {
        }

        public void setData(List<GroupMemberInfo> list) {
        }

        /* renamed from: onBindViewHolder  reason: avoid collision after fix types in other method */
        public void onBindViewHolder2(@NonNull MemberViewHolder memberViewHolder, int i2) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NonNull
        /* renamed from: onCreateViewHolder  reason: avoid collision after fix types in other method */
        public MemberViewHolder onCreateViewHolder2(@NonNull ViewGroup viewGroup, int i2) {
        }
    }

    public static /* synthetic */ View access$000(MessageReceiptDetailActivity messageReceiptDetailActivity) {
    }

    public static /* synthetic */ TextView access$100(MessageReceiptDetailActivity messageReceiptDetailActivity) {
    }

    public static /* synthetic */ long access$1000(MessageReceiptDetailActivity messageReceiptDetailActivity) {
    }

    public static /* synthetic */ long access$1002(MessageReceiptDetailActivity messageReceiptDetailActivity, long j2) {
    }

    public static /* synthetic */ void access$1100(MessageReceiptDetailActivity messageReceiptDetailActivity, long j2) {
    }

    public static /* synthetic */ List access$1200(MessageReceiptDetailActivity messageReceiptDetailActivity) {
    }

    public static /* synthetic */ MemberAdapter access$1300(MessageReceiptDetailActivity messageReceiptDetailActivity) {
    }

    public static /* synthetic */ boolean access$1402(MessageReceiptDetailActivity messageReceiptDetailActivity, boolean z) {
    }

    public static /* synthetic */ String access$1500() {
    }

    public static /* synthetic */ List access$1600(MessageReceiptDetailActivity messageReceiptDetailActivity) {
    }

    public static /* synthetic */ MemberAdapter access$1700(MessageReceiptDetailActivity messageReceiptDetailActivity) {
    }

    public static /* synthetic */ boolean access$1802(MessageReceiptDetailActivity messageReceiptDetailActivity, boolean z) {
    }

    public static /* synthetic */ RecyclerView access$200(MessageReceiptDetailActivity messageReceiptDetailActivity) {
    }

    public static /* synthetic */ RecyclerView access$300(MessageReceiptDetailActivity messageReceiptDetailActivity) {
    }

    public static /* synthetic */ View access$400(MessageReceiptDetailActivity messageReceiptDetailActivity) {
    }

    public static /* synthetic */ TextView access$500(MessageReceiptDetailActivity messageReceiptDetailActivity) {
    }

    public static /* synthetic */ boolean access$600(MessageReceiptDetailActivity messageReceiptDetailActivity) {
    }

    public static /* synthetic */ boolean access$602(MessageReceiptDetailActivity messageReceiptDetailActivity, boolean z) {
    }

    public static /* synthetic */ long access$700(MessageReceiptDetailActivity messageReceiptDetailActivity) {
    }

    public static /* synthetic */ long access$702(MessageReceiptDetailActivity messageReceiptDetailActivity, long j2) {
    }

    public static /* synthetic */ void access$800(MessageReceiptDetailActivity messageReceiptDetailActivity, long j2) {
    }

    public static /* synthetic */ boolean access$900(MessageReceiptDetailActivity messageReceiptDetailActivity) {
    }

    public static /* synthetic */ boolean access$902(MessageReceiptDetailActivity messageReceiptDetailActivity, boolean z) {
    }

    private ViewGroup.LayoutParams getImageParams(ViewGroup.LayoutParams layoutParams, TUIMessageBean tUIMessageBean) {
    }

    private void initData() {
    }

    private void initView() {
    }

    private void loadGroupMessageReadMembers(long j2) {
    }

    private void loadGroupMessageUnreadMembers(long j2) {
    }

    private void setMsgAbstract() {
    }

    private void setUserDetail(TUIMessageBean tUIMessageBean) {
    }

    public boolean isLastItemVisibleCompleted(RecyclerView recyclerView) {
    }

    @Override // com.tencent.qcloud.tuicore.component.activities.BaseLightActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
    }
}
