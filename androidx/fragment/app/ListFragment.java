package androidx.fragment.app;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class ListFragment extends Fragment {
    public static final int INTERNAL_EMPTY_ID = 16711681;
    public static final int INTERNAL_LIST_CONTAINER_ID = 16711683;
    public static final int INTERNAL_PROGRESS_CONTAINER_ID = 16711682;
    public ListAdapter mAdapter;
    public CharSequence mEmptyText;
    public View mEmptyView;
    private final Handler mHandler;
    public ListView mList;
    public View mListContainer;
    public boolean mListShown;
    private final AdapterView.OnItemClickListener mOnClickListener;
    public View mProgressContainer;
    private final Runnable mRequestFocus;
    public TextView mStandardEmptyView;

    /* renamed from: androidx.fragment.app.ListFragment$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements Runnable {
        public final /* synthetic */ ListFragment this$0;

        public AnonymousClass1(ListFragment listFragment) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: androidx.fragment.app.ListFragment$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass2 implements AdapterView.OnItemClickListener {
        public final /* synthetic */ ListFragment this$0;

        public AnonymousClass2(ListFragment listFragment) {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
        }
    }

    private void ensureList() {
    }

    @Nullable
    public ListAdapter getListAdapter() {
    }

    @NonNull
    public ListView getListView() {
    }

    public long getSelectedItemId() {
    }

    public int getSelectedItemPosition() {
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
    }

    public void onListItemClick(@NonNull ListView listView, @NonNull View view, int i2, long j2) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
    }

    @NonNull
    public final ListAdapter requireListAdapter() {
    }

    public void setEmptyText(@Nullable CharSequence charSequence) {
    }

    public void setListAdapter(@Nullable ListAdapter listAdapter) {
    }

    public void setListShown(boolean z) {
    }

    public void setListShownNoAnimation(boolean z) {
    }

    public void setSelection(int i2) {
    }

    private void setListShown(boolean z, boolean z2) {
    }
}
