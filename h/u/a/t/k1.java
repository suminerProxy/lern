package h.u.a.t;

import android.content.Context;
import android.view.View;
import com.mobile.auth.gatewayauth.PhoneNumberAuthHelper;
import com.mobile.auth.gatewayauth.TokenResultListener;
import com.mobile.auth.gatewayauth.ui.AbstractPnsViewDelegate;
import com.tencent.android.tpush.common.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CheckLogin.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0011\u001a\u00020\tH\u0002J\b\u0010\u0012\u001a\u00020\tH\u0002J\u0010\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J)\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00152\u0012\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00190\u0018\"\u00020\u0019H\u0002¢\u0006\u0002\u0010\u001aJ-\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00152\u0016\u0010\u0017\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00190\u0018\"\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0002\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u0015H\u0002J1\u0010\u001f\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u00192\u0012\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00190\u0018\"\u00020\u0019H\u0002¢\u0006\u0002\u0010!J)\u0010\"\u001a\u00020#2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0012\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00190\u0018\"\u00020\u0019¢\u0006\u0002\u0010$R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R(\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0018\u00010\bj\u0004\u0018\u0001`\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/showstartfans/activity/utils/CheckLogin;", "", "()V", "authHelper", "Lcom/mobile/auth/gatewayauth/PhoneNumberAuthHelper;", "listener", "Lcom/mobile/auth/gatewayauth/TokenResultListener;", "onCancleLoginListener", "Lkotlin/Function0;", "", "Lcom/showstartfans/activity/utils/OnCancleLogoinListener;", "getOnCancleLoginListener", "()Lkotlin/jvm/functions/Function0;", "setOnCancleLoginListener", "(Lkotlin/jvm/functions/Function0;)V", "progressDialog", "Lcom/taihebase/activity/widget/dialog/ProgressDialog;", "closeAll", "dismissProgress", "getAuthHelper", "ctx", "Landroid/content/Context;", "initResultListener", "otherParams", "", "", "(Landroid/content/Context;[Ljava/lang/String;)V", "jumpLogin", "setUiConfig", "showProgress", "context", "tokenLogin", Constants.FLAG_TOKEN, "(Landroid/content/Context;Ljava/lang/String;[Ljava/lang/String;)V", "userIsLogin", "", "(Landroid/content/Context;[Ljava/lang/String;)Z", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class k1 {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public static final k1 f24512a = null;
    @Nullable
    private static Function0<Unit> b;
    @Nullable
    private static h.y.a.p.w.i c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    private static TokenResultListener f24513d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    private static PhoneNumberAuthHelper f24514e;

    /* compiled from: CheckLogin.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/showstartfans/activity/utils/CheckLogin$getAuthHelper$1", "Lcom/mobile/auth/gatewayauth/ui/AbstractPnsViewDelegate;", "onViewCreated", "", "view", "Landroid/view/View;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a extends AbstractPnsViewDelegate {
        public static /* synthetic */ void a(View view) {
        }

        public static /* synthetic */ void b(View view) {
        }

        private static final void c(View view) {
        }

        private static final void d(View view) {
        }

        @Override // com.mobile.auth.gatewayauth.ui.AbstractPnsViewDelegate
        public void onViewCreated(@Nullable View view) {
        }
    }

    /* compiled from: CheckLogin.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/showstartfans/activity/utils/CheckLogin$initResultListener$1", "Lcom/mobile/auth/gatewayauth/TokenResultListener;", "onTokenFailed", "", "ret", "", "onTokenSuccess", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b implements TokenResultListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f24515a;
        public final /* synthetic */ String[] b;

        public b(Context context, String[] strArr) {
        }

        @Override // com.mobile.auth.gatewayauth.TokenResultListener
        public void onTokenFailed(@Nullable String str) {
        }

        @Override // com.mobile.auth.gatewayauth.TokenResultListener
        public void onTokenSuccess(@Nullable String str) {
        }
    }

    private k1() {
    }

    public static final /* synthetic */ void a(k1 k1Var) {
    }

    public static final /* synthetic */ h.y.a.p.w.i b() {
    }

    public static final /* synthetic */ void c(k1 k1Var, Context context, String... strArr) {
    }

    public static final /* synthetic */ void d(k1 k1Var, Context context, String str, String... strArr) {
    }

    private final void e() {
    }

    private final void f() {
    }

    private final void g(Context context) {
    }

    private final void i(Context context, String... strArr) {
    }

    private final void j(Context context, String... strArr) {
    }

    public static /* synthetic */ void k(Context context, String[] strArr, h.y.a.m.n nVar) {
    }

    private final void m(Context context) {
    }

    private final void n(Context context) {
    }

    private final void o(Context context, String str, String... strArr) {
    }

    private static final void p(Context context, String[] strArr, h.y.a.m.n nVar) {
    }

    @Nullable
    public final Function0<Unit> h() {
    }

    public final void l(@Nullable Function0<Unit> function0) {
    }

    public final boolean q(@Nullable Context context, @NotNull String... strArr) {
    }
}
