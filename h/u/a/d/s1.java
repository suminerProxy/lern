package h.u.a.d;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.baidu.platform.comapi.map.MapBundleKey;
import com.facebook.drawee.view.SimpleDraweeView;
import com.showstartfans.activity.model.StyleBean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: StyleAdapter.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J*\u0010\u0014\u001a\u00020\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0007H\u0014J\u001a\u0010\u001a\u001a\u00020\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u0007H\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000RT\u0010\b\u001a<\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\tj\u0004\u0018\u0001`\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/showstartfans/activity/adapter/StyleAdapter;", "Lcom/taihebase/activity/base/NewBaseRecycleAdapter;", "Lcom/showstartfans/activity/model/StyleBean;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "currentCheckIndex", "", "onCheckChangeListener", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", MapBundleKey.MapObjKey.OBJ_SL_INDEX, "bean", "", "Lcom/showstartfans/activity/adapter/OnCheckChangeListener;", "getOnCheckChangeListener", "()Lkotlin/jvm/functions/Function2;", "setOnCheckChangeListener", "(Lkotlin/jvm/functions/Function2;)V", "onBindViewHolder_impl", "mholder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemType", "original_position", "real_position", "onCreateViewHolder_impl", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHodler", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class s1 extends h.y.a.f.m<StyleBean> {

    /* renamed from: n  reason: collision with root package name */
    private int f20316n;
    @Nullable

    /* renamed from: o  reason: collision with root package name */
    private Function2<? super Integer, ? super StyleBean, Unit> f20317o;

    /* compiled from: StyleAdapter.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0019\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u000b0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u000e\u001a\n \u0007*\u0004\u0018\u00010\u000f0\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/showstartfans/activity/adapter/StyleAdapter$ViewHodler;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/showstartfans/activity/adapter/StyleAdapter;Landroid/view/View;)V", "iv_check", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "getIv_check", "()Landroid/widget/ImageView;", "iv_icon", "Lcom/facebook/drawee/view/SimpleDraweeView;", "getIv_icon", "()Lcom/facebook/drawee/view/SimpleDraweeView;", "layout_bg", "Landroid/widget/FrameLayout;", "getLayout_bg", "()Landroid/widget/FrameLayout;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public final class a extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        private final SimpleDraweeView f20318a;
        private final ImageView b;
        private final FrameLayout c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ s1 f20319d;

        public a(@NotNull s1 s1Var, View view) {
        }

        public final ImageView c() {
        }

        public final SimpleDraweeView d() {
        }

        public final FrameLayout e() {
        }
    }

    public s1(@NotNull Context context) {
    }

    public static /* synthetic */ void R(s1 s1Var, int i2, StyleBean styleBean, View view) {
    }

    private static final void S(s1 s1Var, int i2, StyleBean styleBean, View view) {
    }

    @Override // h.y.a.f.m
    @NotNull
    public RecyclerView.ViewHolder C(@Nullable ViewGroup viewGroup, int i2) {
    }

    @Nullable
    public final Function2<Integer, StyleBean, Unit> Q() {
    }

    public final void T(@Nullable Function2<? super Integer, ? super StyleBean, Unit> function2) {
    }

    @Override // h.y.a.f.m
    public void z(@Nullable RecyclerView.ViewHolder viewHolder, int i2, int i3, int i4) {
    }
}
