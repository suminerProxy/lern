package androidx.cursoradapter.widget;

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.RestrictTo;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class SimpleCursorAdapter extends ResourceCursorAdapter {
    private CursorToStringConverter mCursorToStringConverter;
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int[] mFrom;
    public String[] mOriginalFrom;
    private int mStringConversionColumn;
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int[] mTo;
    private ViewBinder mViewBinder;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface CursorToStringConverter {
        CharSequence convertToString(Cursor cursor);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface ViewBinder {
        boolean setViewValue(View view, Cursor cursor, int i2);
    }

    @Deprecated
    public SimpleCursorAdapter(Context context, int i2, Cursor cursor, String[] strArr, int[] iArr) {
    }

    private void findColumns(Cursor cursor, String[] strArr) {
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter
    public void bindView(View view, Context context, Cursor cursor) {
    }

    public void changeCursorAndColumns(Cursor cursor, String[] strArr, int[] iArr) {
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, androidx.cursoradapter.widget.CursorFilter.CursorFilterClient
    public CharSequence convertToString(Cursor cursor) {
    }

    public CursorToStringConverter getCursorToStringConverter() {
    }

    public int getStringConversionColumn() {
    }

    public ViewBinder getViewBinder() {
    }

    public void setCursorToStringConverter(CursorToStringConverter cursorToStringConverter) {
    }

    public void setStringConversionColumn(int i2) {
    }

    public void setViewBinder(ViewBinder viewBinder) {
    }

    public void setViewImage(ImageView imageView, String str) {
    }

    public void setViewText(TextView textView, String str) {
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter
    public Cursor swapCursor(Cursor cursor) {
    }

    public SimpleCursorAdapter(Context context, int i2, Cursor cursor, String[] strArr, int[] iArr, int i3) {
    }
}
