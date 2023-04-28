package com.tencent.qcloud.tuikit.tuichat.component.imagevideoscan;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback;
import com.tencent.qcloud.tuicore.interfaces.ITUINotification;
import com.tencent.qcloud.tuikit.tuichat.bean.message.TUIMessageBean;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class ImageVideoScanPresenter {
    private static final String TAG = "ImageVideoScanPresenter";
    private static MessageChangedListener messageChangedListener;
    private ImageVideoScanAdapter mAdapter;
    private String mChatID;
    private int mCurrentPosition;
    private ImageVideoScanProvider mImageVideoScanProvider;
    private int mIndex;
    private boolean mIsForwardMode;
    private RecyclerView mRecyclerView;
    private ViewPagerLayoutManager mViewPagerLayoutManager;

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.component.imagevideoscan.ImageVideoScanPresenter$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 extends IUIKitCallback<List<TUIMessageBean>> {
        public final /* synthetic */ ImageVideoScanPresenter this$0;
        public final /* synthetic */ TUIMessageBean val$messageBean;

        public AnonymousClass1(ImageVideoScanPresenter imageVideoScanPresenter, TUIMessageBean tUIMessageBean) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public void onError(String str, int i2, String str2) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public /* bridge */ /* synthetic */ void onSuccess(List<TUIMessageBean> list) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(List<TUIMessageBean> list) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.component.imagevideoscan.ImageVideoScanPresenter$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 implements OnViewPagerListener {
        public final /* synthetic */ ImageVideoScanPresenter this$0;
        public final /* synthetic */ TUIMessageBean val$messageBean;

        /* renamed from: com.tencent.qcloud.tuikit.tuichat.component.imagevideoscan.ImageVideoScanPresenter$2$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass1 extends IUIKitCallback<List<TUIMessageBean>> {
            public final /* synthetic */ AnonymousClass2 this$1;
            public final /* synthetic */ int val$position;

            public AnonymousClass1(AnonymousClass2 anonymousClass2, int i2) {
            }

            @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
            public void onError(String str, int i2, String str2) {
            }

            @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
            public /* bridge */ /* synthetic */ void onSuccess(List<TUIMessageBean> list) {
            }

            /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
            public void onSuccess2(List<TUIMessageBean> list) {
            }
        }

        /* renamed from: com.tencent.qcloud.tuikit.tuichat.component.imagevideoscan.ImageVideoScanPresenter$2$2  reason: invalid class name and collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class C02132 extends IUIKitCallback<List<TUIMessageBean>> {
            public final /* synthetic */ AnonymousClass2 this$1;
            public final /* synthetic */ int val$position;

            public C02132(AnonymousClass2 anonymousClass2, int i2) {
            }

            @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
            public void onError(String str, int i2, String str2) {
            }

            @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
            public /* bridge */ /* synthetic */ void onSuccess(List<TUIMessageBean> list) {
            }

            /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
            public void onSuccess2(List<TUIMessageBean> list) {
            }
        }

        public AnonymousClass2(ImageVideoScanPresenter imageVideoScanPresenter, TUIMessageBean tUIMessageBean) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.component.imagevideoscan.OnViewPagerListener
        public void onInitComplete() {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.component.imagevideoscan.OnViewPagerListener
        public void onPageRelease(boolean z, int i2) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.component.imagevideoscan.OnViewPagerListener
        public void onPageSelected(int i2, boolean z, boolean z2) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.component.imagevideoscan.ImageVideoScanPresenter$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass3 implements Runnable {
        public final /* synthetic */ ImageVideoScanPresenter this$0;
        public final /* synthetic */ Context val$context;
        public final /* synthetic */ String val$imagePath;

        public AnonymousClass3(ImageVideoScanPresenter imageVideoScanPresenter, Context context, String str) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.component.imagevideoscan.ImageVideoScanPresenter$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass4 implements Runnable {
        public final /* synthetic */ ImageVideoScanPresenter this$0;
        public final /* synthetic */ Context val$context;
        public final /* synthetic */ String val$videoPath;

        public AnonymousClass4(ImageVideoScanPresenter imageVideoScanPresenter, Context context, String str) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class MessageChangedListener implements ITUINotification {
        private WeakReference<ImageVideoScanPresenter> presenterWeakReference;

        private MessageChangedListener() {
        }

        public static /* synthetic */ WeakReference access$102(MessageChangedListener messageChangedListener, WeakReference weakReference) {
        }

        @Override // com.tencent.qcloud.tuicore.interfaces.ITUINotification
        public void onNotifyEvent(String str, String str2, Map<String, Object> map) {
        }

        public /* synthetic */ MessageChangedListener(AnonymousClass1 anonymousClass1) {
        }
    }

    public static /* synthetic */ ImageVideoScanAdapter access$200(ImageVideoScanPresenter imageVideoScanPresenter) {
    }

    public static /* synthetic */ RecyclerView access$300(ImageVideoScanPresenter imageVideoScanPresenter) {
    }

    public static /* synthetic */ int access$402(ImageVideoScanPresenter imageVideoScanPresenter, int i2) {
    }

    public static /* synthetic */ String access$500() {
    }

    public static /* synthetic */ int access$602(ImageVideoScanPresenter imageVideoScanPresenter, int i2) {
    }

    public static /* synthetic */ boolean access$700(ImageVideoScanPresenter imageVideoScanPresenter) {
    }

    public static /* synthetic */ String access$800(ImageVideoScanPresenter imageVideoScanPresenter) {
    }

    public static /* synthetic */ ImageVideoScanProvider access$900(ImageVideoScanPresenter imageVideoScanPresenter) {
    }

    private void saveImage(Context context, String str) {
    }

    private void saveVideo(Context context, String str) {
    }

    public void init(TUIMessageBean tUIMessageBean, List<TUIMessageBean> list, boolean z) {
    }

    public void onMessageStatusChanged(TUIMessageBean tUIMessageBean) {
    }

    public void releaseUI() {
    }

    public void saveLocal(Context context) {
    }

    public void setAdapter(ImageVideoScanAdapter imageVideoScanAdapter) {
    }

    public void setRecyclerView(RecyclerView recyclerView) {
    }

    public void setViewPagerLayoutManager(ViewPagerLayoutManager viewPagerLayoutManager) {
    }
}
