package h.u.a.n;

import android.content.Context;
import com.showstartfans.activity.manager.PhotoWallPhotoBean;
import com.showstartfans.activity.model.goodsmodel.ShoppingCartBean;
import h.y.a.m.n;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PhotoWallShopCartManager.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0080\u0001\u0010\u0019\u001a\u00020\u00172x\u0010\u001a\u001at\u00122\u00120\u0012\u0004\u0012\u00020\f0\u0004j\u0017\u0012\u0004\u0012\u00020\f`\u0006¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u00122\u00120\u0012\u0004\u0012\u00020\u00050\u0004j\u0017\u0012\u0004\u0012\u00020\u0005`\u0006¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0016¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00170\u0012j\u0002`\u0018J\u0010\u0010\u001b\u001a\u00020\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\u0005J\u0006\u0010\u001d\u001a\u00020\u0017J\u0010\u0010\u001e\u001a\u00020\u00102\b\u0010\u001c\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u001f\u001a\u00020\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\u0005J\u0080\u0001\u0010 \u001a\u00020\u00172x\u0010\u001a\u001at\u00122\u00120\u0012\u0004\u0012\u00020\f0\u0004j\u0017\u0012\u0004\u0012\u00020\f`\u0006¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u00122\u00120\u0012\u0004\u0012\u00020\u00050\u0004j\u0017\u0012\u0004\u0012\u00020\u0005`\u0006¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0016¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00170\u0012j\u0002`\u0018J\u001e\u0010!\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u00102\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010#J\u000e\u0010$\u001a\u00020\u00172\u0006\u0010%\u001a\u00020&R*\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR*\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\f0\u0004j\b\u0012\u0004\u0012\u00020\f`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\nR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0083\u0002\u0010\u0011\u001aö\u0001\u0012v\u0012t\u00122\u00120\u0012\u0004\u0012\u00020\f0\u0004j\u0017\u0012\u0004\u0012\u00020\f`\u0006¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u00122\u00120\u0012\u0004\u0012\u00020\u00050\u0004j\u0017\u0012\u0004\u0012\u00020\u0005`\u0006¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0016¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00170\u0012j\u0002`\u00180\u0004jz\u0012v\u0012t\u00122\u00120\u0012\u0004\u0012\u00020\f0\u0004j\u0017\u0012\u0004\u0012\u00020\f`\u0006¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u00122\u00120\u0012\u0004\u0012\u00020\u00050\u0004j\u0017\u0012\u0004\u0012\u00020\u0005`\u0006¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0016¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00170\u0012j\u0002`\u0018`\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/showstartfans/activity/manager/PhotoWallShopCartManager;", "", "()V", "alreadyPhotoWallDatas", "Ljava/util/ArrayList;", "Lcom/showstartfans/activity/manager/PhotoWallPhotoBean;", "Lkotlin/collections/ArrayList;", "getAlreadyPhotoWallDatas", "()Ljava/util/ArrayList;", "setAlreadyPhotoWallDatas", "(Ljava/util/ArrayList;)V", "alreadyShoppingCartDatas", "Lcom/showstartfans/activity/model/goodsmodel/ShoppingCartBean;", "getAlreadyShoppingCartDatas", "setAlreadyShoppingCartDatas", "id", "", "onDataChangeListeners", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "shopData", "photo", "", "Lcom/showstartfans/activity/manager/OnDataChangeListener;", "addListener", "l", "addToShopCart", "data", "clear", "getIdByPhotoWallData", "removeFromShopCart", "removeListener", "setData", "datas", "", "updateData", "ctx", "Landroid/content/Context;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class c {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public static final c f24377a = null;
    @NotNull
    private static String b;
    @NotNull
    private static ArrayList<Function2<ArrayList<ShoppingCartBean>, ArrayList<PhotoWallPhotoBean>, Unit>> c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    private static ArrayList<ShoppingCartBean> f24378d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    private static ArrayList<PhotoWallPhotoBean> f24379e;

    private c() {
    }

    public static /* synthetic */ void g(n nVar) {
    }

    private static final void n(n nVar) {
    }

    public final void a(@NotNull Function2<? super ArrayList<ShoppingCartBean>, ? super ArrayList<PhotoWallPhotoBean>, Unit> function2) {
    }

    public final void b(@Nullable PhotoWallPhotoBean photoWallPhotoBean) {
    }

    public final void c() {
    }

    @NotNull
    public final ArrayList<PhotoWallPhotoBean> d() {
    }

    @NotNull
    public final ArrayList<ShoppingCartBean> e() {
    }

    @NotNull
    public final String f(@Nullable PhotoWallPhotoBean photoWallPhotoBean) {
    }

    public final void h(@Nullable PhotoWallPhotoBean photoWallPhotoBean) {
    }

    public final void i(@NotNull Function2<? super ArrayList<ShoppingCartBean>, ? super ArrayList<PhotoWallPhotoBean>, Unit> function2) {
    }

    public final void j(@NotNull ArrayList<PhotoWallPhotoBean> arrayList) {
    }

    public final void k(@NotNull ArrayList<ShoppingCartBean> arrayList) {
    }

    public final void l(@NotNull String str, @Nullable List<? extends ShoppingCartBean> list) {
    }

    public final void m(@NotNull Context context) {
    }
}
