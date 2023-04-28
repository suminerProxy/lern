package com.tencent.qcloud.tuikit.tuicontact.ui.pages;

import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.tencent.qcloud.tuicore.component.activities.BaseLightActivity;
import com.tencent.qcloud.tuikit.tuicontact.bean.ContactItemBean;
import com.tencent.qcloud.tuikit.tuicontact.presenter.FriendProfilePresenter;
import com.tencent.qcloud.tuikit.tuicontact.ui.view.FriendProfileLayout;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class FriendProfileActivity extends BaseLightActivity {
    private FriendProfileLayout layout;
    private String mChatBackgroundThumbnailUrl;
    private String mChatId;
    private FriendProfilePresenter presenter;

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.ui.pages.FriendProfileActivity$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements FriendProfileLayout.OnButtonClickListener {
        public final /* synthetic */ FriendProfileActivity this$0;

        public AnonymousClass1(FriendProfileActivity friendProfileActivity) {
        }

        @Override // com.tencent.qcloud.tuikit.tuicontact.ui.view.FriendProfileLayout.OnButtonClickListener
        public void onDeleteFriendClick(String str) {
        }

        @Override // com.tencent.qcloud.tuikit.tuicontact.ui.view.FriendProfileLayout.OnButtonClickListener
        public void onSetChatBackground() {
        }

        @Override // com.tencent.qcloud.tuikit.tuicontact.ui.view.FriendProfileLayout.OnButtonClickListener
        public void onStartConversationClick(ContactItemBean contactItemBean) {
        }
    }

    public static /* synthetic */ String access$000(FriendProfileActivity friendProfileActivity) {
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i2, int i3, Intent intent) {
    }

    @Override // com.tencent.qcloud.tuicore.component.activities.BaseLightActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
    }
}
