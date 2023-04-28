package h.u.a.d;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.baidu.platform.comapi.map.MapBundleKey;
import com.showstartfans.activity.model.DisplayBean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HotelPhotoTabAdapter.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J*\u0010\u0013\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0007H\u0014J\u001a\u0010\u0019\u001a\u00020\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u0007H\u0014J\u0018\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u00072\b\b\u0002\u0010\u001f\u001a\u00020 R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R=\u0010\b\u001a%\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r\u0018\u00010\tj\u0004\u0018\u0001`\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\""}, d2 = {"Lcom/showstartfans/activity/adapter/HotelPhotoTabAdapter;", "Lcom/taihebase/activity/base/NewBaseRecycleAdapter;", "Lcom/showstartfans/activity/model/DisplayBean;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "checkIndex", "", "onTabCheck", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", h.a.a.a.a.i.g.C, "", "Lcom/showstartfans/activity/adapter/OnTabCheck;", "getOnTabCheck", "()Lkotlin/jvm/functions/Function1;", "setOnTabCheck", "(Lkotlin/jvm/functions/Function1;)V", "onBindViewHolder_impl", "mholder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemType", "original_position", "real_position", "onCreateViewHolder_impl", "parent", "Landroid/view/ViewGroup;", "viewType", "setCheckIndex", MapBundleKey.MapObjKey.OBJ_SL_INDEX, "doInvoke", "", "ViewHodler", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class t0 extends h.y.a.f.m<DisplayBean> {
    @Nullable

    /* renamed from: n  reason: collision with root package name */
    private Function1<? super Integer, Unit> f20320n;

    /* renamed from: o  reason: collision with root package name */
    private int f20321o;

    /* compiled from: HotelPhotoTabAdapter.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0019\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/showstartfans/activity/adapter/HotelPhotoTabAdapter$ViewHodler;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/showstartfans/activity/adapter/HotelPhotoTabAdapter;Landroid/view/View;)V", "tvTitle", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "getTvTitle", "()Landroid/widget/TextView;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public final class a extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        private final TextView f20322a;
        public final /* synthetic */ t0 b;

        public a(@NotNull t0 t0Var, View view) {
        }

        public final TextView c() {
        }
    }

    public t0(@NotNull Context context) {
    }

    public static /* synthetic */ void R(t0 t0Var, int i2, View view) {
    }

    private static final void S(t0 t0Var, int i2, View view) {
    }

    public static /* synthetic */ void U(t0 t0Var, int i2, boolean z, int i3, Object obj) {
    }

    @Override // h.y.a.f.m
    @NotNull
    public RecyclerView.ViewHolder C(@Nullable ViewGroup viewGroup, int i2) {
    }

    @Nullable
    public final Function1<Integer, Unit> Q() {
    }

    public final void T(int i2, boolean z) {
    }

    public final void V(@Nullable Function1<? super Integer, Unit> function1) {
    }

    @Override // h.y.a.f.m
    public void z(@Nullable RecyclerView.ViewHolder viewHolder, int i2, int i3, int i4) {
    }
}
