package h.p.a.a;

import h.p.a.a.f.a;
import java.nio.ByteBuffer;

/* compiled from: ApkSectionInfo.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public boolean f17707a = false;
    public long b;
    public c<ByteBuffer, Long> c;

    /* renamed from: d  reason: collision with root package name */
    public c<ByteBuffer, Long> f17708d;

    /* renamed from: e  reason: collision with root package name */
    public c<ByteBuffer, Long> f17709e;

    /* renamed from: f  reason: collision with root package name */
    public c<ByteBuffer, Long> f17710f;

    public void a() throws a.c {
        long h2 = h.p.a.a.f.a.h(this.f17710f.b(), this.f17710f.c().longValue());
        if (h2 == this.f17709e.c().longValue()) {
            return;
        }
        throw new RuntimeException("CentralDirOffset mismatch , EocdCentralDirOffset : " + h2 + ", centralDirOffset : " + this.f17709e.c());
    }

    public void b() throws a.c {
        boolean z = this.f17707a;
        if ((z || this.c != null) && this.f17708d != null && this.f17709e != null && this.f17710f != null) {
            if ((z || (this.c.c().longValue() == 0 && ((long) this.c.b().remaining()) + this.c.c().longValue() == this.f17708d.c().longValue())) && ((long) this.f17708d.b().remaining()) + this.f17708d.c().longValue() == this.f17709e.c().longValue() && ((long) this.f17709e.b().remaining()) + this.f17709e.c().longValue() == this.f17710f.c().longValue() && ((long) this.f17710f.b().remaining()) + this.f17710f.c().longValue() == this.b) {
                a();
                return;
            }
            throw new RuntimeException("ApkSectionInfo paramters is not valid : " + toString());
        }
        throw new RuntimeException("ApkSectionInfo paramters is not valid : " + toString());
    }

    public void c() {
        c<ByteBuffer, Long> cVar = this.c;
        if (cVar != null) {
            cVar.b().rewind();
        }
        c<ByteBuffer, Long> cVar2 = this.f17708d;
        if (cVar2 != null) {
            cVar2.b().rewind();
        }
        c<ByteBuffer, Long> cVar3 = this.f17709e;
        if (cVar3 != null) {
            cVar3.b().rewind();
        }
        c<ByteBuffer, Long> cVar4 = this.f17710f;
        if (cVar4 != null) {
            cVar4.b().rewind();
        }
    }

    public String toString() {
        return "lowMemory : " + this.f17707a + "\n apkSize : " + this.b + "\n contentEntry : " + this.c + "\n schemeV2Block : " + this.f17708d + "\n centralDir : " + this.f17709e + "\n eocd : " + this.f17710f;
    }
}
