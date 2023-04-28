package org.apache.commons.cli;

import java.io.PrintWriter;
import java.util.Comparator;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class HelpFormatter {
    public static final String DEFAULT_ARG_NAME = "arg";
    public static final int DEFAULT_DESC_PAD = 3;
    public static final int DEFAULT_LEFT_PAD = 1;
    public static final String DEFAULT_LONG_OPT_PREFIX = "--";
    public static final String DEFAULT_OPT_PREFIX = "-";
    public static final String DEFAULT_SYNTAX_PREFIX = "usage: ";
    public static final int DEFAULT_WIDTH = 74;
    public String defaultArgName;
    public int defaultDescPad;
    public int defaultLeftPad;
    public String defaultLongOptPrefix;
    public String defaultNewLine;
    public String defaultOptPrefix;
    public String defaultSyntaxPrefix;
    public int defaultWidth;
    public Comparator optionComparator;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static class OptionComparator implements Comparator {
        private OptionComparator() {
        }

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
        }

        public /* synthetic */ OptionComparator(AnonymousClass1 anonymousClass1) {
        }
    }

    private static void appendOption(StringBuffer stringBuffer, Option option, boolean z) {
    }

    private void appendOptionGroup(StringBuffer stringBuffer, OptionGroup optionGroup) {
    }

    public String createPadding(int i2) {
    }

    public int findWrapPos(String str, int i2, int i3) {
    }

    public String getArgName() {
    }

    public int getDescPadding() {
    }

    public int getLeftPadding() {
    }

    public String getLongOptPrefix() {
    }

    public String getNewLine() {
    }

    public String getOptPrefix() {
    }

    public Comparator getOptionComparator() {
    }

    public String getSyntaxPrefix() {
    }

    public int getWidth() {
    }

    public void printHelp(String str, Options options) {
    }

    public void printOptions(PrintWriter printWriter, int i2, Options options, int i3, int i4) {
    }

    public void printUsage(PrintWriter printWriter, int i2, String str, Options options) {
    }

    public void printWrapped(PrintWriter printWriter, int i2, String str) {
    }

    public StringBuffer renderOptions(StringBuffer stringBuffer, int i2, Options options, int i3, int i4) {
    }

    public StringBuffer renderWrappedText(StringBuffer stringBuffer, int i2, int i3, String str) {
    }

    public String rtrim(String str) {
    }

    public void setArgName(String str) {
    }

    public void setDescPadding(int i2) {
    }

    public void setLeftPadding(int i2) {
    }

    public void setLongOptPrefix(String str) {
    }

    public void setNewLine(String str) {
    }

    public void setOptPrefix(String str) {
    }

    public void setOptionComparator(Comparator comparator) {
    }

    public void setSyntaxPrefix(String str) {
    }

    public void setWidth(int i2) {
    }

    public void printHelp(String str, Options options, boolean z) {
    }

    public void printWrapped(PrintWriter printWriter, int i2, int i3, String str) {
    }

    public void printHelp(String str, String str2, Options options, String str3) {
    }

    public void printHelp(String str, String str2, Options options, String str3, boolean z) {
    }

    public void printHelp(int i2, String str, String str2, Options options, String str3) {
    }

    public void printHelp(int i2, String str, String str2, Options options, String str3, boolean z) {
    }

    public void printHelp(PrintWriter printWriter, int i2, String str, String str2, Options options, int i3, int i4, String str3) {
    }

    public void printHelp(PrintWriter printWriter, int i2, String str, String str2, Options options, int i3, int i4, String str3, boolean z) {
    }

    public void printUsage(PrintWriter printWriter, int i2, String str) {
    }
}
