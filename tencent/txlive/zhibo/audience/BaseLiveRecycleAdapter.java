package tencent.txlive.zhibo.audience;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class BaseLiveRecycleAdapter<T> extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public Context ctx;
    public LayoutInflater mInflater;
    public List<T> mList;

    public BaseLiveRecycleAdapter(Context context) {
    }

    public void add(T t) {
    }

    public void addAll(List<T> list) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
    }

    public T getItemData(int i2) {
    }

    public List<T> getList() {
    }

    public void insert(int i2, T t) {
    }

    public void insertAtTop(T t) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
    }

    public void remove(int i2) {
    }

    public void removeAll() {
    }

    public void set(int i2, T t) {
    }

    public void setList(List<T> list) {
    }

    public void setText(TextView textView, CharSequence charSequence) {
    }

    public void removeAll(List<T> list) {
    }

    public BaseLiveRecycleAdapter(Context context, List<T> list) {
    }

    public void add(int i2, T t) {
    }

    public void addAll(int i2, List<T> list) {
    }
}
