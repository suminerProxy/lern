package com.taihebase.activity.base;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.alipay.sdk.util.l;
import com.alipay.sdk.widget.j;
import com.facebook.common.util.UriUtil;
import com.taihebase.activity.R;
import com.taihebase.activity.view.ActionView;
import com.taihebase.activity.widget.Toolbar;
import h.y.a.f.e;
import h.y.a.g.a;
import h.y.a.h.i;
import h.y.a.m.n;
import h.y.a.m.o;
import h.y.a.n.r;
import h.y.a.n.u0;
import h.y.a.n.z;
import h.y.a.o.s;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import skin.support.content.res.SkinCompatResources;

/* compiled from: BaseNewActivity.kt */
@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0005J\u0018\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0004J\u0018\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u00182\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eJ\u0016\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u0018J\u0018\u0010 \u001a\u00020\u00142\b\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010#\u001a\u00020\u0018J\u001e\u0010$\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u00182\u0006\u0010!\u001a\u00020\"2\u0006\u0010%\u001a\u00020\u0018J\u0016\u0010&\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u00182\u0006\u0010'\u001a\u00020(J\u000e\u0010)\u001a\u00020\u00142\u0006\u0010'\u001a\u00020(J\u0006\u0010*\u001a\u00020\u0014J \u0010+\u001a\u00020\u00142\b\u0010,\u001a\u0004\u0018\u00010-2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00140/H\u0004J\u001e\u0010+\u001a\u00020\u00142\u0006\u0010,\u001a\u0002002\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00140/H\u0004J(\u0010+\u001a\u00020\u00142\b\b\u0002\u00101\u001a\u00020\u00182\u0006\u0010,\u001a\u00020-2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00140/H\u0004J\u0010\u00102\u001a\u0004\u0018\u0001032\u0006\u0010\u001c\u001a\u00020\u0018J\b\u00104\u001a\u000205H\u0016J\u0010\u00106\u001a\u0004\u0018\u0001072\u0006\u0010\u001c\u001a\u00020\u0018J\b\u00108\u001a\u0004\u0018\u00010\"J\u000e\u00109\u001a\u00020\u00142\u0006\u0010:\u001a\u00020;J\u0006\u0010<\u001a\u00020\u0014J\u0006\u0010=\u001a\u00020\u0014J\u000e\u0010>\u001a\u00020\u00142\u0006\u0010?\u001a\u00020;J\b\u0010@\u001a\u00020\u0014H$J\b\u0010A\u001a\u00020\u0014H$J\b\u0010B\u001a\u00020\u0014H$J\b\u0010C\u001a\u00020\u0014H\u0016J\b\u0010D\u001a\u00020;H\u0017J\b\u0010E\u001a\u00020\u0014H\u0016J\u0012\u0010F\u001a\u00020\u00142\b\u0010G\u001a\u0004\u0018\u00010HH\u0014J\b\u0010I\u001a\u00020\u0014H\u0014J\u001a\u0010J\u001a\u00020;2\u0006\u0010K\u001a\u00020\u00182\b\u0010L\u001a\u0004\u0018\u00010MH\u0016J\b\u0010N\u001a\u00020\u0014H\u0014J\b\u0010O\u001a\u00020\u0014H\u0014J\b\u0010P\u001a\u00020\u0014H\u0014J\u001e\u0010Q\u001a\u00020\u00142\n\u0010R\u001a\u0006\u0012\u0002\b\u00030S2\n\b\u0002\u0010T\u001a\u0004\u0018\u00010HJ\u000e\u0010U\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0005J\u0006\u0010V\u001a\u00020\u0014J\u000e\u0010W\u001a\u00020\u00142\u0006\u0010'\u001a\u00020(J\u000e\u0010X\u001a\u00020\u00142\u0006\u0010.\u001a\u00020YJ\b\u0010Z\u001a\u00020\u0014H\u0002J\b\u0010[\u001a\u00020\u0018H\u0015J\b\u0010\\\u001a\u00020(H\u0014J\u000e\u0010]\u001a\u00020\u00142\u0006\u0010^\u001a\u00020_J\u0010\u0010`\u001a\u00020\u00142\b\u0010a\u001a\u0004\u0018\u00010\u001eJ\u0016\u0010b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u0018J\u000e\u0010c\u001a\u00020\u00142\u0006\u0010!\u001a\u00020\"J\u000e\u0010d\u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u0018J\u000e\u0010e\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\u0018J\u000e\u0010f\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\u0018J\u000e\u0010g\u001a\u00020\u00142\u0006\u0010.\u001a\u00020YJ\u0018\u0010h\u001a\u00020\u00142\u0006\u0010'\u001a\u00020(2\b\b\u0002\u0010i\u001a\u00020;J\u0006\u0010j\u001a\u00020\u0014J\u000e\u0010j\u001a\u00020\u00142\u0006\u0010k\u001a\u00020lJ\u0016\u0010j\u001a\u00020\u00142\u0006\u0010k\u001a\u00020l2\u0006\u0010m\u001a\u00020;J\u000e\u0010j\u001a\u00020\u00142\u0006\u0010m\u001a\u00020;J\u0006\u0010n\u001a\u00020\u0014J\u0006\u0010o\u001a\u00020\u0014J\u0006\u0010p\u001a\u00020\u0014R\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0084.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006q"}, d2 = {"Lcom/taihebase/activity/base/BaseNewActivity;", "Lcom/taihebase/activity/base/BaseNewFunctionActivity;", "()V", "dialogList", "Ljava/util/ArrayList;", "Lcom/taihebase/activity/base/BaseDialog;", "Lkotlin/collections/ArrayList;", "mainBinding", "Lcom/taihebase/activity/databinding/ActivityRootViewBinding;", "getMainBinding", "()Lcom/taihebase/activity/databinding/ActivityRootViewBinding;", "setMainBinding", "(Lcom/taihebase/activity/databinding/ActivityRootViewBinding;)V", "rootView", "Lcom/taihebase/activity/view/NewRootView;", "getRootView", "()Lcom/taihebase/activity/view/NewRootView;", "setRootView", "(Lcom/taihebase/activity/view/NewRootView;)V", "addDialog", "", "baseDialog", "addFragment", "id", "", "fragment", "Landroidx/fragment/app/Fragment;", "addIconMenu", "idIndex", "resId", "Landroid/graphics/drawable/Drawable;", "addIconMenuSvgImage", "addNoBgTextMenu", "text", "", "color", "addTextMenu", "colorId", "addViewMenu", "view", "Landroid/view/View;", "addViewToViewRoot", "dismissProgress", "errorHappen", l.c, "Lcom/taihebase/activity/network/Result;", "listener", "Lkotlin/Function0;", "Lcom/taihebase/activity/network/ResultCode;", "pageNo", "getIconMenu", "Landroid/widget/ImageView;", "getProgressView", "Lcom/taihebase/activity/view/ActionView;", "getTextMenu", "Landroid/widget/TextView;", "getTitleString", "goneToolBar", "fullScreen", "", "hideBack", "hideToolBar", "ifShowProgress", "show", "initData", "initListener", "initView", "judgeContentOffset", "needTopToolbar", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onKeyDown", "keyCode", "event", "Landroid/view/KeyEvent;", "onPause", "onRestart", "onResume", "openActivity", "pClass", "Ljava/lang/Class;", "pBundle", "removeDialog", "removeTitleView", "removeViewForViewRoot", "setBackListener", "Lcom/taihebase/activity/listener/OnToolbarBackListener;", "setContentView", "setContentViewRes", "setContentViewResByViewBind", "setHeadViewTitleAlpha", "num", "", "setLeftIcon", UriUtil.LOCAL_RESOURCE_SCHEME, "setTextMenuColor", j.f843d, "setTitleRes", "setToolBarBg", "setToolBarBgAutoTheme", "setToolbarBackListener", "setToolbarCenterView", "isMatch", "showProgress", "type", "Lcom/taihebase/activity/enummodel/LoadingType;", "canCancle", "showProgressDialog", "showToolBar", "visibleToolBar", "module_common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public abstract class BaseNewActivity extends BaseNewFunctionActivity {
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    @NotNull
    private final ArrayList<e> dialogList = new ArrayList<>();
    public a mainBinding;
    public s rootView;

    public static /* synthetic */ void errorHappen$default(BaseNewActivity baseNewActivity, int i2, n nVar, Function0 function0, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: errorHappen");
        }
        if ((i3 & 1) != 0) {
            i2 = 1;
        }
        baseNewActivity.errorHappen(i2, nVar, function0);
    }

    public static /* synthetic */ void openActivity$default(BaseNewActivity baseNewActivity, Class cls, Bundle bundle, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openActivity");
        }
        if ((i2 & 2) != 0) {
            bundle = null;
        }
        baseNewActivity.openActivity(cls, bundle);
    }

    private final void setContentView() {
        a c = a.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(c, "inflate(layoutInflater)");
        setMainBinding(c);
        setContentView(getMainBinding().b());
        int contentViewRes = setContentViewRes();
        if (contentViewRes != -1) {
            setRootView(new s(this, contentViewRes, needTopToolbar()));
        } else {
            setRootView(new s(this, setContentViewResByViewBind(), needTopToolbar()));
        }
        setStatusBarColor();
        judgeContentOffset();
    }

    public static /* synthetic */ void setToolbarCenterView$default(BaseNewActivity baseNewActivity, View view, boolean z, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setToolbarCenterView");
        }
        if ((i2 & 2) != 0) {
            z = false;
        }
        baseNewActivity.setToolbarCenterView(view, z);
    }

    @Override // com.taihebase.activity.base.BaseNewFunctionActivity
    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Override // com.taihebase.activity.base.BaseNewFunctionActivity
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

    public final void addDialog(@NotNull e baseDialog) {
        Intrinsics.checkNotNullParameter(baseDialog, "baseDialog");
        this.dialogList.add(baseDialog);
    }

    public final void addFragment(int i2, @NotNull Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        Intrinsics.checkNotNullExpressionValue(beginTransaction, "supportFragmentManager.beginTransaction()");
        beginTransaction.add(i2, fragment, null);
        beginTransaction.commit();
    }

    public final void addIconMenu(int i2, @Nullable Drawable drawable) {
        Toolbar m2 = getRootView().m();
        if (m2 == null) {
            return;
        }
        m2.g(i2, drawable);
    }

    public final void addIconMenuSvgImage(int i2, int i3) {
        Toolbar m2 = getRootView().m();
        if (m2 == null) {
            return;
        }
        m2.h(i2, i3);
    }

    public final void addNoBgTextMenu(@Nullable String str, int i2) {
        Toolbar m2 = getRootView().m();
        if (m2 == null) {
            return;
        }
        m2.k(1, str, SkinCompatResources.getColor(getCtx(), i2));
    }

    public final void addTextMenu(int i2, @NotNull String text, int i3) {
        Intrinsics.checkNotNullParameter(text, "text");
        Toolbar m2 = getRootView().m();
        if (m2 == null) {
            return;
        }
        m2.m(i2, text, i3);
    }

    public final void addViewMenu(int i2, @NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Toolbar m2 = getRootView().m();
        if (m2 == null) {
            return;
        }
        m2.n(i2, view);
    }

    public final void addViewToViewRoot(@NotNull View view) {
        FrameLayout frameLayout;
        Intrinsics.checkNotNullParameter(view, "view");
        a mainBinding = getMainBinding();
        if (mainBinding == null || (frameLayout = mainBinding.f26112d) == null) {
            return;
        }
        frameLayout.addView(view);
    }

    public final void dismissProgress() {
        getRootView().g();
        dismissProgressLoadDialog();
    }

    public final void errorHappen(@Nullable n nVar, @NotNull Function0<Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (nVar == null || nVar.a() == o.USER_NOT_LOGIN_SIGN_ERROR || nVar.a() == o.OTHER_LOGIN) {
            return;
        }
        if (nVar.a() == o.NETWORK_TROBLE) {
            getRootView().h(listener, R.layout.layout_error, Integer.valueOf(R.id.btnTry), Integer.valueOf(R.id.btnTry1));
        } else if (nVar.a() == o.RESULT_FAILED) {
            getRootView().h(listener, R.layout.layout_failed, Integer.valueOf(R.id.btnTry), Integer.valueOf(R.id.btnTry1));
        } else if (nVar.a() == o.ServiceErr) {
            View decorView = getCtx().getWindow().getDecorView();
            Intrinsics.checkNotNullExpressionValue(decorView, "ctx as Activity).window.decorView");
            getRootView().r((ViewGroup) decorView);
            View viewError = View.inflate(this, R.layout.layout_service_error, null);
            int i2 = R.id.btnTry;
            TextView textView = (TextView) viewError.findViewById(i2);
            if (textView != null) {
                textView.setText("程序哥哥正在维护秀动");
            }
            s rootView = getRootView();
            Intrinsics.checkNotNullExpressionValue(viewError, "viewError");
            rootView.i(listener, viewError, Integer.valueOf(i2), Integer.valueOf(R.id.btnTry1));
        } else if (nVar.a() == o.LOCATION_ERROR) {
            getRootView().h(listener, R.layout.layout_locaition_error, Integer.valueOf(R.id.btnTry));
        } else if (nVar.a() == o.FLOW_CONTROL) {
            View viewError2 = View.inflate(this, R.layout.layout_service_error, null);
            TextView textView2 = (TextView) viewError2.findViewById(R.id.txt_error);
            if (textView2 != null) {
                textView2.setText(nVar.b().toString());
            }
            s rootView2 = getRootView();
            Intrinsics.checkNotNullExpressionValue(viewError2, "viewError");
            rootView2.i(listener, viewError2, Integer.valueOf(R.id.btnTry), Integer.valueOf(R.id.btnTry1));
        } else if (nVar.a() == o.NO_USER) {
            getRootView().h(listener, R.layout.layout_no_user, Integer.valueOf(R.id.btnTry));
        } else if (nVar.a() == o.NO_DATA_MSG) {
            getRootView().h(listener, R.layout.layout_no_data_msg, new Integer[0]);
        } else {
            getRootView().h(listener, R.layout.layout_error, Integer.valueOf(R.id.btnTry), Integer.valueOf(R.id.btnTry1));
        }
    }

    @Nullable
    public final ImageView getIconMenu(int i2) {
        Toolbar m2 = getRootView().m();
        if (m2 == null) {
            return null;
        }
        return m2.u(i2);
    }

    @NotNull
    public final a getMainBinding() {
        a aVar = this.mainBinding;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mainBinding");
        return null;
    }

    @NotNull
    public ActionView getProgressView() {
        ActionView actionView = new ActionView(getCtx());
        actionView.a(getCtx());
        return actionView;
    }

    @NotNull
    public final s getRootView() {
        s sVar = this.rootView;
        if (sVar != null) {
            return sVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rootView");
        return null;
    }

    @Nullable
    public final TextView getTextMenu(int i2) {
        Toolbar m2 = getRootView().m();
        if (m2 == null) {
            return null;
        }
        return m2.F(i2);
    }

    @Nullable
    public final String getTitleString() {
        Toolbar m2 = getRootView().m();
        if (m2 == null) {
            return null;
        }
        return m2.getTitleString();
    }

    public final void goneToolBar(boolean z) {
        getMainBinding().c.setVisibility(8);
        int j2 = z.j(getCtx());
        s rootView = getRootView();
        if (z) {
            j2 = 0;
        }
        rootView.f(j2);
    }

    public final void hideBack() {
        Toolbar m2 = getRootView().m();
        if (m2 == null) {
            return;
        }
        m2.d0(8);
    }

    public final void hideToolBar() {
        getRootView().n();
    }

    public final void ifShowProgress(boolean z) {
        if (z) {
            showProgress();
        }
    }

    public abstract void initData();

    public abstract void initListener();

    public abstract void initView();

    public void judgeContentOffset() {
        if (isInSpecialScene()) {
            return;
        }
        getRootView().p(needTopToolbar());
    }

    @Deprecated(message = "推荐使用  goneToolBar(true)")
    public boolean needTopToolbar() {
        return true;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.dialogList.size() > 0) {
            ArrayList<e> arrayList = this.dialogList;
            arrayList.get(arrayList.size() - 1).a();
            return;
        }
        super.onBackPressed();
    }

    @Override // com.taihebase.activity.base.BaseNewFunctionActivity, com.tbruyelle.rxpermissions.BaseFixOTranslucentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView();
        r.e().a(this);
        initView();
        initListener();
        initData();
    }

    @Override // com.taihebase.activity.base.BaseNewFunctionActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        r.e().n(this);
        super.onDestroy();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, @Nullable KeyEvent keyEvent) {
        boolean z = false;
        if (keyEvent != null && keyEvent.getKeyCode() == 4) {
            z = true;
        }
        if (z && keyEvent.getAction() == 0 && this.dialogList.size() > 0) {
            ArrayList<e> arrayList = this.dialogList;
            arrayList.get(arrayList.size() - 1).a();
            return true;
        }
        return super.onKeyDown(i2, keyEvent);
    }

    @Override // com.taihebase.activity.base.BaseNewFunctionActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        dismissProgress();
    }

    @Override // android.app.Activity
    public void onRestart() {
        super.onRestart();
        Context applicationContext = getApplicationContext();
        BaseApplication baseApplication = applicationContext instanceof BaseApplication ? (BaseApplication) applicationContext : null;
        if (baseApplication == null) {
            return;
        }
        baseApplication.h(this);
    }

    @Override // com.taihebase.activity.base.BaseNewFunctionActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    public final void openActivity(@NotNull Class<?> pClass, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(pClass, "pClass");
        Intent intent = new Intent(this, pClass);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        startActivity(intent);
    }

    public final void removeDialog(@NotNull e baseDialog) {
        Intrinsics.checkNotNullParameter(baseDialog, "baseDialog");
        this.dialogList.remove(baseDialog);
    }

    public final void removeTitleView() {
        Toolbar m2 = getRootView().m();
        if (m2 == null) {
            return;
        }
        m2.W();
    }

    public final void removeViewForViewRoot(@NotNull View view) {
        FrameLayout frameLayout;
        Intrinsics.checkNotNullParameter(view, "view");
        a mainBinding = getMainBinding();
        if (mainBinding == null || (frameLayout = mainBinding.f26112d) == null) {
            return;
        }
        frameLayout.removeView(view);
    }

    public final void setBackListener(@NotNull h.y.a.k.j listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Toolbar m2 = getRootView().m();
        if (m2 == null) {
            return;
        }
        m2.setOnTopLeftListener(listener);
    }

    @Deprecated(message = "推荐使用setContentViewResByViewBind")
    public int setContentViewRes() {
        return -1;
    }

    @NotNull
    public View setContentViewResByViewBind() {
        Intrinsics.checkNotNull(null);
        throw new KotlinNothingValueException();
    }

    public final void setHeadViewTitleAlpha(float f2) {
        Toolbar m2 = getRootView().m();
        if (m2 == null) {
            return;
        }
        m2.setHeadViewTitleAlpha(f2);
    }

    public final void setLeftIcon(@Nullable Drawable drawable) {
        Toolbar m2 = getRootView().m();
        if (m2 == null) {
            return;
        }
        m2.setLeftImageRes(drawable);
    }

    public final void setMainBinding(@NotNull a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.mainBinding = aVar;
    }

    public final void setRootView(@NotNull s sVar) {
        Intrinsics.checkNotNullParameter(sVar, "<set-?>");
        this.rootView = sVar;
    }

    public final void setTextMenuColor(int i2, int i3) {
        TextView F;
        Toolbar m2 = getRootView().m();
        if (m2 == null || (F = m2.F(i2)) == null) {
            return;
        }
        F.setTextColor(i3);
    }

    public final void setTitle(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        Toolbar m2 = getRootView().m();
        if (m2 == null) {
            return;
        }
        m2.setTitle(text);
    }

    public final void setTitleRes(int i2) {
        Toolbar m2 = getRootView().m();
        if (m2 == null) {
            return;
        }
        m2.setTitle(i2);
    }

    public final void setToolBarBg(int i2) {
        Toolbar m2 = getRootView().m();
        if (m2 == null) {
            return;
        }
        m2.setToolBackgroundColor(i2);
    }

    public final void setToolBarBgAutoTheme(int i2) {
        Toolbar m2 = getRootView().m();
        if (m2 == null) {
            return;
        }
        m2.setToolBarBgAutoTheme(i2);
    }

    public final void setToolbarBackListener(@NotNull h.y.a.k.j listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Toolbar m2 = getRootView().m();
        if (m2 == null) {
            return;
        }
        m2.setOnTopLeftListener(listener);
    }

    public final void setToolbarCenterView(@NotNull View view, boolean z) {
        Intrinsics.checkNotNullParameter(view, "view");
        Toolbar m2 = getRootView().m();
        if (m2 == null) {
            return;
        }
        m2.e(view, z);
    }

    public final void showProgress() {
        showProgress(i.TypeInside, true);
    }

    public final void showProgressDialog() {
        showLoadDialog(false);
    }

    public final void showToolBar() {
        getRootView().J();
    }

    public final void visibleToolBar() {
        getMainBinding().c.setVisibility(0);
        getRootView().p(true);
    }

    public final void showProgress(boolean z) {
        showProgress(i.TypeInside, z);
    }

    public final void showProgress(@NotNull i type) {
        Intrinsics.checkNotNullParameter(type, "type");
        showProgress(type, true);
    }

    public final void showProgress(@NotNull i type, boolean z) {
        Intrinsics.checkNotNullParameter(type, "type");
        if (isFinishing()) {
            return;
        }
        if (type == i.TypeDialog) {
            showLoadDialog(z);
        } else if (type == i.TypeInside) {
            getRootView().I(getProgressView());
        }
    }

    public final void errorHappen(@NotNull o result, @NotNull Function0<Unit> listener) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (result != o.USER_NOT_LOGIN_SIGN_ERROR && result != o.OTHER_LOGIN) {
            if (result == o.NETWORK_TROBLE) {
                getRootView().h(listener, R.layout.layout_error, Integer.valueOf(R.id.btnTry), Integer.valueOf(R.id.btnTry1));
            } else if (result == o.RESULT_FAILED) {
                getRootView().h(listener, R.layout.layout_failed, Integer.valueOf(R.id.btnTry), Integer.valueOf(R.id.btnTry1));
            } else if (result == o.ServiceErr) {
                View decorView = getCtx().getWindow().getDecorView();
                Intrinsics.checkNotNullExpressionValue(decorView, "ctx as Activity).window.decorView");
                getRootView().r((ViewGroup) decorView);
                View viewError = View.inflate(this, R.layout.layout_service_error, null);
                int i2 = R.id.btnTry;
                TextView textView = (TextView) viewError.findViewById(i2);
                if (textView != null) {
                    textView.setText("程序哥哥正在维护秀动");
                }
                s rootView = getRootView();
                Intrinsics.checkNotNullExpressionValue(viewError, "viewError");
                rootView.i(listener, viewError, Integer.valueOf(i2), Integer.valueOf(R.id.btnTry1));
            } else if (result == o.LOCATION_ERROR) {
                getRootView().h(listener, R.layout.layout_locaition_error, Integer.valueOf(R.id.btnTry));
            } else if (result == o.FLOW_CONTROL) {
            } else {
                if (result == o.NO_USER) {
                    getRootView().h(listener, R.layout.layout_no_user, Integer.valueOf(R.id.btnTry));
                } else if (result == o.NO_DATA_MSG) {
                    getRootView().h(listener, R.layout.layout_no_data_msg, new Integer[0]);
                } else {
                    getRootView().h(listener, R.layout.layout_error, Integer.valueOf(R.id.btnTry), Integer.valueOf(R.id.btnTry1));
                }
            }
        } else if (u0.L().h1()) {
            u0.L().b();
        }
    }

    public final void errorHappen(int i2, @NotNull n result, @NotNull Function0<Unit> listener) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (o.ACCESS_TO_MANY == result.a()) {
            MyToast(result.b().toString());
        } else if (i2 == 1) {
            errorHappen(result, listener);
        } else {
            MyToast(result.b().toString());
        }
    }
}
