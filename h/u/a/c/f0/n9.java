package h.u.a.c.f0;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.baidu.platform.comapi.map.MapBundleKey;
import com.facebook.drawee.view.SimpleDraweeView;
import com.mobile.auth.gatewayauth.Constant;
import com.showstartfans.activity.model.UserPhotoBean;
import com.showstartfans.activity.view.UserPhotoPraiseView;
import com.taihe.photoselector.model.PhotoModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: UserPhotoItemAdapter.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001-B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0018\u0010\u0015\u001a\u00020\u00162\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u000eH\u0016J\u0006\u0010\u001a\u001a\u00020\u0010J(\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u00182\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u000e2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fJ*\u0010 \u001a\u00020\u00162\b\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010#\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\u000eH\u0014J\u001a\u0010&\u001a\u00020\"2\b\u0010'\u001a\u0004\u0018\u00010(2\u0006\u0010)\u001a\u00020\u000eH\u0014J\u001a\u0010*\u001a\u00020\u00162\u0006\u0010+\u001a\u00020\u00102\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006J\u000e\u0010,\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u0010R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0012\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006."}, d2 = {"Lcom/showstartfans/activity/activitys/maintab/UserPhotoItemAdapter;", "Lcom/taihebase/activity/base/NewBaseRecycleAdapter;", "Lcom/showstartfans/activity/model/UserPhotoBean;", "context", "Landroid/content/Context;", "fansId", "", "(Landroid/content/Context;Ljava/lang/String;)V", "getContext", "()Landroid/content/Context;", "enemyTitle", "getFansId", "()Ljava/lang/String;", Constant.LOGIN_ACTIVITY_REQUEST_CODE, "", "showNull", "", "showUpBtn", MapBundleKey.OfflineMapKey.OFFLINE_TOTAL_SIZE, "getSize", "()I", "addAll", "", "newData", "", "getItemCount", "isShowNull", "onActivityResult", "Lcom/taihe/photoselector/model/PhotoModel;", "resultCode", "data", "Landroid/content/Intent;", "onBindViewHolder_impl", "mholder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemType", "original_position", "real_position", "onCreateViewHolder_impl", "parent", "Landroid/view/ViewGroup;", "viewType", "setShowNull", "show", "setShowUpBtn", "ViewHodler", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class n9 extends h.y.a.f.m<UserPhotoBean> {
    @NotNull

    /* renamed from: n  reason: collision with root package name */
    private final Context f18350n;
    @Nullable

    /* renamed from: o  reason: collision with root package name */
    private final String f18351o;

    /* renamed from: p  reason: collision with root package name */
    private final int f18352p;
    private boolean q;
    private boolean r;
    @NotNull
    private String s;
    private final int t;

    /* compiled from: UserPhotoItemAdapter.kt */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0019\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u000b0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u000e\u001a\n \u0007*\u0004\u0018\u00010\u000f0\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0012\u001a\n \u0007*\u0004\u0018\u00010\u00130\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0016\u001a\n \u0007*\u0004\u0018\u00010\u00170\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u001a\u001a\n \u0007*\u0004\u0018\u00010\u00170\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0019\u0010\u001c\u001a\n \u0007*\u0004\u0018\u00010\u001d0\u001d¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/showstartfans/activity/activitys/maintab/UserPhotoItemAdapter$ViewHodler;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/showstartfans/activity/activitys/maintab/UserPhotoItemAdapter;Landroid/view/View;)V", "layout_add_photo", "Landroid/widget/LinearLayout;", "kotlin.jvm.PlatformType", "getLayout_add_photo", "()Landroid/widget/LinearLayout;", "layout_enemy", "Landroid/widget/FrameLayout;", "getLayout_enemy", "()Landroid/widget/FrameLayout;", "layout_photo", "Landroidx/constraintlayout/widget/ConstraintLayout;", "getLayout_photo", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "sdv_conver", "Lcom/facebook/drawee/view/SimpleDraweeView;", "getSdv_conver", "()Lcom/facebook/drawee/view/SimpleDraweeView;", "tv_enemy", "Landroid/widget/TextView;", "getTv_enemy", "()Landroid/widget/TextView;", "tv_isConver", "getTv_isConver", "view_praise", "Lcom/showstartfans/activity/view/UserPhotoPraiseView;", "getView_praise", "()Lcom/showstartfans/activity/view/UserPhotoPraiseView;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public final class a extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        private final SimpleDraweeView f18353a;
        private final ConstraintLayout b;
        private final LinearLayout c;

        /* renamed from: d  reason: collision with root package name */
        private final UserPhotoPraiseView f18354d;

        /* renamed from: e  reason: collision with root package name */
        private final FrameLayout f18355e;

        /* renamed from: f  reason: collision with root package name */
        private final TextView f18356f;

        /* renamed from: g  reason: collision with root package name */
        private final TextView f18357g;

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ n9 f18358h;

        public a(@NotNull n9 n9Var, View view) {
        }

        public final LinearLayout c() {
        }

        public final FrameLayout d() {
        }

        public final ConstraintLayout e() {
        }

        public final SimpleDraweeView f() {
        }

        public final TextView g() {
        }

        public final TextView h() {
        }

        public final UserPhotoPraiseView i() {
        }
    }

    /* compiled from: UserPhotoItemAdapter.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002!\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u0001j\u0002`\u0007J\u0011\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0096\u0002¨\u0006\t"}, d2 = {"com/showstartfans/activity/activitys/maintab/UserPhotoItemAdapter$onBindViewHolder_impl$3", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "isPraise", "", "Lcom/showstartfans/activity/view/OnPraiseListener;", "invoke", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b implements Function1<Boolean, Unit> {
        public final /* synthetic */ UserPhotoBean b;
        public final /* synthetic */ n9 c;

        public b(UserPhotoBean userPhotoBean, n9 n9Var) {
        }

        public void a(boolean z) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        }
    }

    public n9(@NotNull Context context, @Nullable String str) {
    }

    public static /* synthetic */ void T(n9 n9Var, Ref.IntRef intRef, View view) {
    }

    public static /* synthetic */ void U(n9 n9Var, View view) {
    }

    public static /* synthetic */ void V(View view) {
    }

    private static final void X(View view) {
    }

    private static final void Y(n9 n9Var, View view) {
    }

    private static final void Z(n9 n9Var, Ref.IntRef intRef, View view) {
    }

    public static /* synthetic */ void b0(n9 n9Var, boolean z, String str, int i2, Object obj) {
    }

    @Override // h.y.a.f.m
    @NotNull
    public RecyclerView.ViewHolder C(@Nullable ViewGroup viewGroup, int i2) {
    }

    @Nullable
    public final String Q() {
    }

    public final int R() {
    }

    public final boolean S() {
    }

    @Nullable
    public final List<PhotoModel> W(int i2, int i3, @Nullable Intent intent) {
    }

    public final void a0(boolean z, @Nullable String str) {
    }

    @Override // h.y.a.f.m
    public void addAll(@Nullable List<? extends UserPhotoBean> list) {
    }

    public final void c0(boolean z) {
    }

    @NotNull
    public final Context getContext() {
    }

    @Override // h.y.a.f.m, androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
    }

    @Override // h.y.a.f.m
    public void z(@Nullable RecyclerView.ViewHolder viewHolder, int i2, int i3, int i4) {
    }
}
