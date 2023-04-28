package com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tencent.qcloud.tuicore.TUIThemeManager;
import com.tencent.qcloud.tuicore.util.FileUtil;
import com.tencent.qcloud.tuikit.tuichat.R;
import com.tencent.qcloud.tuikit.tuichat.TUIChatService;
import com.tencent.qcloud.tuikit.tuichat.bean.message.FileMessageBean;
import com.tencent.qcloud.tuikit.tuichat.bean.message.TUIMessageBean;
import com.tencent.qcloud.tuikit.tuichat.component.ProgressPresenter;
import com.tencent.qcloud.tuikit.tuichat.interfaces.NetworkConnectionListener;
import com.tencent.qcloud.tuikit.tuichat.ui.view.message.reply.ChatFlowReactView;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class FileMessageHolder extends MessageContentHolder {
    private TextView fileNameText;
    private TextView fileSizeText;
    private TextView fileStatusText;
    private String msgId;
    private NetworkConnectionListener networkConnectionListener;
    private Drawable normalBackground;
    private ProgressDrawable progressDrawable;
    private ProgressPresenter.ProgressListener progressListener;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class ProgressDrawable extends Drawable {
        private Drawable backgroundDrawable;
        private final Paint borderPaint;
        private final float borderWidth;
        private final Paint highLightPaint;
        private final Path highLightPath;
        private boolean isSelf;
        private final Paint paint;
        private int progress;
        private final Path rectPath;
        private final Path solidPath;

        public void clearHighLightColor() {
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(@NonNull Canvas canvas) {
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i2) {
        }

        public void setBackgroundDrawable(Drawable drawable) {
        }

        public void setBorderColor(int i2) {
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(@Nullable ColorFilter colorFilter) {
        }

        public void setHighLightColor(int i2) {
        }

        public void setPaintColor(int i2) {
        }

        public void setProgress(int i2) {
        }

        public void setSelf(boolean z) {
        }
    }

    public FileMessageHolder(View view) {
        super(view);
        this.fileNameText = (TextView) view.findViewById(R.id.file_name_tv);
        this.fileSizeText = (TextView) view.findViewById(R.id.file_size_tv);
        this.fileStatusText = (TextView) view.findViewById(R.id.file_status_tv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void downloadFile(FileMessageBean fileMessageBean, String str, String str2, boolean z) {
        if (fileMessageBean.getDownloadStatus() == 6) {
            return;
        }
        if (fileMessageBean.getDownloadStatus() == 4 && z) {
            return;
        }
        fileMessageBean.setDownloadStatus(4);
        this.fileStatusText.setText(R.string.downloading);
        fileMessageBean.downloadFile(str, new FileMessageBean.FileDownloadCallback(this, fileMessageBean, str, str2) { // from class: com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder.FileMessageHolder.6
            public final /* synthetic */ FileMessageHolder this$0;
            public final /* synthetic */ String val$fileName;
            public final /* synthetic */ FileMessageBean val$message;
            public final /* synthetic */ String val$path;

            /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder.FileMessageHolder$6$1  reason: invalid class name */
            /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
            public class AnonymousClass1 implements View.OnClickListener {
                public final /* synthetic */ AnonymousClass6 this$1;

                public AnonymousClass1(AnonymousClass6 anonymousClass6) {
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                }
            }

            @Override // com.tencent.qcloud.tuikit.tuichat.bean.message.FileMessageBean.FileDownloadCallback
            public void onError(int i2, String str3) {
            }

            @Override // com.tencent.qcloud.tuikit.tuichat.bean.message.FileMessageBean.FileDownloadCallback
            public void onProgress(long j2, long j3) {
            }

            @Override // com.tencent.qcloud.tuikit.tuichat.bean.message.FileMessageBean.FileDownloadCallback
            public void onSuccess() {
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateProgress(int i2, TUIMessageBean tUIMessageBean) {
        if (TextUtils.equals(tUIMessageBean.getId(), this.msgId)) {
            if (!tUIMessageBean.isSelf()) {
                this.fileStatusText.setText(R.string.downloading);
            } else {
                this.fileStatusText.setText(R.string.sending);
            }
            tUIMessageBean.setDownloadStatus(4);
            if (i2 != 0 && i2 != 100) {
                Drawable background = this.msgArea.getBackground();
                if (background != null) {
                    ProgressDrawable progressDrawable = this.progressDrawable;
                    if (progressDrawable == null) {
                        ProgressDrawable progressDrawable2 = new ProgressDrawable();
                        this.progressDrawable = progressDrawable2;
                        progressDrawable2.setProgress(i2);
                        Context context = this.itemView.getContext();
                        this.progressDrawable.setPaintColor(context.getResources().getColor(TUIThemeManager.getAttrResId(context, R.attr.core_bubble_bg_color)));
                        this.progressDrawable.setBorderColor(context.getResources().getColor(R.color.chat_message_bubble_bg_stoke_color));
                        this.progressDrawable.setSelf(tUIMessageBean.isSelf());
                        this.progressDrawable.setBackgroundDrawable(background);
                        this.msgArea.setBackground(this.progressDrawable);
                        return;
                    }
                    progressDrawable.setProgress(i2);
                    this.msgArea.setBackground(this.progressDrawable);
                    this.msgArea.getBackground().invalidateSelf();
                    return;
                }
                return;
            }
            this.msgArea.setBackground(this.normalBackground);
            ProgressDrawable progressDrawable3 = this.progressDrawable;
            if (progressDrawable3 != null) {
                progressDrawable3.setProgress(0);
            }
            if (i2 == 100) {
                if (!tUIMessageBean.isSelf()) {
                    this.fileStatusText.setText(R.string.downloaded);
                } else {
                    this.fileStatusText.setText(R.string.sended);
                }
                tUIMessageBean.setDownloadStatus(6);
            }
        }
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder.MessageBaseHolder
    public void clearHighLightBackground() {
        Drawable drawable = this.normalBackground;
        if (drawable != null) {
            drawable.setColorFilter(null);
        }
        ProgressDrawable progressDrawable = this.progressDrawable;
        if (progressDrawable != null) {
            progressDrawable.clearHighLightColor();
            this.progressDrawable.invalidateSelf();
        }
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder.MessageBaseHolder
    public int getVariableLayout() {
        return R.layout.message_adapter_content_file;
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder.MessageContentHolder
    public void layoutVariableViews(TUIMessageBean tUIMessageBean, int i2) {
        this.msgArea.setPadding(0, 0, 0, 0);
        this.msgId = tUIMessageBean.getId();
        ChatFlowReactView chatFlowReactView = this.reactView;
        chatFlowReactView.setThemeColorId(TUIThemeManager.getAttrResId(chatFlowReactView.getContext(), R.attr.chat_react_other_text_color));
        if (!this.isForwardMode && !this.isReplyDetailMode) {
            if (tUIMessageBean.isSelf()) {
                if (this.properties.getRightBubble() != null && this.properties.getRightBubble().getConstantState() != null) {
                    this.msgArea.setBackground(this.properties.getRightBubble().getConstantState().newDrawable());
                } else {
                    this.msgArea.setBackgroundResource(R.drawable.chat_bubble_self_cavity_bg);
                }
            } else if (this.properties.getLeftBubble() != null && this.properties.getLeftBubble().getConstantState() != null) {
                this.msgArea.setBackground(this.properties.getLeftBubble().getConstantState().newDrawable());
            } else {
                this.msgArea.setBackgroundResource(R.drawable.chat_bubble_other_cavity_bg);
            }
        } else {
            this.msgArea.setBackgroundResource(R.drawable.chat_bubble_other_cavity_bg);
            this.statusImage.setVisibility(8);
        }
        this.normalBackground = this.msgArea.getBackground();
        this.progressListener = new ProgressPresenter.ProgressListener(this, tUIMessageBean) { // from class: com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder.FileMessageHolder.1
            public final /* synthetic */ FileMessageHolder this$0;
            public final /* synthetic */ TUIMessageBean val$msg;

            @Override // com.tencent.qcloud.tuikit.tuichat.component.ProgressPresenter.ProgressListener
            public void onProgress(int i3) {
            }
        };
        this.sendingProgress.setVisibility(8);
        FileMessageBean fileMessageBean = (FileMessageBean) tUIMessageBean;
        String dataPath = fileMessageBean.getDataPath();
        this.fileNameText.setText(fileMessageBean.getFileName());
        String formatFileSize = FileUtil.formatFileSize(fileMessageBean.getFileSize());
        String fileName = fileMessageBean.getFileName();
        this.fileSizeText.setText(formatFileSize);
        if (!this.isMultiSelectMode) {
            this.msgContentFrame.setOnClickListener(new View.OnClickListener(this, fileMessageBean, dataPath, fileName) { // from class: com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder.FileMessageHolder.2
                public final /* synthetic */ FileMessageHolder this$0;
                public final /* synthetic */ String val$fileName;
                public final /* synthetic */ FileMessageBean val$message;
                public final /* synthetic */ String val$path;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                }
            });
        } else {
            this.msgContentFrame.setOnClickListener(new View.OnClickListener(this, i2, tUIMessageBean) { // from class: com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder.FileMessageHolder.3
                public final /* synthetic */ FileMessageHolder this$0;
                public final /* synthetic */ TUIMessageBean val$msg;
                public final /* synthetic */ int val$position;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                }
            });
        }
        if (fileMessageBean.getStatus() == 2 && fileMessageBean.getDownloadStatus() == 6) {
            this.fileStatusText.setText(R.string.sended);
        } else if (fileMessageBean.getStatus() == 1) {
            this.fileStatusText.setText(R.string.sending);
        } else if (fileMessageBean.getStatus() == 3) {
            this.fileStatusText.setText(R.string.send_failed);
        } else if (fileMessageBean.getDownloadStatus() == 4) {
            this.fileStatusText.setText(R.string.downloading);
        } else if (fileMessageBean.getDownloadStatus() == 6) {
            if (!fileMessageBean.isSelf()) {
                this.fileStatusText.setText(R.string.downloaded);
            } else {
                this.fileStatusText.setText(R.string.sended);
            }
        } else if (fileMessageBean.getDownloadStatus() == 5) {
            this.fileStatusText.setText(R.string.un_download);
        }
        if (fileMessageBean.getDownloadStatus() == 5) {
            if (this.isMultiSelectMode) {
                return;
            }
            this.msgContentFrame.setOnClickListener(new View.OnClickListener(this, fileMessageBean, dataPath, fileName) { // from class: com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder.FileMessageHolder.4
                public final /* synthetic */ FileMessageHolder this$0;
                public final /* synthetic */ String val$fileName;
                public final /* synthetic */ FileMessageBean val$message;
                public final /* synthetic */ String val$path;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                }
            });
        }
        this.networkConnectionListener = new NetworkConnectionListener(this, fileMessageBean, dataPath, fileName) { // from class: com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder.FileMessageHolder.5
            public final /* synthetic */ FileMessageHolder this$0;
            public final /* synthetic */ String val$fileName;
            public final /* synthetic */ FileMessageBean val$message;
            public final /* synthetic */ String val$path;

            @Override // com.tencent.qcloud.tuikit.tuichat.interfaces.NetworkConnectionListener
            public void onConnected() {
            }
        };
        TUIChatService.getInstance().registerNetworkListener(this.networkConnectionListener);
        ProgressPresenter.getInstance().registerProgressListener(tUIMessageBean.getId(), this.progressListener);
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder.MessageContentHolder
    public void onRecycled() {
        this.progressListener = null;
        ProgressPresenter.getInstance().unregisterProgressListener(this.msgId, this.progressListener);
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder.MessageBaseHolder
    public void setHighLightBackground(int i2) {
        Drawable drawable = this.normalBackground;
        if (drawable != null) {
            drawable.setColorFilter(i2, PorterDuff.Mode.SRC_IN);
        }
        ProgressDrawable progressDrawable = this.progressDrawable;
        if (progressDrawable != null) {
            progressDrawable.setHighLightColor(i2);
            this.progressDrawable.invalidateSelf();
        }
    }
}
