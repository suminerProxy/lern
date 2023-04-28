package com.mob.commons.cc;

import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mob.commons.cc.p;
import com.mob.commons.cc.w;
import com.mob.tools.MobHandlerThread;
import com.mob.tools.network.NetCommunicator;
import com.mob.tools.network.NetworkHelper;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final q f3533a = new q();
    private static volatile p b;
    private static volatile p c;

    static {
        try {
            b = new p(new p.a() { // from class: com.mob.commons.cc.a.1
                @Override // com.mob.commons.cc.p.a
                public Object a(String str, ArrayList<Object> arrayList) {
                }
            });
            c = new p(new p.a() { // from class: com.mob.commons.cc.a.2
                @Override // com.mob.commons.cc.p.a
                public Object a(String str, ArrayList<Object> arrayList) {
                }
            });
            b.a(TtmlNode.TAG_TT, null);
        } catch (Throwable unused) {
        }
    }

    public static int a() {
        return w.a();
    }

    public static void a(Context context, byte[] bArr, String str, Method method) throws Throwable {
        a(w.a(bArr), context, str, method);
    }

    public static void a(Context context, String str, String str2, Method method) throws Throwable {
        a(w.a(str), context, str2, method);
    }

    public static void a(Context context, String str, String str2, HashMap<String, Object> hashMap, HashMap<String, Object> hashMap2) throws Throwable {
        w.c a2 = w.a(str);
        a2.a("ss_dhMap", hashMap).a("ss_dataMaps", hashMap2);
        a(a2, context, str2, (Method) null);
    }

    public static LinkedList<Object> a(Object obj, Object... objArr) throws Throwable {
        return ((y) obj).b(objArr);
    }

    private static void a(w.c cVar, Context context, String str, Method method) throws Throwable {
        cVar.a(com.mob.commons.o.b("012JekTdh*cgceNcTcddbcjdg9hc"), o.class).a("MNT", d.class).a("MSPH", g.class).a("MBH", b.class).a(com.mob.commons.o.b("0166fhdbebgccecj9gIdc=h^cgdhBb=cgCh1ce?g"), MobHandlerThread.class).a(com.mob.commons.o.b("0208fhdbebeicgdbce!g?cfceefYcGfd4h:cf*h8cdJih]cg"), h.class).a(com.mob.commons.o.b("018%fhdbebffdbcj6chWcjRc(fdShEefdbdcQih3cg"), k.class).a(com.mob.commons.o.b("020[fhdbebdg!h3cg,iUcdcf8h+ffdbcjcj+h$cfNc.cddbcj"), m.class).a(com.mob.commons.o.b("018$fhdbebffdbcjHch=cjTcGekebefDh?cg!ihNcg"), j.class).a(com.mob.commons.o.b("018,fhdbebde'hc>ecdbcgciffcedcdcebcecfci"), l.class).a(com.mob.commons.o.b("0099dgeigccecj(g7dcMh4cg"), p.class).a("MNC", NetCommunicator.class).a(com.mob.commons.o.b("004)fhdedhek"), NetworkHelper.NetworkTimeOut.class).a(h.class, h.class).a(j.class, j.class).a(m.class, n.class).a(l.class, l.class).a(q.class, q.class).a(o.class, o.class).a(d.class, d.class).a(g.class, i.class).a(b.class, b.class).a(Context.class, c.class).a(PackageManager.class, f.class).a(NotificationManager.class, e.class).a("ss_suls", f3533a).a(com.mob.commons.o.b("015 efefcccfdbcj3chOck4c(fgcecgceOk"), context).a(com.mob.commons.o.b("0144efefccef>c_cecg<c5fgcecgce]kDef"), str).a(com.mob.commons.o.b("012:efefccef^c cecg1cMdhcd?kh"), Long.valueOf(System.currentTimeMillis())).a(com.mob.commons.o.b("006$efefccGkgd"), method).a(com.mob.commons.o.b("016Rcfdb=kk@dbcjce;dFdkefEgZcidkcf5gCcf"));
        cVar.a();
    }
}
