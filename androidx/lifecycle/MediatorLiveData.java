package androidx.lifecycle;

import androidx.annotation.CallSuper;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.arch.core.internal.SafeIterableMap;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class MediatorLiveData<T> extends MutableLiveData<T> {
    private SafeIterableMap<LiveData<?>, Source<?>> mSources;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class Source<V> implements Observer<V> {
        public final LiveData<V> mLiveData;
        public final Observer<? super V> mObserver;
        public int mVersion;

        public Source(LiveData<V> liveData, Observer<? super V> observer) {
        }

        @Override // androidx.lifecycle.Observer
        public void onChanged(@Nullable V v) {
        }

        public void plug() {
        }

        public void unplug() {
        }
    }

    @MainThread
    public <S> void addSource(@NonNull LiveData<S> liveData, @NonNull Observer<? super S> observer) {
    }

    @Override // androidx.lifecycle.LiveData
    @CallSuper
    public void onActive() {
    }

    @Override // androidx.lifecycle.LiveData
    @CallSuper
    public void onInactive() {
    }

    @MainThread
    public <S> void removeSource(@NonNull LiveData<S> liveData) {
    }
}
