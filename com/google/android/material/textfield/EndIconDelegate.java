package com.google.android.material.textfield;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.material.internal.CheckableImageButton;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class EndIconDelegate {
    public Context context;
    public CheckableImageButton endIconView;
    public TextInputLayout textInputLayout;

    public EndIconDelegate(@NonNull TextInputLayout textInputLayout) {
    }

    public abstract void initialize();

    public boolean isBoxBackgroundModeSupported(int i2) {
    }

    public void onSuffixVisibilityChanged(boolean z) {
    }

    public boolean shouldTintIconOnError() {
    }
}
