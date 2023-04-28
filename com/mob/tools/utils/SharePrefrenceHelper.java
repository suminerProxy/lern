package com.mob.tools.utils;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import com.mob.commons.s;
import com.mob.tools.MobLog;
import com.mob.tools.proguard.PublicMemberKeeper;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class SharePrefrenceHelper implements PublicMemberKeeper {

    /* renamed from: a  reason: collision with root package name */
    private Context f4530a;
    private volatile a b;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class a {
        private static Handler c;

        /* renamed from: a  reason: collision with root package name */
        private File f4531a;
        private HashMap<String, Object> b;

        /* renamed from: com.mob.tools.utils.SharePrefrenceHelper$a$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public static class AnonymousClass1 implements Handler.Callback {
            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
            }
        }

        public a(Context context, String str) {
        }

        public static /* synthetic */ Object a(a aVar, String str) {
        }

        private Object b(String str) {
        }

        private void c() {
        }

        public static /* synthetic */ void a(a aVar, String str, Object obj) {
        }

        private void a(String str, Object obj) {
        }

        public void b(String str, int i2) {
        }

        public void b(String str, long j2) {
        }

        public void b(String str, boolean z) {
        }

        public void b(String str, String str2) {
        }

        public void b() {
        }

        public void a(String str, byte b) {
        }

        public int a(String str, int i2) {
        }

        public long a(String str, long j2) {
        }

        public boolean a(String str, boolean z) {
        }

        public String a(String str, String str2) {
        }

        public HashMap<String, Object> a() {
        }

        public void a(HashMap<String, Object> hashMap) {
        }

        public void a(String str) {
        }
    }

    public SharePrefrenceHelper(Context context) {
        if (context != null) {
            this.f4530a = context.getApplicationContext();
        }
    }

    public void clear() {
        if (this.b != null) {
            this.b.b();
        }
    }

    public Object get(String str) {
        ObjectInputStream objectInputStream;
        try {
            String string = getString(str);
            if (TextUtils.isEmpty(string)) {
                return null;
            }
            try {
                objectInputStream = new ObjectInputStream(new ByteArrayInputStream(Base64.decode(string, 2)));
            } catch (Throwable th) {
                th = th;
                objectInputStream = null;
            }
            try {
                Object readObject = objectInputStream.readObject();
                objectInputStream.close();
                s.a(objectInputStream);
                return readObject;
            } catch (Throwable th2) {
                th = th2;
                s.a(objectInputStream);
                throw th;
            }
        } catch (Throwable th3) {
            MobLog.getInstance().w(th3);
            return null;
        }
    }

    public HashMap<String, Object> getAll() {
        if (this.b != null) {
            return this.b.a();
        }
        return new HashMap<>();
    }

    public boolean getBoolean(String str) {
        if (this.b != null) {
            return this.b.a(str, false);
        }
        return false;
    }

    public int getInt(String str) {
        if (this.b != null) {
            return this.b.a(str, 0);
        }
        return 0;
    }

    public long getLong(String str) {
        return getLong(str, 0L);
    }

    public Object getObj(String str, Object obj) {
        return this.b != null ? a.a(this.b, str) : obj;
    }

    public String getString(String str) {
        return this.b != null ? this.b.a(str, "") : "";
    }

    public void open(String str) {
        open(str, 0);
    }

    public void put(String str, Object obj) {
        ByteArrayOutputStream byteArrayOutputStream;
        ObjectOutputStream objectOutputStream;
        if (obj == null) {
            return;
        }
        ObjectOutputStream objectOutputStream2 = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        } catch (Throwable th) {
            th = th;
        }
        try {
            objectOutputStream.writeObject(obj);
            objectOutputStream.flush();
            putString(str, Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2));
            s.a(objectOutputStream);
        } catch (Throwable th2) {
            th = th2;
            objectOutputStream2 = objectOutputStream;
            try {
                MobLog.getInstance().w(th);
                s.a(objectOutputStream2);
            } catch (Throwable th3) {
                s.a(objectOutputStream2);
                throw th3;
            }
        }
    }

    public void putAll(HashMap<String, Object> hashMap) {
        if (this.b != null) {
            this.b.a(hashMap);
        }
    }

    public void putBoolean(String str, Boolean bool) {
        if (this.b != null) {
            this.b.b(str, bool.booleanValue());
        }
    }

    public void putInt(String str, Integer num) {
        if (this.b != null) {
            this.b.b(str, num.intValue());
        }
    }

    public void putLong(String str, Long l2) {
        if (this.b != null) {
            this.b.b(str, l2.longValue());
        }
    }

    public void putObj(String str, Object obj) {
        if (obj == null && this.b != null) {
            this.b.a(str);
        } else if (this.b != null) {
            a.a(this.b, str, obj);
        }
    }

    public void putString(String str, String str2) {
        if (this.b != null) {
            this.b.b(str, str2);
        }
    }

    public void remove(String str) {
        if (this.b != null) {
            this.b.a(str);
        }
    }

    public long getLong(String str, long j2) {
        return this.b != null ? this.b.a(str, j2) : j2;
    }

    public void open(String str, int i2) {
        this.b = new a(this.f4530a, str + h.l.a.a.c.f17369e + i2);
    }

    public boolean getBoolean(String str, boolean z) {
        return this.b != null ? this.b.a(str, z) : z;
    }

    public int getInt(String str, int i2) {
        return this.b != null ? this.b.a(str, i2) : i2;
    }

    public String getString(String str, String str2) {
        return this.b != null ? this.b.a(str, str2) : str2;
    }
}
