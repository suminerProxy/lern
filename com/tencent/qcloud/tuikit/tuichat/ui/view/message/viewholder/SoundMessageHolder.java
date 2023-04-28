package com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder;

import android.graphics.drawable.AnimationDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.qcloud.tuicore.TUIConfig;
import com.tencent.qcloud.tuicore.TUIThemeManager;
import com.tencent.qcloud.tuikit.tuichat.R;
import com.tencent.qcloud.tuikit.tuichat.bean.message.SoundMessageBean;
import com.tencent.qcloud.tuikit.tuichat.bean.message.TUIMessageBean;
import com.tencent.qcloud.tuikit.tuichat.component.AudioPlayer;
import java.io.File;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class SoundMessageHolder extends MessageContentHolder {
    private static final int READ = 1;
    private static final int UNREAD = 0;
    private LinearLayout audioContentView;
    private ImageView audioPlayImage;
    private TextView audioTimeText;

    public SoundMessageHolder(View view) {
        super(view);
        this.audioTimeText = (TextView) view.findViewById(R.id.audio_time_tv);
        this.audioPlayImage = (ImageView) view.findViewById(R.id.audio_play_iv);
        this.audioContentView = (LinearLayout) view.findViewById(R.id.audio_content_ll);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getSound(SoundMessageBean soundMessageBean) {
        String str = TUIConfig.getRecordDownloadDir() + soundMessageBean.getUUID();
        if (!new File(str).exists()) {
            soundMessageBean.downloadSound(str, new SoundMessageBean.SoundDownloadCallback(this, soundMessageBean, str) { // from class: com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder.SoundMessageHolder.2
                public final /* synthetic */ SoundMessageHolder this$0;
                public final /* synthetic */ SoundMessageBean val$messageBean;
                public final /* synthetic */ String val$path;

                @Override // com.tencent.qcloud.tuikit.tuichat.bean.message.SoundMessageBean.SoundDownloadCallback
                public void onError(int i2, String str2) {
                }

                @Override // com.tencent.qcloud.tuikit.tuichat.bean.message.SoundMessageBean.SoundDownloadCallback
                public void onProgress(long j2, long j3) {
                }

                @Override // com.tencent.qcloud.tuikit.tuichat.bean.message.SoundMessageBean.SoundDownloadCallback
                public void onSuccess() {
                }
            });
        } else {
            soundMessageBean.setDataPath(str);
        }
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder.MessageBaseHolder
    public int getVariableLayout() {
        return R.layout.message_adapter_content_audio;
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder.MessageContentHolder
    public void layoutVariableViews(TUIMessageBean tUIMessageBean, int i2) {
        SoundMessageBean soundMessageBean = (SoundMessageBean) tUIMessageBean;
        if (soundMessageBean.isSelf()) {
            this.audioPlayImage.setImageResource(R.drawable.voice_msg_playing_3);
            this.audioPlayImage.setRotation(180.0f);
            this.audioContentView.removeView(this.audioPlayImage);
            this.audioContentView.addView(this.audioPlayImage);
            this.unreadAudioText.setVisibility(8);
        } else {
            this.audioPlayImage.setImageResource(R.drawable.voice_msg_playing_3);
            this.audioContentView.removeView(this.audioPlayImage);
            this.audioContentView.addView(this.audioPlayImage, 0);
            if (soundMessageBean.getCustomInt() == 0) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.isReadText.getLayoutParams();
                layoutParams.gravity = 16;
                layoutParams.leftMargin = 10;
                this.unreadAudioText.setVisibility(0);
                this.unreadAudioText.setLayoutParams(layoutParams);
            } else {
                this.unreadAudioText.setVisibility(8);
            }
        }
        int duration = soundMessageBean.getDuration();
        if (duration == 0) {
            duration = 1;
        }
        if (!this.isReplyDetailMode && !this.isForwardMode && tUIMessageBean.isSelf()) {
            this.audioTimeText.setTextColor(this.audioTimeText.getResources().getColor(TUIThemeManager.getAttrResId(this.audioTimeText.getContext(), R.attr.chat_self_msg_text_color)));
        } else {
            this.audioTimeText.setTextColor(this.audioTimeText.getResources().getColor(TUIThemeManager.getAttrResId(this.audioTimeText.getContext(), R.attr.chat_other_msg_text_color)));
        }
        TextView textView = this.audioTimeText;
        textView.setText(duration + "''");
        this.msgContentFrame.setOnClickListener(new View.OnClickListener(this, soundMessageBean) { // from class: com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder.SoundMessageHolder.1
            public final /* synthetic */ SoundMessageHolder this$0;
            public final /* synthetic */ SoundMessageBean val$message;

            /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder.SoundMessageHolder$1$1  reason: invalid class name and collision with other inner class name */
            /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
            public class C02241 implements AudioPlayer.Callback {
                public final /* synthetic */ AnonymousClass1 this$1;
                public final /* synthetic */ AnimationDrawable val$animationDrawable;

                /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder.SoundMessageHolder$1$1$1  reason: invalid class name and collision with other inner class name */
                /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
                public class RunnableC02251 implements Runnable {
                    public final /* synthetic */ C02241 this$2;

                    public RunnableC02251(C02241 c02241) {
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                    }
                }

                public C02241(AnonymousClass1 anonymousClass1, AnimationDrawable animationDrawable) {
                }

                @Override // com.tencent.qcloud.tuikit.tuichat.component.AudioPlayer.Callback
                public void onCompletion(Boolean bool) {
                }
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        });
    }
}
