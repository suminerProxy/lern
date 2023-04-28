package com.tencent.qcloud.tuikit.tuigroup.ui.page;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import com.tencent.qcloud.tuicore.component.TitleBarLayout;
import com.tencent.qcloud.tuicore.component.activities.BaseLightActivity;
import com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback;
import com.tencent.qcloud.tuikit.tuigroup.bean.GroupInfo;
import com.tencent.qcloud.tuikit.tuigroup.presenter.GroupManagerPresenter;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class GroupNoticeActivity extends BaseLightActivity {
    private static OnGroupNoticeChangedListener changedListener;
    private EditText editText;
    private GroupInfo groupInfo;
    private boolean isEditModel;
    private GroupManagerPresenter presenter;
    private TitleBarLayout titleBarLayout;

    /* renamed from: com.tencent.qcloud.tuikit.tuigroup.ui.page.GroupNoticeActivity$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements View.OnClickListener {
        public final /* synthetic */ GroupNoticeActivity this$0;

        public AnonymousClass1(GroupNoticeActivity groupNoticeActivity) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuigroup.ui.page.GroupNoticeActivity$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 implements View.OnClickListener {
        public final /* synthetic */ GroupNoticeActivity this$0;

        public AnonymousClass2(GroupNoticeActivity groupNoticeActivity) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuigroup.ui.page.GroupNoticeActivity$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass3 extends IUIKitCallback<Void> {
        public final /* synthetic */ GroupNoticeActivity this$0;
        public final /* synthetic */ String val$groupNotice;

        public AnonymousClass3(GroupNoticeActivity groupNoticeActivity, String str) {
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

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface OnGroupNoticeChangedListener {
        void onChanged(String str);
    }

    public static /* synthetic */ boolean access$000(GroupNoticeActivity groupNoticeActivity) {
    }

    public static /* synthetic */ boolean access$002(GroupNoticeActivity groupNoticeActivity, boolean z) {
    }

    public static /* synthetic */ TitleBarLayout access$100(GroupNoticeActivity groupNoticeActivity) {
    }

    public static /* synthetic */ EditText access$200(GroupNoticeActivity groupNoticeActivity) {
    }

    public static /* synthetic */ void access$300(GroupNoticeActivity groupNoticeActivity) {
    }

    public static /* synthetic */ void access$400(GroupNoticeActivity groupNoticeActivity, String str) {
    }

    public static /* synthetic */ GroupInfo access$500(GroupNoticeActivity groupNoticeActivity) {
    }

    public static /* synthetic */ OnGroupNoticeChangedListener access$600() {
    }

    private int getNavigateBarHeight() {
    }

    private boolean isSoftInputShown() {
    }

    private void setGroupNotice(String str) {
    }

    public static void setOnGroupNoticeChangedListener(OnGroupNoticeChangedListener onGroupNoticeChangedListener) {
    }

    private void showSoftInput() {
    }

    @Override // com.tencent.qcloud.tuicore.component.activities.BaseLightActivity
    public void hideSoftInput() {
    }

    @Override // com.tencent.qcloud.tuicore.component.activities.BaseLightActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
    }
}
