package org.jsoup.nodes;

import java.io.IOException;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jsoup.nodes.Document;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class Attributes implements Iterable<Attribute>, Cloneable {
    private static final String[] Empty = null;
    private static final String EmptyString = "";
    private static final int GrowthFactor = 2;
    private static final int InitialCapacity = 4;
    public static final int NotFound = -1;
    public static final String dataPrefix = "data-";
    public String[] keys;
    private int size;
    public String[] vals;

    /* renamed from: org.jsoup.nodes.Attributes$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public class AnonymousClass1 implements Iterator<Attribute> {

        /* renamed from: i  reason: collision with root package name */
        public int f29802i;
        public final /* synthetic */ Attributes this$0;

        public AnonymousClass1(Attributes attributes) {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Attribute next() {
        }

        @Override // java.util.Iterator
        public void remove() {
        }

        @Override // java.util.Iterator
        /* renamed from: next  reason: avoid collision after fix types in other method */
        public Attribute next2() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static class Dataset extends AbstractMap<String, String> {
        private final Attributes attributes;

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
        public class DatasetIterator implements Iterator<Map.Entry<String, String>> {
            private Attribute attr;
            private Iterator<Attribute> attrIter;
            public final /* synthetic */ Dataset this$0;

            private DatasetIterator(Dataset dataset) {
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
            }

            @Override // java.util.Iterator
            public /* bridge */ /* synthetic */ Map.Entry<String, String> next() {
            }

            @Override // java.util.Iterator
            public void remove() {
            }

            @Override // java.util.Iterator
            /* renamed from: next  reason: avoid collision after fix types in other method */
            public Map.Entry<String, String> next2() {
            }

            public /* synthetic */ DatasetIterator(Dataset dataset, AnonymousClass1 anonymousClass1) {
            }
        }

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
        public class EntrySet extends AbstractSet<Map.Entry<String, String>> {
            public final /* synthetic */ Dataset this$0;

            private EntrySet(Dataset dataset) {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<String, String>> iterator() {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
            }

            public /* synthetic */ EntrySet(Dataset dataset, AnonymousClass1 anonymousClass1) {
            }
        }

        public /* synthetic */ Dataset(Attributes attributes, AnonymousClass1 anonymousClass1) {
        }

        public static /* synthetic */ Attributes access$600(Dataset dataset) {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<String, String>> entrySet() {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        }

        private Dataset(Attributes attributes) {
        }

        public String put(String str, String str2) {
        }
    }

    public static /* synthetic */ int access$000(Attributes attributes) {
    }

    public static /* synthetic */ void access$100(Attributes attributes, int i2) {
    }

    public static /* synthetic */ String access$400(String str) {
    }

    private void add(String str, String str2) {
    }

    private void checkCapacity(int i2) {
    }

    public static String checkNotNull(String str) {
    }

    private static String[] copyOf(String[] strArr, int i2) {
    }

    private static String dataKey(String str) {
    }

    private int indexOfKeyIgnoreCase(String str) {
    }

    private void remove(int i2) {
    }

    public void addAll(Attributes attributes) {
    }

    public List<Attribute> asList() {
    }

    public /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
    }

    public Map<String, String> dataset() {
    }

    public boolean equals(Object obj) {
    }

    public String get(String str) {
    }

    public String getIgnoreCase(String str) {
    }

    public boolean hasKey(String str) {
    }

    public boolean hasKeyIgnoreCase(String str) {
    }

    public int hashCode() {
    }

    public String html() {
    }

    public int indexOfKey(String str) {
    }

    @Override // java.lang.Iterable
    public Iterator<Attribute> iterator() {
    }

    public void normalize() {
    }

    public Attributes put(String str, String str2) {
    }

    public void putIgnoreCase(String str, String str2) {
    }

    public void removeIgnoreCase(String str) {
    }

    public int size() {
    }

    public String toString() {
    }

    /* renamed from: clone  reason: collision with other method in class */
    public Attributes m1632clone() {
    }

    public Attributes put(String str, boolean z) {
    }

    public final void html(Appendable appendable, Document.OutputSettings outputSettings) throws IOException {
    }

    public Attributes put(Attribute attribute) {
    }

    public void remove(String str) {
    }
}
