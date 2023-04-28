package androidx.loader.content;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.os.CancellationSignal;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class CursorLoader extends AsyncTaskLoader<Cursor> {
    public CancellationSignal mCancellationSignal;
    public Cursor mCursor;
    public final Loader<Cursor>.ForceLoadContentObserver mObserver;
    public String[] mProjection;
    public String mSelection;
    public String[] mSelectionArgs;
    public String mSortOrder;
    public Uri mUri;

    public CursorLoader(@NonNull Context context) {
    }

    @Override // androidx.loader.content.AsyncTaskLoader
    public void cancelLoadInBackground() {
    }

    @Override // androidx.loader.content.Loader
    public /* bridge */ /* synthetic */ void deliverResult(Object obj) {
    }

    @Override // androidx.loader.content.AsyncTaskLoader, androidx.loader.content.Loader
    @Deprecated
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    @Nullable
    public String[] getProjection() {
    }

    @Nullable
    public String getSelection() {
    }

    @Nullable
    public String[] getSelectionArgs() {
    }

    @Nullable
    public String getSortOrder() {
    }

    @NonNull
    public Uri getUri() {
    }

    @Override // androidx.loader.content.AsyncTaskLoader
    public /* bridge */ /* synthetic */ Cursor loadInBackground() {
    }

    @Override // androidx.loader.content.AsyncTaskLoader
    public /* bridge */ /* synthetic */ void onCanceled(Cursor cursor) {
    }

    @Override // androidx.loader.content.Loader
    public void onReset() {
    }

    @Override // androidx.loader.content.Loader
    public void onStartLoading() {
    }

    @Override // androidx.loader.content.Loader
    public void onStopLoading() {
    }

    public void setProjection(@Nullable String[] strArr) {
    }

    public void setSelection(@Nullable String str) {
    }

    public void setSelectionArgs(@Nullable String[] strArr) {
    }

    public void setSortOrder(@Nullable String str) {
    }

    public void setUri(@NonNull Uri uri) {
    }

    public void deliverResult(Cursor cursor) {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.loader.content.AsyncTaskLoader
    public Cursor loadInBackground() {
    }

    /* renamed from: onCanceled  reason: avoid collision after fix types in other method */
    public void onCanceled2(Cursor cursor) {
    }

    public CursorLoader(@NonNull Context context, @NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
    }
}
