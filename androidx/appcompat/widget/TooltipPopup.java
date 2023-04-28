package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class TooltipPopup {
    private static final String TAG = "TooltipPopup";
    private final View mContentView;
    private final Context mContext;
    private final WindowManager.LayoutParams mLayoutParams;
    private final TextView mMessageView;
    private final int[] mTmpAnchorPos;
    private final int[] mTmpAppPos;
    private final Rect mTmpDisplayFrame;

    public TooltipPopup(@NonNull Context context) {
    }

    private void computePosition(View view, int i2, int i3, boolean z, WindowManager.LayoutParams layoutParams) {
    }

    private static View getAppRootView(View view) {
    }

    public void hide() {
    }

    public boolean isShowing() {
    }

    public void show(View view, int i2, int i3, boolean z, CharSequence charSequence) {
    }
}
