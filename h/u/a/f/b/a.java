package h.u.a.f.b;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.AsyncTask;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.Closeable;

/* compiled from: BitmapLoadUtils.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f20393a = "BitmapLoadUtils";

    /* compiled from: BitmapLoadUtils.java */
    /* renamed from: h.u.a.f.b.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface InterfaceC0358a {
        void a(@NonNull Bitmap bitmap);

        void b(@NonNull Exception exc);
    }

    /* compiled from: BitmapLoadUtils.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public Bitmap f20394a;
        public Exception b;

        public b(@Nullable Bitmap bitmap, @Nullable Exception exc) {
        }
    }

    /* compiled from: BitmapLoadUtils.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class c extends AsyncTask<Void, Void, b> {

        /* renamed from: a  reason: collision with root package name */
        private final Context f20395a;
        private final Uri b;
        private final int c;

        /* renamed from: d  reason: collision with root package name */
        private final int f20396d;

        /* renamed from: e  reason: collision with root package name */
        private final InterfaceC0358a f20397e;

        public c(@NonNull Context context, @Nullable Uri uri, int i2, int i3, InterfaceC0358a interfaceC0358a) {
        }

        @NonNull
        public b a(Void... voidArr) {
        }

        public void b(@NonNull b bVar) {
        }

        @Override // android.os.AsyncTask
        @NonNull
        public /* bridge */ /* synthetic */ b doInBackground(Void[] voidArr) {
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onPostExecute(@NonNull b bVar) {
        }
    }

    public static /* synthetic */ int a(Context context, Uri uri) {
    }

    public static /* synthetic */ int b(int i2) {
    }

    public static /* synthetic */ int c(int i2) {
    }

    public static int d(@NonNull BitmapFactory.Options options, int i2, int i3) {
    }

    public static void e(@Nullable Closeable closeable) {
    }

    public static void f(@NonNull Context context, @Nullable Uri uri, int i2, int i3, InterfaceC0358a interfaceC0358a) {
    }

    private static int g(int i2) {
    }

    private static int h(int i2) {
    }

    private static int i(@NonNull Context context, @NonNull Uri uri) {
    }

    public static Bitmap j(@NonNull Bitmap bitmap, @NonNull Matrix matrix) {
    }
}
