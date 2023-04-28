package com.mob.tools;

import android.text.TextUtils;
import android.util.Base64;
import com.mob.MobSDK;
import com.mob.tools.utils.DH;
import com.mob.tools.utils.ResHelper;
import h.l.a.a.c;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.util.HashSet;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f3967a = new Object();
    private static final Object b = new Object();
    private volatile HashSet<String> c = new HashSet<>();

    /* renamed from: d  reason: collision with root package name */
    private File f3968d;

    /* renamed from: e  reason: collision with root package name */
    private int f3969e;

    /* renamed from: f  reason: collision with root package name */
    private String f3970f;

    /* renamed from: com.mob.tools.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface InterfaceC0109a {
        void a(String str);

        boolean a(DH.DHResponse dHResponse);
    }

    public a(String str, String str2, int i2) {
        this.f3969e = i2;
        if (str2 == null) {
            str2 = "null";
        } else if (TextUtils.isDigitsOnly(str2)) {
            str2 = str + str2;
        }
        this.f3970f = str2;
        File dataCacheFile = ResHelper.getDataCacheFile(MobSDK.getContextSafely(), str);
        this.f3968d = dataCacheFile;
        if (dataCacheFile.isDirectory()) {
            return;
        }
        this.f3968d.mkdirs();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        synchronized (this.c) {
            this.c.remove(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(String str) {
        synchronized (this.c) {
            if (this.c.contains(str)) {
                return true;
            }
            this.c.add(str);
            return false;
        }
    }

    public void a(String str) {
        a(str, false);
    }

    public void a(String str, boolean z) {
        String str2;
        FileWriter fileWriter;
        String name;
        BufferedWriter bufferedWriter;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        BufferedWriter bufferedWriter2 = null;
        try {
            str2 = Base64.encodeToString(str.getBytes("utf-8"), 2);
        } catch (Throwable th) {
            MobLog.getInstance().d(th);
            str2 = null;
        }
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        synchronized (f3967a) {
            File a2 = a(z);
            try {
                fileWriter = new FileWriter(a2, true);
                try {
                    bufferedWriter = new BufferedWriter(fileWriter);
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                fileWriter = null;
            }
            try {
                bufferedWriter.newLine();
                bufferedWriter.write(str2);
                ResHelper.closeIOs(bufferedWriter);
                ResHelper.closeIOs(fileWriter);
                name = a2.getName();
            } catch (Throwable th4) {
                th = th4;
                bufferedWriter2 = bufferedWriter;
                MobLog.getInstance().d(th);
                ResHelper.closeIOs(bufferedWriter2);
                ResHelper.closeIOs(fileWriter);
                name = a2.getName();
                c(name);
            }
            c(name);
        }
    }

    private File a(boolean z) {
        File file;
        File[] listFiles = this.f3968d.listFiles();
        int i2 = 5;
        int i3 = 3;
        char c = 2;
        if (listFiles != null && listFiles.length > 0) {
            int length = listFiles.length;
            int i4 = 0;
            int i5 = 1;
            while (i4 < length) {
                File file2 = listFiles[i4];
                String name = file2.getName();
                if (name.startsWith(this.f3970f)) {
                    String[] split = name.split(c.f17369e);
                    if (!z && split.length == i3) {
                        try {
                            int parseInt = Integer.parseInt(split[c]);
                            if (parseInt < this.f3969e && !b(name)) {
                                File file3 = this.f3968d;
                                Object[] objArr = new Object[i2];
                                objArr[0] = this.f3970f;
                                objArr[1] = c.f17369e;
                                objArr[2] = Integer.valueOf(i5);
                                objArr[3] = c.f17369e;
                                objArr[4] = Integer.valueOf(parseInt + 1);
                                File file4 = new File(file3, a(objArr));
                                return file2.renameTo(file4) ? file4 : file2;
                            }
                        } catch (Throwable th) {
                            MobLog.getInstance().d(th);
                        }
                    }
                    if (split.length > 1) {
                        try {
                            if (Integer.parseInt(split[1]) == i5) {
                                i5++;
                            }
                        } catch (Throwable th2) {
                            MobLog.getInstance().d(th2);
                        }
                    }
                }
                i4++;
                i2 = 5;
                i3 = 3;
                c = 2;
            }
            file = new File(this.f3968d, a(this.f3970f, c.f17369e, Integer.valueOf(i5), c.f17369e, 0));
        } else {
            file = new File(this.f3968d, a(this.f3970f, c.f17369e, 1, c.f17369e, 0));
        }
        try {
            file.createNewFile();
        } catch (Throwable unused) {
        }
        return file;
    }

    public void a(InterfaceC0109a interfaceC0109a) {
        if (interfaceC0109a == null) {
            return;
        }
        synchronized (b) {
            File[] listFiles = this.f3968d.listFiles(new FilenameFilter(this) { // from class: com.mob.tools.a.1

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ a f3971a;

                @Override // java.io.FilenameFilter
                public boolean accept(File file, String str) {
                }
            });
            if (listFiles != null && listFiles.length > 0) {
                DH.requester(MobSDK.getContext()).getDetailNetworkTypeForStatic().getAppName().getDeviceKey().getDeviceId().request(new DH.DHResponder(this, listFiles, interfaceC0109a) { // from class: com.mob.tools.a.2

                    /* renamed from: a  reason: collision with root package name */
                    public final /* synthetic */ File[] f3972a;
                    public final /* synthetic */ InterfaceC0109a b;
                    public final /* synthetic */ a c;

                    @Override // com.mob.tools.utils.DH.DHResponder
                    public void onResponse(DH.DHResponse dHResponse) {
                    }
                });
            }
        }
    }

    public void a(long j2) {
        synchronized (b) {
            File[] listFiles = this.f3968d.listFiles(new FilenameFilter(this) { // from class: com.mob.tools.a.3

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ a f3973a;

                @Override // java.io.FilenameFilter
                public boolean accept(File file, String str) {
                }
            });
            if (listFiles != null && listFiles.length > 0) {
                long j3 = 0;
                for (File file : listFiles) {
                    j3 += file.length();
                }
                if (j3 >= j2) {
                    for (File file2 : listFiles) {
                        file2.delete();
                    }
                }
            }
        }
    }

    private static String a(Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (Object obj : objArr) {
            sb.append(obj);
        }
        return sb.toString();
    }
}
