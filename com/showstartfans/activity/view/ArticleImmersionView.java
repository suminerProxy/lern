package com.showstartfans.activity.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.showstartfans.activity.model.Article;
import com.showstartfans.activity.model.SceneDetailCommBean;
import com.showstartfans.activity.view.BaseImmersionView;
import h.a.a.a.a.i.g;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ArticleImmersionView.kt */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001,B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u0018\u001a\u0004\u0018\u00010\u0016J\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\tJ\u000e\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\tJ\u0006\u0010\u001e\u001a\u00020\u001aJ\u000e\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\tJ\u0018\u0010 \u001a\u00020\u001a2\b\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010\u001c\u001a\u00020\tJ\u001e\u0010#\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\t2\u0006\u0010$\u001a\u00020\t2\u0006\u0010%\u001a\u00020&J\u000e\u0010'\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\tJ\u000e\u0010(\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\tJ\"\u0010)\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\t2\b\u0010*\u001a\u0004\u0018\u00010+2\b\u0010\f\u001a\u0004\u0018\u00010\rR\u000e\u0010\u000b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R*\u0010\u0014\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00160\u0015j\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0016`\u0017X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/showstartfans/activity/view/ArticleImmersionView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "currentPosition", "observer", "Lcom/showstartfans/activity/view/ArticleImmersionView$ImmersionObserver;", "sunJian", "Lcom/showstartfans/activity/view/ImmersionSunJianView;", "tuwen", "Lcom/showstartfans/activity/view/ImmersionTuWenView;", "video", "Lcom/showstartfans/activity/view/ImmersionVideoView;", "viewMap", "Ljava/util/HashMap;", "Lcom/showstartfans/activity/view/BaseImmersionView;", "Lkotlin/collections/HashMap;", "getMainView", "onActivityFinish", "", "onActivityPause", g.C, "onActivityRestart", "onActivityResume", "onActivityStop", "onAddReview", "bean", "Lcom/showstartfans/activity/model/SceneDetailCommBean;", "onControlSeetTo", "progress", "touchMode", "Lcom/showstartfans/activity/view/BaseImmersionView$SeekBarMode;", "onPageHide", "onPageSelected", "setData", "data", "Lcom/showstartfans/activity/model/Article;", "ImmersionObserver", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class ArticleImmersionView extends FrameLayout {
    @NotNull
    public Map<Integer, View> b;
    @Nullable
    private ImmersionVideoView c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    private ImmersionTuWenView f6575d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    private ImmersionSunJianView f6576e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    private a f6577f;
    @NotNull

    /* renamed from: g  reason: collision with root package name */
    private HashMap<Integer, BaseImmersionView> f6578g;

    /* renamed from: h  reason: collision with root package name */
    private int f6579h;

    /* compiled from: ArticleImmersionView.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lcom/showstartfans/activity/view/ArticleImmersionView$ImmersionObserver;", "", "()V", "onDoubleClick", "", "onVideoPause", "onVideoPlayBegin", "onVideoProgress", "progress", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static abstract class a {
        public void a() {
        }

        public void b() {
        }

        public void c() {
        }

        public void d(int i2) {
        }
    }

    public ArticleImmersionView(@NotNull Context context) {
    }

    public void a() {
    }

    @Nullable
    public View b(int i2) {
    }

    public final void c() {
    }

    public final void d(int i2) {
    }

    public final void e(int i2) {
    }

    public final void f() {
    }

    public final void g(int i2) {
    }

    @Nullable
    public final BaseImmersionView getMainView() {
    }

    public final void h(@Nullable SceneDetailCommBean sceneDetailCommBean, int i2) {
    }

    public final void i(int i2, int i3, @NotNull BaseImmersionView.a aVar) {
    }

    public final void j(int i2) {
    }

    public final void k(int i2) {
    }

    public final void l(int i2, @Nullable Article article, @Nullable a aVar) {
    }

    public ArticleImmersionView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
    }

    public ArticleImmersionView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i2) {
    }
}
