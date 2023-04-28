package kotlin.collections;

import androidx.exifinterface.media.ExifInterface;
import com.tencent.android.tpush.common.MessageKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: BrittleContainsOptimization.kt */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u001a#\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0000¢\u0006\u0002\u0010\u0004\u001a\u001e\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0005H\u0000\u001a\u001e\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0006H\u0000\u001a,\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005H\u0000\u001a\u0018\u0010\t\u001a\u00020\n\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0001H\u0002¨\u0006\u000b"}, d2 = {"convertToSetForSetOperation", "", ExifInterface.GPS_DIRECTION_TRUE, "", "([Ljava/lang/Object;)Ljava/util/Collection;", "", "Lkotlin/sequences/Sequence;", "convertToSetForSetOperationWith", MessageKey.MSG_SOURCE, "safeToConvertToSet", "", "kotlin-stdlib"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class BrittleContainsOptimizationKt {
    @NotNull
    public static final <T> Collection<T> convertToSetForSetOperation(@NotNull Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof Set) {
            return (Collection) iterable;
        }
        if (!(iterable instanceof Collection)) {
            return CollectionSystemProperties.brittleContainsOptimizationEnabled ? CollectionsKt___CollectionsKt.toHashSet(iterable) : CollectionsKt___CollectionsKt.toList(iterable);
        }
        Collection<T> collection = (Collection) iterable;
        return safeToConvertToSet(collection) ? CollectionsKt___CollectionsKt.toHashSet(iterable) : collection;
    }

    @NotNull
    public static final <T> Collection<T> convertToSetForSetOperationWith(@NotNull Iterable<? extends T> iterable, @NotNull Iterable<? extends T> source) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        if (iterable instanceof Set) {
            return (Collection) iterable;
        }
        if (!(iterable instanceof Collection)) {
            return CollectionSystemProperties.brittleContainsOptimizationEnabled ? CollectionsKt___CollectionsKt.toHashSet(iterable) : CollectionsKt___CollectionsKt.toList(iterable);
        } else if (!(source instanceof Collection) || ((Collection) source).size() >= 2) {
            Collection<T> collection = (Collection) iterable;
            return safeToConvertToSet(collection) ? CollectionsKt___CollectionsKt.toHashSet(iterable) : collection;
        } else {
            return (Collection) iterable;
        }
    }

    private static final <T> boolean safeToConvertToSet(Collection<? extends T> collection) {
        return CollectionSystemProperties.brittleContainsOptimizationEnabled && collection.size() > 2 && (collection instanceof ArrayList);
    }

    @NotNull
    public static final <T> Collection<T> convertToSetForSetOperation(@NotNull Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return CollectionSystemProperties.brittleContainsOptimizationEnabled ? SequencesKt___SequencesKt.toHashSet(sequence) : SequencesKt___SequencesKt.toList(sequence);
    }

    @NotNull
    public static final <T> Collection<T> convertToSetForSetOperation(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return CollectionSystemProperties.brittleContainsOptimizationEnabled ? ArraysKt___ArraysKt.toHashSet(tArr) : ArraysKt___ArraysJvmKt.asList(tArr);
    }
}
