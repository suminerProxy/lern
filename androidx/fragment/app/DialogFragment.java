package androidx.fragment.app;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class DialogFragment extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    private static final String SAVED_BACK_STACK_ID = "android:backStackId";
    private static final String SAVED_CANCELABLE = "android:cancelable";
    private static final String SAVED_DIALOG_STATE_TAG = "android:savedDialogState";
    private static final String SAVED_SHOWS_DIALOG = "android:showsDialog";
    private static final String SAVED_STYLE = "android:style";
    private static final String SAVED_THEME = "android:theme";
    public static final int STYLE_NORMAL = 0;
    public static final int STYLE_NO_FRAME = 2;
    public static final int STYLE_NO_INPUT = 3;
    public static final int STYLE_NO_TITLE = 1;
    public int mBackStackId;
    public boolean mCancelable;
    @Nullable
    public Dialog mDialog;
    private Runnable mDismissRunnable;
    public boolean mDismissed;
    private Handler mHandler;
    public boolean mShownByMe;
    public boolean mShowsDialog;
    public int mStyle;
    public int mTheme;
    public boolean mViewDestroyed;

    /* renamed from: androidx.fragment.app.DialogFragment$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements Runnable {
        public final /* synthetic */ DialogFragment this$0;

        public AnonymousClass1(DialogFragment dialogFragment) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public void dismiss() {
    }

    public void dismissAllowingStateLoss() {
    }

    public void dismissInternal(boolean z, boolean z2) {
    }

    @Nullable
    public Dialog getDialog() {
    }

    public boolean getShowsDialog() {
    }

    @StyleRes
    public int getTheme() {
    }

    public boolean isCancelable() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(@Nullable Bundle bundle) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NonNull Context context) {
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(@NonNull DialogInterface dialogInterface) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
    }

    @NonNull
    public Dialog onCreateDialog(@Nullable Bundle bundle) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NonNull DialogInterface dialogInterface) {
    }

    @Override // androidx.fragment.app.Fragment
    @NonNull
    public LayoutInflater onGetLayoutInflater(@Nullable Bundle bundle) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
    }

    @NonNull
    public final Dialog requireDialog() {
    }

    public void setCancelable(boolean z) {
    }

    public void setShowsDialog(boolean z) {
    }

    public void setStyle(int i2, @StyleRes int i3) {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setupDialog(@NonNull Dialog dialog, int i2) {
    }

    public void show(@NonNull FragmentManager fragmentManager, @Nullable String str) {
    }

    public void showNow(@NonNull FragmentManager fragmentManager, @Nullable String str) {
    }

    public int show(@NonNull FragmentTransaction fragmentTransaction, @Nullable String str) {
    }
}
