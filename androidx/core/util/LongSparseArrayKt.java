package androidx.core.util;

import android.util.LongSparseArray;
import androidx.annotation.RequiresApi;
import androidx.exifinterface.media.ExifInterface;
import com.baidu.platform.comapi.map.MapBundleKey;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.LongIterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* compiled from: LongSparseArray.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u001a(\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\n¢\u0006\u0004\b\u0005\u0010\u0006\u001a0\u0010\t\u001a\u00020\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00028\u0000H\u0087\n¢\u0006\u0004\b\t\u0010\n\u001a4\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0087\u0002¢\u0006\u0004\b\f\u0010\r\u001a(\u0010\u000e\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\b¢\u0006\u0004\b\u000e\u0010\u0006\u001a(\u0010\u000f\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0007\u001a\u00028\u0000H\u0087\b¢\u0006\u0004\b\u000f\u0010\u0010\u001a0\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00028\u0000H\u0087\b¢\u0006\u0004\b\u0012\u0010\u0013\u001a6\u0010\u0015\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0087\b¢\u0006\u0004\b\u0015\u0010\u0016\u001a \u0010\u0017\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0087\b¢\u0006\u0004\b\u0017\u0010\u0018\u001a \u0010\u0019\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0087\b¢\u0006\u0004\b\u0019\u0010\u0018\u001a/\u0010\u001a\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001a-\u0010\u001c\u001a\u00020\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001aX\u0010\"\u001a\u00020\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000126\u0010!\u001a2\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u001eH\u0087\b¢\u0006\u0004\b\"\u0010#\u001a\u001f\u0010%\u001a\u00020$\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007¢\u0006\u0004\b%\u0010&\u001a%\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000'\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007¢\u0006\u0004\b(\u0010)\"$\u0010-\u001a\u00020*\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00018Ç\u0002@\u0006¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Landroid/util/LongSparseArray;", "", "key", "", "contains", "(Landroid/util/LongSparseArray;J)Z", "value", "", "set", "(Landroid/util/LongSparseArray;JLjava/lang/Object;)V", "other", "plus", "(Landroid/util/LongSparseArray;Landroid/util/LongSparseArray;)Landroid/util/LongSparseArray;", "containsKey", "containsValue", "(Landroid/util/LongSparseArray;Ljava/lang/Object;)Z", "defaultValue", "getOrDefault", "(Landroid/util/LongSparseArray;JLjava/lang/Object;)Ljava/lang/Object;", "Lkotlin/Function0;", "getOrElse", "(Landroid/util/LongSparseArray;JLkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "isEmpty", "(Landroid/util/LongSparseArray;)Z", "isNotEmpty", "remove", "(Landroid/util/LongSparseArray;JLjava/lang/Object;)Z", "putAll", "(Landroid/util/LongSparseArray;Landroid/util/LongSparseArray;)V", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "action", "forEach", "(Landroid/util/LongSparseArray;Lkotlin/jvm/functions/Function2;)V", "Lkotlin/collections/LongIterator;", "keyIterator", "(Landroid/util/LongSparseArray;)Lkotlin/collections/LongIterator;", "", "valueIterator", "(Landroid/util/LongSparseArray;)Ljava/util/Iterator;", "", "getSize", "(Landroid/util/LongSparseArray;)I", MapBundleKey.OfflineMapKey.OFFLINE_TOTAL_SIZE, "core-ktx_release"}, k = 2, mv = {1, 4, 0})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class LongSparseArrayKt {
    @RequiresApi(16)
    public static final <T> boolean contains(@NotNull LongSparseArray<T> longSparseArray, long j2) {
    }

    @RequiresApi(16)
    public static final <T> boolean containsKey(@NotNull LongSparseArray<T> longSparseArray, long j2) {
    }

    @RequiresApi(16)
    public static final <T> boolean containsValue(@NotNull LongSparseArray<T> longSparseArray, T t) {
    }

    @RequiresApi(16)
    public static final <T> void forEach(@NotNull LongSparseArray<T> longSparseArray, @NotNull Function2<? super Long, ? super T, Unit> function2) {
    }

    @RequiresApi(16)
    public static final <T> T getOrDefault(@NotNull LongSparseArray<T> longSparseArray, long j2, T t) {
    }

    @RequiresApi(16)
    public static final <T> T getOrElse(@NotNull LongSparseArray<T> longSparseArray, long j2, @NotNull Function0<? extends T> function0) {
    }

    @RequiresApi(16)
    public static final <T> int getSize(@NotNull LongSparseArray<T> longSparseArray) {
    }

    @RequiresApi(16)
    public static final <T> boolean isEmpty(@NotNull LongSparseArray<T> longSparseArray) {
    }

    @RequiresApi(16)
    public static final <T> boolean isNotEmpty(@NotNull LongSparseArray<T> longSparseArray) {
    }

    @RequiresApi(16)
    @NotNull
    public static final <T> LongIterator keyIterator(@NotNull LongSparseArray<T> longSparseArray) {
    }

    @RequiresApi(16)
    @NotNull
    public static final <T> LongSparseArray<T> plus(@NotNull LongSparseArray<T> longSparseArray, @NotNull LongSparseArray<T> longSparseArray2) {
    }

    @RequiresApi(16)
    public static final <T> void putAll(@NotNull LongSparseArray<T> longSparseArray, @NotNull LongSparseArray<T> longSparseArray2) {
    }

    @RequiresApi(16)
    public static final <T> boolean remove(@NotNull LongSparseArray<T> longSparseArray, long j2, T t) {
    }

    @RequiresApi(16)
    public static final <T> void set(@NotNull LongSparseArray<T> longSparseArray, long j2, T t) {
    }

    @RequiresApi(16)
    @NotNull
    public static final <T> Iterator<T> valueIterator(@NotNull LongSparseArray<T> longSparseArray) {
    }
}
