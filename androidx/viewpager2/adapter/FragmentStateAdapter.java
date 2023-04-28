package androidx.viewpager2.adapter;

import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.LongSparseArray;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public abstract class FragmentStateAdapter extends RecyclerView.Adapter<FragmentViewHolder> implements StatefulAdapter {
    private static final long GRACE_WINDOW_TIME_MS = 10000;
    private static final String KEY_PREFIX_FRAGMENT = "f#";
    private static final String KEY_PREFIX_STATE = "s#";
    public final FragmentManager mFragmentManager;
    private FragmentMaxLifecycleEnforcer mFragmentMaxLifecycleEnforcer;
    public final LongSparseArray<Fragment> mFragments;
    private boolean mHasStaleFragments;
    public boolean mIsInGracePeriod;
    private final LongSparseArray<Integer> mItemIdToViewHolder;
    public final Lifecycle mLifecycle;
    private final LongSparseArray<Fragment.SavedState> mSavedStates;

    /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements View.OnLayoutChangeListener {
        public final /* synthetic */ FragmentStateAdapter this$0;
        public final /* synthetic */ FrameLayout val$container;
        public final /* synthetic */ FragmentViewHolder val$holder;

        public AnonymousClass1(FragmentStateAdapter fragmentStateAdapter, FrameLayout frameLayout, FragmentViewHolder fragmentViewHolder) {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        }
    }

    /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass2 implements LifecycleEventObserver {
        public final /* synthetic */ FragmentStateAdapter this$0;
        public final /* synthetic */ FragmentViewHolder val$holder;

        public AnonymousClass2(FragmentStateAdapter fragmentStateAdapter, FragmentViewHolder fragmentViewHolder) {
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public void onStateChanged(@NonNull LifecycleOwner lifecycleOwner, @NonNull Lifecycle.Event event) {
        }
    }

    /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass3 extends FragmentManager.FragmentLifecycleCallbacks {
        public final /* synthetic */ FragmentStateAdapter this$0;
        public final /* synthetic */ FrameLayout val$container;
        public final /* synthetic */ Fragment val$fragment;

        public AnonymousClass3(FragmentStateAdapter fragmentStateAdapter, Fragment fragment, FrameLayout frameLayout) {
        }

        @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
        public void onFragmentViewCreated(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @NonNull View view, @Nullable Bundle bundle) {
        }
    }

    /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass4 implements Runnable {
        public final /* synthetic */ FragmentStateAdapter this$0;

        public AnonymousClass4(FragmentStateAdapter fragmentStateAdapter) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass5 implements LifecycleEventObserver {
        public final /* synthetic */ FragmentStateAdapter this$0;
        public final /* synthetic */ Handler val$handler;
        public final /* synthetic */ Runnable val$runnable;

        public AnonymousClass5(FragmentStateAdapter fragmentStateAdapter, Handler handler, Runnable runnable) {
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public void onStateChanged(@NonNull LifecycleOwner lifecycleOwner, @NonNull Lifecycle.Event event) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static abstract class DataSetChangeObserver extends RecyclerView.AdapterDataObserver {
        private DataSetChangeObserver() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public abstract void onChanged();

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeChanged(int i2, int i3) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeInserted(int i2, int i3) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeMoved(int i2, int i3, int i4) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeRemoved(int i2, int i3) {
        }

        public /* synthetic */ DataSetChangeObserver(AnonymousClass1 anonymousClass1) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeChanged(int i2, int i3, @Nullable Object obj) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class FragmentMaxLifecycleEnforcer {
        private RecyclerView.AdapterDataObserver mDataObserver;
        private LifecycleEventObserver mLifecycleObserver;
        private ViewPager2.OnPageChangeCallback mPageChangeCallback;
        private long mPrimaryItemId;
        private ViewPager2 mViewPager;
        public final /* synthetic */ FragmentStateAdapter this$0;

        /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$FragmentMaxLifecycleEnforcer$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class AnonymousClass1 extends ViewPager2.OnPageChangeCallback {
            public final /* synthetic */ FragmentMaxLifecycleEnforcer this$1;

            public AnonymousClass1(FragmentMaxLifecycleEnforcer fragmentMaxLifecycleEnforcer) {
            }

            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageScrollStateChanged(int i2) {
            }

            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageSelected(int i2) {
            }
        }

        /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$FragmentMaxLifecycleEnforcer$2  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class AnonymousClass2 extends DataSetChangeObserver {
            public final /* synthetic */ FragmentMaxLifecycleEnforcer this$1;

            public AnonymousClass2(FragmentMaxLifecycleEnforcer fragmentMaxLifecycleEnforcer) {
            }

            @Override // androidx.viewpager2.adapter.FragmentStateAdapter.DataSetChangeObserver, androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onChanged() {
            }
        }

        /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$FragmentMaxLifecycleEnforcer$3  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class AnonymousClass3 implements LifecycleEventObserver {
            public final /* synthetic */ FragmentMaxLifecycleEnforcer this$1;

            public AnonymousClass3(FragmentMaxLifecycleEnforcer fragmentMaxLifecycleEnforcer) {
            }

            @Override // androidx.lifecycle.LifecycleEventObserver
            public void onStateChanged(@NonNull LifecycleOwner lifecycleOwner, @NonNull Lifecycle.Event event) {
            }
        }

        public FragmentMaxLifecycleEnforcer(FragmentStateAdapter fragmentStateAdapter) {
        }

        @NonNull
        private ViewPager2 inferViewPager(@NonNull RecyclerView recyclerView) {
        }

        public void register(@NonNull RecyclerView recyclerView) {
        }

        public void unregister(@NonNull RecyclerView recyclerView) {
        }

        public void updateFragmentMaxLifecycle(boolean z) {
        }
    }

    public FragmentStateAdapter(@NonNull FragmentActivity fragmentActivity) {
    }

    @NonNull
    private static String createKey(@NonNull String str, long j2) {
    }

    private void ensureFragment(int i2) {
    }

    private boolean isFragmentViewBound(long j2) {
    }

    private static boolean isValidKey(@NonNull String str, @NonNull String str2) {
    }

    private Long itemForViewHolder(int i2) {
    }

    private static long parseIdFromKey(@NonNull String str, @NonNull String str2) {
    }

    private void removeFragment(long j2) {
    }

    private void scheduleGracePeriodEnd() {
    }

    private void scheduleViewAttach(Fragment fragment, @NonNull FrameLayout frameLayout) {
    }

    public void addViewToContainer(@NonNull View view, @NonNull FrameLayout frameLayout) {
    }

    public boolean containsItem(long j2) {
    }

    @NonNull
    public abstract Fragment createFragment(int i2);

    public void gcFragments() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @CallSuper
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onBindViewHolder(@NonNull FragmentViewHolder fragmentViewHolder, int i2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public /* bridge */ /* synthetic */ FragmentViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @CallSuper
    public void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ boolean onFailedToRecycleView(@NonNull FragmentViewHolder fragmentViewHolder) {
    }

    /* renamed from: onFailedToRecycleView  reason: avoid collision after fix types in other method */
    public final boolean onFailedToRecycleView2(@NonNull FragmentViewHolder fragmentViewHolder) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onViewAttachedToWindow(@NonNull FragmentViewHolder fragmentViewHolder) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onViewRecycled(@NonNull FragmentViewHolder fragmentViewHolder) {
    }

    public void placeFragmentInViewHolder(@NonNull FragmentViewHolder fragmentViewHolder) {
    }

    @Override // androidx.viewpager2.adapter.StatefulAdapter
    public final void restoreState(@NonNull Parcelable parcelable) {
    }

    @Override // androidx.viewpager2.adapter.StatefulAdapter
    @NonNull
    public final Parcelable saveState() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void setHasStableIds(boolean z) {
    }

    public boolean shouldDelayFragmentTransactions() {
    }

    public FragmentStateAdapter(@NonNull Fragment fragment) {
    }

    /* renamed from: onBindViewHolder  reason: avoid collision after fix types in other method */
    public final void onBindViewHolder2(@NonNull FragmentViewHolder fragmentViewHolder, int i2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    /* renamed from: onCreateViewHolder  reason: avoid collision after fix types in other method */
    public final FragmentViewHolder onCreateViewHolder2(@NonNull ViewGroup viewGroup, int i2) {
    }

    /* renamed from: onViewAttachedToWindow  reason: avoid collision after fix types in other method */
    public final void onViewAttachedToWindow2(@NonNull FragmentViewHolder fragmentViewHolder) {
    }

    /* renamed from: onViewRecycled  reason: avoid collision after fix types in other method */
    public final void onViewRecycled2(@NonNull FragmentViewHolder fragmentViewHolder) {
    }

    public FragmentStateAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
    }
}
