package h.u.a.c.w;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.baidu.platform.comapi.map.MapBundleKey;
import com.facebook.drawee.view.SimpleDraweeView;
import com.mobile.auth.gatewayauth.Constant;
import com.showstartfans.activity.activitys.photo.PhotoVideoBrowingActivity;
import com.showstartfans.activity.model.PublishArticleBean;
import com.taihe.photoselector.model.PhotoModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PublishArticlePhotoAdapter.kt */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001=B\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0019\u001a\u00020\u000e2\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001bH\u0016J\u0011\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d¢\u0006\u0002\u0010\u001fJ\u0010\u0010 \u001a\u00020\u000e2\b\u0010\t\u001a\u0004\u0018\u00010\nJ\b\u0010!\u001a\u00020\u000eH\u0002J(\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001b2\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010#\u001a\u00020\b2\b\u0010$\u001a\u0004\u0018\u00010%J*\u0010&\u001a\u00020\u000e2\b\u0010'\u001a\u0004\u0018\u00010(2\u0006\u0010)\u001a\u00020\b2\u0006\u0010*\u001a\u00020\b2\u0006\u0010+\u001a\u00020\bH\u0014J\u001a\u0010,\u001a\u00020(2\b\u0010-\u001a\u0004\u0018\u00010.2\u0006\u0010/\u001a\u00020\bH\u0014J\u0010\u00100\u001a\u00020\u000e2\u0006\u00101\u001a\u00020\bH\u0016J\u0018\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\b2\u0006\u00105\u001a\u00020\bH\u0016J\u000e\u00106\u001a\u00020\u000e2\u0006\u00107\u001a\u000208J\u000e\u00109\u001a\u00020\u000e2\u0006\u0010:\u001a\u000208J\u0010\u0010;\u001a\u00020\u000e2\u0006\u00101\u001a\u00020\bH\u0016J\u0010\u0010<\u001a\u00020\u000e2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0082D¢\u0006\u0002\n\u0000R(\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rj\u0004\u0018\u0001`\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\bX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006>"}, d2 = {"Lcom/showstartfans/activity/activitys/article/PublishArticlePhotoAdapter;", "Lcom/taihebase/activity/base/NewBaseRecycleAdapter;", "Lcom/taihe/photoselector/model/PhotoModel;", "Lcom/taihebase/activity/view/itemTouch/ItemTouchHelperAdapter;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "itemSize", "", "mData", "Lcom/showstartfans/activity/model/PublishArticleBean;", "maxCount", "onClickDelete", "Lkotlin/Function0;", "", "Lcom/showstartfans/activity/activitys/article/OnClickDelete;", "getOnClickDelete", "()Lkotlin/jvm/functions/Function0;", "setOnClickDelete", "(Lkotlin/jvm/functions/Function0;)V", Constant.LOGIN_ACTIVITY_REQUEST_CODE, "getRequestCode", "()I", "touchHelper", "Landroidx/recyclerview/widget/ItemTouchHelper;", "addAll", "newData", "", "getValues", "", "", "()[Ljava/lang/String;", "initData", "initFooterView", "onActivityResult", "resultCode", "data", "Landroid/content/Intent;", "onBindViewHolder_impl", "mholder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemType", "original_position", "real_position", "onCreateViewHolder_impl", "parent", "Landroid/view/ViewGroup;", "viewType", "onItemDismiss", h.a.a.a.a.i.g.C, "onItemMove", "", "fromPosition", "toPosition", "onRestoreInstanceState", "savedInstanceState", "Landroid/os/Bundle;", "onSaveInstanceState", "outState", "remove", "setTouchHelper", "ViewHodler", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class u1 extends h.y.a.f.m<PhotoModel> implements h.y.a.o.z.a {

    /* renamed from: n  reason: collision with root package name */
    private final int f20021n;

    /* renamed from: o  reason: collision with root package name */
    private final int f20022o;
    @Nullable

    /* renamed from: p  reason: collision with root package name */
    private ItemTouchHelper f20023p;
    private final int q;
    @Nullable
    private PublishArticleBean r;
    @Nullable
    private Function0<Unit> s;

    /* compiled from: PublishArticlePhotoAdapter.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\u0010\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0018H\u0002R\u0019\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u000b\u001a\n \b*\u0004\u0018\u00010\f0\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u000f\u001a\n \b*\u0004\u0018\u00010\u00100\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0019"}, d2 = {"Lcom/showstartfans/activity/activitys/article/PublishArticlePhotoAdapter$ViewHodler;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/taihebase/activity/view/itemTouch/ItemTouchHelperViewHolder;", "view", "Landroid/view/View;", "(Lcom/showstartfans/activity/activitys/article/PublishArticlePhotoAdapter;Landroid/view/View;)V", "ibtn_delete", "Landroid/widget/ImageButton;", "kotlin.jvm.PlatformType", "getIbtn_delete", "()Landroid/widget/ImageButton;", "sdv_photo", "Lcom/facebook/drawee/view/SimpleDraweeView;", "getSdv_photo", "()Lcom/facebook/drawee/view/SimpleDraweeView;", "tv_cover", "Landroid/widget/TextView;", "getTv_cover", "()Landroid/widget/TextView;", "onItemClear", "", "onItemSelected", "showAnimation", "select", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class a extends RecyclerView.ViewHolder implements h.y.a.o.z.b {

        /* renamed from: a  reason: collision with root package name */
        private final SimpleDraweeView f20024a;
        private final TextView b;
        private final ImageButton c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ u1 f20025d;

        public a(@NotNull u1 u1Var, View view) {
        }

        private final void f(boolean z) {
        }

        @Override // h.y.a.o.z.b
        public void a() {
        }

        @Override // h.y.a.o.z.b
        public void b() {
        }

        public final ImageButton c() {
        }

        public final SimpleDraweeView d() {
        }

        public final TextView e() {
        }
    }

    /* compiled from: PublishArticlePhotoAdapter.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/showstartfans/activity/activitys/article/PublishArticlePhotoAdapter$onBindViewHolder_impl$3$1", "Lcom/showstartfans/activity/activitys/photo/PhotoVideoBrowingActivity$OnDataEditListener;", "onClickDelete", "", MapBundleKey.MapObjKey.OBJ_SL_INDEX, "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class b implements PhotoVideoBrowingActivity.c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ u1 f20026a;

        public b(u1 u1Var) {
        }

        @Override // com.showstartfans.activity.activitys.photo.PhotoVideoBrowingActivity.c
        public void a(int i2) {
        }
    }

    public u1(@NotNull Context context) {
    }

    public static final /* synthetic */ Context Q(u1 u1Var) {
    }

    private final void V() {
    }

    private static final void W(u1 u1Var, View view) {
    }

    public static /* synthetic */ boolean X(u1 u1Var, a aVar, View view) {
    }

    public static /* synthetic */ void Y(u1 u1Var, View view) {
    }

    public static /* synthetic */ void Z(u1 u1Var, int i2, View view) {
    }

    public static /* synthetic */ void a0(u1 u1Var, int i2, View view) {
    }

    private static final void c0(u1 u1Var, int i2, View view) {
    }

    private static final boolean d0(u1 u1Var, a aVar, View view) {
    }

    private static final void e0(u1 u1Var, int i2, View view) {
    }

    @Override // h.y.a.f.m
    @NotNull
    public RecyclerView.ViewHolder C(@Nullable ViewGroup viewGroup, int i2) {
    }

    @Nullable
    public final Function0<Unit> R() {
    }

    public final int S() {
    }

    @NotNull
    public final String[] T() {
    }

    public final void U(@Nullable PublishArticleBean publishArticleBean) {
    }

    @Override // h.y.a.o.z.a
    public void a(int i2) {
    }

    @Override // h.y.a.f.m
    public void addAll(@Nullable List<? extends PhotoModel> list) {
    }

    @Override // h.y.a.o.z.a
    public boolean b(int i2, int i3) {
    }

    @Nullable
    public final List<PhotoModel> b0(int i2, int i3, @Nullable Intent intent) {
    }

    public final void f0(@NotNull Bundle bundle) {
    }

    public final void g0(@NotNull Bundle bundle) {
    }

    public final void h0(@Nullable Function0<Unit> function0) {
    }

    public final void i0(@Nullable ItemTouchHelper itemTouchHelper) {
    }

    @Override // h.y.a.f.m
    public void remove(int i2) {
    }

    @Override // h.y.a.f.m
    public void z(@Nullable RecyclerView.ViewHolder viewHolder, int i2, int i3, int i4) {
    }
}
