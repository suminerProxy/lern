package h.u.a.t;

import android.app.Activity;
import android.text.TextUtils;
import com.showstartfans.activity.model.CommandBean;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CheckClipBoardUtils.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/showstartfans/activity/utils/CheckClipBoardUtils;", "", "()V", "cheching", "", "check", "", "act", "Landroid/app/Activity;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class j1 {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public static final j1 f24501a = new j1();
    private static boolean b;

    private j1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Activity activity) {
        String b2 = h.y.a.e.b(activity);
        if (TextUtils.isEmpty(b2)) {
            b = false;
            return;
        }
        h.y.a.m.i iVar = new h.y.a.m.i();
        iVar.put("command", b2);
        h.y.a.m.h.k(activity.getApplicationContext(), "/app/common/command", iVar, new h.y.a.m.g(activity) { // from class: h.u.a.t.p

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Activity f24563a;

            @Override // h.y.a.m.g
            public final void a(h.y.a.m.n nVar) {
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Activity activity, h.y.a.m.n nVar) {
        CommandBean commandBean;
        b = false;
        if (!nVar.f() || (commandBean = (CommandBean) f2.c(nVar.c(), CommandBean.class)) == null || TextUtils.isEmpty(commandBean.getType()) || TextUtils.isEmpty(commandBean.getUrl())) {
            return;
        }
        if ("1".equals(commandBean.getType()) || "2".equals(commandBean.getType())) {
            h.y.a.e.e(activity.getApplicationContext(), "");
            m3.j(activity, commandBean.getUrl(), 0.6f, false);
        }
    }

    public final void a(@Nullable Activity activity) {
        if (b || activity == null) {
            return;
        }
        b = true;
        activity.getWindow().getDecorView().post(new Runnable(activity) { // from class: h.u.a.t.o
            public final /* synthetic */ Activity b;

            @Override // java.lang.Runnable
            public final void run() {
            }
        });
    }
}
