package h.y.a.m;

import h.y.a.n.t0;
import java.io.IOException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/* compiled from: BaseUICallBack.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public abstract class j implements Callback {
    /* renamed from: e */
    public abstract void b(Call call, IOException iOException);

    /* renamed from: f */
    public abstract void d(String str, Call call, Response response);

    @Override // okhttp3.Callback
    public void onFailure(Call call, IOException iOException) {
        if (iOException != null) {
            iOException.printStackTrace();
        }
        t0.i(new i.a.x0.a(this, call, iOException) { // from class: h.y.a.m.b
            public final /* synthetic */ j b;
            public final /* synthetic */ Call c;

            /* renamed from: d  reason: collision with root package name */
            public final /* synthetic */ IOException f26237d;

            @Override // i.a.x0.a
            public final void run() {
            }
        });
    }

    @Override // okhttp3.Callback
    public void onResponse(Call call, Response response) throws IOException {
        String str = null;
        try {
            str = response.body().string();
            if (response.code() != 200) {
                str = "{\"state\":\"" + response.code() + "\",\"msg\":\"\"}";
            }
        } catch (IOException e2) {
            onFailure(call, e2);
        }
        t0.i(new i.a.x0.a(this, str, call, response) { // from class: h.y.a.m.c
            public final /* synthetic */ j b;
            public final /* synthetic */ String c;

            /* renamed from: d  reason: collision with root package name */
            public final /* synthetic */ Call f26238d;

            /* renamed from: e  reason: collision with root package name */
            public final /* synthetic */ Response f26239e;

            @Override // i.a.x0.a
            public final void run() {
            }
        });
    }
}
