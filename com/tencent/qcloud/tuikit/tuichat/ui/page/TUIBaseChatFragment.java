package com.tencent.qcloud.tuikit.tuichat.ui.page;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tencent.qcloud.tuicore.component.TitleBarLayout;
import com.tencent.qcloud.tuicore.component.fragments.BaseFragment;
import com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback;
import com.tencent.qcloud.tuikit.tuichat.bean.ChatInfo;
import com.tencent.qcloud.tuikit.tuichat.bean.message.TUIMessageBean;
import com.tencent.qcloud.tuikit.tuichat.presenter.ChatPresenter;
import com.tencent.qcloud.tuikit.tuichat.ui.interfaces.OnItemClickListener;
import com.tencent.qcloud.tuikit.tuichat.ui.view.ChatView;
import com.tencent.qcloud.tuikit.tuichat.ui.view.input.InputView;
import com.tencent.qcloud.tuikit.tuichat.ui.view.message.MessageRecyclerView;
import com.tencent.qcloud.tuikit.tuichat.util.DataStoreUtil;
import h.g.a.t.l.e;
import h.g.a.t.m.f;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TUIBaseChatFragment extends BaseFragment {
    private static final String TAG = null;
    public View baseView;
    public ChatView chatView;
    public String mChatBackgroundThumbnailUrl;
    public String mChatBackgroundUrl;
    private int mForwardMode;
    private List<TUIMessageBean> mForwardSelectMsgInfos;
    private MessageRecyclerView messageRecyclerView;
    public TitleBarLayout titleBar;

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.page.TUIBaseChatFragment$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements View.OnClickListener {
        public final /* synthetic */ TUIBaseChatFragment this$0;

        public AnonymousClass1(TUIBaseChatFragment tUIBaseChatFragment) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.page.TUIBaseChatFragment$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 implements ChatView.ForwardSelectActivityListener {
        public final /* synthetic */ TUIBaseChatFragment this$0;

        public AnonymousClass2(TUIBaseChatFragment tUIBaseChatFragment) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.ChatView.ForwardSelectActivityListener
        public void onStartForwardSelectActivity(int i2, List<TUIMessageBean> list) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.page.TUIBaseChatFragment$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass3 extends OnItemClickListener {
        public final /* synthetic */ TUIBaseChatFragment this$0;

        public AnonymousClass3(TUIBaseChatFragment tUIBaseChatFragment) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.ui.interfaces.OnItemClickListener
        public void onMessageLongClick(View view, int i2, TUIMessageBean tUIMessageBean) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.ui.interfaces.OnItemClickListener
        public void onReEditRevokeMessage(View view, int i2, TUIMessageBean tUIMessageBean) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.ui.interfaces.OnItemClickListener
        public void onRecallClick(View view, int i2, TUIMessageBean tUIMessageBean) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.ui.interfaces.OnItemClickListener
        public void onTextSelected(View view, int i2, TUIMessageBean tUIMessageBean) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.ui.interfaces.OnItemClickListener
        public void onUserIconClick(View view, int i2, TUIMessageBean tUIMessageBean) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.ui.interfaces.OnItemClickListener
        public void onUserIconLongClick(View view, int i2, TUIMessageBean tUIMessageBean) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.page.TUIBaseChatFragment$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass4 implements InputView.OnStartActivityListener {
        public final /* synthetic */ TUIBaseChatFragment this$0;

        public AnonymousClass4(TUIBaseChatFragment tUIBaseChatFragment) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.input.InputView.OnStartActivityListener
        public void onStartGroupMemberSelectActivity() {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.page.TUIBaseChatFragment$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass5 extends IUIKitCallback {
        public final /* synthetic */ TUIBaseChatFragment this$0;

        public AnonymousClass5(TUIBaseChatFragment tUIBaseChatFragment) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public void onError(String str, int i2, String str2) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public void onSuccess(Object obj) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.page.TUIBaseChatFragment$6  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass6 implements DataStoreUtil.GetResult<String> {
        public final /* synthetic */ TUIBaseChatFragment this$0;

        public AnonymousClass6(TUIBaseChatFragment tUIBaseChatFragment) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.util.DataStoreUtil.GetResult
        public void onFail() {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.util.DataStoreUtil.GetResult
        public /* bridge */ /* synthetic */ void onSuccess(String str) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(String str) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.page.TUIBaseChatFragment$7  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass7 implements Runnable {
        public final /* synthetic */ TUIBaseChatFragment this$0;

        /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.page.TUIBaseChatFragment$7$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass1 extends e<Bitmap> {
            public final /* synthetic */ AnonymousClass7 this$1;
            public final /* synthetic */ int val$imageHeight;
            public final /* synthetic */ int val$imageWidth;

            /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.page.TUIBaseChatFragment$7$1$1  reason: invalid class name and collision with other inner class name */
            /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
            public class C02161 extends BitmapDrawable {
                public final /* synthetic */ AnonymousClass1 this$2;
                public final /* synthetic */ Bitmap val$srcBitmap;

                public C02161(AnonymousClass1 anonymousClass1, Resources resources, Bitmap bitmap, Bitmap bitmap2) {
                }

                @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
                public void draw(@NonNull Canvas canvas) {
                }
            }

            public AnonymousClass1(AnonymousClass7 anonymousClass7, int i2, int i3, int i4, int i5) {
            }

            @Override // h.g.a.t.l.p
            public void onLoadCleared(@Nullable Drawable drawable) {
            }

            @Override // h.g.a.t.l.p
            public /* bridge */ /* synthetic */ void onResourceReady(@NonNull Object obj, @Nullable f fVar) {
            }

            public void onResourceReady(@NonNull Bitmap bitmap, @Nullable f<? super Bitmap> fVar) {
            }
        }

        public AnonymousClass7(TUIBaseChatFragment tUIBaseChatFragment) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public static /* synthetic */ int access$002(TUIBaseChatFragment tUIBaseChatFragment, int i2) {
    }

    public static /* synthetic */ List access$102(TUIBaseChatFragment tUIBaseChatFragment, List list) {
    }

    public static /* synthetic */ String access$200() {
    }

    public static /* synthetic */ MessageRecyclerView access$300(TUIBaseChatFragment tUIBaseChatFragment) {
    }

    public static /* synthetic */ Bitmap access$400(TUIBaseChatFragment tUIBaseChatFragment, Bitmap bitmap, int i2, int i3) {
    }

    private Bitmap zoomImg(Bitmap bitmap, int i2, int i3) {
    }

    public ChatInfo getChatInfo() {
    }

    public ChatPresenter getPresenter() {
    }

    public void initChatViewBackground() {
    }

    public void initView() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i2, int i3, Intent intent) {
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, Bundle bundle) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
    }

    public void setChatViewBackground(String str) {
    }
}
