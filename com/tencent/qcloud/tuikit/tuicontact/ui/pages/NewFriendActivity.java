package com.tencent.qcloud.tuikit.tuicontact.ui.pages;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.tencent.qcloud.tuicore.component.TitleBarLayout;
import com.tencent.qcloud.tuicore.component.activities.BaseLightActivity;
import com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback;
import com.tencent.qcloud.tuikit.tuicontact.bean.FriendApplicationBean;
import com.tencent.qcloud.tuikit.tuicontact.presenter.NewFriendPresenter;
import com.tencent.qcloud.tuikit.tuicontact.ui.interfaces.INewFriendActivity;
import com.tencent.qcloud.tuikit.tuicontact.ui.view.NewFriendListAdapter;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class NewFriendActivity extends BaseLightActivity implements INewFriendActivity {
    private static final String TAG = null;
    private NewFriendListAdapter mAdapter;
    private ListView mNewFriendLv;
    private TitleBarLayout mTitleBar;
    private TextView notFoundTip;
    private NewFriendPresenter presenter;

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.ui.pages.NewFriendActivity$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements View.OnClickListener {
        public final /* synthetic */ NewFriendActivity this$0;

        public AnonymousClass1(NewFriendActivity newFriendActivity) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.ui.pages.NewFriendActivity$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 extends IUIKitCallback<Void> {
        public final /* synthetic */ NewFriendActivity this$0;

        public AnonymousClass2(NewFriendActivity newFriendActivity) {
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

    private void init() {
    }

    private void initPendency() {
    }

    @Override // com.tencent.qcloud.tuicore.component.activities.BaseLightActivity, android.app.Activity
    public void finish() {
    }

    @Override // com.tencent.qcloud.tuicore.component.activities.BaseLightActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
    }

    @Override // com.tencent.qcloud.tuikit.tuicontact.ui.interfaces.INewFriendActivity
    public void onDataSourceChanged(List<FriendApplicationBean> list) {
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
    }
}
