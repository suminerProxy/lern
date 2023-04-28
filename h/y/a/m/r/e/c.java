package h.y.a.m.r.e;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import okhttp3.Cookie;

/* compiled from: SharedPrefsCookiePersistor.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class c implements a {

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences f26263a;

    public c(Context context) {
        this(context.getSharedPreferences("CookiePersistence", 4));
    }

    private static String c(Cookie cookie) {
        StringBuilder sb = new StringBuilder();
        sb.append(cookie.secure() ? "https" : "http");
        sb.append("://");
        sb.append(cookie.domain());
        sb.append(cookie.path());
        sb.append("|");
        sb.append(cookie.name());
        return sb.toString();
    }

    @Override // h.y.a.m.r.e.a
    public void a(Collection<Cookie> collection) {
        SharedPreferences.Editor edit = this.f26263a.edit();
        for (Cookie cookie : collection) {
            if (cookie.persistent()) {
                edit.putString(c(cookie), new b().encode(cookie));
            }
        }
        edit.apply();
    }

    @Override // h.y.a.m.r.e.a
    public List<Cookie> b() {
        ArrayList arrayList = new ArrayList(this.f26263a.getAll().size());
        try {
            for (Map.Entry<String, ?> entry : this.f26263a.getAll().entrySet()) {
                Cookie decode = new b().decode((String) entry.getValue());
                if (decode != null) {
                    arrayList.add(decode);
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return arrayList;
    }

    @Override // h.y.a.m.r.e.a
    public void clear() {
        this.f26263a.edit().clear().apply();
    }

    @Override // h.y.a.m.r.e.a
    public void removeAll(Collection<Cookie> collection) {
        SharedPreferences.Editor edit = this.f26263a.edit();
        for (Cookie cookie : collection) {
            edit.remove(c(cookie));
        }
        edit.apply();
    }

    public c(SharedPreferences sharedPreferences) {
        this.f26263a = sharedPreferences;
    }
}
