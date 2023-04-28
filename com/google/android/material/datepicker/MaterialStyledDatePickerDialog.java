package com.google.android.material.datepicker;

import android.app.DatePickerDialog;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP, RestrictTo.Scope.TESTS})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class MaterialStyledDatePickerDialog extends DatePickerDialog {
    @AttrRes
    private static final int DEF_STYLE_ATTR = 16843612;
    @StyleRes
    private static final int DEF_STYLE_RES = 0;
    @NonNull
    private final Drawable background;
    @NonNull
    private final Rect backgroundInsets;

    public MaterialStyledDatePickerDialog(@NonNull Context context) {
    }

    @Override // android.app.AlertDialog, android.app.Dialog
    public void onCreate(Bundle bundle) {
    }

    public MaterialStyledDatePickerDialog(@NonNull Context context, int i2) {
    }

    public MaterialStyledDatePickerDialog(@NonNull Context context, @Nullable DatePickerDialog.OnDateSetListener onDateSetListener, int i2, int i3, int i4) {
    }

    public MaterialStyledDatePickerDialog(@NonNull Context context, int i2, @Nullable DatePickerDialog.OnDateSetListener onDateSetListener, int i3, int i4, int i5) {
    }
}
