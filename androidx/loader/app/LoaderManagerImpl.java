package androidx.loader.app;

import android.os.Bundle;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.SparseArrayCompat;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.loader.app.LoaderManager;
import androidx.loader.content.Loader;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class LoaderManagerImpl extends LoaderManager {
    public static boolean DEBUG = false;
    public static final String TAG = "LoaderManager";
    @NonNull
    private final LifecycleOwner mLifecycleOwner;
    @NonNull
    private final LoaderViewModel mLoaderViewModel;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class LoaderInfo<D> extends MutableLiveData<D> implements Loader.OnLoadCompleteListener<D> {
        @Nullable
        private final Bundle mArgs;
        private final int mId;
        private LifecycleOwner mLifecycleOwner;
        @NonNull
        private final Loader<D> mLoader;
        private LoaderObserver<D> mObserver;
        private Loader<D> mPriorLoader;

        public LoaderInfo(int i2, @Nullable Bundle bundle, @NonNull Loader<D> loader, @Nullable Loader<D> loader2) {
        }

        @MainThread
        public Loader<D> destroy(boolean z) {
        }

        public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        }

        @NonNull
        public Loader<D> getLoader() {
        }

        public boolean isCallbackWaitingForData() {
        }

        public void markForRedelivery() {
        }

        @Override // androidx.lifecycle.LiveData
        public void onActive() {
        }

        @Override // androidx.lifecycle.LiveData
        public void onInactive() {
        }

        @Override // androidx.loader.content.Loader.OnLoadCompleteListener
        public void onLoadComplete(@NonNull Loader<D> loader, @Nullable D d2) {
        }

        @Override // androidx.lifecycle.LiveData
        public void removeObserver(@NonNull Observer<? super D> observer) {
        }

        @NonNull
        @MainThread
        public Loader<D> setCallback(@NonNull LifecycleOwner lifecycleOwner, @NonNull LoaderManager.LoaderCallbacks<D> loaderCallbacks) {
        }

        @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
        public void setValue(D d2) {
        }

        public String toString() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class LoaderObserver<D> implements Observer<D> {
        @NonNull
        private final LoaderManager.LoaderCallbacks<D> mCallback;
        private boolean mDeliveredData;
        @NonNull
        private final Loader<D> mLoader;

        public LoaderObserver(@NonNull Loader<D> loader, @NonNull LoaderManager.LoaderCallbacks<D> loaderCallbacks) {
        }

        public void dump(String str, PrintWriter printWriter) {
        }

        public boolean hasDeliveredData() {
        }

        @Override // androidx.lifecycle.Observer
        public void onChanged(@Nullable D d2) {
        }

        @MainThread
        public void reset() {
        }

        public String toString() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class LoaderViewModel extends ViewModel {
        private static final ViewModelProvider.Factory FACTORY = null;
        private boolean mCreatingLoader;
        private SparseArrayCompat<LoaderInfo> mLoaders;

        /* renamed from: androidx.loader.app.LoaderManagerImpl$LoaderViewModel$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public static class AnonymousClass1 implements ViewModelProvider.Factory {
            @Override // androidx.lifecycle.ViewModelProvider.Factory
            @NonNull
            public <T extends ViewModel> T create(@NonNull Class<T> cls) {
            }
        }

        @NonNull
        public static LoaderViewModel getInstance(ViewModelStore viewModelStore) {
        }

        public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        }

        public void finishCreatingLoader() {
        }

        public <D> LoaderInfo<D> getLoader(int i2) {
        }

        public boolean hasRunningLoaders() {
        }

        public boolean isCreatingLoader() {
        }

        public void markForRedelivery() {
        }

        @Override // androidx.lifecycle.ViewModel
        public void onCleared() {
        }

        public void putLoader(int i2, @NonNull LoaderInfo loaderInfo) {
        }

        public void removeLoader(int i2) {
        }

        public void startCreatingLoader() {
        }
    }

    public LoaderManagerImpl(@NonNull LifecycleOwner lifecycleOwner, @NonNull ViewModelStore viewModelStore) {
    }

    @NonNull
    @MainThread
    private <D> Loader<D> createAndInstallLoader(int i2, @Nullable Bundle bundle, @NonNull LoaderManager.LoaderCallbacks<D> loaderCallbacks, @Nullable Loader<D> loader) {
    }

    @Override // androidx.loader.app.LoaderManager
    @MainThread
    public void destroyLoader(int i2) {
    }

    @Override // androidx.loader.app.LoaderManager
    @Deprecated
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    @Override // androidx.loader.app.LoaderManager
    @Nullable
    public <D> Loader<D> getLoader(int i2) {
    }

    @Override // androidx.loader.app.LoaderManager
    public boolean hasRunningLoaders() {
    }

    @Override // androidx.loader.app.LoaderManager
    @NonNull
    @MainThread
    public <D> Loader<D> initLoader(int i2, @Nullable Bundle bundle, @NonNull LoaderManager.LoaderCallbacks<D> loaderCallbacks) {
    }

    @Override // androidx.loader.app.LoaderManager
    public void markForRedelivery() {
    }

    @Override // androidx.loader.app.LoaderManager
    @NonNull
    @MainThread
    public <D> Loader<D> restartLoader(int i2, @Nullable Bundle bundle, @NonNull LoaderManager.LoaderCallbacks<D> loaderCallbacks) {
    }

    public String toString() {
    }
}
