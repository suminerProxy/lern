package androidx.recyclerview.widget;

import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class AsyncListDiffer<T> {
    private static final Executor sMainThreadExecutor = null;
    public final AsyncDifferConfig<T> mConfig;
    @Nullable
    private List<T> mList;
    private final List<ListListener<T>> mListeners;
    public Executor mMainThreadExecutor;
    public int mMaxScheduledGeneration;
    @NonNull
    private List<T> mReadOnlyList;
    private final ListUpdateCallback mUpdateCallback;

    /* renamed from: androidx.recyclerview.widget.AsyncListDiffer$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements Runnable {
        public final /* synthetic */ AsyncListDiffer this$0;
        public final /* synthetic */ Runnable val$commitCallback;
        public final /* synthetic */ List val$newList;
        public final /* synthetic */ List val$oldList;
        public final /* synthetic */ int val$runGeneration;

        /* renamed from: androidx.recyclerview.widget.AsyncListDiffer$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class C00051 extends DiffUtil.Callback {
            public final /* synthetic */ AnonymousClass1 this$1;

            public C00051(AnonymousClass1 anonymousClass1) {
            }

            @Override // androidx.recyclerview.widget.DiffUtil.Callback
            public boolean areContentsTheSame(int i2, int i3) {
            }

            @Override // androidx.recyclerview.widget.DiffUtil.Callback
            public boolean areItemsTheSame(int i2, int i3) {
            }

            @Override // androidx.recyclerview.widget.DiffUtil.Callback
            @Nullable
            public Object getChangePayload(int i2, int i3) {
            }

            @Override // androidx.recyclerview.widget.DiffUtil.Callback
            public int getNewListSize() {
            }

            @Override // androidx.recyclerview.widget.DiffUtil.Callback
            public int getOldListSize() {
            }
        }

        /* renamed from: androidx.recyclerview.widget.AsyncListDiffer$1$2  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class AnonymousClass2 implements Runnable {
            public final /* synthetic */ AnonymousClass1 this$1;
            public final /* synthetic */ DiffUtil.DiffResult val$result;

            public AnonymousClass2(AnonymousClass1 anonymousClass1, DiffUtil.DiffResult diffResult) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public AnonymousClass1(AsyncListDiffer asyncListDiffer, List list, List list2, int i2, Runnable runnable) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface ListListener<T> {
        void onCurrentListChanged(@NonNull List<T> list, @NonNull List<T> list2);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class MainThreadExecutor implements Executor {
        public final Handler mHandler;

        @Override // java.util.concurrent.Executor
        public void execute(@NonNull Runnable runnable) {
        }
    }

    public AsyncListDiffer(@NonNull RecyclerView.Adapter adapter, @NonNull DiffUtil.ItemCallback<T> itemCallback) {
    }

    private void onCurrentListChanged(@NonNull List<T> list, @Nullable Runnable runnable) {
    }

    public void addListListener(@NonNull ListListener<T> listListener) {
    }

    @NonNull
    public List<T> getCurrentList() {
    }

    public void latchList(@NonNull List<T> list, @NonNull DiffUtil.DiffResult diffResult, @Nullable Runnable runnable) {
    }

    public void removeListListener(@NonNull ListListener<T> listListener) {
    }

    public void submitList(@Nullable List<T> list) {
    }

    public void submitList(@Nullable List<T> list, @Nullable Runnable runnable) {
    }

    public AsyncListDiffer(@NonNull ListUpdateCallback listUpdateCallback, @NonNull AsyncDifferConfig<T> asyncDifferConfig) {
    }
}
