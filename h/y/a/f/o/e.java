package h.y.a.f.o;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.exifinterface.media.ExifInterface;
import com.alipay.sdk.util.l;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.taihebase.activity.view.ActionView;
import h.y.a.h.i;
import h.y.a.m.n;
import h.y.a.m.o;
import h.y.a.o.r;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BaseNewFragment.kt */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000e\u001a\u00020\fH\u0016J(\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u0015J(\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u0015J#\u0010\u0018\u001a\u0004\u0018\u0001H\u0019\"\n\b\u0000\u0010\u0019*\u0004\u0018\u00010\u00042\u0006\u0010\u001a\u001a\u00020\u0011H\u0014¢\u0006\u0002\u0010\u001bJ\b\u0010\u001c\u001a\u00020\u0011H$J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0011H\u0016J\b\u0010!\u001a\u00020\u0011H\u0016J\b\u0010\"\u001a\u00020\fH$J\b\u0010#\u001a\u00020\fH$J\b\u0010$\u001a\u00020\fH$J&\u0010%\u001a\u0004\u0018\u00010\u00042\u0006\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\b\u0010,\u001a\u00020\fH\u0016J\u001a\u0010-\u001a\u00020\f2\u0006\u0010.\u001a\u00020\u00042\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\u0016\u0010/\u001a\u00020\f2\f\u00100\u001a\b\u0012\u0004\u0012\u00020201H\u0004J\u0010\u00103\u001a\u00020\f2\u0006\u0010.\u001a\u00020\u0004H\u0002J\u000e\u00104\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u0011J\b\u00105\u001a\u00020\fH\u0016J\u0010\u00105\u001a\u00020\f2\u0006\u00106\u001a\u000207H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0084.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u00068"}, d2 = {"Lcom/taihebase/activity/base/fragment/BaseNewFragment;", "Lcom/taihebase/activity/base/fragment/BaseFunctionFragment;", "()V", "baseView", "Landroid/view/View;", "rootView", "Lcom/taihebase/activity/view/NewFragmentRootView;", "getRootView", "()Lcom/taihebase/activity/view/NewFragmentRootView;", "setRootView", "(Lcom/taihebase/activity/view/NewFragmentRootView;)V", "Pause", "", "Resume", "dismissProgress", "errorHappen", "pageNo", "", l.c, "Lcom/taihebase/activity/network/Result;", "listener", "Lkotlin/Function0;", "code", "Lcom/taihebase/activity/network/ResultCode;", "findViewByIdNoCast", ExifInterface.GPS_DIRECTION_TRUE, "id", "(I)Landroid/view/View;", "getContentView", "getProgressView", "Lcom/taihebase/activity/view/ActionView;", "getProgressViewBg", "color", "getStatusBarHeight", "initData", "initListener", "initView", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onRestart", "onViewCreated", "view", TtmlNode.TEXT_EMPHASIS_MARK_OPEN, "clazz", "Ljava/lang/Class;", "", "setContentViews", "showBgProgress", "showProgress", "type", "Lcom/taihebase/activity/enummodel/LoadingType;", "module_common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public abstract class e extends d {
    @NotNull
    public Map<Integer, View> _$_findViewCache;
    @Nullable
    private View baseView;
    public r rootView;

    /* compiled from: BaseNewFragment.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f26110a = null;
    }

    public static /* synthetic */ void errorHappen$default(e eVar, int i2, n nVar, Function0 function0, int i3, Object obj) {
    }

    private final void setContentViews(View view) {
    }

    public void Pause() {
    }

    public void Resume() {
    }

    @Override // h.y.a.f.o.d
    public void _$_clearFindViewByIdCache() {
    }

    @Override // h.y.a.f.o.d
    @Nullable
    public View _$_findCachedViewById(int i2) {
    }

    @Override // h.y.a.f.f
    public void dismissProgress() {
    }

    public final void errorHappen(int i2, @Nullable n nVar, @NotNull Function0<Unit> function0) {
    }

    @Nullable
    public <T extends View> T findViewByIdNoCast(int i2) {
    }

    public abstract int getContentView();

    @NotNull
    public ActionView getProgressView() {
    }

    @NotNull
    public ActionView getProgressViewBg(int i2) {
    }

    @NotNull
    public final r getRootView() {
    }

    public int getStatusBarHeight() {
    }

    public abstract void initData();

    public abstract void initListener();

    public abstract void initView();

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
    }

    @Override // h.y.a.f.o.d, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
    }

    public void onRestart() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
    }

    public final void open(@NotNull Class<Object> cls) {
    }

    public final void setRootView(@NotNull r rVar) {
    }

    public final void showBgProgress(int i2) {
    }

    @Override // h.y.a.f.f
    public void showProgress() {
    }

    public static /* synthetic */ void errorHappen$default(e eVar, int i2, o oVar, Function0 function0, int i3, Object obj) {
    }

    @Override // h.y.a.f.f
    public void showProgress(@NotNull i iVar) {
    }

    public final void errorHappen(int i2, @Nullable o oVar, @NotNull Function0<Unit> function0) {
    }
}
