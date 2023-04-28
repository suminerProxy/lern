package androidx.core.view;

import android.view.Menu;
import android.view.MenuItem;
import com.baidu.platform.comapi.map.MapBundleKey;
import com.baidu.platform.comapi.map.MapController;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* compiled from: Menu.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\n¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001c\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u001c\u0010\u000b\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0003H\u0086\n¢\u0006\u0004\b\u000b\u0010\f\u001a\u0014\u0010\r\u001a\u00020\u0007*\u00020\u0000H\u0086\b¢\u0006\u0004\b\r\u0010\u000e\u001a\u0014\u0010\u000f\u001a\u00020\u0007*\u00020\u0000H\u0086\b¢\u0006\u0004\b\u000f\u0010\u000e\u001a7\u0010\u0014\u001a\u00020\n*\u00020\u00002!\u0010\u0013\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\n0\u0010H\u0086\b¢\u0006\u0004\b\u0014\u0010\u0015\u001aL\u0010\u0017\u001a\u00020\n*\u00020\u000026\u0010\u0013\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\n0\u0016H\u0086\b¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u0019*\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u001a\u0010\u001b\"\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030\u001c*\u00020\u00008F@\u0006¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e\"\u0018\u0010\"\u001a\u00020\u0001*\u00020\u00008Æ\u0002@\u0006¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Landroid/view/Menu;", "", MapBundleKey.MapObjKey.OBJ_SL_INDEX, "Landroid/view/MenuItem;", "get", "(Landroid/view/Menu;I)Landroid/view/MenuItem;", MapController.ITEM_LAYER_TAG, "", "contains", "(Landroid/view/Menu;Landroid/view/MenuItem;)Z", "", "minusAssign", "(Landroid/view/Menu;Landroid/view/MenuItem;)V", "isEmpty", "(Landroid/view/Menu;)Z", "isNotEmpty", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "action", "forEach", "(Landroid/view/Menu;Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function2;", "forEachIndexed", "(Landroid/view/Menu;Lkotlin/jvm/functions/Function2;)V", "", "iterator", "(Landroid/view/Menu;)Ljava/util/Iterator;", "Lkotlin/sequences/Sequence;", "getChildren", "(Landroid/view/Menu;)Lkotlin/sequences/Sequence;", "children", "getSize", "(Landroid/view/Menu;)I", MapBundleKey.OfflineMapKey.OFFLINE_TOTAL_SIZE, "core-ktx_release"}, k = 2, mv = {1, 4, 0})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class MenuKt {
    public static final boolean contains(@NotNull Menu menu, @NotNull MenuItem menuItem) {
    }

    public static final void forEach(@NotNull Menu menu, @NotNull Function1<? super MenuItem, Unit> function1) {
    }

    public static final void forEachIndexed(@NotNull Menu menu, @NotNull Function2<? super Integer, ? super MenuItem, Unit> function2) {
    }

    @NotNull
    public static final MenuItem get(@NotNull Menu menu, int i2) {
    }

    @NotNull
    public static final Sequence<MenuItem> getChildren(@NotNull Menu menu) {
    }

    public static final int getSize(@NotNull Menu menu) {
    }

    public static final boolean isEmpty(@NotNull Menu menu) {
    }

    public static final boolean isNotEmpty(@NotNull Menu menu) {
    }

    @NotNull
    public static final Iterator<MenuItem> iterator(@NotNull Menu menu) {
    }

    public static final void minusAssign(@NotNull Menu menu, @NotNull MenuItem menuItem) {
    }
}
