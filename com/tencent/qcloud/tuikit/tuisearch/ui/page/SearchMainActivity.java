package com.tencent.qcloud.tuikit.tuisearch.ui.page;

import android.os.Bundle;
import android.os.IBinder;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextWatcher;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.qcloud.tuicore.component.activities.BaseLightActivity;
import com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback;
import com.tencent.qcloud.tuikit.tuisearch.bean.SearchDataBean;
import com.tencent.qcloud.tuikit.tuisearch.presenter.SearchMainPresenter;
import com.tencent.qcloud.tuikit.tuisearch.ui.view.PageRecycleView;
import com.tencent.qcloud.tuikit.tuisearch.ui.view.SearchResultAdapter;
import java.util.ArrayList;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class SearchMainActivity extends BaseLightActivity {
    private static final String TAG = null;
    private TextView mCancleView;
    private RelativeLayout mContactLayout;
    private SearchResultAdapter mContactRcSearchAdapter;
    private List<SearchDataBean> mContactSearchData;
    private List<SearchDataBean> mConversationData;
    private RelativeLayout mConversationLayout;
    private PageRecycleView mConversationRcSearch;
    private SearchResultAdapter mConversationRcSearchAdapter;
    private EditText mEdtSearch;
    private RecyclerView mFriendRcSearch;
    private RelativeLayout mGroupLayout;
    private RecyclerView mGroupRcSearch;
    private SearchResultAdapter mGroupRcSearchAdapter;
    private List<SearchDataBean> mGroupSearchData;
    private ImageView mImgvDelete;
    private RelativeLayout mMoreContactLayout;
    private RelativeLayout mMoreConversationLayout;
    private RelativeLayout mMoreGroupLayout;
    private SearchMainPresenter presenter;

    /* renamed from: com.tencent.qcloud.tuikit.tuisearch.ui.page.SearchMainActivity$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements TextWatcher {
        public final /* synthetic */ SearchMainActivity this$0;

        public AnonymousClass1(SearchMainActivity searchMainActivity) {
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

    /* renamed from: com.tencent.qcloud.tuikit.tuisearch.ui.page.SearchMainActivity$10  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass10 extends ArrayList<String> {
        public final /* synthetic */ SearchMainActivity this$0;
        public final /* synthetic */ String val$keyWords;

        public AnonymousClass10(SearchMainActivity searchMainActivity, String str) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuisearch.ui.page.SearchMainActivity$11  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass11 extends IUIKitCallback<List<SearchDataBean>> {
        public final /* synthetic */ SearchMainActivity this$0;

        public AnonymousClass11(SearchMainActivity searchMainActivity) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public void onError(String str, int i2, String str2) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public /* bridge */ /* synthetic */ void onSuccess(List<SearchDataBean> list) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(List<SearchDataBean> list) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuisearch.ui.page.SearchMainActivity$12  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass12 extends IUIKitCallback<List<SearchDataBean>> {
        public final /* synthetic */ SearchMainActivity this$0;

        public AnonymousClass12(SearchMainActivity searchMainActivity) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public void onError(String str, int i2, String str2) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public /* bridge */ /* synthetic */ void onSuccess(List<SearchDataBean> list) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(List<SearchDataBean> list) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuisearch.ui.page.SearchMainActivity$13  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass13 extends IUIKitCallback<List<SearchDataBean>> {
        public final /* synthetic */ SearchMainActivity this$0;

        public AnonymousClass13(SearchMainActivity searchMainActivity) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public void onError(String str, int i2, String str2) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public /* bridge */ /* synthetic */ void onSuccess(List<SearchDataBean> list) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(List<SearchDataBean> list) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuisearch.ui.page.SearchMainActivity$14  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass14 extends ClickableSpan {
        public final /* synthetic */ SearchMainActivity this$0;

        public AnonymousClass14(SearchMainActivity searchMainActivity) {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuisearch.ui.page.SearchMainActivity$15  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass15 implements View.OnClickListener {
        public final /* synthetic */ SearchMainActivity this$0;

        public AnonymousClass15(SearchMainActivity searchMainActivity) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuisearch.ui.page.SearchMainActivity$16  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass16 implements View.OnClickListener {
        public final /* synthetic */ SearchMainActivity this$0;

        public AnonymousClass16(SearchMainActivity searchMainActivity) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuisearch.ui.page.SearchMainActivity$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 implements SearchResultAdapter.onItemClickListener {
        public final /* synthetic */ SearchMainActivity this$0;

        public AnonymousClass2(SearchMainActivity searchMainActivity) {
        }

        @Override // com.tencent.qcloud.tuikit.tuisearch.ui.view.SearchResultAdapter.onItemClickListener
        public void onClick(View view, int i2) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuisearch.ui.page.SearchMainActivity$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass3 implements SearchResultAdapter.onItemClickListener {
        public final /* synthetic */ SearchMainActivity this$0;

        public AnonymousClass3(SearchMainActivity searchMainActivity) {
        }

        @Override // com.tencent.qcloud.tuikit.tuisearch.ui.view.SearchResultAdapter.onItemClickListener
        public void onClick(View view, int i2) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuisearch.ui.page.SearchMainActivity$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass4 implements SearchResultAdapter.onItemClickListener {
        public final /* synthetic */ SearchMainActivity this$0;

        public AnonymousClass4(SearchMainActivity searchMainActivity) {
        }

        @Override // com.tencent.qcloud.tuikit.tuisearch.ui.view.SearchResultAdapter.onItemClickListener
        public void onClick(View view, int i2) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuisearch.ui.page.SearchMainActivity$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass5 implements View.OnClickListener {
        public final /* synthetic */ SearchMainActivity this$0;

        public AnonymousClass5(SearchMainActivity searchMainActivity) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuisearch.ui.page.SearchMainActivity$6  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass6 implements View.OnClickListener {
        public final /* synthetic */ SearchMainActivity this$0;

        public AnonymousClass6(SearchMainActivity searchMainActivity) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuisearch.ui.page.SearchMainActivity$7  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass7 implements View.OnClickListener {
        public final /* synthetic */ SearchMainActivity this$0;

        public AnonymousClass7(SearchMainActivity searchMainActivity) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuisearch.ui.page.SearchMainActivity$8  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass8 implements View.OnClickListener {
        public final /* synthetic */ SearchMainActivity this$0;

        public AnonymousClass8(SearchMainActivity searchMainActivity) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuisearch.ui.page.SearchMainActivity$9  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass9 implements View.OnClickListener {
        public final /* synthetic */ SearchMainActivity this$0;

        public AnonymousClass9(SearchMainActivity searchMainActivity) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    public static /* synthetic */ ImageView access$000(SearchMainActivity searchMainActivity) {
    }

    public static /* synthetic */ void access$100(SearchMainActivity searchMainActivity, String str) {
    }

    public static /* synthetic */ SearchResultAdapter access$1000(SearchMainActivity searchMainActivity) {
    }

    public static /* synthetic */ SearchResultAdapter access$1100(SearchMainActivity searchMainActivity) {
    }

    public static /* synthetic */ RelativeLayout access$1200(SearchMainActivity searchMainActivity) {
    }

    public static /* synthetic */ void access$1300(SearchMainActivity searchMainActivity) {
    }

    public static /* synthetic */ String access$1400() {
    }

    public static /* synthetic */ RelativeLayout access$1500(SearchMainActivity searchMainActivity) {
    }

    public static /* synthetic */ RelativeLayout access$1600(SearchMainActivity searchMainActivity) {
    }

    public static /* synthetic */ void access$1700(SearchMainActivity searchMainActivity, String str) {
    }

    public static /* synthetic */ void access$200(SearchMainActivity searchMainActivity, String str) {
    }

    public static /* synthetic */ List access$300(SearchMainActivity searchMainActivity) {
    }

    public static /* synthetic */ List access$302(SearchMainActivity searchMainActivity, List list) {
    }

    public static /* synthetic */ List access$400(SearchMainActivity searchMainActivity) {
    }

    public static /* synthetic */ List access$402(SearchMainActivity searchMainActivity, List list) {
    }

    public static /* synthetic */ SearchResultAdapter access$500(SearchMainActivity searchMainActivity) {
    }

    public static /* synthetic */ EditText access$600(SearchMainActivity searchMainActivity) {
    }

    public static /* synthetic */ RelativeLayout access$700(SearchMainActivity searchMainActivity) {
    }

    public static /* synthetic */ RelativeLayout access$800(SearchMainActivity searchMainActivity) {
    }

    public static /* synthetic */ RelativeLayout access$900(SearchMainActivity searchMainActivity) {
    }

    private void doChangeColor(String str) {
    }

    private void hideSoftInput(IBinder iBinder) {
    }

    private void init() {
    }

    private void initData(String str) {
    }

    private void initView() {
    }

    private boolean isShouldHideInput(View view, MotionEvent motionEvent) {
    }

    private void openWebUrl(String str) {
    }

    private void setListener() {
    }

    private void showNotSupportDialog() {
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
    }

    public void initPresenter() {
    }

    @Override // com.tencent.qcloud.tuicore.component.activities.BaseLightActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
    }
}
