package h.y.a.n;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;

/* compiled from: VideoUtils.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class h1 {

    /* compiled from: VideoUtils.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a extends Handler {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f26312a;

        public a(Looper looper, c cVar) {
        }

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) {
        }
    }

    /* compiled from: VideoUtils.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class b implements Runnable {
        public final /* synthetic */ String b;
        public final /* synthetic */ int c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ int f26313d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ Handler f26314e;

        public b(String str, int i2, int i3, Handler handler) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* compiled from: VideoUtils.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface c {
        void a(Bitmap bitmap);
    }

    @TargetApi(14)
    public static void a(String str, int i2, int i3, c cVar) {
    }
}
