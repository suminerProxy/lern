package com.tencent.qcloud.tuikit.tuichat.bean.message;

import android.net.Uri;
import android.text.TextUtils;
import com.tencent.imsdk.v2.V2TIMDownloadCallback;
import com.tencent.imsdk.v2.V2TIMElem;
import com.tencent.imsdk.v2.V2TIMImageElem;
import com.tencent.imsdk.v2.V2TIMMessage;
import com.tencent.qcloud.tuicore.ServiceInitializer;
import com.tencent.qcloud.tuicore.util.ImageUtil;
import com.tencent.qcloud.tuikit.tuichat.R;
import com.tencent.qcloud.tuikit.tuichat.bean.message.reply.ImageReplyQuoteBean;
import com.tencent.qcloud.tuikit.tuichat.bean.message.reply.TUIReplyQuoteBean;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class ImageMessageBean extends TUIMessageBean {
    public static final int IMAGE_TYPE_LARGE = 2;
    public static final int IMAGE_TYPE_ORIGIN = 0;
    public static final int IMAGE_TYPE_THUMB = 1;
    private String dataPath;
    private String dataUri;
    private List<ImageBean> imageBeanList;
    private V2TIMImageElem imageElem;
    private int imgHeight;
    private int imgWidth;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class ImageBean implements Serializable {
        private V2TIMImageElem.V2TIMImage v2TIMImage;

        /* renamed from: com.tencent.qcloud.tuikit.tuichat.bean.message.ImageMessageBean$ImageBean$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass1 implements V2TIMDownloadCallback {
            public final /* synthetic */ ImageBean this$0;
            public final /* synthetic */ ImageDownloadCallback val$callback;

            public AnonymousClass1(ImageBean imageBean, ImageDownloadCallback imageDownloadCallback) {
            }

            @Override // com.tencent.imsdk.v2.V2TIMCallback
            public void onError(int i2, String str) {
            }

            @Override // com.tencent.imsdk.v2.V2TIMDownloadCallback
            public void onProgress(V2TIMElem.V2ProgressInfo v2ProgressInfo) {
            }

            @Override // com.tencent.imsdk.v2.V2TIMCallback
            public void onSuccess() {
            }
        }

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public interface ImageDownloadCallback {
            void onError(int i2, String str);

            void onProgress(long j2, long j3);

            void onSuccess();
        }

        public void downloadImage(String str, ImageDownloadCallback imageDownloadCallback) {
        }

        public int getHeight() {
        }

        public int getSize() {
        }

        public int getType() {
        }

        public String getUUID() {
        }

        public String getUrl() {
        }

        public V2TIMImageElem.V2TIMImage getV2TIMImage() {
        }

        public int getWidth() {
        }

        public void setV2TIMImage(V2TIMImageElem.V2TIMImage v2TIMImage) {
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

    public List<ImageBean> getImageBeanList() {
        return this.imageBeanList;
    }

    public int getImgHeight() {
        return this.imgHeight;
    }

    public int getImgWidth() {
        return this.imgWidth;
    }

    public String getPath() {
        V2TIMImageElem v2TIMImageElem = this.imageElem;
        return v2TIMImageElem != null ? v2TIMImageElem.getPath() : "";
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.bean.message.TUIMessageBean
    public Class<? extends TUIReplyQuoteBean> getReplyQuoteBeanClass() {
        return ImageReplyQuoteBean.class;
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.bean.message.TUIMessageBean
    public String onGetDisplayString() {
        return getExtra();
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.bean.message.TUIMessageBean
    public void onProcessMessage(V2TIMMessage v2TIMMessage) {
        V2TIMImageElem imageElem = v2TIMMessage.getImageElem();
        this.imageElem = imageElem;
        List<V2TIMImageElem.V2TIMImage> imageList = imageElem.getImageList();
        if (imageList != null) {
            ArrayList arrayList = new ArrayList();
            for (V2TIMImageElem.V2TIMImage v2TIMImage : imageList) {
                ImageBean imageBean = new ImageBean();
                imageBean.setV2TIMImage(v2TIMImage);
                arrayList.add(imageBean);
            }
            this.imageBeanList = arrayList;
        }
        String path = this.imageElem.getPath();
        if (isSelf() && !TextUtils.isEmpty(path) && new File(path).exists()) {
            this.dataPath = path;
            int[] imageSize = ImageUtil.getImageSize(path);
            this.imgWidth = imageSize[0];
            this.imgHeight = imageSize[1];
        } else {
            List<V2TIMImageElem.V2TIMImage> imageList2 = this.imageElem.getImageList();
            for (int i2 = 0; i2 < imageList2.size(); i2++) {
                V2TIMImageElem.V2TIMImage v2TIMImage2 = imageList2.get(i2);
                if (v2TIMImage2.getType() == 1) {
                    String generateImagePath = ImageUtil.generateImagePath(v2TIMImage2.getUUID(), 1);
                    this.imgWidth = v2TIMImage2.getWidth();
                    this.imgHeight = v2TIMImage2.getHeight();
                    if (new File(generateImagePath).exists()) {
                        this.dataPath = generateImagePath;
                    }
                }
            }
        }
        setExtra(ServiceInitializer.getAppContext().getString(R.string.picture_extra));
    }

    public void setDataPath(String str) {
        this.dataPath = str;
    }

    public void setDataUri(Uri uri) {
        if (uri != null) {
            this.dataUri = uri.toString();
        }
    }

    public void setImageBeanList(List<ImageBean> list) {
        this.imageBeanList = list;
    }

    public void setImageElem(V2TIMImageElem v2TIMImageElem) {
        this.imageElem = v2TIMImageElem;
    }

    public void setImgHeight(int i2) {
        this.imgHeight = i2;
    }

    public void setImgWidth(int i2) {
        this.imgWidth = i2;
    }
}
