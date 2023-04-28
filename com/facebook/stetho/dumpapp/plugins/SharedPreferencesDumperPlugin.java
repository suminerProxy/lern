package com.facebook.stetho.dumpapp.plugins;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import com.facebook.stetho.dumpapp.DumpUsageException;
import com.facebook.stetho.dumpapp.DumperContext;
import com.facebook.stetho.dumpapp.DumperPlugin;
import java.io.PrintStream;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class SharedPreferencesDumperPlugin implements DumperPlugin {
    private static final String NAME = "prefs";
    private static final String XML_SUFFIX = ".xml";
    private final Context mAppContext;

    /* renamed from: com.facebook.stetho.dumpapp.plugins.SharedPreferencesDumperPlugin$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$facebook$stetho$dumpapp$plugins$SharedPreferencesDumperPlugin$Type = null;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Type {
        private static final /* synthetic */ Type[] $VALUES = null;
        public static final Type BOOLEAN = null;
        public static final Type FLOAT = null;
        public static final Type INT = null;
        public static final Type LONG = null;
        public static final Type SET = null;
        public static final Type STRING = null;
        private final String name;

        private Type(String str, int i2, String str2) {
        }

        public static StringBuilder appendNamesList(StringBuilder sb, String str) {
        }

        @Nullable
        public static Type of(String str) {
        }

        public static Type valueOf(String str) {
        }

        public static Type[] values() {
        }
    }

    public SharedPreferencesDumperPlugin(Context context) {
    }

    private void doPrint(PrintStream printStream, List<String> list) {
    }

    private void doUsage(PrintStream printStream) {
    }

    @SuppressLint({"CommitPrefEdits"})
    private void doWrite(List<String> list) throws DumpUsageException {
    }

    private SharedPreferences getSharedPreferences(String str) {
    }

    @Nonnull
    private static String nextArg(Iterator<String> it, String str) throws DumpUsageException {
    }

    @Nonnull
    private static String nextArgValue(Iterator<String> it) throws DumpUsageException {
    }

    private void printFile(PrintStream printStream, String str, String str2) {
    }

    private void printRecursive(PrintStream printStream, String str, String str2, String str3, String str4) {
    }

    @TargetApi(11)
    private static void putStringSet(SharedPreferences.Editor editor, String str, Iterator<String> it) {
    }

    @Override // com.facebook.stetho.dumpapp.DumperPlugin
    public void dump(DumperContext dumperContext) throws DumpUsageException {
    }

    @Override // com.facebook.stetho.dumpapp.DumperPlugin
    public String getName() {
    }
}
