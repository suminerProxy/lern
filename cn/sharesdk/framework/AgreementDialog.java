package cn.sharesdk.framework;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import com.mob.tools.FakeActivity;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class AgreementDialog extends FakeActivity {
    private Dialog dialog;
    private OnDialogDismiss onDialogDismiss;

    /* renamed from: cn.sharesdk.framework.AgreementDialog$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AgreementDialog f61a;

        public AnonymousClass1(AgreementDialog agreementDialog) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: cn.sharesdk.framework.AgreementDialog$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass2 implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f62a;
        public final /* synthetic */ AgreementDialog b;

        public AnonymousClass2(AgreementDialog agreementDialog, Activity activity) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: cn.sharesdk.framework.AgreementDialog$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass3 implements DialogInterface.OnKeyListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AgreementDialog f63a;

        public AnonymousClass3(AgreementDialog agreementDialog) {
        }

        @Override // android.content.DialogInterface.OnKeyListener
        public boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface OnDialogDismiss {
        void consent();

        void refuse();
    }

    public static /* synthetic */ void access$000(AgreementDialog agreementDialog) {
    }

    public static /* synthetic */ Dialog access$100(AgreementDialog agreementDialog) {
    }

    public static /* synthetic */ OnDialogDismiss access$200(AgreementDialog agreementDialog) {
    }

    private void refuse() {
    }

    @Override // com.mob.tools.FakeActivity
    public void setActivity(Activity activity) {
    }

    public void setShareParam(OnDialogDismiss onDialogDismiss) {
    }
}
