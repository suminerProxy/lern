package androidx.lifecycle;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.arch.core.util.Function;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class Transformations {

    /* JADX INFO: Add missing generic type declarations: [X] */
    /* renamed from: androidx.lifecycle.Transformations$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class AnonymousClass1<X> implements Observer<X> {
        public final /* synthetic */ Function val$mapFunction;
        public final /* synthetic */ MediatorLiveData val$result;

        public AnonymousClass1(MediatorLiveData mediatorLiveData, Function function) {
        }

        @Override // androidx.lifecycle.Observer
        public void onChanged(@Nullable X x) {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [X] */
    /* renamed from: androidx.lifecycle.Transformations$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class AnonymousClass2<X> implements Observer<X> {
        public LiveData<Y> mSource;
        public final /* synthetic */ MediatorLiveData val$result;
        public final /* synthetic */ Function val$switchMapFunction;

        /* JADX INFO: Add missing generic type declarations: [Y] */
        /* renamed from: androidx.lifecycle.Transformations$2$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class AnonymousClass1<Y> implements Observer<Y> {
            public final /* synthetic */ AnonymousClass2 this$0;

            public AnonymousClass1(AnonymousClass2 anonymousClass2) {
            }

            @Override // androidx.lifecycle.Observer
            public void onChanged(@Nullable Y y) {
            }
        }

        public AnonymousClass2(Function function, MediatorLiveData mediatorLiveData) {
        }

        @Override // androidx.lifecycle.Observer
        public void onChanged(@Nullable X x) {
        }
    }

    private Transformations() {
    }

    @MainThread
    public static <X, Y> LiveData<Y> map(@NonNull LiveData<X> liveData, @NonNull Function<X, Y> function) {
    }

    @MainThread
    public static <X, Y> LiveData<Y> switchMap(@NonNull LiveData<X> liveData, @NonNull Function<X, LiveData<Y>> function) {
    }
}
