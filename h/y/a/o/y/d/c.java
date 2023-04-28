package h.y.a.o.y.d;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.StyleRes;
import androidx.appcompat.app.AppCompatDialog;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.taihebase.activity.view.bottomsheet.behavior.SpecialBottomSheetBehavior;

/* compiled from: SpecialBottomSheetDialog.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class c extends AppCompatDialog {
    private SpecialBottomSheetBehavior<FrameLayout> b;
    public boolean c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f26469d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f26470e;

    /* renamed from: f  reason: collision with root package name */
    private SpecialBottomSheetBehavior.c f26471f;

    /* compiled from: SpecialBottomSheetDialog.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class a extends AccessibilityDelegateCompat {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f26472a;

        public a(c cVar) {
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public boolean performAccessibilityAction(View view, int i2, Bundle bundle) {
        }
    }

    /* compiled from: SpecialBottomSheetDialog.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class b extends SpecialBottomSheetBehavior.c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f26473a;

        public b(c cVar) {
        }

        @Override // com.taihebase.activity.view.bottomsheet.behavior.SpecialBottomSheetBehavior.c
        public void a(@NonNull View view, float f2) {
        }

        @Override // com.taihebase.activity.view.bottomsheet.behavior.SpecialBottomSheetBehavior.c
        public void b(@NonNull View view, int i2) {
        }
    }

    public c(@NonNull Context context) {
    }

    private /* synthetic */ void b(View view) {
    }

    public static /* synthetic */ boolean d(View view, MotionEvent motionEvent) {
    }

    private static int getThemeResId(Context context, int i2) {
    }

    @NonNull
    public SpecialBottomSheetBehavior<FrameLayout> a() {
    }

    public /* synthetic */ void c(View view) {
    }

    @Override // androidx.appcompat.app.AppCompatDialog, android.app.Dialog
    public void onCreate(Bundle bundle) {
    }

    @Override // android.app.Dialog
    public void onStart() {
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z) {
    }

    @Override // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean z) {
    }

    @Override // androidx.appcompat.app.AppCompatDialog, android.app.Dialog
    public void setContentView(@LayoutRes int i2) {
    }

    public boolean shouldWindowCloseOnTouchOutside() {
    }

    public View wrapInBottomSheet(int i2, View view, ViewGroup.LayoutParams layoutParams) {
    }

    public c(@NonNull Context context, @StyleRes int i2) {
    }

    @Override // androidx.appcompat.app.AppCompatDialog, android.app.Dialog
    public void setContentView(View view) {
    }

    @Override // androidx.appcompat.app.AppCompatDialog, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
    }

    public c(@NonNull Context context, boolean z, DialogInterface.OnCancelListener onCancelListener) {
    }
}
