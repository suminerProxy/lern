package com.tencent.qcloud.tuikit.tuichat.ui.view.message.reply;

import android.content.Context;
import com.tencent.qcloud.tuikit.tuichat.bean.message.VideoMessageBean;
import com.tencent.qcloud.tuikit.tuichat.bean.message.reply.TUIReplyQuoteBean;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class VideoReplyQuoteView extends ImageReplyQuoteView {

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.message.reply.VideoReplyQuoteView$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements VideoMessageBean.VideoDownloadCallback {
        public final /* synthetic */ VideoReplyQuoteView this$0;
        public final /* synthetic */ VideoMessageBean val$messageBean;
        public final /* synthetic */ String val$path;

        public AnonymousClass1(VideoReplyQuoteView videoReplyQuoteView, VideoMessageBean videoMessageBean, String str) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.bean.message.VideoMessageBean.VideoDownloadCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.bean.message.VideoMessageBean.VideoDownloadCallback
        public void onProgress(long j2, long j3) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.bean.message.VideoMessageBean.VideoDownloadCallback
        public void onSuccess() {
        }
    }

    public VideoReplyQuoteView(Context context) {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.message.reply.ImageReplyQuoteView, com.tencent.qcloud.tuikit.tuichat.ui.view.message.reply.TUIReplyQuoteView
    public void onDrawReplyQuote(TUIReplyQuoteBean tUIReplyQuoteBean) {
    }
}
