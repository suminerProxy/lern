package com.tencent.qcloud.tuikit.tuisearch.ui.page;

import android.os.Bundle;
import android.os.IBinder;
import android.text.Editable;
import android.text.TextWatcher;
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
public class SearchMoreListActivity extends BaseLightActivity {
    private static final String TAG = null;
    private TextView mCancleView;
    private RelativeLayout mContactLayout;
    private SearchResultAdapter mContactRcSearchAdapter;
    private RelativeLayout mConversationLayout;
    private PageRecycleView mConversationRcSearch;
    private SearchResultAdapter mConversationRcSearchAdapter;
    private EditText mEdtSearch;
    private RecyclerView mFriendRcSearch;
    private RelativeLayout mGroupLayout;
    private RecyclerView mGroupRcSearch;
    private SearchResultAdapter mGroupRcSearchAdapter;
    private ImageView mImgvDelete;
    private String mKeyWords;
    private RelativeLayout mMoreContactLayout;
    private RelativeLayout mMoreConversationLayout;
    private RelativeLayout mMoreGroupLayout;
    private int mViewType;
    private int pageIndex;
    private SearchMainPresenter presenter;

    /* renamed from: com.tencent.qcloud.tuikit.tuisearch.ui.page.SearchMoreListActivity$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements TextWatcher {
        public final /* synthetic */ SearchMoreListActivity this$0;

        public AnonymousClass1(SearchMoreListActivity searchMoreListActivity) {
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

    /* renamed from: com.tencent.qcloud.tuikit.tuisearch.ui.page.SearchMoreListActivity$10  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass10 extends IUIKitCallback<List<SearchDataBean>> {
        public final /* synthetic */ SearchMoreListActivity this$0;

        public AnonymousClass10(SearchMoreListActivity searchMoreListActivity) {
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

    /* renamed from: com.tencent.qcloud.tuikit.tuisearch.ui.page.SearchMoreListActivity$11  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass11 extends IUIKitCallback<List<SearchDataBean>> {
        public final /* synthetic */ SearchMoreListActivity this$0;

        public AnonymousClass11(SearchMoreListActivity searchMoreListActivity) {
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

    /* renamed from: com.tencent.qcloud.tuikit.tuisearch.ui.page.SearchMoreListActivity$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 implements View.OnClickListener {
        public final /* synthetic */ SearchMoreListActivity this$0;

        public AnonymousClass2(SearchMoreListActivity searchMoreListActivity) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuisearch.ui.page.SearchMoreListActivity$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass3 implements SearchResultAdapter.onItemClickListener {
        public final /* synthetic */ SearchMoreListActivity this$0;

        public AnonymousClass3(SearchMoreListActivity searchMoreListActivity) {
        }

        @Override // com.tencent.qcloud.tuikit.tuisearch.ui.view.SearchResultAdapter.onItemClickListener
        public void onClick(View view, int i2) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuisearch.ui.page.SearchMoreListActivity$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass4 implements SearchResultAdapter.onItemClickListener {
        public final /* synthetic */ SearchMoreListActivity this$0;

        public AnonymousClass4(SearchMoreListActivity searchMoreListActivity) {
        }

        @Override // com.tencent.qcloud.tuikit.tuisearch.ui.view.SearchResultAdapter.onItemClickListener
        public void onClick(View view, int i2) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuisearch.ui.page.SearchMoreListActivity$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass5 implements SearchResultAdapter.onItemClickListener {
        public final /* synthetic */ SearchMoreListActivity this$0;

        public AnonymousClass5(SearchMoreListActivity searchMoreListActivity) {
        }

        @Override // com.tencent.qcloud.tuikit.tuisearch.ui.view.SearchResultAdapter.onItemClickListener
        public void onClick(View view, int i2) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuisearch.ui.page.SearchMoreListActivity$6  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass6 implements PageRecycleView.OnLoadMoreHandler {
        public final /* synthetic */ SearchMoreListActivity this$0;

        /* renamed from: com.tencent.qcloud.tuikit.tuisearch.ui.page.SearchMoreListActivity$6$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass1 extends ArrayList<String> {
            public final /* synthetic */ AnonymousClass6 this$1;

            public AnonymousClass1(AnonymousClass6 anonymousClass6) {
            }
        }

        /* renamed from: com.tencent.qcloud.tuikit.tuisearch.ui.page.SearchMoreListActivity$6$2  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass2 extends IUIKitCallback<List<SearchDataBean>> {
            public final /* synthetic */ AnonymousClass6 this$1;

            public AnonymousClass2(AnonymousClass6 anonymousClass6) {
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

        public AnonymousClass6(SearchMoreListActivity searchMoreListActivity) {
        }

        @Override // com.tencent.qcloud.tuikit.tuisearch.ui.view.PageRecycleView.OnLoadMoreHandler
        public boolean isListEnd(int i2) {
        }

        @Override // com.tencent.qcloud.tuikit.tuisearch.ui.view.PageRecycleView.OnLoadMoreHandler
        public void loadMore() {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuisearch.ui.page.SearchMoreListActivity$7  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass7 implements View.OnClickListener {
        public final /* synthetic */ SearchMoreListActivity this$0;

        public AnonymousClass7(SearchMoreListActivity searchMoreListActivity) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuisearch.ui.page.SearchMoreListActivity$8  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass8 extends ArrayList<String> {
        public final /* synthetic */ SearchMoreListActivity this$0;
        public final /* synthetic */ String val$keyWords;

        public AnonymousClass8(SearchMoreListActivity searchMoreListActivity, String str) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuisearch.ui.page.SearchMoreListActivity$9  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass9 extends IUIKitCallback<List<SearchDataBean>> {
        public final /* synthetic */ SearchMoreListActivity this$0;

        public AnonymousClass9(SearchMoreListActivity searchMoreListActivity) {
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

    public static /* synthetic */ ImageView access$000(SearchMoreListActivity searchMoreListActivity) {
    }

    public static /* synthetic */ String access$100(SearchMoreListActivity searchMoreListActivity) {
    }

    public static /* synthetic */ RelativeLayout access$1000(SearchMoreListActivity searchMoreListActivity) {
    }

    public static /* synthetic */ String access$102(SearchMoreListActivity searchMoreListActivity, String str) {
    }

    public static /* synthetic */ RelativeLayout access$1100(SearchMoreListActivity searchMoreListActivity) {
    }

    public static /* synthetic */ SearchMainPresenter access$1200(SearchMoreListActivity searchMoreListActivity) {
    }

    public static /* synthetic */ RelativeLayout access$1300(SearchMoreListActivity searchMoreListActivity) {
    }

    public static /* synthetic */ RelativeLayout access$1400(SearchMoreListActivity searchMoreListActivity) {
    }

    public static /* synthetic */ String access$1500() {
    }

    public static /* synthetic */ int access$200(SearchMoreListActivity searchMoreListActivity) {
    }

    public static /* synthetic */ int access$202(SearchMoreListActivity searchMoreListActivity, int i2) {
    }

    public static /* synthetic */ int access$204(SearchMoreListActivity searchMoreListActivity) {
    }

    public static /* synthetic */ PageRecycleView access$300(SearchMoreListActivity searchMoreListActivity) {
    }

    public static /* synthetic */ void access$400(SearchMoreListActivity searchMoreListActivity, String str) {
    }

    public static /* synthetic */ void access$500(SearchMoreListActivity searchMoreListActivity, String str) {
    }

    public static /* synthetic */ SearchResultAdapter access$600(SearchMoreListActivity searchMoreListActivity) {
    }

    public static /* synthetic */ SearchResultAdapter access$700(SearchMoreListActivity searchMoreListActivity) {
    }

    public static /* synthetic */ SearchResultAdapter access$800(SearchMoreListActivity searchMoreListActivity) {
    }

    public static /* synthetic */ EditText access$900(SearchMoreListActivity searchMoreListActivity) {
    }

    private void doChangeColor(String str) {
    }

    private void hideSoftInput(IBinder iBinder) {
    }

    private void init() {
    }

    private void initData(String str) {
    }

    private void initPresenter() {
    }

    private void initView() {
    }

    private boolean isShouldHideInput(View view, MotionEvent motionEvent) {
    }

    private void setListener() {
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
    }

    @Override // com.tencent.qcloud.tuicore.component.activities.BaseLightActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
    }
}
