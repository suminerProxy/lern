package h.u.a.w.c0;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.aliyun.identity.platform.api.IdentityResponse;
import com.facebook.drawee.view.SimpleDraweeView;
import com.showstartfans.activity.activitys.usercenter.TabCouponsSelectNewActivity;
import com.showstartfans.activity.model.CardUserInfoBean;
import com.showstartfans.activity.model.UserRealNameInfoBean;
import com.tencent.cloud.huiyansdkface.facelight.api.listeners.WbCloudFaceVerifyLoginListener;
import com.tencent.cloud.huiyansdkface.facelight.api.result.WbFaceError;
import com.tencent.cloud.huiyansdkface.facelight.api.result.WbFaceVerifyResult;
import com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: RealNameOpenDialog.kt */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 ?2\u00020\u00012\u00020\u0002:\u0002>?B=\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0006J&\u0010!\u001a\u00020\u001f2\b\u0010\"\u001a\u0004\u0018\u00010\u00062\b\u0010#\u001a\u0004\u0018\u00010\u00062\b\u0010\f\u001a\u0004\u0018\u00010$H\u0002J>\u0010%\u001a\u00020\u001f2\u0006\u0010&\u001a\u00020\u00062\b\u0010'\u001a\u0004\u0018\u00010\u00062\b\u0010(\u001a\u0004\u0018\u00010\u00062\b\u0010)\u001a\u0004\u0018\u00010\u00062\u0006\u0010*\u001a\u00020\t2\u0006\u0010+\u001a\u00020\u0006H\u0003J\u001c\u0010,\u001a\u00020\u001f2\b\u0010\"\u001a\u0004\u0018\u00010\u00062\b\u0010#\u001a\u0004\u0018\u00010\u0006H\u0002J\b\u0010-\u001a\u00020\u001fH\u0002J\u001a\u0010.\u001a\u00020\u001f2\b\u0010&\u001a\u0004\u0018\u00010\u00062\u0006\u0010*\u001a\u00020\tH\u0002J(\u0010/\u001a\u00020\u001f2\u0006\u0010&\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u0006H\u0002J.\u00100\u001a\u00020\u001f2\b\u0010\"\u001a\u0004\u0018\u00010\u00062\b\u0010#\u001a\u0004\u0018\u00010\u00062\u0006\u00101\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0006H\u0002J8\u00102\u001a\u00020\u001f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u00103\u001a\u000204H\u0002J\u0012\u00105\u001a\u00020\u001f2\b\u00106\u001a\u0004\u0018\u000107H\u0016J\u001a\u00108\u001a\u00020\u001f2\b\u0010&\u001a\u0004\u0018\u00010\u00062\u0006\u0010+\u001a\u00020\tH\u0002J\u001c\u00109\u001a\u00020\u001f2\b\u00101\u001a\u0004\u0018\u00010:2\b\u0010\f\u001a\u0004\u0018\u00010$H\u0002J\b\u0010;\u001a\u00020\u001fH\u0002J.\u0010<\u001a\u00020\u001f2\b\u0010\"\u001a\u0004\u0018\u00010\u00062\b\u0010#\u001a\u0004\u0018\u00010\u00062\u0006\u00101\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0006H\u0002J\u0012\u0010=\u001a\u00020\u001f2\b\u0010&\u001a\u0004\u0018\u00010\u0006H\u0002R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006@"}, d2 = {"Lcom/showstartfans/activity/widget/dialog/RealNameOpenDialog;", "Landroid/app/Dialog;", "Landroid/content/DialogInterface$OnDismissListener;", "ctx", "Landroid/content/Context;", "titleStr", "", "tipsStr", "realType", "", "infoBean", "Lcom/showstartfans/activity/model/UserRealNameInfoBean;", "listener", "Lcom/showstartfans/activity/widget/dialog/OnRealNameTwoPointCall;", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ILcom/showstartfans/activity/model/UserRealNameInfoBean;Lcom/showstartfans/activity/widget/dialog/OnRealNameTwoPointCall;)V", "call", "dialogCar", "Landroidx/cardview/widget/CardView;", "dialogImg", "Lcom/facebook/drawee/view/SimpleDraweeView;", "documentType", "lastCheckYundunTime", "", "parentView", "Landroid/widget/LinearLayout;", "readAgreement", "", "realTypeNum", "tencentFaceRunning", TabCouponsSelectNewActivity.f6399o, "bindTicketId", "", "tId", "certificateUseDetail", "name", "num", "Lcom/showstartfans/activity/widget/dialog/RealNameOpenDialog$CertificateUseListener;", "checkPermissionAndGotoFace", "faceTraceId", "orderNo", "openApiNonce", "apiSign", "requestType", TPDownloadProxyEnum.USER_PLATFORM, "complete", "dismissProgress", "gotoAliFaceVerify", "gotoTencentFace", "initVerifyId", "bean", "initViews", "view", "Landroid/view/View;", "onDismiss", "dialog", "Landroid/content/DialogInterface;", "queryFaceVerifyResult", "showCertificateUseDetailDialog", "Lcom/showstartfans/activity/model/CardUserInfoBean;", "showProgress", "starFace", "tencentFaceVerify", "CertificateUseListener", "Companion", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class o2 extends Dialog implements DialogInterface.OnDismissListener {
    @NotNull

    /* renamed from: m  reason: collision with root package name */
    public static final b f25047m = null;
    @NotNull

    /* renamed from: n  reason: collision with root package name */
    private static final String f25048n = "IDAKnUlF";
    @NotNull

    /* renamed from: o  reason: collision with root package name */
    private static final String f25049o = "IDAKnUlF";
    @NotNull

    /* renamed from: p  reason: collision with root package name */
    private static final String f25050p = "Ku3tCbfT0fEstuj+IT2dnd2079mb4LWJzW7Nh0Dq4zL3Pm7UlsNft55M7zmenjEUod77N+nPSjnNmYdTXqS1TRyTpcAXNCoIEAQPlqiJEi6BAYu9xLEdvgPg/rh4mIujIl2iOQp5qbE+sqOCBNDEEwa8lAsCQkLrVNDTOE4hlnk/7Jzc4UMwAXs/+3L1EznluWpRgsdg893PvrO4x2dn+5ZH25dstuLqtXcXddKRBhSaBH0mEbdrebLYpJgRBL3wFN3mtpyn9jggq8cYrMkP0aXuKMl5zs2LuVdwm4yOO+IFKjV2EylOCeJsoMH2IsMXieN994FbJoTqs8AHSotQhw==";
    @NotNull
    private static final String q = "Ku3tCbfT0fEstuj+IT2dnd2079mb4LWJzW7Nh0Dq4zL3Pm7UlsNft55M7zmenjEUod77N+nPSjnNmYdTXqS1TRyTpcAXNCoIEAQPlqiJEi6BAYu9xLEdvgPg/rh4mIujIl2iOQp5qbE+sqOCBNDEEwa8lAsCQkLrVNDTOE4hlnk/7Jzc4UMwAXs/+3L1EznluWpRgsdg893PvrO4x2dn+5ZH25dstuLqtXcXddKRBhSaBH0mEbdrebLYpJgRBL3wFN3mtpyn9jggq8cYrMkP0aXuKMl5zs2LuVdwm4yOO+IFKjV2EylOCeJsoMH2IsMXieN994FbJoTqs8AHSotQhw==";
    @NotNull
    private final Context b;
    @NotNull
    private String c;

    /* renamed from: d  reason: collision with root package name */
    private int f25051d;

    /* renamed from: e  reason: collision with root package name */
    private int f25052e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f25053f;
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    private m2 f25054g;

    /* renamed from: h  reason: collision with root package name */
    private CardView f25055h;

    /* renamed from: i  reason: collision with root package name */
    private SimpleDraweeView f25056i;

    /* renamed from: j  reason: collision with root package name */
    private LinearLayout f25057j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f25058k;

    /* renamed from: l  reason: collision with root package name */
    private long f25059l;

    /* compiled from: RealNameOpenDialog.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bb\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/showstartfans/activity/widget/dialog/RealNameOpenDialog$CertificateUseListener;", "", "onClickGoOn", "", "onNotNeedShow", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface a {
        void a();

        void b();
    }

    /* compiled from: RealNameOpenDialog.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/showstartfans/activity/widget/dialog/RealNameOpenDialog$Companion;", "", "()V", "TENCENT_APPID", "", "TENCENT_LICENSE", "TEST_TENCENT_APPID", "TEST_TENCENT_LICENSE", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: RealNameOpenDialog.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"com/showstartfans/activity/widget/dialog/RealNameOpenDialog$gotoTencentFace$1", "Lcom/tencent/cloud/huiyansdkface/facelight/api/listeners/WbCloudFaceVerifyLoginListener;", "onLoginFailed", "", "error", "Lcom/tencent/cloud/huiyansdkface/facelight/api/result/WbFaceError;", "onLoginSuccess", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class c implements WbCloudFaceVerifyLoginListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ o2 f25060a;
        public final /* synthetic */ String b;

        public c(o2 o2Var, String str) {
        }

        @Override // com.tencent.cloud.huiyansdkface.facelight.api.listeners.WbCloudFaceVerifyLoginListener
        public void onLoginFailed(@NotNull WbFaceError wbFaceError) {
        }

        @Override // com.tencent.cloud.huiyansdkface.facelight.api.listeners.WbCloudFaceVerifyLoginListener
        public void onLoginSuccess() {
        }
    }

    /* compiled from: RealNameOpenDialog.kt */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/showstartfans/activity/widget/dialog/RealNameOpenDialog$initViews$5$1", "Lcom/showstartfans/activity/widget/dialog/RealNameOpenDialog$CertificateUseListener;", "onClickGoOn", "", "onNotNeedShow", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class d implements a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ o2 f25061a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ UserRealNameInfoBean f25062d;

        public d(o2 o2Var, String str, String str2, UserRealNameInfoBean userRealNameInfoBean) {
        }

        @Override // h.u.a.w.c0.o2.a
        public void a() {
        }

        @Override // h.u.a.w.c0.o2.a
        public void b() {
        }
    }

    /* compiled from: RealNameOpenDialog.kt */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/showstartfans/activity/widget/dialog/RealNameOpenDialog$initViews$5$2", "Lcom/showstartfans/activity/widget/dialog/RealNameOpenDialog$CertificateUseListener;", "onClickGoOn", "", "onNotNeedShow", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class e implements a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ o2 f25063a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ UserRealNameInfoBean f25064d;

        public e(o2 o2Var, String str, String str2, UserRealNameInfoBean userRealNameInfoBean) {
        }

        @Override // h.u.a.w.c0.o2.a
        public void a() {
        }

        @Override // h.u.a.w.c0.o2.a
        public void b() {
        }
    }

    public o2(@NotNull Context context, @Nullable String str, @Nullable String str2, int i2, @Nullable UserRealNameInfoBean userRealNameInfoBean, @Nullable m2 m2Var) {
    }

    private static final void A(o2 o2Var, TextView textView, View view) {
    }

    private static final void B(TextView textView, o2 o2Var, View view, String str, int i2) {
    }

    public static /* synthetic */ void C(o2 o2Var, a aVar, h.y.a.m.n nVar) {
    }

    public static /* synthetic */ void D(o2 o2Var, View view) {
    }

    public static /* synthetic */ void E(TextView textView, o2 o2Var, View view, String str, int i2) {
    }

    public static /* synthetic */ void F(o2 o2Var, h.y.a.m.n nVar) {
    }

    public static /* synthetic */ void G(o2 o2Var, View view) {
    }

    public static /* synthetic */ void H(String str, String str2, o2 o2Var, int i2, String str3, String str4, String str5, boolean z) {
    }

    public static /* synthetic */ void I(DialogInterface dialogInterface, int i2) {
    }

    public static /* synthetic */ void J(a aVar, DialogInterface dialogInterface, int i2) {
    }

    public static /* synthetic */ void K(o2 o2Var, View view) {
    }

    public static /* synthetic */ void L(o2 o2Var, h.y.a.m.n nVar) {
    }

    public static /* synthetic */ void M(o2 o2Var, TextView textView, View view) {
    }

    public static /* synthetic */ void N(o2 o2Var, ImageView imageView, TextView textView, View view) {
    }

    public static /* synthetic */ void O(o2 o2Var, String str, WbFaceVerifyResult wbFaceVerifyResult) {
    }

    public static /* synthetic */ void P(o2 o2Var, h.y.a.m.n nVar) {
    }

    public static /* synthetic */ boolean Q(o2 o2Var, String str, IdentityResponse identityResponse) {
    }

    public static /* synthetic */ void R(o2 o2Var, EditText editText, EditText editText2, UserRealNameInfoBean userRealNameInfoBean, View view) {
    }

    private final void S(String str, int i2) {
    }

    private static final void T(o2 o2Var, h.y.a.m.n nVar) {
    }

    private final void U(CardUserInfoBean cardUserInfoBean, a aVar) {
    }

    private static final void V(a aVar, DialogInterface dialogInterface, int i2) {
    }

    private static final void W(DialogInterface dialogInterface, int i2) {
    }

    private final void X() {
    }

    private final void Y(String str, String str2, boolean z, String str3) {
    }

    private final void Z(String str) {
    }

    public static final /* synthetic */ void a(o2 o2Var, String str, String str2) {
    }

    private static final void a0(o2 o2Var, String str, WbFaceVerifyResult wbFaceVerifyResult) {
    }

    public static final /* synthetic */ int b(o2 o2Var) {
    }

    public static final /* synthetic */ String c(o2 o2Var) {
    }

    public static final /* synthetic */ void d(o2 o2Var, String str, int i2) {
    }

    public static final /* synthetic */ void e(o2 o2Var, boolean z) {
    }

    public static final /* synthetic */ void f(o2 o2Var, String str, String str2, boolean z, String str3) {
    }

    public static final /* synthetic */ void g(o2 o2Var, String str) {
    }

    private final void i(String str, String str2, a aVar) {
    }

    private static final void j(o2 o2Var, a aVar, h.y.a.m.n nVar) {
    }

    @SuppressLint({"CheckResult"})
    private final void k(String str, String str2, String str3, String str4, int i2, String str5) {
    }

    private static final void l(String str, String str2, o2 o2Var, int i2, String str3, String str4, String str5, boolean z) {
    }

    private static final void m(o2 o2Var, View view) {
    }

    private final void n(String str, String str2) {
    }

    private static final void o(o2 o2Var, h.y.a.m.n nVar) {
    }

    private final void p() {
    }

    private final void q(String str, int i2) {
    }

    private static final boolean r(o2 o2Var, String str, IdentityResponse identityResponse) {
    }

    private final void s(String str, String str2, String str3, String str4) {
    }

    private final void t(String str, String str2, boolean z, String str3) {
    }

    private static final void u(o2 o2Var, h.y.a.m.n nVar) {
    }

    private final void v(String str, String str2, UserRealNameInfoBean userRealNameInfoBean, m2 m2Var, View view) {
    }

    private static final void w(o2 o2Var, ImageView imageView, TextView textView, View view) {
    }

    private static final void x(o2 o2Var, View view) {
    }

    private static final void y(o2 o2Var, EditText editText, EditText editText2, UserRealNameInfoBean userRealNameInfoBean, View view) {
    }

    private static final void z(o2 o2Var, View view) {
    }

    public final void h(@Nullable String str) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(@Nullable DialogInterface dialogInterface) {
    }
}
