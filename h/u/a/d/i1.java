package h.u.a.d;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.showstartfans.activity.manager.PhotoWallPhotoBean;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PhotoWallAapter.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001-B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0006\u0010\u001f\u001a\u00020\u0019J*\u0010 \u001a\u00020\u00192\b\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010#\u001a\u00020\f2\u0006\u0010$\u001a\u00020\f2\u0006\u0010%\u001a\u00020\fH\u0014J\u001a\u0010&\u001a\u00020\"2\b\u0010'\u001a\u0004\u0018\u00010(2\u0006\u0010)\u001a\u00020\fH\u0014J\u0018\u0010*\u001a\u00020\u00192\u0006\u0010+\u001a\u00020\f2\b\u0010,\u001a\u0004\u0018\u00010\u0002R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR.\u0010\n\u001a\"\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000bj\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002`\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012RC\u0010\u0013\u001a+\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00020\u0015¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0014j\u0004\u0018\u0001`\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006."}, d2 = {"Lcom/showstartfans/activity/adapter/PhotoWallAapter;", "Lcom/taihebase/activity/base/NewBaseRecycleAdapter;", "Lcom/showstartfans/activity/manager/PhotoWallPhotoBean;", "context", "Landroid/content/Context;", "activityId", "", "(Landroid/content/Context;Ljava/lang/String;)V", "getActivityId", "()Ljava/lang/String;", "checkMap", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "getContext", "()Landroid/content/Context;", "cover_size", "getCover_size", "()I", "onPhotoCheckChangeListener", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "checks", "", "Lcom/showstartfans/activity/adapter/OnPhotoCheckChangeListener;", "getOnPhotoCheckChangeListener", "()Lkotlin/jvm/functions/Function1;", "setOnPhotoCheckChangeListener", "(Lkotlin/jvm/functions/Function1;)V", "clerCheckMap", "onBindViewHolder_impl", "mholder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemType", "original_position", "real_position", "onCreateViewHolder_impl", "parent", "Landroid/view/ViewGroup;", "viewType", "putCheckMap", h.a.a.a.a.i.g.C, "bean", "ViewHolder", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class i1 extends h.y.a.f.m<PhotoWallPhotoBean> {
    @NotNull

    /* renamed from: n  reason: collision with root package name */
    private final Context f20253n;
    @NotNull

    /* renamed from: o  reason: collision with root package name */
    private final String f20254o;
    @Nullable

    /* renamed from: p  reason: collision with root package name */
    private Function1<? super List<PhotoWallPhotoBean>, Unit> f20255p;
    private final int q;
    @NotNull
    private final HashMap<Integer, PhotoWallPhotoBean> r;

    /* compiled from: PhotoWallAapter.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0019\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u000b0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u000e\u001a\n \u0007*\u0004\u0018\u00010\u000f0\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/showstartfans/activity/adapter/PhotoWallAapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "iv_gougoou", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "getIv_gougoou", "()Landroid/widget/ImageView;", "layoutCheck", "Landroid/widget/FrameLayout;", "getLayoutCheck", "()Landroid/widget/FrameLayout;", "sdv_conver", "Lcom/facebook/drawee/view/SimpleDraweeView;", "getSdv_conver", "()Lcom/facebook/drawee/view/SimpleDraweeView;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        private final SimpleDraweeView f20256a;
        private final ImageView b;
        private final FrameLayout c;

        public a(@NotNull View view) {
        }

        public final ImageView c() {
        }

        public final FrameLayout d() {
        }

        public final SimpleDraweeView e() {
        }
    }

    /* compiled from: PhotoWallAapter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b extends Lambda implements Function1<Boolean, Unit> {
        public final /* synthetic */ PhotoWallPhotoBean $bean;

        public b(PhotoWallPhotoBean photoWallPhotoBean) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        }

        public final void invoke(boolean z) {
        }
    }

    /* compiled from: PhotoWallAapter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Z)Lkotlin/Unit;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class c extends Lambda implements Function1<Boolean, Unit> {
        public final /* synthetic */ PhotoWallPhotoBean $bean;
        public final /* synthetic */ ArrayList<PhotoWallPhotoBean> $checks;
        public final /* synthetic */ a $holder;
        public final /* synthetic */ i1 this$0;

        public c(PhotoWallPhotoBean photoWallPhotoBean, i1 i1Var, ArrayList<PhotoWallPhotoBean> arrayList, a aVar) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        }

        @Nullable
        public final Unit invoke(boolean z) {
        }
    }

    public i1(@NotNull Context context, @NotNull String str) {
    }

    public static /* synthetic */ void U(i1 i1Var, int i2, View view) {
    }

    public static /* synthetic */ void V(i1 i1Var, int i2, a aVar, PhotoWallPhotoBean photoWallPhotoBean, View view) {
    }

    private static final void W(i1 i1Var, int i2, View view) {
    }

    private static final void X(i1 i1Var, int i2, a aVar, PhotoWallPhotoBean photoWallPhotoBean, View view) {
    }

    @Override // h.y.a.f.m
    @NotNull
    public RecyclerView.ViewHolder C(@Nullable ViewGroup viewGroup, int i2) {
    }

    public final void Q() {
    }

    @NotNull
    public final String R() {
    }

    public final int S() {
    }

    @Nullable
    public final Function1<List<PhotoWallPhotoBean>, Unit> T() {
    }

    public final void Y(int i2, @Nullable PhotoWallPhotoBean photoWallPhotoBean) {
    }

    public final void Z(@Nullable Function1<? super List<PhotoWallPhotoBean>, Unit> function1) {
    }

    @NotNull
    public final Context getContext() {
    }

    @Override // h.y.a.f.m
    public void z(@Nullable RecyclerView.ViewHolder viewHolder, int i2, int i3, int i4) {
    }
}
