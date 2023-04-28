package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Message;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.annotation.ArrayRes;
import androidx.annotation.AttrRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.appcompat.app.AlertController;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class AlertDialog extends AppCompatDialog implements DialogInterface {
    public static final int LAYOUT_HINT_NONE = 0;
    public static final int LAYOUT_HINT_SIDE = 1;
    public final AlertController mAlert;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class Builder {
        private final AlertController.AlertParams P;
        private final int mTheme;

        public Builder(@NonNull Context context) {
        }

        @NonNull
        public AlertDialog create() {
        }

        @NonNull
        public Context getContext() {
        }

        public Builder setAdapter(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
        }

        public Builder setCancelable(boolean z) {
        }

        public Builder setCursor(Cursor cursor, DialogInterface.OnClickListener onClickListener, String str) {
        }

        public Builder setCustomTitle(@Nullable View view) {
        }

        public Builder setIcon(@DrawableRes int i2) {
        }

        public Builder setIconAttribute(@AttrRes int i2) {
        }

        @Deprecated
        public Builder setInverseBackgroundForced(boolean z) {
        }

        public Builder setItems(@ArrayRes int i2, DialogInterface.OnClickListener onClickListener) {
        }

        public Builder setMessage(@StringRes int i2) {
        }

        public Builder setMultiChoiceItems(@ArrayRes int i2, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        }

        public Builder setNegativeButton(@StringRes int i2, DialogInterface.OnClickListener onClickListener) {
        }

        public Builder setNegativeButtonIcon(Drawable drawable) {
        }

        public Builder setNeutralButton(@StringRes int i2, DialogInterface.OnClickListener onClickListener) {
        }

        public Builder setNeutralButtonIcon(Drawable drawable) {
        }

        public Builder setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
        }

        public Builder setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        }

        public Builder setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        }

        public Builder setOnKeyListener(DialogInterface.OnKeyListener onKeyListener) {
        }

        public Builder setPositiveButton(@StringRes int i2, DialogInterface.OnClickListener onClickListener) {
        }

        public Builder setPositiveButtonIcon(Drawable drawable) {
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public Builder setRecycleOnMeasureEnabled(boolean z) {
        }

        public Builder setSingleChoiceItems(@ArrayRes int i2, int i3, DialogInterface.OnClickListener onClickListener) {
        }

        public Builder setTitle(@StringRes int i2) {
        }

        public Builder setView(int i2) {
        }

        public AlertDialog show() {
        }

        public Builder(@NonNull Context context, @StyleRes int i2) {
        }

        public Builder setIcon(@Nullable Drawable drawable) {
        }

        public Builder setMessage(@Nullable CharSequence charSequence) {
        }

        public Builder setTitle(@Nullable CharSequence charSequence) {
        }

        public Builder setItems(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
        }

        public Builder setNegativeButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        }

        public Builder setNeutralButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        }

        public Builder setPositiveButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        }

        public Builder setView(View view) {
        }

        public Builder setMultiChoiceItems(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        }

        public Builder setSingleChoiceItems(Cursor cursor, int i2, String str, DialogInterface.OnClickListener onClickListener) {
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        @Deprecated
        public Builder setView(View view, int i2, int i3, int i4, int i5) {
        }

        public Builder setMultiChoiceItems(Cursor cursor, String str, String str2, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        }

        public Builder setSingleChoiceItems(CharSequence[] charSequenceArr, int i2, DialogInterface.OnClickListener onClickListener) {
        }

        public Builder setSingleChoiceItems(ListAdapter listAdapter, int i2, DialogInterface.OnClickListener onClickListener) {
        }
    }

    public AlertDialog(@NonNull Context context) {
    }

    public static int resolveDialogTheme(@NonNull Context context, @StyleRes int i2) {
    }

    public Button getButton(int i2) {
    }

    public ListView getListView() {
    }

    @Override // androidx.appcompat.app.AppCompatDialog, android.app.Dialog
    public void onCreate(Bundle bundle) {
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i2, KeyEvent keyEvent) {
    }

    public void setButton(int i2, CharSequence charSequence, Message message) {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setButtonPanelLayoutHint(int i2) {
    }

    public void setCustomTitle(View view) {
    }

    public void setIcon(int i2) {
    }

    public void setIconAttribute(int i2) {
    }

    public void setMessage(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.app.AppCompatDialog, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
    }

    public void setView(View view) {
    }

    public AlertDialog(@NonNull Context context, @StyleRes int i2) {
    }

    public void setButton(int i2, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
    }

    public void setIcon(Drawable drawable) {
    }

    public void setView(View view, int i2, int i3, int i4, int i5) {
    }

    public void setButton(int i2, CharSequence charSequence, Drawable drawable, DialogInterface.OnClickListener onClickListener) {
    }

    public AlertDialog(@NonNull Context context, boolean z, @Nullable DialogInterface.OnCancelListener onCancelListener) {
    }
}
