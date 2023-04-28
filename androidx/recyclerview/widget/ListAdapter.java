package androidx.recyclerview.widget;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.AsyncListDiffer;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public abstract class ListAdapter<T, VH extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<VH> {
    public final AsyncListDiffer<T> mDiffer;
    private final AsyncListDiffer.ListListener<T> mListener;

    /* renamed from: androidx.recyclerview.widget.ListAdapter$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements AsyncListDiffer.ListListener<T> {
        public final /* synthetic */ ListAdapter this$0;

        public AnonymousClass1(ListAdapter listAdapter) {
        }

        @Override // androidx.recyclerview.widget.AsyncListDiffer.ListListener
        public void onCurrentListChanged(@NonNull List<T> list, @NonNull List<T> list2) {
        }
    }

    public ListAdapter(@NonNull DiffUtil.ItemCallback<T> itemCallback) {
    }

    @NonNull
    public List<T> getCurrentList() {
    }

    public T getItem(int i2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
    }

    public void onCurrentListChanged(@NonNull List<T> list, @NonNull List<T> list2) {
    }

    public void submitList(@Nullable List<T> list) {
    }

    public void submitList(@Nullable List<T> list, @Nullable Runnable runnable) {
    }

    public ListAdapter(@NonNull AsyncDifferConfig<T> asyncDifferConfig) {
    }
}
