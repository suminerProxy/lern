package tencent.txlive.zhibo.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.opensource.svgaplayer.SVGAImageView;
import com.showstartfans.activity.model.LiveShowMenuEventMsgBean;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.taihebase.activity.view.LoadImageView;
import h.a.a.a.a.i.g;
import h.u.a.w.c0.e2;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tencent.txlive.zhibo.audience.BaseLiveRecycleAdapter;

/* compiled from: LiveMenuAdapter.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u001a\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0018\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000eH\u0016J\u0018\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000eH\u0016J\u0018\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u0003J\u0010\u0010\u0018\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0010\u0010\u0019\u001a\u00020\u001a2\b\u0010\u0005\u001a\u0004\u0018\u00010\u001bR\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Ltencent/txlive/zhibo/ui/LiveMenuAdapter;", "Ltencent/txlive/zhibo/audience/BaseLiveRecycleAdapter;", "Lcom/showstartfans/activity/model/LiveShowMenuEventMsgBean;", "ctx", "Landroid/content/Context;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "(Landroid/content/Context;Landroidx/recyclerview/widget/RecyclerView;)V", "liveMenuDialog", "Lcom/showstartfans/activity/widget/dialog/LiveMenuDialog;", "followUserALL", "", "bean", "poi", "", "onBindViewHolder", "mholder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", g.C, "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "remindCla", "setDialog", "showFloatPreDialog", "", "Landroid/view/View;", "ViewHolder", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class LiveMenuAdapter extends BaseLiveRecycleAdapter<LiveShowMenuEventMsgBean> {
    @Nullable
    private e2 liveMenuDialog;

    /* compiled from: LiveMenuAdapter.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\bR\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\b¨\u0006\u0019"}, d2 = {"Ltencent/txlive/zhibo/ui/LiveMenuAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "followBtn", "Landroid/widget/TextView;", "getFollowBtn", "()Landroid/widget/TextView;", "liveBg", "Lcom/opensource/svgaplayer/SVGAImageView;", "getLiveBg", "()Lcom/opensource/svgaplayer/SVGAImageView;", "parent", "Landroid/widget/RelativeLayout;", "getParent", "()Landroid/widget/RelativeLayout;", "times", "getTimes", "userLogo", "Lcom/taihebase/activity/view/LoadImageView;", "getUserLogo", "()Lcom/taihebase/activity/view/LoadImageView;", Oauth2AccessToken.KEY_SCREEN_NAME, "getUserName", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class ViewHolder extends RecyclerView.ViewHolder {
        @NotNull
        private final TextView followBtn;
        @NotNull
        private final SVGAImageView liveBg;
        @NotNull
        private final RelativeLayout parent;
        @NotNull
        private final TextView times;
        @NotNull
        private final LoadImageView userLogo;
        @NotNull
        private final TextView userName;

        public ViewHolder(@NotNull View view) {
        }

        @NotNull
        public final TextView getFollowBtn() {
        }

        @NotNull
        public final SVGAImageView getLiveBg() {
        }

        @NotNull
        public final RelativeLayout getParent() {
        }

        @NotNull
        public final TextView getTimes() {
        }

        @NotNull
        public final LoadImageView getUserLogo() {
        }

        @NotNull
        public final TextView getUserName() {
        }
    }

    public LiveMenuAdapter(@NotNull Context context, @NotNull RecyclerView recyclerView) {
    }

    /* renamed from: access$getCtx$p$s-1034923964  reason: not valid java name */
    public static final /* synthetic */ Context m1728access$getCtx$p$s1034923964(LiveMenuAdapter liveMenuAdapter) {
    }

    public static /* synthetic */ void c(LiveMenuAdapter liveMenuAdapter, LiveShowMenuEventMsgBean liveShowMenuEventMsgBean, int i2, View view) {
    }

    public static /* synthetic */ void d(LiveShowMenuEventMsgBean liveShowMenuEventMsgBean, LiveMenuAdapter liveMenuAdapter, int i2, boolean z) {
    }

    public static /* synthetic */ void e(LiveMenuAdapter liveMenuAdapter, LiveShowMenuEventMsgBean liveShowMenuEventMsgBean, int i2, View view) {
    }

    public static /* synthetic */ void f(LiveMenuAdapter liveMenuAdapter, View view) {
    }

    private final void followUserALL(LiveShowMenuEventMsgBean liveShowMenuEventMsgBean, int i2) {
    }

    public static /* synthetic */ void g(LiveShowMenuEventMsgBean liveShowMenuEventMsgBean, LiveMenuAdapter liveMenuAdapter, View view) {
    }

    public static /* synthetic */ void h(View view) {
    }

    public static /* synthetic */ void i(LiveMenuAdapter liveMenuAdapter) {
    }

    public static /* synthetic */ void j(View view, LiveMenuAdapter liveMenuAdapter, View view2) {
    }

    /* renamed from: onBindViewHolder$lambda-4$lambda-0  reason: not valid java name */
    private static final void m1729onBindViewHolder$lambda4$lambda0(LiveMenuAdapter liveMenuAdapter, LiveShowMenuEventMsgBean liveShowMenuEventMsgBean, int i2, View view) {
    }

    /* renamed from: onBindViewHolder$lambda-4$lambda-1  reason: not valid java name */
    private static final void m1730onBindViewHolder$lambda4$lambda1(View view) {
    }

    /* renamed from: onBindViewHolder$lambda-4$lambda-2  reason: not valid java name */
    private static final void m1731onBindViewHolder$lambda4$lambda2(LiveMenuAdapter liveMenuAdapter, LiveShowMenuEventMsgBean liveShowMenuEventMsgBean, int i2, View view) {
    }

    /* renamed from: onBindViewHolder$lambda-4$lambda-3  reason: not valid java name */
    private static final void m1732onBindViewHolder$lambda4$lambda3(LiveShowMenuEventMsgBean liveShowMenuEventMsgBean, LiveMenuAdapter liveMenuAdapter, View view) {
    }

    @SuppressLint({"CheckResult"})
    private final void remindCla(LiveShowMenuEventMsgBean liveShowMenuEventMsgBean, int i2) {
    }

    /* renamed from: remindCla$lambda-8  reason: not valid java name */
    private static final void m1733remindCla$lambda8(LiveShowMenuEventMsgBean liveShowMenuEventMsgBean, LiveMenuAdapter liveMenuAdapter, int i2, boolean z) {
    }

    /* renamed from: remindCla$lambda-8$lambda-7  reason: not valid java name */
    private static final void m1734remindCla$lambda8$lambda7(LiveMenuAdapter liveMenuAdapter, View view) {
    }

    /* renamed from: showFloatPreDialog$lambda-6  reason: not valid java name */
    private static final void m1735showFloatPreDialog$lambda6(View view, LiveMenuAdapter liveMenuAdapter, View view2) {
    }

    /* renamed from: showFloatPreDialog$lambda-6$lambda-5  reason: not valid java name */
    private static final void m1736showFloatPreDialog$lambda6$lambda5(LiveMenuAdapter liveMenuAdapter) {
    }

    @Override // tencent.txlive.zhibo.audience.BaseLiveRecycleAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, int i2) {
    }

    @Override // tencent.txlive.zhibo.audience.BaseLiveRecycleAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup viewGroup, int i2) {
    }

    public final void setDialog(@Nullable e2 e2Var) {
    }

    public final boolean showFloatPreDialog(@Nullable View view) {
    }
}
