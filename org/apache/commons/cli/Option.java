package org.apache.commons.cli;

import java.io.Serializable;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class Option implements Cloneable, Serializable {
    public static final int UNINITIALIZED = -1;
    public static final int UNLIMITED_VALUES = -2;
    private static final long serialVersionUID = 1;
    private String argName;
    private String description;
    private String longOpt;
    private int numberOfArgs;
    private String opt;
    private boolean optionalArg;
    private boolean required;
    private Object type;
    private List values;
    private char valuesep;

    public Option(String str, String str2) throws IllegalArgumentException {
    }

    private void add(String str) {
    }

    private boolean hasNoValues() {
    }

    private void processValue(String str) {
    }

    public boolean addValue(String str) {
    }

    public void addValueForProcessing(String str) {
    }

    public void clearValues() {
    }

    public Object clone() {
    }

    public boolean equals(Object obj) {
    }

    public String getArgName() {
    }

    public int getArgs() {
    }

    public String getDescription() {
    }

    public int getId() {
    }

    public String getKey() {
    }

    public String getLongOpt() {
    }

    public String getOpt() {
    }

    public Object getType() {
    }

    public String getValue() {
    }

    public char getValueSeparator() {
    }

    public String[] getValues() {
    }

    public List getValuesList() {
    }

    public boolean hasArg() {
    }

    public boolean hasArgName() {
    }

    public boolean hasArgs() {
    }

    public boolean hasLongOpt() {
    }

    public boolean hasOptionalArg() {
    }

    public boolean hasValueSeparator() {
    }

    public int hashCode() {
    }

    public boolean isRequired() {
    }

    public void setArgName(String str) {
    }

    public void setArgs(int i2) {
    }

    public void setDescription(String str) {
    }

    public void setLongOpt(String str) {
    }

    public void setOptionalArg(boolean z) {
    }

    public void setRequired(boolean z) {
    }

    public void setType(Object obj) {
    }

    public void setValueSeparator(char c) {
    }

    public String toString() {
    }

    public Option(String str, boolean z, String str2) throws IllegalArgumentException {
    }

    public String getValue(int i2) throws IndexOutOfBoundsException {
    }

    public Option(String str, String str2, boolean z, String str3) throws IllegalArgumentException {
    }

    public String getValue(String str) {
    }
}
