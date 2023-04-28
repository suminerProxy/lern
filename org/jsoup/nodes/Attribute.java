package org.jsoup.nodes;

import java.io.IOException;
import java.util.Map;
import org.jsoup.nodes.Document;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class Attribute implements Map.Entry<String, String>, Cloneable {
    private static final String[] booleanAttributes = null;
    private String key;
    public Attributes parent;
    private String val;

    public Attribute(String str, String str2) {
    }

    public static Attribute createFromEncoded(String str, String str2) {
    }

    public /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
    }

    @Override // java.util.Map.Entry
    public /* bridge */ /* synthetic */ String getKey() {
    }

    @Override // java.util.Map.Entry
    public /* bridge */ /* synthetic */ String getValue() {
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
    }

    public String html() {
    }

    public boolean isBooleanAttribute() {
    }

    public boolean isDataAttribute() {
    }

    public void setKey(String str) {
    }

    @Override // java.util.Map.Entry
    public /* bridge */ /* synthetic */ String setValue(String str) {
    }

    public final boolean shouldCollapseAttribute(Document.OutputSettings outputSettings) {
    }

    public String toString() {
    }

    public Attribute(String str, String str2, Attributes attributes) {
    }

    public static boolean isBooleanAttribute(String str) {
    }

    public static boolean isDataAttribute(String str) {
    }

    public static boolean shouldCollapseAttribute(String str, String str2, Document.OutputSettings outputSettings) {
    }

    /* renamed from: clone  reason: collision with other method in class */
    public Attribute m1631clone() {
    }

    @Override // java.util.Map.Entry
    /* renamed from: getKey  reason: avoid collision after fix types in other method */
    public String getKey2() {
    }

    @Override // java.util.Map.Entry
    /* renamed from: getValue  reason: avoid collision after fix types in other method */
    public String getValue2() {
    }

    /* renamed from: setValue  reason: avoid collision after fix types in other method */
    public String setValue2(String str) {
    }

    public static void html(String str, String str2, Appendable appendable, Document.OutputSettings outputSettings) throws IOException {
    }

    public void html(Appendable appendable, Document.OutputSettings outputSettings) throws IOException {
    }
}
