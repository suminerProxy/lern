package com.facebook.stetho.dumpapp.plugins;

import com.facebook.stetho.dumpapp.DumpException;
import com.facebook.stetho.dumpapp.DumperContext;
import com.facebook.stetho.dumpapp.DumperPlugin;
import java.io.PrintStream;
import java.lang.reflect.Constructor;
import java.util.Iterator;
import javax.annotation.Nullable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class CrashDumperPlugin implements DumperPlugin {
    private static final String NAME = "crash";
    private static final String OPTION_EXIT_DEFAULT = "0";
    private static final String OPTION_KILL_DEFAULT = "9";
    private static final String OPTION_THROW_DEFAULT = "java.lang.Error";

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class ThrowRunnable implements Runnable {
        private final Throwable mThrowable;

        public ThrowRunnable(Throwable th) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    private void doKill(DumperContext dumperContext, Iterator<String> it) throws DumpException {
    }

    private void doSystemExit(Iterator<String> it) {
    }

    private void doUncaughtException(Iterator<String> it) throws DumpException {
    }

    private void doUsage(PrintStream printStream) {
    }

    @Nullable
    private static <T> Constructor<? extends T> tryGetDeclaredConstructor(Class<T> cls, Class<?>... clsArr) {
    }

    @Override // com.facebook.stetho.dumpapp.DumperPlugin
    public void dump(DumperContext dumperContext) throws DumpException {
    }

    @Override // com.facebook.stetho.dumpapp.DumperPlugin
    public String getName() {
    }
}
