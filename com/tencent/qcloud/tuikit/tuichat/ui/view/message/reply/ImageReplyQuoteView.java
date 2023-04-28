package com.tencent.qcloud.tuikit.tuichat.ui.view.message.reply;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.tencent.qcloud.tuikit.tuichat.bean.message.ImageMessageBean;
import com.tencent.qcloud.tuikit.tuichat.bean.message.reply.TUIReplyQuoteBean;
import h.g.a.p.a;
import h.g.a.p.p.q;
import h.g.a.t.h;
import h.g.a.t.l.p;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class ImageReplyQuoteView extends TUIReplyQuoteView {
    public static final int DEFAULT_RADIUS = 2;
    public final List<String> downloadEles;
    public ImageView imageMsgIv;
    public View imageMsgLayout;
    public String mImagePath;
    public ImageView videoPlayIv;

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.message.reply.ImageReplyQuoteView$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements ImageMessageBean.ImageBean.ImageDownloadCallback {
        public final /* synthetic */ ImageReplyQuoteView this$0;
        public final /* synthetic */ ImageMessageBean.ImageBean val$img;
        public final /* synthetic */ ImageMessageBean val$messageBean;
        public final /* synthetic */ String val$path;

        /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.message.reply.ImageReplyQuoteView$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class C02221 implements h {
            public final /* synthetic */ AnonymousClass1 this$1;

            public C02221(AnonymousClass1 anonymousClass1) {
            }

            @Override // h.g.a.t.h
            public boolean onLoadFailed(@Nullable q qVar, Object obj, p pVar, boolean z) {
            }

            @Override // h.g.a.t.h
            public boolean onResourceReady(Object obj, Object obj2, p pVar, a aVar, boolean z) {
            }
        }

        public AnonymousClass1(ImageReplyQuoteView imageReplyQuoteView, ImageMessageBean.ImageBean imageBean, ImageMessageBean imageMessageBean, String str) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.bean.message.ImageMessageBean.ImageBean.ImageDownloadCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.bean.message.ImageMessageBean.ImageBean.ImageDownloadCallback
        public void onProgress(long j2, long j3) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.bean.message.ImageMessageBean.ImageBean.ImageDownloadCallback
        public void onSuccess() {
        }
    }

    public ImageReplyQuoteView(Context context) {
    }

    public ViewGroup.LayoutParams getImageParams(ViewGroup.LayoutParams layoutParams, int i2, int i3) {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.message.reply.TUIReplyQuoteView
    public int getLayoutResourceId() {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.message.reply.TUIReplyQuoteView
    public void onDrawReplyQuote(TUIReplyQuoteBean tUIReplyQuoteBean) {
    }
}
