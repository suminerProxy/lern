package com.sobot.chat.viewHolder;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.sobot.chat.api.model.ZhiChiMessageBase;
import com.sobot.chat.viewHolder.base.MessageHolderBase;
import com.sobot.chat.widget.SobotSectorProgressView;
import com.sobot.network.http.model.SobotProgress;
import com.sobot.network.http.upload.SobotUploadListener;
import com.sobot.network.http.upload.SobotUploadModelBase;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class FileMessageHolder extends MessageHolderBase implements View.OnClickListener {
    private ZhiChiMessageBase mData;
    private int mResNetError;
    private int mResRemove;
    private String mTag;
    private TextView sobot_file_name;
    private TextView sobot_file_size;
    private RelativeLayout sobot_ll_file_container;
    private ImageView sobot_msgStatus;
    private SobotSectorProgressView sobot_progress;

    /* renamed from: com.sobot.chat.viewHolder.FileMessageHolder$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass1 implements MessageHolderBase.ReSendListener {
        public final /* synthetic */ FileMessageHolder this$0;

        public AnonymousClass1(FileMessageHolder fileMessageHolder) {
        }

        @Override // com.sobot.chat.viewHolder.base.MessageHolderBase.ReSendListener
        public void onReSend() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class ListUploadListener extends SobotUploadListener {
        private FileMessageHolder holder;

        public ListUploadListener(Object obj, FileMessageHolder fileMessageHolder) {
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

    public FileMessageHolder(Context context, View view) {
    }

    public static /* synthetic */ String access$000(FileMessageHolder fileMessageHolder) {
    }

    public static /* synthetic */ void access$100(FileMessageHolder fileMessageHolder) {
    }

    public static /* synthetic */ String access$200(FileMessageHolder fileMessageHolder) {
    }

    public static /* synthetic */ void access$300(FileMessageHolder fileMessageHolder, SobotProgress sobotProgress) {
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
