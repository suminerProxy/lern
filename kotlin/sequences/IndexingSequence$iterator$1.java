package kotlin.sequences;

import com.baidu.platform.comapi.map.MapBundleKey;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.IndexedValue;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: Sequences.kt */
@Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001J\t\u0010\f\u001a\u00020\rH\u0096\u0002J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"kotlin/sequences/IndexingSequence$iterator$1", "", "Lkotlin/collections/IndexedValue;", MapBundleKey.MapObjKey.OBJ_SL_INDEX, "", "getIndex", "()I", "setIndex", "(I)V", "iterator", "getIterator", "()Ljava/util/Iterator;", "hasNext", "", "next", "kotlin-stdlib"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class IndexingSequence$iterator$1<T> implements Iterator<IndexedValue<? extends T>>, KMappedMarker {
    private int index;
    @NotNull
    private final Iterator<T> iterator;
    public final /* synthetic */ IndexingSequence<T> this$0;

    public IndexingSequence$iterator$1(IndexingSequence<T> indexingSequence) {
    }

    public final int getIndex() {
    }

    @NotNull
    public final Iterator<T> getIterator() {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
    }

    @Override // java.util.Iterator
    public void remove() {
    }

    public final void setIndex(int i2) {
    }

    @Override // java.util.Iterator
    @NotNull
    public IndexedValue<T> next() {
    }
}
