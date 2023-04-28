package com.tencent.qcloud.tuikit.tuichat.component.imagevideoscan;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.qcloud.tuikit.tuichat.bean.message.TUIMessageBean;
import com.tencent.qcloud.tuikit.tuichat.util.PermissionHelper;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class ImageVideoScanActivity extends Activity {
    private static final String TAG = null;
    private ImageVideoScanAdapter mAdapter;
    private TUIMessageBean mCurrentMessageBean;
    private ImageView mDownloadView;
    private List<TUIMessageBean> mForwardDataSource;
    private ImageVideoScanPresenter mImageVideoScanPresenter;
    private boolean mIsForwardMode;
    private ViewPagerLayoutManager mLayoutManager;
    private RecyclerView mRecyclerView;

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.component.imagevideoscan.ImageVideoScanActivity$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements View.OnClickListener {
        public final /* synthetic */ ImageVideoScanActivity this$0;

        /* renamed from: com.tencent.qcloud.tuikit.tuichat.component.imagevideoscan.ImageVideoScanActivity$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class C02111 implements PermissionHelper.PermissionCallback {
            public final /* synthetic */ AnonymousClass1 this$1;

            public C02111(AnonymousClass1 anonymousClass1) {
            }

            @Override // com.tencent.qcloud.tuikit.tuichat.util.PermissionHelper.PermissionCallback
            public void onDenied() {
            }

            @Override // com.tencent.qcloud.tuikit.tuichat.util.PermissionHelper.PermissionCallback
            public void onGranted() {
            }
        }

        public AnonymousClass1(ImageVideoScanActivity imageVideoScanActivity) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.component.imagevideoscan.ImageVideoScanActivity$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 implements OnItemClickListener {
        public final /* synthetic */ ImageVideoScanActivity this$0;

        public AnonymousClass2(ImageVideoScanActivity imageVideoScanActivity) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.component.imagevideoscan.ImageVideoScanActivity.OnItemClickListener
        public void onClickItem() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface OnItemClickListener {
        void onClickItem();
    }

    public static /* synthetic */ String access$000() {
    }

    public static /* synthetic */ ImageVideoScanPresenter access$100(ImageVideoScanActivity imageVideoScanActivity) {
    }

    private void initView() {
    }

    public void initData() {
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
    }

    @Override // android.app.Activity
    public void onPause() {
    }
}
