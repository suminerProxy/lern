package androidx.recyclerview.widget;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.recyclerview.widget.DiffUtil;
import java.util.concurrent.Executor;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class AsyncDifferConfig<T> {
    @NonNull
    private final Executor mBackgroundThreadExecutor;
    @NonNull
    private final DiffUtil.ItemCallback<T> mDiffCallback;
    @Nullable
    private final Executor mMainThreadExecutor;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class Builder<T> {
        private static Executor sDiffExecutor;
        private static final Object sExecutorLock = null;
        private Executor mBackgroundThreadExecutor;
        private final DiffUtil.ItemCallback<T> mDiffCallback;
        @Nullable
        private Executor mMainThreadExecutor;

        public Builder(@NonNull DiffUtil.ItemCallback<T> itemCallback) {
        }

        @NonNull
        public AsyncDifferConfig<T> build() {
        }

        @NonNull
        public Builder<T> setBackgroundThreadExecutor(Executor executor) {
        }

        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public Builder<T> setMainThreadExecutor(Executor executor) {
        }
    }

    public AsyncDifferConfig(@Nullable Executor executor, @NonNull Executor executor2, @NonNull DiffUtil.ItemCallback<T> itemCallback) {
    }

    @NonNull
    public Executor getBackgroundThreadExecutor() {
    }

    @NonNull
    public DiffUtil.ItemCallback<T> getDiffCallback() {
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Executor getMainThreadExecutor() {
    }
}
