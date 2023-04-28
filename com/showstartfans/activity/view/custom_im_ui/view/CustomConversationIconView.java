package com.showstartfans.activity.view.custom_im_ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback;
import com.tencent.qcloud.tuikit.tuiconversation.bean.ConversationInfo;
import com.tencent.qcloud.tuikit.tuiconversation.presenter.ConversationIconPresenter;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class CustomConversationIconView extends RelativeLayout {
    private CustomSynthesizedImageView b;
    private boolean c;

    /* renamed from: d  reason: collision with root package name */
    private ConversationIconPresenter f7160d;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class a implements Runnable {
        public final /* synthetic */ List b;
        public final /* synthetic */ String c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ CustomConversationIconView f7161d;

        public a(CustomConversationIconView customConversationIconView, List list, String str) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class b implements Runnable {
        public final /* synthetic */ ConversationInfo b;
        public final /* synthetic */ CustomConversationIconView c;

        public b(CustomConversationIconView customConversationIconView, ConversationInfo conversationInfo) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class c implements Runnable {
        public final /* synthetic */ String b;
        public final /* synthetic */ ConversationInfo c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ CustomConversationIconView f7162d;

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public class a extends IUIKitCallback<List<Object>> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ c f7163a;

            public a(c cVar) {
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

        public c(CustomConversationIconView customConversationIconView, String str, ConversationInfo conversationInfo) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public CustomConversationIconView(Context context) {
    }

    public static /* synthetic */ CustomSynthesizedImageView a(CustomConversationIconView customConversationIconView) {
    }

    public static /* synthetic */ void b(CustomConversationIconView customConversationIconView, String str, ConversationInfo conversationInfo) {
    }

    public static /* synthetic */ ConversationIconPresenter c(CustomConversationIconView customConversationIconView) {
    }

    private void e(ConversationInfo conversationInfo) {
    }

    private void f(String str, ConversationInfo conversationInfo) {
    }

    private void g() {
    }

    public void d() {
    }

    public void h(List<Object> list, String str) {
    }

    public void setBitmapResId(int i2) {
    }

    public void setConversation(ConversationInfo conversationInfo) {
    }

    public void setDefaultImageResId(int i2) {
    }

    public void setRadius(int i2) {
    }

    public void setShowFoldedStyle(boolean z) {
    }

    public CustomConversationIconView(Context context, AttributeSet attributeSet) {
    }

    public CustomConversationIconView(Context context, AttributeSet attributeSet, int i2) {
    }
}
