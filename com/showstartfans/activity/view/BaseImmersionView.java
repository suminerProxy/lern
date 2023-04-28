package com.showstartfans.activity.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.showstartfans.activity.model.Article;
import com.showstartfans.activity.model.SceneDetailCommBean;
import com.showstartfans.activity.view.ArticleImmersionView;
import h.a.a.a.a.i.g;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import skin.support.widget.SkinCompatFrameLayout;

/* compiled from: BaseImmersionView.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001:\u0001)B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004B\u001b\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B#\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\u001a\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H&J\b\u0010\u0017\u001a\u00020\tH&J\b\u0010\u0018\u001a\u00020\u0012H\u0014J\b\u0010\u0019\u001a\u00020\u0012H\u0016J\b\u0010\u001a\u001a\u00020\u0012H\u0016J\b\u0010\u001b\u001a\u00020\u0012H\u0016J\b\u0010\u001c\u001a\u00020\u0012H\u0016J\b\u0010\u001d\u001a\u00020\u0012H\u0016J\u0018\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\t2\u0006\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020\u0012H&J\u0012\u0010#\u001a\u00020\u00122\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\b\u0010&\u001a\u00020\u0012H&J\u0010\u0010'\u001a\u00020\u00122\b\u0010(\u001a\u0004\u0018\u00010\fR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006*"}, d2 = {"Lcom/showstartfans/activity/view/BaseImmersionView;", "Lskin/support/widget/SkinCompatFrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mObserver", "Lcom/showstartfans/activity/view/ArticleImmersionView$ImmersionObserver;", "getMObserver", "()Lcom/showstartfans/activity/view/ArticleImmersionView$ImmersionObserver;", "setMObserver", "(Lcom/showstartfans/activity/view/ArticleImmersionView$ImmersionObserver;)V", "OnBindViewHolder", "", g.C, "data", "Lcom/showstartfans/activity/model/Article;", "OnBindViewHolder_", "getLayoutId", "initView", "onActivityFinish", "onActivityPause", "onActivityRestart", "onActivityResume", "onActivityStop", "onControlSeetTo", "progress", "touchMode", "Lcom/showstartfans/activity/view/BaseImmersionView$SeekBarMode;", "onPageHide", "onReviewSuccess", "bean", "Lcom/showstartfans/activity/model/SceneDetailCommBean;", "onSelected", "setObserver", "observer", "SeekBarMode", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public abstract class BaseImmersionView extends SkinCompatFrameLayout {
    @NotNull
    public Map<Integer, View> b;
    @Nullable
    private ArticleImmersionView.a c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* compiled from: BaseImmersionView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/showstartfans/activity/view/BaseImmersionView$SeekBarMode;", "", "(Ljava/lang/String;I)V", "TouchStart", "TouchStop", "Touching", "UnTouch", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a {
        private static final /* synthetic */ a[] $VALUES = null;
        public static final a TouchStart = null;
        public static final a TouchStop = null;
        public static final a Touching = null;
        public static final a UnTouch = null;

        private static final /* synthetic */ a[] $values() {
        }

        private a(String str, int i2) {
        }

        public static a valueOf(String str) {
        }

        public static a[] values() {
        }
    }

    public BaseImmersionView(@Nullable Context context) {
    }

    public final void e(int i2, @Nullable Article article) {
    }

    public abstract void f(int i2, @Nullable Article article);

    public void g() {
    }

    public abstract int getLayoutId();

    @Nullable
    public final ArticleImmersionView.a getMObserver() {
    }

    @Nullable
    public View h(int i2) {
    }

    public void i() {
    }

    public void j() {
    }

    public void k() {
    }

    public void l() {
    }

    public void m() {
    }

    public void n() {
    }

    public void o(int i2, @NotNull a aVar) {
    }

    public abstract void p();

    public void q(@Nullable SceneDetailCommBean sceneDetailCommBean) {
    }

    public abstract void r();

    public final void setMObserver(@Nullable ArticleImmersionView.a aVar) {
    }

    public final void setObserver(@Nullable ArticleImmersionView.a aVar) {
    }

    public BaseImmersionView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
    }

    public BaseImmersionView(@Nullable Context context, @Nullable AttributeSet attributeSet, int i2) {
    }
}
