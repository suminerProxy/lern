package com.tencent.qcloud.tuikit.tuichat.bean.message;

import android.net.Uri;
import android.text.TextUtils;
import com.tencent.imsdk.BaseConstants;
import com.tencent.imsdk.v2.V2TIMDownloadCallback;
import com.tencent.imsdk.v2.V2TIMElem;
import com.tencent.imsdk.v2.V2TIMMessage;
import com.tencent.imsdk.v2.V2TIMValueCallback;
import com.tencent.imsdk.v2.V2TIMVideoElem;
import com.tencent.qcloud.tuicore.ServiceInitializer;
import com.tencent.qcloud.tuicore.TUIConfig;
import com.tencent.qcloud.tuicore.util.FileUtil;
import com.tencent.qcloud.tuicore.util.ImageUtil;
import com.tencent.qcloud.tuikit.tuichat.R;
import com.tencent.qcloud.tuikit.tuichat.bean.message.reply.TUIReplyQuoteBean;
import com.tencent.qcloud.tuikit.tuichat.bean.message.reply.VideoReplyQuoteBean;
import java.io.File;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class VideoMessageBean extends TUIMessageBean {
    private String dataPath;
    private String dataUri;
    private int imgHeight;
    private int imgWidth;
    private V2TIMVideoElem videoElem;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface VideoDownloadCallback {
        void onError(int i2, String str);

        void onProgress(long j2, long j3);

        void onSuccess();
    }

    public void downloadSnapshot(String str, VideoDownloadCallback videoDownloadCallback) {
        V2TIMVideoElem v2TIMVideoElem = this.videoElem;
        if (v2TIMVideoElem != null) {
            v2TIMVideoElem.downloadSnapshot(str, new V2TIMDownloadCallback(this, videoDownloadCallback) { // from class: com.tencent.qcloud.tuikit.tuichat.bean.message.VideoMessageBean.1
                public final /* synthetic */ VideoMessageBean this$0;
                public final /* synthetic */ VideoDownloadCallback val$callback;

                @Override // com.tencent.imsdk.v2.V2TIMCallback
                public void onError(int i2, String str2) {
                }

                @Override // com.tencent.imsdk.v2.V2TIMDownloadCallback
                public void onProgress(V2TIMElem.V2ProgressInfo v2ProgressInfo) {
                }

                @Override // com.tencent.imsdk.v2.V2TIMCallback
                public void onSuccess() {
                }
            });
        }
    }

    public void downloadVideo(String str, VideoDownloadCallback videoDownloadCallback) {
        V2TIMVideoElem v2TIMVideoElem = this.videoElem;
        if (v2TIMVideoElem != null) {
            v2TIMVideoElem.downloadVideo(str, new V2TIMDownloadCallback(this, videoDownloadCallback) { // from class: com.tencent.qcloud.tuikit.tuichat.bean.message.VideoMessageBean.2
                public final /* synthetic */ VideoMessageBean this$0;
                public final /* synthetic */ VideoDownloadCallback val$callback;

                @Override // com.tencent.imsdk.v2.V2TIMCallback
                public void onError(int i2, String str2) {
                }

                @Override // com.tencent.imsdk.v2.V2TIMDownloadCallback
                public void onProgress(V2TIMElem.V2ProgressInfo v2ProgressInfo) {
                }

                @Override // com.tencent.imsdk.v2.V2TIMCallback
                public void onSuccess() {
                }
            });
        }
    }

    public String getDataPath() {
        return this.dataPath;
    }

    public Uri getDataUriObj() {
        if (TextUtils.isEmpty(this.dataUri)) {
            return null;
        }
        return Uri.parse(this.dataUri);
    }

    public int getDuration() {
        V2TIMVideoElem v2TIMVideoElem = this.videoElem;
        if (v2TIMVideoElem != null) {
            return v2TIMVideoElem.getDuration();
        }
        return 0;
    }

    public int getImgHeight() {
        return this.imgHeight;
    }

    public int getImgWidth() {
        return this.imgWidth;
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.bean.message.TUIMessageBean
    public Class<? extends TUIReplyQuoteBean> getReplyQuoteBeanClass() {
        return VideoReplyQuoteBean.class;
    }

    public String getSnapshotUUID() {
        V2TIMVideoElem v2TIMVideoElem = this.videoElem;
        return v2TIMVideoElem != null ? v2TIMVideoElem.getSnapshotUUID() : "";
    }

    public int getVideoSize() {
        V2TIMVideoElem v2TIMVideoElem = this.videoElem;
        if (v2TIMVideoElem != null) {
            return v2TIMVideoElem.getVideoSize();
        }
        return 0;
    }

    public String getVideoUUID() {
        V2TIMVideoElem v2TIMVideoElem = this.videoElem;
        return v2TIMVideoElem != null ? v2TIMVideoElem.getVideoUUID() : "";
    }

    public void getVideoUrl(V2TIMValueCallback<String> v2TIMValueCallback) {
        if (v2TIMValueCallback == null) {
            return;
        }
        V2TIMVideoElem v2TIMVideoElem = this.videoElem;
        if (v2TIMVideoElem == null) {
            v2TIMValueCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "elem is null");
        } else {
            v2TIMVideoElem.getVideoUrl(v2TIMValueCallback);
        }
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.bean.message.TUIMessageBean
    public String onGetDisplayString() {
        return getExtra();
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.bean.message.TUIMessageBean
    public void onProcessMessage(V2TIMMessage v2TIMMessage) {
        V2TIMVideoElem videoElem = v2TIMMessage.getVideoElem();
        if (isSelf() && !TextUtils.isEmpty(videoElem.getSnapshotPath())) {
            int[] imageSize = ImageUtil.getImageSize(videoElem.getSnapshotPath());
            this.imgWidth = imageSize[0];
            this.imgHeight = imageSize[1];
            this.dataPath = videoElem.getSnapshotPath();
            setDataUri(FileUtil.getUriFromPath(videoElem.getVideoPath()));
        } else {
            setDataUri(Uri.parse(TUIConfig.getVideoDownloadDir() + videoElem.getVideoUUID()));
            this.imgWidth = videoElem.getSnapshotWidth();
            this.imgHeight = videoElem.getSnapshotHeight();
            String str = TUIConfig.getImageDownloadDir() + videoElem.getSnapshotUUID();
            if (new File(str).exists()) {
                this.dataPath = str;
            }
        }
        if (v2TIMMessage.getElemType() == 5) {
            this.videoElem = v2TIMMessage.getVideoElem();
        }
        setExtra(ServiceInitializer.getAppContext().getString(R.string.video_extra));
    }

    public void setDataPath(String str) {
        this.dataPath = str;
    }

    public void setDataUri(Uri uri) {
        if (uri != null) {
            this.dataUri = uri.toString();
        }
    }

    public void setImgHeight(int i2) {
        this.imgHeight = i2;
    }

    public void setImgWidth(int i2) {
        this.imgWidth = i2;
    }

    public void setVideoElem(V2TIMVideoElem v2TIMVideoElem) {
        this.videoElem = v2TIMVideoElem;
    }
}
