package com.tencent.thumbplayer.tplayer;

import com.tencent.thumbplayer.api.ITPPlayer;
import com.tencent.thumbplayer.api.ITPPlayerListener;
import com.tencent.thumbplayer.api.TPAudioFrameBuffer;
import com.tencent.thumbplayer.api.TPDrmInfo;
import com.tencent.thumbplayer.api.TPPlayerDetailInfo;
import com.tencent.thumbplayer.api.TPPostProcessFrameBuffer;
import com.tencent.thumbplayer.api.TPRemoteSdpInfo;
import com.tencent.thumbplayer.api.TPSubtitleData;
import com.tencent.thumbplayer.api.TPSubtitleFrameBuffer;
import com.tencent.thumbplayer.api.TPVideoFrameBuffer;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class c implements ITPPlayerListener.IOnAudioFrameOutputListener, ITPPlayerListener.IOnAudioProcessFrameOutputListener, ITPPlayerListener.IOnCompletionListener, ITPPlayerListener.IOnDemuxerListener, ITPPlayerListener.IOnDetailInfoListener, ITPPlayerListener.IOnErrorListener, ITPPlayerListener.IOnEventRecordListener, ITPPlayerListener.IOnInfoListener, ITPPlayerListener.IOnPreparedListener, ITPPlayerListener.IOnSeekCompleteListener, ITPPlayerListener.IOnStateChangeListener, ITPPlayerListener.IOnStopAsyncCompleteListener, ITPPlayerListener.IOnSubtitleDataListener, ITPPlayerListener.IOnSubtitleFrameOutListener, ITPPlayerListener.IOnVideoFrameOutListener, ITPPlayerListener.IOnVideoProcessFrameOutputListener, ITPPlayerListener.IOnVideoSizeChangedListener {

    /* renamed from: a  reason: collision with root package name */
    private ITPPlayerListener.IOnPreparedListener f13522a;
    private ITPPlayerListener.IOnCompletionListener b;
    private ITPPlayerListener.IOnInfoListener c;

    /* renamed from: d  reason: collision with root package name */
    private ITPPlayerListener.IOnErrorListener f13523d;

    /* renamed from: e  reason: collision with root package name */
    private ITPPlayerListener.IOnSeekCompleteListener f13524e;

    /* renamed from: f  reason: collision with root package name */
    private ITPPlayerListener.IOnVideoSizeChangedListener f13525f;

    /* renamed from: g  reason: collision with root package name */
    private ITPPlayerListener.IOnSubtitleDataListener f13526g;

    /* renamed from: h  reason: collision with root package name */
    private ITPPlayerListener.IOnSubtitleFrameOutListener f13527h;

    /* renamed from: i  reason: collision with root package name */
    private ITPPlayerListener.IOnVideoFrameOutListener f13528i;

    /* renamed from: j  reason: collision with root package name */
    private ITPPlayerListener.IOnAudioFrameOutputListener f13529j;

    /* renamed from: k  reason: collision with root package name */
    private ITPPlayerListener.IOnVideoProcessFrameOutputListener f13530k;

    /* renamed from: l  reason: collision with root package name */
    private ITPPlayerListener.IOnAudioProcessFrameOutputListener f13531l;

    /* renamed from: m  reason: collision with root package name */
    private ITPPlayerListener.IOnStateChangeListener f13532m;

    /* renamed from: n  reason: collision with root package name */
    private ITPPlayerListener.IOnStopAsyncCompleteListener f13533n;

    /* renamed from: o  reason: collision with root package name */
    private ITPPlayerListener.IOnDetailInfoListener f13534o;

    /* renamed from: p  reason: collision with root package name */
    private ITPPlayerListener.IOnEventRecordListener f13535p;
    private ITPPlayerListener.IOnDemuxerListener q;
    private a r;
    private String s;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class a implements ITPPlayerListener.IOnAudioFrameOutputListener, ITPPlayerListener.IOnAudioProcessFrameOutputListener, ITPPlayerListener.IOnCompletionListener, ITPPlayerListener.IOnDemuxerListener, ITPPlayerListener.IOnDetailInfoListener, ITPPlayerListener.IOnErrorListener, ITPPlayerListener.IOnEventRecordListener, ITPPlayerListener.IOnInfoListener, ITPPlayerListener.IOnPreparedListener, ITPPlayerListener.IOnSeekCompleteListener, ITPPlayerListener.IOnStateChangeListener, ITPPlayerListener.IOnStopAsyncCompleteListener, ITPPlayerListener.IOnSubtitleDataListener, ITPPlayerListener.IOnSubtitleFrameOutListener, ITPPlayerListener.IOnVideoFrameOutListener, ITPPlayerListener.IOnVideoProcessFrameOutputListener, ITPPlayerListener.IOnVideoSizeChangedListener {

        /* renamed from: a  reason: collision with root package name */
        private String f13536a;

        public a(String str) {
        }

        public static /* synthetic */ String a(a aVar, String str) {
        }

        @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnAudioFrameOutputListener
        public void onAudioFrameOut(ITPPlayer iTPPlayer, TPAudioFrameBuffer tPAudioFrameBuffer) {
        }

        @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnAudioProcessFrameOutputListener
        public TPPostProcessFrameBuffer onAudioProcessFrameOut(ITPPlayer iTPPlayer, TPPostProcessFrameBuffer tPPostProcessFrameBuffer) {
        }

        @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnCompletionListener
        public void onCompletion(ITPPlayer iTPPlayer) {
        }

        @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnDetailInfoListener
        public void onDetailInfo(ITPPlayer iTPPlayer, TPPlayerDetailInfo tPPlayerDetailInfo) {
        }

        @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnEventRecordListener
        public void onDrmInfo(ITPPlayer iTPPlayer, TPDrmInfo tPDrmInfo) {
        }

        @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnErrorListener
        public void onError(ITPPlayer iTPPlayer, int i2, int i3, long j2, long j3) {
        }

        @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnInfoListener
        public void onInfo(ITPPlayer iTPPlayer, int i2, long j2, long j3, Object obj) {
        }

        @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnPreparedListener
        public void onPrepared(ITPPlayer iTPPlayer) {
        }

        @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnDemuxerListener
        public TPRemoteSdpInfo onSdpExchange(ITPPlayer iTPPlayer, String str, int i2) {
        }

        @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnSeekCompleteListener
        public void onSeekComplete(ITPPlayer iTPPlayer) {
        }

        @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnStateChangeListener
        public void onStateChange(int i2, int i3) {
        }

        @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnStopAsyncCompleteListener
        public void onStopAsyncComplete(ITPPlayer iTPPlayer) {
        }

        @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnSubtitleDataListener
        public void onSubtitleData(ITPPlayer iTPPlayer, TPSubtitleData tPSubtitleData) {
        }

        @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnSubtitleFrameOutListener
        public void onSubtitleFrameOut(ITPPlayer iTPPlayer, TPSubtitleFrameBuffer tPSubtitleFrameBuffer) {
        }

        @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnVideoFrameOutListener
        public void onVideoFrameOut(ITPPlayer iTPPlayer, TPVideoFrameBuffer tPVideoFrameBuffer) {
        }

        @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnVideoProcessFrameOutputListener
        public TPPostProcessFrameBuffer onVideoProcessFrameOut(ITPPlayer iTPPlayer, TPPostProcessFrameBuffer tPPostProcessFrameBuffer) {
        }

        @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnVideoSizeChangedListener
        public void onVideoSizeChanged(ITPPlayer iTPPlayer, long j2, long j3) {
        }
    }

    public c(String str) {
    }

    public void a() {
    }

    public void a(ITPPlayerListener.IOnAudioFrameOutputListener iOnAudioFrameOutputListener) {
    }

    public void a(ITPPlayerListener.IOnAudioProcessFrameOutputListener iOnAudioProcessFrameOutputListener) {
    }

    public void a(ITPPlayerListener.IOnCompletionListener iOnCompletionListener) {
    }

    public void a(ITPPlayerListener.IOnDemuxerListener iOnDemuxerListener) {
    }

    public void a(ITPPlayerListener.IOnDetailInfoListener iOnDetailInfoListener) {
    }

    public void a(ITPPlayerListener.IOnErrorListener iOnErrorListener) {
    }

    public void a(ITPPlayerListener.IOnEventRecordListener iOnEventRecordListener) {
    }

    public void a(ITPPlayerListener.IOnInfoListener iOnInfoListener) {
    }

    public void a(ITPPlayerListener.IOnPreparedListener iOnPreparedListener) {
    }

    public void a(ITPPlayerListener.IOnSeekCompleteListener iOnSeekCompleteListener) {
    }

    public void a(ITPPlayerListener.IOnStateChangeListener iOnStateChangeListener) {
    }

    public void a(ITPPlayerListener.IOnStopAsyncCompleteListener iOnStopAsyncCompleteListener) {
    }

    public void a(ITPPlayerListener.IOnSubtitleDataListener iOnSubtitleDataListener) {
    }

    public void a(ITPPlayerListener.IOnSubtitleFrameOutListener iOnSubtitleFrameOutListener) {
    }

    public void a(ITPPlayerListener.IOnVideoFrameOutListener iOnVideoFrameOutListener) {
    }

    public void a(ITPPlayerListener.IOnVideoProcessFrameOutputListener iOnVideoProcessFrameOutputListener) {
    }

    public void a(ITPPlayerListener.IOnVideoSizeChangedListener iOnVideoSizeChangedListener) {
    }

    public void a(String str) {
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnAudioFrameOutputListener
    public void onAudioFrameOut(ITPPlayer iTPPlayer, TPAudioFrameBuffer tPAudioFrameBuffer) {
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnAudioProcessFrameOutputListener
    public TPPostProcessFrameBuffer onAudioProcessFrameOut(ITPPlayer iTPPlayer, TPPostProcessFrameBuffer tPPostProcessFrameBuffer) {
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnCompletionListener
    public void onCompletion(ITPPlayer iTPPlayer) {
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnDetailInfoListener
    public void onDetailInfo(ITPPlayer iTPPlayer, TPPlayerDetailInfo tPPlayerDetailInfo) {
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnEventRecordListener
    public void onDrmInfo(ITPPlayer iTPPlayer, TPDrmInfo tPDrmInfo) {
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnErrorListener
    public void onError(ITPPlayer iTPPlayer, int i2, int i3, long j2, long j3) {
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnInfoListener
    public void onInfo(ITPPlayer iTPPlayer, int i2, long j2, long j3, Object obj) {
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnPreparedListener
    public void onPrepared(ITPPlayer iTPPlayer) {
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnDemuxerListener
    public TPRemoteSdpInfo onSdpExchange(ITPPlayer iTPPlayer, String str, int i2) {
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnSeekCompleteListener
    public void onSeekComplete(ITPPlayer iTPPlayer) {
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnStateChangeListener
    public void onStateChange(int i2, int i3) {
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnStopAsyncCompleteListener
    public void onStopAsyncComplete(ITPPlayer iTPPlayer) {
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnSubtitleDataListener
    public void onSubtitleData(ITPPlayer iTPPlayer, TPSubtitleData tPSubtitleData) {
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnSubtitleFrameOutListener
    public void onSubtitleFrameOut(ITPPlayer iTPPlayer, TPSubtitleFrameBuffer tPSubtitleFrameBuffer) {
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnVideoFrameOutListener
    public void onVideoFrameOut(ITPPlayer iTPPlayer, TPVideoFrameBuffer tPVideoFrameBuffer) {
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnVideoProcessFrameOutputListener
    public TPPostProcessFrameBuffer onVideoProcessFrameOut(ITPPlayer iTPPlayer, TPPostProcessFrameBuffer tPPostProcessFrameBuffer) {
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnVideoSizeChangedListener
    public void onVideoSizeChanged(ITPPlayer iTPPlayer, long j2, long j3) {
    }
}
