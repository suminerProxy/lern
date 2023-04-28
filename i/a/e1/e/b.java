package i.a.e1.e;

import i.a.e1.h.k.k;

/* compiled from: Exceptions.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class b {
    private b() {
        throw new IllegalStateException("No instances!");
    }

    @i.a.e1.b.f
    public static RuntimeException a(@i.a.e1.b.f Throwable t) {
        throw k.i(t);
    }

    public static void b(@i.a.e1.b.f Throwable t) {
        if (!(t instanceof VirtualMachineError)) {
            if (!(t instanceof ThreadDeath)) {
                if (t instanceof LinkageError) {
                    throw ((LinkageError) t);
                }
                return;
            }
            throw ((ThreadDeath) t);
        }
        throw ((VirtualMachineError) t);
    }
}
