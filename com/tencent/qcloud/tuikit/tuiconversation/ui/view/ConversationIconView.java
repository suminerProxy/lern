package com.tencent.qcloud.tuikit.tuiconversation.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback;
import com.tencent.qcloud.tuikit.tuiconversation.bean.ConversationInfo;
import com.tencent.qcloud.tuikit.tuiconversation.presenter.ConversationIconPresenter;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class ConversationIconView extends RelativeLayout {
    private ImageView mIconView;
    private ConversationIconPresenter presenter;
    private boolean showFoldedStyle;

    /* renamed from: com.tencent.qcloud.tuikit.tuiconversation.ui.view.ConversationIconView$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements Runnable {
        public final /* synthetic */ ConversationIconView this$0;
        public final /* synthetic */ String val$conversationId;
        public final /* synthetic */ List val$iconUrls;

        public AnonymousClass1(ConversationIconView conversationIconView, List list, String str) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuiconversation.ui.view.ConversationIconView$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 implements Runnable {
        public final /* synthetic */ ConversationIconView this$0;
        public final /* synthetic */ ConversationInfo val$info;

        public AnonymousClass2(ConversationIconView conversationIconView, ConversationInfo conversationInfo) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuiconversation.ui.view.ConversationIconView$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass3 implements Runnable {
        public final /* synthetic */ ConversationIconView this$0;
        public final /* synthetic */ String val$groupID;
        public final /* synthetic */ ConversationInfo val$info;

        /* renamed from: com.tencent.qcloud.tuikit.tuiconversation.ui.view.ConversationIconView$3$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass1 extends IUIKitCallback<List<Object>> {
            public final /* synthetic */ AnonymousClass3 this$1;

            public AnonymousClass1(AnonymousClass3 anonymousClass3) {
            }

            @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
            public void onError(String str, int i2, String str2) {
            }

            @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
            public /* bridge */ /* synthetic */ void onSuccess(List<Object> list) {
            }

            /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
            public void onSuccess2(List<Object> list) {
            }
        }

        public AnonymousClass3(ConversationIconView conversationIconView, String str, ConversationInfo conversationInfo) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public ConversationIconView(Context context) {
    }

    public static /* synthetic */ ImageView access$000(ConversationIconView conversationIconView) {
    }

    public static /* synthetic */ void access$100(ConversationIconView conversationIconView, String str, ConversationInfo conversationInfo) {
    }

    public static /* synthetic */ ConversationIconPresenter access$200(ConversationIconView conversationIconView) {
    }

    private void fillConversationUrlForGroup(ConversationInfo conversationInfo) {
    }

    private void fillFaceUrlList(String str, ConversationInfo conversationInfo) {
    }

    private void init() {
    }

    public void clearImage() {
    }

    public void setBitmapResId(int i2) {
    }

    public void setConversation(ConversationInfo conversationInfo) {
    }

    public void setDefaultImageResId(int i2) {
    }

    public void setIconUrls(List<Object> list, String str) {
    }

    public void setRadius(int i2) {
    }

    public void setShowFoldedStyle(boolean z) {
    }

    public ConversationIconView(Context context, AttributeSet attributeSet) {
    }

    public ConversationIconView(Context context, AttributeSet attributeSet, int i2) {
    }
}
