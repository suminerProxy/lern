package androidx.loader.content;

import android.content.Context;
import android.database.ContentObserver;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class Loader<D> {
    public boolean mAbandoned;
    public boolean mContentChanged;
    public Context mContext;
    public int mId;
    public OnLoadCompleteListener<D> mListener;
    public OnLoadCanceledListener<D> mOnLoadCanceledListener;
    public boolean mProcessingChange;
    public boolean mReset;
    public boolean mStarted;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public final class ForceLoadContentObserver extends ContentObserver {
        public final /* synthetic */ Loader this$0;

        public ForceLoadContentObserver(Loader loader) {
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface OnLoadCanceledListener<D> {
        void onLoadCanceled(@NonNull Loader<D> loader);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface OnLoadCompleteListener<D> {
        void onLoadComplete(@NonNull Loader<D> loader, @Nullable D d2);
    }

    public Loader(@NonNull Context context) {
    }

    @MainThread
    public void abandon() {
    }

    @MainThread
    public boolean cancelLoad() {
    }

    public void commitContentChanged() {
    }

    @NonNull
    public String dataToString(@Nullable D d2) {
    }

    @MainThread
    public void deliverCancellation() {
    }

    @MainThread
    public void deliverResult(@Nullable D d2) {
    }

    @Deprecated
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    @MainThread
    public void forceLoad() {
    }

    @NonNull
    public Context getContext() {
    }

    public int getId() {
    }

    public boolean isAbandoned() {
    }

    public boolean isReset() {
    }

    public boolean isStarted() {
    }

    @MainThread
    public void onAbandon() {
    }

    @MainThread
    public boolean onCancelLoad() {
    }

    @MainThread
    public void onContentChanged() {
    }

    @MainThread
    public void onForceLoad() {
    }

    @MainThread
    public void onReset() {
    }

    @MainThread
    public void onStartLoading() {
    }

    @MainThread
    public void onStopLoading() {
    }

    @MainThread
    public void registerListener(int i2, @NonNull OnLoadCompleteListener<D> onLoadCompleteListener) {
    }

    @MainThread
    public void registerOnLoadCanceledListener(@NonNull OnLoadCanceledListener<D> onLoadCanceledListener) {
    }

    @MainThread
    public void reset() {
    }

    public void rollbackContentChanged() {
    }

    @MainThread
    public final void startLoading() {
    }

    @MainThread
    public void stopLoading() {
    }

    public boolean takeContentChanged() {
    }

    public String toString() {
    }

    @MainThread
    public void unregisterListener(@NonNull OnLoadCompleteListener<D> onLoadCompleteListener) {
    }

    @MainThread
    public void unregisterOnLoadCanceledListener(@NonNull OnLoadCanceledListener<D> onLoadCanceledListener) {
    }
}
