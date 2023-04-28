package org.apache.commons.cli;

import java.util.List;
import java.util.ListIterator;
import java.util.Properties;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public abstract class Parser implements CommandLineParser {
    public CommandLine cmd;
    private Options options;
    private List requiredOptions;

    public void checkRequiredOptions() throws MissingOptionException {
    }

    public abstract String[] flatten(Options options, String[] strArr, boolean z);

    public Options getOptions() {
    }

    public List getRequiredOptions() {
    }

    @Override // org.apache.commons.cli.CommandLineParser
    public CommandLine parse(Options options, String[] strArr) throws ParseException {
    }

    public void processArgs(Option option, ListIterator listIterator) throws ParseException {
    }

    public void processOption(String str, ListIterator listIterator) throws ParseException {
    }

    public void processProperties(Properties properties) {
    }

    public void setOptions(Options options) {
    }

    public CommandLine parse(Options options, String[] strArr, Properties properties) throws ParseException {
    }

    @Override // org.apache.commons.cli.CommandLineParser
    public CommandLine parse(Options options, String[] strArr, boolean z) throws ParseException {
    }

    public CommandLine parse(Options options, String[] strArr, Properties properties, boolean z) throws ParseException {
    }
}
