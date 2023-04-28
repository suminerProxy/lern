package com.umeng.analytics.process;

import com.umeng.commonsdk.utils.FileLockCallback;
import com.umeng.commonsdk.utils.FileLockUtil;
import java.io.File;
import java.util.concurrent.ExecutorService;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class DBFileTraversalUtil {

    /* renamed from: a  reason: collision with root package name */
    private static ExecutorService f15046a;
    private static FileLockUtil b;

    /* renamed from: com.umeng.analytics.process.DBFileTraversalUtil$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class AnonymousClass1 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ File f15047a;
        public final /* synthetic */ FileLockCallback b;
        public final /* synthetic */ a c;

        public AnonymousClass1(File file, FileLockCallback fileLockCallback, a aVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface a {
        void a();
    }

    public static /* synthetic */ FileLockUtil a() {
    }

    public static void traverseDBFiles(String str, FileLockCallback fileLockCallback, a aVar) {
    }
}
