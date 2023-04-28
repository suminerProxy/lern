package com.mob.commons;

import android.content.Intent;
import android.text.TextUtils;
import android.util.Base64;
import com.mob.MobSDK;
import com.mob.tools.MobLog;
import com.mob.tools.a;
import com.mob.tools.utils.DH;
import com.mob.tools.utils.Data;
import com.mob.tools.utils.FileLocker;
import com.mob.tools.utils.MobRSA;
import com.mob.tools.utils.ReflectHelper;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import org.apache.commons.cli.HelpFormatter;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class n {

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f3649a;
    private static n b;
    private File c;

    /* renamed from: d  reason: collision with root package name */
    private BigInteger f3650d;

    /* renamed from: e  reason: collision with root package name */
    private BigInteger f3651e;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private static final a[] f3653a = new a[2];
        private int b;
        private int c;

        /* renamed from: d  reason: collision with root package name */
        private String f3654d;

        /* renamed from: e  reason: collision with root package name */
        private String f3655e;

        private a() {
        }

        public static /* synthetic */ a a() {
            return b();
        }

        private static a b() {
            a[] aVarArr = f3653a;
            synchronized (aVarArr) {
                for (int i2 = 0; i2 < 2; i2++) {
                    a aVar = aVarArr[i2];
                    if (aVar != null) {
                        aVarArr[i2] = null;
                        return aVar;
                    }
                }
                return new a();
            }
        }

        private void c() {
            try {
                a[] aVarArr = f3653a;
                synchronized (aVarArr) {
                    for (int i2 = 0; i2 < 2; i2++) {
                        if (aVarArr[i2] == null) {
                            aVarArr[i2] = this;
                            return;
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                b(this.b, this.c, this.f3654d, this.f3655e);
            } finally {
                try {
                } finally {
                }
            }
        }

        public a a(int i2, int i3, String str, String str2) {
            this.b = i2;
            this.c = i3;
            this.f3654d = str;
            this.f3655e = str2;
            return this;
        }

        private void b(int i2, int i3, String str, String str2) {
            if (n.a().a(new com.mob.tools.utils.e(this, i2, str, i3, str2) { // from class: com.mob.commons.n.a.1

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ int f3656a;
                public final /* synthetic */ String b;
                public final /* synthetic */ int c;

                /* renamed from: d  reason: collision with root package name */
                public final /* synthetic */ String f3657d;

                /* renamed from: e  reason: collision with root package name */
                public final /* synthetic */ a f3658e;

                @Override // com.mob.tools.utils.e
                public void a() {
                }
            })) {
                v.c.execute(c.a());
            }
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private static final c[] f3660a = new c[2];
        private Runnable b = new com.mob.tools.utils.e(this) { // from class: com.mob.commons.n.c.1

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ c f3661a;

            @Override // com.mob.tools.utils.e
            public void a() {
            }
        };
        private Runnable c = new com.mob.tools.utils.e(this) { // from class: com.mob.commons.n.c.2

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ c f3662a;

            @Override // com.mob.tools.utils.e
            public void a() {
            }
        };

        private c() {
        }

        public static /* synthetic */ c a() {
            return b();
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.mob.commons.b.c()) {
                DH.requester(MobSDK.getContext()).getDetailNetworkTypeForStatic().request(new DH.DHResponder(this) { // from class: com.mob.commons.n.c.3

                    /* renamed from: a  reason: collision with root package name */
                    public final /* synthetic */ c f3663a;

                    @Override // com.mob.tools.utils.DH.DHResponder
                    public void onResponse(DH.DHResponse dHResponse) {
                    }
                });
            }
        }

        private static c b() {
            c[] cVarArr = f3660a;
            synchronized (cVarArr) {
                for (int i2 = 0; i2 < 2; i2++) {
                    c cVar = cVarArr[i2];
                    if (cVar != null) {
                        cVarArr[i2] = null;
                        return cVar;
                    }
                }
                return new c();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c() {
            try {
                c[] cVarArr = f3660a;
                synchronized (cVarArr) {
                    for (int i2 = 0; i2 < 2; i2++) {
                        if (cVarArr[i2] == null) {
                            cVarArr[i2] = this;
                            return;
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    private n() {
    }

    private byte[] c() throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = null;
        try {
            DataOutputStream dataOutputStream2 = new DataOutputStream(byteArrayOutputStream);
            try {
                SecureRandom secureRandom = new SecureRandom();
                dataOutputStream2.writeLong(secureRandom.nextLong());
                dataOutputStream2.writeLong(secureRandom.nextLong());
                dataOutputStream2.flush();
                s.a(dataOutputStream2);
                return byteArrayOutputStream.toByteArray();
            } catch (Throwable th) {
                th = th;
                dataOutputStream = dataOutputStream2;
                s.a(dataOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public void b() {
        v.c.execute(c.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.mob.tools.a b(int i2) {
        String b2 = o.b("005@dk]k)cfdcee");
        return new com.mob.tools.a(b2, o.b("005@dk]k)cfdcee") + HelpFormatter.DEFAULT_OPT_PREFIX + i2, 50);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class b implements a.InterfaceC0109a {

        /* renamed from: a  reason: collision with root package name */
        public ArrayList<HashMap<String, Object>> f3659a;
        public int b;
        public String c;

        private b() {
        }

        private String b(String str) throws Throwable {
        }

        @Override // com.mob.tools.a.InterfaceC0109a
        public void a(String str) {
        }

        public /* synthetic */ b(AnonymousClass1 anonymousClass1) {
        }

        @Override // com.mob.tools.a.InterfaceC0109a
        public boolean a(DH.DHResponse dHResponse) {
        }

        private HashMap<String, Object> a(DH.DHResponse dHResponse, int i2, String str) {
        }
    }

    public static synchronized n a() {
        n nVar;
        synchronized (n.class) {
            if (b == null) {
                b = new n();
            }
            nVar = b;
        }
        return nVar;
    }

    public void a(int i2, String str, int i3, String str2) {
        if (i2 == 1) {
            a.a().a(i3, i2, str, str2).run();
        } else {
            v.c.execute(a.a().a(i3, i2, str, str2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(final Runnable runnable) {
        if (this.c == null) {
            File file = new File(MobSDK.getContext().getFilesDir(), o.b("005Wdkdcdbcfci"));
            this.c = file;
            if (!file.exists()) {
                try {
                    this.c.createNewFile();
                } catch (Throwable unused) {
                }
            }
        }
        return m.a(this.c, new l() { // from class: com.mob.commons.n.1
            @Override // com.mob.commons.l
            public boolean a(FileLocker fileLocker) {
                try {
                    runnable.run();
                    return false;
                } catch (Throwable th) {
                    MobLog.getInstance().i(th);
                    return false;
                }
            }
        });
    }

    public int a(int i2, String str) {
        if (MobSDK.getContextSafely() != null && f3649a) {
            try {
                Intent intent = new Intent();
                intent.setPackage(o.b("015!cfcjdkef9bBcecgLhOefFgKcidkdcdbee"));
                intent.putExtra(o.b("007d'cecfciceee h"), MobSDK.getContext().getPackageName());
                intent.putExtra(o.b("008d.cgcddbcgcdUc:ch"), i2);
                intent.putExtra("ver", MobSDK.SDK_VERSION_CODE);
                intent.putExtra(o.b("003kRefee"), a(str));
                ReflectHelper.invokeInstanceMethod(MobSDK.getContextSafely(), o.b("013?ef0hVcj:gLeicgdbceMgRcfceefGc"), new Object[]{intent}, new Class[]{Intent.class});
            } catch (Throwable unused) {
            }
        }
        return 0;
    }

    private String a(String str) {
        DataOutputStream dataOutputStream;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            if (this.f3650d == null) {
                this.f3650d = new BigInteger("f53c224aefb38daa0825c1b8ea691b16d2e16db10880548afddd780c6670a091a11dafa954ea4a9483797fda1045d2693a08daa48cf9cedce1e8733b857304cb", 16);
                this.f3651e = new BigInteger("27749621e6ca022469645faed16e8261acf6af822467382d55c24bb9bc02356ab16e76ddc799dc8ba6b4f110411996eeb63505c9dcf969d3fc085d712f0f1a9713b67aa1128d7cc41bda363afb0ec7ade60e542a4e22869395331cc0096de412034551e98bb2629ae1b7168b8bc82006d064ab335d8567283e70beb6a49e9423", 16);
            }
            byte[] c2 = c();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            } catch (Throwable th) {
                th = th;
                dataOutputStream = null;
            }
            try {
                byte[] encode = new MobRSA(1024).encode(c2, this.f3650d, this.f3651e);
                dataOutputStream.writeInt(encode.length);
                dataOutputStream.write(encode);
                byte[] AES128Encode = Data.AES128Encode(c2, str.getBytes("utf-8"));
                dataOutputStream.writeInt(AES128Encode.length);
                dataOutputStream.write(AES128Encode);
                dataOutputStream.flush();
                s.a(dataOutputStream);
                return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            } catch (Throwable th2) {
                th = th2;
                s.a(dataOutputStream);
                throw th;
            }
        } catch (Throwable th3) {
            MobLog.getInstance().d(th3);
            return null;
        }
    }
}
