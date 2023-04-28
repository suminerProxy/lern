package com.taihebase.activity.base;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.app.SkinAppCompatDelegateImpl;
import com.taihebase.activity.R;
import com.tbruyelle.rxpermissions.BaseFixOTranslucentActivity;
import h.y.a.n.c1;
import h.y.a.n.h0;
import h.y.a.n.l0;
import h.y.a.n.x0;
import h.y.a.p.w.i;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import skin.support.content.res.SkinCompatResources;

/* compiled from: BaseNewFunctionActivity.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0014J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0014J\b\u0010\u0018\u001a\u00020\u0013H\u0016J\u0012\u0010\u0019\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\tH\u0016J\b\u0010\u001f\u001a\u00020\tH\u0016J\b\u0010 \u001a\u00020\tH\u0016J\u0012\u0010!\u001a\u00020\u00132\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0014J\b\u0010\"\u001a\u00020\u0013H\u0014J\b\u0010#\u001a\u00020\u0013H\u0014J\b\u0010$\u001a\u00020\u0013H\u0014J\b\u0010%\u001a\u00020\u0013H\u0014J\b\u0010&\u001a\u00020\u0013H\u0016J\u0012\u0010'\u001a\u00020\t2\b\b\u0002\u0010(\u001a\u00020\tH\u0016J\b\u0010)\u001a\u00020\tH\u0014J\u0010\u0010*\u001a\u00020\u00132\u0006\u0010+\u001a\u00020\tH\u0016R\u001b\u0010\u0003\u001a\u00020\u00008DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0004\u0010\u0005R\u001a\u0010\b\u001a\u00020\tX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0004@\u0004X\u0085\u000e¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lcom/taihebase/activity/base/BaseNewFunctionActivity;", "Lcom/tbruyelle/rxpermissions/BaseFixOTranslucentActivity;", "()V", "ctx", "getCtx", "()Lcom/taihebase/activity/base/BaseNewFunctionActivity;", "ctx$delegate", "Lkotlin/Lazy;", "fromWebOpen", "", "getFromWebOpen", "()Z", "setFromWebOpen", "(Z)V", "loadDialog", "Lcom/taihebase/activity/widget/dialog/ProgressDialog;", "savedInstanceState", "Landroid/os/Bundle;", "MyToast", "", "resId", "", "text", "", "dismissProgressLoadDialog", "dispatchTouchEvent", "ev", "Landroid/view/MotionEvent;", "getDelegate", "Landroidx/appcompat/app/AppCompatDelegate;", "isInSpecialScene", "needActioinStatusBarColor", "needDealKeyBoard", "onCreate", "onDestroy", "onPause", "onResume", "onStop", "setStatusBarColor", "setStatusBarMode", "needWhite", "setStatusBarTextWhite", "showLoadDialog", "canCancle", "module_common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public abstract class BaseNewFunctionActivity extends BaseFixOTranslucentActivity {
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    @NotNull
    private final Lazy ctx$delegate = LazyKt__LazyJVMKt.lazy(new a(this));
    private boolean fromWebOpen;
    @Nullable
    private i loadDialog;
    @JvmField
    @Nullable
    public Bundle savedInstanceState;

    /* compiled from: BaseNewFunctionActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/taihebase/activity/base/BaseNewFunctionActivity;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a extends Lambda implements Function0<BaseNewFunctionActivity> {
        public final /* synthetic */ BaseNewFunctionActivity this$0;

        public a(BaseNewFunctionActivity baseNewFunctionActivity) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final BaseNewFunctionActivity invoke() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ BaseNewFunctionActivity invoke() {
        }
    }

    public static /* synthetic */ boolean setStatusBarMode$default(BaseNewFunctionActivity baseNewFunctionActivity, boolean z, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                z = c1.c();
            }
            return baseNewFunctionActivity.setStatusBarMode(z);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setStatusBarMode");
    }

    public void MyToast(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Toast.makeText(getCtx(), str, 0).show();
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Nullable
    public View _$_findCachedViewById(int i2) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i2));
        if (view == null) {
            View findViewById = findViewById(i2);
            if (findViewById == null) {
                return null;
            }
            map.put(Integer.valueOf(i2), findViewById);
            return findViewById;
        }
        return view;
    }

    public void dismissProgressLoadDialog() {
        i iVar;
        try {
            if (isFinishing() || (iVar = this.loadDialog) == null || !iVar.isShowing()) {
                return;
            }
            iVar.dismiss();
            this.loadDialog = null;
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(@Nullable MotionEvent motionEvent) {
        try {
            if (needDealKeyBoard() && getCurrentFocus() != null) {
                h0 h0Var = h0.f26311a;
                View currentFocus = getCurrentFocus();
                Intrinsics.checkNotNull(motionEvent);
                if (h0Var.c(currentFocus, motionEvent)) {
                    Object systemService = getSystemService("input_method");
                    if (systemService != null) {
                        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
                        if (getCurrentFocus() != null) {
                            View currentFocus2 = getCurrentFocus();
                            Intrinsics.checkNotNull(currentFocus2);
                            inputMethodManager.hideSoftInputFromWindow(currentFocus2.getWindowToken(), 0);
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                    }
                }
            }
            return super.dispatchTouchEvent(motionEvent);
        } catch (Exception unused) {
            return false;
        }
    }

    @NotNull
    public final BaseNewFunctionActivity getCtx() {
        return (BaseNewFunctionActivity) this.ctx$delegate.getValue();
    }

    @Override // androidx.appcompat.app.AppCompatActivity
    @NotNull
    public AppCompatDelegate getDelegate() {
        AppCompatDelegate appCompatDelegate = SkinAppCompatDelegateImpl.get(this, this);
        Intrinsics.checkNotNullExpressionValue(appCompatDelegate, "get(this, this)");
        return appCompatDelegate;
    }

    public final boolean getFromWebOpen() {
        return this.fromWebOpen;
    }

    public boolean isInSpecialScene() {
        return false;
    }

    public boolean needActioinStatusBarColor() {
        return true;
    }

    public boolean needDealKeyBoard() {
        return false;
    }

    @Override // com.tbruyelle.rxpermissions.BaseFixOTranslucentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        this.savedInstanceState = bundle;
        super.onCreate(bundle);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.loadDialog = null;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        i iVar = this.loadDialog;
        if (iVar != null && iVar.isShowing()) {
            iVar.dismiss();
            this.loadDialog = null;
        }
    }

    public final void setFromWebOpen(boolean z) {
        this.fromWebOpen = z;
    }

    public void setStatusBarColor() {
        if (setStatusBarTextWhite()) {
            l0.K(this, false);
        } else if (needActioinStatusBarColor()) {
            setStatusBarMode$default(this, false, 1, null);
        }
        if (isInSpecialScene()) {
            x0.k(this, SkinCompatResources.getColor(getCtx(), R.color.color_white), 0);
        } else {
            x0.G(this);
        }
    }

    public boolean setStatusBarMode(boolean z) {
        if (z) {
            x0.s(getCtx());
            return false;
        }
        return x0.q(getCtx());
    }

    public boolean setStatusBarTextWhite() {
        return false;
    }

    public void showLoadDialog(boolean z) {
        try {
            if (isFinishing()) {
                return;
            }
            if (this.loadDialog == null) {
                this.loadDialog = new i(getCtx());
            }
            i iVar = this.loadDialog;
            if (iVar == null) {
                return;
            }
            iVar.setCanceledOnTouchOutside(z);
            iVar.setCancelable(z);
            if (iVar.isShowing()) {
                return;
            }
            iVar.show();
        } catch (Exception unused) {
        }
    }

    public void MyToast(int i2) {
        Toast.makeText(getCtx(), i2, 0).show();
    }
}
