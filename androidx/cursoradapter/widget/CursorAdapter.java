package androidx.cursoradapter.widget;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.FilterQueryProvider;
import android.widget.Filterable;
import androidx.annotation.RestrictTo;
import androidx.cursoradapter.widget.CursorFilter;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public abstract class CursorAdapter extends BaseAdapter implements Filterable, CursorFilter.CursorFilterClient {
    @Deprecated
    public static final int FLAG_AUTO_REQUERY = 1;
    public static final int FLAG_REGISTER_CONTENT_OBSERVER = 2;
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean mAutoRequery;
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public ChangeObserver mChangeObserver;
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Context mContext;
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Cursor mCursor;
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public CursorFilter mCursorFilter;
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public DataSetObserver mDataSetObserver;
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean mDataValid;
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public FilterQueryProvider mFilterQueryProvider;
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int mRowIDColumn;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class ChangeObserver extends ContentObserver {
        public final /* synthetic */ CursorAdapter this$0;

        public ChangeObserver(CursorAdapter cursorAdapter) {
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class MyDataSetObserver extends DataSetObserver {
        public final /* synthetic */ CursorAdapter this$0;

        public MyDataSetObserver(CursorAdapter cursorAdapter) {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
        }
    }

    @Deprecated
    public CursorAdapter(Context context, Cursor cursor) {
    }

    public abstract void bindView(View view, Context context, Cursor cursor);

    public void changeCursor(Cursor cursor) {
    }

    public CharSequence convertToString(Cursor cursor) {
    }

    @Override // android.widget.Adapter
    public int getCount() {
    }

    @Override // androidx.cursoradapter.widget.CursorFilter.CursorFilterClient
    public Cursor getCursor() {
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i2, View view, ViewGroup viewGroup) {
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
    }

    public FilterQueryProvider getFilterQueryProvider() {
    }

    @Override // android.widget.Adapter
    public Object getItem(int i2) {
    }

    @Override // android.widget.Adapter
    public long getItemId(int i2) {
    }

    @Override // android.widget.Adapter
    public View getView(int i2, View view, ViewGroup viewGroup) {
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
    }

    @Deprecated
    public void init(Context context, Cursor cursor, boolean z) {
    }

    public View newDropDownView(Context context, Cursor cursor, ViewGroup viewGroup) {
    }

    public abstract View newView(Context context, Cursor cursor, ViewGroup viewGroup);

    public void onContentChanged() {
    }

    public Cursor runQueryOnBackgroundThread(CharSequence charSequence) {
    }

    public void setFilterQueryProvider(FilterQueryProvider filterQueryProvider) {
    }

    public Cursor swapCursor(Cursor cursor) {
    }

    public void init(Context context, Cursor cursor, int i2) {
    }

    public CursorAdapter(Context context, Cursor cursor, boolean z) {
    }

    public CursorAdapter(Context context, Cursor cursor, int i2) {
    }
}
