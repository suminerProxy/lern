package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.Internal;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public abstract class ListFieldSchema {
    private static final ListFieldSchema FULL_INSTANCE = null;
    private static final ListFieldSchema LITE_INSTANCE = null;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class ListFieldSchemaFull extends ListFieldSchema {
        private static final Class<?> UNMODIFIABLE_LIST_CLASS = null;

        private ListFieldSchemaFull() {
        }

        public static <E> List<E> getList(Object obj, long j2) {
        }

        @Override // androidx.datastore.preferences.protobuf.ListFieldSchema
        public void makeImmutableListAt(Object obj, long j2) {
        }

        @Override // androidx.datastore.preferences.protobuf.ListFieldSchema
        public <E> void mergeListsAt(Object obj, Object obj2, long j2) {
        }

        @Override // androidx.datastore.preferences.protobuf.ListFieldSchema
        public <L> List<L> mutableListAt(Object obj, long j2) {
        }

        public /* synthetic */ ListFieldSchemaFull(AnonymousClass1 anonymousClass1) {
        }

        private static <L> List<L> mutableListAt(Object obj, long j2, int i2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class ListFieldSchemaLite extends ListFieldSchema {
        private ListFieldSchemaLite() {
        }

        public static <E> Internal.ProtobufList<E> getProtobufList(Object obj, long j2) {
        }

        @Override // androidx.datastore.preferences.protobuf.ListFieldSchema
        public void makeImmutableListAt(Object obj, long j2) {
        }

        @Override // androidx.datastore.preferences.protobuf.ListFieldSchema
        public <E> void mergeListsAt(Object obj, Object obj2, long j2) {
        }

        @Override // androidx.datastore.preferences.protobuf.ListFieldSchema
        public <L> List<L> mutableListAt(Object obj, long j2) {
        }

        public /* synthetic */ ListFieldSchemaLite(AnonymousClass1 anonymousClass1) {
        }
    }

    public /* synthetic */ ListFieldSchema(AnonymousClass1 anonymousClass1) {
    }

    public static ListFieldSchema full() {
    }

    public static ListFieldSchema lite() {
    }

    public abstract void makeImmutableListAt(Object obj, long j2);

    public abstract <L> void mergeListsAt(Object obj, Object obj2, long j2);

    public abstract <L> List<L> mutableListAt(Object obj, long j2);

    private ListFieldSchema() {
    }
}
