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
import com.tencent.qcloud.tuicore.component.activities.BaseLightActivity;
import com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback;
import com.tencent.qcloud.tuikit.tuisearch.bean.SearchDataBean;
import com.tencent.qcloud.tuikit.tuisearch.presenter.SearchMoreMsgPresenter;
import com.tencent.qcloud.tuikit.tuisearch.ui.view.PageRecycleView;
import com.tencent.qcloud.tuikit.tuisearch.ui.view.SearchMoreMsgAdapter;
import java.util.ArrayList;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class SearchMoreMsgListActivity extends BaseLightActivity {
    private static final String TAG = null;
    private TextView mCancleView;
    private String mConversationId;
    private EditText mEdtSearch;
    private ImageView mImgvDelete;
    private boolean mIsGroup;
    private String mKeyWords;
    private RelativeLayout mMessageLayout;
    private PageRecycleView mMessageRcSearch;
    private SearchMoreMsgAdapter mMessageRcSearchAdapter;
    private SearchDataBean mSearchDataBean;
    private int pageIndex;
    private SearchMoreMsgPresenter presenter;

    /* renamed from: com.tencent.qcloud.tuikit.tuisearch.ui.page.SearchMoreMsgListActivity$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements TextWatcher {
        public final /* synthetic */ SearchMoreMsgListActivity this$0;

        public AnonymousClass1(SearchMoreMsgListActivity searchMoreMsgListActivity) {
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

    /* renamed from: com.tencent.qcloud.tuikit.tuisearch.ui.page.SearchMoreMsgListActivity$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 implements View.OnClickListener {
        public final /* synthetic */ SearchMoreMsgListActivity this$0;

        public AnonymousClass2(SearchMoreMsgListActivity searchMoreMsgListActivity) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuisearch.ui.page.SearchMoreMsgListActivity$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass3 implements SearchMoreMsgAdapter.onItemClickListener {
        public final /* synthetic */ SearchMoreMsgListActivity this$0;

        public AnonymousClass3(SearchMoreMsgListActivity searchMoreMsgListActivity) {
        }

        @Override // com.tencent.qcloud.tuikit.tuisearch.ui.view.SearchMoreMsgAdapter.onItemClickListener
        public void onClick(View view, int i2) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuisearch.ui.page.SearchMoreMsgListActivity$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass4 implements View.OnClickListener {
        public final /* synthetic */ SearchMoreMsgListActivity this$0;

        public AnonymousClass4(SearchMoreMsgListActivity searchMoreMsgListActivity) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuisearch.ui.page.SearchMoreMsgListActivity$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass5 implements PageRecycleView.OnLoadMoreHandler {
        public final /* synthetic */ SearchMoreMsgListActivity this$0;

        /* renamed from: com.tencent.qcloud.tuikit.tuisearch.ui.page.SearchMoreMsgListActivity$5$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass1 extends ArrayList<String> {
            public final /* synthetic */ AnonymousClass5 this$1;

            public AnonymousClass1(AnonymousClass5 anonymousClass5) {
            }
        }

        /* renamed from: com.tencent.qcloud.tuikit.tuisearch.ui.page.SearchMoreMsgListActivity$5$2  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass2 extends IUIKitCallback<List<SearchDataBean>> {
            public final /* synthetic */ AnonymousClass5 this$1;

            public AnonymousClass2(AnonymousClass5 anonymousClass5) {
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

        public AnonymousClass5(SearchMoreMsgListActivity searchMoreMsgListActivity) {
        }

        @Override // com.tencent.qcloud.tuikit.tuisearch.ui.view.PageRecycleView.OnLoadMoreHandler
        public boolean isListEnd(int i2) {
        }

        @Override // com.tencent.qcloud.tuikit.tuisearch.ui.view.PageRecycleView.OnLoadMoreHandler
        public void loadMore() {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuisearch.ui.page.SearchMoreMsgListActivity$6  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass6 implements View.OnClickListener {
        public final /* synthetic */ SearchMoreMsgListActivity this$0;

        public AnonymousClass6(SearchMoreMsgListActivity searchMoreMsgListActivity) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuisearch.ui.page.SearchMoreMsgListActivity$7  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass7 extends ArrayList<String> {
        public final /* synthetic */ SearchMoreMsgListActivity this$0;
        public final /* synthetic */ String val$keyWords;

        public AnonymousClass7(SearchMoreMsgListActivity searchMoreMsgListActivity, String str) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuisearch.ui.page.SearchMoreMsgListActivity$8  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass8 extends IUIKitCallback<List<SearchDataBean>> {
        public final /* synthetic */ SearchMoreMsgListActivity this$0;

        public AnonymousClass8(SearchMoreMsgListActivity searchMoreMsgListActivity) {
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

    public static /* synthetic */ ImageView access$000(SearchMoreMsgListActivity searchMoreMsgListActivity) {
    }

    public static /* synthetic */ String access$100(SearchMoreMsgListActivity searchMoreMsgListActivity) {
    }

    public static /* synthetic */ String access$1000(SearchMoreMsgListActivity searchMoreMsgListActivity) {
    }

    public static /* synthetic */ String access$102(SearchMoreMsgListActivity searchMoreMsgListActivity, String str) {
    }

    public static /* synthetic */ RelativeLayout access$1100(SearchMoreMsgListActivity searchMoreMsgListActivity) {
    }

    public static /* synthetic */ EditText access$1200(SearchMoreMsgListActivity searchMoreMsgListActivity) {
    }

    public static /* synthetic */ int access$200(SearchMoreMsgListActivity searchMoreMsgListActivity) {
    }

    public static /* synthetic */ int access$202(SearchMoreMsgListActivity searchMoreMsgListActivity, int i2) {
    }

    public static /* synthetic */ int access$204(SearchMoreMsgListActivity searchMoreMsgListActivity) {
    }

    public static /* synthetic */ PageRecycleView access$300(SearchMoreMsgListActivity searchMoreMsgListActivity) {
    }

    public static /* synthetic */ void access$400(SearchMoreMsgListActivity searchMoreMsgListActivity, String str) {
    }

    public static /* synthetic */ void access$500(SearchMoreMsgListActivity searchMoreMsgListActivity, String str) {
    }

    public static /* synthetic */ SearchDataBean access$600(SearchMoreMsgListActivity searchMoreMsgListActivity) {
    }

    public static /* synthetic */ String access$700() {
    }

    public static /* synthetic */ SearchMoreMsgAdapter access$800(SearchMoreMsgListActivity searchMoreMsgListActivity) {
    }

    public static /* synthetic */ SearchMoreMsgPresenter access$900(SearchMoreMsgListActivity searchMoreMsgListActivity) {
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
