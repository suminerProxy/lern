package com.tencent.qcloud.tuikit.tuicontact.ui.pages;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.tencent.qcloud.tuicore.component.TitleBarLayout;
import com.tencent.qcloud.tuicore.component.activities.BaseLightActivity;
import com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback;
import com.tencent.qcloud.tuikit.tuicontact.bean.ContactItemBean;
import com.tencent.qcloud.tuikit.tuicontact.bean.GroupInfo;
import com.tencent.qcloud.tuikit.tuicontact.presenter.AddMorePresenter;
import com.tencent.qcloud.tuikit.tuicontact.ui.interfaces.IAddMoreActivity;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class AddMoreActivity extends BaseLightActivity implements IAddMoreActivity {
    private static final String TAG = null;
    private View detailArea;
    private ImageView faceImgView;
    private TextView groupTypeTagView;
    private TextView groupTypeView;
    private TextView idLabel;
    private TextView idTextView;
    private boolean mIsGroup;
    private TitleBarLayout mTitleBar;
    private TextView nickNameView;
    private TextView notFoundTip;
    private AddMorePresenter presenter;
    private TextView searchBtn;
    private EditText searchEdit;

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.ui.pages.AddMoreActivity$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements View.OnClickListener {
        public final /* synthetic */ AddMoreActivity this$0;

        public AnonymousClass1(AddMoreActivity addMoreActivity) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.ui.pages.AddMoreActivity$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 implements View.OnClickListener {
        public final /* synthetic */ AddMoreActivity this$0;

        /* renamed from: com.tencent.qcloud.tuikit.tuicontact.ui.pages.AddMoreActivity$2$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass1 extends IUIKitCallback<GroupInfo> {
            public final /* synthetic */ AnonymousClass2 this$1;

            /* renamed from: com.tencent.qcloud.tuikit.tuicontact.ui.pages.AddMoreActivity$2$1$1  reason: invalid class name and collision with other inner class name */
            /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
            public class View$OnClickListenerC02321 implements View.OnClickListener {
                public final /* synthetic */ AnonymousClass1 this$2;
                public final /* synthetic */ GroupInfo val$data;

                public View$OnClickListenerC02321(AnonymousClass1 anonymousClass1, GroupInfo groupInfo) {
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                }
            }

            public AnonymousClass1(AnonymousClass2 anonymousClass2) {
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

        /* renamed from: com.tencent.qcloud.tuikit.tuicontact.ui.pages.AddMoreActivity$2$2  reason: invalid class name and collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class C02332 extends IUIKitCallback<ContactItemBean> {
            public final /* synthetic */ AnonymousClass2 this$1;

            /* renamed from: com.tencent.qcloud.tuikit.tuicontact.ui.pages.AddMoreActivity$2$2$1  reason: invalid class name */
            /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
            public class AnonymousClass1 implements View.OnClickListener {
                public final /* synthetic */ C02332 this$2;
                public final /* synthetic */ ContactItemBean val$data;

                public AnonymousClass1(C02332 c02332, ContactItemBean contactItemBean) {
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                }
            }

            public C02332(AnonymousClass2 anonymousClass2) {
            }

            @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
            public void onError(String str, int i2, String str2) {
            }

            @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
            public /* bridge */ /* synthetic */ void onSuccess(ContactItemBean contactItemBean) {
            }

            /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
            public void onSuccess2(ContactItemBean contactItemBean) {
            }
        }

        public AnonymousClass2(AddMoreActivity addMoreActivity) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.ui.pages.AddMoreActivity$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass3 implements View.OnFocusChangeListener {
        public final /* synthetic */ AddMoreActivity this$0;

        public AnonymousClass3(AddMoreActivity addMoreActivity) {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.ui.pages.AddMoreActivity$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass4 implements TextWatcher {
        public final /* synthetic */ AddMoreActivity this$0;

        public AnonymousClass4(AddMoreActivity addMoreActivity) {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }
    }

    public static /* synthetic */ TextView access$000(AddMoreActivity addMoreActivity) {
    }

    public static /* synthetic */ EditText access$100(AddMoreActivity addMoreActivity) {
    }

    public static /* synthetic */ boolean access$200(AddMoreActivity addMoreActivity) {
    }

    public static /* synthetic */ void access$300(AddMoreActivity addMoreActivity, GroupInfo groupInfo) {
    }

    public static /* synthetic */ View access$400(AddMoreActivity addMoreActivity) {
    }

    public static /* synthetic */ void access$500(AddMoreActivity addMoreActivity, boolean z) {
    }

    public static /* synthetic */ AddMorePresenter access$600(AddMoreActivity addMoreActivity) {
    }

    public static /* synthetic */ void access$700(AddMoreActivity addMoreActivity, String str, String str2, String str3) {
    }

    public static /* synthetic */ TextView access$800(AddMoreActivity addMoreActivity) {
    }

    private void setFriendDetail(String str, String str2, String str3) {
    }

    private void setGroupDetail(GroupInfo groupInfo) {
    }

    private void setNotFound(boolean z) {
    }

    @Override // com.tencent.qcloud.tuicore.component.activities.BaseLightActivity, android.app.Activity
    public void finish() {
    }

    @Override // com.tencent.qcloud.tuicore.component.activities.BaseLightActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
    }
}
