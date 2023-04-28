package com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.qcloud.tuicore.TUIConfig;
import com.tencent.qcloud.tuicore.component.imageEngine.impl.GlideEngine;
import com.tencent.qcloud.tuicore.util.DateTimeUtil;
import com.tencent.qcloud.tuikit.tuichat.R;
import com.tencent.qcloud.tuikit.tuichat.bean.message.TUIMessageBean;
import com.tencent.qcloud.tuikit.tuichat.bean.message.VideoMessageBean;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class VideoMessageHolder extends MessageContentHolder {
    private static final int DEFAULT_MAX_SIZE = 540;
    private static final int DEFAULT_RADIUS = 10;
    private ImageView contentImage;
    private final List<String> downloadEles;
    private TextView videoDurationText;
    private ImageView videoPlayBtn;

    public VideoMessageHolder(View view) {
        super(view);
        this.downloadEles = new ArrayList();
        this.contentImage = (ImageView) view.findViewById(R.id.content_image_iv);
        this.videoPlayBtn = (ImageView) view.findViewById(R.id.video_play_btn);
        this.videoDurationText = (TextView) view.findViewById(R.id.video_duration_tv);
    }

    private ViewGroup.LayoutParams getImageParams(ViewGroup.LayoutParams layoutParams, VideoMessageBean videoMessageBean) {
        if (videoMessageBean.getImgWidth() != 0 && videoMessageBean.getImgHeight() != 0) {
            if (videoMessageBean.getImgWidth() > videoMessageBean.getImgHeight()) {
                layoutParams.width = 540;
                layoutParams.height = (videoMessageBean.getImgHeight() * 540) / videoMessageBean.getImgWidth();
            } else {
                layoutParams.width = (videoMessageBean.getImgWidth() * 540) / videoMessageBean.getImgHeight();
                layoutParams.height = 540;
            }
            return layoutParams;
        }
        layoutParams.width = 540;
        layoutParams.height = 540;
        return layoutParams;
    }

    private void performVideo(VideoMessageBean videoMessageBean, int i2) {
        ImageView imageView = this.contentImage;
        imageView.setLayoutParams(getImageParams(imageView.getLayoutParams(), videoMessageBean));
        this.videoPlayBtn.setVisibility(0);
        this.videoDurationText.setVisibility(0);
        if (!TextUtils.isEmpty(videoMessageBean.getDataPath())) {
            GlideEngine.loadCornerImageWithoutPlaceHolder(this.contentImage, videoMessageBean.getDataPath(), null, 10.0f);
        } else {
            GlideEngine.clear(this.contentImage);
            synchronized (this.downloadEles) {
                if (!this.downloadEles.contains(videoMessageBean.getSnapshotUUID())) {
                    this.downloadEles.add(videoMessageBean.getSnapshotUUID());
                }
            }
            String str = TUIConfig.getImageDownloadDir() + videoMessageBean.getSnapshotUUID();
            videoMessageBean.downloadSnapshot(str, new VideoMessageBean.VideoDownloadCallback(this, videoMessageBean, str) { // from class: com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder.VideoMessageHolder.1
                public final /* synthetic */ VideoMessageHolder this$0;
                public final /* synthetic */ VideoMessageBean val$msg;
                public final /* synthetic */ String val$path;

                @Override // com.tencent.qcloud.tuikit.tuichat.bean.message.VideoMessageBean.VideoDownloadCallback
                public void onError(int i3, String str2) {
                }

                @Override // com.tencent.qcloud.tuikit.tuichat.bean.message.VideoMessageBean.VideoDownloadCallback
                public void onProgress(long j2, long j3) {
                }

                @Override // com.tencent.qcloud.tuikit.tuichat.bean.message.VideoMessageBean.VideoDownloadCallback
                public void onSuccess() {
                }
            });
        }
        this.videoDurationText.setText(DateTimeUtil.formatSecondsTo00(videoMessageBean.getDuration()));
        File file = new File(TUIConfig.getVideoDownloadDir() + videoMessageBean.getVideoUUID());
        if (videoMessageBean.getStatus() == 2) {
            this.statusImage.setVisibility(8);
            this.sendingProgress.setVisibility(8);
        } else if (file.exists() && videoMessageBean.getStatus() == 1) {
            this.statusImage.setVisibility(8);
            this.sendingProgress.setVisibility(0);
        } else if (videoMessageBean.getStatus() == 3) {
            this.statusImage.setVisibility(0);
            this.sendingProgress.setVisibility(8);
        }
        if (this.isMultiSelectMode) {
            this.msgContentFrame.setOnClickListener(new View.OnClickListener(this, i2, videoMessageBean) { // from class: com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder.VideoMessageHolder.2
                public final /* synthetic */ VideoMessageHolder this$0;
                public final /* synthetic */ VideoMessageBean val$msg;
                public final /* synthetic */ int val$position;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                }
            });
            return;
        }
        this.msgContentFrame.setOnClickListener(new View.OnClickListener(this, videoMessageBean) { // from class: com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder.VideoMessageHolder.3
            public final /* synthetic */ VideoMessageHolder this$0;
            public final /* synthetic */ VideoMessageBean val$msg;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        });
        if (videoMessageBean.getMessageReactBean() == null || videoMessageBean.getMessageReactBean().getReactSize() <= 0) {
            this.msgArea.setBackground(null);
            this.msgArea.setPadding(0, 0, 0, 0);
        }
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder.MessageBaseHolder
    public void clearHighLightBackground() {
        Drawable drawable = this.contentImage.getDrawable();
        if (drawable != null) {
            drawable.setColorFilter(null);
        }
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder.MessageBaseHolder
    public int getVariableLayout() {
        return R.layout.message_adapter_content_image;
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder.MessageContentHolder
    public void layoutVariableViews(TUIMessageBean tUIMessageBean, int i2) {
        performVideo((VideoMessageBean) tUIMessageBean, i2);
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder.MessageBaseHolder
    public void setHighLightBackground(int i2) {
        Drawable drawable = this.contentImage.getDrawable();
        if (drawable != null) {
            drawable.setColorFilter(i2, PorterDuff.Mode.SRC_ATOP);
        }
    }
}
