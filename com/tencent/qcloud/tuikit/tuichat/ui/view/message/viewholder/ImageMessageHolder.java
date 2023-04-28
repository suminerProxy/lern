package com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.tencent.qcloud.tuicore.component.imageEngine.impl.GlideEngine;
import com.tencent.qcloud.tuicore.util.ImageUtil;
import com.tencent.qcloud.tuikit.tuichat.R;
import com.tencent.qcloud.tuikit.tuichat.bean.message.ImageMessageBean;
import com.tencent.qcloud.tuikit.tuichat.bean.message.TUIMessageBean;
import com.tencent.qcloud.tuikit.tuichat.util.TUIChatUtils;
import h.g.a.p.a;
import h.g.a.p.p.q;
import h.g.a.t.h;
import h.g.a.t.l.p;
import java.util.ArrayList;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class ImageMessageHolder extends MessageContentHolder {
    private static final int DEFAULT_MAX_SIZE = 540;
    private static final int DEFAULT_RADIUS = 10;
    private ImageView contentImage;
    private final List<String> downloadEles;
    private String mImagePath;
    private TextView videoDurationText;
    private ImageView videoPlayBtn;

    public ImageMessageHolder(View view) {
        super(view);
        this.downloadEles = new ArrayList();
        this.mImagePath = null;
        this.contentImage = (ImageView) view.findViewById(R.id.content_image_iv);
        this.videoPlayBtn = (ImageView) view.findViewById(R.id.video_play_btn);
        this.videoDurationText = (TextView) view.findViewById(R.id.video_duration_tv);
    }

    private ViewGroup.LayoutParams getImageParams(ViewGroup.LayoutParams layoutParams, ImageMessageBean imageMessageBean) {
        if (imageMessageBean.getImgWidth() != 0 && imageMessageBean.getImgHeight() != 0) {
            if (imageMessageBean.getImgWidth() > imageMessageBean.getImgHeight()) {
                layoutParams.width = 540;
                layoutParams.height = (imageMessageBean.getImgHeight() * 540) / imageMessageBean.getImgWidth();
            } else {
                layoutParams.width = (imageMessageBean.getImgWidth() * 540) / imageMessageBean.getImgHeight();
                layoutParams.height = 540;
            }
            return layoutParams;
        }
        layoutParams.width = 540;
        layoutParams.height = 540;
        return layoutParams;
    }

    private void performImage(ImageMessageBean imageMessageBean, int i2) {
        ImageView imageView = this.contentImage;
        imageView.setLayoutParams(getImageParams(imageView.getLayoutParams(), imageMessageBean));
        this.videoPlayBtn.setVisibility(8);
        this.videoDurationText.setVisibility(8);
        List<ImageMessageBean.ImageBean> imageBeanList = imageMessageBean.getImageBeanList();
        String dataPath = imageMessageBean.getDataPath();
        String originImagePath = TUIChatUtils.getOriginImagePath(imageMessageBean);
        if (!TextUtils.isEmpty(originImagePath)) {
            dataPath = originImagePath;
        }
        if (!TextUtils.isEmpty(dataPath)) {
            GlideEngine.loadCornerImageWithoutPlaceHolder(this.contentImage, dataPath, null, 10.0f);
        } else {
            GlideEngine.clear(this.contentImage);
            int i3 = 0;
            while (true) {
                if (i3 >= imageBeanList.size()) {
                    break;
                }
                ImageMessageBean.ImageBean imageBean = imageBeanList.get(i3);
                if (imageBean.getType() == 1) {
                    synchronized (this.downloadEles) {
                        if (!this.downloadEles.contains(imageBean.getUUID())) {
                            this.downloadEles.add(imageBean.getUUID());
                            String generateImagePath = ImageUtil.generateImagePath(imageBean.getUUID(), 1);
                            if (!generateImagePath.equals(this.mImagePath)) {
                                GlideEngine.clear(this.contentImage);
                            }
                            imageBean.downloadImage(generateImagePath, new ImageMessageBean.ImageBean.ImageDownloadCallback(this, imageBean, imageMessageBean, generateImagePath) { // from class: com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder.ImageMessageHolder.1
                                public final /* synthetic */ ImageMessageHolder this$0;
                                public final /* synthetic */ ImageMessageBean.ImageBean val$img;
                                public final /* synthetic */ ImageMessageBean val$msg;
                                public final /* synthetic */ String val$path;

                                /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder.ImageMessageHolder$1$1  reason: invalid class name and collision with other inner class name */
                                /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
                                public class C02231 implements h {
                                    public final /* synthetic */ AnonymousClass1 this$1;

                                    public C02231(AnonymousClass1 anonymousClass1) {
                                    }

                                    @Override // h.g.a.t.h
                                    public boolean onLoadFailed(@Nullable q qVar, Object obj, p pVar, boolean z) {
                                    }

                                    @Override // h.g.a.t.h
                                    public boolean onResourceReady(Object obj, Object obj2, p pVar, a aVar, boolean z) {
                                    }
                                }

                                @Override // com.tencent.qcloud.tuikit.tuichat.bean.message.ImageMessageBean.ImageBean.ImageDownloadCallback
                                public void onError(int i4, String str) {
                                }

                                @Override // com.tencent.qcloud.tuikit.tuichat.bean.message.ImageMessageBean.ImageBean.ImageDownloadCallback
                                public void onProgress(long j2, long j3) {
                                }

                                @Override // com.tencent.qcloud.tuikit.tuichat.bean.message.ImageMessageBean.ImageBean.ImageDownloadCallback
                                public void onSuccess() {
                                }
                            });
                        }
                    }
                } else {
                    i3++;
                }
            }
        }
        if (this.isMultiSelectMode) {
            this.contentImage.setOnClickListener(new View.OnClickListener(this, i2, imageMessageBean) { // from class: com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder.ImageMessageHolder.2
                public final /* synthetic */ ImageMessageHolder this$0;
                public final /* synthetic */ ImageMessageBean val$msg;
                public final /* synthetic */ int val$position;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                }
            });
            return;
        }
        this.contentImage.setOnClickListener(new View.OnClickListener(this, imageMessageBean) { // from class: com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder.ImageMessageHolder.3
            public final /* synthetic */ ImageMessageHolder this$0;
            public final /* synthetic */ ImageMessageBean val$msg;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        });
        this.contentImage.setOnLongClickListener(new View.OnLongClickListener(this, i2, imageMessageBean) { // from class: com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder.ImageMessageHolder.4
            public final /* synthetic */ ImageMessageHolder this$0;
            public final /* synthetic */ ImageMessageBean val$msg;
            public final /* synthetic */ int val$position;

            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
            }
        });
        if (imageMessageBean.getMessageReactBean() == null || imageMessageBean.getMessageReactBean().getReactSize() <= 0) {
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
        performImage((ImageMessageBean) tUIMessageBean, i2);
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder.MessageBaseHolder
    public void setHighLightBackground(int i2) {
        Drawable drawable = this.contentImage.getDrawable();
        if (drawable != null) {
            drawable.setColorFilter(i2, PorterDuff.Mode.SRC_ATOP);
        }
    }
}
