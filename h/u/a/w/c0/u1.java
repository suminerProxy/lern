package h.u.a.w.c0;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.Animatable;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.facebook.drawee.controller.ControllerListener;
import com.showstartfans.activity.view.PinEntryEditText;
import com.taihebase.activity.view.LoadImageView;
import javax.annotation.Nullable;

/* compiled from: CaptchaDialog.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class u1 extends Dialog {
    private String b;
    private Window c;

    /* renamed from: d  reason: collision with root package name */
    private Context f25111d;

    /* renamed from: e  reason: collision with root package name */
    private View f25112e;

    /* renamed from: f  reason: collision with root package name */
    private LoadImageView f25113f;

    /* renamed from: g  reason: collision with root package name */
    private TextView f25114g;

    /* renamed from: h  reason: collision with root package name */
    private ImageView f25115h;

    /* renamed from: i  reason: collision with root package name */
    private PinEntryEditText f25116i;

    /* renamed from: j  reason: collision with root package name */
    private Button f25117j;

    /* renamed from: k  reason: collision with root package name */
    private Animation f25118k;

    /* renamed from: l  reason: collision with root package name */
    private b f25119l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f25120m;

    /* compiled from: CaptchaDialog.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class a implements ControllerListener {
        public final /* synthetic */ u1 b;

        public a(u1 u1Var) {
        }

        @Override // com.facebook.drawee.controller.ControllerListener
        public void onFailure(String str, Throwable th) {
        }

        @Override // com.facebook.drawee.controller.ControllerListener
        public void onFinalImageSet(String str, @Nullable Object obj, @Nullable Animatable animatable) {
        }

        @Override // com.facebook.drawee.controller.ControllerListener
        public void onIntermediateImageFailed(String str, Throwable th) {
        }

        @Override // com.facebook.drawee.controller.ControllerListener
        public void onIntermediateImageSet(String str, @Nullable Object obj) {
        }

        @Override // com.facebook.drawee.controller.ControllerListener
        public void onRelease(String str) {
        }

        @Override // com.facebook.drawee.controller.ControllerListener
        public void onSubmit(String str, Object obj) {
        }
    }

    /* compiled from: CaptchaDialog.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface b {
        void a(String str);
    }

    public u1(@NonNull Context context, int i2, String str) {
    }

    public static /* synthetic */ ImageView a(u1 u1Var) {
    }

    public static /* synthetic */ TextView b(u1 u1Var) {
    }

    public static /* synthetic */ Animation c(u1 u1Var) {
    }

    private void d() {
    }

    private void e() {
    }

    private /* synthetic */ void f(View view) {
    }

    private /* synthetic */ void h(View view) {
    }

    private /* synthetic */ void j(CharSequence charSequence) {
    }

    private void l() {
    }

    public /* synthetic */ void g(View view) {
    }

    public /* synthetic */ void i(View view) {
    }

    public /* synthetic */ void k(CharSequence charSequence) {
    }

    public void m(String str) {
    }

    public void setOnConfirmListener(b bVar) {
    }
}
