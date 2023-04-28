package h.x.e.e;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.widget.ImageView;
import androidx.collection.LruCache;
import java.util.Queue;
import java.util.Stack;

/* compiled from: ImageManager.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class q {

    /* renamed from: h  reason: collision with root package name */
    private static q f25903h = null;

    /* renamed from: i  reason: collision with root package name */
    private static final int f25904i = 1;

    /* renamed from: j  reason: collision with root package name */
    private static final int f25905j = 2;

    /* renamed from: k  reason: collision with root package name */
    private static final int f25906k = 3;

    /* renamed from: a  reason: collision with root package name */
    private LruCache<String, Bitmap> f25907a;
    private Stack<d> b;
    private Queue<d> c;

    /* renamed from: d  reason: collision with root package name */
    private Handler f25908d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f25909e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f25910f;

    /* renamed from: g  reason: collision with root package name */
    private Handler f25911g;

    /* compiled from: ImageManager.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class a extends LruCache<String, Bitmap> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ q f25912a;

        public a(q qVar, int i2) {
        }

        public int a(String str, Bitmap bitmap) {
        }

        @Override // androidx.collection.LruCache
        public /* bridge */ /* synthetic */ int sizeOf(String str, Bitmap bitmap) {
        }
    }

    /* compiled from: ImageManager.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class b extends Handler {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ q f25913a;

        public b(q qVar) {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }
    }

    /* compiled from: ImageManager.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class c extends Handler {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ q f25914a;

        public c(q qVar, Looper looper) {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }
    }

    /* compiled from: ImageManager.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class d {

        /* renamed from: a  reason: collision with root package name */
        public ImageView f25915a;
        public String b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public int f25916d;

        /* renamed from: e  reason: collision with root package name */
        public int f25917e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ q f25918f;

        public d(q qVar, ImageView imageView, String str, int i2, int i3, int i4) {
        }
    }

    private q(Context context) {
    }

    public static /* synthetic */ boolean a(q qVar) {
    }

    public static /* synthetic */ boolean b(q qVar, boolean z) {
    }

    public static /* synthetic */ LruCache c(q qVar) {
    }

    public static /* synthetic */ Handler d(q qVar) {
    }

    public static /* synthetic */ Queue e(q qVar) {
    }

    public static /* synthetic */ void f(q qVar, ImageView imageView, Bitmap bitmap, boolean z) {
    }

    public static /* synthetic */ boolean g(q qVar, boolean z) {
    }

    public static /* synthetic */ Handler h(q qVar) {
    }

    public static /* synthetic */ void i(q qVar) {
    }

    public static q k(Context context) {
    }

    private void m() {
    }

    private void n(ImageView imageView, Bitmap bitmap, boolean z) {
    }

    public void j(ImageView imageView, String str, int i2, int i3, int i4) {
    }

    public void l(d dVar) {
    }

    public void o() {
    }
}
