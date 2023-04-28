package com.facebook.stetho.dumpapp.plugins;

import android.content.Context;
import com.facebook.stetho.dumpapp.DumpException;
import com.facebook.stetho.dumpapp.DumpUsageException;
import com.facebook.stetho.dumpapp.DumperContext;
import com.facebook.stetho.dumpapp.DumperPlugin;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Iterator;
import java.util.zip.ZipOutputStream;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class FilesDumperPlugin implements DumperPlugin {
    private static final String NAME = "files";
    private final Context mContext;

    public FilesDumperPlugin(Context context) {
    }

    private void addFiles(ZipOutputStream zipOutputStream, byte[] bArr, File[] fileArr) throws IOException {
    }

    private static void copy(InputStream inputStream, OutputStream outputStream, byte[] bArr) throws IOException {
    }

    private void doDownload(PrintStream printStream, Iterator<String> it) throws DumpUsageException {
    }

    private void doLs(PrintStream printStream) throws DumpUsageException {
    }

    private void doTree(PrintStream printStream) throws DumpUsageException {
    }

    private void doUsage(PrintStream printStream) {
    }

    private static File getBaseDir(Context context) {
    }

    private static void printDirectoryText(File file, String str, PrintStream printStream) {
    }

    private static void printDirectoryVisual(File file, int i2, PrintStream printStream) {
    }

    private static void printHeaderVisual(int i2, PrintStream printStream) {
    }

    private static String relativizePath(File file, File file2) {
    }

    private static File resolvePossibleAppStoragePath(Context context, String str) {
    }

    private static File resolvePossibleSdcardPath(String str) {
    }

    @Override // com.facebook.stetho.dumpapp.DumperPlugin
    public void dump(DumperContext dumperContext) throws DumpException {
    }

    @Override // com.facebook.stetho.dumpapp.DumperPlugin
    public String getName() {
    }
}
