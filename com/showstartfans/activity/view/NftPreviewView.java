package com.showstartfans.activity.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.baidu.platform.comapi.map.MapBundleKey;
import com.facebook.drawee.view.SimpleDraweeView;
import com.showstartfans.activity.view.DyVideoView;
import com.taihebase.activity.base.BaseViewGroup;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: NftPreviewView.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010!\u001a\u00020\"H\u0014J\u0010\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\fH\u0014J\u0006\u0010%\u001a\u00020\"J\u0006\u0010&\u001a\u00020\"J\u0006\u0010'\u001a\u00020\"J\u001a\u0010(\u001a\u00020\"2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010 \u001a\u0004\u0018\u00010\u001aJ\u0006\u0010)\u001a\u00020\"R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u000e\u0010\u0012\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0010\u0010 \u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/showstartfans/activity/view/NftPreviewView;", "Lcom/taihebase/activity/base/BaseViewGroup;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "isAutoPlay", "", "()Z", "setAutoPlay", "(Z)V", "isLoop", "setLoop", "isPlaying", "isTouchPausing", "nftImage", "Lcom/facebook/drawee/view/SimpleDraweeView;", "nftVideo", "Lcom/showstartfans/activity/view/DyVideoView;", "playCompleted", "poster", "", MapBundleKey.OfflineMapKey.OFFLINE_TOTAL_SIZE, "getSize", "()I", "setSize", "(I)V", "videoUrl", "onDetachedFromWindow", "", "onVisibleChangeCustom", "isVisible", "pauseVideo", "playVideo", "replayVideo", "setData", "stopVideo", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class NftPreviewView extends BaseViewGroup {
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    public Map<Integer, View> f6865e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    private SimpleDraweeView f6866f;
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    private DyVideoView f6867g;
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    private String f6868h;
    @Nullable

    /* renamed from: i  reason: collision with root package name */
    private String f6869i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f6870j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f6871k;

    /* renamed from: l  reason: collision with root package name */
    private int f6872l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f6873m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f6874n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f6875o;

    /* compiled from: NftPreviewView.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016¨\u0006\n"}, d2 = {"com/showstartfans/activity/view/NftPreviewView$1", "Lcom/showstartfans/activity/view/DyVideoView$DySuperPlayerObserver;", "onPlayBegin", "", "name", "", "onPlayPause", "isTouch", "", "onPlayStop", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a extends DyVideoView.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ NftPreviewView f6876a;

        public a(NftPreviewView nftPreviewView) {
        }

        @Override // com.showstartfans.activity.view.DyVideoView.a
        public void a(@Nullable String str) {
        }

        @Override // com.showstartfans.activity.view.DyVideoView.a
        public void d(boolean z) {
        }

        @Override // com.showstartfans.activity.view.DyVideoView.a
        public void g() {
        }
    }

    public NftPreviewView(@NotNull Context context) {
    }

    public static final /* synthetic */ void k(NftPreviewView nftPreviewView, boolean z) {
    }

    public static final /* synthetic */ void l(NftPreviewView nftPreviewView, boolean z) {
    }

    @Override // com.taihebase.activity.base.BaseViewGroup
    public void a() {
    }

    @Override // com.taihebase.activity.base.BaseViewGroup
    @Nullable
    public View b(int i2) {
    }

    public final int getSize() {
    }

    @Override // com.taihebase.activity.base.BaseViewGroup
    public void j(boolean z) {
    }

    public final boolean m() {
    }

    public final boolean n() {
    }

    public final void o() {
    }

    @Override // com.taihebase.activity.base.BaseViewGroup, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
    }

    public final void p() {
    }

    public final void q() {
    }

    public final void r(@Nullable String str, @Nullable String str2) {
    }

    public final void s() {
    }

    public final void setAutoPlay(boolean z) {
    }

    public final void setLoop(boolean z) {
    }

    public final void setSize(int i2) {
    }

    public NftPreviewView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
    }

    public NftPreviewView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i2) {
    }
}
