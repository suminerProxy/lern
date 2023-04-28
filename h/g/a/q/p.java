package h.g.a.q;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.FragmentManager;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.collection.ArrayMap;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.Glide;
import java.util.Collection;
import java.util.Map;

/* compiled from: RequestManagerRetriever.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class p implements Handler.Callback {
    @VisibleForTesting

    /* renamed from: k  reason: collision with root package name */
    public static final String f17144k = "com.bumptech.glide.manager";

    /* renamed from: l  reason: collision with root package name */
    private static final String f17145l = "RMRetriever";

    /* renamed from: m  reason: collision with root package name */
    private static final int f17146m = 1;

    /* renamed from: n  reason: collision with root package name */
    private static final int f17147n = 2;

    /* renamed from: o  reason: collision with root package name */
    private static final String f17148o = "key";

    /* renamed from: p  reason: collision with root package name */
    private static final b f17149p = null;
    private volatile h.g.a.k b;
    @VisibleForTesting
    public final Map<FragmentManager, o> c;
    @VisibleForTesting

    /* renamed from: d  reason: collision with root package name */
    public final Map<androidx.fragment.app.FragmentManager, s> f17150d;

    /* renamed from: e  reason: collision with root package name */
    private final Handler f17151e;

    /* renamed from: f  reason: collision with root package name */
    private final b f17152f;

    /* renamed from: g  reason: collision with root package name */
    private final ArrayMap<View, Fragment> f17153g;

    /* renamed from: h  reason: collision with root package name */
    private final ArrayMap<View, android.app.Fragment> f17154h;

    /* renamed from: i  reason: collision with root package name */
    private final Bundle f17155i;

    /* renamed from: j  reason: collision with root package name */
    private final k f17156j;

    /* compiled from: RequestManagerRetriever.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class a implements b {
        @Override // h.g.a.q.p.b
        @NonNull
        public h.g.a.k a(@NonNull Glide glide, @NonNull l lVar, @NonNull q qVar, @NonNull Context context) {
        }
    }

    /* compiled from: RequestManagerRetriever.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface b {
        @NonNull
        h.g.a.k a(@NonNull Glide glide, @NonNull l lVar, @NonNull q qVar, @NonNull Context context);
    }

    public p(@Nullable b bVar, h.g.a.d dVar) {
    }

    @TargetApi(17)
    private static void a(@NonNull Activity activity) {
    }

    private static k b(h.g.a.d dVar) {
    }

    @Nullable
    private static Activity c(@NonNull Context context) {
    }

    @TargetApi(26)
    @Deprecated
    private void d(@NonNull FragmentManager fragmentManager, @NonNull ArrayMap<View, android.app.Fragment> arrayMap) {
    }

    @Deprecated
    private void e(@NonNull FragmentManager fragmentManager, @NonNull ArrayMap<View, android.app.Fragment> arrayMap) {
    }

    private static void f(@Nullable Collection<Fragment> collection, @NonNull Map<View, Fragment> map) {
    }

    @Nullable
    @Deprecated
    private android.app.Fragment g(@NonNull View view, @NonNull Activity activity) {
    }

    @Nullable
    private Fragment h(@NonNull View view, @NonNull FragmentActivity fragmentActivity) {
    }

    @NonNull
    @Deprecated
    private h.g.a.k i(@NonNull Context context, @NonNull FragmentManager fragmentManager, @Nullable android.app.Fragment fragment, boolean z) {
    }

    @NonNull
    private h.g.a.k p(@NonNull Context context) {
    }

    @NonNull
    private o r(@NonNull FragmentManager fragmentManager, @Nullable android.app.Fragment fragment) {
    }

    @NonNull
    private s t(@NonNull androidx.fragment.app.FragmentManager fragmentManager, @Nullable Fragment fragment) {
    }

    private static boolean u(Context context) {
    }

    @NonNull
    private h.g.a.k v(@NonNull Context context, @NonNull androidx.fragment.app.FragmentManager fragmentManager, @Nullable Fragment fragment, boolean z) {
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
    }

    @NonNull
    public h.g.a.k j(@NonNull Activity activity) {
    }

    @NonNull
    @TargetApi(17)
    @Deprecated
    public h.g.a.k k(@NonNull android.app.Fragment fragment) {
    }

    @NonNull
    public h.g.a.k l(@NonNull Context context) {
    }

    @NonNull
    public h.g.a.k m(@NonNull View view) {
    }

    @NonNull
    public h.g.a.k n(@NonNull Fragment fragment) {
    }

    @NonNull
    public h.g.a.k o(@NonNull FragmentActivity fragmentActivity) {
    }

    @NonNull
    @Deprecated
    public o q(Activity activity) {
    }

    @NonNull
    public s s(androidx.fragment.app.FragmentManager fragmentManager) {
    }
}
