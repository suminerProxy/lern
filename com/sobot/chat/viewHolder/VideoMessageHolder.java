package com.sobot.chat.viewHolder;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.sobot.chat.api.model.ZhiChiMessageBase;
import com.sobot.chat.viewHolder.base.MessageHolderBase;
import com.sobot.chat.widget.RoundProgressBar;
import com.sobot.chat.widget.image.SobotRCImageView;
import com.sobot.network.http.model.SobotProgress;
import com.sobot.network.http.upload.SobotUploadListener;
import com.sobot.network.http.upload.SobotUploadModelBase;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class VideoMessageHolder extends MessageHolderBase implements View.OnClickListener {
    private ZhiChiMessageBase mData;
    private String mTag;
    private int sobot_bg_default_pic;
    private ImageView sobot_msgStatus;
    private RoundProgressBar sobot_progress;
    private SobotRCImageView st_iv_pic;
    private ImageView st_tv_play;

    /* renamed from: com.sobot.chat.viewHolder.VideoMessageHolder$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass1 implements MessageHolderBase.ReSendListener {
        public final /* synthetic */ VideoMessageHolder this$0;

        public AnonymousClass1(VideoMessageHolder videoMessageHolder) {
        }

        @Override // com.sobot.chat.viewHolder.base.MessageHolderBase.ReSendListener
        public void onReSend() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class ListUploadListener extends SobotUploadListener {
        private VideoMessageHolder holder;

        public ListUploadListener(Object obj, VideoMessageHolder videoMessageHolder) {
        }

        @Override // com.sobot.network.http.upload.ProgressListener
        public void onError(SobotProgress sobotProgress) {
        }

        @Override // com.sobot.network.http.upload.ProgressListener
        public /* bridge */ /* synthetic */ void onFinish(SobotUploadModelBase sobotUploadModelBase, SobotProgress sobotProgress) {
        }

        @Override // com.sobot.network.http.upload.ProgressListener
        public void onProgress(SobotProgress sobotProgress) {
        }

        @Override // com.sobot.network.http.upload.ProgressListener
        public void onRemove(SobotProgress sobotProgress) {
        }

        @Override // com.sobot.network.http.upload.ProgressListener
        public void onStart(SobotProgress sobotProgress) {
        }

        /* renamed from: onFinish  reason: avoid collision after fix types in other method */
        public void onFinish2(SobotUploadModelBase sobotUploadModelBase, SobotProgress sobotProgress) {
        }
    }

    public VideoMessageHolder(Context context, View view) {
    }

    public static /* synthetic */ String access$000(VideoMessageHolder videoMessageHolder) {
    }

    public static /* synthetic */ void access$100(VideoMessageHolder videoMessageHolder) {
    }

    public static /* synthetic */ String access$200(VideoMessageHolder videoMessageHolder) {
    }

    public static /* synthetic */ void access$300(VideoMessageHolder videoMessageHolder, SobotProgress sobotProgress) {
    }

    private String getTag() {
    }

    private void notifyFileTaskRemove() {
    }

    private void refreshUploadUi(SobotProgress sobotProgress) {
    }

    @Override // com.sobot.chat.viewHolder.base.MessageHolderBase
    public void bindData(Context context, ZhiChiMessageBase zhiChiMessageBase) {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }
}
