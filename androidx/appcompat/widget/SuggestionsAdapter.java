package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.res.ColorStateList;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cursoradapter.widget.ResourceCursorAdapter;
import java.io.FileNotFoundException;
import java.util.WeakHashMap;

@SuppressLint({"RestrictedAPI"})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class SuggestionsAdapter extends ResourceCursorAdapter implements View.OnClickListener {
    private static final boolean DBG = false;
    public static final int INVALID_INDEX = -1;
    private static final String LOG_TAG = "SuggestionsAdapter";
    private static final int QUERY_LIMIT = 50;
    public static final int REFINE_ALL = 2;
    public static final int REFINE_BY_ENTRY = 1;
    public static final int REFINE_NONE = 0;
    private boolean mClosed;
    private final int mCommitIconResId;
    private int mFlagsCol;
    private int mIconName1Col;
    private int mIconName2Col;
    private final WeakHashMap<String, Drawable.ConstantState> mOutsideDrawablesCache;
    private final Context mProviderContext;
    private int mQueryRefinement;
    private final SearchView mSearchView;
    private final SearchableInfo mSearchable;
    private int mText1Col;
    private int mText2Col;
    private int mText2UrlCol;
    private ColorStateList mUrlColor;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class ChildViewCache {
        public final ImageView mIcon1;
        public final ImageView mIcon2;
        public final ImageView mIconRefine;
        public final TextView mText1;
        public final TextView mText2;

        public ChildViewCache(View view) {
        }
    }

    public SuggestionsAdapter(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
    }

    private Drawable checkIconCache(String str) {
    }

    private CharSequence formatUrl(CharSequence charSequence) {
    }

    private Drawable getActivityIcon(ComponentName componentName) {
    }

    private Drawable getActivityIconWithCache(ComponentName componentName) {
    }

    public static String getColumnString(Cursor cursor, String str) {
    }

    private Drawable getDefaultIcon1() {
    }

    private Drawable getDrawable(Uri uri) {
    }

    private Drawable getDrawableFromResourceValue(String str) {
    }

    private Drawable getIcon1(Cursor cursor) {
    }

    private Drawable getIcon2(Cursor cursor) {
    }

    private static String getStringOrNull(Cursor cursor, int i2) {
    }

    private void setViewDrawable(ImageView imageView, Drawable drawable, int i2) {
    }

    private void setViewText(TextView textView, CharSequence charSequence) {
    }

    private void storeInIconCache(String str, Drawable drawable) {
    }

    private void updateSpinnerState(Cursor cursor) {
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter
    public void bindView(View view, Context context, Cursor cursor) {
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, androidx.cursoradapter.widget.CursorFilter.CursorFilterClient
    public void changeCursor(Cursor cursor) {
    }

    public void close() {
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, androidx.cursoradapter.widget.CursorFilter.CursorFilterClient
    public CharSequence convertToString(Cursor cursor) {
    }

    public Drawable getDrawableFromResourceUri(Uri uri) throws FileNotFoundException {
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i2, View view, ViewGroup viewGroup) {
    }

    public int getQueryRefinement() {
    }

    public Cursor getSearchManagerSuggestions(SearchableInfo searchableInfo, String str, int i2) {
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, android.widget.Adapter
    public View getView(int i2, View view, ViewGroup viewGroup) {
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
    }

    @Override // androidx.cursoradapter.widget.ResourceCursorAdapter, androidx.cursoradapter.widget.CursorAdapter
    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, androidx.cursoradapter.widget.CursorFilter.CursorFilterClient
    public Cursor runQueryOnBackgroundThread(CharSequence charSequence) {
    }

    public void setQueryRefinement(int i2) {
    }
}
