package com.showstartfans.activity.view;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.opensource.svgaplayer.SVGAImageView;
import h.s.a.h;
import h.s.a.j;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HomeLiveEnterView.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004B\u001b\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B#\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u001e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0011J\u000e\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001aJ\u0010\u0010\u001b\u001a\u00020\u00142\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/showstartfans/activity/view/HomeLiveEnterView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ctx", "mHandler", "Landroid/os/Handler;", "svgaImageView", "Lcom/opensource/svgaplayer/SVGAImageView;", "titleStr", "", "urlStr", "bindData", "", "liveIcon", "liveUrl", "title", "changeViewStatus", "play", "", "setContext", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class HomeLiveEnterView extends LinearLayout {
    @NotNull
    public Map<Integer, View> b;
    @NotNull
    private String c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    private String f6712d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    private SVGAImageView f6713e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    private Context f6714f;
    @NotNull

    /* renamed from: g  reason: collision with root package name */
    private final Handler f6715g;

    /* compiled from: HomeLiveEnterView.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"com/showstartfans/activity/view/HomeLiveEnterView$bindData$1$1", "Lcom/opensource/svgaplayer/SVGAParser$ParseCompletion;", "onComplete", "", "videoItem", "Lcom/opensource/svgaplayer/SVGAVideoEntity;", "onError", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a implements h.d {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ HomeLiveEnterView f6716a;

        public a(HomeLiveEnterView homeLiveEnterView) {
        }

        @Override // h.s.a.h.d
        public void a(@NotNull j jVar) {
        }

        @Override // h.s.a.h.d
        public void onError() {
        }
    }

    public HomeLiveEnterView(@Nullable Context context) {
    }

    public static final /* synthetic */ Handler c(HomeLiveEnterView homeLiveEnterView) {
    }

    private static final void e(HomeLiveEnterView homeLiveEnterView, String str) {
    }

    private static final void f(String str, HomeLiveEnterView homeLiveEnterView, String str2, View view) {
    }

    public static /* synthetic */ void h(String str, HomeLiveEnterView homeLiveEnterView, String str2, View view) {
    }

    public static /* synthetic */ boolean i(HomeLiveEnterView homeLiveEnterView, Message message) {
    }

    public static /* synthetic */ void j(HomeLiveEnterView homeLiveEnterView, View view) {
    }

    public static /* synthetic */ void k(HomeLiveEnterView homeLiveEnterView, String str) {
    }

    private static final boolean l(HomeLiveEnterView homeLiveEnterView, Message message) {
    }

    private static final void m(HomeLiveEnterView homeLiveEnterView, View view) {
    }

    public void a() {
    }

    @Nullable
    public View b(int i2) {
    }

    public final void d(@NotNull String str, @NotNull String str2, @NotNull String str3) {
    }

    public final void g(boolean z) {
    }

    public final void setContext(@Nullable Context context) {
    }

    public HomeLiveEnterView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
    }

    public HomeLiveEnterView(@Nullable Context context, @Nullable AttributeSet attributeSet, int i2) {
    }
}
