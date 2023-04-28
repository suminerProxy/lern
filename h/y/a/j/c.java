package h.y.a.j;

import androidx.annotation.IntRange;
import java.util.List;
import java.util.concurrent.Executor;
import k.b.n4.r;

/* compiled from: ITask.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public interface c {
    Runnable a();

    boolean b();

    boolean c();

    List<Class<? extends e>> d();

    boolean e();

    boolean f();

    void g(f fVar);

    Executor h();

    @IntRange(from = r.f29590e, to = 19)
    int priority();

    void run();
}
