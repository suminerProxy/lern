package h.c.a.a.e;

import cn.sharesdk.framework.InnerShareParams;
import com.alibaba.fastjson.annotation.JSONField;
import com.alipay.mobile.h5container.api.H5BridgeContext;
import com.alipay.mobile.h5container.api.H5Event;
import com.alipay.mobile.h5container.api.H5EventFilter;
import com.alipay.sdk.util.l;
import com.baidu.platform.comapi.map.MapController;
import com.tencent.android.tpush.common.MessageKey;
import h.c.a.a.a;
import h.c.a.a.h.k;
import h.c.a.a.h.p;
import h.c.a.a.h.q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: H5XMediaPlugin.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class a extends h.c.a.a.e.b {
    private static final String c = "H5XMediaPlugin";

    /* renamed from: d  reason: collision with root package name */
    public static final String f16162d = "startXMedia";

    /* renamed from: e  reason: collision with root package name */
    public static final String f16163e = "stopXMedia";

    /* renamed from: f  reason: collision with root package name */
    public static final String f16164f = "tmpPath";

    /* renamed from: g  reason: collision with root package name */
    public static final String f16165g = "error";

    /* renamed from: h  reason: collision with root package name */
    public static final String f16166h = "errorMessage";
    private h.c.a.a.g.a b;

    /* compiled from: H5XMediaPlugin.java */
    /* renamed from: h.c.a.a.e.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class RunnableC0299a implements Runnable {
        public final /* synthetic */ c b;
        public final /* synthetic */ H5BridgeContext c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ H5Event f16167d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ a f16168e;

        /* compiled from: H5XMediaPlugin.java */
        /* renamed from: h.c.a.a.e.a$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class C0300a implements a.InterfaceC0297a {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ RunnableC0299a f16169a;

            public C0300a(RunnableC0299a runnableC0299a) {
            }

            @Override // h.c.a.a.a.InterfaceC0297a
            public boolean a(p pVar) {
            }

            @Override // h.c.a.a.a.InterfaceC0297a
            public boolean b(p pVar) {
            }
        }

        /* compiled from: H5XMediaPlugin.java */
        /* renamed from: h.c.a.a.e.a$a$b */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class b implements a.InterfaceC0297a {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ RunnableC0299a f16170a;

            public b(RunnableC0299a runnableC0299a) {
            }

            @Override // h.c.a.a.a.InterfaceC0297a
            public boolean a(p pVar) {
            }

            @Override // h.c.a.a.a.InterfaceC0297a
            public boolean b(p pVar) {
            }
        }

        public RunnableC0299a(a aVar, c cVar, H5BridgeContext h5BridgeContext, H5Event h5Event) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* compiled from: H5XMediaPlugin.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class b {
        @JSONField(name = "type")

        /* renamed from: a  reason: collision with root package name */
        public String f16171a;
        @JSONField(name = "threshold")
        public int b;
        @JSONField(name = MapController.ITEM_LAYER_TAG)
        public HashMap<String, k> c;
    }

    /* compiled from: H5XMediaPlugin.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class c {
        @JSONField(name = com.alipay.sdk.app.statistic.c.b)

        /* renamed from: a  reason: collision with root package name */
        public String f16172a;
        @JSONField(name = "secret")
        public String b;
        @JSONField(name = MessageKey.MSG_SOURCE)
        public int c;
        @JSONField(name = h.c.a.a.a.f16081l)

        /* renamed from: d  reason: collision with root package name */
        public int f16173d;
        @JSONField(name = "model")

        /* renamed from: e  reason: collision with root package name */
        public String f16174e;
        @JSONField(name = "modelType")

        /* renamed from: f  reason: collision with root package name */
        public int f16175f;
        @JSONField(name = "modelId")

        /* renamed from: g  reason: collision with root package name */
        public String f16176g;
        @JSONField(name = InnerShareParams.IMAGE_PATH)

        /* renamed from: h  reason: collision with root package name */
        public String f16177h;
        @JSONField(name = "processData")

        /* renamed from: i  reason: collision with root package name */
        public Object[] f16178i;
        @JSONField(name = h.c.a.a.a.u)

        /* renamed from: j  reason: collision with root package name */
        public ArrayList f16179j;
        @JSONField(name = "filter")

        /* renamed from: k  reason: collision with root package name */
        public b f16180k;
        @JSONField(name = h.c.a.a.a.q)

        /* renamed from: l  reason: collision with root package name */
        public String[] f16181l;
        @JSONField(name = h.c.a.a.a.r)

        /* renamed from: m  reason: collision with root package name */
        public int[] f16182m;
        @JSONField(name = h.c.a.a.a.s)

        /* renamed from: n  reason: collision with root package name */
        public String f16183n;
        @JSONField(name = "shakingThreshold")

        /* renamed from: o  reason: collision with root package name */
        public int f16184o;
        @JSONField(name = "timeInterval")

        /* renamed from: p  reason: collision with root package name */
        public int f16185p;
        @JSONField(name = "imageOutput")
        public int q;
        @JSONField(name = "roiImageOutput")
        public int r;
        @JSONField(name = "resultImageOutput")
        public int s;
        @JSONField(name = "sampling")
        public int t;
    }

    /* compiled from: H5XMediaPlugin.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class d {
        @JSONField(name = h.c.a.a.a.f16081l)

        /* renamed from: a  reason: collision with root package name */
        public int f16186a;
        @JSONField(name = l.c)
        public List<q> b;
        @JSONField(name = "error")
        public h.c.a.a.h.e c;
        @JSONField(name = "extraData")

        /* renamed from: d  reason: collision with root package name */
        public HashMap<String, Object> f16187d;
    }

    /* compiled from: H5XMediaPlugin.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class e {
        @JSONField(name = h.c.a.a.a.f16081l)

        /* renamed from: a  reason: collision with root package name */
        public int f16188a;
        @JSONField(name = l.c)
        public List<List<q>> b;
        @JSONField(name = "error")
        public h.c.a.a.h.e c;
        @JSONField(name = "extraData")

        /* renamed from: d  reason: collision with root package name */
        public HashMap<String, Object> f16189d;
    }

    public static /* synthetic */ h.c.a.a.g.a h(a aVar) {
    }

    public static /* synthetic */ h.c.a.a.g.a i(a aVar, h.c.a.a.g.a aVar2) {
    }

    public boolean j(H5Event h5Event, H5BridgeContext h5BridgeContext) {
    }

    public void k(H5EventFilter h5EventFilter) {
    }

    public void l() {
    }
}
