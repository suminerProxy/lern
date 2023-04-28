package h.u.a.w.d0;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.showstartfans.activity.model.FansUserInfoBean;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.taihebase.activity.view.LoadImageView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ConfirmGiftDialog.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B5\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ@\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002J\u0012\u0010\u001a\u001a\u00020\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u001c\u0010\u001d\u001a\u00020\u00162\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\bH\u0002R\u000e\u0010\r\u001a\u00020\u000eX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0012X\u0082.¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/showstartfans/activity/widget/popupwindow/ConfirmGiftDialog;", "Landroid/app/Dialog;", "Landroid/content/DialogInterface$OnDismissListener;", "context", "Landroid/content/Context;", "userInfo", "Lcom/showstartfans/activity/model/FansUserInfoBean;", "areaCode", "", "giftPhone", "call", "Lcom/showstartfans/activity/widget/popupwindow/OnSureGiftCall;", "(Landroid/content/Context;Lcom/showstartfans/activity/model/FansUserInfoBean;Ljava/lang/String;Ljava/lang/String;Lcom/showstartfans/activity/widget/popupwindow/OnSureGiftCall;)V", "logo", "Lcom/taihebase/activity/view/LoadImageView;", "logoType", "Landroid/widget/ImageView;", "unUserMsg", "Landroid/widget/TextView;", Oauth2AccessToken.KEY_SCREEN_NAME, "userNum", "initViews", "", "ctx", "view", "Landroid/view/View;", "onDismiss", "dialog", "Landroid/content/DialogInterface;", "setUserPhone", "phoneNum", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class r1 extends Dialog implements DialogInterface.OnDismissListener {
    private LoadImageView b;
    private ImageView c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f25235d;

    /* renamed from: e  reason: collision with root package name */
    private TextView f25236e;

    /* renamed from: f  reason: collision with root package name */
    private TextView f25237f;

    public r1(@NotNull Context context, @Nullable FansUserInfoBean fansUserInfoBean, @Nullable String str, @Nullable String str2, @Nullable o2 o2Var) {
    }

    private final void a(Context context, View view, FansUserInfoBean fansUserInfoBean, String str, String str2, o2 o2Var) {
    }

    private static final void b(o2 o2Var, r1 r1Var, View view) {
    }

    private static final void c(r1 r1Var, View view) {
    }

    public static /* synthetic */ void d(o2 o2Var, r1 r1Var, View view) {
    }

    public static /* synthetic */ void e(r1 r1Var, View view) {
    }

    private final void f(String str, String str2) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(@Nullable DialogInterface dialogInterface) {
    }
}
