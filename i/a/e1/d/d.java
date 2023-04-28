package i.a.e1.d;

import i.a.e1.h.k.s;
import java.util.ArrayList;
import java.util.Objects;

/* compiled from: CompositeDisposable.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class d implements f, g {
    public s<f> b;
    public volatile boolean c;

    public d() {
    }

    @Override // i.a.e1.d.g
    public boolean a(@i.a.e1.b.f f disposable) {
        if (c(disposable)) {
            disposable.dispose();
            return true;
        }
        return false;
    }

    @Override // i.a.e1.d.g
    public boolean b(@i.a.e1.b.f f disposable) {
        Objects.requireNonNull(disposable, "disposable is null");
        if (!this.c) {
            synchronized (this) {
                if (!this.c) {
                    s<f> sVar = this.b;
                    if (sVar == null) {
                        sVar = new s<>();
                        this.b = sVar;
                    }
                    sVar.a(disposable);
                    return true;
                }
            }
        }
        disposable.dispose();
        return false;
    }

    @Override // i.a.e1.d.g
    public boolean c(@i.a.e1.b.f f disposable) {
        Objects.requireNonNull(disposable, "disposable is null");
        if (this.c) {
            return false;
        }
        synchronized (this) {
            if (this.c) {
                return false;
            }
            s<f> sVar = this.b;
            if (sVar != null && sVar.e(disposable)) {
                return true;
            }
            return false;
        }
    }

    public boolean d(@i.a.e1.b.f f... disposables) {
        Objects.requireNonNull(disposables, "disposables is null");
        if (!this.c) {
            synchronized (this) {
                if (!this.c) {
                    s<f> sVar = this.b;
                    if (sVar == null) {
                        sVar = new s<>(disposables.length + 1);
                        this.b = sVar;
                    }
                    for (f fVar : disposables) {
                        Objects.requireNonNull(fVar, "A Disposable in the disposables array is null");
                        sVar.a(fVar);
                    }
                    return true;
                }
            }
        }
        for (f fVar2 : disposables) {
            fVar2.dispose();
        }
        return false;
    }

    @Override // i.a.e1.d.f
    public void dispose() {
        if (this.c) {
            return;
        }
        synchronized (this) {
            if (this.c) {
                return;
            }
            this.c = true;
            s<f> sVar = this.b;
            this.b = null;
            f(sVar);
        }
    }

    public void e() {
        if (this.c) {
            return;
        }
        synchronized (this) {
            if (this.c) {
                return;
            }
            s<f> sVar = this.b;
            this.b = null;
            f(sVar);
        }
    }

    public void f(@i.a.e1.b.g s<f> set) {
        Object[] b;
        if (set == null) {
            return;
        }
        ArrayList arrayList = null;
        for (Object obj : set.b()) {
            if (obj instanceof f) {
                try {
                    ((f) obj).dispose();
                } catch (Throwable th) {
                    i.a.e1.e.b.b(th);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th);
                }
            }
        }
        if (arrayList != null) {
            if (arrayList.size() == 1) {
                throw i.a.e1.h.k.k.i((Throwable) arrayList.get(0));
            }
            throw new i.a.e1.e.a(arrayList);
        }
    }

    public int g() {
        if (this.c) {
            return 0;
        }
        synchronized (this) {
            if (this.c) {
                return 0;
            }
            s<f> sVar = this.b;
            return sVar != null ? sVar.g() : 0;
        }
    }

    @Override // i.a.e1.d.f
    public boolean isDisposed() {
        return this.c;
    }

    public d(@i.a.e1.b.f f... disposables) {
        Objects.requireNonNull(disposables, "disposables is null");
        this.b = new s<>(disposables.length + 1);
        for (f fVar : disposables) {
            Objects.requireNonNull(fVar, "A Disposable in the disposables array is null");
            this.b.a(fVar);
        }
    }

    public d(@i.a.e1.b.f Iterable<? extends f> disposables) {
        Objects.requireNonNull(disposables, "disposables is null");
        this.b = new s<>();
        for (f fVar : disposables) {
            Objects.requireNonNull(fVar, "A Disposable item in the disposables sequence is null");
            this.b.a(fVar);
        }
    }
}
