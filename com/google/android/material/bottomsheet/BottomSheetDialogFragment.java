package com.google.android.material.bottomsheet;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialogFragment;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class BottomSheetDialogFragment extends AppCompatDialogFragment {
    private boolean waitingForDismissAllowingStateLoss;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class BottomSheetDismissCallback extends BottomSheetBehavior.BottomSheetCallback {
        public final /* synthetic */ BottomSheetDialogFragment this$0;

        private BottomSheetDismissCallback(BottomSheetDialogFragment bottomSheetDialogFragment) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@NonNull View view, float f2) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@NonNull View view, int i2) {
        }

        public /* synthetic */ BottomSheetDismissCallback(BottomSheetDialogFragment bottomSheetDialogFragment, AnonymousClass1 anonymousClass1) {
        }
    }

    public static /* synthetic */ void access$100(BottomSheetDialogFragment bottomSheetDialogFragment) {
    }

    private void dismissAfterAnimation() {
    }

    private void dismissWithAnimation(@NonNull BottomSheetBehavior<?> bottomSheetBehavior, boolean z) {
    }

    private boolean tryDismissWithAnimation(boolean z) {
    }

    @Override // androidx.fragment.app.DialogFragment
    public void dismiss() {
    }

    @Override // androidx.fragment.app.DialogFragment
    public void dismissAllowingStateLoss() {
    }

    @Override // androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    @NonNull
    public Dialog onCreateDialog(@Nullable Bundle bundle) {
    }
}
