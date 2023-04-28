package com.tencent.qcloud.tuikit.tuicontact.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.tencent.qcloud.tuicore.component.LineControllerView;
import com.tencent.qcloud.tuicore.component.TitleBarLayout;
import com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback;
import com.tencent.qcloud.tuikit.tuicontact.bean.ContactGroupApplyInfo;
import com.tencent.qcloud.tuikit.tuicontact.bean.ContactItemBean;
import com.tencent.qcloud.tuikit.tuicontact.bean.FriendApplicationBean;
import com.tencent.qcloud.tuikit.tuicontact.bean.GroupInfo;
import com.tencent.qcloud.tuikit.tuicontact.presenter.FriendProfilePresenter;
import com.tencent.qcloud.tuikit.tuicontact.ui.interfaces.IFriendProfileLayout;
import java.util.ArrayList;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class FriendProfileLayout extends LinearLayout implements View.OnClickListener, IFriendProfileLayout {
    private static final String TAG = null;
    private final int CHANGE_REMARK_CODE;
    private Button acceptFriendBtn;
    private View addFriendArea;
    private LineControllerView addFriendGroupLv;
    private LineControllerView addFriendRemarkLv;
    private Button addFriendSendBtn;
    private EditText addWordingEditText;
    private Button audioCallBtn;
    private Button chatBtn;
    private Button clearMessageBtn;
    private Button deleteFriendBtn;
    private TextView friendApplicationAddWording;
    private FriendApplicationBean friendApplicationBean;
    private View friendApplicationVerifyArea;
    private boolean isFriend;
    private boolean isGroup;
    private LineControllerView mAddBlackView;
    private String mAddWords;
    private LineControllerView mChatBackground;
    private LineControllerView mChatTopView;
    private ContactItemBean mContactInfo;
    private ImageView mHeadImageView;
    private TextView mIDView;
    private String mId;
    private OnButtonClickListener mListener;
    private LineControllerView mMessageOptionView;
    private TextView mNickNameView;
    private String mNickname;
    private String mRemark;
    private LineControllerView mRemarkView;
    private TextView mSignatureTagView;
    private TextView mSignatureView;
    private TitleBarLayout mTitleBar;
    private FriendProfilePresenter presenter;
    private Button refuseFriendBtn;
    private TextView remarkAndGroupTip;
    private Button videoCallBtn;

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.ui.view.FriendProfileLayout$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements View.OnClickListener {
        public final /* synthetic */ FriendProfileLayout this$0;

        public AnonymousClass1(FriendProfileLayout friendProfileLayout) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.ui.view.FriendProfileLayout$10  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass10 extends IUIKitCallback<Void> {
        public final /* synthetic */ FriendProfileLayout this$0;

        public AnonymousClass10(FriendProfileLayout friendProfileLayout) {
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

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.ui.view.FriendProfileLayout$11  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass11 extends IUIKitCallback<Void> {
        public final /* synthetic */ FriendProfileLayout this$0;

        public AnonymousClass11(FriendProfileLayout friendProfileLayout) {
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

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.ui.view.FriendProfileLayout$12  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass12 extends IUIKitCallback<Void> {
        public final /* synthetic */ FriendProfileLayout this$0;

        public AnonymousClass12(FriendProfileLayout friendProfileLayout) {
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

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.ui.view.FriendProfileLayout$13  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass13 extends IUIKitCallback<Void> {
        public final /* synthetic */ FriendProfileLayout this$0;

        public AnonymousClass13(FriendProfileLayout friendProfileLayout) {
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

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.ui.view.FriendProfileLayout$14  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass14 extends IUIKitCallback<Void> {
        public final /* synthetic */ FriendProfileLayout this$0;

        public AnonymousClass14(FriendProfileLayout friendProfileLayout) {
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

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.ui.view.FriendProfileLayout$15  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass15 implements View.OnClickListener {
        public final /* synthetic */ FriendProfileLayout this$0;

        public AnonymousClass15(FriendProfileLayout friendProfileLayout) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.ui.view.FriendProfileLayout$16  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass16 implements View.OnClickListener {
        public final /* synthetic */ FriendProfileLayout this$0;

        public AnonymousClass16(FriendProfileLayout friendProfileLayout) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.ui.view.FriendProfileLayout$17  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass17 extends IUIKitCallback<Void> {
        public final /* synthetic */ FriendProfileLayout this$0;

        public AnonymousClass17(FriendProfileLayout friendProfileLayout) {
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

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.ui.view.FriendProfileLayout$18  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass18 extends IUIKitCallback<Pair<Integer, String>> {
        public final /* synthetic */ FriendProfileLayout this$0;

        public AnonymousClass18(FriendProfileLayout friendProfileLayout) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public void onError(String str, int i2, String str2) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public /* bridge */ /* synthetic */ void onSuccess(Pair<Integer, String> pair) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(Pair<Integer, String> pair) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.ui.view.FriendProfileLayout$19  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass19 extends IUIKitCallback<String> {
        public final /* synthetic */ FriendProfileLayout this$0;
        public final /* synthetic */ String val$txt;

        public AnonymousClass19(FriendProfileLayout friendProfileLayout, String str) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public void onError(String str, int i2, String str2) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public /* bridge */ /* synthetic */ void onSuccess(String str) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(String str) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.ui.view.FriendProfileLayout$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 implements CompoundButton.OnCheckedChangeListener {
        public final /* synthetic */ FriendProfileLayout this$0;

        public AnonymousClass2(FriendProfileLayout friendProfileLayout) {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.ui.view.FriendProfileLayout$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass3 implements CompoundButton.OnCheckedChangeListener {
        public final /* synthetic */ FriendProfileLayout this$0;

        public AnonymousClass3(FriendProfileLayout friendProfileLayout) {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.ui.view.FriendProfileLayout$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass4 implements View.OnClickListener {
        public final /* synthetic */ FriendProfileLayout this$0;

        public AnonymousClass4(FriendProfileLayout friendProfileLayout) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.ui.view.FriendProfileLayout$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass5 implements View.OnClickListener {
        public final /* synthetic */ FriendProfileLayout this$0;

        public AnonymousClass5(FriendProfileLayout friendProfileLayout) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.ui.view.FriendProfileLayout$6  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass6 implements View.OnClickListener {
        public final /* synthetic */ FriendProfileLayout this$0;
        public final /* synthetic */ ContactGroupApplyInfo val$info;

        public AnonymousClass6(FriendProfileLayout friendProfileLayout, ContactGroupApplyInfo contactGroupApplyInfo) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.ui.view.FriendProfileLayout$7  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass7 implements View.OnClickListener {
        public final /* synthetic */ FriendProfileLayout this$0;
        public final /* synthetic */ ContactGroupApplyInfo val$info;

        public AnonymousClass7(FriendProfileLayout friendProfileLayout, ContactGroupApplyInfo contactGroupApplyInfo) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.ui.view.FriendProfileLayout$8  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass8 extends IUIKitCallback<Boolean> {
        public final /* synthetic */ FriendProfileLayout this$0;

        public AnonymousClass8(FriendProfileLayout friendProfileLayout) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public void onError(String str, int i2, String str2) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public /* bridge */ /* synthetic */ void onSuccess(Boolean bool) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(Boolean bool) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.ui.view.FriendProfileLayout$9  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass9 implements CompoundButton.OnCheckedChangeListener {
        public final /* synthetic */ FriendProfileLayout this$0;
        public final /* synthetic */ ArrayList val$userIdList;

        public AnonymousClass9(FriendProfileLayout friendProfileLayout, ArrayList arrayList) {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface OnButtonClickListener {
        void onDeleteFriendClick(String str);

        void onSetChatBackground();

        void onStartConversationClick(ContactItemBean contactItemBean);
    }

    public FriendProfileLayout(Context context) {
    }

    private /* synthetic */ void a(String str) {
    }

    private void accept() {
    }

    public static /* synthetic */ FriendProfilePresenter access$000(FriendProfileLayout friendProfileLayout) {
    }

    public static /* synthetic */ String access$100(FriendProfileLayout friendProfileLayout) {
    }

    public static /* synthetic */ ContactItemBean access$1000(FriendProfileLayout friendProfileLayout) {
    }

    public static /* synthetic */ void access$200(FriendProfileLayout friendProfileLayout) {
    }

    public static /* synthetic */ void access$300(FriendProfileLayout friendProfileLayout) {
    }

    public static /* synthetic */ void access$400(FriendProfileLayout friendProfileLayout) {
    }

    public static /* synthetic */ void access$500(FriendProfileLayout friendProfileLayout) {
    }

    public static /* synthetic */ LineControllerView access$600(FriendProfileLayout friendProfileLayout) {
    }

    public static /* synthetic */ Button access$700(FriendProfileLayout friendProfileLayout) {
    }

    public static /* synthetic */ Button access$800(FriendProfileLayout friendProfileLayout) {
    }

    public static /* synthetic */ OnButtonClickListener access$900(FriendProfileLayout friendProfileLayout) {
    }

    private void addBlack() {
    }

    private /* synthetic */ void c(String str) {
    }

    private void chat() {
    }

    private void delete() {
    }

    private void deleteBlack() {
    }

    private void init() {
    }

    private void initEvent() {
    }

    private void loadUserProfile(String str) {
    }

    private void modifyRemark(String str) {
    }

    private void refuse() {
    }

    private void setViewContentFromContactGroupApplyInfo(ContactGroupApplyInfo contactGroupApplyInfo) {
    }

    private void setViewContentFromFriendApplicationBean(FriendApplicationBean friendApplicationBean) {
    }

    private void setViewContentFromGroupInfo(GroupInfo groupInfo) {
    }

    private void setViewContentFromItemBean(ContactItemBean contactItemBean) {
    }

    private void setupCall() {
    }

    private void updateMessageOptionView() {
    }

    public void acceptJoinGroupApply(ContactGroupApplyInfo contactGroupApplyInfo) {
    }

    public /* synthetic */ void b(String str) {
    }

    public /* synthetic */ void d(String str) {
    }

    public void initData(Object obj) {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    @Override // com.tencent.qcloud.tuikit.tuicontact.ui.interfaces.IFriendProfileLayout
    public void onDataSourceChanged(ContactItemBean contactItemBean) {
    }

    public void refuseJoinGroupApply(ContactGroupApplyInfo contactGroupApplyInfo) {
    }

    public void setOnButtonClickListener(OnButtonClickListener onButtonClickListener) {
    }

    public void setPresenter(FriendProfilePresenter friendProfilePresenter) {
    }

    public FriendProfileLayout(Context context, @Nullable AttributeSet attributeSet) {
    }

    public FriendProfileLayout(Context context, @Nullable AttributeSet attributeSet, int i2) {
    }
}
