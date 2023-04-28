package kotlin.collections;

import com.baidu.platform.comapi.map.MapBundleKey;
import java.util.RandomAccess;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: _ArraysJvm.kt */
@Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004J\u0011\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0096\u0002J\u0016\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\b\u0010\u0010\u001a\u00020\nH\u0016J\u0010\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"kotlin/collections/ArraysKt___ArraysJvmKt$asList$6", "Lkotlin/collections/AbstractList;", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", MapBundleKey.OfflineMapKey.OFFLINE_TOTAL_SIZE, "", "getSize", "()I", "contains", "", "element", "get", MapBundleKey.MapObjKey.OBJ_SL_INDEX, "(I)Ljava/lang/Double;", "indexOf", "isEmpty", "lastIndexOf", "kotlin-stdlib"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class ArraysKt___ArraysJvmKt$asList$6 extends AbstractList<Double> implements RandomAccess {
    public final /* synthetic */ double[] $this_asList;

    public ArraysKt___ArraysJvmKt$asList$6(double[] dArr) {
        this.$this_asList = dArr;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Double) {
            return contains(((Number) obj).doubleValue());
        }
        return false;
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public int getSize() {
        return this.$this_asList.length;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Double) {
            return indexOf(((Number) obj).doubleValue());
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.$this_asList.length == 0;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Double) {
            return lastIndexOf(((Number) obj).doubleValue());
        }
        return -1;
    }

    public boolean contains(double d2) {
        boolean z;
        double[] dArr = this.$this_asList;
        int length = dArr.length;
        int i2 = 0;
        while (i2 < length) {
            double d3 = dArr[i2];
            i2++;
            if (Double.doubleToLongBits(d3) == Double.doubleToLongBits(d2)) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    @NotNull
    public Double get(int i2) {
        return Double.valueOf(this.$this_asList[i2]);
    }

    public int indexOf(double d2) {
        double[] dArr = this.$this_asList;
        int length = dArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            if (Double.doubleToLongBits(dArr[i2]) == Double.doubleToLongBits(d2)) {
                return i2;
            }
            i2 = i3;
        }
        return -1;
    }

    public int lastIndexOf(double d2) {
        double[] dArr = this.$this_asList;
        int length = dArr.length - 1;
        if (length < 0) {
            return -1;
        }
        while (true) {
            int i2 = length - 1;
            if (Double.doubleToLongBits(dArr[length]) == Double.doubleToLongBits(d2)) {
                return length;
            }
            if (i2 < 0) {
                return -1;
            }
            length = i2;
        }
    }
}
