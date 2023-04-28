package com.tencent.qcloud.tuikit.tuicontact.ui.pages;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.tencent.qcloud.tuicore.component.LineControllerView;
import com.tencent.qcloud.tuicore.component.TitleBarLayout;
import com.tencent.qcloud.tuicore.component.activities.BaseLightActivity;
import com.tencent.qcloud.tuicore.component.gatherimage.SynthesizedImageView;
import com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback;
import com.tencent.qcloud.tuicore.component.popupcard.PopupInputCard;
import com.tencent.qcloud.tuikit.tuicontact.bean.GroupInfo;
import com.tencent.qcloud.tuikit.tuicontact.bean.GroupMemberInfo;
import com.tencent.qcloud.tuikit.tuicontact.presenter.ContactPresenter;
import java.util.ArrayList;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class CreateGroupActivity extends BaseLightActivity implements View.OnClickListener {
    private static final int CHOOSE_AVATAR_REQUEST_CODE = 1;
    private static final int CHOOSE_GROUP_TYPE_REQUEST_CODE = 2;
    private static final String TAG = null;
    private TextView confirmButton;
    private SynthesizedImageView groupAvatar;
    private String groupAvatarImageId;
    private View groupAvatarLayout;
    private String groupAvatarUrl;
    private List<Object> groupAvatarUrlList;
    private String groupId;
    private LineControllerView groupIdLv;
    private String groupName;
    private LineControllerView groupNameLv;
    private String groupType;
    private TextView groupTypeContentUrlView;
    private TextView groupTypeContentView;
    private LineControllerView groupTypeLv;
    private int joinTypeIndex;
    private boolean mCreating;
    private ArrayList<GroupMemberInfo> mGroupMembers;
    private ContactPresenter presenter;
    private TitleBarLayout titleBarLayout;

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.ui.pages.CreateGroupActivity$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements View.OnClickListener {
        public final /* synthetic */ CreateGroupActivity this$0;

        public AnonymousClass1(CreateGroupActivity createGroupActivity) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.ui.pages.CreateGroupActivity$10  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass10 implements View.OnClickListener {
        public final /* synthetic */ CreateGroupActivity this$0;

        public AnonymousClass10(CreateGroupActivity createGroupActivity) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.ui.pages.CreateGroupActivity$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 extends ClickableSpan {
        public final /* synthetic */ CreateGroupActivity this$0;

        public AnonymousClass2(CreateGroupActivity createGroupActivity) {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.ui.pages.CreateGroupActivity$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass3 implements PopupInputCard.OnClickListener {
        public final /* synthetic */ CreateGroupActivity this$0;

        public AnonymousClass3(CreateGroupActivity createGroupActivity) {
        }

        @Override // com.tencent.qcloud.tuicore.component.popupcard.PopupInputCard.OnClickListener
        public void onClick(String str) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.ui.pages.CreateGroupActivity$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass4 implements PopupInputCard.OnTextExceedListener {
        public final /* synthetic */ CreateGroupActivity this$0;

        public AnonymousClass4(CreateGroupActivity createGroupActivity) {
        }

        @Override // com.tencent.qcloud.tuicore.component.popupcard.PopupInputCard.OnTextExceedListener
        public void onTextExceedMax() {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.ui.pages.CreateGroupActivity$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass5 implements PopupInputCard.OnClickListener {
        public final /* synthetic */ CreateGroupActivity this$0;

        public AnonymousClass5(CreateGroupActivity createGroupActivity) {
        }

        @Override // com.tencent.qcloud.tuicore.component.popupcard.PopupInputCard.OnClickListener
        public void onClick(String str) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.ui.pages.CreateGroupActivity$6  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass6 implements PopupInputCard.OnTextExceedListener {
        public final /* synthetic */ CreateGroupActivity this$0;

        public AnonymousClass6(CreateGroupActivity createGroupActivity) {
        }

        @Override // com.tencent.qcloud.tuicore.component.popupcard.PopupInputCard.OnTextExceedListener
        public void onTextExceedMax() {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.ui.pages.CreateGroupActivity$7  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass7 extends IUIKitCallback<String> {
        public final /* synthetic */ CreateGroupActivity this$0;
        public final /* synthetic */ GroupInfo val$groupInfo;

        public AnonymousClass7(CreateGroupActivity createGroupActivity, GroupInfo groupInfo) {
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

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.ui.pages.CreateGroupActivity$8  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass8 extends ClickableSpan {
        public final /* synthetic */ CreateGroupActivity this$0;

        public AnonymousClass8(CreateGroupActivity createGroupActivity) {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.ui.pages.CreateGroupActivity$9  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass9 implements View.OnClickListener {
        public final /* synthetic */ CreateGroupActivity this$0;

        public AnonymousClass9(CreateGroupActivity createGroupActivity) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    public static /* synthetic */ void access$000(CreateGroupActivity createGroupActivity) {
    }

    public static /* synthetic */ void access$100(CreateGroupActivity createGroupActivity, String str) {
    }

    public static /* synthetic */ String access$200(CreateGroupActivity createGroupActivity) {
    }

    public static /* synthetic */ String access$202(CreateGroupActivity createGroupActivity, String str) {
    }

    public static /* synthetic */ LineControllerView access$300(CreateGroupActivity createGroupActivity) {
    }

    public static /* synthetic */ LineControllerView access$400(CreateGroupActivity createGroupActivity) {
    }

    public static /* synthetic */ String access$502(CreateGroupActivity createGroupActivity, String str) {
    }

    public static /* synthetic */ boolean access$602(CreateGroupActivity createGroupActivity, boolean z) {
    }

    public static /* synthetic */ void access$700(CreateGroupActivity createGroupActivity) {
    }

    private void createGroupChat() {
    }

    private List<Object> fillGroupGridAvatar() {
    }

    private void initData() {
    }

    private void initGroupTypeContentView() {
    }

    private void openWebUrl(String str) {
    }

    private void setupViews() {
    }

    private void showNotSupportDialog() {
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i2, int i3, @Nullable Intent intent) {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    @Override // com.tencent.qcloud.tuicore.component.activities.BaseLightActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
    }
}
