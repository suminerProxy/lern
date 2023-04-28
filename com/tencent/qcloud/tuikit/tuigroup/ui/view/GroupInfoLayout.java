package com.tencent.qcloud.tuikit.tuigroup.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.tencent.qcloud.tuicore.component.LineControllerView;
import com.tencent.qcloud.tuicore.component.TitleBarLayout;
import com.tencent.qcloud.tuicore.component.activities.SelectionActivity;
import com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback;
import com.tencent.qcloud.tuicore.component.popupcard.PopupInputCard;
import com.tencent.qcloud.tuikit.tuigroup.bean.GroupInfo;
import com.tencent.qcloud.tuikit.tuigroup.component.BottomSelectSheet;
import com.tencent.qcloud.tuikit.tuigroup.presenter.GroupInfoPresenter;
import com.tencent.qcloud.tuikit.tuigroup.ui.interfaces.IGroupMemberLayout;
import com.tencent.qcloud.tuikit.tuigroup.ui.interfaces.IGroupMemberListener;
import com.tencent.qcloud.tuikit.tuigroup.ui.page.GroupInfoFragment;
import com.tencent.qcloud.tuikit.tuigroup.ui.page.GroupNoticeActivity;
import java.util.ArrayList;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class GroupInfoLayout extends LinearLayout implements IGroupMemberLayout, View.OnClickListener {
    private static final String TAG = null;
    private View groupDetailArea;
    private TextView mChangeOwnerBtn;
    private LineControllerView mChatBackground;
    private TextView mClearMsgBtn;
    private TextView mDissolveBtn;
    private LineControllerView mFoldGroupChatSwitchView;
    private ImageView mGroupDetailArrow;
    private TextView mGroupIDView;
    private ImageView mGroupIcon;
    private GroupInfo mGroupInfo;
    private LineControllerView mGroupManageView;
    private TextView mGroupNameView;
    private View mGroupNotice;
    private TextView mGroupNoticeText;
    private LineControllerView mGroupTypeView;
    private LineControllerView mJoinTypeView;
    private ArrayList<String> mJoinTypes;
    private View mLayoutFold;
    private OnButtonClickListener mListener;
    private GroupInfoAdapter mMemberAdapter;
    private IGroupMemberListener mMemberPreviewListener;
    private LineControllerView mMemberView;
    private LineControllerView mMsgRevOptionSwitchView;
    private LineControllerView mNickView;
    private GroupInfoPresenter mPresenter;
    private TitleBarLayout mTitleBar;
    private LineControllerView mTopSwitchView;
    private GridView memberList;
    private GroupInfoFragment.OnModifyGroupAvatarListener onModifyGroupAvatarListener;

    /* renamed from: com.tencent.qcloud.tuikit.tuigroup.ui.view.GroupInfoLayout$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements View.OnClickListener {
        public final /* synthetic */ GroupInfoLayout this$0;

        public AnonymousClass1(GroupInfoLayout groupInfoLayout) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuigroup.ui.view.GroupInfoLayout$10  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass10 implements View.OnClickListener {
        public final /* synthetic */ GroupInfoLayout this$0;

        public AnonymousClass10(GroupInfoLayout groupInfoLayout) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuigroup.ui.view.GroupInfoLayout$11  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass11 implements View.OnClickListener {
        public final /* synthetic */ GroupInfoLayout this$0;

        public AnonymousClass11(GroupInfoLayout groupInfoLayout) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuigroup.ui.view.GroupInfoLayout$12  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass12 extends IUIKitCallback<GroupInfo> {
        public final /* synthetic */ GroupInfoLayout this$0;

        public AnonymousClass12(GroupInfoLayout groupInfoLayout) {
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

    /* renamed from: com.tencent.qcloud.tuikit.tuigroup.ui.view.GroupInfoLayout$13  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass13 implements CompoundButton.OnCheckedChangeListener {
        public final /* synthetic */ GroupInfoLayout this$0;

        /* renamed from: com.tencent.qcloud.tuikit.tuigroup.ui.view.GroupInfoLayout$13$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass1 extends IUIKitCallback<Void> {
            public final /* synthetic */ AnonymousClass13 this$1;
            public final /* synthetic */ boolean val$isChecked;

            /* renamed from: com.tencent.qcloud.tuikit.tuigroup.ui.view.GroupInfoLayout$13$1$1  reason: invalid class name and collision with other inner class name */
            /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
            public class C02351 extends IUIKitCallback<Void> {
                public final /* synthetic */ AnonymousClass1 this$2;

                public C02351(AnonymousClass1 anonymousClass1) {
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

            public AnonymousClass1(AnonymousClass13 anonymousClass13, boolean z) {
            }

            @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
            public void onError(String str, int i2, String str2) {
            }

            @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
            public /* bridge */ /* synthetic */ void onSuccess(Void r1) {
            }

            /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
            public void onSuccess2(Void r4) {
            }
        }

        public AnonymousClass13(GroupInfoLayout groupInfoLayout) {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuigroup.ui.view.GroupInfoLayout$14  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass14 implements CompoundButton.OnCheckedChangeListener {
        public final /* synthetic */ GroupInfoLayout this$0;

        /* renamed from: com.tencent.qcloud.tuikit.tuigroup.ui.view.GroupInfoLayout$14$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass1 extends IUIKitCallback<Void> {
            public final /* synthetic */ AnonymousClass14 this$1;
            public final /* synthetic */ boolean val$isChecked;

            /* renamed from: com.tencent.qcloud.tuikit.tuigroup.ui.view.GroupInfoLayout$14$1$1  reason: invalid class name and collision with other inner class name */
            /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
            public class C02361 extends IUIKitCallback<Void> {
                public final /* synthetic */ AnonymousClass1 this$2;

                public C02361(AnonymousClass1 anonymousClass1) {
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

            public AnonymousClass1(AnonymousClass14 anonymousClass14, boolean z) {
            }

            @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
            public void onError(String str, int i2, String str2) {
            }

            @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
            public /* bridge */ /* synthetic */ void onSuccess(Void r1) {
            }

            /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
            public void onSuccess2(Void r4) {
            }
        }

        public AnonymousClass14(GroupInfoLayout groupInfoLayout) {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuigroup.ui.view.GroupInfoLayout$15  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass15 extends IUIKitCallback<Void> {
        public final /* synthetic */ GroupInfoLayout this$0;
        public final /* synthetic */ String val$avatarUrl;

        public AnonymousClass15(GroupInfoLayout groupInfoLayout, String str) {
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

    /* renamed from: com.tencent.qcloud.tuikit.tuigroup.ui.view.GroupInfoLayout$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 implements CompoundButton.OnCheckedChangeListener {
        public final /* synthetic */ GroupInfoLayout this$0;

        /* renamed from: com.tencent.qcloud.tuikit.tuigroup.ui.view.GroupInfoLayout$2$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass1 extends IUIKitCallback<Void> {
            public final /* synthetic */ AnonymousClass2 this$1;
            public final /* synthetic */ CompoundButton val$buttonView;

            public AnonymousClass1(AnonymousClass2 anonymousClass2, CompoundButton compoundButton) {
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

        public AnonymousClass2(GroupInfoLayout groupInfoLayout) {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuigroup.ui.view.GroupInfoLayout$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass3 implements BottomSelectSheet.BottomSelectSheetOnClickListener {
        public final /* synthetic */ GroupInfoLayout this$0;
        public final /* synthetic */ String val$modifyGroupName;
        public final /* synthetic */ String val$modifyGroupNotice;
        public final /* synthetic */ PopupInputCard val$popupInputCard;

        public AnonymousClass3(GroupInfoLayout groupInfoLayout, PopupInputCard popupInputCard, String str, String str2) {
        }

        private /* synthetic */ void a(String str) {
        }

        private /* synthetic */ void c(String str) {
        }

        public /* synthetic */ void b(String str) {
        }

        public /* synthetic */ void d(String str) {
        }

        @Override // com.tencent.qcloud.tuikit.tuigroup.component.BottomSelectSheet.BottomSelectSheetOnClickListener
        public void onSheetClick(int i2) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuigroup.ui.view.GroupInfoLayout$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass4 implements GroupNoticeActivity.OnGroupNoticeChangedListener {
        public final /* synthetic */ GroupInfoLayout this$0;

        public AnonymousClass4(GroupInfoLayout groupInfoLayout) {
        }

        @Override // com.tencent.qcloud.tuikit.tuigroup.ui.page.GroupNoticeActivity.OnGroupNoticeChangedListener
        public void onChanged(String str) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuigroup.ui.view.GroupInfoLayout$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass5 implements SelectionActivity.OnResultReturnListener {
        public final /* synthetic */ GroupInfoLayout this$0;

        public AnonymousClass5(GroupInfoLayout groupInfoLayout) {
        }

        @Override // com.tencent.qcloud.tuicore.component.activities.SelectionActivity.OnResultReturnListener
        public void onReturn(Object obj) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuigroup.ui.view.GroupInfoLayout$6  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass6 implements View.OnClickListener {
        public final /* synthetic */ GroupInfoLayout this$0;

        public AnonymousClass6(GroupInfoLayout groupInfoLayout) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuigroup.ui.view.GroupInfoLayout$7  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass7 implements View.OnClickListener {
        public final /* synthetic */ GroupInfoLayout this$0;

        /* renamed from: com.tencent.qcloud.tuikit.tuigroup.ui.view.GroupInfoLayout$7$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass1 extends IUIKitCallback<Void> {
            public final /* synthetic */ AnonymousClass7 this$1;

            public AnonymousClass1(AnonymousClass7 anonymousClass7) {
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

        public AnonymousClass7(GroupInfoLayout groupInfoLayout) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuigroup.ui.view.GroupInfoLayout$8  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass8 implements View.OnClickListener {
        public final /* synthetic */ GroupInfoLayout this$0;

        public AnonymousClass8(GroupInfoLayout groupInfoLayout) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuigroup.ui.view.GroupInfoLayout$9  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass9 implements View.OnClickListener {
        public final /* synthetic */ GroupInfoLayout this$0;

        /* renamed from: com.tencent.qcloud.tuikit.tuigroup.ui.view.GroupInfoLayout$9$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass1 extends IUIKitCallback<Void> {
            public final /* synthetic */ AnonymousClass9 this$1;

            public AnonymousClass1(AnonymousClass9 anonymousClass9) {
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

        public AnonymousClass9(GroupInfoLayout groupInfoLayout) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface OnButtonClickListener {
        void onSetChatBackground();
    }

    public GroupInfoLayout(Context context) {
    }

    private /* synthetic */ void a(String str) {
    }

    public static /* synthetic */ GroupInfo access$000(GroupInfoLayout groupInfoLayout) {
    }

    public static /* synthetic */ GroupInfoPresenter access$100(GroupInfoLayout groupInfoLayout) {
    }

    public static /* synthetic */ TextView access$200(GroupInfoLayout groupInfoLayout) {
    }

    public static /* synthetic */ View access$300(GroupInfoLayout groupInfoLayout) {
    }

    public static /* synthetic */ TextView access$400(GroupInfoLayout groupInfoLayout) {
    }

    public static /* synthetic */ View access$500(GroupInfoLayout groupInfoLayout) {
    }

    public static /* synthetic */ LineControllerView access$600(GroupInfoLayout groupInfoLayout) {
    }

    public static /* synthetic */ LineControllerView access$700(GroupInfoLayout groupInfoLayout) {
    }

    private String convertGroupText(String str) {
    }

    private void init() {
    }

    private void initView() {
    }

    public /* synthetic */ void b(String str) {
    }

    public void getGroupMembers(GroupInfo groupInfo) {
    }

    @Override // com.tencent.qcloud.tuicore.component.interfaces.ILayout
    public TitleBarLayout getTitleBar() {
    }

    public void loadGroupInfo(String str) {
    }

    public void modifyGroupAvatar(String str) {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    @Override // com.tencent.qcloud.tuikit.tuigroup.ui.interfaces.IGroupMemberLayout
    public void onGroupInfoChanged(GroupInfo groupInfo) {
    }

    @Override // com.tencent.qcloud.tuikit.tuigroup.ui.interfaces.IGroupMemberLayout
    public void onGroupInfoModified(Object obj, int i2) {
    }

    public void setGroupInfo(GroupInfo groupInfo) {
    }

    public void setGroupInfoPresenter(GroupInfoPresenter groupInfoPresenter) {
    }

    public void setOnButtonClickListener(OnButtonClickListener onButtonClickListener) {
    }

    public void setOnModifyGroupAvatarListener(GroupInfoFragment.OnModifyGroupAvatarListener onModifyGroupAvatarListener) {
    }

    @Override // com.tencent.qcloud.tuicore.component.interfaces.ILayout
    public void setParentLayout(Object obj) {
    }

    public void setRouter(IGroupMemberListener iGroupMemberListener) {
    }

    public GroupInfoLayout(Context context, @Nullable AttributeSet attributeSet) {
    }

    public GroupInfoLayout(Context context, @Nullable AttributeSet attributeSet, int i2) {
    }
}
