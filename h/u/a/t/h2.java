package h.u.a.t;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.showstartfans.activity.activitys.login.XDLoginNewActivity;
import com.showstartfans.activity.activitys.maintab.newmain.MainNewActivity;
import com.showstartfans.activity.model.JumpActivityBean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: JumpPostStation.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b¨\u0006\u000b"}, d2 = {"Lcom/showstartfans/activity/utils/JumpPostStation;", "", "()V", "jumpLogin", "", "ctx", "Landroid/content/Context;", "bean", "Lcom/showstartfans/activity/model/JumpActivityBean;", "jumpMain", "jumpRealActivity", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class h2 {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public static final h2 f24479a = new h2();

    private h2() {
    }

    public final void a(@NotNull Context ctx, @Nullable JumpActivityBean jumpActivityBean) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        try {
            Intent intent = new Intent(ctx, XDLoginNewActivity.class);
            intent.putExtra("isBackHome", true);
            intent.setFlags(268435456);
            if (jumpActivityBean != null) {
                try {
                    intent.putExtra("loginJumpBean", jumpActivityBean);
                } catch (Exception unused) {
                }
            }
            ctx.startActivity(intent);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void b(@NotNull Context ctx, @Nullable JumpActivityBean jumpActivityBean) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        try {
            Intent intent = new Intent(ctx, MainNewActivity.class);
            intent.setFlags(268435456);
            if (jumpActivityBean != null) {
                try {
                    Intrinsics.stringPlus("jumpRealActivity: 拆第之前", jumpActivityBean.parameter);
                    intent.putExtra("loginJumpBean", jumpActivityBean);
                } catch (Exception unused) {
                }
            }
            ctx.startActivity(intent);
        } catch (Exception unused2) {
        }
    }

    public final void c(@NotNull Context ctx, @Nullable JumpActivityBean jumpActivityBean) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        if (jumpActivityBean == null) {
            return;
        }
        String str = "jumpRealActivity: 跳转到新的a2c" + ctx + ',' + Class.forName(jumpActivityBean.jumpClass);
        if (TextUtils.isEmpty(jumpActivityBean.jumpClass)) {
            return;
        }
        try {
            Intrinsics.stringPlus("jumpRealActivity: 跳转到新的ac3", jumpActivityBean.jumpClass);
            Intent intent = new Intent(ctx, Class.forName(jumpActivityBean.jumpClass));
            Bundle bundle = jumpActivityBean.parameter;
            Intrinsics.stringPlus("jumpRealActivity: 跳转到新的ac4", bundle);
            if (bundle != null && bundle.size() > 0) {
                intent.putExtras(new Bundle(bundle));
            }
            Intrinsics.stringPlus("jumpRealActivity: 跳转到新的a5", bundle);
            ctx.startActivity(intent);
        } catch (ClassNotFoundException e2) {
            e2.printStackTrace();
        }
    }
}
