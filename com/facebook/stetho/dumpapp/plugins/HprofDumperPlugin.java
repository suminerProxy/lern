package com.facebook.stetho.dumpapp.plugins;

import android.content.Context;
import com.facebook.stetho.dumpapp.DumpException;
import com.facebook.stetho.dumpapp.DumpUsageException;
import com.facebook.stetho.dumpapp.DumperContext;
import com.facebook.stetho.dumpapp.DumperPlugin;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class HprofDumperPlugin implements DumperPlugin {
    private static final String NAME = "hprof";
    private final Context mContext;

    public HprofDumperPlugin(Context context) {
    }

    private void handlePipeOutput(OutputStream outputStream) throws DumpException {
    }

    private static void truncateAndDeleteFile(File file) throws IOException {
    }

    private void usage(PrintStream printStream) throws DumpUsageException {
    }

    private void writeHprof(File file) throws DumpException {
    }

    @Override // com.facebook.stetho.dumpapp.DumperPlugin
    public void dump(DumperContext dumperContext) throws DumpException {
    }

    @Override // com.facebook.stetho.dumpapp.DumperPlugin
    public String getName() {
    }
}
