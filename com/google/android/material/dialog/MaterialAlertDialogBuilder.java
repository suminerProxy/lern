package com.google.android.material.dialog;

import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import androidx.annotation.ArrayRes;
import androidx.annotation.AttrRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.appcompat.app.AlertDialog;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class MaterialAlertDialogBuilder extends AlertDialog.Builder {
    @AttrRes
    private static final int DEF_STYLE_ATTR = 0;
    @StyleRes
    private static final int DEF_STYLE_RES = 0;
    @AttrRes
    private static final int MATERIAL_ALERT_DIALOG_THEME_OVERLAY = 0;
    @Nullable
    private Drawable background;
    @NonNull
    @Dimension
    private final Rect backgroundInsets;

    public MaterialAlertDialogBuilder(@NonNull Context context) {
    }

    private static Context createMaterialAlertDialogThemedContext(@NonNull Context context) {
    }

    private static int getMaterialAlertDialogThemeOverlay(@NonNull Context context) {
    }

    private static int getOverridingThemeResId(@NonNull Context context, int i2) {
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    public AlertDialog create() {
    }

    @Nullable
    public Drawable getBackground() {
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    public /* bridge */ /* synthetic */ AlertDialog.Builder setAdapter(@Nullable ListAdapter listAdapter, @Nullable DialogInterface.OnClickListener onClickListener) {
    }

    @NonNull
    public MaterialAlertDialogBuilder setBackground(@Nullable Drawable drawable) {
    }

    @NonNull
    public MaterialAlertDialogBuilder setBackgroundInsetBottom(@Px int i2) {
    }

    @NonNull
    public MaterialAlertDialogBuilder setBackgroundInsetEnd(@Px int i2) {
    }

    @NonNull
    public MaterialAlertDialogBuilder setBackgroundInsetStart(@Px int i2) {
    }

    @NonNull
    public MaterialAlertDialogBuilder setBackgroundInsetTop(@Px int i2) {
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    public /* bridge */ /* synthetic */ AlertDialog.Builder setCancelable(boolean z) {
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    public /* bridge */ /* synthetic */ AlertDialog.Builder setCursor(@Nullable Cursor cursor, @Nullable DialogInterface.OnClickListener onClickListener, @NonNull String str) {
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    public /* bridge */ /* synthetic */ AlertDialog.Builder setCustomTitle(@Nullable View view) {
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    public /* bridge */ /* synthetic */ AlertDialog.Builder setIcon(@DrawableRes int i2) {
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    public /* bridge */ /* synthetic */ AlertDialog.Builder setIconAttribute(@AttrRes int i2) {
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    public /* bridge */ /* synthetic */ AlertDialog.Builder setItems(@ArrayRes int i2, @Nullable DialogInterface.OnClickListener onClickListener) {
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    public /* bridge */ /* synthetic */ AlertDialog.Builder setMessage(@StringRes int i2) {
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    public /* bridge */ /* synthetic */ AlertDialog.Builder setMultiChoiceItems(@ArrayRes int i2, @Nullable boolean[] zArr, @Nullable DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    public /* bridge */ /* synthetic */ AlertDialog.Builder setNegativeButton(@StringRes int i2, @Nullable DialogInterface.OnClickListener onClickListener) {
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    public /* bridge */ /* synthetic */ AlertDialog.Builder setNegativeButtonIcon(@Nullable Drawable drawable) {
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    public /* bridge */ /* synthetic */ AlertDialog.Builder setNeutralButton(@StringRes int i2, @Nullable DialogInterface.OnClickListener onClickListener) {
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    public /* bridge */ /* synthetic */ AlertDialog.Builder setNeutralButtonIcon(@Nullable Drawable drawable) {
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    public /* bridge */ /* synthetic */ AlertDialog.Builder setOnCancelListener(@Nullable DialogInterface.OnCancelListener onCancelListener) {
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    public /* bridge */ /* synthetic */ AlertDialog.Builder setOnDismissListener(@Nullable DialogInterface.OnDismissListener onDismissListener) {
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    public /* bridge */ /* synthetic */ AlertDialog.Builder setOnItemSelectedListener(@Nullable AdapterView.OnItemSelectedListener onItemSelectedListener) {
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    public /* bridge */ /* synthetic */ AlertDialog.Builder setOnKeyListener(@Nullable DialogInterface.OnKeyListener onKeyListener) {
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    public /* bridge */ /* synthetic */ AlertDialog.Builder setPositiveButton(@StringRes int i2, @Nullable DialogInterface.OnClickListener onClickListener) {
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    public /* bridge */ /* synthetic */ AlertDialog.Builder setPositiveButtonIcon(@Nullable Drawable drawable) {
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    public /* bridge */ /* synthetic */ AlertDialog.Builder setSingleChoiceItems(@ArrayRes int i2, int i3, @Nullable DialogInterface.OnClickListener onClickListener) {
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    public /* bridge */ /* synthetic */ AlertDialog.Builder setTitle(@StringRes int i2) {
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    public /* bridge */ /* synthetic */ AlertDialog.Builder setView(int i2) {
    }

    public MaterialAlertDialogBuilder(@NonNull Context context, int i2) {
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    public MaterialAlertDialogBuilder setAdapter(@Nullable ListAdapter listAdapter, @Nullable DialogInterface.OnClickListener onClickListener) {
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    public MaterialAlertDialogBuilder setCancelable(boolean z) {
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    public MaterialAlertDialogBuilder setCursor(@Nullable Cursor cursor, @Nullable DialogInterface.OnClickListener onClickListener, @NonNull String str) {
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    public MaterialAlertDialogBuilder setCustomTitle(@Nullable View view) {
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    public /* bridge */ /* synthetic */ AlertDialog.Builder setIcon(@Nullable Drawable drawable) {
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    public MaterialAlertDialogBuilder setIconAttribute(@AttrRes int i2) {
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    public /* bridge */ /* synthetic */ AlertDialog.Builder setItems(@Nullable CharSequence[] charSequenceArr, @Nullable DialogInterface.OnClickListener onClickListener) {
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    public /* bridge */ /* synthetic */ AlertDialog.Builder setMessage(@Nullable CharSequence charSequence) {
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    public /* bridge */ /* synthetic */ AlertDialog.Builder setMultiChoiceItems(@Nullable Cursor cursor, @NonNull String str, @NonNull String str2, @Nullable DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    public /* bridge */ /* synthetic */ AlertDialog.Builder setNegativeButton(@Nullable CharSequence charSequence, @Nullable DialogInterface.OnClickListener onClickListener) {
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    public MaterialAlertDialogBuilder setNegativeButtonIcon(@Nullable Drawable drawable) {
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    public /* bridge */ /* synthetic */ AlertDialog.Builder setNeutralButton(@Nullable CharSequence charSequence, @Nullable DialogInterface.OnClickListener onClickListener) {
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    public MaterialAlertDialogBuilder setNeutralButtonIcon(@Nullable Drawable drawable) {
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    public MaterialAlertDialogBuilder setOnCancelListener(@Nullable DialogInterface.OnCancelListener onCancelListener) {
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    public MaterialAlertDialogBuilder setOnDismissListener(@Nullable DialogInterface.OnDismissListener onDismissListener) {
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    public MaterialAlertDialogBuilder setOnItemSelectedListener(@Nullable AdapterView.OnItemSelectedListener onItemSelectedListener) {
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    public MaterialAlertDialogBuilder setOnKeyListener(@Nullable DialogInterface.OnKeyListener onKeyListener) {
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    public /* bridge */ /* synthetic */ AlertDialog.Builder setPositiveButton(@Nullable CharSequence charSequence, @Nullable DialogInterface.OnClickListener onClickListener) {
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    public MaterialAlertDialogBuilder setPositiveButtonIcon(@Nullable Drawable drawable) {
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    public /* bridge */ /* synthetic */ AlertDialog.Builder setSingleChoiceItems(@Nullable Cursor cursor, int i2, @NonNull String str, @Nullable DialogInterface.OnClickListener onClickListener) {
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    public /* bridge */ /* synthetic */ AlertDialog.Builder setTitle(@Nullable CharSequence charSequence) {
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    public /* bridge */ /* synthetic */ AlertDialog.Builder setView(@Nullable View view) {
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    public MaterialAlertDialogBuilder setIcon(@DrawableRes int i2) {
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    public MaterialAlertDialogBuilder setItems(@ArrayRes int i2, @Nullable DialogInterface.OnClickListener onClickListener) {
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    public MaterialAlertDialogBuilder setMessage(@StringRes int i2) {
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    public /* bridge */ /* synthetic */ AlertDialog.Builder setMultiChoiceItems(@Nullable CharSequence[] charSequenceArr, @Nullable boolean[] zArr, @Nullable DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    public MaterialAlertDialogBuilder setNegativeButton(@StringRes int i2, @Nullable DialogInterface.OnClickListener onClickListener) {
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    public MaterialAlertDialogBuilder setNeutralButton(@StringRes int i2, @Nullable DialogInterface.OnClickListener onClickListener) {
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    public MaterialAlertDialogBuilder setPositiveButton(@StringRes int i2, @Nullable DialogInterface.OnClickListener onClickListener) {
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    public /* bridge */ /* synthetic */ AlertDialog.Builder setSingleChoiceItems(@Nullable ListAdapter listAdapter, int i2, @Nullable DialogInterface.OnClickListener onClickListener) {
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    public MaterialAlertDialogBuilder setTitle(@StringRes int i2) {
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    public MaterialAlertDialogBuilder setView(int i2) {
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    public MaterialAlertDialogBuilder setIcon(@Nullable Drawable drawable) {
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    public MaterialAlertDialogBuilder setItems(@Nullable CharSequence[] charSequenceArr, @Nullable DialogInterface.OnClickListener onClickListener) {
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    public MaterialAlertDialogBuilder setMessage(@Nullable CharSequence charSequence) {
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    public MaterialAlertDialogBuilder setMultiChoiceItems(@ArrayRes int i2, @Nullable boolean[] zArr, @Nullable DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    public MaterialAlertDialogBuilder setNegativeButton(@Nullable CharSequence charSequence, @Nullable DialogInterface.OnClickListener onClickListener) {
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    public MaterialAlertDialogBuilder setNeutralButton(@Nullable CharSequence charSequence, @Nullable DialogInterface.OnClickListener onClickListener) {
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    public MaterialAlertDialogBuilder setPositiveButton(@Nullable CharSequence charSequence, @Nullable DialogInterface.OnClickListener onClickListener) {
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    public /* bridge */ /* synthetic */ AlertDialog.Builder setSingleChoiceItems(@Nullable CharSequence[] charSequenceArr, int i2, @Nullable DialogInterface.OnClickListener onClickListener) {
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    public MaterialAlertDialogBuilder setTitle(@Nullable CharSequence charSequence) {
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    public MaterialAlertDialogBuilder setView(@Nullable View view) {
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    public MaterialAlertDialogBuilder setMultiChoiceItems(@Nullable CharSequence[] charSequenceArr, @Nullable boolean[] zArr, @Nullable DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    public MaterialAlertDialogBuilder setSingleChoiceItems(@ArrayRes int i2, int i3, @Nullable DialogInterface.OnClickListener onClickListener) {
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    public MaterialAlertDialogBuilder setMultiChoiceItems(@Nullable Cursor cursor, @NonNull String str, @NonNull String str2, @Nullable DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    public MaterialAlertDialogBuilder setSingleChoiceItems(@Nullable Cursor cursor, int i2, @NonNull String str, @Nullable DialogInterface.OnClickListener onClickListener) {
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    public MaterialAlertDialogBuilder setSingleChoiceItems(@Nullable CharSequence[] charSequenceArr, int i2, @Nullable DialogInterface.OnClickListener onClickListener) {
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    public MaterialAlertDialogBuilder setSingleChoiceItems(@Nullable ListAdapter listAdapter, int i2, @Nullable DialogInterface.OnClickListener onClickListener) {
    }
}
