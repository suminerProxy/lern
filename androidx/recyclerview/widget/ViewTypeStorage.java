package androidx.recyclerview.widget;

import android.util.SparseArray;
import android.util.SparseIntArray;
import androidx.annotation.NonNull;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public interface ViewTypeStorage {

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class IsolatedViewTypeStorage implements ViewTypeStorage {
        public SparseArray<NestedAdapterWrapper> mGlobalTypeToWrapper;
        public int mNextViewType;

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class WrapperViewTypeLookup implements ViewTypeLookup {
            private SparseIntArray mGlobalToLocalMapping;
            private SparseIntArray mLocalToGlobalMapping;
            public final NestedAdapterWrapper mWrapper;
            public final /* synthetic */ IsolatedViewTypeStorage this$0;

            public WrapperViewTypeLookup(IsolatedViewTypeStorage isolatedViewTypeStorage, NestedAdapterWrapper nestedAdapterWrapper) {
            }

            @Override // androidx.recyclerview.widget.ViewTypeStorage.ViewTypeLookup
            public void dispose() {
            }

            @Override // androidx.recyclerview.widget.ViewTypeStorage.ViewTypeLookup
            public int globalToLocal(int i2) {
            }

            @Override // androidx.recyclerview.widget.ViewTypeStorage.ViewTypeLookup
            public int localToGlobal(int i2) {
            }
        }

        @Override // androidx.recyclerview.widget.ViewTypeStorage
        @NonNull
        public ViewTypeLookup createViewTypeWrapper(@NonNull NestedAdapterWrapper nestedAdapterWrapper) {
        }

        @Override // androidx.recyclerview.widget.ViewTypeStorage
        @NonNull
        public NestedAdapterWrapper getWrapperForGlobalType(int i2) {
        }

        public int obtainViewType(NestedAdapterWrapper nestedAdapterWrapper) {
        }

        public void removeWrapper(@NonNull NestedAdapterWrapper nestedAdapterWrapper) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class SharedIdRangeViewTypeStorage implements ViewTypeStorage {
        public SparseArray<List<NestedAdapterWrapper>> mGlobalTypeToWrapper;

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class WrapperViewTypeLookup implements ViewTypeLookup {
            public final NestedAdapterWrapper mWrapper;
            public final /* synthetic */ SharedIdRangeViewTypeStorage this$0;

            public WrapperViewTypeLookup(SharedIdRangeViewTypeStorage sharedIdRangeViewTypeStorage, NestedAdapterWrapper nestedAdapterWrapper) {
            }

            @Override // androidx.recyclerview.widget.ViewTypeStorage.ViewTypeLookup
            public void dispose() {
            }

            @Override // androidx.recyclerview.widget.ViewTypeStorage.ViewTypeLookup
            public int globalToLocal(int i2) {
            }

            @Override // androidx.recyclerview.widget.ViewTypeStorage.ViewTypeLookup
            public int localToGlobal(int i2) {
            }
        }

        @Override // androidx.recyclerview.widget.ViewTypeStorage
        @NonNull
        public ViewTypeLookup createViewTypeWrapper(@NonNull NestedAdapterWrapper nestedAdapterWrapper) {
        }

        @Override // androidx.recyclerview.widget.ViewTypeStorage
        @NonNull
        public NestedAdapterWrapper getWrapperForGlobalType(int i2) {
        }

        public void removeWrapper(@NonNull NestedAdapterWrapper nestedAdapterWrapper) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface ViewTypeLookup {
        void dispose();

        int globalToLocal(int i2);

        int localToGlobal(int i2);
    }

    @NonNull
    ViewTypeLookup createViewTypeWrapper(@NonNull NestedAdapterWrapper nestedAdapterWrapper);

    @NonNull
    NestedAdapterWrapper getWrapperForGlobalType(int i2);
}
