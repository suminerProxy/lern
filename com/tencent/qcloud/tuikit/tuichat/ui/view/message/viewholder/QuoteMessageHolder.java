package com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.tencent.qcloud.tuicore.TUIConfig;
import com.tencent.qcloud.tuicore.TUIThemeManager;
import com.tencent.qcloud.tuicore.component.imageEngine.impl.GlideEngine;
import com.tencent.qcloud.tuicore.util.ImageUtil;
import com.tencent.qcloud.tuicore.util.ScreenUtil;
import com.tencent.qcloud.tuikit.tuichat.R;
import com.tencent.qcloud.tuikit.tuichat.bean.message.ImageMessageBean;
import com.tencent.qcloud.tuikit.tuichat.bean.message.QuoteMessageBean;
import com.tencent.qcloud.tuikit.tuichat.bean.message.TUIMessageBean;
import com.tencent.qcloud.tuikit.tuichat.bean.message.VideoMessageBean;
import com.tencent.qcloud.tuikit.tuichat.bean.message.reply.FaceReplyQuoteBean;
import com.tencent.qcloud.tuikit.tuichat.bean.message.reply.FileReplyQuoteBean;
import com.tencent.qcloud.tuikit.tuichat.bean.message.reply.ImageReplyQuoteBean;
import com.tencent.qcloud.tuikit.tuichat.bean.message.reply.MergeReplyQuoteBean;
import com.tencent.qcloud.tuikit.tuichat.bean.message.reply.SoundReplyQuoteBean;
import com.tencent.qcloud.tuikit.tuichat.bean.message.reply.TUIReplyQuoteBean;
import com.tencent.qcloud.tuikit.tuichat.bean.message.reply.TextReplyQuoteBean;
import com.tencent.qcloud.tuikit.tuichat.bean.message.reply.VideoReplyQuoteBean;
import com.tencent.qcloud.tuikit.tuichat.component.face.FaceManager;
import com.tencent.qcloud.tuikit.tuichat.util.ChatMessageParser;
import com.tencent.qcloud.tuikit.tuichat.util.TUIChatUtils;
import h.g.a.p.a;
import h.g.a.p.p.q;
import h.g.a.t.h;
import h.g.a.t.l.p;
import java.util.ArrayList;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class QuoteMessageHolder extends TextMessageHolder {
    public final List<String> downloadEles;
    public final FrameLayout fileFrame;
    public final ImageView fileIconIv;
    public final TextView fileNameTv;
    public final FrameLayout imageFrame;
    public final ImageView imageIv;
    public String mImagePath;
    public final ImageView playIv;
    public FrameLayout quoteContentFrameLayout;
    public final TextView senderNameTv;
    public final FrameLayout soundFrame;
    public final ImageView soundIconIv;
    public final TextView soundTimeTv;
    public final FrameLayout textFrame;
    public final TextView textTv;

    public QuoteMessageHolder(View view) {
        super(view);
        this.downloadEles = new ArrayList();
        this.mImagePath = null;
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.quote_content_fl);
        this.quoteContentFrameLayout = frameLayout;
        frameLayout.setVisibility(0);
        LayoutInflater.from(view.getContext()).inflate(R.layout.quote_message_content_layout, this.quoteContentFrameLayout);
        this.senderNameTv = (TextView) this.quoteContentFrameLayout.findViewById(R.id.sender_name_tv);
        this.textFrame = (FrameLayout) this.quoteContentFrameLayout.findViewById(R.id.text_msg_area);
        this.textTv = (TextView) this.quoteContentFrameLayout.findViewById(R.id.msg_abstract_tv);
        this.imageFrame = (FrameLayout) this.quoteContentFrameLayout.findViewById(R.id.image_video_msg_area);
        this.imageIv = (ImageView) this.quoteContentFrameLayout.findViewById(R.id.msg_image_iv);
        this.playIv = (ImageView) this.quoteContentFrameLayout.findViewById(R.id.msg_play_iv);
        this.fileFrame = (FrameLayout) this.quoteContentFrameLayout.findViewById(R.id.file_msg_area);
        this.fileNameTv = (TextView) this.quoteContentFrameLayout.findViewById(R.id.file_name_tv);
        this.fileIconIv = (ImageView) this.quoteContentFrameLayout.findViewById(R.id.file_icon_iv);
        this.soundFrame = (FrameLayout) this.quoteContentFrameLayout.findViewById(R.id.sound_msg_area);
        this.soundTimeTv = (TextView) this.quoteContentFrameLayout.findViewById(R.id.sound_msg_time_tv);
        this.soundIconIv = (ImageView) this.quoteContentFrameLayout.findViewById(R.id.sound_msg_icon_iv);
    }

    public ViewGroup.LayoutParams getImageParams(ViewGroup.LayoutParams layoutParams, int i2, int i3) {
        if (i2 != 0 && i3 != 0) {
            int dimensionPixelSize = this.itemView.getResources().getDimensionPixelSize(R.dimen.reply_message_image_size);
            if (i2 > i3) {
                layoutParams.width = dimensionPixelSize;
                layoutParams.height = (dimensionPixelSize * i3) / i2;
            } else {
                layoutParams.width = (i2 * dimensionPixelSize) / i3;
                layoutParams.height = dimensionPixelSize;
            }
        }
        return layoutParams;
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder.TextMessageHolder, com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder.MessageContentHolder
    public void layoutVariableViews(TUIMessageBean tUIMessageBean, int i2) {
        tUIMessageBean.setSelectText(tUIMessageBean.getExtra());
        QuoteMessageBean quoteMessageBean = (QuoteMessageBean) tUIMessageBean;
        String extra = quoteMessageBean.getContentMessageBean().getExtra();
        String originMsgSender = quoteMessageBean.getOriginMsgSender();
        TextView textView = this.senderNameTv;
        textView.setText(originMsgSender + ": ");
        FaceManager.handlerEmojiText(this.msgBodyText, extra, false);
        performMsgAbstract(quoteMessageBean);
        this.msgArea.setOnLongClickListener(new View.OnLongClickListener(this) { // from class: com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder.QuoteMessageHolder.1
            public final /* synthetic */ QuoteMessageHolder this$0;

            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
            }
        });
        this.quoteContentFrameLayout.setOnClickListener(new View.OnClickListener(this, i2, quoteMessageBean) { // from class: com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder.QuoteMessageHolder.2
            public final /* synthetic */ QuoteMessageHolder this$0;
            public final /* synthetic */ int val$position;
            public final /* synthetic */ QuoteMessageBean val$quoteMessageBean;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        });
        setThemeColor(tUIMessageBean);
        if (this.isForwardMode || this.isReplyDetailMode) {
            return;
        }
        setSelectableTextHelper(tUIMessageBean, this.msgBodyText, i2, TextUtils.isEmpty(extra) ? false : FaceManager.handlerEmojiText(this.msgBodyText, extra, false));
    }

    public void performFile(FileReplyQuoteBean fileReplyQuoteBean) {
        this.fileFrame.setVisibility(0);
        this.fileNameTv.setText(fileReplyQuoteBean.getFileName());
    }

    public void performImage(TUIReplyQuoteBean tUIReplyQuoteBean) {
        this.imageFrame.setVisibility(0);
        int dip2px = ScreenUtil.dip2px(1.92f);
        if (tUIReplyQuoteBean instanceof FaceReplyQuoteBean) {
            FaceReplyQuoteBean faceReplyQuoteBean = (FaceReplyQuoteBean) tUIReplyQuoteBean;
            String str = new String(faceReplyQuoteBean.getData());
            ViewGroup.LayoutParams layoutParams = this.imageIv.getLayoutParams();
            if (layoutParams != null) {
                int dimensionPixelSize = this.itemView.getResources().getDimensionPixelSize(R.dimen.reply_message_image_size);
                layoutParams.width = dimensionPixelSize;
                layoutParams.height = dimensionPixelSize;
                this.imageIv.setLayoutParams(layoutParams);
            }
            FaceManager.loadFace(faceReplyQuoteBean.getIndex(), str, this.imageIv);
        } else if (tUIReplyQuoteBean instanceof ImageReplyQuoteBean) {
            ImageMessageBean imageMessageBean = (ImageMessageBean) tUIReplyQuoteBean.getMessageBean();
            ImageView imageView = this.imageIv;
            imageView.setLayoutParams(getImageParams(imageView.getLayoutParams(), imageMessageBean.getImgWidth(), imageMessageBean.getImgHeight()));
            List<ImageMessageBean.ImageBean> imageBeanList = imageMessageBean.getImageBeanList();
            String dataPath = imageMessageBean.getDataPath();
            String originImagePath = TUIChatUtils.getOriginImagePath(imageMessageBean);
            if (!TextUtils.isEmpty(originImagePath)) {
                dataPath = originImagePath;
            }
            if (!TextUtils.isEmpty(dataPath)) {
                GlideEngine.loadCornerImageWithoutPlaceHolder(this.imageIv, dataPath, null, dip2px);
                return;
            }
            GlideEngine.clear(this.imageIv);
            for (int i2 = 0; i2 < imageBeanList.size(); i2++) {
                ImageMessageBean.ImageBean imageBean = imageBeanList.get(i2);
                if (imageBean.getType() == 1) {
                    synchronized (this.downloadEles) {
                        if (!this.downloadEles.contains(imageBean.getUUID())) {
                            this.downloadEles.add(imageBean.getUUID());
                            String generateImagePath = ImageUtil.generateImagePath(imageBean.getUUID(), 1);
                            if (!generateImagePath.equals(this.mImagePath)) {
                                GlideEngine.clear(this.imageIv);
                            }
                            imageBean.downloadImage(generateImagePath, new ImageMessageBean.ImageBean.ImageDownloadCallback(this, imageBean, imageMessageBean, generateImagePath, dip2px) { // from class: com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder.QuoteMessageHolder.3
                                public final /* synthetic */ QuoteMessageHolder this$0;
                                public final /* synthetic */ int val$imageRadius;
                                public final /* synthetic */ ImageMessageBean.ImageBean val$img;
                                public final /* synthetic */ ImageMessageBean val$messageBean;
                                public final /* synthetic */ String val$path;

                                /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder.QuoteMessageHolder$3$1  reason: invalid class name */
                                /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
                                public class AnonymousClass1 implements h {
                                    public final /* synthetic */ AnonymousClass3 this$1;

                                    public AnonymousClass1(AnonymousClass3 anonymousClass3) {
                                    }

                                    @Override // h.g.a.t.h
                                    public boolean onLoadFailed(@Nullable q qVar, Object obj, p pVar, boolean z) {
                                    }

                                    @Override // h.g.a.t.h
                                    public boolean onResourceReady(Object obj, Object obj2, p pVar, a aVar, boolean z) {
                                    }
                                }

                                @Override // com.tencent.qcloud.tuikit.tuichat.bean.message.ImageMessageBean.ImageBean.ImageDownloadCallback
                                public void onError(int i3, String str2) {
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
                    return;
                }
            }
        } else if (tUIReplyQuoteBean instanceof VideoReplyQuoteBean) {
            VideoMessageBean videoMessageBean = (VideoMessageBean) tUIReplyQuoteBean.getMessageBean();
            ViewGroup.LayoutParams imageParams = getImageParams(this.imageIv.getLayoutParams(), videoMessageBean.getImgWidth(), videoMessageBean.getImgHeight());
            this.imageIv.setLayoutParams(imageParams);
            this.playIv.setLayoutParams(imageParams);
            this.playIv.setVisibility(0);
            if (!TextUtils.isEmpty(videoMessageBean.getDataPath())) {
                GlideEngine.loadCornerImageWithoutPlaceHolder(this.imageIv, videoMessageBean.getDataPath(), null, dip2px);
                return;
            }
            GlideEngine.clear(this.imageIv);
            synchronized (this.downloadEles) {
                if (!this.downloadEles.contains(videoMessageBean.getSnapshotUUID())) {
                    this.downloadEles.add(videoMessageBean.getSnapshotUUID());
                }
            }
            String str2 = TUIConfig.getImageDownloadDir() + videoMessageBean.getSnapshotUUID();
            videoMessageBean.downloadSnapshot(str2, new VideoMessageBean.VideoDownloadCallback(this, videoMessageBean, str2, dip2px) { // from class: com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder.QuoteMessageHolder.4
                public final /* synthetic */ QuoteMessageHolder this$0;
                public final /* synthetic */ int val$imageRadius;
                public final /* synthetic */ VideoMessageBean val$messageBean;
                public final /* synthetic */ String val$path;

                @Override // com.tencent.qcloud.tuikit.tuichat.bean.message.VideoMessageBean.VideoDownloadCallback
                public void onError(int i3, String str3) {
                }

                @Override // com.tencent.qcloud.tuikit.tuichat.bean.message.VideoMessageBean.VideoDownloadCallback
                public void onProgress(long j2, long j3) {
                }

                @Override // com.tencent.qcloud.tuikit.tuichat.bean.message.VideoMessageBean.VideoDownloadCallback
                public void onSuccess() {
                }
            });
        }
    }

    public void performMsgAbstract(QuoteMessageBean quoteMessageBean) {
        resetAll();
        TUIMessageBean originMessageBean = quoteMessageBean.getOriginMessageBean();
        TUIReplyQuoteBean replyQuoteBean = quoteMessageBean.getReplyQuoteBean();
        if (originMessageBean != null) {
            performQuote(replyQuoteBean, quoteMessageBean);
        } else {
            performNotFound(replyQuoteBean, quoteMessageBean);
        }
    }

    public void performNotFound(TUIReplyQuoteBean tUIReplyQuoteBean, QuoteMessageBean quoteMessageBean) {
        String msgTypeStr = ChatMessageParser.getMsgTypeStr(tUIReplyQuoteBean.getMessageType());
        String defaultAbstract = tUIReplyQuoteBean.getDefaultAbstract();
        if (ChatMessageParser.isFileType(tUIReplyQuoteBean.getMessageType())) {
            defaultAbstract = "";
        }
        performTextMessage(msgTypeStr + defaultAbstract);
    }

    public void performQuote(TUIReplyQuoteBean tUIReplyQuoteBean, QuoteMessageBean quoteMessageBean) {
        String originMsgAbstract;
        boolean z = tUIReplyQuoteBean instanceof TextReplyQuoteBean;
        if (!z && !(tUIReplyQuoteBean instanceof MergeReplyQuoteBean)) {
            if (tUIReplyQuoteBean instanceof FileReplyQuoteBean) {
                performFile((FileReplyQuoteBean) tUIReplyQuoteBean);
                return;
            } else if (tUIReplyQuoteBean instanceof SoundReplyQuoteBean) {
                performSound((SoundReplyQuoteBean) tUIReplyQuoteBean);
                return;
            } else if ((tUIReplyQuoteBean instanceof ImageReplyQuoteBean) || (tUIReplyQuoteBean instanceof VideoReplyQuoteBean) || (tUIReplyQuoteBean instanceof FaceReplyQuoteBean)) {
                performImage(tUIReplyQuoteBean);
                return;
            } else {
                return;
            }
        }
        if (z) {
            originMsgAbstract = ((TextReplyQuoteBean) tUIReplyQuoteBean).getText();
        } else {
            originMsgAbstract = quoteMessageBean.getOriginMsgAbstract();
        }
        performTextMessage(originMsgAbstract);
    }

    public void performSound(SoundReplyQuoteBean soundReplyQuoteBean) {
        this.soundFrame.setVisibility(0);
        TextView textView = this.soundTimeTv;
        textView.setText(soundReplyQuoteBean.getDuring() + "''");
    }

    public void performTextMessage(String str) {
        this.textFrame.setVisibility(0);
        FaceManager.handlerEmojiText(this.textTv, str, false);
    }

    public void resetAll() {
        this.textFrame.setVisibility(8);
        this.imageFrame.setVisibility(8);
        this.fileFrame.setVisibility(8);
        this.soundFrame.setVisibility(8);
        this.playIv.setVisibility(8);
    }

    public void setThemeColor(TUIMessageBean tUIMessageBean) {
        if (!this.isForwardMode && !this.isReplyDetailMode && tUIMessageBean.isSelf()) {
            this.msgBodyText.setTextColor(this.msgBodyText.getResources().getColor(TUIThemeManager.getAttrResId(this.msgBodyText.getContext(), R.attr.chat_self_msg_text_color)));
            return;
        }
        this.msgBodyText.setTextColor(this.msgBodyText.getResources().getColor(TUIThemeManager.getAttrResId(this.msgBodyText.getContext(), R.attr.chat_other_msg_text_color)));
    }
}
