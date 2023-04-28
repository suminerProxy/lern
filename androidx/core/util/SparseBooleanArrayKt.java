package androidx.core.util;

import android.util.SparseBooleanArray;
import com.baidu.platform.comapi.map.MapBundleKey;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.BooleanIterator;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* compiled from: SparseBooleanArray.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\n¢\u0006\u0004\b\u0004\u0010\u0005\u001a$\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0003H\u0086\n¢\u0006\u0004\b\b\u0010\t\u001a\u001c\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u001c\u0010\r\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\b¢\u0006\u0004\b\r\u0010\u0005\u001a\u001c\u0010\u000e\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0003H\u0086\b¢\u0006\u0004\b\u000e\u0010\u000f\u001a$\u0010\u0011\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u0003H\u0086\b¢\u0006\u0004\b\u0011\u0010\u0012\u001a*\u0010\u0014\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0013H\u0086\b¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0014\u0010\u0016\u001a\u00020\u0003*\u00020\u0000H\u0086\b¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0014\u0010\u0018\u001a\u00020\u0003*\u00020\u0000H\u0086\b¢\u0006\u0004\b\u0018\u0010\u0017\u001a!\u0010\u0019\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0019\u0010\u0012\u001a\u0019\u0010\u001a\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001aL\u0010 \u001a\u00020\u0007*\u00020\u000026\u0010\u001f\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u001cH\u0086\b¢\u0006\u0004\b \u0010!\u001a\u0011\u0010#\u001a\u00020\"*\u00020\u0000¢\u0006\u0004\b#\u0010$\u001a\u0011\u0010&\u001a\u00020%*\u00020\u0000¢\u0006\u0004\b&\u0010'\"\u0018\u0010*\u001a\u00020\u0001*\u00020\u00008Æ\u0002@\u0006¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"Landroid/util/SparseBooleanArray;", "", "key", "", "contains", "(Landroid/util/SparseBooleanArray;I)Z", "value", "", "set", "(Landroid/util/SparseBooleanArray;IZ)V", "other", "plus", "(Landroid/util/SparseBooleanArray;Landroid/util/SparseBooleanArray;)Landroid/util/SparseBooleanArray;", "containsKey", "containsValue", "(Landroid/util/SparseBooleanArray;Z)Z", "defaultValue", "getOrDefault", "(Landroid/util/SparseBooleanArray;IZ)Z", "Lkotlin/Function0;", "getOrElse", "(Landroid/util/SparseBooleanArray;ILkotlin/jvm/functions/Function0;)Z", "isEmpty", "(Landroid/util/SparseBooleanArray;)Z", "isNotEmpty", "remove", "putAll", "(Landroid/util/SparseBooleanArray;Landroid/util/SparseBooleanArray;)V", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "action", "forEach", "(Landroid/util/SparseBooleanArray;Lkotlin/jvm/functions/Function2;)V", "Lkotlin/collections/IntIterator;", "keyIterator", "(Landroid/util/SparseBooleanArray;)Lkotlin/collections/IntIterator;", "Lkotlin/collections/BooleanIterator;", "valueIterator", "(Landroid/util/SparseBooleanArray;)Lkotlin/collections/BooleanIterator;", "getSize", "(Landroid/util/SparseBooleanArray;)I", MapBundleKey.OfflineMapKey.OFFLINE_TOTAL_SIZE, "core-ktx_release"}, k = 2, mv = {1, 4, 0})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class SparseBooleanArrayKt {
    public static final boolean contains(@NotNull SparseBooleanArray sparseBooleanArray, int i2) {
    }

    public static final boolean containsKey(@NotNull SparseBooleanArray sparseBooleanArray, int i2) {
    }

    public static final boolean containsValue(@NotNull SparseBooleanArray sparseBooleanArray, boolean z) {
    }

    public static final void forEach(@NotNull SparseBooleanArray sparseBooleanArray, @NotNull Function2<? super Integer, ? super Boolean, Unit> function2) {
    }

    public static final boolean getOrDefault(@NotNull SparseBooleanArray sparseBooleanArray, int i2, boolean z) {
    }

    public static final boolean getOrElse(@NotNull SparseBooleanArray sparseBooleanArray, int i2, @NotNull Function0<Boolean> function0) {
    }

    public static final int getSize(@NotNull SparseBooleanArray sparseBooleanArray) {
    }

    public static final boolean isEmpty(@NotNull SparseBooleanArray sparseBooleanArray) {
    }

    public static final boolean isNotEmpty(@NotNull SparseBooleanArray sparseBooleanArray) {
    }

    @NotNull
    public static final IntIterator keyIterator(@NotNull SparseBooleanArray sparseBooleanArray) {
    }

    @NotNull
    public static final SparseBooleanArray plus(@NotNull SparseBooleanArray sparseBooleanArray, @NotNull SparseBooleanArray sparseBooleanArray2) {
    }

    public static final void putAll(@NotNull SparseBooleanArray sparseBooleanArray, @NotNull SparseBooleanArray sparseBooleanArray2) {
    }

    public static final boolean remove(@NotNull SparseBooleanArray sparseBooleanArray, int i2, boolean z) {
    }

    public static final void set(@NotNull SparseBooleanArray sparseBooleanArray, int i2, boolean z) {
    }

    @NotNull
    public static final BooleanIterator valueIterator(@NotNull SparseBooleanArray sparseBooleanArray) {
    }
}
